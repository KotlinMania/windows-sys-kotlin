@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun clfsAddLogContainer(plfolog: ConstPtr<FileObject>, pcbcontainer: ConstPtr<ULong>, puszcontainerpath: ConstPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsAddLogContainer")

public actual fun clfsAddLogContainerSet(plfolog: ConstPtr<FileObject>, ccontainers: UShort, pcbcontainer: ConstPtr<ULong>, rguszcontainerpath: ConstPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsAddLogContainerSet")

public actual fun clfsAdvanceLogBase(pvmarshalcontext: MutPtr<CVoid>, plsnbase: ConstPtr<ClsLsn>, fflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsAdvanceLogBase")

public actual fun clfsAlignReservedLog(pvmarshalcontext: ConstPtr<CVoid>, crecords: UInt, rgcbreservation: ConstPtr<Long>, pcbalignreservation: MutPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsAlignReservedLog")

public actual fun clfsAllocReservedLog(pvmarshalcontext: ConstPtr<CVoid>, crecords: UInt, pcbadjustment: ConstPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsAllocReservedLog")

public actual fun clfsCloseAndResetLogFile(plfolog: ConstPtr<FileObject>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsCloseAndResetLogFile")

public actual fun clfsCloseLogFileObject(plfolog: ConstPtr<FileObject>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsCloseLogFileObject")

public actual fun clfsCreateLogFile(pplfolog: MutPtr<MutPtr<FileObject>>, puszlogfilename: ConstPtr<UnicodeString>, fdesiredaccess: UInt, dwsharemode: UInt, psdlogfile: PsecurityDescriptor, fcreatedisposition: UInt, fcreateoptions: UInt, fflagsandattributes: UInt, flogoptionflag: UInt, pvcontext: ConstPtr<CVoid>, cbcontext: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsCreateLogFile")

public actual fun clfsCreateMarshallingArea(plfolog: ConstPtr<FileObject>, epooltype: PoolType, pfnallocbuffer: PallocateFunction, pfnfreebuffer: PfreeFunction, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, ppvmarshalcontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsCreateMarshallingArea")

public actual fun clfsCreateMarshallingAreaEx(plfolog: ConstPtr<FileObject>, epooltype: PoolType, pfnallocbuffer: PallocateFunction, pfnfreebuffer: PfreeFunction, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, calignmentsize: UInt, fflags: ULong, ppvmarshalcontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsCreateMarshallingAreaEx")

public actual fun clfsCreateScanContext(plfolog: ConstPtr<FileObject>, cfromcontainer: UInt, ccontainers: UInt, escanmode: UByte, pcxscan: MutPtr<ClsScanContext>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsCreateScanContext")

public actual fun clfsDeleteLogByPointer(plfolog: ConstPtr<FileObject>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsDeleteLogByPointer")

public actual fun clfsDeleteLogFile(puszlogfilename: ConstPtr<UnicodeString>, pvreserved: ConstPtr<CVoid>, flogoptionflag: UInt, pvcontext: ConstPtr<CVoid>, cbcontext: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsDeleteLogFile")

public actual fun clfsDeleteMarshallingArea(pvmarshalcontext: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsDeleteMarshallingArea")

public actual fun clfsEarlierLsn(plsn: ConstPtr<ClsLsn>): ClsLsn =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsEarlierLsn")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesClfsFinalize")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesClfsFinalize(): Unit

public actual fun clfsFinalize(): Unit =
    wasiWindowssysWindowsWdkSystemSystemservicesClfsFinalize()

public actual fun clfsFlushBuffers(pvmarshalcontext: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsFlushBuffers")

public actual fun clfsFlushToLsn(pvmarshalcontext: ConstPtr<CVoid>, plsnflush: ConstPtr<ClsLsn>, plsnlastflushed: MutPtr<ClsLsn>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsFlushToLsn")

public actual fun clfsFreeReservedLog(pvmarshalcontext: ConstPtr<CVoid>, crecords: UInt, pcbadjustment: ConstPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsFreeReservedLog")

public actual fun clfsGetContainerName(plfolog: ConstPtr<FileObject>, cidlogicalcontainer: UInt, puszcontainername: MutPtr<UnicodeString>, pcactuallencontainername: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsGetContainerName")

public actual fun clfsGetIoStatistics(plfolog: ConstPtr<FileObject>, pvstatsbuffer: MutPtr<CVoid>, cbstatsbuffer: UInt, estatsclass: ClfsIostatsClass, pcbstatswritten: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsGetIoStatistics")

public actual fun clfsGetLogFileInformation(plfolog: ConstPtr<FileObject>, pinfobuffer: MutPtr<ClsInformation>, pcbinfobuffer: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsGetLogFileInformation")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesClfsInitialize")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesClfsInitialize(): Int

public actual fun clfsInitialize(): Ntstatus =
    wasiWindowssysWindowsWdkSystemSystemservicesClfsInitialize().toInt()

public actual fun clfsLaterLsn(plsn: ConstPtr<ClsLsn>): ClsLsn =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsLaterLsn")

public actual fun clfsLsnBlockOffset(plsn: ConstPtr<ClsLsn>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsLsnBlockOffset")

public actual fun clfsLsnContainer(plsn: ConstPtr<ClsLsn>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsLsnContainer")

public actual fun clfsLsnCreate(cidcontainer: UInt, offblock: UInt, crecord: UInt): ClsLsn =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsLsnCreate")

public actual fun clfsLsnDifference(plsnstart: ConstPtr<ClsLsn>, plsnfinish: ConstPtr<ClsLsn>, cbcontainer: UInt, cbmaxblock: UInt, pcbdifference: MutPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsLsnDifference")

public actual fun clfsLsnEqual(plsn1: ConstPtr<ClsLsn>, plsn2: ConstPtr<ClsLsn>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsLsnEqual")

public actual fun clfsLsnGreater(plsn1: ConstPtr<ClsLsn>, plsn2: ConstPtr<ClsLsn>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsLsnGreater")

public actual fun clfsLsnInvalid(plsn: ConstPtr<ClsLsn>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsLsnInvalid")

public actual fun clfsLsnLess(plsn1: ConstPtr<ClsLsn>, plsn2: ConstPtr<ClsLsn>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsLsnLess")

public actual fun clfsLsnNull(plsn: ConstPtr<ClsLsn>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsLsnNull")

public actual fun clfsLsnRecordSequence(plsn: ConstPtr<ClsLsn>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsLsnRecordSequence")

public actual fun clfsMgmtDeregisterManagedClient(clientcookie: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsMgmtDeregisterManagedClient")

public actual fun clfsMgmtHandleLogFileFull(client: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsMgmtHandleLogFileFull")

public actual fun clfsMgmtInstallPolicy(logfile: ConstPtr<FileObject>, policy: ConstPtr<ClfsMgmtPolicy>, policylength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsMgmtInstallPolicy")

public actual fun clfsMgmtQueryPolicy(logfile: ConstPtr<FileObject>, policytype: ClfsMgmtPolicyType, policy: MutPtr<ClfsMgmtPolicy>, policylength: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsMgmtQueryPolicy")

public actual fun clfsMgmtRegisterManagedClient(logfile: ConstPtr<FileObject>, registrationdata: ConstPtr<ClfsMgmtClientRegistration>, clientcookie: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsMgmtRegisterManagedClient")

public actual fun clfsMgmtRemovePolicy(logfile: ConstPtr<FileObject>, policytype: ClfsMgmtPolicyType): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsMgmtRemovePolicy")

public actual fun clfsMgmtSetLogFileSize(logfile: ConstPtr<FileObject>, newsizeincontainers: ConstPtr<ULong>, resultingsizeincontainers: MutPtr<ULong>, completionroutine: PclfsSetLogSizeCompleteCallback, completionroutinedata: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsMgmtSetLogFileSize")

public actual fun clfsMgmtSetLogFileSizeAsClient(logfile: ConstPtr<FileObject>, clientcookie: ConstPtr<ConstPtr<CVoid>>, newsizeincontainers: ConstPtr<ULong>, resultingsizeincontainers: MutPtr<ULong>, completionroutine: PclfsSetLogSizeCompleteCallback, completionroutinedata: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsMgmtSetLogFileSizeAsClient")

public actual fun clfsMgmtTailAdvanceFailure(client: ConstPtr<CVoid>, reason: Ntstatus): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsMgmtTailAdvanceFailure")

public actual fun clfsQueryLogFileInformation(plfolog: ConstPtr<FileObject>, einformationclass: ClsLogInformationClass, pinfoinputbuffer: ConstPtr<CVoid>, cbinfoinputbuffer: UInt, pinfobuffer: MutPtr<CVoid>, pcbinfobuffer: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsQueryLogFileInformation")

public actual fun clfsReadLogRecord(pvmarshalcontext: ConstPtr<CVoid>, plsnfirst: MutPtr<ClsLsn>, pecontextmode: ClfsContextMode, ppvreadbuffer: MutPtr<MutPtr<CVoid>>, pcbreadbuffer: MutPtr<UInt>, perecordtype: MutPtr<UByte>, plsnundonext: MutPtr<ClsLsn>, plsnprevious: MutPtr<ClsLsn>, ppvreadcontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsReadLogRecord")

public actual fun clfsReadNextLogRecord(pvreadcontext: MutPtr<CVoid>, ppvbuffer: MutPtr<MutPtr<CVoid>>, pcbbuffer: MutPtr<UInt>, perecordtype: MutPtr<UByte>, plsnuser: ConstPtr<ClsLsn>, plsnundonext: MutPtr<ClsLsn>, plsnprevious: MutPtr<ClsLsn>, plsnrecord: MutPtr<ClsLsn>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsReadNextLogRecord")

public actual fun clfsReadPreviousRestartArea(pvreadcontext: ConstPtr<CVoid>, ppvrestartbuffer: MutPtr<MutPtr<CVoid>>, pcbrestartbuffer: MutPtr<UInt>, plsnrestart: MutPtr<ClsLsn>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsReadPreviousRestartArea")

public actual fun clfsReadRestartArea(pvmarshalcontext: MutPtr<CVoid>, ppvrestartbuffer: MutPtr<MutPtr<CVoid>>, pcbrestartbuffer: MutPtr<UInt>, plsn: MutPtr<ClsLsn>, ppvreadcontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsReadRestartArea")

public actual fun clfsRemoveLogContainer(plfolog: ConstPtr<FileObject>, puszcontainerpath: ConstPtr<UnicodeString>, fforce: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsRemoveLogContainer")

public actual fun clfsRemoveLogContainerSet(plfolog: ConstPtr<FileObject>, ccontainers: UShort, rgwszcontainerpath: ConstPtr<UnicodeString>, fforce: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsRemoveLogContainerSet")

public actual fun clfsReserveAndAppendLog(pvmarshalcontext: ConstPtr<CVoid>, rgwriteentries: ConstPtr<ClsWriteEntry>, cwriteentries: UInt, plsnundonext: ConstPtr<ClsLsn>, plsnprevious: ConstPtr<ClsLsn>, creserverecords: UInt, rgcbreservation: MutPtr<Long>, fflags: UInt, plsn: MutPtr<ClsLsn>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsReserveAndAppendLog")

public actual fun clfsReserveAndAppendLogAligned(pvmarshalcontext: ConstPtr<CVoid>, rgwriteentries: ConstPtr<ClsWriteEntry>, cwriteentries: UInt, cbentryalignment: UInt, plsnundonext: ConstPtr<ClsLsn>, plsnprevious: ConstPtr<ClsLsn>, creserverecords: UInt, rgcbreservation: MutPtr<Long>, fflags: UInt, plsn: MutPtr<ClsLsn>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsReserveAndAppendLogAligned")

public actual fun clfsScanLogContainers(pcxscan: MutPtr<ClsScanContext>, escanmode: UByte): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsScanLogContainers")

public actual fun clfsSetArchiveTail(plfolog: ConstPtr<FileObject>, plsnarchivetail: ConstPtr<ClsLsn>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsSetArchiveTail")

public actual fun clfsSetEndOfLog(plfolog: ConstPtr<FileObject>, plsnend: ConstPtr<ClsLsn>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsSetEndOfLog")

public actual fun clfsSetLogFileInformation(plfolog: ConstPtr<FileObject>, einformationclass: ClsLogInformationClass, pinfobuffer: ConstPtr<CVoid>, cbbuffer: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsSetLogFileInformation")

public actual fun clfsTerminateReadLog(pvcursorcontext: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsTerminateReadLog")

public actual fun clfsWriteRestartArea(pvmarshalcontext: MutPtr<CVoid>, pvrestartbuffer: ConstPtr<CVoid>, cbrestartbuffer: UInt, plsnbase: ConstPtr<ClsLsn>, fflags: UInt, pcbwritten: MutPtr<UInt>, plsnnext: MutPtr<ClsLsn>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesClfsWriteRestartArea")

public actual fun cmCallbackGetKeyObjectID(cookie: ConstPtr<Long>, obj: ConstPtr<CVoid>, objectid: MutPtr<ULong>, objectname: MutPtr<MutPtr<UnicodeString>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesCmCallbackGetKeyObjectID")

public actual fun cmCallbackGetKeyObjectIDEx(cookie: ConstPtr<Long>, obj: ConstPtr<CVoid>, objectid: MutPtr<ULong>, objectname: MutPtr<MutPtr<UnicodeString>>, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesCmCallbackGetKeyObjectIDEx")

public actual fun cmCallbackReleaseKeyObjectIDEx(objectname: ConstPtr<UnicodeString>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesCmCallbackReleaseKeyObjectIDEx")

public actual fun cmGetBoundTransaction(cookie: ConstPtr<Long>, obj: ConstPtr<CVoid>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesCmGetBoundTransaction")

public actual fun cmGetCallbackVersion(major: MutPtr<UInt>, minor: MutPtr<UInt>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesCmGetCallbackVersion")

public actual fun cmRegisterCallback(function: PexCallbackFunction, context: ConstPtr<CVoid>, cookie: MutPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesCmRegisterCallback")

public actual fun cmRegisterCallbackEx(function: PexCallbackFunction, altitude: ConstPtr<UnicodeString>, driver: ConstPtr<CVoid>, context: ConstPtr<CVoid>, cookie: MutPtr<Long>, reserved: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesCmRegisterCallbackEx")

public actual fun cmSetCallbackObjectContext(obj: MutPtr<CVoid>, cookie: ConstPtr<Long>, newcontext: ConstPtr<CVoid>, oldcontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesCmSetCallbackObjectContext")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesCmUnRegisterCallback")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesCmUnRegisterCallback(cookie: Long): Int

public actual fun cmUnRegisterCallback(cookie: Long): Ntstatus =
    wasiWindowssysWindowsWdkSystemSystemservicesCmUnRegisterCallback(cookie).toInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesDbgBreakPointWithStatus")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesDbgBreakPointWithStatus(status: Int): Unit

public actual fun dbgBreakPointWithStatus(status: UInt): Unit =
    wasiWindowssysWindowsWdkSystemSystemservicesDbgBreakPointWithStatus(status.toInt())

public actual fun dbgPrint(format: Pcstr, vararg variadicArgs: Long): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesDbgPrint")

public actual fun dbgPrintEx(componentid: UInt, level: UInt, format: Pcstr, vararg variadicArgs: Long): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesDbgPrintEx")

public actual fun dbgPrintReturnControlC(format: Pcstr, vararg variadicArgs: Long): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesDbgPrintReturnControlC")

public actual fun dbgPrompt(prompt: Pcstr, response: Pstr, length: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesDbgPrompt")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesDbgQueryDebugFilterState")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesDbgQueryDebugFilterState(componentid: Int, level: Int): Int

public actual fun dbgQueryDebugFilterState(componentid: UInt, level: UInt): Ntstatus =
    wasiWindowssysWindowsWdkSystemSystemservicesDbgQueryDebugFilterState(componentid.toInt(), level.toInt()).toInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesDbgSetDebugFilterState")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesDbgSetDebugFilterState(componentid: Int, level: Int, state: Int): Int

public actual fun dbgSetDebugFilterState(componentid: UInt, level: UInt, state: Boolean): Ntstatus =
    wasiWindowssysWindowsWdkSystemSystemservicesDbgSetDebugFilterState(componentid.toInt(), level.toInt(), if (state) 1 else 0).toInt()

public actual fun dbgSetDebugPrintCallback(debugprintcallback: PdebugPrintCallback, enable: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesDbgSetDebugPrintCallback")

public actual fun etwActivityIdControl(controlcode: UInt, activityid: MutPtr<Guid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesEtwActivityIdControl")

public actual fun etwEventEnabled(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesEtwEventEnabled")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesEtwProviderEnabled")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesEtwProviderEnabled(reghandle: Long, level: Int, keyword: Long): Int

public actual fun etwProviderEnabled(reghandle: Reghandle, level: UByte, keyword: ULong): Boolean =
    (wasiWindowssysWindowsWdkSystemSystemservicesEtwProviderEnabled(reghandle, level.toInt(), keyword.toLong()) != 0)

public actual fun etwRegister(providerid: ConstPtr<Guid>, enablecallback: Petwenablecallback, callbackcontext: ConstPtr<CVoid>, reghandle: MutPtr<Reghandle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesEtwRegister")

public actual fun etwSetInformation(reghandle: Reghandle, informationclass: EventInfoClass, eventinformation: ConstPtr<CVoid>, informationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesEtwSetInformation")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesEtwUnregister")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesEtwUnregister(reghandle: Long): Int

public actual fun etwUnregister(reghandle: Reghandle): Ntstatus =
    wasiWindowssysWindowsWdkSystemSystemservicesEtwUnregister(reghandle).toInt()

public actual fun etwWrite(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>, activityid: ConstPtr<Guid>, userdatacount: UInt, userdata: ConstPtr<EventDataDescriptor>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesEtwWrite")

public actual fun etwWriteEx(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>, filter: ULong, flags: UInt, activityid: ConstPtr<Guid>, relatedactivityid: ConstPtr<Guid>, userdatacount: UInt, userdata: ConstPtr<EventDataDescriptor>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesEtwWriteEx")

public actual fun etwWriteString(reghandle: Reghandle, level: UByte, keyword: ULong, activityid: ConstPtr<Guid>, string: Pcwstr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesEtwWriteString")

public actual fun etwWriteTransfer(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>, activityid: ConstPtr<Guid>, relatedactivityid: ConstPtr<Guid>, userdatacount: UInt, userdata: ConstPtr<EventDataDescriptor>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesEtwWriteTransfer")

public actual fun exAcquireFastMutex(fastmutex: MutPtr<FastMutex>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExAcquireFastMutex")

public actual fun exAcquireFastMutexUnsafe(fastmutex: MutPtr<FastMutex>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExAcquireFastMutexUnsafe")

public actual fun exAcquirePushLockExclusiveEx(pushlock: MutPtr<ULong>, flags: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExAcquirePushLockExclusiveEx")

public actual fun exAcquirePushLockSharedEx(pushlock: MutPtr<ULong>, flags: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExAcquirePushLockSharedEx")

public actual fun exAcquireResourceExclusiveLite(resource: MutPtr<Eresource>, wait: Boolean): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExAcquireResourceExclusiveLite")

public actual fun exAcquireResourceSharedLite(resource: MutPtr<Eresource>, wait: Boolean): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExAcquireResourceSharedLite")

public actual fun exAcquireRundownProtection(runref: MutPtr<ExRundownRef>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExAcquireRundownProtection")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesExAcquireRundownProtectionCacheAware")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesExAcquireRundownProtectionCacheAware(runrefcacheaware: Long): Int

public actual fun exAcquireRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware): Boolean =
    (wasiWindowssysWindowsWdkSystemSystemservicesExAcquireRundownProtectionCacheAware(runrefcacheaware) != 0)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesExAcquireRundownProtectionCacheAwareEx")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesExAcquireRundownProtectionCacheAwareEx(runrefcacheaware: Long, count: Int): Int

public actual fun exAcquireRundownProtectionCacheAwareEx(runrefcacheaware: PexRundownRefCacheAware, count: UInt): Boolean =
    (wasiWindowssysWindowsWdkSystemSystemservicesExAcquireRundownProtectionCacheAwareEx(runrefcacheaware, count.toInt()) != 0)

public actual fun exAcquireRundownProtectionEx(runref: MutPtr<ExRundownRef>, count: UInt): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExAcquireRundownProtectionEx")

public actual fun exAcquireSharedStarveExclusive(resource: MutPtr<Eresource>, wait: Boolean): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExAcquireSharedStarveExclusive")

public actual fun exAcquireSharedWaitForExclusive(resource: MutPtr<Eresource>, wait: Boolean): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExAcquireSharedWaitForExclusive")

public actual fun exAcquireSpinLockExclusive(spinlock: MutPtr<Int>): UByte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExAcquireSpinLockExclusive")

public actual fun exAcquireSpinLockExclusiveAtDpcLevel(spinlock: MutPtr<Int>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExAcquireSpinLockExclusiveAtDpcLevel")

public actual fun exAcquireSpinLockShared(spinlock: MutPtr<Int>): UByte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExAcquireSpinLockShared")

public actual fun exAcquireSpinLockSharedAtDpcLevel(spinlock: MutPtr<Int>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExAcquireSpinLockSharedAtDpcLevel")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesExAllocateCacheAwareRundownProtection")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesExAllocateCacheAwareRundownProtection(pooltype: Int, pooltag: Int): Long

public actual fun exAllocateCacheAwareRundownProtection(pooltype: PoolType, pooltag: UInt): PexRundownRefCacheAware =
    wasiWindowssysWindowsWdkSystemSystemservicesExAllocateCacheAwareRundownProtection(pooltype, pooltag.toInt()).toLong()

public actual fun exAllocatePool(pooltype: PoolType, numberofbytes: ULong): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExAllocatePool")

public actual fun exAllocatePool2(flags: ULong, numberofbytes: ULong, tag: UInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExAllocatePool2")

public actual fun exAllocatePool3(flags: ULong, numberofbytes: ULong, tag: UInt, extendedparameters: ConstPtr<PoolExtendedParameter>, extendedparameterscount: UInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExAllocatePool3")

public actual fun exAllocatePoolWithQuota(pooltype: PoolType, numberofbytes: ULong): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExAllocatePoolWithQuota")

public actual fun exAllocatePoolWithQuotaTag(pooltype: PoolType, numberofbytes: ULong, tag: UInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExAllocatePoolWithQuotaTag")

public actual fun exAllocatePoolWithTag(pooltype: PoolType, numberofbytes: ULong, tag: UInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExAllocatePoolWithTag")

public actual fun exAllocatePoolWithTagPriority(pooltype: PoolType, numberofbytes: ULong, tag: UInt, priority: ExPoolPriority): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExAllocatePoolWithTagPriority")

public actual fun exAllocateTimer(callback: PextCallback, callbackcontext: ConstPtr<CVoid>, attributes: UInt): PexTimer =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExAllocateTimer")

public actual fun exCancelTimer(timer: PexTimer, parameters: ConstPtr<CVoid>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExCancelTimer")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesExCleanupRundownProtectionCacheAware")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesExCleanupRundownProtectionCacheAware(runrefcacheaware: Long): Unit

public actual fun exCleanupRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware): Unit =
    wasiWindowssysWindowsWdkSystemSystemservicesExCleanupRundownProtectionCacheAware(runrefcacheaware)

public actual fun exConvertExclusiveToSharedLite(resource: MutPtr<Eresource>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExConvertExclusiveToSharedLite")

public actual fun exCreateCallback(callbackobject: MutPtr<PcallbackObject>, objectattributes: ConstPtr<ObjectAttributes>, create: Boolean, allowmultiplecallbacks: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExCreateCallback")

public actual fun exCreatePool(flags: UInt, tag: ULong, params: ConstPtr<PoolCreateExtendedParams>, poolhandle: MutPtr<Handle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExCreatePool")

public actual fun exDeleteResourceLite(resource: MutPtr<Eresource>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExDeleteResourceLite")

public actual fun exDeleteTimer(timer: PexTimer, cancel: Boolean, wait: Boolean, parameters: ConstPtr<ExtDeleteParameters>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExDeleteTimer")

public actual fun exDestroyPool(poolhandle: Handle): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExDestroyPool")

public actual fun exEnterCriticalRegionAndAcquireResourceExclusive(resource: MutPtr<Eresource>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExEnterCriticalRegionAndAcquireResourceExclusive")

public actual fun exEnterCriticalRegionAndAcquireResourceShared(resource: MutPtr<Eresource>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExEnterCriticalRegionAndAcquireResourceShared")

public actual fun exEnterCriticalRegionAndAcquireSharedWaitForExclusive(resource: MutPtr<Eresource>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExEnterCriticalRegionAndAcquireSharedWaitForExclusive")

public actual fun exEnumerateSystemFirmwareTables(firmwaretableprovidersignature: UInt, firmwaretablebuffer: MutPtr<CVoid>, bufferlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExEnumerateSystemFirmwareTables")

public actual fun exExtendZone(zone: MutPtr<ZoneHeader>, segment: MutPtr<CVoid>, segmentsize: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExExtendZone")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesExFreeCacheAwareRundownProtection")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesExFreeCacheAwareRundownProtection(runrefcacheaware: Long): Unit

public actual fun exFreeCacheAwareRundownProtection(runrefcacheaware: PexRundownRefCacheAware): Unit =
    wasiWindowssysWindowsWdkSystemSystemservicesExFreeCacheAwareRundownProtection(runrefcacheaware)

public actual fun exFreePool(p: MutPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExFreePool")

public actual fun exFreePool2(p: MutPtr<CVoid>, tag: UInt, extendedparameters: ConstPtr<PoolExtendedParameter>, extendedparameterscount: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExFreePool2")

public actual fun exFreePoolWithTag(p: MutPtr<CVoid>, tag: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExFreePoolWithTag")

public actual fun exGetExclusiveWaiterCount(resource: ConstPtr<Eresource>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExGetExclusiveWaiterCount")

public actual fun exGetFirmwareEnvironmentVariable(variablename: ConstPtr<UnicodeString>, vendorguid: ConstPtr<Guid>, value: MutPtr<CVoid>, valuelength: MutPtr<UInt>, attributes: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExGetFirmwareEnvironmentVariable")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesExGetFirmwareType")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesExGetFirmwareType(): Int

public actual fun exGetFirmwareType(): FirmwareType =
    wasiWindowssysWindowsWdkSystemSystemservicesExGetFirmwareType().toInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesExGetPreviousMode")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesExGetPreviousMode(): Int

public actual fun exGetPreviousMode(): Byte =
    wasiWindowssysWindowsWdkSystemSystemservicesExGetPreviousMode().toByte()

public actual fun exGetSharedWaiterCount(resource: ConstPtr<Eresource>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExGetSharedWaiterCount")

public actual fun exGetSystemFirmwareTable(firmwaretableprovidersignature: UInt, firmwaretableid: UInt, firmwaretablebuffer: MutPtr<CVoid>, bufferlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExGetSystemFirmwareTable")

public actual fun exInitializePushLock(pushlock: MutPtr<ULong>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExInitializePushLock")

public actual fun exInitializeResourceLite(resource: MutPtr<Eresource>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExInitializeResourceLite")

public actual fun exInitializeRundownProtection(runref: MutPtr<ExRundownRef>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExInitializeRundownProtection")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesExInitializeRundownProtectionCacheAware")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesExInitializeRundownProtectionCacheAware(runrefcacheaware: Long, runrefsize: Long): Unit

public actual fun exInitializeRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware, runrefsize: ULong): Unit =
    wasiWindowssysWindowsWdkSystemSystemservicesExInitializeRundownProtectionCacheAware(runrefcacheaware, runrefsize.toLong())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesExInitializeRundownProtectionCacheAwareEx")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesExInitializeRundownProtectionCacheAwareEx(runrefcacheaware: Long, flags: Int): Unit

public actual fun exInitializeRundownProtectionCacheAwareEx(runrefcacheaware: PexRundownRefCacheAware, flags: UInt): Unit =
    wasiWindowssysWindowsWdkSystemSystemservicesExInitializeRundownProtectionCacheAwareEx(runrefcacheaware, flags.toInt())

public actual fun exInitializeZone(zone: MutPtr<ZoneHeader>, blocksize: UInt, initialsegment: MutPtr<CVoid>, initialsegmentsize: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExInitializeZone")

public actual fun exInterlockedAddLargeInteger(addend: MutPtr<Long>, increment: Long, lock: MutPtr<ULong>): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExInterlockedAddLargeInteger")

public actual fun exInterlockedExtendZone(zone: MutPtr<ZoneHeader>, segment: MutPtr<CVoid>, segmentsize: UInt, lock: MutPtr<ULong>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExInterlockedExtendZone")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesExIsManufacturingModeEnabled")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesExIsManufacturingModeEnabled(): Int

public actual fun exIsManufacturingModeEnabled(): Boolean =
    (wasiWindowssysWindowsWdkSystemSystemservicesExIsManufacturingModeEnabled() != 0)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesExIsProcessorFeaturePresent")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesExIsProcessorFeaturePresent(processorfeature: Int): Int

public actual fun exIsProcessorFeaturePresent(processorfeature: UInt): Boolean =
    (wasiWindowssysWindowsWdkSystemSystemservicesExIsProcessorFeaturePresent(processorfeature.toInt()) != 0)

public actual fun exIsResourceAcquiredExclusiveLite(resource: ConstPtr<Eresource>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExIsResourceAcquiredExclusiveLite")

public actual fun exIsResourceAcquiredSharedLite(resource: ConstPtr<Eresource>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExIsResourceAcquiredSharedLite")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesExIsSoftBoot")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesExIsSoftBoot(): Int

public actual fun exIsSoftBoot(): Boolean =
    (wasiWindowssysWindowsWdkSystemSystemservicesExIsSoftBoot() != 0)

public actual fun exLocalTimeToSystemTime(localtime: ConstPtr<Long>, systemtime: MutPtr<Long>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExLocalTimeToSystemTime")

public actual fun exNotifyCallback(callbackobject: ConstPtr<CVoid>, argument1: ConstPtr<CVoid>, argument2: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExNotifyCallback")

public actual fun exQueryTimerResolution(maximumtime: MutPtr<UInt>, minimumtime: MutPtr<UInt>, currenttime: MutPtr<UInt>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExQueryTimerResolution")

public actual fun exQueueWorkItem(workitem: MutPtr<WorkQueueItem>, queuetype: WorkQueueType): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExQueueWorkItem")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesExRaiseAccessViolation")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesExRaiseAccessViolation(): Unit

public actual fun exRaiseAccessViolation(): Unit =
    wasiWindowssysWindowsWdkSystemSystemservicesExRaiseAccessViolation()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesExRaiseDatatypeMisalignment")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesExRaiseDatatypeMisalignment(): Unit

public actual fun exRaiseDatatypeMisalignment(): Unit =
    wasiWindowssysWindowsWdkSystemSystemservicesExRaiseDatatypeMisalignment()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesExRaiseStatus")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesExRaiseStatus(status: Int): Unit

public actual fun exRaiseStatus(status: Ntstatus): Unit =
    wasiWindowssysWindowsWdkSystemSystemservicesExRaiseStatus(status)

public actual fun exReInitializeRundownProtection(runref: MutPtr<ExRundownRef>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExReInitializeRundownProtection")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesExReInitializeRundownProtectionCacheAware")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesExReInitializeRundownProtectionCacheAware(runrefcacheaware: Long): Unit

public actual fun exReInitializeRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware): Unit =
    wasiWindowssysWindowsWdkSystemSystemservicesExReInitializeRundownProtectionCacheAware(runrefcacheaware)

public actual fun exRegisterCallback(callbackobject: PcallbackObject, callbackfunction: PcallbackFunction, callbackcontext: ConstPtr<CVoid>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExRegisterCallback")

public actual fun exReinitializeResourceLite(resource: MutPtr<Eresource>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExReinitializeResourceLite")

public actual fun exReleaseFastMutex(fastmutex: MutPtr<FastMutex>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExReleaseFastMutex")

public actual fun exReleaseFastMutexUnsafe(fastmutex: MutPtr<FastMutex>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExReleaseFastMutexUnsafe")

public actual fun exReleasePushLockExclusiveEx(pushlock: MutPtr<ULong>, flags: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExReleasePushLockExclusiveEx")

public actual fun exReleasePushLockSharedEx(pushlock: MutPtr<ULong>, flags: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExReleasePushLockSharedEx")

public actual fun exReleaseResourceAndLeaveCriticalRegion(resource: MutPtr<Eresource>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExReleaseResourceAndLeaveCriticalRegion")

public actual fun exReleaseResourceForThreadLite(resource: MutPtr<Eresource>, resourcethreadid: ULong): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExReleaseResourceForThreadLite")

public actual fun exReleaseResourceLite(resource: MutPtr<Eresource>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExReleaseResourceLite")

public actual fun exReleaseRundownProtection(runref: MutPtr<ExRundownRef>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExReleaseRundownProtection")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesExReleaseRundownProtectionCacheAware")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesExReleaseRundownProtectionCacheAware(runrefcacheaware: Long): Unit

public actual fun exReleaseRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware): Unit =
    wasiWindowssysWindowsWdkSystemSystemservicesExReleaseRundownProtectionCacheAware(runrefcacheaware)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesExReleaseRundownProtectionCacheAwareEx")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesExReleaseRundownProtectionCacheAwareEx(runref: Long, count: Int): Unit

public actual fun exReleaseRundownProtectionCacheAwareEx(runref: PexRundownRefCacheAware, count: UInt): Unit =
    wasiWindowssysWindowsWdkSystemSystemservicesExReleaseRundownProtectionCacheAwareEx(runref, count.toInt())

public actual fun exReleaseRundownProtectionEx(runref: MutPtr<ExRundownRef>, count: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExReleaseRundownProtectionEx")

public actual fun exReleaseSpinLockExclusive(spinlock: MutPtr<Int>, oldirql: UByte): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExReleaseSpinLockExclusive")

public actual fun exReleaseSpinLockExclusiveFromDpcLevel(spinlock: MutPtr<Int>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExReleaseSpinLockExclusiveFromDpcLevel")

public actual fun exReleaseSpinLockShared(spinlock: MutPtr<Int>, oldirql: UByte): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExReleaseSpinLockShared")

public actual fun exReleaseSpinLockSharedFromDpcLevel(spinlock: MutPtr<Int>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExReleaseSpinLockSharedFromDpcLevel")

public actual fun exRundownCompleted(runref: MutPtr<ExRundownRef>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExRundownCompleted")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesExRundownCompletedCacheAware")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesExRundownCompletedCacheAware(runrefcacheaware: Long): Unit

public actual fun exRundownCompletedCacheAware(runrefcacheaware: PexRundownRefCacheAware): Unit =
    wasiWindowssysWindowsWdkSystemSystemservicesExRundownCompletedCacheAware(runrefcacheaware)

public actual fun exSecurePoolUpdate(securepoolhandle: Handle, tag: UInt, allocation: ConstPtr<CVoid>, cookie: ULong, offset: ULong, size: ULong, buffer: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExSecurePoolUpdate")

public actual fun exSecurePoolValidate(securepoolhandle: Handle, tag: UInt, allocation: ConstPtr<CVoid>, cookie: ULong): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExSecurePoolValidate")

public actual fun exSetFirmwareEnvironmentVariable(variablename: ConstPtr<UnicodeString>, vendorguid: ConstPtr<Guid>, value: ConstPtr<CVoid>, valuelength: UInt, attributes: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExSetFirmwareEnvironmentVariable")

public actual fun exSetResourceOwnerPointer(resource: MutPtr<Eresource>, ownerpointer: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExSetResourceOwnerPointer")

public actual fun exSetResourceOwnerPointerEx(resource: MutPtr<Eresource>, ownerpointer: ConstPtr<CVoid>, flags: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExSetResourceOwnerPointerEx")

public actual fun exSetTimer(timer: PexTimer, duetime: Long, period: Long, parameters: ConstPtr<ExtSetParametersV0>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExSetTimer")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesExSetTimerResolution")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesExSetTimerResolution(desiredtime: Int, setresolution: Int): Int

public actual fun exSetTimerResolution(desiredtime: UInt, setresolution: Boolean): UInt =
    wasiWindowssysWindowsWdkSystemSystemservicesExSetTimerResolution(desiredtime.toInt(), if (setresolution) 1 else 0).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesExSizeOfRundownProtectionCacheAware")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesExSizeOfRundownProtectionCacheAware(): Long

public actual fun exSizeOfRundownProtectionCacheAware(): ULong =
    wasiWindowssysWindowsWdkSystemSystemservicesExSizeOfRundownProtectionCacheAware().toULong()

public actual fun exSystemTimeToLocalTime(systemtime: ConstPtr<Long>, localtime: MutPtr<Long>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExSystemTimeToLocalTime")

public actual fun exTryAcquireSpinLockExclusiveAtDpcLevel(spinlock: MutPtr<Int>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExTryAcquireSpinLockExclusiveAtDpcLevel")

public actual fun exTryAcquireSpinLockSharedAtDpcLevel(spinlock: MutPtr<Int>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExTryAcquireSpinLockSharedAtDpcLevel")

public actual fun exTryConvertSharedSpinLockExclusive(spinlock: MutPtr<Int>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExTryConvertSharedSpinLockExclusive")

public actual fun exTryToAcquireFastMutex(fastmutex: MutPtr<FastMutex>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExTryToAcquireFastMutex")

public actual fun exUnregisterCallback(callbackregistration: MutPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExUnregisterCallback")

public actual fun exUuidCreate(uuid: MutPtr<Guid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExUuidCreate")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesExVerifySuite")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesExVerifySuite(suitetype: Int): Int

public actual fun exVerifySuite(suitetype: SuiteType): Boolean =
    (wasiWindowssysWindowsWdkSystemSystemservicesExVerifySuite(suitetype) != 0)

public actual fun exWaitForRundownProtectionRelease(runref: MutPtr<ExRundownRef>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesExWaitForRundownProtectionRelease")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesExWaitForRundownProtectionReleaseCacheAware")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesExWaitForRundownProtectionReleaseCacheAware(runref: Long): Unit

public actual fun exWaitForRundownProtectionReleaseCacheAware(runref: PexRundownRefCacheAware): Unit =
    wasiWindowssysWindowsWdkSystemSystemservicesExWaitForRundownProtectionReleaseCacheAware(runref)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesFsRtlIsTotalDeviceFailure")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesFsRtlIsTotalDeviceFailure(status: Int): Int

public actual fun fsRtlIsTotalDeviceFailure(status: Ntstatus): Boolean =
    (wasiWindowssysWindowsWdkSystemSystemservicesFsRtlIsTotalDeviceFailure(status) != 0)

public actual fun halAcquireDisplayOwnership(resetdisplayparameters: PhalResetDisplayParameters): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesHalAcquireDisplayOwnership")

public actual fun halAllocateAdapterChannel(adapterobject: ConstPtr<AdapterObject>, wcb: ConstPtr<WaitContextBlock>, numberofmapregisters: UInt, executionroutine: DriverControl): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesHalAllocateAdapterChannel")

public actual fun halAllocateCommonBuffer(adapterobject: ConstPtr<AdapterObject>, length: UInt, logicaladdress: MutPtr<Long>, cacheenabled: Boolean): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesHalAllocateCommonBuffer")

public actual fun halAllocateCrashDumpRegisters(adapterobject: ConstPtr<AdapterObject>, numberofmapregisters: MutPtr<UInt>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesHalAllocateCrashDumpRegisters")

public actual fun halAllocateHardwareCounters(groupaffinty: ConstPtr<GroupAffinity>, groupcount: UInt, resourcelist: ConstPtr<PhysicalCounterResourceList>, countersethandle: MutPtr<Handle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesHalAllocateHardwareCounters")

public actual fun halAssignSlotResources(registrypath: ConstPtr<UnicodeString>, driverclassname: ConstPtr<UnicodeString>, driverobject: ConstPtr<DriverObject>, deviceobject: ConstPtr<DeviceObject>, bustype: InterfaceType, busnumber: UInt, slotnumber: UInt, allocatedresources: MutPtr<MutPtr<CmResourceList>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesHalAssignSlotResources")

public actual fun halBugCheckSystem(errorsource: ConstPtr<WheaErrorSourceDescriptor>, errorrecord: ConstPtr<WheaErrorRecord>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesHalBugCheckSystem")

public actual fun halDmaAllocateCrashDumpRegistersEx(adapter: ConstPtr<AdapterObject>, numberofmapregisters: UInt, type: HalDmaCrashDumpRegisterType, mapregisterbase: MutPtr<MutPtr<CVoid>>, mapregistersavailable: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesHalDmaAllocateCrashDumpRegistersEx")

public actual fun halDmaFreeCrashDumpRegistersEx(adapter: ConstPtr<AdapterObject>, type: HalDmaCrashDumpRegisterType): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesHalDmaFreeCrashDumpRegistersEx")

public actual fun halExamineMBR(deviceobject: ConstPtr<DeviceObject>, sectorsize: UInt, mbrtypeidentifier: UInt, buffer: MutPtr<MutPtr<CVoid>>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesHalExamineMBR")

public actual fun halFreeCommonBuffer(adapterobject: ConstPtr<AdapterObject>, length: UInt, logicaladdress: Long, virtualaddress: ConstPtr<CVoid>, cacheenabled: Boolean): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesHalFreeCommonBuffer")

public actual fun halFreeHardwareCounters(countersethandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesHalFreeHardwareCounters")

public actual fun halGetAdapter(devicedescription: ConstPtr<DeviceDescription>, numberofmapregisters: MutPtr<UInt>): MutPtr<AdapterObject> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesHalGetAdapter")

public actual fun halGetBusData(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: MutPtr<CVoid>, length: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesHalGetBusData")

public actual fun halGetBusDataByOffset(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: MutPtr<CVoid>, offset: UInt, length: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesHalGetBusDataByOffset")

public actual fun halGetInterruptVector(interfacetype: InterfaceType, busnumber: UInt, businterruptlevel: UInt, businterruptvector: UInt, irql: MutPtr<UByte>, affinity: MutPtr<ULong>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesHalGetInterruptVector")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesHalMakeBeep")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesHalMakeBeep(frequency: Int): Int

public actual fun halMakeBeep(frequency: UInt): Boolean =
    (wasiWindowssysWindowsWdkSystemSystemservicesHalMakeBeep(frequency.toInt()) != 0)

public actual fun halReadDmaCounter(adapterobject: ConstPtr<AdapterObject>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesHalReadDmaCounter")

public actual fun halSetBusData(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: ConstPtr<CVoid>, length: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesHalSetBusData")

public actual fun halSetBusDataByOffset(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: ConstPtr<CVoid>, offset: UInt, length: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesHalSetBusDataByOffset")

public actual fun halTranslateBusAddress(interfacetype: InterfaceType, busnumber: UInt, busaddress: Long, addressspace: MutPtr<UInt>, translatedaddress: MutPtr<Long>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesHalTranslateBusAddress")

public actual fun hvlRegisterWheaErrorNotification(callback: PhvlWheaErrorNotification): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesHvlRegisterWheaErrorNotification")

public actual fun hvlUnregisterWheaErrorNotification(callback: PhvlWheaErrorNotification): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesHvlUnregisterWheaErrorNotification")

public actual fun ioAcquireCancelSpinLock(irql: MutPtr<UByte>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoAcquireCancelSpinLock")

public actual fun ioAcquireKsrPersistentMemory(driverobject: ConstPtr<DriverObject>, physicaldeviceobject: ConstPtr<DeviceObject>, buffer: MutPtr<CVoid>, size: MutPtr<ULong>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoAcquireKsrPersistentMemory")

public actual fun ioAcquireKsrPersistentMemoryEx(driverobject: ConstPtr<DriverObject>, physicaldeviceobject: ConstPtr<DeviceObject>, physicaldeviceid: ConstPtr<UnicodeString>, datatag: ConstPtr<UShort>, dataversion: MutPtr<UInt>, buffer: MutPtr<CVoid>, size: MutPtr<ULong>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoAcquireKsrPersistentMemoryEx")

public actual fun ioAcquireRemoveLockEx(removelock: MutPtr<IoRemoveLock>, tag: ConstPtr<CVoid>, file: Pcstr, line: UInt, remlocksize: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoAcquireRemoveLockEx")

public actual fun ioAllocateAdapterChannel(adapterobject: ConstPtr<AdapterObject>, deviceobject: ConstPtr<DeviceObject>, numberofmapregisters: UInt, executionroutine: DriverControl, context: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoAllocateAdapterChannel")

public actual fun ioAllocateController(controllerobject: ConstPtr<ControllerObject>, deviceobject: ConstPtr<DeviceObject>, executionroutine: DriverControl, context: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoAllocateController")

public actual fun ioAllocateDriverObjectExtension(driverobject: ConstPtr<DriverObject>, clientidentificationaddress: ConstPtr<CVoid>, driverobjectextensionsize: UInt, driverobjectextension: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoAllocateDriverObjectExtension")

public actual fun ioAllocateErrorLogEntry(ioobject: ConstPtr<CVoid>, entrysize: UByte): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoAllocateErrorLogEntry")

public actual fun ioAllocateIrp(stacksize: Byte, chargequota: Boolean): MutPtr<Irp> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoAllocateIrp")

public actual fun ioAllocateIrpEx(deviceobject: ConstPtr<DeviceObject>, stacksize: Byte, chargequota: Boolean): MutPtr<Irp> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoAllocateIrpEx")

public actual fun ioAllocateMdl(virtualaddress: ConstPtr<CVoid>, length: UInt, secondarybuffer: Boolean, chargequota: Boolean, irp: MutPtr<Irp>): MutPtr<Mdl> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoAllocateMdl")

public actual fun ioAllocateSfioStreamIdentifier(fileobject: ConstPtr<FileObject>, length: UInt, signature: ConstPtr<CVoid>, streamidentifier: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoAllocateSfioStreamIdentifier")

public actual fun ioAllocateWorkItem(deviceobject: ConstPtr<DeviceObject>): PioWorkitem =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoAllocateWorkItem")

public actual fun ioAssignResources(registrypath: ConstPtr<UnicodeString>, driverclassname: ConstPtr<UnicodeString>, driverobject: ConstPtr<DriverObject>, deviceobject: ConstPtr<DeviceObject>, requestedresources: ConstPtr<IoResourceRequirementsList>, allocatedresources: MutPtr<MutPtr<CmResourceList>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoAssignResources")

public actual fun ioAttachDevice(sourcedevice: ConstPtr<DeviceObject>, targetdevice: ConstPtr<UnicodeString>, attacheddevice: MutPtr<MutPtr<DeviceObject>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoAttachDevice")

public actual fun ioAttachDeviceByPointer(sourcedevice: ConstPtr<DeviceObject>, targetdevice: ConstPtr<DeviceObject>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoAttachDeviceByPointer")

public actual fun ioAttachDeviceToDeviceStack(sourcedevice: ConstPtr<DeviceObject>, targetdevice: ConstPtr<DeviceObject>): MutPtr<DeviceObject> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoAttachDeviceToDeviceStack")

public actual fun ioAttachDeviceToDeviceStackSafe(sourcedevice: ConstPtr<DeviceObject>, targetdevice: ConstPtr<DeviceObject>, attachedtodeviceobject: MutPtr<MutPtr<DeviceObject>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoAttachDeviceToDeviceStackSafe")

public actual fun ioBuildAsynchronousFsdRequest(majorfunction: UInt, deviceobject: ConstPtr<DeviceObject>, buffer: MutPtr<CVoid>, length: UInt, startingoffset: ConstPtr<Long>, iostatusblock: ConstPtr<IoStatusBlock>): MutPtr<Irp> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoBuildAsynchronousFsdRequest")

public actual fun ioBuildDeviceIoControlRequest(iocontrolcode: UInt, deviceobject: ConstPtr<DeviceObject>, inputbuffer: ConstPtr<CVoid>, inputbufferlength: UInt, outputbuffer: MutPtr<CVoid>, outputbufferlength: UInt, internaldeviceiocontrol: Boolean, event: ConstPtr<Kevent>, iostatusblock: MutPtr<IoStatusBlock>): MutPtr<Irp> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoBuildDeviceIoControlRequest")

public actual fun ioBuildPartialMdl(sourcemdl: ConstPtr<Mdl>, targetmdl: MutPtr<Mdl>, virtualaddress: MutPtr<CVoid>, length: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoBuildPartialMdl")

public actual fun ioBuildSynchronousFsdRequest(majorfunction: UInt, deviceobject: ConstPtr<DeviceObject>, buffer: MutPtr<CVoid>, length: UInt, startingoffset: ConstPtr<Long>, event: ConstPtr<Kevent>, iostatusblock: MutPtr<IoStatusBlock>): MutPtr<Irp> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoBuildSynchronousFsdRequest")

public actual fun ioCancelFileOpen(deviceobject: ConstPtr<DeviceObject>, fileobject: ConstPtr<FileObject>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoCancelFileOpen")

public actual fun ioCancelIrp(irp: ConstPtr<Irp>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoCancelIrp")

public actual fun ioCheckLinkShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: MutPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, linkshareaccess: MutPtr<LinkShareAccess>, ioshareaccessflags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoCheckLinkShareAccess")

public actual fun ioCheckShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: MutPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, update: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoCheckShareAccess")

public actual fun ioCheckShareAccessEx(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: MutPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, update: Boolean, writepermission: ConstPtr<Boolean>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoCheckShareAccessEx")

public actual fun ioCleanupIrp(irp: MutPtr<Irp>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoCleanupIrp")

public actual fun ioClearActivityIdThread(originalid: ConstPtr<Guid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoClearActivityIdThread")

public actual fun ioClearIrpExtraCreateParameter(irp: MutPtr<Irp>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoClearIrpExtraCreateParameter")

public actual fun ioConnectInterrupt(interruptobject: MutPtr<Pkinterrupt>, serviceroutine: PkserviceRoutine, servicecontext: ConstPtr<CVoid>, spinlock: ConstPtr<ULong>, vector: UInt, irql: UByte, synchronizeirql: UByte, interruptmode: KinterruptMode, sharevector: Boolean, processorenablemask: ULong, floatingsave: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoConnectInterrupt")

public actual fun ioConnectInterruptEx(parameters: MutPtr<IoConnectInterruptParameters>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoConnectInterruptEx")

public actual fun ioCreateController(size: UInt): MutPtr<ControllerObject> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoCreateController")

public actual fun ioCreateDevice(driverobject: ConstPtr<DriverObject>, deviceextensionsize: UInt, devicename: ConstPtr<UnicodeString>, devicetype: UInt, devicecharacteristics: UInt, exclusive: Boolean, deviceobject: MutPtr<MutPtr<DeviceObject>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoCreateDevice")

public actual fun ioCreateDisk(deviceobject: ConstPtr<DeviceObject>, disk: ConstPtr<CreateDisk>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoCreateDisk")

public actual fun ioCreateFile(filehandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, allocationsize: ConstPtr<Long>, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: ConstPtr<CVoid>, ealength: UInt, createfiletype: CreateFileType, internalparameters: ConstPtr<CVoid>, options: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoCreateFile")

public actual fun ioCreateFileEx(filehandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, allocationsize: ConstPtr<Long>, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: ConstPtr<CVoid>, ealength: UInt, createfiletype: CreateFileType, internalparameters: ConstPtr<CVoid>, options: UInt, drivercontext: ConstPtr<IoDriverCreateContext>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoCreateFileEx")

public actual fun ioCreateFileSpecifyDeviceObjectHint(filehandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, allocationsize: ConstPtr<Long>, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: ConstPtr<CVoid>, ealength: UInt, createfiletype: CreateFileType, internalparameters: ConstPtr<CVoid>, options: UInt, deviceobject: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoCreateFileSpecifyDeviceObjectHint")

public actual fun ioCreateNotificationEvent(eventname: ConstPtr<UnicodeString>, eventhandle: MutPtr<Handle>): MutPtr<Kevent> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoCreateNotificationEvent")

public actual fun ioCreateSymbolicLink(symboliclinkname: ConstPtr<UnicodeString>, devicename: ConstPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoCreateSymbolicLink")

public actual fun ioCreateSynchronizationEvent(eventname: ConstPtr<UnicodeString>, eventhandle: MutPtr<Handle>): MutPtr<Kevent> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoCreateSynchronizationEvent")

public actual fun ioCreateSystemThread(ioobject: MutPtr<CVoid>, threadhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, processhandle: Handle, clientid: MutPtr<ClientId>, startroutine: PkstartRoutine, startcontext: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoCreateSystemThread")

public actual fun ioCreateUnprotectedSymbolicLink(symboliclinkname: ConstPtr<UnicodeString>, devicename: ConstPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoCreateUnprotectedSymbolicLink")

public actual fun ioCsqInitialize(csq: MutPtr<IoCsq>, csqinsertirp: PioCsqInsertIrp, csqremoveirp: PioCsqRemoveIrp, csqpeeknextirp: PioCsqPeekNextIrp, csqacquirelock: PioCsqAcquireLock, csqreleaselock: PioCsqReleaseLock, csqcompletecanceledirp: PioCsqCompleteCanceledIrp): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoCsqInitialize")

public actual fun ioCsqInitializeEx(csq: MutPtr<IoCsq>, csqinsertirp: PioCsqInsertIrpEx, csqremoveirp: PioCsqRemoveIrp, csqpeeknextirp: PioCsqPeekNextIrp, csqacquirelock: PioCsqAcquireLock, csqreleaselock: PioCsqReleaseLock, csqcompletecanceledirp: PioCsqCompleteCanceledIrp): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoCsqInitializeEx")

public actual fun ioCsqInsertIrp(csq: MutPtr<IoCsq>, irp: MutPtr<Irp>, context: MutPtr<IoCsqIrpContext>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoCsqInsertIrp")

public actual fun ioCsqInsertIrpEx(csq: MutPtr<IoCsq>, irp: MutPtr<Irp>, context: MutPtr<IoCsqIrpContext>, insertcontext: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoCsqInsertIrpEx")

public actual fun ioCsqRemoveIrp(csq: MutPtr<IoCsq>, context: MutPtr<IoCsqIrpContext>): MutPtr<Irp> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoCsqRemoveIrp")

public actual fun ioCsqRemoveNextIrp(csq: MutPtr<IoCsq>, peekcontext: ConstPtr<CVoid>): MutPtr<Irp> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoCsqRemoveNextIrp")

public actual fun ioDecrementKeepAliveCount(fileobject: MutPtr<FileObject>, process: Peprocess): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoDecrementKeepAliveCount")

public actual fun ioDeleteController(controllerobject: ConstPtr<ControllerObject>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoDeleteController")

public actual fun ioDeleteDevice(deviceobject: ConstPtr<DeviceObject>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoDeleteDevice")

public actual fun ioDeleteSymbolicLink(symboliclinkname: ConstPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoDeleteSymbolicLink")

public actual fun ioDetachDevice(targetdevice: MutPtr<DeviceObject>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoDetachDevice")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesIoDisconnectInterrupt")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesIoDisconnectInterrupt(interruptobject: Long): Unit

public actual fun ioDisconnectInterrupt(interruptobject: Pkinterrupt): Unit =
    wasiWindowssysWindowsWdkSystemSystemservicesIoDisconnectInterrupt(interruptobject)

public actual fun ioDisconnectInterruptEx(parameters: ConstPtr<IoDisconnectInterruptParameters>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoDisconnectInterruptEx")

public actual fun ioEnumerateKsrPersistentMemoryEx(driverobject: ConstPtr<DriverObject>, physicaldeviceobject: ConstPtr<DeviceObject>, physicaldeviceid: ConstPtr<UnicodeString>, callback: PioPersistedMemoryEnumerationCallback, callbackcontext: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoEnumerateKsrPersistentMemoryEx")

public actual fun ioFlushAdapterBuffers(adapterobject: ConstPtr<AdapterObject>, mdl: ConstPtr<Mdl>, mapregisterbase: ConstPtr<CVoid>, currentva: ConstPtr<CVoid>, length: UInt, writetodevice: Boolean): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoFlushAdapterBuffers")

public actual fun ioForwardIrpSynchronously(deviceobject: ConstPtr<DeviceObject>, irp: ConstPtr<Irp>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoForwardIrpSynchronously")

public actual fun ioFreeAdapterChannel(adapterobject: ConstPtr<AdapterObject>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoFreeAdapterChannel")

public actual fun ioFreeController(controllerobject: ConstPtr<ControllerObject>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoFreeController")

public actual fun ioFreeErrorLogEntry(elentry: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoFreeErrorLogEntry")

public actual fun ioFreeIrp(irp: ConstPtr<Irp>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoFreeIrp")

public actual fun ioFreeKsrPersistentMemory(datahandle: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoFreeKsrPersistentMemory")

public actual fun ioFreeMapRegisters(adapterobject: ConstPtr<AdapterObject>, mapregisterbase: ConstPtr<CVoid>, numberofmapregisters: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoFreeMapRegisters")

public actual fun ioFreeMdl(mdl: MutPtr<Mdl>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoFreeMdl")

public actual fun ioFreeSfioStreamIdentifier(fileobject: ConstPtr<FileObject>, signature: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoFreeSfioStreamIdentifier")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesIoFreeWorkItem")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesIoFreeWorkItem(ioworkitem: Long): Unit

public actual fun ioFreeWorkItem(ioworkitem: PioWorkitem): Unit =
    wasiWindowssysWindowsWdkSystemSystemservicesIoFreeWorkItem(ioworkitem)

public actual fun ioGetActivityIdIrp(irp: ConstPtr<Irp>, guid: MutPtr<Guid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoGetActivityIdIrp")

public actual fun ioGetActivityIdThread(): MutPtr<Guid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoGetActivityIdThread")

public actual fun ioGetAffinityInterrupt(interruptobject: Pkinterrupt, groupaffinity: MutPtr<GroupAffinity>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoGetAffinityInterrupt")

public actual fun ioGetAttachedDeviceReference(deviceobject: ConstPtr<DeviceObject>): MutPtr<DeviceObject> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoGetAttachedDeviceReference")

public actual fun ioGetBootDiskInformation(bootdiskinformation: MutPtr<BootdiskInformation>, size: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoGetBootDiskInformation")

public actual fun ioGetBootDiskInformationLite(bootdiskinformation: MutPtr<MutPtr<BootdiskInformationLite>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoGetBootDiskInformationLite")

public actual fun ioGetConfigurationInformation(): MutPtr<ConfigurationInformation> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoGetConfigurationInformation")

public actual fun ioGetContainerInformation(informationclass: IoContainerInformationClass, containerobject: ConstPtr<CVoid>, buffer: MutPtr<CVoid>, bufferlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoGetContainerInformation")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesIoGetCurrentProcess")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesIoGetCurrentProcess(): Long

public actual fun ioGetCurrentProcess(): Peprocess =
    wasiWindowssysWindowsWdkSystemSystemservicesIoGetCurrentProcess().toLong()

public actual fun ioGetDeviceDirectory(physicaldeviceobject: ConstPtr<DeviceObject>, directorytype: DeviceDirectoryType, flags: UInt, reserved: ConstPtr<CVoid>, devicedirectoryhandle: MutPtr<Handle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoGetDeviceDirectory")

public actual fun ioGetDeviceInterfaceAlias(symboliclinkname: ConstPtr<UnicodeString>, aliasinterfaceclassguid: ConstPtr<Guid>, aliassymboliclinkname: MutPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoGetDeviceInterfaceAlias")

public actual fun ioGetDeviceInterfacePropertyData(symboliclinkname: ConstPtr<UnicodeString>, propertykey: ConstPtr<Devpropkey>, lcid: UInt, flags: UInt, size: UInt, data: MutPtr<CVoid>, requiredsize: MutPtr<UInt>, type: MutPtr<Devproptype>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoGetDeviceInterfacePropertyData")

public actual fun ioGetDeviceInterfaces(interfaceclassguid: ConstPtr<Guid>, physicaldeviceobject: ConstPtr<DeviceObject>, flags: UInt, symboliclinklist: MutPtr<Pwstr>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoGetDeviceInterfaces")

public actual fun ioGetDeviceNumaNode(pdo: ConstPtr<DeviceObject>, nodenumber: MutPtr<UShort>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoGetDeviceNumaNode")

public actual fun ioGetDeviceObjectPointer(objectname: ConstPtr<UnicodeString>, desiredaccess: UInt, fileobject: MutPtr<MutPtr<FileObject>>, deviceobject: MutPtr<MutPtr<DeviceObject>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoGetDeviceObjectPointer")

public actual fun ioGetDeviceProperty(deviceobject: ConstPtr<DeviceObject>, deviceproperty: DeviceRegistryProperty, bufferlength: UInt, propertybuffer: MutPtr<CVoid>, resultlength: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoGetDeviceProperty")

public actual fun ioGetDevicePropertyData(pdo: ConstPtr<DeviceObject>, propertykey: ConstPtr<Devpropkey>, lcid: UInt, flags: UInt, size: UInt, data: MutPtr<CVoid>, requiredsize: MutPtr<UInt>, type: MutPtr<Devproptype>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoGetDevicePropertyData")

public actual fun ioGetDmaAdapter(physicaldeviceobject: ConstPtr<DeviceObject>, devicedescription: ConstPtr<DeviceDescription>, numberofmapregisters: MutPtr<UInt>): MutPtr<DmaAdapter> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoGetDmaAdapter")

public actual fun ioGetDriverDirectory(driverobject: ConstPtr<DriverObject>, directorytype: DriverDirectoryType, flags: UInt, driverdirectoryhandle: MutPtr<Handle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoGetDriverDirectory")

public actual fun ioGetDriverObjectExtension(driverobject: ConstPtr<DriverObject>, clientidentificationaddress: ConstPtr<CVoid>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoGetDriverObjectExtension")

public actual fun ioGetFileObjectGenericMapping(): MutPtr<GenericMapping> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoGetFileObjectGenericMapping")

public actual fun ioGetFsZeroingOffset(irp: ConstPtr<Irp>, zeroingoffset: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoGetFsZeroingOffset")

public actual fun ioGetInitialStack(): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoGetInitialStack")

public actual fun ioGetInitiatorProcess(fileobject: ConstPtr<FileObject>): Peprocess =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoGetInitiatorProcess")

public actual fun ioGetIoAttributionHandle(irp: ConstPtr<Irp>, ioattributionhandle: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoGetIoAttributionHandle")

public actual fun ioGetIoPriorityHint(irp: ConstPtr<Irp>): IoPriorityHint =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoGetIoPriorityHint")

public actual fun ioGetIommuInterface(version: UInt, interfaceout: MutPtr<DmaIommuInterface>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoGetIommuInterface")

public actual fun ioGetIommuInterfaceEx(version: UInt, flags: ULong, interfaceout: MutPtr<DmaIommuInterfaceEx>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoGetIommuInterfaceEx")

public actual fun ioGetIrpExtraCreateParameter(irp: ConstPtr<Irp>, extracreateparameter: MutPtr<MutPtr<Long>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoGetIrpExtraCreateParameter")

public actual fun ioGetPagingIoPriority(irp: ConstPtr<Irp>): IoPagingPriority =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoGetPagingIoPriority")

public actual fun ioGetRelatedDeviceObject(fileobject: ConstPtr<FileObject>): MutPtr<DeviceObject> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoGetRelatedDeviceObject")

public actual fun ioGetSfioStreamIdentifier(fileobject: ConstPtr<FileObject>, signature: ConstPtr<CVoid>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoGetSfioStreamIdentifier")

public actual fun ioGetSilo(fileobject: ConstPtr<FileObject>): Pesilo =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoGetSilo")

public actual fun ioGetSiloParameters(fileobject: ConstPtr<FileObject>): MutPtr<IoFoextSiloParameters> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoGetSiloParameters")

public actual fun ioGetStackLimits(lowlimit: MutPtr<ULong>, highlimit: MutPtr<ULong>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoGetStackLimits")

public actual fun ioGetTopLevelIrp(): MutPtr<Irp> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoGetTopLevelIrp")

public actual fun ioGetTransactionParameterBlock(fileobject: ConstPtr<FileObject>): MutPtr<TxnParameterBlock> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoGetTransactionParameterBlock")

public actual fun ioIncrementKeepAliveCount(fileobject: MutPtr<FileObject>, process: Peprocess): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoIncrementKeepAliveCount")

public actual fun ioInitializeIrp(irp: MutPtr<Irp>, packetsize: UShort, stacksize: Byte): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoInitializeIrp")

public actual fun ioInitializeIrpEx(irp: MutPtr<Irp>, deviceobject: ConstPtr<DeviceObject>, packetsize: UShort, stacksize: Byte): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoInitializeIrpEx")

public actual fun ioInitializeRemoveLockEx(lock: MutPtr<IoRemoveLock>, allocatetag: UInt, maxlockedminutes: UInt, highwatermark: UInt, remlocksize: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoInitializeRemoveLockEx")

public actual fun ioInitializeTimer(deviceobject: ConstPtr<DeviceObject>, timerroutine: PioTimerRoutine, context: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoInitializeTimer")

public actual fun ioInitializeWorkItem(ioobject: ConstPtr<CVoid>, ioworkitem: PioWorkitem): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoInitializeWorkItem")

public actual fun ioInvalidateDeviceRelations(deviceobject: ConstPtr<DeviceObject>, type: DeviceRelationType): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoInvalidateDeviceRelations")

public actual fun ioInvalidateDeviceState(physicaldeviceobject: ConstPtr<DeviceObject>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoInvalidateDeviceState")

public actual fun ioIs32bitProcess(irp: ConstPtr<Irp>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoIs32bitProcess")

public actual fun ioIsFileObjectIgnoringSharing(fileobject: ConstPtr<FileObject>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoIsFileObjectIgnoringSharing")

public actual fun ioIsFileOriginRemote(fileobject: ConstPtr<FileObject>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoIsFileOriginRemote")

public actual fun ioIsInitiator32bitProcess(irp: ConstPtr<Irp>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoIsInitiator32bitProcess")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesIoIsValidIrpStatus")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesIoIsValidIrpStatus(status: Int): Int

public actual fun ioIsValidIrpStatus(status: Ntstatus): UInt =
    wasiWindowssysWindowsWdkSystemSystemservicesIoIsValidIrpStatus(status).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesIoIsWdmVersionAvailable")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesIoIsWdmVersionAvailable(majorversion: Int, minorversion: Int): Int

public actual fun ioIsWdmVersionAvailable(majorversion: UByte, minorversion: UByte): Boolean =
    (wasiWindowssysWindowsWdkSystemSystemservicesIoIsWdmVersionAvailable(majorversion.toInt(), minorversion.toInt()) != 0)

public actual fun ioMakeAssociatedIrp(irp: ConstPtr<Irp>, stacksize: Byte): MutPtr<Irp> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoMakeAssociatedIrp")

public actual fun ioMakeAssociatedIrpEx(irp: ConstPtr<Irp>, deviceobject: ConstPtr<DeviceObject>, stacksize: Byte): MutPtr<Irp> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoMakeAssociatedIrpEx")

public actual fun ioMapTransfer(adapterobject: ConstPtr<AdapterObject>, mdl: ConstPtr<Mdl>, mapregisterbase: ConstPtr<CVoid>, currentva: ConstPtr<CVoid>, length: MutPtr<UInt>, writetodevice: Boolean): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoMapTransfer")

public actual fun ioOpenDeviceInterfaceRegistryKey(symboliclinkname: ConstPtr<UnicodeString>, desiredaccess: UInt, deviceinterfaceregkey: MutPtr<Handle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoOpenDeviceInterfaceRegistryKey")

public actual fun ioOpenDeviceRegistryKey(deviceobject: ConstPtr<DeviceObject>, devinstkeytype: UInt, desiredaccess: UInt, deviceregkey: MutPtr<Handle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoOpenDeviceRegistryKey")

public actual fun ioOpenDriverRegistryKey(driverobject: ConstPtr<DriverObject>, regkeytype: DriverRegkeyType, desiredaccess: UInt, flags: UInt, driverregkey: MutPtr<Handle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoOpenDriverRegistryKey")

public actual fun ioPropagateActivityIdToThread(irp: ConstPtr<Irp>, propagatedid: MutPtr<Guid>, originalid: MutPtr<MutPtr<Guid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoPropagateActivityIdToThread")

public actual fun ioQueryDeviceDescription(bustype: ConstPtr<InterfaceType>, busnumber: ConstPtr<UInt>, controllertype: ConstPtr<ConfigurationType>, controllernumber: ConstPtr<UInt>, peripheraltype: ConstPtr<ConfigurationType>, peripheralnumber: ConstPtr<UInt>, calloutroutine: PioQueryDeviceRoutine, context: MutPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoQueryDeviceDescription")

public actual fun ioQueryFullDriverPath(driverobject: ConstPtr<DriverObject>, fullpath: MutPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoQueryFullDriverPath")

public actual fun ioQueryInformationByName(objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass, options: UInt, drivercontext: ConstPtr<IoDriverCreateContext>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoQueryInformationByName")

public actual fun ioQueryKsrPersistentMemorySize(driverobject: ConstPtr<DriverObject>, physicaldeviceobject: ConstPtr<DeviceObject>, buffersize: MutPtr<ULong>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoQueryKsrPersistentMemorySize")

public actual fun ioQueryKsrPersistentMemorySizeEx(driverobject: ConstPtr<DriverObject>, physicaldeviceobject: ConstPtr<DeviceObject>, physicaldeviceid: ConstPtr<UnicodeString>, datatag: ConstPtr<UShort>, dataversion: MutPtr<UInt>, buffersize: MutPtr<ULong>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoQueryKsrPersistentMemorySizeEx")

public actual fun ioQueueWorkItem(ioworkitem: PioWorkitem, workerroutine: PioWorkitemRoutine, queuetype: WorkQueueType, context: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoQueueWorkItem")

public actual fun ioQueueWorkItemEx(ioworkitem: PioWorkitem, workerroutine: PioWorkitemRoutineEx, queuetype: WorkQueueType, context: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoQueueWorkItemEx")

public actual fun ioRaiseHardError(irp: ConstPtr<Irp>, vpb: ConstPtr<Vpb>, realdeviceobject: ConstPtr<DeviceObject>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoRaiseHardError")

public actual fun ioRaiseInformationalHardError(errorstatus: Ntstatus, string: ConstPtr<UnicodeString>, thread: Pkthread): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoRaiseInformationalHardError")

public actual fun ioReadDiskSignature(deviceobject: ConstPtr<DeviceObject>, bytespersector: UInt, signature: MutPtr<DiskSignature>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoReadDiskSignature")

public actual fun ioReadPartitionTable(deviceobject: ConstPtr<DeviceObject>, sectorsize: UInt, returnrecognizedpartitions: Boolean, partitionbuffer: MutPtr<MutPtr<DriveLayoutInformation>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoReadPartitionTable")

public actual fun ioReadPartitionTableEx(deviceobject: ConstPtr<DeviceObject>, drivelayout: MutPtr<MutPtr<DriveLayoutInformationEx>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoReadPartitionTableEx")

public actual fun ioRecordIoAttribution(opaquehandle: MutPtr<CVoid>, attributioninformation: ConstPtr<IoAttributionInformation>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoRecordIoAttribution")

public actual fun ioRegisterBootDriverCallback(callbackfunction: PbootDriverCallbackFunction, callbackcontext: ConstPtr<CVoid>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoRegisterBootDriverCallback")

public actual fun ioRegisterBootDriverReinitialization(driverobject: ConstPtr<DriverObject>, driverreinitializationroutine: DriverReinitialize, context: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoRegisterBootDriverReinitialization")

public actual fun ioRegisterContainerNotification(notificationclass: IoContainerNotificationClass, callbackfunction: PioContainerNotificationFunction, notificationinformation: ConstPtr<CVoid>, notificationinformationlength: UInt, callbackregistration: MutPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoRegisterContainerNotification")

public actual fun ioRegisterDeviceInterface(physicaldeviceobject: ConstPtr<DeviceObject>, interfaceclassguid: ConstPtr<Guid>, referencestring: ConstPtr<UnicodeString>, symboliclinkname: MutPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoRegisterDeviceInterface")

public actual fun ioRegisterDriverReinitialization(driverobject: ConstPtr<DriverObject>, driverreinitializationroutine: DriverReinitialize, context: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoRegisterDriverReinitialization")

public actual fun ioRegisterLastChanceShutdownNotification(deviceobject: ConstPtr<DeviceObject>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoRegisterLastChanceShutdownNotification")

public actual fun ioRegisterPlugPlayNotification(eventcategory: IoNotificationEventCategory, eventcategoryflags: UInt, eventcategorydata: ConstPtr<CVoid>, driverobject: ConstPtr<DriverObject>, callbackroutine: DriverNotificationCallbackRoutine, context: MutPtr<CVoid>, notificationentry: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoRegisterPlugPlayNotification")

public actual fun ioRegisterShutdownNotification(deviceobject: ConstPtr<DeviceObject>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoRegisterShutdownNotification")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesIoReleaseCancelSpinLock")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesIoReleaseCancelSpinLock(irql: Int): Unit

public actual fun ioReleaseCancelSpinLock(irql: UByte): Unit =
    wasiWindowssysWindowsWdkSystemSystemservicesIoReleaseCancelSpinLock(irql.toInt())

public actual fun ioReleaseRemoveLockAndWaitEx(removelock: MutPtr<IoRemoveLock>, tag: ConstPtr<CVoid>, remlocksize: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoReleaseRemoveLockAndWaitEx")

public actual fun ioReleaseRemoveLockEx(removelock: MutPtr<IoRemoveLock>, tag: ConstPtr<CVoid>, remlocksize: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoReleaseRemoveLockEx")

public actual fun ioRemoveLinkShareAccess(fileobject: ConstPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, linkshareaccess: MutPtr<LinkShareAccess>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoRemoveLinkShareAccess")

public actual fun ioRemoveLinkShareAccessEx(fileobject: ConstPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, linkshareaccess: MutPtr<LinkShareAccess>, ioshareaccessflags: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoRemoveLinkShareAccessEx")

public actual fun ioRemoveShareAccess(fileobject: ConstPtr<FileObject>, shareaccess: MutPtr<ShareAccess>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoRemoveShareAccess")

public actual fun ioReplacePartitionUnit(targetpdo: ConstPtr<DeviceObject>, sparepdo: ConstPtr<DeviceObject>, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoReplacePartitionUnit")

public actual fun ioReportDetectedDevice(driverobject: ConstPtr<DriverObject>, legacybustype: InterfaceType, busnumber: UInt, slotnumber: UInt, resourcelist: ConstPtr<CmResourceList>, resourcerequirements: ConstPtr<IoResourceRequirementsList>, resourceassigned: Boolean, deviceobject: MutPtr<MutPtr<DeviceObject>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoReportDetectedDevice")

public actual fun ioReportInterruptActive(parameters: ConstPtr<IoReportInterruptActiveStateParameters>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoReportInterruptActive")

public actual fun ioReportInterruptInactive(parameters: ConstPtr<IoReportInterruptActiveStateParameters>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoReportInterruptInactive")

public actual fun ioReportResourceForDetection(driverobject: ConstPtr<DriverObject>, driverlist: ConstPtr<CmResourceList>, driverlistsize: UInt, deviceobject: ConstPtr<DeviceObject>, devicelist: ConstPtr<CmResourceList>, devicelistsize: UInt, conflictdetected: MutPtr<Boolean>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoReportResourceForDetection")

public actual fun ioReportResourceUsage(driverclassname: ConstPtr<UnicodeString>, driverobject: ConstPtr<DriverObject>, driverlist: ConstPtr<CmResourceList>, driverlistsize: UInt, deviceobject: ConstPtr<DeviceObject>, devicelist: ConstPtr<CmResourceList>, devicelistsize: UInt, overrideconflict: Boolean, conflictdetected: MutPtr<Boolean>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoReportResourceUsage")

public actual fun ioReportRootDevice(driverobject: ConstPtr<DriverObject>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoReportRootDevice")

public actual fun ioReportTargetDeviceChange(physicaldeviceobject: ConstPtr<DeviceObject>, notificationstructure: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoReportTargetDeviceChange")

public actual fun ioReportTargetDeviceChangeAsynchronous(physicaldeviceobject: ConstPtr<DeviceObject>, notificationstructure: ConstPtr<CVoid>, callback: PdeviceChangeCompleteCallback, context: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoReportTargetDeviceChangeAsynchronous")

public actual fun ioRequestDeviceEject(physicaldeviceobject: ConstPtr<DeviceObject>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoRequestDeviceEject")

public actual fun ioRequestDeviceEjectEx(physicaldeviceobject: ConstPtr<DeviceObject>, callback: PioDeviceEjectCallback, context: ConstPtr<CVoid>, driverobject: ConstPtr<DriverObject>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoRequestDeviceEjectEx")

public actual fun ioReserveKsrPersistentMemory(driverobject: ConstPtr<DriverObject>, physicaldeviceobject: ConstPtr<DeviceObject>, size: ULong, flags: UInt, datahandle: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoReserveKsrPersistentMemory")

public actual fun ioReserveKsrPersistentMemoryEx(driverobject: ConstPtr<DriverObject>, physicaldeviceobject: ConstPtr<DeviceObject>, physicaldeviceid: ConstPtr<UnicodeString>, datatag: ConstPtr<UShort>, dataversion: UInt, size: ULong, flags: UInt, datahandle: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoReserveKsrPersistentMemoryEx")

public actual fun ioReuseIrp(irp: MutPtr<Irp>, iostatus: Ntstatus): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoReuseIrp")

public actual fun ioSetActivityIdIrp(irp: MutPtr<Irp>, guid: ConstPtr<Guid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoSetActivityIdIrp")

public actual fun ioSetActivityIdThread(activityid: ConstPtr<Guid>): MutPtr<Guid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoSetActivityIdThread")

public actual fun ioSetCompletionRoutineEx(deviceobject: ConstPtr<DeviceObject>, irp: ConstPtr<Irp>, completionroutine: PioCompletionRoutine, context: ConstPtr<CVoid>, invokeonsuccess: Boolean, invokeonerror: Boolean, invokeoncancel: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoSetCompletionRoutineEx")

public actual fun ioSetDeviceInterfacePropertyData(symboliclinkname: ConstPtr<UnicodeString>, propertykey: ConstPtr<Devpropkey>, lcid: UInt, flags: UInt, type: UInt, size: UInt, data: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoSetDeviceInterfacePropertyData")

public actual fun ioSetDeviceInterfaceState(symboliclinkname: ConstPtr<UnicodeString>, enable: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoSetDeviceInterfaceState")

public actual fun ioSetDevicePropertyData(pdo: ConstPtr<DeviceObject>, propertykey: ConstPtr<Devpropkey>, lcid: UInt, flags: UInt, type: UInt, size: UInt, data: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoSetDevicePropertyData")

public actual fun ioSetFileObjectIgnoreSharing(fileobject: ConstPtr<FileObject>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoSetFileObjectIgnoreSharing")

public actual fun ioSetFileOrigin(fileobject: ConstPtr<FileObject>, remote: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoSetFileOrigin")

public actual fun ioSetFsZeroingOffset(irp: MutPtr<Irp>, zeroingoffset: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoSetFsZeroingOffset")

public actual fun ioSetFsZeroingOffsetRequired(irp: MutPtr<Irp>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoSetFsZeroingOffsetRequired")

public actual fun ioSetHardErrorOrVerifyDevice(irp: ConstPtr<Irp>, deviceobject: ConstPtr<DeviceObject>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoSetHardErrorOrVerifyDevice")

public actual fun ioSetIoAttributionIrp(irp: MutPtr<Irp>, attributionsource: ConstPtr<CVoid>, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoSetIoAttributionIrp")

public actual fun ioSetIoPriorityHint(irp: ConstPtr<Irp>, priorityhint: IoPriorityHint): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoSetIoPriorityHint")

public actual fun ioSetIrpExtraCreateParameter(irp: MutPtr<Irp>, extracreateparameter: ConstPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoSetIrpExtraCreateParameter")

public actual fun ioSetLinkShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: MutPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, linkshareaccess: MutPtr<LinkShareAccess>, ioshareaccessflags: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoSetLinkShareAccess")

public actual fun ioSetMasterIrpStatus(masterirp: MutPtr<Irp>, status: Ntstatus): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoSetMasterIrpStatus")

public actual fun ioSetPartitionInformation(deviceobject: ConstPtr<DeviceObject>, sectorsize: UInt, partitionnumber: UInt, partitiontype: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoSetPartitionInformation")

public actual fun ioSetPartitionInformationEx(deviceobject: ConstPtr<DeviceObject>, partitionnumber: UInt, partitioninfo: ConstPtr<SetPartitionInformationEx>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoSetPartitionInformationEx")

public actual fun ioSetShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: MutPtr<FileObject>, shareaccess: MutPtr<ShareAccess>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoSetShareAccess")

public actual fun ioSetShareAccessEx(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: MutPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, writepermission: ConstPtr<Boolean>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoSetShareAccessEx")

public actual fun ioSetStartIoAttributes(deviceobject: ConstPtr<DeviceObject>, deferredstartio: Boolean, noncancelable: Boolean): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoSetStartIoAttributes")

public actual fun ioSetSystemPartition(volumenamestring: ConstPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoSetSystemPartition")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesIoSetThreadHardErrorMode")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesIoSetThreadHardErrorMode(enableharderrors: Int): Int

public actual fun ioSetThreadHardErrorMode(enableharderrors: Boolean): Boolean =
    (wasiWindowssysWindowsWdkSystemSystemservicesIoSetThreadHardErrorMode(if (enableharderrors) 1 else 0) != 0)

public actual fun ioSetTopLevelIrp(irp: ConstPtr<Irp>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoSetTopLevelIrp")

public actual fun ioSizeOfIrpEx(deviceobject: ConstPtr<DeviceObject>, stacksize: Byte): UShort =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoSizeOfIrpEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesIoSizeofWorkItem")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesIoSizeofWorkItem(): Int

public actual fun ioSizeofWorkItem(): UInt =
    wasiWindowssysWindowsWdkSystemSystemservicesIoSizeofWorkItem().toUInt()

public actual fun ioStartNextPacket(deviceobject: ConstPtr<DeviceObject>, cancelable: Boolean): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoStartNextPacket")

public actual fun ioStartNextPacketByKey(deviceobject: ConstPtr<DeviceObject>, cancelable: Boolean, key: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoStartNextPacketByKey")

public actual fun ioStartPacket(deviceobject: ConstPtr<DeviceObject>, irp: ConstPtr<Irp>, key: ConstPtr<UInt>, cancelfunction: DriverCancel): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoStartPacket")

public actual fun ioStartTimer(deviceobject: ConstPtr<DeviceObject>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoStartTimer")

public actual fun ioStopTimer(deviceobject: ConstPtr<DeviceObject>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoStopTimer")

public actual fun ioSynchronousCallDriver(deviceobject: ConstPtr<DeviceObject>, irp: ConstPtr<Irp>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoSynchronousCallDriver")

public actual fun ioTransferActivityId(activityid: ConstPtr<Guid>, relatedactivityid: ConstPtr<Guid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoTransferActivityId")

public actual fun ioTranslateBusAddress(interfacetype: InterfaceType, busnumber: UInt, busaddress: Long, addressspace: MutPtr<UInt>, translatedaddress: MutPtr<Long>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoTranslateBusAddress")

public actual fun ioTryQueueWorkItem(ioworkitem: PioWorkitem, workerroutine: PioWorkitemRoutineEx, queuetype: WorkQueueType, context: ConstPtr<CVoid>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoTryQueueWorkItem")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesIoUninitializeWorkItem")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesIoUninitializeWorkItem(ioworkitem: Long): Unit

public actual fun ioUninitializeWorkItem(ioworkitem: PioWorkitem): Unit =
    wasiWindowssysWindowsWdkSystemSystemservicesIoUninitializeWorkItem(ioworkitem)

public actual fun ioUnregisterBootDriverCallback(callbackhandle: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoUnregisterBootDriverCallback")

public actual fun ioUnregisterContainerNotification(callbackregistration: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoUnregisterContainerNotification")

public actual fun ioUnregisterPlugPlayNotification(notificationentry: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoUnregisterPlugPlayNotification")

public actual fun ioUnregisterPlugPlayNotificationEx(notificationentry: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoUnregisterPlugPlayNotificationEx")

public actual fun ioUnregisterShutdownNotification(deviceobject: ConstPtr<DeviceObject>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoUnregisterShutdownNotification")

public actual fun ioUpdateLinkShareAccess(fileobject: ConstPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, linkshareaccess: MutPtr<LinkShareAccess>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoUpdateLinkShareAccess")

public actual fun ioUpdateLinkShareAccessEx(fileobject: ConstPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, linkshareaccess: MutPtr<LinkShareAccess>, ioshareaccessflags: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoUpdateLinkShareAccessEx")

public actual fun ioUpdateShareAccess(fileobject: ConstPtr<FileObject>, shareaccess: MutPtr<ShareAccess>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoUpdateShareAccess")

public actual fun ioValidateDeviceIoControlAccess(irp: ConstPtr<Irp>, requiredaccess: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoValidateDeviceIoControlAccess")

public actual fun ioVerifyPartitionTable(deviceobject: ConstPtr<DeviceObject>, fixerrors: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoVerifyPartitionTable")

public actual fun ioVolumeDeviceNameToGuid(volumedevicename: ConstPtr<UnicodeString>, guid: MutPtr<Guid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoVolumeDeviceNameToGuid")

public actual fun ioVolumeDeviceNameToGuidPath(volumedevicename: ConstPtr<UnicodeString>, guidpath: MutPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoVolumeDeviceNameToGuidPath")

public actual fun ioVolumeDeviceToDosName(volumedeviceobject: ConstPtr<CVoid>, dosname: MutPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoVolumeDeviceToDosName")

public actual fun ioVolumeDeviceToGuid(volumedeviceobject: ConstPtr<CVoid>, guid: MutPtr<Guid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoVolumeDeviceToGuid")

public actual fun ioVolumeDeviceToGuidPath(volumedeviceobject: ConstPtr<CVoid>, guidpath: MutPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoVolumeDeviceToGuidPath")

public actual fun ioWMIAllocateInstanceIds(guid: ConstPtr<Guid>, instancecount: UInt, firstinstanceid: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoWMIAllocateInstanceIds")

public actual fun ioWMIDeviceObjectToInstanceName(datablockobject: ConstPtr<CVoid>, deviceobject: ConstPtr<DeviceObject>, instancename: MutPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoWMIDeviceObjectToInstanceName")

public actual fun ioWMIExecuteMethod(datablockobject: ConstPtr<CVoid>, instancename: ConstPtr<UnicodeString>, methodid: UInt, inbuffersize: UInt, outbuffersize: MutPtr<UInt>, inoutbuffer: MutPtr<UByte>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoWMIExecuteMethod")

public actual fun ioWMIHandleToInstanceName(datablockobject: ConstPtr<CVoid>, filehandle: Handle, instancename: MutPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoWMIHandleToInstanceName")

public actual fun ioWMIOpenBlock(guid: ConstPtr<Guid>, desiredaccess: UInt, datablockobject: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoWMIOpenBlock")

public actual fun ioWMIQueryAllData(datablockobject: ConstPtr<CVoid>, inoutbuffersize: MutPtr<UInt>, outbuffer: MutPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoWMIQueryAllData")

public actual fun ioWMIQueryAllDataMultiple(datablockobjectlist: ConstPtr<ConstPtr<CVoid>>, objectcount: UInt, inoutbuffersize: MutPtr<UInt>, outbuffer: MutPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoWMIQueryAllDataMultiple")

public actual fun ioWMIQuerySingleInstance(datablockobject: ConstPtr<CVoid>, instancename: ConstPtr<UnicodeString>, inoutbuffersize: MutPtr<UInt>, outbuffer: MutPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoWMIQuerySingleInstance")

public actual fun ioWMIQuerySingleInstanceMultiple(datablockobjectlist: ConstPtr<ConstPtr<CVoid>>, instancenames: ConstPtr<UnicodeString>, objectcount: UInt, inoutbuffersize: MutPtr<UInt>, outbuffer: MutPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoWMIQuerySingleInstanceMultiple")

public actual fun ioWMIRegistrationControl(deviceobject: ConstPtr<DeviceObject>, action: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoWMIRegistrationControl")

public actual fun ioWMISetNotificationCallback(obj: MutPtr<CVoid>, callback: WmiNotificationCallback, context: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoWMISetNotificationCallback")

public actual fun ioWMISetSingleInstance(datablockobject: ConstPtr<CVoid>, instancename: ConstPtr<UnicodeString>, version: UInt, valuebuffersize: UInt, valuebuffer: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoWMISetSingleInstance")

public actual fun ioWMISetSingleItem(datablockobject: ConstPtr<CVoid>, instancename: ConstPtr<UnicodeString>, dataitemid: UInt, version: UInt, valuebuffersize: UInt, valuebuffer: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoWMISetSingleItem")

public actual fun ioWMISuggestInstanceName(physicaldeviceobject: ConstPtr<DeviceObject>, symboliclinkname: ConstPtr<UnicodeString>, combinenames: Boolean, suggestedinstancename: MutPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoWMISuggestInstanceName")

public actual fun ioWMIWriteEvent(wnodeeventitem: MutPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoWMIWriteEvent")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesIoWithinStackLimits")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesIoWithinStackLimits(regionstart: Long, regionsize: Long): Int

public actual fun ioWithinStackLimits(regionstart: ULong, regionsize: ULong): UInt =
    wasiWindowssysWindowsWdkSystemSystemservicesIoWithinStackLimits(regionstart.toLong(), regionsize.toLong()).toUInt()

public actual fun ioWriteErrorLogEntry(elentry: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoWriteErrorLogEntry")

public actual fun ioWriteKsrPersistentMemory(datahandle: ConstPtr<CVoid>, buffer: ConstPtr<CVoid>, size: ULong): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoWriteKsrPersistentMemory")

public actual fun ioWritePartitionTable(deviceobject: ConstPtr<DeviceObject>, sectorsize: UInt, sectorspertrack: UInt, numberofheads: UInt, partitionbuffer: ConstPtr<DriveLayoutInformation>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoWritePartitionTable")

public actual fun ioWritePartitionTableEx(deviceobject: ConstPtr<DeviceObject>, drivelayout: ConstPtr<DriveLayoutInformationEx>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIoWritePartitionTableEx")

public actual fun iofCallDriver(deviceobject: ConstPtr<DeviceObject>, irp: MutPtr<Irp>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIofCallDriver")

public actual fun iofCompleteRequest(irp: ConstPtr<Irp>, priorityboost: Byte): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesIofCompleteRequest")

public actual fun kdChangeOption(option: KdOption, inbufferbytes: UInt, inbuffer: ConstPtr<CVoid>, outbufferbytes: UInt, outbuffer: MutPtr<CVoid>, outbufferneeded: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKdChangeOption")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesKdDisableDebugger")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesKdDisableDebugger(): Int

public actual fun kdDisableDebugger(): Ntstatus =
    wasiWindowssysWindowsWdkSystemSystemservicesKdDisableDebugger().toInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesKdEnableDebugger")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesKdEnableDebugger(): Int

public actual fun kdEnableDebugger(): Ntstatus =
    wasiWindowssysWindowsWdkSystemSystemservicesKdEnableDebugger().toInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesKdRefreshDebuggerNotPresent")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesKdRefreshDebuggerNotPresent(): Int

public actual fun kdRefreshDebuggerNotPresent(): Boolean =
    (wasiWindowssysWindowsWdkSystemSystemservicesKdRefreshDebuggerNotPresent() != 0)

public actual fun keAcquireGuardedMutex(mutex: MutPtr<FastMutex>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeAcquireGuardedMutex")

public actual fun keAcquireGuardedMutexUnsafe(fastmutex: MutPtr<FastMutex>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeAcquireGuardedMutexUnsafe")

public actual fun keAcquireInStackQueuedSpinLock(spinlock: MutPtr<ULong>, lockhandle: MutPtr<KlockQueueHandle>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeAcquireInStackQueuedSpinLock")

public actual fun keAcquireInStackQueuedSpinLockAtDpcLevel(spinlock: MutPtr<ULong>, lockhandle: MutPtr<KlockQueueHandle>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeAcquireInStackQueuedSpinLockAtDpcLevel")

public actual fun keAcquireInStackQueuedSpinLockForDpc(spinlock: MutPtr<ULong>, lockhandle: MutPtr<KlockQueueHandle>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeAcquireInStackQueuedSpinLockForDpc")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesKeAcquireInterruptSpinLock")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesKeAcquireInterruptSpinLock(interrupt: Long): Int

public actual fun keAcquireInterruptSpinLock(interrupt: Pkinterrupt): UByte =
    wasiWindowssysWindowsWdkSystemSystemservicesKeAcquireInterruptSpinLock(interrupt).toUByte()

public actual fun keAcquireSpinLockForDpc(spinlock: MutPtr<ULong>): UByte =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeAcquireSpinLockForDpc")

public actual fun keAddTriageDumpDataBlock(ktriagedumpdataarray: MutPtr<KtriageDumpDataArray>, address: ConstPtr<CVoid>, size: ULong): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeAddTriageDumpDataBlock")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesKeAreAllApcsDisabled")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesKeAreAllApcsDisabled(): Int

public actual fun keAreAllApcsDisabled(): Boolean =
    (wasiWindowssysWindowsWdkSystemSystemservicesKeAreAllApcsDisabled() != 0)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesKeAreApcsDisabled")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesKeAreApcsDisabled(): Int

public actual fun keAreApcsDisabled(): Boolean =
    (wasiWindowssysWindowsWdkSystemSystemservicesKeAreApcsDisabled() != 0)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesKeBugCheck")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesKeBugCheck(bugcheckcode: Int): Unit

public actual fun keBugCheck(bugcheckcode: BugcheckError): Unit =
    wasiWindowssysWindowsWdkSystemSystemservicesKeBugCheck(bugcheckcode.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesKeBugCheckEx")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesKeBugCheckEx(bugcheckcode: Int, bugcheckparameter1: Long, bugcheckparameter2: Long, bugcheckparameter3: Long, bugcheckparameter4: Long): Unit

public actual fun keBugCheckEx(bugcheckcode: BugcheckError, bugcheckparameter1: ULong, bugcheckparameter2: ULong, bugcheckparameter3: ULong, bugcheckparameter4: ULong): Unit =
    wasiWindowssysWindowsWdkSystemSystemservicesKeBugCheckEx(bugcheckcode.toInt(), bugcheckparameter1.toLong(), bugcheckparameter2.toLong(), bugcheckparameter3.toLong(), bugcheckparameter4.toLong())

public actual fun keCancelTimer(param0: MutPtr<Ktimer>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeCancelTimer")

public actual fun keClearEvent(event: MutPtr<Kevent>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeClearEvent")

public actual fun keConvertAuxiliaryCounterToPerformanceCounter(auxiliarycountervalue: ULong, performancecountervalue: MutPtr<ULong>, conversionerror: MutPtr<ULong>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeConvertAuxiliaryCounterToPerformanceCounter")

public actual fun keConvertPerformanceCounterToAuxiliaryCounter(performancecountervalue: ULong, auxiliarycountervalue: MutPtr<ULong>, conversionerror: MutPtr<ULong>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeConvertPerformanceCounterToAuxiliaryCounter")

public actual fun keDelayExecutionThread(waitmode: Byte, alertable: Boolean, interval: ConstPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeDelayExecutionThread")

public actual fun keDeregisterBoundCallback(handle: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeDeregisterBoundCallback")

public actual fun keDeregisterBugCheckCallback(callbackrecord: MutPtr<KbugcheckCallbackRecord>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeDeregisterBugCheckCallback")

public actual fun keDeregisterBugCheckReasonCallback(callbackrecord: MutPtr<KbugcheckReasonCallbackRecord>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeDeregisterBugCheckReasonCallback")

public actual fun keDeregisterNmiCallback(handle: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeDeregisterNmiCallback")

public actual fun keDeregisterProcessorChangeCallback(callbackhandle: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeDeregisterProcessorChangeCallback")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesKeEnterCriticalRegion")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesKeEnterCriticalRegion(): Unit

public actual fun keEnterCriticalRegion(): Unit =
    wasiWindowssysWindowsWdkSystemSystemservicesKeEnterCriticalRegion()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesKeEnterGuardedRegion")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesKeEnterGuardedRegion(): Unit

public actual fun keEnterGuardedRegion(): Unit =
    wasiWindowssysWindowsWdkSystemSystemservicesKeEnterGuardedRegion()

public actual fun keExpandKernelStackAndCallout(callout: PexpandStackCallout, parameter: ConstPtr<CVoid>, size: ULong): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeExpandKernelStackAndCallout")

public actual fun keExpandKernelStackAndCalloutEx(callout: PexpandStackCallout, parameter: ConstPtr<CVoid>, size: ULong, wait: Boolean, context: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeExpandKernelStackAndCalloutEx")

public actual fun keFlushIoBuffers(mdl: ConstPtr<Mdl>, readoperation: Boolean, dmaoperation: Boolean): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeFlushIoBuffers")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesKeFlushQueuedDpcs")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesKeFlushQueuedDpcs(): Unit

public actual fun keFlushQueuedDpcs(): Unit =
    wasiWindowssysWindowsWdkSystemSystemservicesKeFlushQueuedDpcs()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesKeFlushWriteBuffer")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesKeFlushWriteBuffer(): Unit

public actual fun keFlushWriteBuffer(): Unit =
    wasiWindowssysWindowsWdkSystemSystemservicesKeFlushWriteBuffer()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesKeGetCurrentIrql")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesKeGetCurrentIrql(): Int

public actual fun keGetCurrentIrql(): UByte =
    wasiWindowssysWindowsWdkSystemSystemservicesKeGetCurrentIrql().toUByte()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesKeGetCurrentNodeNumber")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesKeGetCurrentNodeNumber(): Int

public actual fun keGetCurrentNodeNumber(): UShort =
    wasiWindowssysWindowsWdkSystemSystemservicesKeGetCurrentNodeNumber().toUShort()

public actual fun keGetCurrentProcessorNumberEx(procnumber: MutPtr<ProcessorNumber>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeGetCurrentProcessorNumberEx")

public actual fun keGetProcessorIndexFromNumber(procnumber: ConstPtr<ProcessorNumber>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeGetProcessorIndexFromNumber")

public actual fun keGetProcessorNumberFromIndex(procindex: UInt, procnumber: MutPtr<ProcessorNumber>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeGetProcessorNumberFromIndex")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesKeGetRecommendedSharedDataAlignment")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesKeGetRecommendedSharedDataAlignment(): Int

public actual fun keGetRecommendedSharedDataAlignment(): UInt =
    wasiWindowssysWindowsWdkSystemSystemservicesKeGetRecommendedSharedDataAlignment().toUInt()

public actual fun keInitializeCrashDumpHeader(dumptype: UInt, flags: UInt, buffer: MutPtr<CVoid>, buffersize: UInt, bufferneeded: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeInitializeCrashDumpHeader")

public actual fun keInitializeDeviceQueue(devicequeue: MutPtr<KdeviceQueue>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeInitializeDeviceQueue")

public actual fun keInitializeDpc(dpc: MutPtr<Kdpc>, deferredroutine: PkdeferredRoutine, deferredcontext: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeInitializeDpc")

public actual fun keInitializeEvent(event: MutPtr<Kevent>, type: EventType, state: Boolean): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeInitializeEvent")

public actual fun keInitializeGuardedMutex(mutex: MutPtr<FastMutex>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeInitializeGuardedMutex")

public actual fun keInitializeMutex(mutex: MutPtr<Kmutant>, level: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeInitializeMutex")

public actual fun keInitializeSemaphore(semaphore: MutPtr<Ksemaphore>, count: Int, limit: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeInitializeSemaphore")

public actual fun keInitializeSpinLock(spinlock: MutPtr<ULong>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeInitializeSpinLock")

public actual fun keInitializeThreadedDpc(dpc: MutPtr<Kdpc>, deferredroutine: PkdeferredRoutine, deferredcontext: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeInitializeThreadedDpc")

public actual fun keInitializeTimer(timer: MutPtr<Ktimer>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeInitializeTimer")

public actual fun keInitializeTimerEx(timer: MutPtr<Ktimer>, type: TimerType): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeInitializeTimerEx")

public actual fun keInitializeTriageDumpDataArray(ktriagedumpdataarray: MutPtr<KtriageDumpDataArray>, size: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeInitializeTriageDumpDataArray")

public actual fun keInsertByKeyDeviceQueue(devicequeue: MutPtr<KdeviceQueue>, devicequeueentry: MutPtr<KdeviceQueueEntry>, sortkey: UInt): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeInsertByKeyDeviceQueue")

public actual fun keInsertDeviceQueue(devicequeue: MutPtr<KdeviceQueue>, devicequeueentry: MutPtr<KdeviceQueueEntry>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeInsertDeviceQueue")

public actual fun keInsertQueueDpc(dpc: MutPtr<Kdpc>, systemargument1: ConstPtr<CVoid>, systemargument2: ConstPtr<CVoid>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeInsertQueueDpc")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesKeInvalidateAllCaches")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesKeInvalidateAllCaches(): Int

public actual fun keInvalidateAllCaches(): Boolean =
    (wasiWindowssysWindowsWdkSystemSystemservicesKeInvalidateAllCaches() != 0)

public actual fun keInvalidateRangeAllCaches(baseaddress: ConstPtr<CVoid>, length: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeInvalidateRangeAllCaches")

public actual fun keIpiGenericCall(broadcastfunction: PkipiBroadcastWorker, context: ULong): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeIpiGenericCall")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesKeIsExecutingDpc")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesKeIsExecutingDpc(): Int

public actual fun keIsExecutingDpc(): UInt =
    wasiWindowssysWindowsWdkSystemSystemservicesKeIsExecutingDpc().toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesKeLeaveCriticalRegion")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesKeLeaveCriticalRegion(): Unit

public actual fun keLeaveCriticalRegion(): Unit =
    wasiWindowssysWindowsWdkSystemSystemservicesKeLeaveCriticalRegion()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesKeLeaveGuardedRegion")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesKeLeaveGuardedRegion(): Unit

public actual fun keLeaveGuardedRegion(): Unit =
    wasiWindowssysWindowsWdkSystemSystemservicesKeLeaveGuardedRegion()

public actual fun kePulseEvent(event: MutPtr<Kevent>, increment: Int, wait: Boolean): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKePulseEvent")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesKeQueryActiveGroupCount")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesKeQueryActiveGroupCount(): Int

public actual fun keQueryActiveGroupCount(): UShort =
    wasiWindowssysWindowsWdkSystemSystemservicesKeQueryActiveGroupCount().toUShort()

public actual fun keQueryActiveProcessorCount(activeprocessors: MutPtr<ULong>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeQueryActiveProcessorCount")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesKeQueryActiveProcessorCountEx")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesKeQueryActiveProcessorCountEx(groupnumber: Int): Int

public actual fun keQueryActiveProcessorCountEx(groupnumber: UShort): UInt =
    wasiWindowssysWindowsWdkSystemSystemservicesKeQueryActiveProcessorCountEx(groupnumber.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesKeQueryActiveProcessors")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesKeQueryActiveProcessors(): Long

public actual fun keQueryActiveProcessors(): ULong =
    wasiWindowssysWindowsWdkSystemSystemservicesKeQueryActiveProcessors().toULong()

public actual fun keQueryAuxiliaryCounterFrequency(auxiliarycounterfrequency: MutPtr<ULong>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeQueryAuxiliaryCounterFrequency")

public actual fun keQueryDpcWatchdogInformation(watchdoginformation: MutPtr<KdpcWatchdogInformation>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeQueryDpcWatchdogInformation")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesKeQueryGroupAffinity")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesKeQueryGroupAffinity(groupnumber: Int): Long

public actual fun keQueryGroupAffinity(groupnumber: UShort): ULong =
    wasiWindowssysWindowsWdkSystemSystemservicesKeQueryGroupAffinity(groupnumber.toInt()).toULong()

public actual fun keQueryHardwareCounterConfiguration(counterarray: MutPtr<HardwareCounter>, maximumcount: UInt, count: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeQueryHardwareCounterConfiguration")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesKeQueryHighestNodeNumber")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesKeQueryHighestNodeNumber(): Int

public actual fun keQueryHighestNodeNumber(): UShort =
    wasiWindowssysWindowsWdkSystemSystemservicesKeQueryHighestNodeNumber().toUShort()

public actual fun keQueryInterruptTimePrecise(qpctimestamp: MutPtr<ULong>): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeQueryInterruptTimePrecise")

public actual fun keQueryLogicalProcessorRelationship(processornumber: ConstPtr<ProcessorNumber>, relationshiptype: LogicalProcessorRelationship, information: MutPtr<SystemLogicalProcessorInformationEx>, length: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeQueryLogicalProcessorRelationship")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesKeQueryMaximumGroupCount")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesKeQueryMaximumGroupCount(): Int

public actual fun keQueryMaximumGroupCount(): UShort =
    wasiWindowssysWindowsWdkSystemSystemservicesKeQueryMaximumGroupCount().toUShort()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesKeQueryMaximumProcessorCount")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesKeQueryMaximumProcessorCount(): Int

public actual fun keQueryMaximumProcessorCount(): UInt =
    wasiWindowssysWindowsWdkSystemSystemservicesKeQueryMaximumProcessorCount().toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesKeQueryMaximumProcessorCountEx")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesKeQueryMaximumProcessorCountEx(groupnumber: Int): Int

public actual fun keQueryMaximumProcessorCountEx(groupnumber: UShort): UInt =
    wasiWindowssysWindowsWdkSystemSystemservicesKeQueryMaximumProcessorCountEx(groupnumber.toInt()).toUInt()

public actual fun keQueryNodeActiveAffinity(nodenumber: UShort, affinity: MutPtr<GroupAffinity>, count: MutPtr<UShort>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeQueryNodeActiveAffinity")

public actual fun keQueryNodeActiveAffinity2(nodenumber: UShort, groupaffinities: MutPtr<GroupAffinity>, groupaffinitiescount: UShort, groupaffinitiesrequired: MutPtr<UShort>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeQueryNodeActiveAffinity2")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesKeQueryNodeActiveProcessorCount")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesKeQueryNodeActiveProcessorCount(nodenumber: Int): Int

public actual fun keQueryNodeActiveProcessorCount(nodenumber: UShort): UInt =
    wasiWindowssysWindowsWdkSystemSystemservicesKeQueryNodeActiveProcessorCount(nodenumber.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesKeQueryNodeMaximumProcessorCount")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesKeQueryNodeMaximumProcessorCount(nodenumber: Int): Int

public actual fun keQueryNodeMaximumProcessorCount(nodenumber: UShort): UShort =
    wasiWindowssysWindowsWdkSystemSystemservicesKeQueryNodeMaximumProcessorCount(nodenumber.toInt()).toUShort()

public actual fun keQueryPerformanceCounter(performancefrequency: MutPtr<Long>): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeQueryPerformanceCounter")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesKeQueryPriorityThread")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesKeQueryPriorityThread(thread: Long): Int

public actual fun keQueryPriorityThread(thread: Pkthread): Int =
    wasiWindowssysWindowsWdkSystemSystemservicesKeQueryPriorityThread(thread).toInt()

public actual fun keQueryRuntimeThread(thread: Pkthread, usertime: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeQueryRuntimeThread")

public actual fun keQuerySystemTimePrecise(currenttime: MutPtr<Long>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeQuerySystemTimePrecise")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesKeQueryTimeIncrement")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesKeQueryTimeIncrement(): Int

public actual fun keQueryTimeIncrement(): UInt =
    wasiWindowssysWindowsWdkSystemSystemservicesKeQueryTimeIncrement().toUInt()

public actual fun keQueryTotalCycleTimeThread(thread: Pkthread, cycletimestamp: MutPtr<ULong>): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeQueryTotalCycleTimeThread")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesKeQueryUnbiasedInterruptTime")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesKeQueryUnbiasedInterruptTime(): Long

public actual fun keQueryUnbiasedInterruptTime(): ULong =
    wasiWindowssysWindowsWdkSystemSystemservicesKeQueryUnbiasedInterruptTime().toULong()

public actual fun keQueryUnbiasedInterruptTimePrecise(qpctimestamp: MutPtr<ULong>): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeQueryUnbiasedInterruptTimePrecise")

public actual fun keReadStateEvent(event: ConstPtr<Kevent>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeReadStateEvent")

public actual fun keReadStateMutex(mutex: ConstPtr<Kmutant>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeReadStateMutex")

public actual fun keReadStateSemaphore(semaphore: ConstPtr<Ksemaphore>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeReadStateSemaphore")

public actual fun keReadStateTimer(timer: ConstPtr<Ktimer>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeReadStateTimer")

public actual fun keRegisterBoundCallback(callbackroutine: PboundCallback): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeRegisterBoundCallback")

public actual fun keRegisterBugCheckCallback(callbackrecord: MutPtr<KbugcheckCallbackRecord>, callbackroutine: PkbugcheckCallbackRoutine, buffer: ConstPtr<CVoid>, length: UInt, component: ConstPtr<UByte>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeRegisterBugCheckCallback")

public actual fun keRegisterBugCheckReasonCallback(callbackrecord: MutPtr<KbugcheckReasonCallbackRecord>, callbackroutine: PkbugcheckReasonCallbackRoutine, reason: KbugcheckCallbackReason, component: ConstPtr<UByte>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeRegisterBugCheckReasonCallback")

public actual fun keRegisterNmiCallback(callbackroutine: PnmiCallback, context: ConstPtr<CVoid>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeRegisterNmiCallback")

public actual fun keRegisterProcessorChangeCallback(callbackfunction: PprocessorCallbackFunction, callbackcontext: ConstPtr<CVoid>, flags: UInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeRegisterProcessorChangeCallback")

public actual fun keReleaseGuardedMutex(mutex: MutPtr<FastMutex>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeReleaseGuardedMutex")

public actual fun keReleaseGuardedMutexUnsafe(fastmutex: MutPtr<FastMutex>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeReleaseGuardedMutexUnsafe")

public actual fun keReleaseInStackQueuedSpinLock(lockhandle: ConstPtr<KlockQueueHandle>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeReleaseInStackQueuedSpinLock")

public actual fun keReleaseInStackQueuedSpinLockForDpc(lockhandle: ConstPtr<KlockQueueHandle>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeReleaseInStackQueuedSpinLockForDpc")

public actual fun keReleaseInStackQueuedSpinLockFromDpcLevel(lockhandle: ConstPtr<KlockQueueHandle>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeReleaseInStackQueuedSpinLockFromDpcLevel")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesKeReleaseInterruptSpinLock")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesKeReleaseInterruptSpinLock(interrupt: Long, oldirql: Int): Unit

public actual fun keReleaseInterruptSpinLock(interrupt: Pkinterrupt, oldirql: UByte): Unit =
    wasiWindowssysWindowsWdkSystemSystemservicesKeReleaseInterruptSpinLock(interrupt, oldirql.toInt())

public actual fun keReleaseMutex(mutex: MutPtr<Kmutant>, wait: Boolean): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeReleaseMutex")

public actual fun keReleaseSemaphore(semaphore: MutPtr<Ksemaphore>, increment: Int, adjustment: Int, wait: Boolean): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeReleaseSemaphore")

public actual fun keReleaseSpinLockForDpc(spinlock: MutPtr<ULong>, oldirql: UByte): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeReleaseSpinLockForDpc")

public actual fun keRemoveByKeyDeviceQueue(devicequeue: MutPtr<KdeviceQueue>, sortkey: UInt): MutPtr<KdeviceQueueEntry> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeRemoveByKeyDeviceQueue")

public actual fun keRemoveByKeyDeviceQueueIfBusy(devicequeue: MutPtr<KdeviceQueue>, sortkey: UInt): MutPtr<KdeviceQueueEntry> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeRemoveByKeyDeviceQueueIfBusy")

public actual fun keRemoveDeviceQueue(devicequeue: MutPtr<KdeviceQueue>): MutPtr<KdeviceQueueEntry> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeRemoveDeviceQueue")

public actual fun keRemoveEntryDeviceQueue(devicequeue: MutPtr<KdeviceQueue>, devicequeueentry: MutPtr<KdeviceQueueEntry>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeRemoveEntryDeviceQueue")

public actual fun keRemoveQueueDpc(dpc: MutPtr<Kdpc>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeRemoveQueueDpc")

public actual fun keRemoveQueueDpcEx(dpc: MutPtr<Kdpc>, waitifactive: Boolean): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeRemoveQueueDpcEx")

public actual fun keResetEvent(event: MutPtr<Kevent>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeResetEvent")

public actual fun keRestoreExtendedProcessorState(xstatesave: ConstPtr<XstateSave>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeRestoreExtendedProcessorState")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesKeRevertToUserAffinityThread")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesKeRevertToUserAffinityThread(): Unit

public actual fun keRevertToUserAffinityThread(): Unit =
    wasiWindowssysWindowsWdkSystemSystemservicesKeRevertToUserAffinityThread()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesKeRevertToUserAffinityThreadEx")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesKeRevertToUserAffinityThreadEx(affinity: Long): Unit

public actual fun keRevertToUserAffinityThreadEx(affinity: ULong): Unit =
    wasiWindowssysWindowsWdkSystemSystemservicesKeRevertToUserAffinityThreadEx(affinity.toLong())

public actual fun keRevertToUserGroupAffinityThread(previousaffinity: ConstPtr<GroupAffinity>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeRevertToUserGroupAffinityThread")

public actual fun keSaveExtendedProcessorState(mask: ULong, xstatesave: MutPtr<XstateSave>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeSaveExtendedProcessorState")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesKeSetBasePriorityThread")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesKeSetBasePriorityThread(thread: Long, increment: Int): Int

public actual fun keSetBasePriorityThread(thread: Pkthread, increment: Int): Int =
    wasiWindowssysWindowsWdkSystemSystemservicesKeSetBasePriorityThread(thread, increment).toInt()

public actual fun keSetCoalescableTimer(timer: MutPtr<Ktimer>, duetime: Long, period: UInt, tolerabledelay: UInt, dpc: ConstPtr<Kdpc>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeSetCoalescableTimer")

public actual fun keSetEvent(event: MutPtr<Kevent>, increment: Int, wait: Boolean): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeSetEvent")

public actual fun keSetHardwareCounterConfiguration(counterarray: ConstPtr<HardwareCounter>, count: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeSetHardwareCounterConfiguration")

public actual fun keSetImportanceDpc(dpc: MutPtr<Kdpc>, importance: KdpcImportance): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeSetImportanceDpc")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesKeSetPriorityThread")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesKeSetPriorityThread(thread: Long, priority: Int): Int

public actual fun keSetPriorityThread(thread: Pkthread, priority: Int): Int =
    wasiWindowssysWindowsWdkSystemSystemservicesKeSetPriorityThread(thread, priority).toInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesKeSetSystemAffinityThread")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesKeSetSystemAffinityThread(affinity: Long): Unit

public actual fun keSetSystemAffinityThread(affinity: ULong): Unit =
    wasiWindowssysWindowsWdkSystemSystemservicesKeSetSystemAffinityThread(affinity.toLong())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesKeSetSystemAffinityThreadEx")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesKeSetSystemAffinityThreadEx(affinity: Long): Long

public actual fun keSetSystemAffinityThreadEx(affinity: ULong): ULong =
    wasiWindowssysWindowsWdkSystemSystemservicesKeSetSystemAffinityThreadEx(affinity.toLong()).toULong()

public actual fun keSetSystemGroupAffinityThread(affinity: ConstPtr<GroupAffinity>, previousaffinity: MutPtr<GroupAffinity>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeSetSystemGroupAffinityThread")

public actual fun keSetTargetProcessorDpc(dpc: MutPtr<Kdpc>, number: Byte): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeSetTargetProcessorDpc")

public actual fun keSetTargetProcessorDpcEx(dpc: MutPtr<Kdpc>, procnumber: ConstPtr<ProcessorNumber>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeSetTargetProcessorDpcEx")

public actual fun keSetTimer(timer: MutPtr<Ktimer>, duetime: Long, dpc: ConstPtr<Kdpc>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeSetTimer")

public actual fun keSetTimerEx(timer: MutPtr<Ktimer>, duetime: Long, period: Int, dpc: ConstPtr<Kdpc>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeSetTimerEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesKeShouldYieldProcessor")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesKeShouldYieldProcessor(): Int

public actual fun keShouldYieldProcessor(): UInt =
    wasiWindowssysWindowsWdkSystemSystemservicesKeShouldYieldProcessor().toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesKeStallExecutionProcessor")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesKeStallExecutionProcessor(microseconds: Int): Unit

public actual fun keStallExecutionProcessor(microseconds: UInt): Unit =
    wasiWindowssysWindowsWdkSystemSystemservicesKeStallExecutionProcessor(microseconds.toInt())

public actual fun keSynchronizeExecution(interrupt: Pkinterrupt, synchronizeroutine: PksynchronizeRoutine, synchronizecontext: ConstPtr<CVoid>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeSynchronizeExecution")

public actual fun keTestSpinLock(spinlock: ConstPtr<ULong>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeTestSpinLock")

public actual fun keTryToAcquireGuardedMutex(mutex: MutPtr<FastMutex>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeTryToAcquireGuardedMutex")

public actual fun keTryToAcquireSpinLockAtDpcLevel(spinlock: MutPtr<ULong>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeTryToAcquireSpinLockAtDpcLevel")

public actual fun keWaitForMultipleObjects(count: UInt, obj: ConstPtr<ConstPtr<CVoid>>, waittype: WaitType, waitreason: KwaitReason, waitmode: Byte, alertable: Boolean, timeout: ConstPtr<Long>, waitblockarray: MutPtr<KwaitBlock>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeWaitForMultipleObjects")

public actual fun keWaitForSingleObject(obj: ConstPtr<CVoid>, waitreason: KwaitReason, waitmode: Byte, alertable: Boolean, timeout: ConstPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesKeWaitForSingleObject")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesKfRaiseIrql")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesKfRaiseIrql(newirql: Int): Int

public actual fun kfRaiseIrql(newirql: UByte): UByte =
    wasiWindowssysWindowsWdkSystemSystemservicesKfRaiseIrql(newirql.toInt()).toUByte()

public actual fun mmAddPhysicalMemory(startaddress: ConstPtr<Long>, numberofbytes: MutPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmAddPhysicalMemory")

public actual fun mmAddVerifierSpecialThunks(entryroutine: ULong, thunkbuffer: ConstPtr<CVoid>, thunkbuffersize: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmAddVerifierSpecialThunks")

public actual fun mmAddVerifierThunks(thunkbuffer: ConstPtr<CVoid>, thunkbuffersize: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmAddVerifierThunks")

public actual fun mmAdvanceMdl(mdl: MutPtr<Mdl>, numberofbytes: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmAdvanceMdl")

public actual fun mmAllocateContiguousMemory(numberofbytes: ULong, highestacceptableaddress: Long): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmAllocateContiguousMemory")

public actual fun mmAllocateContiguousMemoryEx(numberofbytes: ConstPtr<ULong>, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, preferrednode: UInt, protect: UInt, partitionobject: ConstPtr<CVoid>, tag: UInt, flags: UInt, baseaddress: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmAllocateContiguousMemoryEx")

public actual fun mmAllocateContiguousMemorySpecifyCache(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, cachetype: MemoryCachingType): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmAllocateContiguousMemorySpecifyCache")

public actual fun mmAllocateContiguousMemorySpecifyCacheNode(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, cachetype: MemoryCachingType, preferrednode: UInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmAllocateContiguousMemorySpecifyCacheNode")

public actual fun mmAllocateContiguousNodeMemory(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, protect: UInt, preferrednode: UInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmAllocateContiguousNodeMemory")

public actual fun mmAllocateMappingAddress(numberofbytes: ULong, pooltag: UInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmAllocateMappingAddress")

public actual fun mmAllocateMappingAddressEx(numberofbytes: ULong, pooltag: UInt, flags: UInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmAllocateMappingAddressEx")

public actual fun mmAllocateMdlForIoSpace(physicaladdresslist: ConstPtr<MmPhysicalAddressList>, numberofentries: ULong, newmdl: MutPtr<MutPtr<Mdl>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmAllocateMdlForIoSpace")

public actual fun mmAllocateNodePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MemoryCachingType, idealnode: UInt, flags: UInt): MutPtr<Mdl> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmAllocateNodePagesForMdlEx")

public actual fun mmAllocateNonCachedMemory(numberofbytes: ULong): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmAllocateNonCachedMemory")

public actual fun mmAllocatePagesForMdl(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong): MutPtr<Mdl> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmAllocatePagesForMdl")

public actual fun mmAllocatePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MemoryCachingType, flags: UInt): MutPtr<Mdl> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmAllocatePagesForMdlEx")

public actual fun mmAllocatePartitionNodePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MemoryCachingType, idealnode: UInt, flags: UInt, partitionobject: ConstPtr<CVoid>): MutPtr<Mdl> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmAllocatePartitionNodePagesForMdlEx")

public actual fun mmAreMdlPagesCached(memorydescriptorlist: ConstPtr<Mdl>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmAreMdlPagesCached")

public actual fun mmBuildMdlForNonPagedPool(memorydescriptorlist: MutPtr<Mdl>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmBuildMdlForNonPagedPool")

public actual fun mmCopyMemory(targetaddress: ConstPtr<CVoid>, sourceaddress: MmCopyAddress, numberofbytes: ULong, flags: UInt, numberofbytestransferred: MutPtr<ULong>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmCopyMemory")

public actual fun mmCreateMdl(memorydescriptorlist: MutPtr<Mdl>, base: ConstPtr<CVoid>, length: ULong): MutPtr<Mdl> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmCreateMdl")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesMmCreateMirror")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesMmCreateMirror(): Int

public actual fun mmCreateMirror(): Ntstatus =
    wasiWindowssysWindowsWdkSystemSystemservicesMmCreateMirror().toInt()

public actual fun mmFreeContiguousMemory(baseaddress: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmFreeContiguousMemory")

public actual fun mmFreeContiguousMemorySpecifyCache(baseaddress: ConstPtr<CVoid>, numberofbytes: ULong, cachetype: MemoryCachingType): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmFreeContiguousMemorySpecifyCache")

public actual fun mmFreeMappingAddress(baseaddress: ConstPtr<CVoid>, pooltag: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmFreeMappingAddress")

public actual fun mmFreeNonCachedMemory(baseaddress: ConstPtr<CVoid>, numberofbytes: ULong): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmFreeNonCachedMemory")

public actual fun mmFreePagesFromMdl(memorydescriptorlist: MutPtr<Mdl>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmFreePagesFromMdl")

public actual fun mmFreePagesFromMdlEx(memorydescriptorlist: MutPtr<Mdl>, flags: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmFreePagesFromMdlEx")

public actual fun mmGetCacheAttribute(physicaladdress: Long, cachetype: MutPtr<MemoryCachingType>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmGetCacheAttribute")

public actual fun mmGetCacheAttributeEx(physicaladdress: Long, flags: UInt, cachetype: MutPtr<MemoryCachingType>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmGetCacheAttributeEx")

public actual fun mmGetPhysicalAddress(baseaddress: ConstPtr<CVoid>): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmGetPhysicalAddress")

public actual fun mmGetPhysicalMemoryRanges(): MutPtr<PhysicalMemoryRange> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmGetPhysicalMemoryRanges")

public actual fun mmGetPhysicalMemoryRangesEx(partitionobject: ConstPtr<CVoid>): MutPtr<PhysicalMemoryRange> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmGetPhysicalMemoryRangesEx")

public actual fun mmGetPhysicalMemoryRangesEx2(partitionobject: ConstPtr<CVoid>, flags: UInt): MutPtr<PhysicalMemoryRange> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmGetPhysicalMemoryRangesEx2")

public actual fun mmGetSystemRoutineAddress(systemroutinename: ConstPtr<UnicodeString>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmGetSystemRoutineAddress")

public actual fun mmGetVirtualForPhysical(physicaladdress: Long): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmGetVirtualForPhysical")

public actual fun mmIsAddressValid(virtualaddress: ConstPtr<CVoid>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmIsAddressValid")

public actual fun mmIsDriverSuspectForVerifier(driverobject: ConstPtr<DriverObject>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmIsDriverSuspectForVerifier")

public actual fun mmIsDriverVerifying(driverobject: ConstPtr<DriverObject>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmIsDriverVerifying")

public actual fun mmIsDriverVerifyingByAddress(addresswithinsection: ConstPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmIsDriverVerifyingByAddress")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesMmIsIoSpaceActive")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesMmIsIoSpaceActive(startaddress: Long, numberofbytes: Long): Int

public actual fun mmIsIoSpaceActive(startaddress: Long, numberofbytes: ULong): UInt =
    wasiWindowssysWindowsWdkSystemSystemservicesMmIsIoSpaceActive(startaddress, numberofbytes.toLong()).toUInt()

public actual fun mmIsNonPagedSystemAddressValid(virtualaddress: ConstPtr<CVoid>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmIsNonPagedSystemAddressValid")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesMmIsThisAnNtAsSystem")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesMmIsThisAnNtAsSystem(): Int

public actual fun mmIsThisAnNtAsSystem(): Boolean =
    (wasiWindowssysWindowsWdkSystemSystemservicesMmIsThisAnNtAsSystem() != 0)

public actual fun mmIsVerifierEnabled(verifierflags: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmIsVerifierEnabled")

public actual fun mmLockPagableDataSection(addresswithinsection: ConstPtr<CVoid>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmLockPagableDataSection")

public actual fun mmLockPagableSectionByHandle(imagesectionhandle: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmLockPagableSectionByHandle")

public actual fun mmMapIoSpace(physicaladdress: Long, numberofbytes: ULong, cachetype: MemoryCachingType): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmMapIoSpace")

public actual fun mmMapIoSpaceEx(physicaladdress: Long, numberofbytes: ULong, protect: UInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmMapIoSpaceEx")

public actual fun mmMapLockedPages(memorydescriptorlist: MutPtr<Mdl>, accessmode: Byte): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmMapLockedPages")

public actual fun mmMapLockedPagesSpecifyCache(memorydescriptorlist: MutPtr<Mdl>, accessmode: Byte, cachetype: MemoryCachingType, requestedaddress: ConstPtr<CVoid>, bugcheckonfailure: UInt, priority: UInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmMapLockedPagesSpecifyCache")

public actual fun mmMapLockedPagesWithReservedMapping(mappingaddress: ConstPtr<CVoid>, pooltag: UInt, memorydescriptorlist: MutPtr<Mdl>, cachetype: MemoryCachingType): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmMapLockedPagesWithReservedMapping")

public actual fun mmMapMdl(memorydescriptorlist: MutPtr<Mdl>, protection: UInt, driverroutine: PmmMdlRoutine, drivercontext: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmMapMdl")

public actual fun mmMapMemoryDumpMdlEx(va: ConstPtr<CVoid>, pagetotal: UInt, memorydumpmdl: MutPtr<Mdl>, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmMapMemoryDumpMdlEx")

public actual fun mmMapUserAddressesToPage(baseaddress: ConstPtr<CVoid>, numberofbytes: ULong, pageaddress: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmMapUserAddressesToPage")

public actual fun mmMapVideoDisplay(physicaladdress: Long, numberofbytes: ULong, cachetype: MemoryCachingType): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmMapVideoDisplay")

public actual fun mmMapViewInSessionSpace(section: ConstPtr<CVoid>, mappedbase: MutPtr<MutPtr<CVoid>>, viewsize: MutPtr<ULong>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmMapViewInSessionSpace")

public actual fun mmMapViewInSessionSpaceEx(section: ConstPtr<CVoid>, mappedbase: MutPtr<MutPtr<CVoid>>, viewsize: MutPtr<ULong>, sectionoffset: MutPtr<Long>, flags: ULong): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmMapViewInSessionSpaceEx")

public actual fun mmMapViewInSystemSpace(section: ConstPtr<CVoid>, mappedbase: MutPtr<MutPtr<CVoid>>, viewsize: MutPtr<ULong>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmMapViewInSystemSpace")

public actual fun mmMapViewInSystemSpaceEx(section: ConstPtr<CVoid>, mappedbase: MutPtr<MutPtr<CVoid>>, viewsize: MutPtr<ULong>, sectionoffset: MutPtr<Long>, flags: ULong): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmMapViewInSystemSpaceEx")

public actual fun mmMdlPageContentsState(memorydescriptorlist: MutPtr<Mdl>, state: MmMdlPageContentsState): MmMdlPageContentsState =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmMdlPageContentsState")

public actual fun mmPageEntireDriver(addresswithinsection: ConstPtr<CVoid>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmPageEntireDriver")

public actual fun mmProbeAndLockPages(memorydescriptorlist: MutPtr<Mdl>, accessmode: Byte, operation: LockOperation): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmProbeAndLockPages")

public actual fun mmProbeAndLockProcessPages(memorydescriptorlist: MutPtr<Mdl>, process: Peprocess, accessmode: Byte, operation: LockOperation): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmProbeAndLockProcessPages")

public actual fun mmProbeAndLockSelectedPages(memorydescriptorlist: MutPtr<Mdl>, segmentarray: ConstPtr<FileSegmentElement>, accessmode: Byte, operation: LockOperation): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmProbeAndLockSelectedPages")

public actual fun mmProtectDriverSection(addresswithinsection: ConstPtr<CVoid>, size: ULong, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmProtectDriverSection")

public actual fun mmProtectMdlSystemAddress(memorydescriptorlist: ConstPtr<Mdl>, newprotect: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmProtectMdlSystemAddress")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesMmQuerySystemSize")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesMmQuerySystemSize(): Int

public actual fun mmQuerySystemSize(): MmSystemsize =
    wasiWindowssysWindowsWdkSystemSystemservicesMmQuerySystemSize().toInt()

public actual fun mmRemovePhysicalMemory(startaddress: ConstPtr<Long>, numberofbytes: MutPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmRemovePhysicalMemory")

public actual fun mmResetDriverPaging(addresswithinsection: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmResetDriverPaging")

public actual fun mmRotatePhysicalView(virtualaddress: ConstPtr<CVoid>, numberofbytes: MutPtr<ULong>, newmdl: ConstPtr<Mdl>, direction: MmRotateDirection, copyfunction: PmmRotateCopyCallbackFunction, context: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmRotatePhysicalView")

public actual fun mmSecureVirtualMemory(address: ConstPtr<CVoid>, size: ULong, probemode: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmSecureVirtualMemory")

public actual fun mmSecureVirtualMemoryEx(address: ConstPtr<CVoid>, size: ULong, probemode: UInt, flags: UInt): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmSecureVirtualMemoryEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesMmSetPermanentCacheAttribute")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesMmSetPermanentCacheAttribute(startaddress: Long, numberofbytes: Long, cachetype: Int, flags: Int): Int

public actual fun mmSetPermanentCacheAttribute(startaddress: Long, numberofbytes: Long, cachetype: MemoryCachingType, flags: UInt): Ntstatus =
    wasiWindowssysWindowsWdkSystemSystemservicesMmSetPermanentCacheAttribute(startaddress, numberofbytes, cachetype, flags.toInt()).toInt()

public actual fun mmSizeOfMdl(base: ConstPtr<CVoid>, length: ULong): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmSizeOfMdl")

public actual fun mmUnlockPagableImageSection(imagesectionhandle: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmUnlockPagableImageSection")

public actual fun mmUnlockPages(memorydescriptorlist: MutPtr<Mdl>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmUnlockPages")

public actual fun mmUnmapIoSpace(baseaddress: ConstPtr<CVoid>, numberofbytes: ULong): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmUnmapIoSpace")

public actual fun mmUnmapLockedPages(baseaddress: ConstPtr<CVoid>, memorydescriptorlist: MutPtr<Mdl>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmUnmapLockedPages")

public actual fun mmUnmapReservedMapping(baseaddress: ConstPtr<CVoid>, pooltag: UInt, memorydescriptorlist: MutPtr<Mdl>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmUnmapReservedMapping")

public actual fun mmUnmapVideoDisplay(baseaddress: ConstPtr<CVoid>, numberofbytes: ULong): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmUnmapVideoDisplay")

public actual fun mmUnmapViewInSessionSpace(mappedbase: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmUnmapViewInSessionSpace")

public actual fun mmUnmapViewInSystemSpace(mappedbase: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmUnmapViewInSystemSpace")

public actual fun mmUnsecureVirtualMemory(securehandle: Handle): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesMmUnsecureVirtualMemory")

public actual fun ntAllocateLocallyUniqueId(luid: MutPtr<Luid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtAllocateLocallyUniqueId")

public actual fun ntCommitComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtCommitComplete")

public actual fun ntCommitEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtCommitEnlistment")

public actual fun ntCommitTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtCommitTransaction")

public actual fun ntCreateEnlistment(enlistmenthandle: MutPtr<Handle>, desiredaccess: UInt, resourcemanagerhandle: Handle, transactionhandle: Handle, objectattributes: ConstPtr<ObjectAttributes>, createoptions: UInt, notificationmask: UInt, enlistmentkey: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtCreateEnlistment")

public actual fun ntCreateResourceManager(resourcemanagerhandle: MutPtr<Handle>, desiredaccess: UInt, tmhandle: Handle, rmguid: ConstPtr<Guid>, objectattributes: ConstPtr<ObjectAttributes>, createoptions: UInt, description: ConstPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtCreateResourceManager")

public actual fun ntCreateTransaction(transactionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, uow: ConstPtr<Guid>, tmhandle: Handle, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: ConstPtr<Long>, description: ConstPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtCreateTransaction")

public actual fun ntCreateTransactionManager(tmhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, logfilename: ConstPtr<UnicodeString>, createoptions: UInt, commitstrength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtCreateTransactionManager")

public actual fun ntDisplayString(string: ConstPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtDisplayString")

public actual fun ntEnumerateTransactionObject(rootobjecthandle: Handle, querytype: KtmobjectType, objectcursor: MutPtr<KtmobjectCursor>, objectcursorlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtEnumerateTransactionObject")

public actual fun ntGetNotificationResourceManager(resourcemanagerhandle: Handle, transactionnotification: MutPtr<TransactionNotification>, notificationlength: UInt, timeout: ConstPtr<Long>, returnlength: MutPtr<UInt>, asynchronous: UInt, asynchronouscontext: ULong): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtGetNotificationResourceManager")

public actual fun ntLoadDriver(driverservicename: ConstPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtLoadDriver")

public actual fun ntMakeTemporaryObject(handle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtMakeTemporaryObject")

public actual fun ntManagePartition(targethandle: Handle, sourcehandle: Handle, partitioninformationclass: PartitionInformationClass, partitioninformation: MutPtr<CVoid>, partitioninformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtManagePartition")

public actual fun ntOpenEnlistment(enlistmenthandle: MutPtr<Handle>, desiredaccess: UInt, resourcemanagerhandle: Handle, enlistmentguid: ConstPtr<Guid>, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtOpenEnlistment")

public actual fun ntOpenResourceManager(resourcemanagerhandle: MutPtr<Handle>, desiredaccess: UInt, tmhandle: Handle, resourcemanagerguid: ConstPtr<Guid>, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtOpenResourceManager")

public actual fun ntOpenTransaction(transactionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, uow: ConstPtr<Guid>, tmhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtOpenTransaction")

public actual fun ntOpenTransactionManager(tmhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, logfilename: ConstPtr<UnicodeString>, tmidentity: ConstPtr<Guid>, openoptions: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtOpenTransactionManager")

public actual fun ntPowerInformation(informationlevel: PowerInformationLevel, inputbuffer: ConstPtr<CVoid>, inputbufferlength: UInt, outputbuffer: MutPtr<CVoid>, outputbufferlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtPowerInformation")

public actual fun ntPrePrepareComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtPrePrepareComplete")

public actual fun ntPrePrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtPrePrepareEnlistment")

public actual fun ntPrepareComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtPrepareComplete")

public actual fun ntPrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtPrepareEnlistment")

public actual fun ntPropagationComplete(resourcemanagerhandle: Handle, requestcookie: UInt, bufferlength: UInt, buffer: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtPropagationComplete")

public actual fun ntPropagationFailed(resourcemanagerhandle: Handle, requestcookie: UInt, propstatus: Ntstatus): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtPropagationFailed")

public actual fun ntQueryInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: MutPtr<CVoid>, enlistmentinformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtQueryInformationEnlistment")

public actual fun ntQueryInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: MutPtr<CVoid>, resourcemanagerinformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtQueryInformationResourceManager")

public actual fun ntQueryInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: MutPtr<CVoid>, transactioninformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtQueryInformationTransaction")

public actual fun ntQueryInformationTransactionManager(transactionmanagerhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: MutPtr<CVoid>, transactionmanagerinformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtQueryInformationTransactionManager")

public actual fun ntReadOnlyEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtReadOnlyEnlistment")

public actual fun ntRecoverEnlistment(enlistmenthandle: Handle, enlistmentkey: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtRecoverEnlistment")

public actual fun ntRecoverResourceManager(resourcemanagerhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtRecoverResourceManager")

public actual fun ntRecoverTransactionManager(transactionmanagerhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtRecoverTransactionManager")

public actual fun ntRegisterProtocolAddressInformation(resourcemanager: Handle, protocolid: ConstPtr<Guid>, protocolinformationsize: UInt, protocolinformation: ConstPtr<CVoid>, createoptions: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtRegisterProtocolAddressInformation")

public actual fun ntRenameTransactionManager(logfilename: ConstPtr<UnicodeString>, existingtransactionmanagerguid: ConstPtr<Guid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtRenameTransactionManager")

public actual fun ntRollbackComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtRollbackComplete")

public actual fun ntRollbackEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtRollbackEnlistment")

public actual fun ntRollbackTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtRollbackTransaction")

public actual fun ntRollforwardTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtRollforwardTransactionManager")

public actual fun ntSetInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: ConstPtr<CVoid>, enlistmentinformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtSetInformationEnlistment")

public actual fun ntSetInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: ConstPtr<CVoid>, resourcemanagerinformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtSetInformationResourceManager")

public actual fun ntSetInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: ConstPtr<CVoid>, transactioninformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtSetInformationTransaction")

public actual fun ntSetInformationTransactionManager(tmhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: ConstPtr<CVoid>, transactionmanagerinformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtSetInformationTransactionManager")

public actual fun ntSinglePhaseReject(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtSinglePhaseReject")

public actual fun ntUnloadDriver(driverservicename: ConstPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesNtUnloadDriver")

public actual fun obCloseHandle(handle: Handle, previousmode: Byte): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesObCloseHandle")

public actual fun obDereferenceObjectDeferDelete(obj: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesObDereferenceObjectDeferDelete")

public actual fun obDereferenceObjectDeferDeleteWithTag(obj: ConstPtr<CVoid>, tag: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesObDereferenceObjectDeferDeleteWithTag")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesObGetFilterVersion")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesObGetFilterVersion(): Int

public actual fun obGetFilterVersion(): UShort =
    wasiWindowssysWindowsWdkSystemSystemservicesObGetFilterVersion().toUShort()

public actual fun obGetObjectSecurity(obj: ConstPtr<CVoid>, securitydescriptor: MutPtr<PsecurityDescriptor>, memoryallocated: MutPtr<Boolean>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesObGetObjectSecurity")

public actual fun obReferenceObjectByHandle(handle: Handle, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, obj: MutPtr<MutPtr<CVoid>>, handleinformation: MutPtr<ObjectHandleInformation>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesObReferenceObjectByHandle")

public actual fun obReferenceObjectByHandleWithTag(handle: Handle, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, tag: UInt, obj: MutPtr<MutPtr<CVoid>>, handleinformation: MutPtr<ObjectHandleInformation>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesObReferenceObjectByHandleWithTag")

public actual fun obReferenceObjectByPointer(obj: ConstPtr<CVoid>, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesObReferenceObjectByPointer")

public actual fun obReferenceObjectByPointerWithTag(obj: ConstPtr<CVoid>, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, tag: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesObReferenceObjectByPointerWithTag")

public actual fun obReferenceObjectSafe(obj: ConstPtr<CVoid>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesObReferenceObjectSafe")

public actual fun obReferenceObjectSafeWithTag(obj: ConstPtr<CVoid>, tag: UInt): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesObReferenceObjectSafeWithTag")

public actual fun obRegisterCallbacks(callbackregistration: ConstPtr<ObCallbackRegistration>, registrationhandle: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesObRegisterCallbacks")

public actual fun obReleaseObjectSecurity(securitydescriptor: PsecurityDescriptor, memoryallocated: Boolean): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesObReleaseObjectSecurity")

public actual fun obUnRegisterCallbacks(registrationhandle: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesObUnRegisterCallbacks")

public actual fun obfDereferenceObject(obj: ConstPtr<CVoid>): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesObfDereferenceObject")

public actual fun obfDereferenceObjectWithTag(obj: ConstPtr<CVoid>, tag: UInt): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesObfDereferenceObjectWithTag")

public actual fun obfReferenceObject(obj: ConstPtr<CVoid>): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesObfReferenceObject")

public actual fun obfReferenceObjectWithTag(obj: ConstPtr<CVoid>, tag: UInt): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesObfReferenceObjectWithTag")

public actual fun pcwAddInstance(buffer: PpcwBuffer, name: ConstPtr<UnicodeString>, id: UInt, count: UInt, data: ConstPtr<PcwData>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPcwAddInstance")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesPcwCloseInstance")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesPcwCloseInstance(instance: Long): Unit

public actual fun pcwCloseInstance(instance: PpcwInstance): Unit =
    wasiWindowssysWindowsWdkSystemSystemservicesPcwCloseInstance(instance)

public actual fun pcwCreateInstance(instance: MutPtr<PpcwInstance>, registration: PpcwRegistration, name: ConstPtr<UnicodeString>, count: UInt, data: ConstPtr<PcwData>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPcwCreateInstance")

public actual fun pcwRegister(registration: MutPtr<PpcwRegistration>, info: ConstPtr<PcwRegistrationInformation>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPcwRegister")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesPcwUnregister")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesPcwUnregister(registration: Long): Unit

public actual fun pcwUnregister(registration: PpcwRegistration): Unit =
    wasiWindowssysWindowsWdkSystemSystemservicesPcwUnregister(registration)

public actual fun poCallDriver(deviceobject: ConstPtr<DeviceObject>, irp: MutPtr<Irp>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoCallDriver")

public actual fun poClearPowerRequest(powerrequest: MutPtr<CVoid>, type: PowerRequestType): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoClearPowerRequest")

public actual fun poCreatePowerRequest(powerrequest: MutPtr<MutPtr<CVoid>>, deviceobject: ConstPtr<DeviceObject>, context: ConstPtr<CountedReasonContext>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoCreatePowerRequest")

public actual fun poCreateThermalRequest(thermalrequest: MutPtr<MutPtr<CVoid>>, targetdeviceobject: ConstPtr<DeviceObject>, policydeviceobject: ConstPtr<DeviceObject>, context: ConstPtr<CountedReasonContext>, flags: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoCreateThermalRequest")

public actual fun poDeletePowerRequest(powerrequest: MutPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoDeletePowerRequest")

public actual fun poDeleteThermalRequest(thermalrequest: MutPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoDeleteThermalRequest")

public actual fun poEndDeviceBusy(idlepointer: MutPtr<UInt>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoEndDeviceBusy")

public actual fun poFxActivateComponent(handle: Pohandle, component: UInt, flags: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoFxActivateComponent")

public actual fun poFxCompleteDevicePowerNotRequired(handle: Pohandle): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoFxCompleteDevicePowerNotRequired")

public actual fun poFxCompleteDirectedPowerDown(handle: Pohandle): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoFxCompleteDirectedPowerDown")

public actual fun poFxCompleteIdleCondition(handle: Pohandle, component: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoFxCompleteIdleCondition")

public actual fun poFxCompleteIdleState(handle: Pohandle, component: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoFxCompleteIdleState")

public actual fun poFxIdleComponent(handle: Pohandle, component: UInt, flags: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoFxIdleComponent")

public actual fun poFxIssueComponentPerfStateChange(handle: Pohandle, flags: UInt, component: UInt, perfchange: ConstPtr<PoFxPerfStateChange>, context: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoFxIssueComponentPerfStateChange")

public actual fun poFxIssueComponentPerfStateChangeMultiple(handle: Pohandle, flags: UInt, component: UInt, perfchangescount: UInt, perfchanges: ConstPtr<PoFxPerfStateChange>, context: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoFxIssueComponentPerfStateChangeMultiple")

public actual fun poFxNotifySurprisePowerOn(pdo: ConstPtr<DeviceObject>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoFxNotifySurprisePowerOn")

public actual fun poFxPowerControl(handle: Pohandle, powercontrolcode: ConstPtr<Guid>, inbuffer: ConstPtr<CVoid>, inbuffersize: ULong, outbuffer: MutPtr<CVoid>, outbuffersize: ULong, bytesreturned: MutPtr<ULong>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoFxPowerControl")

public actual fun poFxPowerOnCrashdumpDevice(handle: Pohandle, context: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoFxPowerOnCrashdumpDevice")

public actual fun poFxQueryCurrentComponentPerfState(handle: Pohandle, flags: UInt, component: UInt, setindex: UInt, currentperf: MutPtr<ULong>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoFxQueryCurrentComponentPerfState")

public actual fun poFxRegisterComponentPerfStates(handle: Pohandle, component: UInt, flags: ULong, componentperfstatecallback: PpoFxComponentPerfStateCallback, inputstateinfo: ConstPtr<PoFxComponentPerfInfo>, outputstateinfo: MutPtr<MutPtr<PoFxComponentPerfInfo>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoFxRegisterComponentPerfStates")

public actual fun poFxRegisterCrashdumpDevice(handle: Pohandle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoFxRegisterCrashdumpDevice")

public actual fun poFxRegisterDevice(pdo: ConstPtr<DeviceObject>, device: ConstPtr<PoFxDeviceV1>, handle: MutPtr<Pohandle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoFxRegisterDevice")

public actual fun poFxRegisterDripsWatchdogCallback(handle: Pohandle, callback: PpoFxDripsWatchdogCallback, includechilddevices: Boolean, matchingdriverobject: ConstPtr<DriverObject>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoFxRegisterDripsWatchdogCallback")

public actual fun poFxReportDevicePoweredOn(handle: Pohandle): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoFxReportDevicePoweredOn")

public actual fun poFxSetComponentLatency(handle: Pohandle, component: UInt, latency: ULong): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoFxSetComponentLatency")

public actual fun poFxSetComponentResidency(handle: Pohandle, component: UInt, residency: ULong): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoFxSetComponentResidency")

public actual fun poFxSetComponentWake(handle: Pohandle, component: UInt, wakehint: Boolean): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoFxSetComponentWake")

public actual fun poFxSetDeviceIdleTimeout(handle: Pohandle, idletimeout: ULong): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoFxSetDeviceIdleTimeout")

public actual fun poFxSetTargetDripsDevicePowerState(handle: Pohandle, targetstate: DevicePowerState): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoFxSetTargetDripsDevicePowerState")

public actual fun poFxStartDevicePowerManagement(handle: Pohandle): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoFxStartDevicePowerManagement")

public actual fun poFxUnregisterDevice(handle: Pohandle): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoFxUnregisterDevice")

public actual fun poGetSystemWake(irp: ConstPtr<Irp>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoGetSystemWake")

public actual fun poGetThermalRequestSupport(thermalrequest: ConstPtr<CVoid>, type: PoThermalRequestType): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoGetThermalRequestSupport")

public actual fun poQueryWatchdogTime(pdo: ConstPtr<DeviceObject>, secondsremaining: MutPtr<UInt>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoQueryWatchdogTime")

public actual fun poRegisterDeviceForIdleDetection(deviceobject: ConstPtr<DeviceObject>, conservationidletime: UInt, performanceidletime: UInt, state: DevicePowerState): MutPtr<UInt> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoRegisterDeviceForIdleDetection")

public actual fun poRegisterPowerSettingCallback(deviceobject: ConstPtr<DeviceObject>, settingguid: ConstPtr<Guid>, callback: PpowerSettingCallback, context: ConstPtr<CVoid>, handle: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoRegisterPowerSettingCallback")

public actual fun poRegisterSystemState(statehandle: MutPtr<CVoid>, flags: UInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoRegisterSystemState")

public actual fun poRequestPowerIrp(deviceobject: ConstPtr<DeviceObject>, minorfunction: UByte, powerstate: PowerState, completionfunction: PrequestPowerComplete, context: ConstPtr<CVoid>, irp: MutPtr<MutPtr<Irp>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoRequestPowerIrp")

public actual fun poSetDeviceBusyEx(idlepointer: MutPtr<UInt>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoSetDeviceBusyEx")

public actual fun poSetHiberRange(memorymap: ConstPtr<CVoid>, flags: UInt, address: ConstPtr<CVoid>, length: ULong, tag: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoSetHiberRange")

public actual fun poSetPowerRequest(powerrequest: MutPtr<CVoid>, type: PowerRequestType): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoSetPowerRequest")

public actual fun poSetPowerState(deviceobject: ConstPtr<DeviceObject>, type: PowerStateType, state: PowerState): PowerState =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoSetPowerState")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesPoSetSystemState")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesPoSetSystemState(flags: Int): Unit

public actual fun poSetSystemState(flags: UInt): Unit =
    wasiWindowssysWindowsWdkSystemSystemservicesPoSetSystemState(flags.toInt())

public actual fun poSetSystemWake(irp: MutPtr<Irp>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoSetSystemWake")

public actual fun poSetSystemWakeDevice(deviceobject: ConstPtr<DeviceObject>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoSetSystemWakeDevice")

public actual fun poSetThermalActiveCooling(thermalrequest: MutPtr<CVoid>, engaged: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoSetThermalActiveCooling")

public actual fun poSetThermalPassiveCooling(thermalrequest: MutPtr<CVoid>, throttle: UByte): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoSetThermalPassiveCooling")

public actual fun poStartDeviceBusy(idlepointer: MutPtr<UInt>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoStartDeviceBusy")

public actual fun poStartNextPowerIrp(irp: MutPtr<Irp>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoStartNextPowerIrp")

public actual fun poUnregisterPowerSettingCallback(handle: MutPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoUnregisterPowerSettingCallback")

public actual fun poUnregisterSystemState(statehandle: MutPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPoUnregisterSystemState")

public actual fun probeForRead(address: ConstPtr<CVoid>, length: ULong, alignment: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesProbeForRead")

public actual fun probeForWrite(address: MutPtr<CVoid>, length: ULong, alignment: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesProbeForWrite")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesPsAcquireSiloHardReference")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesPsAcquireSiloHardReference(silo: Long): Int

public actual fun psAcquireSiloHardReference(silo: Pesilo): Ntstatus =
    wasiWindowssysWindowsWdkSystemSystemservicesPsAcquireSiloHardReference(silo).toInt()

public actual fun psAllocSiloContextSlot(reserved: ULong, returnedcontextslot: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPsAllocSiloContextSlot")

public actual fun psAllocateAffinityToken(affinitytoken: MutPtr<PaffinityToken>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPsAllocateAffinityToken")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesPsAttachSiloToCurrentThread")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesPsAttachSiloToCurrentThread(silo: Long): Long

public actual fun psAttachSiloToCurrentThread(silo: Pesilo): Pesilo =
    wasiWindowssysWindowsWdkSystemSystemservicesPsAttachSiloToCurrentThread(silo).toLong()

public actual fun psCreateSiloContext(silo: Pesilo, size: UInt, pooltype: PoolType, contextcleanupcallback: SiloContextCleanupCallback, returnedsilocontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPsCreateSiloContext")

public actual fun psCreateSystemThread(threadhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, processhandle: Handle, clientid: MutPtr<ClientId>, startroutine: PkstartRoutine, startcontext: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPsCreateSystemThread")

public actual fun psDereferenceSiloContext(silocontext: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPsDereferenceSiloContext")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesPsDetachSiloFromCurrentThread")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesPsDetachSiloFromCurrentThread(previoussilo: Long): Unit

public actual fun psDetachSiloFromCurrentThread(previoussilo: Pesilo): Unit =
    wasiWindowssysWindowsWdkSystemSystemservicesPsDetachSiloFromCurrentThread(previoussilo)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesPsFreeAffinityToken")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesPsFreeAffinityToken(affinitytoken: Long): Unit

public actual fun psFreeAffinityToken(affinitytoken: PaffinityToken): Unit =
    wasiWindowssysWindowsWdkSystemSystemservicesPsFreeAffinityToken(affinitytoken)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesPsFreeSiloContextSlot")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesPsFreeSiloContextSlot(contextslot: Int): Int

public actual fun psFreeSiloContextSlot(contextslot: UInt): Ntstatus =
    wasiWindowssysWindowsWdkSystemSystemservicesPsFreeSiloContextSlot(contextslot.toInt()).toInt()

public actual fun psGetCurrentProcessId(): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPsGetCurrentProcessId")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesPsGetCurrentServerSilo")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesPsGetCurrentServerSilo(): Long

public actual fun psGetCurrentServerSilo(): Pesilo =
    wasiWindowssysWindowsWdkSystemSystemservicesPsGetCurrentServerSilo().toLong()

public actual fun psGetCurrentServerSiloName(): MutPtr<UnicodeString> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPsGetCurrentServerSiloName")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesPsGetCurrentSilo")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesPsGetCurrentSilo(): Long

public actual fun psGetCurrentSilo(): Pesilo =
    wasiWindowssysWindowsWdkSystemSystemservicesPsGetCurrentSilo().toLong()

public actual fun psGetCurrentThreadId(): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPsGetCurrentThreadId")

public actual fun psGetCurrentThreadTeb(): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPsGetCurrentThreadTeb")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesPsGetEffectiveServerSilo")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesPsGetEffectiveServerSilo(silo: Long): Long

public actual fun psGetEffectiveServerSilo(silo: Pesilo): Pesilo =
    wasiWindowssysWindowsWdkSystemSystemservicesPsGetEffectiveServerSilo(silo).toLong()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesPsGetHostSilo")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesPsGetHostSilo(): Long

public actual fun psGetHostSilo(): Pesilo =
    wasiWindowssysWindowsWdkSystemSystemservicesPsGetHostSilo().toLong()

public actual fun psGetJobServerSilo(job: Pejob, serversilo: MutPtr<Pesilo>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPsGetJobServerSilo")

public actual fun psGetJobSilo(job: Pejob, silo: MutPtr<Pesilo>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPsGetJobSilo")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesPsGetParentSilo")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesPsGetParentSilo(job: Long): Long

public actual fun psGetParentSilo(job: Pejob): Pesilo =
    wasiWindowssysWindowsWdkSystemSystemservicesPsGetParentSilo(job).toLong()

public actual fun psGetPermanentSiloContext(silo: Pesilo, contextslot: UInt, returnedsilocontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPsGetPermanentSiloContext")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesPsGetProcessCreateTimeQuadPart")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesPsGetProcessCreateTimeQuadPart(process: Long): Long

public actual fun psGetProcessCreateTimeQuadPart(process: Peprocess): Long =
    wasiWindowssysWindowsWdkSystemSystemservicesPsGetProcessCreateTimeQuadPart(process).toLong()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesPsGetProcessExitStatus")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesPsGetProcessExitStatus(process: Long): Int

public actual fun psGetProcessExitStatus(process: Peprocess): Ntstatus =
    wasiWindowssysWindowsWdkSystemSystemservicesPsGetProcessExitStatus(process).toInt()

public actual fun psGetProcessId(process: Peprocess): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPsGetProcessId")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesPsGetProcessStartKey")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesPsGetProcessStartKey(process: Long): Long

public actual fun psGetProcessStartKey(process: Peprocess): ULong =
    wasiWindowssysWindowsWdkSystemSystemservicesPsGetProcessStartKey(process).toULong()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesPsGetServerSiloServiceSessionId")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesPsGetServerSiloServiceSessionId(silo: Long): Int

public actual fun psGetServerSiloServiceSessionId(silo: Pesilo): UInt =
    wasiWindowssysWindowsWdkSystemSystemservicesPsGetServerSiloServiceSessionId(silo).toUInt()

public actual fun psGetSiloContainerId(silo: Pesilo): MutPtr<Guid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPsGetSiloContainerId")

public actual fun psGetSiloContext(silo: Pesilo, contextslot: UInt, returnedsilocontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPsGetSiloContext")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesPsGetSiloMonitorContextSlot")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesPsGetSiloMonitorContextSlot(monitor: Long): Int

public actual fun psGetSiloMonitorContextSlot(monitor: PsiloMonitor): UInt =
    wasiWindowssysWindowsWdkSystemSystemservicesPsGetSiloMonitorContextSlot(monitor).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesPsGetThreadCreateTime")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesPsGetThreadCreateTime(thread: Long): Long

public actual fun psGetThreadCreateTime(thread: Pethread): Long =
    wasiWindowssysWindowsWdkSystemSystemservicesPsGetThreadCreateTime(thread).toLong()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesPsGetThreadExitStatus")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesPsGetThreadExitStatus(thread: Long): Int

public actual fun psGetThreadExitStatus(thread: Pethread): Ntstatus =
    wasiWindowssysWindowsWdkSystemSystemservicesPsGetThreadExitStatus(thread).toInt()

public actual fun psGetThreadId(thread: Pethread): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPsGetThreadId")

public actual fun psGetThreadProcessId(thread: Pethread): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPsGetThreadProcessId")

public actual fun psGetThreadProperty(thread: Pethread, key: ULong, flags: UInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPsGetThreadProperty")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesPsGetThreadServerSilo")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesPsGetThreadServerSilo(thread: Long): Long

public actual fun psGetThreadServerSilo(thread: Pethread): Pesilo =
    wasiWindowssysWindowsWdkSystemSystemservicesPsGetThreadServerSilo(thread).toLong()

public actual fun psGetVersion(majorversion: MutPtr<UInt>, minorversion: MutPtr<UInt>, buildnumber: MutPtr<UInt>, csdversion: MutPtr<UnicodeString>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPsGetVersion")

public actual fun psInsertPermanentSiloContext(silo: Pesilo, contextslot: UInt, silocontext: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPsInsertPermanentSiloContext")

public actual fun psInsertSiloContext(silo: Pesilo, contextslot: UInt, silocontext: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPsInsertSiloContext")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesPsIsCurrentThreadInServerSilo")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesPsIsCurrentThreadInServerSilo(): Int

public actual fun psIsCurrentThreadInServerSilo(): Boolean =
    (wasiWindowssysWindowsWdkSystemSystemservicesPsIsCurrentThreadInServerSilo() != 0)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesPsIsCurrentThreadPrefetching")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesPsIsCurrentThreadPrefetching(): Int

public actual fun psIsCurrentThreadPrefetching(): Boolean =
    (wasiWindowssysWindowsWdkSystemSystemservicesPsIsCurrentThreadPrefetching() != 0)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesPsIsHostSilo")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesPsIsHostSilo(silo: Long): Int

public actual fun psIsHostSilo(silo: Pesilo): Boolean =
    (wasiWindowssysWindowsWdkSystemSystemservicesPsIsHostSilo(silo) != 0)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesPsMakeSiloContextPermanent")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesPsMakeSiloContextPermanent(silo: Long, contextslot: Int): Int

public actual fun psMakeSiloContextPermanent(silo: Pesilo, contextslot: UInt): Ntstatus =
    wasiWindowssysWindowsWdkSystemSystemservicesPsMakeSiloContextPermanent(silo, contextslot.toInt()).toInt()

public actual fun psQueryTotalCycleTimeProcess(process: Peprocess, cycletimestamp: MutPtr<ULong>): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPsQueryTotalCycleTimeProcess")

public actual fun psReferenceSiloContext(silocontext: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPsReferenceSiloContext")

public actual fun psRegisterSiloMonitor(registration: ConstPtr<SiloMonitorRegistration>, returnedmonitor: MutPtr<PsiloMonitor>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPsRegisterSiloMonitor")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesPsReleaseSiloHardReference")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesPsReleaseSiloHardReference(silo: Long): Unit

public actual fun psReleaseSiloHardReference(silo: Pesilo): Unit =
    wasiWindowssysWindowsWdkSystemSystemservicesPsReleaseSiloHardReference(silo)

public actual fun psRemoveCreateThreadNotifyRoutine(notifyroutine: PcreateThreadNotifyRoutine): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPsRemoveCreateThreadNotifyRoutine")

public actual fun psRemoveLoadImageNotifyRoutine(notifyroutine: PloadImageNotifyRoutine): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPsRemoveLoadImageNotifyRoutine")

public actual fun psRemoveSiloContext(silo: Pesilo, contextslot: UInt, removedsilocontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPsRemoveSiloContext")

public actual fun psReplaceSiloContext(silo: Pesilo, contextslot: UInt, newsilocontext: ConstPtr<CVoid>, oldsilocontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPsReplaceSiloContext")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesPsRevertToUserMultipleGroupAffinityThread")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesPsRevertToUserMultipleGroupAffinityThread(affinitytoken: Long): Unit

public actual fun psRevertToUserMultipleGroupAffinityThread(affinitytoken: PaffinityToken): Unit =
    wasiWindowssysWindowsWdkSystemSystemservicesPsRevertToUserMultipleGroupAffinityThread(affinitytoken)

public actual fun psSetCreateProcessNotifyRoutine(notifyroutine: PcreateProcessNotifyRoutine, remove: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPsSetCreateProcessNotifyRoutine")

public actual fun psSetCreateProcessNotifyRoutineEx(notifyroutine: PcreateProcessNotifyRoutineEx, remove: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPsSetCreateProcessNotifyRoutineEx")

public actual fun psSetCreateProcessNotifyRoutineEx2(notifytype: Pscreateprocessnotifytype, notifyinformation: ConstPtr<CVoid>, remove: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPsSetCreateProcessNotifyRoutineEx2")

public actual fun psSetCreateThreadNotifyRoutine(notifyroutine: PcreateThreadNotifyRoutine): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPsSetCreateThreadNotifyRoutine")

public actual fun psSetCreateThreadNotifyRoutineEx(notifytype: Pscreatethreadnotifytype, notifyinformation: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPsSetCreateThreadNotifyRoutineEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesPsSetCurrentThreadPrefetching")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesPsSetCurrentThreadPrefetching(prefetching: Int): Int

public actual fun psSetCurrentThreadPrefetching(prefetching: Boolean): Boolean =
    (wasiWindowssysWindowsWdkSystemSystemservicesPsSetCurrentThreadPrefetching(if (prefetching) 1 else 0) != 0)

public actual fun psSetLoadImageNotifyRoutine(notifyroutine: PloadImageNotifyRoutine): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPsSetLoadImageNotifyRoutine")

public actual fun psSetLoadImageNotifyRoutineEx(notifyroutine: PloadImageNotifyRoutine, flags: ULong): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPsSetLoadImageNotifyRoutineEx")

public actual fun psSetSystemMultipleGroupAffinityThread(groupaffinities: ConstPtr<GroupAffinity>, groupcount: UShort, affinitytoken: PaffinityToken): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPsSetSystemMultipleGroupAffinityThread")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesPsStartSiloMonitor")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesPsStartSiloMonitor(monitor: Long): Int

public actual fun psStartSiloMonitor(monitor: PsiloMonitor): Ntstatus =
    wasiWindowssysWindowsWdkSystemSystemservicesPsStartSiloMonitor(monitor).toInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesPsTerminateServerSilo")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesPsTerminateServerSilo(serversilo: Long, exitstatus: Int): Unit

public actual fun psTerminateServerSilo(serversilo: Pesilo, exitstatus: Ntstatus): Unit =
    wasiWindowssysWindowsWdkSystemSystemservicesPsTerminateServerSilo(serversilo, exitstatus)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesPsTerminateSystemThread")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesPsTerminateSystemThread(exitstatus: Int): Int

public actual fun psTerminateSystemThread(exitstatus: Ntstatus): Ntstatus =
    wasiWindowssysWindowsWdkSystemSystemservicesPsTerminateSystemThread(exitstatus).toInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesPsUnregisterSiloMonitor")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesPsUnregisterSiloMonitor(monitor: Long): Unit

public actual fun psUnregisterSiloMonitor(monitor: PsiloMonitor): Unit =
    wasiWindowssysWindowsWdkSystemSystemservicesPsUnregisterSiloMonitor(monitor)

public actual fun psWrapApcWow64Thread(apccontext: MutPtr<MutPtr<CVoid>>, apcroutine: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPsWrapApcWow64Thread")

public actual fun pshedAllocateMemory(size: UInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPshedAllocateMemory")

public actual fun pshedFreeMemory(address: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPshedFreeMemory")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesPshedIsSystemWheaEnabled")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesPshedIsSystemWheaEnabled(): Int

public actual fun pshedIsSystemWheaEnabled(): Boolean =
    (wasiWindowssysWindowsWdkSystemSystemservicesPshedIsSystemWheaEnabled() != 0)

public actual fun pshedRegisterPlugin(packet: MutPtr<WheaPshedPluginRegistrationPacketV2>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPshedRegisterPlugin")

public actual fun pshedSynchronizeExecution(errorsource: ConstPtr<WheaErrorSourceDescriptor>, synchronizeroutine: PksynchronizeRoutine, synchronizecontext: ConstPtr<CVoid>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPshedSynchronizeExecution")

public actual fun pshedUnregisterPlugin(pluginhandle: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesPshedUnregisterPlugin")

public actual fun rtlAppendUnicodeStringToString(destination: MutPtr<UnicodeString>, source: ConstPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlAppendUnicodeStringToString")

public actual fun rtlAppendUnicodeToString(destination: MutPtr<UnicodeString>, source: Pcwstr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlAppendUnicodeToString")

public actual fun rtlAreBitsClear(bitmapheader: ConstPtr<RtlBitmap>, startingindex: UInt, length: UInt): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlAreBitsClear")

public actual fun rtlAreBitsSet(bitmapheader: ConstPtr<RtlBitmap>, startingindex: UInt, length: UInt): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlAreBitsSet")

public actual fun rtlAssert(voidfailedassertion: ConstPtr<CVoid>, voidfilename: ConstPtr<CVoid>, linenumber: UInt, mutablemessage: Pcstr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlAssert")

public actual fun rtlCheckRegistryKey(relativeto: UInt, path: Pcwstr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlCheckRegistryKey")

public actual fun rtlClearAllBits(bitmapheader: ConstPtr<RtlBitmap>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlClearAllBits")

public actual fun rtlClearBit(bitmapheader: ConstPtr<RtlBitmap>, bitnumber: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlClearBit")

public actual fun rtlClearBits(bitmapheader: ConstPtr<RtlBitmap>, startingindex: UInt, numbertoclear: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlClearBits")

public actual fun rtlCmDecodeMemIoResource(descriptor: ConstPtr<CmPartialResourceDescriptor>, start: MutPtr<ULong>): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlCmDecodeMemIoResource")

public actual fun rtlCmEncodeMemIoResource(descriptor: ConstPtr<CmPartialResourceDescriptor>, type: UByte, length: ULong, start: ULong): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlCmEncodeMemIoResource")

public actual fun rtlCompareString(string1: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, string2: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, caseinsensitive: Boolean): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlCompareString")

public actual fun rtlCompareUnicodeString(string1: ConstPtr<UnicodeString>, string2: ConstPtr<UnicodeString>, caseinsensitive: Boolean): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlCompareUnicodeString")

public actual fun rtlCompareUnicodeStrings(string1: ConstPtr<UShort>, string1length: ULong, string2: ConstPtr<UShort>, string2length: ULong, caseinsensitive: Boolean): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlCompareUnicodeStrings")

public actual fun rtlContractHashTable(hashtable: ConstPtr<RtlDynamicHashTable>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlContractHashTable")

public actual fun rtlCopyBitMap(source: ConstPtr<RtlBitmap>, destination: ConstPtr<RtlBitmap>, targetbit: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlCopyBitMap")

public actual fun rtlCopyString(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlCopyString")

public actual fun rtlCopyUnicodeString(destinationstring: MutPtr<UnicodeString>, sourcestring: ConstPtr<UnicodeString>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlCopyUnicodeString")

public actual fun rtlCreateHashTable(hashtable: MutPtr<MutPtr<RtlDynamicHashTable>>, shift: UInt, flags: UInt): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlCreateHashTable")

public actual fun rtlCreateHashTableEx(hashtable: MutPtr<MutPtr<RtlDynamicHashTable>>, initialsize: UInt, shift: UInt, flags: UInt): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlCreateHashTableEx")

public actual fun rtlCreateRegistryKey(relativeto: UInt, path: Pcwstr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlCreateRegistryKey")

public actual fun rtlCreateSecurityDescriptor(securitydescriptor: PsecurityDescriptor, revision: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlCreateSecurityDescriptor")

public actual fun rtlDelete(links: ConstPtr<RtlSplayLinks>): MutPtr<RtlSplayLinks> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlDelete")

public actual fun rtlDeleteElementGenericTable(table: ConstPtr<RtlGenericTable>, buffer: ConstPtr<CVoid>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlDeleteElementGenericTable")

public actual fun rtlDeleteElementGenericTableAvl(table: ConstPtr<RtlAvlTable>, buffer: ConstPtr<CVoid>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlDeleteElementGenericTableAvl")

public actual fun rtlDeleteElementGenericTableAvlEx(table: ConstPtr<RtlAvlTable>, nodeorparent: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlDeleteElementGenericTableAvlEx")

public actual fun rtlDeleteHashTable(hashtable: ConstPtr<RtlDynamicHashTable>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlDeleteHashTable")

public actual fun rtlDeleteNoSplay(links: ConstPtr<RtlSplayLinks>, root: MutPtr<MutPtr<RtlSplayLinks>>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlDeleteNoSplay")

public actual fun rtlDeleteRegistryValue(relativeto: UInt, path: Pcwstr, valuename: Pcwstr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlDeleteRegistryValue")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesRtlDowncaseUnicodeChar")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesRtlDowncaseUnicodeChar(sourcecharacter: Int): Int

public actual fun rtlDowncaseUnicodeChar(sourcecharacter: UShort): UShort =
    wasiWindowssysWindowsWdkSystemSystemservicesRtlDowncaseUnicodeChar(sourcecharacter.toInt()).toUShort()

public actual fun rtlEndEnumerationHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlEndEnumerationHashTable")

public actual fun rtlEndStrongEnumerationHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlEndStrongEnumerationHashTable")

public actual fun rtlEndWeakEnumerationHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlEndWeakEnumerationHashTable")

public actual fun rtlEnumerateEntryHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>): MutPtr<RtlDynamicHashTableEntry> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlEnumerateEntryHashTable")

public actual fun rtlEnumerateGenericTable(table: ConstPtr<RtlGenericTable>, restart: Boolean): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTable")

public actual fun rtlEnumerateGenericTableAvl(table: ConstPtr<RtlAvlTable>, restart: Boolean): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTableAvl")

public actual fun rtlEnumerateGenericTableLikeADirectory(table: ConstPtr<RtlAvlTable>, matchfunction: PrtlAvlMatchFunction, matchdata: ConstPtr<CVoid>, nextflag: UInt, restartkey: MutPtr<MutPtr<CVoid>>, deletecount: MutPtr<UInt>, buffer: ConstPtr<CVoid>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTableLikeADirectory")

public actual fun rtlEnumerateGenericTableWithoutSplaying(table: ConstPtr<RtlGenericTable>, restartkey: MutPtr<MutPtr<CVoid>>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTableWithoutSplaying")

public actual fun rtlEnumerateGenericTableWithoutSplayingAvl(table: ConstPtr<RtlAvlTable>, restartkey: MutPtr<MutPtr<CVoid>>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTableWithoutSplayingAvl")

public actual fun rtlEqualString(string1: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, string2: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, caseinsensitive: Boolean): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlEqualString")

public actual fun rtlEqualUnicodeString(string1: ConstPtr<UnicodeString>, string2: ConstPtr<UnicodeString>, caseinsensitive: Boolean): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlEqualUnicodeString")

public actual fun rtlExpandHashTable(hashtable: ConstPtr<RtlDynamicHashTable>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlExpandHashTable")

public actual fun rtlExtractBitMap(source: ConstPtr<RtlBitmap>, destination: ConstPtr<RtlBitmap>, targetbit: UInt, numberofbits: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlExtractBitMap")

public actual fun rtlFindClearBits(bitmapheader: ConstPtr<RtlBitmap>, numbertofind: UInt, hintindex: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlFindClearBits")

public actual fun rtlFindClearBitsAndSet(bitmapheader: ConstPtr<RtlBitmap>, numbertofind: UInt, hintindex: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlFindClearBitsAndSet")

public actual fun rtlFindClearRuns(bitmapheader: ConstPtr<RtlBitmap>, runarray: MutPtr<RtlBitmapRun>, sizeofrunarray: UInt, locatelongestruns: Boolean): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlFindClearRuns")

public actual fun rtlFindClosestEncodableLength(sourcelength: ULong, targetlength: MutPtr<ULong>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlFindClosestEncodableLength")

public actual fun rtlFindFirstRunClear(bitmapheader: ConstPtr<RtlBitmap>, startingindex: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlFindFirstRunClear")

public actual fun rtlFindLastBackwardRunClear(bitmapheader: ConstPtr<RtlBitmap>, fromindex: UInt, startingrunindex: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlFindLastBackwardRunClear")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesRtlFindLeastSignificantBit")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesRtlFindLeastSignificantBit(set: Long): Int

public actual fun rtlFindLeastSignificantBit(set: ULong): Byte =
    wasiWindowssysWindowsWdkSystemSystemservicesRtlFindLeastSignificantBit(set.toLong()).toByte()

public actual fun rtlFindLongestRunClear(bitmapheader: ConstPtr<RtlBitmap>, startingindex: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlFindLongestRunClear")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesRtlFindMostSignificantBit")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesRtlFindMostSignificantBit(set: Long): Int

public actual fun rtlFindMostSignificantBit(set: ULong): Byte =
    wasiWindowssysWindowsWdkSystemSystemservicesRtlFindMostSignificantBit(set.toLong()).toByte()

public actual fun rtlFindNextForwardRunClear(bitmapheader: ConstPtr<RtlBitmap>, fromindex: UInt, startingrunindex: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlFindNextForwardRunClear")

public actual fun rtlFindSetBits(bitmapheader: ConstPtr<RtlBitmap>, numbertofind: UInt, hintindex: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlFindSetBits")

public actual fun rtlFindSetBitsAndClear(bitmapheader: ConstPtr<RtlBitmap>, numbertofind: UInt, hintindex: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlFindSetBitsAndClear")

public actual fun rtlFreeUTF8String(utf8string: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlFreeUTF8String")

public actual fun rtlGUIDFromString(guidstring: ConstPtr<UnicodeString>, guid: MutPtr<Guid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlGUIDFromString")

public actual fun rtlGenerateClass5Guid(namespaceguid: ConstPtr<Guid>, buffer: ConstPtr<CVoid>, buffersize: UInt, guid: MutPtr<Guid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlGenerateClass5Guid")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesRtlGetActiveConsoleId")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesRtlGetActiveConsoleId(): Int

public actual fun rtlGetActiveConsoleId(): UInt =
    wasiWindowssysWindowsWdkSystemSystemservicesRtlGetActiveConsoleId().toUInt()

public actual fun rtlGetCallersAddress(callersaddress: MutPtr<MutPtr<CVoid>>, callerscaller: MutPtr<MutPtr<CVoid>>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlGetCallersAddress")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesRtlGetConsoleSessionForegroundProcessId")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesRtlGetConsoleSessionForegroundProcessId(): Long

public actual fun rtlGetConsoleSessionForegroundProcessId(): ULong =
    wasiWindowssysWindowsWdkSystemSystemservicesRtlGetConsoleSessionForegroundProcessId().toULong()

public actual fun rtlGetElementGenericTable(table: ConstPtr<RtlGenericTable>, i: UInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlGetElementGenericTable")

public actual fun rtlGetElementGenericTableAvl(table: ConstPtr<RtlAvlTable>, i: UInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlGetElementGenericTableAvl")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesRtlGetEnabledExtendedFeatures")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesRtlGetEnabledExtendedFeatures(featuremask: Long): Long

public actual fun rtlGetEnabledExtendedFeatures(featuremask: ULong): ULong =
    wasiWindowssysWindowsWdkSystemSystemservicesRtlGetEnabledExtendedFeatures(featuremask.toLong()).toULong()

public actual fun rtlGetNextEntryHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, context: ConstPtr<RtlDynamicHashTableContext>): MutPtr<RtlDynamicHashTableEntry> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlGetNextEntryHashTable")

public actual fun rtlGetNtProductType(ntproducttype: MutPtr<NtProductType>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlGetNtProductType")

public actual fun rtlGetNtSystemRoot(): Pcwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlGetNtSystemRoot")

public actual fun rtlGetPersistedStateLocation(sourceid: Pcwstr, customvalue: Pcwstr, defaultpath: Pcwstr, statelocationtype: StateLocationType, targetpath: Pwstr, bufferlengthin: UInt, bufferlengthout: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlGetPersistedStateLocation")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesRtlGetSuiteMask")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesRtlGetSuiteMask(): Int

public actual fun rtlGetSuiteMask(): UInt =
    wasiWindowssysWindowsWdkSystemSystemservicesRtlGetSuiteMask().toUInt()

public actual fun rtlGetVersion(lpversioninformation: MutPtr<Osversioninfow>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlGetVersion")

public actual fun rtlHashUnicodeString(string: ConstPtr<UnicodeString>, caseinsensitive: Boolean, hashalgorithm: UInt, hashvalue: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlHashUnicodeString")

public actual fun rtlInitEnumerationHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlInitEnumerationHashTable")

public actual fun rtlInitStrongEnumerationHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlInitStrongEnumerationHashTable")

public actual fun rtlInitUTF8String(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: ConstPtr<Byte>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlInitUTF8String")

public actual fun rtlInitUTF8StringEx(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: ConstPtr<Byte>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlInitUTF8StringEx")

public actual fun rtlInitWeakEnumerationHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlInitWeakEnumerationHashTable")

public actual fun rtlInitializeBitMap(bitmapheader: MutPtr<RtlBitmap>, bitmapbuffer: ConstPtr<UInt>, sizeofbitmap: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlInitializeBitMap")

public actual fun rtlInitializeGenericTable(table: MutPtr<RtlGenericTable>, compareroutine: PrtlGenericCompareRoutine, allocateroutine: PrtlGenericAllocateRoutine, freeroutine: PrtlGenericFreeRoutine, tablecontext: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlInitializeGenericTable")

public actual fun rtlInitializeGenericTableAvl(table: MutPtr<RtlAvlTable>, compareroutine: PrtlAvlCompareRoutine, allocateroutine: PrtlAvlAllocateRoutine, freeroutine: PrtlAvlFreeRoutine, tablecontext: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlInitializeGenericTableAvl")

public actual fun rtlInsertElementGenericTable(table: ConstPtr<RtlGenericTable>, buffer: ConstPtr<CVoid>, buffersize: UInt, newelement: MutPtr<Boolean>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlInsertElementGenericTable")

public actual fun rtlInsertElementGenericTableAvl(table: ConstPtr<RtlAvlTable>, buffer: ConstPtr<CVoid>, buffersize: UInt, newelement: MutPtr<Boolean>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlInsertElementGenericTableAvl")

public actual fun rtlInsertElementGenericTableFull(table: ConstPtr<RtlGenericTable>, buffer: ConstPtr<CVoid>, buffersize: UInt, newelement: MutPtr<Boolean>, nodeorparent: ConstPtr<CVoid>, searchresult: TableSearchResult): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlInsertElementGenericTableFull")

public actual fun rtlInsertElementGenericTableFullAvl(table: ConstPtr<RtlAvlTable>, buffer: ConstPtr<CVoid>, buffersize: UInt, newelement: MutPtr<Boolean>, nodeorparent: ConstPtr<CVoid>, searchresult: TableSearchResult): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlInsertElementGenericTableFullAvl")

public actual fun rtlInsertEntryHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, entry: ConstPtr<RtlDynamicHashTableEntry>, signature: ULong, context: MutPtr<RtlDynamicHashTableContext>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlInsertEntryHashTable")

public actual fun rtlInt64ToUnicodeString(value: ULong, base: UInt, string: MutPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlInt64ToUnicodeString")

public actual fun rtlIntegerToUnicodeString(value: UInt, base: UInt, string: MutPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlIntegerToUnicodeString")

public actual fun rtlIoDecodeMemIoResource(descriptor: ConstPtr<IoResourceDescriptor>, alignment: MutPtr<ULong>, minimumaddress: MutPtr<ULong>, maximumaddress: MutPtr<ULong>): ULong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlIoDecodeMemIoResource")

public actual fun rtlIoEncodeMemIoResource(descriptor: ConstPtr<IoResourceDescriptor>, type: UByte, length: ULong, alignment: ULong, minimumaddress: ULong, maximumaddress: ULong): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlIoEncodeMemIoResource")

public actual fun rtlIsApiSetImplemented(apisetname: Pcstr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlIsApiSetImplemented")

public actual fun rtlIsGenericTableEmpty(table: ConstPtr<RtlGenericTable>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlIsGenericTableEmpty")

public actual fun rtlIsGenericTableEmptyAvl(table: ConstPtr<RtlAvlTable>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlIsGenericTableEmptyAvl")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesRtlIsMultiSessionSku")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesRtlIsMultiSessionSku(): Int

public actual fun rtlIsMultiSessionSku(): Boolean =
    (wasiWindowssysWindowsWdkSystemSystemservicesRtlIsMultiSessionSku() != 0)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesRtlIsMultiUsersInSessionSku")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesRtlIsMultiUsersInSessionSku(): Int

public actual fun rtlIsMultiUsersInSessionSku(): Boolean =
    (wasiWindowssysWindowsWdkSystemSystemservicesRtlIsMultiUsersInSessionSku() != 0)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesRtlIsNtDdiVersionAvailable")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesRtlIsNtDdiVersionAvailable(version: Int): Int

public actual fun rtlIsNtDdiVersionAvailable(version: UInt): Boolean =
    (wasiWindowssysWindowsWdkSystemSystemservicesRtlIsNtDdiVersionAvailable(version.toInt()) != 0)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesRtlIsServicePackVersionInstalled")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesRtlIsServicePackVersionInstalled(version: Int): Int

public actual fun rtlIsServicePackVersionInstalled(version: UInt): Boolean =
    (wasiWindowssysWindowsWdkSystemSystemservicesRtlIsServicePackVersionInstalled(version.toInt()) != 0)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesRtlIsStateSeparationEnabled")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesRtlIsStateSeparationEnabled(): Int

public actual fun rtlIsStateSeparationEnabled(): Boolean =
    (wasiWindowssysWindowsWdkSystemSystemservicesRtlIsStateSeparationEnabled() != 0)

public actual fun rtlIsUntrustedObject(handle: Handle, obj: ConstPtr<CVoid>, untrustedobject: MutPtr<Boolean>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlIsUntrustedObject")

public actual fun rtlLengthSecurityDescriptor(securitydescriptor: PsecurityDescriptor): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlLengthSecurityDescriptor")

public actual fun rtlLookupElementGenericTable(table: ConstPtr<RtlGenericTable>, buffer: ConstPtr<CVoid>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlLookupElementGenericTable")

public actual fun rtlLookupElementGenericTableAvl(table: ConstPtr<RtlAvlTable>, buffer: ConstPtr<CVoid>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlLookupElementGenericTableAvl")

public actual fun rtlLookupElementGenericTableFull(table: ConstPtr<RtlGenericTable>, buffer: ConstPtr<CVoid>, nodeorparent: MutPtr<MutPtr<CVoid>>, searchresult: MutPtr<TableSearchResult>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlLookupElementGenericTableFull")

public actual fun rtlLookupElementGenericTableFullAvl(table: ConstPtr<RtlAvlTable>, buffer: ConstPtr<CVoid>, nodeorparent: MutPtr<MutPtr<CVoid>>, searchresult: MutPtr<TableSearchResult>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlLookupElementGenericTableFullAvl")

public actual fun rtlLookupEntryHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, signature: ULong, context: MutPtr<RtlDynamicHashTableContext>): MutPtr<RtlDynamicHashTableEntry> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlLookupEntryHashTable")

public actual fun rtlLookupFirstMatchingElementGenericTableAvl(table: ConstPtr<RtlAvlTable>, buffer: ConstPtr<CVoid>, restartkey: MutPtr<MutPtr<CVoid>>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlLookupFirstMatchingElementGenericTableAvl")

public actual fun rtlMapGenericMask(accessmask: MutPtr<UInt>, genericmapping: ConstPtr<GenericMapping>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlMapGenericMask")

public actual fun rtlNormalizeSecurityDescriptor(securitydescriptor: MutPtr<PsecurityDescriptor>, securitydescriptorlength: UInt, newsecuritydescriptor: MutPtr<PsecurityDescriptor>, newsecuritydescriptorlength: MutPtr<UInt>, checkonly: Boolean): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlNormalizeSecurityDescriptor")

public actual fun rtlNumberGenericTableElements(table: ConstPtr<RtlGenericTable>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlNumberGenericTableElements")

public actual fun rtlNumberGenericTableElementsAvl(table: ConstPtr<RtlAvlTable>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlNumberGenericTableElementsAvl")

public actual fun rtlNumberOfClearBits(bitmapheader: ConstPtr<RtlBitmap>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlNumberOfClearBits")

public actual fun rtlNumberOfClearBitsInRange(bitmapheader: ConstPtr<RtlBitmap>, startingindex: UInt, length: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlNumberOfClearBitsInRange")

public actual fun rtlNumberOfSetBits(bitmapheader: ConstPtr<RtlBitmap>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlNumberOfSetBits")

public actual fun rtlNumberOfSetBitsInRange(bitmapheader: ConstPtr<RtlBitmap>, startingindex: UInt, length: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlNumberOfSetBitsInRange")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesRtlNumberOfSetBitsUlongPtr")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesRtlNumberOfSetBitsUlongPtr(target: Long): Int

public actual fun rtlNumberOfSetBitsUlongPtr(target: ULong): UInt =
    wasiWindowssysWindowsWdkSystemSystemservicesRtlNumberOfSetBitsUlongPtr(target.toLong()).toUInt()

public actual fun rtlPrefetchMemoryNonTemporal(source: ConstPtr<CVoid>, length: ULong): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlPrefetchMemoryNonTemporal")

public actual fun rtlPrefixUnicodeString(string1: ConstPtr<UnicodeString>, string2: ConstPtr<UnicodeString>, caseinsensitive: Boolean): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlPrefixUnicodeString")

public actual fun rtlQueryRegistryValueWithFallback(primaryhandle: Handle, fallbackhandle: Handle, valuename: ConstPtr<UnicodeString>, valuelength: UInt, valuetype: MutPtr<UInt>, valuedata: MutPtr<CVoid>, resultlength: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlQueryRegistryValueWithFallback")

public actual fun rtlQueryRegistryValues(relativeto: UInt, path: Pcwstr, querytable: MutPtr<RtlQueryRegistryTable>, context: ConstPtr<CVoid>, environment: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlQueryRegistryValues")

public actual fun rtlQueryValidationRunlevel(componentname: ConstPtr<UnicodeString>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlQueryValidationRunlevel")

public actual fun rtlRealPredecessor(links: ConstPtr<RtlSplayLinks>): MutPtr<RtlSplayLinks> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlRealPredecessor")

public actual fun rtlRealSuccessor(links: ConstPtr<RtlSplayLinks>): MutPtr<RtlSplayLinks> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlRealSuccessor")

public actual fun rtlRemoveEntryHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, entry: ConstPtr<RtlDynamicHashTableEntry>, context: MutPtr<RtlDynamicHashTableContext>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlRemoveEntryHashTable")

public actual fun rtlRunOnceBeginInitialize(runonce: MutPtr<InitOnce>, flags: UInt, context: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlRunOnceBeginInitialize")

public actual fun rtlRunOnceComplete(runonce: MutPtr<InitOnce>, flags: UInt, context: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlRunOnceComplete")

public actual fun rtlRunOnceExecuteOnce(runonce: MutPtr<InitOnce>, initfn: PrtlRunOnceInitFn, parameter: MutPtr<CVoid>, context: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlRunOnceExecuteOnce")

public actual fun rtlRunOnceInitialize(runonce: MutPtr<InitOnce>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlRunOnceInitialize")

public actual fun rtlSetAllBits(bitmapheader: ConstPtr<RtlBitmap>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlSetAllBits")

public actual fun rtlSetBit(bitmapheader: ConstPtr<RtlBitmap>, bitnumber: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlSetBit")

public actual fun rtlSetBits(bitmapheader: ConstPtr<RtlBitmap>, startingindex: UInt, numbertoset: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlSetBits")

public actual fun rtlSetDaclSecurityDescriptor(securitydescriptor: PsecurityDescriptor, daclpresent: Boolean, dacl: ConstPtr<Acl>, dacldefaulted: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlSetDaclSecurityDescriptor")

public actual fun rtlSetSystemGlobalData(dataid: RtlSystemGlobalDataId, buffer: ConstPtr<CVoid>, size: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlSetSystemGlobalData")

public actual fun rtlSplay(links: MutPtr<RtlSplayLinks>): MutPtr<RtlSplayLinks> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlSplay")

public actual fun rtlStringFromGUID(guid: ConstPtr<Guid>, guidstring: MutPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlStringFromGUID")

public actual fun rtlStronglyEnumerateEntryHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>): MutPtr<RtlDynamicHashTableEntry> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlStronglyEnumerateEntryHashTable")

public actual fun rtlSubtreePredecessor(links: ConstPtr<RtlSplayLinks>): MutPtr<RtlSplayLinks> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlSubtreePredecessor")

public actual fun rtlSubtreeSuccessor(links: ConstPtr<RtlSplayLinks>): MutPtr<RtlSplayLinks> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlSubtreeSuccessor")

public actual fun rtlSuffixUnicodeString(string1: ConstPtr<UnicodeString>, string2: ConstPtr<UnicodeString>, caseinsensitive: Boolean): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlSuffixUnicodeString")

public actual fun rtlTestBit(bitmapheader: ConstPtr<RtlBitmap>, bitnumber: UInt): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlTestBit")

public actual fun rtlTimeFieldsToTime(timefields: ConstPtr<TimeFields>, time: MutPtr<Long>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlTimeFieldsToTime")

public actual fun rtlTimeToTimeFields(time: ConstPtr<Long>, timefields: MutPtr<TimeFields>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlTimeToTimeFields")

public actual fun rtlUTF8StringToUnicodeString(destinationstring: MutPtr<UnicodeString>, sourcestring: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, allocatedestinationstring: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlUTF8StringToUnicodeString")

public actual fun rtlUTF8ToUnicodeN(unicodestringdestination: Pwstr, unicodestringmaxbytecount: UInt, unicodestringactualbytecount: MutPtr<UInt>, utf8stringsource: Pcstr, utf8stringbytecount: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlUTF8ToUnicodeN")

public actual fun rtlUnicodeStringToInt64(string: ConstPtr<UnicodeString>, base: UInt, number: MutPtr<Long>, endpointer: MutPtr<Pwstr>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlUnicodeStringToInt64")

public actual fun rtlUnicodeStringToInteger(string: ConstPtr<UnicodeString>, base: UInt, value: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlUnicodeStringToInteger")

public actual fun rtlUnicodeStringToUTF8String(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: ConstPtr<UnicodeString>, allocatedestinationstring: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlUnicodeStringToUTF8String")

public actual fun rtlUnicodeToUTF8N(utf8stringdestination: Pstr, utf8stringmaxbytecount: UInt, utf8stringactualbytecount: MutPtr<UInt>, unicodestringsource: ConstPtr<UShort>, unicodestringbytecount: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlUnicodeToUTF8N")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesRtlUpcaseUnicodeChar")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesRtlUpcaseUnicodeChar(sourcecharacter: Int): Int

public actual fun rtlUpcaseUnicodeChar(sourcecharacter: UShort): UShort =
    wasiWindowssysWindowsWdkSystemSystemservicesRtlUpcaseUnicodeChar(sourcecharacter.toInt()).toUShort()

public actual fun rtlUpcaseUnicodeString(destinationstring: MutPtr<UnicodeString>, sourcestring: ConstPtr<UnicodeString>, allocatedestinationstring: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlUpcaseUnicodeString")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesRtlUpperChar")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesRtlUpperChar(character: Int): Int

public actual fun rtlUpperChar(character: Byte): Byte =
    wasiWindowssysWindowsWdkSystemSystemservicesRtlUpperChar(character.toInt()).toByte()

public actual fun rtlUpperString(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlUpperString")

public actual fun rtlValidRelativeSecurityDescriptor(securitydescriptorinput: PsecurityDescriptor, securitydescriptorlength: UInt, requiredinformation: UInt): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlValidRelativeSecurityDescriptor")

public actual fun rtlValidSecurityDescriptor(securitydescriptor: PsecurityDescriptor): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlValidSecurityDescriptor")

public actual fun rtlVerifyVersionInfo(versioninfo: ConstPtr<Osversioninfoexw>, typemask: UInt, conditionmask: ULong): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlVerifyVersionInfo")

public actual fun rtlVolumeDeviceToDosName(volumedeviceobject: ConstPtr<CVoid>, dosname: MutPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlVolumeDeviceToDosName")

public actual fun rtlWalkFrameChain(callers: MutPtr<MutPtr<CVoid>>, count: UInt, flags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlWalkFrameChain")

public actual fun rtlWeaklyEnumerateEntryHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>): MutPtr<RtlDynamicHashTableEntry> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlWeaklyEnumerateEntryHashTable")

public actual fun rtlWriteRegistryValue(relativeto: UInt, path: Pcwstr, valuename: Pcwstr, valuetype: UInt, valuedata: ConstPtr<CVoid>, valuelength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlWriteRegistryValue")

public actual fun rtlxAnsiStringToUnicodeSize(ansistring: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlxAnsiStringToUnicodeSize")

public actual fun rtlxUnicodeStringToAnsiSize(unicodestring: ConstPtr<UnicodeString>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesRtlxUnicodeStringToAnsiSize")

public actual fun seAccessCheck(securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr<SecuritySubjectContext>, subjectcontextlocked: Boolean, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: MutPtr<MutPtr<PrivilegeSet>>, genericmapping: ConstPtr<GenericMapping>, accessmode: Byte, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Int>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesSeAccessCheck")

public actual fun seAssignSecurity(parentdescriptor: PsecurityDescriptor, explicitdescriptor: PsecurityDescriptor, newdescriptor: MutPtr<PsecurityDescriptor>, isdirectoryobject: Boolean, subjectcontext: ConstPtr<SecuritySubjectContext>, genericmapping: ConstPtr<GenericMapping>, pooltype: PoolType): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesSeAssignSecurity")

public actual fun seAssignSecurityEx(parentdescriptor: PsecurityDescriptor, explicitdescriptor: PsecurityDescriptor, newdescriptor: MutPtr<PsecurityDescriptor>, objecttype: ConstPtr<Guid>, isdirectoryobject: Boolean, autoinheritflags: UInt, subjectcontext: ConstPtr<SecuritySubjectContext>, genericmapping: ConstPtr<GenericMapping>, pooltype: PoolType): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesSeAssignSecurityEx")

public actual fun seCaptureSubjectContext(subjectcontext: MutPtr<SecuritySubjectContext>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesSeCaptureSubjectContext")

public actual fun seComputeAutoInheritByObjectType(objecttype: ConstPtr<CVoid>, securitydescriptor: PsecurityDescriptor, parentsecuritydescriptor: PsecurityDescriptor): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesSeComputeAutoInheritByObjectType")

public actual fun seDeassignSecurity(securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesSeDeassignSecurity")

public actual fun seEtwWriteKMCveEvent(cveid: ConstPtr<UnicodeString>, additionaldetails: ConstPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesSeEtwWriteKMCveEvent")

public actual fun seLockSubjectContext(subjectcontext: ConstPtr<SecuritySubjectContext>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesSeLockSubjectContext")

public actual fun seRegisterImageVerificationCallback(imagetype: SeImageType, callbacktype: SeImageVerificationCallbackType, callbackfunction: PseImageVerificationCallbackFunction, callbackcontext: ConstPtr<CVoid>, token: ConstPtr<CVoid>, callbackhandle: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesSeRegisterImageVerificationCallback")

public actual fun seReleaseSubjectContext(subjectcontext: MutPtr<SecuritySubjectContext>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesSeReleaseSubjectContext")

public actual fun seReportSecurityEvent(flags: UInt, sourcename: ConstPtr<UnicodeString>, usersid: Psid, auditparameters: ConstPtr<SeAdtParameterArray>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesSeReportSecurityEvent")

public actual fun seSetAuditParameter(auditparameters: MutPtr<SeAdtParameterArray>, type: SeAdtParameterType, index: UInt, data: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesSeSetAuditParameter")

public actual fun seSinglePrivilegeCheck(privilegevalue: Luid, previousmode: Byte): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesSeSinglePrivilegeCheck")

public actual fun seUnlockSubjectContext(subjectcontext: ConstPtr<SecuritySubjectContext>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesSeUnlockSubjectContext")

public actual fun seUnregisterImageVerificationCallback(callbackhandle: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesSeUnregisterImageVerificationCallback")

public actual fun seValidSecurityDescriptor(length: UInt, securitydescriptor: PsecurityDescriptor): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesSeValidSecurityDescriptor")

public actual fun tmCommitComplete(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesTmCommitComplete")

public actual fun tmCommitEnlistment(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesTmCommitEnlistment")

public actual fun tmCommitTransaction(transaction: ConstPtr<Ktransaction>, wait: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesTmCommitTransaction")

public actual fun tmCreateEnlistment(enlistmenthandle: MutPtr<Handle>, previousmode: Byte, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, resourcemanager: ConstPtr<Long>, transaction: ConstPtr<Ktransaction>, createoptions: UInt, notificationmask: UInt, enlistmentkey: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesTmCreateEnlistment")

public actual fun tmDereferenceEnlistmentKey(enlistment: ConstPtr<Kenlistment>, lastreference: MutPtr<Boolean>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesTmDereferenceEnlistmentKey")

public actual fun tmEnableCallbacks(resourcemanager: ConstPtr<Kresourcemanager>, callbackroutine: PtmRmNotification, rmkey: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesTmEnableCallbacks")

public actual fun tmGetTransactionId(transaction: ConstPtr<Ktransaction>, transactionid: MutPtr<Guid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesTmGetTransactionId")

public actual fun tmInitializeTransactionManager(transactionmanager: ConstPtr<Long>, logfilename: ConstPtr<UnicodeString>, tmid: ConstPtr<Guid>, createoptions: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesTmInitializeTransactionManager")

public actual fun tmIsTransactionActive(transaction: ConstPtr<Ktransaction>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesTmIsTransactionActive")

public actual fun tmPrePrepareComplete(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesTmPrePrepareComplete")

public actual fun tmPrePrepareEnlistment(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesTmPrePrepareEnlistment")

public actual fun tmPrepareComplete(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesTmPrepareComplete")

public actual fun tmPrepareEnlistment(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesTmPrepareEnlistment")

public actual fun tmPropagationComplete(resourcemanager: ConstPtr<Kresourcemanager>, requestcookie: UInt, bufferlength: UInt, buffer: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesTmPropagationComplete")

public actual fun tmPropagationFailed(resourcemanager: ConstPtr<Kresourcemanager>, requestcookie: UInt, status: Ntstatus): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesTmPropagationFailed")

public actual fun tmReadOnlyEnlistment(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesTmReadOnlyEnlistment")

public actual fun tmRecoverEnlistment(enlistment: ConstPtr<Kenlistment>, enlistmentkey: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesTmRecoverEnlistment")

public actual fun tmRecoverResourceManager(resourcemanager: ConstPtr<Kresourcemanager>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesTmRecoverResourceManager")

public actual fun tmRecoverTransactionManager(tm: ConstPtr<Ktm>, targetvirtualclock: ConstPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesTmRecoverTransactionManager")

public actual fun tmReferenceEnlistmentKey(enlistment: ConstPtr<Kenlistment>, key: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesTmReferenceEnlistmentKey")

public actual fun tmRenameTransactionManager(logfilename: ConstPtr<UnicodeString>, existingtransactionmanagerguid: ConstPtr<Guid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesTmRenameTransactionManager")

public actual fun tmRequestOutcomeEnlistment(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesTmRequestOutcomeEnlistment")

public actual fun tmRollbackComplete(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesTmRollbackComplete")

public actual fun tmRollbackEnlistment(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesTmRollbackEnlistment")

public actual fun tmRollbackTransaction(transaction: ConstPtr<Ktransaction>, wait: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesTmRollbackTransaction")

public actual fun tmSinglePhaseReject(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesTmSinglePhaseReject")

public actual fun vslCreateSecureSection(handle: MutPtr<Handle>, targetprocess: Peprocess, mdl: ConstPtr<Mdl>, devicepageprotection: UInt, attributes: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesVslCreateSecureSection")

public actual fun vslDeleteSecureSection(globalhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesVslDeleteSecureSection")

public actual fun wheaAddErrorSource(errorsource: ConstPtr<WheaErrorSourceDescriptor>, context: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesWheaAddErrorSource")

public actual fun wheaAddErrorSourceDeviceDriver(context: MutPtr<CVoid>, configuration: ConstPtr<WheaErrorSourceConfigurationDeviceDriver>, numberpreallocatederrorreports: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesWheaAddErrorSourceDeviceDriver")

public actual fun wheaAddErrorSourceDeviceDriverV1(context: MutPtr<CVoid>, configuration: ConstPtr<WheaErrorSourceConfigurationDeviceDriver>, numbufferstopreallocate: UInt, maxdatalength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesWheaAddErrorSourceDeviceDriverV1")

public actual fun wheaAddHwErrorReportSectionDeviceDriver(errorhandle: ConstPtr<CVoid>, sectiondatalength: UInt, bufferset: MutPtr<WheaDriverBufferSet>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesWheaAddHwErrorReportSectionDeviceDriver")

public actual fun wheaConfigureErrorSource(sourcetype: WheaErrorSourceType, configuration: ConstPtr<WheaErrorSourceConfiguration>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesWheaConfigureErrorSource")

public actual fun wheaCreateHwErrorReportDeviceDriver(errorsourceid: UInt, deviceobject: ConstPtr<DeviceObject>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesWheaCreateHwErrorReportDeviceDriver")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesWheaErrorSourceGetState")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesWheaErrorSourceGetState(errorsourceid: Int): Int

public actual fun wheaErrorSourceGetState(errorsourceid: UInt): WheaErrorSourceState =
    wasiWindowssysWindowsWdkSystemSystemservicesWheaErrorSourceGetState(errorsourceid.toInt()).toInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesWheaGetNotifyAllOfflinesPolicy")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesWheaGetNotifyAllOfflinesPolicy(): Int

public actual fun wheaGetNotifyAllOfflinesPolicy(): Boolean =
    (wasiWindowssysWindowsWdkSystemSystemservicesWheaGetNotifyAllOfflinesPolicy() != 0)

public actual fun wheaHighIrqlLogSelEventHandlerRegister(handler: PfnWheaHighIrqlLogSelEventHandler, context: ConstPtr<CVoid>): Boolean =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesWheaHighIrqlLogSelEventHandlerRegister")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesWheaHighIrqlLogSelEventHandlerUnregister")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesWheaHighIrqlLogSelEventHandlerUnregister(): Unit

public actual fun wheaHighIrqlLogSelEventHandlerUnregister(): Unit =
    wasiWindowssysWindowsWdkSystemSystemservicesWheaHighIrqlLogSelEventHandlerUnregister()

public actual fun wheaHwErrorReportAbandonDeviceDriver(errorhandle: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesWheaHwErrorReportAbandonDeviceDriver")

public actual fun wheaHwErrorReportSetSectionNameDeviceDriver(bufferset: ConstPtr<WheaDriverBufferSet>, namelength: UInt, name: ConstPtr<UByte>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesWheaHwErrorReportSetSectionNameDeviceDriver")

public actual fun wheaHwErrorReportSetSeverityDeviceDriver(errorhandle: ConstPtr<CVoid>, errorseverity: WheaErrorSeverity): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesWheaHwErrorReportSetSeverityDeviceDriver")

public actual fun wheaHwErrorReportSubmitDeviceDriver(errorhandle: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesWheaHwErrorReportSubmitDeviceDriver")

public actual fun wheaInitializeRecordHeader(header: MutPtr<WheaErrorRecordHeader>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesWheaInitializeRecordHeader")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesWheaIsCriticalState")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesWheaIsCriticalState(): Int

public actual fun wheaIsCriticalState(): Boolean =
    (wasiWindowssysWindowsWdkSystemSystemservicesWheaIsCriticalState() != 0)

public actual fun wheaLogInternalEvent(entry: ConstPtr<WheaEventLogEntry>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesWheaLogInternalEvent")

public actual fun wheaRegisterInUsePageOfflineNotification(callback: PfnInUsePageOfflineNotify, context: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesWheaRegisterInUsePageOfflineNotification")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesWheaRemoveErrorSource")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesWheaRemoveErrorSource(errorsourceid: Int): Unit

public actual fun wheaRemoveErrorSource(errorsourceid: UInt): Unit =
    wasiWindowssysWindowsWdkSystemSystemservicesWheaRemoveErrorSource(errorsourceid.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesWheaRemoveErrorSourceDeviceDriver")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesWheaRemoveErrorSourceDeviceDriver(errorsourceid: Int): Int

public actual fun wheaRemoveErrorSourceDeviceDriver(errorsourceid: UInt): Ntstatus =
    wasiWindowssysWindowsWdkSystemSystemservicesWheaRemoveErrorSourceDeviceDriver(errorsourceid.toInt()).toInt()

public actual fun wheaReportHwError(errorpacket: MutPtr<WheaErrorPacketV2>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesWheaReportHwError")

public actual fun wheaReportHwErrorDeviceDriver(errorsourceid: UInt, deviceobject: ConstPtr<DeviceObject>, errordata: ConstPtr<UByte>, errordatalength: UInt, sectiontypeguid: ConstPtr<Guid>, errorseverity: WheaErrorSeverity, devicefriendlyname: Pcstr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesWheaReportHwErrorDeviceDriver")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemSystemservicesWheaUnconfigureErrorSource")
private external fun wasiWindowssysWindowsWdkSystemSystemservicesWheaUnconfigureErrorSource(sourcetype: Int): Int

public actual fun wheaUnconfigureErrorSource(sourcetype: WheaErrorSourceType): Ntstatus =
    wasiWindowssysWindowsWdkSystemSystemservicesWheaUnconfigureErrorSource(sourcetype).toInt()

public actual fun wheaUnregisterInUsePageOfflineNotification(callback: PfnInUsePageOfflineNotify): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesWheaUnregisterInUsePageOfflineNotification")

public actual fun wmiQueryTraceInformation(traceinformationclass: TraceInformationClass, traceinformation: MutPtr<CVoid>, traceinformationlength: UInt, requiredlength: MutPtr<UInt>, buffer: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesWmiQueryTraceInformation")

public actual fun zwAllocateLocallyUniqueId(luid: MutPtr<Luid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwAllocateLocallyUniqueId")

public actual fun zwClose(handle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwClose")

public actual fun zwCommitComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwCommitComplete")

public actual fun zwCommitEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwCommitEnlistment")

public actual fun zwCommitTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwCommitTransaction")

public actual fun zwCreateEnlistment(enlistmenthandle: MutPtr<Handle>, desiredaccess: UInt, resourcemanagerhandle: Handle, transactionhandle: Handle, objectattributes: ConstPtr<ObjectAttributes>, createoptions: UInt, notificationmask: UInt, enlistmentkey: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwCreateEnlistment")

public actual fun zwCreateFile(filehandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, allocationsize: ConstPtr<Long>, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: ConstPtr<CVoid>, ealength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwCreateFile")

public actual fun zwCreateResourceManager(resourcemanagerhandle: MutPtr<Handle>, desiredaccess: UInt, tmhandle: Handle, resourcemanagerguid: ConstPtr<Guid>, objectattributes: ConstPtr<ObjectAttributes>, createoptions: UInt, description: ConstPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwCreateResourceManager")

public actual fun zwCreateSection(sectionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, maximumsize: ConstPtr<Long>, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwCreateSection")

public actual fun zwCreateTransaction(transactionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, uow: ConstPtr<Guid>, tmhandle: Handle, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: ConstPtr<Long>, description: ConstPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwCreateTransaction")

public actual fun zwCreateTransactionManager(tmhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, logfilename: ConstPtr<UnicodeString>, createoptions: UInt, commitstrength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwCreateTransactionManager")

public actual fun zwDeviceIoControlFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, iocontrolcode: UInt, inputbuffer: ConstPtr<CVoid>, inputbufferlength: UInt, outputbuffer: MutPtr<CVoid>, outputbufferlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwDeviceIoControlFile")

public actual fun zwDisplayString(string: ConstPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwDisplayString")

public actual fun zwEnumerateTransactionObject(rootobjecthandle: Handle, querytype: KtmobjectType, objectcursor: MutPtr<KtmobjectCursor>, objectcursorlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwEnumerateTransactionObject")

public actual fun zwGetNotificationResourceManager(resourcemanagerhandle: Handle, transactionnotification: MutPtr<TransactionNotification>, notificationlength: UInt, timeout: ConstPtr<Long>, returnlength: MutPtr<UInt>, asynchronous: UInt, asynchronouscontext: ULong): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwGetNotificationResourceManager")

public actual fun zwLoadDriver(driverservicename: ConstPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwLoadDriver")

public actual fun zwMakeTemporaryObject(handle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwMakeTemporaryObject")

public actual fun zwManagePartition(targethandle: Handle, sourcehandle: Handle, partitioninformationclass: PartitionInformationClass, partitioninformation: MutPtr<CVoid>, partitioninformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwManagePartition")

public actual fun zwOpenEnlistment(enlistmenthandle: MutPtr<Handle>, desiredaccess: UInt, rmhandle: Handle, enlistmentguid: ConstPtr<Guid>, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwOpenEnlistment")

public actual fun zwOpenFile(filehandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, shareaccess: UInt, openoptions: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwOpenFile")

public actual fun zwOpenResourceManager(resourcemanagerhandle: MutPtr<Handle>, desiredaccess: UInt, tmhandle: Handle, resourcemanagerguid: ConstPtr<Guid>, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwOpenResourceManager")

public actual fun zwOpenSymbolicLinkObject(linkhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwOpenSymbolicLinkObject")

public actual fun zwOpenTransaction(transactionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, uow: ConstPtr<Guid>, tmhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwOpenTransaction")

public actual fun zwOpenTransactionManager(tmhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, logfilename: ConstPtr<UnicodeString>, tmidentity: ConstPtr<Guid>, openoptions: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwOpenTransactionManager")

public actual fun zwPowerInformation(informationlevel: PowerInformationLevel, inputbuffer: ConstPtr<CVoid>, inputbufferlength: UInt, outputbuffer: MutPtr<CVoid>, outputbufferlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwPowerInformation")

public actual fun zwPrePrepareComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwPrePrepareComplete")

public actual fun zwPrePrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwPrePrepareEnlistment")

public actual fun zwPrepareComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwPrepareComplete")

public actual fun zwPrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwPrepareEnlistment")

public actual fun zwPropagationComplete(resourcemanagerhandle: Handle, requestcookie: UInt, bufferlength: UInt, buffer: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwPropagationComplete")

public actual fun zwPropagationFailed(resourcemanagerhandle: Handle, requestcookie: UInt, propstatus: Ntstatus): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwPropagationFailed")

public actual fun zwQueryInformationByName(objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwQueryInformationByName")

public actual fun zwQueryInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: MutPtr<CVoid>, enlistmentinformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwQueryInformationEnlistment")

public actual fun zwQueryInformationFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwQueryInformationFile")

public actual fun zwQueryInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: MutPtr<CVoid>, resourcemanagerinformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwQueryInformationResourceManager")

public actual fun zwQueryInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: MutPtr<CVoid>, transactioninformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwQueryInformationTransaction")

public actual fun zwQueryInformationTransactionManager(transactionmanagerhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: MutPtr<CVoid>, transactionmanagerinformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwQueryInformationTransactionManager")

public actual fun zwQuerySymbolicLinkObject(linkhandle: Handle, linktarget: MutPtr<UnicodeString>, returnedlength: MutPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwQuerySymbolicLinkObject")

public actual fun zwReadFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, buffer: MutPtr<CVoid>, length: UInt, byteoffset: ConstPtr<Long>, key: ConstPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwReadFile")

public actual fun zwReadOnlyEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwReadOnlyEnlistment")

public actual fun zwRecoverEnlistment(enlistmenthandle: Handle, enlistmentkey: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwRecoverEnlistment")

public actual fun zwRecoverResourceManager(resourcemanagerhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwRecoverResourceManager")

public actual fun zwRecoverTransactionManager(transactionmanagerhandle: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwRecoverTransactionManager")

public actual fun zwRegisterProtocolAddressInformation(resourcemanager: Handle, protocolid: ConstPtr<Guid>, protocolinformationsize: UInt, protocolinformation: ConstPtr<CVoid>, createoptions: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwRegisterProtocolAddressInformation")

public actual fun zwRenameTransactionManager(logfilename: ConstPtr<UnicodeString>, existingtransactionmanagerguid: ConstPtr<Guid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwRenameTransactionManager")

public actual fun zwRollbackComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwRollbackComplete")

public actual fun zwRollbackEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwRollbackEnlistment")

public actual fun zwRollbackTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwRollbackTransaction")

public actual fun zwRollforwardTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwRollforwardTransactionManager")

public actual fun zwSetInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: ConstPtr<CVoid>, enlistmentinformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwSetInformationEnlistment")

public actual fun zwSetInformationFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: ConstPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwSetInformationFile")

public actual fun zwSetInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: ConstPtr<CVoid>, resourcemanagerinformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwSetInformationResourceManager")

public actual fun zwSetInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: ConstPtr<CVoid>, transactioninformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwSetInformationTransaction")

public actual fun zwSetInformationTransactionManager(tmhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: ConstPtr<CVoid>, transactionmanagerinformationlength: UInt): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwSetInformationTransactionManager")

public actual fun zwSinglePhaseReject(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwSinglePhaseReject")

public actual fun zwUnloadDriver(driverservicename: ConstPtr<UnicodeString>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwUnloadDriver")

public actual fun zwWriteFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, buffer: ConstPtr<CVoid>, length: UInt, byteoffset: ConstPtr<Long>, key: ConstPtr<UInt>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesZwWriteFile")

public actual fun vDbgPrintEx(componentid: UInt, level: UInt, format: Pcstr, arglist: ConstPtr<Byte>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesVDbgPrintEx")

public actual fun vDbgPrintExWithPrefix(prefix: Pcstr, componentid: UInt, level: UInt, format: Pcstr, arglist: ConstPtr<Byte>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemSystemservicesVDbgPrintExWithPrefix")
