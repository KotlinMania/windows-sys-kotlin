@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Kenlistment
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Kevent
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Kmutant
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Kresourcemanager
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Ktm
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Ktransaction
import io.github.kotlinmania.windowssys.windows.wdk.foundation.KwaitBlock
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Mdl
import io.github.kotlinmania.windowssys.windows.wdk.foundation.ObjectAttributes
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
import io.github.kotlinmania.windowssys.windows.wdk.foundation.RtlSplayLinks
import io.github.kotlinmania.windowssys.windows.wdk.foundation.SecuritySubjectContext
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Vpb
import io.github.kotlinmania.windowssys.windows.wdk.foundation.WorkQueueItem
import io.github.kotlinmania.windowssys.windows.wdk.storage.filesystem.FileInformationClass
import io.github.kotlinmania.windowssys.windows.win32.devices.properties.Devproptype
import io.github.kotlinmania.windowssys.windows.win32.foundation.Devpropkey
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString
import io.github.kotlinmania.windowssys.windows.win32.security.Acl
import io.github.kotlinmania.windowssys.windows.win32.security.GenericMapping
import io.github.kotlinmania.windowssys.windows.win32.security.PrivilegeSet
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.SeAdtParameterArray
import io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity.SeAdtParameterType
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.ClfsContextMode
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.ClfsIostatsClass
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.ClfsMgmtPolicy
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.ClfsMgmtPolicyType
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.ClsInformation
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.ClsLogInformationClass
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.ClsLsn
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.ClsScanContext
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.ClsWriteEntry
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileSegmentElement
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.TransactionNotification
import io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc.AdapterObject
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.BugcheckError
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.WheaDriverBufferSet
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.WheaErrorSourceConfigurationDeviceDriver
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.WheaErrorSourceDescriptor
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.WheaErrorSourceState
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.WheaErrorSourceType
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.EventDataDescriptor
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.EventDescriptor
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.EventInfoClass
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.etw.Reghandle
import io.github.kotlinmania.windowssys.windows.win32.system.io.IoStatusBlock
import io.github.kotlinmania.windowssys.windows.win32.system.io.PioApcRoutine
import io.github.kotlinmania.windowssys.windows.win32.system.ioctl.CreateDisk
import io.github.kotlinmania.windowssys.windows.win32.system.ioctl.DriveLayoutInformation
import io.github.kotlinmania.windowssys.windows.win32.system.ioctl.DriveLayoutInformationEx
import io.github.kotlinmania.windowssys.windows.win32.system.ioctl.SetPartitionInformationEx
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.EventType
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.NtProductType
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.ProcessorNumber
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.SuiteType
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.TimerType
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.WaitType
import io.github.kotlinmania.windowssys.windows.win32.system.power.DevicePowerState
import io.github.kotlinmania.windowssys.windows.win32.system.power.PowerInformationLevel
import io.github.kotlinmania.windowssys.windows.win32.system.power.PowerRequestType
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.FirmwareType
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.GroupAffinity
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.LogicalProcessorRelationship
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.Osversioninfoexw
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.Osversioninfow
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.RtlSystemGlobalDataId
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.SystemLogicalProcessorInformationEx
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.EnlistmentInformationClass
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.KtmobjectCursor
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.KtmobjectType
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.ResourcemanagerInformationClass
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.TransactionInformationClass
import io.github.kotlinmania.windowssys.windows.win32.system.systemservices.TransactionmanagerInformationClass
import io.github.kotlinmania.windowssys.windows.win32.system.threading.InitOnce
import io.github.kotlinmania.windowssys.windows.win32.system.windowsprogramming.ClientId

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

public actual fun clfsAddLogContainer(plfolog: ConstPtr<FileObject>, pcbcontainer: ConstPtr<ULong>, puszcontainerpath: ConstPtr<UnicodeString>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsAddLogContainer(plfolog.rawAddress, pcbcontainer.rawAddress, puszcontainerpath.rawAddress)

public actual fun clfsAddLogContainerSet(plfolog: ConstPtr<FileObject>, ccontainers: UShort, pcbcontainer: ConstPtr<ULong>, rguszcontainerpath: ConstPtr<UnicodeString>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsAddLogContainerSet(plfolog.rawAddress, ccontainers.toShort(), pcbcontainer.rawAddress, rguszcontainerpath.rawAddress)

public actual fun clfsAdvanceLogBase(pvmarshalcontext: MutPtr<CVoid>, plsnbase: ConstPtr<ClsLsn>, fflags: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsAdvanceLogBase(pvmarshalcontext.rawAddress, plsnbase.rawAddress, fflags.toInt())

public actual fun clfsAlignReservedLog(pvmarshalcontext: ConstPtr<CVoid>, crecords: UInt, rgcbreservation: ConstPtr<Long>, pcbalignreservation: MutPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsAlignReservedLog(pvmarshalcontext.rawAddress, crecords.toInt(), rgcbreservation.rawAddress, pcbalignreservation.rawAddress)

public actual fun clfsAllocReservedLog(pvmarshalcontext: ConstPtr<CVoid>, crecords: UInt, pcbadjustment: ConstPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsAllocReservedLog(pvmarshalcontext.rawAddress, crecords.toInt(), pcbadjustment.rawAddress)

public actual fun clfsCloseAndResetLogFile(plfolog: ConstPtr<FileObject>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsCloseAndResetLogFile(plfolog.rawAddress)

public actual fun clfsCloseLogFileObject(plfolog: ConstPtr<FileObject>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsCloseLogFileObject(plfolog.rawAddress)

public actual fun clfsCreateLogFile(pplfolog: MutPtr<MutPtr<FileObject>>, puszlogfilename: ConstPtr<UnicodeString>, fdesiredaccess: UInt, dwsharemode: UInt, psdlogfile: PsecurityDescriptor, fcreatedisposition: UInt, fcreateoptions: UInt, fflagsandattributes: UInt, flogoptionflag: UInt, pvcontext: ConstPtr<CVoid>, cbcontext: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsCreateLogFile(pplfolog.rawAddress, puszlogfilename.rawAddress, fdesiredaccess.toInt(), dwsharemode.toInt(), psdlogfile.rawAddress, fcreatedisposition.toInt(), fcreateoptions.toInt(), fflagsandattributes.toInt(), flogoptionflag.toInt(), pvcontext.rawAddress, cbcontext.toInt())

public actual fun clfsCreateMarshallingArea(plfolog: ConstPtr<FileObject>, epooltype: PoolType, pfnallocbuffer: PallocateFunction, pfnfreebuffer: PfreeFunction, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, ppvmarshalcontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    0

public actual fun clfsCreateMarshallingAreaEx(plfolog: ConstPtr<FileObject>, epooltype: PoolType, pfnallocbuffer: PallocateFunction, pfnfreebuffer: PfreeFunction, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, calignmentsize: UInt, fflags: ULong, ppvmarshalcontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    0

public actual fun clfsCreateScanContext(plfolog: ConstPtr<FileObject>, cfromcontainer: UInt, ccontainers: UInt, escanmode: UByte, pcxscan: MutPtr<ClsScanContext>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsCreateScanContext(plfolog.rawAddress, cfromcontainer.toInt(), ccontainers.toInt(), escanmode.toByte(), pcxscan.rawAddress)

public actual fun clfsDeleteLogByPointer(plfolog: ConstPtr<FileObject>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsDeleteLogByPointer(plfolog.rawAddress)

public actual fun clfsDeleteLogFile(puszlogfilename: ConstPtr<UnicodeString>, pvreserved: ConstPtr<CVoid>, flogoptionflag: UInt, pvcontext: ConstPtr<CVoid>, cbcontext: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsDeleteLogFile(puszlogfilename.rawAddress, pvreserved.rawAddress, flogoptionflag.toInt(), pvcontext.rawAddress, cbcontext.toInt())

public actual fun clfsDeleteMarshallingArea(pvmarshalcontext: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsDeleteMarshallingArea(pvmarshalcontext.rawAddress)

public actual fun clfsEarlierLsn(plsn: ConstPtr<ClsLsn>): ClsLsn =
    ClsLsn()

public actual fun clfsFinalize() {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsFinalize()
}

public actual fun clfsFlushBuffers(pvmarshalcontext: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsFlushBuffers(pvmarshalcontext.rawAddress)

public actual fun clfsFlushToLsn(pvmarshalcontext: ConstPtr<CVoid>, plsnflush: ConstPtr<ClsLsn>, plsnlastflushed: MutPtr<ClsLsn>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsFlushToLsn(pvmarshalcontext.rawAddress, plsnflush.rawAddress, plsnlastflushed.rawAddress)

public actual fun clfsFreeReservedLog(pvmarshalcontext: ConstPtr<CVoid>, crecords: UInt, pcbadjustment: ConstPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsFreeReservedLog(pvmarshalcontext.rawAddress, crecords.toInt(), pcbadjustment.rawAddress)

public actual fun clfsGetContainerName(plfolog: ConstPtr<FileObject>, cidlogicalcontainer: UInt, puszcontainername: MutPtr<UnicodeString>, pcactuallencontainername: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsGetContainerName(plfolog.rawAddress, cidlogicalcontainer.toInt(), puszcontainername.rawAddress, pcactuallencontainername.rawAddress)

public actual fun clfsGetIoStatistics(plfolog: ConstPtr<FileObject>, pvstatsbuffer: MutPtr<CVoid>, cbstatsbuffer: UInt, estatsclass: ClfsIostatsClass, pcbstatswritten: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsGetIoStatistics(plfolog.rawAddress, pvstatsbuffer.rawAddress, cbstatsbuffer.toInt(), estatsclass, pcbstatswritten.rawAddress)

public actual fun clfsGetLogFileInformation(plfolog: ConstPtr<FileObject>, pinfobuffer: MutPtr<ClsInformation>, pcbinfobuffer: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsGetLogFileInformation(plfolog.rawAddress, pinfobuffer.rawAddress, pcbinfobuffer.rawAddress)

public actual fun clfsInitialize(): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsInitialize()

public actual fun clfsLaterLsn(plsn: ConstPtr<ClsLsn>): ClsLsn =
    ClsLsn()

public actual fun clfsLsnBlockOffset(plsn: ConstPtr<ClsLsn>): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsLsnBlockOffset(plsn.rawAddress).toUInt()

public actual fun clfsLsnContainer(plsn: ConstPtr<ClsLsn>): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsLsnContainer(plsn.rawAddress).toUInt()

public actual fun clfsLsnCreate(cidcontainer: UInt, offblock: UInt, crecord: UInt): ClsLsn =
    ClsLsn()

public actual fun clfsLsnDifference(plsnstart: ConstPtr<ClsLsn>, plsnfinish: ConstPtr<ClsLsn>, cbcontainer: UInt, cbmaxblock: UInt, pcbdifference: MutPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsLsnDifference(plsnstart.rawAddress, plsnfinish.rawAddress, cbcontainer.toInt(), cbmaxblock.toInt(), pcbdifference.rawAddress)

public actual fun clfsLsnEqual(plsn1: ConstPtr<ClsLsn>, plsn2: ConstPtr<ClsLsn>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsLsnEqual(plsn1.rawAddress, plsn2.rawAddress)

public actual fun clfsLsnGreater(plsn1: ConstPtr<ClsLsn>, plsn2: ConstPtr<ClsLsn>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsLsnGreater(plsn1.rawAddress, plsn2.rawAddress)

public actual fun clfsLsnInvalid(plsn: ConstPtr<ClsLsn>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsLsnInvalid(plsn.rawAddress)

public actual fun clfsLsnLess(plsn1: ConstPtr<ClsLsn>, plsn2: ConstPtr<ClsLsn>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsLsnLess(plsn1.rawAddress, plsn2.rawAddress)

public actual fun clfsLsnNull(plsn: ConstPtr<ClsLsn>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsLsnNull(plsn.rawAddress)

public actual fun clfsLsnRecordSequence(plsn: ConstPtr<ClsLsn>): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsLsnRecordSequence(plsn.rawAddress).toUInt()

public actual fun clfsMgmtDeregisterManagedClient(clientcookie: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsMgmtDeregisterManagedClient(clientcookie.rawAddress)

public actual fun clfsMgmtHandleLogFileFull(client: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsMgmtHandleLogFileFull(client.rawAddress)

public actual fun clfsMgmtInstallPolicy(logfile: ConstPtr<FileObject>, policy: ConstPtr<ClfsMgmtPolicy>, policylength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsMgmtInstallPolicy(logfile.rawAddress, policy.rawAddress, policylength.toInt())

public actual fun clfsMgmtQueryPolicy(logfile: ConstPtr<FileObject>, policytype: ClfsMgmtPolicyType, policy: MutPtr<ClfsMgmtPolicy>, policylength: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsMgmtQueryPolicy(logfile.rawAddress, policytype, policy.rawAddress, policylength.rawAddress)

public actual fun clfsMgmtRegisterManagedClient(logfile: ConstPtr<FileObject>, registrationdata: ConstPtr<ClfsMgmtClientRegistration>, clientcookie: MutPtr<MutPtr<CVoid>>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsMgmtRegisterManagedClient(logfile.rawAddress, registrationdata.rawAddress, clientcookie.rawAddress)

public actual fun clfsMgmtRemovePolicy(logfile: ConstPtr<FileObject>, policytype: ClfsMgmtPolicyType): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsMgmtRemovePolicy(logfile.rawAddress, policytype)

public actual fun clfsMgmtSetLogFileSize(logfile: ConstPtr<FileObject>, newsizeincontainers: ConstPtr<ULong>, resultingsizeincontainers: MutPtr<ULong>, completionroutine: PclfsSetLogSizeCompleteCallback, completionroutinedata: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsMgmtSetLogFileSize(logfile.rawAddress, newsizeincontainers.rawAddress, resultingsizeincontainers.rawAddress, 0L, completionroutinedata.rawAddress)

public actual fun clfsMgmtSetLogFileSizeAsClient(logfile: ConstPtr<FileObject>, clientcookie: ConstPtr<ConstPtr<CVoid>>, newsizeincontainers: ConstPtr<ULong>, resultingsizeincontainers: MutPtr<ULong>, completionroutine: PclfsSetLogSizeCompleteCallback, completionroutinedata: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsMgmtSetLogFileSizeAsClient(logfile.rawAddress, clientcookie.rawAddress, newsizeincontainers.rawAddress, resultingsizeincontainers.rawAddress, 0L, completionroutinedata.rawAddress)

public actual fun clfsMgmtTailAdvanceFailure(client: ConstPtr<CVoid>, reason: Ntstatus): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsMgmtTailAdvanceFailure(client.rawAddress, reason)

public actual fun clfsQueryLogFileInformation(plfolog: ConstPtr<FileObject>, einformationclass: ClsLogInformationClass, pinfoinputbuffer: ConstPtr<CVoid>, cbinfoinputbuffer: UInt, pinfobuffer: MutPtr<CVoid>, pcbinfobuffer: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsQueryLogFileInformation(plfolog.rawAddress, einformationclass, pinfoinputbuffer.rawAddress, cbinfoinputbuffer.toInt(), pinfobuffer.rawAddress, pcbinfobuffer.rawAddress)

public actual fun clfsReadLogRecord(pvmarshalcontext: ConstPtr<CVoid>, plsnfirst: MutPtr<ClsLsn>, pecontextmode: ClfsContextMode, ppvreadbuffer: MutPtr<MutPtr<CVoid>>, pcbreadbuffer: MutPtr<UInt>, perecordtype: MutPtr<UByte>, plsnundonext: MutPtr<ClsLsn>, plsnprevious: MutPtr<ClsLsn>, ppvreadcontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsReadLogRecord(pvmarshalcontext.rawAddress, plsnfirst.rawAddress, pecontextmode, ppvreadbuffer.rawAddress, pcbreadbuffer.rawAddress, perecordtype.rawAddress, plsnundonext.rawAddress, plsnprevious.rawAddress, ppvreadcontext.rawAddress)

public actual fun clfsReadNextLogRecord(pvreadcontext: MutPtr<CVoid>, ppvbuffer: MutPtr<MutPtr<CVoid>>, pcbbuffer: MutPtr<UInt>, perecordtype: MutPtr<UByte>, plsnuser: ConstPtr<ClsLsn>, plsnundonext: MutPtr<ClsLsn>, plsnprevious: MutPtr<ClsLsn>, plsnrecord: MutPtr<ClsLsn>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsReadNextLogRecord(pvreadcontext.rawAddress, ppvbuffer.rawAddress, pcbbuffer.rawAddress, perecordtype.rawAddress, plsnuser.rawAddress, plsnundonext.rawAddress, plsnprevious.rawAddress, plsnrecord.rawAddress)

public actual fun clfsReadPreviousRestartArea(pvreadcontext: ConstPtr<CVoid>, ppvrestartbuffer: MutPtr<MutPtr<CVoid>>, pcbrestartbuffer: MutPtr<UInt>, plsnrestart: MutPtr<ClsLsn>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsReadPreviousRestartArea(pvreadcontext.rawAddress, ppvrestartbuffer.rawAddress, pcbrestartbuffer.rawAddress, plsnrestart.rawAddress)

public actual fun clfsReadRestartArea(pvmarshalcontext: MutPtr<CVoid>, ppvrestartbuffer: MutPtr<MutPtr<CVoid>>, pcbrestartbuffer: MutPtr<UInt>, plsn: MutPtr<ClsLsn>, ppvreadcontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsReadRestartArea(pvmarshalcontext.rawAddress, ppvrestartbuffer.rawAddress, pcbrestartbuffer.rawAddress, plsn.rawAddress, ppvreadcontext.rawAddress)

public actual fun clfsRemoveLogContainer(plfolog: ConstPtr<FileObject>, puszcontainerpath: ConstPtr<UnicodeString>, fforce: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsRemoveLogContainer(plfolog.rawAddress, puszcontainerpath.rawAddress, fforce)

public actual fun clfsRemoveLogContainerSet(plfolog: ConstPtr<FileObject>, ccontainers: UShort, rgwszcontainerpath: ConstPtr<UnicodeString>, fforce: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsRemoveLogContainerSet(plfolog.rawAddress, ccontainers.toShort(), rgwszcontainerpath.rawAddress, fforce)

public actual fun clfsReserveAndAppendLog(pvmarshalcontext: ConstPtr<CVoid>, rgwriteentries: ConstPtr<ClsWriteEntry>, cwriteentries: UInt, plsnundonext: ConstPtr<ClsLsn>, plsnprevious: ConstPtr<ClsLsn>, creserverecords: UInt, rgcbreservation: MutPtr<Long>, fflags: UInt, plsn: MutPtr<ClsLsn>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsReserveAndAppendLog(pvmarshalcontext.rawAddress, rgwriteentries.rawAddress, cwriteentries.toInt(), plsnundonext.rawAddress, plsnprevious.rawAddress, creserverecords.toInt(), rgcbreservation.rawAddress, fflags.toInt(), plsn.rawAddress)

public actual fun clfsReserveAndAppendLogAligned(pvmarshalcontext: ConstPtr<CVoid>, rgwriteentries: ConstPtr<ClsWriteEntry>, cwriteentries: UInt, cbentryalignment: UInt, plsnundonext: ConstPtr<ClsLsn>, plsnprevious: ConstPtr<ClsLsn>, creserverecords: UInt, rgcbreservation: MutPtr<Long>, fflags: UInt, plsn: MutPtr<ClsLsn>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsReserveAndAppendLogAligned(pvmarshalcontext.rawAddress, rgwriteentries.rawAddress, cwriteentries.toInt(), cbentryalignment.toInt(), plsnundonext.rawAddress, plsnprevious.rawAddress, creserverecords.toInt(), rgcbreservation.rawAddress, fflags.toInt(), plsn.rawAddress)

public actual fun clfsScanLogContainers(pcxscan: MutPtr<ClsScanContext>, escanmode: UByte): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsScanLogContainers(pcxscan.rawAddress, escanmode.toByte())

public actual fun clfsSetArchiveTail(plfolog: ConstPtr<FileObject>, plsnarchivetail: ConstPtr<ClsLsn>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsSetArchiveTail(plfolog.rawAddress, plsnarchivetail.rawAddress)

public actual fun clfsSetEndOfLog(plfolog: ConstPtr<FileObject>, plsnend: ConstPtr<ClsLsn>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsSetEndOfLog(plfolog.rawAddress, plsnend.rawAddress)

public actual fun clfsSetLogFileInformation(plfolog: ConstPtr<FileObject>, einformationclass: ClsLogInformationClass, pinfobuffer: ConstPtr<CVoid>, cbbuffer: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsSetLogFileInformation(plfolog.rawAddress, einformationclass, pinfobuffer.rawAddress, cbbuffer.toInt())

public actual fun clfsTerminateReadLog(pvcursorcontext: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsTerminateReadLog(pvcursorcontext.rawAddress)

public actual fun clfsWriteRestartArea(pvmarshalcontext: MutPtr<CVoid>, pvrestartbuffer: ConstPtr<CVoid>, cbrestartbuffer: UInt, plsnbase: ConstPtr<ClsLsn>, fflags: UInt, pcbwritten: MutPtr<UInt>, plsnnext: MutPtr<ClsLsn>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesClfsWriteRestartArea(pvmarshalcontext.rawAddress, pvrestartbuffer.rawAddress, cbrestartbuffer.toInt(), plsnbase.rawAddress, fflags.toInt(), pcbwritten.rawAddress, plsnnext.rawAddress)

public actual fun cmCallbackGetKeyObjectID(cookie: ConstPtr<Long>, obj: ConstPtr<CVoid>, objectid: MutPtr<ULong>, objectname: MutPtr<MutPtr<UnicodeString>>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesCmCallbackGetKeyObjectID(cookie.rawAddress, obj.rawAddress, objectid.rawAddress, objectname.rawAddress)

public actual fun cmCallbackGetKeyObjectIDEx(cookie: ConstPtr<Long>, obj: ConstPtr<CVoid>, objectid: MutPtr<ULong>, objectname: MutPtr<MutPtr<UnicodeString>>, flags: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesCmCallbackGetKeyObjectIDEx(cookie.rawAddress, obj.rawAddress, objectid.rawAddress, objectname.rawAddress, flags.toInt())

public actual fun cmCallbackReleaseKeyObjectIDEx(objectname: ConstPtr<UnicodeString>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesCmCallbackReleaseKeyObjectIDEx(objectname.rawAddress)
}

public actual fun cmGetBoundTransaction(cookie: ConstPtr<Long>, obj: ConstPtr<CVoid>): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesCmGetBoundTransaction(cookie.rawAddress, obj.rawAddress))

public actual fun cmGetCallbackVersion(major: MutPtr<UInt>, minor: MutPtr<UInt>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesCmGetCallbackVersion(major.rawAddress, minor.rawAddress)
}

public actual fun cmRegisterCallback(function: PexCallbackFunction, context: ConstPtr<CVoid>, cookie: MutPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesCmRegisterCallback(0L, context.rawAddress, cookie.rawAddress)

public actual fun cmRegisterCallbackEx(function: PexCallbackFunction, altitude: ConstPtr<UnicodeString>, driver: ConstPtr<CVoid>, context: ConstPtr<CVoid>, cookie: MutPtr<Long>, reserved: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesCmRegisterCallbackEx(0L, altitude.rawAddress, driver.rawAddress, context.rawAddress, cookie.rawAddress, reserved.rawAddress)

public actual fun cmSetCallbackObjectContext(obj: MutPtr<CVoid>, cookie: ConstPtr<Long>, newcontext: ConstPtr<CVoid>, oldcontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
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

public actual fun etwActivityIdControl(controlcode: UInt, activityid: MutPtr<Guid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesEtwActivityIdControl(controlcode.toInt(), activityid.rawAddress)

public actual fun etwEventEnabled(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesEtwEventEnabled(reghandle, eventdescriptor.rawAddress)

public actual fun etwProviderEnabled(reghandle: Reghandle, level: UByte, keyword: ULong): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesEtwProviderEnabled(reghandle, level.toByte(), keyword.toLong())

public actual fun etwRegister(providerid: ConstPtr<Guid>, enablecallback: Petwenablecallback, callbackcontext: ConstPtr<CVoid>, reghandle: MutPtr<Reghandle>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesEtwRegister(providerid.rawAddress, 0L, callbackcontext.rawAddress, reghandle.rawAddress)

public actual fun etwSetInformation(reghandle: Reghandle, informationclass: EventInfoClass, eventinformation: ConstPtr<CVoid>, informationlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesEtwSetInformation(reghandle, informationclass, eventinformation.rawAddress, informationlength.toInt())

public actual fun etwUnregister(reghandle: Reghandle): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesEtwUnregister(reghandle)

public actual fun etwWrite(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>, activityid: ConstPtr<Guid>, userdatacount: UInt, userdata: ConstPtr<EventDataDescriptor>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesEtwWrite(reghandle, eventdescriptor.rawAddress, activityid.rawAddress, userdatacount.toInt(), userdata.rawAddress)

public actual fun etwWriteEx(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>, filter: ULong, flags: UInt, activityid: ConstPtr<Guid>, relatedactivityid: ConstPtr<Guid>, userdatacount: UInt, userdata: ConstPtr<EventDataDescriptor>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesEtwWriteEx(reghandle, eventdescriptor.rawAddress, filter.toLong(), flags.toInt(), activityid.rawAddress, relatedactivityid.rawAddress, userdatacount.toInt(), userdata.rawAddress)

public actual fun etwWriteString(reghandle: Reghandle, level: UByte, keyword: ULong, activityid: ConstPtr<Guid>, string: Pcwstr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesEtwWriteString(reghandle, level.toByte(), keyword.toLong(), activityid.rawAddress, string.rawAddress)

public actual fun etwWriteTransfer(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>, activityid: ConstPtr<Guid>, relatedactivityid: ConstPtr<Guid>, userdatacount: UInt, userdata: ConstPtr<EventDataDescriptor>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesEtwWriteTransfer(reghandle, eventdescriptor.rawAddress, activityid.rawAddress, relatedactivityid.rawAddress, userdatacount.toInt(), userdata.rawAddress)

public actual fun exAcquireFastMutex(fastmutex: MutPtr<FastMutex>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAcquireFastMutex(fastmutex.rawAddress)
}

public actual fun exAcquireFastMutexUnsafe(fastmutex: MutPtr<FastMutex>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAcquireFastMutexUnsafe(fastmutex.rawAddress)
}

public actual fun exAcquirePushLockExclusiveEx(pushlock: MutPtr<ULong>, flags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAcquirePushLockExclusiveEx(pushlock.rawAddress, flags.toInt())
}

public actual fun exAcquirePushLockSharedEx(pushlock: MutPtr<ULong>, flags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAcquirePushLockSharedEx(pushlock.rawAddress, flags.toInt())
}

public actual fun exAcquireResourceExclusiveLite(resource: MutPtr<Eresource>, wait: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAcquireResourceExclusiveLite(resource.rawAddress, wait)

public actual fun exAcquireResourceSharedLite(resource: MutPtr<Eresource>, wait: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAcquireResourceSharedLite(resource.rawAddress, wait)

public actual fun exAcquireRundownProtection(runref: MutPtr<ExRundownRef>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAcquireRundownProtection(runref.rawAddress)

public actual fun exAcquireRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAcquireRundownProtectionCacheAware(runrefcacheaware)

public actual fun exAcquireRundownProtectionCacheAwareEx(runrefcacheaware: PexRundownRefCacheAware, count: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAcquireRundownProtectionCacheAwareEx(runrefcacheaware, count.toInt())

public actual fun exAcquireRundownProtectionEx(runref: MutPtr<ExRundownRef>, count: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAcquireRundownProtectionEx(runref.rawAddress, count.toInt())

public actual fun exAcquireSharedStarveExclusive(resource: MutPtr<Eresource>, wait: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAcquireSharedStarveExclusive(resource.rawAddress, wait)

public actual fun exAcquireSharedWaitForExclusive(resource: MutPtr<Eresource>, wait: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAcquireSharedWaitForExclusive(resource.rawAddress, wait)

public actual fun exAcquireSpinLockExclusive(spinlock: MutPtr<Int>): UByte =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAcquireSpinLockExclusive(spinlock.rawAddress).toUByte()

public actual fun exAcquireSpinLockExclusiveAtDpcLevel(spinlock: MutPtr<Int>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAcquireSpinLockExclusiveAtDpcLevel(spinlock.rawAddress)
}

public actual fun exAcquireSpinLockShared(spinlock: MutPtr<Int>): UByte =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAcquireSpinLockShared(spinlock.rawAddress).toUByte()

public actual fun exAcquireSpinLockSharedAtDpcLevel(spinlock: MutPtr<Int>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAcquireSpinLockSharedAtDpcLevel(spinlock.rawAddress)
}

public actual fun exAllocateCacheAwareRundownProtection(pooltype: PoolType, pooltag: UInt): PexRundownRefCacheAware =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAllocateCacheAwareRundownProtection(pooltype, pooltag.toInt())

public actual fun exAllocatePool(pooltype: PoolType, numberofbytes: ULong): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAllocatePool(pooltype, numberofbytes.toLong()))

public actual fun exAllocatePool2(flags: ULong, numberofbytes: ULong, tag: UInt): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAllocatePool2(flags.toLong(), numberofbytes.toLong(), tag.toInt()))

public actual fun exAllocatePool3(flags: ULong, numberofbytes: ULong, tag: UInt, extendedparameters: ConstPtr<PoolExtendedParameter>, extendedparameterscount: UInt): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAllocatePool3(flags.toLong(), numberofbytes.toLong(), tag.toInt(), extendedparameters.rawAddress, extendedparameterscount.toInt()))

public actual fun exAllocatePoolWithQuota(pooltype: PoolType, numberofbytes: ULong): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAllocatePoolWithQuota(pooltype, numberofbytes.toLong()))

public actual fun exAllocatePoolWithQuotaTag(pooltype: PoolType, numberofbytes: ULong, tag: UInt): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAllocatePoolWithQuotaTag(pooltype, numberofbytes.toLong(), tag.toInt()))

public actual fun exAllocatePoolWithTag(pooltype: PoolType, numberofbytes: ULong, tag: UInt): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAllocatePoolWithTag(pooltype, numberofbytes.toLong(), tag.toInt()))

public actual fun exAllocatePoolWithTagPriority(pooltype: PoolType, numberofbytes: ULong, tag: UInt, priority: ExPoolPriority): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAllocatePoolWithTagPriority(pooltype, numberofbytes.toLong(), tag.toInt(), priority))

public actual fun exAllocateTimer(callback: PextCallback, callbackcontext: ConstPtr<CVoid>, attributes: UInt): PexTimer =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExAllocateTimer(0L, callbackcontext.rawAddress, attributes.toInt())

public actual fun exCancelTimer(timer: PexTimer, parameters: ConstPtr<CVoid>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExCancelTimer(timer, parameters.rawAddress)

public actual fun exCleanupRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExCleanupRundownProtectionCacheAware(runrefcacheaware)
}

public actual fun exConvertExclusiveToSharedLite(resource: MutPtr<Eresource>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExConvertExclusiveToSharedLite(resource.rawAddress)
}

public actual fun exCreateCallback(callbackobject: MutPtr<PcallbackObject>, objectattributes: ConstPtr<ObjectAttributes>, create: Boolean, allowmultiplecallbacks: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExCreateCallback(callbackobject.rawAddress, objectattributes.rawAddress, create, allowmultiplecallbacks)

public actual fun exCreatePool(flags: UInt, tag: ULong, params: ConstPtr<PoolCreateExtendedParams>, poolhandle: MutPtr<Handle>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExCreatePool(flags.toInt(), tag.toLong(), params.rawAddress, poolhandle.rawAddress)

public actual fun exDeleteResourceLite(resource: MutPtr<Eresource>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExDeleteResourceLite(resource.rawAddress)

public actual fun exDeleteTimer(timer: PexTimer, cancel: Boolean, wait: Boolean, parameters: ConstPtr<ExtDeleteParameters>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExDeleteTimer(timer, cancel, wait, parameters.rawAddress)

public actual fun exDestroyPool(poolhandle: Handle) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExDestroyPool(poolhandle.rawAddress)
}

public actual fun exEnterCriticalRegionAndAcquireResourceExclusive(resource: MutPtr<Eresource>): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExEnterCriticalRegionAndAcquireResourceExclusive(resource.rawAddress))

public actual fun exEnterCriticalRegionAndAcquireResourceShared(resource: MutPtr<Eresource>): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExEnterCriticalRegionAndAcquireResourceShared(resource.rawAddress))

public actual fun exEnterCriticalRegionAndAcquireSharedWaitForExclusive(resource: MutPtr<Eresource>): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExEnterCriticalRegionAndAcquireSharedWaitForExclusive(resource.rawAddress))

public actual fun exEnumerateSystemFirmwareTables(firmwaretableprovidersignature: UInt, firmwaretablebuffer: MutPtr<CVoid>, bufferlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExEnumerateSystemFirmwareTables(firmwaretableprovidersignature.toInt(), firmwaretablebuffer.rawAddress, bufferlength.toInt(), returnlength.rawAddress)

public actual fun exExtendZone(zone: MutPtr<ZoneHeader>, segment: MutPtr<CVoid>, segmentsize: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExExtendZone(zone.rawAddress, segment.rawAddress, segmentsize.toInt())

public actual fun exFreeCacheAwareRundownProtection(runrefcacheaware: PexRundownRefCacheAware) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExFreeCacheAwareRundownProtection(runrefcacheaware)
}

public actual fun exFreePool(p: MutPtr<CVoid>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExFreePool(p.rawAddress)
}

public actual fun exFreePool2(p: MutPtr<CVoid>, tag: UInt, extendedparameters: ConstPtr<PoolExtendedParameter>, extendedparameterscount: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExFreePool2(p.rawAddress, tag.toInt(), extendedparameters.rawAddress, extendedparameterscount.toInt())
}

public actual fun exFreePoolWithTag(p: MutPtr<CVoid>, tag: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExFreePoolWithTag(p.rawAddress, tag.toInt())
}

public actual fun exGetExclusiveWaiterCount(resource: ConstPtr<Eresource>): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExGetExclusiveWaiterCount(resource.rawAddress).toUInt()

public actual fun exGetFirmwareEnvironmentVariable(variablename: ConstPtr<UnicodeString>, vendorguid: ConstPtr<Guid>, value: MutPtr<CVoid>, valuelength: MutPtr<UInt>, attributes: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExGetFirmwareEnvironmentVariable(variablename.rawAddress, vendorguid.rawAddress, value.rawAddress, valuelength.rawAddress, attributes.rawAddress)

public actual fun exGetFirmwareType(): FirmwareType =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExGetFirmwareType()

public actual fun exGetPreviousMode(): Byte =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExGetPreviousMode()

public actual fun exGetSharedWaiterCount(resource: ConstPtr<Eresource>): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExGetSharedWaiterCount(resource.rawAddress).toUInt()

public actual fun exGetSystemFirmwareTable(firmwaretableprovidersignature: UInt, firmwaretableid: UInt, firmwaretablebuffer: MutPtr<CVoid>, bufferlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExGetSystemFirmwareTable(firmwaretableprovidersignature.toInt(), firmwaretableid.toInt(), firmwaretablebuffer.rawAddress, bufferlength.toInt(), returnlength.rawAddress)

public actual fun exInitializePushLock(pushlock: MutPtr<ULong>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExInitializePushLock(pushlock.rawAddress)
}

public actual fun exInitializeResourceLite(resource: MutPtr<Eresource>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExInitializeResourceLite(resource.rawAddress)

public actual fun exInitializeRundownProtection(runref: MutPtr<ExRundownRef>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExInitializeRundownProtection(runref.rawAddress)
}

public actual fun exInitializeRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware, runrefsize: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExInitializeRundownProtectionCacheAware(runrefcacheaware, runrefsize.toLong())
}

public actual fun exInitializeRundownProtectionCacheAwareEx(runrefcacheaware: PexRundownRefCacheAware, flags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExInitializeRundownProtectionCacheAwareEx(runrefcacheaware, flags.toInt())
}

public actual fun exInitializeZone(zone: MutPtr<ZoneHeader>, blocksize: UInt, initialsegment: MutPtr<CVoid>, initialsegmentsize: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExInitializeZone(zone.rawAddress, blocksize.toInt(), initialsegment.rawAddress, initialsegmentsize.toInt())

public actual fun exInterlockedAddLargeInteger(addend: MutPtr<Long>, increment: Long, lock: MutPtr<ULong>): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExInterlockedAddLargeInteger(addend.rawAddress, increment, lock.rawAddress)

public actual fun exInterlockedExtendZone(zone: MutPtr<ZoneHeader>, segment: MutPtr<CVoid>, segmentsize: UInt, lock: MutPtr<ULong>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExInterlockedExtendZone(zone.rawAddress, segment.rawAddress, segmentsize.toInt(), lock.rawAddress)

public actual fun exIsManufacturingModeEnabled(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExIsManufacturingModeEnabled()

public actual fun exIsProcessorFeaturePresent(processorfeature: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExIsProcessorFeaturePresent(processorfeature.toInt())

public actual fun exIsResourceAcquiredExclusiveLite(resource: ConstPtr<Eresource>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExIsResourceAcquiredExclusiveLite(resource.rawAddress)

public actual fun exIsResourceAcquiredSharedLite(resource: ConstPtr<Eresource>): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExIsResourceAcquiredSharedLite(resource.rawAddress).toUInt()

public actual fun exIsSoftBoot(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExIsSoftBoot()

public actual fun exLocalTimeToSystemTime(localtime: ConstPtr<Long>, systemtime: MutPtr<Long>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExLocalTimeToSystemTime(localtime.rawAddress, systemtime.rawAddress)
}

public actual fun exNotifyCallback(callbackobject: ConstPtr<CVoid>, argument1: ConstPtr<CVoid>, argument2: ConstPtr<CVoid>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExNotifyCallback(callbackobject.rawAddress, argument1.rawAddress, argument2.rawAddress)
}

public actual fun exQueryTimerResolution(maximumtime: MutPtr<UInt>, minimumtime: MutPtr<UInt>, currenttime: MutPtr<UInt>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExQueryTimerResolution(maximumtime.rawAddress, minimumtime.rawAddress, currenttime.rawAddress)
}

public actual fun exQueueWorkItem(workitem: MutPtr<WorkQueueItem>, queuetype: WorkQueueType) {
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

public actual fun exReInitializeRundownProtection(runref: MutPtr<ExRundownRef>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExReInitializeRundownProtection(runref.rawAddress)
}

public actual fun exReInitializeRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExReInitializeRundownProtectionCacheAware(runrefcacheaware)
}

public actual fun exRegisterCallback(callbackobject: PcallbackObject, callbackfunction: PcallbackFunction, callbackcontext: ConstPtr<CVoid>): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExRegisterCallback(callbackobject, 0L, callbackcontext.rawAddress))

public actual fun exReinitializeResourceLite(resource: MutPtr<Eresource>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExReinitializeResourceLite(resource.rawAddress)

public actual fun exReleaseFastMutex(fastmutex: MutPtr<FastMutex>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExReleaseFastMutex(fastmutex.rawAddress)
}

public actual fun exReleaseFastMutexUnsafe(fastmutex: MutPtr<FastMutex>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExReleaseFastMutexUnsafe(fastmutex.rawAddress)
}

public actual fun exReleasePushLockExclusiveEx(pushlock: MutPtr<ULong>, flags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExReleasePushLockExclusiveEx(pushlock.rawAddress, flags.toInt())
}

public actual fun exReleasePushLockSharedEx(pushlock: MutPtr<ULong>, flags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExReleasePushLockSharedEx(pushlock.rawAddress, flags.toInt())
}

public actual fun exReleaseResourceAndLeaveCriticalRegion(resource: MutPtr<Eresource>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExReleaseResourceAndLeaveCriticalRegion(resource.rawAddress)
}

public actual fun exReleaseResourceForThreadLite(resource: MutPtr<Eresource>, resourcethreadid: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExReleaseResourceForThreadLite(resource.rawAddress, resourcethreadid.toLong())
}

public actual fun exReleaseResourceLite(resource: MutPtr<Eresource>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExReleaseResourceLite(resource.rawAddress)
}

public actual fun exReleaseRundownProtection(runref: MutPtr<ExRundownRef>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExReleaseRundownProtection(runref.rawAddress)
}

public actual fun exReleaseRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExReleaseRundownProtectionCacheAware(runrefcacheaware)
}

public actual fun exReleaseRundownProtectionCacheAwareEx(runref: PexRundownRefCacheAware, count: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExReleaseRundownProtectionCacheAwareEx(runref, count.toInt())
}

public actual fun exReleaseRundownProtectionEx(runref: MutPtr<ExRundownRef>, count: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExReleaseRundownProtectionEx(runref.rawAddress, count.toInt())
}

public actual fun exReleaseSpinLockExclusive(spinlock: MutPtr<Int>, oldirql: UByte) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExReleaseSpinLockExclusive(spinlock.rawAddress, oldirql.toByte())
}

public actual fun exReleaseSpinLockExclusiveFromDpcLevel(spinlock: MutPtr<Int>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExReleaseSpinLockExclusiveFromDpcLevel(spinlock.rawAddress)
}

public actual fun exReleaseSpinLockShared(spinlock: MutPtr<Int>, oldirql: UByte) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExReleaseSpinLockShared(spinlock.rawAddress, oldirql.toByte())
}

public actual fun exReleaseSpinLockSharedFromDpcLevel(spinlock: MutPtr<Int>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExReleaseSpinLockSharedFromDpcLevel(spinlock.rawAddress)
}

public actual fun exRundownCompleted(runref: MutPtr<ExRundownRef>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExRundownCompleted(runref.rawAddress)
}

public actual fun exRundownCompletedCacheAware(runrefcacheaware: PexRundownRefCacheAware) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExRundownCompletedCacheAware(runrefcacheaware)
}

public actual fun exSecurePoolUpdate(securepoolhandle: Handle, tag: UInt, allocation: ConstPtr<CVoid>, cookie: ULong, offset: ULong, size: ULong, buffer: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExSecurePoolUpdate(securepoolhandle.rawAddress, tag.toInt(), allocation.rawAddress, cookie.toLong(), offset.toLong(), size.toLong(), buffer.rawAddress)

public actual fun exSecurePoolValidate(securepoolhandle: Handle, tag: UInt, allocation: ConstPtr<CVoid>, cookie: ULong): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExSecurePoolValidate(securepoolhandle.rawAddress, tag.toInt(), allocation.rawAddress, cookie.toLong()).toUInt()

public actual fun exSetFirmwareEnvironmentVariable(variablename: ConstPtr<UnicodeString>, vendorguid: ConstPtr<Guid>, value: ConstPtr<CVoid>, valuelength: UInt, attributes: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExSetFirmwareEnvironmentVariable(variablename.rawAddress, vendorguid.rawAddress, value.rawAddress, valuelength.toInt(), attributes.toInt())

public actual fun exSetResourceOwnerPointer(resource: MutPtr<Eresource>, ownerpointer: ConstPtr<CVoid>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExSetResourceOwnerPointer(resource.rawAddress, ownerpointer.rawAddress)
}

public actual fun exSetResourceOwnerPointerEx(resource: MutPtr<Eresource>, ownerpointer: ConstPtr<CVoid>, flags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExSetResourceOwnerPointerEx(resource.rawAddress, ownerpointer.rawAddress, flags.toInt())
}

public actual fun exSetTimer(timer: PexTimer, duetime: Long, period: Long, parameters: ConstPtr<ExtSetParametersV0>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExSetTimer(timer, duetime, period, parameters.rawAddress)

public actual fun exSetTimerResolution(desiredtime: UInt, setresolution: Boolean): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExSetTimerResolution(desiredtime.toInt(), setresolution).toUInt()

public actual fun exSizeOfRundownProtectionCacheAware(): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExSizeOfRundownProtectionCacheAware().toULong()

public actual fun exSystemTimeToLocalTime(systemtime: ConstPtr<Long>, localtime: MutPtr<Long>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExSystemTimeToLocalTime(systemtime.rawAddress, localtime.rawAddress)
}

public actual fun exTryAcquireSpinLockExclusiveAtDpcLevel(spinlock: MutPtr<Int>): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExTryAcquireSpinLockExclusiveAtDpcLevel(spinlock.rawAddress).toUInt()

public actual fun exTryAcquireSpinLockSharedAtDpcLevel(spinlock: MutPtr<Int>): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExTryAcquireSpinLockSharedAtDpcLevel(spinlock.rawAddress).toUInt()

public actual fun exTryConvertSharedSpinLockExclusive(spinlock: MutPtr<Int>): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExTryConvertSharedSpinLockExclusive(spinlock.rawAddress).toUInt()

public actual fun exTryToAcquireFastMutex(fastmutex: MutPtr<FastMutex>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExTryToAcquireFastMutex(fastmutex.rawAddress)

public actual fun exUnregisterCallback(callbackregistration: MutPtr<CVoid>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExUnregisterCallback(callbackregistration.rawAddress)
}

public actual fun exUuidCreate(uuid: MutPtr<Guid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExUuidCreate(uuid.rawAddress)

public actual fun exVerifySuite(suitetype: SuiteType): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesExVerifySuite(suitetype)

public actual fun exWaitForRundownProtectionRelease(runref: MutPtr<ExRundownRef>) {
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

public actual fun halAllocateAdapterChannel(adapterobject: ConstPtr<AdapterObject>, wcb: ConstPtr<WaitContextBlock>, numberofmapregisters: UInt, executionroutine: DriverControl): Ntstatus =
    0

public actual fun halAllocateCommonBuffer(adapterobject: ConstPtr<AdapterObject>, length: UInt, logicaladdress: MutPtr<Long>, cacheenabled: Boolean): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesHalAllocateCommonBuffer(adapterobject.rawAddress, length.toInt(), logicaladdress.rawAddress, cacheenabled))

public actual fun halAllocateCrashDumpRegisters(adapterobject: ConstPtr<AdapterObject>, numberofmapregisters: MutPtr<UInt>): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesHalAllocateCrashDumpRegisters(adapterobject.rawAddress, numberofmapregisters.rawAddress))

public actual fun halAllocateHardwareCounters(groupaffinty: ConstPtr<GroupAffinity>, groupcount: UInt, resourcelist: ConstPtr<PhysicalCounterResourceList>, countersethandle: MutPtr<Handle>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesHalAllocateHardwareCounters(groupaffinty.rawAddress, groupcount.toInt(), resourcelist.rawAddress, countersethandle.rawAddress)

public actual fun halAssignSlotResources(registrypath: ConstPtr<UnicodeString>, driverclassname: ConstPtr<UnicodeString>, driverobject: ConstPtr<DriverObject>, deviceobject: ConstPtr<DeviceObject>, bustype: InterfaceType, busnumber: UInt, slotnumber: UInt, allocatedresources: MutPtr<MutPtr<CmResourceList>>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesHalAssignSlotResources(registrypath.rawAddress, driverclassname.rawAddress, driverobject.rawAddress, deviceobject.rawAddress, bustype, busnumber.toInt(), slotnumber.toInt(), allocatedresources.rawAddress)

public actual fun halBugCheckSystem(errorsource: ConstPtr<WheaErrorSourceDescriptor>, errorrecord: ConstPtr<WheaErrorRecord>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesHalBugCheckSystem(errorsource.rawAddress, errorrecord.rawAddress)
}

public actual fun halDmaAllocateCrashDumpRegistersEx(adapter: ConstPtr<AdapterObject>, numberofmapregisters: UInt, type: HalDmaCrashDumpRegisterType, mapregisterbase: MutPtr<MutPtr<CVoid>>, mapregistersavailable: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesHalDmaAllocateCrashDumpRegistersEx(adapter.rawAddress, numberofmapregisters.toInt(), type, mapregisterbase.rawAddress, mapregistersavailable.rawAddress)

public actual fun halDmaFreeCrashDumpRegistersEx(adapter: ConstPtr<AdapterObject>, type: HalDmaCrashDumpRegisterType): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesHalDmaFreeCrashDumpRegistersEx(adapter.rawAddress, type)

public actual fun halExamineMBR(deviceobject: ConstPtr<DeviceObject>, sectorsize: UInt, mbrtypeidentifier: UInt, buffer: MutPtr<MutPtr<CVoid>>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesHalExamineMBR(deviceobject.rawAddress, sectorsize.toInt(), mbrtypeidentifier.toInt(), buffer.rawAddress)
}

public actual fun halFreeCommonBuffer(adapterobject: ConstPtr<AdapterObject>, length: UInt, logicaladdress: Long, virtualaddress: ConstPtr<CVoid>, cacheenabled: Boolean) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesHalFreeCommonBuffer(adapterobject.rawAddress, length.toInt(), logicaladdress, virtualaddress.rawAddress, cacheenabled)
}

public actual fun halFreeHardwareCounters(countersethandle: Handle): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesHalFreeHardwareCounters(countersethandle.rawAddress)

public actual fun halGetAdapter(devicedescription: ConstPtr<DeviceDescription>, numberofmapregisters: MutPtr<UInt>): MutPtr<AdapterObject> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesHalGetAdapter(devicedescription.rawAddress, numberofmapregisters.rawAddress))

public actual fun halGetBusData(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: MutPtr<CVoid>, length: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesHalGetBusData(busdatatype, busnumber.toInt(), slotnumber.toInt(), buffer.rawAddress, length.toInt()).toUInt()

public actual fun halGetBusDataByOffset(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: MutPtr<CVoid>, offset: UInt, length: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesHalGetBusDataByOffset(busdatatype, busnumber.toInt(), slotnumber.toInt(), buffer.rawAddress, offset.toInt(), length.toInt()).toUInt()

public actual fun halGetInterruptVector(interfacetype: InterfaceType, busnumber: UInt, businterruptlevel: UInt, businterruptvector: UInt, irql: MutPtr<UByte>, affinity: MutPtr<ULong>): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesHalGetInterruptVector(interfacetype, busnumber.toInt(), businterruptlevel.toInt(), businterruptvector.toInt(), irql.rawAddress, affinity.rawAddress).toUInt()

public actual fun halMakeBeep(frequency: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesHalMakeBeep(frequency.toInt())

public actual fun halReadDmaCounter(adapterobject: ConstPtr<AdapterObject>): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesHalReadDmaCounter(adapterobject.rawAddress).toUInt()

public actual fun halSetBusData(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: ConstPtr<CVoid>, length: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesHalSetBusData(busdatatype, busnumber.toInt(), slotnumber.toInt(), buffer.rawAddress, length.toInt()).toUInt()

public actual fun halSetBusDataByOffset(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: ConstPtr<CVoid>, offset: UInt, length: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesHalSetBusDataByOffset(busdatatype, busnumber.toInt(), slotnumber.toInt(), buffer.rawAddress, offset.toInt(), length.toInt()).toUInt()

public actual fun halTranslateBusAddress(interfacetype: InterfaceType, busnumber: UInt, busaddress: Long, addressspace: MutPtr<UInt>, translatedaddress: MutPtr<Long>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesHalTranslateBusAddress(interfacetype, busnumber.toInt(), busaddress, addressspace.rawAddress, translatedaddress.rawAddress)

public actual fun hvlRegisterWheaErrorNotification(callback: PhvlWheaErrorNotification): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesHvlRegisterWheaErrorNotification(0L)

public actual fun hvlUnregisterWheaErrorNotification(callback: PhvlWheaErrorNotification): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesHvlUnregisterWheaErrorNotification(0L)

public actual fun ioAcquireCancelSpinLock(irql: MutPtr<UByte>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoAcquireCancelSpinLock(irql.rawAddress)
}

public actual fun ioAcquireKsrPersistentMemory(driverobject: ConstPtr<DriverObject>, physicaldeviceobject: ConstPtr<DeviceObject>, buffer: MutPtr<CVoid>, size: MutPtr<ULong>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoAcquireKsrPersistentMemory(driverobject.rawAddress, physicaldeviceobject.rawAddress, buffer.rawAddress, size.rawAddress)

public actual fun ioAcquireKsrPersistentMemoryEx(driverobject: ConstPtr<DriverObject>, physicaldeviceobject: ConstPtr<DeviceObject>, physicaldeviceid: ConstPtr<UnicodeString>, datatag: ConstPtr<UShort>, dataversion: MutPtr<UInt>, buffer: MutPtr<CVoid>, size: MutPtr<ULong>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoAcquireKsrPersistentMemoryEx(driverobject.rawAddress, physicaldeviceobject.rawAddress, physicaldeviceid.rawAddress, datatag.rawAddress, dataversion.rawAddress, buffer.rawAddress, size.rawAddress)

public actual fun ioAcquireRemoveLockEx(removelock: MutPtr<IoRemoveLock>, tag: ConstPtr<CVoid>, file: Pcstr, line: UInt, remlocksize: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoAcquireRemoveLockEx(removelock.rawAddress, tag.rawAddress, file.rawAddress, line.toInt(), remlocksize.toInt())

public actual fun ioAllocateAdapterChannel(adapterobject: ConstPtr<AdapterObject>, deviceobject: ConstPtr<DeviceObject>, numberofmapregisters: UInt, executionroutine: DriverControl, context: ConstPtr<CVoid>): Ntstatus =
    0

public actual fun ioAllocateController(controllerobject: ConstPtr<ControllerObject>, deviceobject: ConstPtr<DeviceObject>, executionroutine: DriverControl, context: ConstPtr<CVoid>) {
}

public actual fun ioAllocateDriverObjectExtension(driverobject: ConstPtr<DriverObject>, clientidentificationaddress: ConstPtr<CVoid>, driverobjectextensionsize: UInt, driverobjectextension: MutPtr<MutPtr<CVoid>>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoAllocateDriverObjectExtension(driverobject.rawAddress, clientidentificationaddress.rawAddress, driverobjectextensionsize.toInt(), driverobjectextension.rawAddress)

public actual fun ioAllocateErrorLogEntry(ioobject: ConstPtr<CVoid>, entrysize: UByte): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoAllocateErrorLogEntry(ioobject.rawAddress, entrysize.toByte()))

public actual fun ioAllocateIrp(stacksize: Byte, chargequota: Boolean): MutPtr<Irp> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoAllocateIrp(stacksize, chargequota))

public actual fun ioAllocateIrpEx(deviceobject: ConstPtr<DeviceObject>, stacksize: Byte, chargequota: Boolean): MutPtr<Irp> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoAllocateIrpEx(deviceobject.rawAddress, stacksize, chargequota))

public actual fun ioAllocateMdl(virtualaddress: ConstPtr<CVoid>, length: UInt, secondarybuffer: Boolean, chargequota: Boolean, irp: MutPtr<Irp>): MutPtr<Mdl> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoAllocateMdl(virtualaddress.rawAddress, length.toInt(), secondarybuffer, chargequota, irp.rawAddress))

public actual fun ioAllocateSfioStreamIdentifier(fileobject: ConstPtr<FileObject>, length: UInt, signature: ConstPtr<CVoid>, streamidentifier: MutPtr<MutPtr<CVoid>>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoAllocateSfioStreamIdentifier(fileobject.rawAddress, length.toInt(), signature.rawAddress, streamidentifier.rawAddress)

public actual fun ioAllocateWorkItem(deviceobject: ConstPtr<DeviceObject>): PioWorkitem =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoAllocateWorkItem(deviceobject.rawAddress)

public actual fun ioAssignResources(registrypath: ConstPtr<UnicodeString>, driverclassname: ConstPtr<UnicodeString>, driverobject: ConstPtr<DriverObject>, deviceobject: ConstPtr<DeviceObject>, requestedresources: ConstPtr<IoResourceRequirementsList>, allocatedresources: MutPtr<MutPtr<CmResourceList>>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoAssignResources(registrypath.rawAddress, driverclassname.rawAddress, driverobject.rawAddress, deviceobject.rawAddress, requestedresources.rawAddress, allocatedresources.rawAddress)

public actual fun ioAttachDevice(sourcedevice: ConstPtr<DeviceObject>, targetdevice: ConstPtr<UnicodeString>, attacheddevice: MutPtr<MutPtr<DeviceObject>>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoAttachDevice(sourcedevice.rawAddress, targetdevice.rawAddress, attacheddevice.rawAddress)

public actual fun ioAttachDeviceByPointer(sourcedevice: ConstPtr<DeviceObject>, targetdevice: ConstPtr<DeviceObject>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoAttachDeviceByPointer(sourcedevice.rawAddress, targetdevice.rawAddress)

public actual fun ioAttachDeviceToDeviceStack(sourcedevice: ConstPtr<DeviceObject>, targetdevice: ConstPtr<DeviceObject>): MutPtr<DeviceObject> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoAttachDeviceToDeviceStack(sourcedevice.rawAddress, targetdevice.rawAddress))

public actual fun ioAttachDeviceToDeviceStackSafe(sourcedevice: ConstPtr<DeviceObject>, targetdevice: ConstPtr<DeviceObject>, attachedtodeviceobject: MutPtr<MutPtr<DeviceObject>>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoAttachDeviceToDeviceStackSafe(sourcedevice.rawAddress, targetdevice.rawAddress, attachedtodeviceobject.rawAddress)

public actual fun ioBuildAsynchronousFsdRequest(majorfunction: UInt, deviceobject: ConstPtr<DeviceObject>, buffer: MutPtr<CVoid>, length: UInt, startingoffset: ConstPtr<Long>, iostatusblock: ConstPtr<IoStatusBlock>): MutPtr<Irp> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoBuildAsynchronousFsdRequest(majorfunction.toInt(), deviceobject.rawAddress, buffer.rawAddress, length.toInt(), startingoffset.rawAddress, iostatusblock.rawAddress))

public actual fun ioBuildDeviceIoControlRequest(iocontrolcode: UInt, deviceobject: ConstPtr<DeviceObject>, inputbuffer: ConstPtr<CVoid>, inputbufferlength: UInt, outputbuffer: MutPtr<CVoid>, outputbufferlength: UInt, internaldeviceiocontrol: Boolean, event: ConstPtr<Kevent>, iostatusblock: MutPtr<IoStatusBlock>): MutPtr<Irp> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoBuildDeviceIoControlRequest(iocontrolcode.toInt(), deviceobject.rawAddress, inputbuffer.rawAddress, inputbufferlength.toInt(), outputbuffer.rawAddress, outputbufferlength.toInt(), internaldeviceiocontrol, event.rawAddress, iostatusblock.rawAddress))

public actual fun ioBuildPartialMdl(sourcemdl: ConstPtr<Mdl>, targetmdl: MutPtr<Mdl>, virtualaddress: MutPtr<CVoid>, length: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoBuildPartialMdl(sourcemdl.rawAddress, targetmdl.rawAddress, virtualaddress.rawAddress, length.toInt())
}

public actual fun ioBuildSynchronousFsdRequest(majorfunction: UInt, deviceobject: ConstPtr<DeviceObject>, buffer: MutPtr<CVoid>, length: UInt, startingoffset: ConstPtr<Long>, event: ConstPtr<Kevent>, iostatusblock: MutPtr<IoStatusBlock>): MutPtr<Irp> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoBuildSynchronousFsdRequest(majorfunction.toInt(), deviceobject.rawAddress, buffer.rawAddress, length.toInt(), startingoffset.rawAddress, event.rawAddress, iostatusblock.rawAddress))

public actual fun ioCancelFileOpen(deviceobject: ConstPtr<DeviceObject>, fileobject: ConstPtr<FileObject>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCancelFileOpen(deviceobject.rawAddress, fileobject.rawAddress)
}

public actual fun ioCancelIrp(irp: ConstPtr<Irp>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCancelIrp(irp.rawAddress)

public actual fun ioCheckLinkShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: MutPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, linkshareaccess: MutPtr<LinkShareAccess>, ioshareaccessflags: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCheckLinkShareAccess(desiredaccess.toInt(), desiredshareaccess.toInt(), fileobject.rawAddress, shareaccess.rawAddress, linkshareaccess.rawAddress, ioshareaccessflags.toInt())

public actual fun ioCheckShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: MutPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, update: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCheckShareAccess(desiredaccess.toInt(), desiredshareaccess.toInt(), fileobject.rawAddress, shareaccess.rawAddress, update)

public actual fun ioCheckShareAccessEx(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: MutPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, update: Boolean, writepermission: ConstPtr<Boolean>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCheckShareAccessEx(desiredaccess.toInt(), desiredshareaccess.toInt(), fileobject.rawAddress, shareaccess.rawAddress, update, writepermission.rawAddress)

public actual fun ioCleanupIrp(irp: MutPtr<Irp>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCleanupIrp(irp.rawAddress)
}

public actual fun ioClearActivityIdThread(originalid: ConstPtr<Guid>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoClearActivityIdThread(originalid.rawAddress)
}

public actual fun ioClearIrpExtraCreateParameter(irp: MutPtr<Irp>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoClearIrpExtraCreateParameter(irp.rawAddress)
}

public actual fun ioConnectInterrupt(interruptobject: MutPtr<Pkinterrupt>, serviceroutine: PkserviceRoutine, servicecontext: ConstPtr<CVoid>, spinlock: ConstPtr<ULong>, vector: UInt, irql: UByte, synchronizeirql: UByte, interruptmode: KinterruptMode, sharevector: Boolean, processorenablemask: ULong, floatingsave: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoConnectInterrupt(interruptobject.rawAddress, 0L, servicecontext.rawAddress, spinlock.rawAddress, vector.toInt(), irql.toByte(), synchronizeirql.toByte(), interruptmode, sharevector, processorenablemask.toLong(), floatingsave)

public actual fun ioConnectInterruptEx(parameters: MutPtr<IoConnectInterruptParameters>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoConnectInterruptEx(parameters.rawAddress)

public actual fun ioCreateController(size: UInt): MutPtr<ControllerObject> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCreateController(size.toInt()))

public actual fun ioCreateDevice(driverobject: ConstPtr<DriverObject>, deviceextensionsize: UInt, devicename: ConstPtr<UnicodeString>, devicetype: UInt, devicecharacteristics: UInt, exclusive: Boolean, deviceobject: MutPtr<MutPtr<DeviceObject>>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCreateDevice(driverobject.rawAddress, deviceextensionsize.toInt(), devicename.rawAddress, devicetype.toInt(), devicecharacteristics.toInt(), exclusive, deviceobject.rawAddress)

public actual fun ioCreateDisk(deviceobject: ConstPtr<DeviceObject>, disk: ConstPtr<CreateDisk>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCreateDisk(deviceobject.rawAddress, disk.rawAddress)

public actual fun ioCreateFile(filehandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, allocationsize: ConstPtr<Long>, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: ConstPtr<CVoid>, ealength: UInt, createfiletype: CreateFileType, internalparameters: ConstPtr<CVoid>, options: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCreateFile(filehandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, iostatusblock.rawAddress, allocationsize.rawAddress, fileattributes.toInt(), shareaccess.toInt(), disposition.toInt(), createoptions.toInt(), eabuffer.rawAddress, ealength.toInt(), createfiletype, internalparameters.rawAddress, options.toInt())

public actual fun ioCreateFileEx(filehandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, allocationsize: ConstPtr<Long>, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: ConstPtr<CVoid>, ealength: UInt, createfiletype: CreateFileType, internalparameters: ConstPtr<CVoid>, options: UInt, drivercontext: ConstPtr<IoDriverCreateContext>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCreateFileEx(filehandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, iostatusblock.rawAddress, allocationsize.rawAddress, fileattributes.toInt(), shareaccess.toInt(), disposition.toInt(), createoptions.toInt(), eabuffer.rawAddress, ealength.toInt(), createfiletype, internalparameters.rawAddress, options.toInt(), drivercontext.rawAddress)

public actual fun ioCreateFileSpecifyDeviceObjectHint(filehandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, allocationsize: ConstPtr<Long>, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: ConstPtr<CVoid>, ealength: UInt, createfiletype: CreateFileType, internalparameters: ConstPtr<CVoid>, options: UInt, deviceobject: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCreateFileSpecifyDeviceObjectHint(filehandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, iostatusblock.rawAddress, allocationsize.rawAddress, fileattributes.toInt(), shareaccess.toInt(), disposition.toInt(), createoptions.toInt(), eabuffer.rawAddress, ealength.toInt(), createfiletype, internalparameters.rawAddress, options.toInt(), deviceobject.rawAddress)

public actual fun ioCreateNotificationEvent(eventname: ConstPtr<UnicodeString>, eventhandle: MutPtr<Handle>): MutPtr<Kevent> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCreateNotificationEvent(eventname.rawAddress, eventhandle.rawAddress))

public actual fun ioCreateSymbolicLink(symboliclinkname: ConstPtr<UnicodeString>, devicename: ConstPtr<UnicodeString>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCreateSymbolicLink(symboliclinkname.rawAddress, devicename.rawAddress)

public actual fun ioCreateSynchronizationEvent(eventname: ConstPtr<UnicodeString>, eventhandle: MutPtr<Handle>): MutPtr<Kevent> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCreateSynchronizationEvent(eventname.rawAddress, eventhandle.rawAddress))

public actual fun ioCreateSystemThread(ioobject: MutPtr<CVoid>, threadhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, processhandle: Handle, clientid: MutPtr<ClientId>, startroutine: PkstartRoutine, startcontext: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCreateSystemThread(ioobject.rawAddress, threadhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, processhandle.rawAddress, clientid.rawAddress, 0L, startcontext.rawAddress)

public actual fun ioCreateUnprotectedSymbolicLink(symboliclinkname: ConstPtr<UnicodeString>, devicename: ConstPtr<UnicodeString>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCreateUnprotectedSymbolicLink(symboliclinkname.rawAddress, devicename.rawAddress)

public actual fun ioCsqInitialize(csq: MutPtr<IoCsq>, csqinsertirp: PioCsqInsertIrp, csqremoveirp: PioCsqRemoveIrp, csqpeeknextirp: PioCsqPeekNextIrp, csqacquirelock: PioCsqAcquireLock, csqreleaselock: PioCsqReleaseLock, csqcompletecanceledirp: PioCsqCompleteCanceledIrp): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCsqInitialize(csq.rawAddress, 0L, 0L, 0L, 0L, 0L, 0L)

public actual fun ioCsqInitializeEx(csq: MutPtr<IoCsq>, csqinsertirp: PioCsqInsertIrpEx, csqremoveirp: PioCsqRemoveIrp, csqpeeknextirp: PioCsqPeekNextIrp, csqacquirelock: PioCsqAcquireLock, csqreleaselock: PioCsqReleaseLock, csqcompletecanceledirp: PioCsqCompleteCanceledIrp): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCsqInitializeEx(csq.rawAddress, 0L, 0L, 0L, 0L, 0L, 0L)

public actual fun ioCsqInsertIrp(csq: MutPtr<IoCsq>, irp: MutPtr<Irp>, context: MutPtr<IoCsqIrpContext>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCsqInsertIrp(csq.rawAddress, irp.rawAddress, context.rawAddress)
}

public actual fun ioCsqInsertIrpEx(csq: MutPtr<IoCsq>, irp: MutPtr<Irp>, context: MutPtr<IoCsqIrpContext>, insertcontext: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCsqInsertIrpEx(csq.rawAddress, irp.rawAddress, context.rawAddress, insertcontext.rawAddress)

public actual fun ioCsqRemoveIrp(csq: MutPtr<IoCsq>, context: MutPtr<IoCsqIrpContext>): MutPtr<Irp> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCsqRemoveIrp(csq.rawAddress, context.rawAddress))

public actual fun ioCsqRemoveNextIrp(csq: MutPtr<IoCsq>, peekcontext: ConstPtr<CVoid>): MutPtr<Irp> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoCsqRemoveNextIrp(csq.rawAddress, peekcontext.rawAddress))

public actual fun ioDecrementKeepAliveCount(fileobject: MutPtr<FileObject>, process: Peprocess): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoDecrementKeepAliveCount(fileobject.rawAddress, process)

public actual fun ioDeleteController(controllerobject: ConstPtr<ControllerObject>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoDeleteController(controllerobject.rawAddress)
}

public actual fun ioDeleteDevice(deviceobject: ConstPtr<DeviceObject>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoDeleteDevice(deviceobject.rawAddress)
}

public actual fun ioDeleteSymbolicLink(symboliclinkname: ConstPtr<UnicodeString>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoDeleteSymbolicLink(symboliclinkname.rawAddress)

public actual fun ioDetachDevice(targetdevice: MutPtr<DeviceObject>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoDetachDevice(targetdevice.rawAddress)
}

public actual fun ioDisconnectInterrupt(interruptobject: Pkinterrupt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoDisconnectInterrupt(interruptobject)
}

public actual fun ioDisconnectInterruptEx(parameters: ConstPtr<IoDisconnectInterruptParameters>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoDisconnectInterruptEx(parameters.rawAddress)
}

public actual fun ioEnumerateKsrPersistentMemoryEx(driverobject: ConstPtr<DriverObject>, physicaldeviceobject: ConstPtr<DeviceObject>, physicaldeviceid: ConstPtr<UnicodeString>, callback: PioPersistedMemoryEnumerationCallback, callbackcontext: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoEnumerateKsrPersistentMemoryEx(driverobject.rawAddress, physicaldeviceobject.rawAddress, physicaldeviceid.rawAddress, 0L, callbackcontext.rawAddress)

public actual fun ioFlushAdapterBuffers(adapterobject: ConstPtr<AdapterObject>, mdl: ConstPtr<Mdl>, mapregisterbase: ConstPtr<CVoid>, currentva: ConstPtr<CVoid>, length: UInt, writetodevice: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoFlushAdapterBuffers(adapterobject.rawAddress, mdl.rawAddress, mapregisterbase.rawAddress, currentva.rawAddress, length.toInt(), writetodevice)

public actual fun ioForwardIrpSynchronously(deviceobject: ConstPtr<DeviceObject>, irp: ConstPtr<Irp>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoForwardIrpSynchronously(deviceobject.rawAddress, irp.rawAddress)

public actual fun ioFreeAdapterChannel(adapterobject: ConstPtr<AdapterObject>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoFreeAdapterChannel(adapterobject.rawAddress)
}

public actual fun ioFreeController(controllerobject: ConstPtr<ControllerObject>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoFreeController(controllerobject.rawAddress)
}

public actual fun ioFreeErrorLogEntry(elentry: ConstPtr<CVoid>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoFreeErrorLogEntry(elentry.rawAddress)
}

public actual fun ioFreeIrp(irp: ConstPtr<Irp>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoFreeIrp(irp.rawAddress)
}

public actual fun ioFreeKsrPersistentMemory(datahandle: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoFreeKsrPersistentMemory(datahandle.rawAddress)

public actual fun ioFreeMapRegisters(adapterobject: ConstPtr<AdapterObject>, mapregisterbase: ConstPtr<CVoid>, numberofmapregisters: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoFreeMapRegisters(adapterobject.rawAddress, mapregisterbase.rawAddress, numberofmapregisters.toInt())
}

public actual fun ioFreeMdl(mdl: MutPtr<Mdl>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoFreeMdl(mdl.rawAddress)
}

public actual fun ioFreeSfioStreamIdentifier(fileobject: ConstPtr<FileObject>, signature: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoFreeSfioStreamIdentifier(fileobject.rawAddress, signature.rawAddress)

public actual fun ioFreeWorkItem(ioworkitem: PioWorkitem) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoFreeWorkItem(ioworkitem)
}

public actual fun ioGetActivityIdIrp(irp: ConstPtr<Irp>, guid: MutPtr<Guid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetActivityIdIrp(irp.rawAddress, guid.rawAddress)

public actual fun ioGetActivityIdThread(): MutPtr<Guid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetActivityIdThread())

public actual fun ioGetAffinityInterrupt(interruptobject: Pkinterrupt, groupaffinity: MutPtr<GroupAffinity>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetAffinityInterrupt(interruptobject, groupaffinity.rawAddress)

public actual fun ioGetAttachedDeviceReference(deviceobject: ConstPtr<DeviceObject>): MutPtr<DeviceObject> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetAttachedDeviceReference(deviceobject.rawAddress))

public actual fun ioGetBootDiskInformation(bootdiskinformation: MutPtr<BootdiskInformation>, size: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetBootDiskInformation(bootdiskinformation.rawAddress, size.toInt())

public actual fun ioGetBootDiskInformationLite(bootdiskinformation: MutPtr<MutPtr<BootdiskInformationLite>>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetBootDiskInformationLite(bootdiskinformation.rawAddress)

public actual fun ioGetConfigurationInformation(): MutPtr<ConfigurationInformation> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetConfigurationInformation())

public actual fun ioGetContainerInformation(informationclass: IoContainerInformationClass, containerobject: ConstPtr<CVoid>, buffer: MutPtr<CVoid>, bufferlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetContainerInformation(informationclass, containerobject.rawAddress, buffer.rawAddress, bufferlength.toInt())

public actual fun ioGetCurrentProcess(): Peprocess =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetCurrentProcess()

public actual fun ioGetDeviceDirectory(physicaldeviceobject: ConstPtr<DeviceObject>, directorytype: DeviceDirectoryType, flags: UInt, reserved: ConstPtr<CVoid>, devicedirectoryhandle: MutPtr<Handle>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetDeviceDirectory(physicaldeviceobject.rawAddress, directorytype, flags.toInt(), reserved.rawAddress, devicedirectoryhandle.rawAddress)

public actual fun ioGetDeviceInterfaceAlias(symboliclinkname: ConstPtr<UnicodeString>, aliasinterfaceclassguid: ConstPtr<Guid>, aliassymboliclinkname: MutPtr<UnicodeString>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetDeviceInterfaceAlias(symboliclinkname.rawAddress, aliasinterfaceclassguid.rawAddress, aliassymboliclinkname.rawAddress)

public actual fun ioGetDeviceInterfacePropertyData(symboliclinkname: ConstPtr<UnicodeString>, propertykey: ConstPtr<Devpropkey>, lcid: UInt, flags: UInt, size: UInt, data: MutPtr<CVoid>, requiredsize: MutPtr<UInt>, type: MutPtr<Devproptype>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetDeviceInterfacePropertyData(symboliclinkname.rawAddress, propertykey.rawAddress, lcid.toInt(), flags.toInt(), size.toInt(), data.rawAddress, requiredsize.rawAddress, type.rawAddress)

public actual fun ioGetDeviceInterfaces(interfaceclassguid: ConstPtr<Guid>, physicaldeviceobject: ConstPtr<DeviceObject>, flags: UInt, symboliclinklist: MutPtr<Pwstr>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetDeviceInterfaces(interfaceclassguid.rawAddress, physicaldeviceobject.rawAddress, flags.toInt(), symboliclinklist.rawAddress)

public actual fun ioGetDeviceNumaNode(pdo: ConstPtr<DeviceObject>, nodenumber: MutPtr<UShort>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetDeviceNumaNode(pdo.rawAddress, nodenumber.rawAddress)

public actual fun ioGetDeviceObjectPointer(objectname: ConstPtr<UnicodeString>, desiredaccess: UInt, fileobject: MutPtr<MutPtr<FileObject>>, deviceobject: MutPtr<MutPtr<DeviceObject>>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetDeviceObjectPointer(objectname.rawAddress, desiredaccess.toInt(), fileobject.rawAddress, deviceobject.rawAddress)

public actual fun ioGetDeviceProperty(deviceobject: ConstPtr<DeviceObject>, deviceproperty: DeviceRegistryProperty, bufferlength: UInt, propertybuffer: MutPtr<CVoid>, resultlength: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetDeviceProperty(deviceobject.rawAddress, deviceproperty, bufferlength.toInt(), propertybuffer.rawAddress, resultlength.rawAddress)

public actual fun ioGetDevicePropertyData(pdo: ConstPtr<DeviceObject>, propertykey: ConstPtr<Devpropkey>, lcid: UInt, flags: UInt, size: UInt, data: MutPtr<CVoid>, requiredsize: MutPtr<UInt>, type: MutPtr<Devproptype>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetDevicePropertyData(pdo.rawAddress, propertykey.rawAddress, lcid.toInt(), flags.toInt(), size.toInt(), data.rawAddress, requiredsize.rawAddress, type.rawAddress)

public actual fun ioGetDmaAdapter(physicaldeviceobject: ConstPtr<DeviceObject>, devicedescription: ConstPtr<DeviceDescription>, numberofmapregisters: MutPtr<UInt>): MutPtr<DmaAdapter> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetDmaAdapter(physicaldeviceobject.rawAddress, devicedescription.rawAddress, numberofmapregisters.rawAddress))

public actual fun ioGetDriverDirectory(driverobject: ConstPtr<DriverObject>, directorytype: DriverDirectoryType, flags: UInt, driverdirectoryhandle: MutPtr<Handle>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetDriverDirectory(driverobject.rawAddress, directorytype, flags.toInt(), driverdirectoryhandle.rawAddress)

public actual fun ioGetDriverObjectExtension(driverobject: ConstPtr<DriverObject>, clientidentificationaddress: ConstPtr<CVoid>): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetDriverObjectExtension(driverobject.rawAddress, clientidentificationaddress.rawAddress))

public actual fun ioGetFileObjectGenericMapping(): MutPtr<GenericMapping> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetFileObjectGenericMapping())

public actual fun ioGetFsZeroingOffset(irp: ConstPtr<Irp>, zeroingoffset: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetFsZeroingOffset(irp.rawAddress, zeroingoffset.rawAddress)

public actual fun ioGetInitialStack(): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetInitialStack())

public actual fun ioGetInitiatorProcess(fileobject: ConstPtr<FileObject>): Peprocess =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetInitiatorProcess(fileobject.rawAddress)

public actual fun ioGetIoAttributionHandle(irp: ConstPtr<Irp>, ioattributionhandle: MutPtr<MutPtr<CVoid>>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetIoAttributionHandle(irp.rawAddress, ioattributionhandle.rawAddress)

public actual fun ioGetIoPriorityHint(irp: ConstPtr<Irp>): IoPriorityHint =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetIoPriorityHint(irp.rawAddress)

public actual fun ioGetIommuInterface(version: UInt, interfaceout: MutPtr<DmaIommuInterface>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetIommuInterface(version.toInt(), interfaceout.rawAddress)

public actual fun ioGetIommuInterfaceEx(version: UInt, flags: ULong, interfaceout: MutPtr<DmaIommuInterfaceEx>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetIommuInterfaceEx(version.toInt(), flags.toLong(), interfaceout.rawAddress)

public actual fun ioGetIrpExtraCreateParameter(irp: ConstPtr<Irp>, extracreateparameter: MutPtr<MutPtr<Long>>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetIrpExtraCreateParameter(irp.rawAddress, extracreateparameter.rawAddress)

public actual fun ioGetPagingIoPriority(irp: ConstPtr<Irp>): IoPagingPriority =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetPagingIoPriority(irp.rawAddress)

public actual fun ioGetRelatedDeviceObject(fileobject: ConstPtr<FileObject>): MutPtr<DeviceObject> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetRelatedDeviceObject(fileobject.rawAddress))

public actual fun ioGetSfioStreamIdentifier(fileobject: ConstPtr<FileObject>, signature: ConstPtr<CVoid>): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetSfioStreamIdentifier(fileobject.rawAddress, signature.rawAddress))

public actual fun ioGetSilo(fileobject: ConstPtr<FileObject>): Pesilo =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetSilo(fileobject.rawAddress)

public actual fun ioGetSiloParameters(fileobject: ConstPtr<FileObject>): MutPtr<IoFoextSiloParameters> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetSiloParameters(fileobject.rawAddress))

public actual fun ioGetStackLimits(lowlimit: MutPtr<ULong>, highlimit: MutPtr<ULong>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetStackLimits(lowlimit.rawAddress, highlimit.rawAddress)
}

public actual fun ioGetTopLevelIrp(): MutPtr<Irp> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetTopLevelIrp())

public actual fun ioGetTransactionParameterBlock(fileobject: ConstPtr<FileObject>): MutPtr<TxnParameterBlock> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoGetTransactionParameterBlock(fileobject.rawAddress))

public actual fun ioIncrementKeepAliveCount(fileobject: MutPtr<FileObject>, process: Peprocess): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoIncrementKeepAliveCount(fileobject.rawAddress, process)

public actual fun ioInitializeIrp(irp: MutPtr<Irp>, packetsize: UShort, stacksize: Byte) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoInitializeIrp(irp.rawAddress, packetsize.toShort(), stacksize)
}

public actual fun ioInitializeIrpEx(irp: MutPtr<Irp>, deviceobject: ConstPtr<DeviceObject>, packetsize: UShort, stacksize: Byte) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoInitializeIrpEx(irp.rawAddress, deviceobject.rawAddress, packetsize.toShort(), stacksize)
}

public actual fun ioInitializeRemoveLockEx(lock: MutPtr<IoRemoveLock>, allocatetag: UInt, maxlockedminutes: UInt, highwatermark: UInt, remlocksize: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoInitializeRemoveLockEx(lock.rawAddress, allocatetag.toInt(), maxlockedminutes.toInt(), highwatermark.toInt(), remlocksize.toInt())
}

public actual fun ioInitializeTimer(deviceobject: ConstPtr<DeviceObject>, timerroutine: PioTimerRoutine, context: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoInitializeTimer(deviceobject.rawAddress, 0L, context.rawAddress)

public actual fun ioInitializeWorkItem(ioobject: ConstPtr<CVoid>, ioworkitem: PioWorkitem) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoInitializeWorkItem(ioobject.rawAddress, ioworkitem)
}

public actual fun ioInvalidateDeviceRelations(deviceobject: ConstPtr<DeviceObject>, type: DeviceRelationType) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoInvalidateDeviceRelations(deviceobject.rawAddress, type)
}

public actual fun ioInvalidateDeviceState(physicaldeviceobject: ConstPtr<DeviceObject>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoInvalidateDeviceState(physicaldeviceobject.rawAddress)
}

public actual fun ioIs32bitProcess(irp: ConstPtr<Irp>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoIs32bitProcess(irp.rawAddress)

public actual fun ioIsFileObjectIgnoringSharing(fileobject: ConstPtr<FileObject>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoIsFileObjectIgnoringSharing(fileobject.rawAddress)

public actual fun ioIsFileOriginRemote(fileobject: ConstPtr<FileObject>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoIsFileOriginRemote(fileobject.rawAddress)

public actual fun ioIsInitiator32bitProcess(irp: ConstPtr<Irp>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoIsInitiator32bitProcess(irp.rawAddress)

public actual fun ioIsValidIrpStatus(status: Ntstatus): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoIsValidIrpStatus(status).toUInt()

public actual fun ioIsWdmVersionAvailable(majorversion: UByte, minorversion: UByte): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoIsWdmVersionAvailable(majorversion.toByte(), minorversion.toByte())

public actual fun ioMakeAssociatedIrp(irp: ConstPtr<Irp>, stacksize: Byte): MutPtr<Irp> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoMakeAssociatedIrp(irp.rawAddress, stacksize))

public actual fun ioMakeAssociatedIrpEx(irp: ConstPtr<Irp>, deviceobject: ConstPtr<DeviceObject>, stacksize: Byte): MutPtr<Irp> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoMakeAssociatedIrpEx(irp.rawAddress, deviceobject.rawAddress, stacksize))

public actual fun ioMapTransfer(adapterobject: ConstPtr<AdapterObject>, mdl: ConstPtr<Mdl>, mapregisterbase: ConstPtr<CVoid>, currentva: ConstPtr<CVoid>, length: MutPtr<UInt>, writetodevice: Boolean): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoMapTransfer(adapterobject.rawAddress, mdl.rawAddress, mapregisterbase.rawAddress, currentva.rawAddress, length.rawAddress, writetodevice)

public actual fun ioOpenDeviceInterfaceRegistryKey(symboliclinkname: ConstPtr<UnicodeString>, desiredaccess: UInt, deviceinterfaceregkey: MutPtr<Handle>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoOpenDeviceInterfaceRegistryKey(symboliclinkname.rawAddress, desiredaccess.toInt(), deviceinterfaceregkey.rawAddress)

public actual fun ioOpenDeviceRegistryKey(deviceobject: ConstPtr<DeviceObject>, devinstkeytype: UInt, desiredaccess: UInt, deviceregkey: MutPtr<Handle>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoOpenDeviceRegistryKey(deviceobject.rawAddress, devinstkeytype.toInt(), desiredaccess.toInt(), deviceregkey.rawAddress)

public actual fun ioOpenDriverRegistryKey(driverobject: ConstPtr<DriverObject>, regkeytype: DriverRegkeyType, desiredaccess: UInt, flags: UInt, driverregkey: MutPtr<Handle>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoOpenDriverRegistryKey(driverobject.rawAddress, regkeytype, desiredaccess.toInt(), flags.toInt(), driverregkey.rawAddress)

public actual fun ioPropagateActivityIdToThread(irp: ConstPtr<Irp>, propagatedid: MutPtr<Guid>, originalid: MutPtr<MutPtr<Guid>>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoPropagateActivityIdToThread(irp.rawAddress, propagatedid.rawAddress, originalid.rawAddress)

public actual fun ioQueryDeviceDescription(bustype: ConstPtr<InterfaceType>, busnumber: ConstPtr<UInt>, controllertype: ConstPtr<ConfigurationType>, controllernumber: ConstPtr<UInt>, peripheraltype: ConstPtr<ConfigurationType>, peripheralnumber: ConstPtr<UInt>, calloutroutine: PioQueryDeviceRoutine, context: MutPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoQueryDeviceDescription(bustype.rawAddress, busnumber.rawAddress, controllertype.rawAddress, controllernumber.rawAddress, peripheraltype.rawAddress, peripheralnumber.rawAddress, 0L, context.rawAddress)

public actual fun ioQueryFullDriverPath(driverobject: ConstPtr<DriverObject>, fullpath: MutPtr<UnicodeString>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoQueryFullDriverPath(driverobject.rawAddress, fullpath.rawAddress)

public actual fun ioQueryInformationByName(objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass, options: UInt, drivercontext: ConstPtr<IoDriverCreateContext>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoQueryInformationByName(objectattributes.rawAddress, iostatusblock.rawAddress, fileinformation.rawAddress, length.toInt(), fileinformationclass, options.toInt(), drivercontext.rawAddress)

public actual fun ioQueryKsrPersistentMemorySize(driverobject: ConstPtr<DriverObject>, physicaldeviceobject: ConstPtr<DeviceObject>, buffersize: MutPtr<ULong>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoQueryKsrPersistentMemorySize(driverobject.rawAddress, physicaldeviceobject.rawAddress, buffersize.rawAddress)

public actual fun ioQueryKsrPersistentMemorySizeEx(driverobject: ConstPtr<DriverObject>, physicaldeviceobject: ConstPtr<DeviceObject>, physicaldeviceid: ConstPtr<UnicodeString>, datatag: ConstPtr<UShort>, dataversion: MutPtr<UInt>, buffersize: MutPtr<ULong>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoQueryKsrPersistentMemorySizeEx(driverobject.rawAddress, physicaldeviceobject.rawAddress, physicaldeviceid.rawAddress, datatag.rawAddress, dataversion.rawAddress, buffersize.rawAddress)

public actual fun ioQueueWorkItem(ioworkitem: PioWorkitem, workerroutine: PioWorkitemRoutine, queuetype: WorkQueueType, context: ConstPtr<CVoid>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoQueueWorkItem(ioworkitem, 0L, queuetype, context.rawAddress)
}

public actual fun ioQueueWorkItemEx(ioworkitem: PioWorkitem, workerroutine: PioWorkitemRoutineEx, queuetype: WorkQueueType, context: ConstPtr<CVoid>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoQueueWorkItemEx(ioworkitem, 0L, queuetype, context.rawAddress)
}

public actual fun ioRaiseHardError(irp: ConstPtr<Irp>, vpb: ConstPtr<Vpb>, realdeviceobject: ConstPtr<DeviceObject>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoRaiseHardError(irp.rawAddress, vpb.rawAddress, realdeviceobject.rawAddress)
}

public actual fun ioRaiseInformationalHardError(errorstatus: Ntstatus, string: ConstPtr<UnicodeString>, thread: Pkthread): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoRaiseInformationalHardError(errorstatus, string.rawAddress, thread)

public actual fun ioReadDiskSignature(deviceobject: ConstPtr<DeviceObject>, bytespersector: UInt, signature: MutPtr<DiskSignature>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoReadDiskSignature(deviceobject.rawAddress, bytespersector.toInt(), signature.rawAddress)

public actual fun ioReadPartitionTable(deviceobject: ConstPtr<DeviceObject>, sectorsize: UInt, returnrecognizedpartitions: Boolean, partitionbuffer: MutPtr<MutPtr<DriveLayoutInformation>>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoReadPartitionTable(deviceobject.rawAddress, sectorsize.toInt(), returnrecognizedpartitions, partitionbuffer.rawAddress)

public actual fun ioReadPartitionTableEx(deviceobject: ConstPtr<DeviceObject>, drivelayout: MutPtr<MutPtr<DriveLayoutInformationEx>>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoReadPartitionTableEx(deviceobject.rawAddress, drivelayout.rawAddress)

public actual fun ioRecordIoAttribution(opaquehandle: MutPtr<CVoid>, attributioninformation: ConstPtr<IoAttributionInformation>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoRecordIoAttribution(opaquehandle.rawAddress, attributioninformation.rawAddress)

public actual fun ioRegisterBootDriverCallback(callbackfunction: PbootDriverCallbackFunction, callbackcontext: ConstPtr<CVoid>): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoRegisterBootDriverCallback(0L, callbackcontext.rawAddress))

public actual fun ioRegisterBootDriverReinitialization(driverobject: ConstPtr<DriverObject>, driverreinitializationroutine: DriverReinitialize, context: ConstPtr<CVoid>) {
}

public actual fun ioRegisterContainerNotification(notificationclass: IoContainerNotificationClass, callbackfunction: PioContainerNotificationFunction, notificationinformation: ConstPtr<CVoid>, notificationinformationlength: UInt, callbackregistration: MutPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoRegisterContainerNotification(notificationclass, 0L, notificationinformation.rawAddress, notificationinformationlength.toInt(), callbackregistration.rawAddress)

public actual fun ioRegisterDeviceInterface(physicaldeviceobject: ConstPtr<DeviceObject>, interfaceclassguid: ConstPtr<Guid>, referencestring: ConstPtr<UnicodeString>, symboliclinkname: MutPtr<UnicodeString>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoRegisterDeviceInterface(physicaldeviceobject.rawAddress, interfaceclassguid.rawAddress, referencestring.rawAddress, symboliclinkname.rawAddress)

public actual fun ioRegisterDriverReinitialization(driverobject: ConstPtr<DriverObject>, driverreinitializationroutine: DriverReinitialize, context: ConstPtr<CVoid>) {
}

public actual fun ioRegisterLastChanceShutdownNotification(deviceobject: ConstPtr<DeviceObject>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoRegisterLastChanceShutdownNotification(deviceobject.rawAddress)

public actual fun ioRegisterPlugPlayNotification(eventcategory: IoNotificationEventCategory, eventcategoryflags: UInt, eventcategorydata: ConstPtr<CVoid>, driverobject: ConstPtr<DriverObject>, callbackroutine: DriverNotificationCallbackRoutine, context: MutPtr<CVoid>, notificationentry: MutPtr<MutPtr<CVoid>>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoRegisterPlugPlayNotification(eventcategory, eventcategoryflags.toInt(), eventcategorydata.rawAddress, driverobject.rawAddress, 0L, context.rawAddress, notificationentry.rawAddress)

public actual fun ioRegisterShutdownNotification(deviceobject: ConstPtr<DeviceObject>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoRegisterShutdownNotification(deviceobject.rawAddress)

public actual fun ioReleaseCancelSpinLock(irql: UByte) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoReleaseCancelSpinLock(irql.toByte())
}

public actual fun ioReleaseRemoveLockAndWaitEx(removelock: MutPtr<IoRemoveLock>, tag: ConstPtr<CVoid>, remlocksize: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoReleaseRemoveLockAndWaitEx(removelock.rawAddress, tag.rawAddress, remlocksize.toInt())
}

public actual fun ioReleaseRemoveLockEx(removelock: MutPtr<IoRemoveLock>, tag: ConstPtr<CVoid>, remlocksize: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoReleaseRemoveLockEx(removelock.rawAddress, tag.rawAddress, remlocksize.toInt())
}

public actual fun ioRemoveLinkShareAccess(fileobject: ConstPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, linkshareaccess: MutPtr<LinkShareAccess>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoRemoveLinkShareAccess(fileobject.rawAddress, shareaccess.rawAddress, linkshareaccess.rawAddress)
}

public actual fun ioRemoveLinkShareAccessEx(fileobject: ConstPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, linkshareaccess: MutPtr<LinkShareAccess>, ioshareaccessflags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoRemoveLinkShareAccessEx(fileobject.rawAddress, shareaccess.rawAddress, linkshareaccess.rawAddress, ioshareaccessflags.toInt())
}

public actual fun ioRemoveShareAccess(fileobject: ConstPtr<FileObject>, shareaccess: MutPtr<ShareAccess>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoRemoveShareAccess(fileobject.rawAddress, shareaccess.rawAddress)
}

public actual fun ioReplacePartitionUnit(targetpdo: ConstPtr<DeviceObject>, sparepdo: ConstPtr<DeviceObject>, flags: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoReplacePartitionUnit(targetpdo.rawAddress, sparepdo.rawAddress, flags.toInt())

public actual fun ioReportDetectedDevice(driverobject: ConstPtr<DriverObject>, legacybustype: InterfaceType, busnumber: UInt, slotnumber: UInt, resourcelist: ConstPtr<CmResourceList>, resourcerequirements: ConstPtr<IoResourceRequirementsList>, resourceassigned: Boolean, deviceobject: MutPtr<MutPtr<DeviceObject>>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoReportDetectedDevice(driverobject.rawAddress, legacybustype, busnumber.toInt(), slotnumber.toInt(), resourcelist.rawAddress, resourcerequirements.rawAddress, resourceassigned, deviceobject.rawAddress)

public actual fun ioReportInterruptActive(parameters: ConstPtr<IoReportInterruptActiveStateParameters>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoReportInterruptActive(parameters.rawAddress)
}

public actual fun ioReportInterruptInactive(parameters: ConstPtr<IoReportInterruptActiveStateParameters>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoReportInterruptInactive(parameters.rawAddress)
}

public actual fun ioReportResourceForDetection(driverobject: ConstPtr<DriverObject>, driverlist: ConstPtr<CmResourceList>, driverlistsize: UInt, deviceobject: ConstPtr<DeviceObject>, devicelist: ConstPtr<CmResourceList>, devicelistsize: UInt, conflictdetected: MutPtr<Boolean>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoReportResourceForDetection(driverobject.rawAddress, driverlist.rawAddress, driverlistsize.toInt(), deviceobject.rawAddress, devicelist.rawAddress, devicelistsize.toInt(), conflictdetected.rawAddress)

public actual fun ioReportResourceUsage(driverclassname: ConstPtr<UnicodeString>, driverobject: ConstPtr<DriverObject>, driverlist: ConstPtr<CmResourceList>, driverlistsize: UInt, deviceobject: ConstPtr<DeviceObject>, devicelist: ConstPtr<CmResourceList>, devicelistsize: UInt, overrideconflict: Boolean, conflictdetected: MutPtr<Boolean>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoReportResourceUsage(driverclassname.rawAddress, driverobject.rawAddress, driverlist.rawAddress, driverlistsize.toInt(), deviceobject.rawAddress, devicelist.rawAddress, devicelistsize.toInt(), overrideconflict, conflictdetected.rawAddress)

public actual fun ioReportRootDevice(driverobject: ConstPtr<DriverObject>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoReportRootDevice(driverobject.rawAddress)

public actual fun ioReportTargetDeviceChange(physicaldeviceobject: ConstPtr<DeviceObject>, notificationstructure: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoReportTargetDeviceChange(physicaldeviceobject.rawAddress, notificationstructure.rawAddress)

public actual fun ioReportTargetDeviceChangeAsynchronous(physicaldeviceobject: ConstPtr<DeviceObject>, notificationstructure: ConstPtr<CVoid>, callback: PdeviceChangeCompleteCallback, context: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoReportTargetDeviceChangeAsynchronous(physicaldeviceobject.rawAddress, notificationstructure.rawAddress, 0L, context.rawAddress)

public actual fun ioRequestDeviceEject(physicaldeviceobject: ConstPtr<DeviceObject>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoRequestDeviceEject(physicaldeviceobject.rawAddress)
}

public actual fun ioRequestDeviceEjectEx(physicaldeviceobject: ConstPtr<DeviceObject>, callback: PioDeviceEjectCallback, context: ConstPtr<CVoid>, driverobject: ConstPtr<DriverObject>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoRequestDeviceEjectEx(physicaldeviceobject.rawAddress, 0L, context.rawAddress, driverobject.rawAddress)

public actual fun ioReserveKsrPersistentMemory(driverobject: ConstPtr<DriverObject>, physicaldeviceobject: ConstPtr<DeviceObject>, size: ULong, flags: UInt, datahandle: MutPtr<MutPtr<CVoid>>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoReserveKsrPersistentMemory(driverobject.rawAddress, physicaldeviceobject.rawAddress, size.toLong(), flags.toInt(), datahandle.rawAddress)

public actual fun ioReserveKsrPersistentMemoryEx(driverobject: ConstPtr<DriverObject>, physicaldeviceobject: ConstPtr<DeviceObject>, physicaldeviceid: ConstPtr<UnicodeString>, datatag: ConstPtr<UShort>, dataversion: UInt, size: ULong, flags: UInt, datahandle: MutPtr<MutPtr<CVoid>>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoReserveKsrPersistentMemoryEx(driverobject.rawAddress, physicaldeviceobject.rawAddress, physicaldeviceid.rawAddress, datatag.rawAddress, dataversion.toInt(), size.toLong(), flags.toInt(), datahandle.rawAddress)

public actual fun ioReuseIrp(irp: MutPtr<Irp>, iostatus: Ntstatus) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoReuseIrp(irp.rawAddress, iostatus)
}

public actual fun ioSetActivityIdIrp(irp: MutPtr<Irp>, guid: ConstPtr<Guid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetActivityIdIrp(irp.rawAddress, guid.rawAddress)

public actual fun ioSetActivityIdThread(activityid: ConstPtr<Guid>): MutPtr<Guid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetActivityIdThread(activityid.rawAddress))

public actual fun ioSetCompletionRoutineEx(deviceobject: ConstPtr<DeviceObject>, irp: ConstPtr<Irp>, completionroutine: PioCompletionRoutine, context: ConstPtr<CVoid>, invokeonsuccess: Boolean, invokeonerror: Boolean, invokeoncancel: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetCompletionRoutineEx(deviceobject.rawAddress, irp.rawAddress, 0L, context.rawAddress, invokeonsuccess, invokeonerror, invokeoncancel)

public actual fun ioSetDeviceInterfacePropertyData(symboliclinkname: ConstPtr<UnicodeString>, propertykey: ConstPtr<Devpropkey>, lcid: UInt, flags: UInt, type: UInt, size: UInt, data: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetDeviceInterfacePropertyData(symboliclinkname.rawAddress, propertykey.rawAddress, lcid.toInt(), flags.toInt(), type.toInt(), size.toInt(), data.rawAddress)

public actual fun ioSetDeviceInterfaceState(symboliclinkname: ConstPtr<UnicodeString>, enable: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetDeviceInterfaceState(symboliclinkname.rawAddress, enable)

public actual fun ioSetDevicePropertyData(pdo: ConstPtr<DeviceObject>, propertykey: ConstPtr<Devpropkey>, lcid: UInt, flags: UInt, type: UInt, size: UInt, data: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetDevicePropertyData(pdo.rawAddress, propertykey.rawAddress, lcid.toInt(), flags.toInt(), type.toInt(), size.toInt(), data.rawAddress)

public actual fun ioSetFileObjectIgnoreSharing(fileobject: ConstPtr<FileObject>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetFileObjectIgnoreSharing(fileobject.rawAddress)

public actual fun ioSetFileOrigin(fileobject: ConstPtr<FileObject>, remote: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetFileOrigin(fileobject.rawAddress, remote)

public actual fun ioSetFsZeroingOffset(irp: MutPtr<Irp>, zeroingoffset: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetFsZeroingOffset(irp.rawAddress, zeroingoffset.toInt())

public actual fun ioSetFsZeroingOffsetRequired(irp: MutPtr<Irp>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetFsZeroingOffsetRequired(irp.rawAddress)

public actual fun ioSetHardErrorOrVerifyDevice(irp: ConstPtr<Irp>, deviceobject: ConstPtr<DeviceObject>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetHardErrorOrVerifyDevice(irp.rawAddress, deviceobject.rawAddress)
}

public actual fun ioSetIoAttributionIrp(irp: MutPtr<Irp>, attributionsource: ConstPtr<CVoid>, flags: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetIoAttributionIrp(irp.rawAddress, attributionsource.rawAddress, flags.toInt())

public actual fun ioSetIoPriorityHint(irp: ConstPtr<Irp>, priorityhint: IoPriorityHint): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetIoPriorityHint(irp.rawAddress, priorityhint)

public actual fun ioSetIrpExtraCreateParameter(irp: MutPtr<Irp>, extracreateparameter: ConstPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetIrpExtraCreateParameter(irp.rawAddress, extracreateparameter.rawAddress)

public actual fun ioSetLinkShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: MutPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, linkshareaccess: MutPtr<LinkShareAccess>, ioshareaccessflags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetLinkShareAccess(desiredaccess.toInt(), desiredshareaccess.toInt(), fileobject.rawAddress, shareaccess.rawAddress, linkshareaccess.rawAddress, ioshareaccessflags.toInt())
}

public actual fun ioSetMasterIrpStatus(masterirp: MutPtr<Irp>, status: Ntstatus) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetMasterIrpStatus(masterirp.rawAddress, status)
}

public actual fun ioSetPartitionInformation(deviceobject: ConstPtr<DeviceObject>, sectorsize: UInt, partitionnumber: UInt, partitiontype: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetPartitionInformation(deviceobject.rawAddress, sectorsize.toInt(), partitionnumber.toInt(), partitiontype.toInt())

public actual fun ioSetPartitionInformationEx(deviceobject: ConstPtr<DeviceObject>, partitionnumber: UInt, partitioninfo: ConstPtr<SetPartitionInformationEx>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetPartitionInformationEx(deviceobject.rawAddress, partitionnumber.toInt(), partitioninfo.rawAddress)

public actual fun ioSetShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: MutPtr<FileObject>, shareaccess: MutPtr<ShareAccess>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetShareAccess(desiredaccess.toInt(), desiredshareaccess.toInt(), fileobject.rawAddress, shareaccess.rawAddress)
}

public actual fun ioSetShareAccessEx(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: MutPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, writepermission: ConstPtr<Boolean>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetShareAccessEx(desiredaccess.toInt(), desiredshareaccess.toInt(), fileobject.rawAddress, shareaccess.rawAddress, writepermission.rawAddress)
}

public actual fun ioSetStartIoAttributes(deviceobject: ConstPtr<DeviceObject>, deferredstartio: Boolean, noncancelable: Boolean) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetStartIoAttributes(deviceobject.rawAddress, deferredstartio, noncancelable)
}

public actual fun ioSetSystemPartition(volumenamestring: ConstPtr<UnicodeString>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetSystemPartition(volumenamestring.rawAddress)

public actual fun ioSetThreadHardErrorMode(enableharderrors: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetThreadHardErrorMode(enableharderrors)

public actual fun ioSetTopLevelIrp(irp: ConstPtr<Irp>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSetTopLevelIrp(irp.rawAddress)
}

public actual fun ioSizeOfIrpEx(deviceobject: ConstPtr<DeviceObject>, stacksize: Byte): UShort =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSizeOfIrpEx(deviceobject.rawAddress, stacksize).toUShort()

public actual fun ioSizeofWorkItem(): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSizeofWorkItem().toUInt()

public actual fun ioStartNextPacket(deviceobject: ConstPtr<DeviceObject>, cancelable: Boolean) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoStartNextPacket(deviceobject.rawAddress, cancelable)
}

public actual fun ioStartNextPacketByKey(deviceobject: ConstPtr<DeviceObject>, cancelable: Boolean, key: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoStartNextPacketByKey(deviceobject.rawAddress, cancelable, key.toInt())
}

public actual fun ioStartPacket(deviceobject: ConstPtr<DeviceObject>, irp: ConstPtr<Irp>, key: ConstPtr<UInt>, cancelfunction: DriverCancel) {
}

public actual fun ioStartTimer(deviceobject: ConstPtr<DeviceObject>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoStartTimer(deviceobject.rawAddress)
}

public actual fun ioStopTimer(deviceobject: ConstPtr<DeviceObject>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoStopTimer(deviceobject.rawAddress)
}

public actual fun ioSynchronousCallDriver(deviceobject: ConstPtr<DeviceObject>, irp: ConstPtr<Irp>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoSynchronousCallDriver(deviceobject.rawAddress, irp.rawAddress)

public actual fun ioTransferActivityId(activityid: ConstPtr<Guid>, relatedactivityid: ConstPtr<Guid>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoTransferActivityId(activityid.rawAddress, relatedactivityid.rawAddress)
}

public actual fun ioTranslateBusAddress(interfacetype: InterfaceType, busnumber: UInt, busaddress: Long, addressspace: MutPtr<UInt>, translatedaddress: MutPtr<Long>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoTranslateBusAddress(interfacetype, busnumber.toInt(), busaddress, addressspace.rawAddress, translatedaddress.rawAddress)

public actual fun ioTryQueueWorkItem(ioworkitem: PioWorkitem, workerroutine: PioWorkitemRoutineEx, queuetype: WorkQueueType, context: ConstPtr<CVoid>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoTryQueueWorkItem(ioworkitem, 0L, queuetype, context.rawAddress)

public actual fun ioUninitializeWorkItem(ioworkitem: PioWorkitem) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoUninitializeWorkItem(ioworkitem)
}

public actual fun ioUnregisterBootDriverCallback(callbackhandle: ConstPtr<CVoid>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoUnregisterBootDriverCallback(callbackhandle.rawAddress)
}

public actual fun ioUnregisterContainerNotification(callbackregistration: ConstPtr<CVoid>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoUnregisterContainerNotification(callbackregistration.rawAddress)
}

public actual fun ioUnregisterPlugPlayNotification(notificationentry: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoUnregisterPlugPlayNotification(notificationentry.rawAddress)

public actual fun ioUnregisterPlugPlayNotificationEx(notificationentry: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoUnregisterPlugPlayNotificationEx(notificationentry.rawAddress)

public actual fun ioUnregisterShutdownNotification(deviceobject: ConstPtr<DeviceObject>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoUnregisterShutdownNotification(deviceobject.rawAddress)
}

public actual fun ioUpdateLinkShareAccess(fileobject: ConstPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, linkshareaccess: MutPtr<LinkShareAccess>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoUpdateLinkShareAccess(fileobject.rawAddress, shareaccess.rawAddress, linkshareaccess.rawAddress)
}

public actual fun ioUpdateLinkShareAccessEx(fileobject: ConstPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, linkshareaccess: MutPtr<LinkShareAccess>, ioshareaccessflags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoUpdateLinkShareAccessEx(fileobject.rawAddress, shareaccess.rawAddress, linkshareaccess.rawAddress, ioshareaccessflags.toInt())
}

public actual fun ioUpdateShareAccess(fileobject: ConstPtr<FileObject>, shareaccess: MutPtr<ShareAccess>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoUpdateShareAccess(fileobject.rawAddress, shareaccess.rawAddress)
}

public actual fun ioValidateDeviceIoControlAccess(irp: ConstPtr<Irp>, requiredaccess: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoValidateDeviceIoControlAccess(irp.rawAddress, requiredaccess.toInt())

public actual fun ioVerifyPartitionTable(deviceobject: ConstPtr<DeviceObject>, fixerrors: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoVerifyPartitionTable(deviceobject.rawAddress, fixerrors)

public actual fun ioVolumeDeviceNameToGuid(volumedevicename: ConstPtr<UnicodeString>, guid: MutPtr<Guid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoVolumeDeviceNameToGuid(volumedevicename.rawAddress, guid.rawAddress)

public actual fun ioVolumeDeviceNameToGuidPath(volumedevicename: ConstPtr<UnicodeString>, guidpath: MutPtr<UnicodeString>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoVolumeDeviceNameToGuidPath(volumedevicename.rawAddress, guidpath.rawAddress)

public actual fun ioVolumeDeviceToDosName(volumedeviceobject: ConstPtr<CVoid>, dosname: MutPtr<UnicodeString>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoVolumeDeviceToDosName(volumedeviceobject.rawAddress, dosname.rawAddress)

public actual fun ioVolumeDeviceToGuid(volumedeviceobject: ConstPtr<CVoid>, guid: MutPtr<Guid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoVolumeDeviceToGuid(volumedeviceobject.rawAddress, guid.rawAddress)

public actual fun ioVolumeDeviceToGuidPath(volumedeviceobject: ConstPtr<CVoid>, guidpath: MutPtr<UnicodeString>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoVolumeDeviceToGuidPath(volumedeviceobject.rawAddress, guidpath.rawAddress)

public actual fun ioWMIAllocateInstanceIds(guid: ConstPtr<Guid>, instancecount: UInt, firstinstanceid: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoWMIAllocateInstanceIds(guid.rawAddress, instancecount.toInt(), firstinstanceid.rawAddress)

public actual fun ioWMIDeviceObjectToInstanceName(datablockobject: ConstPtr<CVoid>, deviceobject: ConstPtr<DeviceObject>, instancename: MutPtr<UnicodeString>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoWMIDeviceObjectToInstanceName(datablockobject.rawAddress, deviceobject.rawAddress, instancename.rawAddress)

public actual fun ioWMIExecuteMethod(datablockobject: ConstPtr<CVoid>, instancename: ConstPtr<UnicodeString>, methodid: UInt, inbuffersize: UInt, outbuffersize: MutPtr<UInt>, inoutbuffer: MutPtr<UByte>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoWMIExecuteMethod(datablockobject.rawAddress, instancename.rawAddress, methodid.toInt(), inbuffersize.toInt(), outbuffersize.rawAddress, inoutbuffer.rawAddress)

public actual fun ioWMIHandleToInstanceName(datablockobject: ConstPtr<CVoid>, filehandle: Handle, instancename: MutPtr<UnicodeString>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoWMIHandleToInstanceName(datablockobject.rawAddress, filehandle.rawAddress, instancename.rawAddress)

public actual fun ioWMIOpenBlock(guid: ConstPtr<Guid>, desiredaccess: UInt, datablockobject: MutPtr<MutPtr<CVoid>>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoWMIOpenBlock(guid.rawAddress, desiredaccess.toInt(), datablockobject.rawAddress)

public actual fun ioWMIQueryAllData(datablockobject: ConstPtr<CVoid>, inoutbuffersize: MutPtr<UInt>, outbuffer: MutPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoWMIQueryAllData(datablockobject.rawAddress, inoutbuffersize.rawAddress, outbuffer.rawAddress)

public actual fun ioWMIQueryAllDataMultiple(datablockobjectlist: ConstPtr<ConstPtr<CVoid>>, objectcount: UInt, inoutbuffersize: MutPtr<UInt>, outbuffer: MutPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoWMIQueryAllDataMultiple(datablockobjectlist.rawAddress, objectcount.toInt(), inoutbuffersize.rawAddress, outbuffer.rawAddress)

public actual fun ioWMIQuerySingleInstance(datablockobject: ConstPtr<CVoid>, instancename: ConstPtr<UnicodeString>, inoutbuffersize: MutPtr<UInt>, outbuffer: MutPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoWMIQuerySingleInstance(datablockobject.rawAddress, instancename.rawAddress, inoutbuffersize.rawAddress, outbuffer.rawAddress)

public actual fun ioWMIQuerySingleInstanceMultiple(datablockobjectlist: ConstPtr<ConstPtr<CVoid>>, instancenames: ConstPtr<UnicodeString>, objectcount: UInt, inoutbuffersize: MutPtr<UInt>, outbuffer: MutPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoWMIQuerySingleInstanceMultiple(datablockobjectlist.rawAddress, instancenames.rawAddress, objectcount.toInt(), inoutbuffersize.rawAddress, outbuffer.rawAddress)

public actual fun ioWMIRegistrationControl(deviceobject: ConstPtr<DeviceObject>, action: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoWMIRegistrationControl(deviceobject.rawAddress, action.toInt())

public actual fun ioWMISetNotificationCallback(obj: MutPtr<CVoid>, callback: WmiNotificationCallback, context: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoWMISetNotificationCallback(obj.rawAddress, 0L, context.rawAddress)

public actual fun ioWMISetSingleInstance(datablockobject: ConstPtr<CVoid>, instancename: ConstPtr<UnicodeString>, version: UInt, valuebuffersize: UInt, valuebuffer: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoWMISetSingleInstance(datablockobject.rawAddress, instancename.rawAddress, version.toInt(), valuebuffersize.toInt(), valuebuffer.rawAddress)

public actual fun ioWMISetSingleItem(datablockobject: ConstPtr<CVoid>, instancename: ConstPtr<UnicodeString>, dataitemid: UInt, version: UInt, valuebuffersize: UInt, valuebuffer: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoWMISetSingleItem(datablockobject.rawAddress, instancename.rawAddress, dataitemid.toInt(), version.toInt(), valuebuffersize.toInt(), valuebuffer.rawAddress)

public actual fun ioWMISuggestInstanceName(physicaldeviceobject: ConstPtr<DeviceObject>, symboliclinkname: ConstPtr<UnicodeString>, combinenames: Boolean, suggestedinstancename: MutPtr<UnicodeString>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoWMISuggestInstanceName(physicaldeviceobject.rawAddress, symboliclinkname.rawAddress, combinenames, suggestedinstancename.rawAddress)

public actual fun ioWMIWriteEvent(wnodeeventitem: MutPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoWMIWriteEvent(wnodeeventitem.rawAddress)

public actual fun ioWithinStackLimits(regionstart: ULong, regionsize: ULong): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoWithinStackLimits(regionstart.toLong(), regionsize.toLong()).toUInt()

public actual fun ioWriteErrorLogEntry(elentry: ConstPtr<CVoid>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoWriteErrorLogEntry(elentry.rawAddress)
}

public actual fun ioWriteKsrPersistentMemory(datahandle: ConstPtr<CVoid>, buffer: ConstPtr<CVoid>, size: ULong): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoWriteKsrPersistentMemory(datahandle.rawAddress, buffer.rawAddress, size.toLong())

public actual fun ioWritePartitionTable(deviceobject: ConstPtr<DeviceObject>, sectorsize: UInt, sectorspertrack: UInt, numberofheads: UInt, partitionbuffer: ConstPtr<DriveLayoutInformation>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoWritePartitionTable(deviceobject.rawAddress, sectorsize.toInt(), sectorspertrack.toInt(), numberofheads.toInt(), partitionbuffer.rawAddress)

public actual fun ioWritePartitionTableEx(deviceobject: ConstPtr<DeviceObject>, drivelayout: ConstPtr<DriveLayoutInformationEx>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIoWritePartitionTableEx(deviceobject.rawAddress, drivelayout.rawAddress)

public actual fun iofCallDriver(deviceobject: ConstPtr<DeviceObject>, irp: MutPtr<Irp>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIofCallDriver(deviceobject.rawAddress, irp.rawAddress)

public actual fun iofCompleteRequest(irp: ConstPtr<Irp>, priorityboost: Byte) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesIofCompleteRequest(irp.rawAddress, priorityboost)
}

public actual fun kdChangeOption(option: KdOption, inbufferbytes: UInt, inbuffer: ConstPtr<CVoid>, outbufferbytes: UInt, outbuffer: MutPtr<CVoid>, outbufferneeded: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKdChangeOption(option, inbufferbytes.toInt(), inbuffer.rawAddress, outbufferbytes.toInt(), outbuffer.rawAddress, outbufferneeded.rawAddress)

public actual fun kdDisableDebugger(): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKdDisableDebugger()

public actual fun kdEnableDebugger(): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKdEnableDebugger()

public actual fun kdRefreshDebuggerNotPresent(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKdRefreshDebuggerNotPresent()

public actual fun keAcquireGuardedMutex(mutex: MutPtr<FastMutex>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeAcquireGuardedMutex(mutex.rawAddress)
}

public actual fun keAcquireGuardedMutexUnsafe(fastmutex: MutPtr<FastMutex>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeAcquireGuardedMutexUnsafe(fastmutex.rawAddress)
}

public actual fun keAcquireInStackQueuedSpinLock(spinlock: MutPtr<ULong>, lockhandle: MutPtr<KlockQueueHandle>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeAcquireInStackQueuedSpinLock(spinlock.rawAddress, lockhandle.rawAddress)
}

public actual fun keAcquireInStackQueuedSpinLockAtDpcLevel(spinlock: MutPtr<ULong>, lockhandle: MutPtr<KlockQueueHandle>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeAcquireInStackQueuedSpinLockAtDpcLevel(spinlock.rawAddress, lockhandle.rawAddress)
}

public actual fun keAcquireInStackQueuedSpinLockForDpc(spinlock: MutPtr<ULong>, lockhandle: MutPtr<KlockQueueHandle>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeAcquireInStackQueuedSpinLockForDpc(spinlock.rawAddress, lockhandle.rawAddress)
}

public actual fun keAcquireInterruptSpinLock(interrupt: Pkinterrupt): UByte =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeAcquireInterruptSpinLock(interrupt).toUByte()

public actual fun keAcquireSpinLockForDpc(spinlock: MutPtr<ULong>): UByte =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeAcquireSpinLockForDpc(spinlock.rawAddress).toUByte()

public actual fun keAddTriageDumpDataBlock(ktriagedumpdataarray: MutPtr<KtriageDumpDataArray>, address: ConstPtr<CVoid>, size: ULong): Ntstatus =
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

public actual fun keCancelTimer(param0: MutPtr<Ktimer>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeCancelTimer(param0.rawAddress)

public actual fun keClearEvent(event: MutPtr<Kevent>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeClearEvent(event.rawAddress)
}

public actual fun keConvertAuxiliaryCounterToPerformanceCounter(auxiliarycountervalue: ULong, performancecountervalue: MutPtr<ULong>, conversionerror: MutPtr<ULong>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeConvertAuxiliaryCounterToPerformanceCounter(auxiliarycountervalue.toLong(), performancecountervalue.rawAddress, conversionerror.rawAddress)

public actual fun keConvertPerformanceCounterToAuxiliaryCounter(performancecountervalue: ULong, auxiliarycountervalue: MutPtr<ULong>, conversionerror: MutPtr<ULong>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeConvertPerformanceCounterToAuxiliaryCounter(performancecountervalue.toLong(), auxiliarycountervalue.rawAddress, conversionerror.rawAddress)

public actual fun keDelayExecutionThread(waitmode: Byte, alertable: Boolean, interval: ConstPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeDelayExecutionThread(waitmode, alertable, interval.rawAddress)

public actual fun keDeregisterBoundCallback(handle: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeDeregisterBoundCallback(handle.rawAddress)

public actual fun keDeregisterBugCheckCallback(callbackrecord: MutPtr<KbugcheckCallbackRecord>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeDeregisterBugCheckCallback(callbackrecord.rawAddress)

public actual fun keDeregisterBugCheckReasonCallback(callbackrecord: MutPtr<KbugcheckReasonCallbackRecord>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeDeregisterBugCheckReasonCallback(callbackrecord.rawAddress)

public actual fun keDeregisterNmiCallback(handle: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeDeregisterNmiCallback(handle.rawAddress)

public actual fun keDeregisterProcessorChangeCallback(callbackhandle: ConstPtr<CVoid>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeDeregisterProcessorChangeCallback(callbackhandle.rawAddress)
}

public actual fun keEnterCriticalRegion() {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeEnterCriticalRegion()
}

public actual fun keEnterGuardedRegion() {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeEnterGuardedRegion()
}

public actual fun keExpandKernelStackAndCallout(callout: PexpandStackCallout, parameter: ConstPtr<CVoid>, size: ULong): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeExpandKernelStackAndCallout(0L, parameter.rawAddress, size.toLong())

public actual fun keExpandKernelStackAndCalloutEx(callout: PexpandStackCallout, parameter: ConstPtr<CVoid>, size: ULong, wait: Boolean, context: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeExpandKernelStackAndCalloutEx(0L, parameter.rawAddress, size.toLong(), wait, context.rawAddress)

public actual fun keFlushIoBuffers(mdl: ConstPtr<Mdl>, readoperation: Boolean, dmaoperation: Boolean) {
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

public actual fun keGetCurrentProcessorNumberEx(procnumber: MutPtr<ProcessorNumber>): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeGetCurrentProcessorNumberEx(procnumber.rawAddress).toUInt()

public actual fun keGetProcessorIndexFromNumber(procnumber: ConstPtr<ProcessorNumber>): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeGetProcessorIndexFromNumber(procnumber.rawAddress).toUInt()

public actual fun keGetProcessorNumberFromIndex(procindex: UInt, procnumber: MutPtr<ProcessorNumber>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeGetProcessorNumberFromIndex(procindex.toInt(), procnumber.rawAddress)

public actual fun keGetRecommendedSharedDataAlignment(): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeGetRecommendedSharedDataAlignment().toUInt()

public actual fun keInitializeCrashDumpHeader(dumptype: UInt, flags: UInt, buffer: MutPtr<CVoid>, buffersize: UInt, bufferneeded: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeInitializeCrashDumpHeader(dumptype.toInt(), flags.toInt(), buffer.rawAddress, buffersize.toInt(), bufferneeded.rawAddress)

public actual fun keInitializeDeviceQueue(devicequeue: MutPtr<KdeviceQueue>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeInitializeDeviceQueue(devicequeue.rawAddress)
}

public actual fun keInitializeDpc(dpc: MutPtr<Kdpc>, deferredroutine: PkdeferredRoutine, deferredcontext: ConstPtr<CVoid>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeInitializeDpc(dpc.rawAddress, 0L, deferredcontext.rawAddress)
}

public actual fun keInitializeEvent(event: MutPtr<Kevent>, type: EventType, state: Boolean) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeInitializeEvent(event.rawAddress, type, state)
}

public actual fun keInitializeGuardedMutex(mutex: MutPtr<FastMutex>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeInitializeGuardedMutex(mutex.rawAddress)
}

public actual fun keInitializeMutex(mutex: MutPtr<Kmutant>, level: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeInitializeMutex(mutex.rawAddress, level.toInt())
}

public actual fun keInitializeSemaphore(semaphore: MutPtr<Ksemaphore>, count: Int, limit: Int) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeInitializeSemaphore(semaphore.rawAddress, count, limit)
}

public actual fun keInitializeSpinLock(spinlock: MutPtr<ULong>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeInitializeSpinLock(spinlock.rawAddress)
}

public actual fun keInitializeThreadedDpc(dpc: MutPtr<Kdpc>, deferredroutine: PkdeferredRoutine, deferredcontext: ConstPtr<CVoid>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeInitializeThreadedDpc(dpc.rawAddress, 0L, deferredcontext.rawAddress)
}

public actual fun keInitializeTimer(timer: MutPtr<Ktimer>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeInitializeTimer(timer.rawAddress)
}

public actual fun keInitializeTimerEx(timer: MutPtr<Ktimer>, type: TimerType) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeInitializeTimerEx(timer.rawAddress, type)
}

public actual fun keInitializeTriageDumpDataArray(ktriagedumpdataarray: MutPtr<KtriageDumpDataArray>, size: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeInitializeTriageDumpDataArray(ktriagedumpdataarray.rawAddress, size.toInt())

public actual fun keInsertByKeyDeviceQueue(devicequeue: MutPtr<KdeviceQueue>, devicequeueentry: MutPtr<KdeviceQueueEntry>, sortkey: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeInsertByKeyDeviceQueue(devicequeue.rawAddress, devicequeueentry.rawAddress, sortkey.toInt())

public actual fun keInsertDeviceQueue(devicequeue: MutPtr<KdeviceQueue>, devicequeueentry: MutPtr<KdeviceQueueEntry>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeInsertDeviceQueue(devicequeue.rawAddress, devicequeueentry.rawAddress)

public actual fun keInsertQueueDpc(dpc: MutPtr<Kdpc>, systemargument1: ConstPtr<CVoid>, systemargument2: ConstPtr<CVoid>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeInsertQueueDpc(dpc.rawAddress, systemargument1.rawAddress, systemargument2.rawAddress)

public actual fun keInvalidateAllCaches(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeInvalidateAllCaches()

public actual fun keInvalidateRangeAllCaches(baseaddress: ConstPtr<CVoid>, length: UInt) {
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

public actual fun kePulseEvent(event: MutPtr<Kevent>, increment: Int, wait: Boolean): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKePulseEvent(event.rawAddress, increment, wait)

public actual fun keQueryActiveGroupCount(): UShort =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryActiveGroupCount().toUShort()

public actual fun keQueryActiveProcessorCount(activeprocessors: MutPtr<ULong>): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryActiveProcessorCount(activeprocessors.rawAddress).toUInt()

public actual fun keQueryActiveProcessorCountEx(groupnumber: UShort): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryActiveProcessorCountEx(groupnumber.toShort()).toUInt()

public actual fun keQueryActiveProcessors(): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryActiveProcessors().toULong()

public actual fun keQueryAuxiliaryCounterFrequency(auxiliarycounterfrequency: MutPtr<ULong>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryAuxiliaryCounterFrequency(auxiliarycounterfrequency.rawAddress)

public actual fun keQueryDpcWatchdogInformation(watchdoginformation: MutPtr<KdpcWatchdogInformation>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryDpcWatchdogInformation(watchdoginformation.rawAddress)

public actual fun keQueryGroupAffinity(groupnumber: UShort): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryGroupAffinity(groupnumber.toShort()).toULong()

public actual fun keQueryHardwareCounterConfiguration(counterarray: MutPtr<HardwareCounter>, maximumcount: UInt, count: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryHardwareCounterConfiguration(counterarray.rawAddress, maximumcount.toInt(), count.rawAddress)

public actual fun keQueryHighestNodeNumber(): UShort =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryHighestNodeNumber().toUShort()

public actual fun keQueryInterruptTimePrecise(qpctimestamp: MutPtr<ULong>): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryInterruptTimePrecise(qpctimestamp.rawAddress).toULong()

public actual fun keQueryLogicalProcessorRelationship(processornumber: ConstPtr<ProcessorNumber>, relationshiptype: LogicalProcessorRelationship, information: MutPtr<SystemLogicalProcessorInformationEx>, length: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryLogicalProcessorRelationship(processornumber.rawAddress, relationshiptype, information.rawAddress, length.rawAddress)

public actual fun keQueryMaximumGroupCount(): UShort =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryMaximumGroupCount().toUShort()

public actual fun keQueryMaximumProcessorCount(): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryMaximumProcessorCount().toUInt()

public actual fun keQueryMaximumProcessorCountEx(groupnumber: UShort): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryMaximumProcessorCountEx(groupnumber.toShort()).toUInt()

public actual fun keQueryNodeActiveAffinity(nodenumber: UShort, affinity: MutPtr<GroupAffinity>, count: MutPtr<UShort>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryNodeActiveAffinity(nodenumber.toShort(), affinity.rawAddress, count.rawAddress)
}

public actual fun keQueryNodeActiveAffinity2(nodenumber: UShort, groupaffinities: MutPtr<GroupAffinity>, groupaffinitiescount: UShort, groupaffinitiesrequired: MutPtr<UShort>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryNodeActiveAffinity2(nodenumber.toShort(), groupaffinities.rawAddress, groupaffinitiescount.toShort(), groupaffinitiesrequired.rawAddress)

public actual fun keQueryNodeActiveProcessorCount(nodenumber: UShort): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryNodeActiveProcessorCount(nodenumber.toShort()).toUInt()

public actual fun keQueryNodeMaximumProcessorCount(nodenumber: UShort): UShort =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryNodeMaximumProcessorCount(nodenumber.toShort()).toUShort()

public actual fun keQueryPerformanceCounter(performancefrequency: MutPtr<Long>): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryPerformanceCounter(performancefrequency.rawAddress)

public actual fun keQueryPriorityThread(thread: Pkthread): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryPriorityThread(thread)

public actual fun keQueryRuntimeThread(thread: Pkthread, usertime: MutPtr<UInt>): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryRuntimeThread(thread, usertime.rawAddress).toUInt()

public actual fun keQuerySystemTimePrecise(currenttime: MutPtr<Long>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQuerySystemTimePrecise(currenttime.rawAddress)
}

public actual fun keQueryTimeIncrement(): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryTimeIncrement().toUInt()

public actual fun keQueryTotalCycleTimeThread(thread: Pkthread, cycletimestamp: MutPtr<ULong>): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryTotalCycleTimeThread(thread, cycletimestamp.rawAddress).toULong()

public actual fun keQueryUnbiasedInterruptTime(): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryUnbiasedInterruptTime().toULong()

public actual fun keQueryUnbiasedInterruptTimePrecise(qpctimestamp: MutPtr<ULong>): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeQueryUnbiasedInterruptTimePrecise(qpctimestamp.rawAddress).toULong()

public actual fun keReadStateEvent(event: ConstPtr<Kevent>): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeReadStateEvent(event.rawAddress)

public actual fun keReadStateMutex(mutex: ConstPtr<Kmutant>): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeReadStateMutex(mutex.rawAddress)

public actual fun keReadStateSemaphore(semaphore: ConstPtr<Ksemaphore>): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeReadStateSemaphore(semaphore.rawAddress)

public actual fun keReadStateTimer(timer: ConstPtr<Ktimer>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeReadStateTimer(timer.rawAddress)

public actual fun keRegisterBoundCallback(callbackroutine: PboundCallback): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeRegisterBoundCallback(0L))

public actual fun keRegisterBugCheckCallback(callbackrecord: MutPtr<KbugcheckCallbackRecord>, callbackroutine: PkbugcheckCallbackRoutine, buffer: ConstPtr<CVoid>, length: UInt, component: ConstPtr<UByte>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeRegisterBugCheckCallback(callbackrecord.rawAddress, 0L, buffer.rawAddress, length.toInt(), component.rawAddress)

public actual fun keRegisterBugCheckReasonCallback(callbackrecord: MutPtr<KbugcheckReasonCallbackRecord>, callbackroutine: PkbugcheckReasonCallbackRoutine, reason: KbugcheckCallbackReason, component: ConstPtr<UByte>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeRegisterBugCheckReasonCallback(callbackrecord.rawAddress, 0L, reason, component.rawAddress)

public actual fun keRegisterNmiCallback(callbackroutine: PnmiCallback, context: ConstPtr<CVoid>): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeRegisterNmiCallback(0L, context.rawAddress))

public actual fun keRegisterProcessorChangeCallback(callbackfunction: PprocessorCallbackFunction, callbackcontext: ConstPtr<CVoid>, flags: UInt): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeRegisterProcessorChangeCallback(0L, callbackcontext.rawAddress, flags.toInt()))

public actual fun keReleaseGuardedMutex(mutex: MutPtr<FastMutex>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeReleaseGuardedMutex(mutex.rawAddress)
}

public actual fun keReleaseGuardedMutexUnsafe(fastmutex: MutPtr<FastMutex>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeReleaseGuardedMutexUnsafe(fastmutex.rawAddress)
}

public actual fun keReleaseInStackQueuedSpinLock(lockhandle: ConstPtr<KlockQueueHandle>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeReleaseInStackQueuedSpinLock(lockhandle.rawAddress)
}

public actual fun keReleaseInStackQueuedSpinLockForDpc(lockhandle: ConstPtr<KlockQueueHandle>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeReleaseInStackQueuedSpinLockForDpc(lockhandle.rawAddress)
}

public actual fun keReleaseInStackQueuedSpinLockFromDpcLevel(lockhandle: ConstPtr<KlockQueueHandle>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeReleaseInStackQueuedSpinLockFromDpcLevel(lockhandle.rawAddress)
}

public actual fun keReleaseInterruptSpinLock(interrupt: Pkinterrupt, oldirql: UByte) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeReleaseInterruptSpinLock(interrupt, oldirql.toByte())
}

public actual fun keReleaseMutex(mutex: MutPtr<Kmutant>, wait: Boolean): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeReleaseMutex(mutex.rawAddress, wait)

public actual fun keReleaseSemaphore(semaphore: MutPtr<Ksemaphore>, increment: Int, adjustment: Int, wait: Boolean): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeReleaseSemaphore(semaphore.rawAddress, increment, adjustment, wait)

public actual fun keReleaseSpinLockForDpc(spinlock: MutPtr<ULong>, oldirql: UByte) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeReleaseSpinLockForDpc(spinlock.rawAddress, oldirql.toByte())
}

public actual fun keRemoveByKeyDeviceQueue(devicequeue: MutPtr<KdeviceQueue>, sortkey: UInt): MutPtr<KdeviceQueueEntry> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeRemoveByKeyDeviceQueue(devicequeue.rawAddress, sortkey.toInt()))

public actual fun keRemoveByKeyDeviceQueueIfBusy(devicequeue: MutPtr<KdeviceQueue>, sortkey: UInt): MutPtr<KdeviceQueueEntry> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeRemoveByKeyDeviceQueueIfBusy(devicequeue.rawAddress, sortkey.toInt()))

public actual fun keRemoveDeviceQueue(devicequeue: MutPtr<KdeviceQueue>): MutPtr<KdeviceQueueEntry> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeRemoveDeviceQueue(devicequeue.rawAddress))

public actual fun keRemoveEntryDeviceQueue(devicequeue: MutPtr<KdeviceQueue>, devicequeueentry: MutPtr<KdeviceQueueEntry>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeRemoveEntryDeviceQueue(devicequeue.rawAddress, devicequeueentry.rawAddress)

public actual fun keRemoveQueueDpc(dpc: MutPtr<Kdpc>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeRemoveQueueDpc(dpc.rawAddress)

public actual fun keRemoveQueueDpcEx(dpc: MutPtr<Kdpc>, waitifactive: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeRemoveQueueDpcEx(dpc.rawAddress, waitifactive)

public actual fun keResetEvent(event: MutPtr<Kevent>): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeResetEvent(event.rawAddress)

public actual fun keRestoreExtendedProcessorState(xstatesave: ConstPtr<XstateSave>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeRestoreExtendedProcessorState(xstatesave.rawAddress)
}

public actual fun keRevertToUserAffinityThread() {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeRevertToUserAffinityThread()
}

public actual fun keRevertToUserAffinityThreadEx(affinity: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeRevertToUserAffinityThreadEx(affinity.toLong())
}

public actual fun keRevertToUserGroupAffinityThread(previousaffinity: ConstPtr<GroupAffinity>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeRevertToUserGroupAffinityThread(previousaffinity.rawAddress)
}

public actual fun keSaveExtendedProcessorState(mask: ULong, xstatesave: MutPtr<XstateSave>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeSaveExtendedProcessorState(mask.toLong(), xstatesave.rawAddress)

public actual fun keSetBasePriorityThread(thread: Pkthread, increment: Int): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeSetBasePriorityThread(thread, increment)

public actual fun keSetCoalescableTimer(timer: MutPtr<Ktimer>, duetime: Long, period: UInt, tolerabledelay: UInt, dpc: ConstPtr<Kdpc>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeSetCoalescableTimer(timer.rawAddress, duetime, period.toInt(), tolerabledelay.toInt(), dpc.rawAddress)

public actual fun keSetEvent(event: MutPtr<Kevent>, increment: Int, wait: Boolean): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeSetEvent(event.rawAddress, increment, wait)

public actual fun keSetHardwareCounterConfiguration(counterarray: ConstPtr<HardwareCounter>, count: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeSetHardwareCounterConfiguration(counterarray.rawAddress, count.toInt())

public actual fun keSetImportanceDpc(dpc: MutPtr<Kdpc>, importance: KdpcImportance) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeSetImportanceDpc(dpc.rawAddress, importance)
}

public actual fun keSetPriorityThread(thread: Pkthread, priority: Int): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeSetPriorityThread(thread, priority)

public actual fun keSetSystemAffinityThread(affinity: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeSetSystemAffinityThread(affinity.toLong())
}

public actual fun keSetSystemAffinityThreadEx(affinity: ULong): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeSetSystemAffinityThreadEx(affinity.toLong()).toULong()

public actual fun keSetSystemGroupAffinityThread(affinity: ConstPtr<GroupAffinity>, previousaffinity: MutPtr<GroupAffinity>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeSetSystemGroupAffinityThread(affinity.rawAddress, previousaffinity.rawAddress)
}

public actual fun keSetTargetProcessorDpc(dpc: MutPtr<Kdpc>, number: Byte) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeSetTargetProcessorDpc(dpc.rawAddress, number)
}

public actual fun keSetTargetProcessorDpcEx(dpc: MutPtr<Kdpc>, procnumber: ConstPtr<ProcessorNumber>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeSetTargetProcessorDpcEx(dpc.rawAddress, procnumber.rawAddress)

public actual fun keSetTimer(timer: MutPtr<Ktimer>, duetime: Long, dpc: ConstPtr<Kdpc>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeSetTimer(timer.rawAddress, duetime, dpc.rawAddress)

public actual fun keSetTimerEx(timer: MutPtr<Ktimer>, duetime: Long, period: Int, dpc: ConstPtr<Kdpc>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeSetTimerEx(timer.rawAddress, duetime, period, dpc.rawAddress)

public actual fun keShouldYieldProcessor(): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeShouldYieldProcessor().toUInt()

public actual fun keStallExecutionProcessor(microseconds: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeStallExecutionProcessor(microseconds.toInt())
}

public actual fun keSynchronizeExecution(interrupt: Pkinterrupt, synchronizeroutine: PksynchronizeRoutine, synchronizecontext: ConstPtr<CVoid>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeSynchronizeExecution(interrupt, 0L, synchronizecontext.rawAddress)

public actual fun keTestSpinLock(spinlock: ConstPtr<ULong>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeTestSpinLock(spinlock.rawAddress)

public actual fun keTryToAcquireGuardedMutex(mutex: MutPtr<FastMutex>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeTryToAcquireGuardedMutex(mutex.rawAddress)

public actual fun keTryToAcquireSpinLockAtDpcLevel(spinlock: MutPtr<ULong>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeTryToAcquireSpinLockAtDpcLevel(spinlock.rawAddress)

public actual fun keWaitForMultipleObjects(count: UInt, obj: ConstPtr<ConstPtr<CVoid>>, waittype: WaitType, waitreason: KwaitReason, waitmode: Byte, alertable: Boolean, timeout: ConstPtr<Long>, waitblockarray: MutPtr<KwaitBlock>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeWaitForMultipleObjects(count.toInt(), obj.rawAddress, waittype, waitreason, waitmode, alertable, timeout.rawAddress, waitblockarray.rawAddress)

public actual fun keWaitForSingleObject(obj: ConstPtr<CVoid>, waitreason: KwaitReason, waitmode: Byte, alertable: Boolean, timeout: ConstPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKeWaitForSingleObject(obj.rawAddress, waitreason, waitmode, alertable, timeout.rawAddress)

public actual fun kfRaiseIrql(newirql: UByte): UByte =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesKfRaiseIrql(newirql.toByte()).toUByte()

public actual fun mmAddPhysicalMemory(startaddress: ConstPtr<Long>, numberofbytes: MutPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmAddPhysicalMemory(startaddress.rawAddress, numberofbytes.rawAddress)

public actual fun mmAddVerifierSpecialThunks(entryroutine: ULong, thunkbuffer: ConstPtr<CVoid>, thunkbuffersize: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmAddVerifierSpecialThunks(entryroutine.toLong(), thunkbuffer.rawAddress, thunkbuffersize.toInt())

public actual fun mmAddVerifierThunks(thunkbuffer: ConstPtr<CVoid>, thunkbuffersize: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmAddVerifierThunks(thunkbuffer.rawAddress, thunkbuffersize.toInt())

public actual fun mmAdvanceMdl(mdl: MutPtr<Mdl>, numberofbytes: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmAdvanceMdl(mdl.rawAddress, numberofbytes.toInt())

public actual fun mmAllocateContiguousMemory(numberofbytes: ULong, highestacceptableaddress: Long): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmAllocateContiguousMemory(numberofbytes.toLong(), highestacceptableaddress))

public actual fun mmAllocateContiguousMemoryEx(numberofbytes: ConstPtr<ULong>, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, preferrednode: UInt, protect: UInt, partitionobject: ConstPtr<CVoid>, tag: UInt, flags: UInt, baseaddress: MutPtr<MutPtr<CVoid>>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmAllocateContiguousMemoryEx(numberofbytes.rawAddress, lowestacceptableaddress, highestacceptableaddress, boundaryaddressmultiple, preferrednode.toInt(), protect.toInt(), partitionobject.rawAddress, tag.toInt(), flags.toInt(), baseaddress.rawAddress)

public actual fun mmAllocateContiguousMemorySpecifyCache(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, cachetype: MemoryCachingType): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmAllocateContiguousMemorySpecifyCache(numberofbytes.toLong(), lowestacceptableaddress, highestacceptableaddress, boundaryaddressmultiple, cachetype))

public actual fun mmAllocateContiguousMemorySpecifyCacheNode(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, cachetype: MemoryCachingType, preferrednode: UInt): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmAllocateContiguousMemorySpecifyCacheNode(numberofbytes.toLong(), lowestacceptableaddress, highestacceptableaddress, boundaryaddressmultiple, cachetype, preferrednode.toInt()))

public actual fun mmAllocateContiguousNodeMemory(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, protect: UInt, preferrednode: UInt): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmAllocateContiguousNodeMemory(numberofbytes.toLong(), lowestacceptableaddress, highestacceptableaddress, boundaryaddressmultiple, protect.toInt(), preferrednode.toInt()))

public actual fun mmAllocateMappingAddress(numberofbytes: ULong, pooltag: UInt): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmAllocateMappingAddress(numberofbytes.toLong(), pooltag.toInt()))

public actual fun mmAllocateMappingAddressEx(numberofbytes: ULong, pooltag: UInt, flags: UInt): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmAllocateMappingAddressEx(numberofbytes.toLong(), pooltag.toInt(), flags.toInt()))

public actual fun mmAllocateMdlForIoSpace(physicaladdresslist: ConstPtr<MmPhysicalAddressList>, numberofentries: ULong, newmdl: MutPtr<MutPtr<Mdl>>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmAllocateMdlForIoSpace(physicaladdresslist.rawAddress, numberofentries.toLong(), newmdl.rawAddress)

public actual fun mmAllocateNodePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MemoryCachingType, idealnode: UInt, flags: UInt): MutPtr<Mdl> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmAllocateNodePagesForMdlEx(lowaddress, highaddress, skipbytes, totalbytes.toLong(), cachetype, idealnode.toInt(), flags.toInt()))

public actual fun mmAllocateNonCachedMemory(numberofbytes: ULong): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmAllocateNonCachedMemory(numberofbytes.toLong()))

public actual fun mmAllocatePagesForMdl(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong): MutPtr<Mdl> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmAllocatePagesForMdl(lowaddress, highaddress, skipbytes, totalbytes.toLong()))

public actual fun mmAllocatePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MemoryCachingType, flags: UInt): MutPtr<Mdl> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmAllocatePagesForMdlEx(lowaddress, highaddress, skipbytes, totalbytes.toLong(), cachetype, flags.toInt()))

public actual fun mmAllocatePartitionNodePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MemoryCachingType, idealnode: UInt, flags: UInt, partitionobject: ConstPtr<CVoid>): MutPtr<Mdl> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmAllocatePartitionNodePagesForMdlEx(lowaddress, highaddress, skipbytes, totalbytes.toLong(), cachetype, idealnode.toInt(), flags.toInt(), partitionobject.rawAddress))

public actual fun mmAreMdlPagesCached(memorydescriptorlist: ConstPtr<Mdl>): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmAreMdlPagesCached(memorydescriptorlist.rawAddress).toUInt()

public actual fun mmBuildMdlForNonPagedPool(memorydescriptorlist: MutPtr<Mdl>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmBuildMdlForNonPagedPool(memorydescriptorlist.rawAddress)
}

public actual fun mmCopyMemory(targetaddress: ConstPtr<CVoid>, sourceaddress: MmCopyAddress, numberofbytes: ULong, flags: UInt, numberofbytestransferred: MutPtr<ULong>): Ntstatus =
    0

public actual fun mmCreateMdl(memorydescriptorlist: MutPtr<Mdl>, base: ConstPtr<CVoid>, length: ULong): MutPtr<Mdl> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmCreateMdl(memorydescriptorlist.rawAddress, base.rawAddress, length.toLong()))

public actual fun mmCreateMirror(): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmCreateMirror()

public actual fun mmFreeContiguousMemory(baseaddress: ConstPtr<CVoid>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmFreeContiguousMemory(baseaddress.rawAddress)
}

public actual fun mmFreeContiguousMemorySpecifyCache(baseaddress: ConstPtr<CVoid>, numberofbytes: ULong, cachetype: MemoryCachingType) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmFreeContiguousMemorySpecifyCache(baseaddress.rawAddress, numberofbytes.toLong(), cachetype)
}

public actual fun mmFreeMappingAddress(baseaddress: ConstPtr<CVoid>, pooltag: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmFreeMappingAddress(baseaddress.rawAddress, pooltag.toInt())
}

public actual fun mmFreeNonCachedMemory(baseaddress: ConstPtr<CVoid>, numberofbytes: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmFreeNonCachedMemory(baseaddress.rawAddress, numberofbytes.toLong())
}

public actual fun mmFreePagesFromMdl(memorydescriptorlist: MutPtr<Mdl>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmFreePagesFromMdl(memorydescriptorlist.rawAddress)
}

public actual fun mmFreePagesFromMdlEx(memorydescriptorlist: MutPtr<Mdl>, flags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmFreePagesFromMdlEx(memorydescriptorlist.rawAddress, flags.toInt())
}

public actual fun mmGetCacheAttribute(physicaladdress: Long, cachetype: MutPtr<MemoryCachingType>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmGetCacheAttribute(physicaladdress, cachetype.rawAddress)

public actual fun mmGetCacheAttributeEx(physicaladdress: Long, flags: UInt, cachetype: MutPtr<MemoryCachingType>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmGetCacheAttributeEx(physicaladdress, flags.toInt(), cachetype.rawAddress)

public actual fun mmGetPhysicalAddress(baseaddress: ConstPtr<CVoid>): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmGetPhysicalAddress(baseaddress.rawAddress)

public actual fun mmGetPhysicalMemoryRanges(): MutPtr<PhysicalMemoryRange> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmGetPhysicalMemoryRanges())

public actual fun mmGetPhysicalMemoryRangesEx(partitionobject: ConstPtr<CVoid>): MutPtr<PhysicalMemoryRange> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmGetPhysicalMemoryRangesEx(partitionobject.rawAddress))

public actual fun mmGetPhysicalMemoryRangesEx2(partitionobject: ConstPtr<CVoid>, flags: UInt): MutPtr<PhysicalMemoryRange> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmGetPhysicalMemoryRangesEx2(partitionobject.rawAddress, flags.toInt()))

public actual fun mmGetSystemRoutineAddress(systemroutinename: ConstPtr<UnicodeString>): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmGetSystemRoutineAddress(systemroutinename.rawAddress))

public actual fun mmGetVirtualForPhysical(physicaladdress: Long): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmGetVirtualForPhysical(physicaladdress))

public actual fun mmIsAddressValid(virtualaddress: ConstPtr<CVoid>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmIsAddressValid(virtualaddress.rawAddress)

public actual fun mmIsDriverSuspectForVerifier(driverobject: ConstPtr<DriverObject>): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmIsDriverSuspectForVerifier(driverobject.rawAddress).toUInt()

public actual fun mmIsDriverVerifying(driverobject: ConstPtr<DriverObject>): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmIsDriverVerifying(driverobject.rawAddress).toUInt()

public actual fun mmIsDriverVerifyingByAddress(addresswithinsection: ConstPtr<CVoid>): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmIsDriverVerifyingByAddress(addresswithinsection.rawAddress).toUInt()

public actual fun mmIsIoSpaceActive(startaddress: Long, numberofbytes: ULong): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmIsIoSpaceActive(startaddress, numberofbytes.toLong()).toUInt()

public actual fun mmIsNonPagedSystemAddressValid(virtualaddress: ConstPtr<CVoid>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmIsNonPagedSystemAddressValid(virtualaddress.rawAddress)

public actual fun mmIsThisAnNtAsSystem(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmIsThisAnNtAsSystem()

public actual fun mmIsVerifierEnabled(verifierflags: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmIsVerifierEnabled(verifierflags.rawAddress)

public actual fun mmLockPagableDataSection(addresswithinsection: ConstPtr<CVoid>): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmLockPagableDataSection(addresswithinsection.rawAddress))

public actual fun mmLockPagableSectionByHandle(imagesectionhandle: ConstPtr<CVoid>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmLockPagableSectionByHandle(imagesectionhandle.rawAddress)
}

public actual fun mmMapIoSpace(physicaladdress: Long, numberofbytes: ULong, cachetype: MemoryCachingType): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmMapIoSpace(physicaladdress, numberofbytes.toLong(), cachetype))

public actual fun mmMapIoSpaceEx(physicaladdress: Long, numberofbytes: ULong, protect: UInt): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmMapIoSpaceEx(physicaladdress, numberofbytes.toLong(), protect.toInt()))

public actual fun mmMapLockedPages(memorydescriptorlist: MutPtr<Mdl>, accessmode: Byte): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmMapLockedPages(memorydescriptorlist.rawAddress, accessmode))

public actual fun mmMapLockedPagesSpecifyCache(memorydescriptorlist: MutPtr<Mdl>, accessmode: Byte, cachetype: MemoryCachingType, requestedaddress: ConstPtr<CVoid>, bugcheckonfailure: UInt, priority: UInt): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmMapLockedPagesSpecifyCache(memorydescriptorlist.rawAddress, accessmode, cachetype, requestedaddress.rawAddress, bugcheckonfailure.toInt(), priority.toInt()))

public actual fun mmMapLockedPagesWithReservedMapping(mappingaddress: ConstPtr<CVoid>, pooltag: UInt, memorydescriptorlist: MutPtr<Mdl>, cachetype: MemoryCachingType): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmMapLockedPagesWithReservedMapping(mappingaddress.rawAddress, pooltag.toInt(), memorydescriptorlist.rawAddress, cachetype))

public actual fun mmMapMdl(memorydescriptorlist: MutPtr<Mdl>, protection: UInt, driverroutine: PmmMdlRoutine, drivercontext: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmMapMdl(memorydescriptorlist.rawAddress, protection.toInt(), 0L, drivercontext.rawAddress)

public actual fun mmMapMemoryDumpMdlEx(va: ConstPtr<CVoid>, pagetotal: UInt, memorydumpmdl: MutPtr<Mdl>, flags: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmMapMemoryDumpMdlEx(va.rawAddress, pagetotal.toInt(), memorydumpmdl.rawAddress, flags.toInt())

public actual fun mmMapUserAddressesToPage(baseaddress: ConstPtr<CVoid>, numberofbytes: ULong, pageaddress: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmMapUserAddressesToPage(baseaddress.rawAddress, numberofbytes.toLong(), pageaddress.rawAddress)

public actual fun mmMapVideoDisplay(physicaladdress: Long, numberofbytes: ULong, cachetype: MemoryCachingType): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmMapVideoDisplay(physicaladdress, numberofbytes.toLong(), cachetype))

public actual fun mmMapViewInSessionSpace(section: ConstPtr<CVoid>, mappedbase: MutPtr<MutPtr<CVoid>>, viewsize: MutPtr<ULong>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmMapViewInSessionSpace(section.rawAddress, mappedbase.rawAddress, viewsize.rawAddress)

public actual fun mmMapViewInSessionSpaceEx(section: ConstPtr<CVoid>, mappedbase: MutPtr<MutPtr<CVoid>>, viewsize: MutPtr<ULong>, sectionoffset: MutPtr<Long>, flags: ULong): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmMapViewInSessionSpaceEx(section.rawAddress, mappedbase.rawAddress, viewsize.rawAddress, sectionoffset.rawAddress, flags.toLong())

public actual fun mmMapViewInSystemSpace(section: ConstPtr<CVoid>, mappedbase: MutPtr<MutPtr<CVoid>>, viewsize: MutPtr<ULong>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmMapViewInSystemSpace(section.rawAddress, mappedbase.rawAddress, viewsize.rawAddress)

public actual fun mmMapViewInSystemSpaceEx(section: ConstPtr<CVoid>, mappedbase: MutPtr<MutPtr<CVoid>>, viewsize: MutPtr<ULong>, sectionoffset: MutPtr<Long>, flags: ULong): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmMapViewInSystemSpaceEx(section.rawAddress, mappedbase.rawAddress, viewsize.rawAddress, sectionoffset.rawAddress, flags.toLong())

public actual fun mmMdlPageContentsState(memorydescriptorlist: MutPtr<Mdl>, state: MmMdlPageContentsState): MmMdlPageContentsState =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmMdlPageContentsState(memorydescriptorlist.rawAddress, state)

public actual fun mmPageEntireDriver(addresswithinsection: ConstPtr<CVoid>): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmPageEntireDriver(addresswithinsection.rawAddress))

public actual fun mmProbeAndLockPages(memorydescriptorlist: MutPtr<Mdl>, accessmode: Byte, operation: LockOperation) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmProbeAndLockPages(memorydescriptorlist.rawAddress, accessmode, operation)
}

public actual fun mmProbeAndLockProcessPages(memorydescriptorlist: MutPtr<Mdl>, process: Peprocess, accessmode: Byte, operation: LockOperation) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmProbeAndLockProcessPages(memorydescriptorlist.rawAddress, process, accessmode, operation)
}

public actual fun mmProbeAndLockSelectedPages(memorydescriptorlist: MutPtr<Mdl>, segmentarray: ConstPtr<FileSegmentElement>, accessmode: Byte, operation: LockOperation) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmProbeAndLockSelectedPages(memorydescriptorlist.rawAddress, segmentarray.rawAddress, accessmode, operation)
}

public actual fun mmProtectDriverSection(addresswithinsection: ConstPtr<CVoid>, size: ULong, flags: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmProtectDriverSection(addresswithinsection.rawAddress, size.toLong(), flags.toInt())

public actual fun mmProtectMdlSystemAddress(memorydescriptorlist: ConstPtr<Mdl>, newprotect: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmProtectMdlSystemAddress(memorydescriptorlist.rawAddress, newprotect.toInt())

public actual fun mmQuerySystemSize(): MmSystemsize =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmQuerySystemSize()

public actual fun mmRemovePhysicalMemory(startaddress: ConstPtr<Long>, numberofbytes: MutPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmRemovePhysicalMemory(startaddress.rawAddress, numberofbytes.rawAddress)

public actual fun mmResetDriverPaging(addresswithinsection: ConstPtr<CVoid>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmResetDriverPaging(addresswithinsection.rawAddress)
}

public actual fun mmRotatePhysicalView(virtualaddress: ConstPtr<CVoid>, numberofbytes: MutPtr<ULong>, newmdl: ConstPtr<Mdl>, direction: MmRotateDirection, copyfunction: PmmRotateCopyCallbackFunction, context: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmRotatePhysicalView(virtualaddress.rawAddress, numberofbytes.rawAddress, newmdl.rawAddress, direction, 0L, context.rawAddress)

public actual fun mmSecureVirtualMemory(address: ConstPtr<CVoid>, size: ULong, probemode: UInt): Handle =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmSecureVirtualMemory(address.rawAddress, size.toLong(), probemode.toInt()))

public actual fun mmSecureVirtualMemoryEx(address: ConstPtr<CVoid>, size: ULong, probemode: UInt, flags: UInt): Handle =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmSecureVirtualMemoryEx(address.rawAddress, size.toLong(), probemode.toInt(), flags.toInt()))

public actual fun mmSetPermanentCacheAttribute(startaddress: Long, numberofbytes: Long, cachetype: MemoryCachingType, flags: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmSetPermanentCacheAttribute(startaddress, numberofbytes, cachetype, flags.toInt())

public actual fun mmSizeOfMdl(base: ConstPtr<CVoid>, length: ULong): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmSizeOfMdl(base.rawAddress, length.toLong()).toULong()

public actual fun mmUnlockPagableImageSection(imagesectionhandle: ConstPtr<CVoid>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmUnlockPagableImageSection(imagesectionhandle.rawAddress)
}

public actual fun mmUnlockPages(memorydescriptorlist: MutPtr<Mdl>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmUnlockPages(memorydescriptorlist.rawAddress)
}

public actual fun mmUnmapIoSpace(baseaddress: ConstPtr<CVoid>, numberofbytes: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmUnmapIoSpace(baseaddress.rawAddress, numberofbytes.toLong())
}

public actual fun mmUnmapLockedPages(baseaddress: ConstPtr<CVoid>, memorydescriptorlist: MutPtr<Mdl>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmUnmapLockedPages(baseaddress.rawAddress, memorydescriptorlist.rawAddress)
}

public actual fun mmUnmapReservedMapping(baseaddress: ConstPtr<CVoid>, pooltag: UInt, memorydescriptorlist: MutPtr<Mdl>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmUnmapReservedMapping(baseaddress.rawAddress, pooltag.toInt(), memorydescriptorlist.rawAddress)
}

public actual fun mmUnmapVideoDisplay(baseaddress: ConstPtr<CVoid>, numberofbytes: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmUnmapVideoDisplay(baseaddress.rawAddress, numberofbytes.toLong())
}

public actual fun mmUnmapViewInSessionSpace(mappedbase: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmUnmapViewInSessionSpace(mappedbase.rawAddress)

public actual fun mmUnmapViewInSystemSpace(mappedbase: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmUnmapViewInSystemSpace(mappedbase.rawAddress)

public actual fun mmUnsecureVirtualMemory(securehandle: Handle) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesMmUnsecureVirtualMemory(securehandle.rawAddress)
}

public actual fun ntAllocateLocallyUniqueId(luid: MutPtr<Luid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtAllocateLocallyUniqueId(luid.rawAddress)

public actual fun ntCommitComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtCommitComplete(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun ntCommitEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtCommitEnlistment(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun ntCommitTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtCommitTransaction(transactionhandle.rawAddress, wait)

public actual fun ntCreateEnlistment(enlistmenthandle: MutPtr<Handle>, desiredaccess: UInt, resourcemanagerhandle: Handle, transactionhandle: Handle, objectattributes: ConstPtr<ObjectAttributes>, createoptions: UInt, notificationmask: UInt, enlistmentkey: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtCreateEnlistment(enlistmenthandle.rawAddress, desiredaccess.toInt(), resourcemanagerhandle.rawAddress, transactionhandle.rawAddress, objectattributes.rawAddress, createoptions.toInt(), notificationmask.toInt(), enlistmentkey.rawAddress)

public actual fun ntCreateResourceManager(resourcemanagerhandle: MutPtr<Handle>, desiredaccess: UInt, tmhandle: Handle, rmguid: ConstPtr<Guid>, objectattributes: ConstPtr<ObjectAttributes>, createoptions: UInt, description: ConstPtr<UnicodeString>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtCreateResourceManager(resourcemanagerhandle.rawAddress, desiredaccess.toInt(), tmhandle.rawAddress, rmguid.rawAddress, objectattributes.rawAddress, createoptions.toInt(), description.rawAddress)

public actual fun ntCreateTransaction(transactionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, uow: ConstPtr<Guid>, tmhandle: Handle, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: ConstPtr<Long>, description: ConstPtr<UnicodeString>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtCreateTransaction(transactionhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, uow.rawAddress, tmhandle.rawAddress, createoptions.toInt(), isolationlevel.toInt(), isolationflags.toInt(), timeout.rawAddress, description.rawAddress)

public actual fun ntCreateTransactionManager(tmhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, logfilename: ConstPtr<UnicodeString>, createoptions: UInt, commitstrength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtCreateTransactionManager(tmhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, logfilename.rawAddress, createoptions.toInt(), commitstrength.toInt())

public actual fun ntDisplayString(string: ConstPtr<UnicodeString>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtDisplayString(string.rawAddress)

public actual fun ntEnumerateTransactionObject(rootobjecthandle: Handle, querytype: KtmobjectType, objectcursor: MutPtr<KtmobjectCursor>, objectcursorlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtEnumerateTransactionObject(rootobjecthandle.rawAddress, querytype, objectcursor.rawAddress, objectcursorlength.toInt(), returnlength.rawAddress)

public actual fun ntGetNotificationResourceManager(resourcemanagerhandle: Handle, transactionnotification: MutPtr<TransactionNotification>, notificationlength: UInt, timeout: ConstPtr<Long>, returnlength: MutPtr<UInt>, asynchronous: UInt, asynchronouscontext: ULong): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtGetNotificationResourceManager(resourcemanagerhandle.rawAddress, transactionnotification.rawAddress, notificationlength.toInt(), timeout.rawAddress, returnlength.rawAddress, asynchronous.toInt(), asynchronouscontext.toLong())

public actual fun ntLoadDriver(driverservicename: ConstPtr<UnicodeString>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtLoadDriver(driverservicename.rawAddress)

public actual fun ntMakeTemporaryObject(handle: Handle): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtMakeTemporaryObject(handle.rawAddress)

public actual fun ntManagePartition(targethandle: Handle, sourcehandle: Handle, partitioninformationclass: PartitionInformationClass, partitioninformation: MutPtr<CVoid>, partitioninformationlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtManagePartition(targethandle.rawAddress, sourcehandle.rawAddress, partitioninformationclass, partitioninformation.rawAddress, partitioninformationlength.toInt())

public actual fun ntOpenEnlistment(enlistmenthandle: MutPtr<Handle>, desiredaccess: UInt, resourcemanagerhandle: Handle, enlistmentguid: ConstPtr<Guid>, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtOpenEnlistment(enlistmenthandle.rawAddress, desiredaccess.toInt(), resourcemanagerhandle.rawAddress, enlistmentguid.rawAddress, objectattributes.rawAddress)

public actual fun ntOpenResourceManager(resourcemanagerhandle: MutPtr<Handle>, desiredaccess: UInt, tmhandle: Handle, resourcemanagerguid: ConstPtr<Guid>, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtOpenResourceManager(resourcemanagerhandle.rawAddress, desiredaccess.toInt(), tmhandle.rawAddress, resourcemanagerguid.rawAddress, objectattributes.rawAddress)

public actual fun ntOpenTransaction(transactionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, uow: ConstPtr<Guid>, tmhandle: Handle): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtOpenTransaction(transactionhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, uow.rawAddress, tmhandle.rawAddress)

public actual fun ntOpenTransactionManager(tmhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, logfilename: ConstPtr<UnicodeString>, tmidentity: ConstPtr<Guid>, openoptions: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtOpenTransactionManager(tmhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, logfilename.rawAddress, tmidentity.rawAddress, openoptions.toInt())

public actual fun ntPowerInformation(informationlevel: PowerInformationLevel, inputbuffer: ConstPtr<CVoid>, inputbufferlength: UInt, outputbuffer: MutPtr<CVoid>, outputbufferlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtPowerInformation(informationlevel, inputbuffer.rawAddress, inputbufferlength.toInt(), outputbuffer.rawAddress, outputbufferlength.toInt())

public actual fun ntPrePrepareComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtPrePrepareComplete(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun ntPrePrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtPrePrepareEnlistment(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun ntPrepareComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtPrepareComplete(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun ntPrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtPrepareEnlistment(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun ntPropagationComplete(resourcemanagerhandle: Handle, requestcookie: UInt, bufferlength: UInt, buffer: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtPropagationComplete(resourcemanagerhandle.rawAddress, requestcookie.toInt(), bufferlength.toInt(), buffer.rawAddress)

public actual fun ntPropagationFailed(resourcemanagerhandle: Handle, requestcookie: UInt, propstatus: Ntstatus): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtPropagationFailed(resourcemanagerhandle.rawAddress, requestcookie.toInt(), propstatus)

public actual fun ntQueryInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: MutPtr<CVoid>, enlistmentinformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtQueryInformationEnlistment(enlistmenthandle.rawAddress, enlistmentinformationclass, enlistmentinformation.rawAddress, enlistmentinformationlength.toInt(), returnlength.rawAddress)

public actual fun ntQueryInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: MutPtr<CVoid>, resourcemanagerinformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtQueryInformationResourceManager(resourcemanagerhandle.rawAddress, resourcemanagerinformationclass, resourcemanagerinformation.rawAddress, resourcemanagerinformationlength.toInt(), returnlength.rawAddress)

public actual fun ntQueryInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: MutPtr<CVoid>, transactioninformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtQueryInformationTransaction(transactionhandle.rawAddress, transactioninformationclass, transactioninformation.rawAddress, transactioninformationlength.toInt(), returnlength.rawAddress)

public actual fun ntQueryInformationTransactionManager(transactionmanagerhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: MutPtr<CVoid>, transactionmanagerinformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtQueryInformationTransactionManager(transactionmanagerhandle.rawAddress, transactionmanagerinformationclass, transactionmanagerinformation.rawAddress, transactionmanagerinformationlength.toInt(), returnlength.rawAddress)

public actual fun ntReadOnlyEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtReadOnlyEnlistment(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun ntRecoverEnlistment(enlistmenthandle: Handle, enlistmentkey: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtRecoverEnlistment(enlistmenthandle.rawAddress, enlistmentkey.rawAddress)

public actual fun ntRecoverResourceManager(resourcemanagerhandle: Handle): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtRecoverResourceManager(resourcemanagerhandle.rawAddress)

public actual fun ntRecoverTransactionManager(transactionmanagerhandle: Handle): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtRecoverTransactionManager(transactionmanagerhandle.rawAddress)

public actual fun ntRegisterProtocolAddressInformation(resourcemanager: Handle, protocolid: ConstPtr<Guid>, protocolinformationsize: UInt, protocolinformation: ConstPtr<CVoid>, createoptions: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtRegisterProtocolAddressInformation(resourcemanager.rawAddress, protocolid.rawAddress, protocolinformationsize.toInt(), protocolinformation.rawAddress, createoptions.toInt())

public actual fun ntRenameTransactionManager(logfilename: ConstPtr<UnicodeString>, existingtransactionmanagerguid: ConstPtr<Guid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtRenameTransactionManager(logfilename.rawAddress, existingtransactionmanagerguid.rawAddress)

public actual fun ntRollbackComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtRollbackComplete(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun ntRollbackEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtRollbackEnlistment(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun ntRollbackTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtRollbackTransaction(transactionhandle.rawAddress, wait)

public actual fun ntRollforwardTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtRollforwardTransactionManager(transactionmanagerhandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun ntSetInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: ConstPtr<CVoid>, enlistmentinformationlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtSetInformationEnlistment(enlistmenthandle.rawAddress, enlistmentinformationclass, enlistmentinformation.rawAddress, enlistmentinformationlength.toInt())

public actual fun ntSetInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: ConstPtr<CVoid>, resourcemanagerinformationlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtSetInformationResourceManager(resourcemanagerhandle.rawAddress, resourcemanagerinformationclass, resourcemanagerinformation.rawAddress, resourcemanagerinformationlength.toInt())

public actual fun ntSetInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: ConstPtr<CVoid>, transactioninformationlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtSetInformationTransaction(transactionhandle.rawAddress, transactioninformationclass, transactioninformation.rawAddress, transactioninformationlength.toInt())

public actual fun ntSetInformationTransactionManager(tmhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: ConstPtr<CVoid>, transactionmanagerinformationlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtSetInformationTransactionManager(tmhandle.rawAddress, transactionmanagerinformationclass, transactionmanagerinformation.rawAddress, transactionmanagerinformationlength.toInt())

public actual fun ntSinglePhaseReject(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtSinglePhaseReject(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun ntUnloadDriver(driverservicename: ConstPtr<UnicodeString>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesNtUnloadDriver(driverservicename.rawAddress)

public actual fun obCloseHandle(handle: Handle, previousmode: Byte): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesObCloseHandle(handle.rawAddress, previousmode)

public actual fun obDereferenceObjectDeferDelete(obj: ConstPtr<CVoid>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesObDereferenceObjectDeferDelete(obj.rawAddress)
}

public actual fun obDereferenceObjectDeferDeleteWithTag(obj: ConstPtr<CVoid>, tag: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesObDereferenceObjectDeferDeleteWithTag(obj.rawAddress, tag.toInt())
}

public actual fun obGetFilterVersion(): UShort =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesObGetFilterVersion().toUShort()

public actual fun obGetObjectSecurity(obj: ConstPtr<CVoid>, securitydescriptor: MutPtr<PsecurityDescriptor>, memoryallocated: MutPtr<Boolean>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesObGetObjectSecurity(obj.rawAddress, securitydescriptor.rawAddress, memoryallocated.rawAddress)

public actual fun obReferenceObjectByHandle(handle: Handle, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, obj: MutPtr<MutPtr<CVoid>>, handleinformation: MutPtr<ObjectHandleInformation>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesObReferenceObjectByHandle(handle.rawAddress, desiredaccess.toInt(), objecttype, accessmode, obj.rawAddress, handleinformation.rawAddress)

public actual fun obReferenceObjectByHandleWithTag(handle: Handle, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, tag: UInt, obj: MutPtr<MutPtr<CVoid>>, handleinformation: MutPtr<ObjectHandleInformation>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesObReferenceObjectByHandleWithTag(handle.rawAddress, desiredaccess.toInt(), objecttype, accessmode, tag.toInt(), obj.rawAddress, handleinformation.rawAddress)

public actual fun obReferenceObjectByPointer(obj: ConstPtr<CVoid>, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesObReferenceObjectByPointer(obj.rawAddress, desiredaccess.toInt(), objecttype, accessmode)

public actual fun obReferenceObjectByPointerWithTag(obj: ConstPtr<CVoid>, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, tag: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesObReferenceObjectByPointerWithTag(obj.rawAddress, desiredaccess.toInt(), objecttype, accessmode, tag.toInt())

public actual fun obReferenceObjectSafe(obj: ConstPtr<CVoid>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesObReferenceObjectSafe(obj.rawAddress)

public actual fun obReferenceObjectSafeWithTag(obj: ConstPtr<CVoid>, tag: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesObReferenceObjectSafeWithTag(obj.rawAddress, tag.toInt())

public actual fun obRegisterCallbacks(callbackregistration: ConstPtr<ObCallbackRegistration>, registrationhandle: MutPtr<MutPtr<CVoid>>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesObRegisterCallbacks(callbackregistration.rawAddress, registrationhandle.rawAddress)

public actual fun obReleaseObjectSecurity(securitydescriptor: PsecurityDescriptor, memoryallocated: Boolean) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesObReleaseObjectSecurity(securitydescriptor.rawAddress, memoryallocated)
}

public actual fun obUnRegisterCallbacks(registrationhandle: ConstPtr<CVoid>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesObUnRegisterCallbacks(registrationhandle.rawAddress)
}

public actual fun obfDereferenceObject(obj: ConstPtr<CVoid>): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesObfDereferenceObject(obj.rawAddress)

public actual fun obfDereferenceObjectWithTag(obj: ConstPtr<CVoid>, tag: UInt): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesObfDereferenceObjectWithTag(obj.rawAddress, tag.toInt())

public actual fun obfReferenceObject(obj: ConstPtr<CVoid>): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesObfReferenceObject(obj.rawAddress)

public actual fun obfReferenceObjectWithTag(obj: ConstPtr<CVoid>, tag: UInt): Long =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesObfReferenceObjectWithTag(obj.rawAddress, tag.toInt())

public actual fun pcwAddInstance(buffer: PpcwBuffer, name: ConstPtr<UnicodeString>, id: UInt, count: UInt, data: ConstPtr<PcwData>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPcwAddInstance(buffer, name.rawAddress, id.toInt(), count.toInt(), data.rawAddress)

public actual fun pcwCloseInstance(instance: PpcwInstance) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPcwCloseInstance(instance)
}

public actual fun pcwCreateInstance(instance: MutPtr<PpcwInstance>, registration: PpcwRegistration, name: ConstPtr<UnicodeString>, count: UInt, data: ConstPtr<PcwData>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPcwCreateInstance(instance.rawAddress, registration, name.rawAddress, count.toInt(), data.rawAddress)

public actual fun pcwRegister(registration: MutPtr<PpcwRegistration>, info: ConstPtr<PcwRegistrationInformation>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPcwRegister(registration.rawAddress, info.rawAddress)

public actual fun pcwUnregister(registration: PpcwRegistration) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPcwUnregister(registration)
}

public actual fun poCallDriver(deviceobject: ConstPtr<DeviceObject>, irp: MutPtr<Irp>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoCallDriver(deviceobject.rawAddress, irp.rawAddress)

public actual fun poClearPowerRequest(powerrequest: MutPtr<CVoid>, type: PowerRequestType): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoClearPowerRequest(powerrequest.rawAddress, type)

public actual fun poCreatePowerRequest(powerrequest: MutPtr<MutPtr<CVoid>>, deviceobject: ConstPtr<DeviceObject>, context: ConstPtr<CountedReasonContext>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoCreatePowerRequest(powerrequest.rawAddress, deviceobject.rawAddress, context.rawAddress)

public actual fun poCreateThermalRequest(thermalrequest: MutPtr<MutPtr<CVoid>>, targetdeviceobject: ConstPtr<DeviceObject>, policydeviceobject: ConstPtr<DeviceObject>, context: ConstPtr<CountedReasonContext>, flags: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoCreateThermalRequest(thermalrequest.rawAddress, targetdeviceobject.rawAddress, policydeviceobject.rawAddress, context.rawAddress, flags.toInt())

public actual fun poDeletePowerRequest(powerrequest: MutPtr<CVoid>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoDeletePowerRequest(powerrequest.rawAddress)
}

public actual fun poDeleteThermalRequest(thermalrequest: MutPtr<CVoid>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoDeleteThermalRequest(thermalrequest.rawAddress)
}

public actual fun poEndDeviceBusy(idlepointer: MutPtr<UInt>) {
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

public actual fun poFxIssueComponentPerfStateChange(handle: Pohandle, flags: UInt, component: UInt, perfchange: ConstPtr<PoFxPerfStateChange>, context: ConstPtr<CVoid>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoFxIssueComponentPerfStateChange(handle.rawAddress, flags.toInt(), component.toInt(), perfchange.rawAddress, context.rawAddress)
}

public actual fun poFxIssueComponentPerfStateChangeMultiple(handle: Pohandle, flags: UInt, component: UInt, perfchangescount: UInt, perfchanges: ConstPtr<PoFxPerfStateChange>, context: ConstPtr<CVoid>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoFxIssueComponentPerfStateChangeMultiple(handle.rawAddress, flags.toInt(), component.toInt(), perfchangescount.toInt(), perfchanges.rawAddress, context.rawAddress)
}

public actual fun poFxNotifySurprisePowerOn(pdo: ConstPtr<DeviceObject>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoFxNotifySurprisePowerOn(pdo.rawAddress)
}

public actual fun poFxPowerControl(handle: Pohandle, powercontrolcode: ConstPtr<Guid>, inbuffer: ConstPtr<CVoid>, inbuffersize: ULong, outbuffer: MutPtr<CVoid>, outbuffersize: ULong, bytesreturned: MutPtr<ULong>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoFxPowerControl(handle.rawAddress, powercontrolcode.rawAddress, inbuffer.rawAddress, inbuffersize.toLong(), outbuffer.rawAddress, outbuffersize.toLong(), bytesreturned.rawAddress)

public actual fun poFxPowerOnCrashdumpDevice(handle: Pohandle, context: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoFxPowerOnCrashdumpDevice(handle.rawAddress, context.rawAddress)

public actual fun poFxQueryCurrentComponentPerfState(handle: Pohandle, flags: UInt, component: UInt, setindex: UInt, currentperf: MutPtr<ULong>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoFxQueryCurrentComponentPerfState(handle.rawAddress, flags.toInt(), component.toInt(), setindex.toInt(), currentperf.rawAddress)

public actual fun poFxRegisterComponentPerfStates(handle: Pohandle, component: UInt, flags: ULong, componentperfstatecallback: PpoFxComponentPerfStateCallback, inputstateinfo: ConstPtr<PoFxComponentPerfInfo>, outputstateinfo: MutPtr<MutPtr<PoFxComponentPerfInfo>>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoFxRegisterComponentPerfStates(handle.rawAddress, component.toInt(), flags.toLong(), 0L, inputstateinfo.rawAddress, outputstateinfo.rawAddress)

public actual fun poFxRegisterCrashdumpDevice(handle: Pohandle): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoFxRegisterCrashdumpDevice(handle.rawAddress)

public actual fun poFxRegisterDevice(pdo: ConstPtr<DeviceObject>, device: ConstPtr<PoFxDeviceV1>, handle: MutPtr<Pohandle>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoFxRegisterDevice(pdo.rawAddress, device.rawAddress, handle.rawAddress)

public actual fun poFxRegisterDripsWatchdogCallback(handle: Pohandle, callback: PpoFxDripsWatchdogCallback, includechilddevices: Boolean, matchingdriverobject: ConstPtr<DriverObject>) {
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

public actual fun poGetSystemWake(irp: ConstPtr<Irp>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoGetSystemWake(irp.rawAddress)

public actual fun poGetThermalRequestSupport(thermalrequest: ConstPtr<CVoid>, type: PoThermalRequestType): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoGetThermalRequestSupport(thermalrequest.rawAddress, type)

public actual fun poQueryWatchdogTime(pdo: ConstPtr<DeviceObject>, secondsremaining: MutPtr<UInt>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoQueryWatchdogTime(pdo.rawAddress, secondsremaining.rawAddress)

public actual fun poRegisterDeviceForIdleDetection(deviceobject: ConstPtr<DeviceObject>, conservationidletime: UInt, performanceidletime: UInt, state: DevicePowerState): MutPtr<UInt> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoRegisterDeviceForIdleDetection(deviceobject.rawAddress, conservationidletime.toInt(), performanceidletime.toInt(), state))

public actual fun poRegisterPowerSettingCallback(deviceobject: ConstPtr<DeviceObject>, settingguid: ConstPtr<Guid>, callback: PpowerSettingCallback, context: ConstPtr<CVoid>, handle: MutPtr<MutPtr<CVoid>>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoRegisterPowerSettingCallback(deviceobject.rawAddress, settingguid.rawAddress, 0L, context.rawAddress, handle.rawAddress)

public actual fun poRegisterSystemState(statehandle: MutPtr<CVoid>, flags: UInt): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoRegisterSystemState(statehandle.rawAddress, flags.toInt()))

public actual fun poRequestPowerIrp(deviceobject: ConstPtr<DeviceObject>, minorfunction: UByte, powerstate: PowerState, completionfunction: PrequestPowerComplete, context: ConstPtr<CVoid>, irp: MutPtr<MutPtr<Irp>>): Ntstatus =
    0

public actual fun poSetDeviceBusyEx(idlepointer: MutPtr<UInt>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoSetDeviceBusyEx(idlepointer.rawAddress)
}

public actual fun poSetHiberRange(memorymap: ConstPtr<CVoid>, flags: UInt, address: ConstPtr<CVoid>, length: ULong, tag: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoSetHiberRange(memorymap.rawAddress, flags.toInt(), address.rawAddress, length.toLong(), tag.toInt())
}

public actual fun poSetPowerRequest(powerrequest: MutPtr<CVoid>, type: PowerRequestType): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoSetPowerRequest(powerrequest.rawAddress, type)

public actual fun poSetPowerState(deviceobject: ConstPtr<DeviceObject>, type: PowerStateType, state: PowerState): PowerState =
    PowerState()

public actual fun poSetSystemState(flags: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoSetSystemState(flags.toInt())
}

public actual fun poSetSystemWake(irp: MutPtr<Irp>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoSetSystemWake(irp.rawAddress)
}

public actual fun poSetSystemWakeDevice(deviceobject: ConstPtr<DeviceObject>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoSetSystemWakeDevice(deviceobject.rawAddress)
}

public actual fun poSetThermalActiveCooling(thermalrequest: MutPtr<CVoid>, engaged: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoSetThermalActiveCooling(thermalrequest.rawAddress, engaged)

public actual fun poSetThermalPassiveCooling(thermalrequest: MutPtr<CVoid>, throttle: UByte): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoSetThermalPassiveCooling(thermalrequest.rawAddress, throttle.toByte())

public actual fun poStartDeviceBusy(idlepointer: MutPtr<UInt>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoStartDeviceBusy(idlepointer.rawAddress)
}

public actual fun poStartNextPowerIrp(irp: MutPtr<Irp>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoStartNextPowerIrp(irp.rawAddress)
}

public actual fun poUnregisterPowerSettingCallback(handle: MutPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoUnregisterPowerSettingCallback(handle.rawAddress)

public actual fun poUnregisterSystemState(statehandle: MutPtr<CVoid>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPoUnregisterSystemState(statehandle.rawAddress)
}

public actual fun probeForRead(address: ConstPtr<CVoid>, length: ULong, alignment: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesProbeForRead(address.rawAddress, length.toLong(), alignment.toInt())
}

public actual fun probeForWrite(address: MutPtr<CVoid>, length: ULong, alignment: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesProbeForWrite(address.rawAddress, length.toLong(), alignment.toInt())
}

public actual fun psAcquireSiloHardReference(silo: Pesilo): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsAcquireSiloHardReference(silo)

public actual fun psAllocSiloContextSlot(reserved: ULong, returnedcontextslot: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsAllocSiloContextSlot(reserved.toLong(), returnedcontextslot.rawAddress)

public actual fun psAllocateAffinityToken(affinitytoken: MutPtr<PaffinityToken>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsAllocateAffinityToken(affinitytoken.rawAddress)

public actual fun psAttachSiloToCurrentThread(silo: Pesilo): Pesilo =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsAttachSiloToCurrentThread(silo)

public actual fun psCreateSiloContext(silo: Pesilo, size: UInt, pooltype: PoolType, contextcleanupcallback: SiloContextCleanupCallback, returnedsilocontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsCreateSiloContext(silo, size.toInt(), pooltype, 0L, returnedsilocontext.rawAddress)

public actual fun psCreateSystemThread(threadhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, processhandle: Handle, clientid: MutPtr<ClientId>, startroutine: PkstartRoutine, startcontext: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsCreateSystemThread(threadhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, processhandle.rawAddress, clientid.rawAddress, 0L, startcontext.rawAddress)

public actual fun psDereferenceSiloContext(silocontext: ConstPtr<CVoid>) {
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

public actual fun psGetCurrentServerSiloName(): MutPtr<UnicodeString> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsGetCurrentServerSiloName())

public actual fun psGetCurrentSilo(): Pesilo =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsGetCurrentSilo()

public actual fun psGetCurrentThreadId(): Handle =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsGetCurrentThreadId())

public actual fun psGetCurrentThreadTeb(): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsGetCurrentThreadTeb())

public actual fun psGetEffectiveServerSilo(silo: Pesilo): Pesilo =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsGetEffectiveServerSilo(silo)

public actual fun psGetHostSilo(): Pesilo =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsGetHostSilo()

public actual fun psGetJobServerSilo(job: Pejob, serversilo: MutPtr<Pesilo>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsGetJobServerSilo(job, serversilo.rawAddress)

public actual fun psGetJobSilo(job: Pejob, silo: MutPtr<Pesilo>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsGetJobSilo(job, silo.rawAddress)

public actual fun psGetParentSilo(job: Pejob): Pesilo =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsGetParentSilo(job)

public actual fun psGetPermanentSiloContext(silo: Pesilo, contextslot: UInt, returnedsilocontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
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

public actual fun psGetSiloContainerId(silo: Pesilo): MutPtr<Guid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsGetSiloContainerId(silo))

public actual fun psGetSiloContext(silo: Pesilo, contextslot: UInt, returnedsilocontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
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

public actual fun psGetThreadProperty(thread: Pethread, key: ULong, flags: UInt): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsGetThreadProperty(thread, key.toLong(), flags.toInt()))

public actual fun psGetThreadServerSilo(thread: Pethread): Pesilo =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsGetThreadServerSilo(thread)

public actual fun psGetVersion(majorversion: MutPtr<UInt>, minorversion: MutPtr<UInt>, buildnumber: MutPtr<UInt>, csdversion: MutPtr<UnicodeString>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsGetVersion(majorversion.rawAddress, minorversion.rawAddress, buildnumber.rawAddress, csdversion.rawAddress)

public actual fun psInsertPermanentSiloContext(silo: Pesilo, contextslot: UInt, silocontext: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsInsertPermanentSiloContext(silo, contextslot.toInt(), silocontext.rawAddress)

public actual fun psInsertSiloContext(silo: Pesilo, contextslot: UInt, silocontext: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsInsertSiloContext(silo, contextslot.toInt(), silocontext.rawAddress)

public actual fun psIsCurrentThreadInServerSilo(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsIsCurrentThreadInServerSilo()

public actual fun psIsCurrentThreadPrefetching(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsIsCurrentThreadPrefetching()

public actual fun psIsHostSilo(silo: Pesilo): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsIsHostSilo(silo)

public actual fun psMakeSiloContextPermanent(silo: Pesilo, contextslot: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsMakeSiloContextPermanent(silo, contextslot.toInt())

public actual fun psQueryTotalCycleTimeProcess(process: Peprocess, cycletimestamp: MutPtr<ULong>): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsQueryTotalCycleTimeProcess(process, cycletimestamp.rawAddress).toULong()

public actual fun psReferenceSiloContext(silocontext: ConstPtr<CVoid>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsReferenceSiloContext(silocontext.rawAddress)
}

public actual fun psRegisterSiloMonitor(registration: ConstPtr<SiloMonitorRegistration>, returnedmonitor: MutPtr<PsiloMonitor>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsRegisterSiloMonitor(registration.rawAddress, returnedmonitor.rawAddress)

public actual fun psReleaseSiloHardReference(silo: Pesilo) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsReleaseSiloHardReference(silo)
}

public actual fun psRemoveCreateThreadNotifyRoutine(notifyroutine: PcreateThreadNotifyRoutine): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsRemoveCreateThreadNotifyRoutine(0L)

public actual fun psRemoveLoadImageNotifyRoutine(notifyroutine: PloadImageNotifyRoutine): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsRemoveLoadImageNotifyRoutine(0L)

public actual fun psRemoveSiloContext(silo: Pesilo, contextslot: UInt, removedsilocontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsRemoveSiloContext(silo, contextslot.toInt(), removedsilocontext.rawAddress)

public actual fun psReplaceSiloContext(silo: Pesilo, contextslot: UInt, newsilocontext: ConstPtr<CVoid>, oldsilocontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsReplaceSiloContext(silo, contextslot.toInt(), newsilocontext.rawAddress, oldsilocontext.rawAddress)

public actual fun psRevertToUserMultipleGroupAffinityThread(affinitytoken: PaffinityToken) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsRevertToUserMultipleGroupAffinityThread(affinitytoken)
}

public actual fun psSetCreateProcessNotifyRoutine(notifyroutine: PcreateProcessNotifyRoutine, remove: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsSetCreateProcessNotifyRoutine(0L, remove)

public actual fun psSetCreateProcessNotifyRoutineEx(notifyroutine: PcreateProcessNotifyRoutineEx, remove: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsSetCreateProcessNotifyRoutineEx(0L, remove)

public actual fun psSetCreateProcessNotifyRoutineEx2(notifytype: Pscreateprocessnotifytype, notifyinformation: ConstPtr<CVoid>, remove: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsSetCreateProcessNotifyRoutineEx2(notifytype, notifyinformation.rawAddress, remove)

public actual fun psSetCreateThreadNotifyRoutine(notifyroutine: PcreateThreadNotifyRoutine): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsSetCreateThreadNotifyRoutine(0L)

public actual fun psSetCreateThreadNotifyRoutineEx(notifytype: Pscreatethreadnotifytype, notifyinformation: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsSetCreateThreadNotifyRoutineEx(notifytype, notifyinformation.rawAddress)

public actual fun psSetCurrentThreadPrefetching(prefetching: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsSetCurrentThreadPrefetching(prefetching)

public actual fun psSetLoadImageNotifyRoutine(notifyroutine: PloadImageNotifyRoutine): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsSetLoadImageNotifyRoutine(0L)

public actual fun psSetLoadImageNotifyRoutineEx(notifyroutine: PloadImageNotifyRoutine, flags: ULong): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsSetLoadImageNotifyRoutineEx(0L, flags.toLong())

public actual fun psSetSystemMultipleGroupAffinityThread(groupaffinities: ConstPtr<GroupAffinity>, groupcount: UShort, affinitytoken: PaffinityToken): Ntstatus =
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

public actual fun psWrapApcWow64Thread(apccontext: MutPtr<MutPtr<CVoid>>, apcroutine: MutPtr<MutPtr<CVoid>>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPsWrapApcWow64Thread(apccontext.rawAddress, apcroutine.rawAddress)

public actual fun pshedAllocateMemory(size: UInt): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPshedAllocateMemory(size.toInt()))

public actual fun pshedFreeMemory(address: ConstPtr<CVoid>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPshedFreeMemory(address.rawAddress)
}

public actual fun pshedIsSystemWheaEnabled(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPshedIsSystemWheaEnabled()

public actual fun pshedRegisterPlugin(packet: MutPtr<WheaPshedPluginRegistrationPacketV2>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPshedRegisterPlugin(packet.rawAddress)

public actual fun pshedSynchronizeExecution(errorsource: ConstPtr<WheaErrorSourceDescriptor>, synchronizeroutine: PksynchronizeRoutine, synchronizecontext: ConstPtr<CVoid>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPshedSynchronizeExecution(errorsource.rawAddress, 0L, synchronizecontext.rawAddress)

public actual fun pshedUnregisterPlugin(pluginhandle: ConstPtr<CVoid>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesPshedUnregisterPlugin(pluginhandle.rawAddress)
}

public actual fun rtlAppendUnicodeStringToString(destination: MutPtr<UnicodeString>, source: ConstPtr<UnicodeString>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlAppendUnicodeStringToString(destination.rawAddress, source.rawAddress)

public actual fun rtlAppendUnicodeToString(destination: MutPtr<UnicodeString>, source: Pcwstr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlAppendUnicodeToString(destination.rawAddress, source.rawAddress)

public actual fun rtlAreBitsClear(bitmapheader: ConstPtr<RtlBitmap>, startingindex: UInt, length: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlAreBitsClear(bitmapheader.rawAddress, startingindex.toInt(), length.toInt())

public actual fun rtlAreBitsSet(bitmapheader: ConstPtr<RtlBitmap>, startingindex: UInt, length: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlAreBitsSet(bitmapheader.rawAddress, startingindex.toInt(), length.toInt())

public actual fun rtlAssert(voidfailedassertion: ConstPtr<CVoid>, voidfilename: ConstPtr<CVoid>, linenumber: UInt, mutablemessage: Pcstr) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlAssert(voidfailedassertion.rawAddress, voidfilename.rawAddress, linenumber.toInt(), mutablemessage.rawAddress)
}

public actual fun rtlCheckRegistryKey(relativeto: UInt, path: Pcwstr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlCheckRegistryKey(relativeto.toInt(), path.rawAddress)

public actual fun rtlClearAllBits(bitmapheader: ConstPtr<RtlBitmap>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlClearAllBits(bitmapheader.rawAddress)
}

public actual fun rtlClearBit(bitmapheader: ConstPtr<RtlBitmap>, bitnumber: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlClearBit(bitmapheader.rawAddress, bitnumber.toInt())
}

public actual fun rtlClearBits(bitmapheader: ConstPtr<RtlBitmap>, startingindex: UInt, numbertoclear: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlClearBits(bitmapheader.rawAddress, startingindex.toInt(), numbertoclear.toInt())
}

public actual fun rtlCmDecodeMemIoResource(descriptor: ConstPtr<CmPartialResourceDescriptor>, start: MutPtr<ULong>): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlCmDecodeMemIoResource(descriptor.rawAddress, start.rawAddress).toULong()

public actual fun rtlCmEncodeMemIoResource(descriptor: ConstPtr<CmPartialResourceDescriptor>, type: UByte, length: ULong, start: ULong): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlCmEncodeMemIoResource(descriptor.rawAddress, type.toByte(), length.toLong(), start.toLong())

public actual fun rtlCompareString(string1: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, string2: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, caseinsensitive: Boolean): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlCompareString(string1.rawAddress, string2.rawAddress, caseinsensitive)

public actual fun rtlCompareUnicodeString(string1: ConstPtr<UnicodeString>, string2: ConstPtr<UnicodeString>, caseinsensitive: Boolean): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlCompareUnicodeString(string1.rawAddress, string2.rawAddress, caseinsensitive)

public actual fun rtlCompareUnicodeStrings(string1: ConstPtr<UShort>, string1length: ULong, string2: ConstPtr<UShort>, string2length: ULong, caseinsensitive: Boolean): Int =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlCompareUnicodeStrings(string1.rawAddress, string1length.toLong(), string2.rawAddress, string2length.toLong(), caseinsensitive)

public actual fun rtlContractHashTable(hashtable: ConstPtr<RtlDynamicHashTable>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlContractHashTable(hashtable.rawAddress)

public actual fun rtlCopyBitMap(source: ConstPtr<RtlBitmap>, destination: ConstPtr<RtlBitmap>, targetbit: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlCopyBitMap(source.rawAddress, destination.rawAddress, targetbit.toInt())
}

public actual fun rtlCopyString(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlCopyString(destinationstring.rawAddress, sourcestring.rawAddress)
}

public actual fun rtlCopyUnicodeString(destinationstring: MutPtr<UnicodeString>, sourcestring: ConstPtr<UnicodeString>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlCopyUnicodeString(destinationstring.rawAddress, sourcestring.rawAddress)
}

public actual fun rtlCreateHashTable(hashtable: MutPtr<MutPtr<RtlDynamicHashTable>>, shift: UInt, flags: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlCreateHashTable(hashtable.rawAddress, shift.toInt(), flags.toInt())

public actual fun rtlCreateHashTableEx(hashtable: MutPtr<MutPtr<RtlDynamicHashTable>>, initialsize: UInt, shift: UInt, flags: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlCreateHashTableEx(hashtable.rawAddress, initialsize.toInt(), shift.toInt(), flags.toInt())

public actual fun rtlCreateRegistryKey(relativeto: UInt, path: Pcwstr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlCreateRegistryKey(relativeto.toInt(), path.rawAddress)

public actual fun rtlCreateSecurityDescriptor(securitydescriptor: PsecurityDescriptor, revision: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlCreateSecurityDescriptor(securitydescriptor.rawAddress, revision.toInt())

public actual fun rtlDelete(links: ConstPtr<RtlSplayLinks>): MutPtr<RtlSplayLinks> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlDelete(links.rawAddress))

public actual fun rtlDeleteElementGenericTable(table: ConstPtr<RtlGenericTable>, buffer: ConstPtr<CVoid>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlDeleteElementGenericTable(table.rawAddress, buffer.rawAddress)

public actual fun rtlDeleteElementGenericTableAvl(table: ConstPtr<RtlAvlTable>, buffer: ConstPtr<CVoid>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlDeleteElementGenericTableAvl(table.rawAddress, buffer.rawAddress)

public actual fun rtlDeleteElementGenericTableAvlEx(table: ConstPtr<RtlAvlTable>, nodeorparent: ConstPtr<CVoid>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlDeleteElementGenericTableAvlEx(table.rawAddress, nodeorparent.rawAddress)
}

public actual fun rtlDeleteHashTable(hashtable: ConstPtr<RtlDynamicHashTable>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlDeleteHashTable(hashtable.rawAddress)
}

public actual fun rtlDeleteNoSplay(links: ConstPtr<RtlSplayLinks>, root: MutPtr<MutPtr<RtlSplayLinks>>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlDeleteNoSplay(links.rawAddress, root.rawAddress)
}

public actual fun rtlDeleteRegistryValue(relativeto: UInt, path: Pcwstr, valuename: Pcwstr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlDeleteRegistryValue(relativeto.toInt(), path.rawAddress, valuename.rawAddress)

public actual fun rtlDowncaseUnicodeChar(sourcecharacter: UShort): UShort =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlDowncaseUnicodeChar(sourcecharacter.toShort()).toUShort()

public actual fun rtlEndEnumerationHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlEndEnumerationHashTable(hashtable.rawAddress, enumerator.rawAddress)
}

public actual fun rtlEndStrongEnumerationHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlEndStrongEnumerationHashTable(hashtable.rawAddress, enumerator.rawAddress)
}

public actual fun rtlEndWeakEnumerationHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlEndWeakEnumerationHashTable(hashtable.rawAddress, enumerator.rawAddress)
}

public actual fun rtlEnumerateEntryHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>): MutPtr<RtlDynamicHashTableEntry> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlEnumerateEntryHashTable(hashtable.rawAddress, enumerator.rawAddress))

public actual fun rtlEnumerateGenericTable(table: ConstPtr<RtlGenericTable>, restart: Boolean): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTable(table.rawAddress, restart))

public actual fun rtlEnumerateGenericTableAvl(table: ConstPtr<RtlAvlTable>, restart: Boolean): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTableAvl(table.rawAddress, restart))

public actual fun rtlEnumerateGenericTableLikeADirectory(table: ConstPtr<RtlAvlTable>, matchfunction: PrtlAvlMatchFunction, matchdata: ConstPtr<CVoid>, nextflag: UInt, restartkey: MutPtr<MutPtr<CVoid>>, deletecount: MutPtr<UInt>, buffer: ConstPtr<CVoid>): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTableLikeADirectory(table.rawAddress, 0L, matchdata.rawAddress, nextflag.toInt(), restartkey.rawAddress, deletecount.rawAddress, buffer.rawAddress))

public actual fun rtlEnumerateGenericTableWithoutSplaying(table: ConstPtr<RtlGenericTable>, restartkey: MutPtr<MutPtr<CVoid>>): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTableWithoutSplaying(table.rawAddress, restartkey.rawAddress))

public actual fun rtlEnumerateGenericTableWithoutSplayingAvl(table: ConstPtr<RtlAvlTable>, restartkey: MutPtr<MutPtr<CVoid>>): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTableWithoutSplayingAvl(table.rawAddress, restartkey.rawAddress))

public actual fun rtlEqualString(string1: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, string2: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, caseinsensitive: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlEqualString(string1.rawAddress, string2.rawAddress, caseinsensitive)

public actual fun rtlEqualUnicodeString(string1: ConstPtr<UnicodeString>, string2: ConstPtr<UnicodeString>, caseinsensitive: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlEqualUnicodeString(string1.rawAddress, string2.rawAddress, caseinsensitive)

public actual fun rtlExpandHashTable(hashtable: ConstPtr<RtlDynamicHashTable>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlExpandHashTable(hashtable.rawAddress)

public actual fun rtlExtractBitMap(source: ConstPtr<RtlBitmap>, destination: ConstPtr<RtlBitmap>, targetbit: UInt, numberofbits: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlExtractBitMap(source.rawAddress, destination.rawAddress, targetbit.toInt(), numberofbits.toInt())
}

public actual fun rtlFindClearBits(bitmapheader: ConstPtr<RtlBitmap>, numbertofind: UInt, hintindex: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlFindClearBits(bitmapheader.rawAddress, numbertofind.toInt(), hintindex.toInt()).toUInt()

public actual fun rtlFindClearBitsAndSet(bitmapheader: ConstPtr<RtlBitmap>, numbertofind: UInt, hintindex: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlFindClearBitsAndSet(bitmapheader.rawAddress, numbertofind.toInt(), hintindex.toInt()).toUInt()

public actual fun rtlFindClearRuns(bitmapheader: ConstPtr<RtlBitmap>, runarray: MutPtr<RtlBitmapRun>, sizeofrunarray: UInt, locatelongestruns: Boolean): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlFindClearRuns(bitmapheader.rawAddress, runarray.rawAddress, sizeofrunarray.toInt(), locatelongestruns).toUInt()

public actual fun rtlFindClosestEncodableLength(sourcelength: ULong, targetlength: MutPtr<ULong>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlFindClosestEncodableLength(sourcelength.toLong(), targetlength.rawAddress)

public actual fun rtlFindFirstRunClear(bitmapheader: ConstPtr<RtlBitmap>, startingindex: MutPtr<UInt>): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlFindFirstRunClear(bitmapheader.rawAddress, startingindex.rawAddress).toUInt()

public actual fun rtlFindLastBackwardRunClear(bitmapheader: ConstPtr<RtlBitmap>, fromindex: UInt, startingrunindex: MutPtr<UInt>): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlFindLastBackwardRunClear(bitmapheader.rawAddress, fromindex.toInt(), startingrunindex.rawAddress).toUInt()

public actual fun rtlFindLeastSignificantBit(set: ULong): Byte =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlFindLeastSignificantBit(set.toLong())

public actual fun rtlFindLongestRunClear(bitmapheader: ConstPtr<RtlBitmap>, startingindex: MutPtr<UInt>): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlFindLongestRunClear(bitmapheader.rawAddress, startingindex.rawAddress).toUInt()

public actual fun rtlFindMostSignificantBit(set: ULong): Byte =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlFindMostSignificantBit(set.toLong())

public actual fun rtlFindNextForwardRunClear(bitmapheader: ConstPtr<RtlBitmap>, fromindex: UInt, startingrunindex: MutPtr<UInt>): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlFindNextForwardRunClear(bitmapheader.rawAddress, fromindex.toInt(), startingrunindex.rawAddress).toUInt()

public actual fun rtlFindSetBits(bitmapheader: ConstPtr<RtlBitmap>, numbertofind: UInt, hintindex: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlFindSetBits(bitmapheader.rawAddress, numbertofind.toInt(), hintindex.toInt()).toUInt()

public actual fun rtlFindSetBitsAndClear(bitmapheader: ConstPtr<RtlBitmap>, numbertofind: UInt, hintindex: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlFindSetBitsAndClear(bitmapheader.rawAddress, numbertofind.toInt(), hintindex.toInt()).toUInt()

public actual fun rtlFreeUTF8String(utf8string: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlFreeUTF8String(utf8string.rawAddress)
}

public actual fun rtlGUIDFromString(guidstring: ConstPtr<UnicodeString>, guid: MutPtr<Guid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlGUIDFromString(guidstring.rawAddress, guid.rawAddress)

public actual fun rtlGenerateClass5Guid(namespaceguid: ConstPtr<Guid>, buffer: ConstPtr<CVoid>, buffersize: UInt, guid: MutPtr<Guid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlGenerateClass5Guid(namespaceguid.rawAddress, buffer.rawAddress, buffersize.toInt(), guid.rawAddress)

public actual fun rtlGetActiveConsoleId(): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlGetActiveConsoleId().toUInt()

public actual fun rtlGetCallersAddress(callersaddress: MutPtr<MutPtr<CVoid>>, callerscaller: MutPtr<MutPtr<CVoid>>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlGetCallersAddress(callersaddress.rawAddress, callerscaller.rawAddress)
}

public actual fun rtlGetConsoleSessionForegroundProcessId(): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlGetConsoleSessionForegroundProcessId().toULong()

public actual fun rtlGetElementGenericTable(table: ConstPtr<RtlGenericTable>, i: UInt): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlGetElementGenericTable(table.rawAddress, i.toInt()))

public actual fun rtlGetElementGenericTableAvl(table: ConstPtr<RtlAvlTable>, i: UInt): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlGetElementGenericTableAvl(table.rawAddress, i.toInt()))

public actual fun rtlGetEnabledExtendedFeatures(featuremask: ULong): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlGetEnabledExtendedFeatures(featuremask.toLong()).toULong()

public actual fun rtlGetNextEntryHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, context: ConstPtr<RtlDynamicHashTableContext>): MutPtr<RtlDynamicHashTableEntry> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlGetNextEntryHashTable(hashtable.rawAddress, context.rawAddress))

public actual fun rtlGetNtProductType(ntproducttype: MutPtr<NtProductType>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlGetNtProductType(ntproducttype.rawAddress)

public actual fun rtlGetNtSystemRoot(): Pcwstr =
    ConstPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlGetNtSystemRoot())

public actual fun rtlGetPersistedStateLocation(sourceid: Pcwstr, customvalue: Pcwstr, defaultpath: Pcwstr, statelocationtype: StateLocationType, targetpath: Pwstr, bufferlengthin: UInt, bufferlengthout: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlGetPersistedStateLocation(sourceid.rawAddress, customvalue.rawAddress, defaultpath.rawAddress, statelocationtype, targetpath.rawAddress, bufferlengthin.toInt(), bufferlengthout.rawAddress)

public actual fun rtlGetSuiteMask(): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlGetSuiteMask().toUInt()

public actual fun rtlGetVersion(lpversioninformation: MutPtr<Osversioninfow>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlGetVersion(lpversioninformation.rawAddress)

public actual fun rtlHashUnicodeString(string: ConstPtr<UnicodeString>, caseinsensitive: Boolean, hashalgorithm: UInt, hashvalue: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlHashUnicodeString(string.rawAddress, caseinsensitive, hashalgorithm.toInt(), hashvalue.rawAddress)

public actual fun rtlInitEnumerationHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlInitEnumerationHashTable(hashtable.rawAddress, enumerator.rawAddress)

public actual fun rtlInitStrongEnumerationHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlInitStrongEnumerationHashTable(hashtable.rawAddress, enumerator.rawAddress)

public actual fun rtlInitUTF8String(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: ConstPtr<Byte>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlInitUTF8String(destinationstring.rawAddress, sourcestring.rawAddress)
}

public actual fun rtlInitUTF8StringEx(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: ConstPtr<Byte>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlInitUTF8StringEx(destinationstring.rawAddress, sourcestring.rawAddress)

public actual fun rtlInitWeakEnumerationHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlInitWeakEnumerationHashTable(hashtable.rawAddress, enumerator.rawAddress)

public actual fun rtlInitializeBitMap(bitmapheader: MutPtr<RtlBitmap>, bitmapbuffer: ConstPtr<UInt>, sizeofbitmap: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlInitializeBitMap(bitmapheader.rawAddress, bitmapbuffer.rawAddress, sizeofbitmap.toInt())
}

public actual fun rtlInitializeGenericTable(table: MutPtr<RtlGenericTable>, compareroutine: PrtlGenericCompareRoutine, allocateroutine: PrtlGenericAllocateRoutine, freeroutine: PrtlGenericFreeRoutine, tablecontext: ConstPtr<CVoid>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlInitializeGenericTable(table.rawAddress, 0L, 0L, 0L, tablecontext.rawAddress)
}

public actual fun rtlInitializeGenericTableAvl(table: MutPtr<RtlAvlTable>, compareroutine: PrtlAvlCompareRoutine, allocateroutine: PrtlAvlAllocateRoutine, freeroutine: PrtlAvlFreeRoutine, tablecontext: ConstPtr<CVoid>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlInitializeGenericTableAvl(table.rawAddress, 0L, 0L, 0L, tablecontext.rawAddress)
}

public actual fun rtlInsertElementGenericTable(table: ConstPtr<RtlGenericTable>, buffer: ConstPtr<CVoid>, buffersize: UInt, newelement: MutPtr<Boolean>): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlInsertElementGenericTable(table.rawAddress, buffer.rawAddress, buffersize.toInt(), newelement.rawAddress))

public actual fun rtlInsertElementGenericTableAvl(table: ConstPtr<RtlAvlTable>, buffer: ConstPtr<CVoid>, buffersize: UInt, newelement: MutPtr<Boolean>): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlInsertElementGenericTableAvl(table.rawAddress, buffer.rawAddress, buffersize.toInt(), newelement.rawAddress))

public actual fun rtlInsertElementGenericTableFull(table: ConstPtr<RtlGenericTable>, buffer: ConstPtr<CVoid>, buffersize: UInt, newelement: MutPtr<Boolean>, nodeorparent: ConstPtr<CVoid>, searchresult: TableSearchResult): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlInsertElementGenericTableFull(table.rawAddress, buffer.rawAddress, buffersize.toInt(), newelement.rawAddress, nodeorparent.rawAddress, searchresult))

public actual fun rtlInsertElementGenericTableFullAvl(table: ConstPtr<RtlAvlTable>, buffer: ConstPtr<CVoid>, buffersize: UInt, newelement: MutPtr<Boolean>, nodeorparent: ConstPtr<CVoid>, searchresult: TableSearchResult): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlInsertElementGenericTableFullAvl(table.rawAddress, buffer.rawAddress, buffersize.toInt(), newelement.rawAddress, nodeorparent.rawAddress, searchresult))

public actual fun rtlInsertEntryHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, entry: ConstPtr<RtlDynamicHashTableEntry>, signature: ULong, context: MutPtr<RtlDynamicHashTableContext>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlInsertEntryHashTable(hashtable.rawAddress, entry.rawAddress, signature.toLong(), context.rawAddress)

public actual fun rtlInt64ToUnicodeString(value: ULong, base: UInt, string: MutPtr<UnicodeString>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlInt64ToUnicodeString(value.toLong(), base.toInt(), string.rawAddress)

public actual fun rtlIntegerToUnicodeString(value: UInt, base: UInt, string: MutPtr<UnicodeString>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlIntegerToUnicodeString(value.toInt(), base.toInt(), string.rawAddress)

public actual fun rtlIoDecodeMemIoResource(descriptor: ConstPtr<IoResourceDescriptor>, alignment: MutPtr<ULong>, minimumaddress: MutPtr<ULong>, maximumaddress: MutPtr<ULong>): ULong =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlIoDecodeMemIoResource(descriptor.rawAddress, alignment.rawAddress, minimumaddress.rawAddress, maximumaddress.rawAddress).toULong()

public actual fun rtlIoEncodeMemIoResource(descriptor: ConstPtr<IoResourceDescriptor>, type: UByte, length: ULong, alignment: ULong, minimumaddress: ULong, maximumaddress: ULong): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlIoEncodeMemIoResource(descriptor.rawAddress, type.toByte(), length.toLong(), alignment.toLong(), minimumaddress.toLong(), maximumaddress.toLong())

public actual fun rtlIsApiSetImplemented(apisetname: Pcstr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlIsApiSetImplemented(apisetname.rawAddress)

public actual fun rtlIsGenericTableEmpty(table: ConstPtr<RtlGenericTable>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlIsGenericTableEmpty(table.rawAddress)

public actual fun rtlIsGenericTableEmptyAvl(table: ConstPtr<RtlAvlTable>): Boolean =
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

public actual fun rtlIsUntrustedObject(handle: Handle, obj: ConstPtr<CVoid>, untrustedobject: MutPtr<Boolean>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlIsUntrustedObject(handle.rawAddress, obj.rawAddress, untrustedobject.rawAddress)

public actual fun rtlLengthSecurityDescriptor(securitydescriptor: PsecurityDescriptor): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlLengthSecurityDescriptor(securitydescriptor.rawAddress).toUInt()

public actual fun rtlLookupElementGenericTable(table: ConstPtr<RtlGenericTable>, buffer: ConstPtr<CVoid>): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlLookupElementGenericTable(table.rawAddress, buffer.rawAddress))

public actual fun rtlLookupElementGenericTableAvl(table: ConstPtr<RtlAvlTable>, buffer: ConstPtr<CVoid>): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlLookupElementGenericTableAvl(table.rawAddress, buffer.rawAddress))

public actual fun rtlLookupElementGenericTableFull(table: ConstPtr<RtlGenericTable>, buffer: ConstPtr<CVoid>, nodeorparent: MutPtr<MutPtr<CVoid>>, searchresult: MutPtr<TableSearchResult>): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlLookupElementGenericTableFull(table.rawAddress, buffer.rawAddress, nodeorparent.rawAddress, searchresult.rawAddress))

public actual fun rtlLookupElementGenericTableFullAvl(table: ConstPtr<RtlAvlTable>, buffer: ConstPtr<CVoid>, nodeorparent: MutPtr<MutPtr<CVoid>>, searchresult: MutPtr<TableSearchResult>): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlLookupElementGenericTableFullAvl(table.rawAddress, buffer.rawAddress, nodeorparent.rawAddress, searchresult.rawAddress))

public actual fun rtlLookupEntryHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, signature: ULong, context: MutPtr<RtlDynamicHashTableContext>): MutPtr<RtlDynamicHashTableEntry> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlLookupEntryHashTable(hashtable.rawAddress, signature.toLong(), context.rawAddress))

public actual fun rtlLookupFirstMatchingElementGenericTableAvl(table: ConstPtr<RtlAvlTable>, buffer: ConstPtr<CVoid>, restartkey: MutPtr<MutPtr<CVoid>>): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlLookupFirstMatchingElementGenericTableAvl(table.rawAddress, buffer.rawAddress, restartkey.rawAddress))

public actual fun rtlMapGenericMask(accessmask: MutPtr<UInt>, genericmapping: ConstPtr<GenericMapping>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlMapGenericMask(accessmask.rawAddress, genericmapping.rawAddress)
}

public actual fun rtlNormalizeSecurityDescriptor(securitydescriptor: MutPtr<PsecurityDescriptor>, securitydescriptorlength: UInt, newsecuritydescriptor: MutPtr<PsecurityDescriptor>, newsecuritydescriptorlength: MutPtr<UInt>, checkonly: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlNormalizeSecurityDescriptor(securitydescriptor.rawAddress, securitydescriptorlength.toInt(), newsecuritydescriptor.rawAddress, newsecuritydescriptorlength.rawAddress, checkonly)

public actual fun rtlNumberGenericTableElements(table: ConstPtr<RtlGenericTable>): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlNumberGenericTableElements(table.rawAddress).toUInt()

public actual fun rtlNumberGenericTableElementsAvl(table: ConstPtr<RtlAvlTable>): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlNumberGenericTableElementsAvl(table.rawAddress).toUInt()

public actual fun rtlNumberOfClearBits(bitmapheader: ConstPtr<RtlBitmap>): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlNumberOfClearBits(bitmapheader.rawAddress).toUInt()

public actual fun rtlNumberOfClearBitsInRange(bitmapheader: ConstPtr<RtlBitmap>, startingindex: UInt, length: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlNumberOfClearBitsInRange(bitmapheader.rawAddress, startingindex.toInt(), length.toInt()).toUInt()

public actual fun rtlNumberOfSetBits(bitmapheader: ConstPtr<RtlBitmap>): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlNumberOfSetBits(bitmapheader.rawAddress).toUInt()

public actual fun rtlNumberOfSetBitsInRange(bitmapheader: ConstPtr<RtlBitmap>, startingindex: UInt, length: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlNumberOfSetBitsInRange(bitmapheader.rawAddress, startingindex.toInt(), length.toInt()).toUInt()

public actual fun rtlNumberOfSetBitsUlongPtr(target: ULong): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlNumberOfSetBitsUlongPtr(target.toLong()).toUInt()

public actual fun rtlPrefetchMemoryNonTemporal(source: ConstPtr<CVoid>, length: ULong) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlPrefetchMemoryNonTemporal(source.rawAddress, length.toLong())
}

public actual fun rtlPrefixUnicodeString(string1: ConstPtr<UnicodeString>, string2: ConstPtr<UnicodeString>, caseinsensitive: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlPrefixUnicodeString(string1.rawAddress, string2.rawAddress, caseinsensitive)

public actual fun rtlQueryRegistryValueWithFallback(primaryhandle: Handle, fallbackhandle: Handle, valuename: ConstPtr<UnicodeString>, valuelength: UInt, valuetype: MutPtr<UInt>, valuedata: MutPtr<CVoid>, resultlength: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlQueryRegistryValueWithFallback(primaryhandle.rawAddress, fallbackhandle.rawAddress, valuename.rawAddress, valuelength.toInt(), valuetype.rawAddress, valuedata.rawAddress, resultlength.rawAddress)

public actual fun rtlQueryRegistryValues(relativeto: UInt, path: Pcwstr, querytable: MutPtr<RtlQueryRegistryTable>, context: ConstPtr<CVoid>, environment: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlQueryRegistryValues(relativeto.toInt(), path.rawAddress, querytable.rawAddress, context.rawAddress, environment.rawAddress)

public actual fun rtlQueryValidationRunlevel(componentname: ConstPtr<UnicodeString>): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlQueryValidationRunlevel(componentname.rawAddress).toUInt()

public actual fun rtlRealPredecessor(links: ConstPtr<RtlSplayLinks>): MutPtr<RtlSplayLinks> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlRealPredecessor(links.rawAddress))

public actual fun rtlRealSuccessor(links: ConstPtr<RtlSplayLinks>): MutPtr<RtlSplayLinks> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlRealSuccessor(links.rawAddress))

public actual fun rtlRemoveEntryHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, entry: ConstPtr<RtlDynamicHashTableEntry>, context: MutPtr<RtlDynamicHashTableContext>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlRemoveEntryHashTable(hashtable.rawAddress, entry.rawAddress, context.rawAddress)

public actual fun rtlRunOnceBeginInitialize(runonce: MutPtr<InitOnce>, flags: UInt, context: MutPtr<MutPtr<CVoid>>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlRunOnceBeginInitialize(runonce.rawAddress, flags.toInt(), context.rawAddress)

public actual fun rtlRunOnceComplete(runonce: MutPtr<InitOnce>, flags: UInt, context: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlRunOnceComplete(runonce.rawAddress, flags.toInt(), context.rawAddress)

public actual fun rtlRunOnceExecuteOnce(runonce: MutPtr<InitOnce>, initfn: PrtlRunOnceInitFn, parameter: MutPtr<CVoid>, context: MutPtr<MutPtr<CVoid>>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlRunOnceExecuteOnce(runonce.rawAddress, 0L, parameter.rawAddress, context.rawAddress)

public actual fun rtlRunOnceInitialize(runonce: MutPtr<InitOnce>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlRunOnceInitialize(runonce.rawAddress)
}

public actual fun rtlSetAllBits(bitmapheader: ConstPtr<RtlBitmap>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlSetAllBits(bitmapheader.rawAddress)
}

public actual fun rtlSetBit(bitmapheader: ConstPtr<RtlBitmap>, bitnumber: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlSetBit(bitmapheader.rawAddress, bitnumber.toInt())
}

public actual fun rtlSetBits(bitmapheader: ConstPtr<RtlBitmap>, startingindex: UInt, numbertoset: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlSetBits(bitmapheader.rawAddress, startingindex.toInt(), numbertoset.toInt())
}

public actual fun rtlSetDaclSecurityDescriptor(securitydescriptor: PsecurityDescriptor, daclpresent: Boolean, dacl: ConstPtr<Acl>, dacldefaulted: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlSetDaclSecurityDescriptor(securitydescriptor.rawAddress, daclpresent, dacl.rawAddress, dacldefaulted)

public actual fun rtlSetSystemGlobalData(dataid: RtlSystemGlobalDataId, buffer: ConstPtr<CVoid>, size: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlSetSystemGlobalData(dataid, buffer.rawAddress, size.toInt())

public actual fun rtlSplay(links: MutPtr<RtlSplayLinks>): MutPtr<RtlSplayLinks> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlSplay(links.rawAddress))

public actual fun rtlStringFromGUID(guid: ConstPtr<Guid>, guidstring: MutPtr<UnicodeString>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlStringFromGUID(guid.rawAddress, guidstring.rawAddress)

public actual fun rtlStronglyEnumerateEntryHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>): MutPtr<RtlDynamicHashTableEntry> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlStronglyEnumerateEntryHashTable(hashtable.rawAddress, enumerator.rawAddress))

public actual fun rtlSubtreePredecessor(links: ConstPtr<RtlSplayLinks>): MutPtr<RtlSplayLinks> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlSubtreePredecessor(links.rawAddress))

public actual fun rtlSubtreeSuccessor(links: ConstPtr<RtlSplayLinks>): MutPtr<RtlSplayLinks> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlSubtreeSuccessor(links.rawAddress))

public actual fun rtlSuffixUnicodeString(string1: ConstPtr<UnicodeString>, string2: ConstPtr<UnicodeString>, caseinsensitive: Boolean): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlSuffixUnicodeString(string1.rawAddress, string2.rawAddress, caseinsensitive)

public actual fun rtlTestBit(bitmapheader: ConstPtr<RtlBitmap>, bitnumber: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlTestBit(bitmapheader.rawAddress, bitnumber.toInt())

public actual fun rtlTimeFieldsToTime(timefields: ConstPtr<TimeFields>, time: MutPtr<Long>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlTimeFieldsToTime(timefields.rawAddress, time.rawAddress)

public actual fun rtlTimeToTimeFields(time: ConstPtr<Long>, timefields: MutPtr<TimeFields>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlTimeToTimeFields(time.rawAddress, timefields.rawAddress)
}

public actual fun rtlUTF8StringToUnicodeString(destinationstring: MutPtr<UnicodeString>, sourcestring: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, allocatedestinationstring: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlUTF8StringToUnicodeString(destinationstring.rawAddress, sourcestring.rawAddress, allocatedestinationstring)

public actual fun rtlUTF8ToUnicodeN(unicodestringdestination: Pwstr, unicodestringmaxbytecount: UInt, unicodestringactualbytecount: MutPtr<UInt>, utf8stringsource: Pcstr, utf8stringbytecount: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlUTF8ToUnicodeN(unicodestringdestination.rawAddress, unicodestringmaxbytecount.toInt(), unicodestringactualbytecount.rawAddress, utf8stringsource.rawAddress, utf8stringbytecount.toInt())

public actual fun rtlUnicodeStringToInt64(string: ConstPtr<UnicodeString>, base: UInt, number: MutPtr<Long>, endpointer: MutPtr<Pwstr>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlUnicodeStringToInt64(string.rawAddress, base.toInt(), number.rawAddress, endpointer.rawAddress)

public actual fun rtlUnicodeStringToInteger(string: ConstPtr<UnicodeString>, base: UInt, value: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlUnicodeStringToInteger(string.rawAddress, base.toInt(), value.rawAddress)

public actual fun rtlUnicodeStringToUTF8String(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: ConstPtr<UnicodeString>, allocatedestinationstring: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlUnicodeStringToUTF8String(destinationstring.rawAddress, sourcestring.rawAddress, allocatedestinationstring)

public actual fun rtlUnicodeToUTF8N(utf8stringdestination: Pstr, utf8stringmaxbytecount: UInt, utf8stringactualbytecount: MutPtr<UInt>, unicodestringsource: ConstPtr<UShort>, unicodestringbytecount: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlUnicodeToUTF8N(utf8stringdestination.rawAddress, utf8stringmaxbytecount.toInt(), utf8stringactualbytecount.rawAddress, unicodestringsource.rawAddress, unicodestringbytecount.toInt())

public actual fun rtlUpcaseUnicodeChar(sourcecharacter: UShort): UShort =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlUpcaseUnicodeChar(sourcecharacter.toShort()).toUShort()

public actual fun rtlUpcaseUnicodeString(destinationstring: MutPtr<UnicodeString>, sourcestring: ConstPtr<UnicodeString>, allocatedestinationstring: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlUpcaseUnicodeString(destinationstring.rawAddress, sourcestring.rawAddress, allocatedestinationstring)

public actual fun rtlUpperChar(character: Byte): Byte =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlUpperChar(character)

public actual fun rtlUpperString(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlUpperString(destinationstring.rawAddress, sourcestring.rawAddress)
}

public actual fun rtlValidRelativeSecurityDescriptor(securitydescriptorinput: PsecurityDescriptor, securitydescriptorlength: UInt, requiredinformation: UInt): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlValidRelativeSecurityDescriptor(securitydescriptorinput.rawAddress, securitydescriptorlength.toInt(), requiredinformation.toInt())

public actual fun rtlValidSecurityDescriptor(securitydescriptor: PsecurityDescriptor): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlValidSecurityDescriptor(securitydescriptor.rawAddress)

public actual fun rtlVerifyVersionInfo(versioninfo: ConstPtr<Osversioninfoexw>, typemask: UInt, conditionmask: ULong): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlVerifyVersionInfo(versioninfo.rawAddress, typemask.toInt(), conditionmask.toLong())

public actual fun rtlVolumeDeviceToDosName(volumedeviceobject: ConstPtr<CVoid>, dosname: MutPtr<UnicodeString>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlVolumeDeviceToDosName(volumedeviceobject.rawAddress, dosname.rawAddress)

public actual fun rtlWalkFrameChain(callers: MutPtr<MutPtr<CVoid>>, count: UInt, flags: UInt): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlWalkFrameChain(callers.rawAddress, count.toInt(), flags.toInt()).toUInt()

public actual fun rtlWeaklyEnumerateEntryHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>): MutPtr<RtlDynamicHashTableEntry> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlWeaklyEnumerateEntryHashTable(hashtable.rawAddress, enumerator.rawAddress))

public actual fun rtlWriteRegistryValue(relativeto: UInt, path: Pcwstr, valuename: Pcwstr, valuetype: UInt, valuedata: ConstPtr<CVoid>, valuelength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlWriteRegistryValue(relativeto.toInt(), path.rawAddress, valuename.rawAddress, valuetype.toInt(), valuedata.rawAddress, valuelength.toInt())

public actual fun rtlxAnsiStringToUnicodeSize(ansistring: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlxAnsiStringToUnicodeSize(ansistring.rawAddress).toUInt()

public actual fun rtlxUnicodeStringToAnsiSize(unicodestring: ConstPtr<UnicodeString>): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesRtlxUnicodeStringToAnsiSize(unicodestring.rawAddress).toUInt()

public actual fun seAccessCheck(securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr<SecuritySubjectContext>, subjectcontextlocked: Boolean, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: MutPtr<MutPtr<PrivilegeSet>>, genericmapping: ConstPtr<GenericMapping>, accessmode: Byte, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Int>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesSeAccessCheck(securitydescriptor.rawAddress, subjectsecuritycontext.rawAddress, subjectcontextlocked, desiredaccess.toInt(), previouslygrantedaccess.toInt(), privileges.rawAddress, genericmapping.rawAddress, accessmode, grantedaccess.rawAddress, accessstatus.rawAddress)

public actual fun seAssignSecurity(parentdescriptor: PsecurityDescriptor, explicitdescriptor: PsecurityDescriptor, newdescriptor: MutPtr<PsecurityDescriptor>, isdirectoryobject: Boolean, subjectcontext: ConstPtr<SecuritySubjectContext>, genericmapping: ConstPtr<GenericMapping>, pooltype: PoolType): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesSeAssignSecurity(parentdescriptor.rawAddress, explicitdescriptor.rawAddress, newdescriptor.rawAddress, isdirectoryobject, subjectcontext.rawAddress, genericmapping.rawAddress, pooltype)

public actual fun seAssignSecurityEx(parentdescriptor: PsecurityDescriptor, explicitdescriptor: PsecurityDescriptor, newdescriptor: MutPtr<PsecurityDescriptor>, objecttype: ConstPtr<Guid>, isdirectoryobject: Boolean, autoinheritflags: UInt, subjectcontext: ConstPtr<SecuritySubjectContext>, genericmapping: ConstPtr<GenericMapping>, pooltype: PoolType): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesSeAssignSecurityEx(parentdescriptor.rawAddress, explicitdescriptor.rawAddress, newdescriptor.rawAddress, objecttype.rawAddress, isdirectoryobject, autoinheritflags.toInt(), subjectcontext.rawAddress, genericmapping.rawAddress, pooltype)

public actual fun seCaptureSubjectContext(subjectcontext: MutPtr<SecuritySubjectContext>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesSeCaptureSubjectContext(subjectcontext.rawAddress)
}

public actual fun seComputeAutoInheritByObjectType(objecttype: ConstPtr<CVoid>, securitydescriptor: PsecurityDescriptor, parentsecuritydescriptor: PsecurityDescriptor): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesSeComputeAutoInheritByObjectType(objecttype.rawAddress, securitydescriptor.rawAddress, parentsecuritydescriptor.rawAddress).toUInt()

public actual fun seDeassignSecurity(securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesSeDeassignSecurity(securitydescriptor.rawAddress)

public actual fun seEtwWriteKMCveEvent(cveid: ConstPtr<UnicodeString>, additionaldetails: ConstPtr<UnicodeString>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesSeEtwWriteKMCveEvent(cveid.rawAddress, additionaldetails.rawAddress)

public actual fun seLockSubjectContext(subjectcontext: ConstPtr<SecuritySubjectContext>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesSeLockSubjectContext(subjectcontext.rawAddress)
}

public actual fun seRegisterImageVerificationCallback(imagetype: SeImageType, callbacktype: SeImageVerificationCallbackType, callbackfunction: PseImageVerificationCallbackFunction, callbackcontext: ConstPtr<CVoid>, token: ConstPtr<CVoid>, callbackhandle: MutPtr<MutPtr<CVoid>>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesSeRegisterImageVerificationCallback(imagetype, callbacktype, 0L, callbackcontext.rawAddress, token.rawAddress, callbackhandle.rawAddress)

public actual fun seReleaseSubjectContext(subjectcontext: MutPtr<SecuritySubjectContext>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesSeReleaseSubjectContext(subjectcontext.rawAddress)
}

public actual fun seReportSecurityEvent(flags: UInt, sourcename: ConstPtr<UnicodeString>, usersid: Psid, auditparameters: ConstPtr<SeAdtParameterArray>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesSeReportSecurityEvent(flags.toInt(), sourcename.rawAddress, usersid.rawAddress, auditparameters.rawAddress)

public actual fun seSetAuditParameter(auditparameters: MutPtr<SeAdtParameterArray>, type: SeAdtParameterType, index: UInt, data: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesSeSetAuditParameter(auditparameters.rawAddress, type, index.toInt(), data.rawAddress)

public actual fun seSinglePrivilegeCheck(privilegevalue: Luid, previousmode: Byte): Boolean =
    false

public actual fun seUnlockSubjectContext(subjectcontext: ConstPtr<SecuritySubjectContext>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesSeUnlockSubjectContext(subjectcontext.rawAddress)
}

public actual fun seUnregisterImageVerificationCallback(callbackhandle: ConstPtr<CVoid>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesSeUnregisterImageVerificationCallback(callbackhandle.rawAddress)
}

public actual fun seValidSecurityDescriptor(length: UInt, securitydescriptor: PsecurityDescriptor): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesSeValidSecurityDescriptor(length.toInt(), securitydescriptor.rawAddress)

public actual fun tmCommitComplete(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmCommitComplete(enlistment.rawAddress, tmvirtualclock.rawAddress)

public actual fun tmCommitEnlistment(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmCommitEnlistment(enlistment.rawAddress, tmvirtualclock.rawAddress)

public actual fun tmCommitTransaction(transaction: ConstPtr<Ktransaction>, wait: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmCommitTransaction(transaction.rawAddress, wait)

public actual fun tmCreateEnlistment(enlistmenthandle: MutPtr<Handle>, previousmode: Byte, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, resourcemanager: ConstPtr<Long>, transaction: ConstPtr<Ktransaction>, createoptions: UInt, notificationmask: UInt, enlistmentkey: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmCreateEnlistment(enlistmenthandle.rawAddress, previousmode, desiredaccess.toInt(), objectattributes.rawAddress, resourcemanager.rawAddress, transaction.rawAddress, createoptions.toInt(), notificationmask.toInt(), enlistmentkey.rawAddress)

public actual fun tmDereferenceEnlistmentKey(enlistment: ConstPtr<Kenlistment>, lastreference: MutPtr<Boolean>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmDereferenceEnlistmentKey(enlistment.rawAddress, lastreference.rawAddress)

public actual fun tmEnableCallbacks(resourcemanager: ConstPtr<Kresourcemanager>, callbackroutine: PtmRmNotification, rmkey: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmEnableCallbacks(resourcemanager.rawAddress, 0L, rmkey.rawAddress)

public actual fun tmGetTransactionId(transaction: ConstPtr<Ktransaction>, transactionid: MutPtr<Guid>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmGetTransactionId(transaction.rawAddress, transactionid.rawAddress)
}

public actual fun tmInitializeTransactionManager(transactionmanager: ConstPtr<Long>, logfilename: ConstPtr<UnicodeString>, tmid: ConstPtr<Guid>, createoptions: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmInitializeTransactionManager(transactionmanager.rawAddress, logfilename.rawAddress, tmid.rawAddress, createoptions.toInt())

public actual fun tmIsTransactionActive(transaction: ConstPtr<Ktransaction>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmIsTransactionActive(transaction.rawAddress)

public actual fun tmPrePrepareComplete(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmPrePrepareComplete(enlistment.rawAddress, tmvirtualclock.rawAddress)

public actual fun tmPrePrepareEnlistment(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmPrePrepareEnlistment(enlistment.rawAddress, tmvirtualclock.rawAddress)

public actual fun tmPrepareComplete(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmPrepareComplete(enlistment.rawAddress, tmvirtualclock.rawAddress)

public actual fun tmPrepareEnlistment(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmPrepareEnlistment(enlistment.rawAddress, tmvirtualclock.rawAddress)

public actual fun tmPropagationComplete(resourcemanager: ConstPtr<Kresourcemanager>, requestcookie: UInt, bufferlength: UInt, buffer: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmPropagationComplete(resourcemanager.rawAddress, requestcookie.toInt(), bufferlength.toInt(), buffer.rawAddress)

public actual fun tmPropagationFailed(resourcemanager: ConstPtr<Kresourcemanager>, requestcookie: UInt, status: Ntstatus): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmPropagationFailed(resourcemanager.rawAddress, requestcookie.toInt(), status)

public actual fun tmReadOnlyEnlistment(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmReadOnlyEnlistment(enlistment.rawAddress, tmvirtualclock.rawAddress)

public actual fun tmRecoverEnlistment(enlistment: ConstPtr<Kenlistment>, enlistmentkey: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmRecoverEnlistment(enlistment.rawAddress, enlistmentkey.rawAddress)

public actual fun tmRecoverResourceManager(resourcemanager: ConstPtr<Kresourcemanager>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmRecoverResourceManager(resourcemanager.rawAddress)

public actual fun tmRecoverTransactionManager(tm: ConstPtr<Ktm>, targetvirtualclock: ConstPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmRecoverTransactionManager(tm.rawAddress, targetvirtualclock.rawAddress)

public actual fun tmReferenceEnlistmentKey(enlistment: ConstPtr<Kenlistment>, key: MutPtr<MutPtr<CVoid>>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmReferenceEnlistmentKey(enlistment.rawAddress, key.rawAddress)

public actual fun tmRenameTransactionManager(logfilename: ConstPtr<UnicodeString>, existingtransactionmanagerguid: ConstPtr<Guid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmRenameTransactionManager(logfilename.rawAddress, existingtransactionmanagerguid.rawAddress)

public actual fun tmRequestOutcomeEnlistment(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmRequestOutcomeEnlistment(enlistment.rawAddress, tmvirtualclock.rawAddress)

public actual fun tmRollbackComplete(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmRollbackComplete(enlistment.rawAddress, tmvirtualclock.rawAddress)

public actual fun tmRollbackEnlistment(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmRollbackEnlistment(enlistment.rawAddress, tmvirtualclock.rawAddress)

public actual fun tmRollbackTransaction(transaction: ConstPtr<Ktransaction>, wait: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmRollbackTransaction(transaction.rawAddress, wait)

public actual fun tmSinglePhaseReject(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesTmSinglePhaseReject(enlistment.rawAddress, tmvirtualclock.rawAddress)

public actual fun vslCreateSecureSection(handle: MutPtr<Handle>, targetprocess: Peprocess, mdl: ConstPtr<Mdl>, devicepageprotection: UInt, attributes: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesVslCreateSecureSection(handle.rawAddress, targetprocess, mdl.rawAddress, devicepageprotection.toInt(), attributes.toInt())

public actual fun vslDeleteSecureSection(globalhandle: Handle): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesVslDeleteSecureSection(globalhandle.rawAddress)

public actual fun wheaAddErrorSource(errorsource: ConstPtr<WheaErrorSourceDescriptor>, context: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaAddErrorSource(errorsource.rawAddress, context.rawAddress)

public actual fun wheaAddErrorSourceDeviceDriver(context: MutPtr<CVoid>, configuration: ConstPtr<WheaErrorSourceConfigurationDeviceDriver>, numberpreallocatederrorreports: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaAddErrorSourceDeviceDriver(context.rawAddress, configuration.rawAddress, numberpreallocatederrorreports.toInt())

public actual fun wheaAddErrorSourceDeviceDriverV1(context: MutPtr<CVoid>, configuration: ConstPtr<WheaErrorSourceConfigurationDeviceDriver>, numbufferstopreallocate: UInt, maxdatalength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaAddErrorSourceDeviceDriverV1(context.rawAddress, configuration.rawAddress, numbufferstopreallocate.toInt(), maxdatalength.toInt())

public actual fun wheaAddHwErrorReportSectionDeviceDriver(errorhandle: ConstPtr<CVoid>, sectiondatalength: UInt, bufferset: MutPtr<WheaDriverBufferSet>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaAddHwErrorReportSectionDeviceDriver(errorhandle.rawAddress, sectiondatalength.toInt(), bufferset.rawAddress)

public actual fun wheaConfigureErrorSource(sourcetype: WheaErrorSourceType, configuration: ConstPtr<WheaErrorSourceConfiguration>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaConfigureErrorSource(sourcetype, configuration.rawAddress)

public actual fun wheaCreateHwErrorReportDeviceDriver(errorsourceid: UInt, deviceobject: ConstPtr<DeviceObject>): MutPtr<CVoid> =
    MutPtr(WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaCreateHwErrorReportDeviceDriver(errorsourceid.toInt(), deviceobject.rawAddress))

public actual fun wheaErrorSourceGetState(errorsourceid: UInt): WheaErrorSourceState =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaErrorSourceGetState(errorsourceid.toInt())

public actual fun wheaGetNotifyAllOfflinesPolicy(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaGetNotifyAllOfflinesPolicy()

public actual fun wheaHighIrqlLogSelEventHandlerRegister(handler: PfnWheaHighIrqlLogSelEventHandler, context: ConstPtr<CVoid>): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaHighIrqlLogSelEventHandlerRegister(0L, context.rawAddress)

public actual fun wheaHighIrqlLogSelEventHandlerUnregister() {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaHighIrqlLogSelEventHandlerUnregister()
}

public actual fun wheaHwErrorReportAbandonDeviceDriver(errorhandle: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaHwErrorReportAbandonDeviceDriver(errorhandle.rawAddress)

public actual fun wheaHwErrorReportSetSectionNameDeviceDriver(bufferset: ConstPtr<WheaDriverBufferSet>, namelength: UInt, name: ConstPtr<UByte>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaHwErrorReportSetSectionNameDeviceDriver(bufferset.rawAddress, namelength.toInt(), name.rawAddress)

public actual fun wheaHwErrorReportSetSeverityDeviceDriver(errorhandle: ConstPtr<CVoid>, errorseverity: WheaErrorSeverity): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaHwErrorReportSetSeverityDeviceDriver(errorhandle.rawAddress, errorseverity)

public actual fun wheaHwErrorReportSubmitDeviceDriver(errorhandle: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaHwErrorReportSubmitDeviceDriver(errorhandle.rawAddress)

public actual fun wheaInitializeRecordHeader(header: MutPtr<WheaErrorRecordHeader>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaInitializeRecordHeader(header.rawAddress)

public actual fun wheaIsCriticalState(): Boolean =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaIsCriticalState()

public actual fun wheaLogInternalEvent(entry: ConstPtr<WheaEventLogEntry>) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaLogInternalEvent(entry.rawAddress)
}

public actual fun wheaRegisterInUsePageOfflineNotification(callback: PfnInUsePageOfflineNotify, context: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaRegisterInUsePageOfflineNotification(0L, context.rawAddress)

public actual fun wheaRemoveErrorSource(errorsourceid: UInt) {
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaRemoveErrorSource(errorsourceid.toInt())
}

public actual fun wheaRemoveErrorSourceDeviceDriver(errorsourceid: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaRemoveErrorSourceDeviceDriver(errorsourceid.toInt())

public actual fun wheaReportHwError(errorpacket: MutPtr<WheaErrorPacketV2>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaReportHwError(errorpacket.rawAddress)

public actual fun wheaReportHwErrorDeviceDriver(errorsourceid: UInt, deviceobject: ConstPtr<DeviceObject>, errordata: ConstPtr<UByte>, errordatalength: UInt, sectiontypeguid: ConstPtr<Guid>, errorseverity: WheaErrorSeverity, devicefriendlyname: Pcstr): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaReportHwErrorDeviceDriver(errorsourceid.toInt(), deviceobject.rawAddress, errordata.rawAddress, errordatalength.toInt(), sectiontypeguid.rawAddress, errorseverity, devicefriendlyname.rawAddress)

public actual fun wheaUnconfigureErrorSource(sourcetype: WheaErrorSourceType): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaUnconfigureErrorSource(sourcetype)

public actual fun wheaUnregisterInUsePageOfflineNotification(callback: PfnInUsePageOfflineNotify): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWheaUnregisterInUsePageOfflineNotification(0L)

public actual fun wmiQueryTraceInformation(traceinformationclass: TraceInformationClass, traceinformation: MutPtr<CVoid>, traceinformationlength: UInt, requiredlength: MutPtr<UInt>, buffer: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesWmiQueryTraceInformation(traceinformationclass, traceinformation.rawAddress, traceinformationlength.toInt(), requiredlength.rawAddress, buffer.rawAddress)

public actual fun zwAllocateLocallyUniqueId(luid: MutPtr<Luid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwAllocateLocallyUniqueId(luid.rawAddress)

public actual fun zwClose(handle: Handle): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwClose(handle.rawAddress)

public actual fun zwCommitComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwCommitComplete(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun zwCommitEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwCommitEnlistment(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun zwCommitTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwCommitTransaction(transactionhandle.rawAddress, wait)

public actual fun zwCreateEnlistment(enlistmenthandle: MutPtr<Handle>, desiredaccess: UInt, resourcemanagerhandle: Handle, transactionhandle: Handle, objectattributes: ConstPtr<ObjectAttributes>, createoptions: UInt, notificationmask: UInt, enlistmentkey: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwCreateEnlistment(enlistmenthandle.rawAddress, desiredaccess.toInt(), resourcemanagerhandle.rawAddress, transactionhandle.rawAddress, objectattributes.rawAddress, createoptions.toInt(), notificationmask.toInt(), enlistmentkey.rawAddress)

public actual fun zwCreateFile(filehandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, allocationsize: ConstPtr<Long>, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: ConstPtr<CVoid>, ealength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwCreateFile(filehandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, iostatusblock.rawAddress, allocationsize.rawAddress, fileattributes.toInt(), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), eabuffer.rawAddress, ealength.toInt())

public actual fun zwCreateResourceManager(resourcemanagerhandle: MutPtr<Handle>, desiredaccess: UInt, tmhandle: Handle, resourcemanagerguid: ConstPtr<Guid>, objectattributes: ConstPtr<ObjectAttributes>, createoptions: UInt, description: ConstPtr<UnicodeString>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwCreateResourceManager(resourcemanagerhandle.rawAddress, desiredaccess.toInt(), tmhandle.rawAddress, resourcemanagerguid.rawAddress, objectattributes.rawAddress, createoptions.toInt(), description.rawAddress)

public actual fun zwCreateSection(sectionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, maximumsize: ConstPtr<Long>, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwCreateSection(sectionhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, maximumsize.rawAddress, sectionpageprotection.toInt(), allocationattributes.toInt(), filehandle.rawAddress)

public actual fun zwCreateTransaction(transactionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, uow: ConstPtr<Guid>, tmhandle: Handle, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: ConstPtr<Long>, description: ConstPtr<UnicodeString>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwCreateTransaction(transactionhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, uow.rawAddress, tmhandle.rawAddress, createoptions.toInt(), isolationlevel.toInt(), isolationflags.toInt(), timeout.rawAddress, description.rawAddress)

public actual fun zwCreateTransactionManager(tmhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, logfilename: ConstPtr<UnicodeString>, createoptions: UInt, commitstrength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwCreateTransactionManager(tmhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, logfilename.rawAddress, createoptions.toInt(), commitstrength.toInt())

public actual fun zwDeviceIoControlFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, iocontrolcode: UInt, inputbuffer: ConstPtr<CVoid>, inputbufferlength: UInt, outputbuffer: MutPtr<CVoid>, outputbufferlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwDeviceIoControlFile(filehandle.rawAddress, event.rawAddress, 0L, apccontext.rawAddress, iostatusblock.rawAddress, iocontrolcode.toInt(), inputbuffer.rawAddress, inputbufferlength.toInt(), outputbuffer.rawAddress, outputbufferlength.toInt())

public actual fun zwDisplayString(string: ConstPtr<UnicodeString>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwDisplayString(string.rawAddress)

public actual fun zwEnumerateTransactionObject(rootobjecthandle: Handle, querytype: KtmobjectType, objectcursor: MutPtr<KtmobjectCursor>, objectcursorlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwEnumerateTransactionObject(rootobjecthandle.rawAddress, querytype, objectcursor.rawAddress, objectcursorlength.toInt(), returnlength.rawAddress)

public actual fun zwGetNotificationResourceManager(resourcemanagerhandle: Handle, transactionnotification: MutPtr<TransactionNotification>, notificationlength: UInt, timeout: ConstPtr<Long>, returnlength: MutPtr<UInt>, asynchronous: UInt, asynchronouscontext: ULong): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwGetNotificationResourceManager(resourcemanagerhandle.rawAddress, transactionnotification.rawAddress, notificationlength.toInt(), timeout.rawAddress, returnlength.rawAddress, asynchronous.toInt(), asynchronouscontext.toLong())

public actual fun zwLoadDriver(driverservicename: ConstPtr<UnicodeString>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwLoadDriver(driverservicename.rawAddress)

public actual fun zwMakeTemporaryObject(handle: Handle): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwMakeTemporaryObject(handle.rawAddress)

public actual fun zwManagePartition(targethandle: Handle, sourcehandle: Handle, partitioninformationclass: PartitionInformationClass, partitioninformation: MutPtr<CVoid>, partitioninformationlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwManagePartition(targethandle.rawAddress, sourcehandle.rawAddress, partitioninformationclass, partitioninformation.rawAddress, partitioninformationlength.toInt())

public actual fun zwOpenEnlistment(enlistmenthandle: MutPtr<Handle>, desiredaccess: UInt, rmhandle: Handle, enlistmentguid: ConstPtr<Guid>, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwOpenEnlistment(enlistmenthandle.rawAddress, desiredaccess.toInt(), rmhandle.rawAddress, enlistmentguid.rawAddress, objectattributes.rawAddress)

public actual fun zwOpenFile(filehandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, shareaccess: UInt, openoptions: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwOpenFile(filehandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, iostatusblock.rawAddress, shareaccess.toInt(), openoptions.toInt())

public actual fun zwOpenResourceManager(resourcemanagerhandle: MutPtr<Handle>, desiredaccess: UInt, tmhandle: Handle, resourcemanagerguid: ConstPtr<Guid>, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwOpenResourceManager(resourcemanagerhandle.rawAddress, desiredaccess.toInt(), tmhandle.rawAddress, resourcemanagerguid.rawAddress, objectattributes.rawAddress)

public actual fun zwOpenSymbolicLinkObject(linkhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwOpenSymbolicLinkObject(linkhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress)

public actual fun zwOpenTransaction(transactionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, uow: ConstPtr<Guid>, tmhandle: Handle): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwOpenTransaction(transactionhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, uow.rawAddress, tmhandle.rawAddress)

public actual fun zwOpenTransactionManager(tmhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, logfilename: ConstPtr<UnicodeString>, tmidentity: ConstPtr<Guid>, openoptions: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwOpenTransactionManager(tmhandle.rawAddress, desiredaccess.toInt(), objectattributes.rawAddress, logfilename.rawAddress, tmidentity.rawAddress, openoptions.toInt())

public actual fun zwPowerInformation(informationlevel: PowerInformationLevel, inputbuffer: ConstPtr<CVoid>, inputbufferlength: UInt, outputbuffer: MutPtr<CVoid>, outputbufferlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwPowerInformation(informationlevel, inputbuffer.rawAddress, inputbufferlength.toInt(), outputbuffer.rawAddress, outputbufferlength.toInt())

public actual fun zwPrePrepareComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwPrePrepareComplete(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun zwPrePrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwPrePrepareEnlistment(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun zwPrepareComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwPrepareComplete(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun zwPrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwPrepareEnlistment(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun zwPropagationComplete(resourcemanagerhandle: Handle, requestcookie: UInt, bufferlength: UInt, buffer: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwPropagationComplete(resourcemanagerhandle.rawAddress, requestcookie.toInt(), bufferlength.toInt(), buffer.rawAddress)

public actual fun zwPropagationFailed(resourcemanagerhandle: Handle, requestcookie: UInt, propstatus: Ntstatus): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwPropagationFailed(resourcemanagerhandle.rawAddress, requestcookie.toInt(), propstatus)

public actual fun zwQueryInformationByName(objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwQueryInformationByName(objectattributes.rawAddress, iostatusblock.rawAddress, fileinformation.rawAddress, length.toInt(), fileinformationclass)

public actual fun zwQueryInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: MutPtr<CVoid>, enlistmentinformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwQueryInformationEnlistment(enlistmenthandle.rawAddress, enlistmentinformationclass, enlistmentinformation.rawAddress, enlistmentinformationlength.toInt(), returnlength.rawAddress)

public actual fun zwQueryInformationFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwQueryInformationFile(filehandle.rawAddress, iostatusblock.rawAddress, fileinformation.rawAddress, length.toInt(), fileinformationclass)

public actual fun zwQueryInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: MutPtr<CVoid>, resourcemanagerinformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwQueryInformationResourceManager(resourcemanagerhandle.rawAddress, resourcemanagerinformationclass, resourcemanagerinformation.rawAddress, resourcemanagerinformationlength.toInt(), returnlength.rawAddress)

public actual fun zwQueryInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: MutPtr<CVoid>, transactioninformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwQueryInformationTransaction(transactionhandle.rawAddress, transactioninformationclass, transactioninformation.rawAddress, transactioninformationlength.toInt(), returnlength.rawAddress)

public actual fun zwQueryInformationTransactionManager(transactionmanagerhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: MutPtr<CVoid>, transactionmanagerinformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwQueryInformationTransactionManager(transactionmanagerhandle.rawAddress, transactionmanagerinformationclass, transactionmanagerinformation.rawAddress, transactionmanagerinformationlength.toInt(), returnlength.rawAddress)

public actual fun zwQuerySymbolicLinkObject(linkhandle: Handle, linktarget: MutPtr<UnicodeString>, returnedlength: MutPtr<UInt>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwQuerySymbolicLinkObject(linkhandle.rawAddress, linktarget.rawAddress, returnedlength.rawAddress)

public actual fun zwReadFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, buffer: MutPtr<CVoid>, length: UInt, byteoffset: ConstPtr<Long>, key: ConstPtr<UInt>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwReadFile(filehandle.rawAddress, event.rawAddress, 0L, apccontext.rawAddress, iostatusblock.rawAddress, buffer.rawAddress, length.toInt(), byteoffset.rawAddress, key.rawAddress)

public actual fun zwReadOnlyEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwReadOnlyEnlistment(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun zwRecoverEnlistment(enlistmenthandle: Handle, enlistmentkey: ConstPtr<CVoid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwRecoverEnlistment(enlistmenthandle.rawAddress, enlistmentkey.rawAddress)

public actual fun zwRecoverResourceManager(resourcemanagerhandle: Handle): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwRecoverResourceManager(resourcemanagerhandle.rawAddress)

public actual fun zwRecoverTransactionManager(transactionmanagerhandle: Handle): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwRecoverTransactionManager(transactionmanagerhandle.rawAddress)

public actual fun zwRegisterProtocolAddressInformation(resourcemanager: Handle, protocolid: ConstPtr<Guid>, protocolinformationsize: UInt, protocolinformation: ConstPtr<CVoid>, createoptions: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwRegisterProtocolAddressInformation(resourcemanager.rawAddress, protocolid.rawAddress, protocolinformationsize.toInt(), protocolinformation.rawAddress, createoptions.toInt())

public actual fun zwRenameTransactionManager(logfilename: ConstPtr<UnicodeString>, existingtransactionmanagerguid: ConstPtr<Guid>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwRenameTransactionManager(logfilename.rawAddress, existingtransactionmanagerguid.rawAddress)

public actual fun zwRollbackComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwRollbackComplete(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun zwRollbackEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwRollbackEnlistment(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun zwRollbackTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwRollbackTransaction(transactionhandle.rawAddress, wait)

public actual fun zwRollforwardTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwRollforwardTransactionManager(transactionmanagerhandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun zwSetInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: ConstPtr<CVoid>, enlistmentinformationlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwSetInformationEnlistment(enlistmenthandle.rawAddress, enlistmentinformationclass, enlistmentinformation.rawAddress, enlistmentinformationlength.toInt())

public actual fun zwSetInformationFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: ConstPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwSetInformationFile(filehandle.rawAddress, iostatusblock.rawAddress, fileinformation.rawAddress, length.toInt(), fileinformationclass)

public actual fun zwSetInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: ConstPtr<CVoid>, resourcemanagerinformationlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwSetInformationResourceManager(resourcemanagerhandle.rawAddress, resourcemanagerinformationclass, resourcemanagerinformation.rawAddress, resourcemanagerinformationlength.toInt())

public actual fun zwSetInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: ConstPtr<CVoid>, transactioninformationlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwSetInformationTransaction(transactionhandle.rawAddress, transactioninformationclass, transactioninformation.rawAddress, transactioninformationlength.toInt())

public actual fun zwSetInformationTransactionManager(tmhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: ConstPtr<CVoid>, transactionmanagerinformationlength: UInt): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwSetInformationTransactionManager(tmhandle.rawAddress, transactionmanagerinformationclass, transactionmanagerinformation.rawAddress, transactionmanagerinformationlength.toInt())

public actual fun zwSinglePhaseReject(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwSinglePhaseReject(enlistmenthandle.rawAddress, tmvirtualclock.rawAddress)

public actual fun zwUnloadDriver(driverservicename: ConstPtr<UnicodeString>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwUnloadDriver(driverservicename.rawAddress)

public actual fun zwWriteFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, buffer: ConstPtr<CVoid>, length: UInt, byteoffset: ConstPtr<Long>, key: ConstPtr<UInt>): Ntstatus =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesZwWriteFile(filehandle.rawAddress, event.rawAddress, 0L, apccontext.rawAddress, iostatusblock.rawAddress, buffer.rawAddress, length.toInt(), byteoffset.rawAddress, key.rawAddress)

public actual fun vDbgPrintEx(componentid: UInt, level: UInt, format: Pcstr, arglist: ConstPtr<Byte>): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesVDbgPrintEx(componentid.toInt(), level.toInt(), format.rawAddress, arglist.rawAddress).toUInt()

public actual fun vDbgPrintExWithPrefix(prefix: Pcstr, componentid: UInt, level: UInt, format: Pcstr, arglist: ConstPtr<Byte>): UInt =
    WindowsWdkSystemSystemservicesJniBridge.windowssysWindowsWdkSystemSystemservicesVDbgPrintExWithPrefix(prefix.rawAddress, componentid.toInt(), level.toInt(), format.rawAddress, arglist.rawAddress).toUInt()
