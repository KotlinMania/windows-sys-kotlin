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

private object WindowsWdkSystemSystemservicesJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsAddLogContainer(plfolog: Long, pcbcontainer: Long, puszcontainerpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsAddLogContainerSet(plfolog: Long, ccontainers: Short, pcbcontainer: Long, rguszcontainerpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsAdvanceLogBase(pvmarshalcontext: Long, plsnbase: Long, fflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsAlignReservedLog(pvmarshalcontext: Long, crecords: Int, rgcbreservation: Long, pcbalignreservation: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsAllocReservedLog(pvmarshalcontext: Long, crecords: Int, pcbadjustment: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsCloseAndResetLogFile(plfolog: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsCloseLogFileObject(plfolog: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsCreateLogFile(pplfolog: Long, puszlogfilename: Long, fdesiredaccess: Int, dwsharemode: Int, psdlogfile: Long, fcreatedisposition: Int, fcreateoptions: Int, fflagsandattributes: Int, flogoptionflag: Int, pvcontext: Long, cbcontext: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsCreateScanContext(plfolog: Long, cfromcontainer: Int, ccontainers: Int, escanmode: Byte, pcxscan: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsDeleteLogByPointer(plfolog: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsDeleteLogFile(puszlogfilename: Long, pvreserved: Long, flogoptionflag: Int, pvcontext: Long, cbcontext: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsDeleteMarshallingArea(pvmarshalcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsFinalize()

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsFlushBuffers(pvmarshalcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsFlushToLsn(pvmarshalcontext: Long, plsnflush: Long, plsnlastflushed: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsFreeReservedLog(pvmarshalcontext: Long, crecords: Int, pcbadjustment: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsGetContainerName(plfolog: Long, cidlogicalcontainer: Int, puszcontainername: Long, pcactuallencontainername: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsGetIoStatistics(plfolog: Long, pvstatsbuffer: Long, cbstatsbuffer: Int, estatsclass: Int, pcbstatswritten: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsGetLogFileInformation(plfolog: Long, pinfobuffer: Long, pcbinfobuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsInitialize(): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsLsnBlockOffset(plsn: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsLsnContainer(plsn: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsLsnDifference(plsnstart: Long, plsnfinish: Long, cbcontainer: Int, cbmaxblock: Int, pcbdifference: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsLsnEqual(plsn1: Long, plsn2: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsLsnGreater(plsn1: Long, plsn2: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsLsnInvalid(plsn: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsLsnLess(plsn1: Long, plsn2: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsLsnNull(plsn: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsLsnRecordSequence(plsn: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsMgmtDeregisterManagedClient(clientcookie: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsMgmtHandleLogFileFull(client: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsMgmtInstallPolicy(logfile: Long, policy: Long, policylength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsMgmtQueryPolicy(logfile: Long, policytype: Int, policy: Long, policylength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsMgmtRegisterManagedClient(logfile: Long, registrationdata: Long, clientcookie: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsMgmtRemovePolicy(logfile: Long, policytype: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsMgmtSetLogFileSize(logfile: Long, newsizeincontainers: Long, resultingsizeincontainers: Long, completionroutine: Long, completionroutinedata: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsMgmtSetLogFileSizeAsClient(logfile: Long, clientcookie: Long, newsizeincontainers: Long, resultingsizeincontainers: Long, completionroutine: Long, completionroutinedata: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsMgmtTailAdvanceFailure(client: Long, reason: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsQueryLogFileInformation(plfolog: Long, einformationclass: Int, pinfoinputbuffer: Long, cbinfoinputbuffer: Int, pinfobuffer: Long, pcbinfobuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsReadLogRecord(pvmarshalcontext: Long, plsnfirst: Long, pecontextmode: Int, ppvreadbuffer: Long, pcbreadbuffer: Long, perecordtype: Long, plsnundonext: Long, plsnprevious: Long, ppvreadcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsReadNextLogRecord(pvreadcontext: Long, ppvbuffer: Long, pcbbuffer: Long, perecordtype: Long, plsnuser: Long, plsnundonext: Long, plsnprevious: Long, plsnrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsReadPreviousRestartArea(pvreadcontext: Long, ppvrestartbuffer: Long, pcbrestartbuffer: Long, plsnrestart: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsReadRestartArea(pvmarshalcontext: Long, ppvrestartbuffer: Long, pcbrestartbuffer: Long, plsn: Long, ppvreadcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsRemoveLogContainer(plfolog: Long, puszcontainerpath: Long, fforce: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsRemoveLogContainerSet(plfolog: Long, ccontainers: Short, rgwszcontainerpath: Long, fforce: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsReserveAndAppendLog(pvmarshalcontext: Long, rgwriteentries: Long, cwriteentries: Int, plsnundonext: Long, plsnprevious: Long, creserverecords: Int, rgcbreservation: Long, fflags: Int, plsn: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsReserveAndAppendLogAligned(pvmarshalcontext: Long, rgwriteentries: Long, cwriteentries: Int, cbentryalignment: Int, plsnundonext: Long, plsnprevious: Long, creserverecords: Int, rgcbreservation: Long, fflags: Int, plsn: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsScanLogContainers(pcxscan: Long, escanmode: Byte): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsSetArchiveTail(plfolog: Long, plsnarchivetail: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsSetEndOfLog(plfolog: Long, plsnend: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsSetLogFileInformation(plfolog: Long, einformationclass: Int, pinfobuffer: Long, cbbuffer: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsTerminateReadLog(pvcursorcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ClfsWriteRestartArea(pvmarshalcontext: Long, pvrestartbuffer: Long, cbrestartbuffer: Int, plsnbase: Long, fflags: Int, pcbwritten: Long, plsnnext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_CmCallbackGetKeyObjectID(cookie: Long, obj: Long, objectid: Long, objectname: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_CmCallbackGetKeyObjectIDEx(cookie: Long, obj: Long, objectid: Long, objectname: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_CmCallbackReleaseKeyObjectIDEx(objectname: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_CmGetBoundTransaction(cookie: Long, obj: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_CmGetCallbackVersion(major: Long, minor: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_CmRegisterCallback(function: Long, context: Long, cookie: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_CmRegisterCallbackEx(function: Long, altitude: Long, driver: Long, context: Long, cookie: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_CmSetCallbackObjectContext(obj: Long, cookie: Long, newcontext: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_CmUnRegisterCallback(cookie: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_DbgBreakPointWithStatus(status: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_DbgPrompt(prompt: Long, response: Long, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_DbgQueryDebugFilterState(componentid: Int, level: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_DbgSetDebugFilterState(componentid: Int, level: Int, state: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_DbgSetDebugPrintCallback(debugprintcallback: Long, enable: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_EtwActivityIdControl(controlcode: Int, activityid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_EtwEventEnabled(reghandle: Long, eventdescriptor: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_EtwProviderEnabled(reghandle: Long, level: Byte, keyword: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_EtwRegister(providerid: Long, enablecallback: Long, callbackcontext: Long, reghandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_EtwSetInformation(reghandle: Long, informationclass: Int, eventinformation: Long, informationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_EtwUnregister(reghandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_EtwWrite(reghandle: Long, eventdescriptor: Long, activityid: Long, userdatacount: Int, userdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_EtwWriteEx(reghandle: Long, eventdescriptor: Long, filter: Long, flags: Int, activityid: Long, relatedactivityid: Long, userdatacount: Int, userdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_EtwWriteString(reghandle: Long, level: Byte, keyword: Long, activityid: Long, string: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_EtwWriteTransfer(reghandle: Long, eventdescriptor: Long, activityid: Long, relatedactivityid: Long, userdatacount: Int, userdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExAcquireFastMutex(fastmutex: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExAcquireFastMutexUnsafe(fastmutex: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExAcquirePushLockExclusiveEx(pushlock: Long, flags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExAcquirePushLockSharedEx(pushlock: Long, flags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExAcquireResourceExclusiveLite(resource: Long, wait: Boolean): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExAcquireResourceSharedLite(resource: Long, wait: Boolean): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExAcquireRundownProtection(runref: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExAcquireRundownProtectionCacheAware(runrefcacheaware: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExAcquireRundownProtectionCacheAwareEx(runrefcacheaware: Long, count: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExAcquireRundownProtectionEx(runref: Long, count: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExAcquireSharedStarveExclusive(resource: Long, wait: Boolean): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExAcquireSharedWaitForExclusive(resource: Long, wait: Boolean): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExAcquireSpinLockExclusive(spinlock: Long): Byte

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExAcquireSpinLockExclusiveAtDpcLevel(spinlock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExAcquireSpinLockShared(spinlock: Long): Byte

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExAcquireSpinLockSharedAtDpcLevel(spinlock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExAllocateCacheAwareRundownProtection(pooltype: Int, pooltag: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExAllocatePool(pooltype: Int, numberofbytes: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExAllocatePool2(flags: Long, numberofbytes: Long, tag: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExAllocatePool3(flags: Long, numberofbytes: Long, tag: Int, extendedparameters: Long, extendedparameterscount: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExAllocatePoolWithQuota(pooltype: Int, numberofbytes: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExAllocatePoolWithQuotaTag(pooltype: Int, numberofbytes: Long, tag: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExAllocatePoolWithTag(pooltype: Int, numberofbytes: Long, tag: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExAllocatePoolWithTagPriority(pooltype: Int, numberofbytes: Long, tag: Int, priority: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExAllocateTimer(callback: Long, callbackcontext: Long, attributes: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExCancelTimer(timer: Long, parameters: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExCleanupRundownProtectionCacheAware(runrefcacheaware: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExConvertExclusiveToSharedLite(resource: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExCreateCallback(callbackobject: Long, objectattributes: Long, create: Boolean, allowmultiplecallbacks: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExCreatePool(flags: Int, tag: Long, params: Long, poolhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExDeleteResourceLite(resource: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExDeleteTimer(timer: Long, cancel: Boolean, wait: Boolean, parameters: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExDestroyPool(poolhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExEnterCriticalRegionAndAcquireResourceExclusive(resource: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExEnterCriticalRegionAndAcquireResourceShared(resource: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExEnterCriticalRegionAndAcquireSharedWaitForExclusive(resource: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExEnumerateSystemFirmwareTables(firmwaretableprovidersignature: Int, firmwaretablebuffer: Long, bufferlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExExtendZone(zone: Long, segment: Long, segmentsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExFreeCacheAwareRundownProtection(runrefcacheaware: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExFreePool(p: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExFreePool2(p: Long, tag: Int, extendedparameters: Long, extendedparameterscount: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExFreePoolWithTag(p: Long, tag: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExGetExclusiveWaiterCount(resource: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExGetFirmwareEnvironmentVariable(variablename: Long, vendorguid: Long, value: Long, valuelength: Long, attributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExGetFirmwareType(): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExGetPreviousMode(): Byte

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExGetSharedWaiterCount(resource: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExGetSystemFirmwareTable(firmwaretableprovidersignature: Int, firmwaretableid: Int, firmwaretablebuffer: Long, bufferlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExInitializePushLock(pushlock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExInitializeResourceLite(resource: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExInitializeRundownProtection(runref: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExInitializeRundownProtectionCacheAware(runrefcacheaware: Long, runrefsize: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExInitializeRundownProtectionCacheAwareEx(runrefcacheaware: Long, flags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExInitializeZone(zone: Long, blocksize: Int, initialsegment: Long, initialsegmentsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExInterlockedAddLargeInteger(addend: Long, increment: Long, lock: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExInterlockedExtendZone(zone: Long, segment: Long, segmentsize: Int, lock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExIsManufacturingModeEnabled(): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExIsProcessorFeaturePresent(processorfeature: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExIsResourceAcquiredExclusiveLite(resource: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExIsResourceAcquiredSharedLite(resource: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExIsSoftBoot(): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExLocalTimeToSystemTime(localtime: Long, systemtime: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExNotifyCallback(callbackobject: Long, argument1: Long, argument2: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExQueryTimerResolution(maximumtime: Long, minimumtime: Long, currenttime: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExQueueWorkItem(workitem: Long, queuetype: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExRaiseAccessViolation()

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExRaiseDatatypeMisalignment()

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExRaiseStatus(status: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExReInitializeRundownProtection(runref: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExReInitializeRundownProtectionCacheAware(runrefcacheaware: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExRegisterCallback(callbackobject: Long, callbackfunction: Long, callbackcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExReinitializeResourceLite(resource: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExReleaseFastMutex(fastmutex: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExReleaseFastMutexUnsafe(fastmutex: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExReleasePushLockExclusiveEx(pushlock: Long, flags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExReleasePushLockSharedEx(pushlock: Long, flags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExReleaseResourceAndLeaveCriticalRegion(resource: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExReleaseResourceForThreadLite(resource: Long, resourcethreadid: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExReleaseResourceLite(resource: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExReleaseRundownProtection(runref: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExReleaseRundownProtectionCacheAware(runrefcacheaware: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExReleaseRundownProtectionCacheAwareEx(runref: Long, count: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExReleaseRundownProtectionEx(runref: Long, count: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExReleaseSpinLockExclusive(spinlock: Long, oldirql: Byte)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExReleaseSpinLockExclusiveFromDpcLevel(spinlock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExReleaseSpinLockShared(spinlock: Long, oldirql: Byte)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExReleaseSpinLockSharedFromDpcLevel(spinlock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExRundownCompleted(runref: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExRundownCompletedCacheAware(runrefcacheaware: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExSecurePoolUpdate(securepoolhandle: Long, tag: Int, allocation: Long, cookie: Long, offset: Long, size: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExSecurePoolValidate(securepoolhandle: Long, tag: Int, allocation: Long, cookie: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExSetFirmwareEnvironmentVariable(variablename: Long, vendorguid: Long, value: Long, valuelength: Int, attributes: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExSetResourceOwnerPointer(resource: Long, ownerpointer: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExSetResourceOwnerPointerEx(resource: Long, ownerpointer: Long, flags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExSetTimer(timer: Long, duetime: Long, period: Long, parameters: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExSetTimerResolution(desiredtime: Int, setresolution: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExSizeOfRundownProtectionCacheAware(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExSystemTimeToLocalTime(systemtime: Long, localtime: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExTryAcquireSpinLockExclusiveAtDpcLevel(spinlock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExTryAcquireSpinLockSharedAtDpcLevel(spinlock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExTryConvertSharedSpinLockExclusive(spinlock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExTryToAcquireFastMutex(fastmutex: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExUnregisterCallback(callbackregistration: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExUuidCreate(uuid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExVerifySuite(suitetype: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExWaitForRundownProtectionRelease(runref: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ExWaitForRundownProtectionReleaseCacheAware(runref: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_FsRtlIsTotalDeviceFailure(status: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_HalAcquireDisplayOwnership(resetdisplayparameters: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_HalAllocateCommonBuffer(adapterobject: Long, length: Int, logicaladdress: Long, cacheenabled: Boolean): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_HalAllocateCrashDumpRegisters(adapterobject: Long, numberofmapregisters: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_HalAllocateHardwareCounters(groupaffinty: Long, groupcount: Int, resourcelist: Long, countersethandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_HalAssignSlotResources(registrypath: Long, driverclassname: Long, driverobject: Long, deviceobject: Long, bustype: Int, busnumber: Int, slotnumber: Int, allocatedresources: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_HalBugCheckSystem(errorsource: Long, errorrecord: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_HalDmaAllocateCrashDumpRegistersEx(adapter: Long, numberofmapregisters: Int, type: Int, mapregisterbase: Long, mapregistersavailable: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_HalDmaFreeCrashDumpRegistersEx(adapter: Long, type: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_HalExamineMBR(deviceobject: Long, sectorsize: Int, mbrtypeidentifier: Int, buffer: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_HalFreeCommonBuffer(adapterobject: Long, length: Int, logicaladdress: Long, virtualaddress: Long, cacheenabled: Boolean)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_HalFreeHardwareCounters(countersethandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_HalGetAdapter(devicedescription: Long, numberofmapregisters: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_HalGetBusData(busdatatype: Int, busnumber: Int, slotnumber: Int, buffer: Long, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_HalGetBusDataByOffset(busdatatype: Int, busnumber: Int, slotnumber: Int, buffer: Long, offset: Int, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_HalGetInterruptVector(interfacetype: Int, busnumber: Int, businterruptlevel: Int, businterruptvector: Int, irql: Long, affinity: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_HalMakeBeep(frequency: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_HalReadDmaCounter(adapterobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_HalSetBusData(busdatatype: Int, busnumber: Int, slotnumber: Int, buffer: Long, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_HalSetBusDataByOffset(busdatatype: Int, busnumber: Int, slotnumber: Int, buffer: Long, offset: Int, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_HalTranslateBusAddress(interfacetype: Int, busnumber: Int, busaddress: Long, addressspace: Long, translatedaddress: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_HvlRegisterWheaErrorNotification(callback: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_HvlUnregisterWheaErrorNotification(callback: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoAcquireCancelSpinLock(irql: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoAcquireKsrPersistentMemory(driverobject: Long, physicaldeviceobject: Long, buffer: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoAcquireKsrPersistentMemoryEx(driverobject: Long, physicaldeviceobject: Long, physicaldeviceid: Long, datatag: Long, dataversion: Long, buffer: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoAcquireRemoveLockEx(removelock: Long, tag: Long, file: Long, line: Int, remlocksize: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoAllocateDriverObjectExtension(driverobject: Long, clientidentificationaddress: Long, driverobjectextensionsize: Int, driverobjectextension: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoAllocateErrorLogEntry(ioobject: Long, entrysize: Byte): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoAllocateIrp(stacksize: Byte, chargequota: Boolean): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoAllocateIrpEx(deviceobject: Long, stacksize: Byte, chargequota: Boolean): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoAllocateMdl(virtualaddress: Long, length: Int, secondarybuffer: Boolean, chargequota: Boolean, irp: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoAllocateSfioStreamIdentifier(fileobject: Long, length: Int, signature: Long, streamidentifier: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoAllocateWorkItem(deviceobject: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoAssignResources(registrypath: Long, driverclassname: Long, driverobject: Long, deviceobject: Long, requestedresources: Long, allocatedresources: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoAttachDevice(sourcedevice: Long, targetdevice: Long, attacheddevice: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoAttachDeviceByPointer(sourcedevice: Long, targetdevice: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoAttachDeviceToDeviceStack(sourcedevice: Long, targetdevice: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoAttachDeviceToDeviceStackSafe(sourcedevice: Long, targetdevice: Long, attachedtodeviceobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoBuildAsynchronousFsdRequest(majorfunction: Int, deviceobject: Long, buffer: Long, length: Int, startingoffset: Long, iostatusblock: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoBuildDeviceIoControlRequest(iocontrolcode: Int, deviceobject: Long, inputbuffer: Long, inputbufferlength: Int, outputbuffer: Long, outputbufferlength: Int, internaldeviceiocontrol: Boolean, event: Long, iostatusblock: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoBuildPartialMdl(sourcemdl: Long, targetmdl: Long, virtualaddress: Long, length: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoBuildSynchronousFsdRequest(majorfunction: Int, deviceobject: Long, buffer: Long, length: Int, startingoffset: Long, event: Long, iostatusblock: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoCancelFileOpen(deviceobject: Long, fileobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoCancelIrp(irp: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoCheckLinkShareAccess(desiredaccess: Int, desiredshareaccess: Int, fileobject: Long, shareaccess: Long, linkshareaccess: Long, ioshareaccessflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoCheckShareAccess(desiredaccess: Int, desiredshareaccess: Int, fileobject: Long, shareaccess: Long, update: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoCheckShareAccessEx(desiredaccess: Int, desiredshareaccess: Int, fileobject: Long, shareaccess: Long, update: Boolean, writepermission: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoCleanupIrp(irp: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoClearActivityIdThread(originalid: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoClearIrpExtraCreateParameter(irp: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoConnectInterrupt(interruptobject: Long, serviceroutine: Long, servicecontext: Long, spinlock: Long, vector: Int, irql: Byte, synchronizeirql: Byte, interruptmode: Int, sharevector: Boolean, processorenablemask: Long, floatingsave: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoConnectInterruptEx(parameters: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoCreateController(size: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoCreateDevice(driverobject: Long, deviceextensionsize: Int, devicename: Long, devicetype: Int, devicecharacteristics: Int, exclusive: Boolean, deviceobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoCreateDisk(deviceobject: Long, disk: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoCreateFile(filehandle: Long, desiredaccess: Int, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: Int, shareaccess: Int, disposition: Int, createoptions: Int, eabuffer: Long, ealength: Int, createfiletype: Int, internalparameters: Long, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoCreateFileEx(filehandle: Long, desiredaccess: Int, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: Int, shareaccess: Int, disposition: Int, createoptions: Int, eabuffer: Long, ealength: Int, createfiletype: Int, internalparameters: Long, options: Int, drivercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoCreateFileSpecifyDeviceObjectHint(filehandle: Long, desiredaccess: Int, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: Int, shareaccess: Int, disposition: Int, createoptions: Int, eabuffer: Long, ealength: Int, createfiletype: Int, internalparameters: Long, options: Int, deviceobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoCreateNotificationEvent(eventname: Long, eventhandle: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoCreateSymbolicLink(symboliclinkname: Long, devicename: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoCreateSynchronizationEvent(eventname: Long, eventhandle: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoCreateSystemThread(ioobject: Long, threadhandle: Long, desiredaccess: Int, objectattributes: Long, processhandle: Long, clientid: Long, startroutine: Long, startcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoCreateUnprotectedSymbolicLink(symboliclinkname: Long, devicename: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoCsqInitialize(csq: Long, csqinsertirp: Long, csqremoveirp: Long, csqpeeknextirp: Long, csqacquirelock: Long, csqreleaselock: Long, csqcompletecanceledirp: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoCsqInitializeEx(csq: Long, csqinsertirp: Long, csqremoveirp: Long, csqpeeknextirp: Long, csqacquirelock: Long, csqreleaselock: Long, csqcompletecanceledirp: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoCsqInsertIrp(csq: Long, irp: Long, context: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoCsqInsertIrpEx(csq: Long, irp: Long, context: Long, insertcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoCsqRemoveIrp(csq: Long, context: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoCsqRemoveNextIrp(csq: Long, peekcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoDecrementKeepAliveCount(fileobject: Long, process: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoDeleteController(controllerobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoDeleteDevice(deviceobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoDeleteSymbolicLink(symboliclinkname: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoDetachDevice(targetdevice: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoDisconnectInterrupt(interruptobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoDisconnectInterruptEx(parameters: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoEnumerateKsrPersistentMemoryEx(driverobject: Long, physicaldeviceobject: Long, physicaldeviceid: Long, callback: Long, callbackcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoFlushAdapterBuffers(adapterobject: Long, mdl: Long, mapregisterbase: Long, currentva: Long, length: Int, writetodevice: Boolean): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoForwardIrpSynchronously(deviceobject: Long, irp: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoFreeAdapterChannel(adapterobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoFreeController(controllerobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoFreeErrorLogEntry(elentry: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoFreeIrp(irp: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoFreeKsrPersistentMemory(datahandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoFreeMapRegisters(adapterobject: Long, mapregisterbase: Long, numberofmapregisters: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoFreeMdl(mdl: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoFreeSfioStreamIdentifier(fileobject: Long, signature: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoFreeWorkItem(ioworkitem: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoGetActivityIdIrp(irp: Long, guid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoGetActivityIdThread(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoGetAffinityInterrupt(interruptobject: Long, groupaffinity: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoGetAttachedDeviceReference(deviceobject: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoGetBootDiskInformation(bootdiskinformation: Long, size: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoGetBootDiskInformationLite(bootdiskinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoGetConfigurationInformation(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoGetContainerInformation(informationclass: Int, containerobject: Long, buffer: Long, bufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoGetCurrentProcess(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoGetDeviceDirectory(physicaldeviceobject: Long, directorytype: Int, flags: Int, reserved: Long, devicedirectoryhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoGetDeviceInterfaceAlias(symboliclinkname: Long, aliasinterfaceclassguid: Long, aliassymboliclinkname: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoGetDeviceInterfacePropertyData(symboliclinkname: Long, propertykey: Long, lcid: Int, flags: Int, size: Int, data: Long, requiredsize: Long, type: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoGetDeviceInterfaces(interfaceclassguid: Long, physicaldeviceobject: Long, flags: Int, symboliclinklist: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoGetDeviceNumaNode(pdo: Long, nodenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoGetDeviceObjectPointer(objectname: Long, desiredaccess: Int, fileobject: Long, deviceobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoGetDeviceProperty(deviceobject: Long, deviceproperty: Int, bufferlength: Int, propertybuffer: Long, resultlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoGetDevicePropertyData(pdo: Long, propertykey: Long, lcid: Int, flags: Int, size: Int, data: Long, requiredsize: Long, type: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoGetDmaAdapter(physicaldeviceobject: Long, devicedescription: Long, numberofmapregisters: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoGetDriverDirectory(driverobject: Long, directorytype: Int, flags: Int, driverdirectoryhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoGetDriverObjectExtension(driverobject: Long, clientidentificationaddress: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoGetFileObjectGenericMapping(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoGetFsZeroingOffset(irp: Long, zeroingoffset: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoGetInitialStack(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoGetInitiatorProcess(fileobject: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoGetIoAttributionHandle(irp: Long, ioattributionhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoGetIoPriorityHint(irp: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoGetIommuInterface(version: Int, interfaceout: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoGetIommuInterfaceEx(version: Int, flags: Long, interfaceout: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoGetIrpExtraCreateParameter(irp: Long, extracreateparameter: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoGetPagingIoPriority(irp: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoGetRelatedDeviceObject(fileobject: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoGetSfioStreamIdentifier(fileobject: Long, signature: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoGetSilo(fileobject: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoGetSiloParameters(fileobject: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoGetStackLimits(lowlimit: Long, highlimit: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoGetTopLevelIrp(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoGetTransactionParameterBlock(fileobject: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoIncrementKeepAliveCount(fileobject: Long, process: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoInitializeIrp(irp: Long, packetsize: Short, stacksize: Byte)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoInitializeIrpEx(irp: Long, deviceobject: Long, packetsize: Short, stacksize: Byte)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoInitializeRemoveLockEx(lock: Long, allocatetag: Int, maxlockedminutes: Int, highwatermark: Int, remlocksize: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoInitializeTimer(deviceobject: Long, timerroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoInitializeWorkItem(ioobject: Long, ioworkitem: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoInvalidateDeviceRelations(deviceobject: Long, type: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoInvalidateDeviceState(physicaldeviceobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoIs32bitProcess(irp: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoIsFileObjectIgnoringSharing(fileobject: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoIsFileOriginRemote(fileobject: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoIsInitiator32bitProcess(irp: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoIsValidIrpStatus(status: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoIsWdmVersionAvailable(majorversion: Byte, minorversion: Byte): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoMakeAssociatedIrp(irp: Long, stacksize: Byte): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoMakeAssociatedIrpEx(irp: Long, deviceobject: Long, stacksize: Byte): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoMapTransfer(adapterobject: Long, mdl: Long, mapregisterbase: Long, currentva: Long, length: Long, writetodevice: Boolean): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoOpenDeviceInterfaceRegistryKey(symboliclinkname: Long, desiredaccess: Int, deviceinterfaceregkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoOpenDeviceRegistryKey(deviceobject: Long, devinstkeytype: Int, desiredaccess: Int, deviceregkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoOpenDriverRegistryKey(driverobject: Long, regkeytype: Int, desiredaccess: Int, flags: Int, driverregkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoPropagateActivityIdToThread(irp: Long, propagatedid: Long, originalid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoQueryDeviceDescription(bustype: Long, busnumber: Long, controllertype: Long, controllernumber: Long, peripheraltype: Long, peripheralnumber: Long, calloutroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoQueryFullDriverPath(driverobject: Long, fullpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoQueryInformationByName(objectattributes: Long, iostatusblock: Long, fileinformation: Long, length: Int, fileinformationclass: Int, options: Int, drivercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoQueryKsrPersistentMemorySize(driverobject: Long, physicaldeviceobject: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoQueryKsrPersistentMemorySizeEx(driverobject: Long, physicaldeviceobject: Long, physicaldeviceid: Long, datatag: Long, dataversion: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoQueueWorkItem(ioworkitem: Long, workerroutine: Long, queuetype: Int, context: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoQueueWorkItemEx(ioworkitem: Long, workerroutine: Long, queuetype: Int, context: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoRaiseHardError(irp: Long, vpb: Long, realdeviceobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoRaiseInformationalHardError(errorstatus: Int, string: Long, thread: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoReadDiskSignature(deviceobject: Long, bytespersector: Int, signature: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoReadPartitionTable(deviceobject: Long, sectorsize: Int, returnrecognizedpartitions: Boolean, partitionbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoReadPartitionTableEx(deviceobject: Long, drivelayout: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoRecordIoAttribution(opaquehandle: Long, attributioninformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoRegisterBootDriverCallback(callbackfunction: Long, callbackcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoRegisterContainerNotification(notificationclass: Int, callbackfunction: Long, notificationinformation: Long, notificationinformationlength: Int, callbackregistration: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoRegisterDeviceInterface(physicaldeviceobject: Long, interfaceclassguid: Long, referencestring: Long, symboliclinkname: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoRegisterLastChanceShutdownNotification(deviceobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoRegisterShutdownNotification(deviceobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoReleaseCancelSpinLock(irql: Byte)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoReleaseRemoveLockAndWaitEx(removelock: Long, tag: Long, remlocksize: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoReleaseRemoveLockEx(removelock: Long, tag: Long, remlocksize: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoRemoveLinkShareAccess(fileobject: Long, shareaccess: Long, linkshareaccess: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoRemoveLinkShareAccessEx(fileobject: Long, shareaccess: Long, linkshareaccess: Long, ioshareaccessflags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoRemoveShareAccess(fileobject: Long, shareaccess: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoReplacePartitionUnit(targetpdo: Long, sparepdo: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoReportDetectedDevice(driverobject: Long, legacybustype: Int, busnumber: Int, slotnumber: Int, resourcelist: Long, resourcerequirements: Long, resourceassigned: Boolean, deviceobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoReportInterruptActive(parameters: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoReportInterruptInactive(parameters: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoReportResourceForDetection(driverobject: Long, driverlist: Long, driverlistsize: Int, deviceobject: Long, devicelist: Long, devicelistsize: Int, conflictdetected: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoReportResourceUsage(driverclassname: Long, driverobject: Long, driverlist: Long, driverlistsize: Int, deviceobject: Long, devicelist: Long, devicelistsize: Int, overrideconflict: Boolean, conflictdetected: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoReportRootDevice(driverobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoReportTargetDeviceChange(physicaldeviceobject: Long, notificationstructure: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoReportTargetDeviceChangeAsynchronous(physicaldeviceobject: Long, notificationstructure: Long, callback: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoRequestDeviceEject(physicaldeviceobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoRequestDeviceEjectEx(physicaldeviceobject: Long, callback: Long, context: Long, driverobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoReserveKsrPersistentMemory(driverobject: Long, physicaldeviceobject: Long, size: Long, flags: Int, datahandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoReserveKsrPersistentMemoryEx(driverobject: Long, physicaldeviceobject: Long, physicaldeviceid: Long, datatag: Long, dataversion: Int, size: Long, flags: Int, datahandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoReuseIrp(irp: Long, iostatus: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoSetActivityIdIrp(irp: Long, guid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoSetActivityIdThread(activityid: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoSetDeviceInterfacePropertyData(symboliclinkname: Long, propertykey: Long, lcid: Int, flags: Int, type: Int, size: Int, data: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoSetDeviceInterfaceState(symboliclinkname: Long, enable: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoSetDevicePropertyData(pdo: Long, propertykey: Long, lcid: Int, flags: Int, type: Int, size: Int, data: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoSetFileObjectIgnoreSharing(fileobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoSetFileOrigin(fileobject: Long, remote: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoSetFsZeroingOffset(irp: Long, zeroingoffset: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoSetFsZeroingOffsetRequired(irp: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoSetHardErrorOrVerifyDevice(irp: Long, deviceobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoSetIoAttributionIrp(irp: Long, attributionsource: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoSetIoPriorityHint(irp: Long, priorityhint: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoSetIrpExtraCreateParameter(irp: Long, extracreateparameter: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoSetLinkShareAccess(desiredaccess: Int, desiredshareaccess: Int, fileobject: Long, shareaccess: Long, linkshareaccess: Long, ioshareaccessflags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoSetMasterIrpStatus(masterirp: Long, status: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoSetPartitionInformation(deviceobject: Long, sectorsize: Int, partitionnumber: Int, partitiontype: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoSetPartitionInformationEx(deviceobject: Long, partitionnumber: Int, partitioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoSetShareAccess(desiredaccess: Int, desiredshareaccess: Int, fileobject: Long, shareaccess: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoSetShareAccessEx(desiredaccess: Int, desiredshareaccess: Int, fileobject: Long, shareaccess: Long, writepermission: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoSetStartIoAttributes(deviceobject: Long, deferredstartio: Boolean, noncancelable: Boolean)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoSetSystemPartition(volumenamestring: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoSetThreadHardErrorMode(enableharderrors: Boolean): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoSetTopLevelIrp(irp: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoSizeOfIrpEx(deviceobject: Long, stacksize: Byte): Short

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoSizeofWorkItem(): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoStartNextPacket(deviceobject: Long, cancelable: Boolean)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoStartNextPacketByKey(deviceobject: Long, cancelable: Boolean, key: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoStartTimer(deviceobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoStopTimer(deviceobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoSynchronousCallDriver(deviceobject: Long, irp: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoTransferActivityId(activityid: Long, relatedactivityid: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoTranslateBusAddress(interfacetype: Int, busnumber: Int, busaddress: Long, addressspace: Long, translatedaddress: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoTryQueueWorkItem(ioworkitem: Long, workerroutine: Long, queuetype: Int, context: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoUninitializeWorkItem(ioworkitem: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoUnregisterBootDriverCallback(callbackhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoUnregisterContainerNotification(callbackregistration: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoUnregisterPlugPlayNotification(notificationentry: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoUnregisterPlugPlayNotificationEx(notificationentry: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoUnregisterShutdownNotification(deviceobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoUpdateLinkShareAccess(fileobject: Long, shareaccess: Long, linkshareaccess: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoUpdateLinkShareAccessEx(fileobject: Long, shareaccess: Long, linkshareaccess: Long, ioshareaccessflags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoUpdateShareAccess(fileobject: Long, shareaccess: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoValidateDeviceIoControlAccess(irp: Long, requiredaccess: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoVerifyPartitionTable(deviceobject: Long, fixerrors: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoVolumeDeviceNameToGuid(volumedevicename: Long, guid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoVolumeDeviceNameToGuidPath(volumedevicename: Long, guidpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoVolumeDeviceToDosName(volumedeviceobject: Long, dosname: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoVolumeDeviceToGuid(volumedeviceobject: Long, guid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoVolumeDeviceToGuidPath(volumedeviceobject: Long, guidpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoWMIAllocateInstanceIds(guid: Long, instancecount: Int, firstinstanceid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoWMIDeviceObjectToInstanceName(datablockobject: Long, deviceobject: Long, instancename: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoWMIExecuteMethod(datablockobject: Long, instancename: Long, methodid: Int, inbuffersize: Int, outbuffersize: Long, inoutbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoWMIHandleToInstanceName(datablockobject: Long, filehandle: Long, instancename: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoWMIOpenBlock(guid: Long, desiredaccess: Int, datablockobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoWMIQueryAllData(datablockobject: Long, inoutbuffersize: Long, outbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoWMIQueryAllDataMultiple(datablockobjectlist: Long, objectcount: Int, inoutbuffersize: Long, outbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoWMIQuerySingleInstance(datablockobject: Long, instancename: Long, inoutbuffersize: Long, outbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoWMIQuerySingleInstanceMultiple(datablockobjectlist: Long, instancenames: Long, objectcount: Int, inoutbuffersize: Long, outbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoWMIRegistrationControl(deviceobject: Long, action: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoWMISetNotificationCallback(obj: Long, callback: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoWMISetSingleInstance(datablockobject: Long, instancename: Long, version: Int, valuebuffersize: Int, valuebuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoWMISetSingleItem(datablockobject: Long, instancename: Long, dataitemid: Int, version: Int, valuebuffersize: Int, valuebuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoWMISuggestInstanceName(physicaldeviceobject: Long, symboliclinkname: Long, combinenames: Boolean, suggestedinstancename: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoWMIWriteEvent(wnodeeventitem: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoWithinStackLimits(regionstart: Long, regionsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoWriteErrorLogEntry(elentry: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoWriteKsrPersistentMemory(datahandle: Long, buffer: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoWritePartitionTable(deviceobject: Long, sectorsize: Int, sectorspertrack: Int, numberofheads: Int, partitionbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IoWritePartitionTableEx(deviceobject: Long, drivelayout: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IofCallDriver(deviceobject: Long, irp: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_IofCompleteRequest(irp: Long, priorityboost: Byte)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KdChangeOption(option: Int, inbufferbytes: Int, inbuffer: Long, outbufferbytes: Int, outbuffer: Long, outbufferneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KdDisableDebugger(): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KdEnableDebugger(): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KdRefreshDebuggerNotPresent(): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeAcquireGuardedMutex(mutex: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeAcquireGuardedMutexUnsafe(fastmutex: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeAcquireInStackQueuedSpinLock(spinlock: Long, lockhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeAcquireInStackQueuedSpinLockAtDpcLevel(spinlock: Long, lockhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeAcquireInStackQueuedSpinLockForDpc(spinlock: Long, lockhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeAcquireInterruptSpinLock(interrupt: Long): Byte

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeAcquireSpinLockForDpc(spinlock: Long): Byte

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeAddTriageDumpDataBlock(ktriagedumpdataarray: Long, address: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeAreAllApcsDisabled(): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeAreApcsDisabled(): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeBugCheck(bugcheckcode: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeBugCheckEx(bugcheckcode: Int, bugcheckparameter1: Long, bugcheckparameter2: Long, bugcheckparameter3: Long, bugcheckparameter4: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeCancelTimer(param0: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeClearEvent(event: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeConvertAuxiliaryCounterToPerformanceCounter(auxiliarycountervalue: Long, performancecountervalue: Long, conversionerror: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeConvertPerformanceCounterToAuxiliaryCounter(performancecountervalue: Long, auxiliarycountervalue: Long, conversionerror: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeDelayExecutionThread(waitmode: Byte, alertable: Boolean, interval: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeDeregisterBoundCallback(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeDeregisterBugCheckCallback(callbackrecord: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeDeregisterBugCheckReasonCallback(callbackrecord: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeDeregisterNmiCallback(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeDeregisterProcessorChangeCallback(callbackhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeEnterCriticalRegion()

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeEnterGuardedRegion()

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeExpandKernelStackAndCallout(callout: Long, parameter: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeExpandKernelStackAndCalloutEx(callout: Long, parameter: Long, size: Long, wait: Boolean, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeFlushIoBuffers(mdl: Long, readoperation: Boolean, dmaoperation: Boolean)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeFlushQueuedDpcs()

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeFlushWriteBuffer()

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeGetCurrentIrql(): Byte

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeGetCurrentNodeNumber(): Short

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeGetCurrentProcessorNumberEx(procnumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeGetProcessorIndexFromNumber(procnumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeGetProcessorNumberFromIndex(procindex: Int, procnumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeGetRecommendedSharedDataAlignment(): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeInitializeCrashDumpHeader(dumptype: Int, flags: Int, buffer: Long, buffersize: Int, bufferneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeInitializeDeviceQueue(devicequeue: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeInitializeEvent(event: Long, type: Int, state: Boolean)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeInitializeGuardedMutex(mutex: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeInitializeMutex(mutex: Long, level: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeInitializeSemaphore(semaphore: Long, count: Int, limit: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeInitializeSpinLock(spinlock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeInitializeTimer(timer: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeInitializeTimerEx(timer: Long, type: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeInitializeTriageDumpDataArray(ktriagedumpdataarray: Long, size: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeInsertByKeyDeviceQueue(devicequeue: Long, devicequeueentry: Long, sortkey: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeInsertDeviceQueue(devicequeue: Long, devicequeueentry: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeInsertQueueDpc(dpc: Long, systemargument1: Long, systemargument2: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeInvalidateAllCaches(): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeInvalidateRangeAllCaches(baseaddress: Long, length: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeIpiGenericCall(broadcastfunction: Long, context: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeIsExecutingDpc(): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeLeaveCriticalRegion()

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeLeaveGuardedRegion()

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KePulseEvent(event: Long, increment: Int, wait: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeQueryActiveGroupCount(): Short

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeQueryActiveProcessorCount(activeprocessors: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeQueryActiveProcessorCountEx(groupnumber: Short): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeQueryActiveProcessors(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeQueryAuxiliaryCounterFrequency(auxiliarycounterfrequency: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeQueryDpcWatchdogInformation(watchdoginformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeQueryGroupAffinity(groupnumber: Short): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeQueryHardwareCounterConfiguration(counterarray: Long, maximumcount: Int, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeQueryHighestNodeNumber(): Short

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeQueryInterruptTimePrecise(qpctimestamp: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeQueryLogicalProcessorRelationship(processornumber: Long, relationshiptype: Int, information: Long, length: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeQueryMaximumGroupCount(): Short

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeQueryMaximumProcessorCount(): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeQueryMaximumProcessorCountEx(groupnumber: Short): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeQueryNodeActiveAffinity(nodenumber: Short, affinity: Long, count: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeQueryNodeActiveAffinity2(nodenumber: Short, groupaffinities: Long, groupaffinitiescount: Short, groupaffinitiesrequired: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeQueryNodeActiveProcessorCount(nodenumber: Short): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeQueryNodeMaximumProcessorCount(nodenumber: Short): Short

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeQueryPerformanceCounter(performancefrequency: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeQueryPriorityThread(thread: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeQueryRuntimeThread(thread: Long, usertime: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeQuerySystemTimePrecise(currenttime: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeQueryTimeIncrement(): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeQueryTotalCycleTimeThread(thread: Long, cycletimestamp: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeQueryUnbiasedInterruptTime(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeQueryUnbiasedInterruptTimePrecise(qpctimestamp: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeReadStateEvent(event: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeReadStateMutex(mutex: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeReadStateSemaphore(semaphore: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeReadStateTimer(timer: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeRegisterBoundCallback(callbackroutine: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeRegisterBugCheckCallback(callbackrecord: Long, callbackroutine: Long, buffer: Long, length: Int, component: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeRegisterBugCheckReasonCallback(callbackrecord: Long, callbackroutine: Long, reason: Int, component: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeRegisterNmiCallback(callbackroutine: Long, context: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeRegisterProcessorChangeCallback(callbackfunction: Long, callbackcontext: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeReleaseGuardedMutex(mutex: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeReleaseGuardedMutexUnsafe(fastmutex: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeReleaseInStackQueuedSpinLock(lockhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeReleaseInStackQueuedSpinLockForDpc(lockhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeReleaseInStackQueuedSpinLockFromDpcLevel(lockhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeReleaseInterruptSpinLock(interrupt: Long, oldirql: Byte)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeReleaseMutex(mutex: Long, wait: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeReleaseSemaphore(semaphore: Long, increment: Int, adjustment: Int, wait: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeReleaseSpinLockForDpc(spinlock: Long, oldirql: Byte)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeRemoveByKeyDeviceQueue(devicequeue: Long, sortkey: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeRemoveByKeyDeviceQueueIfBusy(devicequeue: Long, sortkey: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeRemoveDeviceQueue(devicequeue: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeRemoveEntryDeviceQueue(devicequeue: Long, devicequeueentry: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeRemoveQueueDpc(dpc: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeRemoveQueueDpcEx(dpc: Long, waitifactive: Boolean): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeResetEvent(event: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeRestoreExtendedProcessorState(xstatesave: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeRevertToUserAffinityThread()

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeRevertToUserAffinityThreadEx(affinity: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeRevertToUserGroupAffinityThread(previousaffinity: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeSaveExtendedProcessorState(mask: Long, xstatesave: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeSetBasePriorityThread(thread: Long, increment: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeSetCoalescableTimer(timer: Long, duetime: Long, period: Int, tolerabledelay: Int, dpc: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeSetEvent(event: Long, increment: Int, wait: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeSetHardwareCounterConfiguration(counterarray: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeSetImportanceDpc(dpc: Long, importance: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeSetPriorityThread(thread: Long, priority: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeSetSystemAffinityThread(affinity: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeSetSystemAffinityThreadEx(affinity: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeSetSystemGroupAffinityThread(affinity: Long, previousaffinity: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeSetTargetProcessorDpc(dpc: Long, number: Byte)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeSetTargetProcessorDpcEx(dpc: Long, procnumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeSetTimer(timer: Long, duetime: Long, dpc: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeSetTimerEx(timer: Long, duetime: Long, period: Int, dpc: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeShouldYieldProcessor(): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeStallExecutionProcessor(microseconds: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeSynchronizeExecution(interrupt: Long, synchronizeroutine: Long, synchronizecontext: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeTestSpinLock(spinlock: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeTryToAcquireGuardedMutex(mutex: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeTryToAcquireSpinLockAtDpcLevel(spinlock: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeWaitForMultipleObjects(count: Int, obj: Long, waittype: Int, waitreason: Int, waitmode: Byte, alertable: Boolean, timeout: Long, waitblockarray: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KeWaitForSingleObject(obj: Long, waitreason: Int, waitmode: Byte, alertable: Boolean, timeout: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_KfRaiseIrql(newirql: Byte): Byte

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmAddPhysicalMemory(startaddress: Long, numberofbytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmAddVerifierSpecialThunks(entryroutine: Long, thunkbuffer: Long, thunkbuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmAddVerifierThunks(thunkbuffer: Long, thunkbuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmAdvanceMdl(mdl: Long, numberofbytes: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmAllocateContiguousMemory(numberofbytes: Long, highestacceptableaddress: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmAllocateContiguousMemoryEx(numberofbytes: Long, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, preferrednode: Int, protect: Int, partitionobject: Long, tag: Int, flags: Int, baseaddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmAllocateContiguousMemorySpecifyCache(numberofbytes: Long, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, cachetype: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmAllocateContiguousMemorySpecifyCacheNode(numberofbytes: Long, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, cachetype: Int, preferrednode: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmAllocateContiguousNodeMemory(numberofbytes: Long, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, protect: Int, preferrednode: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmAllocateMappingAddress(numberofbytes: Long, pooltag: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmAllocateMappingAddressEx(numberofbytes: Long, pooltag: Int, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmAllocateMdlForIoSpace(physicaladdresslist: Long, numberofentries: Long, newmdl: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmAllocateNodePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: Long, cachetype: Int, idealnode: Int, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmAllocateNonCachedMemory(numberofbytes: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmAllocatePagesForMdl(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmAllocatePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: Long, cachetype: Int, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmAllocatePartitionNodePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: Long, cachetype: Int, idealnode: Int, flags: Int, partitionobject: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmAreMdlPagesCached(memorydescriptorlist: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmBuildMdlForNonPagedPool(memorydescriptorlist: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmCreateMdl(memorydescriptorlist: Long, base: Long, length: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmCreateMirror(): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmFreeContiguousMemory(baseaddress: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmFreeContiguousMemorySpecifyCache(baseaddress: Long, numberofbytes: Long, cachetype: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmFreeMappingAddress(baseaddress: Long, pooltag: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmFreeNonCachedMemory(baseaddress: Long, numberofbytes: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmFreePagesFromMdl(memorydescriptorlist: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmFreePagesFromMdlEx(memorydescriptorlist: Long, flags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmGetCacheAttribute(physicaladdress: Long, cachetype: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmGetCacheAttributeEx(physicaladdress: Long, flags: Int, cachetype: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmGetPhysicalAddress(baseaddress: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmGetPhysicalMemoryRanges(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmGetPhysicalMemoryRangesEx(partitionobject: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmGetPhysicalMemoryRangesEx2(partitionobject: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmGetSystemRoutineAddress(systemroutinename: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmGetVirtualForPhysical(physicaladdress: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmIsAddressValid(virtualaddress: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmIsDriverSuspectForVerifier(driverobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmIsDriverVerifying(driverobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmIsDriverVerifyingByAddress(addresswithinsection: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmIsIoSpaceActive(startaddress: Long, numberofbytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmIsNonPagedSystemAddressValid(virtualaddress: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmIsThisAnNtAsSystem(): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmIsVerifierEnabled(verifierflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmLockPagableDataSection(addresswithinsection: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmLockPagableSectionByHandle(imagesectionhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmMapIoSpace(physicaladdress: Long, numberofbytes: Long, cachetype: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmMapIoSpaceEx(physicaladdress: Long, numberofbytes: Long, protect: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmMapLockedPages(memorydescriptorlist: Long, accessmode: Byte): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmMapLockedPagesSpecifyCache(memorydescriptorlist: Long, accessmode: Byte, cachetype: Int, requestedaddress: Long, bugcheckonfailure: Int, priority: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmMapLockedPagesWithReservedMapping(mappingaddress: Long, pooltag: Int, memorydescriptorlist: Long, cachetype: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmMapMdl(memorydescriptorlist: Long, protection: Int, driverroutine: Long, drivercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmMapMemoryDumpMdlEx(va: Long, pagetotal: Int, memorydumpmdl: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmMapUserAddressesToPage(baseaddress: Long, numberofbytes: Long, pageaddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmMapVideoDisplay(physicaladdress: Long, numberofbytes: Long, cachetype: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmMapViewInSessionSpace(section: Long, mappedbase: Long, viewsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmMapViewInSessionSpaceEx(section: Long, mappedbase: Long, viewsize: Long, sectionoffset: Long, flags: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmMapViewInSystemSpace(section: Long, mappedbase: Long, viewsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmMapViewInSystemSpaceEx(section: Long, mappedbase: Long, viewsize: Long, sectionoffset: Long, flags: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmMdlPageContentsState(memorydescriptorlist: Long, state: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmPageEntireDriver(addresswithinsection: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmProbeAndLockPages(memorydescriptorlist: Long, accessmode: Byte, operation: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmProbeAndLockProcessPages(memorydescriptorlist: Long, process: Long, accessmode: Byte, operation: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmProbeAndLockSelectedPages(memorydescriptorlist: Long, segmentarray: Long, accessmode: Byte, operation: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmProtectDriverSection(addresswithinsection: Long, size: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmProtectMdlSystemAddress(memorydescriptorlist: Long, newprotect: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmQuerySystemSize(): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmRemovePhysicalMemory(startaddress: Long, numberofbytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmResetDriverPaging(addresswithinsection: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmRotatePhysicalView(virtualaddress: Long, numberofbytes: Long, newmdl: Long, direction: Int, copyfunction: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmSecureVirtualMemory(address: Long, size: Long, probemode: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmSecureVirtualMemoryEx(address: Long, size: Long, probemode: Int, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmSetPermanentCacheAttribute(startaddress: Long, numberofbytes: Long, cachetype: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmSizeOfMdl(base: Long, length: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmUnlockPagableImageSection(imagesectionhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmUnlockPages(memorydescriptorlist: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmUnmapIoSpace(baseaddress: Long, numberofbytes: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmUnmapLockedPages(baseaddress: Long, memorydescriptorlist: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmUnmapReservedMapping(baseaddress: Long, pooltag: Int, memorydescriptorlist: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmUnmapVideoDisplay(baseaddress: Long, numberofbytes: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmUnmapViewInSessionSpace(mappedbase: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmUnmapViewInSystemSpace(mappedbase: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_MmUnsecureVirtualMemory(securehandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtAllocateLocallyUniqueId(luid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtCommitComplete(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtCommitEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtCommitTransaction(transactionhandle: Long, wait: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtCreateEnlistment(enlistmenthandle: Long, desiredaccess: Int, resourcemanagerhandle: Long, transactionhandle: Long, objectattributes: Long, createoptions: Int, notificationmask: Int, enlistmentkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtCreateResourceManager(resourcemanagerhandle: Long, desiredaccess: Int, tmhandle: Long, rmguid: Long, objectattributes: Long, createoptions: Int, description: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtCreateTransaction(transactionhandle: Long, desiredaccess: Int, objectattributes: Long, uow: Long, tmhandle: Long, createoptions: Int, isolationlevel: Int, isolationflags: Int, timeout: Long, description: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtCreateTransactionManager(tmhandle: Long, desiredaccess: Int, objectattributes: Long, logfilename: Long, createoptions: Int, commitstrength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtDisplayString(string: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtEnumerateTransactionObject(rootobjecthandle: Long, querytype: Int, objectcursor: Long, objectcursorlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtGetNotificationResourceManager(resourcemanagerhandle: Long, transactionnotification: Long, notificationlength: Int, timeout: Long, returnlength: Long, asynchronous: Int, asynchronouscontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtLoadDriver(driverservicename: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtMakeTemporaryObject(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtManagePartition(targethandle: Long, sourcehandle: Long, partitioninformationclass: Int, partitioninformation: Long, partitioninformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtOpenEnlistment(enlistmenthandle: Long, desiredaccess: Int, resourcemanagerhandle: Long, enlistmentguid: Long, objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtOpenResourceManager(resourcemanagerhandle: Long, desiredaccess: Int, tmhandle: Long, resourcemanagerguid: Long, objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtOpenTransaction(transactionhandle: Long, desiredaccess: Int, objectattributes: Long, uow: Long, tmhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtOpenTransactionManager(tmhandle: Long, desiredaccess: Int, objectattributes: Long, logfilename: Long, tmidentity: Long, openoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtPowerInformation(informationlevel: Int, inputbuffer: Long, inputbufferlength: Int, outputbuffer: Long, outputbufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtPrePrepareComplete(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtPrePrepareEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtPrepareComplete(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtPrepareEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtPropagationComplete(resourcemanagerhandle: Long, requestcookie: Int, bufferlength: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtPropagationFailed(resourcemanagerhandle: Long, requestcookie: Int, propstatus: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtQueryInformationEnlistment(enlistmenthandle: Long, enlistmentinformationclass: Int, enlistmentinformation: Long, enlistmentinformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtQueryInformationResourceManager(resourcemanagerhandle: Long, resourcemanagerinformationclass: Int, resourcemanagerinformation: Long, resourcemanagerinformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtQueryInformationTransaction(transactionhandle: Long, transactioninformationclass: Int, transactioninformation: Long, transactioninformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtQueryInformationTransactionManager(transactionmanagerhandle: Long, transactionmanagerinformationclass: Int, transactionmanagerinformation: Long, transactionmanagerinformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtReadOnlyEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtRecoverEnlistment(enlistmenthandle: Long, enlistmentkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtRecoverResourceManager(resourcemanagerhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtRecoverTransactionManager(transactionmanagerhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtRegisterProtocolAddressInformation(resourcemanager: Long, protocolid: Long, protocolinformationsize: Int, protocolinformation: Long, createoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtRenameTransactionManager(logfilename: Long, existingtransactionmanagerguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtRollbackComplete(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtRollbackEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtRollbackTransaction(transactionhandle: Long, wait: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtRollforwardTransactionManager(transactionmanagerhandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtSetInformationEnlistment(enlistmenthandle: Long, enlistmentinformationclass: Int, enlistmentinformation: Long, enlistmentinformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtSetInformationResourceManager(resourcemanagerhandle: Long, resourcemanagerinformationclass: Int, resourcemanagerinformation: Long, resourcemanagerinformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtSetInformationTransaction(transactionhandle: Long, transactioninformationclass: Int, transactioninformation: Long, transactioninformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtSetInformationTransactionManager(tmhandle: Long, transactionmanagerinformationclass: Int, transactionmanagerinformation: Long, transactionmanagerinformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtSinglePhaseReject(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_NtUnloadDriver(driverservicename: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ObCloseHandle(handle: Long, previousmode: Byte): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ObDereferenceObjectDeferDelete(obj: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ObDereferenceObjectDeferDeleteWithTag(obj: Long, tag: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ObGetFilterVersion(): Short

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ObGetObjectSecurity(obj: Long, securitydescriptor: Long, memoryallocated: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ObReferenceObjectByHandle(handle: Long, desiredaccess: Int, objecttype: Long, accessmode: Byte, obj: Long, handleinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ObReferenceObjectByHandleWithTag(handle: Long, desiredaccess: Int, objecttype: Long, accessmode: Byte, tag: Int, obj: Long, handleinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ObReferenceObjectByPointer(obj: Long, desiredaccess: Int, objecttype: Long, accessmode: Byte): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ObReferenceObjectByPointerWithTag(obj: Long, desiredaccess: Int, objecttype: Long, accessmode: Byte, tag: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ObReferenceObjectSafe(obj: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ObReferenceObjectSafeWithTag(obj: Long, tag: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ObRegisterCallbacks(callbackregistration: Long, registrationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ObReleaseObjectSecurity(securitydescriptor: Long, memoryallocated: Boolean)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ObUnRegisterCallbacks(registrationhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ObfDereferenceObject(obj: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ObfDereferenceObjectWithTag(obj: Long, tag: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ObfReferenceObject(obj: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ObfReferenceObjectWithTag(obj: Long, tag: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PcwAddInstance(buffer: Long, name: Long, id: Int, count: Int, data: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PcwCloseInstance(instance: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PcwCreateInstance(instance: Long, registration: Long, name: Long, count: Int, data: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PcwRegister(registration: Long, info: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PcwUnregister(registration: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoCallDriver(deviceobject: Long, irp: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoClearPowerRequest(powerrequest: Long, type: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoCreatePowerRequest(powerrequest: Long, deviceobject: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoCreateThermalRequest(thermalrequest: Long, targetdeviceobject: Long, policydeviceobject: Long, context: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoDeletePowerRequest(powerrequest: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoDeleteThermalRequest(thermalrequest: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoEndDeviceBusy(idlepointer: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoFxActivateComponent(handle: Long, component: Int, flags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoFxCompleteDevicePowerNotRequired(handle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoFxCompleteDirectedPowerDown(handle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoFxCompleteIdleCondition(handle: Long, component: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoFxCompleteIdleState(handle: Long, component: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoFxIdleComponent(handle: Long, component: Int, flags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoFxIssueComponentPerfStateChange(handle: Long, flags: Int, component: Int, perfchange: Long, context: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoFxIssueComponentPerfStateChangeMultiple(handle: Long, flags: Int, component: Int, perfchangescount: Int, perfchanges: Long, context: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoFxNotifySurprisePowerOn(pdo: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoFxPowerControl(handle: Long, powercontrolcode: Long, inbuffer: Long, inbuffersize: Long, outbuffer: Long, outbuffersize: Long, bytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoFxPowerOnCrashdumpDevice(handle: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoFxQueryCurrentComponentPerfState(handle: Long, flags: Int, component: Int, setindex: Int, currentperf: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoFxRegisterComponentPerfStates(handle: Long, component: Int, flags: Long, componentperfstatecallback: Long, inputstateinfo: Long, outputstateinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoFxRegisterCrashdumpDevice(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoFxRegisterDevice(pdo: Long, device: Long, handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoFxRegisterDripsWatchdogCallback(handle: Long, callback: Long, includechilddevices: Boolean, matchingdriverobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoFxReportDevicePoweredOn(handle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoFxSetComponentLatency(handle: Long, component: Int, latency: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoFxSetComponentResidency(handle: Long, component: Int, residency: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoFxSetComponentWake(handle: Long, component: Int, wakehint: Boolean)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoFxSetDeviceIdleTimeout(handle: Long, idletimeout: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoFxSetTargetDripsDevicePowerState(handle: Long, targetstate: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoFxStartDevicePowerManagement(handle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoFxUnregisterDevice(handle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoGetSystemWake(irp: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoGetThermalRequestSupport(thermalrequest: Long, type: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoQueryWatchdogTime(pdo: Long, secondsremaining: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoRegisterDeviceForIdleDetection(deviceobject: Long, conservationidletime: Int, performanceidletime: Int, state: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoRegisterPowerSettingCallback(deviceobject: Long, settingguid: Long, callback: Long, context: Long, handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoRegisterSystemState(statehandle: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoSetDeviceBusyEx(idlepointer: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoSetHiberRange(memorymap: Long, flags: Int, address: Long, length: Long, tag: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoSetPowerRequest(powerrequest: Long, type: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoSetSystemState(flags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoSetSystemWake(irp: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoSetSystemWakeDevice(deviceobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoSetThermalActiveCooling(thermalrequest: Long, engaged: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoSetThermalPassiveCooling(thermalrequest: Long, throttle: Byte): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoStartDeviceBusy(idlepointer: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoStartNextPowerIrp(irp: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoUnregisterPowerSettingCallback(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PoUnregisterSystemState(statehandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ProbeForRead(address: Long, length: Long, alignment: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ProbeForWrite(address: Long, length: Long, alignment: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsAcquireSiloHardReference(silo: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsAllocSiloContextSlot(reserved: Long, returnedcontextslot: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsAllocateAffinityToken(affinitytoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsAttachSiloToCurrentThread(silo: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsCreateSiloContext(silo: Long, size: Int, pooltype: Int, contextcleanupcallback: Long, returnedsilocontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsCreateSystemThread(threadhandle: Long, desiredaccess: Int, objectattributes: Long, processhandle: Long, clientid: Long, startroutine: Long, startcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsDereferenceSiloContext(silocontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsDetachSiloFromCurrentThread(previoussilo: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsFreeAffinityToken(affinitytoken: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsFreeSiloContextSlot(contextslot: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsGetCurrentProcessId(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsGetCurrentServerSilo(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsGetCurrentServerSiloName(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsGetCurrentSilo(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsGetCurrentThreadId(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsGetCurrentThreadTeb(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsGetEffectiveServerSilo(silo: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsGetHostSilo(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsGetJobServerSilo(job: Long, serversilo: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsGetJobSilo(job: Long, silo: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsGetParentSilo(job: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsGetPermanentSiloContext(silo: Long, contextslot: Int, returnedsilocontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsGetProcessCreateTimeQuadPart(process: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsGetProcessExitStatus(process: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsGetProcessId(process: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsGetProcessStartKey(process: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsGetServerSiloServiceSessionId(silo: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsGetSiloContainerId(silo: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsGetSiloContext(silo: Long, contextslot: Int, returnedsilocontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsGetSiloMonitorContextSlot(monitor: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsGetThreadCreateTime(thread: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsGetThreadExitStatus(thread: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsGetThreadId(thread: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsGetThreadProcessId(thread: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsGetThreadProperty(thread: Long, key: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsGetThreadServerSilo(thread: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsGetVersion(majorversion: Long, minorversion: Long, buildnumber: Long, csdversion: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsInsertPermanentSiloContext(silo: Long, contextslot: Int, silocontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsInsertSiloContext(silo: Long, contextslot: Int, silocontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsIsCurrentThreadInServerSilo(): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsIsCurrentThreadPrefetching(): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsIsHostSilo(silo: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsMakeSiloContextPermanent(silo: Long, contextslot: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsQueryTotalCycleTimeProcess(process: Long, cycletimestamp: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsReferenceSiloContext(silocontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsRegisterSiloMonitor(registration: Long, returnedmonitor: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsReleaseSiloHardReference(silo: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsRemoveCreateThreadNotifyRoutine(notifyroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsRemoveLoadImageNotifyRoutine(notifyroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsRemoveSiloContext(silo: Long, contextslot: Int, removedsilocontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsReplaceSiloContext(silo: Long, contextslot: Int, newsilocontext: Long, oldsilocontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsRevertToUserMultipleGroupAffinityThread(affinitytoken: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsSetCreateProcessNotifyRoutine(notifyroutine: Long, remove: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsSetCreateProcessNotifyRoutineEx(notifyroutine: Long, remove: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsSetCreateProcessNotifyRoutineEx2(notifytype: Int, notifyinformation: Long, remove: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsSetCreateThreadNotifyRoutine(notifyroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsSetCreateThreadNotifyRoutineEx(notifytype: Int, notifyinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsSetCurrentThreadPrefetching(prefetching: Boolean): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsSetLoadImageNotifyRoutine(notifyroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsSetLoadImageNotifyRoutineEx(notifyroutine: Long, flags: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsSetSystemMultipleGroupAffinityThread(groupaffinities: Long, groupcount: Short, affinitytoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsStartSiloMonitor(monitor: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsTerminateServerSilo(serversilo: Long, exitstatus: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsTerminateSystemThread(exitstatus: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsUnregisterSiloMonitor(monitor: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PsWrapApcWow64Thread(apccontext: Long, apcroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PshedAllocateMemory(size: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PshedFreeMemory(address: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PshedIsSystemWheaEnabled(): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PshedRegisterPlugin(packet: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PshedSynchronizeExecution(errorsource: Long, synchronizeroutine: Long, synchronizecontext: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_PshedUnregisterPlugin(pluginhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlAppendUnicodeStringToString(destination: Long, source: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlAppendUnicodeToString(destination: Long, source: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlAreBitsClear(bitmapheader: Long, startingindex: Int, length: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlAreBitsSet(bitmapheader: Long, startingindex: Int, length: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlAssert(voidfailedassertion: Long, voidfilename: Long, linenumber: Int, mutablemessage: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlCheckRegistryKey(relativeto: Int, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlClearAllBits(bitmapheader: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlClearBit(bitmapheader: Long, bitnumber: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlClearBits(bitmapheader: Long, startingindex: Int, numbertoclear: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlCmDecodeMemIoResource(descriptor: Long, start: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlCmEncodeMemIoResource(descriptor: Long, type: Byte, length: Long, start: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlCompareString(string1: Long, string2: Long, caseinsensitive: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlCompareUnicodeString(string1: Long, string2: Long, caseinsensitive: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlCompareUnicodeStrings(string1: Long, string1length: Long, string2: Long, string2length: Long, caseinsensitive: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlContractHashTable(hashtable: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlCopyBitMap(source: Long, destination: Long, targetbit: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlCopyString(destinationstring: Long, sourcestring: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlCopyUnicodeString(destinationstring: Long, sourcestring: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlCreateHashTable(hashtable: Long, shift: Int, flags: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlCreateHashTableEx(hashtable: Long, initialsize: Int, shift: Int, flags: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlCreateRegistryKey(relativeto: Int, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlCreateSecurityDescriptor(securitydescriptor: Long, revision: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlDelete(links: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlDeleteElementGenericTable(table: Long, buffer: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlDeleteElementGenericTableAvl(table: Long, buffer: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlDeleteElementGenericTableAvlEx(table: Long, nodeorparent: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlDeleteHashTable(hashtable: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlDeleteNoSplay(links: Long, root: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlDeleteRegistryValue(relativeto: Int, path: Long, valuename: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlDowncaseUnicodeChar(sourcecharacter: Short): Short

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlEndEnumerationHashTable(hashtable: Long, enumerator: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlEndStrongEnumerationHashTable(hashtable: Long, enumerator: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlEndWeakEnumerationHashTable(hashtable: Long, enumerator: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlEnumerateEntryHashTable(hashtable: Long, enumerator: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlEnumerateGenericTable(table: Long, restart: Boolean): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlEnumerateGenericTableAvl(table: Long, restart: Boolean): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlEnumerateGenericTableLikeADirectory(table: Long, matchfunction: Long, matchdata: Long, nextflag: Int, restartkey: Long, deletecount: Long, buffer: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlEnumerateGenericTableWithoutSplaying(table: Long, restartkey: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlEnumerateGenericTableWithoutSplayingAvl(table: Long, restartkey: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlEqualString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlEqualUnicodeString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlExpandHashTable(hashtable: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlExtractBitMap(source: Long, destination: Long, targetbit: Int, numberofbits: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlFindClearBits(bitmapheader: Long, numbertofind: Int, hintindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlFindClearBitsAndSet(bitmapheader: Long, numbertofind: Int, hintindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlFindClearRuns(bitmapheader: Long, runarray: Long, sizeofrunarray: Int, locatelongestruns: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlFindClosestEncodableLength(sourcelength: Long, targetlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlFindFirstRunClear(bitmapheader: Long, startingindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlFindLastBackwardRunClear(bitmapheader: Long, fromindex: Int, startingrunindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlFindLeastSignificantBit(set: Long): Byte

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlFindLongestRunClear(bitmapheader: Long, startingindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlFindMostSignificantBit(set: Long): Byte

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlFindNextForwardRunClear(bitmapheader: Long, fromindex: Int, startingrunindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlFindSetBits(bitmapheader: Long, numbertofind: Int, hintindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlFindSetBitsAndClear(bitmapheader: Long, numbertofind: Int, hintindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlFreeUTF8String(utf8string: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlGUIDFromString(guidstring: Long, guid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlGenerateClass5Guid(namespaceguid: Long, buffer: Long, buffersize: Int, guid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlGetActiveConsoleId(): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlGetCallersAddress(callersaddress: Long, callerscaller: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlGetConsoleSessionForegroundProcessId(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlGetElementGenericTable(table: Long, i: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlGetElementGenericTableAvl(table: Long, i: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlGetEnabledExtendedFeatures(featuremask: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlGetNextEntryHashTable(hashtable: Long, context: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlGetNtProductType(ntproducttype: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlGetNtSystemRoot(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlGetPersistedStateLocation(sourceid: Long, customvalue: Long, defaultpath: Long, statelocationtype: Int, targetpath: Long, bufferlengthin: Int, bufferlengthout: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlGetSuiteMask(): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlGetVersion(lpversioninformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlHashUnicodeString(string: Long, caseinsensitive: Boolean, hashalgorithm: Int, hashvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlInitEnumerationHashTable(hashtable: Long, enumerator: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlInitStrongEnumerationHashTable(hashtable: Long, enumerator: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlInitUTF8String(destinationstring: Long, sourcestring: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlInitUTF8StringEx(destinationstring: Long, sourcestring: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlInitWeakEnumerationHashTable(hashtable: Long, enumerator: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlInitializeBitMap(bitmapheader: Long, bitmapbuffer: Long, sizeofbitmap: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlInitializeGenericTable(table: Long, compareroutine: Long, allocateroutine: Long, freeroutine: Long, tablecontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlInitializeGenericTableAvl(table: Long, compareroutine: Long, allocateroutine: Long, freeroutine: Long, tablecontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlInsertElementGenericTable(table: Long, buffer: Long, buffersize: Int, newelement: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlInsertElementGenericTableAvl(table: Long, buffer: Long, buffersize: Int, newelement: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlInsertElementGenericTableFull(table: Long, buffer: Long, buffersize: Int, newelement: Long, nodeorparent: Long, searchresult: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlInsertElementGenericTableFullAvl(table: Long, buffer: Long, buffersize: Int, newelement: Long, nodeorparent: Long, searchresult: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlInsertEntryHashTable(hashtable: Long, entry: Long, signature: Long, context: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlInt64ToUnicodeString(value: Long, base: Int, string: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlIntegerToUnicodeString(value: Int, base: Int, string: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlIoDecodeMemIoResource(descriptor: Long, alignment: Long, minimumaddress: Long, maximumaddress: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlIoEncodeMemIoResource(descriptor: Long, type: Byte, length: Long, alignment: Long, minimumaddress: Long, maximumaddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlIsApiSetImplemented(apisetname: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlIsGenericTableEmpty(table: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlIsGenericTableEmptyAvl(table: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlIsMultiSessionSku(): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlIsMultiUsersInSessionSku(): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlIsNtDdiVersionAvailable(version: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlIsServicePackVersionInstalled(version: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlIsStateSeparationEnabled(): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlIsUntrustedObject(handle: Long, obj: Long, untrustedobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlLengthSecurityDescriptor(securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlLookupElementGenericTable(table: Long, buffer: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlLookupElementGenericTableAvl(table: Long, buffer: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlLookupElementGenericTableFull(table: Long, buffer: Long, nodeorparent: Long, searchresult: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlLookupElementGenericTableFullAvl(table: Long, buffer: Long, nodeorparent: Long, searchresult: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlLookupEntryHashTable(hashtable: Long, signature: Long, context: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlLookupFirstMatchingElementGenericTableAvl(table: Long, buffer: Long, restartkey: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlMapGenericMask(accessmask: Long, genericmapping: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlNormalizeSecurityDescriptor(securitydescriptor: Long, securitydescriptorlength: Int, newsecuritydescriptor: Long, newsecuritydescriptorlength: Long, checkonly: Boolean): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlNumberGenericTableElements(table: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlNumberGenericTableElementsAvl(table: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlNumberOfClearBits(bitmapheader: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlNumberOfClearBitsInRange(bitmapheader: Long, startingindex: Int, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlNumberOfSetBits(bitmapheader: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlNumberOfSetBitsInRange(bitmapheader: Long, startingindex: Int, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlNumberOfSetBitsUlongPtr(target: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlPrefetchMemoryNonTemporal(source: Long, length: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlPrefixUnicodeString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlQueryRegistryValueWithFallback(primaryhandle: Long, fallbackhandle: Long, valuename: Long, valuelength: Int, valuetype: Long, valuedata: Long, resultlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlQueryRegistryValues(relativeto: Int, path: Long, querytable: Long, context: Long, environment: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlQueryValidationRunlevel(componentname: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlRealPredecessor(links: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlRealSuccessor(links: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlRemoveEntryHashTable(hashtable: Long, entry: Long, context: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlRunOnceBeginInitialize(runonce: Long, flags: Int, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlRunOnceComplete(runonce: Long, flags: Int, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlRunOnceExecuteOnce(runonce: Long, initfn: Long, parameter: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlRunOnceInitialize(runonce: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlSetAllBits(bitmapheader: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlSetBit(bitmapheader: Long, bitnumber: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlSetBits(bitmapheader: Long, startingindex: Int, numbertoset: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlSetDaclSecurityDescriptor(securitydescriptor: Long, daclpresent: Boolean, dacl: Long, dacldefaulted: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlSetSystemGlobalData(dataid: Int, buffer: Long, size: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlSplay(links: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlStringFromGUID(guid: Long, guidstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlStronglyEnumerateEntryHashTable(hashtable: Long, enumerator: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlSubtreePredecessor(links: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlSubtreeSuccessor(links: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlSuffixUnicodeString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlTestBit(bitmapheader: Long, bitnumber: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlTimeFieldsToTime(timefields: Long, time: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlTimeToTimeFields(time: Long, timefields: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlUTF8StringToUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlUTF8ToUnicodeN(unicodestringdestination: Long, unicodestringmaxbytecount: Int, unicodestringactualbytecount: Long, utf8stringsource: Long, utf8stringbytecount: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlUnicodeStringToInt64(string: Long, base: Int, number: Long, endpointer: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlUnicodeStringToInteger(string: Long, base: Int, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlUnicodeStringToUTF8String(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlUnicodeToUTF8N(utf8stringdestination: Long, utf8stringmaxbytecount: Int, utf8stringactualbytecount: Long, unicodestringsource: Long, unicodestringbytecount: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlUpcaseUnicodeChar(sourcecharacter: Short): Short

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlUpcaseUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlUpperChar(character: Byte): Byte

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlUpperString(destinationstring: Long, sourcestring: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlValidRelativeSecurityDescriptor(securitydescriptorinput: Long, securitydescriptorlength: Int, requiredinformation: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlValidSecurityDescriptor(securitydescriptor: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlVerifyVersionInfo(versioninfo: Long, typemask: Int, conditionmask: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlVolumeDeviceToDosName(volumedeviceobject: Long, dosname: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlWalkFrameChain(callers: Long, count: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlWeaklyEnumerateEntryHashTable(hashtable: Long, enumerator: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlWriteRegistryValue(relativeto: Int, path: Long, valuename: Long, valuetype: Int, valuedata: Long, valuelength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlxAnsiStringToUnicodeSize(ansistring: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_RtlxUnicodeStringToAnsiSize(unicodestring: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_SeAccessCheck(securitydescriptor: Long, subjectsecuritycontext: Long, subjectcontextlocked: Boolean, desiredaccess: Int, previouslygrantedaccess: Int, privileges: Long, genericmapping: Long, accessmode: Byte, grantedaccess: Long, accessstatus: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_SeAssignSecurity(parentdescriptor: Long, explicitdescriptor: Long, newdescriptor: Long, isdirectoryobject: Boolean, subjectcontext: Long, genericmapping: Long, pooltype: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_SeAssignSecurityEx(parentdescriptor: Long, explicitdescriptor: Long, newdescriptor: Long, objecttype: Long, isdirectoryobject: Boolean, autoinheritflags: Int, subjectcontext: Long, genericmapping: Long, pooltype: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_SeCaptureSubjectContext(subjectcontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_SeComputeAutoInheritByObjectType(objecttype: Long, securitydescriptor: Long, parentsecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_SeDeassignSecurity(securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_SeEtwWriteKMCveEvent(cveid: Long, additionaldetails: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_SeLockSubjectContext(subjectcontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_SeRegisterImageVerificationCallback(imagetype: Int, callbacktype: Int, callbackfunction: Long, callbackcontext: Long, token: Long, callbackhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_SeReleaseSubjectContext(subjectcontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_SeReportSecurityEvent(flags: Int, sourcename: Long, usersid: Long, auditparameters: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_SeSetAuditParameter(auditparameters: Long, type: Int, index: Int, data: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_SeUnlockSubjectContext(subjectcontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_SeUnregisterImageVerificationCallback(callbackhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_SeValidSecurityDescriptor(length: Int, securitydescriptor: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_TmCommitComplete(enlistment: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_TmCommitEnlistment(enlistment: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_TmCommitTransaction(transaction: Long, wait: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_TmCreateEnlistment(enlistmenthandle: Long, previousmode: Byte, desiredaccess: Int, objectattributes: Long, resourcemanager: Long, transaction: Long, createoptions: Int, notificationmask: Int, enlistmentkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_TmDereferenceEnlistmentKey(enlistment: Long, lastreference: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_TmEnableCallbacks(resourcemanager: Long, callbackroutine: Long, rmkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_TmGetTransactionId(transaction: Long, transactionid: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_TmInitializeTransactionManager(transactionmanager: Long, logfilename: Long, tmid: Long, createoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_TmIsTransactionActive(transaction: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_TmPrePrepareComplete(enlistment: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_TmPrePrepareEnlistment(enlistment: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_TmPrepareComplete(enlistment: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_TmPrepareEnlistment(enlistment: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_TmPropagationComplete(resourcemanager: Long, requestcookie: Int, bufferlength: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_TmPropagationFailed(resourcemanager: Long, requestcookie: Int, status: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_TmReadOnlyEnlistment(enlistment: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_TmRecoverEnlistment(enlistment: Long, enlistmentkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_TmRecoverResourceManager(resourcemanager: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_TmRecoverTransactionManager(tm: Long, targetvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_TmReferenceEnlistmentKey(enlistment: Long, key: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_TmRenameTransactionManager(logfilename: Long, existingtransactionmanagerguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_TmRequestOutcomeEnlistment(enlistment: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_TmRollbackComplete(enlistment: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_TmRollbackEnlistment(enlistment: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_TmRollbackTransaction(transaction: Long, wait: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_TmSinglePhaseReject(enlistment: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_VslCreateSecureSection(handle: Long, targetprocess: Long, mdl: Long, devicepageprotection: Int, attributes: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_VslDeleteSecureSection(globalhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_WheaAddErrorSource(errorsource: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_WheaAddErrorSourceDeviceDriver(context: Long, configuration: Long, numberpreallocatederrorreports: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_WheaAddErrorSourceDeviceDriverV1(context: Long, configuration: Long, numbufferstopreallocate: Int, maxdatalength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_WheaAddHwErrorReportSectionDeviceDriver(errorhandle: Long, sectiondatalength: Int, bufferset: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_WheaConfigureErrorSource(sourcetype: Int, configuration: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_WheaCreateHwErrorReportDeviceDriver(errorsourceid: Int, deviceobject: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_WheaErrorSourceGetState(errorsourceid: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_WheaGetNotifyAllOfflinesPolicy(): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_WheaHighIrqlLogSelEventHandlerRegister(handler: Long, context: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_WheaHighIrqlLogSelEventHandlerUnregister()

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_WheaHwErrorReportAbandonDeviceDriver(errorhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_WheaHwErrorReportSetSectionNameDeviceDriver(bufferset: Long, namelength: Int, name: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_WheaHwErrorReportSetSeverityDeviceDriver(errorhandle: Long, errorseverity: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_WheaHwErrorReportSubmitDeviceDriver(errorhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_WheaInitializeRecordHeader(header: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_WheaIsCriticalState(): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_WheaLogInternalEvent(entry: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_WheaRegisterInUsePageOfflineNotification(callback: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_WheaRemoveErrorSource(errorsourceid: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_WheaRemoveErrorSourceDeviceDriver(errorsourceid: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_WheaReportHwError(errorpacket: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_WheaReportHwErrorDeviceDriver(errorsourceid: Int, deviceobject: Long, errordata: Long, errordatalength: Int, sectiontypeguid: Long, errorseverity: Int, devicefriendlyname: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_WheaUnconfigureErrorSource(sourcetype: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_WheaUnregisterInUsePageOfflineNotification(callback: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_WmiQueryTraceInformation(traceinformationclass: Int, traceinformation: Long, traceinformationlength: Int, requiredlength: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwAllocateLocallyUniqueId(luid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwClose(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwCommitComplete(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwCommitEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwCommitTransaction(transactionhandle: Long, wait: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwCreateEnlistment(enlistmenthandle: Long, desiredaccess: Int, resourcemanagerhandle: Long, transactionhandle: Long, objectattributes: Long, createoptions: Int, notificationmask: Int, enlistmentkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwCreateFile(filehandle: Long, desiredaccess: Int, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: Int, shareaccess: Int, createdisposition: Int, createoptions: Int, eabuffer: Long, ealength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwCreateResourceManager(resourcemanagerhandle: Long, desiredaccess: Int, tmhandle: Long, resourcemanagerguid: Long, objectattributes: Long, createoptions: Int, description: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwCreateSection(sectionhandle: Long, desiredaccess: Int, objectattributes: Long, maximumsize: Long, sectionpageprotection: Int, allocationattributes: Int, filehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwCreateTransaction(transactionhandle: Long, desiredaccess: Int, objectattributes: Long, uow: Long, tmhandle: Long, createoptions: Int, isolationlevel: Int, isolationflags: Int, timeout: Long, description: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwCreateTransactionManager(tmhandle: Long, desiredaccess: Int, objectattributes: Long, logfilename: Long, createoptions: Int, commitstrength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwDisplayString(string: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwEnumerateTransactionObject(rootobjecthandle: Long, querytype: Int, objectcursor: Long, objectcursorlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwGetNotificationResourceManager(resourcemanagerhandle: Long, transactionnotification: Long, notificationlength: Int, timeout: Long, returnlength: Long, asynchronous: Int, asynchronouscontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwLoadDriver(driverservicename: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwMakeTemporaryObject(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwManagePartition(targethandle: Long, sourcehandle: Long, partitioninformationclass: Int, partitioninformation: Long, partitioninformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwOpenEnlistment(enlistmenthandle: Long, desiredaccess: Int, rmhandle: Long, enlistmentguid: Long, objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwOpenFile(filehandle: Long, desiredaccess: Int, objectattributes: Long, iostatusblock: Long, shareaccess: Int, openoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwOpenResourceManager(resourcemanagerhandle: Long, desiredaccess: Int, tmhandle: Long, resourcemanagerguid: Long, objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwOpenSymbolicLinkObject(linkhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwOpenTransaction(transactionhandle: Long, desiredaccess: Int, objectattributes: Long, uow: Long, tmhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwOpenTransactionManager(tmhandle: Long, desiredaccess: Int, objectattributes: Long, logfilename: Long, tmidentity: Long, openoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwPowerInformation(informationlevel: Int, inputbuffer: Long, inputbufferlength: Int, outputbuffer: Long, outputbufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwPrePrepareComplete(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwPrePrepareEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwPrepareComplete(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwPrepareEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwPropagationComplete(resourcemanagerhandle: Long, requestcookie: Int, bufferlength: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwPropagationFailed(resourcemanagerhandle: Long, requestcookie: Int, propstatus: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwQueryInformationByName(objectattributes: Long, iostatusblock: Long, fileinformation: Long, length: Int, fileinformationclass: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwQueryInformationEnlistment(enlistmenthandle: Long, enlistmentinformationclass: Int, enlistmentinformation: Long, enlistmentinformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwQueryInformationFile(filehandle: Long, iostatusblock: Long, fileinformation: Long, length: Int, fileinformationclass: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwQueryInformationResourceManager(resourcemanagerhandle: Long, resourcemanagerinformationclass: Int, resourcemanagerinformation: Long, resourcemanagerinformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwQueryInformationTransaction(transactionhandle: Long, transactioninformationclass: Int, transactioninformation: Long, transactioninformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwQueryInformationTransactionManager(transactionmanagerhandle: Long, transactionmanagerinformationclass: Int, transactionmanagerinformation: Long, transactionmanagerinformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwQuerySymbolicLinkObject(linkhandle: Long, linktarget: Long, returnedlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwReadOnlyEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwRecoverEnlistment(enlistmenthandle: Long, enlistmentkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwRecoverResourceManager(resourcemanagerhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwRecoverTransactionManager(transactionmanagerhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwRegisterProtocolAddressInformation(resourcemanager: Long, protocolid: Long, protocolinformationsize: Int, protocolinformation: Long, createoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwRenameTransactionManager(logfilename: Long, existingtransactionmanagerguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwRollbackComplete(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwRollbackEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwRollbackTransaction(transactionhandle: Long, wait: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwRollforwardTransactionManager(transactionmanagerhandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwSetInformationEnlistment(enlistmenthandle: Long, enlistmentinformationclass: Int, enlistmentinformation: Long, enlistmentinformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwSetInformationFile(filehandle: Long, iostatusblock: Long, fileinformation: Long, length: Int, fileinformationclass: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwSetInformationResourceManager(resourcemanagerhandle: Long, resourcemanagerinformationclass: Int, resourcemanagerinformation: Long, resourcemanagerinformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwSetInformationTransaction(transactionhandle: Long, transactioninformationclass: Int, transactioninformation: Long, transactioninformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwSetInformationTransactionManager(tmhandle: Long, transactionmanagerinformationclass: Int, transactionmanagerinformation: Long, transactionmanagerinformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwSinglePhaseReject(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ZwUnloadDriver(driverservicename: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_vDbgPrintEx(componentid: Int, level: Int, format: Long, arglist: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_vDbgPrintExWithPrefix(prefix: Long, componentid: Int, level: Int, format: Long, arglist: Long): Int
}

public actual fun ClfsAddLogContainer(plfolog: Long, pcbcontainer: Long, puszcontainerpath: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsAddLogContainer(plfolog, pcbcontainer, puszcontainerpath)

public actual fun ClfsAddLogContainerSet(plfolog: Long, ccontainers: UShort, pcbcontainer: Long, rguszcontainerpath: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsAddLogContainerSet(plfolog, ccontainers.toShort(), pcbcontainer, rguszcontainerpath)

public actual fun ClfsAdvanceLogBase(pvmarshalcontext: Long, plsnbase: Long, fflags: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsAdvanceLogBase(pvmarshalcontext, plsnbase, fflags.toInt())

public actual fun ClfsAlignReservedLog(pvmarshalcontext: Long, crecords: UInt, rgcbreservation: Long, pcbalignreservation: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsAlignReservedLog(pvmarshalcontext, crecords.toInt(), rgcbreservation, pcbalignreservation)

public actual fun ClfsAllocReservedLog(pvmarshalcontext: Long, crecords: UInt, pcbadjustment: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsAllocReservedLog(pvmarshalcontext, crecords.toInt(), pcbadjustment)

public actual fun ClfsCloseAndResetLogFile(plfolog: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsCloseAndResetLogFile(plfolog)

public actual fun ClfsCloseLogFileObject(plfolog: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsCloseLogFileObject(plfolog)

public actual fun ClfsCreateLogFile(pplfolog: Long, puszlogfilename: Long, fdesiredaccess: UInt, dwsharemode: UInt, psdlogfile: PSECURITY_DESCRIPTOR, fcreatedisposition: UInt, fcreateoptions: UInt, fflagsandattributes: UInt, flogoptionflag: UInt, pvcontext: Long, cbcontext: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsCreateLogFile(pplfolog, puszlogfilename, fdesiredaccess.toInt(), dwsharemode.toInt(), psdlogfile, fcreatedisposition.toInt(), fcreateoptions.toInt(), fflagsandattributes.toInt(), flogoptionflag.toInt(), pvcontext, cbcontext.toInt())

public actual fun ClfsCreateMarshallingArea(plfolog: Long, epooltype: POOL_TYPE, pfnallocbuffer: PALLOCATE_FUNCTION, pfnfreebuffer: PFREE_FUNCTION, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, ppvmarshalcontext: Long): NTSTATUS =
    0

public actual fun ClfsCreateMarshallingAreaEx(plfolog: Long, epooltype: POOL_TYPE, pfnallocbuffer: PALLOCATE_FUNCTION, pfnfreebuffer: PFREE_FUNCTION, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, calignmentsize: UInt, fflags: ULong, ppvmarshalcontext: Long): NTSTATUS =
    0

public actual fun ClfsCreateScanContext(plfolog: Long, cfromcontainer: UInt, ccontainers: UInt, escanmode: UByte, pcxscan: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsCreateScanContext(plfolog, cfromcontainer.toInt(), ccontainers.toInt(), escanmode.toByte(), pcxscan)

public actual fun ClfsDeleteLogByPointer(plfolog: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsDeleteLogByPointer(plfolog)

public actual fun ClfsDeleteLogFile(puszlogfilename: Long, pvreserved: Long, flogoptionflag: UInt, pvcontext: Long, cbcontext: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsDeleteLogFile(puszlogfilename, pvreserved, flogoptionflag.toInt(), pvcontext, cbcontext.toInt())

public actual fun ClfsDeleteMarshallingArea(pvmarshalcontext: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsDeleteMarshallingArea(pvmarshalcontext)

public actual fun ClfsEarlierLsn(plsn: Long): CLS_LSN =
    CLS_LSN()

public actual fun ClfsFinalize() {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsFinalize()
}

public actual fun ClfsFlushBuffers(pvmarshalcontext: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsFlushBuffers(pvmarshalcontext)

public actual fun ClfsFlushToLsn(pvmarshalcontext: Long, plsnflush: Long, plsnlastflushed: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsFlushToLsn(pvmarshalcontext, plsnflush, plsnlastflushed)

public actual fun ClfsFreeReservedLog(pvmarshalcontext: Long, crecords: UInt, pcbadjustment: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsFreeReservedLog(pvmarshalcontext, crecords.toInt(), pcbadjustment)

public actual fun ClfsGetContainerName(plfolog: Long, cidlogicalcontainer: UInt, puszcontainername: Long, pcactuallencontainername: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsGetContainerName(plfolog, cidlogicalcontainer.toInt(), puszcontainername, pcactuallencontainername)

public actual fun ClfsGetIoStatistics(plfolog: Long, pvstatsbuffer: Long, cbstatsbuffer: UInt, estatsclass: CLFS_IOSTATS_CLASS, pcbstatswritten: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsGetIoStatistics(plfolog, pvstatsbuffer, cbstatsbuffer.toInt(), estatsclass, pcbstatswritten)

public actual fun ClfsGetLogFileInformation(plfolog: Long, pinfobuffer: Long, pcbinfobuffer: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsGetLogFileInformation(plfolog, pinfobuffer, pcbinfobuffer)

public actual fun ClfsInitialize(): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsInitialize()

public actual fun ClfsLaterLsn(plsn: Long): CLS_LSN =
    CLS_LSN()

public actual fun ClfsLsnBlockOffset(plsn: Long): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsLsnBlockOffset(plsn).toUInt()

public actual fun ClfsLsnContainer(plsn: Long): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsLsnContainer(plsn).toUInt()

public actual fun ClfsLsnCreate(cidcontainer: UInt, offblock: UInt, crecord: UInt): CLS_LSN =
    CLS_LSN()

public actual fun ClfsLsnDifference(plsnstart: Long, plsnfinish: Long, cbcontainer: UInt, cbmaxblock: UInt, pcbdifference: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsLsnDifference(plsnstart, plsnfinish, cbcontainer.toInt(), cbmaxblock.toInt(), pcbdifference)

public actual fun ClfsLsnEqual(plsn1: Long, plsn2: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsLsnEqual(plsn1, plsn2)

public actual fun ClfsLsnGreater(plsn1: Long, plsn2: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsLsnGreater(plsn1, plsn2)

public actual fun ClfsLsnInvalid(plsn: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsLsnInvalid(plsn)

public actual fun ClfsLsnLess(plsn1: Long, plsn2: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsLsnLess(plsn1, plsn2)

public actual fun ClfsLsnNull(plsn: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsLsnNull(plsn)

public actual fun ClfsLsnRecordSequence(plsn: Long): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsLsnRecordSequence(plsn).toUInt()

public actual fun ClfsMgmtDeregisterManagedClient(clientcookie: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsMgmtDeregisterManagedClient(clientcookie)

public actual fun ClfsMgmtHandleLogFileFull(client: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsMgmtHandleLogFileFull(client)

public actual fun ClfsMgmtInstallPolicy(logfile: Long, policy: Long, policylength: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsMgmtInstallPolicy(logfile, policy, policylength.toInt())

public actual fun ClfsMgmtQueryPolicy(logfile: Long, policytype: CLFS_MGMT_POLICY_TYPE, policy: Long, policylength: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsMgmtQueryPolicy(logfile, policytype, policy, policylength)

public actual fun ClfsMgmtRegisterManagedClient(logfile: Long, registrationdata: Long, clientcookie: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsMgmtRegisterManagedClient(logfile, registrationdata, clientcookie)

public actual fun ClfsMgmtRemovePolicy(logfile: Long, policytype: CLFS_MGMT_POLICY_TYPE): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsMgmtRemovePolicy(logfile, policytype)

public actual fun ClfsMgmtSetLogFileSize(logfile: Long, newsizeincontainers: Long, resultingsizeincontainers: Long, completionroutine: PCLFS_SET_LOG_SIZE_COMPLETE_CALLBACK, completionroutinedata: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsMgmtSetLogFileSize(logfile, newsizeincontainers, resultingsizeincontainers, completionroutine.toLong(), completionroutinedata)

public actual fun ClfsMgmtSetLogFileSizeAsClient(logfile: Long, clientcookie: Long, newsizeincontainers: Long, resultingsizeincontainers: Long, completionroutine: PCLFS_SET_LOG_SIZE_COMPLETE_CALLBACK, completionroutinedata: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsMgmtSetLogFileSizeAsClient(logfile, clientcookie, newsizeincontainers, resultingsizeincontainers, completionroutine.toLong(), completionroutinedata)

public actual fun ClfsMgmtTailAdvanceFailure(client: Long, reason: NTSTATUS): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsMgmtTailAdvanceFailure(client, reason)

public actual fun ClfsQueryLogFileInformation(plfolog: Long, einformationclass: CLS_LOG_INFORMATION_CLASS, pinfoinputbuffer: Long, cbinfoinputbuffer: UInt, pinfobuffer: Long, pcbinfobuffer: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsQueryLogFileInformation(plfolog, einformationclass, pinfoinputbuffer, cbinfoinputbuffer.toInt(), pinfobuffer, pcbinfobuffer)

public actual fun ClfsReadLogRecord(pvmarshalcontext: Long, plsnfirst: Long, pecontextmode: CLFS_CONTEXT_MODE, ppvreadbuffer: Long, pcbreadbuffer: Long, perecordtype: Long, plsnundonext: Long, plsnprevious: Long, ppvreadcontext: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsReadLogRecord(pvmarshalcontext, plsnfirst, pecontextmode, ppvreadbuffer, pcbreadbuffer, perecordtype, plsnundonext, plsnprevious, ppvreadcontext)

public actual fun ClfsReadNextLogRecord(pvreadcontext: Long, ppvbuffer: Long, pcbbuffer: Long, perecordtype: Long, plsnuser: Long, plsnundonext: Long, plsnprevious: Long, plsnrecord: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsReadNextLogRecord(pvreadcontext, ppvbuffer, pcbbuffer, perecordtype, plsnuser, plsnundonext, plsnprevious, plsnrecord)

public actual fun ClfsReadPreviousRestartArea(pvreadcontext: Long, ppvrestartbuffer: Long, pcbrestartbuffer: Long, plsnrestart: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsReadPreviousRestartArea(pvreadcontext, ppvrestartbuffer, pcbrestartbuffer, plsnrestart)

public actual fun ClfsReadRestartArea(pvmarshalcontext: Long, ppvrestartbuffer: Long, pcbrestartbuffer: Long, plsn: Long, ppvreadcontext: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsReadRestartArea(pvmarshalcontext, ppvrestartbuffer, pcbrestartbuffer, plsn, ppvreadcontext)

public actual fun ClfsRemoveLogContainer(plfolog: Long, puszcontainerpath: Long, fforce: Boolean): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsRemoveLogContainer(plfolog, puszcontainerpath, fforce)

public actual fun ClfsRemoveLogContainerSet(plfolog: Long, ccontainers: UShort, rgwszcontainerpath: Long, fforce: Boolean): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsRemoveLogContainerSet(plfolog, ccontainers.toShort(), rgwszcontainerpath, fforce)

public actual fun ClfsReserveAndAppendLog(pvmarshalcontext: Long, rgwriteentries: Long, cwriteentries: UInt, plsnundonext: Long, plsnprevious: Long, creserverecords: UInt, rgcbreservation: Long, fflags: UInt, plsn: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsReserveAndAppendLog(pvmarshalcontext, rgwriteentries, cwriteentries.toInt(), plsnundonext, plsnprevious, creserverecords.toInt(), rgcbreservation, fflags.toInt(), plsn)

public actual fun ClfsReserveAndAppendLogAligned(pvmarshalcontext: Long, rgwriteentries: Long, cwriteentries: UInt, cbentryalignment: UInt, plsnundonext: Long, plsnprevious: Long, creserverecords: UInt, rgcbreservation: Long, fflags: UInt, plsn: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsReserveAndAppendLogAligned(pvmarshalcontext, rgwriteentries, cwriteentries.toInt(), cbentryalignment.toInt(), plsnundonext, plsnprevious, creserverecords.toInt(), rgcbreservation, fflags.toInt(), plsn)

public actual fun ClfsScanLogContainers(pcxscan: Long, escanmode: UByte): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsScanLogContainers(pcxscan, escanmode.toByte())

public actual fun ClfsSetArchiveTail(plfolog: Long, plsnarchivetail: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsSetArchiveTail(plfolog, plsnarchivetail)

public actual fun ClfsSetEndOfLog(plfolog: Long, plsnend: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsSetEndOfLog(plfolog, plsnend)

public actual fun ClfsSetLogFileInformation(plfolog: Long, einformationclass: CLS_LOG_INFORMATION_CLASS, pinfobuffer: Long, cbbuffer: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsSetLogFileInformation(plfolog, einformationclass, pinfobuffer, cbbuffer.toInt())

public actual fun ClfsTerminateReadLog(pvcursorcontext: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsTerminateReadLog(pvcursorcontext)

public actual fun ClfsWriteRestartArea(pvmarshalcontext: Long, pvrestartbuffer: Long, cbrestartbuffer: UInt, plsnbase: Long, fflags: UInt, pcbwritten: Long, plsnnext: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ClfsWriteRestartArea(pvmarshalcontext, pvrestartbuffer, cbrestartbuffer.toInt(), plsnbase, fflags.toInt(), pcbwritten, plsnnext)

public actual fun CmCallbackGetKeyObjectID(cookie: Long, obj: Long, objectid: Long, objectname: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_CmCallbackGetKeyObjectID(cookie, obj, objectid, objectname)

public actual fun CmCallbackGetKeyObjectIDEx(cookie: Long, obj: Long, objectid: Long, objectname: Long, flags: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_CmCallbackGetKeyObjectIDEx(cookie, obj, objectid, objectname, flags.toInt())

public actual fun CmCallbackReleaseKeyObjectIDEx(objectname: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_CmCallbackReleaseKeyObjectIDEx(objectname)
}

public actual fun CmGetBoundTransaction(cookie: Long, obj: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_CmGetBoundTransaction(cookie, obj)

public actual fun CmGetCallbackVersion(major: Long, minor: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_CmGetCallbackVersion(major, minor)
}

public actual fun CmRegisterCallback(function: PEX_CALLBACK_FUNCTION, context: Long, cookie: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_CmRegisterCallback(function.toLong(), context, cookie)

public actual fun CmRegisterCallbackEx(function: PEX_CALLBACK_FUNCTION, altitude: Long, driver: Long, context: Long, cookie: Long, reserved: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_CmRegisterCallbackEx(function.toLong(), altitude, driver, context, cookie, reserved)

public actual fun CmSetCallbackObjectContext(obj: Long, cookie: Long, newcontext: Long, oldcontext: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_CmSetCallbackObjectContext(obj, cookie, newcontext, oldcontext)

public actual fun CmUnRegisterCallback(cookie: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_CmUnRegisterCallback(cookie)

public actual fun DbgBreakPointWithStatus(status: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_DbgBreakPointWithStatus(status.toInt())
}

public actual fun DbgPrint(format: PCSTR): UInt =
    0u

public actual fun DbgPrintEx(componentid: UInt, level: UInt, format: PCSTR): UInt =
    0u

public actual fun DbgPrintReturnControlC(format: PCSTR): UInt =
    0u

public actual fun DbgPrompt(prompt: PCSTR, response: PSTR, length: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_DbgPrompt(prompt, response, length.toInt()).toUInt()

public actual fun DbgQueryDebugFilterState(componentid: UInt, level: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_DbgQueryDebugFilterState(componentid.toInt(), level.toInt())

public actual fun DbgSetDebugFilterState(componentid: UInt, level: UInt, state: Boolean): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_DbgSetDebugFilterState(componentid.toInt(), level.toInt(), state)

public actual fun DbgSetDebugPrintCallback(debugprintcallback: PDEBUG_PRINT_CALLBACK, enable: Boolean): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_DbgSetDebugPrintCallback(debugprintcallback.toLong(), enable)

public actual fun EtwActivityIdControl(controlcode: UInt, activityid: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_EtwActivityIdControl(controlcode.toInt(), activityid)

public actual fun EtwEventEnabled(reghandle: REGHANDLE, eventdescriptor: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_EtwEventEnabled(reghandle, eventdescriptor)

public actual fun EtwProviderEnabled(reghandle: REGHANDLE, level: UByte, keyword: ULong): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_EtwProviderEnabled(reghandle, level.toByte(), keyword.toLong())

public actual fun EtwRegister(providerid: Long, enablecallback: PETWENABLECALLBACK, callbackcontext: Long, reghandle: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_EtwRegister(providerid, enablecallback.toLong(), callbackcontext, reghandle)

public actual fun EtwSetInformation(reghandle: REGHANDLE, informationclass: EVENT_INFO_CLASS, eventinformation: Long, informationlength: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_EtwSetInformation(reghandle, informationclass, eventinformation, informationlength.toInt())

public actual fun EtwUnregister(reghandle: REGHANDLE): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_EtwUnregister(reghandle)

public actual fun EtwWrite(reghandle: REGHANDLE, eventdescriptor: Long, activityid: Long, userdatacount: UInt, userdata: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_EtwWrite(reghandle, eventdescriptor, activityid, userdatacount.toInt(), userdata)

public actual fun EtwWriteEx(reghandle: REGHANDLE, eventdescriptor: Long, filter: ULong, flags: UInt, activityid: Long, relatedactivityid: Long, userdatacount: UInt, userdata: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_EtwWriteEx(reghandle, eventdescriptor, filter.toLong(), flags.toInt(), activityid, relatedactivityid, userdatacount.toInt(), userdata)

public actual fun EtwWriteString(reghandle: REGHANDLE, level: UByte, keyword: ULong, activityid: Long, string: PCWSTR): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_EtwWriteString(reghandle, level.toByte(), keyword.toLong(), activityid, string)

public actual fun EtwWriteTransfer(reghandle: REGHANDLE, eventdescriptor: Long, activityid: Long, relatedactivityid: Long, userdatacount: UInt, userdata: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_EtwWriteTransfer(reghandle, eventdescriptor, activityid, relatedactivityid, userdatacount.toInt(), userdata)

public actual fun ExAcquireFastMutex(fastmutex: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExAcquireFastMutex(fastmutex)
}

public actual fun ExAcquireFastMutexUnsafe(fastmutex: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExAcquireFastMutexUnsafe(fastmutex)
}

public actual fun ExAcquirePushLockExclusiveEx(pushlock: Long, flags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExAcquirePushLockExclusiveEx(pushlock, flags.toInt())
}

public actual fun ExAcquirePushLockSharedEx(pushlock: Long, flags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExAcquirePushLockSharedEx(pushlock, flags.toInt())
}

public actual fun ExAcquireResourceExclusiveLite(resource: Long, wait: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExAcquireResourceExclusiveLite(resource, wait)

public actual fun ExAcquireResourceSharedLite(resource: Long, wait: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExAcquireResourceSharedLite(resource, wait)

public actual fun ExAcquireRundownProtection(runref: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExAcquireRundownProtection(runref)

public actual fun ExAcquireRundownProtectionCacheAware(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExAcquireRundownProtectionCacheAware(runrefcacheaware)

public actual fun ExAcquireRundownProtectionCacheAwareEx(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE, count: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExAcquireRundownProtectionCacheAwareEx(runrefcacheaware, count.toInt())

public actual fun ExAcquireRundownProtectionEx(runref: Long, count: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExAcquireRundownProtectionEx(runref, count.toInt())

public actual fun ExAcquireSharedStarveExclusive(resource: Long, wait: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExAcquireSharedStarveExclusive(resource, wait)

public actual fun ExAcquireSharedWaitForExclusive(resource: Long, wait: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExAcquireSharedWaitForExclusive(resource, wait)

public actual fun ExAcquireSpinLockExclusive(spinlock: Long): UByte =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExAcquireSpinLockExclusive(spinlock).toUByte()

public actual fun ExAcquireSpinLockExclusiveAtDpcLevel(spinlock: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExAcquireSpinLockExclusiveAtDpcLevel(spinlock)
}

public actual fun ExAcquireSpinLockShared(spinlock: Long): UByte =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExAcquireSpinLockShared(spinlock).toUByte()

public actual fun ExAcquireSpinLockSharedAtDpcLevel(spinlock: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExAcquireSpinLockSharedAtDpcLevel(spinlock)
}

public actual fun ExAllocateCacheAwareRundownProtection(pooltype: POOL_TYPE, pooltag: UInt): PEX_RUNDOWN_REF_CACHE_AWARE =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExAllocateCacheAwareRundownProtection(pooltype, pooltag.toInt())

public actual fun ExAllocatePool(pooltype: POOL_TYPE, numberofbytes: ULong): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExAllocatePool(pooltype, numberofbytes.toLong())

public actual fun ExAllocatePool2(flags: ULong, numberofbytes: ULong, tag: UInt): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExAllocatePool2(flags.toLong(), numberofbytes.toLong(), tag.toInt())

public actual fun ExAllocatePool3(flags: ULong, numberofbytes: ULong, tag: UInt, extendedparameters: Long, extendedparameterscount: UInt): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExAllocatePool3(flags.toLong(), numberofbytes.toLong(), tag.toInt(), extendedparameters, extendedparameterscount.toInt())

public actual fun ExAllocatePoolWithQuota(pooltype: POOL_TYPE, numberofbytes: ULong): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExAllocatePoolWithQuota(pooltype, numberofbytes.toLong())

public actual fun ExAllocatePoolWithQuotaTag(pooltype: POOL_TYPE, numberofbytes: ULong, tag: UInt): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExAllocatePoolWithQuotaTag(pooltype, numberofbytes.toLong(), tag.toInt())

public actual fun ExAllocatePoolWithTag(pooltype: POOL_TYPE, numberofbytes: ULong, tag: UInt): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExAllocatePoolWithTag(pooltype, numberofbytes.toLong(), tag.toInt())

public actual fun ExAllocatePoolWithTagPriority(pooltype: POOL_TYPE, numberofbytes: ULong, tag: UInt, priority: EX_POOL_PRIORITY): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExAllocatePoolWithTagPriority(pooltype, numberofbytes.toLong(), tag.toInt(), priority)

public actual fun ExAllocateTimer(callback: PEXT_CALLBACK, callbackcontext: Long, attributes: UInt): PEX_TIMER =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExAllocateTimer(callback.toLong(), callbackcontext, attributes.toInt())

public actual fun ExCancelTimer(timer: PEX_TIMER, parameters: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExCancelTimer(timer, parameters)

public actual fun ExCleanupRundownProtectionCacheAware(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExCleanupRundownProtectionCacheAware(runrefcacheaware)
}

public actual fun ExConvertExclusiveToSharedLite(resource: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExConvertExclusiveToSharedLite(resource)
}

public actual fun ExCreateCallback(callbackobject: Long, objectattributes: Long, create: Boolean, allowmultiplecallbacks: Boolean): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExCreateCallback(callbackobject, objectattributes, create, allowmultiplecallbacks)

public actual fun ExCreatePool(flags: UInt, tag: ULong, params: Long, poolhandle: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExCreatePool(flags.toInt(), tag.toLong(), params, poolhandle)

public actual fun ExDeleteResourceLite(resource: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExDeleteResourceLite(resource)

public actual fun ExDeleteTimer(timer: PEX_TIMER, cancel: Boolean, wait: Boolean, parameters: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExDeleteTimer(timer, cancel, wait, parameters)

public actual fun ExDestroyPool(poolhandle: HANDLE) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExDestroyPool(poolhandle)
}

public actual fun ExEnterCriticalRegionAndAcquireResourceExclusive(resource: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExEnterCriticalRegionAndAcquireResourceExclusive(resource)

public actual fun ExEnterCriticalRegionAndAcquireResourceShared(resource: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExEnterCriticalRegionAndAcquireResourceShared(resource)

public actual fun ExEnterCriticalRegionAndAcquireSharedWaitForExclusive(resource: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExEnterCriticalRegionAndAcquireSharedWaitForExclusive(resource)

public actual fun ExEnumerateSystemFirmwareTables(firmwaretableprovidersignature: UInt, firmwaretablebuffer: Long, bufferlength: UInt, returnlength: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExEnumerateSystemFirmwareTables(firmwaretableprovidersignature.toInt(), firmwaretablebuffer, bufferlength.toInt(), returnlength)

public actual fun ExExtendZone(zone: Long, segment: Long, segmentsize: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExExtendZone(zone, segment, segmentsize.toInt())

public actual fun ExFreeCacheAwareRundownProtection(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExFreeCacheAwareRundownProtection(runrefcacheaware)
}

public actual fun ExFreePool(p: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExFreePool(p)
}

public actual fun ExFreePool2(p: Long, tag: UInt, extendedparameters: Long, extendedparameterscount: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExFreePool2(p, tag.toInt(), extendedparameters, extendedparameterscount.toInt())
}

public actual fun ExFreePoolWithTag(p: Long, tag: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExFreePoolWithTag(p, tag.toInt())
}

public actual fun ExGetExclusiveWaiterCount(resource: Long): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExGetExclusiveWaiterCount(resource).toUInt()

public actual fun ExGetFirmwareEnvironmentVariable(variablename: Long, vendorguid: Long, value: Long, valuelength: Long, attributes: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExGetFirmwareEnvironmentVariable(variablename, vendorguid, value, valuelength, attributes)

public actual fun ExGetFirmwareType(): FIRMWARE_TYPE =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExGetFirmwareType()

public actual fun ExGetPreviousMode(): Byte =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExGetPreviousMode()

public actual fun ExGetSharedWaiterCount(resource: Long): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExGetSharedWaiterCount(resource).toUInt()

public actual fun ExGetSystemFirmwareTable(firmwaretableprovidersignature: UInt, firmwaretableid: UInt, firmwaretablebuffer: Long, bufferlength: UInt, returnlength: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExGetSystemFirmwareTable(firmwaretableprovidersignature.toInt(), firmwaretableid.toInt(), firmwaretablebuffer, bufferlength.toInt(), returnlength)

public actual fun ExInitializePushLock(pushlock: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExInitializePushLock(pushlock)
}

public actual fun ExInitializeResourceLite(resource: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExInitializeResourceLite(resource)

public actual fun ExInitializeRundownProtection(runref: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExInitializeRundownProtection(runref)
}

public actual fun ExInitializeRundownProtectionCacheAware(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE, runrefsize: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExInitializeRundownProtectionCacheAware(runrefcacheaware, runrefsize.toLong())
}

public actual fun ExInitializeRundownProtectionCacheAwareEx(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE, flags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExInitializeRundownProtectionCacheAwareEx(runrefcacheaware, flags.toInt())
}

public actual fun ExInitializeZone(zone: Long, blocksize: UInt, initialsegment: Long, initialsegmentsize: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExInitializeZone(zone, blocksize.toInt(), initialsegment, initialsegmentsize.toInt())

public actual fun ExInterlockedAddLargeInteger(addend: Long, increment: Long, lock: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExInterlockedAddLargeInteger(addend, increment, lock)

public actual fun ExInterlockedExtendZone(zone: Long, segment: Long, segmentsize: UInt, lock: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExInterlockedExtendZone(zone, segment, segmentsize.toInt(), lock)

public actual fun ExIsManufacturingModeEnabled(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExIsManufacturingModeEnabled()

public actual fun ExIsProcessorFeaturePresent(processorfeature: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExIsProcessorFeaturePresent(processorfeature.toInt())

public actual fun ExIsResourceAcquiredExclusiveLite(resource: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExIsResourceAcquiredExclusiveLite(resource)

public actual fun ExIsResourceAcquiredSharedLite(resource: Long): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExIsResourceAcquiredSharedLite(resource).toUInt()

public actual fun ExIsSoftBoot(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExIsSoftBoot()

public actual fun ExLocalTimeToSystemTime(localtime: Long, systemtime: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExLocalTimeToSystemTime(localtime, systemtime)
}

public actual fun ExNotifyCallback(callbackobject: Long, argument1: Long, argument2: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExNotifyCallback(callbackobject, argument1, argument2)
}

public actual fun ExQueryTimerResolution(maximumtime: Long, minimumtime: Long, currenttime: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExQueryTimerResolution(maximumtime, minimumtime, currenttime)
}

public actual fun ExQueueWorkItem(workitem: Long, queuetype: WORK_QUEUE_TYPE) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExQueueWorkItem(workitem, queuetype)
}

public actual fun ExRaiseAccessViolation() {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExRaiseAccessViolation()
}

public actual fun ExRaiseDatatypeMisalignment() {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExRaiseDatatypeMisalignment()
}

public actual fun ExRaiseStatus(status: NTSTATUS) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExRaiseStatus(status)
}

public actual fun ExReInitializeRundownProtection(runref: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExReInitializeRundownProtection(runref)
}

public actual fun ExReInitializeRundownProtectionCacheAware(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExReInitializeRundownProtectionCacheAware(runrefcacheaware)
}

public actual fun ExRegisterCallback(callbackobject: PCALLBACK_OBJECT, callbackfunction: PCALLBACK_FUNCTION, callbackcontext: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExRegisterCallback(callbackobject, callbackfunction.toLong(), callbackcontext)

public actual fun ExReinitializeResourceLite(resource: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExReinitializeResourceLite(resource)

public actual fun ExReleaseFastMutex(fastmutex: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExReleaseFastMutex(fastmutex)
}

public actual fun ExReleaseFastMutexUnsafe(fastmutex: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExReleaseFastMutexUnsafe(fastmutex)
}

public actual fun ExReleasePushLockExclusiveEx(pushlock: Long, flags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExReleasePushLockExclusiveEx(pushlock, flags.toInt())
}

public actual fun ExReleasePushLockSharedEx(pushlock: Long, flags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExReleasePushLockSharedEx(pushlock, flags.toInt())
}

public actual fun ExReleaseResourceAndLeaveCriticalRegion(resource: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExReleaseResourceAndLeaveCriticalRegion(resource)
}

public actual fun ExReleaseResourceForThreadLite(resource: Long, resourcethreadid: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExReleaseResourceForThreadLite(resource, resourcethreadid.toLong())
}

public actual fun ExReleaseResourceLite(resource: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExReleaseResourceLite(resource)
}

public actual fun ExReleaseRundownProtection(runref: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExReleaseRundownProtection(runref)
}

public actual fun ExReleaseRundownProtectionCacheAware(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExReleaseRundownProtectionCacheAware(runrefcacheaware)
}

public actual fun ExReleaseRundownProtectionCacheAwareEx(runref: PEX_RUNDOWN_REF_CACHE_AWARE, count: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExReleaseRundownProtectionCacheAwareEx(runref, count.toInt())
}

public actual fun ExReleaseRundownProtectionEx(runref: Long, count: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExReleaseRundownProtectionEx(runref, count.toInt())
}

public actual fun ExReleaseSpinLockExclusive(spinlock: Long, oldirql: UByte) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExReleaseSpinLockExclusive(spinlock, oldirql.toByte())
}

public actual fun ExReleaseSpinLockExclusiveFromDpcLevel(spinlock: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExReleaseSpinLockExclusiveFromDpcLevel(spinlock)
}

public actual fun ExReleaseSpinLockShared(spinlock: Long, oldirql: UByte) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExReleaseSpinLockShared(spinlock, oldirql.toByte())
}

public actual fun ExReleaseSpinLockSharedFromDpcLevel(spinlock: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExReleaseSpinLockSharedFromDpcLevel(spinlock)
}

public actual fun ExRundownCompleted(runref: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExRundownCompleted(runref)
}

public actual fun ExRundownCompletedCacheAware(runrefcacheaware: PEX_RUNDOWN_REF_CACHE_AWARE) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExRundownCompletedCacheAware(runrefcacheaware)
}

public actual fun ExSecurePoolUpdate(securepoolhandle: HANDLE, tag: UInt, allocation: Long, cookie: ULong, offset: ULong, size: ULong, buffer: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExSecurePoolUpdate(securepoolhandle, tag.toInt(), allocation, cookie.toLong(), offset.toLong(), size.toLong(), buffer)

public actual fun ExSecurePoolValidate(securepoolhandle: HANDLE, tag: UInt, allocation: Long, cookie: ULong): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExSecurePoolValidate(securepoolhandle, tag.toInt(), allocation, cookie.toLong()).toUInt()

public actual fun ExSetFirmwareEnvironmentVariable(variablename: Long, vendorguid: Long, value: Long, valuelength: UInt, attributes: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExSetFirmwareEnvironmentVariable(variablename, vendorguid, value, valuelength.toInt(), attributes.toInt())

public actual fun ExSetResourceOwnerPointer(resource: Long, ownerpointer: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExSetResourceOwnerPointer(resource, ownerpointer)
}

public actual fun ExSetResourceOwnerPointerEx(resource: Long, ownerpointer: Long, flags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExSetResourceOwnerPointerEx(resource, ownerpointer, flags.toInt())
}

public actual fun ExSetTimer(timer: PEX_TIMER, duetime: Long, period: Long, parameters: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExSetTimer(timer, duetime, period, parameters)

public actual fun ExSetTimerResolution(desiredtime: UInt, setresolution: Boolean): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExSetTimerResolution(desiredtime.toInt(), setresolution).toUInt()

public actual fun ExSizeOfRundownProtectionCacheAware(): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExSizeOfRundownProtectionCacheAware().toULong()

public actual fun ExSystemTimeToLocalTime(systemtime: Long, localtime: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExSystemTimeToLocalTime(systemtime, localtime)
}

public actual fun ExTryAcquireSpinLockExclusiveAtDpcLevel(spinlock: Long): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExTryAcquireSpinLockExclusiveAtDpcLevel(spinlock).toUInt()

public actual fun ExTryAcquireSpinLockSharedAtDpcLevel(spinlock: Long): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExTryAcquireSpinLockSharedAtDpcLevel(spinlock).toUInt()

public actual fun ExTryConvertSharedSpinLockExclusive(spinlock: Long): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExTryConvertSharedSpinLockExclusive(spinlock).toUInt()

public actual fun ExTryToAcquireFastMutex(fastmutex: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExTryToAcquireFastMutex(fastmutex)

public actual fun ExUnregisterCallback(callbackregistration: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExUnregisterCallback(callbackregistration)
}

public actual fun ExUuidCreate(uuid: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExUuidCreate(uuid)

public actual fun ExVerifySuite(suitetype: SUITE_TYPE): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExVerifySuite(suitetype)

public actual fun ExWaitForRundownProtectionRelease(runref: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExWaitForRundownProtectionRelease(runref)
}

public actual fun ExWaitForRundownProtectionReleaseCacheAware(runref: PEX_RUNDOWN_REF_CACHE_AWARE) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ExWaitForRundownProtectionReleaseCacheAware(runref)
}

public actual fun FsRtlIsTotalDeviceFailure(status: NTSTATUS): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_FsRtlIsTotalDeviceFailure(status)

public actual fun HalAcquireDisplayOwnership(resetdisplayparameters: PHAL_RESET_DISPLAY_PARAMETERS) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_HalAcquireDisplayOwnership(resetdisplayparameters.toLong())
}

public actual fun HalAllocateAdapterChannel(adapterobject: Long, wcb: Long, numberofmapregisters: UInt, executionroutine: DRIVER_CONTROL): NTSTATUS =
    0

public actual fun HalAllocateCommonBuffer(adapterobject: Long, length: UInt, logicaladdress: Long, cacheenabled: Boolean): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_HalAllocateCommonBuffer(adapterobject, length.toInt(), logicaladdress, cacheenabled)

public actual fun HalAllocateCrashDumpRegisters(adapterobject: Long, numberofmapregisters: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_HalAllocateCrashDumpRegisters(adapterobject, numberofmapregisters)

public actual fun HalAllocateHardwareCounters(groupaffinty: Long, groupcount: UInt, resourcelist: Long, countersethandle: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_HalAllocateHardwareCounters(groupaffinty, groupcount.toInt(), resourcelist, countersethandle)

public actual fun HalAssignSlotResources(registrypath: Long, driverclassname: Long, driverobject: Long, deviceobject: Long, bustype: INTERFACE_TYPE, busnumber: UInt, slotnumber: UInt, allocatedresources: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_HalAssignSlotResources(registrypath, driverclassname, driverobject, deviceobject, bustype, busnumber.toInt(), slotnumber.toInt(), allocatedresources)

public actual fun HalBugCheckSystem(errorsource: Long, errorrecord: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_HalBugCheckSystem(errorsource, errorrecord)
}

public actual fun HalDmaAllocateCrashDumpRegistersEx(adapter: Long, numberofmapregisters: UInt, type: HAL_DMA_CRASH_DUMP_REGISTER_TYPE, mapregisterbase: Long, mapregistersavailable: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_HalDmaAllocateCrashDumpRegistersEx(adapter, numberofmapregisters.toInt(), type, mapregisterbase, mapregistersavailable)

public actual fun HalDmaFreeCrashDumpRegistersEx(adapter: Long, type: HAL_DMA_CRASH_DUMP_REGISTER_TYPE): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_HalDmaFreeCrashDumpRegistersEx(adapter, type)

public actual fun HalExamineMBR(deviceobject: Long, sectorsize: UInt, mbrtypeidentifier: UInt, buffer: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_HalExamineMBR(deviceobject, sectorsize.toInt(), mbrtypeidentifier.toInt(), buffer)
}

public actual fun HalFreeCommonBuffer(adapterobject: Long, length: UInt, logicaladdress: Long, virtualaddress: Long, cacheenabled: Boolean) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_HalFreeCommonBuffer(adapterobject, length.toInt(), logicaladdress, virtualaddress, cacheenabled)
}

public actual fun HalFreeHardwareCounters(countersethandle: HANDLE): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_HalFreeHardwareCounters(countersethandle)

public actual fun HalGetAdapter(devicedescription: Long, numberofmapregisters: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_HalGetAdapter(devicedescription, numberofmapregisters)

public actual fun HalGetBusData(busdatatype: BUS_DATA_TYPE, busnumber: UInt, slotnumber: UInt, buffer: Long, length: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_HalGetBusData(busdatatype, busnumber.toInt(), slotnumber.toInt(), buffer, length.toInt()).toUInt()

public actual fun HalGetBusDataByOffset(busdatatype: BUS_DATA_TYPE, busnumber: UInt, slotnumber: UInt, buffer: Long, offset: UInt, length: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_HalGetBusDataByOffset(busdatatype, busnumber.toInt(), slotnumber.toInt(), buffer, offset.toInt(), length.toInt()).toUInt()

public actual fun HalGetInterruptVector(interfacetype: INTERFACE_TYPE, busnumber: UInt, businterruptlevel: UInt, businterruptvector: UInt, irql: Long, affinity: Long): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_HalGetInterruptVector(interfacetype, busnumber.toInt(), businterruptlevel.toInt(), businterruptvector.toInt(), irql, affinity).toUInt()

public actual fun HalMakeBeep(frequency: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_HalMakeBeep(frequency.toInt())

public actual fun HalReadDmaCounter(adapterobject: Long): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_HalReadDmaCounter(adapterobject).toUInt()

public actual fun HalSetBusData(busdatatype: BUS_DATA_TYPE, busnumber: UInt, slotnumber: UInt, buffer: Long, length: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_HalSetBusData(busdatatype, busnumber.toInt(), slotnumber.toInt(), buffer, length.toInt()).toUInt()

public actual fun HalSetBusDataByOffset(busdatatype: BUS_DATA_TYPE, busnumber: UInt, slotnumber: UInt, buffer: Long, offset: UInt, length: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_HalSetBusDataByOffset(busdatatype, busnumber.toInt(), slotnumber.toInt(), buffer, offset.toInt(), length.toInt()).toUInt()

public actual fun HalTranslateBusAddress(interfacetype: INTERFACE_TYPE, busnumber: UInt, busaddress: Long, addressspace: Long, translatedaddress: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_HalTranslateBusAddress(interfacetype, busnumber.toInt(), busaddress, addressspace, translatedaddress)

public actual fun HvlRegisterWheaErrorNotification(callback: PHVL_WHEA_ERROR_NOTIFICATION): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_HvlRegisterWheaErrorNotification(callback.toLong())

public actual fun HvlUnregisterWheaErrorNotification(callback: PHVL_WHEA_ERROR_NOTIFICATION): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_HvlUnregisterWheaErrorNotification(callback.toLong())

public actual fun IoAcquireCancelSpinLock(irql: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoAcquireCancelSpinLock(irql)
}

public actual fun IoAcquireKsrPersistentMemory(driverobject: Long, physicaldeviceobject: Long, buffer: Long, size: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoAcquireKsrPersistentMemory(driverobject, physicaldeviceobject, buffer, size)

public actual fun IoAcquireKsrPersistentMemoryEx(driverobject: Long, physicaldeviceobject: Long, physicaldeviceid: Long, datatag: Long, dataversion: Long, buffer: Long, size: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoAcquireKsrPersistentMemoryEx(driverobject, physicaldeviceobject, physicaldeviceid, datatag, dataversion, buffer, size)

public actual fun IoAcquireRemoveLockEx(removelock: Long, tag: Long, file: PCSTR, line: UInt, remlocksize: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoAcquireRemoveLockEx(removelock, tag, file, line.toInt(), remlocksize.toInt())

public actual fun IoAllocateAdapterChannel(adapterobject: Long, deviceobject: Long, numberofmapregisters: UInt, executionroutine: DRIVER_CONTROL, context: Long): NTSTATUS =
    0

public actual fun IoAllocateController(controllerobject: Long, deviceobject: Long, executionroutine: DRIVER_CONTROL, context: Long) {
}

public actual fun IoAllocateDriverObjectExtension(driverobject: Long, clientidentificationaddress: Long, driverobjectextensionsize: UInt, driverobjectextension: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoAllocateDriverObjectExtension(driverobject, clientidentificationaddress, driverobjectextensionsize.toInt(), driverobjectextension)

public actual fun IoAllocateErrorLogEntry(ioobject: Long, entrysize: UByte): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoAllocateErrorLogEntry(ioobject, entrysize.toByte())

public actual fun IoAllocateIrp(stacksize: Byte, chargequota: Boolean): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoAllocateIrp(stacksize, chargequota)

public actual fun IoAllocateIrpEx(deviceobject: Long, stacksize: Byte, chargequota: Boolean): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoAllocateIrpEx(deviceobject, stacksize, chargequota)

public actual fun IoAllocateMdl(virtualaddress: Long, length: UInt, secondarybuffer: Boolean, chargequota: Boolean, irp: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoAllocateMdl(virtualaddress, length.toInt(), secondarybuffer, chargequota, irp)

public actual fun IoAllocateSfioStreamIdentifier(fileobject: Long, length: UInt, signature: Long, streamidentifier: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoAllocateSfioStreamIdentifier(fileobject, length.toInt(), signature, streamidentifier)

public actual fun IoAllocateWorkItem(deviceobject: Long): PIO_WORKITEM =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoAllocateWorkItem(deviceobject)

public actual fun IoAssignResources(registrypath: Long, driverclassname: Long, driverobject: Long, deviceobject: Long, requestedresources: Long, allocatedresources: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoAssignResources(registrypath, driverclassname, driverobject, deviceobject, requestedresources, allocatedresources)

public actual fun IoAttachDevice(sourcedevice: Long, targetdevice: Long, attacheddevice: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoAttachDevice(sourcedevice, targetdevice, attacheddevice)

public actual fun IoAttachDeviceByPointer(sourcedevice: Long, targetdevice: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoAttachDeviceByPointer(sourcedevice, targetdevice)

public actual fun IoAttachDeviceToDeviceStack(sourcedevice: Long, targetdevice: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoAttachDeviceToDeviceStack(sourcedevice, targetdevice)

public actual fun IoAttachDeviceToDeviceStackSafe(sourcedevice: Long, targetdevice: Long, attachedtodeviceobject: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoAttachDeviceToDeviceStackSafe(sourcedevice, targetdevice, attachedtodeviceobject)

public actual fun IoBuildAsynchronousFsdRequest(majorfunction: UInt, deviceobject: Long, buffer: Long, length: UInt, startingoffset: Long, iostatusblock: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoBuildAsynchronousFsdRequest(majorfunction.toInt(), deviceobject, buffer, length.toInt(), startingoffset, iostatusblock)

public actual fun IoBuildDeviceIoControlRequest(iocontrolcode: UInt, deviceobject: Long, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt, internaldeviceiocontrol: Boolean, event: Long, iostatusblock: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoBuildDeviceIoControlRequest(iocontrolcode.toInt(), deviceobject, inputbuffer, inputbufferlength.toInt(), outputbuffer, outputbufferlength.toInt(), internaldeviceiocontrol, event, iostatusblock)

public actual fun IoBuildPartialMdl(sourcemdl: Long, targetmdl: Long, virtualaddress: Long, length: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoBuildPartialMdl(sourcemdl, targetmdl, virtualaddress, length.toInt())
}

public actual fun IoBuildSynchronousFsdRequest(majorfunction: UInt, deviceobject: Long, buffer: Long, length: UInt, startingoffset: Long, event: Long, iostatusblock: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoBuildSynchronousFsdRequest(majorfunction.toInt(), deviceobject, buffer, length.toInt(), startingoffset, event, iostatusblock)

public actual fun IoCancelFileOpen(deviceobject: Long, fileobject: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoCancelFileOpen(deviceobject, fileobject)
}

public actual fun IoCancelIrp(irp: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoCancelIrp(irp)

public actual fun IoCheckLinkShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: Long, shareaccess: Long, linkshareaccess: Long, ioshareaccessflags: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoCheckLinkShareAccess(desiredaccess.toInt(), desiredshareaccess.toInt(), fileobject, shareaccess, linkshareaccess, ioshareaccessflags.toInt())

public actual fun IoCheckShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: Long, shareaccess: Long, update: Boolean): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoCheckShareAccess(desiredaccess.toInt(), desiredshareaccess.toInt(), fileobject, shareaccess, update)

public actual fun IoCheckShareAccessEx(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: Long, shareaccess: Long, update: Boolean, writepermission: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoCheckShareAccessEx(desiredaccess.toInt(), desiredshareaccess.toInt(), fileobject, shareaccess, update, writepermission)

public actual fun IoCleanupIrp(irp: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoCleanupIrp(irp)
}

public actual fun IoClearActivityIdThread(originalid: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoClearActivityIdThread(originalid)
}

public actual fun IoClearIrpExtraCreateParameter(irp: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoClearIrpExtraCreateParameter(irp)
}

public actual fun IoConnectInterrupt(interruptobject: Long, serviceroutine: PKSERVICE_ROUTINE, servicecontext: Long, spinlock: Long, vector: UInt, irql: UByte, synchronizeirql: UByte, interruptmode: KINTERRUPT_MODE, sharevector: Boolean, processorenablemask: ULong, floatingsave: Boolean): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoConnectInterrupt(interruptobject, serviceroutine.toLong(), servicecontext, spinlock, vector.toInt(), irql.toByte(), synchronizeirql.toByte(), interruptmode, sharevector, processorenablemask.toLong(), floatingsave)

public actual fun IoConnectInterruptEx(parameters: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoConnectInterruptEx(parameters)

public actual fun IoCreateController(size: UInt): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoCreateController(size.toInt())

public actual fun IoCreateDevice(driverobject: Long, deviceextensionsize: UInt, devicename: Long, devicetype: UInt, devicecharacteristics: UInt, exclusive: Boolean, deviceobject: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoCreateDevice(driverobject, deviceextensionsize.toInt(), devicename, devicetype.toInt(), devicecharacteristics.toInt(), exclusive, deviceobject)

public actual fun IoCreateDisk(deviceobject: Long, disk: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoCreateDisk(deviceobject, disk)

public actual fun IoCreateFile(filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: Long, ealength: UInt, createfiletype: CREATE_FILE_TYPE, internalparameters: Long, options: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoCreateFile(filehandle, desiredaccess.toInt(), objectattributes, iostatusblock, allocationsize, fileattributes.toInt(), shareaccess.toInt(), disposition.toInt(), createoptions.toInt(), eabuffer, ealength.toInt(), createfiletype, internalparameters, options.toInt())

public actual fun IoCreateFileEx(filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: Long, ealength: UInt, createfiletype: CREATE_FILE_TYPE, internalparameters: Long, options: UInt, drivercontext: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoCreateFileEx(filehandle, desiredaccess.toInt(), objectattributes, iostatusblock, allocationsize, fileattributes.toInt(), shareaccess.toInt(), disposition.toInt(), createoptions.toInt(), eabuffer, ealength.toInt(), createfiletype, internalparameters, options.toInt(), drivercontext)

public actual fun IoCreateFileSpecifyDeviceObjectHint(filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: Long, ealength: UInt, createfiletype: CREATE_FILE_TYPE, internalparameters: Long, options: UInt, deviceobject: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoCreateFileSpecifyDeviceObjectHint(filehandle, desiredaccess.toInt(), objectattributes, iostatusblock, allocationsize, fileattributes.toInt(), shareaccess.toInt(), disposition.toInt(), createoptions.toInt(), eabuffer, ealength.toInt(), createfiletype, internalparameters, options.toInt(), deviceobject)

public actual fun IoCreateNotificationEvent(eventname: Long, eventhandle: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoCreateNotificationEvent(eventname, eventhandle)

public actual fun IoCreateSymbolicLink(symboliclinkname: Long, devicename: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoCreateSymbolicLink(symboliclinkname, devicename)

public actual fun IoCreateSynchronizationEvent(eventname: Long, eventhandle: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoCreateSynchronizationEvent(eventname, eventhandle)

public actual fun IoCreateSystemThread(ioobject: Long, threadhandle: Long, desiredaccess: UInt, objectattributes: Long, processhandle: HANDLE, clientid: Long, startroutine: PKSTART_ROUTINE, startcontext: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoCreateSystemThread(ioobject, threadhandle, desiredaccess.toInt(), objectattributes, processhandle, clientid, startroutine.toLong(), startcontext)

public actual fun IoCreateUnprotectedSymbolicLink(symboliclinkname: Long, devicename: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoCreateUnprotectedSymbolicLink(symboliclinkname, devicename)

public actual fun IoCsqInitialize(csq: Long, csqinsertirp: PIO_CSQ_INSERT_IRP, csqremoveirp: PIO_CSQ_REMOVE_IRP, csqpeeknextirp: PIO_CSQ_PEEK_NEXT_IRP, csqacquirelock: PIO_CSQ_ACQUIRE_LOCK, csqreleaselock: PIO_CSQ_RELEASE_LOCK, csqcompletecanceledirp: PIO_CSQ_COMPLETE_CANCELED_IRP): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoCsqInitialize(csq, csqinsertirp.toLong(), csqremoveirp.toLong(), csqpeeknextirp.toLong(), csqacquirelock.toLong(), csqreleaselock.toLong(), csqcompletecanceledirp.toLong())

public actual fun IoCsqInitializeEx(csq: Long, csqinsertirp: PIO_CSQ_INSERT_IRP_EX, csqremoveirp: PIO_CSQ_REMOVE_IRP, csqpeeknextirp: PIO_CSQ_PEEK_NEXT_IRP, csqacquirelock: PIO_CSQ_ACQUIRE_LOCK, csqreleaselock: PIO_CSQ_RELEASE_LOCK, csqcompletecanceledirp: PIO_CSQ_COMPLETE_CANCELED_IRP): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoCsqInitializeEx(csq, csqinsertirp.toLong(), csqremoveirp.toLong(), csqpeeknextirp.toLong(), csqacquirelock.toLong(), csqreleaselock.toLong(), csqcompletecanceledirp.toLong())

public actual fun IoCsqInsertIrp(csq: Long, irp: Long, context: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoCsqInsertIrp(csq, irp, context)
}

public actual fun IoCsqInsertIrpEx(csq: Long, irp: Long, context: Long, insertcontext: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoCsqInsertIrpEx(csq, irp, context, insertcontext)

public actual fun IoCsqRemoveIrp(csq: Long, context: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoCsqRemoveIrp(csq, context)

public actual fun IoCsqRemoveNextIrp(csq: Long, peekcontext: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoCsqRemoveNextIrp(csq, peekcontext)

public actual fun IoDecrementKeepAliveCount(fileobject: Long, process: PEPROCESS): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoDecrementKeepAliveCount(fileobject, process)

public actual fun IoDeleteController(controllerobject: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoDeleteController(controllerobject)
}

public actual fun IoDeleteDevice(deviceobject: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoDeleteDevice(deviceobject)
}

public actual fun IoDeleteSymbolicLink(symboliclinkname: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoDeleteSymbolicLink(symboliclinkname)

public actual fun IoDetachDevice(targetdevice: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoDetachDevice(targetdevice)
}

public actual fun IoDisconnectInterrupt(interruptobject: PKINTERRUPT) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoDisconnectInterrupt(interruptobject)
}

public actual fun IoDisconnectInterruptEx(parameters: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoDisconnectInterruptEx(parameters)
}

public actual fun IoEnumerateKsrPersistentMemoryEx(driverobject: Long, physicaldeviceobject: Long, physicaldeviceid: Long, callback: PIO_PERSISTED_MEMORY_ENUMERATION_CALLBACK, callbackcontext: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoEnumerateKsrPersistentMemoryEx(driverobject, physicaldeviceobject, physicaldeviceid, callback.toLong(), callbackcontext)

public actual fun IoFlushAdapterBuffers(adapterobject: Long, mdl: Long, mapregisterbase: Long, currentva: Long, length: UInt, writetodevice: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoFlushAdapterBuffers(adapterobject, mdl, mapregisterbase, currentva, length.toInt(), writetodevice)

public actual fun IoForwardIrpSynchronously(deviceobject: Long, irp: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoForwardIrpSynchronously(deviceobject, irp)

public actual fun IoFreeAdapterChannel(adapterobject: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoFreeAdapterChannel(adapterobject)
}

public actual fun IoFreeController(controllerobject: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoFreeController(controllerobject)
}

public actual fun IoFreeErrorLogEntry(elentry: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoFreeErrorLogEntry(elentry)
}

public actual fun IoFreeIrp(irp: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoFreeIrp(irp)
}

public actual fun IoFreeKsrPersistentMemory(datahandle: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoFreeKsrPersistentMemory(datahandle)

public actual fun IoFreeMapRegisters(adapterobject: Long, mapregisterbase: Long, numberofmapregisters: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoFreeMapRegisters(adapterobject, mapregisterbase, numberofmapregisters.toInt())
}

public actual fun IoFreeMdl(mdl: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoFreeMdl(mdl)
}

public actual fun IoFreeSfioStreamIdentifier(fileobject: Long, signature: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoFreeSfioStreamIdentifier(fileobject, signature)

public actual fun IoFreeWorkItem(ioworkitem: PIO_WORKITEM) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoFreeWorkItem(ioworkitem)
}

public actual fun IoGetActivityIdIrp(irp: Long, guid: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoGetActivityIdIrp(irp, guid)

public actual fun IoGetActivityIdThread(): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoGetActivityIdThread()

public actual fun IoGetAffinityInterrupt(interruptobject: PKINTERRUPT, groupaffinity: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoGetAffinityInterrupt(interruptobject, groupaffinity)

public actual fun IoGetAttachedDeviceReference(deviceobject: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoGetAttachedDeviceReference(deviceobject)

public actual fun IoGetBootDiskInformation(bootdiskinformation: Long, size: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoGetBootDiskInformation(bootdiskinformation, size.toInt())

public actual fun IoGetBootDiskInformationLite(bootdiskinformation: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoGetBootDiskInformationLite(bootdiskinformation)

public actual fun IoGetConfigurationInformation(): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoGetConfigurationInformation()

public actual fun IoGetContainerInformation(informationclass: IO_CONTAINER_INFORMATION_CLASS, containerobject: Long, buffer: Long, bufferlength: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoGetContainerInformation(informationclass, containerobject, buffer, bufferlength.toInt())

public actual fun IoGetCurrentProcess(): PEPROCESS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoGetCurrentProcess()

public actual fun IoGetDeviceDirectory(physicaldeviceobject: Long, directorytype: DEVICE_DIRECTORY_TYPE, flags: UInt, reserved: Long, devicedirectoryhandle: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoGetDeviceDirectory(physicaldeviceobject, directorytype, flags.toInt(), reserved, devicedirectoryhandle)

public actual fun IoGetDeviceInterfaceAlias(symboliclinkname: Long, aliasinterfaceclassguid: Long, aliassymboliclinkname: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoGetDeviceInterfaceAlias(symboliclinkname, aliasinterfaceclassguid, aliassymboliclinkname)

public actual fun IoGetDeviceInterfacePropertyData(symboliclinkname: Long, propertykey: Long, lcid: UInt, flags: UInt, size: UInt, data: Long, requiredsize: Long, type: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoGetDeviceInterfacePropertyData(symboliclinkname, propertykey, lcid.toInt(), flags.toInt(), size.toInt(), data, requiredsize, type)

public actual fun IoGetDeviceInterfaces(interfaceclassguid: Long, physicaldeviceobject: Long, flags: UInt, symboliclinklist: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoGetDeviceInterfaces(interfaceclassguid, physicaldeviceobject, flags.toInt(), symboliclinklist)

public actual fun IoGetDeviceNumaNode(pdo: Long, nodenumber: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoGetDeviceNumaNode(pdo, nodenumber)

public actual fun IoGetDeviceObjectPointer(objectname: Long, desiredaccess: UInt, fileobject: Long, deviceobject: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoGetDeviceObjectPointer(objectname, desiredaccess.toInt(), fileobject, deviceobject)

public actual fun IoGetDeviceProperty(deviceobject: Long, deviceproperty: DEVICE_REGISTRY_PROPERTY, bufferlength: UInt, propertybuffer: Long, resultlength: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoGetDeviceProperty(deviceobject, deviceproperty, bufferlength.toInt(), propertybuffer, resultlength)

public actual fun IoGetDevicePropertyData(pdo: Long, propertykey: Long, lcid: UInt, flags: UInt, size: UInt, data: Long, requiredsize: Long, type: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoGetDevicePropertyData(pdo, propertykey, lcid.toInt(), flags.toInt(), size.toInt(), data, requiredsize, type)

public actual fun IoGetDmaAdapter(physicaldeviceobject: Long, devicedescription: Long, numberofmapregisters: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoGetDmaAdapter(physicaldeviceobject, devicedescription, numberofmapregisters)

public actual fun IoGetDriverDirectory(driverobject: Long, directorytype: DRIVER_DIRECTORY_TYPE, flags: UInt, driverdirectoryhandle: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoGetDriverDirectory(driverobject, directorytype, flags.toInt(), driverdirectoryhandle)

public actual fun IoGetDriverObjectExtension(driverobject: Long, clientidentificationaddress: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoGetDriverObjectExtension(driverobject, clientidentificationaddress)

public actual fun IoGetFileObjectGenericMapping(): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoGetFileObjectGenericMapping()

public actual fun IoGetFsZeroingOffset(irp: Long, zeroingoffset: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoGetFsZeroingOffset(irp, zeroingoffset)

public actual fun IoGetInitialStack(): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoGetInitialStack()

public actual fun IoGetInitiatorProcess(fileobject: Long): PEPROCESS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoGetInitiatorProcess(fileobject)

public actual fun IoGetIoAttributionHandle(irp: Long, ioattributionhandle: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoGetIoAttributionHandle(irp, ioattributionhandle)

public actual fun IoGetIoPriorityHint(irp: Long): IO_PRIORITY_HINT =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoGetIoPriorityHint(irp)

public actual fun IoGetIommuInterface(version: UInt, interfaceout: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoGetIommuInterface(version.toInt(), interfaceout)

public actual fun IoGetIommuInterfaceEx(version: UInt, flags: ULong, interfaceout: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoGetIommuInterfaceEx(version.toInt(), flags.toLong(), interfaceout)

public actual fun IoGetIrpExtraCreateParameter(irp: Long, extracreateparameter: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoGetIrpExtraCreateParameter(irp, extracreateparameter)

public actual fun IoGetPagingIoPriority(irp: Long): IO_PAGING_PRIORITY =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoGetPagingIoPriority(irp)

public actual fun IoGetRelatedDeviceObject(fileobject: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoGetRelatedDeviceObject(fileobject)

public actual fun IoGetSfioStreamIdentifier(fileobject: Long, signature: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoGetSfioStreamIdentifier(fileobject, signature)

public actual fun IoGetSilo(fileobject: Long): PESILO =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoGetSilo(fileobject)

public actual fun IoGetSiloParameters(fileobject: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoGetSiloParameters(fileobject)

public actual fun IoGetStackLimits(lowlimit: Long, highlimit: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoGetStackLimits(lowlimit, highlimit)
}

public actual fun IoGetTopLevelIrp(): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoGetTopLevelIrp()

public actual fun IoGetTransactionParameterBlock(fileobject: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoGetTransactionParameterBlock(fileobject)

public actual fun IoIncrementKeepAliveCount(fileobject: Long, process: PEPROCESS): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoIncrementKeepAliveCount(fileobject, process)

public actual fun IoInitializeIrp(irp: Long, packetsize: UShort, stacksize: Byte) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoInitializeIrp(irp, packetsize.toShort(), stacksize)
}

public actual fun IoInitializeIrpEx(irp: Long, deviceobject: Long, packetsize: UShort, stacksize: Byte) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoInitializeIrpEx(irp, deviceobject, packetsize.toShort(), stacksize)
}

public actual fun IoInitializeRemoveLockEx(lock: Long, allocatetag: UInt, maxlockedminutes: UInt, highwatermark: UInt, remlocksize: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoInitializeRemoveLockEx(lock, allocatetag.toInt(), maxlockedminutes.toInt(), highwatermark.toInt(), remlocksize.toInt())
}

public actual fun IoInitializeTimer(deviceobject: Long, timerroutine: PIO_TIMER_ROUTINE, context: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoInitializeTimer(deviceobject, timerroutine.toLong(), context)

public actual fun IoInitializeWorkItem(ioobject: Long, ioworkitem: PIO_WORKITEM) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoInitializeWorkItem(ioobject, ioworkitem)
}

public actual fun IoInvalidateDeviceRelations(deviceobject: Long, type: DEVICE_RELATION_TYPE) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoInvalidateDeviceRelations(deviceobject, type)
}

public actual fun IoInvalidateDeviceState(physicaldeviceobject: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoInvalidateDeviceState(physicaldeviceobject)
}

public actual fun IoIs32bitProcess(irp: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoIs32bitProcess(irp)

public actual fun IoIsFileObjectIgnoringSharing(fileobject: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoIsFileObjectIgnoringSharing(fileobject)

public actual fun IoIsFileOriginRemote(fileobject: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoIsFileOriginRemote(fileobject)

public actual fun IoIsInitiator32bitProcess(irp: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoIsInitiator32bitProcess(irp)

public actual fun IoIsValidIrpStatus(status: NTSTATUS): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoIsValidIrpStatus(status).toUInt()

public actual fun IoIsWdmVersionAvailable(majorversion: UByte, minorversion: UByte): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoIsWdmVersionAvailable(majorversion.toByte(), minorversion.toByte())

public actual fun IoMakeAssociatedIrp(irp: Long, stacksize: Byte): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoMakeAssociatedIrp(irp, stacksize)

public actual fun IoMakeAssociatedIrpEx(irp: Long, deviceobject: Long, stacksize: Byte): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoMakeAssociatedIrpEx(irp, deviceobject, stacksize)

public actual fun IoMapTransfer(adapterobject: Long, mdl: Long, mapregisterbase: Long, currentva: Long, length: Long, writetodevice: Boolean): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoMapTransfer(adapterobject, mdl, mapregisterbase, currentva, length, writetodevice)

public actual fun IoOpenDeviceInterfaceRegistryKey(symboliclinkname: Long, desiredaccess: UInt, deviceinterfaceregkey: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoOpenDeviceInterfaceRegistryKey(symboliclinkname, desiredaccess.toInt(), deviceinterfaceregkey)

public actual fun IoOpenDeviceRegistryKey(deviceobject: Long, devinstkeytype: UInt, desiredaccess: UInt, deviceregkey: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoOpenDeviceRegistryKey(deviceobject, devinstkeytype.toInt(), desiredaccess.toInt(), deviceregkey)

public actual fun IoOpenDriverRegistryKey(driverobject: Long, regkeytype: DRIVER_REGKEY_TYPE, desiredaccess: UInt, flags: UInt, driverregkey: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoOpenDriverRegistryKey(driverobject, regkeytype, desiredaccess.toInt(), flags.toInt(), driverregkey)

public actual fun IoPropagateActivityIdToThread(irp: Long, propagatedid: Long, originalid: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoPropagateActivityIdToThread(irp, propagatedid, originalid)

public actual fun IoQueryDeviceDescription(bustype: Long, busnumber: Long, controllertype: Long, controllernumber: Long, peripheraltype: Long, peripheralnumber: Long, calloutroutine: PIO_QUERY_DEVICE_ROUTINE, context: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoQueryDeviceDescription(bustype, busnumber, controllertype, controllernumber, peripheraltype, peripheralnumber, calloutroutine.toLong(), context)

public actual fun IoQueryFullDriverPath(driverobject: Long, fullpath: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoQueryFullDriverPath(driverobject, fullpath)

public actual fun IoQueryInformationByName(objectattributes: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS, options: UInt, drivercontext: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoQueryInformationByName(objectattributes, iostatusblock, fileinformation, length.toInt(), fileinformationclass, options.toInt(), drivercontext)

public actual fun IoQueryKsrPersistentMemorySize(driverobject: Long, physicaldeviceobject: Long, buffersize: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoQueryKsrPersistentMemorySize(driverobject, physicaldeviceobject, buffersize)

public actual fun IoQueryKsrPersistentMemorySizeEx(driverobject: Long, physicaldeviceobject: Long, physicaldeviceid: Long, datatag: Long, dataversion: Long, buffersize: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoQueryKsrPersistentMemorySizeEx(driverobject, physicaldeviceobject, physicaldeviceid, datatag, dataversion, buffersize)

public actual fun IoQueueWorkItem(ioworkitem: PIO_WORKITEM, workerroutine: PIO_WORKITEM_ROUTINE, queuetype: WORK_QUEUE_TYPE, context: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoQueueWorkItem(ioworkitem, workerroutine.toLong(), queuetype, context)
}

public actual fun IoQueueWorkItemEx(ioworkitem: PIO_WORKITEM, workerroutine: PIO_WORKITEM_ROUTINE_EX, queuetype: WORK_QUEUE_TYPE, context: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoQueueWorkItemEx(ioworkitem, workerroutine.toLong(), queuetype, context)
}

public actual fun IoRaiseHardError(irp: Long, vpb: Long, realdeviceobject: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoRaiseHardError(irp, vpb, realdeviceobject)
}

public actual fun IoRaiseInformationalHardError(errorstatus: NTSTATUS, string: Long, thread: PKTHREAD): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoRaiseInformationalHardError(errorstatus, string, thread)

public actual fun IoReadDiskSignature(deviceobject: Long, bytespersector: UInt, signature: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoReadDiskSignature(deviceobject, bytespersector.toInt(), signature)

public actual fun IoReadPartitionTable(deviceobject: Long, sectorsize: UInt, returnrecognizedpartitions: Boolean, partitionbuffer: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoReadPartitionTable(deviceobject, sectorsize.toInt(), returnrecognizedpartitions, partitionbuffer)

public actual fun IoReadPartitionTableEx(deviceobject: Long, drivelayout: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoReadPartitionTableEx(deviceobject, drivelayout)

public actual fun IoRecordIoAttribution(opaquehandle: Long, attributioninformation: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoRecordIoAttribution(opaquehandle, attributioninformation)

public actual fun IoRegisterBootDriverCallback(callbackfunction: PBOOT_DRIVER_CALLBACK_FUNCTION, callbackcontext: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoRegisterBootDriverCallback(callbackfunction.toLong(), callbackcontext)

public actual fun IoRegisterBootDriverReinitialization(driverobject: Long, driverreinitializationroutine: DRIVER_REINITIALIZE, context: Long) {
}

public actual fun IoRegisterContainerNotification(notificationclass: IO_CONTAINER_NOTIFICATION_CLASS, callbackfunction: PIO_CONTAINER_NOTIFICATION_FUNCTION, notificationinformation: Long, notificationinformationlength: UInt, callbackregistration: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoRegisterContainerNotification(notificationclass, callbackfunction.toLong(), notificationinformation, notificationinformationlength.toInt(), callbackregistration)

public actual fun IoRegisterDeviceInterface(physicaldeviceobject: Long, interfaceclassguid: Long, referencestring: Long, symboliclinkname: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoRegisterDeviceInterface(physicaldeviceobject, interfaceclassguid, referencestring, symboliclinkname)

public actual fun IoRegisterDriverReinitialization(driverobject: Long, driverreinitializationroutine: DRIVER_REINITIALIZE, context: Long) {
}

public actual fun IoRegisterLastChanceShutdownNotification(deviceobject: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoRegisterLastChanceShutdownNotification(deviceobject)

public actual fun IoRegisterPlugPlayNotification(eventcategory: IO_NOTIFICATION_EVENT_CATEGORY, eventcategoryflags: UInt, eventcategorydata: Long, driverobject: Long, callbackroutine: DRIVER_NOTIFICATION_CALLBACK_ROUTINE, context: Long, notificationentry: Long): NTSTATUS =
    0

public actual fun IoRegisterShutdownNotification(deviceobject: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoRegisterShutdownNotification(deviceobject)

public actual fun IoReleaseCancelSpinLock(irql: UByte) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoReleaseCancelSpinLock(irql.toByte())
}

public actual fun IoReleaseRemoveLockAndWaitEx(removelock: Long, tag: Long, remlocksize: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoReleaseRemoveLockAndWaitEx(removelock, tag, remlocksize.toInt())
}

public actual fun IoReleaseRemoveLockEx(removelock: Long, tag: Long, remlocksize: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoReleaseRemoveLockEx(removelock, tag, remlocksize.toInt())
}

public actual fun IoRemoveLinkShareAccess(fileobject: Long, shareaccess: Long, linkshareaccess: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoRemoveLinkShareAccess(fileobject, shareaccess, linkshareaccess)
}

public actual fun IoRemoveLinkShareAccessEx(fileobject: Long, shareaccess: Long, linkshareaccess: Long, ioshareaccessflags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoRemoveLinkShareAccessEx(fileobject, shareaccess, linkshareaccess, ioshareaccessflags.toInt())
}

public actual fun IoRemoveShareAccess(fileobject: Long, shareaccess: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoRemoveShareAccess(fileobject, shareaccess)
}

public actual fun IoReplacePartitionUnit(targetpdo: Long, sparepdo: Long, flags: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoReplacePartitionUnit(targetpdo, sparepdo, flags.toInt())

public actual fun IoReportDetectedDevice(driverobject: Long, legacybustype: INTERFACE_TYPE, busnumber: UInt, slotnumber: UInt, resourcelist: Long, resourcerequirements: Long, resourceassigned: Boolean, deviceobject: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoReportDetectedDevice(driverobject, legacybustype, busnumber.toInt(), slotnumber.toInt(), resourcelist, resourcerequirements, resourceassigned, deviceobject)

public actual fun IoReportInterruptActive(parameters: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoReportInterruptActive(parameters)
}

public actual fun IoReportInterruptInactive(parameters: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoReportInterruptInactive(parameters)
}

public actual fun IoReportResourceForDetection(driverobject: Long, driverlist: Long, driverlistsize: UInt, deviceobject: Long, devicelist: Long, devicelistsize: UInt, conflictdetected: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoReportResourceForDetection(driverobject, driverlist, driverlistsize.toInt(), deviceobject, devicelist, devicelistsize.toInt(), conflictdetected)

public actual fun IoReportResourceUsage(driverclassname: Long, driverobject: Long, driverlist: Long, driverlistsize: UInt, deviceobject: Long, devicelist: Long, devicelistsize: UInt, overrideconflict: Boolean, conflictdetected: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoReportResourceUsage(driverclassname, driverobject, driverlist, driverlistsize.toInt(), deviceobject, devicelist, devicelistsize.toInt(), overrideconflict, conflictdetected)

public actual fun IoReportRootDevice(driverobject: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoReportRootDevice(driverobject)

public actual fun IoReportTargetDeviceChange(physicaldeviceobject: Long, notificationstructure: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoReportTargetDeviceChange(physicaldeviceobject, notificationstructure)

public actual fun IoReportTargetDeviceChangeAsynchronous(physicaldeviceobject: Long, notificationstructure: Long, callback: PDEVICE_CHANGE_COMPLETE_CALLBACK, context: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoReportTargetDeviceChangeAsynchronous(physicaldeviceobject, notificationstructure, callback.toLong(), context)

public actual fun IoRequestDeviceEject(physicaldeviceobject: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoRequestDeviceEject(physicaldeviceobject)
}

public actual fun IoRequestDeviceEjectEx(physicaldeviceobject: Long, callback: PIO_DEVICE_EJECT_CALLBACK, context: Long, driverobject: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoRequestDeviceEjectEx(physicaldeviceobject, callback.toLong(), context, driverobject)

public actual fun IoReserveKsrPersistentMemory(driverobject: Long, physicaldeviceobject: Long, size: ULong, flags: UInt, datahandle: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoReserveKsrPersistentMemory(driverobject, physicaldeviceobject, size.toLong(), flags.toInt(), datahandle)

public actual fun IoReserveKsrPersistentMemoryEx(driverobject: Long, physicaldeviceobject: Long, physicaldeviceid: Long, datatag: Long, dataversion: UInt, size: ULong, flags: UInt, datahandle: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoReserveKsrPersistentMemoryEx(driverobject, physicaldeviceobject, physicaldeviceid, datatag, dataversion.toInt(), size.toLong(), flags.toInt(), datahandle)

public actual fun IoReuseIrp(irp: Long, iostatus: NTSTATUS) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoReuseIrp(irp, iostatus)
}

public actual fun IoSetActivityIdIrp(irp: Long, guid: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoSetActivityIdIrp(irp, guid)

public actual fun IoSetActivityIdThread(activityid: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoSetActivityIdThread(activityid)

public actual fun IoSetCompletionRoutineEx(deviceobject: Long, irp: Long, completionroutine: PIO_COMPLETION_ROUTINE, context: Long, invokeonsuccess: Boolean, invokeonerror: Boolean, invokeoncancel: Boolean): NTSTATUS =
    0

public actual fun IoSetDeviceInterfacePropertyData(symboliclinkname: Long, propertykey: Long, lcid: UInt, flags: UInt, type: UInt, size: UInt, data: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoSetDeviceInterfacePropertyData(symboliclinkname, propertykey, lcid.toInt(), flags.toInt(), type.toInt(), size.toInt(), data)

public actual fun IoSetDeviceInterfaceState(symboliclinkname: Long, enable: Boolean): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoSetDeviceInterfaceState(symboliclinkname, enable)

public actual fun IoSetDevicePropertyData(pdo: Long, propertykey: Long, lcid: UInt, flags: UInt, type: UInt, size: UInt, data: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoSetDevicePropertyData(pdo, propertykey, lcid.toInt(), flags.toInt(), type.toInt(), size.toInt(), data)

public actual fun IoSetFileObjectIgnoreSharing(fileobject: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoSetFileObjectIgnoreSharing(fileobject)

public actual fun IoSetFileOrigin(fileobject: Long, remote: Boolean): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoSetFileOrigin(fileobject, remote)

public actual fun IoSetFsZeroingOffset(irp: Long, zeroingoffset: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoSetFsZeroingOffset(irp, zeroingoffset.toInt())

public actual fun IoSetFsZeroingOffsetRequired(irp: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoSetFsZeroingOffsetRequired(irp)

public actual fun IoSetHardErrorOrVerifyDevice(irp: Long, deviceobject: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoSetHardErrorOrVerifyDevice(irp, deviceobject)
}

public actual fun IoSetIoAttributionIrp(irp: Long, attributionsource: Long, flags: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoSetIoAttributionIrp(irp, attributionsource, flags.toInt())

public actual fun IoSetIoPriorityHint(irp: Long, priorityhint: IO_PRIORITY_HINT): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoSetIoPriorityHint(irp, priorityhint)

public actual fun IoSetIrpExtraCreateParameter(irp: Long, extracreateparameter: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoSetIrpExtraCreateParameter(irp, extracreateparameter)

public actual fun IoSetLinkShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: Long, shareaccess: Long, linkshareaccess: Long, ioshareaccessflags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoSetLinkShareAccess(desiredaccess.toInt(), desiredshareaccess.toInt(), fileobject, shareaccess, linkshareaccess, ioshareaccessflags.toInt())
}

public actual fun IoSetMasterIrpStatus(masterirp: Long, status: NTSTATUS) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoSetMasterIrpStatus(masterirp, status)
}

public actual fun IoSetPartitionInformation(deviceobject: Long, sectorsize: UInt, partitionnumber: UInt, partitiontype: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoSetPartitionInformation(deviceobject, sectorsize.toInt(), partitionnumber.toInt(), partitiontype.toInt())

public actual fun IoSetPartitionInformationEx(deviceobject: Long, partitionnumber: UInt, partitioninfo: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoSetPartitionInformationEx(deviceobject, partitionnumber.toInt(), partitioninfo)

public actual fun IoSetShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: Long, shareaccess: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoSetShareAccess(desiredaccess.toInt(), desiredshareaccess.toInt(), fileobject, shareaccess)
}

public actual fun IoSetShareAccessEx(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: Long, shareaccess: Long, writepermission: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoSetShareAccessEx(desiredaccess.toInt(), desiredshareaccess.toInt(), fileobject, shareaccess, writepermission)
}

public actual fun IoSetStartIoAttributes(deviceobject: Long, deferredstartio: Boolean, noncancelable: Boolean) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoSetStartIoAttributes(deviceobject, deferredstartio, noncancelable)
}

public actual fun IoSetSystemPartition(volumenamestring: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoSetSystemPartition(volumenamestring)

public actual fun IoSetThreadHardErrorMode(enableharderrors: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoSetThreadHardErrorMode(enableharderrors)

public actual fun IoSetTopLevelIrp(irp: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoSetTopLevelIrp(irp)
}

public actual fun IoSizeOfIrpEx(deviceobject: Long, stacksize: Byte): UShort =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoSizeOfIrpEx(deviceobject, stacksize).toUShort()

public actual fun IoSizeofWorkItem(): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoSizeofWorkItem().toUInt()

public actual fun IoStartNextPacket(deviceobject: Long, cancelable: Boolean) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoStartNextPacket(deviceobject, cancelable)
}

public actual fun IoStartNextPacketByKey(deviceobject: Long, cancelable: Boolean, key: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoStartNextPacketByKey(deviceobject, cancelable, key.toInt())
}

public actual fun IoStartPacket(deviceobject: Long, irp: Long, key: Long, cancelfunction: DRIVER_CANCEL) {
}

public actual fun IoStartTimer(deviceobject: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoStartTimer(deviceobject)
}

public actual fun IoStopTimer(deviceobject: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoStopTimer(deviceobject)
}

public actual fun IoSynchronousCallDriver(deviceobject: Long, irp: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoSynchronousCallDriver(deviceobject, irp)

public actual fun IoTransferActivityId(activityid: Long, relatedactivityid: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoTransferActivityId(activityid, relatedactivityid)
}

public actual fun IoTranslateBusAddress(interfacetype: INTERFACE_TYPE, busnumber: UInt, busaddress: Long, addressspace: Long, translatedaddress: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoTranslateBusAddress(interfacetype, busnumber.toInt(), busaddress, addressspace, translatedaddress)

public actual fun IoTryQueueWorkItem(ioworkitem: PIO_WORKITEM, workerroutine: PIO_WORKITEM_ROUTINE_EX, queuetype: WORK_QUEUE_TYPE, context: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoTryQueueWorkItem(ioworkitem, workerroutine.toLong(), queuetype, context)

public actual fun IoUninitializeWorkItem(ioworkitem: PIO_WORKITEM) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoUninitializeWorkItem(ioworkitem)
}

public actual fun IoUnregisterBootDriverCallback(callbackhandle: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoUnregisterBootDriverCallback(callbackhandle)
}

public actual fun IoUnregisterContainerNotification(callbackregistration: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoUnregisterContainerNotification(callbackregistration)
}

public actual fun IoUnregisterPlugPlayNotification(notificationentry: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoUnregisterPlugPlayNotification(notificationentry)

public actual fun IoUnregisterPlugPlayNotificationEx(notificationentry: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoUnregisterPlugPlayNotificationEx(notificationentry)

public actual fun IoUnregisterShutdownNotification(deviceobject: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoUnregisterShutdownNotification(deviceobject)
}

public actual fun IoUpdateLinkShareAccess(fileobject: Long, shareaccess: Long, linkshareaccess: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoUpdateLinkShareAccess(fileobject, shareaccess, linkshareaccess)
}

public actual fun IoUpdateLinkShareAccessEx(fileobject: Long, shareaccess: Long, linkshareaccess: Long, ioshareaccessflags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoUpdateLinkShareAccessEx(fileobject, shareaccess, linkshareaccess, ioshareaccessflags.toInt())
}

public actual fun IoUpdateShareAccess(fileobject: Long, shareaccess: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoUpdateShareAccess(fileobject, shareaccess)
}

public actual fun IoValidateDeviceIoControlAccess(irp: Long, requiredaccess: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoValidateDeviceIoControlAccess(irp, requiredaccess.toInt())

public actual fun IoVerifyPartitionTable(deviceobject: Long, fixerrors: Boolean): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoVerifyPartitionTable(deviceobject, fixerrors)

public actual fun IoVolumeDeviceNameToGuid(volumedevicename: Long, guid: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoVolumeDeviceNameToGuid(volumedevicename, guid)

public actual fun IoVolumeDeviceNameToGuidPath(volumedevicename: Long, guidpath: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoVolumeDeviceNameToGuidPath(volumedevicename, guidpath)

public actual fun IoVolumeDeviceToDosName(volumedeviceobject: Long, dosname: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoVolumeDeviceToDosName(volumedeviceobject, dosname)

public actual fun IoVolumeDeviceToGuid(volumedeviceobject: Long, guid: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoVolumeDeviceToGuid(volumedeviceobject, guid)

public actual fun IoVolumeDeviceToGuidPath(volumedeviceobject: Long, guidpath: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoVolumeDeviceToGuidPath(volumedeviceobject, guidpath)

public actual fun IoWMIAllocateInstanceIds(guid: Long, instancecount: UInt, firstinstanceid: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoWMIAllocateInstanceIds(guid, instancecount.toInt(), firstinstanceid)

public actual fun IoWMIDeviceObjectToInstanceName(datablockobject: Long, deviceobject: Long, instancename: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoWMIDeviceObjectToInstanceName(datablockobject, deviceobject, instancename)

public actual fun IoWMIExecuteMethod(datablockobject: Long, instancename: Long, methodid: UInt, inbuffersize: UInt, outbuffersize: Long, inoutbuffer: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoWMIExecuteMethod(datablockobject, instancename, methodid.toInt(), inbuffersize.toInt(), outbuffersize, inoutbuffer)

public actual fun IoWMIHandleToInstanceName(datablockobject: Long, filehandle: HANDLE, instancename: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoWMIHandleToInstanceName(datablockobject, filehandle, instancename)

public actual fun IoWMIOpenBlock(guid: Long, desiredaccess: UInt, datablockobject: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoWMIOpenBlock(guid, desiredaccess.toInt(), datablockobject)

public actual fun IoWMIQueryAllData(datablockobject: Long, inoutbuffersize: Long, outbuffer: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoWMIQueryAllData(datablockobject, inoutbuffersize, outbuffer)

public actual fun IoWMIQueryAllDataMultiple(datablockobjectlist: Long, objectcount: UInt, inoutbuffersize: Long, outbuffer: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoWMIQueryAllDataMultiple(datablockobjectlist, objectcount.toInt(), inoutbuffersize, outbuffer)

public actual fun IoWMIQuerySingleInstance(datablockobject: Long, instancename: Long, inoutbuffersize: Long, outbuffer: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoWMIQuerySingleInstance(datablockobject, instancename, inoutbuffersize, outbuffer)

public actual fun IoWMIQuerySingleInstanceMultiple(datablockobjectlist: Long, instancenames: Long, objectcount: UInt, inoutbuffersize: Long, outbuffer: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoWMIQuerySingleInstanceMultiple(datablockobjectlist, instancenames, objectcount.toInt(), inoutbuffersize, outbuffer)

public actual fun IoWMIRegistrationControl(deviceobject: Long, action: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoWMIRegistrationControl(deviceobject, action.toInt())

public actual fun IoWMISetNotificationCallback(obj: Long, callback: WMI_NOTIFICATION_CALLBACK, context: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoWMISetNotificationCallback(obj, callback.toLong(), context)

public actual fun IoWMISetSingleInstance(datablockobject: Long, instancename: Long, version: UInt, valuebuffersize: UInt, valuebuffer: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoWMISetSingleInstance(datablockobject, instancename, version.toInt(), valuebuffersize.toInt(), valuebuffer)

public actual fun IoWMISetSingleItem(datablockobject: Long, instancename: Long, dataitemid: UInt, version: UInt, valuebuffersize: UInt, valuebuffer: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoWMISetSingleItem(datablockobject, instancename, dataitemid.toInt(), version.toInt(), valuebuffersize.toInt(), valuebuffer)

public actual fun IoWMISuggestInstanceName(physicaldeviceobject: Long, symboliclinkname: Long, combinenames: Boolean, suggestedinstancename: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoWMISuggestInstanceName(physicaldeviceobject, symboliclinkname, combinenames, suggestedinstancename)

public actual fun IoWMIWriteEvent(wnodeeventitem: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoWMIWriteEvent(wnodeeventitem)

public actual fun IoWithinStackLimits(regionstart: ULong, regionsize: ULong): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoWithinStackLimits(regionstart.toLong(), regionsize.toLong()).toUInt()

public actual fun IoWriteErrorLogEntry(elentry: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoWriteErrorLogEntry(elentry)
}

public actual fun IoWriteKsrPersistentMemory(datahandle: Long, buffer: Long, size: ULong): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoWriteKsrPersistentMemory(datahandle, buffer, size.toLong())

public actual fun IoWritePartitionTable(deviceobject: Long, sectorsize: UInt, sectorspertrack: UInt, numberofheads: UInt, partitionbuffer: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoWritePartitionTable(deviceobject, sectorsize.toInt(), sectorspertrack.toInt(), numberofheads.toInt(), partitionbuffer)

public actual fun IoWritePartitionTableEx(deviceobject: Long, drivelayout: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IoWritePartitionTableEx(deviceobject, drivelayout)

public actual fun IofCallDriver(deviceobject: Long, irp: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IofCallDriver(deviceobject, irp)

public actual fun IofCompleteRequest(irp: Long, priorityboost: Byte) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_IofCompleteRequest(irp, priorityboost)
}

public actual fun KdChangeOption(option: KD_OPTION, inbufferbytes: UInt, inbuffer: Long, outbufferbytes: UInt, outbuffer: Long, outbufferneeded: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KdChangeOption(option, inbufferbytes.toInt(), inbuffer, outbufferbytes.toInt(), outbuffer, outbufferneeded)

public actual fun KdDisableDebugger(): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KdDisableDebugger()

public actual fun KdEnableDebugger(): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KdEnableDebugger()

public actual fun KdRefreshDebuggerNotPresent(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KdRefreshDebuggerNotPresent()

public actual fun KeAcquireGuardedMutex(mutex: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeAcquireGuardedMutex(mutex)
}

public actual fun KeAcquireGuardedMutexUnsafe(fastmutex: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeAcquireGuardedMutexUnsafe(fastmutex)
}

public actual fun KeAcquireInStackQueuedSpinLock(spinlock: Long, lockhandle: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeAcquireInStackQueuedSpinLock(spinlock, lockhandle)
}

public actual fun KeAcquireInStackQueuedSpinLockAtDpcLevel(spinlock: Long, lockhandle: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeAcquireInStackQueuedSpinLockAtDpcLevel(spinlock, lockhandle)
}

public actual fun KeAcquireInStackQueuedSpinLockForDpc(spinlock: Long, lockhandle: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeAcquireInStackQueuedSpinLockForDpc(spinlock, lockhandle)
}

public actual fun KeAcquireInterruptSpinLock(interrupt: PKINTERRUPT): UByte =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeAcquireInterruptSpinLock(interrupt).toUByte()

public actual fun KeAcquireSpinLockForDpc(spinlock: Long): UByte =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeAcquireSpinLockForDpc(spinlock).toUByte()

public actual fun KeAddTriageDumpDataBlock(ktriagedumpdataarray: Long, address: Long, size: ULong): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeAddTriageDumpDataBlock(ktriagedumpdataarray, address, size.toLong())

public actual fun KeAreAllApcsDisabled(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeAreAllApcsDisabled()

public actual fun KeAreApcsDisabled(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeAreApcsDisabled()

public actual fun KeBugCheck(bugcheckcode: BUGCHECK_ERROR) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeBugCheck(bugcheckcode.toInt())
}

public actual fun KeBugCheckEx(bugcheckcode: BUGCHECK_ERROR, bugcheckparameter1: ULong, bugcheckparameter2: ULong, bugcheckparameter3: ULong, bugcheckparameter4: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeBugCheckEx(bugcheckcode.toInt(), bugcheckparameter1.toLong(), bugcheckparameter2.toLong(), bugcheckparameter3.toLong(), bugcheckparameter4.toLong())
}

public actual fun KeCancelTimer(param0: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeCancelTimer(param0)

public actual fun KeClearEvent(event: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeClearEvent(event)
}

public actual fun KeConvertAuxiliaryCounterToPerformanceCounter(auxiliarycountervalue: ULong, performancecountervalue: Long, conversionerror: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeConvertAuxiliaryCounterToPerformanceCounter(auxiliarycountervalue.toLong(), performancecountervalue, conversionerror)

public actual fun KeConvertPerformanceCounterToAuxiliaryCounter(performancecountervalue: ULong, auxiliarycountervalue: Long, conversionerror: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeConvertPerformanceCounterToAuxiliaryCounter(performancecountervalue.toLong(), auxiliarycountervalue, conversionerror)

public actual fun KeDelayExecutionThread(waitmode: Byte, alertable: Boolean, interval: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeDelayExecutionThread(waitmode, alertable, interval)

public actual fun KeDeregisterBoundCallback(handle: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeDeregisterBoundCallback(handle)

public actual fun KeDeregisterBugCheckCallback(callbackrecord: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeDeregisterBugCheckCallback(callbackrecord)

public actual fun KeDeregisterBugCheckReasonCallback(callbackrecord: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeDeregisterBugCheckReasonCallback(callbackrecord)

public actual fun KeDeregisterNmiCallback(handle: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeDeregisterNmiCallback(handle)

public actual fun KeDeregisterProcessorChangeCallback(callbackhandle: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeDeregisterProcessorChangeCallback(callbackhandle)
}

public actual fun KeEnterCriticalRegion() {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeEnterCriticalRegion()
}

public actual fun KeEnterGuardedRegion() {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeEnterGuardedRegion()
}

public actual fun KeExpandKernelStackAndCallout(callout: PEXPAND_STACK_CALLOUT, parameter: Long, size: ULong): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeExpandKernelStackAndCallout(callout.toLong(), parameter, size.toLong())

public actual fun KeExpandKernelStackAndCalloutEx(callout: PEXPAND_STACK_CALLOUT, parameter: Long, size: ULong, wait: Boolean, context: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeExpandKernelStackAndCalloutEx(callout.toLong(), parameter, size.toLong(), wait, context)

public actual fun KeFlushIoBuffers(mdl: Long, readoperation: Boolean, dmaoperation: Boolean) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeFlushIoBuffers(mdl, readoperation, dmaoperation)
}

public actual fun KeFlushQueuedDpcs() {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeFlushQueuedDpcs()
}

public actual fun KeFlushWriteBuffer() {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeFlushWriteBuffer()
}

public actual fun KeGetCurrentIrql(): UByte =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeGetCurrentIrql().toUByte()

public actual fun KeGetCurrentNodeNumber(): UShort =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeGetCurrentNodeNumber().toUShort()

public actual fun KeGetCurrentProcessorNumberEx(procnumber: Long): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeGetCurrentProcessorNumberEx(procnumber).toUInt()

public actual fun KeGetProcessorIndexFromNumber(procnumber: Long): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeGetProcessorIndexFromNumber(procnumber).toUInt()

public actual fun KeGetProcessorNumberFromIndex(procindex: UInt, procnumber: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeGetProcessorNumberFromIndex(procindex.toInt(), procnumber)

public actual fun KeGetRecommendedSharedDataAlignment(): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeGetRecommendedSharedDataAlignment().toUInt()

public actual fun KeInitializeCrashDumpHeader(dumptype: UInt, flags: UInt, buffer: Long, buffersize: UInt, bufferneeded: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeInitializeCrashDumpHeader(dumptype.toInt(), flags.toInt(), buffer, buffersize.toInt(), bufferneeded)

public actual fun KeInitializeDeviceQueue(devicequeue: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeInitializeDeviceQueue(devicequeue)
}

public actual fun KeInitializeDpc(dpc: Long, deferredroutine: PKDEFERRED_ROUTINE, deferredcontext: Long) {
}

public actual fun KeInitializeEvent(event: Long, type: EVENT_TYPE, state: Boolean) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeInitializeEvent(event, type, state)
}

public actual fun KeInitializeGuardedMutex(mutex: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeInitializeGuardedMutex(mutex)
}

public actual fun KeInitializeMutex(mutex: Long, level: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeInitializeMutex(mutex, level.toInt())
}

public actual fun KeInitializeSemaphore(semaphore: Long, count: Int, limit: Int) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeInitializeSemaphore(semaphore, count, limit)
}

public actual fun KeInitializeSpinLock(spinlock: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeInitializeSpinLock(spinlock)
}

public actual fun KeInitializeThreadedDpc(dpc: Long, deferredroutine: PKDEFERRED_ROUTINE, deferredcontext: Long) {
}

public actual fun KeInitializeTimer(timer: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeInitializeTimer(timer)
}

public actual fun KeInitializeTimerEx(timer: Long, type: TIMER_TYPE) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeInitializeTimerEx(timer, type)
}

public actual fun KeInitializeTriageDumpDataArray(ktriagedumpdataarray: Long, size: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeInitializeTriageDumpDataArray(ktriagedumpdataarray, size.toInt())

public actual fun KeInsertByKeyDeviceQueue(devicequeue: Long, devicequeueentry: Long, sortkey: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeInsertByKeyDeviceQueue(devicequeue, devicequeueentry, sortkey.toInt())

public actual fun KeInsertDeviceQueue(devicequeue: Long, devicequeueentry: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeInsertDeviceQueue(devicequeue, devicequeueentry)

public actual fun KeInsertQueueDpc(dpc: Long, systemargument1: Long, systemargument2: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeInsertQueueDpc(dpc, systemargument1, systemargument2)

public actual fun KeInvalidateAllCaches(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeInvalidateAllCaches()

public actual fun KeInvalidateRangeAllCaches(baseaddress: Long, length: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeInvalidateRangeAllCaches(baseaddress, length.toInt())
}

public actual fun KeIpiGenericCall(broadcastfunction: PKIPI_BROADCAST_WORKER, context: ULong): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeIpiGenericCall(broadcastfunction.toLong(), context.toLong()).toULong()

public actual fun KeIsExecutingDpc(): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeIsExecutingDpc().toUInt()

public actual fun KeLeaveCriticalRegion() {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeLeaveCriticalRegion()
}

public actual fun KeLeaveGuardedRegion() {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeLeaveGuardedRegion()
}

public actual fun KePulseEvent(event: Long, increment: Int, wait: Boolean): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KePulseEvent(event, increment, wait)

public actual fun KeQueryActiveGroupCount(): UShort =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeQueryActiveGroupCount().toUShort()

public actual fun KeQueryActiveProcessorCount(activeprocessors: Long): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeQueryActiveProcessorCount(activeprocessors).toUInt()

public actual fun KeQueryActiveProcessorCountEx(groupnumber: UShort): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeQueryActiveProcessorCountEx(groupnumber.toShort()).toUInt()

public actual fun KeQueryActiveProcessors(): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeQueryActiveProcessors().toULong()

public actual fun KeQueryAuxiliaryCounterFrequency(auxiliarycounterfrequency: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeQueryAuxiliaryCounterFrequency(auxiliarycounterfrequency)

public actual fun KeQueryDpcWatchdogInformation(watchdoginformation: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeQueryDpcWatchdogInformation(watchdoginformation)

public actual fun KeQueryGroupAffinity(groupnumber: UShort): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeQueryGroupAffinity(groupnumber.toShort()).toULong()

public actual fun KeQueryHardwareCounterConfiguration(counterarray: Long, maximumcount: UInt, count: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeQueryHardwareCounterConfiguration(counterarray, maximumcount.toInt(), count)

public actual fun KeQueryHighestNodeNumber(): UShort =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeQueryHighestNodeNumber().toUShort()

public actual fun KeQueryInterruptTimePrecise(qpctimestamp: Long): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeQueryInterruptTimePrecise(qpctimestamp).toULong()

public actual fun KeQueryLogicalProcessorRelationship(processornumber: Long, relationshiptype: LOGICAL_PROCESSOR_RELATIONSHIP, information: Long, length: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeQueryLogicalProcessorRelationship(processornumber, relationshiptype, information, length)

public actual fun KeQueryMaximumGroupCount(): UShort =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeQueryMaximumGroupCount().toUShort()

public actual fun KeQueryMaximumProcessorCount(): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeQueryMaximumProcessorCount().toUInt()

public actual fun KeQueryMaximumProcessorCountEx(groupnumber: UShort): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeQueryMaximumProcessorCountEx(groupnumber.toShort()).toUInt()

public actual fun KeQueryNodeActiveAffinity(nodenumber: UShort, affinity: Long, count: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeQueryNodeActiveAffinity(nodenumber.toShort(), affinity, count)
}

public actual fun KeQueryNodeActiveAffinity2(nodenumber: UShort, groupaffinities: Long, groupaffinitiescount: UShort, groupaffinitiesrequired: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeQueryNodeActiveAffinity2(nodenumber.toShort(), groupaffinities, groupaffinitiescount.toShort(), groupaffinitiesrequired)

public actual fun KeQueryNodeActiveProcessorCount(nodenumber: UShort): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeQueryNodeActiveProcessorCount(nodenumber.toShort()).toUInt()

public actual fun KeQueryNodeMaximumProcessorCount(nodenumber: UShort): UShort =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeQueryNodeMaximumProcessorCount(nodenumber.toShort()).toUShort()

public actual fun KeQueryPerformanceCounter(performancefrequency: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeQueryPerformanceCounter(performancefrequency)

public actual fun KeQueryPriorityThread(thread: PKTHREAD): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeQueryPriorityThread(thread)

public actual fun KeQueryRuntimeThread(thread: PKTHREAD, usertime: Long): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeQueryRuntimeThread(thread, usertime).toUInt()

public actual fun KeQuerySystemTimePrecise(currenttime: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeQuerySystemTimePrecise(currenttime)
}

public actual fun KeQueryTimeIncrement(): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeQueryTimeIncrement().toUInt()

public actual fun KeQueryTotalCycleTimeThread(thread: PKTHREAD, cycletimestamp: Long): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeQueryTotalCycleTimeThread(thread, cycletimestamp).toULong()

public actual fun KeQueryUnbiasedInterruptTime(): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeQueryUnbiasedInterruptTime().toULong()

public actual fun KeQueryUnbiasedInterruptTimePrecise(qpctimestamp: Long): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeQueryUnbiasedInterruptTimePrecise(qpctimestamp).toULong()

public actual fun KeReadStateEvent(event: Long): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeReadStateEvent(event)

public actual fun KeReadStateMutex(mutex: Long): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeReadStateMutex(mutex)

public actual fun KeReadStateSemaphore(semaphore: Long): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeReadStateSemaphore(semaphore)

public actual fun KeReadStateTimer(timer: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeReadStateTimer(timer)

public actual fun KeRegisterBoundCallback(callbackroutine: PBOUND_CALLBACK): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeRegisterBoundCallback(callbackroutine.toLong())

public actual fun KeRegisterBugCheckCallback(callbackrecord: Long, callbackroutine: PKBUGCHECK_CALLBACK_ROUTINE, buffer: Long, length: UInt, component: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeRegisterBugCheckCallback(callbackrecord, callbackroutine.toLong(), buffer, length.toInt(), component)

public actual fun KeRegisterBugCheckReasonCallback(callbackrecord: Long, callbackroutine: PKBUGCHECK_REASON_CALLBACK_ROUTINE, reason: KBUGCHECK_CALLBACK_REASON, component: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeRegisterBugCheckReasonCallback(callbackrecord, callbackroutine.toLong(), reason, component)

public actual fun KeRegisterNmiCallback(callbackroutine: PNMI_CALLBACK, context: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeRegisterNmiCallback(callbackroutine.toLong(), context)

public actual fun KeRegisterProcessorChangeCallback(callbackfunction: PPROCESSOR_CALLBACK_FUNCTION, callbackcontext: Long, flags: UInt): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeRegisterProcessorChangeCallback(callbackfunction.toLong(), callbackcontext, flags.toInt())

public actual fun KeReleaseGuardedMutex(mutex: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeReleaseGuardedMutex(mutex)
}

public actual fun KeReleaseGuardedMutexUnsafe(fastmutex: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeReleaseGuardedMutexUnsafe(fastmutex)
}

public actual fun KeReleaseInStackQueuedSpinLock(lockhandle: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeReleaseInStackQueuedSpinLock(lockhandle)
}

public actual fun KeReleaseInStackQueuedSpinLockForDpc(lockhandle: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeReleaseInStackQueuedSpinLockForDpc(lockhandle)
}

public actual fun KeReleaseInStackQueuedSpinLockFromDpcLevel(lockhandle: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeReleaseInStackQueuedSpinLockFromDpcLevel(lockhandle)
}

public actual fun KeReleaseInterruptSpinLock(interrupt: PKINTERRUPT, oldirql: UByte) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeReleaseInterruptSpinLock(interrupt, oldirql.toByte())
}

public actual fun KeReleaseMutex(mutex: Long, wait: Boolean): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeReleaseMutex(mutex, wait)

public actual fun KeReleaseSemaphore(semaphore: Long, increment: Int, adjustment: Int, wait: Boolean): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeReleaseSemaphore(semaphore, increment, adjustment, wait)

public actual fun KeReleaseSpinLockForDpc(spinlock: Long, oldirql: UByte) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeReleaseSpinLockForDpc(spinlock, oldirql.toByte())
}

public actual fun KeRemoveByKeyDeviceQueue(devicequeue: Long, sortkey: UInt): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeRemoveByKeyDeviceQueue(devicequeue, sortkey.toInt())

public actual fun KeRemoveByKeyDeviceQueueIfBusy(devicequeue: Long, sortkey: UInt): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeRemoveByKeyDeviceQueueIfBusy(devicequeue, sortkey.toInt())

public actual fun KeRemoveDeviceQueue(devicequeue: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeRemoveDeviceQueue(devicequeue)

public actual fun KeRemoveEntryDeviceQueue(devicequeue: Long, devicequeueentry: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeRemoveEntryDeviceQueue(devicequeue, devicequeueentry)

public actual fun KeRemoveQueueDpc(dpc: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeRemoveQueueDpc(dpc)

public actual fun KeRemoveQueueDpcEx(dpc: Long, waitifactive: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeRemoveQueueDpcEx(dpc, waitifactive)

public actual fun KeResetEvent(event: Long): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeResetEvent(event)

public actual fun KeRestoreExtendedProcessorState(xstatesave: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeRestoreExtendedProcessorState(xstatesave)
}

public actual fun KeRevertToUserAffinityThread() {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeRevertToUserAffinityThread()
}

public actual fun KeRevertToUserAffinityThreadEx(affinity: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeRevertToUserAffinityThreadEx(affinity.toLong())
}

public actual fun KeRevertToUserGroupAffinityThread(previousaffinity: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeRevertToUserGroupAffinityThread(previousaffinity)
}

public actual fun KeSaveExtendedProcessorState(mask: ULong, xstatesave: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeSaveExtendedProcessorState(mask.toLong(), xstatesave)

public actual fun KeSetBasePriorityThread(thread: PKTHREAD, increment: Int): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeSetBasePriorityThread(thread, increment)

public actual fun KeSetCoalescableTimer(timer: Long, duetime: Long, period: UInt, tolerabledelay: UInt, dpc: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeSetCoalescableTimer(timer, duetime, period.toInt(), tolerabledelay.toInt(), dpc)

public actual fun KeSetEvent(event: Long, increment: Int, wait: Boolean): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeSetEvent(event, increment, wait)

public actual fun KeSetHardwareCounterConfiguration(counterarray: Long, count: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeSetHardwareCounterConfiguration(counterarray, count.toInt())

public actual fun KeSetImportanceDpc(dpc: Long, importance: KDPC_IMPORTANCE) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeSetImportanceDpc(dpc, importance)
}

public actual fun KeSetPriorityThread(thread: PKTHREAD, priority: Int): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeSetPriorityThread(thread, priority)

public actual fun KeSetSystemAffinityThread(affinity: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeSetSystemAffinityThread(affinity.toLong())
}

public actual fun KeSetSystemAffinityThreadEx(affinity: ULong): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeSetSystemAffinityThreadEx(affinity.toLong()).toULong()

public actual fun KeSetSystemGroupAffinityThread(affinity: Long, previousaffinity: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeSetSystemGroupAffinityThread(affinity, previousaffinity)
}

public actual fun KeSetTargetProcessorDpc(dpc: Long, number: Byte) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeSetTargetProcessorDpc(dpc, number)
}

public actual fun KeSetTargetProcessorDpcEx(dpc: Long, procnumber: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeSetTargetProcessorDpcEx(dpc, procnumber)

public actual fun KeSetTimer(timer: Long, duetime: Long, dpc: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeSetTimer(timer, duetime, dpc)

public actual fun KeSetTimerEx(timer: Long, duetime: Long, period: Int, dpc: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeSetTimerEx(timer, duetime, period, dpc)

public actual fun KeShouldYieldProcessor(): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeShouldYieldProcessor().toUInt()

public actual fun KeStallExecutionProcessor(microseconds: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeStallExecutionProcessor(microseconds.toInt())
}

public actual fun KeSynchronizeExecution(interrupt: PKINTERRUPT, synchronizeroutine: PKSYNCHRONIZE_ROUTINE, synchronizecontext: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeSynchronizeExecution(interrupt, synchronizeroutine.toLong(), synchronizecontext)

public actual fun KeTestSpinLock(spinlock: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeTestSpinLock(spinlock)

public actual fun KeTryToAcquireGuardedMutex(mutex: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeTryToAcquireGuardedMutex(mutex)

public actual fun KeTryToAcquireSpinLockAtDpcLevel(spinlock: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeTryToAcquireSpinLockAtDpcLevel(spinlock)

public actual fun KeWaitForMultipleObjects(count: UInt, obj: Long, waittype: WAIT_TYPE, waitreason: KWAIT_REASON, waitmode: Byte, alertable: Boolean, timeout: Long, waitblockarray: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeWaitForMultipleObjects(count.toInt(), obj, waittype, waitreason, waitmode, alertable, timeout, waitblockarray)

public actual fun KeWaitForSingleObject(obj: Long, waitreason: KWAIT_REASON, waitmode: Byte, alertable: Boolean, timeout: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KeWaitForSingleObject(obj, waitreason, waitmode, alertable, timeout)

public actual fun KfRaiseIrql(newirql: UByte): UByte =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_KfRaiseIrql(newirql.toByte()).toUByte()

public actual fun MmAddPhysicalMemory(startaddress: Long, numberofbytes: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmAddPhysicalMemory(startaddress, numberofbytes)

public actual fun MmAddVerifierSpecialThunks(entryroutine: ULong, thunkbuffer: Long, thunkbuffersize: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmAddVerifierSpecialThunks(entryroutine.toLong(), thunkbuffer, thunkbuffersize.toInt())

public actual fun MmAddVerifierThunks(thunkbuffer: Long, thunkbuffersize: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmAddVerifierThunks(thunkbuffer, thunkbuffersize.toInt())

public actual fun MmAdvanceMdl(mdl: Long, numberofbytes: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmAdvanceMdl(mdl, numberofbytes.toInt())

public actual fun MmAllocateContiguousMemory(numberofbytes: ULong, highestacceptableaddress: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmAllocateContiguousMemory(numberofbytes.toLong(), highestacceptableaddress)

public actual fun MmAllocateContiguousMemoryEx(numberofbytes: Long, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, preferrednode: UInt, protect: UInt, partitionobject: Long, tag: UInt, flags: UInt, baseaddress: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmAllocateContiguousMemoryEx(numberofbytes, lowestacceptableaddress, highestacceptableaddress, boundaryaddressmultiple, preferrednode.toInt(), protect.toInt(), partitionobject, tag.toInt(), flags.toInt(), baseaddress)

public actual fun MmAllocateContiguousMemorySpecifyCache(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, cachetype: MEMORY_CACHING_TYPE): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmAllocateContiguousMemorySpecifyCache(numberofbytes.toLong(), lowestacceptableaddress, highestacceptableaddress, boundaryaddressmultiple, cachetype)

public actual fun MmAllocateContiguousMemorySpecifyCacheNode(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, cachetype: MEMORY_CACHING_TYPE, preferrednode: UInt): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmAllocateContiguousMemorySpecifyCacheNode(numberofbytes.toLong(), lowestacceptableaddress, highestacceptableaddress, boundaryaddressmultiple, cachetype, preferrednode.toInt())

public actual fun MmAllocateContiguousNodeMemory(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, protect: UInt, preferrednode: UInt): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmAllocateContiguousNodeMemory(numberofbytes.toLong(), lowestacceptableaddress, highestacceptableaddress, boundaryaddressmultiple, protect.toInt(), preferrednode.toInt())

public actual fun MmAllocateMappingAddress(numberofbytes: ULong, pooltag: UInt): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmAllocateMappingAddress(numberofbytes.toLong(), pooltag.toInt())

public actual fun MmAllocateMappingAddressEx(numberofbytes: ULong, pooltag: UInt, flags: UInt): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmAllocateMappingAddressEx(numberofbytes.toLong(), pooltag.toInt(), flags.toInt())

public actual fun MmAllocateMdlForIoSpace(physicaladdresslist: Long, numberofentries: ULong, newmdl: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmAllocateMdlForIoSpace(physicaladdresslist, numberofentries.toLong(), newmdl)

public actual fun MmAllocateNodePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MEMORY_CACHING_TYPE, idealnode: UInt, flags: UInt): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmAllocateNodePagesForMdlEx(lowaddress, highaddress, skipbytes, totalbytes.toLong(), cachetype, idealnode.toInt(), flags.toInt())

public actual fun MmAllocateNonCachedMemory(numberofbytes: ULong): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmAllocateNonCachedMemory(numberofbytes.toLong())

public actual fun MmAllocatePagesForMdl(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmAllocatePagesForMdl(lowaddress, highaddress, skipbytes, totalbytes.toLong())

public actual fun MmAllocatePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MEMORY_CACHING_TYPE, flags: UInt): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmAllocatePagesForMdlEx(lowaddress, highaddress, skipbytes, totalbytes.toLong(), cachetype, flags.toInt())

public actual fun MmAllocatePartitionNodePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MEMORY_CACHING_TYPE, idealnode: UInt, flags: UInt, partitionobject: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmAllocatePartitionNodePagesForMdlEx(lowaddress, highaddress, skipbytes, totalbytes.toLong(), cachetype, idealnode.toInt(), flags.toInt(), partitionobject)

public actual fun MmAreMdlPagesCached(memorydescriptorlist: Long): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmAreMdlPagesCached(memorydescriptorlist).toUInt()

public actual fun MmBuildMdlForNonPagedPool(memorydescriptorlist: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmBuildMdlForNonPagedPool(memorydescriptorlist)
}

public actual fun MmCopyMemory(targetaddress: Long, sourceaddress: MM_COPY_ADDRESS, numberofbytes: ULong, flags: UInt, numberofbytestransferred: Long): NTSTATUS =
    0

public actual fun MmCreateMdl(memorydescriptorlist: Long, base: Long, length: ULong): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmCreateMdl(memorydescriptorlist, base, length.toLong())

public actual fun MmCreateMirror(): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmCreateMirror()

public actual fun MmFreeContiguousMemory(baseaddress: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmFreeContiguousMemory(baseaddress)
}

public actual fun MmFreeContiguousMemorySpecifyCache(baseaddress: Long, numberofbytes: ULong, cachetype: MEMORY_CACHING_TYPE) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmFreeContiguousMemorySpecifyCache(baseaddress, numberofbytes.toLong(), cachetype)
}

public actual fun MmFreeMappingAddress(baseaddress: Long, pooltag: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmFreeMappingAddress(baseaddress, pooltag.toInt())
}

public actual fun MmFreeNonCachedMemory(baseaddress: Long, numberofbytes: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmFreeNonCachedMemory(baseaddress, numberofbytes.toLong())
}

public actual fun MmFreePagesFromMdl(memorydescriptorlist: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmFreePagesFromMdl(memorydescriptorlist)
}

public actual fun MmFreePagesFromMdlEx(memorydescriptorlist: Long, flags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmFreePagesFromMdlEx(memorydescriptorlist, flags.toInt())
}

public actual fun MmGetCacheAttribute(physicaladdress: Long, cachetype: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmGetCacheAttribute(physicaladdress, cachetype)

public actual fun MmGetCacheAttributeEx(physicaladdress: Long, flags: UInt, cachetype: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmGetCacheAttributeEx(physicaladdress, flags.toInt(), cachetype)

public actual fun MmGetPhysicalAddress(baseaddress: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmGetPhysicalAddress(baseaddress)

public actual fun MmGetPhysicalMemoryRanges(): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmGetPhysicalMemoryRanges()

public actual fun MmGetPhysicalMemoryRangesEx(partitionobject: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmGetPhysicalMemoryRangesEx(partitionobject)

public actual fun MmGetPhysicalMemoryRangesEx2(partitionobject: Long, flags: UInt): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmGetPhysicalMemoryRangesEx2(partitionobject, flags.toInt())

public actual fun MmGetSystemRoutineAddress(systemroutinename: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmGetSystemRoutineAddress(systemroutinename)

public actual fun MmGetVirtualForPhysical(physicaladdress: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmGetVirtualForPhysical(physicaladdress)

public actual fun MmIsAddressValid(virtualaddress: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmIsAddressValid(virtualaddress)

public actual fun MmIsDriverSuspectForVerifier(driverobject: Long): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmIsDriverSuspectForVerifier(driverobject).toUInt()

public actual fun MmIsDriverVerifying(driverobject: Long): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmIsDriverVerifying(driverobject).toUInt()

public actual fun MmIsDriverVerifyingByAddress(addresswithinsection: Long): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmIsDriverVerifyingByAddress(addresswithinsection).toUInt()

public actual fun MmIsIoSpaceActive(startaddress: Long, numberofbytes: ULong): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmIsIoSpaceActive(startaddress, numberofbytes.toLong()).toUInt()

public actual fun MmIsNonPagedSystemAddressValid(virtualaddress: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmIsNonPagedSystemAddressValid(virtualaddress)

public actual fun MmIsThisAnNtAsSystem(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmIsThisAnNtAsSystem()

public actual fun MmIsVerifierEnabled(verifierflags: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmIsVerifierEnabled(verifierflags)

public actual fun MmLockPagableDataSection(addresswithinsection: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmLockPagableDataSection(addresswithinsection)

public actual fun MmLockPagableSectionByHandle(imagesectionhandle: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmLockPagableSectionByHandle(imagesectionhandle)
}

public actual fun MmMapIoSpace(physicaladdress: Long, numberofbytes: ULong, cachetype: MEMORY_CACHING_TYPE): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmMapIoSpace(physicaladdress, numberofbytes.toLong(), cachetype)

public actual fun MmMapIoSpaceEx(physicaladdress: Long, numberofbytes: ULong, protect: UInt): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmMapIoSpaceEx(physicaladdress, numberofbytes.toLong(), protect.toInt())

public actual fun MmMapLockedPages(memorydescriptorlist: Long, accessmode: Byte): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmMapLockedPages(memorydescriptorlist, accessmode)

public actual fun MmMapLockedPagesSpecifyCache(memorydescriptorlist: Long, accessmode: Byte, cachetype: MEMORY_CACHING_TYPE, requestedaddress: Long, bugcheckonfailure: UInt, priority: UInt): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmMapLockedPagesSpecifyCache(memorydescriptorlist, accessmode, cachetype, requestedaddress, bugcheckonfailure.toInt(), priority.toInt())

public actual fun MmMapLockedPagesWithReservedMapping(mappingaddress: Long, pooltag: UInt, memorydescriptorlist: Long, cachetype: MEMORY_CACHING_TYPE): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmMapLockedPagesWithReservedMapping(mappingaddress, pooltag.toInt(), memorydescriptorlist, cachetype)

public actual fun MmMapMdl(memorydescriptorlist: Long, protection: UInt, driverroutine: PMM_MDL_ROUTINE, drivercontext: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmMapMdl(memorydescriptorlist, protection.toInt(), driverroutine.toLong(), drivercontext)

public actual fun MmMapMemoryDumpMdlEx(va: Long, pagetotal: UInt, memorydumpmdl: Long, flags: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmMapMemoryDumpMdlEx(va, pagetotal.toInt(), memorydumpmdl, flags.toInt())

public actual fun MmMapUserAddressesToPage(baseaddress: Long, numberofbytes: ULong, pageaddress: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmMapUserAddressesToPage(baseaddress, numberofbytes.toLong(), pageaddress)

public actual fun MmMapVideoDisplay(physicaladdress: Long, numberofbytes: ULong, cachetype: MEMORY_CACHING_TYPE): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmMapVideoDisplay(physicaladdress, numberofbytes.toLong(), cachetype)

public actual fun MmMapViewInSessionSpace(section: Long, mappedbase: Long, viewsize: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmMapViewInSessionSpace(section, mappedbase, viewsize)

public actual fun MmMapViewInSessionSpaceEx(section: Long, mappedbase: Long, viewsize: Long, sectionoffset: Long, flags: ULong): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmMapViewInSessionSpaceEx(section, mappedbase, viewsize, sectionoffset, flags.toLong())

public actual fun MmMapViewInSystemSpace(section: Long, mappedbase: Long, viewsize: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmMapViewInSystemSpace(section, mappedbase, viewsize)

public actual fun MmMapViewInSystemSpaceEx(section: Long, mappedbase: Long, viewsize: Long, sectionoffset: Long, flags: ULong): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmMapViewInSystemSpaceEx(section, mappedbase, viewsize, sectionoffset, flags.toLong())

public actual fun MmMdlPageContentsState(memorydescriptorlist: Long, state: MM_MDL_PAGE_CONTENTS_STATE): MM_MDL_PAGE_CONTENTS_STATE =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmMdlPageContentsState(memorydescriptorlist, state)

public actual fun MmPageEntireDriver(addresswithinsection: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmPageEntireDriver(addresswithinsection)

public actual fun MmProbeAndLockPages(memorydescriptorlist: Long, accessmode: Byte, operation: LOCK_OPERATION) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmProbeAndLockPages(memorydescriptorlist, accessmode, operation)
}

public actual fun MmProbeAndLockProcessPages(memorydescriptorlist: Long, process: PEPROCESS, accessmode: Byte, operation: LOCK_OPERATION) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmProbeAndLockProcessPages(memorydescriptorlist, process, accessmode, operation)
}

public actual fun MmProbeAndLockSelectedPages(memorydescriptorlist: Long, segmentarray: Long, accessmode: Byte, operation: LOCK_OPERATION) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmProbeAndLockSelectedPages(memorydescriptorlist, segmentarray, accessmode, operation)
}

public actual fun MmProtectDriverSection(addresswithinsection: Long, size: ULong, flags: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmProtectDriverSection(addresswithinsection, size.toLong(), flags.toInt())

public actual fun MmProtectMdlSystemAddress(memorydescriptorlist: Long, newprotect: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmProtectMdlSystemAddress(memorydescriptorlist, newprotect.toInt())

public actual fun MmQuerySystemSize(): MM_SYSTEMSIZE =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmQuerySystemSize()

public actual fun MmRemovePhysicalMemory(startaddress: Long, numberofbytes: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmRemovePhysicalMemory(startaddress, numberofbytes)

public actual fun MmResetDriverPaging(addresswithinsection: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmResetDriverPaging(addresswithinsection)
}

public actual fun MmRotatePhysicalView(virtualaddress: Long, numberofbytes: Long, newmdl: Long, direction: MM_ROTATE_DIRECTION, copyfunction: PMM_ROTATE_COPY_CALLBACK_FUNCTION, context: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmRotatePhysicalView(virtualaddress, numberofbytes, newmdl, direction, copyfunction.toLong(), context)

public actual fun MmSecureVirtualMemory(address: Long, size: ULong, probemode: UInt): HANDLE =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmSecureVirtualMemory(address, size.toLong(), probemode.toInt())

public actual fun MmSecureVirtualMemoryEx(address: Long, size: ULong, probemode: UInt, flags: UInt): HANDLE =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmSecureVirtualMemoryEx(address, size.toLong(), probemode.toInt(), flags.toInt())

public actual fun MmSetPermanentCacheAttribute(startaddress: Long, numberofbytes: Long, cachetype: MEMORY_CACHING_TYPE, flags: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmSetPermanentCacheAttribute(startaddress, numberofbytes, cachetype, flags.toInt())

public actual fun MmSizeOfMdl(base: Long, length: ULong): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmSizeOfMdl(base, length.toLong()).toULong()

public actual fun MmUnlockPagableImageSection(imagesectionhandle: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmUnlockPagableImageSection(imagesectionhandle)
}

public actual fun MmUnlockPages(memorydescriptorlist: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmUnlockPages(memorydescriptorlist)
}

public actual fun MmUnmapIoSpace(baseaddress: Long, numberofbytes: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmUnmapIoSpace(baseaddress, numberofbytes.toLong())
}

public actual fun MmUnmapLockedPages(baseaddress: Long, memorydescriptorlist: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmUnmapLockedPages(baseaddress, memorydescriptorlist)
}

public actual fun MmUnmapReservedMapping(baseaddress: Long, pooltag: UInt, memorydescriptorlist: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmUnmapReservedMapping(baseaddress, pooltag.toInt(), memorydescriptorlist)
}

public actual fun MmUnmapVideoDisplay(baseaddress: Long, numberofbytes: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmUnmapVideoDisplay(baseaddress, numberofbytes.toLong())
}

public actual fun MmUnmapViewInSessionSpace(mappedbase: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmUnmapViewInSessionSpace(mappedbase)

public actual fun MmUnmapViewInSystemSpace(mappedbase: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmUnmapViewInSystemSpace(mappedbase)

public actual fun MmUnsecureVirtualMemory(securehandle: HANDLE) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_MmUnsecureVirtualMemory(securehandle)
}

public actual fun NtAllocateLocallyUniqueId(luid: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtAllocateLocallyUniqueId(luid)

public actual fun NtCommitComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtCommitComplete(enlistmenthandle, tmvirtualclock)

public actual fun NtCommitEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtCommitEnlistment(enlistmenthandle, tmvirtualclock)

public actual fun NtCommitTransaction(transactionhandle: HANDLE, wait: Boolean): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtCommitTransaction(transactionhandle, wait)

public actual fun NtCreateEnlistment(enlistmenthandle: Long, desiredaccess: UInt, resourcemanagerhandle: HANDLE, transactionhandle: HANDLE, objectattributes: Long, createoptions: UInt, notificationmask: UInt, enlistmentkey: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtCreateEnlistment(enlistmenthandle, desiredaccess.toInt(), resourcemanagerhandle, transactionhandle, objectattributes, createoptions.toInt(), notificationmask.toInt(), enlistmentkey)

public actual fun NtCreateResourceManager(resourcemanagerhandle: Long, desiredaccess: UInt, tmhandle: HANDLE, rmguid: Long, objectattributes: Long, createoptions: UInt, description: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtCreateResourceManager(resourcemanagerhandle, desiredaccess.toInt(), tmhandle, rmguid, objectattributes, createoptions.toInt(), description)

public actual fun NtCreateTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long, uow: Long, tmhandle: HANDLE, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: Long, description: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtCreateTransaction(transactionhandle, desiredaccess.toInt(), objectattributes, uow, tmhandle, createoptions.toInt(), isolationlevel.toInt(), isolationflags.toInt(), timeout, description)

public actual fun NtCreateTransactionManager(tmhandle: Long, desiredaccess: UInt, objectattributes: Long, logfilename: Long, createoptions: UInt, commitstrength: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtCreateTransactionManager(tmhandle, desiredaccess.toInt(), objectattributes, logfilename, createoptions.toInt(), commitstrength.toInt())

public actual fun NtDisplayString(string: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtDisplayString(string)

public actual fun NtEnumerateTransactionObject(rootobjecthandle: HANDLE, querytype: KTMOBJECT_TYPE, objectcursor: Long, objectcursorlength: UInt, returnlength: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtEnumerateTransactionObject(rootobjecthandle, querytype, objectcursor, objectcursorlength.toInt(), returnlength)

public actual fun NtGetNotificationResourceManager(resourcemanagerhandle: HANDLE, transactionnotification: Long, notificationlength: UInt, timeout: Long, returnlength: Long, asynchronous: UInt, asynchronouscontext: ULong): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtGetNotificationResourceManager(resourcemanagerhandle, transactionnotification, notificationlength.toInt(), timeout, returnlength, asynchronous.toInt(), asynchronouscontext.toLong())

public actual fun NtLoadDriver(driverservicename: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtLoadDriver(driverservicename)

public actual fun NtMakeTemporaryObject(handle: HANDLE): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtMakeTemporaryObject(handle)

public actual fun NtManagePartition(targethandle: HANDLE, sourcehandle: HANDLE, partitioninformationclass: PARTITION_INFORMATION_CLASS, partitioninformation: Long, partitioninformationlength: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtManagePartition(targethandle, sourcehandle, partitioninformationclass, partitioninformation, partitioninformationlength.toInt())

public actual fun NtOpenEnlistment(enlistmenthandle: Long, desiredaccess: UInt, resourcemanagerhandle: HANDLE, enlistmentguid: Long, objectattributes: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtOpenEnlistment(enlistmenthandle, desiredaccess.toInt(), resourcemanagerhandle, enlistmentguid, objectattributes)

public actual fun NtOpenResourceManager(resourcemanagerhandle: Long, desiredaccess: UInt, tmhandle: HANDLE, resourcemanagerguid: Long, objectattributes: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtOpenResourceManager(resourcemanagerhandle, desiredaccess.toInt(), tmhandle, resourcemanagerguid, objectattributes)

public actual fun NtOpenTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long, uow: Long, tmhandle: HANDLE): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtOpenTransaction(transactionhandle, desiredaccess.toInt(), objectattributes, uow, tmhandle)

public actual fun NtOpenTransactionManager(tmhandle: Long, desiredaccess: UInt, objectattributes: Long, logfilename: Long, tmidentity: Long, openoptions: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtOpenTransactionManager(tmhandle, desiredaccess.toInt(), objectattributes, logfilename, tmidentity, openoptions.toInt())

public actual fun NtPowerInformation(informationlevel: POWER_INFORMATION_LEVEL, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtPowerInformation(informationlevel, inputbuffer, inputbufferlength.toInt(), outputbuffer, outputbufferlength.toInt())

public actual fun NtPrePrepareComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtPrePrepareComplete(enlistmenthandle, tmvirtualclock)

public actual fun NtPrePrepareEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtPrePrepareEnlistment(enlistmenthandle, tmvirtualclock)

public actual fun NtPrepareComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtPrepareComplete(enlistmenthandle, tmvirtualclock)

public actual fun NtPrepareEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtPrepareEnlistment(enlistmenthandle, tmvirtualclock)

public actual fun NtPropagationComplete(resourcemanagerhandle: HANDLE, requestcookie: UInt, bufferlength: UInt, buffer: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtPropagationComplete(resourcemanagerhandle, requestcookie.toInt(), bufferlength.toInt(), buffer)

public actual fun NtPropagationFailed(resourcemanagerhandle: HANDLE, requestcookie: UInt, propstatus: NTSTATUS): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtPropagationFailed(resourcemanagerhandle, requestcookie.toInt(), propstatus)

public actual fun NtQueryInformationEnlistment(enlistmenthandle: HANDLE, enlistmentinformationclass: ENLISTMENT_INFORMATION_CLASS, enlistmentinformation: Long, enlistmentinformationlength: UInt, returnlength: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtQueryInformationEnlistment(enlistmenthandle, enlistmentinformationclass, enlistmentinformation, enlistmentinformationlength.toInt(), returnlength)

public actual fun NtQueryInformationResourceManager(resourcemanagerhandle: HANDLE, resourcemanagerinformationclass: RESOURCEMANAGER_INFORMATION_CLASS, resourcemanagerinformation: Long, resourcemanagerinformationlength: UInt, returnlength: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtQueryInformationResourceManager(resourcemanagerhandle, resourcemanagerinformationclass, resourcemanagerinformation, resourcemanagerinformationlength.toInt(), returnlength)

public actual fun NtQueryInformationTransaction(transactionhandle: HANDLE, transactioninformationclass: TRANSACTION_INFORMATION_CLASS, transactioninformation: Long, transactioninformationlength: UInt, returnlength: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtQueryInformationTransaction(transactionhandle, transactioninformationclass, transactioninformation, transactioninformationlength.toInt(), returnlength)

public actual fun NtQueryInformationTransactionManager(transactionmanagerhandle: HANDLE, transactionmanagerinformationclass: TRANSACTIONMANAGER_INFORMATION_CLASS, transactionmanagerinformation: Long, transactionmanagerinformationlength: UInt, returnlength: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtQueryInformationTransactionManager(transactionmanagerhandle, transactionmanagerinformationclass, transactionmanagerinformation, transactionmanagerinformationlength.toInt(), returnlength)

public actual fun NtReadOnlyEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtReadOnlyEnlistment(enlistmenthandle, tmvirtualclock)

public actual fun NtRecoverEnlistment(enlistmenthandle: HANDLE, enlistmentkey: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtRecoverEnlistment(enlistmenthandle, enlistmentkey)

public actual fun NtRecoverResourceManager(resourcemanagerhandle: HANDLE): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtRecoverResourceManager(resourcemanagerhandle)

public actual fun NtRecoverTransactionManager(transactionmanagerhandle: HANDLE): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtRecoverTransactionManager(transactionmanagerhandle)

public actual fun NtRegisterProtocolAddressInformation(resourcemanager: HANDLE, protocolid: Long, protocolinformationsize: UInt, protocolinformation: Long, createoptions: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtRegisterProtocolAddressInformation(resourcemanager, protocolid, protocolinformationsize.toInt(), protocolinformation, createoptions.toInt())

public actual fun NtRenameTransactionManager(logfilename: Long, existingtransactionmanagerguid: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtRenameTransactionManager(logfilename, existingtransactionmanagerguid)

public actual fun NtRollbackComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtRollbackComplete(enlistmenthandle, tmvirtualclock)

public actual fun NtRollbackEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtRollbackEnlistment(enlistmenthandle, tmvirtualclock)

public actual fun NtRollbackTransaction(transactionhandle: HANDLE, wait: Boolean): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtRollbackTransaction(transactionhandle, wait)

public actual fun NtRollforwardTransactionManager(transactionmanagerhandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtRollforwardTransactionManager(transactionmanagerhandle, tmvirtualclock)

public actual fun NtSetInformationEnlistment(enlistmenthandle: HANDLE, enlistmentinformationclass: ENLISTMENT_INFORMATION_CLASS, enlistmentinformation: Long, enlistmentinformationlength: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtSetInformationEnlistment(enlistmenthandle, enlistmentinformationclass, enlistmentinformation, enlistmentinformationlength.toInt())

public actual fun NtSetInformationResourceManager(resourcemanagerhandle: HANDLE, resourcemanagerinformationclass: RESOURCEMANAGER_INFORMATION_CLASS, resourcemanagerinformation: Long, resourcemanagerinformationlength: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtSetInformationResourceManager(resourcemanagerhandle, resourcemanagerinformationclass, resourcemanagerinformation, resourcemanagerinformationlength.toInt())

public actual fun NtSetInformationTransaction(transactionhandle: HANDLE, transactioninformationclass: TRANSACTION_INFORMATION_CLASS, transactioninformation: Long, transactioninformationlength: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtSetInformationTransaction(transactionhandle, transactioninformationclass, transactioninformation, transactioninformationlength.toInt())

public actual fun NtSetInformationTransactionManager(tmhandle: HANDLE, transactionmanagerinformationclass: TRANSACTIONMANAGER_INFORMATION_CLASS, transactionmanagerinformation: Long, transactionmanagerinformationlength: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtSetInformationTransactionManager(tmhandle, transactionmanagerinformationclass, transactionmanagerinformation, transactionmanagerinformationlength.toInt())

public actual fun NtSinglePhaseReject(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtSinglePhaseReject(enlistmenthandle, tmvirtualclock)

public actual fun NtUnloadDriver(driverservicename: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_NtUnloadDriver(driverservicename)

public actual fun ObCloseHandle(handle: HANDLE, previousmode: Byte): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ObCloseHandle(handle, previousmode)

public actual fun ObDereferenceObjectDeferDelete(obj: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ObDereferenceObjectDeferDelete(obj)
}

public actual fun ObDereferenceObjectDeferDeleteWithTag(obj: Long, tag: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ObDereferenceObjectDeferDeleteWithTag(obj, tag.toInt())
}

public actual fun ObGetFilterVersion(): UShort =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ObGetFilterVersion().toUShort()

public actual fun ObGetObjectSecurity(obj: Long, securitydescriptor: Long, memoryallocated: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ObGetObjectSecurity(obj, securitydescriptor, memoryallocated)

public actual fun ObReferenceObjectByHandle(handle: HANDLE, desiredaccess: UInt, objecttype: POBJECT_TYPE, accessmode: Byte, obj: Long, handleinformation: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ObReferenceObjectByHandle(handle, desiredaccess.toInt(), objecttype, accessmode, obj, handleinformation)

public actual fun ObReferenceObjectByHandleWithTag(handle: HANDLE, desiredaccess: UInt, objecttype: POBJECT_TYPE, accessmode: Byte, tag: UInt, obj: Long, handleinformation: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ObReferenceObjectByHandleWithTag(handle, desiredaccess.toInt(), objecttype, accessmode, tag.toInt(), obj, handleinformation)

public actual fun ObReferenceObjectByPointer(obj: Long, desiredaccess: UInt, objecttype: POBJECT_TYPE, accessmode: Byte): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ObReferenceObjectByPointer(obj, desiredaccess.toInt(), objecttype, accessmode)

public actual fun ObReferenceObjectByPointerWithTag(obj: Long, desiredaccess: UInt, objecttype: POBJECT_TYPE, accessmode: Byte, tag: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ObReferenceObjectByPointerWithTag(obj, desiredaccess.toInt(), objecttype, accessmode, tag.toInt())

public actual fun ObReferenceObjectSafe(obj: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ObReferenceObjectSafe(obj)

public actual fun ObReferenceObjectSafeWithTag(obj: Long, tag: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ObReferenceObjectSafeWithTag(obj, tag.toInt())

public actual fun ObRegisterCallbacks(callbackregistration: Long, registrationhandle: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ObRegisterCallbacks(callbackregistration, registrationhandle)

public actual fun ObReleaseObjectSecurity(securitydescriptor: PSECURITY_DESCRIPTOR, memoryallocated: Boolean) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ObReleaseObjectSecurity(securitydescriptor, memoryallocated)
}

public actual fun ObUnRegisterCallbacks(registrationhandle: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ObUnRegisterCallbacks(registrationhandle)
}

public actual fun ObfDereferenceObject(obj: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ObfDereferenceObject(obj)

public actual fun ObfDereferenceObjectWithTag(obj: Long, tag: UInt): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ObfDereferenceObjectWithTag(obj, tag.toInt())

public actual fun ObfReferenceObject(obj: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ObfReferenceObject(obj)

public actual fun ObfReferenceObjectWithTag(obj: Long, tag: UInt): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ObfReferenceObjectWithTag(obj, tag.toInt())

public actual fun PcwAddInstance(buffer: PPCW_BUFFER, name: Long, id: UInt, count: UInt, data: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PcwAddInstance(buffer, name, id.toInt(), count.toInt(), data)

public actual fun PcwCloseInstance(instance: PPCW_INSTANCE) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PcwCloseInstance(instance)
}

public actual fun PcwCreateInstance(instance: Long, registration: PPCW_REGISTRATION, name: Long, count: UInt, data: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PcwCreateInstance(instance, registration, name, count.toInt(), data)

public actual fun PcwRegister(registration: Long, info: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PcwRegister(registration, info)

public actual fun PcwUnregister(registration: PPCW_REGISTRATION) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PcwUnregister(registration)
}

public actual fun PoCallDriver(deviceobject: Long, irp: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoCallDriver(deviceobject, irp)

public actual fun PoClearPowerRequest(powerrequest: Long, type: POWER_REQUEST_TYPE): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoClearPowerRequest(powerrequest, type)

public actual fun PoCreatePowerRequest(powerrequest: Long, deviceobject: Long, context: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoCreatePowerRequest(powerrequest, deviceobject, context)

public actual fun PoCreateThermalRequest(thermalrequest: Long, targetdeviceobject: Long, policydeviceobject: Long, context: Long, flags: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoCreateThermalRequest(thermalrequest, targetdeviceobject, policydeviceobject, context, flags.toInt())

public actual fun PoDeletePowerRequest(powerrequest: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoDeletePowerRequest(powerrequest)
}

public actual fun PoDeleteThermalRequest(thermalrequest: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoDeleteThermalRequest(thermalrequest)
}

public actual fun PoEndDeviceBusy(idlepointer: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoEndDeviceBusy(idlepointer)
}

public actual fun PoFxActivateComponent(handle: POHANDLE, component: UInt, flags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoFxActivateComponent(handle, component.toInt(), flags.toInt())
}

public actual fun PoFxCompleteDevicePowerNotRequired(handle: POHANDLE) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoFxCompleteDevicePowerNotRequired(handle)
}

public actual fun PoFxCompleteDirectedPowerDown(handle: POHANDLE) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoFxCompleteDirectedPowerDown(handle)
}

public actual fun PoFxCompleteIdleCondition(handle: POHANDLE, component: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoFxCompleteIdleCondition(handle, component.toInt())
}

public actual fun PoFxCompleteIdleState(handle: POHANDLE, component: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoFxCompleteIdleState(handle, component.toInt())
}

public actual fun PoFxIdleComponent(handle: POHANDLE, component: UInt, flags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoFxIdleComponent(handle, component.toInt(), flags.toInt())
}

public actual fun PoFxIssueComponentPerfStateChange(handle: POHANDLE, flags: UInt, component: UInt, perfchange: Long, context: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoFxIssueComponentPerfStateChange(handle, flags.toInt(), component.toInt(), perfchange, context)
}

public actual fun PoFxIssueComponentPerfStateChangeMultiple(handle: POHANDLE, flags: UInt, component: UInt, perfchangescount: UInt, perfchanges: Long, context: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoFxIssueComponentPerfStateChangeMultiple(handle, flags.toInt(), component.toInt(), perfchangescount.toInt(), perfchanges, context)
}

public actual fun PoFxNotifySurprisePowerOn(pdo: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoFxNotifySurprisePowerOn(pdo)
}

public actual fun PoFxPowerControl(handle: POHANDLE, powercontrolcode: Long, inbuffer: Long, inbuffersize: ULong, outbuffer: Long, outbuffersize: ULong, bytesreturned: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoFxPowerControl(handle, powercontrolcode, inbuffer, inbuffersize.toLong(), outbuffer, outbuffersize.toLong(), bytesreturned)

public actual fun PoFxPowerOnCrashdumpDevice(handle: POHANDLE, context: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoFxPowerOnCrashdumpDevice(handle, context)

public actual fun PoFxQueryCurrentComponentPerfState(handle: POHANDLE, flags: UInt, component: UInt, setindex: UInt, currentperf: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoFxQueryCurrentComponentPerfState(handle, flags.toInt(), component.toInt(), setindex.toInt(), currentperf)

public actual fun PoFxRegisterComponentPerfStates(handle: POHANDLE, component: UInt, flags: ULong, componentperfstatecallback: PPO_FX_COMPONENT_PERF_STATE_CALLBACK, inputstateinfo: Long, outputstateinfo: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoFxRegisterComponentPerfStates(handle, component.toInt(), flags.toLong(), componentperfstatecallback.toLong(), inputstateinfo, outputstateinfo)

public actual fun PoFxRegisterCrashdumpDevice(handle: POHANDLE): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoFxRegisterCrashdumpDevice(handle)

public actual fun PoFxRegisterDevice(pdo: Long, device: Long, handle: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoFxRegisterDevice(pdo, device, handle)

public actual fun PoFxRegisterDripsWatchdogCallback(handle: POHANDLE, callback: PPO_FX_DRIPS_WATCHDOG_CALLBACK, includechilddevices: Boolean, matchingdriverobject: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoFxRegisterDripsWatchdogCallback(handle, callback.toLong(), includechilddevices, matchingdriverobject)
}

public actual fun PoFxReportDevicePoweredOn(handle: POHANDLE) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoFxReportDevicePoweredOn(handle)
}

public actual fun PoFxSetComponentLatency(handle: POHANDLE, component: UInt, latency: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoFxSetComponentLatency(handle, component.toInt(), latency.toLong())
}

public actual fun PoFxSetComponentResidency(handle: POHANDLE, component: UInt, residency: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoFxSetComponentResidency(handle, component.toInt(), residency.toLong())
}

public actual fun PoFxSetComponentWake(handle: POHANDLE, component: UInt, wakehint: Boolean) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoFxSetComponentWake(handle, component.toInt(), wakehint)
}

public actual fun PoFxSetDeviceIdleTimeout(handle: POHANDLE, idletimeout: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoFxSetDeviceIdleTimeout(handle, idletimeout.toLong())
}

public actual fun PoFxSetTargetDripsDevicePowerState(handle: POHANDLE, targetstate: DEVICE_POWER_STATE): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoFxSetTargetDripsDevicePowerState(handle, targetstate)

public actual fun PoFxStartDevicePowerManagement(handle: POHANDLE) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoFxStartDevicePowerManagement(handle)
}

public actual fun PoFxUnregisterDevice(handle: POHANDLE) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoFxUnregisterDevice(handle)
}

public actual fun PoGetSystemWake(irp: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoGetSystemWake(irp)

public actual fun PoGetThermalRequestSupport(thermalrequest: Long, type: PO_THERMAL_REQUEST_TYPE): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoGetThermalRequestSupport(thermalrequest, type)

public actual fun PoQueryWatchdogTime(pdo: Long, secondsremaining: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoQueryWatchdogTime(pdo, secondsremaining)

public actual fun PoRegisterDeviceForIdleDetection(deviceobject: Long, conservationidletime: UInt, performanceidletime: UInt, state: DEVICE_POWER_STATE): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoRegisterDeviceForIdleDetection(deviceobject, conservationidletime.toInt(), performanceidletime.toInt(), state)

public actual fun PoRegisterPowerSettingCallback(deviceobject: Long, settingguid: Long, callback: PPOWER_SETTING_CALLBACK, context: Long, handle: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoRegisterPowerSettingCallback(deviceobject, settingguid, callback.toLong(), context, handle)

public actual fun PoRegisterSystemState(statehandle: Long, flags: UInt): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoRegisterSystemState(statehandle, flags.toInt())

public actual fun PoRequestPowerIrp(deviceobject: Long, minorfunction: UByte, powerstate: POWER_STATE, completionfunction: PREQUEST_POWER_COMPLETE, context: Long, irp: Long): NTSTATUS =
    0

public actual fun PoSetDeviceBusyEx(idlepointer: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoSetDeviceBusyEx(idlepointer)
}

public actual fun PoSetHiberRange(memorymap: Long, flags: UInt, address: Long, length: ULong, tag: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoSetHiberRange(memorymap, flags.toInt(), address, length.toLong(), tag.toInt())
}

public actual fun PoSetPowerRequest(powerrequest: Long, type: POWER_REQUEST_TYPE): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoSetPowerRequest(powerrequest, type)

public actual fun PoSetPowerState(deviceobject: Long, type: POWER_STATE_TYPE, state: POWER_STATE): POWER_STATE =
    POWER_STATE()

public actual fun PoSetSystemState(flags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoSetSystemState(flags.toInt())
}

public actual fun PoSetSystemWake(irp: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoSetSystemWake(irp)
}

public actual fun PoSetSystemWakeDevice(deviceobject: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoSetSystemWakeDevice(deviceobject)
}

public actual fun PoSetThermalActiveCooling(thermalrequest: Long, engaged: Boolean): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoSetThermalActiveCooling(thermalrequest, engaged)

public actual fun PoSetThermalPassiveCooling(thermalrequest: Long, throttle: UByte): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoSetThermalPassiveCooling(thermalrequest, throttle.toByte())

public actual fun PoStartDeviceBusy(idlepointer: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoStartDeviceBusy(idlepointer)
}

public actual fun PoStartNextPowerIrp(irp: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoStartNextPowerIrp(irp)
}

public actual fun PoUnregisterPowerSettingCallback(handle: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoUnregisterPowerSettingCallback(handle)

public actual fun PoUnregisterSystemState(statehandle: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PoUnregisterSystemState(statehandle)
}

public actual fun ProbeForRead(address: Long, length: ULong, alignment: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ProbeForRead(address, length.toLong(), alignment.toInt())
}

public actual fun ProbeForWrite(address: Long, length: ULong, alignment: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ProbeForWrite(address, length.toLong(), alignment.toInt())
}

public actual fun PsAcquireSiloHardReference(silo: PESILO): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsAcquireSiloHardReference(silo)

public actual fun PsAllocSiloContextSlot(reserved: ULong, returnedcontextslot: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsAllocSiloContextSlot(reserved.toLong(), returnedcontextslot)

public actual fun PsAllocateAffinityToken(affinitytoken: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsAllocateAffinityToken(affinitytoken)

public actual fun PsAttachSiloToCurrentThread(silo: PESILO): PESILO =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsAttachSiloToCurrentThread(silo)

public actual fun PsCreateSiloContext(silo: PESILO, size: UInt, pooltype: POOL_TYPE, contextcleanupcallback: SILO_CONTEXT_CLEANUP_CALLBACK, returnedsilocontext: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsCreateSiloContext(silo, size.toInt(), pooltype, contextcleanupcallback.toLong(), returnedsilocontext)

public actual fun PsCreateSystemThread(threadhandle: Long, desiredaccess: UInt, objectattributes: Long, processhandle: HANDLE, clientid: Long, startroutine: PKSTART_ROUTINE, startcontext: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsCreateSystemThread(threadhandle, desiredaccess.toInt(), objectattributes, processhandle, clientid, startroutine.toLong(), startcontext)

public actual fun PsDereferenceSiloContext(silocontext: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsDereferenceSiloContext(silocontext)
}

public actual fun PsDetachSiloFromCurrentThread(previoussilo: PESILO) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsDetachSiloFromCurrentThread(previoussilo)
}

public actual fun PsFreeAffinityToken(affinitytoken: PAFFINITY_TOKEN) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsFreeAffinityToken(affinitytoken)
}

public actual fun PsFreeSiloContextSlot(contextslot: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsFreeSiloContextSlot(contextslot.toInt())

public actual fun PsGetCurrentProcessId(): HANDLE =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsGetCurrentProcessId()

public actual fun PsGetCurrentServerSilo(): PESILO =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsGetCurrentServerSilo()

public actual fun PsGetCurrentServerSiloName(): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsGetCurrentServerSiloName()

public actual fun PsGetCurrentSilo(): PESILO =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsGetCurrentSilo()

public actual fun PsGetCurrentThreadId(): HANDLE =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsGetCurrentThreadId()

public actual fun PsGetCurrentThreadTeb(): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsGetCurrentThreadTeb()

public actual fun PsGetEffectiveServerSilo(silo: PESILO): PESILO =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsGetEffectiveServerSilo(silo)

public actual fun PsGetHostSilo(): PESILO =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsGetHostSilo()

public actual fun PsGetJobServerSilo(job: PEJOB, serversilo: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsGetJobServerSilo(job, serversilo)

public actual fun PsGetJobSilo(job: PEJOB, silo: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsGetJobSilo(job, silo)

public actual fun PsGetParentSilo(job: PEJOB): PESILO =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsGetParentSilo(job)

public actual fun PsGetPermanentSiloContext(silo: PESILO, contextslot: UInt, returnedsilocontext: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsGetPermanentSiloContext(silo, contextslot.toInt(), returnedsilocontext)

public actual fun PsGetProcessCreateTimeQuadPart(process: PEPROCESS): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsGetProcessCreateTimeQuadPart(process)

public actual fun PsGetProcessExitStatus(process: PEPROCESS): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsGetProcessExitStatus(process)

public actual fun PsGetProcessId(process: PEPROCESS): HANDLE =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsGetProcessId(process)

public actual fun PsGetProcessStartKey(process: PEPROCESS): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsGetProcessStartKey(process).toULong()

public actual fun PsGetServerSiloServiceSessionId(silo: PESILO): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsGetServerSiloServiceSessionId(silo).toUInt()

public actual fun PsGetSiloContainerId(silo: PESILO): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsGetSiloContainerId(silo)

public actual fun PsGetSiloContext(silo: PESILO, contextslot: UInt, returnedsilocontext: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsGetSiloContext(silo, contextslot.toInt(), returnedsilocontext)

public actual fun PsGetSiloMonitorContextSlot(monitor: PSILO_MONITOR): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsGetSiloMonitorContextSlot(monitor).toUInt()

public actual fun PsGetThreadCreateTime(thread: PETHREAD): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsGetThreadCreateTime(thread)

public actual fun PsGetThreadExitStatus(thread: PETHREAD): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsGetThreadExitStatus(thread)

public actual fun PsGetThreadId(thread: PETHREAD): HANDLE =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsGetThreadId(thread)

public actual fun PsGetThreadProcessId(thread: PETHREAD): HANDLE =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsGetThreadProcessId(thread)

public actual fun PsGetThreadProperty(thread: PETHREAD, key: ULong, flags: UInt): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsGetThreadProperty(thread, key.toLong(), flags.toInt())

public actual fun PsGetThreadServerSilo(thread: PETHREAD): PESILO =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsGetThreadServerSilo(thread)

public actual fun PsGetVersion(majorversion: Long, minorversion: Long, buildnumber: Long, csdversion: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsGetVersion(majorversion, minorversion, buildnumber, csdversion)

public actual fun PsInsertPermanentSiloContext(silo: PESILO, contextslot: UInt, silocontext: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsInsertPermanentSiloContext(silo, contextslot.toInt(), silocontext)

public actual fun PsInsertSiloContext(silo: PESILO, contextslot: UInt, silocontext: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsInsertSiloContext(silo, contextslot.toInt(), silocontext)

public actual fun PsIsCurrentThreadInServerSilo(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsIsCurrentThreadInServerSilo()

public actual fun PsIsCurrentThreadPrefetching(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsIsCurrentThreadPrefetching()

public actual fun PsIsHostSilo(silo: PESILO): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsIsHostSilo(silo)

public actual fun PsMakeSiloContextPermanent(silo: PESILO, contextslot: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsMakeSiloContextPermanent(silo, contextslot.toInt())

public actual fun PsQueryTotalCycleTimeProcess(process: PEPROCESS, cycletimestamp: Long): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsQueryTotalCycleTimeProcess(process, cycletimestamp).toULong()

public actual fun PsReferenceSiloContext(silocontext: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsReferenceSiloContext(silocontext)
}

public actual fun PsRegisterSiloMonitor(registration: Long, returnedmonitor: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsRegisterSiloMonitor(registration, returnedmonitor)

public actual fun PsReleaseSiloHardReference(silo: PESILO) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsReleaseSiloHardReference(silo)
}

public actual fun PsRemoveCreateThreadNotifyRoutine(notifyroutine: PCREATE_THREAD_NOTIFY_ROUTINE): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsRemoveCreateThreadNotifyRoutine(notifyroutine.toLong())

public actual fun PsRemoveLoadImageNotifyRoutine(notifyroutine: PLOAD_IMAGE_NOTIFY_ROUTINE): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsRemoveLoadImageNotifyRoutine(notifyroutine.toLong())

public actual fun PsRemoveSiloContext(silo: PESILO, contextslot: UInt, removedsilocontext: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsRemoveSiloContext(silo, contextslot.toInt(), removedsilocontext)

public actual fun PsReplaceSiloContext(silo: PESILO, contextslot: UInt, newsilocontext: Long, oldsilocontext: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsReplaceSiloContext(silo, contextslot.toInt(), newsilocontext, oldsilocontext)

public actual fun PsRevertToUserMultipleGroupAffinityThread(affinitytoken: PAFFINITY_TOKEN) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsRevertToUserMultipleGroupAffinityThread(affinitytoken)
}

public actual fun PsSetCreateProcessNotifyRoutine(notifyroutine: PCREATE_PROCESS_NOTIFY_ROUTINE, remove: Boolean): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsSetCreateProcessNotifyRoutine(notifyroutine.toLong(), remove)

public actual fun PsSetCreateProcessNotifyRoutineEx(notifyroutine: PCREATE_PROCESS_NOTIFY_ROUTINE_EX, remove: Boolean): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsSetCreateProcessNotifyRoutineEx(notifyroutine.toLong(), remove)

public actual fun PsSetCreateProcessNotifyRoutineEx2(notifytype: PSCREATEPROCESSNOTIFYTYPE, notifyinformation: Long, remove: Boolean): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsSetCreateProcessNotifyRoutineEx2(notifytype, notifyinformation, remove)

public actual fun PsSetCreateThreadNotifyRoutine(notifyroutine: PCREATE_THREAD_NOTIFY_ROUTINE): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsSetCreateThreadNotifyRoutine(notifyroutine.toLong())

public actual fun PsSetCreateThreadNotifyRoutineEx(notifytype: PSCREATETHREADNOTIFYTYPE, notifyinformation: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsSetCreateThreadNotifyRoutineEx(notifytype, notifyinformation)

public actual fun PsSetCurrentThreadPrefetching(prefetching: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsSetCurrentThreadPrefetching(prefetching)

public actual fun PsSetLoadImageNotifyRoutine(notifyroutine: PLOAD_IMAGE_NOTIFY_ROUTINE): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsSetLoadImageNotifyRoutine(notifyroutine.toLong())

public actual fun PsSetLoadImageNotifyRoutineEx(notifyroutine: PLOAD_IMAGE_NOTIFY_ROUTINE, flags: ULong): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsSetLoadImageNotifyRoutineEx(notifyroutine.toLong(), flags.toLong())

public actual fun PsSetSystemMultipleGroupAffinityThread(groupaffinities: Long, groupcount: UShort, affinitytoken: PAFFINITY_TOKEN): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsSetSystemMultipleGroupAffinityThread(groupaffinities, groupcount.toShort(), affinitytoken)

public actual fun PsStartSiloMonitor(monitor: PSILO_MONITOR): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsStartSiloMonitor(monitor)

public actual fun PsTerminateServerSilo(serversilo: PESILO, exitstatus: NTSTATUS) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsTerminateServerSilo(serversilo, exitstatus)
}

public actual fun PsTerminateSystemThread(exitstatus: NTSTATUS): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsTerminateSystemThread(exitstatus)

public actual fun PsUnregisterSiloMonitor(monitor: PSILO_MONITOR) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsUnregisterSiloMonitor(monitor)
}

public actual fun PsWrapApcWow64Thread(apccontext: Long, apcroutine: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PsWrapApcWow64Thread(apccontext, apcroutine)

public actual fun PshedAllocateMemory(size: UInt): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PshedAllocateMemory(size.toInt())

public actual fun PshedFreeMemory(address: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PshedFreeMemory(address)
}

public actual fun PshedIsSystemWheaEnabled(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PshedIsSystemWheaEnabled()

public actual fun PshedRegisterPlugin(packet: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PshedRegisterPlugin(packet)

public actual fun PshedSynchronizeExecution(errorsource: Long, synchronizeroutine: PKSYNCHRONIZE_ROUTINE, synchronizecontext: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PshedSynchronizeExecution(errorsource, synchronizeroutine.toLong(), synchronizecontext)

public actual fun PshedUnregisterPlugin(pluginhandle: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_PshedUnregisterPlugin(pluginhandle)
}

public actual fun RtlAppendUnicodeStringToString(destination: Long, source: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlAppendUnicodeStringToString(destination, source)

public actual fun RtlAppendUnicodeToString(destination: Long, source: PCWSTR): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlAppendUnicodeToString(destination, source)

public actual fun RtlAreBitsClear(bitmapheader: Long, startingindex: UInt, length: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlAreBitsClear(bitmapheader, startingindex.toInt(), length.toInt())

public actual fun RtlAreBitsSet(bitmapheader: Long, startingindex: UInt, length: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlAreBitsSet(bitmapheader, startingindex.toInt(), length.toInt())

public actual fun RtlAssert(voidfailedassertion: Long, voidfilename: Long, linenumber: UInt, mutablemessage: PCSTR) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlAssert(voidfailedassertion, voidfilename, linenumber.toInt(), mutablemessage)
}

public actual fun RtlCheckRegistryKey(relativeto: UInt, path: PCWSTR): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlCheckRegistryKey(relativeto.toInt(), path)

public actual fun RtlClearAllBits(bitmapheader: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlClearAllBits(bitmapheader)
}

public actual fun RtlClearBit(bitmapheader: Long, bitnumber: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlClearBit(bitmapheader, bitnumber.toInt())
}

public actual fun RtlClearBits(bitmapheader: Long, startingindex: UInt, numbertoclear: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlClearBits(bitmapheader, startingindex.toInt(), numbertoclear.toInt())
}

public actual fun RtlCmDecodeMemIoResource(descriptor: Long, start: Long): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlCmDecodeMemIoResource(descriptor, start).toULong()

public actual fun RtlCmEncodeMemIoResource(descriptor: Long, type: UByte, length: ULong, start: ULong): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlCmEncodeMemIoResource(descriptor, type.toByte(), length.toLong(), start.toLong())

public actual fun RtlCompareString(string1: Long, string2: Long, caseinsensitive: Boolean): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlCompareString(string1, string2, caseinsensitive)

public actual fun RtlCompareUnicodeString(string1: Long, string2: Long, caseinsensitive: Boolean): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlCompareUnicodeString(string1, string2, caseinsensitive)

public actual fun RtlCompareUnicodeStrings(string1: Long, string1length: ULong, string2: Long, string2length: ULong, caseinsensitive: Boolean): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlCompareUnicodeStrings(string1, string1length.toLong(), string2, string2length.toLong(), caseinsensitive)

public actual fun RtlContractHashTable(hashtable: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlContractHashTable(hashtable)

public actual fun RtlCopyBitMap(source: Long, destination: Long, targetbit: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlCopyBitMap(source, destination, targetbit.toInt())
}

public actual fun RtlCopyString(destinationstring: Long, sourcestring: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlCopyString(destinationstring, sourcestring)
}

public actual fun RtlCopyUnicodeString(destinationstring: Long, sourcestring: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlCopyUnicodeString(destinationstring, sourcestring)
}

public actual fun RtlCreateHashTable(hashtable: Long, shift: UInt, flags: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlCreateHashTable(hashtable, shift.toInt(), flags.toInt())

public actual fun RtlCreateHashTableEx(hashtable: Long, initialsize: UInt, shift: UInt, flags: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlCreateHashTableEx(hashtable, initialsize.toInt(), shift.toInt(), flags.toInt())

public actual fun RtlCreateRegistryKey(relativeto: UInt, path: PCWSTR): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlCreateRegistryKey(relativeto.toInt(), path)

public actual fun RtlCreateSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, revision: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlCreateSecurityDescriptor(securitydescriptor, revision.toInt())

public actual fun RtlDelete(links: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlDelete(links)

public actual fun RtlDeleteElementGenericTable(table: Long, buffer: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlDeleteElementGenericTable(table, buffer)

public actual fun RtlDeleteElementGenericTableAvl(table: Long, buffer: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlDeleteElementGenericTableAvl(table, buffer)

public actual fun RtlDeleteElementGenericTableAvlEx(table: Long, nodeorparent: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlDeleteElementGenericTableAvlEx(table, nodeorparent)
}

public actual fun RtlDeleteHashTable(hashtable: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlDeleteHashTable(hashtable)
}

public actual fun RtlDeleteNoSplay(links: Long, root: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlDeleteNoSplay(links, root)
}

public actual fun RtlDeleteRegistryValue(relativeto: UInt, path: PCWSTR, valuename: PCWSTR): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlDeleteRegistryValue(relativeto.toInt(), path, valuename)

public actual fun RtlDowncaseUnicodeChar(sourcecharacter: UShort): UShort =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlDowncaseUnicodeChar(sourcecharacter.toShort()).toUShort()

public actual fun RtlEndEnumerationHashTable(hashtable: Long, enumerator: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlEndEnumerationHashTable(hashtable, enumerator)
}

public actual fun RtlEndStrongEnumerationHashTable(hashtable: Long, enumerator: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlEndStrongEnumerationHashTable(hashtable, enumerator)
}

public actual fun RtlEndWeakEnumerationHashTable(hashtable: Long, enumerator: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlEndWeakEnumerationHashTable(hashtable, enumerator)
}

public actual fun RtlEnumerateEntryHashTable(hashtable: Long, enumerator: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlEnumerateEntryHashTable(hashtable, enumerator)

public actual fun RtlEnumerateGenericTable(table: Long, restart: Boolean): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlEnumerateGenericTable(table, restart)

public actual fun RtlEnumerateGenericTableAvl(table: Long, restart: Boolean): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlEnumerateGenericTableAvl(table, restart)

public actual fun RtlEnumerateGenericTableLikeADirectory(table: Long, matchfunction: PRTL_AVL_MATCH_FUNCTION, matchdata: Long, nextflag: UInt, restartkey: Long, deletecount: Long, buffer: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlEnumerateGenericTableLikeADirectory(table, matchfunction.toLong(), matchdata, nextflag.toInt(), restartkey, deletecount, buffer)

public actual fun RtlEnumerateGenericTableWithoutSplaying(table: Long, restartkey: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlEnumerateGenericTableWithoutSplaying(table, restartkey)

public actual fun RtlEnumerateGenericTableWithoutSplayingAvl(table: Long, restartkey: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlEnumerateGenericTableWithoutSplayingAvl(table, restartkey)

public actual fun RtlEqualString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlEqualString(string1, string2, caseinsensitive)

public actual fun RtlEqualUnicodeString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlEqualUnicodeString(string1, string2, caseinsensitive)

public actual fun RtlExpandHashTable(hashtable: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlExpandHashTable(hashtable)

public actual fun RtlExtractBitMap(source: Long, destination: Long, targetbit: UInt, numberofbits: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlExtractBitMap(source, destination, targetbit.toInt(), numberofbits.toInt())
}

public actual fun RtlFindClearBits(bitmapheader: Long, numbertofind: UInt, hintindex: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlFindClearBits(bitmapheader, numbertofind.toInt(), hintindex.toInt()).toUInt()

public actual fun RtlFindClearBitsAndSet(bitmapheader: Long, numbertofind: UInt, hintindex: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlFindClearBitsAndSet(bitmapheader, numbertofind.toInt(), hintindex.toInt()).toUInt()

public actual fun RtlFindClearRuns(bitmapheader: Long, runarray: Long, sizeofrunarray: UInt, locatelongestruns: Boolean): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlFindClearRuns(bitmapheader, runarray, sizeofrunarray.toInt(), locatelongestruns).toUInt()

public actual fun RtlFindClosestEncodableLength(sourcelength: ULong, targetlength: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlFindClosestEncodableLength(sourcelength.toLong(), targetlength)

public actual fun RtlFindFirstRunClear(bitmapheader: Long, startingindex: Long): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlFindFirstRunClear(bitmapheader, startingindex).toUInt()

public actual fun RtlFindLastBackwardRunClear(bitmapheader: Long, fromindex: UInt, startingrunindex: Long): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlFindLastBackwardRunClear(bitmapheader, fromindex.toInt(), startingrunindex).toUInt()

public actual fun RtlFindLeastSignificantBit(set: ULong): Byte =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlFindLeastSignificantBit(set.toLong())

public actual fun RtlFindLongestRunClear(bitmapheader: Long, startingindex: Long): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlFindLongestRunClear(bitmapheader, startingindex).toUInt()

public actual fun RtlFindMostSignificantBit(set: ULong): Byte =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlFindMostSignificantBit(set.toLong())

public actual fun RtlFindNextForwardRunClear(bitmapheader: Long, fromindex: UInt, startingrunindex: Long): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlFindNextForwardRunClear(bitmapheader, fromindex.toInt(), startingrunindex).toUInt()

public actual fun RtlFindSetBits(bitmapheader: Long, numbertofind: UInt, hintindex: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlFindSetBits(bitmapheader, numbertofind.toInt(), hintindex.toInt()).toUInt()

public actual fun RtlFindSetBitsAndClear(bitmapheader: Long, numbertofind: UInt, hintindex: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlFindSetBitsAndClear(bitmapheader, numbertofind.toInt(), hintindex.toInt()).toUInt()

public actual fun RtlFreeUTF8String(utf8string: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlFreeUTF8String(utf8string)
}

public actual fun RtlGUIDFromString(guidstring: Long, guid: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlGUIDFromString(guidstring, guid)

public actual fun RtlGenerateClass5Guid(namespaceguid: Long, buffer: Long, buffersize: UInt, guid: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlGenerateClass5Guid(namespaceguid, buffer, buffersize.toInt(), guid)

public actual fun RtlGetActiveConsoleId(): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlGetActiveConsoleId().toUInt()

public actual fun RtlGetCallersAddress(callersaddress: Long, callerscaller: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlGetCallersAddress(callersaddress, callerscaller)
}

public actual fun RtlGetConsoleSessionForegroundProcessId(): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlGetConsoleSessionForegroundProcessId().toULong()

public actual fun RtlGetElementGenericTable(table: Long, i: UInt): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlGetElementGenericTable(table, i.toInt())

public actual fun RtlGetElementGenericTableAvl(table: Long, i: UInt): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlGetElementGenericTableAvl(table, i.toInt())

public actual fun RtlGetEnabledExtendedFeatures(featuremask: ULong): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlGetEnabledExtendedFeatures(featuremask.toLong()).toULong()

public actual fun RtlGetNextEntryHashTable(hashtable: Long, context: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlGetNextEntryHashTable(hashtable, context)

public actual fun RtlGetNtProductType(ntproducttype: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlGetNtProductType(ntproducttype)

public actual fun RtlGetNtSystemRoot(): PCWSTR =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlGetNtSystemRoot()

public actual fun RtlGetPersistedStateLocation(sourceid: PCWSTR, customvalue: PCWSTR, defaultpath: PCWSTR, statelocationtype: STATE_LOCATION_TYPE, targetpath: PWSTR, bufferlengthin: UInt, bufferlengthout: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlGetPersistedStateLocation(sourceid, customvalue, defaultpath, statelocationtype, targetpath, bufferlengthin.toInt(), bufferlengthout)

public actual fun RtlGetSuiteMask(): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlGetSuiteMask().toUInt()

public actual fun RtlGetVersion(lpversioninformation: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlGetVersion(lpversioninformation)

public actual fun RtlHashUnicodeString(string: Long, caseinsensitive: Boolean, hashalgorithm: UInt, hashvalue: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlHashUnicodeString(string, caseinsensitive, hashalgorithm.toInt(), hashvalue)

public actual fun RtlInitEnumerationHashTable(hashtable: Long, enumerator: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlInitEnumerationHashTable(hashtable, enumerator)

public actual fun RtlInitStrongEnumerationHashTable(hashtable: Long, enumerator: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlInitStrongEnumerationHashTable(hashtable, enumerator)

public actual fun RtlInitUTF8String(destinationstring: Long, sourcestring: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlInitUTF8String(destinationstring, sourcestring)
}

public actual fun RtlInitUTF8StringEx(destinationstring: Long, sourcestring: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlInitUTF8StringEx(destinationstring, sourcestring)

public actual fun RtlInitWeakEnumerationHashTable(hashtable: Long, enumerator: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlInitWeakEnumerationHashTable(hashtable, enumerator)

public actual fun RtlInitializeBitMap(bitmapheader: Long, bitmapbuffer: Long, sizeofbitmap: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlInitializeBitMap(bitmapheader, bitmapbuffer, sizeofbitmap.toInt())
}

public actual fun RtlInitializeGenericTable(table: Long, compareroutine: PRTL_GENERIC_COMPARE_ROUTINE, allocateroutine: PRTL_GENERIC_ALLOCATE_ROUTINE, freeroutine: PRTL_GENERIC_FREE_ROUTINE, tablecontext: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlInitializeGenericTable(table, compareroutine.toLong(), allocateroutine.toLong(), freeroutine.toLong(), tablecontext)
}

public actual fun RtlInitializeGenericTableAvl(table: Long, compareroutine: PRTL_AVL_COMPARE_ROUTINE, allocateroutine: PRTL_AVL_ALLOCATE_ROUTINE, freeroutine: PRTL_AVL_FREE_ROUTINE, tablecontext: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlInitializeGenericTableAvl(table, compareroutine.toLong(), allocateroutine.toLong(), freeroutine.toLong(), tablecontext)
}

public actual fun RtlInsertElementGenericTable(table: Long, buffer: Long, buffersize: UInt, newelement: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlInsertElementGenericTable(table, buffer, buffersize.toInt(), newelement)

public actual fun RtlInsertElementGenericTableAvl(table: Long, buffer: Long, buffersize: UInt, newelement: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlInsertElementGenericTableAvl(table, buffer, buffersize.toInt(), newelement)

public actual fun RtlInsertElementGenericTableFull(table: Long, buffer: Long, buffersize: UInt, newelement: Long, nodeorparent: Long, searchresult: TABLE_SEARCH_RESULT): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlInsertElementGenericTableFull(table, buffer, buffersize.toInt(), newelement, nodeorparent, searchresult)

public actual fun RtlInsertElementGenericTableFullAvl(table: Long, buffer: Long, buffersize: UInt, newelement: Long, nodeorparent: Long, searchresult: TABLE_SEARCH_RESULT): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlInsertElementGenericTableFullAvl(table, buffer, buffersize.toInt(), newelement, nodeorparent, searchresult)

public actual fun RtlInsertEntryHashTable(hashtable: Long, entry: Long, signature: ULong, context: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlInsertEntryHashTable(hashtable, entry, signature.toLong(), context)

public actual fun RtlInt64ToUnicodeString(value: ULong, base: UInt, string: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlInt64ToUnicodeString(value.toLong(), base.toInt(), string)

public actual fun RtlIntegerToUnicodeString(value: UInt, base: UInt, string: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlIntegerToUnicodeString(value.toInt(), base.toInt(), string)

public actual fun RtlIoDecodeMemIoResource(descriptor: Long, alignment: Long, minimumaddress: Long, maximumaddress: Long): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlIoDecodeMemIoResource(descriptor, alignment, minimumaddress, maximumaddress).toULong()

public actual fun RtlIoEncodeMemIoResource(descriptor: Long, type: UByte, length: ULong, alignment: ULong, minimumaddress: ULong, maximumaddress: ULong): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlIoEncodeMemIoResource(descriptor, type.toByte(), length.toLong(), alignment.toLong(), minimumaddress.toLong(), maximumaddress.toLong())

public actual fun RtlIsApiSetImplemented(apisetname: PCSTR): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlIsApiSetImplemented(apisetname)

public actual fun RtlIsGenericTableEmpty(table: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlIsGenericTableEmpty(table)

public actual fun RtlIsGenericTableEmptyAvl(table: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlIsGenericTableEmptyAvl(table)

public actual fun RtlIsMultiSessionSku(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlIsMultiSessionSku()

public actual fun RtlIsMultiUsersInSessionSku(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlIsMultiUsersInSessionSku()

public actual fun RtlIsNtDdiVersionAvailable(version: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlIsNtDdiVersionAvailable(version.toInt())

public actual fun RtlIsServicePackVersionInstalled(version: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlIsServicePackVersionInstalled(version.toInt())

public actual fun RtlIsStateSeparationEnabled(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlIsStateSeparationEnabled()

public actual fun RtlIsUntrustedObject(handle: HANDLE, obj: Long, untrustedobject: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlIsUntrustedObject(handle, obj, untrustedobject)

public actual fun RtlLengthSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlLengthSecurityDescriptor(securitydescriptor).toUInt()

public actual fun RtlLookupElementGenericTable(table: Long, buffer: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlLookupElementGenericTable(table, buffer)

public actual fun RtlLookupElementGenericTableAvl(table: Long, buffer: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlLookupElementGenericTableAvl(table, buffer)

public actual fun RtlLookupElementGenericTableFull(table: Long, buffer: Long, nodeorparent: Long, searchresult: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlLookupElementGenericTableFull(table, buffer, nodeorparent, searchresult)

public actual fun RtlLookupElementGenericTableFullAvl(table: Long, buffer: Long, nodeorparent: Long, searchresult: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlLookupElementGenericTableFullAvl(table, buffer, nodeorparent, searchresult)

public actual fun RtlLookupEntryHashTable(hashtable: Long, signature: ULong, context: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlLookupEntryHashTable(hashtable, signature.toLong(), context)

public actual fun RtlLookupFirstMatchingElementGenericTableAvl(table: Long, buffer: Long, restartkey: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlLookupFirstMatchingElementGenericTableAvl(table, buffer, restartkey)

public actual fun RtlMapGenericMask(accessmask: Long, genericmapping: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlMapGenericMask(accessmask, genericmapping)
}

public actual fun RtlNormalizeSecurityDescriptor(securitydescriptor: Long, securitydescriptorlength: UInt, newsecuritydescriptor: Long, newsecuritydescriptorlength: Long, checkonly: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlNormalizeSecurityDescriptor(securitydescriptor, securitydescriptorlength.toInt(), newsecuritydescriptor, newsecuritydescriptorlength, checkonly)

public actual fun RtlNumberGenericTableElements(table: Long): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlNumberGenericTableElements(table).toUInt()

public actual fun RtlNumberGenericTableElementsAvl(table: Long): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlNumberGenericTableElementsAvl(table).toUInt()

public actual fun RtlNumberOfClearBits(bitmapheader: Long): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlNumberOfClearBits(bitmapheader).toUInt()

public actual fun RtlNumberOfClearBitsInRange(bitmapheader: Long, startingindex: UInt, length: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlNumberOfClearBitsInRange(bitmapheader, startingindex.toInt(), length.toInt()).toUInt()

public actual fun RtlNumberOfSetBits(bitmapheader: Long): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlNumberOfSetBits(bitmapheader).toUInt()

public actual fun RtlNumberOfSetBitsInRange(bitmapheader: Long, startingindex: UInt, length: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlNumberOfSetBitsInRange(bitmapheader, startingindex.toInt(), length.toInt()).toUInt()

public actual fun RtlNumberOfSetBitsUlongPtr(target: ULong): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlNumberOfSetBitsUlongPtr(target.toLong()).toUInt()

public actual fun RtlPrefetchMemoryNonTemporal(source: Long, length: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlPrefetchMemoryNonTemporal(source, length.toLong())
}

public actual fun RtlPrefixUnicodeString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlPrefixUnicodeString(string1, string2, caseinsensitive)

public actual fun RtlQueryRegistryValueWithFallback(primaryhandle: HANDLE, fallbackhandle: HANDLE, valuename: Long, valuelength: UInt, valuetype: Long, valuedata: Long, resultlength: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlQueryRegistryValueWithFallback(primaryhandle, fallbackhandle, valuename, valuelength.toInt(), valuetype, valuedata, resultlength)

public actual fun RtlQueryRegistryValues(relativeto: UInt, path: PCWSTR, querytable: Long, context: Long, environment: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlQueryRegistryValues(relativeto.toInt(), path, querytable, context, environment)

public actual fun RtlQueryValidationRunlevel(componentname: Long): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlQueryValidationRunlevel(componentname).toUInt()

public actual fun RtlRealPredecessor(links: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlRealPredecessor(links)

public actual fun RtlRealSuccessor(links: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlRealSuccessor(links)

public actual fun RtlRemoveEntryHashTable(hashtable: Long, entry: Long, context: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlRemoveEntryHashTable(hashtable, entry, context)

public actual fun RtlRunOnceBeginInitialize(runonce: Long, flags: UInt, context: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlRunOnceBeginInitialize(runonce, flags.toInt(), context)

public actual fun RtlRunOnceComplete(runonce: Long, flags: UInt, context: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlRunOnceComplete(runonce, flags.toInt(), context)

public actual fun RtlRunOnceExecuteOnce(runonce: Long, initfn: PRTL_RUN_ONCE_INIT_FN, parameter: Long, context: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlRunOnceExecuteOnce(runonce, initfn.toLong(), parameter, context)

public actual fun RtlRunOnceInitialize(runonce: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlRunOnceInitialize(runonce)
}

public actual fun RtlSetAllBits(bitmapheader: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlSetAllBits(bitmapheader)
}

public actual fun RtlSetBit(bitmapheader: Long, bitnumber: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlSetBit(bitmapheader, bitnumber.toInt())
}

public actual fun RtlSetBits(bitmapheader: Long, startingindex: UInt, numbertoset: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlSetBits(bitmapheader, startingindex.toInt(), numbertoset.toInt())
}

public actual fun RtlSetDaclSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR, daclpresent: Boolean, dacl: Long, dacldefaulted: Boolean): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlSetDaclSecurityDescriptor(securitydescriptor, daclpresent, dacl, dacldefaulted)

public actual fun RtlSetSystemGlobalData(dataid: RTL_SYSTEM_GLOBAL_DATA_ID, buffer: Long, size: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlSetSystemGlobalData(dataid, buffer, size.toInt())

public actual fun RtlSplay(links: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlSplay(links)

public actual fun RtlStringFromGUID(guid: Long, guidstring: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlStringFromGUID(guid, guidstring)

public actual fun RtlStronglyEnumerateEntryHashTable(hashtable: Long, enumerator: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlStronglyEnumerateEntryHashTable(hashtable, enumerator)

public actual fun RtlSubtreePredecessor(links: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlSubtreePredecessor(links)

public actual fun RtlSubtreeSuccessor(links: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlSubtreeSuccessor(links)

public actual fun RtlSuffixUnicodeString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlSuffixUnicodeString(string1, string2, caseinsensitive)

public actual fun RtlTestBit(bitmapheader: Long, bitnumber: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlTestBit(bitmapheader, bitnumber.toInt())

public actual fun RtlTimeFieldsToTime(timefields: Long, time: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlTimeFieldsToTime(timefields, time)

public actual fun RtlTimeToTimeFields(time: Long, timefields: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlTimeToTimeFields(time, timefields)
}

public actual fun RtlUTF8StringToUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlUTF8StringToUnicodeString(destinationstring, sourcestring, allocatedestinationstring)

public actual fun RtlUTF8ToUnicodeN(unicodestringdestination: PWSTR, unicodestringmaxbytecount: UInt, unicodestringactualbytecount: Long, utf8stringsource: PCSTR, utf8stringbytecount: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlUTF8ToUnicodeN(unicodestringdestination, unicodestringmaxbytecount.toInt(), unicodestringactualbytecount, utf8stringsource, utf8stringbytecount.toInt())

public actual fun RtlUnicodeStringToInt64(string: Long, base: UInt, number: Long, endpointer: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlUnicodeStringToInt64(string, base.toInt(), number, endpointer)

public actual fun RtlUnicodeStringToInteger(string: Long, base: UInt, value: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlUnicodeStringToInteger(string, base.toInt(), value)

public actual fun RtlUnicodeStringToUTF8String(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlUnicodeStringToUTF8String(destinationstring, sourcestring, allocatedestinationstring)

public actual fun RtlUnicodeToUTF8N(utf8stringdestination: PSTR, utf8stringmaxbytecount: UInt, utf8stringactualbytecount: Long, unicodestringsource: Long, unicodestringbytecount: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlUnicodeToUTF8N(utf8stringdestination, utf8stringmaxbytecount.toInt(), utf8stringactualbytecount, unicodestringsource, unicodestringbytecount.toInt())

public actual fun RtlUpcaseUnicodeChar(sourcecharacter: UShort): UShort =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlUpcaseUnicodeChar(sourcecharacter.toShort()).toUShort()

public actual fun RtlUpcaseUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlUpcaseUnicodeString(destinationstring, sourcestring, allocatedestinationstring)

public actual fun RtlUpperChar(character: Byte): Byte =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlUpperChar(character)

public actual fun RtlUpperString(destinationstring: Long, sourcestring: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlUpperString(destinationstring, sourcestring)
}

public actual fun RtlValidRelativeSecurityDescriptor(securitydescriptorinput: PSECURITY_DESCRIPTOR, securitydescriptorlength: UInt, requiredinformation: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlValidRelativeSecurityDescriptor(securitydescriptorinput, securitydescriptorlength.toInt(), requiredinformation.toInt())

public actual fun RtlValidSecurityDescriptor(securitydescriptor: PSECURITY_DESCRIPTOR): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlValidSecurityDescriptor(securitydescriptor)

public actual fun RtlVerifyVersionInfo(versioninfo: Long, typemask: UInt, conditionmask: ULong): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlVerifyVersionInfo(versioninfo, typemask.toInt(), conditionmask.toLong())

public actual fun RtlVolumeDeviceToDosName(volumedeviceobject: Long, dosname: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlVolumeDeviceToDosName(volumedeviceobject, dosname)

public actual fun RtlWalkFrameChain(callers: Long, count: UInt, flags: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlWalkFrameChain(callers, count.toInt(), flags.toInt()).toUInt()

public actual fun RtlWeaklyEnumerateEntryHashTable(hashtable: Long, enumerator: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlWeaklyEnumerateEntryHashTable(hashtable, enumerator)

public actual fun RtlWriteRegistryValue(relativeto: UInt, path: PCWSTR, valuename: PCWSTR, valuetype: UInt, valuedata: Long, valuelength: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlWriteRegistryValue(relativeto.toInt(), path, valuename, valuetype.toInt(), valuedata, valuelength.toInt())

public actual fun RtlxAnsiStringToUnicodeSize(ansistring: Long): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlxAnsiStringToUnicodeSize(ansistring).toUInt()

public actual fun RtlxUnicodeStringToAnsiSize(unicodestring: Long): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_RtlxUnicodeStringToAnsiSize(unicodestring).toUInt()

public actual fun SeAccessCheck(securitydescriptor: PSECURITY_DESCRIPTOR, subjectsecuritycontext: Long, subjectcontextlocked: Boolean, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: Long, genericmapping: Long, accessmode: Byte, grantedaccess: Long, accessstatus: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_SeAccessCheck(securitydescriptor, subjectsecuritycontext, subjectcontextlocked, desiredaccess.toInt(), previouslygrantedaccess.toInt(), privileges, genericmapping, accessmode, grantedaccess, accessstatus)

public actual fun SeAssignSecurity(parentdescriptor: PSECURITY_DESCRIPTOR, explicitdescriptor: PSECURITY_DESCRIPTOR, newdescriptor: Long, isdirectoryobject: Boolean, subjectcontext: Long, genericmapping: Long, pooltype: POOL_TYPE): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_SeAssignSecurity(parentdescriptor, explicitdescriptor, newdescriptor, isdirectoryobject, subjectcontext, genericmapping, pooltype)

public actual fun SeAssignSecurityEx(parentdescriptor: PSECURITY_DESCRIPTOR, explicitdescriptor: PSECURITY_DESCRIPTOR, newdescriptor: Long, objecttype: Long, isdirectoryobject: Boolean, autoinheritflags: UInt, subjectcontext: Long, genericmapping: Long, pooltype: POOL_TYPE): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_SeAssignSecurityEx(parentdescriptor, explicitdescriptor, newdescriptor, objecttype, isdirectoryobject, autoinheritflags.toInt(), subjectcontext, genericmapping, pooltype)

public actual fun SeCaptureSubjectContext(subjectcontext: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_SeCaptureSubjectContext(subjectcontext)
}

public actual fun SeComputeAutoInheritByObjectType(objecttype: Long, securitydescriptor: PSECURITY_DESCRIPTOR, parentsecuritydescriptor: PSECURITY_DESCRIPTOR): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_SeComputeAutoInheritByObjectType(objecttype, securitydescriptor, parentsecuritydescriptor).toUInt()

public actual fun SeDeassignSecurity(securitydescriptor: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_SeDeassignSecurity(securitydescriptor)

public actual fun SeEtwWriteKMCveEvent(cveid: Long, additionaldetails: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_SeEtwWriteKMCveEvent(cveid, additionaldetails)

public actual fun SeLockSubjectContext(subjectcontext: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_SeLockSubjectContext(subjectcontext)
}

public actual fun SeRegisterImageVerificationCallback(imagetype: SE_IMAGE_TYPE, callbacktype: SE_IMAGE_VERIFICATION_CALLBACK_TYPE, callbackfunction: PSE_IMAGE_VERIFICATION_CALLBACK_FUNCTION, callbackcontext: Long, token: Long, callbackhandle: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_SeRegisterImageVerificationCallback(imagetype, callbacktype, callbackfunction.toLong(), callbackcontext, token, callbackhandle)

public actual fun SeReleaseSubjectContext(subjectcontext: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_SeReleaseSubjectContext(subjectcontext)
}

public actual fun SeReportSecurityEvent(flags: UInt, sourcename: Long, usersid: PSID, auditparameters: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_SeReportSecurityEvent(flags.toInt(), sourcename, usersid, auditparameters)

public actual fun SeSetAuditParameter(auditparameters: Long, type: SE_ADT_PARAMETER_TYPE, index: UInt, data: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_SeSetAuditParameter(auditparameters, type, index.toInt(), data)

public actual fun SeSinglePrivilegeCheck(privilegevalue: LUID, previousmode: Byte): Boolean =
    false

public actual fun SeUnlockSubjectContext(subjectcontext: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_SeUnlockSubjectContext(subjectcontext)
}

public actual fun SeUnregisterImageVerificationCallback(callbackhandle: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_SeUnregisterImageVerificationCallback(callbackhandle)
}

public actual fun SeValidSecurityDescriptor(length: UInt, securitydescriptor: PSECURITY_DESCRIPTOR): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_SeValidSecurityDescriptor(length.toInt(), securitydescriptor)

public actual fun TmCommitComplete(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_TmCommitComplete(enlistment, tmvirtualclock)

public actual fun TmCommitEnlistment(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_TmCommitEnlistment(enlistment, tmvirtualclock)

public actual fun TmCommitTransaction(transaction: Long, wait: Boolean): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_TmCommitTransaction(transaction, wait)

public actual fun TmCreateEnlistment(enlistmenthandle: Long, previousmode: Byte, desiredaccess: UInt, objectattributes: Long, resourcemanager: Long, transaction: Long, createoptions: UInt, notificationmask: UInt, enlistmentkey: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_TmCreateEnlistment(enlistmenthandle, previousmode, desiredaccess.toInt(), objectattributes, resourcemanager, transaction, createoptions.toInt(), notificationmask.toInt(), enlistmentkey)

public actual fun TmDereferenceEnlistmentKey(enlistment: Long, lastreference: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_TmDereferenceEnlistmentKey(enlistment, lastreference)

public actual fun TmEnableCallbacks(resourcemanager: Long, callbackroutine: PTM_RM_NOTIFICATION, rmkey: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_TmEnableCallbacks(resourcemanager, callbackroutine.toLong(), rmkey)

public actual fun TmGetTransactionId(transaction: Long, transactionid: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_TmGetTransactionId(transaction, transactionid)
}

public actual fun TmInitializeTransactionManager(transactionmanager: Long, logfilename: Long, tmid: Long, createoptions: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_TmInitializeTransactionManager(transactionmanager, logfilename, tmid, createoptions.toInt())

public actual fun TmIsTransactionActive(transaction: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_TmIsTransactionActive(transaction)

public actual fun TmPrePrepareComplete(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_TmPrePrepareComplete(enlistment, tmvirtualclock)

public actual fun TmPrePrepareEnlistment(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_TmPrePrepareEnlistment(enlistment, tmvirtualclock)

public actual fun TmPrepareComplete(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_TmPrepareComplete(enlistment, tmvirtualclock)

public actual fun TmPrepareEnlistment(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_TmPrepareEnlistment(enlistment, tmvirtualclock)

public actual fun TmPropagationComplete(resourcemanager: Long, requestcookie: UInt, bufferlength: UInt, buffer: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_TmPropagationComplete(resourcemanager, requestcookie.toInt(), bufferlength.toInt(), buffer)

public actual fun TmPropagationFailed(resourcemanager: Long, requestcookie: UInt, status: NTSTATUS): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_TmPropagationFailed(resourcemanager, requestcookie.toInt(), status)

public actual fun TmReadOnlyEnlistment(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_TmReadOnlyEnlistment(enlistment, tmvirtualclock)

public actual fun TmRecoverEnlistment(enlistment: Long, enlistmentkey: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_TmRecoverEnlistment(enlistment, enlistmentkey)

public actual fun TmRecoverResourceManager(resourcemanager: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_TmRecoverResourceManager(resourcemanager)

public actual fun TmRecoverTransactionManager(tm: Long, targetvirtualclock: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_TmRecoverTransactionManager(tm, targetvirtualclock)

public actual fun TmReferenceEnlistmentKey(enlistment: Long, key: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_TmReferenceEnlistmentKey(enlistment, key)

public actual fun TmRenameTransactionManager(logfilename: Long, existingtransactionmanagerguid: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_TmRenameTransactionManager(logfilename, existingtransactionmanagerguid)

public actual fun TmRequestOutcomeEnlistment(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_TmRequestOutcomeEnlistment(enlistment, tmvirtualclock)

public actual fun TmRollbackComplete(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_TmRollbackComplete(enlistment, tmvirtualclock)

public actual fun TmRollbackEnlistment(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_TmRollbackEnlistment(enlistment, tmvirtualclock)

public actual fun TmRollbackTransaction(transaction: Long, wait: Boolean): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_TmRollbackTransaction(transaction, wait)

public actual fun TmSinglePhaseReject(enlistment: Long, tmvirtualclock: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_TmSinglePhaseReject(enlistment, tmvirtualclock)

public actual fun VslCreateSecureSection(handle: Long, targetprocess: PEPROCESS, mdl: Long, devicepageprotection: UInt, attributes: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_VslCreateSecureSection(handle, targetprocess, mdl, devicepageprotection.toInt(), attributes.toInt())

public actual fun VslDeleteSecureSection(globalhandle: HANDLE): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_VslDeleteSecureSection(globalhandle)

public actual fun WheaAddErrorSource(errorsource: Long, context: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_WheaAddErrorSource(errorsource, context)

public actual fun WheaAddErrorSourceDeviceDriver(context: Long, configuration: Long, numberpreallocatederrorreports: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_WheaAddErrorSourceDeviceDriver(context, configuration, numberpreallocatederrorreports.toInt())

public actual fun WheaAddErrorSourceDeviceDriverV1(context: Long, configuration: Long, numbufferstopreallocate: UInt, maxdatalength: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_WheaAddErrorSourceDeviceDriverV1(context, configuration, numbufferstopreallocate.toInt(), maxdatalength.toInt())

public actual fun WheaAddHwErrorReportSectionDeviceDriver(errorhandle: Long, sectiondatalength: UInt, bufferset: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_WheaAddHwErrorReportSectionDeviceDriver(errorhandle, sectiondatalength.toInt(), bufferset)

public actual fun WheaConfigureErrorSource(sourcetype: WHEA_ERROR_SOURCE_TYPE, configuration: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_WheaConfigureErrorSource(sourcetype, configuration)

public actual fun WheaCreateHwErrorReportDeviceDriver(errorsourceid: UInt, deviceobject: Long): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_WheaCreateHwErrorReportDeviceDriver(errorsourceid.toInt(), deviceobject)

public actual fun WheaErrorSourceGetState(errorsourceid: UInt): WHEA_ERROR_SOURCE_STATE =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_WheaErrorSourceGetState(errorsourceid.toInt())

public actual fun WheaGetNotifyAllOfflinesPolicy(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_WheaGetNotifyAllOfflinesPolicy()

public actual fun WheaHighIrqlLogSelEventHandlerRegister(handler: PFN_WHEA_HIGH_IRQL_LOG_SEL_EVENT_HANDLER, context: Long): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_WheaHighIrqlLogSelEventHandlerRegister(handler.toLong(), context)

public actual fun WheaHighIrqlLogSelEventHandlerUnregister() {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_WheaHighIrqlLogSelEventHandlerUnregister()
}

public actual fun WheaHwErrorReportAbandonDeviceDriver(errorhandle: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_WheaHwErrorReportAbandonDeviceDriver(errorhandle)

public actual fun WheaHwErrorReportSetSectionNameDeviceDriver(bufferset: Long, namelength: UInt, name: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_WheaHwErrorReportSetSectionNameDeviceDriver(bufferset, namelength.toInt(), name)

public actual fun WheaHwErrorReportSetSeverityDeviceDriver(errorhandle: Long, errorseverity: WHEA_ERROR_SEVERITY): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_WheaHwErrorReportSetSeverityDeviceDriver(errorhandle, errorseverity)

public actual fun WheaHwErrorReportSubmitDeviceDriver(errorhandle: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_WheaHwErrorReportSubmitDeviceDriver(errorhandle)

public actual fun WheaInitializeRecordHeader(header: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_WheaInitializeRecordHeader(header)

public actual fun WheaIsCriticalState(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_WheaIsCriticalState()

public actual fun WheaLogInternalEvent(entry: Long) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_WheaLogInternalEvent(entry)
}

public actual fun WheaRegisterInUsePageOfflineNotification(callback: PFN_IN_USE_PAGE_OFFLINE_NOTIFY, context: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_WheaRegisterInUsePageOfflineNotification(callback.toLong(), context)

public actual fun WheaRemoveErrorSource(errorsourceid: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_WheaRemoveErrorSource(errorsourceid.toInt())
}

public actual fun WheaRemoveErrorSourceDeviceDriver(errorsourceid: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_WheaRemoveErrorSourceDeviceDriver(errorsourceid.toInt())

public actual fun WheaReportHwError(errorpacket: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_WheaReportHwError(errorpacket)

public actual fun WheaReportHwErrorDeviceDriver(errorsourceid: UInt, deviceobject: Long, errordata: Long, errordatalength: UInt, sectiontypeguid: Long, errorseverity: WHEA_ERROR_SEVERITY, devicefriendlyname: PCSTR): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_WheaReportHwErrorDeviceDriver(errorsourceid.toInt(), deviceobject, errordata, errordatalength.toInt(), sectiontypeguid, errorseverity, devicefriendlyname)

public actual fun WheaUnconfigureErrorSource(sourcetype: WHEA_ERROR_SOURCE_TYPE): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_WheaUnconfigureErrorSource(sourcetype)

public actual fun WheaUnregisterInUsePageOfflineNotification(callback: PFN_IN_USE_PAGE_OFFLINE_NOTIFY): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_WheaUnregisterInUsePageOfflineNotification(callback.toLong())

public actual fun WmiQueryTraceInformation(traceinformationclass: TRACE_INFORMATION_CLASS, traceinformation: Long, traceinformationlength: UInt, requiredlength: Long, buffer: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_WmiQueryTraceInformation(traceinformationclass, traceinformation, traceinformationlength.toInt(), requiredlength, buffer)

public actual fun ZwAllocateLocallyUniqueId(luid: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwAllocateLocallyUniqueId(luid)

public actual fun ZwClose(handle: HANDLE): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwClose(handle)

public actual fun ZwCommitComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwCommitComplete(enlistmenthandle, tmvirtualclock)

public actual fun ZwCommitEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwCommitEnlistment(enlistmenthandle, tmvirtualclock)

public actual fun ZwCommitTransaction(transactionhandle: HANDLE, wait: Boolean): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwCommitTransaction(transactionhandle, wait)

public actual fun ZwCreateEnlistment(enlistmenthandle: Long, desiredaccess: UInt, resourcemanagerhandle: HANDLE, transactionhandle: HANDLE, objectattributes: Long, createoptions: UInt, notificationmask: UInt, enlistmentkey: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwCreateEnlistment(enlistmenthandle, desiredaccess.toInt(), resourcemanagerhandle, transactionhandle, objectattributes, createoptions.toInt(), notificationmask.toInt(), enlistmentkey)

public actual fun ZwCreateFile(filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: Long, ealength: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwCreateFile(filehandle, desiredaccess.toInt(), objectattributes, iostatusblock, allocationsize, fileattributes.toInt(), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), eabuffer, ealength.toInt())

public actual fun ZwCreateResourceManager(resourcemanagerhandle: Long, desiredaccess: UInt, tmhandle: HANDLE, resourcemanagerguid: Long, objectattributes: Long, createoptions: UInt, description: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwCreateResourceManager(resourcemanagerhandle, desiredaccess.toInt(), tmhandle, resourcemanagerguid, objectattributes, createoptions.toInt(), description)

public actual fun ZwCreateSection(sectionhandle: Long, desiredaccess: UInt, objectattributes: Long, maximumsize: Long, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: HANDLE): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwCreateSection(sectionhandle, desiredaccess.toInt(), objectattributes, maximumsize, sectionpageprotection.toInt(), allocationattributes.toInt(), filehandle)

public actual fun ZwCreateTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long, uow: Long, tmhandle: HANDLE, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: Long, description: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwCreateTransaction(transactionhandle, desiredaccess.toInt(), objectattributes, uow, tmhandle, createoptions.toInt(), isolationlevel.toInt(), isolationflags.toInt(), timeout, description)

public actual fun ZwCreateTransactionManager(tmhandle: Long, desiredaccess: UInt, objectattributes: Long, logfilename: Long, createoptions: UInt, commitstrength: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwCreateTransactionManager(tmhandle, desiredaccess.toInt(), objectattributes, logfilename, createoptions.toInt(), commitstrength.toInt())

public actual fun ZwDeviceIoControlFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, iocontrolcode: UInt, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt): NTSTATUS =
    0

public actual fun ZwDisplayString(string: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwDisplayString(string)

public actual fun ZwEnumerateTransactionObject(rootobjecthandle: HANDLE, querytype: KTMOBJECT_TYPE, objectcursor: Long, objectcursorlength: UInt, returnlength: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwEnumerateTransactionObject(rootobjecthandle, querytype, objectcursor, objectcursorlength.toInt(), returnlength)

public actual fun ZwGetNotificationResourceManager(resourcemanagerhandle: HANDLE, transactionnotification: Long, notificationlength: UInt, timeout: Long, returnlength: Long, asynchronous: UInt, asynchronouscontext: ULong): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwGetNotificationResourceManager(resourcemanagerhandle, transactionnotification, notificationlength.toInt(), timeout, returnlength, asynchronous.toInt(), asynchronouscontext.toLong())

public actual fun ZwLoadDriver(driverservicename: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwLoadDriver(driverservicename)

public actual fun ZwMakeTemporaryObject(handle: HANDLE): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwMakeTemporaryObject(handle)

public actual fun ZwManagePartition(targethandle: HANDLE, sourcehandle: HANDLE, partitioninformationclass: PARTITION_INFORMATION_CLASS, partitioninformation: Long, partitioninformationlength: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwManagePartition(targethandle, sourcehandle, partitioninformationclass, partitioninformation, partitioninformationlength.toInt())

public actual fun ZwOpenEnlistment(enlistmenthandle: Long, desiredaccess: UInt, rmhandle: HANDLE, enlistmentguid: Long, objectattributes: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwOpenEnlistment(enlistmenthandle, desiredaccess.toInt(), rmhandle, enlistmentguid, objectattributes)

public actual fun ZwOpenFile(filehandle: Long, desiredaccess: UInt, objectattributes: Long, iostatusblock: Long, shareaccess: UInt, openoptions: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwOpenFile(filehandle, desiredaccess.toInt(), objectattributes, iostatusblock, shareaccess.toInt(), openoptions.toInt())

public actual fun ZwOpenResourceManager(resourcemanagerhandle: Long, desiredaccess: UInt, tmhandle: HANDLE, resourcemanagerguid: Long, objectattributes: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwOpenResourceManager(resourcemanagerhandle, desiredaccess.toInt(), tmhandle, resourcemanagerguid, objectattributes)

public actual fun ZwOpenSymbolicLinkObject(linkhandle: Long, desiredaccess: UInt, objectattributes: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwOpenSymbolicLinkObject(linkhandle, desiredaccess.toInt(), objectattributes)

public actual fun ZwOpenTransaction(transactionhandle: Long, desiredaccess: UInt, objectattributes: Long, uow: Long, tmhandle: HANDLE): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwOpenTransaction(transactionhandle, desiredaccess.toInt(), objectattributes, uow, tmhandle)

public actual fun ZwOpenTransactionManager(tmhandle: Long, desiredaccess: UInt, objectattributes: Long, logfilename: Long, tmidentity: Long, openoptions: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwOpenTransactionManager(tmhandle, desiredaccess.toInt(), objectattributes, logfilename, tmidentity, openoptions.toInt())

public actual fun ZwPowerInformation(informationlevel: POWER_INFORMATION_LEVEL, inputbuffer: Long, inputbufferlength: UInt, outputbuffer: Long, outputbufferlength: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwPowerInformation(informationlevel, inputbuffer, inputbufferlength.toInt(), outputbuffer, outputbufferlength.toInt())

public actual fun ZwPrePrepareComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwPrePrepareComplete(enlistmenthandle, tmvirtualclock)

public actual fun ZwPrePrepareEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwPrePrepareEnlistment(enlistmenthandle, tmvirtualclock)

public actual fun ZwPrepareComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwPrepareComplete(enlistmenthandle, tmvirtualclock)

public actual fun ZwPrepareEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwPrepareEnlistment(enlistmenthandle, tmvirtualclock)

public actual fun ZwPropagationComplete(resourcemanagerhandle: HANDLE, requestcookie: UInt, bufferlength: UInt, buffer: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwPropagationComplete(resourcemanagerhandle, requestcookie.toInt(), bufferlength.toInt(), buffer)

public actual fun ZwPropagationFailed(resourcemanagerhandle: HANDLE, requestcookie: UInt, propstatus: NTSTATUS): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwPropagationFailed(resourcemanagerhandle, requestcookie.toInt(), propstatus)

public actual fun ZwQueryInformationByName(objectattributes: Long, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwQueryInformationByName(objectattributes, iostatusblock, fileinformation, length.toInt(), fileinformationclass)

public actual fun ZwQueryInformationEnlistment(enlistmenthandle: HANDLE, enlistmentinformationclass: ENLISTMENT_INFORMATION_CLASS, enlistmentinformation: Long, enlistmentinformationlength: UInt, returnlength: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwQueryInformationEnlistment(enlistmenthandle, enlistmentinformationclass, enlistmentinformation, enlistmentinformationlength.toInt(), returnlength)

public actual fun ZwQueryInformationFile(filehandle: HANDLE, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwQueryInformationFile(filehandle, iostatusblock, fileinformation, length.toInt(), fileinformationclass)

public actual fun ZwQueryInformationResourceManager(resourcemanagerhandle: HANDLE, resourcemanagerinformationclass: RESOURCEMANAGER_INFORMATION_CLASS, resourcemanagerinformation: Long, resourcemanagerinformationlength: UInt, returnlength: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwQueryInformationResourceManager(resourcemanagerhandle, resourcemanagerinformationclass, resourcemanagerinformation, resourcemanagerinformationlength.toInt(), returnlength)

public actual fun ZwQueryInformationTransaction(transactionhandle: HANDLE, transactioninformationclass: TRANSACTION_INFORMATION_CLASS, transactioninformation: Long, transactioninformationlength: UInt, returnlength: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwQueryInformationTransaction(transactionhandle, transactioninformationclass, transactioninformation, transactioninformationlength.toInt(), returnlength)

public actual fun ZwQueryInformationTransactionManager(transactionmanagerhandle: HANDLE, transactionmanagerinformationclass: TRANSACTIONMANAGER_INFORMATION_CLASS, transactionmanagerinformation: Long, transactionmanagerinformationlength: UInt, returnlength: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwQueryInformationTransactionManager(transactionmanagerhandle, transactionmanagerinformationclass, transactionmanagerinformation, transactionmanagerinformationlength.toInt(), returnlength)

public actual fun ZwQuerySymbolicLinkObject(linkhandle: HANDLE, linktarget: Long, returnedlength: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwQuerySymbolicLinkObject(linkhandle, linktarget, returnedlength)

public actual fun ZwReadFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, buffer: Long, length: UInt, byteoffset: Long, key: Long): NTSTATUS =
    0

public actual fun ZwReadOnlyEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwReadOnlyEnlistment(enlistmenthandle, tmvirtualclock)

public actual fun ZwRecoverEnlistment(enlistmenthandle: HANDLE, enlistmentkey: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwRecoverEnlistment(enlistmenthandle, enlistmentkey)

public actual fun ZwRecoverResourceManager(resourcemanagerhandle: HANDLE): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwRecoverResourceManager(resourcemanagerhandle)

public actual fun ZwRecoverTransactionManager(transactionmanagerhandle: HANDLE): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwRecoverTransactionManager(transactionmanagerhandle)

public actual fun ZwRegisterProtocolAddressInformation(resourcemanager: HANDLE, protocolid: Long, protocolinformationsize: UInt, protocolinformation: Long, createoptions: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwRegisterProtocolAddressInformation(resourcemanager, protocolid, protocolinformationsize.toInt(), protocolinformation, createoptions.toInt())

public actual fun ZwRenameTransactionManager(logfilename: Long, existingtransactionmanagerguid: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwRenameTransactionManager(logfilename, existingtransactionmanagerguid)

public actual fun ZwRollbackComplete(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwRollbackComplete(enlistmenthandle, tmvirtualclock)

public actual fun ZwRollbackEnlistment(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwRollbackEnlistment(enlistmenthandle, tmvirtualclock)

public actual fun ZwRollbackTransaction(transactionhandle: HANDLE, wait: Boolean): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwRollbackTransaction(transactionhandle, wait)

public actual fun ZwRollforwardTransactionManager(transactionmanagerhandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwRollforwardTransactionManager(transactionmanagerhandle, tmvirtualclock)

public actual fun ZwSetInformationEnlistment(enlistmenthandle: HANDLE, enlistmentinformationclass: ENLISTMENT_INFORMATION_CLASS, enlistmentinformation: Long, enlistmentinformationlength: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwSetInformationEnlistment(enlistmenthandle, enlistmentinformationclass, enlistmentinformation, enlistmentinformationlength.toInt())

public actual fun ZwSetInformationFile(filehandle: HANDLE, iostatusblock: Long, fileinformation: Long, length: UInt, fileinformationclass: FILE_INFORMATION_CLASS): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwSetInformationFile(filehandle, iostatusblock, fileinformation, length.toInt(), fileinformationclass)

public actual fun ZwSetInformationResourceManager(resourcemanagerhandle: HANDLE, resourcemanagerinformationclass: RESOURCEMANAGER_INFORMATION_CLASS, resourcemanagerinformation: Long, resourcemanagerinformationlength: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwSetInformationResourceManager(resourcemanagerhandle, resourcemanagerinformationclass, resourcemanagerinformation, resourcemanagerinformationlength.toInt())

public actual fun ZwSetInformationTransaction(transactionhandle: HANDLE, transactioninformationclass: TRANSACTION_INFORMATION_CLASS, transactioninformation: Long, transactioninformationlength: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwSetInformationTransaction(transactionhandle, transactioninformationclass, transactioninformation, transactioninformationlength.toInt())

public actual fun ZwSetInformationTransactionManager(tmhandle: HANDLE, transactionmanagerinformationclass: TRANSACTIONMANAGER_INFORMATION_CLASS, transactionmanagerinformation: Long, transactionmanagerinformationlength: UInt): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwSetInformationTransactionManager(tmhandle, transactionmanagerinformationclass, transactionmanagerinformation, transactionmanagerinformationlength.toInt())

public actual fun ZwSinglePhaseReject(enlistmenthandle: HANDLE, tmvirtualclock: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwSinglePhaseReject(enlistmenthandle, tmvirtualclock)

public actual fun ZwUnloadDriver(driverservicename: Long): NTSTATUS =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ZwUnloadDriver(driverservicename)

public actual fun ZwWriteFile(filehandle: HANDLE, event: HANDLE, apcroutine: PIO_APC_ROUTINE, apccontext: Long, iostatusblock: Long, buffer: Long, length: UInt, byteoffset: Long, key: Long): NTSTATUS =
    0

public actual fun vDbgPrintEx(componentid: UInt, level: UInt, format: PCSTR, arglist: Long): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_vDbgPrintEx(componentid.toInt(), level.toInt(), format, arglist).toUInt()

public actual fun vDbgPrintExWithPrefix(prefix: PCSTR, componentid: UInt, level: UInt, format: PCSTR, arglist: Long): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_vDbgPrintExWithPrefix(prefix, componentid.toInt(), level.toInt(), format, arglist).toUInt()
