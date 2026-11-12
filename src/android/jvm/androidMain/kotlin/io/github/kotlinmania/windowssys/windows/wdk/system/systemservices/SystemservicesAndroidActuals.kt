@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.systemservices

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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
    external fun windowssysWindowsWdkSystemSystemservicesClfsAddLogContainer(plfolog: Long, pcbcontainer: Long, puszcontainerpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsAddLogContainerSet(plfolog: Long, ccontainers: Short, pcbcontainer: Long, rguszcontainerpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsAdvanceLogBase(pvmarshalcontext: Long, plsnbase: Long, fflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsAlignReservedLog(pvmarshalcontext: Long, crecords: Int, rgcbreservation: Long, pcbalignreservation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsAllocReservedLog(pvmarshalcontext: Long, crecords: Int, pcbadjustment: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsCloseAndResetLogFile(plfolog: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsCloseLogFileObject(plfolog: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsCreateLogFile(pplfolog: Long, puszlogfilename: Long, fdesiredaccess: Int, dwsharemode: Int, psdlogfile: Long, fcreatedisposition: Int, fcreateoptions: Int, fflagsandattributes: Int, flogoptionflag: Int, pvcontext: Long, cbcontext: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsCreateScanContext(plfolog: Long, cfromcontainer: Int, ccontainers: Int, escanmode: Byte, pcxscan: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsDeleteLogByPointer(plfolog: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsDeleteLogFile(puszlogfilename: Long, pvreserved: Long, flogoptionflag: Int, pvcontext: Long, cbcontext: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsDeleteMarshallingArea(pvmarshalcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsFinalize()

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsFlushBuffers(pvmarshalcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsFlushToLsn(pvmarshalcontext: Long, plsnflush: Long, plsnlastflushed: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsFreeReservedLog(pvmarshalcontext: Long, crecords: Int, pcbadjustment: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsGetContainerName(plfolog: Long, cidlogicalcontainer: Int, puszcontainername: Long, pcactuallencontainername: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsGetIoStatistics(plfolog: Long, pvstatsbuffer: Long, cbstatsbuffer: Int, estatsclass: Int, pcbstatswritten: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsGetLogFileInformation(plfolog: Long, pinfobuffer: Long, pcbinfobuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsInitialize(): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsLsnBlockOffset(plsn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsLsnContainer(plsn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsLsnDifference(plsnstart: Long, plsnfinish: Long, cbcontainer: Int, cbmaxblock: Int, pcbdifference: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsLsnEqual(plsn1: Long, plsn2: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsLsnGreater(plsn1: Long, plsn2: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsLsnInvalid(plsn: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsLsnLess(plsn1: Long, plsn2: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsLsnNull(plsn: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsLsnRecordSequence(plsn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsMgmtDeregisterManagedClient(clientcookie: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsMgmtHandleLogFileFull(client: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsMgmtInstallPolicy(logfile: Long, policy: Long, policylength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsMgmtQueryPolicy(logfile: Long, policytype: Int, policy: Long, policylength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsMgmtRegisterManagedClient(logfile: Long, registrationdata: Long, clientcookie: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsMgmtRemovePolicy(logfile: Long, policytype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsMgmtSetLogFileSize(logfile: Long, newsizeincontainers: Long, resultingsizeincontainers: Long, completionroutine: Long, completionroutinedata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsMgmtSetLogFileSizeAsClient(logfile: Long, clientcookie: Long, newsizeincontainers: Long, resultingsizeincontainers: Long, completionroutine: Long, completionroutinedata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsMgmtTailAdvanceFailure(client: Long, reason: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsQueryLogFileInformation(plfolog: Long, einformationclass: Int, pinfoinputbuffer: Long, cbinfoinputbuffer: Int, pinfobuffer: Long, pcbinfobuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsReadLogRecord(pvmarshalcontext: Long, plsnfirst: Long, pecontextmode: Int, ppvreadbuffer: Long, pcbreadbuffer: Long, perecordtype: Long, plsnundonext: Long, plsnprevious: Long, ppvreadcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsReadNextLogRecord(pvreadcontext: Long, ppvbuffer: Long, pcbbuffer: Long, perecordtype: Long, plsnuser: Long, plsnundonext: Long, plsnprevious: Long, plsnrecord: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsReadPreviousRestartArea(pvreadcontext: Long, ppvrestartbuffer: Long, pcbrestartbuffer: Long, plsnrestart: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsReadRestartArea(pvmarshalcontext: Long, ppvrestartbuffer: Long, pcbrestartbuffer: Long, plsn: Long, ppvreadcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsRemoveLogContainer(plfolog: Long, puszcontainerpath: Long, fforce: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsRemoveLogContainerSet(plfolog: Long, ccontainers: Short, rgwszcontainerpath: Long, fforce: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsReserveAndAppendLog(pvmarshalcontext: Long, rgwriteentries: Long, cwriteentries: Int, plsnundonext: Long, plsnprevious: Long, creserverecords: Int, rgcbreservation: Long, fflags: Int, plsn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsReserveAndAppendLogAligned(pvmarshalcontext: Long, rgwriteentries: Long, cwriteentries: Int, cbentryalignment: Int, plsnundonext: Long, plsnprevious: Long, creserverecords: Int, rgcbreservation: Long, fflags: Int, plsn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsScanLogContainers(pcxscan: Long, escanmode: Byte): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsSetArchiveTail(plfolog: Long, plsnarchivetail: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsSetEndOfLog(plfolog: Long, plsnend: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsSetLogFileInformation(plfolog: Long, einformationclass: Int, pinfobuffer: Long, cbbuffer: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsTerminateReadLog(pvcursorcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesClfsWriteRestartArea(pvmarshalcontext: Long, pvrestartbuffer: Long, cbrestartbuffer: Int, plsnbase: Long, fflags: Int, pcbwritten: Long, plsnnext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesCmCallbackGetKeyObjectID(cookie: Long, obj: Long, objectid: Long, objectname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesCmCallbackGetKeyObjectIDEx(cookie: Long, obj: Long, objectid: Long, objectname: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesCmCallbackReleaseKeyObjectIDEx(objectname: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesCmGetBoundTransaction(cookie: Long, obj: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesCmGetCallbackVersion(major: Long, minor: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesCmRegisterCallback(function: Long, context: Long, cookie: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesCmRegisterCallbackEx(function: Long, altitude: Long, driver: Long, context: Long, cookie: Long, reserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesCmSetCallbackObjectContext(obj: Long, cookie: Long, newcontext: Long, oldcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesCmUnRegisterCallback(cookie: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesDbgBreakPointWithStatus(status: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesDbgPrint(format: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesDbgPrintEx(componentid: Int, level: Int, format: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesDbgPrintReturnControlC(format: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesDbgPrompt(prompt: Long, response: Long, length: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesDbgQueryDebugFilterState(componentid: Int, level: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesDbgSetDebugFilterState(componentid: Int, level: Int, state: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesDbgSetDebugPrintCallback(debugprintcallback: Long, enable: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesEtwActivityIdControl(controlcode: Int, activityid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesEtwEventEnabled(reghandle: Long, eventdescriptor: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesEtwProviderEnabled(reghandle: Long, level: Byte, keyword: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesEtwRegister(providerid: Long, enablecallback: Long, callbackcontext: Long, reghandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesEtwSetInformation(reghandle: Long, informationclass: Int, eventinformation: Long, informationlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesEtwUnregister(reghandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesEtwWrite(reghandle: Long, eventdescriptor: Long, activityid: Long, userdatacount: Int, userdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesEtwWriteEx(reghandle: Long, eventdescriptor: Long, filter: Long, flags: Int, activityid: Long, relatedactivityid: Long, userdatacount: Int, userdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesEtwWriteString(reghandle: Long, level: Byte, keyword: Long, activityid: Long, string: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesEtwWriteTransfer(reghandle: Long, eventdescriptor: Long, activityid: Long, relatedactivityid: Long, userdatacount: Int, userdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExAcquireFastMutex(fastmutex: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExAcquireFastMutexUnsafe(fastmutex: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExAcquirePushLockExclusiveEx(pushlock: Long, flags: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExAcquirePushLockSharedEx(pushlock: Long, flags: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExAcquireResourceExclusiveLite(resource: Long, wait: Boolean): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExAcquireResourceSharedLite(resource: Long, wait: Boolean): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExAcquireRundownProtection(runref: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExAcquireRundownProtectionCacheAware(runrefcacheaware: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExAcquireRundownProtectionCacheAwareEx(runrefcacheaware: Long, count: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExAcquireRundownProtectionEx(runref: Long, count: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExAcquireSharedStarveExclusive(resource: Long, wait: Boolean): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExAcquireSharedWaitForExclusive(resource: Long, wait: Boolean): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExAcquireSpinLockExclusive(spinlock: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExAcquireSpinLockExclusiveAtDpcLevel(spinlock: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExAcquireSpinLockShared(spinlock: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExAcquireSpinLockSharedAtDpcLevel(spinlock: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExAllocateCacheAwareRundownProtection(pooltype: Int, pooltag: Int): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExAllocatePool(pooltype: Int, numberofbytes: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExAllocatePool2(flags: Long, numberofbytes: Long, tag: Int): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExAllocatePool3(flags: Long, numberofbytes: Long, tag: Int, extendedparameters: Long, extendedparameterscount: Int): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExAllocatePoolWithQuota(pooltype: Int, numberofbytes: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExAllocatePoolWithQuotaTag(pooltype: Int, numberofbytes: Long, tag: Int): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExAllocatePoolWithTag(pooltype: Int, numberofbytes: Long, tag: Int): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExAllocatePoolWithTagPriority(pooltype: Int, numberofbytes: Long, tag: Int, priority: Int): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExAllocateTimer(callback: Long, callbackcontext: Long, attributes: Int): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExCancelTimer(timer: Long, parameters: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExCleanupRundownProtectionCacheAware(runrefcacheaware: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExConvertExclusiveToSharedLite(resource: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExCreateCallback(callbackobject: Long, objectattributes: Long, create: Boolean, allowmultiplecallbacks: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExCreatePool(flags: Int, tag: Long, params: Long, poolhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExDeleteResourceLite(resource: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExDeleteTimer(timer: Long, cancel: Boolean, wait: Boolean, parameters: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExDestroyPool(poolhandle: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExEnterCriticalRegionAndAcquireResourceExclusive(resource: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExEnterCriticalRegionAndAcquireResourceShared(resource: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExEnterCriticalRegionAndAcquireSharedWaitForExclusive(resource: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExEnumerateSystemFirmwareTables(firmwaretableprovidersignature: Int, firmwaretablebuffer: Long, bufferlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExExtendZone(zone: Long, segment: Long, segmentsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExFreeCacheAwareRundownProtection(runrefcacheaware: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExFreePool(p: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExFreePool2(p: Long, tag: Int, extendedparameters: Long, extendedparameterscount: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExFreePoolWithTag(p: Long, tag: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExGetExclusiveWaiterCount(resource: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExGetFirmwareEnvironmentVariable(variablename: Long, vendorguid: Long, value: Long, valuelength: Long, attributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExGetFirmwareType(): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExGetPreviousMode(): Byte

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExGetSharedWaiterCount(resource: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExGetSystemFirmwareTable(firmwaretableprovidersignature: Int, firmwaretableid: Int, firmwaretablebuffer: Long, bufferlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExInitializePushLock(pushlock: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExInitializeResourceLite(resource: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExInitializeRundownProtection(runref: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExInitializeRundownProtectionCacheAware(runrefcacheaware: Long, runrefsize: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExInitializeRundownProtectionCacheAwareEx(runrefcacheaware: Long, flags: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExInitializeZone(zone: Long, blocksize: Int, initialsegment: Long, initialsegmentsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExInterlockedAddLargeInteger(addend: Long, increment: Long, lock: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExInterlockedExtendZone(zone: Long, segment: Long, segmentsize: Int, lock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExIsManufacturingModeEnabled(): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExIsProcessorFeaturePresent(processorfeature: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExIsResourceAcquiredExclusiveLite(resource: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExIsResourceAcquiredSharedLite(resource: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExIsSoftBoot(): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExLocalTimeToSystemTime(localtime: Long, systemtime: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExNotifyCallback(callbackobject: Long, argument1: Long, argument2: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExQueryTimerResolution(maximumtime: Long, minimumtime: Long, currenttime: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExQueueWorkItem(workitem: Long, queuetype: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExRaiseAccessViolation()

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExRaiseDatatypeMisalignment()

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExRaiseStatus(status: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExReInitializeRundownProtection(runref: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExReInitializeRundownProtectionCacheAware(runrefcacheaware: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExRegisterCallback(callbackobject: Long, callbackfunction: Long, callbackcontext: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExReinitializeResourceLite(resource: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExReleaseFastMutex(fastmutex: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExReleaseFastMutexUnsafe(fastmutex: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExReleasePushLockExclusiveEx(pushlock: Long, flags: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExReleasePushLockSharedEx(pushlock: Long, flags: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExReleaseResourceAndLeaveCriticalRegion(resource: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExReleaseResourceForThreadLite(resource: Long, resourcethreadid: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExReleaseResourceLite(resource: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExReleaseRundownProtection(runref: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExReleaseRundownProtectionCacheAware(runrefcacheaware: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExReleaseRundownProtectionCacheAwareEx(runref: Long, count: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExReleaseRundownProtectionEx(runref: Long, count: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExReleaseSpinLockExclusive(spinlock: Long, oldirql: Byte)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExReleaseSpinLockExclusiveFromDpcLevel(spinlock: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExReleaseSpinLockShared(spinlock: Long, oldirql: Byte)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExReleaseSpinLockSharedFromDpcLevel(spinlock: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExRundownCompleted(runref: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExRundownCompletedCacheAware(runrefcacheaware: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExSecurePoolUpdate(securepoolhandle: Long, tag: Int, allocation: Long, cookie: Long, offset: Long, size: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExSecurePoolValidate(securepoolhandle: Long, tag: Int, allocation: Long, cookie: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExSetFirmwareEnvironmentVariable(variablename: Long, vendorguid: Long, value: Long, valuelength: Int, attributes: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExSetResourceOwnerPointer(resource: Long, ownerpointer: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExSetResourceOwnerPointerEx(resource: Long, ownerpointer: Long, flags: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExSetTimer(timer: Long, duetime: Long, period: Long, parameters: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExSetTimerResolution(desiredtime: Int, setresolution: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExSizeOfRundownProtectionCacheAware(): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExSystemTimeToLocalTime(systemtime: Long, localtime: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExTryAcquireSpinLockExclusiveAtDpcLevel(spinlock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExTryAcquireSpinLockSharedAtDpcLevel(spinlock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExTryConvertSharedSpinLockExclusive(spinlock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExTryToAcquireFastMutex(fastmutex: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExUnregisterCallback(callbackregistration: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExUuidCreate(uuid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExVerifySuite(suitetype: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExWaitForRundownProtectionRelease(runref: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesExWaitForRundownProtectionReleaseCacheAware(runref: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesFsRtlIsTotalDeviceFailure(status: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesHalAcquireDisplayOwnership(resetdisplayparameters: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesHalAllocateCommonBuffer(adapterobject: Long, length: Int, logicaladdress: Long, cacheenabled: Boolean): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesHalAllocateCrashDumpRegisters(adapterobject: Long, numberofmapregisters: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesHalAllocateHardwareCounters(groupaffinty: Long, groupcount: Int, resourcelist: Long, countersethandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesHalAssignSlotResources(registrypath: Long, driverclassname: Long, driverobject: Long, deviceobject: Long, bustype: Int, busnumber: Int, slotnumber: Int, allocatedresources: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesHalBugCheckSystem(errorsource: Long, errorrecord: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesHalDmaAllocateCrashDumpRegistersEx(adapter: Long, numberofmapregisters: Int, type: Int, mapregisterbase: Long, mapregistersavailable: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesHalDmaFreeCrashDumpRegistersEx(adapter: Long, type: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesHalExamineMBR(deviceobject: Long, sectorsize: Int, mbrtypeidentifier: Int, buffer: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesHalFreeCommonBuffer(adapterobject: Long, length: Int, logicaladdress: Long, virtualaddress: Long, cacheenabled: Boolean)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesHalFreeHardwareCounters(countersethandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesHalGetAdapter(devicedescription: Long, numberofmapregisters: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesHalGetBusData(busdatatype: Int, busnumber: Int, slotnumber: Int, buffer: Long, length: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesHalGetBusDataByOffset(busdatatype: Int, busnumber: Int, slotnumber: Int, buffer: Long, offset: Int, length: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesHalGetInterruptVector(interfacetype: Int, busnumber: Int, businterruptlevel: Int, businterruptvector: Int, irql: Long, affinity: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesHalMakeBeep(frequency: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesHalReadDmaCounter(adapterobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesHalSetBusData(busdatatype: Int, busnumber: Int, slotnumber: Int, buffer: Long, length: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesHalSetBusDataByOffset(busdatatype: Int, busnumber: Int, slotnumber: Int, buffer: Long, offset: Int, length: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesHalTranslateBusAddress(interfacetype: Int, busnumber: Int, busaddress: Long, addressspace: Long, translatedaddress: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesHvlRegisterWheaErrorNotification(callback: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesHvlUnregisterWheaErrorNotification(callback: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoAcquireCancelSpinLock(irql: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoAcquireKsrPersistentMemory(driverobject: Long, physicaldeviceobject: Long, buffer: Long, size: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoAcquireKsrPersistentMemoryEx(driverobject: Long, physicaldeviceobject: Long, physicaldeviceid: Long, datatag: Long, dataversion: Long, buffer: Long, size: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoAcquireRemoveLockEx(removelock: Long, tag: Long, file: Long, line: Int, remlocksize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoAllocateDriverObjectExtension(driverobject: Long, clientidentificationaddress: Long, driverobjectextensionsize: Int, driverobjectextension: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoAllocateErrorLogEntry(ioobject: Long, entrysize: Byte): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoAllocateIrp(stacksize: Byte, chargequota: Boolean): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoAllocateIrpEx(deviceobject: Long, stacksize: Byte, chargequota: Boolean): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoAllocateMdl(virtualaddress: Long, length: Int, secondarybuffer: Boolean, chargequota: Boolean, irp: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoAllocateSfioStreamIdentifier(fileobject: Long, length: Int, signature: Long, streamidentifier: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoAllocateWorkItem(deviceobject: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoAssignResources(registrypath: Long, driverclassname: Long, driverobject: Long, deviceobject: Long, requestedresources: Long, allocatedresources: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoAttachDevice(sourcedevice: Long, targetdevice: Long, attacheddevice: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoAttachDeviceByPointer(sourcedevice: Long, targetdevice: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoAttachDeviceToDeviceStack(sourcedevice: Long, targetdevice: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoAttachDeviceToDeviceStackSafe(sourcedevice: Long, targetdevice: Long, attachedtodeviceobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoBuildAsynchronousFsdRequest(majorfunction: Int, deviceobject: Long, buffer: Long, length: Int, startingoffset: Long, iostatusblock: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoBuildDeviceIoControlRequest(iocontrolcode: Int, deviceobject: Long, inputbuffer: Long, inputbufferlength: Int, outputbuffer: Long, outputbufferlength: Int, internaldeviceiocontrol: Boolean, event: Long, iostatusblock: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoBuildPartialMdl(sourcemdl: Long, targetmdl: Long, virtualaddress: Long, length: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoBuildSynchronousFsdRequest(majorfunction: Int, deviceobject: Long, buffer: Long, length: Int, startingoffset: Long, event: Long, iostatusblock: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoCancelFileOpen(deviceobject: Long, fileobject: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoCancelIrp(irp: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoCheckLinkShareAccess(desiredaccess: Int, desiredshareaccess: Int, fileobject: Long, shareaccess: Long, linkshareaccess: Long, ioshareaccessflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoCheckShareAccess(desiredaccess: Int, desiredshareaccess: Int, fileobject: Long, shareaccess: Long, update: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoCheckShareAccessEx(desiredaccess: Int, desiredshareaccess: Int, fileobject: Long, shareaccess: Long, update: Boolean, writepermission: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoCleanupIrp(irp: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoClearActivityIdThread(originalid: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoClearIrpExtraCreateParameter(irp: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoConnectInterrupt(interruptobject: Long, serviceroutine: Long, servicecontext: Long, spinlock: Long, vector: Int, irql: Byte, synchronizeirql: Byte, interruptmode: Int, sharevector: Boolean, processorenablemask: Long, floatingsave: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoConnectInterruptEx(parameters: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoCreateController(size: Int): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoCreateDevice(driverobject: Long, deviceextensionsize: Int, devicename: Long, devicetype: Int, devicecharacteristics: Int, exclusive: Boolean, deviceobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoCreateDisk(deviceobject: Long, disk: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoCreateFile(filehandle: Long, desiredaccess: Int, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: Int, shareaccess: Int, disposition: Int, createoptions: Int, eabuffer: Long, ealength: Int, createfiletype: Int, internalparameters: Long, options: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoCreateFileEx(filehandle: Long, desiredaccess: Int, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: Int, shareaccess: Int, disposition: Int, createoptions: Int, eabuffer: Long, ealength: Int, createfiletype: Int, internalparameters: Long, options: Int, drivercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoCreateFileSpecifyDeviceObjectHint(filehandle: Long, desiredaccess: Int, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: Int, shareaccess: Int, disposition: Int, createoptions: Int, eabuffer: Long, ealength: Int, createfiletype: Int, internalparameters: Long, options: Int, deviceobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoCreateNotificationEvent(eventname: Long, eventhandle: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoCreateSymbolicLink(symboliclinkname: Long, devicename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoCreateSynchronizationEvent(eventname: Long, eventhandle: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoCreateSystemThread(ioobject: Long, threadhandle: Long, desiredaccess: Int, objectattributes: Long, processhandle: Long, clientid: Long, startroutine: Long, startcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoCreateUnprotectedSymbolicLink(symboliclinkname: Long, devicename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoCsqInitialize(csq: Long, csqinsertirp: Long, csqremoveirp: Long, csqpeeknextirp: Long, csqacquirelock: Long, csqreleaselock: Long, csqcompletecanceledirp: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoCsqInitializeEx(csq: Long, csqinsertirp: Long, csqremoveirp: Long, csqpeeknextirp: Long, csqacquirelock: Long, csqreleaselock: Long, csqcompletecanceledirp: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoCsqInsertIrp(csq: Long, irp: Long, context: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoCsqInsertIrpEx(csq: Long, irp: Long, context: Long, insertcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoCsqRemoveIrp(csq: Long, context: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoCsqRemoveNextIrp(csq: Long, peekcontext: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoDecrementKeepAliveCount(fileobject: Long, process: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoDeleteController(controllerobject: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoDeleteDevice(deviceobject: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoDeleteSymbolicLink(symboliclinkname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoDetachDevice(targetdevice: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoDisconnectInterrupt(interruptobject: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoDisconnectInterruptEx(parameters: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoEnumerateKsrPersistentMemoryEx(driverobject: Long, physicaldeviceobject: Long, physicaldeviceid: Long, callback: Long, callbackcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoFlushAdapterBuffers(adapterobject: Long, mdl: Long, mapregisterbase: Long, currentva: Long, length: Int, writetodevice: Boolean): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoForwardIrpSynchronously(deviceobject: Long, irp: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoFreeAdapterChannel(adapterobject: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoFreeController(controllerobject: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoFreeErrorLogEntry(elentry: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoFreeIrp(irp: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoFreeKsrPersistentMemory(datahandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoFreeMapRegisters(adapterobject: Long, mapregisterbase: Long, numberofmapregisters: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoFreeMdl(mdl: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoFreeSfioStreamIdentifier(fileobject: Long, signature: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoFreeWorkItem(ioworkitem: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoGetActivityIdIrp(irp: Long, guid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoGetActivityIdThread(): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoGetAffinityInterrupt(interruptobject: Long, groupaffinity: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoGetAttachedDeviceReference(deviceobject: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoGetBootDiskInformation(bootdiskinformation: Long, size: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoGetBootDiskInformationLite(bootdiskinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoGetConfigurationInformation(): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoGetContainerInformation(informationclass: Int, containerobject: Long, buffer: Long, bufferlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoGetCurrentProcess(): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoGetDeviceDirectory(physicaldeviceobject: Long, directorytype: Int, flags: Int, reserved: Long, devicedirectoryhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoGetDeviceInterfaceAlias(symboliclinkname: Long, aliasinterfaceclassguid: Long, aliassymboliclinkname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoGetDeviceInterfacePropertyData(symboliclinkname: Long, propertykey: Long, lcid: Int, flags: Int, size: Int, data: Long, requiredsize: Long, type: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoGetDeviceInterfaces(interfaceclassguid: Long, physicaldeviceobject: Long, flags: Int, symboliclinklist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoGetDeviceNumaNode(pdo: Long, nodenumber: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoGetDeviceObjectPointer(objectname: Long, desiredaccess: Int, fileobject: Long, deviceobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoGetDeviceProperty(deviceobject: Long, deviceproperty: Int, bufferlength: Int, propertybuffer: Long, resultlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoGetDevicePropertyData(pdo: Long, propertykey: Long, lcid: Int, flags: Int, size: Int, data: Long, requiredsize: Long, type: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoGetDmaAdapter(physicaldeviceobject: Long, devicedescription: Long, numberofmapregisters: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoGetDriverDirectory(driverobject: Long, directorytype: Int, flags: Int, driverdirectoryhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoGetDriverObjectExtension(driverobject: Long, clientidentificationaddress: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoGetFileObjectGenericMapping(): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoGetFsZeroingOffset(irp: Long, zeroingoffset: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoGetInitialStack(): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoGetInitiatorProcess(fileobject: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoGetIoAttributionHandle(irp: Long, ioattributionhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoGetIoPriorityHint(irp: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoGetIommuInterface(version: Int, interfaceout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoGetIommuInterfaceEx(version: Int, flags: Long, interfaceout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoGetIrpExtraCreateParameter(irp: Long, extracreateparameter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoGetPagingIoPriority(irp: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoGetRelatedDeviceObject(fileobject: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoGetSfioStreamIdentifier(fileobject: Long, signature: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoGetSilo(fileobject: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoGetSiloParameters(fileobject: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoGetStackLimits(lowlimit: Long, highlimit: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoGetTopLevelIrp(): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoGetTransactionParameterBlock(fileobject: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoIncrementKeepAliveCount(fileobject: Long, process: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoInitializeIrp(irp: Long, packetsize: Short, stacksize: Byte)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoInitializeIrpEx(irp: Long, deviceobject: Long, packetsize: Short, stacksize: Byte)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoInitializeRemoveLockEx(lock: Long, allocatetag: Int, maxlockedminutes: Int, highwatermark: Int, remlocksize: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoInitializeTimer(deviceobject: Long, timerroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoInitializeWorkItem(ioobject: Long, ioworkitem: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoInvalidateDeviceRelations(deviceobject: Long, type: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoInvalidateDeviceState(physicaldeviceobject: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoIs32bitProcess(irp: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoIsFileObjectIgnoringSharing(fileobject: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoIsFileOriginRemote(fileobject: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoIsInitiator32bitProcess(irp: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoIsValidIrpStatus(status: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoIsWdmVersionAvailable(majorversion: Byte, minorversion: Byte): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoMakeAssociatedIrp(irp: Long, stacksize: Byte): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoMakeAssociatedIrpEx(irp: Long, deviceobject: Long, stacksize: Byte): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoMapTransfer(adapterobject: Long, mdl: Long, mapregisterbase: Long, currentva: Long, length: Long, writetodevice: Boolean): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoOpenDeviceInterfaceRegistryKey(symboliclinkname: Long, desiredaccess: Int, deviceinterfaceregkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoOpenDeviceRegistryKey(deviceobject: Long, devinstkeytype: Int, desiredaccess: Int, deviceregkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoOpenDriverRegistryKey(driverobject: Long, regkeytype: Int, desiredaccess: Int, flags: Int, driverregkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoPropagateActivityIdToThread(irp: Long, propagatedid: Long, originalid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoQueryDeviceDescription(bustype: Long, busnumber: Long, controllertype: Long, controllernumber: Long, peripheraltype: Long, peripheralnumber: Long, calloutroutine: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoQueryFullDriverPath(driverobject: Long, fullpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoQueryInformationByName(objectattributes: Long, iostatusblock: Long, fileinformation: Long, length: Int, fileinformationclass: Int, options: Int, drivercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoQueryKsrPersistentMemorySize(driverobject: Long, physicaldeviceobject: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoQueryKsrPersistentMemorySizeEx(driverobject: Long, physicaldeviceobject: Long, physicaldeviceid: Long, datatag: Long, dataversion: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoQueueWorkItem(ioworkitem: Long, workerroutine: Long, queuetype: Int, context: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoQueueWorkItemEx(ioworkitem: Long, workerroutine: Long, queuetype: Int, context: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoRaiseHardError(irp: Long, vpb: Long, realdeviceobject: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoRaiseInformationalHardError(errorstatus: Int, string: Long, thread: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoReadDiskSignature(deviceobject: Long, bytespersector: Int, signature: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoReadPartitionTable(deviceobject: Long, sectorsize: Int, returnrecognizedpartitions: Boolean, partitionbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoReadPartitionTableEx(deviceobject: Long, drivelayout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoRecordIoAttribution(opaquehandle: Long, attributioninformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoRegisterBootDriverCallback(callbackfunction: Long, callbackcontext: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoRegisterContainerNotification(notificationclass: Int, callbackfunction: Long, notificationinformation: Long, notificationinformationlength: Int, callbackregistration: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoRegisterDeviceInterface(physicaldeviceobject: Long, interfaceclassguid: Long, referencestring: Long, symboliclinkname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoRegisterLastChanceShutdownNotification(deviceobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoRegisterPlugPlayNotification(eventcategory: Int, eventcategoryflags: Int, eventcategorydata: Long, driverobject: Long, callbackroutine: Long, context: Long, notificationentry: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoRegisterShutdownNotification(deviceobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoReleaseCancelSpinLock(irql: Byte)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoReleaseRemoveLockAndWaitEx(removelock: Long, tag: Long, remlocksize: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoReleaseRemoveLockEx(removelock: Long, tag: Long, remlocksize: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoRemoveLinkShareAccess(fileobject: Long, shareaccess: Long, linkshareaccess: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoRemoveLinkShareAccessEx(fileobject: Long, shareaccess: Long, linkshareaccess: Long, ioshareaccessflags: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoRemoveShareAccess(fileobject: Long, shareaccess: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoReplacePartitionUnit(targetpdo: Long, sparepdo: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoReportDetectedDevice(driverobject: Long, legacybustype: Int, busnumber: Int, slotnumber: Int, resourcelist: Long, resourcerequirements: Long, resourceassigned: Boolean, deviceobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoReportInterruptActive(parameters: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoReportInterruptInactive(parameters: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoReportResourceForDetection(driverobject: Long, driverlist: Long, driverlistsize: Int, deviceobject: Long, devicelist: Long, devicelistsize: Int, conflictdetected: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoReportResourceUsage(driverclassname: Long, driverobject: Long, driverlist: Long, driverlistsize: Int, deviceobject: Long, devicelist: Long, devicelistsize: Int, overrideconflict: Boolean, conflictdetected: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoReportRootDevice(driverobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoReportTargetDeviceChange(physicaldeviceobject: Long, notificationstructure: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoReportTargetDeviceChangeAsynchronous(physicaldeviceobject: Long, notificationstructure: Long, callback: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoRequestDeviceEject(physicaldeviceobject: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoRequestDeviceEjectEx(physicaldeviceobject: Long, callback: Long, context: Long, driverobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoReserveKsrPersistentMemory(driverobject: Long, physicaldeviceobject: Long, size: Long, flags: Int, datahandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoReserveKsrPersistentMemoryEx(driverobject: Long, physicaldeviceobject: Long, physicaldeviceid: Long, datatag: Long, dataversion: Int, size: Long, flags: Int, datahandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoReuseIrp(irp: Long, iostatus: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoSetActivityIdIrp(irp: Long, guid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoSetActivityIdThread(activityid: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoSetCompletionRoutineEx(deviceobject: Long, irp: Long, completionroutine: Long, context: Long, invokeonsuccess: Boolean, invokeonerror: Boolean, invokeoncancel: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoSetDeviceInterfacePropertyData(symboliclinkname: Long, propertykey: Long, lcid: Int, flags: Int, type: Int, size: Int, data: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoSetDeviceInterfaceState(symboliclinkname: Long, enable: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoSetDevicePropertyData(pdo: Long, propertykey: Long, lcid: Int, flags: Int, type: Int, size: Int, data: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoSetFileObjectIgnoreSharing(fileobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoSetFileOrigin(fileobject: Long, remote: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoSetFsZeroingOffset(irp: Long, zeroingoffset: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoSetFsZeroingOffsetRequired(irp: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoSetHardErrorOrVerifyDevice(irp: Long, deviceobject: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoSetIoAttributionIrp(irp: Long, attributionsource: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoSetIoPriorityHint(irp: Long, priorityhint: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoSetIrpExtraCreateParameter(irp: Long, extracreateparameter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoSetLinkShareAccess(desiredaccess: Int, desiredshareaccess: Int, fileobject: Long, shareaccess: Long, linkshareaccess: Long, ioshareaccessflags: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoSetMasterIrpStatus(masterirp: Long, status: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoSetPartitionInformation(deviceobject: Long, sectorsize: Int, partitionnumber: Int, partitiontype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoSetPartitionInformationEx(deviceobject: Long, partitionnumber: Int, partitioninfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoSetShareAccess(desiredaccess: Int, desiredshareaccess: Int, fileobject: Long, shareaccess: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoSetShareAccessEx(desiredaccess: Int, desiredshareaccess: Int, fileobject: Long, shareaccess: Long, writepermission: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoSetStartIoAttributes(deviceobject: Long, deferredstartio: Boolean, noncancelable: Boolean)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoSetSystemPartition(volumenamestring: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoSetThreadHardErrorMode(enableharderrors: Boolean): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoSetTopLevelIrp(irp: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoSizeOfIrpEx(deviceobject: Long, stacksize: Byte): Short

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoSizeofWorkItem(): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoStartNextPacket(deviceobject: Long, cancelable: Boolean)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoStartNextPacketByKey(deviceobject: Long, cancelable: Boolean, key: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoStartTimer(deviceobject: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoStopTimer(deviceobject: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoSynchronousCallDriver(deviceobject: Long, irp: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoTransferActivityId(activityid: Long, relatedactivityid: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoTranslateBusAddress(interfacetype: Int, busnumber: Int, busaddress: Long, addressspace: Long, translatedaddress: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoTryQueueWorkItem(ioworkitem: Long, workerroutine: Long, queuetype: Int, context: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoUninitializeWorkItem(ioworkitem: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoUnregisterBootDriverCallback(callbackhandle: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoUnregisterContainerNotification(callbackregistration: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoUnregisterPlugPlayNotification(notificationentry: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoUnregisterPlugPlayNotificationEx(notificationentry: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoUnregisterShutdownNotification(deviceobject: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoUpdateLinkShareAccess(fileobject: Long, shareaccess: Long, linkshareaccess: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoUpdateLinkShareAccessEx(fileobject: Long, shareaccess: Long, linkshareaccess: Long, ioshareaccessflags: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoUpdateShareAccess(fileobject: Long, shareaccess: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoValidateDeviceIoControlAccess(irp: Long, requiredaccess: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoVerifyPartitionTable(deviceobject: Long, fixerrors: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoVolumeDeviceNameToGuid(volumedevicename: Long, guid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoVolumeDeviceNameToGuidPath(volumedevicename: Long, guidpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoVolumeDeviceToDosName(volumedeviceobject: Long, dosname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoVolumeDeviceToGuid(volumedeviceobject: Long, guid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoVolumeDeviceToGuidPath(volumedeviceobject: Long, guidpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoWMIAllocateInstanceIds(guid: Long, instancecount: Int, firstinstanceid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoWMIDeviceObjectToInstanceName(datablockobject: Long, deviceobject: Long, instancename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoWMIExecuteMethod(datablockobject: Long, instancename: Long, methodid: Int, inbuffersize: Int, outbuffersize: Long, inoutbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoWMIHandleToInstanceName(datablockobject: Long, filehandle: Long, instancename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoWMIOpenBlock(guid: Long, desiredaccess: Int, datablockobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoWMIQueryAllData(datablockobject: Long, inoutbuffersize: Long, outbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoWMIQueryAllDataMultiple(datablockobjectlist: Long, objectcount: Int, inoutbuffersize: Long, outbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoWMIQuerySingleInstance(datablockobject: Long, instancename: Long, inoutbuffersize: Long, outbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoWMIQuerySingleInstanceMultiple(datablockobjectlist: Long, instancenames: Long, objectcount: Int, inoutbuffersize: Long, outbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoWMIRegistrationControl(deviceobject: Long, action: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoWMISetNotificationCallback(obj: Long, callback: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoWMISetSingleInstance(datablockobject: Long, instancename: Long, version: Int, valuebuffersize: Int, valuebuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoWMISetSingleItem(datablockobject: Long, instancename: Long, dataitemid: Int, version: Int, valuebuffersize: Int, valuebuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoWMISuggestInstanceName(physicaldeviceobject: Long, symboliclinkname: Long, combinenames: Boolean, suggestedinstancename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoWMIWriteEvent(wnodeeventitem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoWithinStackLimits(regionstart: Long, regionsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoWriteErrorLogEntry(elentry: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoWriteKsrPersistentMemory(datahandle: Long, buffer: Long, size: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoWritePartitionTable(deviceobject: Long, sectorsize: Int, sectorspertrack: Int, numberofheads: Int, partitionbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIoWritePartitionTableEx(deviceobject: Long, drivelayout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIofCallDriver(deviceobject: Long, irp: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesIofCompleteRequest(irp: Long, priorityboost: Byte)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKdChangeOption(option: Int, inbufferbytes: Int, inbuffer: Long, outbufferbytes: Int, outbuffer: Long, outbufferneeded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKdDisableDebugger(): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKdEnableDebugger(): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKdRefreshDebuggerNotPresent(): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeAcquireGuardedMutex(mutex: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeAcquireGuardedMutexUnsafe(fastmutex: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeAcquireInStackQueuedSpinLock(spinlock: Long, lockhandle: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeAcquireInStackQueuedSpinLockAtDpcLevel(spinlock: Long, lockhandle: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeAcquireInStackQueuedSpinLockForDpc(spinlock: Long, lockhandle: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeAcquireInterruptSpinLock(interrupt: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeAcquireSpinLockForDpc(spinlock: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeAddTriageDumpDataBlock(ktriagedumpdataarray: Long, address: Long, size: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeAreAllApcsDisabled(): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeAreApcsDisabled(): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeBugCheck(bugcheckcode: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeBugCheckEx(bugcheckcode: Int, bugcheckparameter1: Long, bugcheckparameter2: Long, bugcheckparameter3: Long, bugcheckparameter4: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeCancelTimer(param0: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeClearEvent(event: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeConvertAuxiliaryCounterToPerformanceCounter(auxiliarycountervalue: Long, performancecountervalue: Long, conversionerror: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeConvertPerformanceCounterToAuxiliaryCounter(performancecountervalue: Long, auxiliarycountervalue: Long, conversionerror: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeDelayExecutionThread(waitmode: Byte, alertable: Boolean, interval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeDeregisterBoundCallback(handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeDeregisterBugCheckCallback(callbackrecord: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeDeregisterBugCheckReasonCallback(callbackrecord: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeDeregisterNmiCallback(handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeDeregisterProcessorChangeCallback(callbackhandle: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeEnterCriticalRegion()

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeEnterGuardedRegion()

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeExpandKernelStackAndCallout(callout: Long, parameter: Long, size: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeExpandKernelStackAndCalloutEx(callout: Long, parameter: Long, size: Long, wait: Boolean, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeFlushIoBuffers(mdl: Long, readoperation: Boolean, dmaoperation: Boolean)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeFlushQueuedDpcs()

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeFlushWriteBuffer()

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeGetCurrentIrql(): Byte

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeGetCurrentNodeNumber(): Short

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeGetCurrentProcessorNumberEx(procnumber: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeGetProcessorIndexFromNumber(procnumber: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeGetProcessorNumberFromIndex(procindex: Int, procnumber: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeGetRecommendedSharedDataAlignment(): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeInitializeCrashDumpHeader(dumptype: Int, flags: Int, buffer: Long, buffersize: Int, bufferneeded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeInitializeDeviceQueue(devicequeue: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeInitializeDpc(dpc: Long, deferredroutine: Long, deferredcontext: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeInitializeEvent(event: Long, type: Int, state: Boolean)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeInitializeGuardedMutex(mutex: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeInitializeMutex(mutex: Long, level: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeInitializeSemaphore(semaphore: Long, count: Int, limit: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeInitializeSpinLock(spinlock: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeInitializeThreadedDpc(dpc: Long, deferredroutine: Long, deferredcontext: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeInitializeTimer(timer: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeInitializeTimerEx(timer: Long, type: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeInitializeTriageDumpDataArray(ktriagedumpdataarray: Long, size: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeInsertByKeyDeviceQueue(devicequeue: Long, devicequeueentry: Long, sortkey: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeInsertDeviceQueue(devicequeue: Long, devicequeueentry: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeInsertQueueDpc(dpc: Long, systemargument1: Long, systemargument2: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeInvalidateAllCaches(): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeInvalidateRangeAllCaches(baseaddress: Long, length: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeIpiGenericCall(broadcastfunction: Long, context: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeIsExecutingDpc(): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeLeaveCriticalRegion()

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeLeaveGuardedRegion()

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKePulseEvent(event: Long, increment: Int, wait: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeQueryActiveGroupCount(): Short

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeQueryActiveProcessorCount(activeprocessors: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeQueryActiveProcessorCountEx(groupnumber: Short): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeQueryActiveProcessors(): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeQueryAuxiliaryCounterFrequency(auxiliarycounterfrequency: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeQueryDpcWatchdogInformation(watchdoginformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeQueryGroupAffinity(groupnumber: Short): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeQueryHardwareCounterConfiguration(counterarray: Long, maximumcount: Int, count: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeQueryHighestNodeNumber(): Short

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeQueryInterruptTimePrecise(qpctimestamp: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeQueryLogicalProcessorRelationship(processornumber: Long, relationshiptype: Int, information: Long, length: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeQueryMaximumGroupCount(): Short

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeQueryMaximumProcessorCount(): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeQueryMaximumProcessorCountEx(groupnumber: Short): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeQueryNodeActiveAffinity(nodenumber: Short, affinity: Long, count: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeQueryNodeActiveAffinity2(nodenumber: Short, groupaffinities: Long, groupaffinitiescount: Short, groupaffinitiesrequired: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeQueryNodeActiveProcessorCount(nodenumber: Short): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeQueryNodeMaximumProcessorCount(nodenumber: Short): Short

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeQueryPerformanceCounter(performancefrequency: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeQueryPriorityThread(thread: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeQueryRuntimeThread(thread: Long, usertime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeQuerySystemTimePrecise(currenttime: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeQueryTimeIncrement(): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeQueryTotalCycleTimeThread(thread: Long, cycletimestamp: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeQueryUnbiasedInterruptTime(): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeQueryUnbiasedInterruptTimePrecise(qpctimestamp: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeReadStateEvent(event: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeReadStateMutex(mutex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeReadStateSemaphore(semaphore: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeReadStateTimer(timer: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeRegisterBoundCallback(callbackroutine: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeRegisterBugCheckCallback(callbackrecord: Long, callbackroutine: Long, buffer: Long, length: Int, component: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeRegisterBugCheckReasonCallback(callbackrecord: Long, callbackroutine: Long, reason: Int, component: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeRegisterNmiCallback(callbackroutine: Long, context: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeRegisterProcessorChangeCallback(callbackfunction: Long, callbackcontext: Long, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeReleaseGuardedMutex(mutex: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeReleaseGuardedMutexUnsafe(fastmutex: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeReleaseInStackQueuedSpinLock(lockhandle: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeReleaseInStackQueuedSpinLockForDpc(lockhandle: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeReleaseInStackQueuedSpinLockFromDpcLevel(lockhandle: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeReleaseInterruptSpinLock(interrupt: Long, oldirql: Byte)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeReleaseMutex(mutex: Long, wait: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeReleaseSemaphore(semaphore: Long, increment: Int, adjustment: Int, wait: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeReleaseSpinLockForDpc(spinlock: Long, oldirql: Byte)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeRemoveByKeyDeviceQueue(devicequeue: Long, sortkey: Int): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeRemoveByKeyDeviceQueueIfBusy(devicequeue: Long, sortkey: Int): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeRemoveDeviceQueue(devicequeue: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeRemoveEntryDeviceQueue(devicequeue: Long, devicequeueentry: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeRemoveQueueDpc(dpc: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeRemoveQueueDpcEx(dpc: Long, waitifactive: Boolean): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeResetEvent(event: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeRestoreExtendedProcessorState(xstatesave: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeRevertToUserAffinityThread()

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeRevertToUserAffinityThreadEx(affinity: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeRevertToUserGroupAffinityThread(previousaffinity: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeSaveExtendedProcessorState(mask: Long, xstatesave: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeSetBasePriorityThread(thread: Long, increment: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeSetCoalescableTimer(timer: Long, duetime: Long, period: Int, tolerabledelay: Int, dpc: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeSetEvent(event: Long, increment: Int, wait: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeSetHardwareCounterConfiguration(counterarray: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeSetImportanceDpc(dpc: Long, importance: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeSetPriorityThread(thread: Long, priority: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeSetSystemAffinityThread(affinity: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeSetSystemAffinityThreadEx(affinity: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeSetSystemGroupAffinityThread(affinity: Long, previousaffinity: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeSetTargetProcessorDpc(dpc: Long, number: Byte)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeSetTargetProcessorDpcEx(dpc: Long, procnumber: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeSetTimer(timer: Long, duetime: Long, dpc: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeSetTimerEx(timer: Long, duetime: Long, period: Int, dpc: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeShouldYieldProcessor(): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeStallExecutionProcessor(microseconds: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeSynchronizeExecution(interrupt: Long, synchronizeroutine: Long, synchronizecontext: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeTestSpinLock(spinlock: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeTryToAcquireGuardedMutex(mutex: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeTryToAcquireSpinLockAtDpcLevel(spinlock: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeWaitForMultipleObjects(count: Int, obj: Long, waittype: Int, waitreason: Int, waitmode: Byte, alertable: Boolean, timeout: Long, waitblockarray: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKeWaitForSingleObject(obj: Long, waitreason: Int, waitmode: Byte, alertable: Boolean, timeout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesKfRaiseIrql(newirql: Byte): Byte

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmAddPhysicalMemory(startaddress: Long, numberofbytes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmAddVerifierSpecialThunks(entryroutine: Long, thunkbuffer: Long, thunkbuffersize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmAddVerifierThunks(thunkbuffer: Long, thunkbuffersize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmAdvanceMdl(mdl: Long, numberofbytes: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmAllocateContiguousMemory(numberofbytes: Long, highestacceptableaddress: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmAllocateContiguousMemoryEx(numberofbytes: Long, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, preferrednode: Int, protect: Int, partitionobject: Long, tag: Int, flags: Int, baseaddress: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmAllocateContiguousMemorySpecifyCache(numberofbytes: Long, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, cachetype: Int): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmAllocateContiguousMemorySpecifyCacheNode(numberofbytes: Long, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, cachetype: Int, preferrednode: Int): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmAllocateContiguousNodeMemory(numberofbytes: Long, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, protect: Int, preferrednode: Int): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmAllocateMappingAddress(numberofbytes: Long, pooltag: Int): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmAllocateMappingAddressEx(numberofbytes: Long, pooltag: Int, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmAllocateMdlForIoSpace(physicaladdresslist: Long, numberofentries: Long, newmdl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmAllocateNodePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: Long, cachetype: Int, idealnode: Int, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmAllocateNonCachedMemory(numberofbytes: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmAllocatePagesForMdl(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmAllocatePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: Long, cachetype: Int, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmAllocatePartitionNodePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: Long, cachetype: Int, idealnode: Int, flags: Int, partitionobject: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmAreMdlPagesCached(memorydescriptorlist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmBuildMdlForNonPagedPool(memorydescriptorlist: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmCreateMdl(memorydescriptorlist: Long, base: Long, length: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmCreateMirror(): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmFreeContiguousMemory(baseaddress: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmFreeContiguousMemorySpecifyCache(baseaddress: Long, numberofbytes: Long, cachetype: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmFreeMappingAddress(baseaddress: Long, pooltag: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmFreeNonCachedMemory(baseaddress: Long, numberofbytes: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmFreePagesFromMdl(memorydescriptorlist: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmFreePagesFromMdlEx(memorydescriptorlist: Long, flags: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmGetCacheAttribute(physicaladdress: Long, cachetype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmGetCacheAttributeEx(physicaladdress: Long, flags: Int, cachetype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmGetPhysicalAddress(baseaddress: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmGetPhysicalMemoryRanges(): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmGetPhysicalMemoryRangesEx(partitionobject: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmGetPhysicalMemoryRangesEx2(partitionobject: Long, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmGetSystemRoutineAddress(systemroutinename: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmGetVirtualForPhysical(physicaladdress: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmIsAddressValid(virtualaddress: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmIsDriverSuspectForVerifier(driverobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmIsDriverVerifying(driverobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmIsDriverVerifyingByAddress(addresswithinsection: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmIsIoSpaceActive(startaddress: Long, numberofbytes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmIsNonPagedSystemAddressValid(virtualaddress: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmIsThisAnNtAsSystem(): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmIsVerifierEnabled(verifierflags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmLockPagableDataSection(addresswithinsection: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmLockPagableSectionByHandle(imagesectionhandle: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmMapIoSpace(physicaladdress: Long, numberofbytes: Long, cachetype: Int): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmMapIoSpaceEx(physicaladdress: Long, numberofbytes: Long, protect: Int): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmMapLockedPages(memorydescriptorlist: Long, accessmode: Byte): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmMapLockedPagesSpecifyCache(memorydescriptorlist: Long, accessmode: Byte, cachetype: Int, requestedaddress: Long, bugcheckonfailure: Int, priority: Int): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmMapLockedPagesWithReservedMapping(mappingaddress: Long, pooltag: Int, memorydescriptorlist: Long, cachetype: Int): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmMapMdl(memorydescriptorlist: Long, protection: Int, driverroutine: Long, drivercontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmMapMemoryDumpMdlEx(va: Long, pagetotal: Int, memorydumpmdl: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmMapUserAddressesToPage(baseaddress: Long, numberofbytes: Long, pageaddress: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmMapVideoDisplay(physicaladdress: Long, numberofbytes: Long, cachetype: Int): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmMapViewInSessionSpace(section: Long, mappedbase: Long, viewsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmMapViewInSessionSpaceEx(section: Long, mappedbase: Long, viewsize: Long, sectionoffset: Long, flags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmMapViewInSystemSpace(section: Long, mappedbase: Long, viewsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmMapViewInSystemSpaceEx(section: Long, mappedbase: Long, viewsize: Long, sectionoffset: Long, flags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmMdlPageContentsState(memorydescriptorlist: Long, state: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmPageEntireDriver(addresswithinsection: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmProbeAndLockPages(memorydescriptorlist: Long, accessmode: Byte, operation: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmProbeAndLockProcessPages(memorydescriptorlist: Long, process: Long, accessmode: Byte, operation: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmProbeAndLockSelectedPages(memorydescriptorlist: Long, segmentarray: Long, accessmode: Byte, operation: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmProtectDriverSection(addresswithinsection: Long, size: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmProtectMdlSystemAddress(memorydescriptorlist: Long, newprotect: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmQuerySystemSize(): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmRemovePhysicalMemory(startaddress: Long, numberofbytes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmResetDriverPaging(addresswithinsection: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmRotatePhysicalView(virtualaddress: Long, numberofbytes: Long, newmdl: Long, direction: Int, copyfunction: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmSecureVirtualMemory(address: Long, size: Long, probemode: Int): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmSecureVirtualMemoryEx(address: Long, size: Long, probemode: Int, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmSetPermanentCacheAttribute(startaddress: Long, numberofbytes: Long, cachetype: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmSizeOfMdl(base: Long, length: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmUnlockPagableImageSection(imagesectionhandle: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmUnlockPages(memorydescriptorlist: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmUnmapIoSpace(baseaddress: Long, numberofbytes: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmUnmapLockedPages(baseaddress: Long, memorydescriptorlist: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmUnmapReservedMapping(baseaddress: Long, pooltag: Int, memorydescriptorlist: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmUnmapVideoDisplay(baseaddress: Long, numberofbytes: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmUnmapViewInSessionSpace(mappedbase: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmUnmapViewInSystemSpace(mappedbase: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesMmUnsecureVirtualMemory(securehandle: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtAllocateLocallyUniqueId(luid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtCommitComplete(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtCommitEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtCommitTransaction(transactionhandle: Long, wait: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtCreateEnlistment(enlistmenthandle: Long, desiredaccess: Int, resourcemanagerhandle: Long, transactionhandle: Long, objectattributes: Long, createoptions: Int, notificationmask: Int, enlistmentkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtCreateResourceManager(resourcemanagerhandle: Long, desiredaccess: Int, tmhandle: Long, rmguid: Long, objectattributes: Long, createoptions: Int, description: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtCreateTransaction(transactionhandle: Long, desiredaccess: Int, objectattributes: Long, uow: Long, tmhandle: Long, createoptions: Int, isolationlevel: Int, isolationflags: Int, timeout: Long, description: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtCreateTransactionManager(tmhandle: Long, desiredaccess: Int, objectattributes: Long, logfilename: Long, createoptions: Int, commitstrength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtDisplayString(string: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtEnumerateTransactionObject(rootobjecthandle: Long, querytype: Int, objectcursor: Long, objectcursorlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtGetNotificationResourceManager(resourcemanagerhandle: Long, transactionnotification: Long, notificationlength: Int, timeout: Long, returnlength: Long, asynchronous: Int, asynchronouscontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtLoadDriver(driverservicename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtMakeTemporaryObject(handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtManagePartition(targethandle: Long, sourcehandle: Long, partitioninformationclass: Int, partitioninformation: Long, partitioninformationlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtOpenEnlistment(enlistmenthandle: Long, desiredaccess: Int, resourcemanagerhandle: Long, enlistmentguid: Long, objectattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtOpenResourceManager(resourcemanagerhandle: Long, desiredaccess: Int, tmhandle: Long, resourcemanagerguid: Long, objectattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtOpenTransaction(transactionhandle: Long, desiredaccess: Int, objectattributes: Long, uow: Long, tmhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtOpenTransactionManager(tmhandle: Long, desiredaccess: Int, objectattributes: Long, logfilename: Long, tmidentity: Long, openoptions: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtPowerInformation(informationlevel: Int, inputbuffer: Long, inputbufferlength: Int, outputbuffer: Long, outputbufferlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtPrePrepareComplete(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtPrePrepareEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtPrepareComplete(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtPrepareEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtPropagationComplete(resourcemanagerhandle: Long, requestcookie: Int, bufferlength: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtPropagationFailed(resourcemanagerhandle: Long, requestcookie: Int, propstatus: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtQueryInformationEnlistment(enlistmenthandle: Long, enlistmentinformationclass: Int, enlistmentinformation: Long, enlistmentinformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtQueryInformationResourceManager(resourcemanagerhandle: Long, resourcemanagerinformationclass: Int, resourcemanagerinformation: Long, resourcemanagerinformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtQueryInformationTransaction(transactionhandle: Long, transactioninformationclass: Int, transactioninformation: Long, transactioninformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtQueryInformationTransactionManager(transactionmanagerhandle: Long, transactionmanagerinformationclass: Int, transactionmanagerinformation: Long, transactionmanagerinformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtReadOnlyEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtRecoverEnlistment(enlistmenthandle: Long, enlistmentkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtRecoverResourceManager(resourcemanagerhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtRecoverTransactionManager(transactionmanagerhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtRegisterProtocolAddressInformation(resourcemanager: Long, protocolid: Long, protocolinformationsize: Int, protocolinformation: Long, createoptions: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtRenameTransactionManager(logfilename: Long, existingtransactionmanagerguid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtRollbackComplete(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtRollbackEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtRollbackTransaction(transactionhandle: Long, wait: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtRollforwardTransactionManager(transactionmanagerhandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtSetInformationEnlistment(enlistmenthandle: Long, enlistmentinformationclass: Int, enlistmentinformation: Long, enlistmentinformationlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtSetInformationResourceManager(resourcemanagerhandle: Long, resourcemanagerinformationclass: Int, resourcemanagerinformation: Long, resourcemanagerinformationlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtSetInformationTransaction(transactionhandle: Long, transactioninformationclass: Int, transactioninformation: Long, transactioninformationlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtSetInformationTransactionManager(tmhandle: Long, transactionmanagerinformationclass: Int, transactionmanagerinformation: Long, transactionmanagerinformationlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtSinglePhaseReject(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesNtUnloadDriver(driverservicename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesObCloseHandle(handle: Long, previousmode: Byte): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesObDereferenceObjectDeferDelete(obj: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesObDereferenceObjectDeferDeleteWithTag(obj: Long, tag: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesObGetFilterVersion(): Short

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesObGetObjectSecurity(obj: Long, securitydescriptor: Long, memoryallocated: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesObReferenceObjectByHandle(handle: Long, desiredaccess: Int, objecttype: Long, accessmode: Byte, obj: Long, handleinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesObReferenceObjectByHandleWithTag(handle: Long, desiredaccess: Int, objecttype: Long, accessmode: Byte, tag: Int, obj: Long, handleinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesObReferenceObjectByPointer(obj: Long, desiredaccess: Int, objecttype: Long, accessmode: Byte): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesObReferenceObjectByPointerWithTag(obj: Long, desiredaccess: Int, objecttype: Long, accessmode: Byte, tag: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesObReferenceObjectSafe(obj: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesObReferenceObjectSafeWithTag(obj: Long, tag: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesObRegisterCallbacks(callbackregistration: Long, registrationhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesObReleaseObjectSecurity(securitydescriptor: Long, memoryallocated: Boolean)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesObUnRegisterCallbacks(registrationhandle: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesObfDereferenceObject(obj: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesObfDereferenceObjectWithTag(obj: Long, tag: Int): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesObfReferenceObject(obj: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesObfReferenceObjectWithTag(obj: Long, tag: Int): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPcwAddInstance(buffer: Long, name: Long, id: Int, count: Int, data: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPcwCloseInstance(instance: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPcwCreateInstance(instance: Long, registration: Long, name: Long, count: Int, data: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPcwRegister(registration: Long, info: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPcwUnregister(registration: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoCallDriver(deviceobject: Long, irp: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoClearPowerRequest(powerrequest: Long, type: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoCreatePowerRequest(powerrequest: Long, deviceobject: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoCreateThermalRequest(thermalrequest: Long, targetdeviceobject: Long, policydeviceobject: Long, context: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoDeletePowerRequest(powerrequest: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoDeleteThermalRequest(thermalrequest: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoEndDeviceBusy(idlepointer: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoFxActivateComponent(handle: Long, component: Int, flags: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoFxCompleteDevicePowerNotRequired(handle: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoFxCompleteDirectedPowerDown(handle: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoFxCompleteIdleCondition(handle: Long, component: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoFxCompleteIdleState(handle: Long, component: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoFxIdleComponent(handle: Long, component: Int, flags: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoFxIssueComponentPerfStateChange(handle: Long, flags: Int, component: Int, perfchange: Long, context: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoFxIssueComponentPerfStateChangeMultiple(handle: Long, flags: Int, component: Int, perfchangescount: Int, perfchanges: Long, context: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoFxNotifySurprisePowerOn(pdo: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoFxPowerControl(handle: Long, powercontrolcode: Long, inbuffer: Long, inbuffersize: Long, outbuffer: Long, outbuffersize: Long, bytesreturned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoFxPowerOnCrashdumpDevice(handle: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoFxQueryCurrentComponentPerfState(handle: Long, flags: Int, component: Int, setindex: Int, currentperf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoFxRegisterComponentPerfStates(handle: Long, component: Int, flags: Long, componentperfstatecallback: Long, inputstateinfo: Long, outputstateinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoFxRegisterCrashdumpDevice(handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoFxRegisterDevice(pdo: Long, device: Long, handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoFxRegisterDripsWatchdogCallback(handle: Long, callback: Long, includechilddevices: Boolean, matchingdriverobject: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoFxReportDevicePoweredOn(handle: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoFxSetComponentLatency(handle: Long, component: Int, latency: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoFxSetComponentResidency(handle: Long, component: Int, residency: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoFxSetComponentWake(handle: Long, component: Int, wakehint: Boolean)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoFxSetDeviceIdleTimeout(handle: Long, idletimeout: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoFxSetTargetDripsDevicePowerState(handle: Long, targetstate: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoFxStartDevicePowerManagement(handle: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoFxUnregisterDevice(handle: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoGetSystemWake(irp: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoGetThermalRequestSupport(thermalrequest: Long, type: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoQueryWatchdogTime(pdo: Long, secondsremaining: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoRegisterDeviceForIdleDetection(deviceobject: Long, conservationidletime: Int, performanceidletime: Int, state: Int): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoRegisterPowerSettingCallback(deviceobject: Long, settingguid: Long, callback: Long, context: Long, handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoRegisterSystemState(statehandle: Long, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoSetDeviceBusyEx(idlepointer: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoSetHiberRange(memorymap: Long, flags: Int, address: Long, length: Long, tag: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoSetPowerRequest(powerrequest: Long, type: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoSetSystemState(flags: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoSetSystemWake(irp: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoSetSystemWakeDevice(deviceobject: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoSetThermalActiveCooling(thermalrequest: Long, engaged: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoSetThermalPassiveCooling(thermalrequest: Long, throttle: Byte): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoStartDeviceBusy(idlepointer: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoStartNextPowerIrp(irp: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoUnregisterPowerSettingCallback(handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPoUnregisterSystemState(statehandle: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesProbeForRead(address: Long, length: Long, alignment: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesProbeForWrite(address: Long, length: Long, alignment: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsAcquireSiloHardReference(silo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsAllocSiloContextSlot(reserved: Long, returnedcontextslot: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsAllocateAffinityToken(affinitytoken: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsAttachSiloToCurrentThread(silo: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsCreateSiloContext(silo: Long, size: Int, pooltype: Int, contextcleanupcallback: Long, returnedsilocontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsCreateSystemThread(threadhandle: Long, desiredaccess: Int, objectattributes: Long, processhandle: Long, clientid: Long, startroutine: Long, startcontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsDereferenceSiloContext(silocontext: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsDetachSiloFromCurrentThread(previoussilo: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsFreeAffinityToken(affinitytoken: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsFreeSiloContextSlot(contextslot: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsGetCurrentProcessId(): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsGetCurrentServerSilo(): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsGetCurrentServerSiloName(): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsGetCurrentSilo(): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsGetCurrentThreadId(): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsGetCurrentThreadTeb(): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsGetEffectiveServerSilo(silo: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsGetHostSilo(): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsGetJobServerSilo(job: Long, serversilo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsGetJobSilo(job: Long, silo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsGetParentSilo(job: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsGetPermanentSiloContext(silo: Long, contextslot: Int, returnedsilocontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsGetProcessCreateTimeQuadPart(process: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsGetProcessExitStatus(process: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsGetProcessId(process: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsGetProcessStartKey(process: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsGetServerSiloServiceSessionId(silo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsGetSiloContainerId(silo: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsGetSiloContext(silo: Long, contextslot: Int, returnedsilocontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsGetSiloMonitorContextSlot(monitor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsGetThreadCreateTime(thread: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsGetThreadExitStatus(thread: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsGetThreadId(thread: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsGetThreadProcessId(thread: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsGetThreadProperty(thread: Long, key: Long, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsGetThreadServerSilo(thread: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsGetVersion(majorversion: Long, minorversion: Long, buildnumber: Long, csdversion: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsInsertPermanentSiloContext(silo: Long, contextslot: Int, silocontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsInsertSiloContext(silo: Long, contextslot: Int, silocontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsIsCurrentThreadInServerSilo(): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsIsCurrentThreadPrefetching(): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsIsHostSilo(silo: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsMakeSiloContextPermanent(silo: Long, contextslot: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsQueryTotalCycleTimeProcess(process: Long, cycletimestamp: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsReferenceSiloContext(silocontext: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsRegisterSiloMonitor(registration: Long, returnedmonitor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsReleaseSiloHardReference(silo: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsRemoveCreateThreadNotifyRoutine(notifyroutine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsRemoveLoadImageNotifyRoutine(notifyroutine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsRemoveSiloContext(silo: Long, contextslot: Int, removedsilocontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsReplaceSiloContext(silo: Long, contextslot: Int, newsilocontext: Long, oldsilocontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsRevertToUserMultipleGroupAffinityThread(affinitytoken: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsSetCreateProcessNotifyRoutine(notifyroutine: Long, remove: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsSetCreateProcessNotifyRoutineEx(notifyroutine: Long, remove: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsSetCreateProcessNotifyRoutineEx2(notifytype: Int, notifyinformation: Long, remove: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsSetCreateThreadNotifyRoutine(notifyroutine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsSetCreateThreadNotifyRoutineEx(notifytype: Int, notifyinformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsSetCurrentThreadPrefetching(prefetching: Boolean): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsSetLoadImageNotifyRoutine(notifyroutine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsSetLoadImageNotifyRoutineEx(notifyroutine: Long, flags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsSetSystemMultipleGroupAffinityThread(groupaffinities: Long, groupcount: Short, affinitytoken: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsStartSiloMonitor(monitor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsTerminateServerSilo(serversilo: Long, exitstatus: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsTerminateSystemThread(exitstatus: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsUnregisterSiloMonitor(monitor: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPsWrapApcWow64Thread(apccontext: Long, apcroutine: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPshedAllocateMemory(size: Int): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPshedFreeMemory(address: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPshedIsSystemWheaEnabled(): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPshedRegisterPlugin(packet: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPshedSynchronizeExecution(errorsource: Long, synchronizeroutine: Long, synchronizecontext: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesPshedUnregisterPlugin(pluginhandle: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlAppendUnicodeStringToString(destination: Long, source: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlAppendUnicodeToString(destination: Long, source: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlAreBitsClear(bitmapheader: Long, startingindex: Int, length: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlAreBitsSet(bitmapheader: Long, startingindex: Int, length: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlAssert(voidfailedassertion: Long, voidfilename: Long, linenumber: Int, mutablemessage: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlCheckRegistryKey(relativeto: Int, path: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlClearAllBits(bitmapheader: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlClearBit(bitmapheader: Long, bitnumber: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlClearBits(bitmapheader: Long, startingindex: Int, numbertoclear: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlCmDecodeMemIoResource(descriptor: Long, start: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlCmEncodeMemIoResource(descriptor: Long, type: Byte, length: Long, start: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlCompareString(string1: Long, string2: Long, caseinsensitive: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlCompareUnicodeString(string1: Long, string2: Long, caseinsensitive: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlCompareUnicodeStrings(string1: Long, string1length: Long, string2: Long, string2length: Long, caseinsensitive: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlContractHashTable(hashtable: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlCopyBitMap(source: Long, destination: Long, targetbit: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlCopyString(destinationstring: Long, sourcestring: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlCopyUnicodeString(destinationstring: Long, sourcestring: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlCreateHashTable(hashtable: Long, shift: Int, flags: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlCreateHashTableEx(hashtable: Long, initialsize: Int, shift: Int, flags: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlCreateRegistryKey(relativeto: Int, path: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlCreateSecurityDescriptor(securitydescriptor: Long, revision: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlDelete(links: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlDeleteElementGenericTable(table: Long, buffer: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlDeleteElementGenericTableAvl(table: Long, buffer: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlDeleteElementGenericTableAvlEx(table: Long, nodeorparent: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlDeleteHashTable(hashtable: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlDeleteNoSplay(links: Long, root: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlDeleteRegistryValue(relativeto: Int, path: Long, valuename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlDowncaseUnicodeChar(sourcecharacter: Short): Short

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlEndEnumerationHashTable(hashtable: Long, enumerator: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlEndStrongEnumerationHashTable(hashtable: Long, enumerator: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlEndWeakEnumerationHashTable(hashtable: Long, enumerator: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlEnumerateEntryHashTable(hashtable: Long, enumerator: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTable(table: Long, restart: Boolean): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTableAvl(table: Long, restart: Boolean): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTableLikeADirectory(table: Long, matchfunction: Long, matchdata: Long, nextflag: Int, restartkey: Long, deletecount: Long, buffer: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTableWithoutSplaying(table: Long, restartkey: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTableWithoutSplayingAvl(table: Long, restartkey: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlEqualString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlEqualUnicodeString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlExpandHashTable(hashtable: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlExtractBitMap(source: Long, destination: Long, targetbit: Int, numberofbits: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlFindClearBits(bitmapheader: Long, numbertofind: Int, hintindex: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlFindClearBitsAndSet(bitmapheader: Long, numbertofind: Int, hintindex: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlFindClearRuns(bitmapheader: Long, runarray: Long, sizeofrunarray: Int, locatelongestruns: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlFindClosestEncodableLength(sourcelength: Long, targetlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlFindFirstRunClear(bitmapheader: Long, startingindex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlFindLastBackwardRunClear(bitmapheader: Long, fromindex: Int, startingrunindex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlFindLeastSignificantBit(set: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlFindLongestRunClear(bitmapheader: Long, startingindex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlFindMostSignificantBit(set: Long): Byte

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlFindNextForwardRunClear(bitmapheader: Long, fromindex: Int, startingrunindex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlFindSetBits(bitmapheader: Long, numbertofind: Int, hintindex: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlFindSetBitsAndClear(bitmapheader: Long, numbertofind: Int, hintindex: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlFreeUTF8String(utf8string: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlGUIDFromString(guidstring: Long, guid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlGenerateClass5Guid(namespaceguid: Long, buffer: Long, buffersize: Int, guid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlGetActiveConsoleId(): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlGetCallersAddress(callersaddress: Long, callerscaller: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlGetConsoleSessionForegroundProcessId(): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlGetElementGenericTable(table: Long, i: Int): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlGetElementGenericTableAvl(table: Long, i: Int): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlGetEnabledExtendedFeatures(featuremask: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlGetNextEntryHashTable(hashtable: Long, context: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlGetNtProductType(ntproducttype: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlGetNtSystemRoot(): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlGetPersistedStateLocation(sourceid: Long, customvalue: Long, defaultpath: Long, statelocationtype: Int, targetpath: Long, bufferlengthin: Int, bufferlengthout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlGetSuiteMask(): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlGetVersion(lpversioninformation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlHashUnicodeString(string: Long, caseinsensitive: Boolean, hashalgorithm: Int, hashvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlInitEnumerationHashTable(hashtable: Long, enumerator: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlInitStrongEnumerationHashTable(hashtable: Long, enumerator: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlInitUTF8String(destinationstring: Long, sourcestring: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlInitUTF8StringEx(destinationstring: Long, sourcestring: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlInitWeakEnumerationHashTable(hashtable: Long, enumerator: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlInitializeBitMap(bitmapheader: Long, bitmapbuffer: Long, sizeofbitmap: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlInitializeGenericTable(table: Long, compareroutine: Long, allocateroutine: Long, freeroutine: Long, tablecontext: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlInitializeGenericTableAvl(table: Long, compareroutine: Long, allocateroutine: Long, freeroutine: Long, tablecontext: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlInsertElementGenericTable(table: Long, buffer: Long, buffersize: Int, newelement: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlInsertElementGenericTableAvl(table: Long, buffer: Long, buffersize: Int, newelement: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlInsertElementGenericTableFull(table: Long, buffer: Long, buffersize: Int, newelement: Long, nodeorparent: Long, searchresult: Int): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlInsertElementGenericTableFullAvl(table: Long, buffer: Long, buffersize: Int, newelement: Long, nodeorparent: Long, searchresult: Int): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlInsertEntryHashTable(hashtable: Long, entry: Long, signature: Long, context: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlInt64ToUnicodeString(value: Long, base: Int, string: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlIntegerToUnicodeString(value: Int, base: Int, string: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlIoDecodeMemIoResource(descriptor: Long, alignment: Long, minimumaddress: Long, maximumaddress: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlIoEncodeMemIoResource(descriptor: Long, type: Byte, length: Long, alignment: Long, minimumaddress: Long, maximumaddress: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlIsApiSetImplemented(apisetname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlIsGenericTableEmpty(table: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlIsGenericTableEmptyAvl(table: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlIsMultiSessionSku(): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlIsMultiUsersInSessionSku(): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlIsNtDdiVersionAvailable(version: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlIsServicePackVersionInstalled(version: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlIsStateSeparationEnabled(): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlIsUntrustedObject(handle: Long, obj: Long, untrustedobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlLengthSecurityDescriptor(securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlLookupElementGenericTable(table: Long, buffer: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlLookupElementGenericTableAvl(table: Long, buffer: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlLookupElementGenericTableFull(table: Long, buffer: Long, nodeorparent: Long, searchresult: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlLookupElementGenericTableFullAvl(table: Long, buffer: Long, nodeorparent: Long, searchresult: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlLookupEntryHashTable(hashtable: Long, signature: Long, context: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlLookupFirstMatchingElementGenericTableAvl(table: Long, buffer: Long, restartkey: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlMapGenericMask(accessmask: Long, genericmapping: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlNormalizeSecurityDescriptor(securitydescriptor: Long, securitydescriptorlength: Int, newsecuritydescriptor: Long, newsecuritydescriptorlength: Long, checkonly: Boolean): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlNumberGenericTableElements(table: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlNumberGenericTableElementsAvl(table: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlNumberOfClearBits(bitmapheader: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlNumberOfClearBitsInRange(bitmapheader: Long, startingindex: Int, length: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlNumberOfSetBits(bitmapheader: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlNumberOfSetBitsInRange(bitmapheader: Long, startingindex: Int, length: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlNumberOfSetBitsUlongPtr(target: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlPrefetchMemoryNonTemporal(source: Long, length: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlPrefixUnicodeString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlQueryRegistryValueWithFallback(primaryhandle: Long, fallbackhandle: Long, valuename: Long, valuelength: Int, valuetype: Long, valuedata: Long, resultlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlQueryRegistryValues(relativeto: Int, path: Long, querytable: Long, context: Long, environment: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlQueryValidationRunlevel(componentname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlRealPredecessor(links: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlRealSuccessor(links: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlRemoveEntryHashTable(hashtable: Long, entry: Long, context: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlRunOnceBeginInitialize(runonce: Long, flags: Int, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlRunOnceComplete(runonce: Long, flags: Int, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlRunOnceExecuteOnce(runonce: Long, initfn: Long, parameter: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlRunOnceInitialize(runonce: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlSetAllBits(bitmapheader: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlSetBit(bitmapheader: Long, bitnumber: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlSetBits(bitmapheader: Long, startingindex: Int, numbertoset: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlSetDaclSecurityDescriptor(securitydescriptor: Long, daclpresent: Boolean, dacl: Long, dacldefaulted: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlSetSystemGlobalData(dataid: Int, buffer: Long, size: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlSplay(links: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlStringFromGUID(guid: Long, guidstring: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlStronglyEnumerateEntryHashTable(hashtable: Long, enumerator: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlSubtreePredecessor(links: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlSubtreeSuccessor(links: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlSuffixUnicodeString(string1: Long, string2: Long, caseinsensitive: Boolean): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlTestBit(bitmapheader: Long, bitnumber: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlTimeFieldsToTime(timefields: Long, time: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlTimeToTimeFields(time: Long, timefields: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlUTF8StringToUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlUTF8ToUnicodeN(unicodestringdestination: Long, unicodestringmaxbytecount: Int, unicodestringactualbytecount: Long, utf8stringsource: Long, utf8stringbytecount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlUnicodeStringToInt64(string: Long, base: Int, number: Long, endpointer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlUnicodeStringToInteger(string: Long, base: Int, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlUnicodeStringToUTF8String(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlUnicodeToUTF8N(utf8stringdestination: Long, utf8stringmaxbytecount: Int, utf8stringactualbytecount: Long, unicodestringsource: Long, unicodestringbytecount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlUpcaseUnicodeChar(sourcecharacter: Short): Short

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlUpcaseUnicodeString(destinationstring: Long, sourcestring: Long, allocatedestinationstring: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlUpperChar(character: Byte): Byte

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlUpperString(destinationstring: Long, sourcestring: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlValidRelativeSecurityDescriptor(securitydescriptorinput: Long, securitydescriptorlength: Int, requiredinformation: Int): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlValidSecurityDescriptor(securitydescriptor: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlVerifyVersionInfo(versioninfo: Long, typemask: Int, conditionmask: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlVolumeDeviceToDosName(volumedeviceobject: Long, dosname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlWalkFrameChain(callers: Long, count: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlWeaklyEnumerateEntryHashTable(hashtable: Long, enumerator: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlWriteRegistryValue(relativeto: Int, path: Long, valuename: Long, valuetype: Int, valuedata: Long, valuelength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlxAnsiStringToUnicodeSize(ansistring: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesRtlxUnicodeStringToAnsiSize(unicodestring: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesSeAccessCheck(securitydescriptor: Long, subjectsecuritycontext: Long, subjectcontextlocked: Boolean, desiredaccess: Int, previouslygrantedaccess: Int, privileges: Long, genericmapping: Long, accessmode: Byte, grantedaccess: Long, accessstatus: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesSeAssignSecurity(parentdescriptor: Long, explicitdescriptor: Long, newdescriptor: Long, isdirectoryobject: Boolean, subjectcontext: Long, genericmapping: Long, pooltype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesSeAssignSecurityEx(parentdescriptor: Long, explicitdescriptor: Long, newdescriptor: Long, objecttype: Long, isdirectoryobject: Boolean, autoinheritflags: Int, subjectcontext: Long, genericmapping: Long, pooltype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesSeCaptureSubjectContext(subjectcontext: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesSeComputeAutoInheritByObjectType(objecttype: Long, securitydescriptor: Long, parentsecuritydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesSeDeassignSecurity(securitydescriptor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesSeEtwWriteKMCveEvent(cveid: Long, additionaldetails: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesSeLockSubjectContext(subjectcontext: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesSeRegisterImageVerificationCallback(imagetype: Int, callbacktype: Int, callbackfunction: Long, callbackcontext: Long, token: Long, callbackhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesSeReleaseSubjectContext(subjectcontext: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesSeReportSecurityEvent(flags: Int, sourcename: Long, usersid: Long, auditparameters: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesSeSetAuditParameter(auditparameters: Long, type: Int, index: Int, data: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesSeUnlockSubjectContext(subjectcontext: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesSeUnregisterImageVerificationCallback(callbackhandle: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesSeValidSecurityDescriptor(length: Int, securitydescriptor: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesTmCommitComplete(enlistment: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesTmCommitEnlistment(enlistment: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesTmCommitTransaction(transaction: Long, wait: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesTmCreateEnlistment(enlistmenthandle: Long, previousmode: Byte, desiredaccess: Int, objectattributes: Long, resourcemanager: Long, transaction: Long, createoptions: Int, notificationmask: Int, enlistmentkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesTmDereferenceEnlistmentKey(enlistment: Long, lastreference: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesTmEnableCallbacks(resourcemanager: Long, callbackroutine: Long, rmkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesTmGetTransactionId(transaction: Long, transactionid: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesTmInitializeTransactionManager(transactionmanager: Long, logfilename: Long, tmid: Long, createoptions: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesTmIsTransactionActive(transaction: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesTmPrePrepareComplete(enlistment: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesTmPrePrepareEnlistment(enlistment: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesTmPrepareComplete(enlistment: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesTmPrepareEnlistment(enlistment: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesTmPropagationComplete(resourcemanager: Long, requestcookie: Int, bufferlength: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesTmPropagationFailed(resourcemanager: Long, requestcookie: Int, status: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesTmReadOnlyEnlistment(enlistment: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesTmRecoverEnlistment(enlistment: Long, enlistmentkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesTmRecoverResourceManager(resourcemanager: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesTmRecoverTransactionManager(tm: Long, targetvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesTmReferenceEnlistmentKey(enlistment: Long, key: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesTmRenameTransactionManager(logfilename: Long, existingtransactionmanagerguid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesTmRequestOutcomeEnlistment(enlistment: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesTmRollbackComplete(enlistment: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesTmRollbackEnlistment(enlistment: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesTmRollbackTransaction(transaction: Long, wait: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesTmSinglePhaseReject(enlistment: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesVslCreateSecureSection(handle: Long, targetprocess: Long, mdl: Long, devicepageprotection: Int, attributes: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesVslDeleteSecureSection(globalhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesWheaAddErrorSource(errorsource: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesWheaAddErrorSourceDeviceDriver(context: Long, configuration: Long, numberpreallocatederrorreports: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesWheaAddErrorSourceDeviceDriverV1(context: Long, configuration: Long, numbufferstopreallocate: Int, maxdatalength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesWheaAddHwErrorReportSectionDeviceDriver(errorhandle: Long, sectiondatalength: Int, bufferset: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesWheaConfigureErrorSource(sourcetype: Int, configuration: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesWheaCreateHwErrorReportDeviceDriver(errorsourceid: Int, deviceobject: Long): Long

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesWheaErrorSourceGetState(errorsourceid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesWheaGetNotifyAllOfflinesPolicy(): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesWheaHighIrqlLogSelEventHandlerRegister(handler: Long, context: Long): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesWheaHighIrqlLogSelEventHandlerUnregister()

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesWheaHwErrorReportAbandonDeviceDriver(errorhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesWheaHwErrorReportSetSectionNameDeviceDriver(bufferset: Long, namelength: Int, name: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesWheaHwErrorReportSetSeverityDeviceDriver(errorhandle: Long, errorseverity: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesWheaHwErrorReportSubmitDeviceDriver(errorhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesWheaInitializeRecordHeader(header: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesWheaIsCriticalState(): Boolean

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesWheaLogInternalEvent(entry: Long)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesWheaRegisterInUsePageOfflineNotification(callback: Long, context: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesWheaRemoveErrorSource(errorsourceid: Int)

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesWheaRemoveErrorSourceDeviceDriver(errorsourceid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesWheaReportHwError(errorpacket: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesWheaReportHwErrorDeviceDriver(errorsourceid: Int, deviceobject: Long, errordata: Long, errordatalength: Int, sectiontypeguid: Long, errorseverity: Int, devicefriendlyname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesWheaUnconfigureErrorSource(sourcetype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesWheaUnregisterInUsePageOfflineNotification(callback: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesWmiQueryTraceInformation(traceinformationclass: Int, traceinformation: Long, traceinformationlength: Int, requiredlength: Long, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwAllocateLocallyUniqueId(luid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwClose(handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwCommitComplete(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwCommitEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwCommitTransaction(transactionhandle: Long, wait: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwCreateEnlistment(enlistmenthandle: Long, desiredaccess: Int, resourcemanagerhandle: Long, transactionhandle: Long, objectattributes: Long, createoptions: Int, notificationmask: Int, enlistmentkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwCreateFile(filehandle: Long, desiredaccess: Int, objectattributes: Long, iostatusblock: Long, allocationsize: Long, fileattributes: Int, shareaccess: Int, createdisposition: Int, createoptions: Int, eabuffer: Long, ealength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwCreateResourceManager(resourcemanagerhandle: Long, desiredaccess: Int, tmhandle: Long, resourcemanagerguid: Long, objectattributes: Long, createoptions: Int, description: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwCreateSection(sectionhandle: Long, desiredaccess: Int, objectattributes: Long, maximumsize: Long, sectionpageprotection: Int, allocationattributes: Int, filehandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwCreateTransaction(transactionhandle: Long, desiredaccess: Int, objectattributes: Long, uow: Long, tmhandle: Long, createoptions: Int, isolationlevel: Int, isolationflags: Int, timeout: Long, description: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwCreateTransactionManager(tmhandle: Long, desiredaccess: Int, objectattributes: Long, logfilename: Long, createoptions: Int, commitstrength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwDeviceIoControlFile(filehandle: Long, event: Long, apcroutine: Long, apccontext: Long, iostatusblock: Long, iocontrolcode: Int, inputbuffer: Long, inputbufferlength: Int, outputbuffer: Long, outputbufferlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwDisplayString(string: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwEnumerateTransactionObject(rootobjecthandle: Long, querytype: Int, objectcursor: Long, objectcursorlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwGetNotificationResourceManager(resourcemanagerhandle: Long, transactionnotification: Long, notificationlength: Int, timeout: Long, returnlength: Long, asynchronous: Int, asynchronouscontext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwLoadDriver(driverservicename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwMakeTemporaryObject(handle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwManagePartition(targethandle: Long, sourcehandle: Long, partitioninformationclass: Int, partitioninformation: Long, partitioninformationlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwOpenEnlistment(enlistmenthandle: Long, desiredaccess: Int, rmhandle: Long, enlistmentguid: Long, objectattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwOpenFile(filehandle: Long, desiredaccess: Int, objectattributes: Long, iostatusblock: Long, shareaccess: Int, openoptions: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwOpenResourceManager(resourcemanagerhandle: Long, desiredaccess: Int, tmhandle: Long, resourcemanagerguid: Long, objectattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwOpenSymbolicLinkObject(linkhandle: Long, desiredaccess: Int, objectattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwOpenTransaction(transactionhandle: Long, desiredaccess: Int, objectattributes: Long, uow: Long, tmhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwOpenTransactionManager(tmhandle: Long, desiredaccess: Int, objectattributes: Long, logfilename: Long, tmidentity: Long, openoptions: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwPowerInformation(informationlevel: Int, inputbuffer: Long, inputbufferlength: Int, outputbuffer: Long, outputbufferlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwPrePrepareComplete(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwPrePrepareEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwPrepareComplete(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwPrepareEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwPropagationComplete(resourcemanagerhandle: Long, requestcookie: Int, bufferlength: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwPropagationFailed(resourcemanagerhandle: Long, requestcookie: Int, propstatus: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwQueryInformationByName(objectattributes: Long, iostatusblock: Long, fileinformation: Long, length: Int, fileinformationclass: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwQueryInformationEnlistment(enlistmenthandle: Long, enlistmentinformationclass: Int, enlistmentinformation: Long, enlistmentinformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwQueryInformationFile(filehandle: Long, iostatusblock: Long, fileinformation: Long, length: Int, fileinformationclass: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwQueryInformationResourceManager(resourcemanagerhandle: Long, resourcemanagerinformationclass: Int, resourcemanagerinformation: Long, resourcemanagerinformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwQueryInformationTransaction(transactionhandle: Long, transactioninformationclass: Int, transactioninformation: Long, transactioninformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwQueryInformationTransactionManager(transactionmanagerhandle: Long, transactionmanagerinformationclass: Int, transactionmanagerinformation: Long, transactionmanagerinformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwQuerySymbolicLinkObject(linkhandle: Long, linktarget: Long, returnedlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwReadFile(filehandle: Long, event: Long, apcroutine: Long, apccontext: Long, iostatusblock: Long, buffer: Long, length: Int, byteoffset: Long, key: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwReadOnlyEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwRecoverEnlistment(enlistmenthandle: Long, enlistmentkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwRecoverResourceManager(resourcemanagerhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwRecoverTransactionManager(transactionmanagerhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwRegisterProtocolAddressInformation(resourcemanager: Long, protocolid: Long, protocolinformationsize: Int, protocolinformation: Long, createoptions: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwRenameTransactionManager(logfilename: Long, existingtransactionmanagerguid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwRollbackComplete(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwRollbackEnlistment(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwRollbackTransaction(transactionhandle: Long, wait: Boolean): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwRollforwardTransactionManager(transactionmanagerhandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwSetInformationEnlistment(enlistmenthandle: Long, enlistmentinformationclass: Int, enlistmentinformation: Long, enlistmentinformationlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwSetInformationFile(filehandle: Long, iostatusblock: Long, fileinformation: Long, length: Int, fileinformationclass: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwSetInformationResourceManager(resourcemanagerhandle: Long, resourcemanagerinformationclass: Int, resourcemanagerinformation: Long, resourcemanagerinformationlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwSetInformationTransaction(transactionhandle: Long, transactioninformationclass: Int, transactioninformation: Long, transactioninformationlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwSetInformationTransactionManager(tmhandle: Long, transactionmanagerinformationclass: Int, transactionmanagerinformation: Long, transactionmanagerinformationlength: Int): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwSinglePhaseReject(enlistmenthandle: Long, tmvirtualclock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwUnloadDriver(driverservicename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesZwWriteFile(filehandle: Long, event: Long, apcroutine: Long, apccontext: Long, iostatusblock: Long, buffer: Long, length: Int, byteoffset: Long, key: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesVDbgPrintEx(componentid: Int, level: Int, format: Long, arglist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSystemservicesVDbgPrintExWithPrefix(prefix: Long, componentid: Int, level: Int, format: Long, arglist: Long): Int
}

public actual fun clfsAddLogContainer(plfolog: ConstPtr, pcbcontainer: ConstPtr, puszcontainerpath: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsAddLogContainer(plfolog.rawAddress, pcbcontainer.rawAddress, puszcontainerpath.rawAddress)

public actual fun clfsAddLogContainerSet(plfolog: ConstPtr, ccontainers: UShort, pcbcontainer: ConstPtr, rguszcontainerpath: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsAddLogContainerSet(plfolog.rawAddress, ccontainers.toShort(), pcbcontainer.rawAddress, rguszcontainerpath.rawAddress)

public actual fun clfsAdvanceLogBase(pvmarshalcontext: MutPtr, plsnbase: ConstPtr, fflags: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsAdvanceLogBase(pvmarshalcontext.rawAddress, plsnbase.rawAddress, fflags.toInt())

public actual fun clfsAlignReservedLog(pvmarshalcontext: ConstPtr, crecords: UInt, rgcbreservation: ConstPtr, pcbalignreservation: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsAlignReservedLog(pvmarshalcontext.rawAddress, crecords.toInt(), rgcbreservation.rawAddress, pcbalignreservation.rawAddress)

public actual fun clfsAllocReservedLog(pvmarshalcontext: ConstPtr, crecords: UInt, pcbadjustment: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsAllocReservedLog(pvmarshalcontext.rawAddress, crecords.toInt(), pcbadjustment.rawAddress)

public actual fun clfsCloseAndResetLogFile(plfolog: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsCloseAndResetLogFile(plfolog.rawAddress)

public actual fun clfsCloseLogFileObject(plfolog: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsCloseLogFileObject(plfolog.rawAddress)

public actual fun clfsCreateLogFile(pplfolog: MutPtr, puszlogfilename: ConstPtr, fdesiredaccess: UInt, dwsharemode: UInt, psdlogfile: PsecurityDescriptor, fcreatedisposition: UInt, fcreateoptions: UInt, fflagsandattributes: UInt, flogoptionflag: UInt, pvcontext: ConstPtr, cbcontext: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsCreateLogFile(pplfolog.rawAddress, puszlogfilename.rawAddress, fdesiredaccess.toInt(), dwsharemode.toInt(), psdlogfile.rawAddress, fcreatedisposition.toInt(), fcreateoptions.toInt(), fflagsandattributes.toInt(), flogoptionflag.toInt(), pvcontext.rawAddress, cbcontext.toInt())

public actual fun clfsCreateMarshallingArea(plfolog: ConstPtr, epooltype: PoolType, pfnallocbuffer: PallocateFunction, pfnfreebuffer: PfreeFunction, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, ppvmarshalcontext: MutPtr): Ntstatus =
    0

public actual fun clfsCreateMarshallingAreaEx(plfolog: ConstPtr, epooltype: PoolType, pfnallocbuffer: PallocateFunction, pfnfreebuffer: PfreeFunction, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, calignmentsize: UInt, fflags: ULong, ppvmarshalcontext: MutPtr): Ntstatus =
    0

public actual fun clfsCreateScanContext(plfolog: ConstPtr, cfromcontainer: UInt, ccontainers: UInt, escanmode: UByte, pcxscan: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsCreateScanContext(plfolog.rawAddress, cfromcontainer.toInt(), ccontainers.toInt(), escanmode.toByte(), pcxscan.rawAddress)

public actual fun clfsDeleteLogByPointer(plfolog: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsDeleteLogByPointer(plfolog.rawAddress)

public actual fun clfsDeleteLogFile(puszlogfilename: ConstPtr, pvreserved: ConstPtr, flogoptionflag: UInt, pvcontext: ConstPtr, cbcontext: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsDeleteLogFile(puszlogfilename.rawAddress, pvreserved.rawAddress, flogoptionflag.toInt(), pvcontext.rawAddress, cbcontext.toInt())

public actual fun clfsDeleteMarshallingArea(pvmarshalcontext: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsDeleteMarshallingArea(pvmarshalcontext.rawAddress)

public actual fun clfsEarlierLsn(plsn: ConstPtr): ClsLsn =
    ClsLsn()

public actual fun clfsFinalize() {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsFinalize()
}

public actual fun clfsFlushBuffers(pvmarshalcontext: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsFlushBuffers(pvmarshalcontext.rawAddress)

public actual fun clfsFlushToLsn(pvmarshalcontext: ConstPtr, plsnflush: ConstPtr, plsnlastflushed: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsFlushToLsn(pvmarshalcontext.rawAddress, plsnflush.rawAddress, plsnlastflushed.rawAddress)

public actual fun clfsFreeReservedLog(pvmarshalcontext: ConstPtr, crecords: UInt, pcbadjustment: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsFreeReservedLog(pvmarshalcontext.rawAddress, crecords.toInt(), pcbadjustment.rawAddress)

public actual fun clfsGetContainerName(plfolog: ConstPtr, cidlogicalcontainer: UInt, puszcontainername: MutPtr, pcactuallencontainername: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsGetContainerName(plfolog.rawAddress, cidlogicalcontainer.toInt(), puszcontainername.rawAddress, pcactuallencontainername.rawAddress)

public actual fun clfsGetIoStatistics(plfolog: ConstPtr, pvstatsbuffer: MutPtr, cbstatsbuffer: UInt, estatsclass: ClfsIostatsClass, pcbstatswritten: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsGetIoStatistics(plfolog.rawAddress, pvstatsbuffer.rawAddress, cbstatsbuffer.toInt(), estatsclass, pcbstatswritten.rawAddress)

public actual fun clfsGetLogFileInformation(plfolog: ConstPtr, pinfobuffer: MutPtr, pcbinfobuffer: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsGetLogFileInformation(plfolog.rawAddress, pinfobuffer.rawAddress, pcbinfobuffer.rawAddress)

public actual fun clfsInitialize(): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsInitialize()

public actual fun clfsLaterLsn(plsn: ConstPtr): ClsLsn =
    ClsLsn()

public actual fun clfsLsnBlockOffset(plsn: ConstPtr): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsLsnBlockOffset(plsn.rawAddress).toUInt()

public actual fun clfsLsnContainer(plsn: ConstPtr): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsLsnContainer(plsn.rawAddress).toUInt()

public actual fun clfsLsnCreate(cidcontainer: UInt, offblock: UInt, crecord: UInt): ClsLsn =
    ClsLsn()

public actual fun clfsLsnDifference(plsnstart: ConstPtr, plsnfinish: ConstPtr, cbcontainer: UInt, cbmaxblock: UInt, pcbdifference: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsLsnDifference(plsnstart.rawAddress, plsnfinish.rawAddress, cbcontainer.toInt(), cbmaxblock.toInt(), pcbdifference.rawAddress)

public actual fun clfsLsnEqual(plsn1: ConstPtr, plsn2: ConstPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsLsnEqual(plsn1.rawAddress, plsn2.rawAddress)

public actual fun clfsLsnGreater(plsn1: ConstPtr, plsn2: ConstPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsLsnGreater(plsn1.rawAddress, plsn2.rawAddress)

public actual fun clfsLsnInvalid(plsn: ConstPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsLsnInvalid(plsn.rawAddress)

public actual fun clfsLsnLess(plsn1: ConstPtr, plsn2: ConstPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsLsnLess(plsn1.rawAddress, plsn2.rawAddress)

public actual fun clfsLsnNull(plsn: ConstPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsLsnNull(plsn.rawAddress)

public actual fun clfsLsnRecordSequence(plsn: ConstPtr): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsLsnRecordSequence(plsn.rawAddress).toUInt()

public actual fun clfsMgmtDeregisterManagedClient(clientcookie: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsMgmtDeregisterManagedClient(clientcookie.rawAddress)

public actual fun clfsMgmtHandleLogFileFull(client: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsMgmtHandleLogFileFull(client.rawAddress)

public actual fun clfsMgmtInstallPolicy(logfile: ConstPtr, policy: ConstPtr, policylength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsMgmtInstallPolicy(logfile.rawAddress, policy.rawAddress, policylength.toInt())

public actual fun clfsMgmtQueryPolicy(logfile: ConstPtr, policytype: ClfsMgmtPolicyType, policy: MutPtr, policylength: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsMgmtQueryPolicy(logfile.rawAddress, policytype, policy.rawAddress, policylength.rawAddress)

public actual fun clfsMgmtRegisterManagedClient(logfile: ConstPtr, registrationdata: ConstPtr, clientcookie: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsMgmtRegisterManagedClient(logfile.rawAddress, registrationdata.rawAddress, clientcookie.rawAddress)

public actual fun clfsMgmtRemovePolicy(logfile: ConstPtr, policytype: ClfsMgmtPolicyType): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsMgmtRemovePolicy(logfile.rawAddress, policytype)

public actual fun clfsMgmtSetLogFileSize(logfile: ConstPtr, newsizeincontainers: ConstPtr, resultingsizeincontainers: MutPtr, completionroutine: PclfsSetLogSizeCompleteCallback, completionroutinedata: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsMgmtSetLogFileSize(logfile.rawAddress, newsizeincontainers.rawAddress, resultingsizeincontainers.rawAddress, 0L, completionroutinedata.rawAddress)

public actual fun clfsMgmtSetLogFileSizeAsClient(logfile: ConstPtr, clientcookie: ConstPtr, newsizeincontainers: ConstPtr, resultingsizeincontainers: MutPtr, completionroutine: PclfsSetLogSizeCompleteCallback, completionroutinedata: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsMgmtSetLogFileSizeAsClient(logfile.rawAddress, clientcookie.rawAddress, newsizeincontainers.rawAddress, resultingsizeincontainers.rawAddress, 0L, completionroutinedata.rawAddress)

public actual fun clfsMgmtTailAdvanceFailure(client: ConstPtr, reason: Ntstatus): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsMgmtTailAdvanceFailure(client.rawAddress, reason)

public actual fun clfsQueryLogFileInformation(plfolog: ConstPtr, einformationclass: ClsLogInformationClass, pinfoinputbuffer: ConstPtr, cbinfoinputbuffer: UInt, pinfobuffer: MutPtr, pcbinfobuffer: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsQueryLogFileInformation(plfolog.rawAddress, einformationclass, pinfoinputbuffer.rawAddress, cbinfoinputbuffer.toInt(), pinfobuffer.rawAddress, pcbinfobuffer.rawAddress)

public actual fun clfsReadLogRecord(pvmarshalcontext: ConstPtr, plsnfirst: MutPtr, pecontextmode: ClfsContextMode, ppvreadbuffer: MutPtr, pcbreadbuffer: MutPtr, perecordtype: MutPtr, plsnundonext: MutPtr, plsnprevious: MutPtr, ppvreadcontext: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsReadLogRecord(pvmarshalcontext.rawAddress, plsnfirst.rawAddress, pecontextmode, ppvreadbuffer.rawAddress, pcbreadbuffer.rawAddress, perecordtype.rawAddress, plsnundonext.rawAddress, plsnprevious.rawAddress, ppvreadcontext.rawAddress)

public actual fun clfsReadNextLogRecord(pvreadcontext: MutPtr, ppvbuffer: MutPtr, pcbbuffer: MutPtr, perecordtype: MutPtr, plsnuser: ConstPtr, plsnundonext: MutPtr, plsnprevious: MutPtr, plsnrecord: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsReadNextLogRecord(pvreadcontext.rawAddress, ppvbuffer.rawAddress, pcbbuffer.rawAddress, perecordtype.rawAddress, plsnuser.rawAddress, plsnundonext.rawAddress, plsnprevious.rawAddress, plsnrecord.rawAddress)

public actual fun clfsReadPreviousRestartArea(pvreadcontext: ConstPtr, ppvrestartbuffer: MutPtr, pcbrestartbuffer: MutPtr, plsnrestart: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsReadPreviousRestartArea(pvreadcontext.rawAddress, ppvrestartbuffer.rawAddress, pcbrestartbuffer.rawAddress, plsnrestart.rawAddress)

public actual fun clfsReadRestartArea(pvmarshalcontext: MutPtr, ppvrestartbuffer: MutPtr, pcbrestartbuffer: MutPtr, plsn: MutPtr, ppvreadcontext: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsReadRestartArea(pvmarshalcontext.rawAddress, ppvrestartbuffer.rawAddress, pcbrestartbuffer.rawAddress, plsn.rawAddress, ppvreadcontext.rawAddress)

public actual fun clfsRemoveLogContainer(plfolog: ConstPtr, puszcontainerpath: ConstPtr, fforce: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsRemoveLogContainer(plfolog.rawAddress, puszcontainerpath.rawAddress, fforce)

public actual fun clfsRemoveLogContainerSet(plfolog: ConstPtr, ccontainers: UShort, rgwszcontainerpath: ConstPtr, fforce: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsRemoveLogContainerSet(plfolog.rawAddress, ccontainers.toShort(), rgwszcontainerpath.rawAddress, fforce)

public actual fun clfsReserveAndAppendLog(pvmarshalcontext: ConstPtr, rgwriteentries: ConstPtr, cwriteentries: UInt, plsnundonext: ConstPtr, plsnprevious: ConstPtr, creserverecords: UInt, rgcbreservation: MutPtr, fflags: UInt, plsn: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsReserveAndAppendLog(pvmarshalcontext.rawAddress, rgwriteentries.rawAddress, cwriteentries.toInt(), plsnundonext.rawAddress, plsnprevious.rawAddress, creserverecords.toInt(), rgcbreservation.rawAddress, fflags.toInt(), plsn.rawAddress)

public actual fun clfsReserveAndAppendLogAligned(pvmarshalcontext: ConstPtr, rgwriteentries: ConstPtr, cwriteentries: UInt, cbentryalignment: UInt, plsnundonext: ConstPtr, plsnprevious: ConstPtr, creserverecords: UInt, rgcbreservation: MutPtr, fflags: UInt, plsn: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsReserveAndAppendLogAligned(pvmarshalcontext.rawAddress, rgwriteentries.rawAddress, cwriteentries.toInt(), cbentryalignment.toInt(), plsnundonext.rawAddress, plsnprevious.rawAddress, creserverecords.toInt(), rgcbreservation.rawAddress, fflags.toInt(), plsn.rawAddress)

public actual fun clfsScanLogContainers(pcxscan: MutPtr, escanmode: UByte): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsScanLogContainers(pcxscan.rawAddress, escanmode.toByte())

public actual fun clfsSetArchiveTail(plfolog: ConstPtr, plsnarchivetail: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsSetArchiveTail(plfolog.rawAddress, plsnarchivetail.rawAddress)

public actual fun clfsSetEndOfLog(plfolog: ConstPtr, plsnend: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsSetEndOfLog(plfolog.rawAddress, plsnend.rawAddress)

public actual fun clfsSetLogFileInformation(plfolog: ConstPtr, einformationclass: ClsLogInformationClass, pinfobuffer: ConstPtr, cbbuffer: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsSetLogFileInformation(plfolog.rawAddress, einformationclass, pinfobuffer.rawAddress, cbbuffer.toInt())

public actual fun clfsTerminateReadLog(pvcursorcontext: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsTerminateReadLog(pvcursorcontext.rawAddress)

public actual fun clfsWriteRestartArea(pvmarshalcontext: MutPtr, pvrestartbuffer: ConstPtr, cbrestartbuffer: UInt, plsnbase: ConstPtr, fflags: UInt, pcbwritten: MutPtr, plsnnext: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsWriteRestartArea(pvmarshalcontext.rawAddress, pvrestartbuffer.rawAddress, cbrestartbuffer.toInt(), plsnbase.rawAddress, fflags.toInt(), pcbwritten.rawAddress, plsnnext.rawAddress)

public actual fun cmCallbackGetKeyObjectID(cookie: ConstPtr, obj: ConstPtr, objectid: MutPtr, objectname: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesCmCallbackGetKeyObjectID(cookie.rawAddress, obj.rawAddress, objectid.rawAddress, objectname.rawAddress)

public actual fun cmCallbackGetKeyObjectIDEx(cookie: ConstPtr, obj: ConstPtr, objectid: MutPtr, objectname: MutPtr, flags: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesCmCallbackGetKeyObjectIDEx(cookie.rawAddress, obj.rawAddress, objectid.rawAddress, objectname.rawAddress, flags.toInt())

public actual fun cmCallbackReleaseKeyObjectIDEx(objectname: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesCmCallbackReleaseKeyObjectIDEx(objectname.rawAddress)
}

public actual fun cmGetBoundTransaction(cookie: ConstPtr, obj: ConstPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesCmGetBoundTransaction(cookie.rawAddress, obj.rawAddress))

public actual fun cmGetCallbackVersion(major: MutPtr, minor: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesCmGetCallbackVersion(major.rawAddress, minor.rawAddress)
}

public actual fun cmRegisterCallback(function: PexCallbackFunction, context: ConstPtr, cookie: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesCmRegisterCallback(0L, context.rawAddress, cookie.rawAddress)

public actual fun cmRegisterCallbackEx(function: PexCallbackFunction, altitude: ConstPtr, driver: ConstPtr, context: ConstPtr, cookie: MutPtr, reserved: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesCmRegisterCallbackEx(0L, altitude.rawAddress, driver.rawAddress, context.rawAddress, cookie.rawAddress, reserved.rawAddress)

public actual fun cmSetCallbackObjectContext(obj: MutPtr, cookie: ConstPtr, newcontext: ConstPtr, oldcontext: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesCmSetCallbackObjectContext(obj.rawAddress, cookie.rawAddress, newcontext.rawAddress, oldcontext.rawAddress)

public actual fun cmUnRegisterCallback(cookie: Long): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesCmUnRegisterCallback(cookie)

public actual fun dbgBreakPointWithStatus(status: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesDbgBreakPointWithStatus(status.toInt())
}

public actual fun dbgPrint(format: Pcstr, vararg variadicArgs: Long): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesDbgPrint(format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).toUInt()

public actual fun dbgPrintEx(componentid: UInt, level: UInt, format: Pcstr, vararg variadicArgs: Long): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesDbgPrintEx(componentid.toInt(), level.toInt(), format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).toUInt()

public actual fun dbgPrintReturnControlC(format: Pcstr, vararg variadicArgs: Long): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesDbgPrintReturnControlC(format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).toUInt()

public actual fun dbgPrompt(prompt: Pcstr, response: Pstr, length: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesDbgPrompt(prompt.rawAddress, response.rawAddress, length.toInt()).toUInt()

public actual fun dbgQueryDebugFilterState(componentid: UInt, level: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesDbgQueryDebugFilterState(componentid.toInt(), level.toInt())

public actual fun dbgSetDebugFilterState(componentid: UInt, level: UInt, state: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesDbgSetDebugFilterState(componentid.toInt(), level.toInt(), state)

public actual fun dbgSetDebugPrintCallback(debugprintcallback: PdebugPrintCallback, enable: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesDbgSetDebugPrintCallback(0L, enable)

public actual fun etwActivityIdControl(controlcode: UInt, activityid: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesEtwActivityIdControl(controlcode.toInt(), activityid.rawAddress)

public actual fun etwEventEnabled(reghandle: Reghandle, eventdescriptor: ConstPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesEtwEventEnabled(reghandle, eventdescriptor.rawAddress)

public actual fun etwProviderEnabled(reghandle: Reghandle, level: UByte, keyword: ULong): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesEtwProviderEnabled(reghandle, level.toByte(), keyword.toLong())

public actual fun etwRegister(providerid: ConstPtr, enablecallback: Petwenablecallback, callbackcontext: ConstPtr, reghandle: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesEtwRegister(providerid.rawAddress, 0L, callbackcontext.rawAddress, reghandle.rawAddress)

public actual fun etwSetInformation(reghandle: Reghandle, informationclass: EventInfoClass, eventinformation: ConstPtr, informationlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesEtwSetInformation(reghandle, informationclass, eventinformation.rawAddress, informationlength.toInt())

public actual fun etwUnregister(reghandle: Reghandle): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesEtwUnregister(reghandle)

public actual fun etwWrite(reghandle: Reghandle, eventdescriptor: ConstPtr, activityid: ConstPtr, userdatacount: UInt, userdata: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesEtwWrite(reghandle, eventdescriptor.rawAddress, activityid.rawAddress, userdatacount.toInt(), userdata.rawAddress)

public actual fun etwWriteEx(reghandle: Reghandle, eventdescriptor: ConstPtr, filter: ULong, flags: UInt, activityid: ConstPtr, relatedactivityid: ConstPtr, userdatacount: UInt, userdata: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesEtwWriteEx(reghandle, eventdescriptor.rawAddress, filter.toLong(), flags.toInt(), activityid.rawAddress, relatedactivityid.rawAddress, userdatacount.toInt(), userdata.rawAddress)

public actual fun etwWriteString(reghandle: Reghandle, level: UByte, keyword: ULong, activityid: ConstPtr, string: Pcwstr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesEtwWriteString(reghandle, level.toByte(), keyword.toLong(), activityid.rawAddress, string.rawAddress)

public actual fun etwWriteTransfer(reghandle: Reghandle, eventdescriptor: ConstPtr, activityid: ConstPtr, relatedactivityid: ConstPtr, userdatacount: UInt, userdata: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesEtwWriteTransfer(reghandle, eventdescriptor.rawAddress, activityid.rawAddress, relatedactivityid.rawAddress, userdatacount.toInt(), userdata.rawAddress)

public actual fun exAcquireFastMutex(fastmutex: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAcquireFastMutex(fastmutex.rawAddress)
}

public actual fun exAcquireFastMutexUnsafe(fastmutex: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAcquireFastMutexUnsafe(fastmutex.rawAddress)
}

public actual fun exAcquirePushLockExclusiveEx(pushlock: MutPtr, flags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAcquirePushLockExclusiveEx(pushlock.rawAddress, flags.toInt())
}

public actual fun exAcquirePushLockSharedEx(pushlock: MutPtr, flags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAcquirePushLockSharedEx(pushlock.rawAddress, flags.toInt())
}

public actual fun exAcquireResourceExclusiveLite(resource: MutPtr, wait: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAcquireResourceExclusiveLite(resource.rawAddress, wait)

public actual fun exAcquireResourceSharedLite(resource: MutPtr, wait: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAcquireResourceSharedLite(resource.rawAddress, wait)

public actual fun exAcquireRundownProtection(runref: MutPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAcquireRundownProtection(runref.rawAddress)

public actual fun exAcquireRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAcquireRundownProtectionCacheAware(runrefcacheaware)

public actual fun exAcquireRundownProtectionCacheAwareEx(runrefcacheaware: PexRundownRefCacheAware, count: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAcquireRundownProtectionCacheAwareEx(runrefcacheaware, count.toInt())

public actual fun exAcquireRundownProtectionEx(runref: MutPtr, count: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAcquireRundownProtectionEx(runref.rawAddress, count.toInt())

public actual fun exAcquireSharedStarveExclusive(resource: MutPtr, wait: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAcquireSharedStarveExclusive(resource.rawAddress, wait)

public actual fun exAcquireSharedWaitForExclusive(resource: MutPtr, wait: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAcquireSharedWaitForExclusive(resource.rawAddress, wait)

public actual fun exAcquireSpinLockExclusive(spinlock: MutPtr): UByte =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAcquireSpinLockExclusive(spinlock.rawAddress).toUByte()

public actual fun exAcquireSpinLockExclusiveAtDpcLevel(spinlock: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAcquireSpinLockExclusiveAtDpcLevel(spinlock.rawAddress)
}

public actual fun exAcquireSpinLockShared(spinlock: MutPtr): UByte =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAcquireSpinLockShared(spinlock.rawAddress).toUByte()

public actual fun exAcquireSpinLockSharedAtDpcLevel(spinlock: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAcquireSpinLockSharedAtDpcLevel(spinlock.rawAddress)
}

public actual fun exAllocateCacheAwareRundownProtection(pooltype: PoolType, pooltag: UInt): PexRundownRefCacheAware =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAllocateCacheAwareRundownProtection(pooltype, pooltag.toInt())

public actual fun exAllocatePool(pooltype: PoolType, numberofbytes: ULong): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAllocatePool(pooltype, numberofbytes.toLong()))

public actual fun exAllocatePool2(flags: ULong, numberofbytes: ULong, tag: UInt): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAllocatePool2(flags.toLong(), numberofbytes.toLong(), tag.toInt()))

public actual fun exAllocatePool3(flags: ULong, numberofbytes: ULong, tag: UInt, extendedparameters: ConstPtr, extendedparameterscount: UInt): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAllocatePool3(flags.toLong(), numberofbytes.toLong(), tag.toInt(), extendedparameters.rawAddress, extendedparameterscount.toInt()))

public actual fun exAllocatePoolWithQuota(pooltype: PoolType, numberofbytes: ULong): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAllocatePoolWithQuota(pooltype, numberofbytes.toLong()))

public actual fun exAllocatePoolWithQuotaTag(pooltype: PoolType, numberofbytes: ULong, tag: UInt): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAllocatePoolWithQuotaTag(pooltype, numberofbytes.toLong(), tag.toInt()))

public actual fun exAllocatePoolWithTag(pooltype: PoolType, numberofbytes: ULong, tag: UInt): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAllocatePoolWithTag(pooltype, numberofbytes.toLong(), tag.toInt()))

public actual fun exAllocatePoolWithTagPriority(pooltype: PoolType, numberofbytes: ULong, tag: UInt, priority: ExPoolPriority): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAllocatePoolWithTagPriority(pooltype, numberofbytes.toLong(), tag.toInt(), priority))

public actual fun exAllocateTimer(callback: PextCallback, callbackcontext: ConstPtr, attributes: UInt): PexTimer =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAllocateTimer(0L, callbackcontext.rawAddress, attributes.toInt())

public actual fun exCancelTimer(timer: PexTimer, parameters: ConstPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExCancelTimer(timer, parameters.rawAddress)

public actual fun exCleanupRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExCleanupRundownProtectionCacheAware(runrefcacheaware)
}

public actual fun exConvertExclusiveToSharedLite(resource: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExConvertExclusiveToSharedLite(resource.rawAddress)
}

public actual fun exCreateCallback(callbackobject: MutPtr, objectattributes: ConstPtr, create: Boolean, allowmultiplecallbacks: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExCreateCallback(callbackobject.rawAddress, objectattributes.rawAddress, create, allowmultiplecallbacks)

public actual fun exCreatePool(flags: UInt, tag: ULong, params: ConstPtr, poolhandle: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExCreatePool(flags.toInt(), tag.toLong(), params.rawAddress, poolhandle.rawAddress)

public actual fun exDeleteResourceLite(resource: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExDeleteResourceLite(resource.rawAddress)

public actual fun exDeleteTimer(timer: PexTimer, cancel: Boolean, wait: Boolean, parameters: ConstPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExDeleteTimer(timer, cancel, wait, parameters.rawAddress)

public actual fun exDestroyPool(poolhandle: Handle) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExDestroyPool(poolhandle.rawAddress)
}

public actual fun exEnterCriticalRegionAndAcquireResourceExclusive(resource: MutPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExEnterCriticalRegionAndAcquireResourceExclusive(resource.rawAddress))

public actual fun exEnterCriticalRegionAndAcquireResourceShared(resource: MutPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExEnterCriticalRegionAndAcquireResourceShared(resource.rawAddress))

public actual fun exEnterCriticalRegionAndAcquireSharedWaitForExclusive(resource: MutPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExEnterCriticalRegionAndAcquireSharedWaitForExclusive(resource.rawAddress))

public actual fun exEnumerateSystemFirmwareTables(firmwaretableprovidersignature: UInt, firmwaretablebuffer: MutPtr, bufferlength: UInt, returnlength: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExEnumerateSystemFirmwareTables(firmwaretableprovidersignature.toInt(), firmwaretablebuffer.rawAddress, bufferlength.toInt(), returnlength.rawAddress)

public actual fun exExtendZone(zone: MutPtr, segment: MutPtr, segmentsize: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExExtendZone(zone.rawAddress, segment.rawAddress, segmentsize.toInt())

public actual fun exFreeCacheAwareRundownProtection(runrefcacheaware: PexRundownRefCacheAware) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExFreeCacheAwareRundownProtection(runrefcacheaware)
}

public actual fun exFreePool(p: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExFreePool(p.rawAddress)
}

public actual fun exFreePool2(p: MutPtr, tag: UInt, extendedparameters: ConstPtr, extendedparameterscount: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExFreePool2(p.rawAddress, tag.toInt(), extendedparameters.rawAddress, extendedparameterscount.toInt())
}

public actual fun exFreePoolWithTag(p: MutPtr, tag: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExFreePoolWithTag(p.rawAddress, tag.toInt())
}

public actual fun exGetExclusiveWaiterCount(resource: ConstPtr): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExGetExclusiveWaiterCount(resource.rawAddress).toUInt()

public actual fun exGetFirmwareEnvironmentVariable(variablename: ConstPtr, vendorguid: ConstPtr, value: MutPtr, valuelength: MutPtr, attributes: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExGetFirmwareEnvironmentVariable(variablename.rawAddress, vendorguid.rawAddress, value.rawAddress, valuelength.rawAddress, attributes.rawAddress)

public actual fun exGetFirmwareType(): FirmwareType =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExGetFirmwareType()

public actual fun exGetPreviousMode(): Byte =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExGetPreviousMode()

public actual fun exGetSharedWaiterCount(resource: ConstPtr): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExGetSharedWaiterCount(resource.rawAddress).toUInt()

public actual fun exGetSystemFirmwareTable(firmwaretableprovidersignature: UInt, firmwaretableid: UInt, firmwaretablebuffer: MutPtr, bufferlength: UInt, returnlength: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExGetSystemFirmwareTable(firmwaretableprovidersignature.toInt(), firmwaretableid.toInt(), firmwaretablebuffer.rawAddress, bufferlength.toInt(), returnlength.rawAddress)

public actual fun exInitializePushLock(pushlock: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExInitializePushLock(pushlock.rawAddress)
}

public actual fun exInitializeResourceLite(resource: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExInitializeResourceLite(resource.rawAddress)

public actual fun exInitializeRundownProtection(runref: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExInitializeRundownProtection(runref.rawAddress)
}

public actual fun exInitializeRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware, runrefsize: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExInitializeRundownProtectionCacheAware(runrefcacheaware, runrefsize.toLong())
}

public actual fun exInitializeRundownProtectionCacheAwareEx(runrefcacheaware: PexRundownRefCacheAware, flags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExInitializeRundownProtectionCacheAwareEx(runrefcacheaware, flags.toInt())
}

public actual fun exInitializeZone(zone: MutPtr, blocksize: UInt, initialsegment: MutPtr, initialsegmentsize: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExInitializeZone(zone.rawAddress, blocksize.toInt(), initialsegment.rawAddress, initialsegmentsize.toInt())

public actual fun exInterlockedAddLargeInteger(addend: MutPtr, increment: Long, lock: MutPtr): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExInterlockedAddLargeInteger(addend.rawAddress, increment, lock.rawAddress)

public actual fun exInterlockedExtendZone(zone: MutPtr, segment: MutPtr, segmentsize: UInt, lock: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExInterlockedExtendZone(zone.rawAddress, segment.rawAddress, segmentsize.toInt(), lock.rawAddress)

public actual fun exIsManufacturingModeEnabled(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExIsManufacturingModeEnabled()

public actual fun exIsProcessorFeaturePresent(processorfeature: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExIsProcessorFeaturePresent(processorfeature.toInt())

public actual fun exIsResourceAcquiredExclusiveLite(resource: ConstPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExIsResourceAcquiredExclusiveLite(resource.rawAddress)

public actual fun exIsResourceAcquiredSharedLite(resource: ConstPtr): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExIsResourceAcquiredSharedLite(resource.rawAddress).toUInt()

public actual fun exIsSoftBoot(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExIsSoftBoot()

public actual fun exLocalTimeToSystemTime(localtime: ConstPtr, systemtime: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExLocalTimeToSystemTime(localtime.rawAddress, systemtime.rawAddress)
}

public actual fun exNotifyCallback(callbackobject: ConstPtr, argument1: ConstPtr, argument2: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExNotifyCallback(callbackobject.rawAddress, argument1.rawAddress, argument2.rawAddress)
}

public actual fun exQueryTimerResolution(maximumtime: MutPtr, minimumtime: MutPtr, currenttime: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExQueryTimerResolution(maximumtime.rawAddress, minimumtime.rawAddress, currenttime.rawAddress)
}

public actual fun exQueueWorkItem(workitem: MutPtr, queuetype: WorkQueueType) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExQueueWorkItem(workitem.rawAddress, queuetype)
}

public actual fun exRaiseAccessViolation() {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExRaiseAccessViolation()
}

public actual fun exRaiseDatatypeMisalignment() {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExRaiseDatatypeMisalignment()
}

public actual fun exRaiseStatus(status: Ntstatus) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExRaiseStatus(status)
}

public actual fun exReInitializeRundownProtection(runref: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExReInitializeRundownProtection(runref.rawAddress)
}

public actual fun exReInitializeRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExReInitializeRundownProtectionCacheAware(runrefcacheaware)
}

public actual fun exRegisterCallback(callbackobject: PcallbackObject, callbackfunction: PcallbackFunction, callbackcontext: ConstPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExRegisterCallback(callbackobject, 0L, callbackcontext.rawAddress))

public actual fun exReinitializeResourceLite(resource: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExReinitializeResourceLite(resource.rawAddress)

public actual fun exReleaseFastMutex(fastmutex: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExReleaseFastMutex(fastmutex.rawAddress)
}

public actual fun exReleaseFastMutexUnsafe(fastmutex: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExReleaseFastMutexUnsafe(fastmutex.rawAddress)
}

public actual fun exReleasePushLockExclusiveEx(pushlock: MutPtr, flags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExReleasePushLockExclusiveEx(pushlock.rawAddress, flags.toInt())
}

public actual fun exReleasePushLockSharedEx(pushlock: MutPtr, flags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExReleasePushLockSharedEx(pushlock.rawAddress, flags.toInt())
}

public actual fun exReleaseResourceAndLeaveCriticalRegion(resource: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExReleaseResourceAndLeaveCriticalRegion(resource.rawAddress)
}

public actual fun exReleaseResourceForThreadLite(resource: MutPtr, resourcethreadid: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExReleaseResourceForThreadLite(resource.rawAddress, resourcethreadid.toLong())
}

public actual fun exReleaseResourceLite(resource: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExReleaseResourceLite(resource.rawAddress)
}

public actual fun exReleaseRundownProtection(runref: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExReleaseRundownProtection(runref.rawAddress)
}

public actual fun exReleaseRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExReleaseRundownProtectionCacheAware(runrefcacheaware)
}

public actual fun exReleaseRundownProtectionCacheAwareEx(runref: PexRundownRefCacheAware, count: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExReleaseRundownProtectionCacheAwareEx(runref, count.toInt())
}

public actual fun exReleaseRundownProtectionEx(runref: MutPtr, count: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExReleaseRundownProtectionEx(runref.rawAddress, count.toInt())
}

public actual fun exReleaseSpinLockExclusive(spinlock: MutPtr, oldirql: UByte) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExReleaseSpinLockExclusive(spinlock.rawAddress, oldirql.toByte())
}

public actual fun exReleaseSpinLockExclusiveFromDpcLevel(spinlock: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExReleaseSpinLockExclusiveFromDpcLevel(spinlock.rawAddress)
}

public actual fun exReleaseSpinLockShared(spinlock: MutPtr, oldirql: UByte) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExReleaseSpinLockShared(spinlock.rawAddress, oldirql.toByte())
}

public actual fun exReleaseSpinLockSharedFromDpcLevel(spinlock: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExReleaseSpinLockSharedFromDpcLevel(spinlock.rawAddress)
}

public actual fun exRundownCompleted(runref: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExRundownCompleted(runref.rawAddress)
}

public actual fun exRundownCompletedCacheAware(runrefcacheaware: PexRundownRefCacheAware) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExRundownCompletedCacheAware(runrefcacheaware)
}

public actual fun exSecurePoolUpdate(securepoolhandle: Handle, tag: UInt, allocation: ConstPtr, cookie: ULong, offset: ULong, size: ULong, buffer: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExSecurePoolUpdate(securepoolhandle.rawAddress, tag.toInt(), allocation.rawAddress, cookie.toLong(), offset.toLong(), size.toLong(), buffer.rawAddress)

public actual fun exSecurePoolValidate(securepoolhandle: Handle, tag: UInt, allocation: ConstPtr, cookie: ULong): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExSecurePoolValidate(securepoolhandle.rawAddress, tag.toInt(), allocation.rawAddress, cookie.toLong()).toUInt()

public actual fun exSetFirmwareEnvironmentVariable(variablename: ConstPtr, vendorguid: ConstPtr, value: ConstPtr, valuelength: UInt, attributes: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExSetFirmwareEnvironmentVariable(variablename.rawAddress, vendorguid.rawAddress, value.rawAddress, valuelength.toInt(), attributes.toInt())

public actual fun exSetResourceOwnerPointer(resource: MutPtr, ownerpointer: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExSetResourceOwnerPointer(resource.rawAddress, ownerpointer.rawAddress)
}

public actual fun exSetResourceOwnerPointerEx(resource: MutPtr, ownerpointer: ConstPtr, flags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExSetResourceOwnerPointerEx(resource.rawAddress, ownerpointer.rawAddress, flags.toInt())
}

public actual fun exSetTimer(timer: PexTimer, duetime: Long, period: Long, parameters: ConstPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExSetTimer(timer, duetime, period, parameters.rawAddress)

public actual fun exSetTimerResolution(desiredtime: UInt, setresolution: Boolean): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExSetTimerResolution(desiredtime.toInt(), setresolution).toUInt()

public actual fun exSizeOfRundownProtectionCacheAware(): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExSizeOfRundownProtectionCacheAware().toULong()

public actual fun exSystemTimeToLocalTime(systemtime: ConstPtr, localtime: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExSystemTimeToLocalTime(systemtime.rawAddress, localtime.rawAddress)
}

public actual fun exTryAcquireSpinLockExclusiveAtDpcLevel(spinlock: MutPtr): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExTryAcquireSpinLockExclusiveAtDpcLevel(spinlock.rawAddress).toUInt()

public actual fun exTryAcquireSpinLockSharedAtDpcLevel(spinlock: MutPtr): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExTryAcquireSpinLockSharedAtDpcLevel(spinlock.rawAddress).toUInt()

public actual fun exTryConvertSharedSpinLockExclusive(spinlock: MutPtr): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExTryConvertSharedSpinLockExclusive(spinlock.rawAddress).toUInt()

public actual fun exTryToAcquireFastMutex(fastmutex: MutPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExTryToAcquireFastMutex(fastmutex.rawAddress)

public actual fun exUnregisterCallback(callbackregistration: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExUnregisterCallback(callbackregistration.rawAddress)
}

public actual fun exUuidCreate(uuid: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExUuidCreate(uuid.rawAddress)

public actual fun exVerifySuite(suitetype: SuiteType): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExVerifySuite(suitetype)

public actual fun exWaitForRundownProtectionRelease(runref: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExWaitForRundownProtectionRelease(runref.rawAddress)
}

public actual fun exWaitForRundownProtectionReleaseCacheAware(runref: PexRundownRefCacheAware) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExWaitForRundownProtectionReleaseCacheAware(runref)
}

public actual fun fsRtlIsTotalDeviceFailure(status: Ntstatus): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesFsRtlIsTotalDeviceFailure(status)

public actual fun halAcquireDisplayOwnership(resetdisplayparameters: PhalResetDisplayParameters) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesHalAcquireDisplayOwnership(0L)
}

public actual fun halAllocateAdapterChannel(adapterobject: ConstPtr, wcb: ConstPtr, numberofmapregisters: UInt, executionroutine: DriverControl): Ntstatus =
    0

public actual fun halAllocateCommonBuffer(adapterobject: ConstPtr, length: UInt, logicaladdress: MutPtr, cacheenabled: Boolean): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesHalAllocateCommonBuffer(adapterobject.rawAddress, length.toInt(), logicaladdress.rawAddress, cacheenabled))

public actual fun halAllocateCrashDumpRegisters(adapterobject: ConstPtr, numberofmapregisters: MutPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesHalAllocateCrashDumpRegisters(adapterobject.rawAddress, numberofmapregisters.rawAddress))

public actual fun halAllocateHardwareCounters(groupaffinty: ConstPtr, groupcount: UInt, resourcelist: ConstPtr, countersethandle: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesHalAllocateHardwareCounters(groupaffinty.rawAddress, groupcount.toInt(), resourcelist.rawAddress, countersethandle.rawAddress)

public actual fun halAssignSlotResources(registrypath: ConstPtr, driverclassname: ConstPtr, driverobject: ConstPtr, deviceobject: ConstPtr, bustype: InterfaceType, busnumber: UInt, slotnumber: UInt, allocatedresources: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesHalAssignSlotResources(registrypath.rawAddress, driverclassname.rawAddress, driverobject.rawAddress, deviceobject.rawAddress, bustype, busnumber.toInt(), slotnumber.toInt(), allocatedresources.rawAddress)

public actual fun halBugCheckSystem(errorsource: ConstPtr, errorrecord: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesHalBugCheckSystem(errorsource.rawAddress, errorrecord.rawAddress)
}

public actual fun halDmaAllocateCrashDumpRegistersEx(adapter: ConstPtr, numberofmapregisters: UInt, type: HalDmaCrashDumpRegisterType, mapregisterbase: MutPtr, mapregistersavailable: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesHalDmaAllocateCrashDumpRegistersEx(adapter.rawAddress, numberofmapregisters.toInt(), type, mapregisterbase.rawAddress, mapregistersavailable.rawAddress)

public actual fun halDmaFreeCrashDumpRegistersEx(adapter: ConstPtr, type: HalDmaCrashDumpRegisterType): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesHalDmaFreeCrashDumpRegistersEx(adapter.rawAddress, type)

public actual fun halExamineMBR(deviceobject: ConstPtr, sectorsize: UInt, mbrtypeidentifier: UInt, buffer: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesHalExamineMBR(deviceobject.rawAddress, sectorsize.toInt(), mbrtypeidentifier.toInt(), buffer.rawAddress)
}

public actual fun halFreeCommonBuffer(adapterobject: ConstPtr, length: UInt, logicaladdress: Long, virtualaddress: ConstPtr, cacheenabled: Boolean) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesHalFreeCommonBuffer(adapterobject.rawAddress, length.toInt(), logicaladdress, virtualaddress.rawAddress, cacheenabled)
}

public actual fun halFreeHardwareCounters(countersethandle: Handle): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesHalFreeHardwareCounters(countersethandle.rawAddress)

public actual fun halGetAdapter(devicedescription: ConstPtr, numberofmapregisters: MutPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesHalGetAdapter(devicedescription.rawAddress, numberofmapregisters.rawAddress))

public actual fun halGetBusData(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: MutPtr, length: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesHalGetBusData(busdatatype, busnumber.toInt(), slotnumber.toInt(), buffer.rawAddress, length.toInt()).toUInt()

public actual fun halGetBusDataByOffset(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: MutPtr, offset: UInt, length: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesHalGetBusDataByOffset(busdatatype, busnumber.toInt(), slotnumber.toInt(), buffer.rawAddress, offset.toInt(), length.toInt()).toUInt()

public actual fun halGetInterruptVector(interfacetype: InterfaceType, busnumber: UInt, businterruptlevel: UInt, businterruptvector: UInt, irql: MutPtr, affinity: MutPtr): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesHalGetInterruptVector(interfacetype, busnumber.toInt(), businterruptlevel.toInt(), businterruptvector.toInt(), irql.rawAddress, affinity.rawAddress).toUInt()

public actual fun halMakeBeep(frequency: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesHalMakeBeep(frequency.toInt())

public actual fun halReadDmaCounter(adapterobject: ConstPtr): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesHalReadDmaCounter(adapterobject.rawAddress).toUInt()

public actual fun halSetBusData(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: ConstPtr, length: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesHalSetBusData(busdatatype, busnumber.toInt(), slotnumber.toInt(), buffer.rawAddress, length.toInt()).toUInt()

public actual fun halSetBusDataByOffset(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: ConstPtr, offset: UInt, length: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesHalSetBusDataByOffset(busdatatype, busnumber.toInt(), slotnumber.toInt(), buffer.rawAddress, offset.toInt(), length.toInt()).toUInt()

public actual fun halTranslateBusAddress(interfacetype: InterfaceType, busnumber: UInt, busaddress: Long, addressspace: MutPtr, translatedaddress: MutPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesHalTranslateBusAddress(interfacetype, busnumber.toInt(), busaddress, addressspace.rawAddress, translatedaddress.rawAddress)

public actual fun hvlRegisterWheaErrorNotification(callback: PhvlWheaErrorNotification): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesHvlRegisterWheaErrorNotification(0L)

public actual fun hvlUnregisterWheaErrorNotification(callback: PhvlWheaErrorNotification): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesHvlUnregisterWheaErrorNotification(0L)

public actual fun ioAcquireCancelSpinLock(irql: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoAcquireCancelSpinLock(irql.rawAddress)
}

public actual fun ioAcquireKsrPersistentMemory(driverobject: ConstPtr, physicaldeviceobject: ConstPtr, buffer: MutPtr, size: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoAcquireKsrPersistentMemory(driverobject.rawAddress, physicaldeviceobject.rawAddress, buffer.rawAddress, size.rawAddress)

public actual fun ioAcquireKsrPersistentMemoryEx(driverobject: ConstPtr, physicaldeviceobject: ConstPtr, physicaldeviceid: ConstPtr, datatag: ConstPtr, dataversion: MutPtr, buffer: MutPtr, size: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoAcquireKsrPersistentMemoryEx(driverobject.rawAddress, physicaldeviceobject.rawAddress, physicaldeviceid.rawAddress, datatag.rawAddress, dataversion.rawAddress, buffer.rawAddress, size.rawAddress)

public actual fun ioAcquireRemoveLockEx(removelock: MutPtr, tag: ConstPtr, file: Pcstr, line: UInt, remlocksize: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoAcquireRemoveLockEx(removelock.rawAddress, tag.rawAddress, file.rawAddress, line.toInt(), remlocksize.toInt())

public actual fun ioAllocateAdapterChannel(adapterobject: ConstPtr, deviceobject: ConstPtr, numberofmapregisters: UInt, executionroutine: DriverControl, context: ConstPtr): Ntstatus =
    0

public actual fun ioAllocateController(controllerobject: ConstPtr, deviceobject: ConstPtr, executionroutine: DriverControl, context: ConstPtr) {
}

public actual fun ioAllocateDriverObjectExtension(driverobject: ConstPtr, clientidentificationaddress: ConstPtr, driverobjectextensionsize: UInt, driverobjectextension: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoAllocateDriverObjectExtension(driverobject.rawAddress, clientidentificationaddress.rawAddress, driverobjectextensionsize.toInt(), driverobjectextension.rawAddress)

public actual fun ioAllocateErrorLogEntry(ioobject: ConstPtr, entrysize: UByte): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoAllocateErrorLogEntry(ioobject.rawAddress, entrysize.toByte()))

public actual fun ioAllocateIrp(stacksize: Byte, chargequota: Boolean): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoAllocateIrp(stacksize, chargequota))

public actual fun ioAllocateIrpEx(deviceobject: ConstPtr, stacksize: Byte, chargequota: Boolean): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoAllocateIrpEx(deviceobject.rawAddress, stacksize, chargequota))

public actual fun ioAllocateMdl(virtualaddress: ConstPtr, length: UInt, secondarybuffer: Boolean, chargequota: Boolean, irp: MutPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoAllocateMdl(virtualaddress.rawAddress, length.toInt(), secondarybuffer, chargequota, irp.rawAddress))

public actual fun ioAllocateSfioStreamIdentifier(fileobject: ConstPtr, length: UInt, signature: ConstPtr, streamidentifier: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoAllocateSfioStreamIdentifier(fileobject.rawAddress, length.toInt(), signature.rawAddress, streamidentifier.rawAddress)

public actual fun ioAllocateWorkItem(deviceobject: ConstPtr): PioWorkitem =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoAllocateWorkItem(deviceobject.rawAddress)

public actual fun ioAssignResources(registrypath: ConstPtr, driverclassname: ConstPtr, driverobject: ConstPtr, deviceobject: ConstPtr, requestedresources: ConstPtr, allocatedresources: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoAssignResources(registrypath.rawAddress, driverclassname.rawAddress, driverobject.rawAddress, deviceobject.rawAddress, requestedresources.rawAddress, allocatedresources.rawAddress)

public actual fun ioAttachDevice(sourcedevice: ConstPtr, targetdevice: ConstPtr, attacheddevice: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoAttachDevice(sourcedevice.rawAddress, targetdevice.rawAddress, attacheddevice.rawAddress)

public actual fun ioAttachDeviceByPointer(sourcedevice: ConstPtr, targetdevice: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoAttachDeviceByPointer(sourcedevice.rawAddress, targetdevice.rawAddress)

public actual fun ioAttachDeviceToDeviceStack(sourcedevice: ConstPtr, targetdevice: ConstPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoAttachDeviceToDeviceStack(sourcedevice.rawAddress, targetdevice.rawAddress))

public actual fun ioAttachDeviceToDeviceStackSafe(sourcedevice: ConstPtr, targetdevice: ConstPtr, attachedtodeviceobject: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoAttachDeviceToDeviceStackSafe(sourcedevice.rawAddress, targetdevice.rawAddress, attachedtodeviceobject.rawAddress)

public actual fun ioBuildAsynchronousFsdRequest(majorfunction: UInt, deviceobject: ConstPtr, buffer: MutPtr, length: UInt, startingoffset: ConstPtr, iostatusblock: ConstPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoBuildAsynchronousFsdRequest(majorfunction.toInt(), deviceobject.rawAddress, buffer.rawAddress, length.toInt(), startingoffset.rawAddress, iostatusblock.rawAddress))

public actual fun ioBuildDeviceIoControlRequest(iocontrolcode: UInt, deviceobject: ConstPtr, inputbuffer: ConstPtr, inputbufferlength: UInt, outputbuffer: MutPtr, outputbufferlength: UInt, internaldeviceiocontrol: Boolean, event: ConstPtr, iostatusblock: MutPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoBuildDeviceIoControlRequest(iocontrolcode.toInt(), deviceobject.rawAddress, inputbuffer.rawAddress, inputbufferlength.toInt(), outputbuffer.rawAddress, outputbufferlength.toInt(), internaldeviceiocontrol, event.rawAddress, iostatusblock.rawAddress))

public actual fun ioBuildPartialMdl(sourcemdl: ConstPtr, targetmdl: MutPtr, virtualaddress: MutPtr, length: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoBuildPartialMdl(sourcemdl.rawAddress, targetmdl.rawAddress, virtualaddress.rawAddress, length.toInt())
}

public actual fun ioBuildSynchronousFsdRequest(majorfunction: UInt, deviceobject: ConstPtr, buffer: MutPtr, length: UInt, startingoffset: ConstPtr, event: ConstPtr, iostatusblock: MutPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoBuildSynchronousFsdRequest(majorfunction.toInt(), deviceobject.rawAddress, buffer.rawAddress, length.toInt(), startingoffset.rawAddress, event.rawAddress, iostatusblock.rawAddress))

public actual fun ioCancelFileOpen(deviceobject: ConstPtr, fileobject: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCancelFileOpen(deviceobject.rawAddress, fileobject.rawAddress)
}

public actual fun ioCancelIrp(irp: ConstPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCancelIrp(irp.rawAddress)

public actual fun ioCheckLinkShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: MutPtr, shareaccess: MutPtr, linkshareaccess: MutPtr, ioshareaccessflags: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCheckLinkShareAccess(desiredaccess.toInt(), desiredshareaccess.toInt(), fileobject.rawAddress, shareaccess.rawAddress, linkshareaccess.rawAddress, ioshareaccessflags.toInt())

public actual fun ioCheckShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: MutPtr, shareaccess: MutPtr, update: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCheckShareAccess(desiredaccess.toInt(), desiredshareaccess.toInt(), fileobject.rawAddress, shareaccess.rawAddress, update)

public actual fun ioCheckShareAccessEx(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: MutPtr, shareaccess: MutPtr, update: Boolean, writepermission: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCheckShareAccessEx(desiredaccess.toInt(), desiredshareaccess.toInt(), fileobject.rawAddress, shareaccess.rawAddress, update, writepermission.rawAddress)

public actual fun ioCleanupIrp(irp: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCleanupIrp(irp.rawAddress)
}

public actual fun ioClearActivityIdThread(originalid: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoClearActivityIdThread(originalid.rawAddress)
}

public actual fun ioClearIrpExtraCreateParameter(irp: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoClearIrpExtraCreateParameter(irp.rawAddress)
}

public actual fun ioConnectInterrupt(interruptobject: MutPtr, serviceroutine: PkserviceRoutine, servicecontext: ConstPtr, spinlock: ConstPtr, vector: UInt, irql: UByte, synchronizeirql: UByte, interruptmode: KinterruptMode, sharevector: Boolean, processorenablemask: ULong, floatingsave: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoConnectInterrupt(interruptobject.rawAddress, 0L, servicecontext.rawAddress, spinlock.rawAddress, vector.toInt(), irql.toByte(), synchronizeirql.toByte(), interruptmode, sharevector, processorenablemask.toLong(), floatingsave)

public actual fun ioConnectInterruptEx(parameters: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoConnectInterruptEx(parameters.rawAddress)

public actual fun ioCreateController(size: UInt): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCreateController(size.toInt()))

public actual fun ioCreateDevice(driverobject: ConstPtr, deviceextensionsize: UInt, devicename: ConstPtr, devicetype: UInt, devicecharacteristics: UInt, exclusive: Boolean, deviceobject: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCreateDevice(driverobject.rawAddress, deviceextensionsize.toInt(), devicename.rawAddress, devicetype.toInt(), devicecharacteristics.toInt(), exclusive, deviceobject.rawAddress)

public actual fun ioCreateDisk(deviceobject: ConstPtr, disk: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCreateDisk(deviceobject.rawAddress, disk.rawAddress)

public actual fun ioCreateFile(filehandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, iostatusblock: MutPtr, allocationsize: ConstPtr, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: ConstPtr, ealength: UInt, createfiletype: CreateFileType, internalparameters: ConstPtr, options: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCreateFile(filehandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, iostatusblock.rawAddress, allocationsize.rawAddress, fileattributes.toInt(), shareaccess.toInt(), disposition.toInt(), createoptions.toInt(), eabuffer.rawAddress, ealength.toInt(), createfiletype, internalparameters.rawAddress, options.toInt())

public actual fun ioCreateFileEx(filehandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, iostatusblock: MutPtr, allocationsize: ConstPtr, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: ConstPtr, ealength: UInt, createfiletype: CreateFileType, internalparameters: ConstPtr, options: UInt, drivercontext: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCreateFileEx(filehandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, iostatusblock.rawAddress, allocationsize.rawAddress, fileattributes.toInt(), shareaccess.toInt(), disposition.toInt(), createoptions.toInt(), eabuffer.rawAddress, ealength.toInt(), createfiletype, internalparameters.rawAddress, options.toInt(), drivercontext.rawAddress)

public actual fun ioCreateFileSpecifyDeviceObjectHint(filehandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, iostatusblock: MutPtr, allocationsize: ConstPtr, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: ConstPtr, ealength: UInt, createfiletype: CreateFileType, internalparameters: ConstPtr, options: UInt, deviceobject: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCreateFileSpecifyDeviceObjectHint(filehandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, iostatusblock.rawAddress, allocationsize.rawAddress, fileattributes.toInt(), shareaccess.toInt(), disposition.toInt(), createoptions.toInt(), eabuffer.rawAddress, ealength.toInt(), createfiletype, internalparameters.rawAddress, options.toInt(), deviceobject.rawAddress)

public actual fun ioCreateNotificationEvent(eventname: ConstPtr, eventhandle: MutPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCreateNotificationEvent(eventname.rawAddress, eventhandle.rawAddress))

public actual fun ioCreateSymbolicLink(symboliclinkname: ConstPtr, devicename: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCreateSymbolicLink(symboliclinkname.rawAddress, devicename.rawAddress)

public actual fun ioCreateSynchronizationEvent(eventname: ConstPtr, eventhandle: MutPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCreateSynchronizationEvent(eventname.rawAddress, eventhandle.rawAddress))

public actual fun ioCreateSystemThread(ioobject: MutPtr, threadhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, processhandle: Handle, clientid: MutPtr, startroutine: PkstartRoutine, startcontext: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCreateSystemThread(ioobject.rawAddress, threadhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, processhandle.rawAddress, clientid.rawAddress, 0L, startcontext.rawAddress)

public actual fun ioCreateUnprotectedSymbolicLink(symboliclinkname: ConstPtr, devicename: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCreateUnprotectedSymbolicLink(symboliclinkname.rawAddress, devicename.rawAddress)

public actual fun ioCsqInitialize(csq: MutPtr, csqinsertirp: PioCsqInsertIrp, csqremoveirp: PioCsqRemoveIrp, csqpeeknextirp: PioCsqPeekNextIrp, csqacquirelock: PioCsqAcquireLock, csqreleaselock: PioCsqReleaseLock, csqcompletecanceledirp: PioCsqCompleteCanceledIrp): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCsqInitialize(csq.rawAddress, 0L, 0L, 0L, 0L, 0L, 0L)

public actual fun ioCsqInitializeEx(csq: MutPtr, csqinsertirp: PioCsqInsertIrpEx, csqremoveirp: PioCsqRemoveIrp, csqpeeknextirp: PioCsqPeekNextIrp, csqacquirelock: PioCsqAcquireLock, csqreleaselock: PioCsqReleaseLock, csqcompletecanceledirp: PioCsqCompleteCanceledIrp): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCsqInitializeEx(csq.rawAddress, 0L, 0L, 0L, 0L, 0L, 0L)

public actual fun ioCsqInsertIrp(csq: MutPtr, irp: MutPtr, context: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCsqInsertIrp(csq.rawAddress, irp.rawAddress, context.rawAddress)
}

public actual fun ioCsqInsertIrpEx(csq: MutPtr, irp: MutPtr, context: MutPtr, insertcontext: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCsqInsertIrpEx(csq.rawAddress, irp.rawAddress, context.rawAddress, insertcontext.rawAddress)

public actual fun ioCsqRemoveIrp(csq: MutPtr, context: MutPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCsqRemoveIrp(csq.rawAddress, context.rawAddress))

public actual fun ioCsqRemoveNextIrp(csq: MutPtr, peekcontext: ConstPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCsqRemoveNextIrp(csq.rawAddress, peekcontext.rawAddress))

public actual fun ioDecrementKeepAliveCount(fileobject: MutPtr, process: Peprocess): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoDecrementKeepAliveCount(fileobject.rawAddress, process)

public actual fun ioDeleteController(controllerobject: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoDeleteController(controllerobject.rawAddress)
}

public actual fun ioDeleteDevice(deviceobject: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoDeleteDevice(deviceobject.rawAddress)
}

public actual fun ioDeleteSymbolicLink(symboliclinkname: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoDeleteSymbolicLink(symboliclinkname.rawAddress)

public actual fun ioDetachDevice(targetdevice: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoDetachDevice(targetdevice.rawAddress)
}

public actual fun ioDisconnectInterrupt(interruptobject: Pkinterrupt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoDisconnectInterrupt(interruptobject)
}

public actual fun ioDisconnectInterruptEx(parameters: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoDisconnectInterruptEx(parameters.rawAddress)
}

public actual fun ioEnumerateKsrPersistentMemoryEx(driverobject: ConstPtr, physicaldeviceobject: ConstPtr, physicaldeviceid: ConstPtr, callback: PioPersistedMemoryEnumerationCallback, callbackcontext: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoEnumerateKsrPersistentMemoryEx(driverobject.rawAddress, physicaldeviceobject.rawAddress, physicaldeviceid.rawAddress, 0L, callbackcontext.rawAddress)

public actual fun ioFlushAdapterBuffers(adapterobject: ConstPtr, mdl: ConstPtr, mapregisterbase: ConstPtr, currentva: ConstPtr, length: UInt, writetodevice: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoFlushAdapterBuffers(adapterobject.rawAddress, mdl.rawAddress, mapregisterbase.rawAddress, currentva.rawAddress, length.toInt(), writetodevice)

public actual fun ioForwardIrpSynchronously(deviceobject: ConstPtr, irp: ConstPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoForwardIrpSynchronously(deviceobject.rawAddress, irp.rawAddress)

public actual fun ioFreeAdapterChannel(adapterobject: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoFreeAdapterChannel(adapterobject.rawAddress)
}

public actual fun ioFreeController(controllerobject: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoFreeController(controllerobject.rawAddress)
}

public actual fun ioFreeErrorLogEntry(elentry: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoFreeErrorLogEntry(elentry.rawAddress)
}

public actual fun ioFreeIrp(irp: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoFreeIrp(irp.rawAddress)
}

public actual fun ioFreeKsrPersistentMemory(datahandle: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoFreeKsrPersistentMemory(datahandle.rawAddress)

public actual fun ioFreeMapRegisters(adapterobject: ConstPtr, mapregisterbase: ConstPtr, numberofmapregisters: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoFreeMapRegisters(adapterobject.rawAddress, mapregisterbase.rawAddress, numberofmapregisters.toInt())
}

public actual fun ioFreeMdl(mdl: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoFreeMdl(mdl.rawAddress)
}

public actual fun ioFreeSfioStreamIdentifier(fileobject: ConstPtr, signature: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoFreeSfioStreamIdentifier(fileobject.rawAddress, signature.rawAddress)

public actual fun ioFreeWorkItem(ioworkitem: PioWorkitem) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoFreeWorkItem(ioworkitem)
}

public actual fun ioGetActivityIdIrp(irp: ConstPtr, guid: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetActivityIdIrp(irp.rawAddress, guid.rawAddress)

public actual fun ioGetActivityIdThread(): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetActivityIdThread())

public actual fun ioGetAffinityInterrupt(interruptobject: Pkinterrupt, groupaffinity: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetAffinityInterrupt(interruptobject, groupaffinity.rawAddress)

public actual fun ioGetAttachedDeviceReference(deviceobject: ConstPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetAttachedDeviceReference(deviceobject.rawAddress))

public actual fun ioGetBootDiskInformation(bootdiskinformation: MutPtr, size: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetBootDiskInformation(bootdiskinformation.rawAddress, size.toInt())

public actual fun ioGetBootDiskInformationLite(bootdiskinformation: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetBootDiskInformationLite(bootdiskinformation.rawAddress)

public actual fun ioGetConfigurationInformation(): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetConfigurationInformation())

public actual fun ioGetContainerInformation(informationclass: IoContainerInformationClass, containerobject: ConstPtr, buffer: MutPtr, bufferlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetContainerInformation(informationclass, containerobject.rawAddress, buffer.rawAddress, bufferlength.toInt())

public actual fun ioGetCurrentProcess(): Peprocess =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetCurrentProcess()

public actual fun ioGetDeviceDirectory(physicaldeviceobject: ConstPtr, directorytype: DeviceDirectoryType, flags: UInt, reserved: ConstPtr, devicedirectoryhandle: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetDeviceDirectory(physicaldeviceobject.rawAddress, directorytype, flags.toInt(), reserved.rawAddress, devicedirectoryhandle.rawAddress)

public actual fun ioGetDeviceInterfaceAlias(symboliclinkname: ConstPtr, aliasinterfaceclassguid: ConstPtr, aliassymboliclinkname: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetDeviceInterfaceAlias(symboliclinkname.rawAddress, aliasinterfaceclassguid.rawAddress, aliassymboliclinkname.rawAddress)

public actual fun ioGetDeviceInterfacePropertyData(symboliclinkname: ConstPtr, propertykey: ConstPtr, lcid: UInt, flags: UInt, size: UInt, data: MutPtr, requiredsize: MutPtr, type: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetDeviceInterfacePropertyData(symboliclinkname.rawAddress, propertykey.rawAddress, lcid.toInt(), flags.toInt(), size.toInt(), data.rawAddress, requiredsize.rawAddress, type.rawAddress)

public actual fun ioGetDeviceInterfaces(interfaceclassguid: ConstPtr, physicaldeviceobject: ConstPtr, flags: UInt, symboliclinklist: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetDeviceInterfaces(interfaceclassguid.rawAddress, physicaldeviceobject.rawAddress, flags.toInt(), symboliclinklist.rawAddress)

public actual fun ioGetDeviceNumaNode(pdo: ConstPtr, nodenumber: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetDeviceNumaNode(pdo.rawAddress, nodenumber.rawAddress)

public actual fun ioGetDeviceObjectPointer(objectname: ConstPtr, desiredaccess: UInt, fileobject: MutPtr, deviceobject: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetDeviceObjectPointer(objectname.rawAddress, desiredaccess.toInt(), fileobject.rawAddress, deviceobject.rawAddress)

public actual fun ioGetDeviceProperty(deviceobject: ConstPtr, deviceproperty: DeviceRegistryProperty, bufferlength: UInt, propertybuffer: MutPtr, resultlength: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetDeviceProperty(deviceobject.rawAddress, deviceproperty, bufferlength.toInt(), propertybuffer.rawAddress, resultlength.rawAddress)

public actual fun ioGetDevicePropertyData(pdo: ConstPtr, propertykey: ConstPtr, lcid: UInt, flags: UInt, size: UInt, data: MutPtr, requiredsize: MutPtr, type: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetDevicePropertyData(pdo.rawAddress, propertykey.rawAddress, lcid.toInt(), flags.toInt(), size.toInt(), data.rawAddress, requiredsize.rawAddress, type.rawAddress)

public actual fun ioGetDmaAdapter(physicaldeviceobject: ConstPtr, devicedescription: ConstPtr, numberofmapregisters: MutPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetDmaAdapter(physicaldeviceobject.rawAddress, devicedescription.rawAddress, numberofmapregisters.rawAddress))

public actual fun ioGetDriverDirectory(driverobject: ConstPtr, directorytype: DriverDirectoryType, flags: UInt, driverdirectoryhandle: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetDriverDirectory(driverobject.rawAddress, directorytype, flags.toInt(), driverdirectoryhandle.rawAddress)

public actual fun ioGetDriverObjectExtension(driverobject: ConstPtr, clientidentificationaddress: ConstPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetDriverObjectExtension(driverobject.rawAddress, clientidentificationaddress.rawAddress))

public actual fun ioGetFileObjectGenericMapping(): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetFileObjectGenericMapping())

public actual fun ioGetFsZeroingOffset(irp: ConstPtr, zeroingoffset: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetFsZeroingOffset(irp.rawAddress, zeroingoffset.rawAddress)

public actual fun ioGetInitialStack(): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetInitialStack())

public actual fun ioGetInitiatorProcess(fileobject: ConstPtr): Peprocess =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetInitiatorProcess(fileobject.rawAddress)

public actual fun ioGetIoAttributionHandle(irp: ConstPtr, ioattributionhandle: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetIoAttributionHandle(irp.rawAddress, ioattributionhandle.rawAddress)

public actual fun ioGetIoPriorityHint(irp: ConstPtr): IoPriorityHint =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetIoPriorityHint(irp.rawAddress)

public actual fun ioGetIommuInterface(version: UInt, interfaceout: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetIommuInterface(version.toInt(), interfaceout.rawAddress)

public actual fun ioGetIommuInterfaceEx(version: UInt, flags: ULong, interfaceout: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetIommuInterfaceEx(version.toInt(), flags.toLong(), interfaceout.rawAddress)

public actual fun ioGetIrpExtraCreateParameter(irp: ConstPtr, extracreateparameter: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetIrpExtraCreateParameter(irp.rawAddress, extracreateparameter.rawAddress)

public actual fun ioGetPagingIoPriority(irp: ConstPtr): IoPagingPriority =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetPagingIoPriority(irp.rawAddress)

public actual fun ioGetRelatedDeviceObject(fileobject: ConstPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetRelatedDeviceObject(fileobject.rawAddress))

public actual fun ioGetSfioStreamIdentifier(fileobject: ConstPtr, signature: ConstPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetSfioStreamIdentifier(fileobject.rawAddress, signature.rawAddress))

public actual fun ioGetSilo(fileobject: ConstPtr): Pesilo =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetSilo(fileobject.rawAddress)

public actual fun ioGetSiloParameters(fileobject: ConstPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetSiloParameters(fileobject.rawAddress))

public actual fun ioGetStackLimits(lowlimit: MutPtr, highlimit: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetStackLimits(lowlimit.rawAddress, highlimit.rawAddress)
}

public actual fun ioGetTopLevelIrp(): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetTopLevelIrp())

public actual fun ioGetTransactionParameterBlock(fileobject: ConstPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetTransactionParameterBlock(fileobject.rawAddress))

public actual fun ioIncrementKeepAliveCount(fileobject: MutPtr, process: Peprocess): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoIncrementKeepAliveCount(fileobject.rawAddress, process)

public actual fun ioInitializeIrp(irp: MutPtr, packetsize: UShort, stacksize: Byte) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoInitializeIrp(irp.rawAddress, packetsize.toShort(), stacksize)
}

public actual fun ioInitializeIrpEx(irp: MutPtr, deviceobject: ConstPtr, packetsize: UShort, stacksize: Byte) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoInitializeIrpEx(irp.rawAddress, deviceobject.rawAddress, packetsize.toShort(), stacksize)
}

public actual fun ioInitializeRemoveLockEx(lock: MutPtr, allocatetag: UInt, maxlockedminutes: UInt, highwatermark: UInt, remlocksize: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoInitializeRemoveLockEx(lock.rawAddress, allocatetag.toInt(), maxlockedminutes.toInt(), highwatermark.toInt(), remlocksize.toInt())
}

public actual fun ioInitializeTimer(deviceobject: ConstPtr, timerroutine: PioTimerRoutine, context: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoInitializeTimer(deviceobject.rawAddress, 0L, context.rawAddress)

public actual fun ioInitializeWorkItem(ioobject: ConstPtr, ioworkitem: PioWorkitem) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoInitializeWorkItem(ioobject.rawAddress, ioworkitem)
}

public actual fun ioInvalidateDeviceRelations(deviceobject: ConstPtr, type: DeviceRelationType) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoInvalidateDeviceRelations(deviceobject.rawAddress, type)
}

public actual fun ioInvalidateDeviceState(physicaldeviceobject: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoInvalidateDeviceState(physicaldeviceobject.rawAddress)
}

public actual fun ioIs32bitProcess(irp: ConstPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoIs32bitProcess(irp.rawAddress)

public actual fun ioIsFileObjectIgnoringSharing(fileobject: ConstPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoIsFileObjectIgnoringSharing(fileobject.rawAddress)

public actual fun ioIsFileOriginRemote(fileobject: ConstPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoIsFileOriginRemote(fileobject.rawAddress)

public actual fun ioIsInitiator32bitProcess(irp: ConstPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoIsInitiator32bitProcess(irp.rawAddress)

public actual fun ioIsValidIrpStatus(status: Ntstatus): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoIsValidIrpStatus(status).toUInt()

public actual fun ioIsWdmVersionAvailable(majorversion: UByte, minorversion: UByte): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoIsWdmVersionAvailable(majorversion.toByte(), minorversion.toByte())

public actual fun ioMakeAssociatedIrp(irp: ConstPtr, stacksize: Byte): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoMakeAssociatedIrp(irp.rawAddress, stacksize))

public actual fun ioMakeAssociatedIrpEx(irp: ConstPtr, deviceobject: ConstPtr, stacksize: Byte): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoMakeAssociatedIrpEx(irp.rawAddress, deviceobject.rawAddress, stacksize))

public actual fun ioMapTransfer(adapterobject: ConstPtr, mdl: ConstPtr, mapregisterbase: ConstPtr, currentva: ConstPtr, length: MutPtr, writetodevice: Boolean): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoMapTransfer(adapterobject.rawAddress, mdl.rawAddress, mapregisterbase.rawAddress, currentva.rawAddress, length.rawAddress, writetodevice)

public actual fun ioOpenDeviceInterfaceRegistryKey(symboliclinkname: ConstPtr, desiredaccess: UInt, deviceinterfaceregkey: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoOpenDeviceInterfaceRegistryKey(symboliclinkname.rawAddress, desiredaccess.toInt(), deviceinterfaceregkey.rawAddress)

public actual fun ioOpenDeviceRegistryKey(deviceobject: ConstPtr, devinstkeytype: UInt, desiredaccess: UInt, deviceregkey: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoOpenDeviceRegistryKey(deviceobject.rawAddress, devinstkeytype.toInt(), desiredaccess.toInt(), deviceregkey.rawAddress)

public actual fun ioOpenDriverRegistryKey(driverobject: ConstPtr, regkeytype: DriverRegkeyType, desiredaccess: UInt, flags: UInt, driverregkey: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoOpenDriverRegistryKey(driverobject.rawAddress, regkeytype, desiredaccess.toInt(), flags.toInt(), driverregkey.rawAddress)

public actual fun ioPropagateActivityIdToThread(irp: ConstPtr, propagatedid: MutPtr, originalid: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoPropagateActivityIdToThread(irp.rawAddress, propagatedid.rawAddress, originalid.rawAddress)

public actual fun ioQueryDeviceDescription(bustype: ConstPtr, busnumber: ConstPtr, controllertype: ConstPtr, controllernumber: ConstPtr, peripheraltype: ConstPtr, peripheralnumber: ConstPtr, calloutroutine: PioQueryDeviceRoutine, context: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoQueryDeviceDescription(bustype.rawAddress, busnumber.rawAddress, controllertype.rawAddress, controllernumber.rawAddress, peripheraltype.rawAddress, peripheralnumber.rawAddress, 0L, context.rawAddress)

public actual fun ioQueryFullDriverPath(driverobject: ConstPtr, fullpath: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoQueryFullDriverPath(driverobject.rawAddress, fullpath.rawAddress)

public actual fun ioQueryInformationByName(objectattributes: ConstPtr, iostatusblock: MutPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass, options: UInt, drivercontext: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoQueryInformationByName(objectattributes.rawAddress, iostatusblock.rawAddress, fileinformation.rawAddress, length.toInt(), fileinformationclass, options.toInt(), drivercontext.rawAddress)

public actual fun ioQueryKsrPersistentMemorySize(driverobject: ConstPtr, physicaldeviceobject: ConstPtr, buffersize: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoQueryKsrPersistentMemorySize(driverobject.rawAddress, physicaldeviceobject.rawAddress, buffersize.rawAddress)

public actual fun ioQueryKsrPersistentMemorySizeEx(driverobject: ConstPtr, physicaldeviceobject: ConstPtr, physicaldeviceid: ConstPtr, datatag: ConstPtr, dataversion: MutPtr, buffersize: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoQueryKsrPersistentMemorySizeEx(driverobject.rawAddress, physicaldeviceobject.rawAddress, physicaldeviceid.rawAddress, datatag.rawAddress, dataversion.rawAddress, buffersize.rawAddress)

public actual fun ioQueueWorkItem(ioworkitem: PioWorkitem, workerroutine: PioWorkitemRoutine, queuetype: WorkQueueType, context: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoQueueWorkItem(ioworkitem, 0L, queuetype, context.rawAddress)
}

public actual fun ioQueueWorkItemEx(ioworkitem: PioWorkitem, workerroutine: PioWorkitemRoutineEx, queuetype: WorkQueueType, context: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoQueueWorkItemEx(ioworkitem, 0L, queuetype, context.rawAddress)
}

public actual fun ioRaiseHardError(irp: ConstPtr, vpb: ConstPtr, realdeviceobject: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoRaiseHardError(irp.rawAddress, vpb.rawAddress, realdeviceobject.rawAddress)
}

public actual fun ioRaiseInformationalHardError(errorstatus: Ntstatus, string: ConstPtr, thread: Pkthread): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoRaiseInformationalHardError(errorstatus, string.rawAddress, thread)

public actual fun ioReadDiskSignature(deviceobject: ConstPtr, bytespersector: UInt, signature: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoReadDiskSignature(deviceobject.rawAddress, bytespersector.toInt(), signature.rawAddress)

public actual fun ioReadPartitionTable(deviceobject: ConstPtr, sectorsize: UInt, returnrecognizedpartitions: Boolean, partitionbuffer: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoReadPartitionTable(deviceobject.rawAddress, sectorsize.toInt(), returnrecognizedpartitions, partitionbuffer.rawAddress)

public actual fun ioReadPartitionTableEx(deviceobject: ConstPtr, drivelayout: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoReadPartitionTableEx(deviceobject.rawAddress, drivelayout.rawAddress)

public actual fun ioRecordIoAttribution(opaquehandle: MutPtr, attributioninformation: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoRecordIoAttribution(opaquehandle.rawAddress, attributioninformation.rawAddress)

public actual fun ioRegisterBootDriverCallback(callbackfunction: PbootDriverCallbackFunction, callbackcontext: ConstPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoRegisterBootDriverCallback(0L, callbackcontext.rawAddress))

public actual fun ioRegisterBootDriverReinitialization(driverobject: ConstPtr, driverreinitializationroutine: DriverReinitialize, context: ConstPtr) {
}

public actual fun ioRegisterContainerNotification(notificationclass: IoContainerNotificationClass, callbackfunction: PioContainerNotificationFunction, notificationinformation: ConstPtr, notificationinformationlength: UInt, callbackregistration: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoRegisterContainerNotification(notificationclass, 0L, notificationinformation.rawAddress, notificationinformationlength.toInt(), callbackregistration.rawAddress)

public actual fun ioRegisterDeviceInterface(physicaldeviceobject: ConstPtr, interfaceclassguid: ConstPtr, referencestring: ConstPtr, symboliclinkname: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoRegisterDeviceInterface(physicaldeviceobject.rawAddress, interfaceclassguid.rawAddress, referencestring.rawAddress, symboliclinkname.rawAddress)

public actual fun ioRegisterDriverReinitialization(driverobject: ConstPtr, driverreinitializationroutine: DriverReinitialize, context: ConstPtr) {
}

public actual fun ioRegisterLastChanceShutdownNotification(deviceobject: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoRegisterLastChanceShutdownNotification(deviceobject.rawAddress)

public actual fun ioRegisterPlugPlayNotification(eventcategory: IoNotificationEventCategory, eventcategoryflags: UInt, eventcategorydata: ConstPtr, driverobject: ConstPtr, callbackroutine: DriverNotificationCallbackRoutine, context: MutPtr, notificationentry: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoRegisterPlugPlayNotification(eventcategory, eventcategoryflags.toInt(), eventcategorydata.rawAddress, driverobject.rawAddress, 0L, context.rawAddress, notificationentry.rawAddress)

public actual fun ioRegisterShutdownNotification(deviceobject: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoRegisterShutdownNotification(deviceobject.rawAddress)

public actual fun ioReleaseCancelSpinLock(irql: UByte) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoReleaseCancelSpinLock(irql.toByte())
}

public actual fun ioReleaseRemoveLockAndWaitEx(removelock: MutPtr, tag: ConstPtr, remlocksize: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoReleaseRemoveLockAndWaitEx(removelock.rawAddress, tag.rawAddress, remlocksize.toInt())
}

public actual fun ioReleaseRemoveLockEx(removelock: MutPtr, tag: ConstPtr, remlocksize: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoReleaseRemoveLockEx(removelock.rawAddress, tag.rawAddress, remlocksize.toInt())
}

public actual fun ioRemoveLinkShareAccess(fileobject: ConstPtr, shareaccess: MutPtr, linkshareaccess: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoRemoveLinkShareAccess(fileobject.rawAddress, shareaccess.rawAddress, linkshareaccess.rawAddress)
}

public actual fun ioRemoveLinkShareAccessEx(fileobject: ConstPtr, shareaccess: MutPtr, linkshareaccess: MutPtr, ioshareaccessflags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoRemoveLinkShareAccessEx(fileobject.rawAddress, shareaccess.rawAddress, linkshareaccess.rawAddress, ioshareaccessflags.toInt())
}

public actual fun ioRemoveShareAccess(fileobject: ConstPtr, shareaccess: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoRemoveShareAccess(fileobject.rawAddress, shareaccess.rawAddress)
}

public actual fun ioReplacePartitionUnit(targetpdo: ConstPtr, sparepdo: ConstPtr, flags: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoReplacePartitionUnit(targetpdo.rawAddress, sparepdo.rawAddress, flags.toInt())

public actual fun ioReportDetectedDevice(driverobject: ConstPtr, legacybustype: InterfaceType, busnumber: UInt, slotnumber: UInt, resourcelist: ConstPtr, resourcerequirements: ConstPtr, resourceassigned: Boolean, deviceobject: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoReportDetectedDevice(driverobject.rawAddress, legacybustype, busnumber.toInt(), slotnumber.toInt(), resourcelist.rawAddress, resourcerequirements.rawAddress, resourceassigned, deviceobject.rawAddress)

public actual fun ioReportInterruptActive(parameters: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoReportInterruptActive(parameters.rawAddress)
}

public actual fun ioReportInterruptInactive(parameters: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoReportInterruptInactive(parameters.rawAddress)
}

public actual fun ioReportResourceForDetection(driverobject: ConstPtr, driverlist: ConstPtr, driverlistsize: UInt, deviceobject: ConstPtr, devicelist: ConstPtr, devicelistsize: UInt, conflictdetected: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoReportResourceForDetection(driverobject.rawAddress, driverlist.rawAddress, driverlistsize.toInt(), deviceobject.rawAddress, devicelist.rawAddress, devicelistsize.toInt(), conflictdetected.rawAddress)

public actual fun ioReportResourceUsage(driverclassname: ConstPtr, driverobject: ConstPtr, driverlist: ConstPtr, driverlistsize: UInt, deviceobject: ConstPtr, devicelist: ConstPtr, devicelistsize: UInt, overrideconflict: Boolean, conflictdetected: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoReportResourceUsage(driverclassname.rawAddress, driverobject.rawAddress, driverlist.rawAddress, driverlistsize.toInt(), deviceobject.rawAddress, devicelist.rawAddress, devicelistsize.toInt(), overrideconflict, conflictdetected.rawAddress)

public actual fun ioReportRootDevice(driverobject: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoReportRootDevice(driverobject.rawAddress)

public actual fun ioReportTargetDeviceChange(physicaldeviceobject: ConstPtr, notificationstructure: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoReportTargetDeviceChange(physicaldeviceobject.rawAddress, notificationstructure.rawAddress)

public actual fun ioReportTargetDeviceChangeAsynchronous(physicaldeviceobject: ConstPtr, notificationstructure: ConstPtr, callback: PdeviceChangeCompleteCallback, context: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoReportTargetDeviceChangeAsynchronous(physicaldeviceobject.rawAddress, notificationstructure.rawAddress, 0L, context.rawAddress)

public actual fun ioRequestDeviceEject(physicaldeviceobject: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoRequestDeviceEject(physicaldeviceobject.rawAddress)
}

public actual fun ioRequestDeviceEjectEx(physicaldeviceobject: ConstPtr, callback: PioDeviceEjectCallback, context: ConstPtr, driverobject: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoRequestDeviceEjectEx(physicaldeviceobject.rawAddress, 0L, context.rawAddress, driverobject.rawAddress)

public actual fun ioReserveKsrPersistentMemory(driverobject: ConstPtr, physicaldeviceobject: ConstPtr, size: ULong, flags: UInt, datahandle: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoReserveKsrPersistentMemory(driverobject.rawAddress, physicaldeviceobject.rawAddress, size.toLong(), flags.toInt(), datahandle.rawAddress)

public actual fun ioReserveKsrPersistentMemoryEx(driverobject: ConstPtr, physicaldeviceobject: ConstPtr, physicaldeviceid: ConstPtr, datatag: ConstPtr, dataversion: UInt, size: ULong, flags: UInt, datahandle: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoReserveKsrPersistentMemoryEx(driverobject.rawAddress, physicaldeviceobject.rawAddress, physicaldeviceid.rawAddress, datatag.rawAddress, dataversion.toInt(), size.toLong(), flags.toInt(), datahandle.rawAddress)

public actual fun ioReuseIrp(irp: MutPtr, iostatus: Ntstatus) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoReuseIrp(irp.rawAddress, iostatus)
}

public actual fun ioSetActivityIdIrp(irp: MutPtr, guid: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetActivityIdIrp(irp.rawAddress, guid.rawAddress)

public actual fun ioSetActivityIdThread(activityid: ConstPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetActivityIdThread(activityid.rawAddress))

public actual fun ioSetCompletionRoutineEx(deviceobject: ConstPtr, irp: ConstPtr, completionroutine: PioCompletionRoutine, context: ConstPtr, invokeonsuccess: Boolean, invokeonerror: Boolean, invokeoncancel: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetCompletionRoutineEx(deviceobject.rawAddress, irp.rawAddress, 0L, context.rawAddress, invokeonsuccess, invokeonerror, invokeoncancel)

public actual fun ioSetDeviceInterfacePropertyData(symboliclinkname: ConstPtr, propertykey: ConstPtr, lcid: UInt, flags: UInt, type: UInt, size: UInt, data: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetDeviceInterfacePropertyData(symboliclinkname.rawAddress, propertykey.rawAddress, lcid.toInt(), flags.toInt(), type.toInt(), size.toInt(), data.rawAddress)

public actual fun ioSetDeviceInterfaceState(symboliclinkname: ConstPtr, enable: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetDeviceInterfaceState(symboliclinkname.rawAddress, enable)

public actual fun ioSetDevicePropertyData(pdo: ConstPtr, propertykey: ConstPtr, lcid: UInt, flags: UInt, type: UInt, size: UInt, data: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetDevicePropertyData(pdo.rawAddress, propertykey.rawAddress, lcid.toInt(), flags.toInt(), type.toInt(), size.toInt(), data.rawAddress)

public actual fun ioSetFileObjectIgnoreSharing(fileobject: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetFileObjectIgnoreSharing(fileobject.rawAddress)

public actual fun ioSetFileOrigin(fileobject: ConstPtr, remote: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetFileOrigin(fileobject.rawAddress, remote)

public actual fun ioSetFsZeroingOffset(irp: MutPtr, zeroingoffset: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetFsZeroingOffset(irp.rawAddress, zeroingoffset.toInt())

public actual fun ioSetFsZeroingOffsetRequired(irp: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetFsZeroingOffsetRequired(irp.rawAddress)

public actual fun ioSetHardErrorOrVerifyDevice(irp: ConstPtr, deviceobject: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetHardErrorOrVerifyDevice(irp.rawAddress, deviceobject.rawAddress)
}

public actual fun ioSetIoAttributionIrp(irp: MutPtr, attributionsource: ConstPtr, flags: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetIoAttributionIrp(irp.rawAddress, attributionsource.rawAddress, flags.toInt())

public actual fun ioSetIoPriorityHint(irp: ConstPtr, priorityhint: IoPriorityHint): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetIoPriorityHint(irp.rawAddress, priorityhint)

public actual fun ioSetIrpExtraCreateParameter(irp: MutPtr, extracreateparameter: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetIrpExtraCreateParameter(irp.rawAddress, extracreateparameter.rawAddress)

public actual fun ioSetLinkShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: MutPtr, shareaccess: MutPtr, linkshareaccess: MutPtr, ioshareaccessflags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetLinkShareAccess(desiredaccess.toInt(), desiredshareaccess.toInt(), fileobject.rawAddress, shareaccess.rawAddress, linkshareaccess.rawAddress, ioshareaccessflags.toInt())
}

public actual fun ioSetMasterIrpStatus(masterirp: MutPtr, status: Ntstatus) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetMasterIrpStatus(masterirp.rawAddress, status)
}

public actual fun ioSetPartitionInformation(deviceobject: ConstPtr, sectorsize: UInt, partitionnumber: UInt, partitiontype: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetPartitionInformation(deviceobject.rawAddress, sectorsize.toInt(), partitionnumber.toInt(), partitiontype.toInt())

public actual fun ioSetPartitionInformationEx(deviceobject: ConstPtr, partitionnumber: UInt, partitioninfo: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetPartitionInformationEx(deviceobject.rawAddress, partitionnumber.toInt(), partitioninfo.rawAddress)

public actual fun ioSetShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: MutPtr, shareaccess: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetShareAccess(desiredaccess.toInt(), desiredshareaccess.toInt(), fileobject.rawAddress, shareaccess.rawAddress)
}

public actual fun ioSetShareAccessEx(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: MutPtr, shareaccess: MutPtr, writepermission: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetShareAccessEx(desiredaccess.toInt(), desiredshareaccess.toInt(), fileobject.rawAddress, shareaccess.rawAddress, writepermission.rawAddress)
}

public actual fun ioSetStartIoAttributes(deviceobject: ConstPtr, deferredstartio: Boolean, noncancelable: Boolean) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetStartIoAttributes(deviceobject.rawAddress, deferredstartio, noncancelable)
}

public actual fun ioSetSystemPartition(volumenamestring: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetSystemPartition(volumenamestring.rawAddress)

public actual fun ioSetThreadHardErrorMode(enableharderrors: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetThreadHardErrorMode(enableharderrors)

public actual fun ioSetTopLevelIrp(irp: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetTopLevelIrp(irp.rawAddress)
}

public actual fun ioSizeOfIrpEx(deviceobject: ConstPtr, stacksize: Byte): UShort =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSizeOfIrpEx(deviceobject.rawAddress, stacksize).toUShort()

public actual fun ioSizeofWorkItem(): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSizeofWorkItem().toUInt()

public actual fun ioStartNextPacket(deviceobject: ConstPtr, cancelable: Boolean) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoStartNextPacket(deviceobject.rawAddress, cancelable)
}

public actual fun ioStartNextPacketByKey(deviceobject: ConstPtr, cancelable: Boolean, key: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoStartNextPacketByKey(deviceobject.rawAddress, cancelable, key.toInt())
}

public actual fun ioStartPacket(deviceobject: ConstPtr, irp: ConstPtr, key: ConstPtr, cancelfunction: DriverCancel) {
}

public actual fun ioStartTimer(deviceobject: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoStartTimer(deviceobject.rawAddress)
}

public actual fun ioStopTimer(deviceobject: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoStopTimer(deviceobject.rawAddress)
}

public actual fun ioSynchronousCallDriver(deviceobject: ConstPtr, irp: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSynchronousCallDriver(deviceobject.rawAddress, irp.rawAddress)

public actual fun ioTransferActivityId(activityid: ConstPtr, relatedactivityid: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoTransferActivityId(activityid.rawAddress, relatedactivityid.rawAddress)
}

public actual fun ioTranslateBusAddress(interfacetype: InterfaceType, busnumber: UInt, busaddress: Long, addressspace: MutPtr, translatedaddress: MutPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoTranslateBusAddress(interfacetype, busnumber.toInt(), busaddress, addressspace.rawAddress, translatedaddress.rawAddress)

public actual fun ioTryQueueWorkItem(ioworkitem: PioWorkitem, workerroutine: PioWorkitemRoutineEx, queuetype: WorkQueueType, context: ConstPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoTryQueueWorkItem(ioworkitem, 0L, queuetype, context.rawAddress)

public actual fun ioUninitializeWorkItem(ioworkitem: PioWorkitem) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoUninitializeWorkItem(ioworkitem)
}

public actual fun ioUnregisterBootDriverCallback(callbackhandle: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoUnregisterBootDriverCallback(callbackhandle.rawAddress)
}

public actual fun ioUnregisterContainerNotification(callbackregistration: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoUnregisterContainerNotification(callbackregistration.rawAddress)
}

public actual fun ioUnregisterPlugPlayNotification(notificationentry: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoUnregisterPlugPlayNotification(notificationentry.rawAddress)

public actual fun ioUnregisterPlugPlayNotificationEx(notificationentry: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoUnregisterPlugPlayNotificationEx(notificationentry.rawAddress)

public actual fun ioUnregisterShutdownNotification(deviceobject: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoUnregisterShutdownNotification(deviceobject.rawAddress)
}

public actual fun ioUpdateLinkShareAccess(fileobject: ConstPtr, shareaccess: MutPtr, linkshareaccess: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoUpdateLinkShareAccess(fileobject.rawAddress, shareaccess.rawAddress, linkshareaccess.rawAddress)
}

public actual fun ioUpdateLinkShareAccessEx(fileobject: ConstPtr, shareaccess: MutPtr, linkshareaccess: MutPtr, ioshareaccessflags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoUpdateLinkShareAccessEx(fileobject.rawAddress, shareaccess.rawAddress, linkshareaccess.rawAddress, ioshareaccessflags.toInt())
}

public actual fun ioUpdateShareAccess(fileobject: ConstPtr, shareaccess: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoUpdateShareAccess(fileobject.rawAddress, shareaccess.rawAddress)
}

public actual fun ioValidateDeviceIoControlAccess(irp: ConstPtr, requiredaccess: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoValidateDeviceIoControlAccess(irp.rawAddress, requiredaccess.toInt())

public actual fun ioVerifyPartitionTable(deviceobject: ConstPtr, fixerrors: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoVerifyPartitionTable(deviceobject.rawAddress, fixerrors)

public actual fun ioVolumeDeviceNameToGuid(volumedevicename: ConstPtr, guid: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoVolumeDeviceNameToGuid(volumedevicename.rawAddress, guid.rawAddress)

public actual fun ioVolumeDeviceNameToGuidPath(volumedevicename: ConstPtr, guidpath: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoVolumeDeviceNameToGuidPath(volumedevicename.rawAddress, guidpath.rawAddress)

public actual fun ioVolumeDeviceToDosName(volumedeviceobject: ConstPtr, dosname: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoVolumeDeviceToDosName(volumedeviceobject.rawAddress, dosname.rawAddress)

public actual fun ioVolumeDeviceToGuid(volumedeviceobject: ConstPtr, guid: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoVolumeDeviceToGuid(volumedeviceobject.rawAddress, guid.rawAddress)

public actual fun ioVolumeDeviceToGuidPath(volumedeviceobject: ConstPtr, guidpath: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoVolumeDeviceToGuidPath(volumedeviceobject.rawAddress, guidpath.rawAddress)

public actual fun ioWMIAllocateInstanceIds(guid: ConstPtr, instancecount: UInt, firstinstanceid: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoWMIAllocateInstanceIds(guid.rawAddress, instancecount.toInt(), firstinstanceid.rawAddress)

public actual fun ioWMIDeviceObjectToInstanceName(datablockobject: ConstPtr, deviceobject: ConstPtr, instancename: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoWMIDeviceObjectToInstanceName(datablockobject.rawAddress, deviceobject.rawAddress, instancename.rawAddress)

public actual fun ioWMIExecuteMethod(datablockobject: ConstPtr, instancename: ConstPtr, methodid: UInt, inbuffersize: UInt, outbuffersize: MutPtr, inoutbuffer: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoWMIExecuteMethod(datablockobject.rawAddress, instancename.rawAddress, methodid.toInt(), inbuffersize.toInt(), outbuffersize.rawAddress, inoutbuffer.rawAddress)

public actual fun ioWMIHandleToInstanceName(datablockobject: ConstPtr, filehandle: Handle, instancename: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoWMIHandleToInstanceName(datablockobject.rawAddress, filehandle.rawAddress, instancename.rawAddress)

public actual fun ioWMIOpenBlock(guid: ConstPtr, desiredaccess: UInt, datablockobject: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoWMIOpenBlock(guid.rawAddress, desiredaccess.toInt(), datablockobject.rawAddress)

public actual fun ioWMIQueryAllData(datablockobject: ConstPtr, inoutbuffersize: MutPtr, outbuffer: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoWMIQueryAllData(datablockobject.rawAddress, inoutbuffersize.rawAddress, outbuffer.rawAddress)

public actual fun ioWMIQueryAllDataMultiple(datablockobjectlist: ConstPtr, objectcount: UInt, inoutbuffersize: MutPtr, outbuffer: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoWMIQueryAllDataMultiple(datablockobjectlist.rawAddress, objectcount.toInt(), inoutbuffersize.rawAddress, outbuffer.rawAddress)

public actual fun ioWMIQuerySingleInstance(datablockobject: ConstPtr, instancename: ConstPtr, inoutbuffersize: MutPtr, outbuffer: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoWMIQuerySingleInstance(datablockobject.rawAddress, instancename.rawAddress, inoutbuffersize.rawAddress, outbuffer.rawAddress)

public actual fun ioWMIQuerySingleInstanceMultiple(datablockobjectlist: ConstPtr, instancenames: ConstPtr, objectcount: UInt, inoutbuffersize: MutPtr, outbuffer: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoWMIQuerySingleInstanceMultiple(datablockobjectlist.rawAddress, instancenames.rawAddress, objectcount.toInt(), inoutbuffersize.rawAddress, outbuffer.rawAddress)

public actual fun ioWMIRegistrationControl(deviceobject: ConstPtr, action: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoWMIRegistrationControl(deviceobject.rawAddress, action.toInt())

public actual fun ioWMISetNotificationCallback(obj: MutPtr, callback: WmiNotificationCallback, context: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoWMISetNotificationCallback(obj.rawAddress, 0L, context.rawAddress)

public actual fun ioWMISetSingleInstance(datablockobject: ConstPtr, instancename: ConstPtr, version: UInt, valuebuffersize: UInt, valuebuffer: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoWMISetSingleInstance(datablockobject.rawAddress, instancename.rawAddress, version.toInt(), valuebuffersize.toInt(), valuebuffer.rawAddress)

public actual fun ioWMISetSingleItem(datablockobject: ConstPtr, instancename: ConstPtr, dataitemid: UInt, version: UInt, valuebuffersize: UInt, valuebuffer: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoWMISetSingleItem(datablockobject.rawAddress, instancename.rawAddress, dataitemid.toInt(), version.toInt(), valuebuffersize.toInt(), valuebuffer.rawAddress)

public actual fun ioWMISuggestInstanceName(physicaldeviceobject: ConstPtr, symboliclinkname: ConstPtr, combinenames: Boolean, suggestedinstancename: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoWMISuggestInstanceName(physicaldeviceobject.rawAddress, symboliclinkname.rawAddress, combinenames, suggestedinstancename.rawAddress)

public actual fun ioWMIWriteEvent(wnodeeventitem: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoWMIWriteEvent(wnodeeventitem.rawAddress)

public actual fun ioWithinStackLimits(regionstart: ULong, regionsize: ULong): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoWithinStackLimits(regionstart.toLong(), regionsize.toLong()).toUInt()

public actual fun ioWriteErrorLogEntry(elentry: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoWriteErrorLogEntry(elentry.rawAddress)
}

public actual fun ioWriteKsrPersistentMemory(datahandle: ConstPtr, buffer: ConstPtr, size: ULong): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoWriteKsrPersistentMemory(datahandle.rawAddress, buffer.rawAddress, size.toLong())

public actual fun ioWritePartitionTable(deviceobject: ConstPtr, sectorsize: UInt, sectorspertrack: UInt, numberofheads: UInt, partitionbuffer: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoWritePartitionTable(deviceobject.rawAddress, sectorsize.toInt(), sectorspertrack.toInt(), numberofheads.toInt(), partitionbuffer.rawAddress)

public actual fun ioWritePartitionTableEx(deviceobject: ConstPtr, drivelayout: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoWritePartitionTableEx(deviceobject.rawAddress, drivelayout.rawAddress)

public actual fun iofCallDriver(deviceobject: ConstPtr, irp: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIofCallDriver(deviceobject.rawAddress, irp.rawAddress)

public actual fun iofCompleteRequest(irp: ConstPtr, priorityboost: Byte) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIofCompleteRequest(irp.rawAddress, priorityboost)
}

public actual fun kdChangeOption(option: KdOption, inbufferbytes: UInt, inbuffer: ConstPtr, outbufferbytes: UInt, outbuffer: MutPtr, outbufferneeded: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKdChangeOption(option, inbufferbytes.toInt(), inbuffer.rawAddress, outbufferbytes.toInt(), outbuffer.rawAddress, outbufferneeded.rawAddress)

public actual fun kdDisableDebugger(): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKdDisableDebugger()

public actual fun kdEnableDebugger(): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKdEnableDebugger()

public actual fun kdRefreshDebuggerNotPresent(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKdRefreshDebuggerNotPresent()

public actual fun keAcquireGuardedMutex(mutex: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeAcquireGuardedMutex(mutex.rawAddress)
}

public actual fun keAcquireGuardedMutexUnsafe(fastmutex: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeAcquireGuardedMutexUnsafe(fastmutex.rawAddress)
}

public actual fun keAcquireInStackQueuedSpinLock(spinlock: MutPtr, lockhandle: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeAcquireInStackQueuedSpinLock(spinlock.rawAddress, lockhandle.rawAddress)
}

public actual fun keAcquireInStackQueuedSpinLockAtDpcLevel(spinlock: MutPtr, lockhandle: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeAcquireInStackQueuedSpinLockAtDpcLevel(spinlock.rawAddress, lockhandle.rawAddress)
}

public actual fun keAcquireInStackQueuedSpinLockForDpc(spinlock: MutPtr, lockhandle: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeAcquireInStackQueuedSpinLockForDpc(spinlock.rawAddress, lockhandle.rawAddress)
}

public actual fun keAcquireInterruptSpinLock(interrupt: Pkinterrupt): UByte =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeAcquireInterruptSpinLock(interrupt).toUByte()

public actual fun keAcquireSpinLockForDpc(spinlock: MutPtr): UByte =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeAcquireSpinLockForDpc(spinlock.rawAddress).toUByte()

public actual fun keAddTriageDumpDataBlock(ktriagedumpdataarray: MutPtr, address: ConstPtr, size: ULong): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeAddTriageDumpDataBlock(ktriagedumpdataarray.rawAddress, address.rawAddress, size.toLong())

public actual fun keAreAllApcsDisabled(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeAreAllApcsDisabled()

public actual fun keAreApcsDisabled(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeAreApcsDisabled()

public actual fun keBugCheck(bugcheckcode: BugcheckError) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeBugCheck(bugcheckcode.toInt())
}

public actual fun keBugCheckEx(bugcheckcode: BugcheckError, bugcheckparameter1: ULong, bugcheckparameter2: ULong, bugcheckparameter3: ULong, bugcheckparameter4: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeBugCheckEx(bugcheckcode.toInt(), bugcheckparameter1.toLong(), bugcheckparameter2.toLong(), bugcheckparameter3.toLong(), bugcheckparameter4.toLong())
}

public actual fun keCancelTimer(param0: MutPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeCancelTimer(param0.rawAddress)

public actual fun keClearEvent(event: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeClearEvent(event.rawAddress)
}

public actual fun keConvertAuxiliaryCounterToPerformanceCounter(auxiliarycountervalue: ULong, performancecountervalue: MutPtr, conversionerror: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeConvertAuxiliaryCounterToPerformanceCounter(auxiliarycountervalue.toLong(), performancecountervalue.rawAddress, conversionerror.rawAddress)

public actual fun keConvertPerformanceCounterToAuxiliaryCounter(performancecountervalue: ULong, auxiliarycountervalue: MutPtr, conversionerror: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeConvertPerformanceCounterToAuxiliaryCounter(performancecountervalue.toLong(), auxiliarycountervalue.rawAddress, conversionerror.rawAddress)

public actual fun keDelayExecutionThread(waitmode: Byte, alertable: Boolean, interval: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeDelayExecutionThread(waitmode, alertable, interval.rawAddress)

public actual fun keDeregisterBoundCallback(handle: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeDeregisterBoundCallback(handle.rawAddress)

public actual fun keDeregisterBugCheckCallback(callbackrecord: MutPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeDeregisterBugCheckCallback(callbackrecord.rawAddress)

public actual fun keDeregisterBugCheckReasonCallback(callbackrecord: MutPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeDeregisterBugCheckReasonCallback(callbackrecord.rawAddress)

public actual fun keDeregisterNmiCallback(handle: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeDeregisterNmiCallback(handle.rawAddress)

public actual fun keDeregisterProcessorChangeCallback(callbackhandle: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeDeregisterProcessorChangeCallback(callbackhandle.rawAddress)
}

public actual fun keEnterCriticalRegion() {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeEnterCriticalRegion()
}

public actual fun keEnterGuardedRegion() {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeEnterGuardedRegion()
}

public actual fun keExpandKernelStackAndCallout(callout: PexpandStackCallout, parameter: ConstPtr, size: ULong): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeExpandKernelStackAndCallout(0L, parameter.rawAddress, size.toLong())

public actual fun keExpandKernelStackAndCalloutEx(callout: PexpandStackCallout, parameter: ConstPtr, size: ULong, wait: Boolean, context: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeExpandKernelStackAndCalloutEx(0L, parameter.rawAddress, size.toLong(), wait, context.rawAddress)

public actual fun keFlushIoBuffers(mdl: ConstPtr, readoperation: Boolean, dmaoperation: Boolean) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeFlushIoBuffers(mdl.rawAddress, readoperation, dmaoperation)
}

public actual fun keFlushQueuedDpcs() {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeFlushQueuedDpcs()
}

public actual fun keFlushWriteBuffer() {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeFlushWriteBuffer()
}

public actual fun keGetCurrentIrql(): UByte =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeGetCurrentIrql().toUByte()

public actual fun keGetCurrentNodeNumber(): UShort =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeGetCurrentNodeNumber().toUShort()

public actual fun keGetCurrentProcessorNumberEx(procnumber: MutPtr): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeGetCurrentProcessorNumberEx(procnumber.rawAddress).toUInt()

public actual fun keGetProcessorIndexFromNumber(procnumber: ConstPtr): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeGetProcessorIndexFromNumber(procnumber.rawAddress).toUInt()

public actual fun keGetProcessorNumberFromIndex(procindex: UInt, procnumber: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeGetProcessorNumberFromIndex(procindex.toInt(), procnumber.rawAddress)

public actual fun keGetRecommendedSharedDataAlignment(): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeGetRecommendedSharedDataAlignment().toUInt()

public actual fun keInitializeCrashDumpHeader(dumptype: UInt, flags: UInt, buffer: MutPtr, buffersize: UInt, bufferneeded: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeInitializeCrashDumpHeader(dumptype.toInt(), flags.toInt(), buffer.rawAddress, buffersize.toInt(), bufferneeded.rawAddress)

public actual fun keInitializeDeviceQueue(devicequeue: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeInitializeDeviceQueue(devicequeue.rawAddress)
}

public actual fun keInitializeDpc(dpc: MutPtr, deferredroutine: PkdeferredRoutine, deferredcontext: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeInitializeDpc(dpc.rawAddress, 0L, deferredcontext.rawAddress)
}

public actual fun keInitializeEvent(event: MutPtr, type: EventType, state: Boolean) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeInitializeEvent(event.rawAddress, type, state)
}

public actual fun keInitializeGuardedMutex(mutex: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeInitializeGuardedMutex(mutex.rawAddress)
}

public actual fun keInitializeMutex(mutex: MutPtr, level: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeInitializeMutex(mutex.rawAddress, level.toInt())
}

public actual fun keInitializeSemaphore(semaphore: MutPtr, count: Int, limit: Int) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeInitializeSemaphore(semaphore.rawAddress, count, limit)
}

public actual fun keInitializeSpinLock(spinlock: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeInitializeSpinLock(spinlock.rawAddress)
}

public actual fun keInitializeThreadedDpc(dpc: MutPtr, deferredroutine: PkdeferredRoutine, deferredcontext: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeInitializeThreadedDpc(dpc.rawAddress, 0L, deferredcontext.rawAddress)
}

public actual fun keInitializeTimer(timer: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeInitializeTimer(timer.rawAddress)
}

public actual fun keInitializeTimerEx(timer: MutPtr, type: TimerType) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeInitializeTimerEx(timer.rawAddress, type)
}

public actual fun keInitializeTriageDumpDataArray(ktriagedumpdataarray: MutPtr, size: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeInitializeTriageDumpDataArray(ktriagedumpdataarray.rawAddress, size.toInt())

public actual fun keInsertByKeyDeviceQueue(devicequeue: MutPtr, devicequeueentry: MutPtr, sortkey: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeInsertByKeyDeviceQueue(devicequeue.rawAddress, devicequeueentry.rawAddress, sortkey.toInt())

public actual fun keInsertDeviceQueue(devicequeue: MutPtr, devicequeueentry: MutPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeInsertDeviceQueue(devicequeue.rawAddress, devicequeueentry.rawAddress)

public actual fun keInsertQueueDpc(dpc: MutPtr, systemargument1: ConstPtr, systemargument2: ConstPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeInsertQueueDpc(dpc.rawAddress, systemargument1.rawAddress, systemargument2.rawAddress)

public actual fun keInvalidateAllCaches(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeInvalidateAllCaches()

public actual fun keInvalidateRangeAllCaches(baseaddress: ConstPtr, length: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeInvalidateRangeAllCaches(baseaddress.rawAddress, length.toInt())
}

public actual fun keIpiGenericCall(broadcastfunction: PkipiBroadcastWorker, context: ULong): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeIpiGenericCall(0L, context.toLong()).toULong()

public actual fun keIsExecutingDpc(): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeIsExecutingDpc().toUInt()

public actual fun keLeaveCriticalRegion() {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeLeaveCriticalRegion()
}

public actual fun keLeaveGuardedRegion() {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeLeaveGuardedRegion()
}

public actual fun kePulseEvent(event: MutPtr, increment: Int, wait: Boolean): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKePulseEvent(event.rawAddress, increment, wait)

public actual fun keQueryActiveGroupCount(): UShort =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryActiveGroupCount().toUShort()

public actual fun keQueryActiveProcessorCount(activeprocessors: MutPtr): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryActiveProcessorCount(activeprocessors.rawAddress).toUInt()

public actual fun keQueryActiveProcessorCountEx(groupnumber: UShort): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryActiveProcessorCountEx(groupnumber.toShort()).toUInt()

public actual fun keQueryActiveProcessors(): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryActiveProcessors().toULong()

public actual fun keQueryAuxiliaryCounterFrequency(auxiliarycounterfrequency: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryAuxiliaryCounterFrequency(auxiliarycounterfrequency.rawAddress)

public actual fun keQueryDpcWatchdogInformation(watchdoginformation: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryDpcWatchdogInformation(watchdoginformation.rawAddress)

public actual fun keQueryGroupAffinity(groupnumber: UShort): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryGroupAffinity(groupnumber.toShort()).toULong()

public actual fun keQueryHardwareCounterConfiguration(counterarray: MutPtr, maximumcount: UInt, count: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryHardwareCounterConfiguration(counterarray.rawAddress, maximumcount.toInt(), count.rawAddress)

public actual fun keQueryHighestNodeNumber(): UShort =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryHighestNodeNumber().toUShort()

public actual fun keQueryInterruptTimePrecise(qpctimestamp: MutPtr): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryInterruptTimePrecise(qpctimestamp.rawAddress).toULong()

public actual fun keQueryLogicalProcessorRelationship(processornumber: ConstPtr, relationshiptype: LogicalProcessorRelationship, information: MutPtr, length: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryLogicalProcessorRelationship(processornumber.rawAddress, relationshiptype, information.rawAddress, length.rawAddress)

public actual fun keQueryMaximumGroupCount(): UShort =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryMaximumGroupCount().toUShort()

public actual fun keQueryMaximumProcessorCount(): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryMaximumProcessorCount().toUInt()

public actual fun keQueryMaximumProcessorCountEx(groupnumber: UShort): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryMaximumProcessorCountEx(groupnumber.toShort()).toUInt()

public actual fun keQueryNodeActiveAffinity(nodenumber: UShort, affinity: MutPtr, count: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryNodeActiveAffinity(nodenumber.toShort(), affinity.rawAddress, count.rawAddress)
}

public actual fun keQueryNodeActiveAffinity2(nodenumber: UShort, groupaffinities: MutPtr, groupaffinitiescount: UShort, groupaffinitiesrequired: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryNodeActiveAffinity2(nodenumber.toShort(), groupaffinities.rawAddress, groupaffinitiescount.toShort(), groupaffinitiesrequired.rawAddress)

public actual fun keQueryNodeActiveProcessorCount(nodenumber: UShort): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryNodeActiveProcessorCount(nodenumber.toShort()).toUInt()

public actual fun keQueryNodeMaximumProcessorCount(nodenumber: UShort): UShort =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryNodeMaximumProcessorCount(nodenumber.toShort()).toUShort()

public actual fun keQueryPerformanceCounter(performancefrequency: MutPtr): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryPerformanceCounter(performancefrequency.rawAddress)

public actual fun keQueryPriorityThread(thread: Pkthread): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryPriorityThread(thread)

public actual fun keQueryRuntimeThread(thread: Pkthread, usertime: MutPtr): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryRuntimeThread(thread, usertime.rawAddress).toUInt()

public actual fun keQuerySystemTimePrecise(currenttime: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQuerySystemTimePrecise(currenttime.rawAddress)
}

public actual fun keQueryTimeIncrement(): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryTimeIncrement().toUInt()

public actual fun keQueryTotalCycleTimeThread(thread: Pkthread, cycletimestamp: MutPtr): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryTotalCycleTimeThread(thread, cycletimestamp.rawAddress).toULong()

public actual fun keQueryUnbiasedInterruptTime(): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryUnbiasedInterruptTime().toULong()

public actual fun keQueryUnbiasedInterruptTimePrecise(qpctimestamp: MutPtr): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryUnbiasedInterruptTimePrecise(qpctimestamp.rawAddress).toULong()

public actual fun keReadStateEvent(event: ConstPtr): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeReadStateEvent(event.rawAddress)

public actual fun keReadStateMutex(mutex: ConstPtr): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeReadStateMutex(mutex.rawAddress)

public actual fun keReadStateSemaphore(semaphore: ConstPtr): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeReadStateSemaphore(semaphore.rawAddress)

public actual fun keReadStateTimer(timer: ConstPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeReadStateTimer(timer.rawAddress)

public actual fun keRegisterBoundCallback(callbackroutine: PboundCallback): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeRegisterBoundCallback(0L))

public actual fun keRegisterBugCheckCallback(callbackrecord: MutPtr, callbackroutine: PkbugcheckCallbackRoutine, buffer: ConstPtr, length: UInt, component: ConstPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeRegisterBugCheckCallback(callbackrecord.rawAddress, 0L, buffer.rawAddress, length.toInt(), component.rawAddress)

public actual fun keRegisterBugCheckReasonCallback(callbackrecord: MutPtr, callbackroutine: PkbugcheckReasonCallbackRoutine, reason: KbugcheckCallbackReason, component: ConstPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeRegisterBugCheckReasonCallback(callbackrecord.rawAddress, 0L, reason, component.rawAddress)

public actual fun keRegisterNmiCallback(callbackroutine: PnmiCallback, context: ConstPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeRegisterNmiCallback(0L, context.rawAddress))

public actual fun keRegisterProcessorChangeCallback(callbackfunction: PprocessorCallbackFunction, callbackcontext: ConstPtr, flags: UInt): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeRegisterProcessorChangeCallback(0L, callbackcontext.rawAddress, flags.toInt()))

public actual fun keReleaseGuardedMutex(mutex: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeReleaseGuardedMutex(mutex.rawAddress)
}

public actual fun keReleaseGuardedMutexUnsafe(fastmutex: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeReleaseGuardedMutexUnsafe(fastmutex.rawAddress)
}

public actual fun keReleaseInStackQueuedSpinLock(lockhandle: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeReleaseInStackQueuedSpinLock(lockhandle.rawAddress)
}

public actual fun keReleaseInStackQueuedSpinLockForDpc(lockhandle: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeReleaseInStackQueuedSpinLockForDpc(lockhandle.rawAddress)
}

public actual fun keReleaseInStackQueuedSpinLockFromDpcLevel(lockhandle: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeReleaseInStackQueuedSpinLockFromDpcLevel(lockhandle.rawAddress)
}

public actual fun keReleaseInterruptSpinLock(interrupt: Pkinterrupt, oldirql: UByte) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeReleaseInterruptSpinLock(interrupt, oldirql.toByte())
}

public actual fun keReleaseMutex(mutex: MutPtr, wait: Boolean): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeReleaseMutex(mutex.rawAddress, wait)

public actual fun keReleaseSemaphore(semaphore: MutPtr, increment: Int, adjustment: Int, wait: Boolean): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeReleaseSemaphore(semaphore.rawAddress, increment, adjustment, wait)

public actual fun keReleaseSpinLockForDpc(spinlock: MutPtr, oldirql: UByte) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeReleaseSpinLockForDpc(spinlock.rawAddress, oldirql.toByte())
}

public actual fun keRemoveByKeyDeviceQueue(devicequeue: MutPtr, sortkey: UInt): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeRemoveByKeyDeviceQueue(devicequeue.rawAddress, sortkey.toInt()))

public actual fun keRemoveByKeyDeviceQueueIfBusy(devicequeue: MutPtr, sortkey: UInt): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeRemoveByKeyDeviceQueueIfBusy(devicequeue.rawAddress, sortkey.toInt()))

public actual fun keRemoveDeviceQueue(devicequeue: MutPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeRemoveDeviceQueue(devicequeue.rawAddress))

public actual fun keRemoveEntryDeviceQueue(devicequeue: MutPtr, devicequeueentry: MutPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeRemoveEntryDeviceQueue(devicequeue.rawAddress, devicequeueentry.rawAddress)

public actual fun keRemoveQueueDpc(dpc: MutPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeRemoveQueueDpc(dpc.rawAddress)

public actual fun keRemoveQueueDpcEx(dpc: MutPtr, waitifactive: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeRemoveQueueDpcEx(dpc.rawAddress, waitifactive)

public actual fun keResetEvent(event: MutPtr): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeResetEvent(event.rawAddress)

public actual fun keRestoreExtendedProcessorState(xstatesave: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeRestoreExtendedProcessorState(xstatesave.rawAddress)
}

public actual fun keRevertToUserAffinityThread() {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeRevertToUserAffinityThread()
}

public actual fun keRevertToUserAffinityThreadEx(affinity: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeRevertToUserAffinityThreadEx(affinity.toLong())
}

public actual fun keRevertToUserGroupAffinityThread(previousaffinity: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeRevertToUserGroupAffinityThread(previousaffinity.rawAddress)
}

public actual fun keSaveExtendedProcessorState(mask: ULong, xstatesave: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeSaveExtendedProcessorState(mask.toLong(), xstatesave.rawAddress)

public actual fun keSetBasePriorityThread(thread: Pkthread, increment: Int): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeSetBasePriorityThread(thread, increment)

public actual fun keSetCoalescableTimer(timer: MutPtr, duetime: Long, period: UInt, tolerabledelay: UInt, dpc: ConstPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeSetCoalescableTimer(timer.rawAddress, duetime, period.toInt(), tolerabledelay.toInt(), dpc.rawAddress)

public actual fun keSetEvent(event: MutPtr, increment: Int, wait: Boolean): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeSetEvent(event.rawAddress, increment, wait)

public actual fun keSetHardwareCounterConfiguration(counterarray: ConstPtr, count: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeSetHardwareCounterConfiguration(counterarray.rawAddress, count.toInt())

public actual fun keSetImportanceDpc(dpc: MutPtr, importance: KdpcImportance) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeSetImportanceDpc(dpc.rawAddress, importance)
}

public actual fun keSetPriorityThread(thread: Pkthread, priority: Int): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeSetPriorityThread(thread, priority)

public actual fun keSetSystemAffinityThread(affinity: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeSetSystemAffinityThread(affinity.toLong())
}

public actual fun keSetSystemAffinityThreadEx(affinity: ULong): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeSetSystemAffinityThreadEx(affinity.toLong()).toULong()

public actual fun keSetSystemGroupAffinityThread(affinity: ConstPtr, previousaffinity: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeSetSystemGroupAffinityThread(affinity.rawAddress, previousaffinity.rawAddress)
}

public actual fun keSetTargetProcessorDpc(dpc: MutPtr, number: Byte) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeSetTargetProcessorDpc(dpc.rawAddress, number)
}

public actual fun keSetTargetProcessorDpcEx(dpc: MutPtr, procnumber: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeSetTargetProcessorDpcEx(dpc.rawAddress, procnumber.rawAddress)

public actual fun keSetTimer(timer: MutPtr, duetime: Long, dpc: ConstPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeSetTimer(timer.rawAddress, duetime, dpc.rawAddress)

public actual fun keSetTimerEx(timer: MutPtr, duetime: Long, period: Int, dpc: ConstPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeSetTimerEx(timer.rawAddress, duetime, period, dpc.rawAddress)

public actual fun keShouldYieldProcessor(): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeShouldYieldProcessor().toUInt()

public actual fun keStallExecutionProcessor(microseconds: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeStallExecutionProcessor(microseconds.toInt())
}

public actual fun keSynchronizeExecution(interrupt: Pkinterrupt, synchronizeroutine: PksynchronizeRoutine, synchronizecontext: ConstPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeSynchronizeExecution(interrupt, 0L, synchronizecontext.rawAddress)

public actual fun keTestSpinLock(spinlock: ConstPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeTestSpinLock(spinlock.rawAddress)

public actual fun keTryToAcquireGuardedMutex(mutex: MutPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeTryToAcquireGuardedMutex(mutex.rawAddress)

public actual fun keTryToAcquireSpinLockAtDpcLevel(spinlock: MutPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeTryToAcquireSpinLockAtDpcLevel(spinlock.rawAddress)

public actual fun keWaitForMultipleObjects(count: UInt, obj: ConstPtr, waittype: WaitType, waitreason: KwaitReason, waitmode: Byte, alertable: Boolean, timeout: ConstPtr, waitblockarray: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeWaitForMultipleObjects(count.toInt(), obj.rawAddress, waittype, waitreason, waitmode, alertable, timeout.rawAddress, waitblockarray.rawAddress)

public actual fun keWaitForSingleObject(obj: ConstPtr, waitreason: KwaitReason, waitmode: Byte, alertable: Boolean, timeout: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeWaitForSingleObject(obj.rawAddress, waitreason, waitmode, alertable, timeout.rawAddress)

public actual fun kfRaiseIrql(newirql: UByte): UByte =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKfRaiseIrql(newirql.toByte()).toUByte()

public actual fun mmAddPhysicalMemory(startaddress: ConstPtr, numberofbytes: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmAddPhysicalMemory(startaddress.rawAddress, numberofbytes.rawAddress)

public actual fun mmAddVerifierSpecialThunks(entryroutine: ULong, thunkbuffer: ConstPtr, thunkbuffersize: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmAddVerifierSpecialThunks(entryroutine.toLong(), thunkbuffer.rawAddress, thunkbuffersize.toInt())

public actual fun mmAddVerifierThunks(thunkbuffer: ConstPtr, thunkbuffersize: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmAddVerifierThunks(thunkbuffer.rawAddress, thunkbuffersize.toInt())

public actual fun mmAdvanceMdl(mdl: MutPtr, numberofbytes: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmAdvanceMdl(mdl.rawAddress, numberofbytes.toInt())

public actual fun mmAllocateContiguousMemory(numberofbytes: ULong, highestacceptableaddress: Long): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmAllocateContiguousMemory(numberofbytes.toLong(), highestacceptableaddress))

public actual fun mmAllocateContiguousMemoryEx(numberofbytes: ConstPtr, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, preferrednode: UInt, protect: UInt, partitionobject: ConstPtr, tag: UInt, flags: UInt, baseaddress: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmAllocateContiguousMemoryEx(numberofbytes.rawAddress, lowestacceptableaddress, highestacceptableaddress, boundaryaddressmultiple, preferrednode.toInt(), protect.toInt(), partitionobject.rawAddress, tag.toInt(), flags.toInt(), baseaddress.rawAddress)

public actual fun mmAllocateContiguousMemorySpecifyCache(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, cachetype: MemoryCachingType): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmAllocateContiguousMemorySpecifyCache(numberofbytes.toLong(), lowestacceptableaddress, highestacceptableaddress, boundaryaddressmultiple, cachetype))

public actual fun mmAllocateContiguousMemorySpecifyCacheNode(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, cachetype: MemoryCachingType, preferrednode: UInt): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmAllocateContiguousMemorySpecifyCacheNode(numberofbytes.toLong(), lowestacceptableaddress, highestacceptableaddress, boundaryaddressmultiple, cachetype, preferrednode.toInt()))

public actual fun mmAllocateContiguousNodeMemory(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, protect: UInt, preferrednode: UInt): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmAllocateContiguousNodeMemory(numberofbytes.toLong(), lowestacceptableaddress, highestacceptableaddress, boundaryaddressmultiple, protect.toInt(), preferrednode.toInt()))

public actual fun mmAllocateMappingAddress(numberofbytes: ULong, pooltag: UInt): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmAllocateMappingAddress(numberofbytes.toLong(), pooltag.toInt()))

public actual fun mmAllocateMappingAddressEx(numberofbytes: ULong, pooltag: UInt, flags: UInt): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmAllocateMappingAddressEx(numberofbytes.toLong(), pooltag.toInt(), flags.toInt()))

public actual fun mmAllocateMdlForIoSpace(physicaladdresslist: ConstPtr, numberofentries: ULong, newmdl: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmAllocateMdlForIoSpace(physicaladdresslist.rawAddress, numberofentries.toLong(), newmdl.rawAddress)

public actual fun mmAllocateNodePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MemoryCachingType, idealnode: UInt, flags: UInt): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmAllocateNodePagesForMdlEx(lowaddress, highaddress, skipbytes, totalbytes.toLong(), cachetype, idealnode.toInt(), flags.toInt()))

public actual fun mmAllocateNonCachedMemory(numberofbytes: ULong): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmAllocateNonCachedMemory(numberofbytes.toLong()))

public actual fun mmAllocatePagesForMdl(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmAllocatePagesForMdl(lowaddress, highaddress, skipbytes, totalbytes.toLong()))

public actual fun mmAllocatePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MemoryCachingType, flags: UInt): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmAllocatePagesForMdlEx(lowaddress, highaddress, skipbytes, totalbytes.toLong(), cachetype, flags.toInt()))

public actual fun mmAllocatePartitionNodePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MemoryCachingType, idealnode: UInt, flags: UInt, partitionobject: ConstPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmAllocatePartitionNodePagesForMdlEx(lowaddress, highaddress, skipbytes, totalbytes.toLong(), cachetype, idealnode.toInt(), flags.toInt(), partitionobject.rawAddress))

public actual fun mmAreMdlPagesCached(memorydescriptorlist: ConstPtr): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmAreMdlPagesCached(memorydescriptorlist.rawAddress).toUInt()

public actual fun mmBuildMdlForNonPagedPool(memorydescriptorlist: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmBuildMdlForNonPagedPool(memorydescriptorlist.rawAddress)
}

public actual fun mmCopyMemory(targetaddress: ConstPtr, sourceaddress: MmCopyAddress, numberofbytes: ULong, flags: UInt, numberofbytestransferred: MutPtr): Ntstatus =
    0

public actual fun mmCreateMdl(memorydescriptorlist: MutPtr, base: ConstPtr, length: ULong): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmCreateMdl(memorydescriptorlist.rawAddress, base.rawAddress, length.toLong()))

public actual fun mmCreateMirror(): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmCreateMirror()

public actual fun mmFreeContiguousMemory(baseaddress: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmFreeContiguousMemory(baseaddress.rawAddress)
}

public actual fun mmFreeContiguousMemorySpecifyCache(baseaddress: ConstPtr, numberofbytes: ULong, cachetype: MemoryCachingType) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmFreeContiguousMemorySpecifyCache(baseaddress.rawAddress, numberofbytes.toLong(), cachetype)
}

public actual fun mmFreeMappingAddress(baseaddress: ConstPtr, pooltag: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmFreeMappingAddress(baseaddress.rawAddress, pooltag.toInt())
}

public actual fun mmFreeNonCachedMemory(baseaddress: ConstPtr, numberofbytes: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmFreeNonCachedMemory(baseaddress.rawAddress, numberofbytes.toLong())
}

public actual fun mmFreePagesFromMdl(memorydescriptorlist: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmFreePagesFromMdl(memorydescriptorlist.rawAddress)
}

public actual fun mmFreePagesFromMdlEx(memorydescriptorlist: MutPtr, flags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmFreePagesFromMdlEx(memorydescriptorlist.rawAddress, flags.toInt())
}

public actual fun mmGetCacheAttribute(physicaladdress: Long, cachetype: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmGetCacheAttribute(physicaladdress, cachetype.rawAddress)

public actual fun mmGetCacheAttributeEx(physicaladdress: Long, flags: UInt, cachetype: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmGetCacheAttributeEx(physicaladdress, flags.toInt(), cachetype.rawAddress)

public actual fun mmGetPhysicalAddress(baseaddress: ConstPtr): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmGetPhysicalAddress(baseaddress.rawAddress)

public actual fun mmGetPhysicalMemoryRanges(): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmGetPhysicalMemoryRanges())

public actual fun mmGetPhysicalMemoryRangesEx(partitionobject: ConstPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmGetPhysicalMemoryRangesEx(partitionobject.rawAddress))

public actual fun mmGetPhysicalMemoryRangesEx2(partitionobject: ConstPtr, flags: UInt): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmGetPhysicalMemoryRangesEx2(partitionobject.rawAddress, flags.toInt()))

public actual fun mmGetSystemRoutineAddress(systemroutinename: ConstPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmGetSystemRoutineAddress(systemroutinename.rawAddress))

public actual fun mmGetVirtualForPhysical(physicaladdress: Long): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmGetVirtualForPhysical(physicaladdress))

public actual fun mmIsAddressValid(virtualaddress: ConstPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmIsAddressValid(virtualaddress.rawAddress)

public actual fun mmIsDriverSuspectForVerifier(driverobject: ConstPtr): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmIsDriverSuspectForVerifier(driverobject.rawAddress).toUInt()

public actual fun mmIsDriverVerifying(driverobject: ConstPtr): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmIsDriverVerifying(driverobject.rawAddress).toUInt()

public actual fun mmIsDriverVerifyingByAddress(addresswithinsection: ConstPtr): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmIsDriverVerifyingByAddress(addresswithinsection.rawAddress).toUInt()

public actual fun mmIsIoSpaceActive(startaddress: Long, numberofbytes: ULong): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmIsIoSpaceActive(startaddress, numberofbytes.toLong()).toUInt()

public actual fun mmIsNonPagedSystemAddressValid(virtualaddress: ConstPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmIsNonPagedSystemAddressValid(virtualaddress.rawAddress)

public actual fun mmIsThisAnNtAsSystem(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmIsThisAnNtAsSystem()

public actual fun mmIsVerifierEnabled(verifierflags: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmIsVerifierEnabled(verifierflags.rawAddress)

public actual fun mmLockPagableDataSection(addresswithinsection: ConstPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmLockPagableDataSection(addresswithinsection.rawAddress))

public actual fun mmLockPagableSectionByHandle(imagesectionhandle: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmLockPagableSectionByHandle(imagesectionhandle.rawAddress)
}

public actual fun mmMapIoSpace(physicaladdress: Long, numberofbytes: ULong, cachetype: MemoryCachingType): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmMapIoSpace(physicaladdress, numberofbytes.toLong(), cachetype))

public actual fun mmMapIoSpaceEx(physicaladdress: Long, numberofbytes: ULong, protect: UInt): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmMapIoSpaceEx(physicaladdress, numberofbytes.toLong(), protect.toInt()))

public actual fun mmMapLockedPages(memorydescriptorlist: MutPtr, accessmode: Byte): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmMapLockedPages(memorydescriptorlist.rawAddress, accessmode))

public actual fun mmMapLockedPagesSpecifyCache(memorydescriptorlist: MutPtr, accessmode: Byte, cachetype: MemoryCachingType, requestedaddress: ConstPtr, bugcheckonfailure: UInt, priority: UInt): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmMapLockedPagesSpecifyCache(memorydescriptorlist.rawAddress, accessmode, cachetype, requestedaddress.rawAddress, bugcheckonfailure.toInt(), priority.toInt()))

public actual fun mmMapLockedPagesWithReservedMapping(mappingaddress: ConstPtr, pooltag: UInt, memorydescriptorlist: MutPtr, cachetype: MemoryCachingType): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmMapLockedPagesWithReservedMapping(mappingaddress.rawAddress, pooltag.toInt(), memorydescriptorlist.rawAddress, cachetype))

public actual fun mmMapMdl(memorydescriptorlist: MutPtr, protection: UInt, driverroutine: PmmMdlRoutine, drivercontext: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmMapMdl(memorydescriptorlist.rawAddress, protection.toInt(), 0L, drivercontext.rawAddress)

public actual fun mmMapMemoryDumpMdlEx(va: ConstPtr, pagetotal: UInt, memorydumpmdl: MutPtr, flags: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmMapMemoryDumpMdlEx(va.rawAddress, pagetotal.toInt(), memorydumpmdl.rawAddress, flags.toInt())

public actual fun mmMapUserAddressesToPage(baseaddress: ConstPtr, numberofbytes: ULong, pageaddress: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmMapUserAddressesToPage(baseaddress.rawAddress, numberofbytes.toLong(), pageaddress.rawAddress)

public actual fun mmMapVideoDisplay(physicaladdress: Long, numberofbytes: ULong, cachetype: MemoryCachingType): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmMapVideoDisplay(physicaladdress, numberofbytes.toLong(), cachetype))

public actual fun mmMapViewInSessionSpace(section: ConstPtr, mappedbase: MutPtr, viewsize: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmMapViewInSessionSpace(section.rawAddress, mappedbase.rawAddress, viewsize.rawAddress)

public actual fun mmMapViewInSessionSpaceEx(section: ConstPtr, mappedbase: MutPtr, viewsize: MutPtr, sectionoffset: MutPtr, flags: ULong): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmMapViewInSessionSpaceEx(section.rawAddress, mappedbase.rawAddress, viewsize.rawAddress, sectionoffset.rawAddress, flags.toLong())

public actual fun mmMapViewInSystemSpace(section: ConstPtr, mappedbase: MutPtr, viewsize: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmMapViewInSystemSpace(section.rawAddress, mappedbase.rawAddress, viewsize.rawAddress)

public actual fun mmMapViewInSystemSpaceEx(section: ConstPtr, mappedbase: MutPtr, viewsize: MutPtr, sectionoffset: MutPtr, flags: ULong): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmMapViewInSystemSpaceEx(section.rawAddress, mappedbase.rawAddress, viewsize.rawAddress, sectionoffset.rawAddress, flags.toLong())

public actual fun mmMdlPageContentsState(memorydescriptorlist: MutPtr, state: MmMdlPageContentsState): MmMdlPageContentsState =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmMdlPageContentsState(memorydescriptorlist.rawAddress, state)

public actual fun mmPageEntireDriver(addresswithinsection: ConstPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmPageEntireDriver(addresswithinsection.rawAddress))

public actual fun mmProbeAndLockPages(memorydescriptorlist: MutPtr, accessmode: Byte, operation: LockOperation) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmProbeAndLockPages(memorydescriptorlist.rawAddress, accessmode, operation)
}

public actual fun mmProbeAndLockProcessPages(memorydescriptorlist: MutPtr, process: Peprocess, accessmode: Byte, operation: LockOperation) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmProbeAndLockProcessPages(memorydescriptorlist.rawAddress, process, accessmode, operation)
}

public actual fun mmProbeAndLockSelectedPages(memorydescriptorlist: MutPtr, segmentarray: ConstPtr, accessmode: Byte, operation: LockOperation) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmProbeAndLockSelectedPages(memorydescriptorlist.rawAddress, segmentarray.rawAddress, accessmode, operation)
}

public actual fun mmProtectDriverSection(addresswithinsection: ConstPtr, size: ULong, flags: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmProtectDriverSection(addresswithinsection.rawAddress, size.toLong(), flags.toInt())

public actual fun mmProtectMdlSystemAddress(memorydescriptorlist: ConstPtr, newprotect: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmProtectMdlSystemAddress(memorydescriptorlist.rawAddress, newprotect.toInt())

public actual fun mmQuerySystemSize(): MmSystemsize =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmQuerySystemSize()

public actual fun mmRemovePhysicalMemory(startaddress: ConstPtr, numberofbytes: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmRemovePhysicalMemory(startaddress.rawAddress, numberofbytes.rawAddress)

public actual fun mmResetDriverPaging(addresswithinsection: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmResetDriverPaging(addresswithinsection.rawAddress)
}

public actual fun mmRotatePhysicalView(virtualaddress: ConstPtr, numberofbytes: MutPtr, newmdl: ConstPtr, direction: MmRotateDirection, copyfunction: PmmRotateCopyCallbackFunction, context: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmRotatePhysicalView(virtualaddress.rawAddress, numberofbytes.rawAddress, newmdl.rawAddress, direction, 0L, context.rawAddress)

public actual fun mmSecureVirtualMemory(address: ConstPtr, size: ULong, probemode: UInt): Handle =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmSecureVirtualMemory(address.rawAddress, size.toLong(), probemode.toInt()))

public actual fun mmSecureVirtualMemoryEx(address: ConstPtr, size: ULong, probemode: UInt, flags: UInt): Handle =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmSecureVirtualMemoryEx(address.rawAddress, size.toLong(), probemode.toInt(), flags.toInt()))

public actual fun mmSetPermanentCacheAttribute(startaddress: Long, numberofbytes: Long, cachetype: MemoryCachingType, flags: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmSetPermanentCacheAttribute(startaddress, numberofbytes, cachetype, flags.toInt())

public actual fun mmSizeOfMdl(base: ConstPtr, length: ULong): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmSizeOfMdl(base.rawAddress, length.toLong()).toULong()

public actual fun mmUnlockPagableImageSection(imagesectionhandle: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmUnlockPagableImageSection(imagesectionhandle.rawAddress)
}

public actual fun mmUnlockPages(memorydescriptorlist: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmUnlockPages(memorydescriptorlist.rawAddress)
}

public actual fun mmUnmapIoSpace(baseaddress: ConstPtr, numberofbytes: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmUnmapIoSpace(baseaddress.rawAddress, numberofbytes.toLong())
}

public actual fun mmUnmapLockedPages(baseaddress: ConstPtr, memorydescriptorlist: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmUnmapLockedPages(baseaddress.rawAddress, memorydescriptorlist.rawAddress)
}

public actual fun mmUnmapReservedMapping(baseaddress: ConstPtr, pooltag: UInt, memorydescriptorlist: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmUnmapReservedMapping(baseaddress.rawAddress, pooltag.toInt(), memorydescriptorlist.rawAddress)
}

public actual fun mmUnmapVideoDisplay(baseaddress: ConstPtr, numberofbytes: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmUnmapVideoDisplay(baseaddress.rawAddress, numberofbytes.toLong())
}

public actual fun mmUnmapViewInSessionSpace(mappedbase: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmUnmapViewInSessionSpace(mappedbase.rawAddress)

public actual fun mmUnmapViewInSystemSpace(mappedbase: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmUnmapViewInSystemSpace(mappedbase.rawAddress)

public actual fun mmUnsecureVirtualMemory(securehandle: Handle) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmUnsecureVirtualMemory(securehandle.rawAddress)
}

public actual fun ntAllocateLocallyUniqueId(luid: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtAllocateLocallyUniqueId(luid.rawAddress)

public actual fun ntCommitComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtCommitComplete(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun ntCommitEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtCommitEnlistment(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun ntCommitTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtCommitTransaction(transactionhandle.rawAddress, wait)

public actual fun ntCreateEnlistment(enlistmenthandle: MutPtr, desiredaccess: UInt, resourcemanagerhandle: Handle, transactionhandle: Handle, objectattributes: ConstPtr, createoptions: UInt, notificationmask: UInt, enlistmentkey: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtCreateEnlistment(enlistmenthandle.rawAddress, desiredaccess.toInt(), resourcemanagerhandle.rawAddress, transactionhandle.rawAddress, objectattributes.rawAddress, createoptions.toInt(), notificationmask.toInt(), enlistmentkey.rawAddress)

public actual fun ntCreateResourceManager(resourcemanagerhandle: MutPtr, desiredaccess: UInt, tmhandle: Handle, rmguid: ConstPtr, objectattributes: ConstPtr, createoptions: UInt, description: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtCreateResourceManager(resourcemanagerhandle.rawAddress, desiredaccess.toInt(), tmhandle.rawAddress, rmguid.rawAddress, objectattributes.rawAddress, createoptions.toInt(), description.rawAddress)

public actual fun ntCreateTransaction(transactionhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, uow: ConstPtr, tmhandle: Handle, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: ConstPtr, description: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtCreateTransaction(transactionhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, uow.rawAddress, tmhandle.rawAddress, createoptions.toInt(), isolationlevel.toInt(), isolationflags.toInt(), timeout.rawAddress, description.rawAddress)

public actual fun ntCreateTransactionManager(tmhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, logfilename: ConstPtr, createoptions: UInt, commitstrength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtCreateTransactionManager(tmhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, logfilename.rawAddress, createoptions.toInt(), commitstrength.toInt())

public actual fun ntDisplayString(string: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtDisplayString(string.rawAddress)

public actual fun ntEnumerateTransactionObject(rootobjecthandle: Handle, querytype: KtmobjectType, objectcursor: MutPtr, objectcursorlength: UInt, returnlength: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtEnumerateTransactionObject(rootobjecthandle.rawAddress, querytype, objectcursor.rawAddress, objectcursorlength.toInt(), returnlength.rawAddress)

public actual fun ntGetNotificationResourceManager(resourcemanagerhandle: Handle, transactionnotification: MutPtr, notificationlength: UInt, timeout: ConstPtr, returnlength: MutPtr, asynchronous: UInt, asynchronouscontext: ULong): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtGetNotificationResourceManager(resourcemanagerhandle.rawAddress, transactionnotification.rawAddress, notificationlength.toInt(), timeout.rawAddress, returnlength.rawAddress, asynchronous.toInt(), asynchronouscontext.toLong())

public actual fun ntLoadDriver(driverservicename: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtLoadDriver(driverservicename.rawAddress)

public actual fun ntMakeTemporaryObject(handle: Handle): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtMakeTemporaryObject(handle.rawAddress)

public actual fun ntManagePartition(targethandle: Handle, sourcehandle: Handle, partitioninformationclass: PartitionInformationClass, partitioninformation: MutPtr, partitioninformationlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtManagePartition(targethandle.rawAddress, sourcehandle.rawAddress, partitioninformationclass, partitioninformation.rawAddress, partitioninformationlength.toInt())

public actual fun ntOpenEnlistment(enlistmenthandle: MutPtr, desiredaccess: UInt, resourcemanagerhandle: Handle, enlistmentguid: ConstPtr, objectattributes: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtOpenEnlistment(enlistmenthandle.rawAddress, desiredaccess.toInt(), resourcemanagerhandle.rawAddress, enlistmentguid.rawAddress, objectattributes.rawAddress)

public actual fun ntOpenResourceManager(resourcemanagerhandle: MutPtr, desiredaccess: UInt, tmhandle: Handle, resourcemanagerguid: ConstPtr, objectattributes: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtOpenResourceManager(resourcemanagerhandle.rawAddress, desiredaccess.toInt(), tmhandle.rawAddress, resourcemanagerguid.rawAddress, objectattributes.rawAddress)

public actual fun ntOpenTransaction(transactionhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, uow: ConstPtr, tmhandle: Handle): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtOpenTransaction(transactionhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, uow.rawAddress, tmhandle.rawAddress)

public actual fun ntOpenTransactionManager(tmhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, logfilename: ConstPtr, tmidentity: ConstPtr, openoptions: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtOpenTransactionManager(tmhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, logfilename.rawAddress, tmidentity.rawAddress, openoptions.toInt())

public actual fun ntPowerInformation(informationlevel: PowerInformationLevel, inputbuffer: ConstPtr, inputbufferlength: UInt, outputbuffer: MutPtr, outputbufferlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtPowerInformation(informationlevel, inputbuffer.rawAddress, inputbufferlength.toInt(), outputbuffer.rawAddress, outputbufferlength.toInt())

public actual fun ntPrePrepareComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtPrePrepareComplete(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun ntPrePrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtPrePrepareEnlistment(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun ntPrepareComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtPrepareComplete(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun ntPrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtPrepareEnlistment(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun ntPropagationComplete(resourcemanagerhandle: Handle, requestcookie: UInt, bufferlength: UInt, buffer: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtPropagationComplete(resourcemanagerhandle.rawAddress, requestcookie.toInt(), bufferlength.toInt(), buffer.rawAddress)

public actual fun ntPropagationFailed(resourcemanagerhandle: Handle, requestcookie: UInt, propstatus: Ntstatus): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtPropagationFailed(resourcemanagerhandle.rawAddress, requestcookie.toInt(), propstatus)

public actual fun ntQueryInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: MutPtr, enlistmentinformationlength: UInt, returnlength: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtQueryInformationEnlistment(enlistmenthandle.rawAddress, enlistmentinformationclass, enlistmentinformation.rawAddress, enlistmentinformationlength.toInt(), returnlength.rawAddress)

public actual fun ntQueryInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: MutPtr, resourcemanagerinformationlength: UInt, returnlength: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtQueryInformationResourceManager(resourcemanagerhandle.rawAddress, resourcemanagerinformationclass, resourcemanagerinformation.rawAddress, resourcemanagerinformationlength.toInt(), returnlength.rawAddress)

public actual fun ntQueryInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: MutPtr, transactioninformationlength: UInt, returnlength: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtQueryInformationTransaction(transactionhandle.rawAddress, transactioninformationclass, transactioninformation.rawAddress, transactioninformationlength.toInt(), returnlength.rawAddress)

public actual fun ntQueryInformationTransactionManager(transactionmanagerhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: MutPtr, transactionmanagerinformationlength: UInt, returnlength: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtQueryInformationTransactionManager(transactionmanagerhandle.rawAddress, transactionmanagerinformationclass, transactionmanagerinformation.rawAddress, transactionmanagerinformationlength.toInt(), returnlength.rawAddress)

public actual fun ntReadOnlyEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtReadOnlyEnlistment(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun ntRecoverEnlistment(enlistmenthandle: Handle, enlistmentkey: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtRecoverEnlistment(enlistmenthandle.rawAddress, enlistmentkey.rawAddress)

public actual fun ntRecoverResourceManager(resourcemanagerhandle: Handle): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtRecoverResourceManager(resourcemanagerhandle.rawAddress)

public actual fun ntRecoverTransactionManager(transactionmanagerhandle: Handle): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtRecoverTransactionManager(transactionmanagerhandle.rawAddress)

public actual fun ntRegisterProtocolAddressInformation(resourcemanager: Handle, protocolid: ConstPtr, protocolinformationsize: UInt, protocolinformation: ConstPtr, createoptions: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtRegisterProtocolAddressInformation(resourcemanager.rawAddress, protocolid.rawAddress, protocolinformationsize.toInt(), protocolinformation.rawAddress, createoptions.toInt())

public actual fun ntRenameTransactionManager(logfilename: ConstPtr, existingtransactionmanagerguid: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtRenameTransactionManager(logfilename.rawAddress, existingtransactionmanagerguid.rawAddress)

public actual fun ntRollbackComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtRollbackComplete(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun ntRollbackEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtRollbackEnlistment(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun ntRollbackTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtRollbackTransaction(transactionhandle.rawAddress, wait)

public actual fun ntRollforwardTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtRollforwardTransactionManager(transactionmanagerhandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun ntSetInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: ConstPtr, enlistmentinformationlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtSetInformationEnlistment(enlistmenthandle.rawAddress, enlistmentinformationclass, enlistmentinformation.rawAddress, enlistmentinformationlength.toInt())

public actual fun ntSetInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: ConstPtr, resourcemanagerinformationlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtSetInformationResourceManager(resourcemanagerhandle.rawAddress, resourcemanagerinformationclass, resourcemanagerinformation.rawAddress, resourcemanagerinformationlength.toInt())

public actual fun ntSetInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: ConstPtr, transactioninformationlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtSetInformationTransaction(transactionhandle.rawAddress, transactioninformationclass, transactioninformation.rawAddress, transactioninformationlength.toInt())

public actual fun ntSetInformationTransactionManager(tmhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: ConstPtr, transactionmanagerinformationlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtSetInformationTransactionManager(tmhandle.rawAddress, transactionmanagerinformationclass, transactionmanagerinformation.rawAddress, transactionmanagerinformationlength.toInt())

public actual fun ntSinglePhaseReject(enlistmenthandle: Handle, tmvirtualclock: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtSinglePhaseReject(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun ntUnloadDriver(driverservicename: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtUnloadDriver(driverservicename.rawAddress)

public actual fun obCloseHandle(handle: Handle, previousmode: Byte): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesObCloseHandle(handle.rawAddress, previousmode)

public actual fun obDereferenceObjectDeferDelete(obj: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesObDereferenceObjectDeferDelete(obj.rawAddress)
}

public actual fun obDereferenceObjectDeferDeleteWithTag(obj: ConstPtr, tag: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesObDereferenceObjectDeferDeleteWithTag(obj.rawAddress, tag.toInt())
}

public actual fun obGetFilterVersion(): UShort =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesObGetFilterVersion().toUShort()

public actual fun obGetObjectSecurity(obj: ConstPtr, securitydescriptor: MutPtr, memoryallocated: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesObGetObjectSecurity(obj.rawAddress, securitydescriptor.rawAddress, memoryallocated.rawAddress)

public actual fun obReferenceObjectByHandle(handle: Handle, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, obj: MutPtr, handleinformation: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesObReferenceObjectByHandle(handle.rawAddress, desiredaccess.toInt(), objecttype, accessmode, obj.rawAddress, handleinformation.rawAddress)

public actual fun obReferenceObjectByHandleWithTag(handle: Handle, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, tag: UInt, obj: MutPtr, handleinformation: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesObReferenceObjectByHandleWithTag(handle.rawAddress, desiredaccess.toInt(), objecttype, accessmode, tag.toInt(), obj.rawAddress, handleinformation.rawAddress)

public actual fun obReferenceObjectByPointer(obj: ConstPtr, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesObReferenceObjectByPointer(obj.rawAddress, desiredaccess.toInt(), objecttype, accessmode)

public actual fun obReferenceObjectByPointerWithTag(obj: ConstPtr, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, tag: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesObReferenceObjectByPointerWithTag(obj.rawAddress, desiredaccess.toInt(), objecttype, accessmode, tag.toInt())

public actual fun obReferenceObjectSafe(obj: ConstPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesObReferenceObjectSafe(obj.rawAddress)

public actual fun obReferenceObjectSafeWithTag(obj: ConstPtr, tag: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesObReferenceObjectSafeWithTag(obj.rawAddress, tag.toInt())

public actual fun obRegisterCallbacks(callbackregistration: ConstPtr, registrationhandle: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesObRegisterCallbacks(callbackregistration.rawAddress, registrationhandle.rawAddress)

public actual fun obReleaseObjectSecurity(securitydescriptor: PsecurityDescriptor, memoryallocated: Boolean) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesObReleaseObjectSecurity(securitydescriptor.rawAddress, memoryallocated)
}

public actual fun obUnRegisterCallbacks(registrationhandle: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesObUnRegisterCallbacks(registrationhandle.rawAddress)
}

public actual fun obfDereferenceObject(obj: ConstPtr): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesObfDereferenceObject(obj.rawAddress)

public actual fun obfDereferenceObjectWithTag(obj: ConstPtr, tag: UInt): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesObfDereferenceObjectWithTag(obj.rawAddress, tag.toInt())

public actual fun obfReferenceObject(obj: ConstPtr): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesObfReferenceObject(obj.rawAddress)

public actual fun obfReferenceObjectWithTag(obj: ConstPtr, tag: UInt): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesObfReferenceObjectWithTag(obj.rawAddress, tag.toInt())

public actual fun pcwAddInstance(buffer: PpcwBuffer, name: ConstPtr, id: UInt, count: UInt, data: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPcwAddInstance(buffer, name.rawAddress, id.toInt(), count.toInt(), data.rawAddress)

public actual fun pcwCloseInstance(instance: PpcwInstance) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPcwCloseInstance(instance)
}

public actual fun pcwCreateInstance(instance: MutPtr, registration: PpcwRegistration, name: ConstPtr, count: UInt, data: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPcwCreateInstance(instance.rawAddress, registration, name.rawAddress, count.toInt(), data.rawAddress)

public actual fun pcwRegister(registration: MutPtr, info: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPcwRegister(registration.rawAddress, info.rawAddress)

public actual fun pcwUnregister(registration: PpcwRegistration) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPcwUnregister(registration)
}

public actual fun poCallDriver(deviceobject: ConstPtr, irp: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoCallDriver(deviceobject.rawAddress, irp.rawAddress)

public actual fun poClearPowerRequest(powerrequest: MutPtr, type: PowerRequestType): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoClearPowerRequest(powerrequest.rawAddress, type)

public actual fun poCreatePowerRequest(powerrequest: MutPtr, deviceobject: ConstPtr, context: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoCreatePowerRequest(powerrequest.rawAddress, deviceobject.rawAddress, context.rawAddress)

public actual fun poCreateThermalRequest(thermalrequest: MutPtr, targetdeviceobject: ConstPtr, policydeviceobject: ConstPtr, context: ConstPtr, flags: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoCreateThermalRequest(thermalrequest.rawAddress, targetdeviceobject.rawAddress, policydeviceobject.rawAddress, context.rawAddress, flags.toInt())

public actual fun poDeletePowerRequest(powerrequest: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoDeletePowerRequest(powerrequest.rawAddress)
}

public actual fun poDeleteThermalRequest(thermalrequest: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoDeleteThermalRequest(thermalrequest.rawAddress)
}

public actual fun poEndDeviceBusy(idlepointer: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoEndDeviceBusy(idlepointer.rawAddress)
}

public actual fun poFxActivateComponent(handle: Pohandle, component: UInt, flags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoFxActivateComponent(handle.rawAddress, component.toInt(), flags.toInt())
}

public actual fun poFxCompleteDevicePowerNotRequired(handle: Pohandle) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoFxCompleteDevicePowerNotRequired(handle.rawAddress)
}

public actual fun poFxCompleteDirectedPowerDown(handle: Pohandle) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoFxCompleteDirectedPowerDown(handle.rawAddress)
}

public actual fun poFxCompleteIdleCondition(handle: Pohandle, component: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoFxCompleteIdleCondition(handle.rawAddress, component.toInt())
}

public actual fun poFxCompleteIdleState(handle: Pohandle, component: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoFxCompleteIdleState(handle.rawAddress, component.toInt())
}

public actual fun poFxIdleComponent(handle: Pohandle, component: UInt, flags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoFxIdleComponent(handle.rawAddress, component.toInt(), flags.toInt())
}

public actual fun poFxIssueComponentPerfStateChange(handle: Pohandle, flags: UInt, component: UInt, perfchange: ConstPtr, context: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoFxIssueComponentPerfStateChange(handle.rawAddress, flags.toInt(), component.toInt(), perfchange.rawAddress, context.rawAddress)
}

public actual fun poFxIssueComponentPerfStateChangeMultiple(handle: Pohandle, flags: UInt, component: UInt, perfchangescount: UInt, perfchanges: ConstPtr, context: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoFxIssueComponentPerfStateChangeMultiple(handle.rawAddress, flags.toInt(), component.toInt(), perfchangescount.toInt(), perfchanges.rawAddress, context.rawAddress)
}

public actual fun poFxNotifySurprisePowerOn(pdo: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoFxNotifySurprisePowerOn(pdo.rawAddress)
}

public actual fun poFxPowerControl(handle: Pohandle, powercontrolcode: ConstPtr, inbuffer: ConstPtr, inbuffersize: ULong, outbuffer: MutPtr, outbuffersize: ULong, bytesreturned: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoFxPowerControl(handle.rawAddress, powercontrolcode.rawAddress, inbuffer.rawAddress, inbuffersize.toLong(), outbuffer.rawAddress, outbuffersize.toLong(), bytesreturned.rawAddress)

public actual fun poFxPowerOnCrashdumpDevice(handle: Pohandle, context: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoFxPowerOnCrashdumpDevice(handle.rawAddress, context.rawAddress)

public actual fun poFxQueryCurrentComponentPerfState(handle: Pohandle, flags: UInt, component: UInt, setindex: UInt, currentperf: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoFxQueryCurrentComponentPerfState(handle.rawAddress, flags.toInt(), component.toInt(), setindex.toInt(), currentperf.rawAddress)

public actual fun poFxRegisterComponentPerfStates(handle: Pohandle, component: UInt, flags: ULong, componentperfstatecallback: PpoFxComponentPerfStateCallback, inputstateinfo: ConstPtr, outputstateinfo: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoFxRegisterComponentPerfStates(handle.rawAddress, component.toInt(), flags.toLong(), 0L, inputstateinfo.rawAddress, outputstateinfo.rawAddress)

public actual fun poFxRegisterCrashdumpDevice(handle: Pohandle): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoFxRegisterCrashdumpDevice(handle.rawAddress)

public actual fun poFxRegisterDevice(pdo: ConstPtr, device: ConstPtr, handle: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoFxRegisterDevice(pdo.rawAddress, device.rawAddress, handle.rawAddress)

public actual fun poFxRegisterDripsWatchdogCallback(handle: Pohandle, callback: PpoFxDripsWatchdogCallback, includechilddevices: Boolean, matchingdriverobject: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoFxRegisterDripsWatchdogCallback(handle.rawAddress, 0L, includechilddevices, matchingdriverobject.rawAddress)
}

public actual fun poFxReportDevicePoweredOn(handle: Pohandle) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoFxReportDevicePoweredOn(handle.rawAddress)
}

public actual fun poFxSetComponentLatency(handle: Pohandle, component: UInt, latency: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoFxSetComponentLatency(handle.rawAddress, component.toInt(), latency.toLong())
}

public actual fun poFxSetComponentResidency(handle: Pohandle, component: UInt, residency: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoFxSetComponentResidency(handle.rawAddress, component.toInt(), residency.toLong())
}

public actual fun poFxSetComponentWake(handle: Pohandle, component: UInt, wakehint: Boolean) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoFxSetComponentWake(handle.rawAddress, component.toInt(), wakehint)
}

public actual fun poFxSetDeviceIdleTimeout(handle: Pohandle, idletimeout: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoFxSetDeviceIdleTimeout(handle.rawAddress, idletimeout.toLong())
}

public actual fun poFxSetTargetDripsDevicePowerState(handle: Pohandle, targetstate: DevicePowerState): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoFxSetTargetDripsDevicePowerState(handle.rawAddress, targetstate)

public actual fun poFxStartDevicePowerManagement(handle: Pohandle) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoFxStartDevicePowerManagement(handle.rawAddress)
}

public actual fun poFxUnregisterDevice(handle: Pohandle) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoFxUnregisterDevice(handle.rawAddress)
}

public actual fun poGetSystemWake(irp: ConstPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoGetSystemWake(irp.rawAddress)

public actual fun poGetThermalRequestSupport(thermalrequest: ConstPtr, type: PoThermalRequestType): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoGetThermalRequestSupport(thermalrequest.rawAddress, type)

public actual fun poQueryWatchdogTime(pdo: ConstPtr, secondsremaining: MutPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoQueryWatchdogTime(pdo.rawAddress, secondsremaining.rawAddress)

public actual fun poRegisterDeviceForIdleDetection(deviceobject: ConstPtr, conservationidletime: UInt, performanceidletime: UInt, state: DevicePowerState): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoRegisterDeviceForIdleDetection(deviceobject.rawAddress, conservationidletime.toInt(), performanceidletime.toInt(), state))

public actual fun poRegisterPowerSettingCallback(deviceobject: ConstPtr, settingguid: ConstPtr, callback: PpowerSettingCallback, context: ConstPtr, handle: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoRegisterPowerSettingCallback(deviceobject.rawAddress, settingguid.rawAddress, 0L, context.rawAddress, handle.rawAddress)

public actual fun poRegisterSystemState(statehandle: MutPtr, flags: UInt): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoRegisterSystemState(statehandle.rawAddress, flags.toInt()))

public actual fun poRequestPowerIrp(deviceobject: ConstPtr, minorfunction: UByte, powerstate: PowerState, completionfunction: PrequestPowerComplete, context: ConstPtr, irp: MutPtr): Ntstatus =
    0

public actual fun poSetDeviceBusyEx(idlepointer: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoSetDeviceBusyEx(idlepointer.rawAddress)
}

public actual fun poSetHiberRange(memorymap: ConstPtr, flags: UInt, address: ConstPtr, length: ULong, tag: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoSetHiberRange(memorymap.rawAddress, flags.toInt(), address.rawAddress, length.toLong(), tag.toInt())
}

public actual fun poSetPowerRequest(powerrequest: MutPtr, type: PowerRequestType): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoSetPowerRequest(powerrequest.rawAddress, type)

public actual fun poSetPowerState(deviceobject: ConstPtr, type: PowerStateType, state: PowerState): PowerState =
    PowerState()

public actual fun poSetSystemState(flags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoSetSystemState(flags.toInt())
}

public actual fun poSetSystemWake(irp: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoSetSystemWake(irp.rawAddress)
}

public actual fun poSetSystemWakeDevice(deviceobject: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoSetSystemWakeDevice(deviceobject.rawAddress)
}

public actual fun poSetThermalActiveCooling(thermalrequest: MutPtr, engaged: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoSetThermalActiveCooling(thermalrequest.rawAddress, engaged)

public actual fun poSetThermalPassiveCooling(thermalrequest: MutPtr, throttle: UByte): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoSetThermalPassiveCooling(thermalrequest.rawAddress, throttle.toByte())

public actual fun poStartDeviceBusy(idlepointer: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoStartDeviceBusy(idlepointer.rawAddress)
}

public actual fun poStartNextPowerIrp(irp: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoStartNextPowerIrp(irp.rawAddress)
}

public actual fun poUnregisterPowerSettingCallback(handle: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoUnregisterPowerSettingCallback(handle.rawAddress)

public actual fun poUnregisterSystemState(statehandle: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoUnregisterSystemState(statehandle.rawAddress)
}

public actual fun probeForRead(address: ConstPtr, length: ULong, alignment: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesProbeForRead(address.rawAddress, length.toLong(), alignment.toInt())
}

public actual fun probeForWrite(address: MutPtr, length: ULong, alignment: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesProbeForWrite(address.rawAddress, length.toLong(), alignment.toInt())
}

public actual fun psAcquireSiloHardReference(silo: Pesilo): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsAcquireSiloHardReference(silo)

public actual fun psAllocSiloContextSlot(reserved: ULong, returnedcontextslot: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsAllocSiloContextSlot(reserved.toLong(), returnedcontextslot.rawAddress)

public actual fun psAllocateAffinityToken(affinitytoken: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsAllocateAffinityToken(affinitytoken.rawAddress)

public actual fun psAttachSiloToCurrentThread(silo: Pesilo): Pesilo =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsAttachSiloToCurrentThread(silo)

public actual fun psCreateSiloContext(silo: Pesilo, size: UInt, pooltype: PoolType, contextcleanupcallback: SiloContextCleanupCallback, returnedsilocontext: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsCreateSiloContext(silo, size.toInt(), pooltype, 0L, returnedsilocontext.rawAddress)

public actual fun psCreateSystemThread(threadhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, processhandle: Handle, clientid: MutPtr, startroutine: PkstartRoutine, startcontext: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsCreateSystemThread(threadhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, processhandle.rawAddress, clientid.rawAddress, 0L, startcontext.rawAddress)

public actual fun psDereferenceSiloContext(silocontext: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsDereferenceSiloContext(silocontext.rawAddress)
}

public actual fun psDetachSiloFromCurrentThread(previoussilo: Pesilo) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsDetachSiloFromCurrentThread(previoussilo)
}

public actual fun psFreeAffinityToken(affinitytoken: PaffinityToken) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsFreeAffinityToken(affinitytoken)
}

public actual fun psFreeSiloContextSlot(contextslot: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsFreeSiloContextSlot(contextslot.toInt())

public actual fun psGetCurrentProcessId(): Handle =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsGetCurrentProcessId())

public actual fun psGetCurrentServerSilo(): Pesilo =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsGetCurrentServerSilo()

public actual fun psGetCurrentServerSiloName(): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsGetCurrentServerSiloName())

public actual fun psGetCurrentSilo(): Pesilo =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsGetCurrentSilo()

public actual fun psGetCurrentThreadId(): Handle =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsGetCurrentThreadId())

public actual fun psGetCurrentThreadTeb(): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsGetCurrentThreadTeb())

public actual fun psGetEffectiveServerSilo(silo: Pesilo): Pesilo =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsGetEffectiveServerSilo(silo)

public actual fun psGetHostSilo(): Pesilo =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsGetHostSilo()

public actual fun psGetJobServerSilo(job: Pejob, serversilo: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsGetJobServerSilo(job, serversilo.rawAddress)

public actual fun psGetJobSilo(job: Pejob, silo: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsGetJobSilo(job, silo.rawAddress)

public actual fun psGetParentSilo(job: Pejob): Pesilo =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsGetParentSilo(job)

public actual fun psGetPermanentSiloContext(silo: Pesilo, contextslot: UInt, returnedsilocontext: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsGetPermanentSiloContext(silo, contextslot.toInt(), returnedsilocontext.rawAddress)

public actual fun psGetProcessCreateTimeQuadPart(process: Peprocess): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsGetProcessCreateTimeQuadPart(process)

public actual fun psGetProcessExitStatus(process: Peprocess): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsGetProcessExitStatus(process)

public actual fun psGetProcessId(process: Peprocess): Handle =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsGetProcessId(process))

public actual fun psGetProcessStartKey(process: Peprocess): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsGetProcessStartKey(process).toULong()

public actual fun psGetServerSiloServiceSessionId(silo: Pesilo): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsGetServerSiloServiceSessionId(silo).toUInt()

public actual fun psGetSiloContainerId(silo: Pesilo): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsGetSiloContainerId(silo))

public actual fun psGetSiloContext(silo: Pesilo, contextslot: UInt, returnedsilocontext: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsGetSiloContext(silo, contextslot.toInt(), returnedsilocontext.rawAddress)

public actual fun psGetSiloMonitorContextSlot(monitor: PsiloMonitor): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsGetSiloMonitorContextSlot(monitor).toUInt()

public actual fun psGetThreadCreateTime(thread: Pethread): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsGetThreadCreateTime(thread)

public actual fun psGetThreadExitStatus(thread: Pethread): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsGetThreadExitStatus(thread)

public actual fun psGetThreadId(thread: Pethread): Handle =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsGetThreadId(thread))

public actual fun psGetThreadProcessId(thread: Pethread): Handle =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsGetThreadProcessId(thread))

public actual fun psGetThreadProperty(thread: Pethread, key: ULong, flags: UInt): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsGetThreadProperty(thread, key.toLong(), flags.toInt()))

public actual fun psGetThreadServerSilo(thread: Pethread): Pesilo =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsGetThreadServerSilo(thread)

public actual fun psGetVersion(majorversion: MutPtr, minorversion: MutPtr, buildnumber: MutPtr, csdversion: MutPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsGetVersion(majorversion.rawAddress, minorversion.rawAddress, buildnumber.rawAddress, csdversion.rawAddress)

public actual fun psInsertPermanentSiloContext(silo: Pesilo, contextslot: UInt, silocontext: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsInsertPermanentSiloContext(silo, contextslot.toInt(), silocontext.rawAddress)

public actual fun psInsertSiloContext(silo: Pesilo, contextslot: UInt, silocontext: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsInsertSiloContext(silo, contextslot.toInt(), silocontext.rawAddress)

public actual fun psIsCurrentThreadInServerSilo(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsIsCurrentThreadInServerSilo()

public actual fun psIsCurrentThreadPrefetching(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsIsCurrentThreadPrefetching()

public actual fun psIsHostSilo(silo: Pesilo): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsIsHostSilo(silo)

public actual fun psMakeSiloContextPermanent(silo: Pesilo, contextslot: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsMakeSiloContextPermanent(silo, contextslot.toInt())

public actual fun psQueryTotalCycleTimeProcess(process: Peprocess, cycletimestamp: MutPtr): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsQueryTotalCycleTimeProcess(process, cycletimestamp.rawAddress).toULong()

public actual fun psReferenceSiloContext(silocontext: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsReferenceSiloContext(silocontext.rawAddress)
}

public actual fun psRegisterSiloMonitor(registration: ConstPtr, returnedmonitor: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsRegisterSiloMonitor(registration.rawAddress, returnedmonitor.rawAddress)

public actual fun psReleaseSiloHardReference(silo: Pesilo) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsReleaseSiloHardReference(silo)
}

public actual fun psRemoveCreateThreadNotifyRoutine(notifyroutine: PcreateThreadNotifyRoutine): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsRemoveCreateThreadNotifyRoutine(0L)

public actual fun psRemoveLoadImageNotifyRoutine(notifyroutine: PloadImageNotifyRoutine): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsRemoveLoadImageNotifyRoutine(0L)

public actual fun psRemoveSiloContext(silo: Pesilo, contextslot: UInt, removedsilocontext: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsRemoveSiloContext(silo, contextslot.toInt(), removedsilocontext.rawAddress)

public actual fun psReplaceSiloContext(silo: Pesilo, contextslot: UInt, newsilocontext: ConstPtr, oldsilocontext: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsReplaceSiloContext(silo, contextslot.toInt(), newsilocontext.rawAddress, oldsilocontext.rawAddress)

public actual fun psRevertToUserMultipleGroupAffinityThread(affinitytoken: PaffinityToken) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsRevertToUserMultipleGroupAffinityThread(affinitytoken)
}

public actual fun psSetCreateProcessNotifyRoutine(notifyroutine: PcreateProcessNotifyRoutine, remove: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsSetCreateProcessNotifyRoutine(0L, remove)

public actual fun psSetCreateProcessNotifyRoutineEx(notifyroutine: PcreateProcessNotifyRoutineEx, remove: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsSetCreateProcessNotifyRoutineEx(0L, remove)

public actual fun psSetCreateProcessNotifyRoutineEx2(notifytype: Pscreateprocessnotifytype, notifyinformation: ConstPtr, remove: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsSetCreateProcessNotifyRoutineEx2(notifytype, notifyinformation.rawAddress, remove)

public actual fun psSetCreateThreadNotifyRoutine(notifyroutine: PcreateThreadNotifyRoutine): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsSetCreateThreadNotifyRoutine(0L)

public actual fun psSetCreateThreadNotifyRoutineEx(notifytype: Pscreatethreadnotifytype, notifyinformation: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsSetCreateThreadNotifyRoutineEx(notifytype, notifyinformation.rawAddress)

public actual fun psSetCurrentThreadPrefetching(prefetching: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsSetCurrentThreadPrefetching(prefetching)

public actual fun psSetLoadImageNotifyRoutine(notifyroutine: PloadImageNotifyRoutine): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsSetLoadImageNotifyRoutine(0L)

public actual fun psSetLoadImageNotifyRoutineEx(notifyroutine: PloadImageNotifyRoutine, flags: ULong): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsSetLoadImageNotifyRoutineEx(0L, flags.toLong())

public actual fun psSetSystemMultipleGroupAffinityThread(groupaffinities: ConstPtr, groupcount: UShort, affinitytoken: PaffinityToken): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsSetSystemMultipleGroupAffinityThread(groupaffinities.rawAddress, groupcount.toShort(), affinitytoken)

public actual fun psStartSiloMonitor(monitor: PsiloMonitor): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsStartSiloMonitor(monitor)

public actual fun psTerminateServerSilo(serversilo: Pesilo, exitstatus: Ntstatus) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsTerminateServerSilo(serversilo, exitstatus)
}

public actual fun psTerminateSystemThread(exitstatus: Ntstatus): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsTerminateSystemThread(exitstatus)

public actual fun psUnregisterSiloMonitor(monitor: PsiloMonitor) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsUnregisterSiloMonitor(monitor)
}

public actual fun psWrapApcWow64Thread(apccontext: MutPtr, apcroutine: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsWrapApcWow64Thread(apccontext.rawAddress, apcroutine.rawAddress)

public actual fun pshedAllocateMemory(size: UInt): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPshedAllocateMemory(size.toInt()))

public actual fun pshedFreeMemory(address: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPshedFreeMemory(address.rawAddress)
}

public actual fun pshedIsSystemWheaEnabled(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPshedIsSystemWheaEnabled()

public actual fun pshedRegisterPlugin(packet: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPshedRegisterPlugin(packet.rawAddress)

public actual fun pshedSynchronizeExecution(errorsource: ConstPtr, synchronizeroutine: PksynchronizeRoutine, synchronizecontext: ConstPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPshedSynchronizeExecution(errorsource.rawAddress, 0L, synchronizecontext.rawAddress)

public actual fun pshedUnregisterPlugin(pluginhandle: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPshedUnregisterPlugin(pluginhandle.rawAddress)
}

public actual fun rtlAppendUnicodeStringToString(destination: MutPtr, source: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlAppendUnicodeStringToString(destination.rawAddress, source.rawAddress)

public actual fun rtlAppendUnicodeToString(destination: MutPtr, source: Pcwstr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlAppendUnicodeToString(destination.rawAddress, source.rawAddress)

public actual fun rtlAreBitsClear(bitmapheader: ConstPtr, startingindex: UInt, length: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlAreBitsClear(bitmapheader.rawAddress, startingindex.toInt(), length.toInt())

public actual fun rtlAreBitsSet(bitmapheader: ConstPtr, startingindex: UInt, length: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlAreBitsSet(bitmapheader.rawAddress, startingindex.toInt(), length.toInt())

public actual fun rtlAssert(voidfailedassertion: ConstPtr, voidfilename: ConstPtr, linenumber: UInt, mutablemessage: Pcstr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlAssert(voidfailedassertion.rawAddress, voidfilename.rawAddress, linenumber.toInt(), mutablemessage.rawAddress)
}

public actual fun rtlCheckRegistryKey(relativeto: UInt, path: Pcwstr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlCheckRegistryKey(relativeto.toInt(), path.rawAddress)

public actual fun rtlClearAllBits(bitmapheader: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlClearAllBits(bitmapheader.rawAddress)
}

public actual fun rtlClearBit(bitmapheader: ConstPtr, bitnumber: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlClearBit(bitmapheader.rawAddress, bitnumber.toInt())
}

public actual fun rtlClearBits(bitmapheader: ConstPtr, startingindex: UInt, numbertoclear: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlClearBits(bitmapheader.rawAddress, startingindex.toInt(), numbertoclear.toInt())
}

public actual fun rtlCmDecodeMemIoResource(descriptor: ConstPtr, start: MutPtr): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlCmDecodeMemIoResource(descriptor.rawAddress, start.rawAddress).toULong()

public actual fun rtlCmEncodeMemIoResource(descriptor: ConstPtr, type: UByte, length: ULong, start: ULong): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlCmEncodeMemIoResource(descriptor.rawAddress, type.toByte(), length.toLong(), start.toLong())

public actual fun rtlCompareString(string1: ConstPtr, string2: ConstPtr, caseinsensitive: Boolean): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlCompareString(string1.rawAddress, string2.rawAddress, caseinsensitive)

public actual fun rtlCompareUnicodeString(string1: ConstPtr, string2: ConstPtr, caseinsensitive: Boolean): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlCompareUnicodeString(string1.rawAddress, string2.rawAddress, caseinsensitive)

public actual fun rtlCompareUnicodeStrings(string1: ConstPtr, string1length: ULong, string2: ConstPtr, string2length: ULong, caseinsensitive: Boolean): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlCompareUnicodeStrings(string1.rawAddress, string1length.toLong(), string2.rawAddress, string2length.toLong(), caseinsensitive)

public actual fun rtlContractHashTable(hashtable: ConstPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlContractHashTable(hashtable.rawAddress)

public actual fun rtlCopyBitMap(source: ConstPtr, destination: ConstPtr, targetbit: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlCopyBitMap(source.rawAddress, destination.rawAddress, targetbit.toInt())
}

public actual fun rtlCopyString(destinationstring: MutPtr, sourcestring: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlCopyString(destinationstring.rawAddress, sourcestring.rawAddress)
}

public actual fun rtlCopyUnicodeString(destinationstring: MutPtr, sourcestring: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlCopyUnicodeString(destinationstring.rawAddress, sourcestring.rawAddress)
}

public actual fun rtlCreateHashTable(hashtable: MutPtr, shift: UInt, flags: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlCreateHashTable(hashtable.rawAddress, shift.toInt(), flags.toInt())

public actual fun rtlCreateHashTableEx(hashtable: MutPtr, initialsize: UInt, shift: UInt, flags: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlCreateHashTableEx(hashtable.rawAddress, initialsize.toInt(), shift.toInt(), flags.toInt())

public actual fun rtlCreateRegistryKey(relativeto: UInt, path: Pcwstr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlCreateRegistryKey(relativeto.toInt(), path.rawAddress)

public actual fun rtlCreateSecurityDescriptor(securitydescriptor: PsecurityDescriptor, revision: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlCreateSecurityDescriptor(securitydescriptor.rawAddress, revision.toInt())

public actual fun rtlDelete(links: ConstPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlDelete(links.rawAddress))

public actual fun rtlDeleteElementGenericTable(table: ConstPtr, buffer: ConstPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlDeleteElementGenericTable(table.rawAddress, buffer.rawAddress)

public actual fun rtlDeleteElementGenericTableAvl(table: ConstPtr, buffer: ConstPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlDeleteElementGenericTableAvl(table.rawAddress, buffer.rawAddress)

public actual fun rtlDeleteElementGenericTableAvlEx(table: ConstPtr, nodeorparent: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlDeleteElementGenericTableAvlEx(table.rawAddress, nodeorparent.rawAddress)
}

public actual fun rtlDeleteHashTable(hashtable: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlDeleteHashTable(hashtable.rawAddress)
}

public actual fun rtlDeleteNoSplay(links: ConstPtr, root: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlDeleteNoSplay(links.rawAddress, root.rawAddress)
}

public actual fun rtlDeleteRegistryValue(relativeto: UInt, path: Pcwstr, valuename: Pcwstr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlDeleteRegistryValue(relativeto.toInt(), path.rawAddress, valuename.rawAddress)

public actual fun rtlDowncaseUnicodeChar(sourcecharacter: UShort): UShort =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlDowncaseUnicodeChar(sourcecharacter.toShort()).toUShort()

public actual fun rtlEndEnumerationHashTable(hashtable: ConstPtr, enumerator: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlEndEnumerationHashTable(hashtable.rawAddress, enumerator.rawAddress)
}

public actual fun rtlEndStrongEnumerationHashTable(hashtable: ConstPtr, enumerator: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlEndStrongEnumerationHashTable(hashtable.rawAddress, enumerator.rawAddress)
}

public actual fun rtlEndWeakEnumerationHashTable(hashtable: ConstPtr, enumerator: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlEndWeakEnumerationHashTable(hashtable.rawAddress, enumerator.rawAddress)
}

public actual fun rtlEnumerateEntryHashTable(hashtable: ConstPtr, enumerator: MutPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlEnumerateEntryHashTable(hashtable.rawAddress, enumerator.rawAddress))

public actual fun rtlEnumerateGenericTable(table: ConstPtr, restart: Boolean): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTable(table.rawAddress, restart))

public actual fun rtlEnumerateGenericTableAvl(table: ConstPtr, restart: Boolean): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTableAvl(table.rawAddress, restart))

public actual fun rtlEnumerateGenericTableLikeADirectory(table: ConstPtr, matchfunction: PrtlAvlMatchFunction, matchdata: ConstPtr, nextflag: UInt, restartkey: MutPtr, deletecount: MutPtr, buffer: ConstPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTableLikeADirectory(table.rawAddress, 0L, matchdata.rawAddress, nextflag.toInt(), restartkey.rawAddress, deletecount.rawAddress, buffer.rawAddress))

public actual fun rtlEnumerateGenericTableWithoutSplaying(table: ConstPtr, restartkey: MutPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTableWithoutSplaying(table.rawAddress, restartkey.rawAddress))

public actual fun rtlEnumerateGenericTableWithoutSplayingAvl(table: ConstPtr, restartkey: MutPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTableWithoutSplayingAvl(table.rawAddress, restartkey.rawAddress))

public actual fun rtlEqualString(string1: ConstPtr, string2: ConstPtr, caseinsensitive: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlEqualString(string1.rawAddress, string2.rawAddress, caseinsensitive)

public actual fun rtlEqualUnicodeString(string1: ConstPtr, string2: ConstPtr, caseinsensitive: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlEqualUnicodeString(string1.rawAddress, string2.rawAddress, caseinsensitive)

public actual fun rtlExpandHashTable(hashtable: ConstPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlExpandHashTable(hashtable.rawAddress)

public actual fun rtlExtractBitMap(source: ConstPtr, destination: ConstPtr, targetbit: UInt, numberofbits: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlExtractBitMap(source.rawAddress, destination.rawAddress, targetbit.toInt(), numberofbits.toInt())
}

public actual fun rtlFindClearBits(bitmapheader: ConstPtr, numbertofind: UInt, hintindex: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlFindClearBits(bitmapheader.rawAddress, numbertofind.toInt(), hintindex.toInt()).toUInt()

public actual fun rtlFindClearBitsAndSet(bitmapheader: ConstPtr, numbertofind: UInt, hintindex: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlFindClearBitsAndSet(bitmapheader.rawAddress, numbertofind.toInt(), hintindex.toInt()).toUInt()

public actual fun rtlFindClearRuns(bitmapheader: ConstPtr, runarray: MutPtr, sizeofrunarray: UInt, locatelongestruns: Boolean): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlFindClearRuns(bitmapheader.rawAddress, runarray.rawAddress, sizeofrunarray.toInt(), locatelongestruns).toUInt()

public actual fun rtlFindClosestEncodableLength(sourcelength: ULong, targetlength: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlFindClosestEncodableLength(sourcelength.toLong(), targetlength.rawAddress)

public actual fun rtlFindFirstRunClear(bitmapheader: ConstPtr, startingindex: MutPtr): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlFindFirstRunClear(bitmapheader.rawAddress, startingindex.rawAddress).toUInt()

public actual fun rtlFindLastBackwardRunClear(bitmapheader: ConstPtr, fromindex: UInt, startingrunindex: MutPtr): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlFindLastBackwardRunClear(bitmapheader.rawAddress, fromindex.toInt(), startingrunindex.rawAddress).toUInt()

public actual fun rtlFindLeastSignificantBit(set: ULong): Byte =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlFindLeastSignificantBit(set.toLong())

public actual fun rtlFindLongestRunClear(bitmapheader: ConstPtr, startingindex: MutPtr): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlFindLongestRunClear(bitmapheader.rawAddress, startingindex.rawAddress).toUInt()

public actual fun rtlFindMostSignificantBit(set: ULong): Byte =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlFindMostSignificantBit(set.toLong())

public actual fun rtlFindNextForwardRunClear(bitmapheader: ConstPtr, fromindex: UInt, startingrunindex: MutPtr): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlFindNextForwardRunClear(bitmapheader.rawAddress, fromindex.toInt(), startingrunindex.rawAddress).toUInt()

public actual fun rtlFindSetBits(bitmapheader: ConstPtr, numbertofind: UInt, hintindex: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlFindSetBits(bitmapheader.rawAddress, numbertofind.toInt(), hintindex.toInt()).toUInt()

public actual fun rtlFindSetBitsAndClear(bitmapheader: ConstPtr, numbertofind: UInt, hintindex: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlFindSetBitsAndClear(bitmapheader.rawAddress, numbertofind.toInt(), hintindex.toInt()).toUInt()

public actual fun rtlFreeUTF8String(utf8string: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlFreeUTF8String(utf8string.rawAddress)
}

public actual fun rtlGUIDFromString(guidstring: ConstPtr, guid: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlGUIDFromString(guidstring.rawAddress, guid.rawAddress)

public actual fun rtlGenerateClass5Guid(namespaceguid: ConstPtr, buffer: ConstPtr, buffersize: UInt, guid: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlGenerateClass5Guid(namespaceguid.rawAddress, buffer.rawAddress, buffersize.toInt(), guid.rawAddress)

public actual fun rtlGetActiveConsoleId(): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlGetActiveConsoleId().toUInt()

public actual fun rtlGetCallersAddress(callersaddress: MutPtr, callerscaller: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlGetCallersAddress(callersaddress.rawAddress, callerscaller.rawAddress)
}

public actual fun rtlGetConsoleSessionForegroundProcessId(): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlGetConsoleSessionForegroundProcessId().toULong()

public actual fun rtlGetElementGenericTable(table: ConstPtr, i: UInt): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlGetElementGenericTable(table.rawAddress, i.toInt()))

public actual fun rtlGetElementGenericTableAvl(table: ConstPtr, i: UInt): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlGetElementGenericTableAvl(table.rawAddress, i.toInt()))

public actual fun rtlGetEnabledExtendedFeatures(featuremask: ULong): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlGetEnabledExtendedFeatures(featuremask.toLong()).toULong()

public actual fun rtlGetNextEntryHashTable(hashtable: ConstPtr, context: ConstPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlGetNextEntryHashTable(hashtable.rawAddress, context.rawAddress))

public actual fun rtlGetNtProductType(ntproducttype: MutPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlGetNtProductType(ntproducttype.rawAddress)

public actual fun rtlGetNtSystemRoot(): Pcwstr =
    ConstPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlGetNtSystemRoot())

public actual fun rtlGetPersistedStateLocation(sourceid: Pcwstr, customvalue: Pcwstr, defaultpath: Pcwstr, statelocationtype: StateLocationType, targetpath: Pwstr, bufferlengthin: UInt, bufferlengthout: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlGetPersistedStateLocation(sourceid.rawAddress, customvalue.rawAddress, defaultpath.rawAddress, statelocationtype, targetpath.rawAddress, bufferlengthin.toInt(), bufferlengthout.rawAddress)

public actual fun rtlGetSuiteMask(): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlGetSuiteMask().toUInt()

public actual fun rtlGetVersion(lpversioninformation: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlGetVersion(lpversioninformation.rawAddress)

public actual fun rtlHashUnicodeString(string: ConstPtr, caseinsensitive: Boolean, hashalgorithm: UInt, hashvalue: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlHashUnicodeString(string.rawAddress, caseinsensitive, hashalgorithm.toInt(), hashvalue.rawAddress)

public actual fun rtlInitEnumerationHashTable(hashtable: ConstPtr, enumerator: MutPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlInitEnumerationHashTable(hashtable.rawAddress, enumerator.rawAddress)

public actual fun rtlInitStrongEnumerationHashTable(hashtable: ConstPtr, enumerator: MutPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlInitStrongEnumerationHashTable(hashtable.rawAddress, enumerator.rawAddress)

public actual fun rtlInitUTF8String(destinationstring: MutPtr, sourcestring: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlInitUTF8String(destinationstring.rawAddress, sourcestring.rawAddress)
}

public actual fun rtlInitUTF8StringEx(destinationstring: MutPtr, sourcestring: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlInitUTF8StringEx(destinationstring.rawAddress, sourcestring.rawAddress)

public actual fun rtlInitWeakEnumerationHashTable(hashtable: ConstPtr, enumerator: MutPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlInitWeakEnumerationHashTable(hashtable.rawAddress, enumerator.rawAddress)

public actual fun rtlInitializeBitMap(bitmapheader: MutPtr, bitmapbuffer: ConstPtr, sizeofbitmap: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlInitializeBitMap(bitmapheader.rawAddress, bitmapbuffer.rawAddress, sizeofbitmap.toInt())
}

public actual fun rtlInitializeGenericTable(table: MutPtr, compareroutine: PrtlGenericCompareRoutine, allocateroutine: PrtlGenericAllocateRoutine, freeroutine: PrtlGenericFreeRoutine, tablecontext: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlInitializeGenericTable(table.rawAddress, 0L, 0L, 0L, tablecontext.rawAddress)
}

public actual fun rtlInitializeGenericTableAvl(table: MutPtr, compareroutine: PrtlAvlCompareRoutine, allocateroutine: PrtlAvlAllocateRoutine, freeroutine: PrtlAvlFreeRoutine, tablecontext: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlInitializeGenericTableAvl(table.rawAddress, 0L, 0L, 0L, tablecontext.rawAddress)
}

public actual fun rtlInsertElementGenericTable(table: ConstPtr, buffer: ConstPtr, buffersize: UInt, newelement: MutPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlInsertElementGenericTable(table.rawAddress, buffer.rawAddress, buffersize.toInt(), newelement.rawAddress))

public actual fun rtlInsertElementGenericTableAvl(table: ConstPtr, buffer: ConstPtr, buffersize: UInt, newelement: MutPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlInsertElementGenericTableAvl(table.rawAddress, buffer.rawAddress, buffersize.toInt(), newelement.rawAddress))

public actual fun rtlInsertElementGenericTableFull(table: ConstPtr, buffer: ConstPtr, buffersize: UInt, newelement: MutPtr, nodeorparent: ConstPtr, searchresult: TableSearchResult): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlInsertElementGenericTableFull(table.rawAddress, buffer.rawAddress, buffersize.toInt(), newelement.rawAddress, nodeorparent.rawAddress, searchresult))

public actual fun rtlInsertElementGenericTableFullAvl(table: ConstPtr, buffer: ConstPtr, buffersize: UInt, newelement: MutPtr, nodeorparent: ConstPtr, searchresult: TableSearchResult): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlInsertElementGenericTableFullAvl(table.rawAddress, buffer.rawAddress, buffersize.toInt(), newelement.rawAddress, nodeorparent.rawAddress, searchresult))

public actual fun rtlInsertEntryHashTable(hashtable: ConstPtr, entry: ConstPtr, signature: ULong, context: MutPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlInsertEntryHashTable(hashtable.rawAddress, entry.rawAddress, signature.toLong(), context.rawAddress)

public actual fun rtlInt64ToUnicodeString(value: ULong, base: UInt, string: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlInt64ToUnicodeString(value.toLong(), base.toInt(), string.rawAddress)

public actual fun rtlIntegerToUnicodeString(value: UInt, base: UInt, string: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlIntegerToUnicodeString(value.toInt(), base.toInt(), string.rawAddress)

public actual fun rtlIoDecodeMemIoResource(descriptor: ConstPtr, alignment: MutPtr, minimumaddress: MutPtr, maximumaddress: MutPtr): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlIoDecodeMemIoResource(descriptor.rawAddress, alignment.rawAddress, minimumaddress.rawAddress, maximumaddress.rawAddress).toULong()

public actual fun rtlIoEncodeMemIoResource(descriptor: ConstPtr, type: UByte, length: ULong, alignment: ULong, minimumaddress: ULong, maximumaddress: ULong): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlIoEncodeMemIoResource(descriptor.rawAddress, type.toByte(), length.toLong(), alignment.toLong(), minimumaddress.toLong(), maximumaddress.toLong())

public actual fun rtlIsApiSetImplemented(apisetname: Pcstr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlIsApiSetImplemented(apisetname.rawAddress)

public actual fun rtlIsGenericTableEmpty(table: ConstPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlIsGenericTableEmpty(table.rawAddress)

public actual fun rtlIsGenericTableEmptyAvl(table: ConstPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlIsGenericTableEmptyAvl(table.rawAddress)

public actual fun rtlIsMultiSessionSku(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlIsMultiSessionSku()

public actual fun rtlIsMultiUsersInSessionSku(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlIsMultiUsersInSessionSku()

public actual fun rtlIsNtDdiVersionAvailable(version: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlIsNtDdiVersionAvailable(version.toInt())

public actual fun rtlIsServicePackVersionInstalled(version: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlIsServicePackVersionInstalled(version.toInt())

public actual fun rtlIsStateSeparationEnabled(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlIsStateSeparationEnabled()

public actual fun rtlIsUntrustedObject(handle: Handle, obj: ConstPtr, untrustedobject: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlIsUntrustedObject(handle.rawAddress, obj.rawAddress, untrustedobject.rawAddress)

public actual fun rtlLengthSecurityDescriptor(securitydescriptor: PsecurityDescriptor): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlLengthSecurityDescriptor(securitydescriptor.rawAddress).toUInt()

public actual fun rtlLookupElementGenericTable(table: ConstPtr, buffer: ConstPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlLookupElementGenericTable(table.rawAddress, buffer.rawAddress))

public actual fun rtlLookupElementGenericTableAvl(table: ConstPtr, buffer: ConstPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlLookupElementGenericTableAvl(table.rawAddress, buffer.rawAddress))

public actual fun rtlLookupElementGenericTableFull(table: ConstPtr, buffer: ConstPtr, nodeorparent: MutPtr, searchresult: MutPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlLookupElementGenericTableFull(table.rawAddress, buffer.rawAddress, nodeorparent.rawAddress, searchresult.rawAddress))

public actual fun rtlLookupElementGenericTableFullAvl(table: ConstPtr, buffer: ConstPtr, nodeorparent: MutPtr, searchresult: MutPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlLookupElementGenericTableFullAvl(table.rawAddress, buffer.rawAddress, nodeorparent.rawAddress, searchresult.rawAddress))

public actual fun rtlLookupEntryHashTable(hashtable: ConstPtr, signature: ULong, context: MutPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlLookupEntryHashTable(hashtable.rawAddress, signature.toLong(), context.rawAddress))

public actual fun rtlLookupFirstMatchingElementGenericTableAvl(table: ConstPtr, buffer: ConstPtr, restartkey: MutPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlLookupFirstMatchingElementGenericTableAvl(table.rawAddress, buffer.rawAddress, restartkey.rawAddress))

public actual fun rtlMapGenericMask(accessmask: MutPtr, genericmapping: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlMapGenericMask(accessmask.rawAddress, genericmapping.rawAddress)
}

public actual fun rtlNormalizeSecurityDescriptor(securitydescriptor: MutPtr, securitydescriptorlength: UInt, newsecuritydescriptor: MutPtr, newsecuritydescriptorlength: MutPtr, checkonly: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlNormalizeSecurityDescriptor(securitydescriptor.rawAddress, securitydescriptorlength.toInt(), newsecuritydescriptor.rawAddress, newsecuritydescriptorlength.rawAddress, checkonly)

public actual fun rtlNumberGenericTableElements(table: ConstPtr): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlNumberGenericTableElements(table.rawAddress).toUInt()

public actual fun rtlNumberGenericTableElementsAvl(table: ConstPtr): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlNumberGenericTableElementsAvl(table.rawAddress).toUInt()

public actual fun rtlNumberOfClearBits(bitmapheader: ConstPtr): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlNumberOfClearBits(bitmapheader.rawAddress).toUInt()

public actual fun rtlNumberOfClearBitsInRange(bitmapheader: ConstPtr, startingindex: UInt, length: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlNumberOfClearBitsInRange(bitmapheader.rawAddress, startingindex.toInt(), length.toInt()).toUInt()

public actual fun rtlNumberOfSetBits(bitmapheader: ConstPtr): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlNumberOfSetBits(bitmapheader.rawAddress).toUInt()

public actual fun rtlNumberOfSetBitsInRange(bitmapheader: ConstPtr, startingindex: UInt, length: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlNumberOfSetBitsInRange(bitmapheader.rawAddress, startingindex.toInt(), length.toInt()).toUInt()

public actual fun rtlNumberOfSetBitsUlongPtr(target: ULong): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlNumberOfSetBitsUlongPtr(target.toLong()).toUInt()

public actual fun rtlPrefetchMemoryNonTemporal(source: ConstPtr, length: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlPrefetchMemoryNonTemporal(source.rawAddress, length.toLong())
}

public actual fun rtlPrefixUnicodeString(string1: ConstPtr, string2: ConstPtr, caseinsensitive: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlPrefixUnicodeString(string1.rawAddress, string2.rawAddress, caseinsensitive)

public actual fun rtlQueryRegistryValueWithFallback(primaryhandle: Handle, fallbackhandle: Handle, valuename: ConstPtr, valuelength: UInt, valuetype: MutPtr, valuedata: MutPtr, resultlength: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlQueryRegistryValueWithFallback(primaryhandle.rawAddress, fallbackhandle.rawAddress, valuename.rawAddress, valuelength.toInt(), valuetype.rawAddress, valuedata.rawAddress, resultlength.rawAddress)

public actual fun rtlQueryRegistryValues(relativeto: UInt, path: Pcwstr, querytable: MutPtr, context: ConstPtr, environment: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlQueryRegistryValues(relativeto.toInt(), path.rawAddress, querytable.rawAddress, context.rawAddress, environment.rawAddress)

public actual fun rtlQueryValidationRunlevel(componentname: ConstPtr): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlQueryValidationRunlevel(componentname.rawAddress).toUInt()

public actual fun rtlRealPredecessor(links: ConstPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlRealPredecessor(links.rawAddress))

public actual fun rtlRealSuccessor(links: ConstPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlRealSuccessor(links.rawAddress))

public actual fun rtlRemoveEntryHashTable(hashtable: ConstPtr, entry: ConstPtr, context: MutPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlRemoveEntryHashTable(hashtable.rawAddress, entry.rawAddress, context.rawAddress)

public actual fun rtlRunOnceBeginInitialize(runonce: MutPtr, flags: UInt, context: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlRunOnceBeginInitialize(runonce.rawAddress, flags.toInt(), context.rawAddress)

public actual fun rtlRunOnceComplete(runonce: MutPtr, flags: UInt, context: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlRunOnceComplete(runonce.rawAddress, flags.toInt(), context.rawAddress)

public actual fun rtlRunOnceExecuteOnce(runonce: MutPtr, initfn: PrtlRunOnceInitFn, parameter: MutPtr, context: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlRunOnceExecuteOnce(runonce.rawAddress, 0L, parameter.rawAddress, context.rawAddress)

public actual fun rtlRunOnceInitialize(runonce: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlRunOnceInitialize(runonce.rawAddress)
}

public actual fun rtlSetAllBits(bitmapheader: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlSetAllBits(bitmapheader.rawAddress)
}

public actual fun rtlSetBit(bitmapheader: ConstPtr, bitnumber: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlSetBit(bitmapheader.rawAddress, bitnumber.toInt())
}

public actual fun rtlSetBits(bitmapheader: ConstPtr, startingindex: UInt, numbertoset: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlSetBits(bitmapheader.rawAddress, startingindex.toInt(), numbertoset.toInt())
}

public actual fun rtlSetDaclSecurityDescriptor(securitydescriptor: PsecurityDescriptor, daclpresent: Boolean, dacl: ConstPtr, dacldefaulted: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlSetDaclSecurityDescriptor(securitydescriptor.rawAddress, daclpresent, dacl.rawAddress, dacldefaulted)

public actual fun rtlSetSystemGlobalData(dataid: RtlSystemGlobalDataId, buffer: ConstPtr, size: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlSetSystemGlobalData(dataid, buffer.rawAddress, size.toInt())

public actual fun rtlSplay(links: MutPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlSplay(links.rawAddress))

public actual fun rtlStringFromGUID(guid: ConstPtr, guidstring: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlStringFromGUID(guid.rawAddress, guidstring.rawAddress)

public actual fun rtlStronglyEnumerateEntryHashTable(hashtable: ConstPtr, enumerator: MutPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlStronglyEnumerateEntryHashTable(hashtable.rawAddress, enumerator.rawAddress))

public actual fun rtlSubtreePredecessor(links: ConstPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlSubtreePredecessor(links.rawAddress))

public actual fun rtlSubtreeSuccessor(links: ConstPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlSubtreeSuccessor(links.rawAddress))

public actual fun rtlSuffixUnicodeString(string1: ConstPtr, string2: ConstPtr, caseinsensitive: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlSuffixUnicodeString(string1.rawAddress, string2.rawAddress, caseinsensitive)

public actual fun rtlTestBit(bitmapheader: ConstPtr, bitnumber: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlTestBit(bitmapheader.rawAddress, bitnumber.toInt())

public actual fun rtlTimeFieldsToTime(timefields: ConstPtr, time: MutPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlTimeFieldsToTime(timefields.rawAddress, time.rawAddress)

public actual fun rtlTimeToTimeFields(time: ConstPtr, timefields: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlTimeToTimeFields(time.rawAddress, timefields.rawAddress)
}

public actual fun rtlUTF8StringToUnicodeString(destinationstring: MutPtr, sourcestring: ConstPtr, allocatedestinationstring: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlUTF8StringToUnicodeString(destinationstring.rawAddress, sourcestring.rawAddress, allocatedestinationstring)

public actual fun rtlUTF8ToUnicodeN(unicodestringdestination: Pwstr, unicodestringmaxbytecount: UInt, unicodestringactualbytecount: MutPtr, utf8stringsource: Pcstr, utf8stringbytecount: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlUTF8ToUnicodeN(unicodestringdestination.rawAddress, unicodestringmaxbytecount.toInt(), unicodestringactualbytecount.rawAddress, utf8stringsource.rawAddress, utf8stringbytecount.toInt())

public actual fun rtlUnicodeStringToInt64(string: ConstPtr, base: UInt, number: MutPtr, endpointer: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlUnicodeStringToInt64(string.rawAddress, base.toInt(), number.rawAddress, endpointer.rawAddress)

public actual fun rtlUnicodeStringToInteger(string: ConstPtr, base: UInt, value: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlUnicodeStringToInteger(string.rawAddress, base.toInt(), value.rawAddress)

public actual fun rtlUnicodeStringToUTF8String(destinationstring: MutPtr, sourcestring: ConstPtr, allocatedestinationstring: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlUnicodeStringToUTF8String(destinationstring.rawAddress, sourcestring.rawAddress, allocatedestinationstring)

public actual fun rtlUnicodeToUTF8N(utf8stringdestination: Pstr, utf8stringmaxbytecount: UInt, utf8stringactualbytecount: MutPtr, unicodestringsource: ConstPtr, unicodestringbytecount: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlUnicodeToUTF8N(utf8stringdestination.rawAddress, utf8stringmaxbytecount.toInt(), utf8stringactualbytecount.rawAddress, unicodestringsource.rawAddress, unicodestringbytecount.toInt())

public actual fun rtlUpcaseUnicodeChar(sourcecharacter: UShort): UShort =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlUpcaseUnicodeChar(sourcecharacter.toShort()).toUShort()

public actual fun rtlUpcaseUnicodeString(destinationstring: MutPtr, sourcestring: ConstPtr, allocatedestinationstring: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlUpcaseUnicodeString(destinationstring.rawAddress, sourcestring.rawAddress, allocatedestinationstring)

public actual fun rtlUpperChar(character: Byte): Byte =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlUpperChar(character)

public actual fun rtlUpperString(destinationstring: MutPtr, sourcestring: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlUpperString(destinationstring.rawAddress, sourcestring.rawAddress)
}

public actual fun rtlValidRelativeSecurityDescriptor(securitydescriptorinput: PsecurityDescriptor, securitydescriptorlength: UInt, requiredinformation: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlValidRelativeSecurityDescriptor(securitydescriptorinput.rawAddress, securitydescriptorlength.toInt(), requiredinformation.toInt())

public actual fun rtlValidSecurityDescriptor(securitydescriptor: PsecurityDescriptor): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlValidSecurityDescriptor(securitydescriptor.rawAddress)

public actual fun rtlVerifyVersionInfo(versioninfo: ConstPtr, typemask: UInt, conditionmask: ULong): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlVerifyVersionInfo(versioninfo.rawAddress, typemask.toInt(), conditionmask.toLong())

public actual fun rtlVolumeDeviceToDosName(volumedeviceobject: ConstPtr, dosname: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlVolumeDeviceToDosName(volumedeviceobject.rawAddress, dosname.rawAddress)

public actual fun rtlWalkFrameChain(callers: MutPtr, count: UInt, flags: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlWalkFrameChain(callers.rawAddress, count.toInt(), flags.toInt()).toUInt()

public actual fun rtlWeaklyEnumerateEntryHashTable(hashtable: ConstPtr, enumerator: MutPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlWeaklyEnumerateEntryHashTable(hashtable.rawAddress, enumerator.rawAddress))

public actual fun rtlWriteRegistryValue(relativeto: UInt, path: Pcwstr, valuename: Pcwstr, valuetype: UInt, valuedata: ConstPtr, valuelength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlWriteRegistryValue(relativeto.toInt(), path.rawAddress, valuename.rawAddress, valuetype.toInt(), valuedata.rawAddress, valuelength.toInt())

public actual fun rtlxAnsiStringToUnicodeSize(ansistring: ConstPtr): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlxAnsiStringToUnicodeSize(ansistring.rawAddress).toUInt()

public actual fun rtlxUnicodeStringToAnsiSize(unicodestring: ConstPtr): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlxUnicodeStringToAnsiSize(unicodestring.rawAddress).toUInt()

public actual fun seAccessCheck(securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr, subjectcontextlocked: Boolean, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: MutPtr, genericmapping: ConstPtr, accessmode: Byte, grantedaccess: MutPtr, accessstatus: MutPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesSeAccessCheck(securitydescriptor.rawAddress, subjectsecuritycontext.rawAddress, subjectcontextlocked, desiredaccess.toInt(), previouslygrantedaccess.toInt(), privileges.rawAddress, genericmapping.rawAddress, accessmode, grantedaccess.rawAddress, accessstatus.rawAddress)

public actual fun seAssignSecurity(parentdescriptor: PsecurityDescriptor, explicitdescriptor: PsecurityDescriptor, newdescriptor: MutPtr, isdirectoryobject: Boolean, subjectcontext: ConstPtr, genericmapping: ConstPtr, pooltype: PoolType): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesSeAssignSecurity(parentdescriptor.rawAddress, explicitdescriptor.rawAddress, newdescriptor.rawAddress, isdirectoryobject, subjectcontext.rawAddress, genericmapping.rawAddress, pooltype)

public actual fun seAssignSecurityEx(parentdescriptor: PsecurityDescriptor, explicitdescriptor: PsecurityDescriptor, newdescriptor: MutPtr, objecttype: ConstPtr, isdirectoryobject: Boolean, autoinheritflags: UInt, subjectcontext: ConstPtr, genericmapping: ConstPtr, pooltype: PoolType): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesSeAssignSecurityEx(parentdescriptor.rawAddress, explicitdescriptor.rawAddress, newdescriptor.rawAddress, objecttype.rawAddress, isdirectoryobject, autoinheritflags.toInt(), subjectcontext.rawAddress, genericmapping.rawAddress, pooltype)

public actual fun seCaptureSubjectContext(subjectcontext: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesSeCaptureSubjectContext(subjectcontext.rawAddress)
}

public actual fun seComputeAutoInheritByObjectType(objecttype: ConstPtr, securitydescriptor: PsecurityDescriptor, parentsecuritydescriptor: PsecurityDescriptor): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesSeComputeAutoInheritByObjectType(objecttype.rawAddress, securitydescriptor.rawAddress, parentsecuritydescriptor.rawAddress).toUInt()

public actual fun seDeassignSecurity(securitydescriptor: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesSeDeassignSecurity(securitydescriptor.rawAddress)

public actual fun seEtwWriteKMCveEvent(cveid: ConstPtr, additionaldetails: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesSeEtwWriteKMCveEvent(cveid.rawAddress, additionaldetails.rawAddress)

public actual fun seLockSubjectContext(subjectcontext: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesSeLockSubjectContext(subjectcontext.rawAddress)
}

public actual fun seRegisterImageVerificationCallback(imagetype: SeImageType, callbacktype: SeImageVerificationCallbackType, callbackfunction: PseImageVerificationCallbackFunction, callbackcontext: ConstPtr, token: ConstPtr, callbackhandle: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesSeRegisterImageVerificationCallback(imagetype, callbacktype, 0L, callbackcontext.rawAddress, token.rawAddress, callbackhandle.rawAddress)

public actual fun seReleaseSubjectContext(subjectcontext: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesSeReleaseSubjectContext(subjectcontext.rawAddress)
}

public actual fun seReportSecurityEvent(flags: UInt, sourcename: ConstPtr, usersid: Psid, auditparameters: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesSeReportSecurityEvent(flags.toInt(), sourcename.rawAddress, usersid.rawAddress, auditparameters.rawAddress)

public actual fun seSetAuditParameter(auditparameters: MutPtr, type: SeAdtParameterType, index: UInt, data: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesSeSetAuditParameter(auditparameters.rawAddress, type, index.toInt(), data.rawAddress)

public actual fun seSinglePrivilegeCheck(privilegevalue: Luid, previousmode: Byte): Boolean =
    false

public actual fun seUnlockSubjectContext(subjectcontext: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesSeUnlockSubjectContext(subjectcontext.rawAddress)
}

public actual fun seUnregisterImageVerificationCallback(callbackhandle: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesSeUnregisterImageVerificationCallback(callbackhandle.rawAddress)
}

public actual fun seValidSecurityDescriptor(length: UInt, securitydescriptor: PsecurityDescriptor): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesSeValidSecurityDescriptor(length.toInt(), securitydescriptor.rawAddress)

public actual fun tmCommitComplete(enlistment: ConstPtr, tmvirtualclock: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmCommitComplete(enlistment.rawAddress, tmvirtualclock.rawAddress)

public actual fun tmCommitEnlistment(enlistment: ConstPtr, tmvirtualclock: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmCommitEnlistment(enlistment.rawAddress, tmvirtualclock.rawAddress)

public actual fun tmCommitTransaction(transaction: ConstPtr, wait: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmCommitTransaction(transaction.rawAddress, wait)

public actual fun tmCreateEnlistment(enlistmenthandle: MutPtr, previousmode: Byte, desiredaccess: UInt, objectattributes: ConstPtr, resourcemanager: ConstPtr, transaction: ConstPtr, createoptions: UInt, notificationmask: UInt, enlistmentkey: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmCreateEnlistment(enlistmenthandle.rawAddress, previousmode, desiredaccess.toInt(), objectattributes.rawAddress, resourcemanager.rawAddress, transaction.rawAddress, createoptions.toInt(), notificationmask.toInt(), enlistmentkey.rawAddress)

public actual fun tmDereferenceEnlistmentKey(enlistment: ConstPtr, lastreference: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmDereferenceEnlistmentKey(enlistment.rawAddress, lastreference.rawAddress)

public actual fun tmEnableCallbacks(resourcemanager: ConstPtr, callbackroutine: PtmRmNotification, rmkey: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmEnableCallbacks(resourcemanager.rawAddress, 0L, rmkey.rawAddress)

public actual fun tmGetTransactionId(transaction: ConstPtr, transactionid: MutPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmGetTransactionId(transaction.rawAddress, transactionid.rawAddress)
}

public actual fun tmInitializeTransactionManager(transactionmanager: ConstPtr, logfilename: ConstPtr, tmid: ConstPtr, createoptions: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmInitializeTransactionManager(transactionmanager.rawAddress, logfilename.rawAddress, tmid.rawAddress, createoptions.toInt())

public actual fun tmIsTransactionActive(transaction: ConstPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmIsTransactionActive(transaction.rawAddress)

public actual fun tmPrePrepareComplete(enlistment: ConstPtr, tmvirtualclock: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmPrePrepareComplete(enlistment.rawAddress, tmvirtualclock.rawAddress)

public actual fun tmPrePrepareEnlistment(enlistment: ConstPtr, tmvirtualclock: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmPrePrepareEnlistment(enlistment.rawAddress, tmvirtualclock.rawAddress)

public actual fun tmPrepareComplete(enlistment: ConstPtr, tmvirtualclock: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmPrepareComplete(enlistment.rawAddress, tmvirtualclock.rawAddress)

public actual fun tmPrepareEnlistment(enlistment: ConstPtr, tmvirtualclock: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmPrepareEnlistment(enlistment.rawAddress, tmvirtualclock.rawAddress)

public actual fun tmPropagationComplete(resourcemanager: ConstPtr, requestcookie: UInt, bufferlength: UInt, buffer: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmPropagationComplete(resourcemanager.rawAddress, requestcookie.toInt(), bufferlength.toInt(), buffer.rawAddress)

public actual fun tmPropagationFailed(resourcemanager: ConstPtr, requestcookie: UInt, status: Ntstatus): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmPropagationFailed(resourcemanager.rawAddress, requestcookie.toInt(), status)

public actual fun tmReadOnlyEnlistment(enlistment: ConstPtr, tmvirtualclock: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmReadOnlyEnlistment(enlistment.rawAddress, tmvirtualclock.rawAddress)

public actual fun tmRecoverEnlistment(enlistment: ConstPtr, enlistmentkey: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmRecoverEnlistment(enlistment.rawAddress, enlistmentkey.rawAddress)

public actual fun tmRecoverResourceManager(resourcemanager: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmRecoverResourceManager(resourcemanager.rawAddress)

public actual fun tmRecoverTransactionManager(tm: ConstPtr, targetvirtualclock: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmRecoverTransactionManager(tm.rawAddress, targetvirtualclock.rawAddress)

public actual fun tmReferenceEnlistmentKey(enlistment: ConstPtr, key: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmReferenceEnlistmentKey(enlistment.rawAddress, key.rawAddress)

public actual fun tmRenameTransactionManager(logfilename: ConstPtr, existingtransactionmanagerguid: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmRenameTransactionManager(logfilename.rawAddress, existingtransactionmanagerguid.rawAddress)

public actual fun tmRequestOutcomeEnlistment(enlistment: ConstPtr, tmvirtualclock: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmRequestOutcomeEnlistment(enlistment.rawAddress, tmvirtualclock.rawAddress)

public actual fun tmRollbackComplete(enlistment: ConstPtr, tmvirtualclock: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmRollbackComplete(enlistment.rawAddress, tmvirtualclock.rawAddress)

public actual fun tmRollbackEnlistment(enlistment: ConstPtr, tmvirtualclock: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmRollbackEnlistment(enlistment.rawAddress, tmvirtualclock.rawAddress)

public actual fun tmRollbackTransaction(transaction: ConstPtr, wait: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmRollbackTransaction(transaction.rawAddress, wait)

public actual fun tmSinglePhaseReject(enlistment: ConstPtr, tmvirtualclock: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmSinglePhaseReject(enlistment.rawAddress, tmvirtualclock.rawAddress)

public actual fun vslCreateSecureSection(handle: MutPtr, targetprocess: Peprocess, mdl: ConstPtr, devicepageprotection: UInt, attributes: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesVslCreateSecureSection(handle.rawAddress, targetprocess, mdl.rawAddress, devicepageprotection.toInt(), attributes.toInt())

public actual fun vslDeleteSecureSection(globalhandle: Handle): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesVslDeleteSecureSection(globalhandle.rawAddress)

public actual fun wheaAddErrorSource(errorsource: ConstPtr, context: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaAddErrorSource(errorsource.rawAddress, context.rawAddress)

public actual fun wheaAddErrorSourceDeviceDriver(context: MutPtr, configuration: ConstPtr, numberpreallocatederrorreports: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaAddErrorSourceDeviceDriver(context.rawAddress, configuration.rawAddress, numberpreallocatederrorreports.toInt())

public actual fun wheaAddErrorSourceDeviceDriverV1(context: MutPtr, configuration: ConstPtr, numbufferstopreallocate: UInt, maxdatalength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaAddErrorSourceDeviceDriverV1(context.rawAddress, configuration.rawAddress, numbufferstopreallocate.toInt(), maxdatalength.toInt())

public actual fun wheaAddHwErrorReportSectionDeviceDriver(errorhandle: ConstPtr, sectiondatalength: UInt, bufferset: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaAddHwErrorReportSectionDeviceDriver(errorhandle.rawAddress, sectiondatalength.toInt(), bufferset.rawAddress)

public actual fun wheaConfigureErrorSource(sourcetype: WheaErrorSourceType, configuration: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaConfigureErrorSource(sourcetype, configuration.rawAddress)

public actual fun wheaCreateHwErrorReportDeviceDriver(errorsourceid: UInt, deviceobject: ConstPtr): MutPtr =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaCreateHwErrorReportDeviceDriver(errorsourceid.toInt(), deviceobject.rawAddress))

public actual fun wheaErrorSourceGetState(errorsourceid: UInt): WheaErrorSourceState =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaErrorSourceGetState(errorsourceid.toInt())

public actual fun wheaGetNotifyAllOfflinesPolicy(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaGetNotifyAllOfflinesPolicy()

public actual fun wheaHighIrqlLogSelEventHandlerRegister(handler: PfnWheaHighIrqlLogSelEventHandler, context: ConstPtr): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaHighIrqlLogSelEventHandlerRegister(0L, context.rawAddress)

public actual fun wheaHighIrqlLogSelEventHandlerUnregister() {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaHighIrqlLogSelEventHandlerUnregister()
}

public actual fun wheaHwErrorReportAbandonDeviceDriver(errorhandle: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaHwErrorReportAbandonDeviceDriver(errorhandle.rawAddress)

public actual fun wheaHwErrorReportSetSectionNameDeviceDriver(bufferset: ConstPtr, namelength: UInt, name: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaHwErrorReportSetSectionNameDeviceDriver(bufferset.rawAddress, namelength.toInt(), name.rawAddress)

public actual fun wheaHwErrorReportSetSeverityDeviceDriver(errorhandle: ConstPtr, errorseverity: WheaErrorSeverity): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaHwErrorReportSetSeverityDeviceDriver(errorhandle.rawAddress, errorseverity)

public actual fun wheaHwErrorReportSubmitDeviceDriver(errorhandle: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaHwErrorReportSubmitDeviceDriver(errorhandle.rawAddress)

public actual fun wheaInitializeRecordHeader(header: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaInitializeRecordHeader(header.rawAddress)

public actual fun wheaIsCriticalState(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaIsCriticalState()

public actual fun wheaLogInternalEvent(entry: ConstPtr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaLogInternalEvent(entry.rawAddress)
}

public actual fun wheaRegisterInUsePageOfflineNotification(callback: PfnInUsePageOfflineNotify, context: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaRegisterInUsePageOfflineNotification(0L, context.rawAddress)

public actual fun wheaRemoveErrorSource(errorsourceid: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaRemoveErrorSource(errorsourceid.toInt())
}

public actual fun wheaRemoveErrorSourceDeviceDriver(errorsourceid: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaRemoveErrorSourceDeviceDriver(errorsourceid.toInt())

public actual fun wheaReportHwError(errorpacket: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaReportHwError(errorpacket.rawAddress)

public actual fun wheaReportHwErrorDeviceDriver(errorsourceid: UInt, deviceobject: ConstPtr, errordata: ConstPtr, errordatalength: UInt, sectiontypeguid: ConstPtr, errorseverity: WheaErrorSeverity, devicefriendlyname: Pcstr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaReportHwErrorDeviceDriver(errorsourceid.toInt(), deviceobject.rawAddress, errordata.rawAddress, errordatalength.toInt(), sectiontypeguid.rawAddress, errorseverity, devicefriendlyname.rawAddress)

public actual fun wheaUnconfigureErrorSource(sourcetype: WheaErrorSourceType): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaUnconfigureErrorSource(sourcetype)

public actual fun wheaUnregisterInUsePageOfflineNotification(callback: PfnInUsePageOfflineNotify): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaUnregisterInUsePageOfflineNotification(0L)

public actual fun wmiQueryTraceInformation(traceinformationclass: TraceInformationClass, traceinformation: MutPtr, traceinformationlength: UInt, requiredlength: MutPtr, buffer: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWmiQueryTraceInformation(traceinformationclass, traceinformation.rawAddress, traceinformationlength.toInt(), requiredlength.rawAddress, buffer.rawAddress)

public actual fun zwAllocateLocallyUniqueId(luid: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwAllocateLocallyUniqueId(luid.rawAddress)

public actual fun zwClose(handle: Handle): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwClose(handle.rawAddress)

public actual fun zwCommitComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwCommitComplete(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun zwCommitEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwCommitEnlistment(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun zwCommitTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwCommitTransaction(transactionhandle.rawAddress, wait)

public actual fun zwCreateEnlistment(enlistmenthandle: MutPtr, desiredaccess: UInt, resourcemanagerhandle: Handle, transactionhandle: Handle, objectattributes: ConstPtr, createoptions: UInt, notificationmask: UInt, enlistmentkey: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwCreateEnlistment(enlistmenthandle.rawAddress, desiredaccess.toInt(), resourcemanagerhandle.rawAddress, transactionhandle.rawAddress, objectattributes.rawAddress, createoptions.toInt(), notificationmask.toInt(), enlistmentkey.rawAddress)

public actual fun zwCreateFile(filehandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, iostatusblock: MutPtr, allocationsize: ConstPtr, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: ConstPtr, ealength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwCreateFile(filehandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, iostatusblock.rawAddress, allocationsize.rawAddress, fileattributes.toInt(), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), eabuffer.rawAddress, ealength.toInt())

public actual fun zwCreateResourceManager(resourcemanagerhandle: MutPtr, desiredaccess: UInt, tmhandle: Handle, resourcemanagerguid: ConstPtr, objectattributes: ConstPtr, createoptions: UInt, description: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwCreateResourceManager(resourcemanagerhandle.rawAddress, desiredaccess.toInt(), tmhandle.rawAddress, resourcemanagerguid.rawAddress, objectattributes.rawAddress, createoptions.toInt(), description.rawAddress)

public actual fun zwCreateSection(sectionhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, maximumsize: ConstPtr, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwCreateSection(sectionhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, maximumsize.rawAddress, sectionpageprotection.toInt(), allocationattributes.toInt(), filehandle.rawAddress)

public actual fun zwCreateTransaction(transactionhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, uow: ConstPtr, tmhandle: Handle, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: ConstPtr, description: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwCreateTransaction(transactionhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, uow.rawAddress, tmhandle.rawAddress, createoptions.toInt(), isolationlevel.toInt(), isolationflags.toInt(), timeout.rawAddress, description.rawAddress)

public actual fun zwCreateTransactionManager(tmhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, logfilename: ConstPtr, createoptions: UInt, commitstrength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwCreateTransactionManager(tmhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, logfilename.rawAddress, createoptions.toInt(), commitstrength.toInt())

public actual fun zwDeviceIoControlFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, iocontrolcode: UInt, inputbuffer: ConstPtr, inputbufferlength: UInt, outputbuffer: MutPtr, outputbufferlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwDeviceIoControlFile(filehandle.rawAddress, event.rawAddress, 0L, apccontext.rawAddress, iostatusblock.rawAddress, iocontrolcode.toInt(), inputbuffer.rawAddress, inputbufferlength.toInt(), outputbuffer.rawAddress, outputbufferlength.toInt())

public actual fun zwDisplayString(string: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwDisplayString(string.rawAddress)

public actual fun zwEnumerateTransactionObject(rootobjecthandle: Handle, querytype: KtmobjectType, objectcursor: MutPtr, objectcursorlength: UInt, returnlength: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwEnumerateTransactionObject(rootobjecthandle.rawAddress, querytype, objectcursor.rawAddress, objectcursorlength.toInt(), returnlength.rawAddress)

public actual fun zwGetNotificationResourceManager(resourcemanagerhandle: Handle, transactionnotification: MutPtr, notificationlength: UInt, timeout: ConstPtr, returnlength: MutPtr, asynchronous: UInt, asynchronouscontext: ULong): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwGetNotificationResourceManager(resourcemanagerhandle.rawAddress, transactionnotification.rawAddress, notificationlength.toInt(), timeout.rawAddress, returnlength.rawAddress, asynchronous.toInt(), asynchronouscontext.toLong())

public actual fun zwLoadDriver(driverservicename: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwLoadDriver(driverservicename.rawAddress)

public actual fun zwMakeTemporaryObject(handle: Handle): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwMakeTemporaryObject(handle.rawAddress)

public actual fun zwManagePartition(targethandle: Handle, sourcehandle: Handle, partitioninformationclass: PartitionInformationClass, partitioninformation: MutPtr, partitioninformationlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwManagePartition(targethandle.rawAddress, sourcehandle.rawAddress, partitioninformationclass, partitioninformation.rawAddress, partitioninformationlength.toInt())

public actual fun zwOpenEnlistment(enlistmenthandle: MutPtr, desiredaccess: UInt, rmhandle: Handle, enlistmentguid: ConstPtr, objectattributes: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwOpenEnlistment(enlistmenthandle.rawAddress, desiredaccess.toInt(), rmhandle.rawAddress, enlistmentguid.rawAddress, objectattributes.rawAddress)

public actual fun zwOpenFile(filehandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, iostatusblock: MutPtr, shareaccess: UInt, openoptions: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwOpenFile(filehandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, iostatusblock.rawAddress, shareaccess.toInt(), openoptions.toInt())

public actual fun zwOpenResourceManager(resourcemanagerhandle: MutPtr, desiredaccess: UInt, tmhandle: Handle, resourcemanagerguid: ConstPtr, objectattributes: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwOpenResourceManager(resourcemanagerhandle.rawAddress, desiredaccess.toInt(), tmhandle.rawAddress, resourcemanagerguid.rawAddress, objectattributes.rawAddress)

public actual fun zwOpenSymbolicLinkObject(linkhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwOpenSymbolicLinkObject(linkhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress)

public actual fun zwOpenTransaction(transactionhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, uow: ConstPtr, tmhandle: Handle): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwOpenTransaction(transactionhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, uow.rawAddress, tmhandle.rawAddress)

public actual fun zwOpenTransactionManager(tmhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr, logfilename: ConstPtr, tmidentity: ConstPtr, openoptions: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwOpenTransactionManager(tmhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, logfilename.rawAddress, tmidentity.rawAddress, openoptions.toInt())

public actual fun zwPowerInformation(informationlevel: PowerInformationLevel, inputbuffer: ConstPtr, inputbufferlength: UInt, outputbuffer: MutPtr, outputbufferlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwPowerInformation(informationlevel, inputbuffer.rawAddress, inputbufferlength.toInt(), outputbuffer.rawAddress, outputbufferlength.toInt())

public actual fun zwPrePrepareComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwPrePrepareComplete(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun zwPrePrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwPrePrepareEnlistment(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun zwPrepareComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwPrepareComplete(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun zwPrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwPrepareEnlistment(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun zwPropagationComplete(resourcemanagerhandle: Handle, requestcookie: UInt, bufferlength: UInt, buffer: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwPropagationComplete(resourcemanagerhandle.rawAddress, requestcookie.toInt(), bufferlength.toInt(), buffer.rawAddress)

public actual fun zwPropagationFailed(resourcemanagerhandle: Handle, requestcookie: UInt, propstatus: Ntstatus): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwPropagationFailed(resourcemanagerhandle.rawAddress, requestcookie.toInt(), propstatus)

public actual fun zwQueryInformationByName(objectattributes: ConstPtr, iostatusblock: MutPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwQueryInformationByName(objectattributes.rawAddress, iostatusblock.rawAddress, fileinformation.rawAddress, length.toInt(), fileinformationclass)

public actual fun zwQueryInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: MutPtr, enlistmentinformationlength: UInt, returnlength: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwQueryInformationEnlistment(enlistmenthandle.rawAddress, enlistmentinformationclass, enlistmentinformation.rawAddress, enlistmentinformationlength.toInt(), returnlength.rawAddress)

public actual fun zwQueryInformationFile(filehandle: Handle, iostatusblock: MutPtr, fileinformation: MutPtr, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwQueryInformationFile(filehandle.rawAddress, iostatusblock.rawAddress, fileinformation.rawAddress, length.toInt(), fileinformationclass)

public actual fun zwQueryInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: MutPtr, resourcemanagerinformationlength: UInt, returnlength: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwQueryInformationResourceManager(resourcemanagerhandle.rawAddress, resourcemanagerinformationclass, resourcemanagerinformation.rawAddress, resourcemanagerinformationlength.toInt(), returnlength.rawAddress)

public actual fun zwQueryInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: MutPtr, transactioninformationlength: UInt, returnlength: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwQueryInformationTransaction(transactionhandle.rawAddress, transactioninformationclass, transactioninformation.rawAddress, transactioninformationlength.toInt(), returnlength.rawAddress)

public actual fun zwQueryInformationTransactionManager(transactionmanagerhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: MutPtr, transactionmanagerinformationlength: UInt, returnlength: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwQueryInformationTransactionManager(transactionmanagerhandle.rawAddress, transactionmanagerinformationclass, transactionmanagerinformation.rawAddress, transactionmanagerinformationlength.toInt(), returnlength.rawAddress)

public actual fun zwQuerySymbolicLinkObject(linkhandle: Handle, linktarget: MutPtr, returnedlength: MutPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwQuerySymbolicLinkObject(linkhandle.rawAddress, linktarget.rawAddress, returnedlength.rawAddress)

public actual fun zwReadFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, buffer: MutPtr, length: UInt, byteoffset: ConstPtr, key: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwReadFile(filehandle.rawAddress, event.rawAddress, 0L, apccontext.rawAddress, iostatusblock.rawAddress, buffer.rawAddress, length.toInt(), byteoffset.rawAddress, key.rawAddress)

public actual fun zwReadOnlyEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwReadOnlyEnlistment(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun zwRecoverEnlistment(enlistmenthandle: Handle, enlistmentkey: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwRecoverEnlistment(enlistmenthandle.rawAddress, enlistmentkey.rawAddress)

public actual fun zwRecoverResourceManager(resourcemanagerhandle: Handle): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwRecoverResourceManager(resourcemanagerhandle.rawAddress)

public actual fun zwRecoverTransactionManager(transactionmanagerhandle: Handle): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwRecoverTransactionManager(transactionmanagerhandle.rawAddress)

public actual fun zwRegisterProtocolAddressInformation(resourcemanager: Handle, protocolid: ConstPtr, protocolinformationsize: UInt, protocolinformation: ConstPtr, createoptions: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwRegisterProtocolAddressInformation(resourcemanager.rawAddress, protocolid.rawAddress, protocolinformationsize.toInt(), protocolinformation.rawAddress, createoptions.toInt())

public actual fun zwRenameTransactionManager(logfilename: ConstPtr, existingtransactionmanagerguid: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwRenameTransactionManager(logfilename.rawAddress, existingtransactionmanagerguid.rawAddress)

public actual fun zwRollbackComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwRollbackComplete(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun zwRollbackEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwRollbackEnlistment(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun zwRollbackTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwRollbackTransaction(transactionhandle.rawAddress, wait)

public actual fun zwRollforwardTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwRollforwardTransactionManager(transactionmanagerhandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun zwSetInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: ConstPtr, enlistmentinformationlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwSetInformationEnlistment(enlistmenthandle.rawAddress, enlistmentinformationclass, enlistmentinformation.rawAddress, enlistmentinformationlength.toInt())

public actual fun zwSetInformationFile(filehandle: Handle, iostatusblock: MutPtr, fileinformation: ConstPtr, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwSetInformationFile(filehandle.rawAddress, iostatusblock.rawAddress, fileinformation.rawAddress, length.toInt(), fileinformationclass)

public actual fun zwSetInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: ConstPtr, resourcemanagerinformationlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwSetInformationResourceManager(resourcemanagerhandle.rawAddress, resourcemanagerinformationclass, resourcemanagerinformation.rawAddress, resourcemanagerinformationlength.toInt())

public actual fun zwSetInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: ConstPtr, transactioninformationlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwSetInformationTransaction(transactionhandle.rawAddress, transactioninformationclass, transactioninformation.rawAddress, transactioninformationlength.toInt())

public actual fun zwSetInformationTransactionManager(tmhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: ConstPtr, transactionmanagerinformationlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwSetInformationTransactionManager(tmhandle.rawAddress, transactionmanagerinformationclass, transactionmanagerinformation.rawAddress, transactionmanagerinformationlength.toInt())

public actual fun zwSinglePhaseReject(enlistmenthandle: Handle, tmvirtualclock: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwSinglePhaseReject(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun zwUnloadDriver(driverservicename: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwUnloadDriver(driverservicename.rawAddress)

public actual fun zwWriteFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr, iostatusblock: MutPtr, buffer: ConstPtr, length: UInt, byteoffset: ConstPtr, key: ConstPtr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwWriteFile(filehandle.rawAddress, event.rawAddress, 0L, apccontext.rawAddress, iostatusblock.rawAddress, buffer.rawAddress, length.toInt(), byteoffset.rawAddress, key.rawAddress)

public actual fun vDbgPrintEx(componentid: UInt, level: UInt, format: Pcstr, arglist: ConstPtr): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesVDbgPrintEx(componentid.toInt(), level.toInt(), format.rawAddress, arglist.rawAddress).toUInt()

public actual fun vDbgPrintExWithPrefix(prefix: Pcstr, componentid: UInt, level: UInt, format: Pcstr, arglist: ConstPtr): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesVDbgPrintExWithPrefix(prefix.rawAddress, componentid.toInt(), level.toInt(), format.rawAddress, arglist.rawAddress).toUInt()
