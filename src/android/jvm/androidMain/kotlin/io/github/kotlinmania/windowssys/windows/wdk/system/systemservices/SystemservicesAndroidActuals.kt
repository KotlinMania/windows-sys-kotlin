@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.systemservices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DriverCancel
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DriverControl
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DriverNotificationCallbackRoutine
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DriverReinitialize
import io.github.kotlinmania.windowssys.windows.wdk.foundation.IoPriorityHint
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PaffinityToken
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PcallbackObject
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pejob
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Peprocess
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pesilo
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pethread
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PexRundownRefCacheAware
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PexTimer
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PfreeFunction
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PioCompletionRoutine
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PioWorkitem
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PkdeferredRoutine
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pkinterrupt
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pkthread
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PobjectType
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pohandle
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PoolType
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PpcwBuffer
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PpcwInstance
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PpcwRegistration
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PsiloMonitor
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FileInformationClass
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.SeAdtParameterType
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.ClfsContextMode
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.ClfsIostatsClass
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.ClfsMgmtPolicyType
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.ClsLogInformationClass
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.ClsLsn
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.BugcheckError
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.WheaErrorSourceState
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.WheaErrorSourceType
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.EventInfoClass
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.Reghandle
import io.github.kotlinmania.windowssys.windows.win32.system.io.PioApcRoutine
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.EventType
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.SuiteType
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.TimerType
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.WaitType
import io.github.kotlinmania.windowssys.windows.win32.system.power.DevicePowerState
import io.github.kotlinmania.windowssys.windows.win32.system.power.PowerInformationLevel
import io.github.kotlinmania.windowssys.windows.win32.system.power.PowerRequestType
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.FirmwareType
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.LogicalProcessorRelationship
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.RtlSystemGlobalDataId
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.EnlistmentInformationClass
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.KtmobjectType
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.ResourcemanagerInformationClass
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.TransactionInformationClass
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.TransactionmanagerInformationClass

private object WindowsWdkSystemSystemservicesJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsAddLogContainer(plfolog: Long, pcbcontainer: Long, puszcontainerpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsAddLogContainerSet(plfolog: Long, ccontainers: Short, pcbcontainer: Long, rguszcontainerpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsAdvanceLogBase(pvmarshalcontext: Long, plsnbase: Long, fflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsAlignReservedLog(pvmarshalcontext: Long, crecords: Int, rgcbreservation: Long, pcbalignreservation: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsAllocReservedLog(pvmarshalcontext: Long, crecords: Int, pcbadjustment: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsCloseAndResetLogFile(plfolog: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsCloseLogFileObject(plfolog: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsCreateLogFile(pplfolog: Long, puszlogfilename: Long, fdesiredaccess: Int, dwsharemode: Int, psdlogfile: Long, fcreatedisposition: Int, fcreateoptions: Int, fflagsandattributes: Int, flogoptionflag: Int, pvcontext: Long, cbcontext: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsCreateScanContext(plfolog: Long, cfromcontainer: Int, ccontainers: Int, escanmode: Byte, pcxscan: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsDeleteLogByPointer(plfolog: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsDeleteLogFile(puszlogfilename: Long, pvreserved: Long, flogoptionflag: Int, pvcontext: Long, cbcontext: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsDeleteMarshallingArea(pvmarshalcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsFinalize()

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsFlushBuffers(pvmarshalcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsFlushToLsn(pvmarshalcontext: Long, plsnflush: Long, plsnlastflushed: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsFreeReservedLog(pvmarshalcontext: Long, crecords: Int, pcbadjustment: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsGetContainerName(plfolog: Long, cidlogicalcontainer: Int, puszcontainername: Long, pcactuallencontainername: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsGetIoStatistics(plfolog: Long, pvstatsbuffer: Long, cbstatsbuffer: Int, estatsclass: Int, pcbstatswritten: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsGetLogFileInformation(plfolog: Long, pinfobuffer: Long, pcbinfobuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsInitialize(): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsLsnBlockOffset(plsn: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsLsnContainer(plsn: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsLsnDifference(plsnstart: Long, plsnfinish: Long, cbcontainer: Int, cbmaxblock: Int, pcbdifference: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsLsnEqual(plsn1: Long, plsn2: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsLsnGreater(plsn1: Long, plsn2: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsLsnInvalid(plsn: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsLsnLess(plsn1: Long, plsn2: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsLsnNull(plsn: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsLsnRecordSequence(plsn: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsMgmtDeregisterManagedClient(clientcookie: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsMgmtHandleLogFileFull(client: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsMgmtInstallPolicy(logfile: Long, policy: Long, policylength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsMgmtQueryPolicy(logfile: Long, policytype: Int, policy: Long, policylength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsMgmtRegisterManagedClient(logfile: Long, registrationdata: Long, clientcookie: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsMgmtRemovePolicy(logfile: Long, policytype: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsMgmtSetLogFileSize(logfile: Long, newsizeincontainers: Long, resultingsizeincontainers: Long, completionroutine: Long, completionroutinedata: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsMgmtSetLogFileSizeAsClient(logfile: Long, clientcookie: Long, newsizeincontainers: Long, resultingsizeincontainers: Long, completionroutine: Long, completionroutinedata: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsMgmtTailAdvanceFailure(client: Long, reason: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsQueryLogFileInformation(plfolog: Long, einformationclass: Int, pinfoinputbuffer: Long, cbinfoinputbuffer: Int, pinfobuffer: Long, pcbinfobuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsReadLogRecord(pvmarshalcontext: Long, plsnfirst: Long, pecontextmode: Int, ppvreadbuffer: Long, pcbreadbuffer: Long, perecordtype: Long, plsnundonext: Long, plsnprevious: Long, ppvreadcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsReadNextLogRecord(pvreadcontext: Long, ppvbuffer: Long, pcbbuffer: Long, perecordtype: Long, plsnuser: Long, plsnundonext: Long, plsnprevious: Long, plsnrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsReadPreviousRestartArea(pvreadcontext: Long, ppvrestartbuffer: Long, pcbrestartbuffer: Long, plsnrestart: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsReadRestartArea(pvmarshalcontext: Long, ppvrestartbuffer: Long, pcbrestartbuffer: Long, plsn: Long, ppvreadcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsRemoveLogContainer(plfolog: Long, puszcontainerpath: Long, fforce: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsRemoveLogContainerSet(plfolog: Long, ccontainers: Short, rgwszcontainerpath: Long, fforce: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsReserveAndAppendLog(pvmarshalcontext: Long, rgwriteentries: Long, cwriteentries: Int, plsnundonext: Long, plsnprevious: Long, creserverecords: Int, rgcbreservation: Long, fflags: Int, plsn: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsReserveAndAppendLogAligned(pvmarshalcontext: Long, rgwriteentries: Long, cwriteentries: Int, cbentryalignment: Int, plsnundonext: Long, plsnprevious: Long, creserverecords: Int, rgcbreservation: Long, fflags: Int, plsn: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsScanLogContainers(pcxscan: Long, escanmode: Byte): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsSetArchiveTail(plfolog: Long, plsnarchivetail: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsSetEndOfLog(plfolog: Long, plsnend: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsSetLogFileInformation(plfolog: Long, einformationclass: Int, pinfobuffer: Long, cbbuffer: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsTerminateReadLog(pvcursorcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_clfsWriteRestartArea(pvmarshalcontext: Long, pvrestartbuffer: Long, cbrestartbuffer: Int, plsnbase: Long, fflags: Int, pcbwritten: Long, plsnnext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_cmCallbackGetKeyObjectID(cookie: Long, obj: Long, objectid: Long, objectname: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_cmCallbackGetKeyObjectIDEx(cookie: Long, obj: Long, objectid: Long, objectname: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_cmCallbackReleaseKeyObjectIDEx(objectname: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_cmGetBoundTransaction(cookie: Long, obj: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_cmGetCallbackVersion(major: Long, minor: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_cmRegisterCallback(function: Long, context: Long, cookie: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_cmRegisterCallbackEx(function: Long, altitude: Long, driver: Long, context: Long, cookie: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_cmSetCallbackObjectContext(obj: Long, cookie: Long, newcontext: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_cmUnRegisterCallback(cookie: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_dbgBreakPointWithStatus(status: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_dbgPrint(format: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_dbgPrintEx(componentid: Int, level: Int, format: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_dbgPrintReturnControlC(format: Long, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_dbgPrompt(prompt: Long, response: Long, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_dbgQueryDebugFilterState(componentid: Int, level: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_dbgSetDebugFilterState(componentid: Int, level: Int, state: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_dbgSetDebugPrintCallback(debugprintcallback: Long, enable: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_etwActivityIdControl(controlcode: Int, activityid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_etwEventEnabled(reghandle: Long, eventdescriptor: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_etwProviderEnabled(reghandle: Long, level: Byte, keyword: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_etwRegister(providerid: Long, enablecallback: Long, callbackcontext: Long, reghandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_etwSetInformation(reghandle: Long, informationclass: Int, eventinformation: Long, informationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_etwUnregister(reghandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_etwWrite(reghandle: Long, eventdescriptor: Long, activityid: Long, userdatacount: Int, userdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_etwWriteEx(reghandle: Long, eventdescriptor: Long, filter: Long, flags: Int, activityid: Long, relatedactivityid: Long, userdatacount: Int, userdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_etwWriteString(reghandle: Long, level: Byte, keyword: Long, activityid: Long, string: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_etwWriteTransfer(reghandle: Long, eventdescriptor: Long, activityid: Long, relatedactivityid: Long, userdatacount: Int, userdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exAcquireFastMutex(fastmutex: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exAcquireFastMutexUnsafe(fastmutex: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exAcquirePushLockExclusiveEx(pushlock: Long, flags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exAcquirePushLockSharedEx(pushlock: Long, flags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exAcquireResourceExclusiveLite(resource: Long, wait: Boolean): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exAcquireResourceSharedLite(resource: Long, wait: Boolean): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exAcquireRundownProtection(runref: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exAcquireRundownProtectionCacheAware(runrefcacheaware: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exAcquireRundownProtectionCacheAwareEx(runrefcacheaware: Long, count: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exAcquireRundownProtectionEx(runref: Long, count: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exAcquireSharedStarveExclusive(resource: Long, wait: Boolean): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exAcquireSharedWaitForExclusive(resource: Long, wait: Boolean): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exAcquireSpinLockExclusive(spinlock: Long): Byte

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exAcquireSpinLockExclusiveAtDpcLevel(spinlock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exAcquireSpinLockShared(spinlock: Long): Byte

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exAcquireSpinLockSharedAtDpcLevel(spinlock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exAllocateCacheAwareRundownProtection(pooltype: Int, pooltag: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exAllocatePool(pooltype: Int, numberofbytes: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exAllocatePool2(flags: Long, numberofbytes: Long, tag: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exAllocatePool3(flags: Long, numberofbytes: Long, tag: Int, extendedparameters: Long, extendedparameterscount: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exAllocatePoolWithQuota(pooltype: Int, numberofbytes: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exAllocatePoolWithQuotaTag(pooltype: Int, numberofbytes: Long, tag: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exAllocatePoolWithTag(pooltype: Int, numberofbytes: Long, tag: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exAllocatePoolWithTagPriority(pooltype: Int, numberofbytes: Long, tag: Int, priority: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exAllocateTimer(callback: Long, callbackcontext: Long, attributes: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exCancelTimer(timer: Long, parameters: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exCleanupRundownProtectionCacheAware(runrefcacheaware: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exConvertExclusiveToSharedLite(resource: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exCreateCallback(callbackobject: Long, objectattributes: Long, create: Boolean, allowmultiplecallbacks: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exCreatePool(flags: Int, tag: Long, params: Long, poolhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exDeleteResourceLite(resource: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exDeleteTimer(timer: Long, cancel: Boolean, wait: Boolean, parameters: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exDestroyPool(poolhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exEnterCriticalRegionAndAcquireResourceExclusive(resource: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exEnterCriticalRegionAndAcquireResourceShared(resource: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exEnterCriticalRegionAndAcquireSharedWaitForExclusive(resource: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exEnumerateSystemFirmwareTables(firmwaretableprovidersignature: Int, firmwaretablebuffer: Long, bufferlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exExtendZone(zone: Long, segment: Long, segmentsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exFreeCacheAwareRundownProtection(runrefcacheaware: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exFreePool(p: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exFreePool2(p: Long, tag: Int, extendedparameters: Long, extendedparameterscount: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exFreePoolWithTag(p: Long, tag: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exGetExclusiveWaiterCount(resource: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exGetFirmwareEnvironmentVariable(variablename: Long, vendorguid: Long, value: Long, valuelength: Long, attributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exGetFirmwareType(): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exGetPreviousMode(): Byte

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exGetSharedWaiterCount(resource: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exGetSystemFirmwareTable(firmwaretableprovidersignature: Int, firmwaretableid: Int, firmwaretablebuffer: Long, bufferlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exInitializePushLock(pushlock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exInitializeResourceLite(resource: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exInitializeRundownProtection(runref: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exInitializeRundownProtectionCacheAware(runrefcacheaware: Long, runrefsize: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exInitializeRundownProtectionCacheAwareEx(runrefcacheaware: Long, flags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exInitializeZone(zone: Long, blocksize: Int, initialsegment: Long, initialsegmentsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exInterlockedAddLargeInteger(addend: Long, increment: Long, lock: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exInterlockedExtendZone(zone: Long, segment: Long, segmentsize: Int, lock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exIsManufacturingModeEnabled(): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exIsProcessorFeaturePresent(processorfeature: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exIsResourceAcquiredExclusiveLite(resource: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exIsResourceAcquiredSharedLite(resource: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exIsSoftBoot(): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exLocalTimeToSystemTime(localtime: Long, systemtime: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exNotifyCallback(callbackobject: Long, argument1: Long, argument2: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exQueryTimerResolution(maximumtime: Long, minimumtime: Long, currenttime: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exQueueWorkItem(workitem: Long, queuetype: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exRaiseAccessViolation()

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exRaiseDatatypeMisalignment()

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exRaiseStatus(status: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exReInitializeRundownProtection(runref: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exReInitializeRundownProtectionCacheAware(runrefcacheaware: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exRegisterCallback(callbackobject: Long, callbackfunction: Long, callbackcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exReinitializeResourceLite(resource: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exReleaseFastMutex(fastmutex: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exReleaseFastMutexUnsafe(fastmutex: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exReleasePushLockExclusiveEx(pushlock: Long, flags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exReleasePushLockSharedEx(pushlock: Long, flags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exReleaseResourceAndLeaveCriticalRegion(resource: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exReleaseResourceForThreadLite(resource: Long, resourcethreadid: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exReleaseResourceLite(resource: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exReleaseRundownProtection(runref: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exReleaseRundownProtectionCacheAware(runrefcacheaware: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exReleaseRundownProtectionCacheAwareEx(runref: Long, count: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exReleaseRundownProtectionEx(runref: Long, count: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exReleaseSpinLockExclusive(spinlock: Long, oldirql: Byte)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exReleaseSpinLockExclusiveFromDpcLevel(spinlock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exReleaseSpinLockShared(spinlock: Long, oldirql: Byte)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exReleaseSpinLockSharedFromDpcLevel(spinlock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exRundownCompleted(runref: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exRundownCompletedCacheAware(runrefcacheaware: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exSecurePoolUpdate(securepoolhandle: Long, tag: Int, allocation: Long, cookie: Long, offset: Long, size: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exSecurePoolValidate(securepoolhandle: Long, tag: Int, allocation: Long, cookie: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exSetFirmwareEnvironmentVariable(variablename: Long, vendorguid: Long, value: Long, valuelength: Int, attributes: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exSetResourceOwnerPointer(resource: Long, ownerpointer: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exSetResourceOwnerPointerEx(resource: Long, ownerpointer: Long, flags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exSetTimer(timer: Long, duetime: Long, period: Long, parameters: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exSetTimerResolution(desiredtime: Int, setresolution: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exSizeOfRundownProtectionCacheAware(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exSystemTimeToLocalTime(systemtime: Long, localtime: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exTryAcquireSpinLockExclusiveAtDpcLevel(spinlock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exTryAcquireSpinLockSharedAtDpcLevel(spinlock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exTryConvertSharedSpinLockExclusive(spinlock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exTryToAcquireFastMutex(fastmutex: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exUnregisterCallback(callbackregistration: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exUuidCreate(uuid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exVerifySuite(suitetype: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exWaitForRundownProtectionRelease(runref: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_exWaitForRundownProtectionReleaseCacheAware(runref: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_fsRtlIsTotalDeviceFailure(status: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_halAcquireDisplayOwnership(resetdisplayparameters: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_halAllocateCommonBuffer(adapterobject: Long, length: Int, logicaladdress: Long, cacheenabled: Boolean): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_halAllocateCrashDumpRegisters(adapterobject: Long, numberofmapregisters: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_halAllocateHardwareCounters(groupaffinty: Long, groupcount: Int, resourcelist: Long, countersethandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_halAssignSlotResources(registrypath: Long, driverclassname: Long, driverobject: Long, deviceobject: Long, bustype: Int, busnumber: Int, slotnumber: Int, allocatedresources: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_halBugCheckSystem(errorsource: Long, errorrecord: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_halDmaAllocateCrashDumpRegistersEx(adapter: Long, numberofmapregisters: Int, type: Int, mapregisterbase: Long, mapregistersavailable: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_halDmaFreeCrashDumpRegistersEx(adapter: Long, type: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_halExamineMBR(deviceobject: Long, sectorsize: Int, mbrtypeidentifier: Int, buffer: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_halFreeCommonBuffer(adapterobject: Long, length: Int, logicaladdress: Long, virtualaddress: Long, cacheenabled: Boolean)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_halFreeHardwareCounters(countersethandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_halGetAdapter(devicedescription: Long, numberofmapregisters: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_halGetBusData(busdatatype: Int, busnumber: Int, slotnumber: Int, buffer: Long, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_halGetBusDataByOffset(busdatatype: Int, busnumber: Int, slotnumber: Int, buffer: Long, offset: Int, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_halGetInterruptVector(interfacetype: Int, busnumber: Int, businterruptlevel: Int, businterruptvector: Int, irql: Long, affinity: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_halMakeBeep(frequency: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_halReadDmaCounter(adapterobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_halSetBusData(busdatatype: Int, busnumber: Int, slotnumber: Int, buffer: Long, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_halSetBusDataByOffset(busdatatype: Int, busnumber: Int, slotnumber: Int, buffer: Long, offset: Int, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_halTranslateBusAddress(interfacetype: Int, busnumber: Int, busaddress: Long, addressspace: Long, translatedaddress: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_hvlRegisterWheaErrorNotification(callback: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_hvlUnregisterWheaErrorNotification(callback: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioAcquireCancelSpinLock(irql: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioAcquireKsrPersistentMemory(driverobject: Long, physicaldeviceobject: Long, buffer: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioAcquireKsrPersistentMemoryEx(driverobject: Long, physicaldeviceobject: Long, physicaldeviceid: Long, datatag: Long, dataversion: Long, buffer: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioAcquireRemoveLockEx(removelock: Long, tag: Long, file: Long, line: Int, remlocksize: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioAllocateDriverObjectExtension(driverobject: Long, clientidentificationaddress: Long, driverobjectextensionsize: Int, driverobjectextension: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioAllocateErrorLogEntry(ioobject: Long, entrysize: Byte): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioAllocateIrp(stacksize: Byte, chargequota: Boolean): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioAllocateIrpEx(deviceobject: Long, stacksize: Byte, chargequota: Boolean): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioAllocateMdl(virtualaddress: Long, length: Int, secondarybuffer: Boolean, chargequota: Boolean, irp: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioAllocateSfioStreamIdentifier(fileobject: Long, length: Int, signature: Long, streamidentifier: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioAllocateWorkItem(deviceobject: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioAssignResources(registrypath: Long, driverclassname: Long, driverobject: Long, deviceobject: Long, requestedresources: Long, allocatedresources: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioAttachDevice(sourcedevice: Long, targetdevice: Long, attacheddevice: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioAttachDeviceByPointer(sourcedevice: Long, targetdevice: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioAttachDeviceToDeviceStack(sourcedevice: Long, targetdevice: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioAttachDeviceToDeviceStackSafe(sourcedevice: Long, targetdevice: Long, attachedtodeviceobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioBuildAsynchronousFsdRequest(majorfunction: Int, deviceobject: Long, buffer: Long, length: Int, startingoffset: Long, iostatusblock: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioBuildDeviceIoControlRequest(iocontrolcode: Int, deviceobject: Long, inputbuffer: Long, inputbufferlength: Int, outputbuffer: Long, outputbufferlength: Int, internaldeviceiocontrol: Boolean, event: Long, iostatusblock: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioBuildPartialMdl(sourcemdl: Long, targetmdl: Long, virtualaddress: Long, length: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioBuildSynchronousFsdRequest(majorfunction: Int, deviceobject: Long, buffer: Long, length: Int, startingoffset: Long, event: Long, iostatusblock: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioCancelFileOpen(deviceobject: Long, fileobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioCancelIrp(irp: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioCheckLinkShareAccess(desiredaccess: Int, desiredshareaccess: Int, fileobject: Long, shareaccess: Long, linkshareaccess: Long, ioshareaccessflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioCheckShareAccess(desiredaccess: Int, desiredshareaccess: Int, fileobject: Long, shareaccess: Long, update: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioCheckShareAccessEx(desiredaccess: Int, desiredshareaccess: Int, fileobject: Long, shareaccess: Long, update: Boolean, writepermission: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioCleanupIrp(irp: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioClearActivityIdThread(originalid: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioClearIrpExtraCreateParameter(irp: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioConnectInterrupt(interruptobject: Long, serviceroutine: Long, servicecontext: Long, spinlock: Long, vector: Int, irql: Byte, synchronizeirql: Byte, interruptmode: Int, sharevector: Boolean, processorenablemask: Long, floatingsave: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioConnectInterruptEx(parameters: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioCreateController(size: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioCreateDevice(driverobject: Long, deviceextensionsize: Int, devicename: Long, devicetype: Int, devicecharacteristics: Int, exclusive: Boolean, deviceobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioCreateDisk(deviceobject: Long, disk: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioCreateFile(filehandle: Long, desiredaccess: Int, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: Int, shareaccess: Int, disposition: Int, createoptions: Int, eabuffer: Long, ealength: Int, createfiletype: Int, internalparameters: Long, options: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioCreateFileEx(filehandle: Long, desiredaccess: Int, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: Int, shareaccess: Int, disposition: Int, createoptions: Int, eabuffer: Long, ealength: Int, createfiletype: Int, internalparameters: Long, options: Int, drivercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioCreateFileSpecifyDeviceObjectHint(filehandle: Long, desiredaccess: Int, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: Int, shareaccess: Int, disposition: Int, createoptions: Int, eabuffer: Long, ealength: Int, createfiletype: Int, internalparameters: Long, options: Int, deviceobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioCreateNotificationEvent(eventname: Long, eventhandle: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioCreateSymbolicLink(symboliclinkname: Long, devicename: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioCreateSynchronizationEvent(eventname: Long, eventhandle: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioCreateSystemThread(ioobject: Long, threadhandle: Long, desiredaccess: Int, objectattributes: Long, processhandle: Long, clientid: Long, startroutine: Long, startcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioCreateUnprotectedSymbolicLink(symboliclinkname: Long, devicename: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioCsqInitialize(csq: Long, csqinsertirp: Long, csqremoveirp: Long, csqpeeknextirp: Long, csqacquirelock: Long, csqreleaselock: Long, csqcompletecanceledirp: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioCsqInitializeEx(csq: Long, csqinsertirp: Long, csqremoveirp: Long, csqpeeknextirp: Long, csqacquirelock: Long, csqreleaselock: Long, csqcompletecanceledirp: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioCsqInsertIrp(csq: Long, irp: Long, context: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioCsqInsertIrpEx(csq: Long, irp: Long, context: Long, insertcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioCsqRemoveIrp(csq: Long, context: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioCsqRemoveNextIrp(csq: Long, peekcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioDecrementKeepAliveCount(fileobject: Long, process: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioDeleteController(controllerobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioDeleteDevice(deviceobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioDeleteSymbolicLink(symboliclinkname: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioDetachDevice(targetdevice: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioDisconnectInterrupt(interruptobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioDisconnectInterruptEx(parameters: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioEnumerateKsrPersistentMemoryEx(driverobject: Long, physicaldeviceobject: Long, physicaldeviceid: Long, callback: Long, callbackcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioFlushAdapterBuffers(adapterobject: Long, mdl: Long, mapregisterbase: Long, currentva: Long, length: Int, writetodevice: Boolean): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioForwardIrpSynchronously(deviceobject: Long, irp: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioFreeAdapterChannel(adapterobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioFreeController(controllerobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioFreeErrorLogEntry(elentry: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioFreeIrp(irp: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioFreeKsrPersistentMemory(datahandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioFreeMapRegisters(adapterobject: Long, mapregisterbase: Long, numberofmapregisters: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioFreeMdl(mdl: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioFreeSfioStreamIdentifier(fileobject: Long, signature: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioFreeWorkItem(ioworkitem: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioGetActivityIdIrp(irp: Long, guid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioGetActivityIdThread(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioGetAffinityInterrupt(interruptobject: Long, groupaffinity: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioGetAttachedDeviceReference(deviceobject: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioGetBootDiskInformation(bootdiskinformation: Long, size: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioGetBootDiskInformationLite(bootdiskinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioGetConfigurationInformation(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioGetContainerInformation(informationclass: Int, containerobject: Long, buffer: Long, bufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioGetCurrentProcess(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioGetDeviceDirectory(physicaldeviceobject: Long, directorytype: Int, flags: Int, reserved: Long, devicedirectoryhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioGetDeviceInterfaceAlias(symboliclinkname: Long, aliasinterfaceclassguid: Long, aliassymboliclinkname: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioGetDeviceInterfacePropertyData(symboliclinkname: Long, propertykey: Long, lcid: Int, flags: Int, size: Int, data: Long, requiredsize: Long, type: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioGetDeviceInterfaces(interfaceclassguid: Long, physicaldeviceobject: Long, flags: Int, symboliclinklist: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioGetDeviceNumaNode(pdo: Long, nodenumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioGetDeviceObjectPointer(objectname: Long, desiredaccess: Int, fileobject: Long, deviceobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioGetDeviceProperty(deviceobject: Long, deviceproperty: Int, bufferlength: Int, propertybuffer: Long, resultlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioGetDevicePropertyData(pdo: Long, propertykey: Long, lcid: Int, flags: Int, size: Int, data: Long, requiredsize: Long, type: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioGetDmaAdapter(physicaldeviceobject: Long, devicedescription: Long, numberofmapregisters: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioGetDriverDirectory(driverobject: Long, directorytype: Int, flags: Int, driverdirectoryhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioGetDriverObjectExtension(driverobject: Long, clientidentificationaddress: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioGetFileObjectGenericMapping(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioGetFsZeroingOffset(irp: Long, zeroingoffset: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioGetInitialStack(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioGetInitiatorProcess(fileobject: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioGetIoAttributionHandle(irp: Long, ioattributionhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioGetIoPriorityHint(irp: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioGetIommuInterface(version: Int, interfaceout: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioGetIommuInterfaceEx(version: Int, flags: Long, interfaceout: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioGetIrpExtraCreateParameter(irp: Long, extracreateparameter: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioGetPagingIoPriority(irp: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioGetRelatedDeviceObject(fileobject: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioGetSfioStreamIdentifier(fileobject: Long, signature: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioGetSilo(fileobject: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioGetSiloParameters(fileobject: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioGetStackLimits(lowlimit: Long, highlimit: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioGetTopLevelIrp(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioGetTransactionParameterBlock(fileobject: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioIncrementKeepAliveCount(fileobject: Long, process: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioInitializeIrp(irp: Long, packetsize: Short, stacksize: Byte)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioInitializeIrpEx(irp: Long, deviceobject: Long, packetsize: Short, stacksize: Byte)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioInitializeRemoveLockEx(lock: Long, allocatetag: Int, maxlockedminutes: Int, highwatermark: Int, remlocksize: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioInitializeTimer(deviceobject: Long, timerroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioInitializeWorkItem(ioobject: Long, ioworkitem: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioInvalidateDeviceRelations(deviceobject: Long, type: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioInvalidateDeviceState(physicaldeviceobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioIs32bitProcess(irp: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioIsFileObjectIgnoringSharing(fileobject: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioIsFileOriginRemote(fileobject: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioIsInitiator32bitProcess(irp: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioIsValidIrpStatus(status: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioIsWdmVersionAvailable(majorversion: Byte, minorversion: Byte): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioMakeAssociatedIrp(irp: Long, stacksize: Byte): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioMakeAssociatedIrpEx(irp: Long, deviceobject: Long, stacksize: Byte): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioMapTransfer(adapterobject: Long, mdl: Long, mapregisterbase: Long, currentva: Long, length: Long, writetodevice: Boolean): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioOpenDeviceInterfaceRegistryKey(symboliclinkname: Long, desiredaccess: Int, deviceinterfaceregkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioOpenDeviceRegistryKey(deviceobject: Long, devinstkeytype: Int, desiredaccess: Int, deviceregkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioOpenDriverRegistryKey(driverobject: Long, regkeytype: Int, desiredaccess: Int, flags: Int, driverregkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioPropagateActivityIdToThread(irp: Long, propagatedid: Long, originalid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioQueryDeviceDescription(bustype: Long, busnumber: Long, controllertype: Long, controllernumber: Long, peripheraltype: Long, peripheralnumber: Long, calloutroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioQueryFullDriverPath(driverobject: Long, fullpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioQueryInformationByName(objectattributes: Long, iostatusblock: Long, fileinformation: Long, length: Int, fileinformationclass: Int, options: Int, drivercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioQueryKsrPersistentMemorySize(driverobject: Long, physicaldeviceobject: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioQueryKsrPersistentMemorySizeEx(driverobject: Long, physicaldeviceobject: Long, physicaldeviceid: Long, datatag: Long, dataversion: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioQueueWorkItem(ioworkitem: Long, workerroutine: Long, queuetype: Int, context: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioQueueWorkItemEx(ioworkitem: Long, workerroutine: Long, queuetype: Int, context: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioRaiseHardError(irp: Long, vpb: Long, realdeviceobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioRaiseInformationalHardError(errorstatus: Int, string: Long, thread: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioReadDiskSignature(deviceobject: Long, bytespersector: Int, signature: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioReadPartitionTable(deviceobject: Long, sectorsize: Int, returnrecognizedpartitions: Boolean, partitionbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioReadPartitionTableEx(deviceobject: Long, drivelayout: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioRecordIoAttribution(opaquehandle: Long, attributioninformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioRegisterBootDriverCallback(callbackfunction: Long, callbackcontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioRegisterContainerNotification(notificationclass: Int, callbackfunction: Long, notificationinformation: Long, notificationinformationlength: Int, callbackregistration: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioRegisterDeviceInterface(physicaldeviceobject: Long, interfaceclassguid: Long, referencestring: Long, symboliclinkname: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioRegisterLastChanceShutdownNotification(deviceobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioRegisterPlugPlayNotification(eventcategory: Int, eventcategoryflags: Int, eventcategorydata: Long, driverobject: Long, callbackroutine: Long, context: Long, notificationentry: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioRegisterShutdownNotification(deviceobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioReleaseCancelSpinLock(irql: Byte)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioReleaseRemoveLockAndWaitEx(removelock: Long, tag: Long, remlocksize: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioReleaseRemoveLockEx(removelock: Long, tag: Long, remlocksize: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioRemoveLinkShareAccess(fileobject: Long, shareaccess: Long, linkshareaccess: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioRemoveLinkShareAccessEx(fileobject: Long, shareaccess: Long, linkshareaccess: Long, ioshareaccessflags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioRemoveShareAccess(fileobject: Long, shareaccess: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioReplacePartitionUnit(targetpdo: Long, sparepdo: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioReportDetectedDevice(driverobject: Long, legacybustype: Int, busnumber: Int, slotnumber: Int, resourcelist: Long, resourcerequirements: Long, resourceassigned: Boolean, deviceobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioReportInterruptActive(parameters: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioReportInterruptInactive(parameters: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioReportResourceForDetection(driverobject: Long, driverlist: Long, driverlistsize: Int, deviceobject: Long, devicelist: Long, devicelistsize: Int, conflictdetected: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioReportResourceUsage(driverclassname: Long, driverobject: Long, driverlist: Long, driverlistsize: Int, deviceobject: Long, devicelist: Long, devicelistsize: Int, overrideconflict: Boolean, conflictdetected: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioReportRootDevice(driverobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioReportTargetDeviceChange(physicaldeviceobject: Long, notificationstructure: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioReportTargetDeviceChangeAsynchronous(physicaldeviceobject: Long, notificationstructure: Long, callback: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioRequestDeviceEject(physicaldeviceobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioRequestDeviceEjectEx(physicaldeviceobject: Long, callback: Long, context: Long, driverobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioReserveKsrPersistentMemory(driverobject: Long, physicaldeviceobject: Long, size: Long, flags: Int, datahandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioReserveKsrPersistentMemoryEx(driverobject: Long, physicaldeviceobject: Long, physicaldeviceid: Long, datatag: Long, dataversion: Int, size: Long, flags: Int, datahandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioReuseIrp(irp: Long, iostatus: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioSetActivityIdIrp(irp: Long, guid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioSetActivityIdThread(activityid: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioSetCompletionRoutineEx(deviceobject: Long, irp: Long, completionroutine: Long, context: Long, invokeonsuccess: Boolean, invokeonerror: Boolean, invokeoncancel: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioSetDeviceInterfacePropertyData(symboliclinkname: Long, propertykey: Long, lcid: Int, flags: Int, type: Int, size: Int, data: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioSetDeviceInterfaceState(symboliclinkname: Long, enable: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioSetDevicePropertyData(pdo: Long, propertykey: Long, lcid: Int, flags: Int, type: Int, size: Int, data: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioSetFileObjectIgnoreSharing(fileobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioSetFileOrigin(fileobject: Long, remote: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioSetFsZeroingOffset(irp: Long, zeroingoffset: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioSetFsZeroingOffsetRequired(irp: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioSetHardErrorOrVerifyDevice(irp: Long, deviceobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioSetIoAttributionIrp(irp: Long, attributionsource: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioSetIoPriorityHint(irp: Long, priorityhint: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioSetIrpExtraCreateParameter(irp: Long, extracreateparameter: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioSetLinkShareAccess(desiredaccess: Int, desiredshareaccess: Int, fileobject: Long, shareaccess: Long, linkshareaccess: Long, ioshareaccessflags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioSetMasterIrpStatus(masterirp: Long, status: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioSetPartitionInformation(deviceobject: Long, sectorsize: Int, partitionnumber: Int, partitiontype: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioSetPartitionInformationEx(deviceobject: Long, partitionnumber: Int, partitioninfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioSetShareAccess(desiredaccess: Int, desiredshareaccess: Int, fileobject: Long, shareaccess: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioSetShareAccessEx(desiredaccess: Int, desiredshareaccess: Int, fileobject: Long, shareaccess: Long, writepermission: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioSetStartIoAttributes(deviceobject: Long, deferredstartio: Boolean, noncancelable: Boolean)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioSetSystemPartition(volumenamestring: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioSetThreadHardErrorMode(enableharderrors: Boolean): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioSetTopLevelIrp(irp: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioSizeOfIrpEx(deviceobject: Long, stacksize: Byte): Short

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioSizeofWorkItem(): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioStartNextPacket(deviceobject: Long, cancelable: Boolean)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioStartNextPacketByKey(deviceobject: Long, cancelable: Boolean, key: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioStartTimer(deviceobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioStopTimer(deviceobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioSynchronousCallDriver(deviceobject: Long, irp: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioTransferActivityId(activityid: Long, relatedactivityid: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioTranslateBusAddress(interfacetype: Int, busnumber: Int, busaddress: Long, addressspace: Long, translatedaddress: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioTryQueueWorkItem(ioworkitem: Long, workerroutine: Long, queuetype: Int, context: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioUninitializeWorkItem(ioworkitem: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioUnregisterBootDriverCallback(callbackhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioUnregisterContainerNotification(callbackregistration: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioUnregisterPlugPlayNotification(notificationentry: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioUnregisterPlugPlayNotificationEx(notificationentry: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioUnregisterShutdownNotification(deviceobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioUpdateLinkShareAccess(fileobject: Long, shareaccess: Long, linkshareaccess: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioUpdateLinkShareAccessEx(fileobject: Long, shareaccess: Long, linkshareaccess: Long, ioshareaccessflags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioUpdateShareAccess(fileobject: Long, shareaccess: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioValidateDeviceIoControlAccess(irp: Long, requiredaccess: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioVerifyPartitionTable(deviceobject: Long, fixerrors: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioVolumeDeviceNameToGuid(volumedevicename: Long, guid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioVolumeDeviceNameToGuidPath(volumedevicename: Long, guidpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioVolumeDeviceToDosName(volumedeviceobject: Long, dosname: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioVolumeDeviceToGuid(volumedeviceobject: Long, guid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioVolumeDeviceToGuidPath(volumedeviceobject: Long, guidpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioWMIAllocateInstanceIds(guid: Long, instancecount: Int, firstinstanceid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioWMIDeviceObjectToInstanceName(datablockobject: Long, deviceobject: Long, instancename: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioWMIExecuteMethod(datablockobject: Long, instancename: Long, methodid: Int, inbuffersize: Int, outbuffersize: Long, inoutbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioWMIHandleToInstanceName(datablockobject: Long, filehandle: Long, instancename: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioWMIOpenBlock(guid: Long, desiredaccess: Int, datablockobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioWMIQueryAllData(datablockobject: Long, inoutbuffersize: Long, outbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioWMIQueryAllDataMultiple(datablockobjectlist: Long, objectcount: Int, inoutbuffersize: Long, outbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioWMIQuerySingleInstance(datablockobject: Long, instancename: Long, inoutbuffersize: Long, outbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioWMIQuerySingleInstanceMultiple(datablockobjectlist: Long, instancenames: Long, objectcount: Int, inoutbuffersize: Long, outbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioWMIRegistrationControl(deviceobject: Long, action: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioWMISetNotificationCallback(obj: Long, callback: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioWMISetSingleInstance(datablockobject: Long, instancename: Long, version: Int, valuebuffersize: Int, valuebuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioWMISetSingleItem(datablockobject: Long, instancename: Long, dataitemid: Int, version: Int, valuebuffersize: Int, valuebuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioWMISuggestInstanceName(physicaldeviceobject: Long, symboliclinkname: Long, combinenames: Boolean, suggestedinstancename: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioWMIWriteEvent(wnodeeventitem: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioWithinStackLimits(regionstart: Long, regionsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioWriteErrorLogEntry(elentry: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioWriteKsrPersistentMemory(datahandle: Long, buffer: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioWritePartitionTable(deviceobject: Long, sectorsize: Int, sectorspertrack: Int, numberofheads: Int, partitionbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ioWritePartitionTableEx(deviceobject: Long, drivelayout: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_iofCallDriver(deviceobject: Long, irp: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_iofCompleteRequest(irp: Long, priorityboost: Byte)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_kdChangeOption(option: Int, inbufferbytes: Int, inbuffer: Long, outbufferbytes: Int, outbuffer: Long, outbufferneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_kdDisableDebugger(): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_kdEnableDebugger(): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_kdRefreshDebuggerNotPresent(): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keAcquireGuardedMutex(mutex: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keAcquireGuardedMutexUnsafe(fastmutex: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keAcquireInStackQueuedSpinLock(spinlock: Long, lockhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keAcquireInStackQueuedSpinLockAtDpcLevel(spinlock: Long, lockhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keAcquireInStackQueuedSpinLockForDpc(spinlock: Long, lockhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keAcquireInterruptSpinLock(interrupt: Long): Byte

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keAcquireSpinLockForDpc(spinlock: Long): Byte

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keAddTriageDumpDataBlock(ktriagedumpdataarray: Long, address: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keAreAllApcsDisabled(): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keAreApcsDisabled(): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keBugCheck(bugcheckcode: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keBugCheckEx(bugcheckcode: Int, bugcheckparameter1: Long, bugcheckparameter2: Long, bugcheckparameter3: Long, bugcheckparameter4: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keCancelTimer(param0: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keClearEvent(event: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keConvertAuxiliaryCounterToPerformanceCounter(auxiliarycountervalue: Long, performancecountervalue: Long, conversionerror: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keConvertPerformanceCounterToAuxiliaryCounter(performancecountervalue: Long, auxiliarycountervalue: Long, conversionerror: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keDelayExecutionThread(waitmode: Byte, alertable: Boolean, interval: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keDeregisterBoundCallback(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keDeregisterBugCheckCallback(callbackrecord: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keDeregisterBugCheckReasonCallback(callbackrecord: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keDeregisterNmiCallback(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keDeregisterProcessorChangeCallback(callbackhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keEnterCriticalRegion()

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keEnterGuardedRegion()

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keExpandKernelStackAndCallout(callout: Long, parameter: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keExpandKernelStackAndCalloutEx(callout: Long, parameter: Long, size: Long, wait: Boolean, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keFlushIoBuffers(mdl: Long, readoperation: Boolean, dmaoperation: Boolean)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keFlushQueuedDpcs()

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keFlushWriteBuffer()

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keGetCurrentIrql(): Byte

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keGetCurrentNodeNumber(): Short

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keGetCurrentProcessorNumberEx(procnumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keGetProcessorIndexFromNumber(procnumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keGetProcessorNumberFromIndex(procindex: Int, procnumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keGetRecommendedSharedDataAlignment(): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keInitializeCrashDumpHeader(dumptype: Int, flags: Int, buffer: Long, buffersize: Int, bufferneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keInitializeDeviceQueue(devicequeue: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keInitializeDpc(dpc: Long, deferredroutine: Long, deferredcontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keInitializeEvent(event: Long, type: Int, state: Boolean)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keInitializeGuardedMutex(mutex: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keInitializeMutex(mutex: Long, level: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keInitializeSemaphore(semaphore: Long, count: Int, limit: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keInitializeSpinLock(spinlock: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keInitializeThreadedDpc(dpc: Long, deferredroutine: Long, deferredcontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keInitializeTimer(timer: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keInitializeTimerEx(timer: Long, type: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keInitializeTriageDumpDataArray(ktriagedumpdataarray: Long, size: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keInsertByKeyDeviceQueue(devicequeue: Long, devicequeueentry: Long, sortkey: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keInsertDeviceQueue(devicequeue: Long, devicequeueentry: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keInsertQueueDpc(dpc: Long, systemargument1: Long, systemargument2: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keInvalidateAllCaches(): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keInvalidateRangeAllCaches(baseaddress: Long, length: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keIpiGenericCall(broadcastfunction: Long, context: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keIsExecutingDpc(): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keLeaveCriticalRegion()

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keLeaveGuardedRegion()

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_kePulseEvent(event: Long, increment: Int, wait: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keQueryActiveGroupCount(): Short

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keQueryActiveProcessorCount(activeprocessors: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keQueryActiveProcessorCountEx(groupnumber: Short): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keQueryActiveProcessors(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keQueryAuxiliaryCounterFrequency(auxiliarycounterfrequency: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keQueryDpcWatchdogInformation(watchdoginformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keQueryGroupAffinity(groupnumber: Short): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keQueryHardwareCounterConfiguration(counterarray: Long, maximumcount: Int, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keQueryHighestNodeNumber(): Short

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keQueryInterruptTimePrecise(qpctimestamp: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keQueryLogicalProcessorRelationship(processornumber: Long, relationshiptype: Int, information: Long, length: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keQueryMaximumGroupCount(): Short

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keQueryMaximumProcessorCount(): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keQueryMaximumProcessorCountEx(groupnumber: Short): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keQueryNodeActiveAffinity(nodenumber: Short, affinity: Long, count: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keQueryNodeActiveAffinity2(nodenumber: Short, groupaffinities: Long, groupaffinitiescount: Short, groupaffinitiesrequired: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keQueryNodeActiveProcessorCount(nodenumber: Short): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keQueryNodeMaximumProcessorCount(nodenumber: Short): Short

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keQueryPerformanceCounter(performancefrequency: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keQueryPriorityThread(thread: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keQueryRuntimeThread(thread: Long, usertime: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keQuerySystemTimePrecise(currenttime: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keQueryTimeIncrement(): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keQueryTotalCycleTimeThread(thread: Long, cycletimestamp: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keQueryUnbiasedInterruptTime(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keQueryUnbiasedInterruptTimePrecise(qpctimestamp: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keReadStateEvent(event: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keReadStateMutex(mutex: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keReadStateSemaphore(semaphore: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keReadStateTimer(timer: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keRegisterBoundCallback(callbackroutine: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keRegisterBugCheckCallback(callbackrecord: Long, callbackroutine: Long, buffer: Long, length: Int, component: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keRegisterBugCheckReasonCallback(callbackrecord: Long, callbackroutine: Long, reason: Int, component: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keRegisterNmiCallback(callbackroutine: Long, context: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keRegisterProcessorChangeCallback(callbackfunction: Long, callbackcontext: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keReleaseGuardedMutex(mutex: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keReleaseGuardedMutexUnsafe(fastmutex: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keReleaseInStackQueuedSpinLock(lockhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keReleaseInStackQueuedSpinLockForDpc(lockhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keReleaseInStackQueuedSpinLockFromDpcLevel(lockhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keReleaseInterruptSpinLock(interrupt: Long, oldirql: Byte)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keReleaseMutex(mutex: Long, wait: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keReleaseSemaphore(semaphore: Long, increment: Int, adjustment: Int, wait: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keReleaseSpinLockForDpc(spinlock: Long, oldirql: Byte)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keRemoveByKeyDeviceQueue(devicequeue: Long, sortkey: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keRemoveByKeyDeviceQueueIfBusy(devicequeue: Long, sortkey: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keRemoveDeviceQueue(devicequeue: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keRemoveEntryDeviceQueue(devicequeue: Long, devicequeueentry: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keRemoveQueueDpc(dpc: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keRemoveQueueDpcEx(dpc: Long, waitifactive: Boolean): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keResetEvent(event: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keRestoreExtendedProcessorState(xstatesave: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keRevertToUserAffinityThread()

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keRevertToUserAffinityThreadEx(affinity: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keRevertToUserGroupAffinityThread(previousaffinity: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keSaveExtendedProcessorState(mask: Long, xstatesave: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keSetBasePriorityThread(thread: Long, increment: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keSetCoalescableTimer(timer: Long, duetime: Long, period: Int, tolerabledelay: Int, dpc: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keSetEvent(event: Long, increment: Int, wait: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keSetHardwareCounterConfiguration(counterarray: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keSetImportanceDpc(dpc: Long, importance: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keSetPriorityThread(thread: Long, priority: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keSetSystemAffinityThread(affinity: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keSetSystemAffinityThreadEx(affinity: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keSetSystemGroupAffinityThread(affinity: Long, previousaffinity: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keSetTargetProcessorDpc(dpc: Long, number: Byte)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keSetTargetProcessorDpcEx(dpc: Long, procnumber: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keSetTimer(timer: Long, duetime: Long, dpc: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keSetTimerEx(timer: Long, duetime: Long, period: Int, dpc: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keShouldYieldProcessor(): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keStallExecutionProcessor(microseconds: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keSynchronizeExecution(interrupt: Long, synchronizeroutine: Long, synchronizecontext: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keTestSpinLock(spinlock: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keTryToAcquireGuardedMutex(mutex: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keTryToAcquireSpinLockAtDpcLevel(spinlock: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keWaitForMultipleObjects(count: Int, obj: Long, waittype: Int, waitreason: Int, waitmode: Byte, alertable: Boolean, timeout: Long, waitblockarray: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_keWaitForSingleObject(obj: Long, waitreason: Int, waitmode: Byte, alertable: Boolean, timeout: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_kfRaiseIrql(newirql: Byte): Byte

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmAddPhysicalMemory(startaddress: Long, numberofbytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmAddVerifierSpecialThunks(entryroutine: Long, thunkbuffer: Long, thunkbuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmAddVerifierThunks(thunkbuffer: Long, thunkbuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmAdvanceMdl(mdl: Long, numberofbytes: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmAllocateContiguousMemory(numberofbytes: Long, highestacceptableaddress: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmAllocateContiguousMemoryEx(numberofbytes: Long, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, preferrednode: Int, protect: Int, partitionobject: Long, tag: Int, flags: Int, baseaddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmAllocateContiguousMemorySpecifyCache(numberofbytes: Long, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, cachetype: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmAllocateContiguousMemorySpecifyCacheNode(numberofbytes: Long, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, cachetype: Int, preferrednode: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmAllocateContiguousNodeMemory(numberofbytes: Long, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, protect: Int, preferrednode: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmAllocateMappingAddress(numberofbytes: Long, pooltag: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmAllocateMappingAddressEx(numberofbytes: Long, pooltag: Int, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmAllocateMdlForIoSpace(physicaladdresslist: Long, numberofentries: Long, newmdl: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmAllocateNodePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: Long, cachetype: Int, idealnode: Int, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmAllocateNonCachedMemory(numberofbytes: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmAllocatePagesForMdl(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmAllocatePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: Long, cachetype: Int, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmAllocatePartitionNodePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: Long, cachetype: Int, idealnode: Int, flags: Int, partitionobject: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmAreMdlPagesCached(memorydescriptorlist: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmBuildMdlForNonPagedPool(memorydescriptorlist: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmCreateMdl(memorydescriptorlist: Long, base: Long, length: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmCreateMirror(): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmFreeContiguousMemory(baseaddress: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmFreeContiguousMemorySpecifyCache(baseaddress: Long, numberofbytes: Long, cachetype: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmFreeMappingAddress(baseaddress: Long, pooltag: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmFreeNonCachedMemory(baseaddress: Long, numberofbytes: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmFreePagesFromMdl(memorydescriptorlist: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmFreePagesFromMdlEx(memorydescriptorlist: Long, flags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmGetCacheAttribute(physicaladdress: Long, cachetype: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmGetCacheAttributeEx(physicaladdress: Long, flags: Int, cachetype: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmGetPhysicalAddress(baseaddress: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmGetPhysicalMemoryRanges(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmGetPhysicalMemoryRangesEx(partitionobject: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmGetPhysicalMemoryRangesEx2(partitionobject: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmGetSystemRoutineAddress(systemroutinename: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmGetVirtualForPhysical(physicaladdress: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmIsAddressValid(virtualaddress: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmIsDriverSuspectForVerifier(driverobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmIsDriverVerifying(driverobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmIsDriverVerifyingByAddress(addresswithinsection: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmIsIoSpaceActive(startaddress: Long, numberofbytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmIsNonPagedSystemAddressValid(virtualaddress: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmIsThisAnNtAsSystem(): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmIsVerifierEnabled(verifierflags: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmLockPagableDataSection(addresswithinsection: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmLockPagableSectionByHandle(imagesectionhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmMapIoSpace(physicaladdress: Long, numberofbytes: Long, cachetype: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmMapIoSpaceEx(physicaladdress: Long, numberofbytes: Long, protect: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmMapLockedPages(memorydescriptorlist: Long, accessmode: Byte): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmMapLockedPagesSpecifyCache(memorydescriptorlist: Long, accessmode: Byte, cachetype: Int, requestedaddress: Long, bugcheckonfailure: Int, priority: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmMapLockedPagesWithReservedMapping(mappingaddress: Long, pooltag: Int, memorydescriptorlist: Long, cachetype: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmMapMdl(memorydescriptorlist: Long, protection: Int, driverroutine: Long, drivercontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmMapMemoryDumpMdlEx(va: Long, pagetotal: Int, memorydumpmdl: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmMapUserAddressesToPage(baseaddress: Long, numberofbytes: Long, pageaddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmMapVideoDisplay(physicaladdress: Long, numberofbytes: Long, cachetype: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmMapViewInSessionSpace(section: Long, mappedbase: Long, viewsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmMapViewInSessionSpaceEx(section: Long, mappedbase: Long, viewsize: Long, sectionoffset: Long, flags: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmMapViewInSystemSpace(section: Long, mappedbase: Long, viewsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmMapViewInSystemSpaceEx(section: Long, mappedbase: Long, viewsize: Long, sectionoffset: Long, flags: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmMdlPageContentsState(memorydescriptorlist: Long, state: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmPageEntireDriver(addresswithinsection: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmProbeAndLockPages(memorydescriptorlist: Long, accessmode: Byte, operation: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmProbeAndLockProcessPages(memorydescriptorlist: Long, process: Long, accessmode: Byte, operation: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmProbeAndLockSelectedPages(memorydescriptorlist: Long, segmentarray: Long, accessmode: Byte, operation: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmProtectDriverSection(addresswithinsection: Long, size: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmProtectMdlSystemAddress(memorydescriptorlist: Long, newprotect: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmQuerySystemSize(): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmRemovePhysicalMemory(startaddress: Long, numberofbytes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmResetDriverPaging(addresswithinsection: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmRotatePhysicalView(virtualaddress: Long, numberofbytes: Long, newmdl: Long, direction: Int, copyfunction: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmSecureVirtualMemory(address: Long, size: Long, probemode: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmSecureVirtualMemoryEx(address: Long, size: Long, probemode: Int, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmSetPermanentCacheAttribute(startaddress: Long, numberofbytes: Long, cachetype: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmSizeOfMdl(base: Long, length: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmUnlockPagableImageSection(imagesectionhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmUnlockPages(memorydescriptorlist: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmUnmapIoSpace(baseaddress: Long, numberofbytes: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmUnmapLockedPages(baseaddress: Long, memorydescriptorlist: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmUnmapReservedMapping(baseaddress: Long, pooltag: Int, memorydescriptorlist: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmUnmapVideoDisplay(baseaddress: Long, numberofbytes: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmUnmapViewInSessionSpace(mappedbase: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmUnmapViewInSystemSpace(mappedbase: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_mmUnsecureVirtualMemory(securehandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntAllocateLocallyUniqueId(luid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntCommitComplete(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntCommitEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntCommitTransaction(transactionhandle: Long, wait: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntCreateEnlistment(enlistmenthandle: Long, desiredaccess: Int, resourcemanagerhandle: Long, transactionhandle: Long, objectattributes: Long, createoptions: Int, notificationmask: Int, enlistmentkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntCreateResourceManager(resourcemanagerhandle: Long, desiredaccess: Int, tmhandle: Long, rmguid: Long, objectattributes: Long, createoptions: Int, description: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntCreateTransaction(transactionhandle: Long, desiredaccess: Int, objectattributes: Long, uow: Long, tmhandle: Long, createoptions: Int, isolationlevel: Int, isolationflags: Int, timeout: Long, description: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntCreateTransactionManager(tmhandle: Long, desiredaccess: Int, objectattributes: Long, logfilename: Long, createoptions: Int, commitstrength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntDisplayString(string: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntEnumerateTransactionObject(rootobjecthandle: Long, querytype: Int, objectcursor: Long, objectcursorlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntGetNotificationResourceManager(resourcemanagerhandle: Long, transactionnotification: Long, notificationlength: Int, timeout: Long, returnlength: Long, asynchronous: Int, asynchronouscontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntLoadDriver(driverservicename: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntMakeTemporaryObject(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntManagePartition(targethandle: Long, sourcehandle: Long, partitioninformationclass: Int, partitioninformation: Long, partitioninformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntOpenEnlistment(enlistmenthandle: Long, desiredaccess: Int, resourcemanagerhandle: Long, enlistmentguid: Long, objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntOpenResourceManager(resourcemanagerhandle: Long, desiredaccess: Int, tmhandle: Long, resourcemanagerguid: Long, objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntOpenTransaction(transactionhandle: Long, desiredaccess: Int, objectattributes: Long, uow: Long, tmhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntOpenTransactionManager(tmhandle: Long, desiredaccess: Int, objectattributes: Long, logfilename: Long, tmidentity: Long, openoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntPowerInformation(informationlevel: Int, inputbuffer: Long, inputbufferlength: Int, outputbuffer: Long, outputbufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntPrePrepareComplete(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntPrePrepareEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntPrepareComplete(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntPrepareEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntPropagationComplete(resourcemanagerhandle: Long, requestcookie: Int, bufferlength: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntPropagationFailed(resourcemanagerhandle: Long, requestcookie: Int, propstatus: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntQueryInformationEnlistment(enlistmenthandle: Long, enlistmentinformationclass: Int, enlistmentinformation: Long, enlistmentinformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntQueryInformationResourceManager(resourcemanagerhandle: Long, resourcemanagerinformationclass: Int, resourcemanagerinformation: Long, resourcemanagerinformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntQueryInformationTransaction(transactionhandle: Long, transactioninformationclass: Int, transactioninformation: Long, transactioninformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntQueryInformationTransactionManager(transactionmanagerhandle: Long, transactionmanagerinformationclass: Int, transactionmanagerinformation: Long, transactionmanagerinformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntReadOnlyEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntRecoverEnlistment(enlistmenthandle: Long, enlistmentkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntRecoverResourceManager(resourcemanagerhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntRecoverTransactionManager(transactionmanagerhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntRegisterProtocolAddressInformation(resourcemanager: Long, protocolid: Long, protocolinformationsize: Int, protocolinformation: Long, createoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntRenameTransactionManager(logfilename: Long, existingtransactionmanagerguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntRollbackComplete(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntRollbackEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntRollbackTransaction(transactionhandle: Long, wait: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntRollforwardTransactionManager(transactionmanagerhandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntSetInformationEnlistment(enlistmenthandle: Long, enlistmentinformationclass: Int, enlistmentinformation: Long, enlistmentinformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntSetInformationResourceManager(resourcemanagerhandle: Long, resourcemanagerinformationclass: Int, resourcemanagerinformation: Long, resourcemanagerinformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntSetInformationTransaction(transactionhandle: Long, transactioninformationclass: Int, transactioninformation: Long, transactioninformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntSetInformationTransactionManager(tmhandle: Long, transactionmanagerinformationclass: Int, transactionmanagerinformation: Long, transactionmanagerinformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntSinglePhaseReject(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_ntUnloadDriver(driverservicename: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_obCloseHandle(handle: Long, previousmode: Byte): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_obDereferenceObjectDeferDelete(obj: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_obDereferenceObjectDeferDeleteWithTag(obj: Long, tag: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_obGetFilterVersion(): Short

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_obGetObjectSecurity(obj: Long, securitydescriptor: Long, memoryallocated: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_obReferenceObjectByHandle(handle: Long, desiredaccess: Int, objecttype: Long, accessmode: Byte, obj: Long, handleinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_obReferenceObjectByHandleWithTag(handle: Long, desiredaccess: Int, objecttype: Long, accessmode: Byte, tag: Int, obj: Long, handleinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_obReferenceObjectByPointer(obj: Long, desiredaccess: Int, objecttype: Long, accessmode: Byte): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_obReferenceObjectByPointerWithTag(obj: Long, desiredaccess: Int, objecttype: Long, accessmode: Byte, tag: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_obReferenceObjectSafe(obj: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_obReferenceObjectSafeWithTag(obj: Long, tag: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_obRegisterCallbacks(callbackregistration: Long, registrationhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_obReleaseObjectSecurity(securitydescriptor: Long, memoryallocated: Boolean)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_obUnRegisterCallbacks(registrationhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_obfDereferenceObject(obj: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_obfDereferenceObjectWithTag(obj: Long, tag: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_obfReferenceObject(obj: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_obfReferenceObjectWithTag(obj: Long, tag: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_pcwAddInstance(buffer: Long, name: Long, id: Int, count: Int, data: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_pcwCloseInstance(instance: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_pcwCreateInstance(instance: Long, registration: Long, name: Long, count: Int, data: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_pcwRegister(registration: Long, info: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_pcwUnregister(registration: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poCallDriver(deviceobject: Long, irp: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poClearPowerRequest(powerrequest: Long, type: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poCreatePowerRequest(powerrequest: Long, deviceobject: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poCreateThermalRequest(thermalrequest: Long, targetdeviceobject: Long, policydeviceobject: Long, context: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poDeletePowerRequest(powerrequest: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poDeleteThermalRequest(thermalrequest: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poEndDeviceBusy(idlepointer: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poFxActivateComponent(handle: Long, component: Int, flags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poFxCompleteDevicePowerNotRequired(handle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poFxCompleteDirectedPowerDown(handle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poFxCompleteIdleCondition(handle: Long, component: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poFxCompleteIdleState(handle: Long, component: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poFxIdleComponent(handle: Long, component: Int, flags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poFxIssueComponentPerfStateChange(handle: Long, flags: Int, component: Int, perfchange: Long, context: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poFxIssueComponentPerfStateChangeMultiple(handle: Long, flags: Int, component: Int, perfchangescount: Int, perfchanges: Long, context: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poFxNotifySurprisePowerOn(pdo: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poFxPowerControl(handle: Long, powercontrolcode: Long, inbuffer: Long, inbuffersize: Long, outbuffer: Long, outbuffersize: Long, bytesreturned: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poFxPowerOnCrashdumpDevice(handle: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poFxQueryCurrentComponentPerfState(handle: Long, flags: Int, component: Int, setindex: Int, currentperf: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poFxRegisterComponentPerfStates(handle: Long, component: Int, flags: Long, componentperfstatecallback: Long, inputstateinfo: Long, outputstateinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poFxRegisterCrashdumpDevice(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poFxRegisterDevice(pdo: Long, device: Long, handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poFxRegisterDripsWatchdogCallback(handle: Long, callback: Long, includechilddevices: Boolean, matchingdriverobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poFxReportDevicePoweredOn(handle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poFxSetComponentLatency(handle: Long, component: Int, latency: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poFxSetComponentResidency(handle: Long, component: Int, residency: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poFxSetComponentWake(handle: Long, component: Int, wakehint: Boolean)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poFxSetDeviceIdleTimeout(handle: Long, idletimeout: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poFxSetTargetDripsDevicePowerState(handle: Long, targetstate: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poFxStartDevicePowerManagement(handle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poFxUnregisterDevice(handle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poGetSystemWake(irp: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poGetThermalRequestSupport(thermalrequest: Long, type: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poQueryWatchdogTime(pdo: Long, secondsremaining: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poRegisterDeviceForIdleDetection(deviceobject: Long, conservationidletime: Int, performanceidletime: Int, state: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poRegisterPowerSettingCallback(deviceobject: Long, settingguid: Long, callback: Long, context: Long, handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poRegisterSystemState(statehandle: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poSetDeviceBusyEx(idlepointer: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poSetHiberRange(memorymap: Long, flags: Int, address: Long, length: Long, tag: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poSetPowerRequest(powerrequest: Long, type: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poSetSystemState(flags: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poSetSystemWake(irp: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poSetSystemWakeDevice(deviceobject: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poSetThermalActiveCooling(thermalrequest: Long, engaged: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poSetThermalPassiveCooling(thermalrequest: Long, throttle: Byte): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poStartDeviceBusy(idlepointer: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poStartNextPowerIrp(irp: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poUnregisterPowerSettingCallback(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_poUnregisterSystemState(statehandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_probeForRead(address: Long, length: Long, alignment: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_probeForWrite(address: Long, length: Long, alignment: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psAcquireSiloHardReference(silo: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psAllocSiloContextSlot(reserved: Long, returnedcontextslot: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psAllocateAffinityToken(affinitytoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psAttachSiloToCurrentThread(silo: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psCreateSiloContext(silo: Long, size: Int, pooltype: Int, contextcleanupcallback: Long, returnedsilocontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psCreateSystemThread(threadhandle: Long, desiredaccess: Int, objectattributes: Long, processhandle: Long, clientid: Long, startroutine: Long, startcontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psDereferenceSiloContext(silocontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psDetachSiloFromCurrentThread(previoussilo: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psFreeAffinityToken(affinitytoken: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psFreeSiloContextSlot(contextslot: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psGetCurrentProcessId(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psGetCurrentServerSilo(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psGetCurrentServerSiloName(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psGetCurrentSilo(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psGetCurrentThreadId(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psGetCurrentThreadTeb(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psGetEffectiveServerSilo(silo: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psGetHostSilo(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psGetJobServerSilo(job: Long, serversilo: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psGetJobSilo(job: Long, silo: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psGetParentSilo(job: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psGetPermanentSiloContext(silo: Long, contextslot: Int, returnedsilocontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psGetProcessCreateTimeQuadPart(process: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psGetProcessExitStatus(process: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psGetProcessId(process: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psGetProcessStartKey(process: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psGetServerSiloServiceSessionId(silo: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psGetSiloContainerId(silo: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psGetSiloContext(silo: Long, contextslot: Int, returnedsilocontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psGetSiloMonitorContextSlot(monitor: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psGetThreadCreateTime(thread: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psGetThreadExitStatus(thread: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psGetThreadId(thread: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psGetThreadProcessId(thread: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psGetThreadProperty(thread: Long, key: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psGetThreadServerSilo(thread: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psGetVersion(majorversion: Long, minorversion: Long, buildnumber: Long, csdversion: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psInsertPermanentSiloContext(silo: Long, contextslot: Int, silocontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psInsertSiloContext(silo: Long, contextslot: Int, silocontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psIsCurrentThreadInServerSilo(): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psIsCurrentThreadPrefetching(): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psIsHostSilo(silo: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psMakeSiloContextPermanent(silo: Long, contextslot: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psQueryTotalCycleTimeProcess(process: Long, cycletimestamp: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psReferenceSiloContext(silocontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psRegisterSiloMonitor(registration: Long, returnedmonitor: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psReleaseSiloHardReference(silo: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psRemoveCreateThreadNotifyRoutine(notifyroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psRemoveLoadImageNotifyRoutine(notifyroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psRemoveSiloContext(silo: Long, contextslot: Int, removedsilocontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psReplaceSiloContext(silo: Long, contextslot: Int, newsilocontext: Long, oldsilocontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psRevertToUserMultipleGroupAffinityThread(affinitytoken: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psSetCreateProcessNotifyRoutine(notifyroutine: Long, remove: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psSetCreateProcessNotifyRoutineEx(notifyroutine: Long, remove: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psSetCreateProcessNotifyRoutineEx2(notifytype: Int, notifyinformation: Long, remove: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psSetCreateThreadNotifyRoutine(notifyroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psSetCreateThreadNotifyRoutineEx(notifytype: Int, notifyinformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psSetCurrentThreadPrefetching(prefetching: Boolean): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psSetLoadImageNotifyRoutine(notifyroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psSetLoadImageNotifyRoutineEx(notifyroutine: Long, flags: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psSetSystemMultipleGroupAffinityThread(groupaffinities: Long, groupcount: Short, affinitytoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psStartSiloMonitor(monitor: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psTerminateServerSilo(serversilo: Long, exitstatus: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psTerminateSystemThread(exitstatus: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psUnregisterSiloMonitor(monitor: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_psWrapApcWow64Thread(apccontext: Long, apcroutine: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_pshedAllocateMemory(size: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_pshedFreeMemory(address: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_pshedIsSystemWheaEnabled(): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_pshedRegisterPlugin(packet: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_pshedSynchronizeExecution(errorsource: Long, synchronizeroutine: Long, synchronizecontext: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_pshedUnregisterPlugin(pluginhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlAppendUnicodeStringToString(destination: Long, source: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlAppendUnicodeToString(destination: Long, source: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlAreBitsClear(bitmapheader: Long, startingindex: Int, length: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlAreBitsSet(bitmapheader: Long, startingindex: Int, length: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlAssert(voidfailedassertion: Long, voidfilename: Long, linenumber: Int, mutablemessage: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlCheckRegistryKey(relativeto: Int, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlClearAllBits(bitmapheader: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlClearBit(bitmapheader: Long, bitnumber: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlClearBits(bitmapheader: Long, startingindex: Int, numbertoclear: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlCmDecodeMemIoResource(descriptor: Long, start: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlCmEncodeMemIoResource(descriptor: Long, type: Byte, length: Long, start: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlCompareString(string1: Long, string2: Long, caseinsensitive: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlCompareUnicodeString(string1: Long, string2: Long, caseinsensitive: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlCompareUnicodeStrings(string1: Long, string1length: Long, string2: Long, string2length: Long, caseinsensitive: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlContractHashTable(hashtable: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlCopyBitMap(source: Long, destination: Long, targetbit: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlCopyString(destinationstring: Long, sourcestring: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlCopyUnicodeString(destinationstring: Long, sourcestring: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlCreateHashTable(hashtable: Long, shift: Int, flags: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlCreateHashTableEx(hashtable: Long, initialsize: Int, shift: Int, flags: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlCreateRegistryKey(relativeto: Int, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlCreateSecurityDescriptor(securitydescriptor: Long, revision: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlDelete(links: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlDeleteElementGenericTable(table: Long, buffer: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlDeleteElementGenericTableAvl(table: Long, buffer: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlDeleteElementGenericTableAvlEx(table: Long, nodeorparent: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlDeleteHashTable(hashtable: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlDeleteNoSplay(links: Long, root: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlDeleteRegistryValue(relativeto: Int, path: Long, valuename: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlDowncaseUnicodeChar(sourcecharacter: Short): Short

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlEndEnumerationHashTable(hashtable: Long, enumerator: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlEndStrongEnumerationHashTable(hashtable: Long, enumerator: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlEndWeakEnumerationHashTable(hashtable: Long, enumerator: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlEnumerateEntryHashTable(hashtable: Long, enumerator: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlEnumerateGenericTable(table: Long, restart: Boolean): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlEnumerateGenericTableAvl(table: Long, restart: Boolean): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlEnumerateGenericTableLikeADirectory(table: Long, matchfunction: Long, matchdata: Long, nextflag: Int, restartkey: Long, deletecount: Long, buffer: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlEnumerateGenericTableWithoutSplaying(table: Long, restartkey: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlEnumerateGenericTableWithoutSplayingAvl(table: Long, restartkey: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlEqualString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlEqualUnicodeString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlExpandHashTable(hashtable: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlExtractBitMap(source: Long, destination: Long, targetbit: Int, numberofbits: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlFindClearBits(bitmapheader: Long, numbertofind: Int, hintindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlFindClearBitsAndSet(bitmapheader: Long, numbertofind: Int, hintindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlFindClearRuns(bitmapheader: Long, runarray: Long, sizeofrunarray: Int, locatelongestruns: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlFindClosestEncodableLength(sourcelength: Long, targetlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlFindFirstRunClear(bitmapheader: Long, startingindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlFindLastBackwardRunClear(bitmapheader: Long, fromindex: Int, startingrunindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlFindLeastSignificantBit(set: Long): Byte

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlFindLongestRunClear(bitmapheader: Long, startingindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlFindMostSignificantBit(set: Long): Byte

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlFindNextForwardRunClear(bitmapheader: Long, fromindex: Int, startingrunindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlFindSetBits(bitmapheader: Long, numbertofind: Int, hintindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlFindSetBitsAndClear(bitmapheader: Long, numbertofind: Int, hintindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlFreeUTF8String(utf8string: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlGUIDFromString(guidstring: Long, guid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlGenerateClass5Guid(namespaceguid: Long, buffer: Long, buffersize: Int, guid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlGetActiveConsoleId(): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlGetCallersAddress(callersaddress: Long, callerscaller: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlGetConsoleSessionForegroundProcessId(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlGetElementGenericTable(table: Long, i: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlGetElementGenericTableAvl(table: Long, i: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlGetEnabledExtendedFeatures(featuremask: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlGetNextEntryHashTable(hashtable: Long, context: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlGetNtProductType(ntproducttype: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlGetNtSystemRoot(): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlGetPersistedStateLocation(sourceid: Long, customvalue: Long, defaultpath: Long, statelocationtype: Int, targetpath: Long, bufferlengthin: Int, bufferlengthout: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlGetSuiteMask(): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlGetVersion(lpversioninformation: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlHashUnicodeString(string: Long, caseinsensitive: Boolean, hashalgorithm: Int, hashvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlInitEnumerationHashTable(hashtable: Long, enumerator: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlInitStrongEnumerationHashTable(hashtable: Long, enumerator: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlInitUTF8String(destinationstring: Long, sourcestring: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlInitUTF8StringEx(destinationstring: Long, sourcestring: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlInitWeakEnumerationHashTable(hashtable: Long, enumerator: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlInitializeBitMap(bitmapheader: Long, bitmapbuffer: Long, sizeofbitmap: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlInitializeGenericTable(table: Long, compareroutine: Long, allocateroutine: Long, freeroutine: Long, tablecontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlInitializeGenericTableAvl(table: Long, compareroutine: Long, allocateroutine: Long, freeroutine: Long, tablecontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlInsertElementGenericTable(table: Long, buffer: Long, buffersize: Int, newelement: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlInsertElementGenericTableAvl(table: Long, buffer: Long, buffersize: Int, newelement: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlInsertElementGenericTableFull(table: Long, buffer: Long, buffersize: Int, newelement: Long, nodeorparent: Long, searchresult: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlInsertElementGenericTableFullAvl(table: Long, buffer: Long, buffersize: Int, newelement: Long, nodeorparent: Long, searchresult: Int): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlInsertEntryHashTable(hashtable: Long, entry: Long, signature: Long, context: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlInt64ToUnicodeString(value: Long, base: Int, string: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlIntegerToUnicodeString(value: Int, base: Int, string: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlIoDecodeMemIoResource(descriptor: Long, alignment: Long, minimumaddress: Long, maximumaddress: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlIoEncodeMemIoResource(descriptor: Long, type: Byte, length: Long, alignment: Long, minimumaddress: Long, maximumaddress: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlIsApiSetImplemented(apisetname: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlIsGenericTableEmpty(table: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlIsGenericTableEmptyAvl(table: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlIsMultiSessionSku(): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlIsMultiUsersInSessionSku(): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlIsNtDdiVersionAvailable(version: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlIsServicePackVersionInstalled(version: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlIsStateSeparationEnabled(): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlIsUntrustedObject(handle: Long, obj: Long, untrustedobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlLengthSecurityDescriptor(securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlLookupElementGenericTable(table: Long, buffer: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlLookupElementGenericTableAvl(table: Long, buffer: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlLookupElementGenericTableFull(table: Long, buffer: Long, nodeorparent: Long, searchresult: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlLookupElementGenericTableFullAvl(table: Long, buffer: Long, nodeorparent: Long, searchresult: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlLookupEntryHashTable(hashtable: Long, signature: Long, context: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlLookupFirstMatchingElementGenericTableAvl(table: Long, buffer: Long, restartkey: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlMapGenericMask(accessmask: Long, genericmapping: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlNormalizeSecurityDescriptor(securitydescriptor: Long, securitydescriptorlength: Int, newsecuritydescriptor: Long, newsecuritydescriptorlength: Long, checkonly: Boolean): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlNumberGenericTableElements(table: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlNumberGenericTableElementsAvl(table: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlNumberOfClearBits(bitmapheader: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlNumberOfClearBitsInRange(bitmapheader: Long, startingindex: Int, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlNumberOfSetBits(bitmapheader: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlNumberOfSetBitsInRange(bitmapheader: Long, startingindex: Int, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlNumberOfSetBitsUlongPtr(target: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlPrefetchMemoryNonTemporal(source: Long, length: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlPrefixUnicodeString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlQueryRegistryValueWithFallback(primaryhandle: Long, fallbackhandle: Long, valuename: Long, valuelength: Int, valuetype: Long, valuedata: Long, resultlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlQueryRegistryValues(relativeto: Int, path: Long, querytable: Long, context: Long, environment: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlQueryValidationRunlevel(componentname: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlRealPredecessor(links: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlRealSuccessor(links: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlRemoveEntryHashTable(hashtable: Long, entry: Long, context: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlRunOnceBeginInitialize(runonce: Long, flags: Int, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlRunOnceComplete(runonce: Long, flags: Int, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlRunOnceExecuteOnce(runonce: Long, initfn: Long, parameter: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlRunOnceInitialize(runonce: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlSetAllBits(bitmapheader: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlSetBit(bitmapheader: Long, bitnumber: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlSetBits(bitmapheader: Long, startingindex: Int, numbertoset: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlSetDaclSecurityDescriptor(securitydescriptor: Long, daclpresent: Boolean, dacl: Long, dacldefaulted: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlSetSystemGlobalData(dataid: Int, buffer: Long, size: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlSplay(links: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlStringFromGUID(guid: Long, guidstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlStronglyEnumerateEntryHashTable(hashtable: Long, enumerator: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlSubtreePredecessor(links: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlSubtreeSuccessor(links: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlSuffixUnicodeString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlTestBit(bitmapheader: Long, bitnumber: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlTimeFieldsToTime(timefields: Long, time: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlTimeToTimeFields(time: Long, timefields: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlUTF8StringToUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlUTF8ToUnicodeN(unicodestringdestination: Long, unicodestringmaxbytecount: Int, unicodestringactualbytecount: Long, utf8stringsource: Long, utf8stringbytecount: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlUnicodeStringToInt64(string: Long, base: Int, number: Long, endpointer: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlUnicodeStringToInteger(string: Long, base: Int, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlUnicodeStringToUTF8String(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlUnicodeToUTF8N(utf8stringdestination: Long, utf8stringmaxbytecount: Int, utf8stringactualbytecount: Long, unicodestringsource: Long, unicodestringbytecount: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlUpcaseUnicodeChar(sourcecharacter: Short): Short

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlUpcaseUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlUpperChar(character: Byte): Byte

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlUpperString(destinationstring: Long, sourcestring: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlValidRelativeSecurityDescriptor(securitydescriptorinput: Long, securitydescriptorlength: Int, requiredinformation: Int): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlValidSecurityDescriptor(securitydescriptor: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlVerifyVersionInfo(versioninfo: Long, typemask: Int, conditionmask: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlVolumeDeviceToDosName(volumedeviceobject: Long, dosname: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlWalkFrameChain(callers: Long, count: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlWeaklyEnumerateEntryHashTable(hashtable: Long, enumerator: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlWriteRegistryValue(relativeto: Int, path: Long, valuename: Long, valuetype: Int, valuedata: Long, valuelength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlxAnsiStringToUnicodeSize(ansistring: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_rtlxUnicodeStringToAnsiSize(unicodestring: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_seAccessCheck(securitydescriptor: Long, subjectsecuritycontext: Long, subjectcontextlocked: Boolean, desiredaccess: Int, previouslygrantedaccess: Int, privileges: Long, genericmapping: Long, accessmode: Byte, grantedaccess: Long, accessstatus: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_seAssignSecurity(parentdescriptor: Long, explicitdescriptor: Long, newdescriptor: Long, isdirectoryobject: Boolean, subjectcontext: Long, genericmapping: Long, pooltype: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_seAssignSecurityEx(parentdescriptor: Long, explicitdescriptor: Long, newdescriptor: Long, objecttype: Long, isdirectoryobject: Boolean, autoinheritflags: Int, subjectcontext: Long, genericmapping: Long, pooltype: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_seCaptureSubjectContext(subjectcontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_seComputeAutoInheritByObjectType(objecttype: Long, securitydescriptor: Long, parentsecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_seDeassignSecurity(securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_seEtwWriteKMCveEvent(cveid: Long, additionaldetails: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_seLockSubjectContext(subjectcontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_seRegisterImageVerificationCallback(imagetype: Int, callbacktype: Int, callbackfunction: Long, callbackcontext: Long, token: Long, callbackhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_seReleaseSubjectContext(subjectcontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_seReportSecurityEvent(flags: Int, sourcename: Long, usersid: Long, auditparameters: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_seSetAuditParameter(auditparameters: Long, type: Int, index: Int, data: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_seUnlockSubjectContext(subjectcontext: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_seUnregisterImageVerificationCallback(callbackhandle: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_seValidSecurityDescriptor(length: Int, securitydescriptor: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_tmCommitComplete(enlistment: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_tmCommitEnlistment(enlistment: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_tmCommitTransaction(transaction: Long, wait: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_tmCreateEnlistment(enlistmenthandle: Long, previousmode: Byte, desiredaccess: Int, objectattributes: Long, resourcemanager: Long, transaction: Long, createoptions: Int, notificationmask: Int, enlistmentkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_tmDereferenceEnlistmentKey(enlistment: Long, lastreference: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_tmEnableCallbacks(resourcemanager: Long, callbackroutine: Long, rmkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_tmGetTransactionId(transaction: Long, transactionid: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_tmInitializeTransactionManager(transactionmanager: Long, logfilename: Long, tmid: Long, createoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_tmIsTransactionActive(transaction: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_tmPrePrepareComplete(enlistment: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_tmPrePrepareEnlistment(enlistment: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_tmPrepareComplete(enlistment: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_tmPrepareEnlistment(enlistment: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_tmPropagationComplete(resourcemanager: Long, requestcookie: Int, bufferlength: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_tmPropagationFailed(resourcemanager: Long, requestcookie: Int, status: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_tmReadOnlyEnlistment(enlistment: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_tmRecoverEnlistment(enlistment: Long, enlistmentkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_tmRecoverResourceManager(resourcemanager: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_tmRecoverTransactionManager(tm: Long, targetvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_tmReferenceEnlistmentKey(enlistment: Long, key: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_tmRenameTransactionManager(logfilename: Long, existingtransactionmanagerguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_tmRequestOutcomeEnlistment(enlistment: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_tmRollbackComplete(enlistment: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_tmRollbackEnlistment(enlistment: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_tmRollbackTransaction(transaction: Long, wait: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_tmSinglePhaseReject(enlistment: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_vslCreateSecureSection(handle: Long, targetprocess: Long, mdl: Long, devicepageprotection: Int, attributes: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_vslDeleteSecureSection(globalhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_wheaAddErrorSource(errorsource: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_wheaAddErrorSourceDeviceDriver(context: Long, configuration: Long, numberpreallocatederrorreports: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_wheaAddErrorSourceDeviceDriverV1(context: Long, configuration: Long, numbufferstopreallocate: Int, maxdatalength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_wheaAddHwErrorReportSectionDeviceDriver(errorhandle: Long, sectiondatalength: Int, bufferset: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_wheaConfigureErrorSource(sourcetype: Int, configuration: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_wheaCreateHwErrorReportDeviceDriver(errorsourceid: Int, deviceobject: Long): Long

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_wheaErrorSourceGetState(errorsourceid: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_wheaGetNotifyAllOfflinesPolicy(): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_wheaHighIrqlLogSelEventHandlerRegister(handler: Long, context: Long): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_wheaHighIrqlLogSelEventHandlerUnregister()

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_wheaHwErrorReportAbandonDeviceDriver(errorhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_wheaHwErrorReportSetSectionNameDeviceDriver(bufferset: Long, namelength: Int, name: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_wheaHwErrorReportSetSeverityDeviceDriver(errorhandle: Long, errorseverity: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_wheaHwErrorReportSubmitDeviceDriver(errorhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_wheaInitializeRecordHeader(header: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_wheaIsCriticalState(): Boolean

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_wheaLogInternalEvent(entry: Long)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_wheaRegisterInUsePageOfflineNotification(callback: Long, context: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_wheaRemoveErrorSource(errorsourceid: Int)

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_wheaRemoveErrorSourceDeviceDriver(errorsourceid: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_wheaReportHwError(errorpacket: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_wheaReportHwErrorDeviceDriver(errorsourceid: Int, deviceobject: Long, errordata: Long, errordatalength: Int, sectiontypeguid: Long, errorseverity: Int, devicefriendlyname: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_wheaUnconfigureErrorSource(sourcetype: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_wheaUnregisterInUsePageOfflineNotification(callback: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_wmiQueryTraceInformation(traceinformationclass: Int, traceinformation: Long, traceinformationlength: Int, requiredlength: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwAllocateLocallyUniqueId(luid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwClose(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwCommitComplete(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwCommitEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwCommitTransaction(transactionhandle: Long, wait: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwCreateEnlistment(enlistmenthandle: Long, desiredaccess: Int, resourcemanagerhandle: Long, transactionhandle: Long, objectattributes: Long, createoptions: Int, notificationmask: Int, enlistmentkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwCreateFile(filehandle: Long, desiredaccess: Int, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: Int, shareaccess: Int, createdisposition: Int, createoptions: Int, eabuffer: Long, ealength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwCreateResourceManager(resourcemanagerhandle: Long, desiredaccess: Int, tmhandle: Long, resourcemanagerguid: Long, objectattributes: Long, createoptions: Int, description: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwCreateSection(sectionhandle: Long, desiredaccess: Int, objectattributes: Long, maximumsize: Long, sectionpageprotection: Int, allocationattributes: Int, filehandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwCreateTransaction(transactionhandle: Long, desiredaccess: Int, objectattributes: Long, uow: Long, tmhandle: Long, createoptions: Int, isolationlevel: Int, isolationflags: Int, timeout: Long, description: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwCreateTransactionManager(tmhandle: Long, desiredaccess: Int, objectattributes: Long, logfilename: Long, createoptions: Int, commitstrength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwDeviceIoControlFile(filehandle: Long, event: Long, apcroutine: Long, apccontext: Long, iostatusblock: Long, iocontrolcode: Int, inputbuffer: Long, inputbufferlength: Int, outputbuffer: Long, outputbufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwDisplayString(string: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwEnumerateTransactionObject(rootobjecthandle: Long, querytype: Int, objectcursor: Long, objectcursorlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwGetNotificationResourceManager(resourcemanagerhandle: Long, transactionnotification: Long, notificationlength: Int, timeout: Long, returnlength: Long, asynchronous: Int, asynchronouscontext: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwLoadDriver(driverservicename: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwMakeTemporaryObject(handle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwManagePartition(targethandle: Long, sourcehandle: Long, partitioninformationclass: Int, partitioninformation: Long, partitioninformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwOpenEnlistment(enlistmenthandle: Long, desiredaccess: Int, rmhandle: Long, enlistmentguid: Long, objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwOpenFile(filehandle: Long, desiredaccess: Int, objectattributes: Long, iostatusblock: Long, shareaccess: Int, openoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwOpenResourceManager(resourcemanagerhandle: Long, desiredaccess: Int, tmhandle: Long, resourcemanagerguid: Long, objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwOpenSymbolicLinkObject(linkhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwOpenTransaction(transactionhandle: Long, desiredaccess: Int, objectattributes: Long, uow: Long, tmhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwOpenTransactionManager(tmhandle: Long, desiredaccess: Int, objectattributes: Long, logfilename: Long, tmidentity: Long, openoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwPowerInformation(informationlevel: Int, inputbuffer: Long, inputbufferlength: Int, outputbuffer: Long, outputbufferlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwPrePrepareComplete(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwPrePrepareEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwPrepareComplete(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwPrepareEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwPropagationComplete(resourcemanagerhandle: Long, requestcookie: Int, bufferlength: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwPropagationFailed(resourcemanagerhandle: Long, requestcookie: Int, propstatus: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwQueryInformationByName(objectattributes: Long, iostatusblock: Long, fileinformation: Long, length: Int, fileinformationclass: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwQueryInformationEnlistment(enlistmenthandle: Long, enlistmentinformationclass: Int, enlistmentinformation: Long, enlistmentinformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwQueryInformationFile(filehandle: Long, iostatusblock: Long, fileinformation: Long, length: Int, fileinformationclass: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwQueryInformationResourceManager(resourcemanagerhandle: Long, resourcemanagerinformationclass: Int, resourcemanagerinformation: Long, resourcemanagerinformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwQueryInformationTransaction(transactionhandle: Long, transactioninformationclass: Int, transactioninformation: Long, transactioninformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwQueryInformationTransactionManager(transactionmanagerhandle: Long, transactionmanagerinformationclass: Int, transactionmanagerinformation: Long, transactionmanagerinformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwQuerySymbolicLinkObject(linkhandle: Long, linktarget: Long, returnedlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwReadFile(filehandle: Long, event: Long, apcroutine: Long, apccontext: Long, iostatusblock: Long, buffer: Long, length: Int, byteoffset: Long, key: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwReadOnlyEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwRecoverEnlistment(enlistmenthandle: Long, enlistmentkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwRecoverResourceManager(resourcemanagerhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwRecoverTransactionManager(transactionmanagerhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwRegisterProtocolAddressInformation(resourcemanager: Long, protocolid: Long, protocolinformationsize: Int, protocolinformation: Long, createoptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwRenameTransactionManager(logfilename: Long, existingtransactionmanagerguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwRollbackComplete(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwRollbackEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwRollbackTransaction(transactionhandle: Long, wait: Boolean): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwRollforwardTransactionManager(transactionmanagerhandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwSetInformationEnlistment(enlistmenthandle: Long, enlistmentinformationclass: Int, enlistmentinformation: Long, enlistmentinformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwSetInformationFile(filehandle: Long, iostatusblock: Long, fileinformation: Long, length: Int, fileinformationclass: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwSetInformationResourceManager(resourcemanagerhandle: Long, resourcemanagerinformationclass: Int, resourcemanagerinformation: Long, resourcemanagerinformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwSetInformationTransaction(transactionhandle: Long, transactioninformationclass: Int, transactioninformation: Long, transactioninformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwSetInformationTransactionManager(tmhandle: Long, transactionmanagerinformationclass: Int, transactionmanagerinformation: Long, transactionmanagerinformationlength: Int): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwSinglePhaseReject(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwUnloadDriver(driverservicename: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_zwWriteFile(filehandle: Long, event: Long, apcroutine: Long, apccontext: Long, iostatusblock: Long, buffer: Long, length: Int, byteoffset: Long, key: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_vDbgPrintEx(componentid: Int, level: Int, format: Long, arglist: Long): Int

    @JvmStatic
    external fun windowssys_windows_wdk_system_systemservices_vDbgPrintExWithPrefix(prefix: Long, componentid: Int, level: Int, format: Long, arglist: Long): Int
}

public actual fun clfsAddLogContainer(plfolog: COpaquePointer?, pcbcontainer: COpaquePointer?, puszcontainerpath: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsAddLogContainer((plfolog?.value ?: 0L), (pcbcontainer?.value ?: 0L), (puszcontainerpath?.value ?: 0L))

public actual fun clfsAddLogContainerSet(plfolog: COpaquePointer?, ccontainers: UShort, pcbcontainer: COpaquePointer?, rguszcontainerpath: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsAddLogContainerSet((plfolog?.value ?: 0L), ccontainers.toShort(), (pcbcontainer?.value ?: 0L), (rguszcontainerpath?.value ?: 0L))

public actual fun clfsAdvanceLogBase(pvmarshalcontext: COpaquePointer?, plsnbase: COpaquePointer?, fflags: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsAdvanceLogBase((pvmarshalcontext?.value ?: 0L), (plsnbase?.value ?: 0L), fflags.toInt())

public actual fun clfsAlignReservedLog(pvmarshalcontext: COpaquePointer?, crecords: UInt, rgcbreservation: COpaquePointer?, pcbalignreservation: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsAlignReservedLog((pvmarshalcontext?.value ?: 0L), crecords.toInt(), (rgcbreservation?.value ?: 0L), (pcbalignreservation?.value ?: 0L))

public actual fun clfsAllocReservedLog(pvmarshalcontext: COpaquePointer?, crecords: UInt, pcbadjustment: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsAllocReservedLog((pvmarshalcontext?.value ?: 0L), crecords.toInt(), (pcbadjustment?.value ?: 0L))

public actual fun clfsCloseAndResetLogFile(plfolog: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsCloseAndResetLogFile((plfolog?.value ?: 0L))

public actual fun clfsCloseLogFileObject(plfolog: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsCloseLogFileObject((plfolog?.value ?: 0L))

public actual fun clfsCreateLogFile(pplfolog: COpaquePointer?, puszlogfilename: COpaquePointer?, fdesiredaccess: UInt, dwsharemode: UInt, psdlogfile: PsecurityDescriptor, fcreatedisposition: UInt, fcreateoptions: UInt, fflagsandattributes: UInt, flogoptionflag: UInt, pvcontext: COpaquePointer?, cbcontext: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsCreateLogFile((pplfolog?.value ?: 0L), (puszlogfilename?.value ?: 0L), fdesiredaccess.toInt(), dwsharemode.toInt(), (psdlogfile?.value ?: 0L), fcreatedisposition.toInt(), fcreateoptions.toInt(), fflagsandattributes.toInt(), flogoptionflag.toInt(), (pvcontext?.value ?: 0L), cbcontext.toInt())

public actual fun clfsCreateMarshallingArea(plfolog: COpaquePointer?, epooltype: PoolType, pfnallocbuffer: PallocateFunction, pfnfreebuffer: PfreeFunction, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, ppvmarshalcontext: COpaquePointer?): Ntstatus =
    0

public actual fun clfsCreateMarshallingAreaEx(plfolog: COpaquePointer?, epooltype: PoolType, pfnallocbuffer: PallocateFunction, pfnfreebuffer: PfreeFunction, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, calignmentsize: UInt, fflags: ULong, ppvmarshalcontext: COpaquePointer?): Ntstatus =
    0

public actual fun clfsCreateScanContext(plfolog: COpaquePointer?, cfromcontainer: UInt, ccontainers: UInt, escanmode: UByte, pcxscan: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsCreateScanContext((plfolog?.value ?: 0L), cfromcontainer.toInt(), ccontainers.toInt(), escanmode.toByte(), (pcxscan?.value ?: 0L))

public actual fun clfsDeleteLogByPointer(plfolog: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsDeleteLogByPointer((plfolog?.value ?: 0L))

public actual fun clfsDeleteLogFile(puszlogfilename: COpaquePointer?, pvreserved: COpaquePointer?, flogoptionflag: UInt, pvcontext: COpaquePointer?, cbcontext: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsDeleteLogFile((puszlogfilename?.value ?: 0L), (pvreserved?.value ?: 0L), flogoptionflag.toInt(), (pvcontext?.value ?: 0L), cbcontext.toInt())

public actual fun clfsDeleteMarshallingArea(pvmarshalcontext: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsDeleteMarshallingArea((pvmarshalcontext?.value ?: 0L))

public actual fun clfsEarlierLsn(plsn: COpaquePointer?): ClsLsn =
    ClsLsn()

public actual fun clfsFinalize() {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsFinalize()
}

public actual fun clfsFlushBuffers(pvmarshalcontext: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsFlushBuffers((pvmarshalcontext?.value ?: 0L))

public actual fun clfsFlushToLsn(pvmarshalcontext: COpaquePointer?, plsnflush: COpaquePointer?, plsnlastflushed: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsFlushToLsn((pvmarshalcontext?.value ?: 0L), (plsnflush?.value ?: 0L), (plsnlastflushed?.value ?: 0L))

public actual fun clfsFreeReservedLog(pvmarshalcontext: COpaquePointer?, crecords: UInt, pcbadjustment: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsFreeReservedLog((pvmarshalcontext?.value ?: 0L), crecords.toInt(), (pcbadjustment?.value ?: 0L))

public actual fun clfsGetContainerName(plfolog: COpaquePointer?, cidlogicalcontainer: UInt, puszcontainername: COpaquePointer?, pcactuallencontainername: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsGetContainerName((plfolog?.value ?: 0L), cidlogicalcontainer.toInt(), (puszcontainername?.value ?: 0L), (pcactuallencontainername?.value ?: 0L))

public actual fun clfsGetIoStatistics(plfolog: COpaquePointer?, pvstatsbuffer: COpaquePointer?, cbstatsbuffer: UInt, estatsclass: ClfsIostatsClass, pcbstatswritten: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsGetIoStatistics((plfolog?.value ?: 0L), (pvstatsbuffer?.value ?: 0L), cbstatsbuffer.toInt(), estatsclass, (pcbstatswritten?.value ?: 0L))

public actual fun clfsGetLogFileInformation(plfolog: COpaquePointer?, pinfobuffer: COpaquePointer?, pcbinfobuffer: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsGetLogFileInformation((plfolog?.value ?: 0L), (pinfobuffer?.value ?: 0L), (pcbinfobuffer?.value ?: 0L))

public actual fun clfsInitialize(): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsInitialize()

public actual fun clfsLaterLsn(plsn: COpaquePointer?): ClsLsn =
    ClsLsn()

public actual fun clfsLsnBlockOffset(plsn: COpaquePointer?): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsLsnBlockOffset((plsn?.value ?: 0L)).toUInt()

public actual fun clfsLsnContainer(plsn: COpaquePointer?): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsLsnContainer((plsn?.value ?: 0L)).toUInt()

public actual fun clfsLsnCreate(cidcontainer: UInt, offblock: UInt, crecord: UInt): ClsLsn =
    ClsLsn()

public actual fun clfsLsnDifference(plsnstart: COpaquePointer?, plsnfinish: COpaquePointer?, cbcontainer: UInt, cbmaxblock: UInt, pcbdifference: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsLsnDifference((plsnstart?.value ?: 0L), (plsnfinish?.value ?: 0L), cbcontainer.toInt(), cbmaxblock.toInt(), (pcbdifference?.value ?: 0L))

public actual fun clfsLsnEqual(plsn1: COpaquePointer?, plsn2: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsLsnEqual((plsn1?.value ?: 0L), (plsn2?.value ?: 0L))

public actual fun clfsLsnGreater(plsn1: COpaquePointer?, plsn2: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsLsnGreater((plsn1?.value ?: 0L), (plsn2?.value ?: 0L))

public actual fun clfsLsnInvalid(plsn: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsLsnInvalid((plsn?.value ?: 0L))

public actual fun clfsLsnLess(plsn1: COpaquePointer?, plsn2: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsLsnLess((plsn1?.value ?: 0L), (plsn2?.value ?: 0L))

public actual fun clfsLsnNull(plsn: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsLsnNull((plsn?.value ?: 0L))

public actual fun clfsLsnRecordSequence(plsn: COpaquePointer?): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsLsnRecordSequence((plsn?.value ?: 0L)).toUInt()

public actual fun clfsMgmtDeregisterManagedClient(clientcookie: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsMgmtDeregisterManagedClient((clientcookie?.value ?: 0L))

public actual fun clfsMgmtHandleLogFileFull(client: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsMgmtHandleLogFileFull((client?.value ?: 0L))

public actual fun clfsMgmtInstallPolicy(logfile: COpaquePointer?, policy: COpaquePointer?, policylength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsMgmtInstallPolicy((logfile?.value ?: 0L), (policy?.value ?: 0L), policylength.toInt())

public actual fun clfsMgmtQueryPolicy(logfile: COpaquePointer?, policytype: ClfsMgmtPolicyType, policy: COpaquePointer?, policylength: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsMgmtQueryPolicy((logfile?.value ?: 0L), policytype, (policy?.value ?: 0L), (policylength?.value ?: 0L))

public actual fun clfsMgmtRegisterManagedClient(logfile: COpaquePointer?, registrationdata: COpaquePointer?, clientcookie: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsMgmtRegisterManagedClient((logfile?.value ?: 0L), (registrationdata?.value ?: 0L), (clientcookie?.value ?: 0L))

public actual fun clfsMgmtRemovePolicy(logfile: COpaquePointer?, policytype: ClfsMgmtPolicyType): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsMgmtRemovePolicy((logfile?.value ?: 0L), policytype)

public actual fun clfsMgmtSetLogFileSize(logfile: COpaquePointer?, newsizeincontainers: COpaquePointer?, resultingsizeincontainers: COpaquePointer?, completionroutine: PclfsSetLogSizeCompleteCallback, completionroutinedata: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsMgmtSetLogFileSize((logfile?.value ?: 0L), (newsizeincontainers?.value ?: 0L), (resultingsizeincontainers?.value ?: 0L), 0L, (completionroutinedata?.value ?: 0L))

public actual fun clfsMgmtSetLogFileSizeAsClient(logfile: COpaquePointer?, clientcookie: COpaquePointer?, newsizeincontainers: COpaquePointer?, resultingsizeincontainers: COpaquePointer?, completionroutine: PclfsSetLogSizeCompleteCallback, completionroutinedata: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsMgmtSetLogFileSizeAsClient((logfile?.value ?: 0L), (clientcookie?.value ?: 0L), (newsizeincontainers?.value ?: 0L), (resultingsizeincontainers?.value ?: 0L), 0L, (completionroutinedata?.value ?: 0L))

public actual fun clfsMgmtTailAdvanceFailure(client: COpaquePointer?, reason: Ntstatus): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsMgmtTailAdvanceFailure((client?.value ?: 0L), reason)

public actual fun clfsQueryLogFileInformation(plfolog: COpaquePointer?, einformationclass: ClsLogInformationClass, pinfoinputbuffer: COpaquePointer?, cbinfoinputbuffer: UInt, pinfobuffer: COpaquePointer?, pcbinfobuffer: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsQueryLogFileInformation((plfolog?.value ?: 0L), einformationclass, (pinfoinputbuffer?.value ?: 0L), cbinfoinputbuffer.toInt(), (pinfobuffer?.value ?: 0L), (pcbinfobuffer?.value ?: 0L))

public actual fun clfsReadLogRecord(pvmarshalcontext: COpaquePointer?, plsnfirst: COpaquePointer?, pecontextmode: ClfsContextMode, ppvreadbuffer: COpaquePointer?, pcbreadbuffer: COpaquePointer?, perecordtype: COpaquePointer?, plsnundonext: COpaquePointer?, plsnprevious: COpaquePointer?, ppvreadcontext: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsReadLogRecord((pvmarshalcontext?.value ?: 0L), (plsnfirst?.value ?: 0L), pecontextmode, (ppvreadbuffer?.value ?: 0L), (pcbreadbuffer?.value ?: 0L), (perecordtype?.value ?: 0L), (plsnundonext?.value ?: 0L), (plsnprevious?.value ?: 0L), (ppvreadcontext?.value ?: 0L))

public actual fun clfsReadNextLogRecord(pvreadcontext: COpaquePointer?, ppvbuffer: COpaquePointer?, pcbbuffer: COpaquePointer?, perecordtype: COpaquePointer?, plsnuser: COpaquePointer?, plsnundonext: COpaquePointer?, plsnprevious: COpaquePointer?, plsnrecord: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsReadNextLogRecord((pvreadcontext?.value ?: 0L), (ppvbuffer?.value ?: 0L), (pcbbuffer?.value ?: 0L), (perecordtype?.value ?: 0L), (plsnuser?.value ?: 0L), (plsnundonext?.value ?: 0L), (plsnprevious?.value ?: 0L), (plsnrecord?.value ?: 0L))

public actual fun clfsReadPreviousRestartArea(pvreadcontext: COpaquePointer?, ppvrestartbuffer: COpaquePointer?, pcbrestartbuffer: COpaquePointer?, plsnrestart: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsReadPreviousRestartArea((pvreadcontext?.value ?: 0L), (ppvrestartbuffer?.value ?: 0L), (pcbrestartbuffer?.value ?: 0L), (plsnrestart?.value ?: 0L))

public actual fun clfsReadRestartArea(pvmarshalcontext: COpaquePointer?, ppvrestartbuffer: COpaquePointer?, pcbrestartbuffer: COpaquePointer?, plsn: COpaquePointer?, ppvreadcontext: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsReadRestartArea((pvmarshalcontext?.value ?: 0L), (ppvrestartbuffer?.value ?: 0L), (pcbrestartbuffer?.value ?: 0L), (plsn?.value ?: 0L), (ppvreadcontext?.value ?: 0L))

public actual fun clfsRemoveLogContainer(plfolog: COpaquePointer?, puszcontainerpath: COpaquePointer?, fforce: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsRemoveLogContainer((plfolog?.value ?: 0L), (puszcontainerpath?.value ?: 0L), fforce)

public actual fun clfsRemoveLogContainerSet(plfolog: COpaquePointer?, ccontainers: UShort, rgwszcontainerpath: COpaquePointer?, fforce: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsRemoveLogContainerSet((plfolog?.value ?: 0L), ccontainers.toShort(), (rgwszcontainerpath?.value ?: 0L), fforce)

public actual fun clfsReserveAndAppendLog(pvmarshalcontext: COpaquePointer?, rgwriteentries: COpaquePointer?, cwriteentries: UInt, plsnundonext: COpaquePointer?, plsnprevious: COpaquePointer?, creserverecords: UInt, rgcbreservation: COpaquePointer?, fflags: UInt, plsn: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsReserveAndAppendLog((pvmarshalcontext?.value ?: 0L), (rgwriteentries?.value ?: 0L), cwriteentries.toInt(), (plsnundonext?.value ?: 0L), (plsnprevious?.value ?: 0L), creserverecords.toInt(), (rgcbreservation?.value ?: 0L), fflags.toInt(), (plsn?.value ?: 0L))

public actual fun clfsReserveAndAppendLogAligned(pvmarshalcontext: COpaquePointer?, rgwriteentries: COpaquePointer?, cwriteentries: UInt, cbentryalignment: UInt, plsnundonext: COpaquePointer?, plsnprevious: COpaquePointer?, creserverecords: UInt, rgcbreservation: COpaquePointer?, fflags: UInt, plsn: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsReserveAndAppendLogAligned((pvmarshalcontext?.value ?: 0L), (rgwriteentries?.value ?: 0L), cwriteentries.toInt(), cbentryalignment.toInt(), (plsnundonext?.value ?: 0L), (plsnprevious?.value ?: 0L), creserverecords.toInt(), (rgcbreservation?.value ?: 0L), fflags.toInt(), (plsn?.value ?: 0L))

public actual fun clfsScanLogContainers(pcxscan: COpaquePointer?, escanmode: UByte): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsScanLogContainers((pcxscan?.value ?: 0L), escanmode.toByte())

public actual fun clfsSetArchiveTail(plfolog: COpaquePointer?, plsnarchivetail: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsSetArchiveTail((plfolog?.value ?: 0L), (plsnarchivetail?.value ?: 0L))

public actual fun clfsSetEndOfLog(plfolog: COpaquePointer?, plsnend: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsSetEndOfLog((plfolog?.value ?: 0L), (plsnend?.value ?: 0L))

public actual fun clfsSetLogFileInformation(plfolog: COpaquePointer?, einformationclass: ClsLogInformationClass, pinfobuffer: COpaquePointer?, cbbuffer: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsSetLogFileInformation((plfolog?.value ?: 0L), einformationclass, (pinfobuffer?.value ?: 0L), cbbuffer.toInt())

public actual fun clfsTerminateReadLog(pvcursorcontext: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsTerminateReadLog((pvcursorcontext?.value ?: 0L))

public actual fun clfsWriteRestartArea(pvmarshalcontext: COpaquePointer?, pvrestartbuffer: COpaquePointer?, cbrestartbuffer: UInt, plsnbase: COpaquePointer?, fflags: UInt, pcbwritten: COpaquePointer?, plsnnext: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_clfsWriteRestartArea((pvmarshalcontext?.value ?: 0L), (pvrestartbuffer?.value ?: 0L), cbrestartbuffer.toInt(), (plsnbase?.value ?: 0L), fflags.toInt(), (pcbwritten?.value ?: 0L), (plsnnext?.value ?: 0L))

public actual fun cmCallbackGetKeyObjectID(cookie: COpaquePointer?, obj: COpaquePointer?, objectid: COpaquePointer?, objectname: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_cmCallbackGetKeyObjectID((cookie?.value ?: 0L), (obj?.value ?: 0L), (objectid?.value ?: 0L), (objectname?.value ?: 0L))

public actual fun cmCallbackGetKeyObjectIDEx(cookie: COpaquePointer?, obj: COpaquePointer?, objectid: COpaquePointer?, objectname: COpaquePointer?, flags: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_cmCallbackGetKeyObjectIDEx((cookie?.value ?: 0L), (obj?.value ?: 0L), (objectid?.value ?: 0L), (objectname?.value ?: 0L), flags.toInt())

public actual fun cmCallbackReleaseKeyObjectIDEx(objectname: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_cmCallbackReleaseKeyObjectIDEx((objectname?.value ?: 0L))
}

public actual fun cmGetBoundTransaction(cookie: COpaquePointer?, obj: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_cmGetBoundTransaction((cookie?.value ?: 0L), (obj?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun cmGetCallbackVersion(major: COpaquePointer?, minor: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_cmGetCallbackVersion((major?.value ?: 0L), (minor?.value ?: 0L))
}

public actual fun cmRegisterCallback(function: PexCallbackFunction, context: COpaquePointer?, cookie: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_cmRegisterCallback(0L, (context?.value ?: 0L), (cookie?.value ?: 0L))

public actual fun cmRegisterCallbackEx(function: PexCallbackFunction, altitude: COpaquePointer?, driver: COpaquePointer?, context: COpaquePointer?, cookie: COpaquePointer?, reserved: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_cmRegisterCallbackEx(0L, (altitude?.value ?: 0L), (driver?.value ?: 0L), (context?.value ?: 0L), (cookie?.value ?: 0L), (reserved?.value ?: 0L))

public actual fun cmSetCallbackObjectContext(obj: COpaquePointer?, cookie: COpaquePointer?, newcontext: COpaquePointer?, oldcontext: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_cmSetCallbackObjectContext((obj?.value ?: 0L), (cookie?.value ?: 0L), (newcontext?.value ?: 0L), (oldcontext?.value ?: 0L))

public actual fun cmUnRegisterCallback(cookie: Long): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_cmUnRegisterCallback(cookie)

public actual fun dbgBreakPointWithStatus(status: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_dbgBreakPointWithStatus(status.toInt())
}

public actual fun dbgPrint(format: Pcstr, vararg variadicArgs: Long): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_dbgPrint((format?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).toUInt()

public actual fun dbgPrintEx(componentid: UInt, level: UInt, format: Pcstr, vararg variadicArgs: Long): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_dbgPrintEx(componentid.toInt(), level.toInt(), (format?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).toUInt()

public actual fun dbgPrintReturnControlC(format: Pcstr, vararg variadicArgs: Long): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_dbgPrintReturnControlC((format?.value ?: 0L), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).toUInt()

public actual fun dbgPrompt(prompt: Pcstr, response: Pstr, length: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_dbgPrompt((prompt?.value ?: 0L), (response?.value ?: 0L), length.toInt()).toUInt()

public actual fun dbgQueryDebugFilterState(componentid: UInt, level: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_dbgQueryDebugFilterState(componentid.toInt(), level.toInt())

public actual fun dbgSetDebugFilterState(componentid: UInt, level: UInt, state: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_dbgSetDebugFilterState(componentid.toInt(), level.toInt(), state)

public actual fun dbgSetDebugPrintCallback(debugprintcallback: PdebugPrintCallback, enable: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_dbgSetDebugPrintCallback(0L, enable)

public actual fun etwActivityIdControl(controlcode: UInt, activityid: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_etwActivityIdControl(controlcode.toInt(), (activityid?.value ?: 0L))

public actual fun etwEventEnabled(reghandle: Reghandle, eventdescriptor: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_etwEventEnabled(reghandle, (eventdescriptor?.value ?: 0L))

public actual fun etwProviderEnabled(reghandle: Reghandle, level: UByte, keyword: ULong): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_etwProviderEnabled(reghandle, level.toByte(), keyword.toLong())

public actual fun etwRegister(providerid: COpaquePointer?, enablecallback: Petwenablecallback, callbackcontext: COpaquePointer?, reghandle: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_etwRegister((providerid?.value ?: 0L), 0L, (callbackcontext?.value ?: 0L), (reghandle?.value ?: 0L))

public actual fun etwSetInformation(reghandle: Reghandle, informationclass: EventInfoClass, eventinformation: COpaquePointer?, informationlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_etwSetInformation(reghandle, informationclass, (eventinformation?.value ?: 0L), informationlength.toInt())

public actual fun etwUnregister(reghandle: Reghandle): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_etwUnregister(reghandle)

public actual fun etwWrite(reghandle: Reghandle, eventdescriptor: COpaquePointer?, activityid: COpaquePointer?, userdatacount: UInt, userdata: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_etwWrite(reghandle, (eventdescriptor?.value ?: 0L), (activityid?.value ?: 0L), userdatacount.toInt(), (userdata?.value ?: 0L))

public actual fun etwWriteEx(reghandle: Reghandle, eventdescriptor: COpaquePointer?, filter: ULong, flags: UInt, activityid: COpaquePointer?, relatedactivityid: COpaquePointer?, userdatacount: UInt, userdata: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_etwWriteEx(reghandle, (eventdescriptor?.value ?: 0L), filter.toLong(), flags.toInt(), (activityid?.value ?: 0L), (relatedactivityid?.value ?: 0L), userdatacount.toInt(), (userdata?.value ?: 0L))

public actual fun etwWriteString(reghandle: Reghandle, level: UByte, keyword: ULong, activityid: COpaquePointer?, string: Pcwstr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_etwWriteString(reghandle, level.toByte(), keyword.toLong(), (activityid?.value ?: 0L), (string?.value ?: 0L))

public actual fun etwWriteTransfer(reghandle: Reghandle, eventdescriptor: COpaquePointer?, activityid: COpaquePointer?, relatedactivityid: COpaquePointer?, userdatacount: UInt, userdata: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_etwWriteTransfer(reghandle, (eventdescriptor?.value ?: 0L), (activityid?.value ?: 0L), (relatedactivityid?.value ?: 0L), userdatacount.toInt(), (userdata?.value ?: 0L))

public actual fun exAcquireFastMutex(fastmutex: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exAcquireFastMutex((fastmutex?.value ?: 0L))
}

public actual fun exAcquireFastMutexUnsafe(fastmutex: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exAcquireFastMutexUnsafe((fastmutex?.value ?: 0L))
}

public actual fun exAcquirePushLockExclusiveEx(pushlock: COpaquePointer?, flags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exAcquirePushLockExclusiveEx((pushlock?.value ?: 0L), flags.toInt())
}

public actual fun exAcquirePushLockSharedEx(pushlock: COpaquePointer?, flags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exAcquirePushLockSharedEx((pushlock?.value ?: 0L), flags.toInt())
}

public actual fun exAcquireResourceExclusiveLite(resource: COpaquePointer?, wait: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exAcquireResourceExclusiveLite((resource?.value ?: 0L), wait)

public actual fun exAcquireResourceSharedLite(resource: COpaquePointer?, wait: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exAcquireResourceSharedLite((resource?.value ?: 0L), wait)

public actual fun exAcquireRundownProtection(runref: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exAcquireRundownProtection((runref?.value ?: 0L))

public actual fun exAcquireRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exAcquireRundownProtectionCacheAware(runrefcacheaware)

public actual fun exAcquireRundownProtectionCacheAwareEx(runrefcacheaware: PexRundownRefCacheAware, count: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exAcquireRundownProtectionCacheAwareEx(runrefcacheaware, count.toInt())

public actual fun exAcquireRundownProtectionEx(runref: COpaquePointer?, count: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exAcquireRundownProtectionEx((runref?.value ?: 0L), count.toInt())

public actual fun exAcquireSharedStarveExclusive(resource: COpaquePointer?, wait: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exAcquireSharedStarveExclusive((resource?.value ?: 0L), wait)

public actual fun exAcquireSharedWaitForExclusive(resource: COpaquePointer?, wait: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exAcquireSharedWaitForExclusive((resource?.value ?: 0L), wait)

public actual fun exAcquireSpinLockExclusive(spinlock: COpaquePointer?): UByte =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exAcquireSpinLockExclusive((spinlock?.value ?: 0L)).toUByte()

public actual fun exAcquireSpinLockExclusiveAtDpcLevel(spinlock: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exAcquireSpinLockExclusiveAtDpcLevel((spinlock?.value ?: 0L))
}

public actual fun exAcquireSpinLockShared(spinlock: COpaquePointer?): UByte =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exAcquireSpinLockShared((spinlock?.value ?: 0L)).toUByte()

public actual fun exAcquireSpinLockSharedAtDpcLevel(spinlock: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exAcquireSpinLockSharedAtDpcLevel((spinlock?.value ?: 0L))
}

public actual fun exAllocateCacheAwareRundownProtection(pooltype: PoolType, pooltag: UInt): PexRundownRefCacheAware =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exAllocateCacheAwareRundownProtection(pooltype, pooltag.toInt())

public actual fun exAllocatePool(pooltype: PoolType, numberofbytes: ULong): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exAllocatePool(pooltype, numberofbytes.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun exAllocatePool2(flags: ULong, numberofbytes: ULong, tag: UInt): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exAllocatePool2(flags.toLong(), numberofbytes.toLong(), tag.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun exAllocatePool3(flags: ULong, numberofbytes: ULong, tag: UInt, extendedparameters: COpaquePointer?, extendedparameterscount: UInt): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exAllocatePool3(flags.toLong(), numberofbytes.toLong(), tag.toInt(), (extendedparameters?.value ?: 0L), extendedparameterscount.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun exAllocatePoolWithQuota(pooltype: PoolType, numberofbytes: ULong): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exAllocatePoolWithQuota(pooltype, numberofbytes.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun exAllocatePoolWithQuotaTag(pooltype: PoolType, numberofbytes: ULong, tag: UInt): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exAllocatePoolWithQuotaTag(pooltype, numberofbytes.toLong(), tag.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun exAllocatePoolWithTag(pooltype: PoolType, numberofbytes: ULong, tag: UInt): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exAllocatePoolWithTag(pooltype, numberofbytes.toLong(), tag.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun exAllocatePoolWithTagPriority(pooltype: PoolType, numberofbytes: ULong, tag: UInt, priority: ExPoolPriority): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exAllocatePoolWithTagPriority(pooltype, numberofbytes.toLong(), tag.toInt(), priority).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun exAllocateTimer(callback: PextCallback, callbackcontext: COpaquePointer?, attributes: UInt): PexTimer =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exAllocateTimer(0L, (callbackcontext?.value ?: 0L), attributes.toInt())

public actual fun exCancelTimer(timer: PexTimer, parameters: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exCancelTimer(timer, (parameters?.value ?: 0L))

public actual fun exCleanupRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exCleanupRundownProtectionCacheAware(runrefcacheaware)
}

public actual fun exConvertExclusiveToSharedLite(resource: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exConvertExclusiveToSharedLite((resource?.value ?: 0L))
}

public actual fun exCreateCallback(callbackobject: COpaquePointer?, objectattributes: COpaquePointer?, create: Boolean, allowmultiplecallbacks: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exCreateCallback((callbackobject?.value ?: 0L), (objectattributes?.value ?: 0L), create, allowmultiplecallbacks)

public actual fun exCreatePool(flags: UInt, tag: ULong, params: COpaquePointer?, poolhandle: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exCreatePool(flags.toInt(), tag.toLong(), (params?.value ?: 0L), (poolhandle?.value ?: 0L))

public actual fun exDeleteResourceLite(resource: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exDeleteResourceLite((resource?.value ?: 0L))

public actual fun exDeleteTimer(timer: PexTimer, cancel: Boolean, wait: Boolean, parameters: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exDeleteTimer(timer, cancel, wait, (parameters?.value ?: 0L))

public actual fun exDestroyPool(poolhandle: Handle) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exDestroyPool((poolhandle?.value ?: 0L))
}

public actual fun exEnterCriticalRegionAndAcquireResourceExclusive(resource: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exEnterCriticalRegionAndAcquireResourceExclusive((resource?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun exEnterCriticalRegionAndAcquireResourceShared(resource: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exEnterCriticalRegionAndAcquireResourceShared((resource?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun exEnterCriticalRegionAndAcquireSharedWaitForExclusive(resource: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exEnterCriticalRegionAndAcquireSharedWaitForExclusive((resource?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun exEnumerateSystemFirmwareTables(firmwaretableprovidersignature: UInt, firmwaretablebuffer: COpaquePointer?, bufferlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exEnumerateSystemFirmwareTables(firmwaretableprovidersignature.toInt(), (firmwaretablebuffer?.value ?: 0L), bufferlength.toInt(), (returnlength?.value ?: 0L))

public actual fun exExtendZone(zone: COpaquePointer?, segment: COpaquePointer?, segmentsize: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exExtendZone((zone?.value ?: 0L), (segment?.value ?: 0L), segmentsize.toInt())

public actual fun exFreeCacheAwareRundownProtection(runrefcacheaware: PexRundownRefCacheAware) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exFreeCacheAwareRundownProtection(runrefcacheaware)
}

public actual fun exFreePool(p: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exFreePool((p?.value ?: 0L))
}

public actual fun exFreePool2(p: COpaquePointer?, tag: UInt, extendedparameters: COpaquePointer?, extendedparameterscount: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exFreePool2((p?.value ?: 0L), tag.toInt(), (extendedparameters?.value ?: 0L), extendedparameterscount.toInt())
}

public actual fun exFreePoolWithTag(p: COpaquePointer?, tag: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exFreePoolWithTag((p?.value ?: 0L), tag.toInt())
}

public actual fun exGetExclusiveWaiterCount(resource: COpaquePointer?): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exGetExclusiveWaiterCount((resource?.value ?: 0L)).toUInt()

public actual fun exGetFirmwareEnvironmentVariable(variablename: COpaquePointer?, vendorguid: COpaquePointer?, value: COpaquePointer?, valuelength: COpaquePointer?, attributes: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exGetFirmwareEnvironmentVariable((variablename?.value ?: 0L), (vendorguid?.value ?: 0L), (value?.value ?: 0L), (valuelength?.value ?: 0L), (attributes?.value ?: 0L))

public actual fun exGetFirmwareType(): FirmwareType =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exGetFirmwareType()

public actual fun exGetPreviousMode(): Byte =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exGetPreviousMode()

public actual fun exGetSharedWaiterCount(resource: COpaquePointer?): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exGetSharedWaiterCount((resource?.value ?: 0L)).toUInt()

public actual fun exGetSystemFirmwareTable(firmwaretableprovidersignature: UInt, firmwaretableid: UInt, firmwaretablebuffer: COpaquePointer?, bufferlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exGetSystemFirmwareTable(firmwaretableprovidersignature.toInt(), firmwaretableid.toInt(), (firmwaretablebuffer?.value ?: 0L), bufferlength.toInt(), (returnlength?.value ?: 0L))

public actual fun exInitializePushLock(pushlock: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exInitializePushLock((pushlock?.value ?: 0L))
}

public actual fun exInitializeResourceLite(resource: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exInitializeResourceLite((resource?.value ?: 0L))

public actual fun exInitializeRundownProtection(runref: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exInitializeRundownProtection((runref?.value ?: 0L))
}

public actual fun exInitializeRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware, runrefsize: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exInitializeRundownProtectionCacheAware(runrefcacheaware, runrefsize.toLong())
}

public actual fun exInitializeRundownProtectionCacheAwareEx(runrefcacheaware: PexRundownRefCacheAware, flags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exInitializeRundownProtectionCacheAwareEx(runrefcacheaware, flags.toInt())
}

public actual fun exInitializeZone(zone: COpaquePointer?, blocksize: UInt, initialsegment: COpaquePointer?, initialsegmentsize: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exInitializeZone((zone?.value ?: 0L), blocksize.toInt(), (initialsegment?.value ?: 0L), initialsegmentsize.toInt())

public actual fun exInterlockedAddLargeInteger(addend: COpaquePointer?, increment: Long, lock: COpaquePointer?): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exInterlockedAddLargeInteger((addend?.value ?: 0L), increment, (lock?.value ?: 0L))

public actual fun exInterlockedExtendZone(zone: COpaquePointer?, segment: COpaquePointer?, segmentsize: UInt, lock: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exInterlockedExtendZone((zone?.value ?: 0L), (segment?.value ?: 0L), segmentsize.toInt(), (lock?.value ?: 0L))

public actual fun exIsManufacturingModeEnabled(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exIsManufacturingModeEnabled()

public actual fun exIsProcessorFeaturePresent(processorfeature: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exIsProcessorFeaturePresent(processorfeature.toInt())

public actual fun exIsResourceAcquiredExclusiveLite(resource: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exIsResourceAcquiredExclusiveLite((resource?.value ?: 0L))

public actual fun exIsResourceAcquiredSharedLite(resource: COpaquePointer?): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exIsResourceAcquiredSharedLite((resource?.value ?: 0L)).toUInt()

public actual fun exIsSoftBoot(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exIsSoftBoot()

public actual fun exLocalTimeToSystemTime(localtime: COpaquePointer?, systemtime: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exLocalTimeToSystemTime((localtime?.value ?: 0L), (systemtime?.value ?: 0L))
}

public actual fun exNotifyCallback(callbackobject: COpaquePointer?, argument1: COpaquePointer?, argument2: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exNotifyCallback((callbackobject?.value ?: 0L), (argument1?.value ?: 0L), (argument2?.value ?: 0L))
}

public actual fun exQueryTimerResolution(maximumtime: COpaquePointer?, minimumtime: COpaquePointer?, currenttime: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exQueryTimerResolution((maximumtime?.value ?: 0L), (minimumtime?.value ?: 0L), (currenttime?.value ?: 0L))
}

public actual fun exQueueWorkItem(workitem: COpaquePointer?, queuetype: WorkQueueType) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exQueueWorkItem((workitem?.value ?: 0L), queuetype)
}

public actual fun exRaiseAccessViolation() {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exRaiseAccessViolation()
}

public actual fun exRaiseDatatypeMisalignment() {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exRaiseDatatypeMisalignment()
}

public actual fun exRaiseStatus(status: Ntstatus) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exRaiseStatus(status)
}

public actual fun exReInitializeRundownProtection(runref: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exReInitializeRundownProtection((runref?.value ?: 0L))
}

public actual fun exReInitializeRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exReInitializeRundownProtectionCacheAware(runrefcacheaware)
}

public actual fun exRegisterCallback(callbackobject: PcallbackObject, callbackfunction: PcallbackFunction, callbackcontext: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exRegisterCallback(callbackobject, 0L, (callbackcontext?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun exReinitializeResourceLite(resource: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exReinitializeResourceLite((resource?.value ?: 0L))

public actual fun exReleaseFastMutex(fastmutex: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exReleaseFastMutex((fastmutex?.value ?: 0L))
}

public actual fun exReleaseFastMutexUnsafe(fastmutex: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exReleaseFastMutexUnsafe((fastmutex?.value ?: 0L))
}

public actual fun exReleasePushLockExclusiveEx(pushlock: COpaquePointer?, flags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exReleasePushLockExclusiveEx((pushlock?.value ?: 0L), flags.toInt())
}

public actual fun exReleasePushLockSharedEx(pushlock: COpaquePointer?, flags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exReleasePushLockSharedEx((pushlock?.value ?: 0L), flags.toInt())
}

public actual fun exReleaseResourceAndLeaveCriticalRegion(resource: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exReleaseResourceAndLeaveCriticalRegion((resource?.value ?: 0L))
}

public actual fun exReleaseResourceForThreadLite(resource: COpaquePointer?, resourcethreadid: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exReleaseResourceForThreadLite((resource?.value ?: 0L), resourcethreadid.toLong())
}

public actual fun exReleaseResourceLite(resource: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exReleaseResourceLite((resource?.value ?: 0L))
}

public actual fun exReleaseRundownProtection(runref: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exReleaseRundownProtection((runref?.value ?: 0L))
}

public actual fun exReleaseRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exReleaseRundownProtectionCacheAware(runrefcacheaware)
}

public actual fun exReleaseRundownProtectionCacheAwareEx(runref: PexRundownRefCacheAware, count: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exReleaseRundownProtectionCacheAwareEx(runref, count.toInt())
}

public actual fun exReleaseRundownProtectionEx(runref: COpaquePointer?, count: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exReleaseRundownProtectionEx((runref?.value ?: 0L), count.toInt())
}

public actual fun exReleaseSpinLockExclusive(spinlock: COpaquePointer?, oldirql: UByte) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exReleaseSpinLockExclusive((spinlock?.value ?: 0L), oldirql.toByte())
}

public actual fun exReleaseSpinLockExclusiveFromDpcLevel(spinlock: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exReleaseSpinLockExclusiveFromDpcLevel((spinlock?.value ?: 0L))
}

public actual fun exReleaseSpinLockShared(spinlock: COpaquePointer?, oldirql: UByte) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exReleaseSpinLockShared((spinlock?.value ?: 0L), oldirql.toByte())
}

public actual fun exReleaseSpinLockSharedFromDpcLevel(spinlock: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exReleaseSpinLockSharedFromDpcLevel((spinlock?.value ?: 0L))
}

public actual fun exRundownCompleted(runref: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exRundownCompleted((runref?.value ?: 0L))
}

public actual fun exRundownCompletedCacheAware(runrefcacheaware: PexRundownRefCacheAware) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exRundownCompletedCacheAware(runrefcacheaware)
}

public actual fun exSecurePoolUpdate(securepoolhandle: Handle, tag: UInt, allocation: COpaquePointer?, cookie: ULong, offset: ULong, size: ULong, buffer: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exSecurePoolUpdate((securepoolhandle?.value ?: 0L), tag.toInt(), (allocation?.value ?: 0L), cookie.toLong(), offset.toLong(), size.toLong(), (buffer?.value ?: 0L))

public actual fun exSecurePoolValidate(securepoolhandle: Handle, tag: UInt, allocation: COpaquePointer?, cookie: ULong): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exSecurePoolValidate((securepoolhandle?.value ?: 0L), tag.toInt(), (allocation?.value ?: 0L), cookie.toLong()).toUInt()

public actual fun exSetFirmwareEnvironmentVariable(variablename: COpaquePointer?, vendorguid: COpaquePointer?, value: COpaquePointer?, valuelength: UInt, attributes: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exSetFirmwareEnvironmentVariable((variablename?.value ?: 0L), (vendorguid?.value ?: 0L), (value?.value ?: 0L), valuelength.toInt(), attributes.toInt())

public actual fun exSetResourceOwnerPointer(resource: COpaquePointer?, ownerpointer: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exSetResourceOwnerPointer((resource?.value ?: 0L), (ownerpointer?.value ?: 0L))
}

public actual fun exSetResourceOwnerPointerEx(resource: COpaquePointer?, ownerpointer: COpaquePointer?, flags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exSetResourceOwnerPointerEx((resource?.value ?: 0L), (ownerpointer?.value ?: 0L), flags.toInt())
}

public actual fun exSetTimer(timer: PexTimer, duetime: Long, period: Long, parameters: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exSetTimer(timer, duetime, period, (parameters?.value ?: 0L))

public actual fun exSetTimerResolution(desiredtime: UInt, setresolution: Boolean): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exSetTimerResolution(desiredtime.toInt(), setresolution).toUInt()

public actual fun exSizeOfRundownProtectionCacheAware(): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exSizeOfRundownProtectionCacheAware().toULong()

public actual fun exSystemTimeToLocalTime(systemtime: COpaquePointer?, localtime: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exSystemTimeToLocalTime((systemtime?.value ?: 0L), (localtime?.value ?: 0L))
}

public actual fun exTryAcquireSpinLockExclusiveAtDpcLevel(spinlock: COpaquePointer?): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exTryAcquireSpinLockExclusiveAtDpcLevel((spinlock?.value ?: 0L)).toUInt()

public actual fun exTryAcquireSpinLockSharedAtDpcLevel(spinlock: COpaquePointer?): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exTryAcquireSpinLockSharedAtDpcLevel((spinlock?.value ?: 0L)).toUInt()

public actual fun exTryConvertSharedSpinLockExclusive(spinlock: COpaquePointer?): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exTryConvertSharedSpinLockExclusive((spinlock?.value ?: 0L)).toUInt()

public actual fun exTryToAcquireFastMutex(fastmutex: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exTryToAcquireFastMutex((fastmutex?.value ?: 0L))

public actual fun exUnregisterCallback(callbackregistration: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exUnregisterCallback((callbackregistration?.value ?: 0L))
}

public actual fun exUuidCreate(uuid: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exUuidCreate((uuid?.value ?: 0L))

public actual fun exVerifySuite(suitetype: SuiteType): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exVerifySuite(suitetype)

public actual fun exWaitForRundownProtectionRelease(runref: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exWaitForRundownProtectionRelease((runref?.value ?: 0L))
}

public actual fun exWaitForRundownProtectionReleaseCacheAware(runref: PexRundownRefCacheAware) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_exWaitForRundownProtectionReleaseCacheAware(runref)
}

public actual fun fsRtlIsTotalDeviceFailure(status: Ntstatus): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_fsRtlIsTotalDeviceFailure(status)

public actual fun halAcquireDisplayOwnership(resetdisplayparameters: PhalResetDisplayParameters) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_halAcquireDisplayOwnership(0L)
}

public actual fun halAllocateAdapterChannel(adapterobject: COpaquePointer?, wcb: COpaquePointer?, numberofmapregisters: UInt, executionroutine: DriverControl): Ntstatus =
    0

public actual fun halAllocateCommonBuffer(adapterobject: COpaquePointer?, length: UInt, logicaladdress: COpaquePointer?, cacheenabled: Boolean): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_halAllocateCommonBuffer((adapterobject?.value ?: 0L), length.toInt(), (logicaladdress?.value ?: 0L), cacheenabled).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun halAllocateCrashDumpRegisters(adapterobject: COpaquePointer?, numberofmapregisters: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_halAllocateCrashDumpRegisters((adapterobject?.value ?: 0L), (numberofmapregisters?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun halAllocateHardwareCounters(groupaffinty: COpaquePointer?, groupcount: UInt, resourcelist: COpaquePointer?, countersethandle: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_halAllocateHardwareCounters((groupaffinty?.value ?: 0L), groupcount.toInt(), (resourcelist?.value ?: 0L), (countersethandle?.value ?: 0L))

public actual fun halAssignSlotResources(registrypath: COpaquePointer?, driverclassname: COpaquePointer?, driverobject: COpaquePointer?, deviceobject: COpaquePointer?, bustype: InterfaceType, busnumber: UInt, slotnumber: UInt, allocatedresources: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_halAssignSlotResources((registrypath?.value ?: 0L), (driverclassname?.value ?: 0L), (driverobject?.value ?: 0L), (deviceobject?.value ?: 0L), bustype, busnumber.toInt(), slotnumber.toInt(), (allocatedresources?.value ?: 0L))

public actual fun halBugCheckSystem(errorsource: COpaquePointer?, errorrecord: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_halBugCheckSystem((errorsource?.value ?: 0L), (errorrecord?.value ?: 0L))
}

public actual fun halDmaAllocateCrashDumpRegistersEx(adapter: COpaquePointer?, numberofmapregisters: UInt, type: HalDmaCrashDumpRegisterType, mapregisterbase: COpaquePointer?, mapregistersavailable: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_halDmaAllocateCrashDumpRegistersEx((adapter?.value ?: 0L), numberofmapregisters.toInt(), type, (mapregisterbase?.value ?: 0L), (mapregistersavailable?.value ?: 0L))

public actual fun halDmaFreeCrashDumpRegistersEx(adapter: COpaquePointer?, type: HalDmaCrashDumpRegisterType): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_halDmaFreeCrashDumpRegistersEx((adapter?.value ?: 0L), type)

public actual fun halExamineMBR(deviceobject: COpaquePointer?, sectorsize: UInt, mbrtypeidentifier: UInt, buffer: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_halExamineMBR((deviceobject?.value ?: 0L), sectorsize.toInt(), mbrtypeidentifier.toInt(), (buffer?.value ?: 0L))
}

public actual fun halFreeCommonBuffer(adapterobject: COpaquePointer?, length: UInt, logicaladdress: Long, virtualaddress: COpaquePointer?, cacheenabled: Boolean) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_halFreeCommonBuffer((adapterobject?.value ?: 0L), length.toInt(), logicaladdress, (virtualaddress?.value ?: 0L), cacheenabled)
}

public actual fun halFreeHardwareCounters(countersethandle: Handle): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_halFreeHardwareCounters((countersethandle?.value ?: 0L))

public actual fun halGetAdapter(devicedescription: COpaquePointer?, numberofmapregisters: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_halGetAdapter((devicedescription?.value ?: 0L), (numberofmapregisters?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun halGetBusData(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: COpaquePointer?, length: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_halGetBusData(busdatatype, busnumber.toInt(), slotnumber.toInt(), (buffer?.value ?: 0L), length.toInt()).toUInt()

public actual fun halGetBusDataByOffset(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: COpaquePointer?, offset: UInt, length: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_halGetBusDataByOffset(busdatatype, busnumber.toInt(), slotnumber.toInt(), (buffer?.value ?: 0L), offset.toInt(), length.toInt()).toUInt()

public actual fun halGetInterruptVector(interfacetype: InterfaceType, busnumber: UInt, businterruptlevel: UInt, businterruptvector: UInt, irql: COpaquePointer?, affinity: COpaquePointer?): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_halGetInterruptVector(interfacetype, busnumber.toInt(), businterruptlevel.toInt(), businterruptvector.toInt(), (irql?.value ?: 0L), (affinity?.value ?: 0L)).toUInt()

public actual fun halMakeBeep(frequency: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_halMakeBeep(frequency.toInt())

public actual fun halReadDmaCounter(adapterobject: COpaquePointer?): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_halReadDmaCounter((adapterobject?.value ?: 0L)).toUInt()

public actual fun halSetBusData(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: COpaquePointer?, length: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_halSetBusData(busdatatype, busnumber.toInt(), slotnumber.toInt(), (buffer?.value ?: 0L), length.toInt()).toUInt()

public actual fun halSetBusDataByOffset(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: COpaquePointer?, offset: UInt, length: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_halSetBusDataByOffset(busdatatype, busnumber.toInt(), slotnumber.toInt(), (buffer?.value ?: 0L), offset.toInt(), length.toInt()).toUInt()

public actual fun halTranslateBusAddress(interfacetype: InterfaceType, busnumber: UInt, busaddress: Long, addressspace: COpaquePointer?, translatedaddress: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_halTranslateBusAddress(interfacetype, busnumber.toInt(), busaddress, (addressspace?.value ?: 0L), (translatedaddress?.value ?: 0L))

public actual fun hvlRegisterWheaErrorNotification(callback: PhvlWheaErrorNotification): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_hvlRegisterWheaErrorNotification(0L)

public actual fun hvlUnregisterWheaErrorNotification(callback: PhvlWheaErrorNotification): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_hvlUnregisterWheaErrorNotification(0L)

public actual fun ioAcquireCancelSpinLock(irql: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioAcquireCancelSpinLock((irql?.value ?: 0L))
}

public actual fun ioAcquireKsrPersistentMemory(driverobject: COpaquePointer?, physicaldeviceobject: COpaquePointer?, buffer: COpaquePointer?, size: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioAcquireKsrPersistentMemory((driverobject?.value ?: 0L), (physicaldeviceobject?.value ?: 0L), (buffer?.value ?: 0L), (size?.value ?: 0L))

public actual fun ioAcquireKsrPersistentMemoryEx(driverobject: COpaquePointer?, physicaldeviceobject: COpaquePointer?, physicaldeviceid: COpaquePointer?, datatag: COpaquePointer?, dataversion: COpaquePointer?, buffer: COpaquePointer?, size: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioAcquireKsrPersistentMemoryEx((driverobject?.value ?: 0L), (physicaldeviceobject?.value ?: 0L), (physicaldeviceid?.value ?: 0L), (datatag?.value ?: 0L), (dataversion?.value ?: 0L), (buffer?.value ?: 0L), (size?.value ?: 0L))

public actual fun ioAcquireRemoveLockEx(removelock: COpaquePointer?, tag: COpaquePointer?, file: Pcstr, line: UInt, remlocksize: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioAcquireRemoveLockEx((removelock?.value ?: 0L), (tag?.value ?: 0L), (file?.value ?: 0L), line.toInt(), remlocksize.toInt())

public actual fun ioAllocateAdapterChannel(adapterobject: COpaquePointer?, deviceobject: COpaquePointer?, numberofmapregisters: UInt, executionroutine: DriverControl, context: COpaquePointer?): Ntstatus =
    0

public actual fun ioAllocateController(controllerobject: COpaquePointer?, deviceobject: COpaquePointer?, executionroutine: DriverControl, context: COpaquePointer?) {
}

public actual fun ioAllocateDriverObjectExtension(driverobject: COpaquePointer?, clientidentificationaddress: COpaquePointer?, driverobjectextensionsize: UInt, driverobjectextension: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioAllocateDriverObjectExtension((driverobject?.value ?: 0L), (clientidentificationaddress?.value ?: 0L), driverobjectextensionsize.toInt(), (driverobjectextension?.value ?: 0L))

public actual fun ioAllocateErrorLogEntry(ioobject: COpaquePointer?, entrysize: UByte): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioAllocateErrorLogEntry((ioobject?.value ?: 0L), entrysize.toByte()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ioAllocateIrp(stacksize: Byte, chargequota: Boolean): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioAllocateIrp(stacksize, chargequota).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ioAllocateIrpEx(deviceobject: COpaquePointer?, stacksize: Byte, chargequota: Boolean): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioAllocateIrpEx((deviceobject?.value ?: 0L), stacksize, chargequota).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ioAllocateMdl(virtualaddress: COpaquePointer?, length: UInt, secondarybuffer: Boolean, chargequota: Boolean, irp: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioAllocateMdl((virtualaddress?.value ?: 0L), length.toInt(), secondarybuffer, chargequota, (irp?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ioAllocateSfioStreamIdentifier(fileobject: COpaquePointer?, length: UInt, signature: COpaquePointer?, streamidentifier: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioAllocateSfioStreamIdentifier((fileobject?.value ?: 0L), length.toInt(), (signature?.value ?: 0L), (streamidentifier?.value ?: 0L))

public actual fun ioAllocateWorkItem(deviceobject: COpaquePointer?): PioWorkitem =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioAllocateWorkItem((deviceobject?.value ?: 0L))

public actual fun ioAssignResources(registrypath: COpaquePointer?, driverclassname: COpaquePointer?, driverobject: COpaquePointer?, deviceobject: COpaquePointer?, requestedresources: COpaquePointer?, allocatedresources: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioAssignResources((registrypath?.value ?: 0L), (driverclassname?.value ?: 0L), (driverobject?.value ?: 0L), (deviceobject?.value ?: 0L), (requestedresources?.value ?: 0L), (allocatedresources?.value ?: 0L))

public actual fun ioAttachDevice(sourcedevice: COpaquePointer?, targetdevice: COpaquePointer?, attacheddevice: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioAttachDevice((sourcedevice?.value ?: 0L), (targetdevice?.value ?: 0L), (attacheddevice?.value ?: 0L))

public actual fun ioAttachDeviceByPointer(sourcedevice: COpaquePointer?, targetdevice: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioAttachDeviceByPointer((sourcedevice?.value ?: 0L), (targetdevice?.value ?: 0L))

public actual fun ioAttachDeviceToDeviceStack(sourcedevice: COpaquePointer?, targetdevice: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioAttachDeviceToDeviceStack((sourcedevice?.value ?: 0L), (targetdevice?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ioAttachDeviceToDeviceStackSafe(sourcedevice: COpaquePointer?, targetdevice: COpaquePointer?, attachedtodeviceobject: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioAttachDeviceToDeviceStackSafe((sourcedevice?.value ?: 0L), (targetdevice?.value ?: 0L), (attachedtodeviceobject?.value ?: 0L))

public actual fun ioBuildAsynchronousFsdRequest(majorfunction: UInt, deviceobject: COpaquePointer?, buffer: COpaquePointer?, length: UInt, startingoffset: COpaquePointer?, iostatusblock: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioBuildAsynchronousFsdRequest(majorfunction.toInt(), (deviceobject?.value ?: 0L), (buffer?.value ?: 0L), length.toInt(), (startingoffset?.value ?: 0L), (iostatusblock?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ioBuildDeviceIoControlRequest(iocontrolcode: UInt, deviceobject: COpaquePointer?, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt, internaldeviceiocontrol: Boolean, event: COpaquePointer?, iostatusblock: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioBuildDeviceIoControlRequest(iocontrolcode.toInt(), (deviceobject?.value ?: 0L), (inputbuffer?.value ?: 0L), inputbufferlength.toInt(), (outputbuffer?.value ?: 0L), outputbufferlength.toInt(), internaldeviceiocontrol, (event?.value ?: 0L), (iostatusblock?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ioBuildPartialMdl(sourcemdl: COpaquePointer?, targetmdl: COpaquePointer?, virtualaddress: COpaquePointer?, length: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioBuildPartialMdl((sourcemdl?.value ?: 0L), (targetmdl?.value ?: 0L), (virtualaddress?.value ?: 0L), length.toInt())
}

public actual fun ioBuildSynchronousFsdRequest(majorfunction: UInt, deviceobject: COpaquePointer?, buffer: COpaquePointer?, length: UInt, startingoffset: COpaquePointer?, event: COpaquePointer?, iostatusblock: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioBuildSynchronousFsdRequest(majorfunction.toInt(), (deviceobject?.value ?: 0L), (buffer?.value ?: 0L), length.toInt(), (startingoffset?.value ?: 0L), (event?.value ?: 0L), (iostatusblock?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ioCancelFileOpen(deviceobject: COpaquePointer?, fileobject: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioCancelFileOpen((deviceobject?.value ?: 0L), (fileobject?.value ?: 0L))
}

public actual fun ioCancelIrp(irp: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioCancelIrp((irp?.value ?: 0L))

public actual fun ioCheckLinkShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: COpaquePointer?, shareaccess: COpaquePointer?, linkshareaccess: COpaquePointer?, ioshareaccessflags: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioCheckLinkShareAccess(desiredaccess.toInt(), desiredshareaccess.toInt(), (fileobject?.value ?: 0L), (shareaccess?.value ?: 0L), (linkshareaccess?.value ?: 0L), ioshareaccessflags.toInt())

public actual fun ioCheckShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: COpaquePointer?, shareaccess: COpaquePointer?, update: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioCheckShareAccess(desiredaccess.toInt(), desiredshareaccess.toInt(), (fileobject?.value ?: 0L), (shareaccess?.value ?: 0L), update)

public actual fun ioCheckShareAccessEx(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: COpaquePointer?, shareaccess: COpaquePointer?, update: Boolean, writepermission: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioCheckShareAccessEx(desiredaccess.toInt(), desiredshareaccess.toInt(), (fileobject?.value ?: 0L), (shareaccess?.value ?: 0L), update, (writepermission?.value ?: 0L))

public actual fun ioCleanupIrp(irp: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioCleanupIrp((irp?.value ?: 0L))
}

public actual fun ioClearActivityIdThread(originalid: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioClearActivityIdThread((originalid?.value ?: 0L))
}

public actual fun ioClearIrpExtraCreateParameter(irp: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioClearIrpExtraCreateParameter((irp?.value ?: 0L))
}

public actual fun ioConnectInterrupt(interruptobject: COpaquePointer?, serviceroutine: PkserviceRoutine, servicecontext: COpaquePointer?, spinlock: COpaquePointer?, vector: UInt, irql: UByte, synchronizeirql: UByte, interruptmode: KinterruptMode, sharevector: Boolean, processorenablemask: ULong, floatingsave: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioConnectInterrupt((interruptobject?.value ?: 0L), 0L, (servicecontext?.value ?: 0L), (spinlock?.value ?: 0L), vector.toInt(), irql.toByte(), synchronizeirql.toByte(), interruptmode, sharevector, processorenablemask.toLong(), floatingsave)

public actual fun ioConnectInterruptEx(parameters: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioConnectInterruptEx((parameters?.value ?: 0L))

public actual fun ioCreateController(size: UInt): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioCreateController(size.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ioCreateDevice(driverobject: COpaquePointer?, deviceextensionsize: UInt, devicename: COpaquePointer?, devicetype: UInt, devicecharacteristics: UInt, exclusive: Boolean, deviceobject: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioCreateDevice((driverobject?.value ?: 0L), deviceextensionsize.toInt(), (devicename?.value ?: 0L), devicetype.toInt(), devicecharacteristics.toInt(), exclusive, (deviceobject?.value ?: 0L))

public actual fun ioCreateDisk(deviceobject: COpaquePointer?, disk: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioCreateDisk((deviceobject?.value ?: 0L), (disk?.value ?: 0L))

public actual fun ioCreateFile(filehandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, allocationsize: COpaquePointer?, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: COpaquePointer?, ealength: UInt, createfiletype: CreateFileType, internalparameters: COpaquePointer?, options: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioCreateFile((filehandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), (iostatusblock?.value ?: 0L), (allocationsize?.value ?: 0L), fileattributes.toInt(), shareaccess.toInt(), disposition.toInt(), createoptions.toInt(), (eabuffer?.value ?: 0L), ealength.toInt(), createfiletype, (internalparameters?.value ?: 0L), options.toInt())

public actual fun ioCreateFileEx(filehandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, allocationsize: COpaquePointer?, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: COpaquePointer?, ealength: UInt, createfiletype: CreateFileType, internalparameters: COpaquePointer?, options: UInt, drivercontext: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioCreateFileEx((filehandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), (iostatusblock?.value ?: 0L), (allocationsize?.value ?: 0L), fileattributes.toInt(), shareaccess.toInt(), disposition.toInt(), createoptions.toInt(), (eabuffer?.value ?: 0L), ealength.toInt(), createfiletype, (internalparameters?.value ?: 0L), options.toInt(), (drivercontext?.value ?: 0L))

public actual fun ioCreateFileSpecifyDeviceObjectHint(filehandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, allocationsize: COpaquePointer?, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: COpaquePointer?, ealength: UInt, createfiletype: CreateFileType, internalparameters: COpaquePointer?, options: UInt, deviceobject: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioCreateFileSpecifyDeviceObjectHint((filehandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), (iostatusblock?.value ?: 0L), (allocationsize?.value ?: 0L), fileattributes.toInt(), shareaccess.toInt(), disposition.toInt(), createoptions.toInt(), (eabuffer?.value ?: 0L), ealength.toInt(), createfiletype, (internalparameters?.value ?: 0L), options.toInt(), (deviceobject?.value ?: 0L))

public actual fun ioCreateNotificationEvent(eventname: COpaquePointer?, eventhandle: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioCreateNotificationEvent((eventname?.value ?: 0L), (eventhandle?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ioCreateSymbolicLink(symboliclinkname: COpaquePointer?, devicename: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioCreateSymbolicLink((symboliclinkname?.value ?: 0L), (devicename?.value ?: 0L))

public actual fun ioCreateSynchronizationEvent(eventname: COpaquePointer?, eventhandle: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioCreateSynchronizationEvent((eventname?.value ?: 0L), (eventhandle?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ioCreateSystemThread(ioobject: COpaquePointer?, threadhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, processhandle: Handle, clientid: COpaquePointer?, startroutine: PkstartRoutine, startcontext: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioCreateSystemThread((ioobject?.value ?: 0L), (threadhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), (processhandle?.value ?: 0L), (clientid?.value ?: 0L), 0L, (startcontext?.value ?: 0L))

public actual fun ioCreateUnprotectedSymbolicLink(symboliclinkname: COpaquePointer?, devicename: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioCreateUnprotectedSymbolicLink((symboliclinkname?.value ?: 0L), (devicename?.value ?: 0L))

public actual fun ioCsqInitialize(csq: COpaquePointer?, csqinsertirp: PioCsqInsertIrp, csqremoveirp: PioCsqRemoveIrp, csqpeeknextirp: PioCsqPeekNextIrp, csqacquirelock: PioCsqAcquireLock, csqreleaselock: PioCsqReleaseLock, csqcompletecanceledirp: PioCsqCompleteCanceledIrp): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioCsqInitialize((csq?.value ?: 0L), 0L, 0L, 0L, 0L, 0L, 0L)

public actual fun ioCsqInitializeEx(csq: COpaquePointer?, csqinsertirp: PioCsqInsertIrpEx, csqremoveirp: PioCsqRemoveIrp, csqpeeknextirp: PioCsqPeekNextIrp, csqacquirelock: PioCsqAcquireLock, csqreleaselock: PioCsqReleaseLock, csqcompletecanceledirp: PioCsqCompleteCanceledIrp): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioCsqInitializeEx((csq?.value ?: 0L), 0L, 0L, 0L, 0L, 0L, 0L)

public actual fun ioCsqInsertIrp(csq: COpaquePointer?, irp: COpaquePointer?, context: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioCsqInsertIrp((csq?.value ?: 0L), (irp?.value ?: 0L), (context?.value ?: 0L))
}

public actual fun ioCsqInsertIrpEx(csq: COpaquePointer?, irp: COpaquePointer?, context: COpaquePointer?, insertcontext: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioCsqInsertIrpEx((csq?.value ?: 0L), (irp?.value ?: 0L), (context?.value ?: 0L), (insertcontext?.value ?: 0L))

public actual fun ioCsqRemoveIrp(csq: COpaquePointer?, context: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioCsqRemoveIrp((csq?.value ?: 0L), (context?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ioCsqRemoveNextIrp(csq: COpaquePointer?, peekcontext: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioCsqRemoveNextIrp((csq?.value ?: 0L), (peekcontext?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ioDecrementKeepAliveCount(fileobject: COpaquePointer?, process: Peprocess): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioDecrementKeepAliveCount((fileobject?.value ?: 0L), process)

public actual fun ioDeleteController(controllerobject: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioDeleteController((controllerobject?.value ?: 0L))
}

public actual fun ioDeleteDevice(deviceobject: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioDeleteDevice((deviceobject?.value ?: 0L))
}

public actual fun ioDeleteSymbolicLink(symboliclinkname: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioDeleteSymbolicLink((symboliclinkname?.value ?: 0L))

public actual fun ioDetachDevice(targetdevice: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioDetachDevice((targetdevice?.value ?: 0L))
}

public actual fun ioDisconnectInterrupt(interruptobject: Pkinterrupt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioDisconnectInterrupt(interruptobject)
}

public actual fun ioDisconnectInterruptEx(parameters: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioDisconnectInterruptEx((parameters?.value ?: 0L))
}

public actual fun ioEnumerateKsrPersistentMemoryEx(driverobject: COpaquePointer?, physicaldeviceobject: COpaquePointer?, physicaldeviceid: COpaquePointer?, callback: PioPersistedMemoryEnumerationCallback, callbackcontext: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioEnumerateKsrPersistentMemoryEx((driverobject?.value ?: 0L), (physicaldeviceobject?.value ?: 0L), (physicaldeviceid?.value ?: 0L), 0L, (callbackcontext?.value ?: 0L))

public actual fun ioFlushAdapterBuffers(adapterobject: COpaquePointer?, mdl: COpaquePointer?, mapregisterbase: COpaquePointer?, currentva: COpaquePointer?, length: UInt, writetodevice: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioFlushAdapterBuffers((adapterobject?.value ?: 0L), (mdl?.value ?: 0L), (mapregisterbase?.value ?: 0L), (currentva?.value ?: 0L), length.toInt(), writetodevice)

public actual fun ioForwardIrpSynchronously(deviceobject: COpaquePointer?, irp: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioForwardIrpSynchronously((deviceobject?.value ?: 0L), (irp?.value ?: 0L))

public actual fun ioFreeAdapterChannel(adapterobject: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioFreeAdapterChannel((adapterobject?.value ?: 0L))
}

public actual fun ioFreeController(controllerobject: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioFreeController((controllerobject?.value ?: 0L))
}

public actual fun ioFreeErrorLogEntry(elentry: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioFreeErrorLogEntry((elentry?.value ?: 0L))
}

public actual fun ioFreeIrp(irp: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioFreeIrp((irp?.value ?: 0L))
}

public actual fun ioFreeKsrPersistentMemory(datahandle: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioFreeKsrPersistentMemory((datahandle?.value ?: 0L))

public actual fun ioFreeMapRegisters(adapterobject: COpaquePointer?, mapregisterbase: COpaquePointer?, numberofmapregisters: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioFreeMapRegisters((adapterobject?.value ?: 0L), (mapregisterbase?.value ?: 0L), numberofmapregisters.toInt())
}

public actual fun ioFreeMdl(mdl: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioFreeMdl((mdl?.value ?: 0L))
}

public actual fun ioFreeSfioStreamIdentifier(fileobject: COpaquePointer?, signature: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioFreeSfioStreamIdentifier((fileobject?.value ?: 0L), (signature?.value ?: 0L))

public actual fun ioFreeWorkItem(ioworkitem: PioWorkitem) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioFreeWorkItem(ioworkitem)
}

public actual fun ioGetActivityIdIrp(irp: COpaquePointer?, guid: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioGetActivityIdIrp((irp?.value ?: 0L), (guid?.value ?: 0L))

public actual fun ioGetActivityIdThread(): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioGetActivityIdThread().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ioGetAffinityInterrupt(interruptobject: Pkinterrupt, groupaffinity: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioGetAffinityInterrupt(interruptobject, (groupaffinity?.value ?: 0L))

public actual fun ioGetAttachedDeviceReference(deviceobject: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioGetAttachedDeviceReference((deviceobject?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ioGetBootDiskInformation(bootdiskinformation: COpaquePointer?, size: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioGetBootDiskInformation((bootdiskinformation?.value ?: 0L), size.toInt())

public actual fun ioGetBootDiskInformationLite(bootdiskinformation: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioGetBootDiskInformationLite((bootdiskinformation?.value ?: 0L))

public actual fun ioGetConfigurationInformation(): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioGetConfigurationInformation().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ioGetContainerInformation(informationclass: IoContainerInformationClass, containerobject: COpaquePointer?, buffer: COpaquePointer?, bufferlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioGetContainerInformation(informationclass, (containerobject?.value ?: 0L), (buffer?.value ?: 0L), bufferlength.toInt())

public actual fun ioGetCurrentProcess(): Peprocess =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioGetCurrentProcess()

public actual fun ioGetDeviceDirectory(physicaldeviceobject: COpaquePointer?, directorytype: DeviceDirectoryType, flags: UInt, reserved: COpaquePointer?, devicedirectoryhandle: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioGetDeviceDirectory((physicaldeviceobject?.value ?: 0L), directorytype, flags.toInt(), (reserved?.value ?: 0L), (devicedirectoryhandle?.value ?: 0L))

public actual fun ioGetDeviceInterfaceAlias(symboliclinkname: COpaquePointer?, aliasinterfaceclassguid: COpaquePointer?, aliassymboliclinkname: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioGetDeviceInterfaceAlias((symboliclinkname?.value ?: 0L), (aliasinterfaceclassguid?.value ?: 0L), (aliassymboliclinkname?.value ?: 0L))

public actual fun ioGetDeviceInterfacePropertyData(symboliclinkname: COpaquePointer?, propertykey: COpaquePointer?, lcid: UInt, flags: UInt, size: UInt, data: COpaquePointer?, requiredsize: COpaquePointer?, type: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioGetDeviceInterfacePropertyData((symboliclinkname?.value ?: 0L), (propertykey?.value ?: 0L), lcid.toInt(), flags.toInt(), size.toInt(), (data?.value ?: 0L), (requiredsize?.value ?: 0L), (type?.value ?: 0L))

public actual fun ioGetDeviceInterfaces(interfaceclassguid: COpaquePointer?, physicaldeviceobject: COpaquePointer?, flags: UInt, symboliclinklist: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioGetDeviceInterfaces((interfaceclassguid?.value ?: 0L), (physicaldeviceobject?.value ?: 0L), flags.toInt(), (symboliclinklist?.value ?: 0L))

public actual fun ioGetDeviceNumaNode(pdo: COpaquePointer?, nodenumber: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioGetDeviceNumaNode((pdo?.value ?: 0L), (nodenumber?.value ?: 0L))

public actual fun ioGetDeviceObjectPointer(objectname: COpaquePointer?, desiredaccess: UInt, fileobject: COpaquePointer?, deviceobject: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioGetDeviceObjectPointer((objectname?.value ?: 0L), desiredaccess.toInt(), (fileobject?.value ?: 0L), (deviceobject?.value ?: 0L))

public actual fun ioGetDeviceProperty(deviceobject: COpaquePointer?, deviceproperty: DeviceRegistryProperty, bufferlength: UInt, propertybuffer: COpaquePointer?, resultlength: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioGetDeviceProperty((deviceobject?.value ?: 0L), deviceproperty, bufferlength.toInt(), (propertybuffer?.value ?: 0L), (resultlength?.value ?: 0L))

public actual fun ioGetDevicePropertyData(pdo: COpaquePointer?, propertykey: COpaquePointer?, lcid: UInt, flags: UInt, size: UInt, data: COpaquePointer?, requiredsize: COpaquePointer?, type: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioGetDevicePropertyData((pdo?.value ?: 0L), (propertykey?.value ?: 0L), lcid.toInt(), flags.toInt(), size.toInt(), (data?.value ?: 0L), (requiredsize?.value ?: 0L), (type?.value ?: 0L))

public actual fun ioGetDmaAdapter(physicaldeviceobject: COpaquePointer?, devicedescription: COpaquePointer?, numberofmapregisters: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioGetDmaAdapter((physicaldeviceobject?.value ?: 0L), (devicedescription?.value ?: 0L), (numberofmapregisters?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ioGetDriverDirectory(driverobject: COpaquePointer?, directorytype: DriverDirectoryType, flags: UInt, driverdirectoryhandle: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioGetDriverDirectory((driverobject?.value ?: 0L), directorytype, flags.toInt(), (driverdirectoryhandle?.value ?: 0L))

public actual fun ioGetDriverObjectExtension(driverobject: COpaquePointer?, clientidentificationaddress: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioGetDriverObjectExtension((driverobject?.value ?: 0L), (clientidentificationaddress?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ioGetFileObjectGenericMapping(): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioGetFileObjectGenericMapping().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ioGetFsZeroingOffset(irp: COpaquePointer?, zeroingoffset: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioGetFsZeroingOffset((irp?.value ?: 0L), (zeroingoffset?.value ?: 0L))

public actual fun ioGetInitialStack(): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioGetInitialStack().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ioGetInitiatorProcess(fileobject: COpaquePointer?): Peprocess =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioGetInitiatorProcess((fileobject?.value ?: 0L))

public actual fun ioGetIoAttributionHandle(irp: COpaquePointer?, ioattributionhandle: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioGetIoAttributionHandle((irp?.value ?: 0L), (ioattributionhandle?.value ?: 0L))

public actual fun ioGetIoPriorityHint(irp: COpaquePointer?): IoPriorityHint =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioGetIoPriorityHint((irp?.value ?: 0L))

public actual fun ioGetIommuInterface(version: UInt, interfaceout: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioGetIommuInterface(version.toInt(), (interfaceout?.value ?: 0L))

public actual fun ioGetIommuInterfaceEx(version: UInt, flags: ULong, interfaceout: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioGetIommuInterfaceEx(version.toInt(), flags.toLong(), (interfaceout?.value ?: 0L))

public actual fun ioGetIrpExtraCreateParameter(irp: COpaquePointer?, extracreateparameter: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioGetIrpExtraCreateParameter((irp?.value ?: 0L), (extracreateparameter?.value ?: 0L))

public actual fun ioGetPagingIoPriority(irp: COpaquePointer?): IoPagingPriority =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioGetPagingIoPriority((irp?.value ?: 0L))

public actual fun ioGetRelatedDeviceObject(fileobject: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioGetRelatedDeviceObject((fileobject?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ioGetSfioStreamIdentifier(fileobject: COpaquePointer?, signature: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioGetSfioStreamIdentifier((fileobject?.value ?: 0L), (signature?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ioGetSilo(fileobject: COpaquePointer?): Pesilo =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioGetSilo((fileobject?.value ?: 0L))

public actual fun ioGetSiloParameters(fileobject: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioGetSiloParameters((fileobject?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ioGetStackLimits(lowlimit: COpaquePointer?, highlimit: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioGetStackLimits((lowlimit?.value ?: 0L), (highlimit?.value ?: 0L))
}

public actual fun ioGetTopLevelIrp(): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioGetTopLevelIrp().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ioGetTransactionParameterBlock(fileobject: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioGetTransactionParameterBlock((fileobject?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ioIncrementKeepAliveCount(fileobject: COpaquePointer?, process: Peprocess): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioIncrementKeepAliveCount((fileobject?.value ?: 0L), process)

public actual fun ioInitializeIrp(irp: COpaquePointer?, packetsize: UShort, stacksize: Byte) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioInitializeIrp((irp?.value ?: 0L), packetsize.toShort(), stacksize)
}

public actual fun ioInitializeIrpEx(irp: COpaquePointer?, deviceobject: COpaquePointer?, packetsize: UShort, stacksize: Byte) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioInitializeIrpEx((irp?.value ?: 0L), (deviceobject?.value ?: 0L), packetsize.toShort(), stacksize)
}

public actual fun ioInitializeRemoveLockEx(lock: COpaquePointer?, allocatetag: UInt, maxlockedminutes: UInt, highwatermark: UInt, remlocksize: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioInitializeRemoveLockEx((lock?.value ?: 0L), allocatetag.toInt(), maxlockedminutes.toInt(), highwatermark.toInt(), remlocksize.toInt())
}

public actual fun ioInitializeTimer(deviceobject: COpaquePointer?, timerroutine: PioTimerRoutine, context: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioInitializeTimer((deviceobject?.value ?: 0L), 0L, (context?.value ?: 0L))

public actual fun ioInitializeWorkItem(ioobject: COpaquePointer?, ioworkitem: PioWorkitem) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioInitializeWorkItem((ioobject?.value ?: 0L), ioworkitem)
}

public actual fun ioInvalidateDeviceRelations(deviceobject: COpaquePointer?, type: DeviceRelationType) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioInvalidateDeviceRelations((deviceobject?.value ?: 0L), type)
}

public actual fun ioInvalidateDeviceState(physicaldeviceobject: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioInvalidateDeviceState((physicaldeviceobject?.value ?: 0L))
}

public actual fun ioIs32bitProcess(irp: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioIs32bitProcess((irp?.value ?: 0L))

public actual fun ioIsFileObjectIgnoringSharing(fileobject: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioIsFileObjectIgnoringSharing((fileobject?.value ?: 0L))

public actual fun ioIsFileOriginRemote(fileobject: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioIsFileOriginRemote((fileobject?.value ?: 0L))

public actual fun ioIsInitiator32bitProcess(irp: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioIsInitiator32bitProcess((irp?.value ?: 0L))

public actual fun ioIsValidIrpStatus(status: Ntstatus): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioIsValidIrpStatus(status).toUInt()

public actual fun ioIsWdmVersionAvailable(majorversion: UByte, minorversion: UByte): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioIsWdmVersionAvailable(majorversion.toByte(), minorversion.toByte())

public actual fun ioMakeAssociatedIrp(irp: COpaquePointer?, stacksize: Byte): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioMakeAssociatedIrp((irp?.value ?: 0L), stacksize).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ioMakeAssociatedIrpEx(irp: COpaquePointer?, deviceobject: COpaquePointer?, stacksize: Byte): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioMakeAssociatedIrpEx((irp?.value ?: 0L), (deviceobject?.value ?: 0L), stacksize).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ioMapTransfer(adapterobject: COpaquePointer?, mdl: COpaquePointer?, mapregisterbase: COpaquePointer?, currentva: COpaquePointer?, length: COpaquePointer?, writetodevice: Boolean): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioMapTransfer((adapterobject?.value ?: 0L), (mdl?.value ?: 0L), (mapregisterbase?.value ?: 0L), (currentva?.value ?: 0L), (length?.value ?: 0L), writetodevice)

public actual fun ioOpenDeviceInterfaceRegistryKey(symboliclinkname: COpaquePointer?, desiredaccess: UInt, deviceinterfaceregkey: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioOpenDeviceInterfaceRegistryKey((symboliclinkname?.value ?: 0L), desiredaccess.toInt(), (deviceinterfaceregkey?.value ?: 0L))

public actual fun ioOpenDeviceRegistryKey(deviceobject: COpaquePointer?, devinstkeytype: UInt, desiredaccess: UInt, deviceregkey: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioOpenDeviceRegistryKey((deviceobject?.value ?: 0L), devinstkeytype.toInt(), desiredaccess.toInt(), (deviceregkey?.value ?: 0L))

public actual fun ioOpenDriverRegistryKey(driverobject: COpaquePointer?, regkeytype: DriverRegkeyType, desiredaccess: UInt, flags: UInt, driverregkey: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioOpenDriverRegistryKey((driverobject?.value ?: 0L), regkeytype, desiredaccess.toInt(), flags.toInt(), (driverregkey?.value ?: 0L))

public actual fun ioPropagateActivityIdToThread(irp: COpaquePointer?, propagatedid: COpaquePointer?, originalid: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioPropagateActivityIdToThread((irp?.value ?: 0L), (propagatedid?.value ?: 0L), (originalid?.value ?: 0L))

public actual fun ioQueryDeviceDescription(bustype: COpaquePointer?, busnumber: COpaquePointer?, controllertype: COpaquePointer?, controllernumber: COpaquePointer?, peripheraltype: COpaquePointer?, peripheralnumber: COpaquePointer?, calloutroutine: PioQueryDeviceRoutine, context: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioQueryDeviceDescription((bustype?.value ?: 0L), (busnumber?.value ?: 0L), (controllertype?.value ?: 0L), (controllernumber?.value ?: 0L), (peripheraltype?.value ?: 0L), (peripheralnumber?.value ?: 0L), 0L, (context?.value ?: 0L))

public actual fun ioQueryFullDriverPath(driverobject: COpaquePointer?, fullpath: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioQueryFullDriverPath((driverobject?.value ?: 0L), (fullpath?.value ?: 0L))

public actual fun ioQueryInformationByName(objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass, options: UInt, drivercontext: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioQueryInformationByName((objectattributes?.value ?: 0L), (iostatusblock?.value ?: 0L), (fileinformation?.value ?: 0L), length.toInt(), fileinformationclass, options.toInt(), (drivercontext?.value ?: 0L))

public actual fun ioQueryKsrPersistentMemorySize(driverobject: COpaquePointer?, physicaldeviceobject: COpaquePointer?, buffersize: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioQueryKsrPersistentMemorySize((driverobject?.value ?: 0L), (physicaldeviceobject?.value ?: 0L), (buffersize?.value ?: 0L))

public actual fun ioQueryKsrPersistentMemorySizeEx(driverobject: COpaquePointer?, physicaldeviceobject: COpaquePointer?, physicaldeviceid: COpaquePointer?, datatag: COpaquePointer?, dataversion: COpaquePointer?, buffersize: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioQueryKsrPersistentMemorySizeEx((driverobject?.value ?: 0L), (physicaldeviceobject?.value ?: 0L), (physicaldeviceid?.value ?: 0L), (datatag?.value ?: 0L), (dataversion?.value ?: 0L), (buffersize?.value ?: 0L))

public actual fun ioQueueWorkItem(ioworkitem: PioWorkitem, workerroutine: PioWorkitemRoutine, queuetype: WorkQueueType, context: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioQueueWorkItem(ioworkitem, 0L, queuetype, (context?.value ?: 0L))
}

public actual fun ioQueueWorkItemEx(ioworkitem: PioWorkitem, workerroutine: PioWorkitemRoutineEx, queuetype: WorkQueueType, context: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioQueueWorkItemEx(ioworkitem, 0L, queuetype, (context?.value ?: 0L))
}

public actual fun ioRaiseHardError(irp: COpaquePointer?, vpb: COpaquePointer?, realdeviceobject: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioRaiseHardError((irp?.value ?: 0L), (vpb?.value ?: 0L), (realdeviceobject?.value ?: 0L))
}

public actual fun ioRaiseInformationalHardError(errorstatus: Ntstatus, string: COpaquePointer?, thread: Pkthread): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioRaiseInformationalHardError(errorstatus, (string?.value ?: 0L), thread)

public actual fun ioReadDiskSignature(deviceobject: COpaquePointer?, bytespersector: UInt, signature: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioReadDiskSignature((deviceobject?.value ?: 0L), bytespersector.toInt(), (signature?.value ?: 0L))

public actual fun ioReadPartitionTable(deviceobject: COpaquePointer?, sectorsize: UInt, returnrecognizedpartitions: Boolean, partitionbuffer: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioReadPartitionTable((deviceobject?.value ?: 0L), sectorsize.toInt(), returnrecognizedpartitions, (partitionbuffer?.value ?: 0L))

public actual fun ioReadPartitionTableEx(deviceobject: COpaquePointer?, drivelayout: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioReadPartitionTableEx((deviceobject?.value ?: 0L), (drivelayout?.value ?: 0L))

public actual fun ioRecordIoAttribution(opaquehandle: COpaquePointer?, attributioninformation: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioRecordIoAttribution((opaquehandle?.value ?: 0L), (attributioninformation?.value ?: 0L))

public actual fun ioRegisterBootDriverCallback(callbackfunction: PbootDriverCallbackFunction, callbackcontext: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioRegisterBootDriverCallback(0L, (callbackcontext?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ioRegisterBootDriverReinitialization(driverobject: COpaquePointer?, driverreinitializationroutine: DriverReinitialize, context: COpaquePointer?) {
}

public actual fun ioRegisterContainerNotification(notificationclass: IoContainerNotificationClass, callbackfunction: PioContainerNotificationFunction, notificationinformation: COpaquePointer?, notificationinformationlength: UInt, callbackregistration: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioRegisterContainerNotification(notificationclass, 0L, (notificationinformation?.value ?: 0L), notificationinformationlength.toInt(), (callbackregistration?.value ?: 0L))

public actual fun ioRegisterDeviceInterface(physicaldeviceobject: COpaquePointer?, interfaceclassguid: COpaquePointer?, referencestring: COpaquePointer?, symboliclinkname: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioRegisterDeviceInterface((physicaldeviceobject?.value ?: 0L), (interfaceclassguid?.value ?: 0L), (referencestring?.value ?: 0L), (symboliclinkname?.value ?: 0L))

public actual fun ioRegisterDriverReinitialization(driverobject: COpaquePointer?, driverreinitializationroutine: DriverReinitialize, context: COpaquePointer?) {
}

public actual fun ioRegisterLastChanceShutdownNotification(deviceobject: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioRegisterLastChanceShutdownNotification((deviceobject?.value ?: 0L))

public actual fun ioRegisterPlugPlayNotification(eventcategory: IoNotificationEventCategory, eventcategoryflags: UInt, eventcategorydata: COpaquePointer?, driverobject: COpaquePointer?, callbackroutine: DriverNotificationCallbackRoutine, context: COpaquePointer?, notificationentry: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioRegisterPlugPlayNotification(eventcategory, eventcategoryflags.toInt(), (eventcategorydata?.value ?: 0L), (driverobject?.value ?: 0L), 0L, (context?.value ?: 0L), (notificationentry?.value ?: 0L))

public actual fun ioRegisterShutdownNotification(deviceobject: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioRegisterShutdownNotification((deviceobject?.value ?: 0L))

public actual fun ioReleaseCancelSpinLock(irql: UByte) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioReleaseCancelSpinLock(irql.toByte())
}

public actual fun ioReleaseRemoveLockAndWaitEx(removelock: COpaquePointer?, tag: COpaquePointer?, remlocksize: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioReleaseRemoveLockAndWaitEx((removelock?.value ?: 0L), (tag?.value ?: 0L), remlocksize.toInt())
}

public actual fun ioReleaseRemoveLockEx(removelock: COpaquePointer?, tag: COpaquePointer?, remlocksize: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioReleaseRemoveLockEx((removelock?.value ?: 0L), (tag?.value ?: 0L), remlocksize.toInt())
}

public actual fun ioRemoveLinkShareAccess(fileobject: COpaquePointer?, shareaccess: COpaquePointer?, linkshareaccess: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioRemoveLinkShareAccess((fileobject?.value ?: 0L), (shareaccess?.value ?: 0L), (linkshareaccess?.value ?: 0L))
}

public actual fun ioRemoveLinkShareAccessEx(fileobject: COpaquePointer?, shareaccess: COpaquePointer?, linkshareaccess: COpaquePointer?, ioshareaccessflags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioRemoveLinkShareAccessEx((fileobject?.value ?: 0L), (shareaccess?.value ?: 0L), (linkshareaccess?.value ?: 0L), ioshareaccessflags.toInt())
}

public actual fun ioRemoveShareAccess(fileobject: COpaquePointer?, shareaccess: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioRemoveShareAccess((fileobject?.value ?: 0L), (shareaccess?.value ?: 0L))
}

public actual fun ioReplacePartitionUnit(targetpdo: COpaquePointer?, sparepdo: COpaquePointer?, flags: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioReplacePartitionUnit((targetpdo?.value ?: 0L), (sparepdo?.value ?: 0L), flags.toInt())

public actual fun ioReportDetectedDevice(driverobject: COpaquePointer?, legacybustype: InterfaceType, busnumber: UInt, slotnumber: UInt, resourcelist: COpaquePointer?, resourcerequirements: COpaquePointer?, resourceassigned: Boolean, deviceobject: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioReportDetectedDevice((driverobject?.value ?: 0L), legacybustype, busnumber.toInt(), slotnumber.toInt(), (resourcelist?.value ?: 0L), (resourcerequirements?.value ?: 0L), resourceassigned, (deviceobject?.value ?: 0L))

public actual fun ioReportInterruptActive(parameters: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioReportInterruptActive((parameters?.value ?: 0L))
}

public actual fun ioReportInterruptInactive(parameters: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioReportInterruptInactive((parameters?.value ?: 0L))
}

public actual fun ioReportResourceForDetection(driverobject: COpaquePointer?, driverlist: COpaquePointer?, driverlistsize: UInt, deviceobject: COpaquePointer?, devicelist: COpaquePointer?, devicelistsize: UInt, conflictdetected: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioReportResourceForDetection((driverobject?.value ?: 0L), (driverlist?.value ?: 0L), driverlistsize.toInt(), (deviceobject?.value ?: 0L), (devicelist?.value ?: 0L), devicelistsize.toInt(), (conflictdetected?.value ?: 0L))

public actual fun ioReportResourceUsage(driverclassname: COpaquePointer?, driverobject: COpaquePointer?, driverlist: COpaquePointer?, driverlistsize: UInt, deviceobject: COpaquePointer?, devicelist: COpaquePointer?, devicelistsize: UInt, overrideconflict: Boolean, conflictdetected: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioReportResourceUsage((driverclassname?.value ?: 0L), (driverobject?.value ?: 0L), (driverlist?.value ?: 0L), driverlistsize.toInt(), (deviceobject?.value ?: 0L), (devicelist?.value ?: 0L), devicelistsize.toInt(), overrideconflict, (conflictdetected?.value ?: 0L))

public actual fun ioReportRootDevice(driverobject: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioReportRootDevice((driverobject?.value ?: 0L))

public actual fun ioReportTargetDeviceChange(physicaldeviceobject: COpaquePointer?, notificationstructure: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioReportTargetDeviceChange((physicaldeviceobject?.value ?: 0L), (notificationstructure?.value ?: 0L))

public actual fun ioReportTargetDeviceChangeAsynchronous(physicaldeviceobject: COpaquePointer?, notificationstructure: COpaquePointer?, callback: PdeviceChangeCompleteCallback, context: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioReportTargetDeviceChangeAsynchronous((physicaldeviceobject?.value ?: 0L), (notificationstructure?.value ?: 0L), 0L, (context?.value ?: 0L))

public actual fun ioRequestDeviceEject(physicaldeviceobject: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioRequestDeviceEject((physicaldeviceobject?.value ?: 0L))
}

public actual fun ioRequestDeviceEjectEx(physicaldeviceobject: COpaquePointer?, callback: PioDeviceEjectCallback, context: COpaquePointer?, driverobject: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioRequestDeviceEjectEx((physicaldeviceobject?.value ?: 0L), 0L, (context?.value ?: 0L), (driverobject?.value ?: 0L))

public actual fun ioReserveKsrPersistentMemory(driverobject: COpaquePointer?, physicaldeviceobject: COpaquePointer?, size: ULong, flags: UInt, datahandle: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioReserveKsrPersistentMemory((driverobject?.value ?: 0L), (physicaldeviceobject?.value ?: 0L), size.toLong(), flags.toInt(), (datahandle?.value ?: 0L))

public actual fun ioReserveKsrPersistentMemoryEx(driverobject: COpaquePointer?, physicaldeviceobject: COpaquePointer?, physicaldeviceid: COpaquePointer?, datatag: COpaquePointer?, dataversion: UInt, size: ULong, flags: UInt, datahandle: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioReserveKsrPersistentMemoryEx((driverobject?.value ?: 0L), (physicaldeviceobject?.value ?: 0L), (physicaldeviceid?.value ?: 0L), (datatag?.value ?: 0L), dataversion.toInt(), size.toLong(), flags.toInt(), (datahandle?.value ?: 0L))

public actual fun ioReuseIrp(irp: COpaquePointer?, iostatus: Ntstatus) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioReuseIrp((irp?.value ?: 0L), iostatus)
}

public actual fun ioSetActivityIdIrp(irp: COpaquePointer?, guid: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioSetActivityIdIrp((irp?.value ?: 0L), (guid?.value ?: 0L))

public actual fun ioSetActivityIdThread(activityid: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioSetActivityIdThread((activityid?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ioSetCompletionRoutineEx(deviceobject: COpaquePointer?, irp: COpaquePointer?, completionroutine: PioCompletionRoutine, context: COpaquePointer?, invokeonsuccess: Boolean, invokeonerror: Boolean, invokeoncancel: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioSetCompletionRoutineEx((deviceobject?.value ?: 0L), (irp?.value ?: 0L), 0L, (context?.value ?: 0L), invokeonsuccess, invokeonerror, invokeoncancel)

public actual fun ioSetDeviceInterfacePropertyData(symboliclinkname: COpaquePointer?, propertykey: COpaquePointer?, lcid: UInt, flags: UInt, type: UInt, size: UInt, data: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioSetDeviceInterfacePropertyData((symboliclinkname?.value ?: 0L), (propertykey?.value ?: 0L), lcid.toInt(), flags.toInt(), type.toInt(), size.toInt(), (data?.value ?: 0L))

public actual fun ioSetDeviceInterfaceState(symboliclinkname: COpaquePointer?, enable: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioSetDeviceInterfaceState((symboliclinkname?.value ?: 0L), enable)

public actual fun ioSetDevicePropertyData(pdo: COpaquePointer?, propertykey: COpaquePointer?, lcid: UInt, flags: UInt, type: UInt, size: UInt, data: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioSetDevicePropertyData((pdo?.value ?: 0L), (propertykey?.value ?: 0L), lcid.toInt(), flags.toInt(), type.toInt(), size.toInt(), (data?.value ?: 0L))

public actual fun ioSetFileObjectIgnoreSharing(fileobject: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioSetFileObjectIgnoreSharing((fileobject?.value ?: 0L))

public actual fun ioSetFileOrigin(fileobject: COpaquePointer?, remote: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioSetFileOrigin((fileobject?.value ?: 0L), remote)

public actual fun ioSetFsZeroingOffset(irp: COpaquePointer?, zeroingoffset: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioSetFsZeroingOffset((irp?.value ?: 0L), zeroingoffset.toInt())

public actual fun ioSetFsZeroingOffsetRequired(irp: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioSetFsZeroingOffsetRequired((irp?.value ?: 0L))

public actual fun ioSetHardErrorOrVerifyDevice(irp: COpaquePointer?, deviceobject: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioSetHardErrorOrVerifyDevice((irp?.value ?: 0L), (deviceobject?.value ?: 0L))
}

public actual fun ioSetIoAttributionIrp(irp: COpaquePointer?, attributionsource: COpaquePointer?, flags: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioSetIoAttributionIrp((irp?.value ?: 0L), (attributionsource?.value ?: 0L), flags.toInt())

public actual fun ioSetIoPriorityHint(irp: COpaquePointer?, priorityhint: IoPriorityHint): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioSetIoPriorityHint((irp?.value ?: 0L), priorityhint)

public actual fun ioSetIrpExtraCreateParameter(irp: COpaquePointer?, extracreateparameter: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioSetIrpExtraCreateParameter((irp?.value ?: 0L), (extracreateparameter?.value ?: 0L))

public actual fun ioSetLinkShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: COpaquePointer?, shareaccess: COpaquePointer?, linkshareaccess: COpaquePointer?, ioshareaccessflags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioSetLinkShareAccess(desiredaccess.toInt(), desiredshareaccess.toInt(), (fileobject?.value ?: 0L), (shareaccess?.value ?: 0L), (linkshareaccess?.value ?: 0L), ioshareaccessflags.toInt())
}

public actual fun ioSetMasterIrpStatus(masterirp: COpaquePointer?, status: Ntstatus) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioSetMasterIrpStatus((masterirp?.value ?: 0L), status)
}

public actual fun ioSetPartitionInformation(deviceobject: COpaquePointer?, sectorsize: UInt, partitionnumber: UInt, partitiontype: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioSetPartitionInformation((deviceobject?.value ?: 0L), sectorsize.toInt(), partitionnumber.toInt(), partitiontype.toInt())

public actual fun ioSetPartitionInformationEx(deviceobject: COpaquePointer?, partitionnumber: UInt, partitioninfo: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioSetPartitionInformationEx((deviceobject?.value ?: 0L), partitionnumber.toInt(), (partitioninfo?.value ?: 0L))

public actual fun ioSetShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: COpaquePointer?, shareaccess: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioSetShareAccess(desiredaccess.toInt(), desiredshareaccess.toInt(), (fileobject?.value ?: 0L), (shareaccess?.value ?: 0L))
}

public actual fun ioSetShareAccessEx(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: COpaquePointer?, shareaccess: COpaquePointer?, writepermission: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioSetShareAccessEx(desiredaccess.toInt(), desiredshareaccess.toInt(), (fileobject?.value ?: 0L), (shareaccess?.value ?: 0L), (writepermission?.value ?: 0L))
}

public actual fun ioSetStartIoAttributes(deviceobject: COpaquePointer?, deferredstartio: Boolean, noncancelable: Boolean) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioSetStartIoAttributes((deviceobject?.value ?: 0L), deferredstartio, noncancelable)
}

public actual fun ioSetSystemPartition(volumenamestring: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioSetSystemPartition((volumenamestring?.value ?: 0L))

public actual fun ioSetThreadHardErrorMode(enableharderrors: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioSetThreadHardErrorMode(enableharderrors)

public actual fun ioSetTopLevelIrp(irp: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioSetTopLevelIrp((irp?.value ?: 0L))
}

public actual fun ioSizeOfIrpEx(deviceobject: COpaquePointer?, stacksize: Byte): UShort =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioSizeOfIrpEx((deviceobject?.value ?: 0L), stacksize).toUShort()

public actual fun ioSizeofWorkItem(): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioSizeofWorkItem().toUInt()

public actual fun ioStartNextPacket(deviceobject: COpaquePointer?, cancelable: Boolean) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioStartNextPacket((deviceobject?.value ?: 0L), cancelable)
}

public actual fun ioStartNextPacketByKey(deviceobject: COpaquePointer?, cancelable: Boolean, key: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioStartNextPacketByKey((deviceobject?.value ?: 0L), cancelable, key.toInt())
}

public actual fun ioStartPacket(deviceobject: COpaquePointer?, irp: COpaquePointer?, key: COpaquePointer?, cancelfunction: DriverCancel) {
}

public actual fun ioStartTimer(deviceobject: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioStartTimer((deviceobject?.value ?: 0L))
}

public actual fun ioStopTimer(deviceobject: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioStopTimer((deviceobject?.value ?: 0L))
}

public actual fun ioSynchronousCallDriver(deviceobject: COpaquePointer?, irp: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioSynchronousCallDriver((deviceobject?.value ?: 0L), (irp?.value ?: 0L))

public actual fun ioTransferActivityId(activityid: COpaquePointer?, relatedactivityid: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioTransferActivityId((activityid?.value ?: 0L), (relatedactivityid?.value ?: 0L))
}

public actual fun ioTranslateBusAddress(interfacetype: InterfaceType, busnumber: UInt, busaddress: Long, addressspace: COpaquePointer?, translatedaddress: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioTranslateBusAddress(interfacetype, busnumber.toInt(), busaddress, (addressspace?.value ?: 0L), (translatedaddress?.value ?: 0L))

public actual fun ioTryQueueWorkItem(ioworkitem: PioWorkitem, workerroutine: PioWorkitemRoutineEx, queuetype: WorkQueueType, context: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioTryQueueWorkItem(ioworkitem, 0L, queuetype, (context?.value ?: 0L))

public actual fun ioUninitializeWorkItem(ioworkitem: PioWorkitem) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioUninitializeWorkItem(ioworkitem)
}

public actual fun ioUnregisterBootDriverCallback(callbackhandle: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioUnregisterBootDriverCallback((callbackhandle?.value ?: 0L))
}

public actual fun ioUnregisterContainerNotification(callbackregistration: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioUnregisterContainerNotification((callbackregistration?.value ?: 0L))
}

public actual fun ioUnregisterPlugPlayNotification(notificationentry: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioUnregisterPlugPlayNotification((notificationentry?.value ?: 0L))

public actual fun ioUnregisterPlugPlayNotificationEx(notificationentry: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioUnregisterPlugPlayNotificationEx((notificationentry?.value ?: 0L))

public actual fun ioUnregisterShutdownNotification(deviceobject: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioUnregisterShutdownNotification((deviceobject?.value ?: 0L))
}

public actual fun ioUpdateLinkShareAccess(fileobject: COpaquePointer?, shareaccess: COpaquePointer?, linkshareaccess: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioUpdateLinkShareAccess((fileobject?.value ?: 0L), (shareaccess?.value ?: 0L), (linkshareaccess?.value ?: 0L))
}

public actual fun ioUpdateLinkShareAccessEx(fileobject: COpaquePointer?, shareaccess: COpaquePointer?, linkshareaccess: COpaquePointer?, ioshareaccessflags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioUpdateLinkShareAccessEx((fileobject?.value ?: 0L), (shareaccess?.value ?: 0L), (linkshareaccess?.value ?: 0L), ioshareaccessflags.toInt())
}

public actual fun ioUpdateShareAccess(fileobject: COpaquePointer?, shareaccess: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioUpdateShareAccess((fileobject?.value ?: 0L), (shareaccess?.value ?: 0L))
}

public actual fun ioValidateDeviceIoControlAccess(irp: COpaquePointer?, requiredaccess: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioValidateDeviceIoControlAccess((irp?.value ?: 0L), requiredaccess.toInt())

public actual fun ioVerifyPartitionTable(deviceobject: COpaquePointer?, fixerrors: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioVerifyPartitionTable((deviceobject?.value ?: 0L), fixerrors)

public actual fun ioVolumeDeviceNameToGuid(volumedevicename: COpaquePointer?, guid: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioVolumeDeviceNameToGuid((volumedevicename?.value ?: 0L), (guid?.value ?: 0L))

public actual fun ioVolumeDeviceNameToGuidPath(volumedevicename: COpaquePointer?, guidpath: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioVolumeDeviceNameToGuidPath((volumedevicename?.value ?: 0L), (guidpath?.value ?: 0L))

public actual fun ioVolumeDeviceToDosName(volumedeviceobject: COpaquePointer?, dosname: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioVolumeDeviceToDosName((volumedeviceobject?.value ?: 0L), (dosname?.value ?: 0L))

public actual fun ioVolumeDeviceToGuid(volumedeviceobject: COpaquePointer?, guid: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioVolumeDeviceToGuid((volumedeviceobject?.value ?: 0L), (guid?.value ?: 0L))

public actual fun ioVolumeDeviceToGuidPath(volumedeviceobject: COpaquePointer?, guidpath: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioVolumeDeviceToGuidPath((volumedeviceobject?.value ?: 0L), (guidpath?.value ?: 0L))

public actual fun ioWMIAllocateInstanceIds(guid: COpaquePointer?, instancecount: UInt, firstinstanceid: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioWMIAllocateInstanceIds((guid?.value ?: 0L), instancecount.toInt(), (firstinstanceid?.value ?: 0L))

public actual fun ioWMIDeviceObjectToInstanceName(datablockobject: COpaquePointer?, deviceobject: COpaquePointer?, instancename: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioWMIDeviceObjectToInstanceName((datablockobject?.value ?: 0L), (deviceobject?.value ?: 0L), (instancename?.value ?: 0L))

public actual fun ioWMIExecuteMethod(datablockobject: COpaquePointer?, instancename: COpaquePointer?, methodid: UInt, inbuffersize: UInt, outbuffersize: COpaquePointer?, inoutbuffer: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioWMIExecuteMethod((datablockobject?.value ?: 0L), (instancename?.value ?: 0L), methodid.toInt(), inbuffersize.toInt(), (outbuffersize?.value ?: 0L), (inoutbuffer?.value ?: 0L))

public actual fun ioWMIHandleToInstanceName(datablockobject: COpaquePointer?, filehandle: Handle, instancename: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioWMIHandleToInstanceName((datablockobject?.value ?: 0L), (filehandle?.value ?: 0L), (instancename?.value ?: 0L))

public actual fun ioWMIOpenBlock(guid: COpaquePointer?, desiredaccess: UInt, datablockobject: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioWMIOpenBlock((guid?.value ?: 0L), desiredaccess.toInt(), (datablockobject?.value ?: 0L))

public actual fun ioWMIQueryAllData(datablockobject: COpaquePointer?, inoutbuffersize: COpaquePointer?, outbuffer: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioWMIQueryAllData((datablockobject?.value ?: 0L), (inoutbuffersize?.value ?: 0L), (outbuffer?.value ?: 0L))

public actual fun ioWMIQueryAllDataMultiple(datablockobjectlist: COpaquePointer?, objectcount: UInt, inoutbuffersize: COpaquePointer?, outbuffer: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioWMIQueryAllDataMultiple((datablockobjectlist?.value ?: 0L), objectcount.toInt(), (inoutbuffersize?.value ?: 0L), (outbuffer?.value ?: 0L))

public actual fun ioWMIQuerySingleInstance(datablockobject: COpaquePointer?, instancename: COpaquePointer?, inoutbuffersize: COpaquePointer?, outbuffer: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioWMIQuerySingleInstance((datablockobject?.value ?: 0L), (instancename?.value ?: 0L), (inoutbuffersize?.value ?: 0L), (outbuffer?.value ?: 0L))

public actual fun ioWMIQuerySingleInstanceMultiple(datablockobjectlist: COpaquePointer?, instancenames: COpaquePointer?, objectcount: UInt, inoutbuffersize: COpaquePointer?, outbuffer: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioWMIQuerySingleInstanceMultiple((datablockobjectlist?.value ?: 0L), (instancenames?.value ?: 0L), objectcount.toInt(), (inoutbuffersize?.value ?: 0L), (outbuffer?.value ?: 0L))

public actual fun ioWMIRegistrationControl(deviceobject: COpaquePointer?, action: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioWMIRegistrationControl((deviceobject?.value ?: 0L), action.toInt())

public actual fun ioWMISetNotificationCallback(obj: COpaquePointer?, callback: WmiNotificationCallback, context: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioWMISetNotificationCallback((obj?.value ?: 0L), 0L, (context?.value ?: 0L))

public actual fun ioWMISetSingleInstance(datablockobject: COpaquePointer?, instancename: COpaquePointer?, version: UInt, valuebuffersize: UInt, valuebuffer: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioWMISetSingleInstance((datablockobject?.value ?: 0L), (instancename?.value ?: 0L), version.toInt(), valuebuffersize.toInt(), (valuebuffer?.value ?: 0L))

public actual fun ioWMISetSingleItem(datablockobject: COpaquePointer?, instancename: COpaquePointer?, dataitemid: UInt, version: UInt, valuebuffersize: UInt, valuebuffer: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioWMISetSingleItem((datablockobject?.value ?: 0L), (instancename?.value ?: 0L), dataitemid.toInt(), version.toInt(), valuebuffersize.toInt(), (valuebuffer?.value ?: 0L))

public actual fun ioWMISuggestInstanceName(physicaldeviceobject: COpaquePointer?, symboliclinkname: COpaquePointer?, combinenames: Boolean, suggestedinstancename: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioWMISuggestInstanceName((physicaldeviceobject?.value ?: 0L), (symboliclinkname?.value ?: 0L), combinenames, (suggestedinstancename?.value ?: 0L))

public actual fun ioWMIWriteEvent(wnodeeventitem: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioWMIWriteEvent((wnodeeventitem?.value ?: 0L))

public actual fun ioWithinStackLimits(regionstart: ULong, regionsize: ULong): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioWithinStackLimits(regionstart.toLong(), regionsize.toLong()).toUInt()

public actual fun ioWriteErrorLogEntry(elentry: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioWriteErrorLogEntry((elentry?.value ?: 0L))
}

public actual fun ioWriteKsrPersistentMemory(datahandle: COpaquePointer?, buffer: COpaquePointer?, size: ULong): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioWriteKsrPersistentMemory((datahandle?.value ?: 0L), (buffer?.value ?: 0L), size.toLong())

public actual fun ioWritePartitionTable(deviceobject: COpaquePointer?, sectorsize: UInt, sectorspertrack: UInt, numberofheads: UInt, partitionbuffer: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioWritePartitionTable((deviceobject?.value ?: 0L), sectorsize.toInt(), sectorspertrack.toInt(), numberofheads.toInt(), (partitionbuffer?.value ?: 0L))

public actual fun ioWritePartitionTableEx(deviceobject: COpaquePointer?, drivelayout: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ioWritePartitionTableEx((deviceobject?.value ?: 0L), (drivelayout?.value ?: 0L))

public actual fun iofCallDriver(deviceobject: COpaquePointer?, irp: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_iofCallDriver((deviceobject?.value ?: 0L), (irp?.value ?: 0L))

public actual fun iofCompleteRequest(irp: COpaquePointer?, priorityboost: Byte) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_iofCompleteRequest((irp?.value ?: 0L), priorityboost)
}

public actual fun kdChangeOption(option: KdOption, inbufferbytes: UInt, inbuffer: COpaquePointer?, outbufferbytes: UInt, outbuffer: COpaquePointer?, outbufferneeded: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_kdChangeOption(option, inbufferbytes.toInt(), (inbuffer?.value ?: 0L), outbufferbytes.toInt(), (outbuffer?.value ?: 0L), (outbufferneeded?.value ?: 0L))

public actual fun kdDisableDebugger(): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_kdDisableDebugger()

public actual fun kdEnableDebugger(): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_kdEnableDebugger()

public actual fun kdRefreshDebuggerNotPresent(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_kdRefreshDebuggerNotPresent()

public actual fun keAcquireGuardedMutex(mutex: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keAcquireGuardedMutex((mutex?.value ?: 0L))
}

public actual fun keAcquireGuardedMutexUnsafe(fastmutex: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keAcquireGuardedMutexUnsafe((fastmutex?.value ?: 0L))
}

public actual fun keAcquireInStackQueuedSpinLock(spinlock: COpaquePointer?, lockhandle: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keAcquireInStackQueuedSpinLock((spinlock?.value ?: 0L), (lockhandle?.value ?: 0L))
}

public actual fun keAcquireInStackQueuedSpinLockAtDpcLevel(spinlock: COpaquePointer?, lockhandle: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keAcquireInStackQueuedSpinLockAtDpcLevel((spinlock?.value ?: 0L), (lockhandle?.value ?: 0L))
}

public actual fun keAcquireInStackQueuedSpinLockForDpc(spinlock: COpaquePointer?, lockhandle: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keAcquireInStackQueuedSpinLockForDpc((spinlock?.value ?: 0L), (lockhandle?.value ?: 0L))
}

public actual fun keAcquireInterruptSpinLock(interrupt: Pkinterrupt): UByte =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keAcquireInterruptSpinLock(interrupt).toUByte()

public actual fun keAcquireSpinLockForDpc(spinlock: COpaquePointer?): UByte =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keAcquireSpinLockForDpc((spinlock?.value ?: 0L)).toUByte()

public actual fun keAddTriageDumpDataBlock(ktriagedumpdataarray: COpaquePointer?, address: COpaquePointer?, size: ULong): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keAddTriageDumpDataBlock((ktriagedumpdataarray?.value ?: 0L), (address?.value ?: 0L), size.toLong())

public actual fun keAreAllApcsDisabled(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keAreAllApcsDisabled()

public actual fun keAreApcsDisabled(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keAreApcsDisabled()

public actual fun keBugCheck(bugcheckcode: BugcheckError) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keBugCheck(bugcheckcode.toInt())
}

public actual fun keBugCheckEx(bugcheckcode: BugcheckError, bugcheckparameter1: ULong, bugcheckparameter2: ULong, bugcheckparameter3: ULong, bugcheckparameter4: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keBugCheckEx(bugcheckcode.toInt(), bugcheckparameter1.toLong(), bugcheckparameter2.toLong(), bugcheckparameter3.toLong(), bugcheckparameter4.toLong())
}

public actual fun keCancelTimer(param0: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keCancelTimer((param0?.value ?: 0L))

public actual fun keClearEvent(event: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keClearEvent((event?.value ?: 0L))
}

public actual fun keConvertAuxiliaryCounterToPerformanceCounter(auxiliarycountervalue: ULong, performancecountervalue: COpaquePointer?, conversionerror: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keConvertAuxiliaryCounterToPerformanceCounter(auxiliarycountervalue.toLong(), (performancecountervalue?.value ?: 0L), (conversionerror?.value ?: 0L))

public actual fun keConvertPerformanceCounterToAuxiliaryCounter(performancecountervalue: ULong, auxiliarycountervalue: COpaquePointer?, conversionerror: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keConvertPerformanceCounterToAuxiliaryCounter(performancecountervalue.toLong(), (auxiliarycountervalue?.value ?: 0L), (conversionerror?.value ?: 0L))

public actual fun keDelayExecutionThread(waitmode: Byte, alertable: Boolean, interval: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keDelayExecutionThread(waitmode, alertable, (interval?.value ?: 0L))

public actual fun keDeregisterBoundCallback(handle: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keDeregisterBoundCallback((handle?.value ?: 0L))

public actual fun keDeregisterBugCheckCallback(callbackrecord: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keDeregisterBugCheckCallback((callbackrecord?.value ?: 0L))

public actual fun keDeregisterBugCheckReasonCallback(callbackrecord: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keDeregisterBugCheckReasonCallback((callbackrecord?.value ?: 0L))

public actual fun keDeregisterNmiCallback(handle: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keDeregisterNmiCallback((handle?.value ?: 0L))

public actual fun keDeregisterProcessorChangeCallback(callbackhandle: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keDeregisterProcessorChangeCallback((callbackhandle?.value ?: 0L))
}

public actual fun keEnterCriticalRegion() {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keEnterCriticalRegion()
}

public actual fun keEnterGuardedRegion() {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keEnterGuardedRegion()
}

public actual fun keExpandKernelStackAndCallout(callout: PexpandStackCallout, parameter: COpaquePointer?, size: ULong): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keExpandKernelStackAndCallout(0L, (parameter?.value ?: 0L), size.toLong())

public actual fun keExpandKernelStackAndCalloutEx(callout: PexpandStackCallout, parameter: COpaquePointer?, size: ULong, wait: Boolean, context: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keExpandKernelStackAndCalloutEx(0L, (parameter?.value ?: 0L), size.toLong(), wait, (context?.value ?: 0L))

public actual fun keFlushIoBuffers(mdl: COpaquePointer?, readoperation: Boolean, dmaoperation: Boolean) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keFlushIoBuffers((mdl?.value ?: 0L), readoperation, dmaoperation)
}

public actual fun keFlushQueuedDpcs() {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keFlushQueuedDpcs()
}

public actual fun keFlushWriteBuffer() {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keFlushWriteBuffer()
}

public actual fun keGetCurrentIrql(): UByte =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keGetCurrentIrql().toUByte()

public actual fun keGetCurrentNodeNumber(): UShort =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keGetCurrentNodeNumber().toUShort()

public actual fun keGetCurrentProcessorNumberEx(procnumber: COpaquePointer?): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keGetCurrentProcessorNumberEx((procnumber?.value ?: 0L)).toUInt()

public actual fun keGetProcessorIndexFromNumber(procnumber: COpaquePointer?): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keGetProcessorIndexFromNumber((procnumber?.value ?: 0L)).toUInt()

public actual fun keGetProcessorNumberFromIndex(procindex: UInt, procnumber: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keGetProcessorNumberFromIndex(procindex.toInt(), (procnumber?.value ?: 0L))

public actual fun keGetRecommendedSharedDataAlignment(): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keGetRecommendedSharedDataAlignment().toUInt()

public actual fun keInitializeCrashDumpHeader(dumptype: UInt, flags: UInt, buffer: COpaquePointer?, buffersize: UInt, bufferneeded: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keInitializeCrashDumpHeader(dumptype.toInt(), flags.toInt(), (buffer?.value ?: 0L), buffersize.toInt(), (bufferneeded?.value ?: 0L))

public actual fun keInitializeDeviceQueue(devicequeue: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keInitializeDeviceQueue((devicequeue?.value ?: 0L))
}

public actual fun keInitializeDpc(dpc: COpaquePointer?, deferredroutine: PkdeferredRoutine, deferredcontext: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keInitializeDpc((dpc?.value ?: 0L), 0L, (deferredcontext?.value ?: 0L))
}

public actual fun keInitializeEvent(event: COpaquePointer?, type: EventType, state: Boolean) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keInitializeEvent((event?.value ?: 0L), type, state)
}

public actual fun keInitializeGuardedMutex(mutex: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keInitializeGuardedMutex((mutex?.value ?: 0L))
}

public actual fun keInitializeMutex(mutex: COpaquePointer?, level: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keInitializeMutex((mutex?.value ?: 0L), level.toInt())
}

public actual fun keInitializeSemaphore(semaphore: COpaquePointer?, count: Int, limit: Int) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keInitializeSemaphore((semaphore?.value ?: 0L), count, limit)
}

public actual fun keInitializeSpinLock(spinlock: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keInitializeSpinLock((spinlock?.value ?: 0L))
}

public actual fun keInitializeThreadedDpc(dpc: COpaquePointer?, deferredroutine: PkdeferredRoutine, deferredcontext: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keInitializeThreadedDpc((dpc?.value ?: 0L), 0L, (deferredcontext?.value ?: 0L))
}

public actual fun keInitializeTimer(timer: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keInitializeTimer((timer?.value ?: 0L))
}

public actual fun keInitializeTimerEx(timer: COpaquePointer?, type: TimerType) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keInitializeTimerEx((timer?.value ?: 0L), type)
}

public actual fun keInitializeTriageDumpDataArray(ktriagedumpdataarray: COpaquePointer?, size: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keInitializeTriageDumpDataArray((ktriagedumpdataarray?.value ?: 0L), size.toInt())

public actual fun keInsertByKeyDeviceQueue(devicequeue: COpaquePointer?, devicequeueentry: COpaquePointer?, sortkey: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keInsertByKeyDeviceQueue((devicequeue?.value ?: 0L), (devicequeueentry?.value ?: 0L), sortkey.toInt())

public actual fun keInsertDeviceQueue(devicequeue: COpaquePointer?, devicequeueentry: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keInsertDeviceQueue((devicequeue?.value ?: 0L), (devicequeueentry?.value ?: 0L))

public actual fun keInsertQueueDpc(dpc: COpaquePointer?, systemargument1: COpaquePointer?, systemargument2: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keInsertQueueDpc((dpc?.value ?: 0L), (systemargument1?.value ?: 0L), (systemargument2?.value ?: 0L))

public actual fun keInvalidateAllCaches(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keInvalidateAllCaches()

public actual fun keInvalidateRangeAllCaches(baseaddress: COpaquePointer?, length: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keInvalidateRangeAllCaches((baseaddress?.value ?: 0L), length.toInt())
}

public actual fun keIpiGenericCall(broadcastfunction: PkipiBroadcastWorker, context: ULong): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keIpiGenericCall(0L, context.toLong()).toULong()

public actual fun keIsExecutingDpc(): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keIsExecutingDpc().toUInt()

public actual fun keLeaveCriticalRegion() {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keLeaveCriticalRegion()
}

public actual fun keLeaveGuardedRegion() {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keLeaveGuardedRegion()
}

public actual fun kePulseEvent(event: COpaquePointer?, increment: Int, wait: Boolean): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_kePulseEvent((event?.value ?: 0L), increment, wait)

public actual fun keQueryActiveGroupCount(): UShort =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keQueryActiveGroupCount().toUShort()

public actual fun keQueryActiveProcessorCount(activeprocessors: COpaquePointer?): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keQueryActiveProcessorCount((activeprocessors?.value ?: 0L)).toUInt()

public actual fun keQueryActiveProcessorCountEx(groupnumber: UShort): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keQueryActiveProcessorCountEx(groupnumber.toShort()).toUInt()

public actual fun keQueryActiveProcessors(): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keQueryActiveProcessors().toULong()

public actual fun keQueryAuxiliaryCounterFrequency(auxiliarycounterfrequency: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keQueryAuxiliaryCounterFrequency((auxiliarycounterfrequency?.value ?: 0L))

public actual fun keQueryDpcWatchdogInformation(watchdoginformation: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keQueryDpcWatchdogInformation((watchdoginformation?.value ?: 0L))

public actual fun keQueryGroupAffinity(groupnumber: UShort): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keQueryGroupAffinity(groupnumber.toShort()).toULong()

public actual fun keQueryHardwareCounterConfiguration(counterarray: COpaquePointer?, maximumcount: UInt, count: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keQueryHardwareCounterConfiguration((counterarray?.value ?: 0L), maximumcount.toInt(), (count?.value ?: 0L))

public actual fun keQueryHighestNodeNumber(): UShort =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keQueryHighestNodeNumber().toUShort()

public actual fun keQueryInterruptTimePrecise(qpctimestamp: COpaquePointer?): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keQueryInterruptTimePrecise((qpctimestamp?.value ?: 0L)).toULong()

public actual fun keQueryLogicalProcessorRelationship(processornumber: COpaquePointer?, relationshiptype: LogicalProcessorRelationship, information: COpaquePointer?, length: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keQueryLogicalProcessorRelationship((processornumber?.value ?: 0L), relationshiptype, (information?.value ?: 0L), (length?.value ?: 0L))

public actual fun keQueryMaximumGroupCount(): UShort =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keQueryMaximumGroupCount().toUShort()

public actual fun keQueryMaximumProcessorCount(): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keQueryMaximumProcessorCount().toUInt()

public actual fun keQueryMaximumProcessorCountEx(groupnumber: UShort): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keQueryMaximumProcessorCountEx(groupnumber.toShort()).toUInt()

public actual fun keQueryNodeActiveAffinity(nodenumber: UShort, affinity: COpaquePointer?, count: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keQueryNodeActiveAffinity(nodenumber.toShort(), (affinity?.value ?: 0L), (count?.value ?: 0L))
}

public actual fun keQueryNodeActiveAffinity2(nodenumber: UShort, groupaffinities: COpaquePointer?, groupaffinitiescount: UShort, groupaffinitiesrequired: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keQueryNodeActiveAffinity2(nodenumber.toShort(), (groupaffinities?.value ?: 0L), groupaffinitiescount.toShort(), (groupaffinitiesrequired?.value ?: 0L))

public actual fun keQueryNodeActiveProcessorCount(nodenumber: UShort): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keQueryNodeActiveProcessorCount(nodenumber.toShort()).toUInt()

public actual fun keQueryNodeMaximumProcessorCount(nodenumber: UShort): UShort =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keQueryNodeMaximumProcessorCount(nodenumber.toShort()).toUShort()

public actual fun keQueryPerformanceCounter(performancefrequency: COpaquePointer?): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keQueryPerformanceCounter((performancefrequency?.value ?: 0L))

public actual fun keQueryPriorityThread(thread: Pkthread): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keQueryPriorityThread(thread)

public actual fun keQueryRuntimeThread(thread: Pkthread, usertime: COpaquePointer?): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keQueryRuntimeThread(thread, (usertime?.value ?: 0L)).toUInt()

public actual fun keQuerySystemTimePrecise(currenttime: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keQuerySystemTimePrecise((currenttime?.value ?: 0L))
}

public actual fun keQueryTimeIncrement(): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keQueryTimeIncrement().toUInt()

public actual fun keQueryTotalCycleTimeThread(thread: Pkthread, cycletimestamp: COpaquePointer?): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keQueryTotalCycleTimeThread(thread, (cycletimestamp?.value ?: 0L)).toULong()

public actual fun keQueryUnbiasedInterruptTime(): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keQueryUnbiasedInterruptTime().toULong()

public actual fun keQueryUnbiasedInterruptTimePrecise(qpctimestamp: COpaquePointer?): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keQueryUnbiasedInterruptTimePrecise((qpctimestamp?.value ?: 0L)).toULong()

public actual fun keReadStateEvent(event: COpaquePointer?): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keReadStateEvent((event?.value ?: 0L))

public actual fun keReadStateMutex(mutex: COpaquePointer?): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keReadStateMutex((mutex?.value ?: 0L))

public actual fun keReadStateSemaphore(semaphore: COpaquePointer?): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keReadStateSemaphore((semaphore?.value ?: 0L))

public actual fun keReadStateTimer(timer: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keReadStateTimer((timer?.value ?: 0L))

public actual fun keRegisterBoundCallback(callbackroutine: PboundCallback): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keRegisterBoundCallback(0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun keRegisterBugCheckCallback(callbackrecord: COpaquePointer?, callbackroutine: PkbugcheckCallbackRoutine, buffer: COpaquePointer?, length: UInt, component: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keRegisterBugCheckCallback((callbackrecord?.value ?: 0L), 0L, (buffer?.value ?: 0L), length.toInt(), (component?.value ?: 0L))

public actual fun keRegisterBugCheckReasonCallback(callbackrecord: COpaquePointer?, callbackroutine: PkbugcheckReasonCallbackRoutine, reason: KbugcheckCallbackReason, component: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keRegisterBugCheckReasonCallback((callbackrecord?.value ?: 0L), 0L, reason, (component?.value ?: 0L))

public actual fun keRegisterNmiCallback(callbackroutine: PnmiCallback, context: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keRegisterNmiCallback(0L, (context?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun keRegisterProcessorChangeCallback(callbackfunction: PprocessorCallbackFunction, callbackcontext: COpaquePointer?, flags: UInt): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keRegisterProcessorChangeCallback(0L, (callbackcontext?.value ?: 0L), flags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun keReleaseGuardedMutex(mutex: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keReleaseGuardedMutex((mutex?.value ?: 0L))
}

public actual fun keReleaseGuardedMutexUnsafe(fastmutex: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keReleaseGuardedMutexUnsafe((fastmutex?.value ?: 0L))
}

public actual fun keReleaseInStackQueuedSpinLock(lockhandle: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keReleaseInStackQueuedSpinLock((lockhandle?.value ?: 0L))
}

public actual fun keReleaseInStackQueuedSpinLockForDpc(lockhandle: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keReleaseInStackQueuedSpinLockForDpc((lockhandle?.value ?: 0L))
}

public actual fun keReleaseInStackQueuedSpinLockFromDpcLevel(lockhandle: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keReleaseInStackQueuedSpinLockFromDpcLevel((lockhandle?.value ?: 0L))
}

public actual fun keReleaseInterruptSpinLock(interrupt: Pkinterrupt, oldirql: UByte) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keReleaseInterruptSpinLock(interrupt, oldirql.toByte())
}

public actual fun keReleaseMutex(mutex: COpaquePointer?, wait: Boolean): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keReleaseMutex((mutex?.value ?: 0L), wait)

public actual fun keReleaseSemaphore(semaphore: COpaquePointer?, increment: Int, adjustment: Int, wait: Boolean): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keReleaseSemaphore((semaphore?.value ?: 0L), increment, adjustment, wait)

public actual fun keReleaseSpinLockForDpc(spinlock: COpaquePointer?, oldirql: UByte) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keReleaseSpinLockForDpc((spinlock?.value ?: 0L), oldirql.toByte())
}

public actual fun keRemoveByKeyDeviceQueue(devicequeue: COpaquePointer?, sortkey: UInt): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keRemoveByKeyDeviceQueue((devicequeue?.value ?: 0L), sortkey.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun keRemoveByKeyDeviceQueueIfBusy(devicequeue: COpaquePointer?, sortkey: UInt): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keRemoveByKeyDeviceQueueIfBusy((devicequeue?.value ?: 0L), sortkey.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun keRemoveDeviceQueue(devicequeue: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keRemoveDeviceQueue((devicequeue?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun keRemoveEntryDeviceQueue(devicequeue: COpaquePointer?, devicequeueentry: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keRemoveEntryDeviceQueue((devicequeue?.value ?: 0L), (devicequeueentry?.value ?: 0L))

public actual fun keRemoveQueueDpc(dpc: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keRemoveQueueDpc((dpc?.value ?: 0L))

public actual fun keRemoveQueueDpcEx(dpc: COpaquePointer?, waitifactive: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keRemoveQueueDpcEx((dpc?.value ?: 0L), waitifactive)

public actual fun keResetEvent(event: COpaquePointer?): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keResetEvent((event?.value ?: 0L))

public actual fun keRestoreExtendedProcessorState(xstatesave: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keRestoreExtendedProcessorState((xstatesave?.value ?: 0L))
}

public actual fun keRevertToUserAffinityThread() {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keRevertToUserAffinityThread()
}

public actual fun keRevertToUserAffinityThreadEx(affinity: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keRevertToUserAffinityThreadEx(affinity.toLong())
}

public actual fun keRevertToUserGroupAffinityThread(previousaffinity: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keRevertToUserGroupAffinityThread((previousaffinity?.value ?: 0L))
}

public actual fun keSaveExtendedProcessorState(mask: ULong, xstatesave: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keSaveExtendedProcessorState(mask.toLong(), (xstatesave?.value ?: 0L))

public actual fun keSetBasePriorityThread(thread: Pkthread, increment: Int): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keSetBasePriorityThread(thread, increment)

public actual fun keSetCoalescableTimer(timer: COpaquePointer?, duetime: Long, period: UInt, tolerabledelay: UInt, dpc: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keSetCoalescableTimer((timer?.value ?: 0L), duetime, period.toInt(), tolerabledelay.toInt(), (dpc?.value ?: 0L))

public actual fun keSetEvent(event: COpaquePointer?, increment: Int, wait: Boolean): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keSetEvent((event?.value ?: 0L), increment, wait)

public actual fun keSetHardwareCounterConfiguration(counterarray: COpaquePointer?, count: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keSetHardwareCounterConfiguration((counterarray?.value ?: 0L), count.toInt())

public actual fun keSetImportanceDpc(dpc: COpaquePointer?, importance: KdpcImportance) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keSetImportanceDpc((dpc?.value ?: 0L), importance)
}

public actual fun keSetPriorityThread(thread: Pkthread, priority: Int): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keSetPriorityThread(thread, priority)

public actual fun keSetSystemAffinityThread(affinity: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keSetSystemAffinityThread(affinity.toLong())
}

public actual fun keSetSystemAffinityThreadEx(affinity: ULong): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keSetSystemAffinityThreadEx(affinity.toLong()).toULong()

public actual fun keSetSystemGroupAffinityThread(affinity: COpaquePointer?, previousaffinity: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keSetSystemGroupAffinityThread((affinity?.value ?: 0L), (previousaffinity?.value ?: 0L))
}

public actual fun keSetTargetProcessorDpc(dpc: COpaquePointer?, number: Byte) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keSetTargetProcessorDpc((dpc?.value ?: 0L), number)
}

public actual fun keSetTargetProcessorDpcEx(dpc: COpaquePointer?, procnumber: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keSetTargetProcessorDpcEx((dpc?.value ?: 0L), (procnumber?.value ?: 0L))

public actual fun keSetTimer(timer: COpaquePointer?, duetime: Long, dpc: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keSetTimer((timer?.value ?: 0L), duetime, (dpc?.value ?: 0L))

public actual fun keSetTimerEx(timer: COpaquePointer?, duetime: Long, period: Int, dpc: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keSetTimerEx((timer?.value ?: 0L), duetime, period, (dpc?.value ?: 0L))

public actual fun keShouldYieldProcessor(): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keShouldYieldProcessor().toUInt()

public actual fun keStallExecutionProcessor(microseconds: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keStallExecutionProcessor(microseconds.toInt())
}

public actual fun keSynchronizeExecution(interrupt: Pkinterrupt, synchronizeroutine: PksynchronizeRoutine, synchronizecontext: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keSynchronizeExecution(interrupt, 0L, (synchronizecontext?.value ?: 0L))

public actual fun keTestSpinLock(spinlock: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keTestSpinLock((spinlock?.value ?: 0L))

public actual fun keTryToAcquireGuardedMutex(mutex: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keTryToAcquireGuardedMutex((mutex?.value ?: 0L))

public actual fun keTryToAcquireSpinLockAtDpcLevel(spinlock: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keTryToAcquireSpinLockAtDpcLevel((spinlock?.value ?: 0L))

public actual fun keWaitForMultipleObjects(count: UInt, obj: COpaquePointer?, waittype: WaitType, waitreason: KwaitReason, waitmode: Byte, alertable: Boolean, timeout: COpaquePointer?, waitblockarray: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keWaitForMultipleObjects(count.toInt(), (obj?.value ?: 0L), waittype, waitreason, waitmode, alertable, (timeout?.value ?: 0L), (waitblockarray?.value ?: 0L))

public actual fun keWaitForSingleObject(obj: COpaquePointer?, waitreason: KwaitReason, waitmode: Byte, alertable: Boolean, timeout: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_keWaitForSingleObject((obj?.value ?: 0L), waitreason, waitmode, alertable, (timeout?.value ?: 0L))

public actual fun kfRaiseIrql(newirql: UByte): UByte =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_kfRaiseIrql(newirql.toByte()).toUByte()

public actual fun mmAddPhysicalMemory(startaddress: COpaquePointer?, numberofbytes: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmAddPhysicalMemory((startaddress?.value ?: 0L), (numberofbytes?.value ?: 0L))

public actual fun mmAddVerifierSpecialThunks(entryroutine: ULong, thunkbuffer: COpaquePointer?, thunkbuffersize: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmAddVerifierSpecialThunks(entryroutine.toLong(), (thunkbuffer?.value ?: 0L), thunkbuffersize.toInt())

public actual fun mmAddVerifierThunks(thunkbuffer: COpaquePointer?, thunkbuffersize: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmAddVerifierThunks((thunkbuffer?.value ?: 0L), thunkbuffersize.toInt())

public actual fun mmAdvanceMdl(mdl: COpaquePointer?, numberofbytes: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmAdvanceMdl((mdl?.value ?: 0L), numberofbytes.toInt())

public actual fun mmAllocateContiguousMemory(numberofbytes: ULong, highestacceptableaddress: Long): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmAllocateContiguousMemory(numberofbytes.toLong(), highestacceptableaddress).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mmAllocateContiguousMemoryEx(numberofbytes: COpaquePointer?, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, preferrednode: UInt, protect: UInt, partitionobject: COpaquePointer?, tag: UInt, flags: UInt, baseaddress: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmAllocateContiguousMemoryEx((numberofbytes?.value ?: 0L), lowestacceptableaddress, highestacceptableaddress, boundaryaddressmultiple, preferrednode.toInt(), protect.toInt(), (partitionobject?.value ?: 0L), tag.toInt(), flags.toInt(), (baseaddress?.value ?: 0L))

public actual fun mmAllocateContiguousMemorySpecifyCache(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, cachetype: MemoryCachingType): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmAllocateContiguousMemorySpecifyCache(numberofbytes.toLong(), lowestacceptableaddress, highestacceptableaddress, boundaryaddressmultiple, cachetype).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mmAllocateContiguousMemorySpecifyCacheNode(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, cachetype: MemoryCachingType, preferrednode: UInt): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmAllocateContiguousMemorySpecifyCacheNode(numberofbytes.toLong(), lowestacceptableaddress, highestacceptableaddress, boundaryaddressmultiple, cachetype, preferrednode.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mmAllocateContiguousNodeMemory(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, protect: UInt, preferrednode: UInt): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmAllocateContiguousNodeMemory(numberofbytes.toLong(), lowestacceptableaddress, highestacceptableaddress, boundaryaddressmultiple, protect.toInt(), preferrednode.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mmAllocateMappingAddress(numberofbytes: ULong, pooltag: UInt): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmAllocateMappingAddress(numberofbytes.toLong(), pooltag.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mmAllocateMappingAddressEx(numberofbytes: ULong, pooltag: UInt, flags: UInt): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmAllocateMappingAddressEx(numberofbytes.toLong(), pooltag.toInt(), flags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mmAllocateMdlForIoSpace(physicaladdresslist: COpaquePointer?, numberofentries: ULong, newmdl: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmAllocateMdlForIoSpace((physicaladdresslist?.value ?: 0L), numberofentries.toLong(), (newmdl?.value ?: 0L))

public actual fun mmAllocateNodePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MemoryCachingType, idealnode: UInt, flags: UInt): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmAllocateNodePagesForMdlEx(lowaddress, highaddress, skipbytes, totalbytes.toLong(), cachetype, idealnode.toInt(), flags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mmAllocateNonCachedMemory(numberofbytes: ULong): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmAllocateNonCachedMemory(numberofbytes.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mmAllocatePagesForMdl(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmAllocatePagesForMdl(lowaddress, highaddress, skipbytes, totalbytes.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mmAllocatePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MemoryCachingType, flags: UInt): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmAllocatePagesForMdlEx(lowaddress, highaddress, skipbytes, totalbytes.toLong(), cachetype, flags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mmAllocatePartitionNodePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MemoryCachingType, idealnode: UInt, flags: UInt, partitionobject: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmAllocatePartitionNodePagesForMdlEx(lowaddress, highaddress, skipbytes, totalbytes.toLong(), cachetype, idealnode.toInt(), flags.toInt(), (partitionobject?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mmAreMdlPagesCached(memorydescriptorlist: COpaquePointer?): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmAreMdlPagesCached((memorydescriptorlist?.value ?: 0L)).toUInt()

public actual fun mmBuildMdlForNonPagedPool(memorydescriptorlist: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmBuildMdlForNonPagedPool((memorydescriptorlist?.value ?: 0L))
}

public actual fun mmCopyMemory(targetaddress: COpaquePointer?, sourceaddress: MmCopyAddress, numberofbytes: ULong, flags: UInt, numberofbytestransferred: COpaquePointer?): Ntstatus =
    0

public actual fun mmCreateMdl(memorydescriptorlist: COpaquePointer?, base: COpaquePointer?, length: ULong): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmCreateMdl((memorydescriptorlist?.value ?: 0L), (base?.value ?: 0L), length.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mmCreateMirror(): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmCreateMirror()

public actual fun mmFreeContiguousMemory(baseaddress: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmFreeContiguousMemory((baseaddress?.value ?: 0L))
}

public actual fun mmFreeContiguousMemorySpecifyCache(baseaddress: COpaquePointer?, numberofbytes: ULong, cachetype: MemoryCachingType) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmFreeContiguousMemorySpecifyCache((baseaddress?.value ?: 0L), numberofbytes.toLong(), cachetype)
}

public actual fun mmFreeMappingAddress(baseaddress: COpaquePointer?, pooltag: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmFreeMappingAddress((baseaddress?.value ?: 0L), pooltag.toInt())
}

public actual fun mmFreeNonCachedMemory(baseaddress: COpaquePointer?, numberofbytes: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmFreeNonCachedMemory((baseaddress?.value ?: 0L), numberofbytes.toLong())
}

public actual fun mmFreePagesFromMdl(memorydescriptorlist: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmFreePagesFromMdl((memorydescriptorlist?.value ?: 0L))
}

public actual fun mmFreePagesFromMdlEx(memorydescriptorlist: COpaquePointer?, flags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmFreePagesFromMdlEx((memorydescriptorlist?.value ?: 0L), flags.toInt())
}

public actual fun mmGetCacheAttribute(physicaladdress: Long, cachetype: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmGetCacheAttribute(physicaladdress, (cachetype?.value ?: 0L))

public actual fun mmGetCacheAttributeEx(physicaladdress: Long, flags: UInt, cachetype: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmGetCacheAttributeEx(physicaladdress, flags.toInt(), (cachetype?.value ?: 0L))

public actual fun mmGetPhysicalAddress(baseaddress: COpaquePointer?): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmGetPhysicalAddress((baseaddress?.value ?: 0L))

public actual fun mmGetPhysicalMemoryRanges(): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmGetPhysicalMemoryRanges().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mmGetPhysicalMemoryRangesEx(partitionobject: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmGetPhysicalMemoryRangesEx((partitionobject?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mmGetPhysicalMemoryRangesEx2(partitionobject: COpaquePointer?, flags: UInt): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmGetPhysicalMemoryRangesEx2((partitionobject?.value ?: 0L), flags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mmGetSystemRoutineAddress(systemroutinename: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmGetSystemRoutineAddress((systemroutinename?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mmGetVirtualForPhysical(physicaladdress: Long): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmGetVirtualForPhysical(physicaladdress).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mmIsAddressValid(virtualaddress: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmIsAddressValid((virtualaddress?.value ?: 0L))

public actual fun mmIsDriverSuspectForVerifier(driverobject: COpaquePointer?): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmIsDriverSuspectForVerifier((driverobject?.value ?: 0L)).toUInt()

public actual fun mmIsDriverVerifying(driverobject: COpaquePointer?): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmIsDriverVerifying((driverobject?.value ?: 0L)).toUInt()

public actual fun mmIsDriverVerifyingByAddress(addresswithinsection: COpaquePointer?): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmIsDriverVerifyingByAddress((addresswithinsection?.value ?: 0L)).toUInt()

public actual fun mmIsIoSpaceActive(startaddress: Long, numberofbytes: ULong): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmIsIoSpaceActive(startaddress, numberofbytes.toLong()).toUInt()

public actual fun mmIsNonPagedSystemAddressValid(virtualaddress: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmIsNonPagedSystemAddressValid((virtualaddress?.value ?: 0L))

public actual fun mmIsThisAnNtAsSystem(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmIsThisAnNtAsSystem()

public actual fun mmIsVerifierEnabled(verifierflags: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmIsVerifierEnabled((verifierflags?.value ?: 0L))

public actual fun mmLockPagableDataSection(addresswithinsection: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmLockPagableDataSection((addresswithinsection?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mmLockPagableSectionByHandle(imagesectionhandle: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmLockPagableSectionByHandle((imagesectionhandle?.value ?: 0L))
}

public actual fun mmMapIoSpace(physicaladdress: Long, numberofbytes: ULong, cachetype: MemoryCachingType): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmMapIoSpace(physicaladdress, numberofbytes.toLong(), cachetype).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mmMapIoSpaceEx(physicaladdress: Long, numberofbytes: ULong, protect: UInt): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmMapIoSpaceEx(physicaladdress, numberofbytes.toLong(), protect.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mmMapLockedPages(memorydescriptorlist: COpaquePointer?, accessmode: Byte): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmMapLockedPages((memorydescriptorlist?.value ?: 0L), accessmode).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mmMapLockedPagesSpecifyCache(memorydescriptorlist: COpaquePointer?, accessmode: Byte, cachetype: MemoryCachingType, requestedaddress: COpaquePointer?, bugcheckonfailure: UInt, priority: UInt): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmMapLockedPagesSpecifyCache((memorydescriptorlist?.value ?: 0L), accessmode, cachetype, (requestedaddress?.value ?: 0L), bugcheckonfailure.toInt(), priority.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mmMapLockedPagesWithReservedMapping(mappingaddress: COpaquePointer?, pooltag: UInt, memorydescriptorlist: COpaquePointer?, cachetype: MemoryCachingType): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmMapLockedPagesWithReservedMapping((mappingaddress?.value ?: 0L), pooltag.toInt(), (memorydescriptorlist?.value ?: 0L), cachetype).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mmMapMdl(memorydescriptorlist: COpaquePointer?, protection: UInt, driverroutine: PmmMdlRoutine, drivercontext: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmMapMdl((memorydescriptorlist?.value ?: 0L), protection.toInt(), 0L, (drivercontext?.value ?: 0L))

public actual fun mmMapMemoryDumpMdlEx(va: COpaquePointer?, pagetotal: UInt, memorydumpmdl: COpaquePointer?, flags: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmMapMemoryDumpMdlEx((va?.value ?: 0L), pagetotal.toInt(), (memorydumpmdl?.value ?: 0L), flags.toInt())

public actual fun mmMapUserAddressesToPage(baseaddress: COpaquePointer?, numberofbytes: ULong, pageaddress: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmMapUserAddressesToPage((baseaddress?.value ?: 0L), numberofbytes.toLong(), (pageaddress?.value ?: 0L))

public actual fun mmMapVideoDisplay(physicaladdress: Long, numberofbytes: ULong, cachetype: MemoryCachingType): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmMapVideoDisplay(physicaladdress, numberofbytes.toLong(), cachetype).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mmMapViewInSessionSpace(section: COpaquePointer?, mappedbase: COpaquePointer?, viewsize: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmMapViewInSessionSpace((section?.value ?: 0L), (mappedbase?.value ?: 0L), (viewsize?.value ?: 0L))

public actual fun mmMapViewInSessionSpaceEx(section: COpaquePointer?, mappedbase: COpaquePointer?, viewsize: COpaquePointer?, sectionoffset: COpaquePointer?, flags: ULong): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmMapViewInSessionSpaceEx((section?.value ?: 0L), (mappedbase?.value ?: 0L), (viewsize?.value ?: 0L), (sectionoffset?.value ?: 0L), flags.toLong())

public actual fun mmMapViewInSystemSpace(section: COpaquePointer?, mappedbase: COpaquePointer?, viewsize: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmMapViewInSystemSpace((section?.value ?: 0L), (mappedbase?.value ?: 0L), (viewsize?.value ?: 0L))

public actual fun mmMapViewInSystemSpaceEx(section: COpaquePointer?, mappedbase: COpaquePointer?, viewsize: COpaquePointer?, sectionoffset: COpaquePointer?, flags: ULong): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmMapViewInSystemSpaceEx((section?.value ?: 0L), (mappedbase?.value ?: 0L), (viewsize?.value ?: 0L), (sectionoffset?.value ?: 0L), flags.toLong())

public actual fun mmMdlPageContentsState(memorydescriptorlist: COpaquePointer?, state: MmMdlPageContentsState): MmMdlPageContentsState =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmMdlPageContentsState((memorydescriptorlist?.value ?: 0L), state)

public actual fun mmPageEntireDriver(addresswithinsection: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmPageEntireDriver((addresswithinsection?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mmProbeAndLockPages(memorydescriptorlist: COpaquePointer?, accessmode: Byte, operation: LockOperation) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmProbeAndLockPages((memorydescriptorlist?.value ?: 0L), accessmode, operation)
}

public actual fun mmProbeAndLockProcessPages(memorydescriptorlist: COpaquePointer?, process: Peprocess, accessmode: Byte, operation: LockOperation) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmProbeAndLockProcessPages((memorydescriptorlist?.value ?: 0L), process, accessmode, operation)
}

public actual fun mmProbeAndLockSelectedPages(memorydescriptorlist: COpaquePointer?, segmentarray: COpaquePointer?, accessmode: Byte, operation: LockOperation) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmProbeAndLockSelectedPages((memorydescriptorlist?.value ?: 0L), (segmentarray?.value ?: 0L), accessmode, operation)
}

public actual fun mmProtectDriverSection(addresswithinsection: COpaquePointer?, size: ULong, flags: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmProtectDriverSection((addresswithinsection?.value ?: 0L), size.toLong(), flags.toInt())

public actual fun mmProtectMdlSystemAddress(memorydescriptorlist: COpaquePointer?, newprotect: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmProtectMdlSystemAddress((memorydescriptorlist?.value ?: 0L), newprotect.toInt())

public actual fun mmQuerySystemSize(): MmSystemsize =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmQuerySystemSize()

public actual fun mmRemovePhysicalMemory(startaddress: COpaquePointer?, numberofbytes: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmRemovePhysicalMemory((startaddress?.value ?: 0L), (numberofbytes?.value ?: 0L))

public actual fun mmResetDriverPaging(addresswithinsection: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmResetDriverPaging((addresswithinsection?.value ?: 0L))
}

public actual fun mmRotatePhysicalView(virtualaddress: COpaquePointer?, numberofbytes: COpaquePointer?, newmdl: COpaquePointer?, direction: MmRotateDirection, copyfunction: PmmRotateCopyCallbackFunction, context: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmRotatePhysicalView((virtualaddress?.value ?: 0L), (numberofbytes?.value ?: 0L), (newmdl?.value ?: 0L), direction, 0L, (context?.value ?: 0L))

public actual fun mmSecureVirtualMemory(address: COpaquePointer?, size: ULong, probemode: UInt): Handle =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmSecureVirtualMemory((address?.value ?: 0L), size.toLong(), probemode.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mmSecureVirtualMemoryEx(address: COpaquePointer?, size: ULong, probemode: UInt, flags: UInt): Handle =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmSecureVirtualMemoryEx((address?.value ?: 0L), size.toLong(), probemode.toInt(), flags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mmSetPermanentCacheAttribute(startaddress: Long, numberofbytes: Long, cachetype: MemoryCachingType, flags: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmSetPermanentCacheAttribute(startaddress, numberofbytes, cachetype, flags.toInt())

public actual fun mmSizeOfMdl(base: COpaquePointer?, length: ULong): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmSizeOfMdl((base?.value ?: 0L), length.toLong()).toULong()

public actual fun mmUnlockPagableImageSection(imagesectionhandle: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmUnlockPagableImageSection((imagesectionhandle?.value ?: 0L))
}

public actual fun mmUnlockPages(memorydescriptorlist: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmUnlockPages((memorydescriptorlist?.value ?: 0L))
}

public actual fun mmUnmapIoSpace(baseaddress: COpaquePointer?, numberofbytes: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmUnmapIoSpace((baseaddress?.value ?: 0L), numberofbytes.toLong())
}

public actual fun mmUnmapLockedPages(baseaddress: COpaquePointer?, memorydescriptorlist: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmUnmapLockedPages((baseaddress?.value ?: 0L), (memorydescriptorlist?.value ?: 0L))
}

public actual fun mmUnmapReservedMapping(baseaddress: COpaquePointer?, pooltag: UInt, memorydescriptorlist: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmUnmapReservedMapping((baseaddress?.value ?: 0L), pooltag.toInt(), (memorydescriptorlist?.value ?: 0L))
}

public actual fun mmUnmapVideoDisplay(baseaddress: COpaquePointer?, numberofbytes: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmUnmapVideoDisplay((baseaddress?.value ?: 0L), numberofbytes.toLong())
}

public actual fun mmUnmapViewInSessionSpace(mappedbase: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmUnmapViewInSessionSpace((mappedbase?.value ?: 0L))

public actual fun mmUnmapViewInSystemSpace(mappedbase: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmUnmapViewInSystemSpace((mappedbase?.value ?: 0L))

public actual fun mmUnsecureVirtualMemory(securehandle: Handle) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_mmUnsecureVirtualMemory((securehandle?.value ?: 0L))
}

public actual fun ntAllocateLocallyUniqueId(luid: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntAllocateLocallyUniqueId((luid?.value ?: 0L))

public actual fun ntCommitComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntCommitComplete((enlistmenthandle?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun ntCommitEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntCommitEnlistment((enlistmenthandle?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun ntCommitTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntCommitTransaction((transactionhandle?.value ?: 0L), wait)

public actual fun ntCreateEnlistment(enlistmenthandle: COpaquePointer?, desiredaccess: UInt, resourcemanagerhandle: Handle, transactionhandle: Handle, objectattributes: COpaquePointer?, createoptions: UInt, notificationmask: UInt, enlistmentkey: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntCreateEnlistment((enlistmenthandle?.value ?: 0L), desiredaccess.toInt(), (resourcemanagerhandle?.value ?: 0L), (transactionhandle?.value ?: 0L), (objectattributes?.value ?: 0L), createoptions.toInt(), notificationmask.toInt(), (enlistmentkey?.value ?: 0L))

public actual fun ntCreateResourceManager(resourcemanagerhandle: COpaquePointer?, desiredaccess: UInt, tmhandle: Handle, rmguid: COpaquePointer?, objectattributes: COpaquePointer?, createoptions: UInt, description: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntCreateResourceManager((resourcemanagerhandle?.value ?: 0L), desiredaccess.toInt(), (tmhandle?.value ?: 0L), (rmguid?.value ?: 0L), (objectattributes?.value ?: 0L), createoptions.toInt(), (description?.value ?: 0L))

public actual fun ntCreateTransaction(transactionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, uow: COpaquePointer?, tmhandle: Handle, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: COpaquePointer?, description: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntCreateTransaction((transactionhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), (uow?.value ?: 0L), (tmhandle?.value ?: 0L), createoptions.toInt(), isolationlevel.toInt(), isolationflags.toInt(), (timeout?.value ?: 0L), (description?.value ?: 0L))

public actual fun ntCreateTransactionManager(tmhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, logfilename: COpaquePointer?, createoptions: UInt, commitstrength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntCreateTransactionManager((tmhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), (logfilename?.value ?: 0L), createoptions.toInt(), commitstrength.toInt())

public actual fun ntDisplayString(string: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntDisplayString((string?.value ?: 0L))

public actual fun ntEnumerateTransactionObject(rootobjecthandle: Handle, querytype: KtmobjectType, objectcursor: COpaquePointer?, objectcursorlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntEnumerateTransactionObject((rootobjecthandle?.value ?: 0L), querytype, (objectcursor?.value ?: 0L), objectcursorlength.toInt(), (returnlength?.value ?: 0L))

public actual fun ntGetNotificationResourceManager(resourcemanagerhandle: Handle, transactionnotification: COpaquePointer?, notificationlength: UInt, timeout: COpaquePointer?, returnlength: COpaquePointer?, asynchronous: UInt, asynchronouscontext: ULong): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntGetNotificationResourceManager((resourcemanagerhandle?.value ?: 0L), (transactionnotification?.value ?: 0L), notificationlength.toInt(), (timeout?.value ?: 0L), (returnlength?.value ?: 0L), asynchronous.toInt(), asynchronouscontext.toLong())

public actual fun ntLoadDriver(driverservicename: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntLoadDriver((driverservicename?.value ?: 0L))

public actual fun ntMakeTemporaryObject(handle: Handle): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntMakeTemporaryObject((handle?.value ?: 0L))

public actual fun ntManagePartition(targethandle: Handle, sourcehandle: Handle, partitioninformationclass: PartitionInformationClass, partitioninformation: COpaquePointer?, partitioninformationlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntManagePartition((targethandle?.value ?: 0L), (sourcehandle?.value ?: 0L), partitioninformationclass, (partitioninformation?.value ?: 0L), partitioninformationlength.toInt())

public actual fun ntOpenEnlistment(enlistmenthandle: COpaquePointer?, desiredaccess: UInt, resourcemanagerhandle: Handle, enlistmentguid: COpaquePointer?, objectattributes: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntOpenEnlistment((enlistmenthandle?.value ?: 0L), desiredaccess.toInt(), (resourcemanagerhandle?.value ?: 0L), (enlistmentguid?.value ?: 0L), (objectattributes?.value ?: 0L))

public actual fun ntOpenResourceManager(resourcemanagerhandle: COpaquePointer?, desiredaccess: UInt, tmhandle: Handle, resourcemanagerguid: COpaquePointer?, objectattributes: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntOpenResourceManager((resourcemanagerhandle?.value ?: 0L), desiredaccess.toInt(), (tmhandle?.value ?: 0L), (resourcemanagerguid?.value ?: 0L), (objectattributes?.value ?: 0L))

public actual fun ntOpenTransaction(transactionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, uow: COpaquePointer?, tmhandle: Handle): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntOpenTransaction((transactionhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), (uow?.value ?: 0L), (tmhandle?.value ?: 0L))

public actual fun ntOpenTransactionManager(tmhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, logfilename: COpaquePointer?, tmidentity: COpaquePointer?, openoptions: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntOpenTransactionManager((tmhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), (logfilename?.value ?: 0L), (tmidentity?.value ?: 0L), openoptions.toInt())

public actual fun ntPowerInformation(informationlevel: PowerInformationLevel, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntPowerInformation(informationlevel, (inputbuffer?.value ?: 0L), inputbufferlength.toInt(), (outputbuffer?.value ?: 0L), outputbufferlength.toInt())

public actual fun ntPrePrepareComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntPrePrepareComplete((enlistmenthandle?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun ntPrePrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntPrePrepareEnlistment((enlistmenthandle?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun ntPrepareComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntPrepareComplete((enlistmenthandle?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun ntPrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntPrepareEnlistment((enlistmenthandle?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun ntPropagationComplete(resourcemanagerhandle: Handle, requestcookie: UInt, bufferlength: UInt, buffer: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntPropagationComplete((resourcemanagerhandle?.value ?: 0L), requestcookie.toInt(), bufferlength.toInt(), (buffer?.value ?: 0L))

public actual fun ntPropagationFailed(resourcemanagerhandle: Handle, requestcookie: UInt, propstatus: Ntstatus): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntPropagationFailed((resourcemanagerhandle?.value ?: 0L), requestcookie.toInt(), propstatus)

public actual fun ntQueryInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: COpaquePointer?, enlistmentinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntQueryInformationEnlistment((enlistmenthandle?.value ?: 0L), enlistmentinformationclass, (enlistmentinformation?.value ?: 0L), enlistmentinformationlength.toInt(), (returnlength?.value ?: 0L))

public actual fun ntQueryInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: COpaquePointer?, resourcemanagerinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntQueryInformationResourceManager((resourcemanagerhandle?.value ?: 0L), resourcemanagerinformationclass, (resourcemanagerinformation?.value ?: 0L), resourcemanagerinformationlength.toInt(), (returnlength?.value ?: 0L))

public actual fun ntQueryInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: COpaquePointer?, transactioninformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntQueryInformationTransaction((transactionhandle?.value ?: 0L), transactioninformationclass, (transactioninformation?.value ?: 0L), transactioninformationlength.toInt(), (returnlength?.value ?: 0L))

public actual fun ntQueryInformationTransactionManager(transactionmanagerhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: COpaquePointer?, transactionmanagerinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntQueryInformationTransactionManager((transactionmanagerhandle?.value ?: 0L), transactionmanagerinformationclass, (transactionmanagerinformation?.value ?: 0L), transactionmanagerinformationlength.toInt(), (returnlength?.value ?: 0L))

public actual fun ntReadOnlyEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntReadOnlyEnlistment((enlistmenthandle?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun ntRecoverEnlistment(enlistmenthandle: Handle, enlistmentkey: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntRecoverEnlistment((enlistmenthandle?.value ?: 0L), (enlistmentkey?.value ?: 0L))

public actual fun ntRecoverResourceManager(resourcemanagerhandle: Handle): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntRecoverResourceManager((resourcemanagerhandle?.value ?: 0L))

public actual fun ntRecoverTransactionManager(transactionmanagerhandle: Handle): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntRecoverTransactionManager((transactionmanagerhandle?.value ?: 0L))

public actual fun ntRegisterProtocolAddressInformation(resourcemanager: Handle, protocolid: COpaquePointer?, protocolinformationsize: UInt, protocolinformation: COpaquePointer?, createoptions: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntRegisterProtocolAddressInformation((resourcemanager?.value ?: 0L), (protocolid?.value ?: 0L), protocolinformationsize.toInt(), (protocolinformation?.value ?: 0L), createoptions.toInt())

public actual fun ntRenameTransactionManager(logfilename: COpaquePointer?, existingtransactionmanagerguid: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntRenameTransactionManager((logfilename?.value ?: 0L), (existingtransactionmanagerguid?.value ?: 0L))

public actual fun ntRollbackComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntRollbackComplete((enlistmenthandle?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun ntRollbackEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntRollbackEnlistment((enlistmenthandle?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun ntRollbackTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntRollbackTransaction((transactionhandle?.value ?: 0L), wait)

public actual fun ntRollforwardTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntRollforwardTransactionManager((transactionmanagerhandle?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun ntSetInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: COpaquePointer?, enlistmentinformationlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntSetInformationEnlistment((enlistmenthandle?.value ?: 0L), enlistmentinformationclass, (enlistmentinformation?.value ?: 0L), enlistmentinformationlength.toInt())

public actual fun ntSetInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: COpaquePointer?, resourcemanagerinformationlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntSetInformationResourceManager((resourcemanagerhandle?.value ?: 0L), resourcemanagerinformationclass, (resourcemanagerinformation?.value ?: 0L), resourcemanagerinformationlength.toInt())

public actual fun ntSetInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: COpaquePointer?, transactioninformationlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntSetInformationTransaction((transactionhandle?.value ?: 0L), transactioninformationclass, (transactioninformation?.value ?: 0L), transactioninformationlength.toInt())

public actual fun ntSetInformationTransactionManager(tmhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: COpaquePointer?, transactionmanagerinformationlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntSetInformationTransactionManager((tmhandle?.value ?: 0L), transactionmanagerinformationclass, (transactionmanagerinformation?.value ?: 0L), transactionmanagerinformationlength.toInt())

public actual fun ntSinglePhaseReject(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntSinglePhaseReject((enlistmenthandle?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun ntUnloadDriver(driverservicename: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_ntUnloadDriver((driverservicename?.value ?: 0L))

public actual fun obCloseHandle(handle: Handle, previousmode: Byte): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_obCloseHandle((handle?.value ?: 0L), previousmode)

public actual fun obDereferenceObjectDeferDelete(obj: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_obDereferenceObjectDeferDelete((obj?.value ?: 0L))
}

public actual fun obDereferenceObjectDeferDeleteWithTag(obj: COpaquePointer?, tag: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_obDereferenceObjectDeferDeleteWithTag((obj?.value ?: 0L), tag.toInt())
}

public actual fun obGetFilterVersion(): UShort =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_obGetFilterVersion().toUShort()

public actual fun obGetObjectSecurity(obj: COpaquePointer?, securitydescriptor: COpaquePointer?, memoryallocated: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_obGetObjectSecurity((obj?.value ?: 0L), (securitydescriptor?.value ?: 0L), (memoryallocated?.value ?: 0L))

public actual fun obReferenceObjectByHandle(handle: Handle, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, obj: COpaquePointer?, handleinformation: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_obReferenceObjectByHandle((handle?.value ?: 0L), desiredaccess.toInt(), objecttype, accessmode, (obj?.value ?: 0L), (handleinformation?.value ?: 0L))

public actual fun obReferenceObjectByHandleWithTag(handle: Handle, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, tag: UInt, obj: COpaquePointer?, handleinformation: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_obReferenceObjectByHandleWithTag((handle?.value ?: 0L), desiredaccess.toInt(), objecttype, accessmode, tag.toInt(), (obj?.value ?: 0L), (handleinformation?.value ?: 0L))

public actual fun obReferenceObjectByPointer(obj: COpaquePointer?, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_obReferenceObjectByPointer((obj?.value ?: 0L), desiredaccess.toInt(), objecttype, accessmode)

public actual fun obReferenceObjectByPointerWithTag(obj: COpaquePointer?, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, tag: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_obReferenceObjectByPointerWithTag((obj?.value ?: 0L), desiredaccess.toInt(), objecttype, accessmode, tag.toInt())

public actual fun obReferenceObjectSafe(obj: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_obReferenceObjectSafe((obj?.value ?: 0L))

public actual fun obReferenceObjectSafeWithTag(obj: COpaquePointer?, tag: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_obReferenceObjectSafeWithTag((obj?.value ?: 0L), tag.toInt())

public actual fun obRegisterCallbacks(callbackregistration: COpaquePointer?, registrationhandle: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_obRegisterCallbacks((callbackregistration?.value ?: 0L), (registrationhandle?.value ?: 0L))

public actual fun obReleaseObjectSecurity(securitydescriptor: PsecurityDescriptor, memoryallocated: Boolean) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_obReleaseObjectSecurity((securitydescriptor?.value ?: 0L), memoryallocated)
}

public actual fun obUnRegisterCallbacks(registrationhandle: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_obUnRegisterCallbacks((registrationhandle?.value ?: 0L))
}

public actual fun obfDereferenceObject(obj: COpaquePointer?): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_obfDereferenceObject((obj?.value ?: 0L))

public actual fun obfDereferenceObjectWithTag(obj: COpaquePointer?, tag: UInt): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_obfDereferenceObjectWithTag((obj?.value ?: 0L), tag.toInt())

public actual fun obfReferenceObject(obj: COpaquePointer?): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_obfReferenceObject((obj?.value ?: 0L))

public actual fun obfReferenceObjectWithTag(obj: COpaquePointer?, tag: UInt): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_obfReferenceObjectWithTag((obj?.value ?: 0L), tag.toInt())

public actual fun pcwAddInstance(buffer: PpcwBuffer, name: COpaquePointer?, id: UInt, count: UInt, data: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_pcwAddInstance(buffer, (name?.value ?: 0L), id.toInt(), count.toInt(), (data?.value ?: 0L))

public actual fun pcwCloseInstance(instance: PpcwInstance) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_pcwCloseInstance(instance)
}

public actual fun pcwCreateInstance(instance: COpaquePointer?, registration: PpcwRegistration, name: COpaquePointer?, count: UInt, data: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_pcwCreateInstance((instance?.value ?: 0L), registration, (name?.value ?: 0L), count.toInt(), (data?.value ?: 0L))

public actual fun pcwRegister(registration: COpaquePointer?, info: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_pcwRegister((registration?.value ?: 0L), (info?.value ?: 0L))

public actual fun pcwUnregister(registration: PpcwRegistration) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_pcwUnregister(registration)
}

public actual fun poCallDriver(deviceobject: COpaquePointer?, irp: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poCallDriver((deviceobject?.value ?: 0L), (irp?.value ?: 0L))

public actual fun poClearPowerRequest(powerrequest: COpaquePointer?, type: PowerRequestType): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poClearPowerRequest((powerrequest?.value ?: 0L), type)

public actual fun poCreatePowerRequest(powerrequest: COpaquePointer?, deviceobject: COpaquePointer?, context: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poCreatePowerRequest((powerrequest?.value ?: 0L), (deviceobject?.value ?: 0L), (context?.value ?: 0L))

public actual fun poCreateThermalRequest(thermalrequest: COpaquePointer?, targetdeviceobject: COpaquePointer?, policydeviceobject: COpaquePointer?, context: COpaquePointer?, flags: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poCreateThermalRequest((thermalrequest?.value ?: 0L), (targetdeviceobject?.value ?: 0L), (policydeviceobject?.value ?: 0L), (context?.value ?: 0L), flags.toInt())

public actual fun poDeletePowerRequest(powerrequest: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poDeletePowerRequest((powerrequest?.value ?: 0L))
}

public actual fun poDeleteThermalRequest(thermalrequest: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poDeleteThermalRequest((thermalrequest?.value ?: 0L))
}

public actual fun poEndDeviceBusy(idlepointer: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poEndDeviceBusy((idlepointer?.value ?: 0L))
}

public actual fun poFxActivateComponent(handle: Pohandle, component: UInt, flags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poFxActivateComponent((handle?.value ?: 0L), component.toInt(), flags.toInt())
}

public actual fun poFxCompleteDevicePowerNotRequired(handle: Pohandle) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poFxCompleteDevicePowerNotRequired((handle?.value ?: 0L))
}

public actual fun poFxCompleteDirectedPowerDown(handle: Pohandle) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poFxCompleteDirectedPowerDown((handle?.value ?: 0L))
}

public actual fun poFxCompleteIdleCondition(handle: Pohandle, component: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poFxCompleteIdleCondition((handle?.value ?: 0L), component.toInt())
}

public actual fun poFxCompleteIdleState(handle: Pohandle, component: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poFxCompleteIdleState((handle?.value ?: 0L), component.toInt())
}

public actual fun poFxIdleComponent(handle: Pohandle, component: UInt, flags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poFxIdleComponent((handle?.value ?: 0L), component.toInt(), flags.toInt())
}

public actual fun poFxIssueComponentPerfStateChange(handle: Pohandle, flags: UInt, component: UInt, perfchange: COpaquePointer?, context: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poFxIssueComponentPerfStateChange((handle?.value ?: 0L), flags.toInt(), component.toInt(), (perfchange?.value ?: 0L), (context?.value ?: 0L))
}

public actual fun poFxIssueComponentPerfStateChangeMultiple(handle: Pohandle, flags: UInt, component: UInt, perfchangescount: UInt, perfchanges: COpaquePointer?, context: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poFxIssueComponentPerfStateChangeMultiple((handle?.value ?: 0L), flags.toInt(), component.toInt(), perfchangescount.toInt(), (perfchanges?.value ?: 0L), (context?.value ?: 0L))
}

public actual fun poFxNotifySurprisePowerOn(pdo: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poFxNotifySurprisePowerOn((pdo?.value ?: 0L))
}

public actual fun poFxPowerControl(handle: Pohandle, powercontrolcode: COpaquePointer?, inbuffer: COpaquePointer?, inbuffersize: ULong, outbuffer: COpaquePointer?, outbuffersize: ULong, bytesreturned: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poFxPowerControl((handle?.value ?: 0L), (powercontrolcode?.value ?: 0L), (inbuffer?.value ?: 0L), inbuffersize.toLong(), (outbuffer?.value ?: 0L), outbuffersize.toLong(), (bytesreturned?.value ?: 0L))

public actual fun poFxPowerOnCrashdumpDevice(handle: Pohandle, context: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poFxPowerOnCrashdumpDevice((handle?.value ?: 0L), (context?.value ?: 0L))

public actual fun poFxQueryCurrentComponentPerfState(handle: Pohandle, flags: UInt, component: UInt, setindex: UInt, currentperf: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poFxQueryCurrentComponentPerfState((handle?.value ?: 0L), flags.toInt(), component.toInt(), setindex.toInt(), (currentperf?.value ?: 0L))

public actual fun poFxRegisterComponentPerfStates(handle: Pohandle, component: UInt, flags: ULong, componentperfstatecallback: PpoFxComponentPerfStateCallback, inputstateinfo: COpaquePointer?, outputstateinfo: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poFxRegisterComponentPerfStates((handle?.value ?: 0L), component.toInt(), flags.toLong(), 0L, (inputstateinfo?.value ?: 0L), (outputstateinfo?.value ?: 0L))

public actual fun poFxRegisterCrashdumpDevice(handle: Pohandle): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poFxRegisterCrashdumpDevice((handle?.value ?: 0L))

public actual fun poFxRegisterDevice(pdo: COpaquePointer?, device: COpaquePointer?, handle: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poFxRegisterDevice((pdo?.value ?: 0L), (device?.value ?: 0L), (handle?.value ?: 0L))

public actual fun poFxRegisterDripsWatchdogCallback(handle: Pohandle, callback: PpoFxDripsWatchdogCallback, includechilddevices: Boolean, matchingdriverobject: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poFxRegisterDripsWatchdogCallback((handle?.value ?: 0L), 0L, includechilddevices, (matchingdriverobject?.value ?: 0L))
}

public actual fun poFxReportDevicePoweredOn(handle: Pohandle) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poFxReportDevicePoweredOn((handle?.value ?: 0L))
}

public actual fun poFxSetComponentLatency(handle: Pohandle, component: UInt, latency: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poFxSetComponentLatency((handle?.value ?: 0L), component.toInt(), latency.toLong())
}

public actual fun poFxSetComponentResidency(handle: Pohandle, component: UInt, residency: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poFxSetComponentResidency((handle?.value ?: 0L), component.toInt(), residency.toLong())
}

public actual fun poFxSetComponentWake(handle: Pohandle, component: UInt, wakehint: Boolean) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poFxSetComponentWake((handle?.value ?: 0L), component.toInt(), wakehint)
}

public actual fun poFxSetDeviceIdleTimeout(handle: Pohandle, idletimeout: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poFxSetDeviceIdleTimeout((handle?.value ?: 0L), idletimeout.toLong())
}

public actual fun poFxSetTargetDripsDevicePowerState(handle: Pohandle, targetstate: DevicePowerState): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poFxSetTargetDripsDevicePowerState((handle?.value ?: 0L), targetstate)

public actual fun poFxStartDevicePowerManagement(handle: Pohandle) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poFxStartDevicePowerManagement((handle?.value ?: 0L))
}

public actual fun poFxUnregisterDevice(handle: Pohandle) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poFxUnregisterDevice((handle?.value ?: 0L))
}

public actual fun poGetSystemWake(irp: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poGetSystemWake((irp?.value ?: 0L))

public actual fun poGetThermalRequestSupport(thermalrequest: COpaquePointer?, type: PoThermalRequestType): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poGetThermalRequestSupport((thermalrequest?.value ?: 0L), type)

public actual fun poQueryWatchdogTime(pdo: COpaquePointer?, secondsremaining: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poQueryWatchdogTime((pdo?.value ?: 0L), (secondsremaining?.value ?: 0L))

public actual fun poRegisterDeviceForIdleDetection(deviceobject: COpaquePointer?, conservationidletime: UInt, performanceidletime: UInt, state: DevicePowerState): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poRegisterDeviceForIdleDetection((deviceobject?.value ?: 0L), conservationidletime.toInt(), performanceidletime.toInt(), state).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun poRegisterPowerSettingCallback(deviceobject: COpaquePointer?, settingguid: COpaquePointer?, callback: PpowerSettingCallback, context: COpaquePointer?, handle: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poRegisterPowerSettingCallback((deviceobject?.value ?: 0L), (settingguid?.value ?: 0L), 0L, (context?.value ?: 0L), (handle?.value ?: 0L))

public actual fun poRegisterSystemState(statehandle: COpaquePointer?, flags: UInt): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poRegisterSystemState((statehandle?.value ?: 0L), flags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun poRequestPowerIrp(deviceobject: COpaquePointer?, minorfunction: UByte, powerstate: PowerState, completionfunction: PrequestPowerComplete, context: COpaquePointer?, irp: COpaquePointer?): Ntstatus =
    0

public actual fun poSetDeviceBusyEx(idlepointer: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poSetDeviceBusyEx((idlepointer?.value ?: 0L))
}

public actual fun poSetHiberRange(memorymap: COpaquePointer?, flags: UInt, address: COpaquePointer?, length: ULong, tag: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poSetHiberRange((memorymap?.value ?: 0L), flags.toInt(), (address?.value ?: 0L), length.toLong(), tag.toInt())
}

public actual fun poSetPowerRequest(powerrequest: COpaquePointer?, type: PowerRequestType): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poSetPowerRequest((powerrequest?.value ?: 0L), type)

public actual fun poSetPowerState(deviceobject: COpaquePointer?, type: PowerStateType, state: PowerState): PowerState =
    PowerState()

public actual fun poSetSystemState(flags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poSetSystemState(flags.toInt())
}

public actual fun poSetSystemWake(irp: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poSetSystemWake((irp?.value ?: 0L))
}

public actual fun poSetSystemWakeDevice(deviceobject: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poSetSystemWakeDevice((deviceobject?.value ?: 0L))
}

public actual fun poSetThermalActiveCooling(thermalrequest: COpaquePointer?, engaged: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poSetThermalActiveCooling((thermalrequest?.value ?: 0L), engaged)

public actual fun poSetThermalPassiveCooling(thermalrequest: COpaquePointer?, throttle: UByte): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poSetThermalPassiveCooling((thermalrequest?.value ?: 0L), throttle.toByte())

public actual fun poStartDeviceBusy(idlepointer: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poStartDeviceBusy((idlepointer?.value ?: 0L))
}

public actual fun poStartNextPowerIrp(irp: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poStartNextPowerIrp((irp?.value ?: 0L))
}

public actual fun poUnregisterPowerSettingCallback(handle: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poUnregisterPowerSettingCallback((handle?.value ?: 0L))

public actual fun poUnregisterSystemState(statehandle: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_poUnregisterSystemState((statehandle?.value ?: 0L))
}

public actual fun probeForRead(address: COpaquePointer?, length: ULong, alignment: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_probeForRead((address?.value ?: 0L), length.toLong(), alignment.toInt())
}

public actual fun probeForWrite(address: COpaquePointer?, length: ULong, alignment: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_probeForWrite((address?.value ?: 0L), length.toLong(), alignment.toInt())
}

public actual fun psAcquireSiloHardReference(silo: Pesilo): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psAcquireSiloHardReference(silo)

public actual fun psAllocSiloContextSlot(reserved: ULong, returnedcontextslot: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psAllocSiloContextSlot(reserved.toLong(), (returnedcontextslot?.value ?: 0L))

public actual fun psAllocateAffinityToken(affinitytoken: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psAllocateAffinityToken((affinitytoken?.value ?: 0L))

public actual fun psAttachSiloToCurrentThread(silo: Pesilo): Pesilo =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psAttachSiloToCurrentThread(silo)

public actual fun psCreateSiloContext(silo: Pesilo, size: UInt, pooltype: PoolType, contextcleanupcallback: SiloContextCleanupCallback, returnedsilocontext: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psCreateSiloContext(silo, size.toInt(), pooltype, 0L, (returnedsilocontext?.value ?: 0L))

public actual fun psCreateSystemThread(threadhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, processhandle: Handle, clientid: COpaquePointer?, startroutine: PkstartRoutine, startcontext: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psCreateSystemThread((threadhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), (processhandle?.value ?: 0L), (clientid?.value ?: 0L), 0L, (startcontext?.value ?: 0L))

public actual fun psDereferenceSiloContext(silocontext: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psDereferenceSiloContext((silocontext?.value ?: 0L))
}

public actual fun psDetachSiloFromCurrentThread(previoussilo: Pesilo) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psDetachSiloFromCurrentThread(previoussilo)
}

public actual fun psFreeAffinityToken(affinitytoken: PaffinityToken) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psFreeAffinityToken(affinitytoken)
}

public actual fun psFreeSiloContextSlot(contextslot: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psFreeSiloContextSlot(contextslot.toInt())

public actual fun psGetCurrentProcessId(): Handle =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psGetCurrentProcessId().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun psGetCurrentServerSilo(): Pesilo =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psGetCurrentServerSilo()

public actual fun psGetCurrentServerSiloName(): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psGetCurrentServerSiloName().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun psGetCurrentSilo(): Pesilo =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psGetCurrentSilo()

public actual fun psGetCurrentThreadId(): Handle =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psGetCurrentThreadId().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun psGetCurrentThreadTeb(): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psGetCurrentThreadTeb().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun psGetEffectiveServerSilo(silo: Pesilo): Pesilo =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psGetEffectiveServerSilo(silo)

public actual fun psGetHostSilo(): Pesilo =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psGetHostSilo()

public actual fun psGetJobServerSilo(job: Pejob, serversilo: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psGetJobServerSilo(job, (serversilo?.value ?: 0L))

public actual fun psGetJobSilo(job: Pejob, silo: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psGetJobSilo(job, (silo?.value ?: 0L))

public actual fun psGetParentSilo(job: Pejob): Pesilo =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psGetParentSilo(job)

public actual fun psGetPermanentSiloContext(silo: Pesilo, contextslot: UInt, returnedsilocontext: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psGetPermanentSiloContext(silo, contextslot.toInt(), (returnedsilocontext?.value ?: 0L))

public actual fun psGetProcessCreateTimeQuadPart(process: Peprocess): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psGetProcessCreateTimeQuadPart(process)

public actual fun psGetProcessExitStatus(process: Peprocess): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psGetProcessExitStatus(process)

public actual fun psGetProcessId(process: Peprocess): Handle =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psGetProcessId(process).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun psGetProcessStartKey(process: Peprocess): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psGetProcessStartKey(process).toULong()

public actual fun psGetServerSiloServiceSessionId(silo: Pesilo): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psGetServerSiloServiceSessionId(silo).toUInt()

public actual fun psGetSiloContainerId(silo: Pesilo): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psGetSiloContainerId(silo).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun psGetSiloContext(silo: Pesilo, contextslot: UInt, returnedsilocontext: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psGetSiloContext(silo, contextslot.toInt(), (returnedsilocontext?.value ?: 0L))

public actual fun psGetSiloMonitorContextSlot(monitor: PsiloMonitor): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psGetSiloMonitorContextSlot(monitor).toUInt()

public actual fun psGetThreadCreateTime(thread: Pethread): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psGetThreadCreateTime(thread)

public actual fun psGetThreadExitStatus(thread: Pethread): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psGetThreadExitStatus(thread)

public actual fun psGetThreadId(thread: Pethread): Handle =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psGetThreadId(thread).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun psGetThreadProcessId(thread: Pethread): Handle =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psGetThreadProcessId(thread).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun psGetThreadProperty(thread: Pethread, key: ULong, flags: UInt): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psGetThreadProperty(thread, key.toLong(), flags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun psGetThreadServerSilo(thread: Pethread): Pesilo =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psGetThreadServerSilo(thread)

public actual fun psGetVersion(majorversion: COpaquePointer?, minorversion: COpaquePointer?, buildnumber: COpaquePointer?, csdversion: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psGetVersion((majorversion?.value ?: 0L), (minorversion?.value ?: 0L), (buildnumber?.value ?: 0L), (csdversion?.value ?: 0L))

public actual fun psInsertPermanentSiloContext(silo: Pesilo, contextslot: UInt, silocontext: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psInsertPermanentSiloContext(silo, contextslot.toInt(), (silocontext?.value ?: 0L))

public actual fun psInsertSiloContext(silo: Pesilo, contextslot: UInt, silocontext: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psInsertSiloContext(silo, contextslot.toInt(), (silocontext?.value ?: 0L))

public actual fun psIsCurrentThreadInServerSilo(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psIsCurrentThreadInServerSilo()

public actual fun psIsCurrentThreadPrefetching(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psIsCurrentThreadPrefetching()

public actual fun psIsHostSilo(silo: Pesilo): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psIsHostSilo(silo)

public actual fun psMakeSiloContextPermanent(silo: Pesilo, contextslot: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psMakeSiloContextPermanent(silo, contextslot.toInt())

public actual fun psQueryTotalCycleTimeProcess(process: Peprocess, cycletimestamp: COpaquePointer?): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psQueryTotalCycleTimeProcess(process, (cycletimestamp?.value ?: 0L)).toULong()

public actual fun psReferenceSiloContext(silocontext: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psReferenceSiloContext((silocontext?.value ?: 0L))
}

public actual fun psRegisterSiloMonitor(registration: COpaquePointer?, returnedmonitor: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psRegisterSiloMonitor((registration?.value ?: 0L), (returnedmonitor?.value ?: 0L))

public actual fun psReleaseSiloHardReference(silo: Pesilo) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psReleaseSiloHardReference(silo)
}

public actual fun psRemoveCreateThreadNotifyRoutine(notifyroutine: PcreateThreadNotifyRoutine): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psRemoveCreateThreadNotifyRoutine(0L)

public actual fun psRemoveLoadImageNotifyRoutine(notifyroutine: PloadImageNotifyRoutine): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psRemoveLoadImageNotifyRoutine(0L)

public actual fun psRemoveSiloContext(silo: Pesilo, contextslot: UInt, removedsilocontext: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psRemoveSiloContext(silo, contextslot.toInt(), (removedsilocontext?.value ?: 0L))

public actual fun psReplaceSiloContext(silo: Pesilo, contextslot: UInt, newsilocontext: COpaquePointer?, oldsilocontext: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psReplaceSiloContext(silo, contextslot.toInt(), (newsilocontext?.value ?: 0L), (oldsilocontext?.value ?: 0L))

public actual fun psRevertToUserMultipleGroupAffinityThread(affinitytoken: PaffinityToken) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psRevertToUserMultipleGroupAffinityThread(affinitytoken)
}

public actual fun psSetCreateProcessNotifyRoutine(notifyroutine: PcreateProcessNotifyRoutine, remove: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psSetCreateProcessNotifyRoutine(0L, remove)

public actual fun psSetCreateProcessNotifyRoutineEx(notifyroutine: PcreateProcessNotifyRoutineEx, remove: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psSetCreateProcessNotifyRoutineEx(0L, remove)

public actual fun psSetCreateProcessNotifyRoutineEx2(notifytype: Pscreateprocessnotifytype, notifyinformation: COpaquePointer?, remove: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psSetCreateProcessNotifyRoutineEx2(notifytype, (notifyinformation?.value ?: 0L), remove)

public actual fun psSetCreateThreadNotifyRoutine(notifyroutine: PcreateThreadNotifyRoutine): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psSetCreateThreadNotifyRoutine(0L)

public actual fun psSetCreateThreadNotifyRoutineEx(notifytype: Pscreatethreadnotifytype, notifyinformation: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psSetCreateThreadNotifyRoutineEx(notifytype, (notifyinformation?.value ?: 0L))

public actual fun psSetCurrentThreadPrefetching(prefetching: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psSetCurrentThreadPrefetching(prefetching)

public actual fun psSetLoadImageNotifyRoutine(notifyroutine: PloadImageNotifyRoutine): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psSetLoadImageNotifyRoutine(0L)

public actual fun psSetLoadImageNotifyRoutineEx(notifyroutine: PloadImageNotifyRoutine, flags: ULong): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psSetLoadImageNotifyRoutineEx(0L, flags.toLong())

public actual fun psSetSystemMultipleGroupAffinityThread(groupaffinities: COpaquePointer?, groupcount: UShort, affinitytoken: PaffinityToken): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psSetSystemMultipleGroupAffinityThread((groupaffinities?.value ?: 0L), groupcount.toShort(), affinitytoken)

public actual fun psStartSiloMonitor(monitor: PsiloMonitor): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psStartSiloMonitor(monitor)

public actual fun psTerminateServerSilo(serversilo: Pesilo, exitstatus: Ntstatus) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psTerminateServerSilo(serversilo, exitstatus)
}

public actual fun psTerminateSystemThread(exitstatus: Ntstatus): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psTerminateSystemThread(exitstatus)

public actual fun psUnregisterSiloMonitor(monitor: PsiloMonitor) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psUnregisterSiloMonitor(monitor)
}

public actual fun psWrapApcWow64Thread(apccontext: COpaquePointer?, apcroutine: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_psWrapApcWow64Thread((apccontext?.value ?: 0L), (apcroutine?.value ?: 0L))

public actual fun pshedAllocateMemory(size: UInt): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_pshedAllocateMemory(size.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pshedFreeMemory(address: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_pshedFreeMemory((address?.value ?: 0L))
}

public actual fun pshedIsSystemWheaEnabled(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_pshedIsSystemWheaEnabled()

public actual fun pshedRegisterPlugin(packet: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_pshedRegisterPlugin((packet?.value ?: 0L))

public actual fun pshedSynchronizeExecution(errorsource: COpaquePointer?, synchronizeroutine: PksynchronizeRoutine, synchronizecontext: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_pshedSynchronizeExecution((errorsource?.value ?: 0L), 0L, (synchronizecontext?.value ?: 0L))

public actual fun pshedUnregisterPlugin(pluginhandle: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_pshedUnregisterPlugin((pluginhandle?.value ?: 0L))
}

public actual fun rtlAppendUnicodeStringToString(destination: COpaquePointer?, source: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlAppendUnicodeStringToString((destination?.value ?: 0L), (source?.value ?: 0L))

public actual fun rtlAppendUnicodeToString(destination: COpaquePointer?, source: Pcwstr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlAppendUnicodeToString((destination?.value ?: 0L), (source?.value ?: 0L))

public actual fun rtlAreBitsClear(bitmapheader: COpaquePointer?, startingindex: UInt, length: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlAreBitsClear((bitmapheader?.value ?: 0L), startingindex.toInt(), length.toInt())

public actual fun rtlAreBitsSet(bitmapheader: COpaquePointer?, startingindex: UInt, length: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlAreBitsSet((bitmapheader?.value ?: 0L), startingindex.toInt(), length.toInt())

public actual fun rtlAssert(voidfailedassertion: COpaquePointer?, voidfilename: COpaquePointer?, linenumber: UInt, mutablemessage: Pcstr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlAssert((voidfailedassertion?.value ?: 0L), (voidfilename?.value ?: 0L), linenumber.toInt(), (mutablemessage?.value ?: 0L))
}

public actual fun rtlCheckRegistryKey(relativeto: UInt, path: Pcwstr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlCheckRegistryKey(relativeto.toInt(), (path?.value ?: 0L))

public actual fun rtlClearAllBits(bitmapheader: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlClearAllBits((bitmapheader?.value ?: 0L))
}

public actual fun rtlClearBit(bitmapheader: COpaquePointer?, bitnumber: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlClearBit((bitmapheader?.value ?: 0L), bitnumber.toInt())
}

public actual fun rtlClearBits(bitmapheader: COpaquePointer?, startingindex: UInt, numbertoclear: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlClearBits((bitmapheader?.value ?: 0L), startingindex.toInt(), numbertoclear.toInt())
}

public actual fun rtlCmDecodeMemIoResource(descriptor: COpaquePointer?, start: COpaquePointer?): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlCmDecodeMemIoResource((descriptor?.value ?: 0L), (start?.value ?: 0L)).toULong()

public actual fun rtlCmEncodeMemIoResource(descriptor: COpaquePointer?, type: UByte, length: ULong, start: ULong): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlCmEncodeMemIoResource((descriptor?.value ?: 0L), type.toByte(), length.toLong(), start.toLong())

public actual fun rtlCompareString(string1: COpaquePointer?, string2: COpaquePointer?, caseinsensitive: Boolean): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlCompareString((string1?.value ?: 0L), (string2?.value ?: 0L), caseinsensitive)

public actual fun rtlCompareUnicodeString(string1: COpaquePointer?, string2: COpaquePointer?, caseinsensitive: Boolean): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlCompareUnicodeString((string1?.value ?: 0L), (string2?.value ?: 0L), caseinsensitive)

public actual fun rtlCompareUnicodeStrings(string1: COpaquePointer?, string1length: ULong, string2: COpaquePointer?, string2length: ULong, caseinsensitive: Boolean): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlCompareUnicodeStrings((string1?.value ?: 0L), string1length.toLong(), (string2?.value ?: 0L), string2length.toLong(), caseinsensitive)

public actual fun rtlContractHashTable(hashtable: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlContractHashTable((hashtable?.value ?: 0L))

public actual fun rtlCopyBitMap(source: COpaquePointer?, destination: COpaquePointer?, targetbit: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlCopyBitMap((source?.value ?: 0L), (destination?.value ?: 0L), targetbit.toInt())
}

public actual fun rtlCopyString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlCopyString((destinationstring?.value ?: 0L), (sourcestring?.value ?: 0L))
}

public actual fun rtlCopyUnicodeString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlCopyUnicodeString((destinationstring?.value ?: 0L), (sourcestring?.value ?: 0L))
}

public actual fun rtlCreateHashTable(hashtable: COpaquePointer?, shift: UInt, flags: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlCreateHashTable((hashtable?.value ?: 0L), shift.toInt(), flags.toInt())

public actual fun rtlCreateHashTableEx(hashtable: COpaquePointer?, initialsize: UInt, shift: UInt, flags: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlCreateHashTableEx((hashtable?.value ?: 0L), initialsize.toInt(), shift.toInt(), flags.toInt())

public actual fun rtlCreateRegistryKey(relativeto: UInt, path: Pcwstr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlCreateRegistryKey(relativeto.toInt(), (path?.value ?: 0L))

public actual fun rtlCreateSecurityDescriptor(securitydescriptor: PsecurityDescriptor, revision: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlCreateSecurityDescriptor((securitydescriptor?.value ?: 0L), revision.toInt())

public actual fun rtlDelete(links: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlDelete((links?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlDeleteElementGenericTable(table: COpaquePointer?, buffer: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlDeleteElementGenericTable((table?.value ?: 0L), (buffer?.value ?: 0L))

public actual fun rtlDeleteElementGenericTableAvl(table: COpaquePointer?, buffer: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlDeleteElementGenericTableAvl((table?.value ?: 0L), (buffer?.value ?: 0L))

public actual fun rtlDeleteElementGenericTableAvlEx(table: COpaquePointer?, nodeorparent: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlDeleteElementGenericTableAvlEx((table?.value ?: 0L), (nodeorparent?.value ?: 0L))
}

public actual fun rtlDeleteHashTable(hashtable: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlDeleteHashTable((hashtable?.value ?: 0L))
}

public actual fun rtlDeleteNoSplay(links: COpaquePointer?, root: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlDeleteNoSplay((links?.value ?: 0L), (root?.value ?: 0L))
}

public actual fun rtlDeleteRegistryValue(relativeto: UInt, path: Pcwstr, valuename: Pcwstr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlDeleteRegistryValue(relativeto.toInt(), (path?.value ?: 0L), (valuename?.value ?: 0L))

public actual fun rtlDowncaseUnicodeChar(sourcecharacter: UShort): UShort =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlDowncaseUnicodeChar(sourcecharacter.toShort()).toUShort()

public actual fun rtlEndEnumerationHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlEndEnumerationHashTable((hashtable?.value ?: 0L), (enumerator?.value ?: 0L))
}

public actual fun rtlEndStrongEnumerationHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlEndStrongEnumerationHashTable((hashtable?.value ?: 0L), (enumerator?.value ?: 0L))
}

public actual fun rtlEndWeakEnumerationHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlEndWeakEnumerationHashTable((hashtable?.value ?: 0L), (enumerator?.value ?: 0L))
}

public actual fun rtlEnumerateEntryHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlEnumerateEntryHashTable((hashtable?.value ?: 0L), (enumerator?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlEnumerateGenericTable(table: COpaquePointer?, restart: Boolean): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlEnumerateGenericTable((table?.value ?: 0L), restart).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlEnumerateGenericTableAvl(table: COpaquePointer?, restart: Boolean): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlEnumerateGenericTableAvl((table?.value ?: 0L), restart).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlEnumerateGenericTableLikeADirectory(table: COpaquePointer?, matchfunction: PrtlAvlMatchFunction, matchdata: COpaquePointer?, nextflag: UInt, restartkey: COpaquePointer?, deletecount: COpaquePointer?, buffer: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlEnumerateGenericTableLikeADirectory((table?.value ?: 0L), 0L, (matchdata?.value ?: 0L), nextflag.toInt(), (restartkey?.value ?: 0L), (deletecount?.value ?: 0L), (buffer?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlEnumerateGenericTableWithoutSplaying(table: COpaquePointer?, restartkey: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlEnumerateGenericTableWithoutSplaying((table?.value ?: 0L), (restartkey?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlEnumerateGenericTableWithoutSplayingAvl(table: COpaquePointer?, restartkey: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlEnumerateGenericTableWithoutSplayingAvl((table?.value ?: 0L), (restartkey?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlEqualString(string1: COpaquePointer?, string2: COpaquePointer?, caseinsensitive: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlEqualString((string1?.value ?: 0L), (string2?.value ?: 0L), caseinsensitive)

public actual fun rtlEqualUnicodeString(string1: COpaquePointer?, string2: COpaquePointer?, caseinsensitive: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlEqualUnicodeString((string1?.value ?: 0L), (string2?.value ?: 0L), caseinsensitive)

public actual fun rtlExpandHashTable(hashtable: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlExpandHashTable((hashtable?.value ?: 0L))

public actual fun rtlExtractBitMap(source: COpaquePointer?, destination: COpaquePointer?, targetbit: UInt, numberofbits: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlExtractBitMap((source?.value ?: 0L), (destination?.value ?: 0L), targetbit.toInt(), numberofbits.toInt())
}

public actual fun rtlFindClearBits(bitmapheader: COpaquePointer?, numbertofind: UInt, hintindex: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlFindClearBits((bitmapheader?.value ?: 0L), numbertofind.toInt(), hintindex.toInt()).toUInt()

public actual fun rtlFindClearBitsAndSet(bitmapheader: COpaquePointer?, numbertofind: UInt, hintindex: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlFindClearBitsAndSet((bitmapheader?.value ?: 0L), numbertofind.toInt(), hintindex.toInt()).toUInt()

public actual fun rtlFindClearRuns(bitmapheader: COpaquePointer?, runarray: COpaquePointer?, sizeofrunarray: UInt, locatelongestruns: Boolean): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlFindClearRuns((bitmapheader?.value ?: 0L), (runarray?.value ?: 0L), sizeofrunarray.toInt(), locatelongestruns).toUInt()

public actual fun rtlFindClosestEncodableLength(sourcelength: ULong, targetlength: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlFindClosestEncodableLength(sourcelength.toLong(), (targetlength?.value ?: 0L))

public actual fun rtlFindFirstRunClear(bitmapheader: COpaquePointer?, startingindex: COpaquePointer?): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlFindFirstRunClear((bitmapheader?.value ?: 0L), (startingindex?.value ?: 0L)).toUInt()

public actual fun rtlFindLastBackwardRunClear(bitmapheader: COpaquePointer?, fromindex: UInt, startingrunindex: COpaquePointer?): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlFindLastBackwardRunClear((bitmapheader?.value ?: 0L), fromindex.toInt(), (startingrunindex?.value ?: 0L)).toUInt()

public actual fun rtlFindLeastSignificantBit(set: ULong): Byte =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlFindLeastSignificantBit(set.toLong())

public actual fun rtlFindLongestRunClear(bitmapheader: COpaquePointer?, startingindex: COpaquePointer?): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlFindLongestRunClear((bitmapheader?.value ?: 0L), (startingindex?.value ?: 0L)).toUInt()

public actual fun rtlFindMostSignificantBit(set: ULong): Byte =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlFindMostSignificantBit(set.toLong())

public actual fun rtlFindNextForwardRunClear(bitmapheader: COpaquePointer?, fromindex: UInt, startingrunindex: COpaquePointer?): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlFindNextForwardRunClear((bitmapheader?.value ?: 0L), fromindex.toInt(), (startingrunindex?.value ?: 0L)).toUInt()

public actual fun rtlFindSetBits(bitmapheader: COpaquePointer?, numbertofind: UInt, hintindex: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlFindSetBits((bitmapheader?.value ?: 0L), numbertofind.toInt(), hintindex.toInt()).toUInt()

public actual fun rtlFindSetBitsAndClear(bitmapheader: COpaquePointer?, numbertofind: UInt, hintindex: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlFindSetBitsAndClear((bitmapheader?.value ?: 0L), numbertofind.toInt(), hintindex.toInt()).toUInt()

public actual fun rtlFreeUTF8String(utf8string: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlFreeUTF8String((utf8string?.value ?: 0L))
}

public actual fun rtlGUIDFromString(guidstring: COpaquePointer?, guid: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlGUIDFromString((guidstring?.value ?: 0L), (guid?.value ?: 0L))

public actual fun rtlGenerateClass5Guid(namespaceguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt, guid: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlGenerateClass5Guid((namespaceguid?.value ?: 0L), (buffer?.value ?: 0L), buffersize.toInt(), (guid?.value ?: 0L))

public actual fun rtlGetActiveConsoleId(): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlGetActiveConsoleId().toUInt()

public actual fun rtlGetCallersAddress(callersaddress: COpaquePointer?, callerscaller: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlGetCallersAddress((callersaddress?.value ?: 0L), (callerscaller?.value ?: 0L))
}

public actual fun rtlGetConsoleSessionForegroundProcessId(): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlGetConsoleSessionForegroundProcessId().toULong()

public actual fun rtlGetElementGenericTable(table: COpaquePointer?, i: UInt): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlGetElementGenericTable((table?.value ?: 0L), i.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlGetElementGenericTableAvl(table: COpaquePointer?, i: UInt): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlGetElementGenericTableAvl((table?.value ?: 0L), i.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlGetEnabledExtendedFeatures(featuremask: ULong): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlGetEnabledExtendedFeatures(featuremask.toLong()).toULong()

public actual fun rtlGetNextEntryHashTable(hashtable: COpaquePointer?, context: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlGetNextEntryHashTable((hashtable?.value ?: 0L), (context?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlGetNtProductType(ntproducttype: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlGetNtProductType((ntproducttype?.value ?: 0L))

public actual fun rtlGetNtSystemRoot(): Pcwstr =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlGetNtSystemRoot().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlGetPersistedStateLocation(sourceid: Pcwstr, customvalue: Pcwstr, defaultpath: Pcwstr, statelocationtype: StateLocationType, targetpath: Pwstr, bufferlengthin: UInt, bufferlengthout: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlGetPersistedStateLocation((sourceid?.value ?: 0L), (customvalue?.value ?: 0L), (defaultpath?.value ?: 0L), statelocationtype, (targetpath?.value ?: 0L), bufferlengthin.toInt(), (bufferlengthout?.value ?: 0L))

public actual fun rtlGetSuiteMask(): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlGetSuiteMask().toUInt()

public actual fun rtlGetVersion(lpversioninformation: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlGetVersion((lpversioninformation?.value ?: 0L))

public actual fun rtlHashUnicodeString(string: COpaquePointer?, caseinsensitive: Boolean, hashalgorithm: UInt, hashvalue: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlHashUnicodeString((string?.value ?: 0L), caseinsensitive, hashalgorithm.toInt(), (hashvalue?.value ?: 0L))

public actual fun rtlInitEnumerationHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlInitEnumerationHashTable((hashtable?.value ?: 0L), (enumerator?.value ?: 0L))

public actual fun rtlInitStrongEnumerationHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlInitStrongEnumerationHashTable((hashtable?.value ?: 0L), (enumerator?.value ?: 0L))

public actual fun rtlInitUTF8String(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlInitUTF8String((destinationstring?.value ?: 0L), (sourcestring?.value ?: 0L))
}

public actual fun rtlInitUTF8StringEx(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlInitUTF8StringEx((destinationstring?.value ?: 0L), (sourcestring?.value ?: 0L))

public actual fun rtlInitWeakEnumerationHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlInitWeakEnumerationHashTable((hashtable?.value ?: 0L), (enumerator?.value ?: 0L))

public actual fun rtlInitializeBitMap(bitmapheader: COpaquePointer?, bitmapbuffer: COpaquePointer?, sizeofbitmap: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlInitializeBitMap((bitmapheader?.value ?: 0L), (bitmapbuffer?.value ?: 0L), sizeofbitmap.toInt())
}

public actual fun rtlInitializeGenericTable(table: COpaquePointer?, compareroutine: PrtlGenericCompareRoutine, allocateroutine: PrtlGenericAllocateRoutine, freeroutine: PrtlGenericFreeRoutine, tablecontext: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlInitializeGenericTable((table?.value ?: 0L), 0L, 0L, 0L, (tablecontext?.value ?: 0L))
}

public actual fun rtlInitializeGenericTableAvl(table: COpaquePointer?, compareroutine: PrtlAvlCompareRoutine, allocateroutine: PrtlAvlAllocateRoutine, freeroutine: PrtlAvlFreeRoutine, tablecontext: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlInitializeGenericTableAvl((table?.value ?: 0L), 0L, 0L, 0L, (tablecontext?.value ?: 0L))
}

public actual fun rtlInsertElementGenericTable(table: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt, newelement: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlInsertElementGenericTable((table?.value ?: 0L), (buffer?.value ?: 0L), buffersize.toInt(), (newelement?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlInsertElementGenericTableAvl(table: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt, newelement: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlInsertElementGenericTableAvl((table?.value ?: 0L), (buffer?.value ?: 0L), buffersize.toInt(), (newelement?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlInsertElementGenericTableFull(table: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt, newelement: COpaquePointer?, nodeorparent: COpaquePointer?, searchresult: TableSearchResult): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlInsertElementGenericTableFull((table?.value ?: 0L), (buffer?.value ?: 0L), buffersize.toInt(), (newelement?.value ?: 0L), (nodeorparent?.value ?: 0L), searchresult).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlInsertElementGenericTableFullAvl(table: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt, newelement: COpaquePointer?, nodeorparent: COpaquePointer?, searchresult: TableSearchResult): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlInsertElementGenericTableFullAvl((table?.value ?: 0L), (buffer?.value ?: 0L), buffersize.toInt(), (newelement?.value ?: 0L), (nodeorparent?.value ?: 0L), searchresult).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlInsertEntryHashTable(hashtable: COpaquePointer?, entry: COpaquePointer?, signature: ULong, context: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlInsertEntryHashTable((hashtable?.value ?: 0L), (entry?.value ?: 0L), signature.toLong(), (context?.value ?: 0L))

public actual fun rtlInt64ToUnicodeString(value: ULong, base: UInt, string: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlInt64ToUnicodeString(value.toLong(), base.toInt(), (string?.value ?: 0L))

public actual fun rtlIntegerToUnicodeString(value: UInt, base: UInt, string: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlIntegerToUnicodeString(value.toInt(), base.toInt(), (string?.value ?: 0L))

public actual fun rtlIoDecodeMemIoResource(descriptor: COpaquePointer?, alignment: COpaquePointer?, minimumaddress: COpaquePointer?, maximumaddress: COpaquePointer?): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlIoDecodeMemIoResource((descriptor?.value ?: 0L), (alignment?.value ?: 0L), (minimumaddress?.value ?: 0L), (maximumaddress?.value ?: 0L)).toULong()

public actual fun rtlIoEncodeMemIoResource(descriptor: COpaquePointer?, type: UByte, length: ULong, alignment: ULong, minimumaddress: ULong, maximumaddress: ULong): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlIoEncodeMemIoResource((descriptor?.value ?: 0L), type.toByte(), length.toLong(), alignment.toLong(), minimumaddress.toLong(), maximumaddress.toLong())

public actual fun rtlIsApiSetImplemented(apisetname: Pcstr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlIsApiSetImplemented((apisetname?.value ?: 0L))

public actual fun rtlIsGenericTableEmpty(table: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlIsGenericTableEmpty((table?.value ?: 0L))

public actual fun rtlIsGenericTableEmptyAvl(table: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlIsGenericTableEmptyAvl((table?.value ?: 0L))

public actual fun rtlIsMultiSessionSku(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlIsMultiSessionSku()

public actual fun rtlIsMultiUsersInSessionSku(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlIsMultiUsersInSessionSku()

public actual fun rtlIsNtDdiVersionAvailable(version: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlIsNtDdiVersionAvailable(version.toInt())

public actual fun rtlIsServicePackVersionInstalled(version: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlIsServicePackVersionInstalled(version.toInt())

public actual fun rtlIsStateSeparationEnabled(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlIsStateSeparationEnabled()

public actual fun rtlIsUntrustedObject(handle: Handle, obj: COpaquePointer?, untrustedobject: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlIsUntrustedObject((handle?.value ?: 0L), (obj?.value ?: 0L), (untrustedobject?.value ?: 0L))

public actual fun rtlLengthSecurityDescriptor(securitydescriptor: PsecurityDescriptor): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlLengthSecurityDescriptor((securitydescriptor?.value ?: 0L)).toUInt()

public actual fun rtlLookupElementGenericTable(table: COpaquePointer?, buffer: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlLookupElementGenericTable((table?.value ?: 0L), (buffer?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlLookupElementGenericTableAvl(table: COpaquePointer?, buffer: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlLookupElementGenericTableAvl((table?.value ?: 0L), (buffer?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlLookupElementGenericTableFull(table: COpaquePointer?, buffer: COpaquePointer?, nodeorparent: COpaquePointer?, searchresult: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlLookupElementGenericTableFull((table?.value ?: 0L), (buffer?.value ?: 0L), (nodeorparent?.value ?: 0L), (searchresult?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlLookupElementGenericTableFullAvl(table: COpaquePointer?, buffer: COpaquePointer?, nodeorparent: COpaquePointer?, searchresult: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlLookupElementGenericTableFullAvl((table?.value ?: 0L), (buffer?.value ?: 0L), (nodeorparent?.value ?: 0L), (searchresult?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlLookupEntryHashTable(hashtable: COpaquePointer?, signature: ULong, context: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlLookupEntryHashTable((hashtable?.value ?: 0L), signature.toLong(), (context?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlLookupFirstMatchingElementGenericTableAvl(table: COpaquePointer?, buffer: COpaquePointer?, restartkey: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlLookupFirstMatchingElementGenericTableAvl((table?.value ?: 0L), (buffer?.value ?: 0L), (restartkey?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlMapGenericMask(accessmask: COpaquePointer?, genericmapping: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlMapGenericMask((accessmask?.value ?: 0L), (genericmapping?.value ?: 0L))
}

public actual fun rtlNormalizeSecurityDescriptor(securitydescriptor: COpaquePointer?, securitydescriptorlength: UInt, newsecuritydescriptor: COpaquePointer?, newsecuritydescriptorlength: COpaquePointer?, checkonly: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlNormalizeSecurityDescriptor((securitydescriptor?.value ?: 0L), securitydescriptorlength.toInt(), (newsecuritydescriptor?.value ?: 0L), (newsecuritydescriptorlength?.value ?: 0L), checkonly)

public actual fun rtlNumberGenericTableElements(table: COpaquePointer?): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlNumberGenericTableElements((table?.value ?: 0L)).toUInt()

public actual fun rtlNumberGenericTableElementsAvl(table: COpaquePointer?): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlNumberGenericTableElementsAvl((table?.value ?: 0L)).toUInt()

public actual fun rtlNumberOfClearBits(bitmapheader: COpaquePointer?): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlNumberOfClearBits((bitmapheader?.value ?: 0L)).toUInt()

public actual fun rtlNumberOfClearBitsInRange(bitmapheader: COpaquePointer?, startingindex: UInt, length: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlNumberOfClearBitsInRange((bitmapheader?.value ?: 0L), startingindex.toInt(), length.toInt()).toUInt()

public actual fun rtlNumberOfSetBits(bitmapheader: COpaquePointer?): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlNumberOfSetBits((bitmapheader?.value ?: 0L)).toUInt()

public actual fun rtlNumberOfSetBitsInRange(bitmapheader: COpaquePointer?, startingindex: UInt, length: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlNumberOfSetBitsInRange((bitmapheader?.value ?: 0L), startingindex.toInt(), length.toInt()).toUInt()

public actual fun rtlNumberOfSetBitsUlongPtr(target: ULong): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlNumberOfSetBitsUlongPtr(target.toLong()).toUInt()

public actual fun rtlPrefetchMemoryNonTemporal(source: COpaquePointer?, length: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlPrefetchMemoryNonTemporal((source?.value ?: 0L), length.toLong())
}

public actual fun rtlPrefixUnicodeString(string1: COpaquePointer?, string2: COpaquePointer?, caseinsensitive: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlPrefixUnicodeString((string1?.value ?: 0L), (string2?.value ?: 0L), caseinsensitive)

public actual fun rtlQueryRegistryValueWithFallback(primaryhandle: Handle, fallbackhandle: Handle, valuename: COpaquePointer?, valuelength: UInt, valuetype: COpaquePointer?, valuedata: COpaquePointer?, resultlength: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlQueryRegistryValueWithFallback((primaryhandle?.value ?: 0L), (fallbackhandle?.value ?: 0L), (valuename?.value ?: 0L), valuelength.toInt(), (valuetype?.value ?: 0L), (valuedata?.value ?: 0L), (resultlength?.value ?: 0L))

public actual fun rtlQueryRegistryValues(relativeto: UInt, path: Pcwstr, querytable: COpaquePointer?, context: COpaquePointer?, environment: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlQueryRegistryValues(relativeto.toInt(), (path?.value ?: 0L), (querytable?.value ?: 0L), (context?.value ?: 0L), (environment?.value ?: 0L))

public actual fun rtlQueryValidationRunlevel(componentname: COpaquePointer?): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlQueryValidationRunlevel((componentname?.value ?: 0L)).toUInt()

public actual fun rtlRealPredecessor(links: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlRealPredecessor((links?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlRealSuccessor(links: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlRealSuccessor((links?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlRemoveEntryHashTable(hashtable: COpaquePointer?, entry: COpaquePointer?, context: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlRemoveEntryHashTable((hashtable?.value ?: 0L), (entry?.value ?: 0L), (context?.value ?: 0L))

public actual fun rtlRunOnceBeginInitialize(runonce: COpaquePointer?, flags: UInt, context: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlRunOnceBeginInitialize((runonce?.value ?: 0L), flags.toInt(), (context?.value ?: 0L))

public actual fun rtlRunOnceComplete(runonce: COpaquePointer?, flags: UInt, context: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlRunOnceComplete((runonce?.value ?: 0L), flags.toInt(), (context?.value ?: 0L))

public actual fun rtlRunOnceExecuteOnce(runonce: COpaquePointer?, initfn: PrtlRunOnceInitFn, parameter: COpaquePointer?, context: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlRunOnceExecuteOnce((runonce?.value ?: 0L), 0L, (parameter?.value ?: 0L), (context?.value ?: 0L))

public actual fun rtlRunOnceInitialize(runonce: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlRunOnceInitialize((runonce?.value ?: 0L))
}

public actual fun rtlSetAllBits(bitmapheader: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlSetAllBits((bitmapheader?.value ?: 0L))
}

public actual fun rtlSetBit(bitmapheader: COpaquePointer?, bitnumber: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlSetBit((bitmapheader?.value ?: 0L), bitnumber.toInt())
}

public actual fun rtlSetBits(bitmapheader: COpaquePointer?, startingindex: UInt, numbertoset: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlSetBits((bitmapheader?.value ?: 0L), startingindex.toInt(), numbertoset.toInt())
}

public actual fun rtlSetDaclSecurityDescriptor(securitydescriptor: PsecurityDescriptor, daclpresent: Boolean, dacl: COpaquePointer?, dacldefaulted: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlSetDaclSecurityDescriptor((securitydescriptor?.value ?: 0L), daclpresent, (dacl?.value ?: 0L), dacldefaulted)

public actual fun rtlSetSystemGlobalData(dataid: RtlSystemGlobalDataId, buffer: COpaquePointer?, size: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlSetSystemGlobalData(dataid, (buffer?.value ?: 0L), size.toInt())

public actual fun rtlSplay(links: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlSplay((links?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlStringFromGUID(guid: COpaquePointer?, guidstring: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlStringFromGUID((guid?.value ?: 0L), (guidstring?.value ?: 0L))

public actual fun rtlStronglyEnumerateEntryHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlStronglyEnumerateEntryHashTable((hashtable?.value ?: 0L), (enumerator?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlSubtreePredecessor(links: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlSubtreePredecessor((links?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlSubtreeSuccessor(links: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlSubtreeSuccessor((links?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlSuffixUnicodeString(string1: COpaquePointer?, string2: COpaquePointer?, caseinsensitive: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlSuffixUnicodeString((string1?.value ?: 0L), (string2?.value ?: 0L), caseinsensitive)

public actual fun rtlTestBit(bitmapheader: COpaquePointer?, bitnumber: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlTestBit((bitmapheader?.value ?: 0L), bitnumber.toInt())

public actual fun rtlTimeFieldsToTime(timefields: COpaquePointer?, time: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlTimeFieldsToTime((timefields?.value ?: 0L), (time?.value ?: 0L))

public actual fun rtlTimeToTimeFields(time: COpaquePointer?, timefields: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlTimeToTimeFields((time?.value ?: 0L), (timefields?.value ?: 0L))
}

public actual fun rtlUTF8StringToUnicodeString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlUTF8StringToUnicodeString((destinationstring?.value ?: 0L), (sourcestring?.value ?: 0L), allocatedestinationstring)

public actual fun rtlUTF8ToUnicodeN(unicodestringdestination: Pwstr, unicodestringmaxbytecount: UInt, unicodestringactualbytecount: COpaquePointer?, utf8stringsource: Pcstr, utf8stringbytecount: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlUTF8ToUnicodeN((unicodestringdestination?.value ?: 0L), unicodestringmaxbytecount.toInt(), (unicodestringactualbytecount?.value ?: 0L), (utf8stringsource?.value ?: 0L), utf8stringbytecount.toInt())

public actual fun rtlUnicodeStringToInt64(string: COpaquePointer?, base: UInt, number: COpaquePointer?, endpointer: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlUnicodeStringToInt64((string?.value ?: 0L), base.toInt(), (number?.value ?: 0L), (endpointer?.value ?: 0L))

public actual fun rtlUnicodeStringToInteger(string: COpaquePointer?, base: UInt, value: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlUnicodeStringToInteger((string?.value ?: 0L), base.toInt(), (value?.value ?: 0L))

public actual fun rtlUnicodeStringToUTF8String(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlUnicodeStringToUTF8String((destinationstring?.value ?: 0L), (sourcestring?.value ?: 0L), allocatedestinationstring)

public actual fun rtlUnicodeToUTF8N(utf8stringdestination: Pstr, utf8stringmaxbytecount: UInt, utf8stringactualbytecount: COpaquePointer?, unicodestringsource: COpaquePointer?, unicodestringbytecount: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlUnicodeToUTF8N((utf8stringdestination?.value ?: 0L), utf8stringmaxbytecount.toInt(), (utf8stringactualbytecount?.value ?: 0L), (unicodestringsource?.value ?: 0L), unicodestringbytecount.toInt())

public actual fun rtlUpcaseUnicodeChar(sourcecharacter: UShort): UShort =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlUpcaseUnicodeChar(sourcecharacter.toShort()).toUShort()

public actual fun rtlUpcaseUnicodeString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlUpcaseUnicodeString((destinationstring?.value ?: 0L), (sourcestring?.value ?: 0L), allocatedestinationstring)

public actual fun rtlUpperChar(character: Byte): Byte =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlUpperChar(character)

public actual fun rtlUpperString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlUpperString((destinationstring?.value ?: 0L), (sourcestring?.value ?: 0L))
}

public actual fun rtlValidRelativeSecurityDescriptor(securitydescriptorinput: PsecurityDescriptor, securitydescriptorlength: UInt, requiredinformation: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlValidRelativeSecurityDescriptor((securitydescriptorinput?.value ?: 0L), securitydescriptorlength.toInt(), requiredinformation.toInt())

public actual fun rtlValidSecurityDescriptor(securitydescriptor: PsecurityDescriptor): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlValidSecurityDescriptor((securitydescriptor?.value ?: 0L))

public actual fun rtlVerifyVersionInfo(versioninfo: COpaquePointer?, typemask: UInt, conditionmask: ULong): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlVerifyVersionInfo((versioninfo?.value ?: 0L), typemask.toInt(), conditionmask.toLong())

public actual fun rtlVolumeDeviceToDosName(volumedeviceobject: COpaquePointer?, dosname: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlVolumeDeviceToDosName((volumedeviceobject?.value ?: 0L), (dosname?.value ?: 0L))

public actual fun rtlWalkFrameChain(callers: COpaquePointer?, count: UInt, flags: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlWalkFrameChain((callers?.value ?: 0L), count.toInt(), flags.toInt()).toUInt()

public actual fun rtlWeaklyEnumerateEntryHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlWeaklyEnumerateEntryHashTable((hashtable?.value ?: 0L), (enumerator?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtlWriteRegistryValue(relativeto: UInt, path: Pcwstr, valuename: Pcwstr, valuetype: UInt, valuedata: COpaquePointer?, valuelength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlWriteRegistryValue(relativeto.toInt(), (path?.value ?: 0L), (valuename?.value ?: 0L), valuetype.toInt(), (valuedata?.value ?: 0L), valuelength.toInt())

public actual fun rtlxAnsiStringToUnicodeSize(ansistring: COpaquePointer?): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlxAnsiStringToUnicodeSize((ansistring?.value ?: 0L)).toUInt()

public actual fun rtlxUnicodeStringToAnsiSize(unicodestring: COpaquePointer?): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_rtlxUnicodeStringToAnsiSize((unicodestring?.value ?: 0L)).toUInt()

public actual fun seAccessCheck(securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: COpaquePointer?, subjectcontextlocked: Boolean, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: COpaquePointer?, genericmapping: COpaquePointer?, accessmode: Byte, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_seAccessCheck((securitydescriptor?.value ?: 0L), (subjectsecuritycontext?.value ?: 0L), subjectcontextlocked, desiredaccess.toInt(), previouslygrantedaccess.toInt(), (privileges?.value ?: 0L), (genericmapping?.value ?: 0L), accessmode, (grantedaccess?.value ?: 0L), (accessstatus?.value ?: 0L))

public actual fun seAssignSecurity(parentdescriptor: PsecurityDescriptor, explicitdescriptor: PsecurityDescriptor, newdescriptor: COpaquePointer?, isdirectoryobject: Boolean, subjectcontext: COpaquePointer?, genericmapping: COpaquePointer?, pooltype: PoolType): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_seAssignSecurity((parentdescriptor?.value ?: 0L), (explicitdescriptor?.value ?: 0L), (newdescriptor?.value ?: 0L), isdirectoryobject, (subjectcontext?.value ?: 0L), (genericmapping?.value ?: 0L), pooltype)

public actual fun seAssignSecurityEx(parentdescriptor: PsecurityDescriptor, explicitdescriptor: PsecurityDescriptor, newdescriptor: COpaquePointer?, objecttype: COpaquePointer?, isdirectoryobject: Boolean, autoinheritflags: UInt, subjectcontext: COpaquePointer?, genericmapping: COpaquePointer?, pooltype: PoolType): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_seAssignSecurityEx((parentdescriptor?.value ?: 0L), (explicitdescriptor?.value ?: 0L), (newdescriptor?.value ?: 0L), (objecttype?.value ?: 0L), isdirectoryobject, autoinheritflags.toInt(), (subjectcontext?.value ?: 0L), (genericmapping?.value ?: 0L), pooltype)

public actual fun seCaptureSubjectContext(subjectcontext: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_seCaptureSubjectContext((subjectcontext?.value ?: 0L))
}

public actual fun seComputeAutoInheritByObjectType(objecttype: COpaquePointer?, securitydescriptor: PsecurityDescriptor, parentsecuritydescriptor: PsecurityDescriptor): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_seComputeAutoInheritByObjectType((objecttype?.value ?: 0L), (securitydescriptor?.value ?: 0L), (parentsecuritydescriptor?.value ?: 0L)).toUInt()

public actual fun seDeassignSecurity(securitydescriptor: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_seDeassignSecurity((securitydescriptor?.value ?: 0L))

public actual fun seEtwWriteKMCveEvent(cveid: COpaquePointer?, additionaldetails: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_seEtwWriteKMCveEvent((cveid?.value ?: 0L), (additionaldetails?.value ?: 0L))

public actual fun seLockSubjectContext(subjectcontext: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_seLockSubjectContext((subjectcontext?.value ?: 0L))
}

public actual fun seRegisterImageVerificationCallback(imagetype: SeImageType, callbacktype: SeImageVerificationCallbackType, callbackfunction: PseImageVerificationCallbackFunction, callbackcontext: COpaquePointer?, token: COpaquePointer?, callbackhandle: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_seRegisterImageVerificationCallback(imagetype, callbacktype, 0L, (callbackcontext?.value ?: 0L), (token?.value ?: 0L), (callbackhandle?.value ?: 0L))

public actual fun seReleaseSubjectContext(subjectcontext: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_seReleaseSubjectContext((subjectcontext?.value ?: 0L))
}

public actual fun seReportSecurityEvent(flags: UInt, sourcename: COpaquePointer?, usersid: Psid, auditparameters: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_seReportSecurityEvent(flags.toInt(), (sourcename?.value ?: 0L), (usersid?.value ?: 0L), (auditparameters?.value ?: 0L))

public actual fun seSetAuditParameter(auditparameters: COpaquePointer?, type: SeAdtParameterType, index: UInt, data: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_seSetAuditParameter((auditparameters?.value ?: 0L), type, index.toInt(), (data?.value ?: 0L))

public actual fun seSinglePrivilegeCheck(privilegevalue: Luid, previousmode: Byte): Boolean =
    false

public actual fun seUnlockSubjectContext(subjectcontext: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_seUnlockSubjectContext((subjectcontext?.value ?: 0L))
}

public actual fun seUnregisterImageVerificationCallback(callbackhandle: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_seUnregisterImageVerificationCallback((callbackhandle?.value ?: 0L))
}

public actual fun seValidSecurityDescriptor(length: UInt, securitydescriptor: PsecurityDescriptor): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_seValidSecurityDescriptor(length.toInt(), (securitydescriptor?.value ?: 0L))

public actual fun tmCommitComplete(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_tmCommitComplete((enlistment?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun tmCommitEnlistment(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_tmCommitEnlistment((enlistment?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun tmCommitTransaction(transaction: COpaquePointer?, wait: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_tmCommitTransaction((transaction?.value ?: 0L), wait)

public actual fun tmCreateEnlistment(enlistmenthandle: COpaquePointer?, previousmode: Byte, desiredaccess: UInt, objectattributes: COpaquePointer?, resourcemanager: COpaquePointer?, transaction: COpaquePointer?, createoptions: UInt, notificationmask: UInt, enlistmentkey: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_tmCreateEnlistment((enlistmenthandle?.value ?: 0L), previousmode, desiredaccess.toInt(), (objectattributes?.value ?: 0L), (resourcemanager?.value ?: 0L), (transaction?.value ?: 0L), createoptions.toInt(), notificationmask.toInt(), (enlistmentkey?.value ?: 0L))

public actual fun tmDereferenceEnlistmentKey(enlistment: COpaquePointer?, lastreference: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_tmDereferenceEnlistmentKey((enlistment?.value ?: 0L), (lastreference?.value ?: 0L))

public actual fun tmEnableCallbacks(resourcemanager: COpaquePointer?, callbackroutine: PtmRmNotification, rmkey: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_tmEnableCallbacks((resourcemanager?.value ?: 0L), 0L, (rmkey?.value ?: 0L))

public actual fun tmGetTransactionId(transaction: COpaquePointer?, transactionid: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_tmGetTransactionId((transaction?.value ?: 0L), (transactionid?.value ?: 0L))
}

public actual fun tmInitializeTransactionManager(transactionmanager: COpaquePointer?, logfilename: COpaquePointer?, tmid: COpaquePointer?, createoptions: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_tmInitializeTransactionManager((transactionmanager?.value ?: 0L), (logfilename?.value ?: 0L), (tmid?.value ?: 0L), createoptions.toInt())

public actual fun tmIsTransactionActive(transaction: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_tmIsTransactionActive((transaction?.value ?: 0L))

public actual fun tmPrePrepareComplete(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_tmPrePrepareComplete((enlistment?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun tmPrePrepareEnlistment(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_tmPrePrepareEnlistment((enlistment?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun tmPrepareComplete(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_tmPrepareComplete((enlistment?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun tmPrepareEnlistment(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_tmPrepareEnlistment((enlistment?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun tmPropagationComplete(resourcemanager: COpaquePointer?, requestcookie: UInt, bufferlength: UInt, buffer: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_tmPropagationComplete((resourcemanager?.value ?: 0L), requestcookie.toInt(), bufferlength.toInt(), (buffer?.value ?: 0L))

public actual fun tmPropagationFailed(resourcemanager: COpaquePointer?, requestcookie: UInt, status: Ntstatus): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_tmPropagationFailed((resourcemanager?.value ?: 0L), requestcookie.toInt(), status)

public actual fun tmReadOnlyEnlistment(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_tmReadOnlyEnlistment((enlistment?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun tmRecoverEnlistment(enlistment: COpaquePointer?, enlistmentkey: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_tmRecoverEnlistment((enlistment?.value ?: 0L), (enlistmentkey?.value ?: 0L))

public actual fun tmRecoverResourceManager(resourcemanager: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_tmRecoverResourceManager((resourcemanager?.value ?: 0L))

public actual fun tmRecoverTransactionManager(tm: COpaquePointer?, targetvirtualclock: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_tmRecoverTransactionManager((tm?.value ?: 0L), (targetvirtualclock?.value ?: 0L))

public actual fun tmReferenceEnlistmentKey(enlistment: COpaquePointer?, key: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_tmReferenceEnlistmentKey((enlistment?.value ?: 0L), (key?.value ?: 0L))

public actual fun tmRenameTransactionManager(logfilename: COpaquePointer?, existingtransactionmanagerguid: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_tmRenameTransactionManager((logfilename?.value ?: 0L), (existingtransactionmanagerguid?.value ?: 0L))

public actual fun tmRequestOutcomeEnlistment(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_tmRequestOutcomeEnlistment((enlistment?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun tmRollbackComplete(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_tmRollbackComplete((enlistment?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun tmRollbackEnlistment(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_tmRollbackEnlistment((enlistment?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun tmRollbackTransaction(transaction: COpaquePointer?, wait: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_tmRollbackTransaction((transaction?.value ?: 0L), wait)

public actual fun tmSinglePhaseReject(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_tmSinglePhaseReject((enlistment?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun vslCreateSecureSection(handle: COpaquePointer?, targetprocess: Peprocess, mdl: COpaquePointer?, devicepageprotection: UInt, attributes: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_vslCreateSecureSection((handle?.value ?: 0L), targetprocess, (mdl?.value ?: 0L), devicepageprotection.toInt(), attributes.toInt())

public actual fun vslDeleteSecureSection(globalhandle: Handle): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_vslDeleteSecureSection((globalhandle?.value ?: 0L))

public actual fun wheaAddErrorSource(errorsource: COpaquePointer?, context: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_wheaAddErrorSource((errorsource?.value ?: 0L), (context?.value ?: 0L))

public actual fun wheaAddErrorSourceDeviceDriver(context: COpaquePointer?, configuration: COpaquePointer?, numberpreallocatederrorreports: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_wheaAddErrorSourceDeviceDriver((context?.value ?: 0L), (configuration?.value ?: 0L), numberpreallocatederrorreports.toInt())

public actual fun wheaAddErrorSourceDeviceDriverV1(context: COpaquePointer?, configuration: COpaquePointer?, numbufferstopreallocate: UInt, maxdatalength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_wheaAddErrorSourceDeviceDriverV1((context?.value ?: 0L), (configuration?.value ?: 0L), numbufferstopreallocate.toInt(), maxdatalength.toInt())

public actual fun wheaAddHwErrorReportSectionDeviceDriver(errorhandle: COpaquePointer?, sectiondatalength: UInt, bufferset: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_wheaAddHwErrorReportSectionDeviceDriver((errorhandle?.value ?: 0L), sectiondatalength.toInt(), (bufferset?.value ?: 0L))

public actual fun wheaConfigureErrorSource(sourcetype: WheaErrorSourceType, configuration: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_wheaConfigureErrorSource(sourcetype, (configuration?.value ?: 0L))

public actual fun wheaCreateHwErrorReportDeviceDriver(errorsourceid: UInt, deviceobject: COpaquePointer?): COpaquePointer? =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_wheaCreateHwErrorReportDeviceDriver(errorsourceid.toInt(), (deviceobject?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wheaErrorSourceGetState(errorsourceid: UInt): WheaErrorSourceState =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_wheaErrorSourceGetState(errorsourceid.toInt())

public actual fun wheaGetNotifyAllOfflinesPolicy(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_wheaGetNotifyAllOfflinesPolicy()

public actual fun wheaHighIrqlLogSelEventHandlerRegister(handler: PfnWheaHighIrqlLogSelEventHandler, context: COpaquePointer?): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_wheaHighIrqlLogSelEventHandlerRegister(0L, (context?.value ?: 0L))

public actual fun wheaHighIrqlLogSelEventHandlerUnregister() {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_wheaHighIrqlLogSelEventHandlerUnregister()
}

public actual fun wheaHwErrorReportAbandonDeviceDriver(errorhandle: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_wheaHwErrorReportAbandonDeviceDriver((errorhandle?.value ?: 0L))

public actual fun wheaHwErrorReportSetSectionNameDeviceDriver(bufferset: COpaquePointer?, namelength: UInt, name: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_wheaHwErrorReportSetSectionNameDeviceDriver((bufferset?.value ?: 0L), namelength.toInt(), (name?.value ?: 0L))

public actual fun wheaHwErrorReportSetSeverityDeviceDriver(errorhandle: COpaquePointer?, errorseverity: WheaErrorSeverity): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_wheaHwErrorReportSetSeverityDeviceDriver((errorhandle?.value ?: 0L), errorseverity)

public actual fun wheaHwErrorReportSubmitDeviceDriver(errorhandle: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_wheaHwErrorReportSubmitDeviceDriver((errorhandle?.value ?: 0L))

public actual fun wheaInitializeRecordHeader(header: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_wheaInitializeRecordHeader((header?.value ?: 0L))

public actual fun wheaIsCriticalState(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_wheaIsCriticalState()

public actual fun wheaLogInternalEvent(entry: COpaquePointer?) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_wheaLogInternalEvent((entry?.value ?: 0L))
}

public actual fun wheaRegisterInUsePageOfflineNotification(callback: PfnInUsePageOfflineNotify, context: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_wheaRegisterInUsePageOfflineNotification(0L, (context?.value ?: 0L))

public actual fun wheaRemoveErrorSource(errorsourceid: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_wheaRemoveErrorSource(errorsourceid.toInt())
}

public actual fun wheaRemoveErrorSourceDeviceDriver(errorsourceid: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_wheaRemoveErrorSourceDeviceDriver(errorsourceid.toInt())

public actual fun wheaReportHwError(errorpacket: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_wheaReportHwError((errorpacket?.value ?: 0L))

public actual fun wheaReportHwErrorDeviceDriver(errorsourceid: UInt, deviceobject: COpaquePointer?, errordata: COpaquePointer?, errordatalength: UInt, sectiontypeguid: COpaquePointer?, errorseverity: WheaErrorSeverity, devicefriendlyname: Pcstr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_wheaReportHwErrorDeviceDriver(errorsourceid.toInt(), (deviceobject?.value ?: 0L), (errordata?.value ?: 0L), errordatalength.toInt(), (sectiontypeguid?.value ?: 0L), errorseverity, (devicefriendlyname?.value ?: 0L))

public actual fun wheaUnconfigureErrorSource(sourcetype: WheaErrorSourceType): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_wheaUnconfigureErrorSource(sourcetype)

public actual fun wheaUnregisterInUsePageOfflineNotification(callback: PfnInUsePageOfflineNotify): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_wheaUnregisterInUsePageOfflineNotification(0L)

public actual fun wmiQueryTraceInformation(traceinformationclass: TraceInformationClass, traceinformation: COpaquePointer?, traceinformationlength: UInt, requiredlength: COpaquePointer?, buffer: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_wmiQueryTraceInformation(traceinformationclass, (traceinformation?.value ?: 0L), traceinformationlength.toInt(), (requiredlength?.value ?: 0L), (buffer?.value ?: 0L))

public actual fun zwAllocateLocallyUniqueId(luid: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwAllocateLocallyUniqueId((luid?.value ?: 0L))

public actual fun zwClose(handle: Handle): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwClose((handle?.value ?: 0L))

public actual fun zwCommitComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwCommitComplete((enlistmenthandle?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun zwCommitEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwCommitEnlistment((enlistmenthandle?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun zwCommitTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwCommitTransaction((transactionhandle?.value ?: 0L), wait)

public actual fun zwCreateEnlistment(enlistmenthandle: COpaquePointer?, desiredaccess: UInt, resourcemanagerhandle: Handle, transactionhandle: Handle, objectattributes: COpaquePointer?, createoptions: UInt, notificationmask: UInt, enlistmentkey: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwCreateEnlistment((enlistmenthandle?.value ?: 0L), desiredaccess.toInt(), (resourcemanagerhandle?.value ?: 0L), (transactionhandle?.value ?: 0L), (objectattributes?.value ?: 0L), createoptions.toInt(), notificationmask.toInt(), (enlistmentkey?.value ?: 0L))

public actual fun zwCreateFile(filehandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, allocationsize: COpaquePointer?, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: COpaquePointer?, ealength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwCreateFile((filehandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), (iostatusblock?.value ?: 0L), (allocationsize?.value ?: 0L), fileattributes.toInt(), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), (eabuffer?.value ?: 0L), ealength.toInt())

public actual fun zwCreateResourceManager(resourcemanagerhandle: COpaquePointer?, desiredaccess: UInt, tmhandle: Handle, resourcemanagerguid: COpaquePointer?, objectattributes: COpaquePointer?, createoptions: UInt, description: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwCreateResourceManager((resourcemanagerhandle?.value ?: 0L), desiredaccess.toInt(), (tmhandle?.value ?: 0L), (resourcemanagerguid?.value ?: 0L), (objectattributes?.value ?: 0L), createoptions.toInt(), (description?.value ?: 0L))

public actual fun zwCreateSection(sectionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, maximumsize: COpaquePointer?, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwCreateSection((sectionhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), (maximumsize?.value ?: 0L), sectionpageprotection.toInt(), allocationattributes.toInt(), (filehandle?.value ?: 0L))

public actual fun zwCreateTransaction(transactionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, uow: COpaquePointer?, tmhandle: Handle, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: COpaquePointer?, description: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwCreateTransaction((transactionhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), (uow?.value ?: 0L), (tmhandle?.value ?: 0L), createoptions.toInt(), isolationlevel.toInt(), isolationflags.toInt(), (timeout?.value ?: 0L), (description?.value ?: 0L))

public actual fun zwCreateTransactionManager(tmhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, logfilename: COpaquePointer?, createoptions: UInt, commitstrength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwCreateTransactionManager((tmhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), (logfilename?.value ?: 0L), createoptions.toInt(), commitstrength.toInt())

public actual fun zwDeviceIoControlFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, iocontrolcode: UInt, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwDeviceIoControlFile((filehandle?.value ?: 0L), (event?.value ?: 0L), 0L, (apccontext?.value ?: 0L), (iostatusblock?.value ?: 0L), iocontrolcode.toInt(), (inputbuffer?.value ?: 0L), inputbufferlength.toInt(), (outputbuffer?.value ?: 0L), outputbufferlength.toInt())

public actual fun zwDisplayString(string: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwDisplayString((string?.value ?: 0L))

public actual fun zwEnumerateTransactionObject(rootobjecthandle: Handle, querytype: KtmobjectType, objectcursor: COpaquePointer?, objectcursorlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwEnumerateTransactionObject((rootobjecthandle?.value ?: 0L), querytype, (objectcursor?.value ?: 0L), objectcursorlength.toInt(), (returnlength?.value ?: 0L))

public actual fun zwGetNotificationResourceManager(resourcemanagerhandle: Handle, transactionnotification: COpaquePointer?, notificationlength: UInt, timeout: COpaquePointer?, returnlength: COpaquePointer?, asynchronous: UInt, asynchronouscontext: ULong): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwGetNotificationResourceManager((resourcemanagerhandle?.value ?: 0L), (transactionnotification?.value ?: 0L), notificationlength.toInt(), (timeout?.value ?: 0L), (returnlength?.value ?: 0L), asynchronous.toInt(), asynchronouscontext.toLong())

public actual fun zwLoadDriver(driverservicename: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwLoadDriver((driverservicename?.value ?: 0L))

public actual fun zwMakeTemporaryObject(handle: Handle): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwMakeTemporaryObject((handle?.value ?: 0L))

public actual fun zwManagePartition(targethandle: Handle, sourcehandle: Handle, partitioninformationclass: PartitionInformationClass, partitioninformation: COpaquePointer?, partitioninformationlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwManagePartition((targethandle?.value ?: 0L), (sourcehandle?.value ?: 0L), partitioninformationclass, (partitioninformation?.value ?: 0L), partitioninformationlength.toInt())

public actual fun zwOpenEnlistment(enlistmenthandle: COpaquePointer?, desiredaccess: UInt, rmhandle: Handle, enlistmentguid: COpaquePointer?, objectattributes: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwOpenEnlistment((enlistmenthandle?.value ?: 0L), desiredaccess.toInt(), (rmhandle?.value ?: 0L), (enlistmentguid?.value ?: 0L), (objectattributes?.value ?: 0L))

public actual fun zwOpenFile(filehandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, shareaccess: UInt, openoptions: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwOpenFile((filehandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), (iostatusblock?.value ?: 0L), shareaccess.toInt(), openoptions.toInt())

public actual fun zwOpenResourceManager(resourcemanagerhandle: COpaquePointer?, desiredaccess: UInt, tmhandle: Handle, resourcemanagerguid: COpaquePointer?, objectattributes: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwOpenResourceManager((resourcemanagerhandle?.value ?: 0L), desiredaccess.toInt(), (tmhandle?.value ?: 0L), (resourcemanagerguid?.value ?: 0L), (objectattributes?.value ?: 0L))

public actual fun zwOpenSymbolicLinkObject(linkhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwOpenSymbolicLinkObject((linkhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L))

public actual fun zwOpenTransaction(transactionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, uow: COpaquePointer?, tmhandle: Handle): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwOpenTransaction((transactionhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), (uow?.value ?: 0L), (tmhandle?.value ?: 0L))

public actual fun zwOpenTransactionManager(tmhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, logfilename: COpaquePointer?, tmidentity: COpaquePointer?, openoptions: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwOpenTransactionManager((tmhandle?.value ?: 0L), desiredaccess.toInt(), (objectattributes?.value ?: 0L), (logfilename?.value ?: 0L), (tmidentity?.value ?: 0L), openoptions.toInt())

public actual fun zwPowerInformation(informationlevel: PowerInformationLevel, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwPowerInformation(informationlevel, (inputbuffer?.value ?: 0L), inputbufferlength.toInt(), (outputbuffer?.value ?: 0L), outputbufferlength.toInt())

public actual fun zwPrePrepareComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwPrePrepareComplete((enlistmenthandle?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun zwPrePrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwPrePrepareEnlistment((enlistmenthandle?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun zwPrepareComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwPrepareComplete((enlistmenthandle?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun zwPrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwPrepareEnlistment((enlistmenthandle?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun zwPropagationComplete(resourcemanagerhandle: Handle, requestcookie: UInt, bufferlength: UInt, buffer: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwPropagationComplete((resourcemanagerhandle?.value ?: 0L), requestcookie.toInt(), bufferlength.toInt(), (buffer?.value ?: 0L))

public actual fun zwPropagationFailed(resourcemanagerhandle: Handle, requestcookie: UInt, propstatus: Ntstatus): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwPropagationFailed((resourcemanagerhandle?.value ?: 0L), requestcookie.toInt(), propstatus)

public actual fun zwQueryInformationByName(objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwQueryInformationByName((objectattributes?.value ?: 0L), (iostatusblock?.value ?: 0L), (fileinformation?.value ?: 0L), length.toInt(), fileinformationclass)

public actual fun zwQueryInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: COpaquePointer?, enlistmentinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwQueryInformationEnlistment((enlistmenthandle?.value ?: 0L), enlistmentinformationclass, (enlistmentinformation?.value ?: 0L), enlistmentinformationlength.toInt(), (returnlength?.value ?: 0L))

public actual fun zwQueryInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwQueryInformationFile((filehandle?.value ?: 0L), (iostatusblock?.value ?: 0L), (fileinformation?.value ?: 0L), length.toInt(), fileinformationclass)

public actual fun zwQueryInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: COpaquePointer?, resourcemanagerinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwQueryInformationResourceManager((resourcemanagerhandle?.value ?: 0L), resourcemanagerinformationclass, (resourcemanagerinformation?.value ?: 0L), resourcemanagerinformationlength.toInt(), (returnlength?.value ?: 0L))

public actual fun zwQueryInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: COpaquePointer?, transactioninformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwQueryInformationTransaction((transactionhandle?.value ?: 0L), transactioninformationclass, (transactioninformation?.value ?: 0L), transactioninformationlength.toInt(), (returnlength?.value ?: 0L))

public actual fun zwQueryInformationTransactionManager(transactionmanagerhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: COpaquePointer?, transactionmanagerinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwQueryInformationTransactionManager((transactionmanagerhandle?.value ?: 0L), transactionmanagerinformationclass, (transactionmanagerinformation?.value ?: 0L), transactionmanagerinformationlength.toInt(), (returnlength?.value ?: 0L))

public actual fun zwQuerySymbolicLinkObject(linkhandle: Handle, linktarget: COpaquePointer?, returnedlength: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwQuerySymbolicLinkObject((linkhandle?.value ?: 0L), (linktarget?.value ?: 0L), (returnedlength?.value ?: 0L))

public actual fun zwReadFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt, byteoffset: COpaquePointer?, key: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwReadFile((filehandle?.value ?: 0L), (event?.value ?: 0L), 0L, (apccontext?.value ?: 0L), (iostatusblock?.value ?: 0L), (buffer?.value ?: 0L), length.toInt(), (byteoffset?.value ?: 0L), (key?.value ?: 0L))

public actual fun zwReadOnlyEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwReadOnlyEnlistment((enlistmenthandle?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun zwRecoverEnlistment(enlistmenthandle: Handle, enlistmentkey: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwRecoverEnlistment((enlistmenthandle?.value ?: 0L), (enlistmentkey?.value ?: 0L))

public actual fun zwRecoverResourceManager(resourcemanagerhandle: Handle): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwRecoverResourceManager((resourcemanagerhandle?.value ?: 0L))

public actual fun zwRecoverTransactionManager(transactionmanagerhandle: Handle): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwRecoverTransactionManager((transactionmanagerhandle?.value ?: 0L))

public actual fun zwRegisterProtocolAddressInformation(resourcemanager: Handle, protocolid: COpaquePointer?, protocolinformationsize: UInt, protocolinformation: COpaquePointer?, createoptions: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwRegisterProtocolAddressInformation((resourcemanager?.value ?: 0L), (protocolid?.value ?: 0L), protocolinformationsize.toInt(), (protocolinformation?.value ?: 0L), createoptions.toInt())

public actual fun zwRenameTransactionManager(logfilename: COpaquePointer?, existingtransactionmanagerguid: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwRenameTransactionManager((logfilename?.value ?: 0L), (existingtransactionmanagerguid?.value ?: 0L))

public actual fun zwRollbackComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwRollbackComplete((enlistmenthandle?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun zwRollbackEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwRollbackEnlistment((enlistmenthandle?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun zwRollbackTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwRollbackTransaction((transactionhandle?.value ?: 0L), wait)

public actual fun zwRollforwardTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwRollforwardTransactionManager((transactionmanagerhandle?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun zwSetInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: COpaquePointer?, enlistmentinformationlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwSetInformationEnlistment((enlistmenthandle?.value ?: 0L), enlistmentinformationclass, (enlistmentinformation?.value ?: 0L), enlistmentinformationlength.toInt())

public actual fun zwSetInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwSetInformationFile((filehandle?.value ?: 0L), (iostatusblock?.value ?: 0L), (fileinformation?.value ?: 0L), length.toInt(), fileinformationclass)

public actual fun zwSetInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: COpaquePointer?, resourcemanagerinformationlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwSetInformationResourceManager((resourcemanagerhandle?.value ?: 0L), resourcemanagerinformationclass, (resourcemanagerinformation?.value ?: 0L), resourcemanagerinformationlength.toInt())

public actual fun zwSetInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: COpaquePointer?, transactioninformationlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwSetInformationTransaction((transactionhandle?.value ?: 0L), transactioninformationclass, (transactioninformation?.value ?: 0L), transactioninformationlength.toInt())

public actual fun zwSetInformationTransactionManager(tmhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: COpaquePointer?, transactionmanagerinformationlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwSetInformationTransactionManager((tmhandle?.value ?: 0L), transactionmanagerinformationclass, (transactionmanagerinformation?.value ?: 0L), transactionmanagerinformationlength.toInt())

public actual fun zwSinglePhaseReject(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwSinglePhaseReject((enlistmenthandle?.value ?: 0L), (tmvirtualclock?.value ?: 0L))

public actual fun zwUnloadDriver(driverservicename: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwUnloadDriver((driverservicename?.value ?: 0L))

public actual fun zwWriteFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt, byteoffset: COpaquePointer?, key: COpaquePointer?): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_zwWriteFile((filehandle?.value ?: 0L), (event?.value ?: 0L), 0L, (apccontext?.value ?: 0L), (iostatusblock?.value ?: 0L), (buffer?.value ?: 0L), length.toInt(), (byteoffset?.value ?: 0L), (key?.value ?: 0L))

public actual fun vDbgPrintEx(componentid: UInt, level: UInt, format: Pcstr, arglist: COpaquePointer?): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_vDbgPrintEx(componentid.toInt(), level.toInt(), (format?.value ?: 0L), (arglist?.value ?: 0L)).toUInt()

public actual fun vDbgPrintExWithPrefix(prefix: Pcstr, componentid: UInt, level: UInt, format: Pcstr, arglist: COpaquePointer?): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssys_windows_wdk_system_systemservices_vDbgPrintExWithPrefix((prefix?.value ?: 0L), componentid.toInt(), level.toInt(), (format?.value ?: 0L), (arglist?.value ?: 0L)).toUInt()
