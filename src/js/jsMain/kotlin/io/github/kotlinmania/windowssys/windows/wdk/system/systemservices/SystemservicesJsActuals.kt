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

private val windowsWdkSystemSystemservicesNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun clfsAddLogContainer(plfolog: ConstPtr<FileObject>, pcbcontainer: ConstPtr<ULong>, puszcontainerpath: ConstPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsAddLogContainer(plfolog.rawAddress.toString(), pcbcontainer.rawAddress.toString(), puszcontainerpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsAddLogContainerSet(plfolog: ConstPtr<FileObject>, ccontainers: UShort, pcbcontainer: ConstPtr<ULong>, rguszcontainerpath: ConstPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsAddLogContainerSet(plfolog.rawAddress.toString(), ccontainers.toInt(), pcbcontainer.rawAddress.toString(), rguszcontainerpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsAdvanceLogBase(pvmarshalcontext: MutPtr<CVoid>, plsnbase: ConstPtr<ClsLsn>, fflags: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsAdvanceLogBase(pvmarshalcontext.rawAddress.toString(), plsnbase.rawAddress.toString(), fflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsAlignReservedLog(pvmarshalcontext: ConstPtr<CVoid>, crecords: UInt, rgcbreservation: ConstPtr<Long>, pcbalignreservation: MutPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsAlignReservedLog(pvmarshalcontext.rawAddress.toString(), crecords.toInt(), rgcbreservation.rawAddress.toString(), pcbalignreservation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsAllocReservedLog(pvmarshalcontext: ConstPtr<CVoid>, crecords: UInt, pcbadjustment: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsAllocReservedLog(pvmarshalcontext.rawAddress.toString(), crecords.toInt(), pcbadjustment.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsCloseAndResetLogFile(plfolog: ConstPtr<FileObject>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsCloseAndResetLogFile(plfolog.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsCloseLogFileObject(plfolog: ConstPtr<FileObject>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsCloseLogFileObject(plfolog.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsCreateLogFile(pplfolog: MutPtr<MutPtr<FileObject>>, puszlogfilename: ConstPtr<UnicodeString>, fdesiredaccess: UInt, dwsharemode: UInt, psdlogfile: PsecurityDescriptor, fcreatedisposition: UInt, fcreateoptions: UInt, fflagsandattributes: UInt, flogoptionflag: UInt, pvcontext: ConstPtr<CVoid>, cbcontext: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsCreateLogFile(pplfolog.rawAddress.toString(), puszlogfilename.rawAddress.toString(), fdesiredaccess.toInt(), dwsharemode.toInt(), psdlogfile.rawAddress.toString(), fcreatedisposition.toInt(), fcreateoptions.toInt(), fflagsandattributes.toInt(), flogoptionflag.toInt(), pvcontext.rawAddress.toString(), cbcontext.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsCreateMarshallingArea(plfolog: ConstPtr<FileObject>, epooltype: PoolType, pfnallocbuffer: PallocateFunction, pfnfreebuffer: PfreeFunction, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, ppvmarshalcontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsCreateMarshallingAreaEx(plfolog: ConstPtr<FileObject>, epooltype: PoolType, pfnallocbuffer: PallocateFunction, pfnfreebuffer: PfreeFunction, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, calignmentsize: UInt, fflags: ULong, ppvmarshalcontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsCreateScanContext(plfolog: ConstPtr<FileObject>, cfromcontainer: UInt, ccontainers: UInt, escanmode: UByte, pcxscan: MutPtr<ClsScanContext>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsCreateScanContext(plfolog.rawAddress.toString(), cfromcontainer.toInt(), ccontainers.toInt(), escanmode.toInt(), pcxscan.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsDeleteLogByPointer(plfolog: ConstPtr<FileObject>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsDeleteLogByPointer(plfolog.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsDeleteLogFile(puszlogfilename: ConstPtr<UnicodeString>, pvreserved: ConstPtr<CVoid>, flogoptionflag: UInt, pvcontext: ConstPtr<CVoid>, cbcontext: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsDeleteLogFile(puszlogfilename.rawAddress.toString(), pvreserved.rawAddress.toString(), flogoptionflag.toInt(), pvcontext.rawAddress.toString(), cbcontext.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsDeleteMarshallingArea(pvmarshalcontext: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsDeleteMarshallingArea(pvmarshalcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsEarlierLsn(plsn: ConstPtr<ClsLsn>): ClsLsn =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsFinalize() {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsFinalize()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun clfsFlushBuffers(pvmarshalcontext: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsFlushBuffers(pvmarshalcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsFlushToLsn(pvmarshalcontext: ConstPtr<CVoid>, plsnflush: ConstPtr<ClsLsn>, plsnlastflushed: MutPtr<ClsLsn>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsFlushToLsn(pvmarshalcontext.rawAddress.toString(), plsnflush.rawAddress.toString(), plsnlastflushed.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsFreeReservedLog(pvmarshalcontext: ConstPtr<CVoid>, crecords: UInt, pcbadjustment: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsFreeReservedLog(pvmarshalcontext.rawAddress.toString(), crecords.toInt(), pcbadjustment.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsGetContainerName(plfolog: ConstPtr<FileObject>, cidlogicalcontainer: UInt, puszcontainername: MutPtr<UnicodeString>, pcactuallencontainername: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsGetContainerName(plfolog.rawAddress.toString(), cidlogicalcontainer.toInt(), puszcontainername.rawAddress.toString(), pcactuallencontainername.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsGetIoStatistics(plfolog: ConstPtr<FileObject>, pvstatsbuffer: MutPtr<CVoid>, cbstatsbuffer: UInt, estatsclass: ClfsIostatsClass, pcbstatswritten: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsGetIoStatistics(plfolog.rawAddress.toString(), pvstatsbuffer.rawAddress.toString(), cbstatsbuffer.toInt(), estatsclass, pcbstatswritten.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsGetLogFileInformation(plfolog: ConstPtr<FileObject>, pinfobuffer: MutPtr<ClsInformation>, pcbinfobuffer: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsGetLogFileInformation(plfolog.rawAddress.toString(), pinfobuffer.rawAddress.toString(), pcbinfobuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsInitialize(): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsInitialize() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsLaterLsn(plsn: ConstPtr<ClsLsn>): ClsLsn =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsLsnBlockOffset(plsn: ConstPtr<ClsLsn>): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsLsnBlockOffset(plsn.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsLsnContainer(plsn: ConstPtr<ClsLsn>): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsLsnContainer(plsn.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsLsnCreate(cidcontainer: UInt, offblock: UInt, crecord: UInt): ClsLsn =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsLsnDifference(plsnstart: ConstPtr<ClsLsn>, plsnfinish: ConstPtr<ClsLsn>, cbcontainer: UInt, cbmaxblock: UInt, pcbdifference: MutPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsLsnDifference(plsnstart.rawAddress.toString(), plsnfinish.rawAddress.toString(), cbcontainer.toInt(), cbmaxblock.toInt(), pcbdifference.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsLsnEqual(plsn1: ConstPtr<ClsLsn>, plsn2: ConstPtr<ClsLsn>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsLsnEqual(plsn1.rawAddress.toString(), plsn2.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsLsnGreater(plsn1: ConstPtr<ClsLsn>, plsn2: ConstPtr<ClsLsn>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsLsnGreater(plsn1.rawAddress.toString(), plsn2.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsLsnInvalid(plsn: ConstPtr<ClsLsn>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsLsnInvalid(plsn.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsLsnLess(plsn1: ConstPtr<ClsLsn>, plsn2: ConstPtr<ClsLsn>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsLsnLess(plsn1.rawAddress.toString(), plsn2.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsLsnNull(plsn: ConstPtr<ClsLsn>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsLsnNull(plsn.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsLsnRecordSequence(plsn: ConstPtr<ClsLsn>): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsLsnRecordSequence(plsn.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsMgmtDeregisterManagedClient(clientcookie: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsMgmtDeregisterManagedClient(clientcookie.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsMgmtHandleLogFileFull(client: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsMgmtHandleLogFileFull(client.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsMgmtInstallPolicy(logfile: ConstPtr<FileObject>, policy: ConstPtr<ClfsMgmtPolicy>, policylength: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsMgmtInstallPolicy(logfile.rawAddress.toString(), policy.rawAddress.toString(), policylength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsMgmtQueryPolicy(logfile: ConstPtr<FileObject>, policytype: ClfsMgmtPolicyType, policy: MutPtr<ClfsMgmtPolicy>, policylength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsMgmtQueryPolicy(logfile.rawAddress.toString(), policytype, policy.rawAddress.toString(), policylength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsMgmtRegisterManagedClient(logfile: ConstPtr<FileObject>, registrationdata: ConstPtr<ClfsMgmtClientRegistration>, clientcookie: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsMgmtRegisterManagedClient(logfile.rawAddress.toString(), registrationdata.rawAddress.toString(), clientcookie.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsMgmtRemovePolicy(logfile: ConstPtr<FileObject>, policytype: ClfsMgmtPolicyType): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsMgmtRemovePolicy(logfile.rawAddress.toString(), policytype) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsMgmtSetLogFileSize(logfile: ConstPtr<FileObject>, newsizeincontainers: ConstPtr<ULong>, resultingsizeincontainers: MutPtr<ULong>, completionroutine: PclfsSetLogSizeCompleteCallback, completionroutinedata: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsMgmtSetLogFileSize(logfile.rawAddress.toString(), newsizeincontainers.rawAddress.toString(), resultingsizeincontainers.rawAddress.toString(), 0L.toString(), completionroutinedata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsMgmtSetLogFileSizeAsClient(logfile: ConstPtr<FileObject>, clientcookie: ConstPtr<ConstPtr<CVoid>>, newsizeincontainers: ConstPtr<ULong>, resultingsizeincontainers: MutPtr<ULong>, completionroutine: PclfsSetLogSizeCompleteCallback, completionroutinedata: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsMgmtSetLogFileSizeAsClient(logfile.rawAddress.toString(), clientcookie.rawAddress.toString(), newsizeincontainers.rawAddress.toString(), resultingsizeincontainers.rawAddress.toString(), 0L.toString(), completionroutinedata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsMgmtTailAdvanceFailure(client: ConstPtr<CVoid>, reason: Ntstatus): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsMgmtTailAdvanceFailure(client.rawAddress.toString(), reason) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsQueryLogFileInformation(plfolog: ConstPtr<FileObject>, einformationclass: ClsLogInformationClass, pinfoinputbuffer: ConstPtr<CVoid>, cbinfoinputbuffer: UInt, pinfobuffer: MutPtr<CVoid>, pcbinfobuffer: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsQueryLogFileInformation(plfolog.rawAddress.toString(), einformationclass, pinfoinputbuffer.rawAddress.toString(), cbinfoinputbuffer.toInt(), pinfobuffer.rawAddress.toString(), pcbinfobuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsReadLogRecord(pvmarshalcontext: ConstPtr<CVoid>, plsnfirst: MutPtr<ClsLsn>, pecontextmode: ClfsContextMode, ppvreadbuffer: MutPtr<MutPtr<CVoid>>, pcbreadbuffer: MutPtr<UInt>, perecordtype: MutPtr<UByte>, plsnundonext: MutPtr<ClsLsn>, plsnprevious: MutPtr<ClsLsn>, ppvreadcontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsReadLogRecord(pvmarshalcontext.rawAddress.toString(), plsnfirst.rawAddress.toString(), pecontextmode, ppvreadbuffer.rawAddress.toString(), pcbreadbuffer.rawAddress.toString(), perecordtype.rawAddress.toString(), plsnundonext.rawAddress.toString(), plsnprevious.rawAddress.toString(), ppvreadcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsReadNextLogRecord(pvreadcontext: MutPtr<CVoid>, ppvbuffer: MutPtr<MutPtr<CVoid>>, pcbbuffer: MutPtr<UInt>, perecordtype: MutPtr<UByte>, plsnuser: ConstPtr<ClsLsn>, plsnundonext: MutPtr<ClsLsn>, plsnprevious: MutPtr<ClsLsn>, plsnrecord: MutPtr<ClsLsn>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsReadNextLogRecord(pvreadcontext.rawAddress.toString(), ppvbuffer.rawAddress.toString(), pcbbuffer.rawAddress.toString(), perecordtype.rawAddress.toString(), plsnuser.rawAddress.toString(), plsnundonext.rawAddress.toString(), plsnprevious.rawAddress.toString(), plsnrecord.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsReadPreviousRestartArea(pvreadcontext: ConstPtr<CVoid>, ppvrestartbuffer: MutPtr<MutPtr<CVoid>>, pcbrestartbuffer: MutPtr<UInt>, plsnrestart: MutPtr<ClsLsn>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsReadPreviousRestartArea(pvreadcontext.rawAddress.toString(), ppvrestartbuffer.rawAddress.toString(), pcbrestartbuffer.rawAddress.toString(), plsnrestart.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsReadRestartArea(pvmarshalcontext: MutPtr<CVoid>, ppvrestartbuffer: MutPtr<MutPtr<CVoid>>, pcbrestartbuffer: MutPtr<UInt>, plsn: MutPtr<ClsLsn>, ppvreadcontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsReadRestartArea(pvmarshalcontext.rawAddress.toString(), ppvrestartbuffer.rawAddress.toString(), pcbrestartbuffer.rawAddress.toString(), plsn.rawAddress.toString(), ppvreadcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsRemoveLogContainer(plfolog: ConstPtr<FileObject>, puszcontainerpath: ConstPtr<UnicodeString>, fforce: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsRemoveLogContainer(plfolog.rawAddress.toString(), puszcontainerpath.rawAddress.toString(), fforce) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsRemoveLogContainerSet(plfolog: ConstPtr<FileObject>, ccontainers: UShort, rgwszcontainerpath: ConstPtr<UnicodeString>, fforce: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsRemoveLogContainerSet(plfolog.rawAddress.toString(), ccontainers.toInt(), rgwszcontainerpath.rawAddress.toString(), fforce) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsReserveAndAppendLog(pvmarshalcontext: ConstPtr<CVoid>, rgwriteentries: ConstPtr<ClsWriteEntry>, cwriteentries: UInt, plsnundonext: ConstPtr<ClsLsn>, plsnprevious: ConstPtr<ClsLsn>, creserverecords: UInt, rgcbreservation: MutPtr<Long>, fflags: UInt, plsn: MutPtr<ClsLsn>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsReserveAndAppendLog(pvmarshalcontext.rawAddress.toString(), rgwriteentries.rawAddress.toString(), cwriteentries.toInt(), plsnundonext.rawAddress.toString(), plsnprevious.rawAddress.toString(), creserverecords.toInt(), rgcbreservation.rawAddress.toString(), fflags.toInt(), plsn.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsReserveAndAppendLogAligned(pvmarshalcontext: ConstPtr<CVoid>, rgwriteentries: ConstPtr<ClsWriteEntry>, cwriteentries: UInt, cbentryalignment: UInt, plsnundonext: ConstPtr<ClsLsn>, plsnprevious: ConstPtr<ClsLsn>, creserverecords: UInt, rgcbreservation: MutPtr<Long>, fflags: UInt, plsn: MutPtr<ClsLsn>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsReserveAndAppendLogAligned(pvmarshalcontext.rawAddress.toString(), rgwriteentries.rawAddress.toString(), cwriteentries.toInt(), cbentryalignment.toInt(), plsnundonext.rawAddress.toString(), plsnprevious.rawAddress.toString(), creserverecords.toInt(), rgcbreservation.rawAddress.toString(), fflags.toInt(), plsn.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsScanLogContainers(pcxscan: MutPtr<ClsScanContext>, escanmode: UByte): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsScanLogContainers(pcxscan.rawAddress.toString(), escanmode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsSetArchiveTail(plfolog: ConstPtr<FileObject>, plsnarchivetail: ConstPtr<ClsLsn>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsSetArchiveTail(plfolog.rawAddress.toString(), plsnarchivetail.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsSetEndOfLog(plfolog: ConstPtr<FileObject>, plsnend: ConstPtr<ClsLsn>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsSetEndOfLog(plfolog.rawAddress.toString(), plsnend.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsSetLogFileInformation(plfolog: ConstPtr<FileObject>, einformationclass: ClsLogInformationClass, pinfobuffer: ConstPtr<CVoid>, cbbuffer: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsSetLogFileInformation(plfolog.rawAddress.toString(), einformationclass, pinfobuffer.rawAddress.toString(), cbbuffer.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsTerminateReadLog(pvcursorcontext: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsTerminateReadLog(pvcursorcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsWriteRestartArea(pvmarshalcontext: MutPtr<CVoid>, pvrestartbuffer: ConstPtr<CVoid>, cbrestartbuffer: UInt, plsnbase: ConstPtr<ClsLsn>, fflags: UInt, pcbwritten: MutPtr<UInt>, plsnnext: MutPtr<ClsLsn>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesClfsWriteRestartArea(pvmarshalcontext.rawAddress.toString(), pvrestartbuffer.rawAddress.toString(), cbrestartbuffer.toInt(), plsnbase.rawAddress.toString(), fflags.toInt(), pcbwritten.rawAddress.toString(), plsnnext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmCallbackGetKeyObjectID(cookie: ConstPtr<Long>, obj: ConstPtr<CVoid>, objectid: MutPtr<ULong>, objectname: MutPtr<MutPtr<UnicodeString>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesCmCallbackGetKeyObjectID(cookie.rawAddress.toString(), obj.rawAddress.toString(), objectid.rawAddress.toString(), objectname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmCallbackGetKeyObjectIDEx(cookie: ConstPtr<Long>, obj: ConstPtr<CVoid>, objectid: MutPtr<ULong>, objectname: MutPtr<MutPtr<UnicodeString>>, flags: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesCmCallbackGetKeyObjectIDEx(cookie.rawAddress.toString(), obj.rawAddress.toString(), objectid.rawAddress.toString(), objectname.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmCallbackReleaseKeyObjectIDEx(objectname: ConstPtr<UnicodeString>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesCmCallbackReleaseKeyObjectIDEx(objectname.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun cmGetBoundTransaction(cookie: ConstPtr<Long>, obj: ConstPtr<CVoid>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesCmGetBoundTransaction(cookie.rawAddress.toString(), obj.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetCallbackVersion(major: MutPtr<UInt>, minor: MutPtr<UInt>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesCmGetCallbackVersion(major.rawAddress.toString(), minor.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun cmRegisterCallback(function: PexCallbackFunction, context: ConstPtr<CVoid>, cookie: MutPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesCmRegisterCallback(0L.toString(), context.rawAddress.toString(), cookie.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRegisterCallbackEx(function: PexCallbackFunction, altitude: ConstPtr<UnicodeString>, driver: ConstPtr<CVoid>, context: ConstPtr<CVoid>, cookie: MutPtr<Long>, reserved: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesCmRegisterCallbackEx(0L.toString(), altitude.rawAddress.toString(), driver.rawAddress.toString(), context.rawAddress.toString(), cookie.rawAddress.toString(), reserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetCallbackObjectContext(obj: MutPtr<CVoid>, cookie: ConstPtr<Long>, newcontext: ConstPtr<CVoid>, oldcontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesCmSetCallbackObjectContext(obj.rawAddress.toString(), cookie.rawAddress.toString(), newcontext.rawAddress.toString(), oldcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmUnRegisterCallback(cookie: Long): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesCmUnRegisterCallback(cookie.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dbgBreakPointWithStatus(status: UInt) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesDbgBreakPointWithStatus(status.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dbgPrint(format: Pcstr, vararg variadicArgs: Long): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesDbgPrint(format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dbgPrintEx(componentid: UInt, level: UInt, format: Pcstr, vararg variadicArgs: Long): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesDbgPrintEx(componentid.toInt(), level.toInt(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dbgPrintReturnControlC(format: Pcstr, vararg variadicArgs: Long): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesDbgPrintReturnControlC(format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dbgPrompt(prompt: Pcstr, response: Pstr, length: UInt): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesDbgPrompt(prompt.rawAddress.toString(), response.rawAddress.toString(), length.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dbgQueryDebugFilterState(componentid: UInt, level: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesDbgQueryDebugFilterState(componentid.toInt(), level.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dbgSetDebugFilterState(componentid: UInt, level: UInt, state: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesDbgSetDebugFilterState(componentid.toInt(), level.toInt(), state) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dbgSetDebugPrintCallback(debugprintcallback: PdebugPrintCallback, enable: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesDbgSetDebugPrintCallback(0L.toString(), enable) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun etwActivityIdControl(controlcode: UInt, activityid: MutPtr<Guid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesEtwActivityIdControl(controlcode.toInt(), activityid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun etwEventEnabled(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesEtwEventEnabled(reghandle.toString(), eventdescriptor.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun etwProviderEnabled(reghandle: Reghandle, level: UByte, keyword: ULong): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesEtwProviderEnabled(reghandle.toString(), level.toInt(), keyword.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun etwRegister(providerid: ConstPtr<Guid>, enablecallback: Petwenablecallback, callbackcontext: ConstPtr<CVoid>, reghandle: MutPtr<Reghandle>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesEtwRegister(providerid.rawAddress.toString(), 0L.toString(), callbackcontext.rawAddress.toString(), reghandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun etwSetInformation(reghandle: Reghandle, informationclass: EventInfoClass, eventinformation: ConstPtr<CVoid>, informationlength: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesEtwSetInformation(reghandle.toString(), informationclass, eventinformation.rawAddress.toString(), informationlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun etwUnregister(reghandle: Reghandle): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesEtwUnregister(reghandle.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun etwWrite(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>, activityid: ConstPtr<Guid>, userdatacount: UInt, userdata: ConstPtr<EventDataDescriptor>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesEtwWrite(reghandle.toString(), eventdescriptor.rawAddress.toString(), activityid.rawAddress.toString(), userdatacount.toInt(), userdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun etwWriteEx(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>, filter: ULong, flags: UInt, activityid: ConstPtr<Guid>, relatedactivityid: ConstPtr<Guid>, userdatacount: UInt, userdata: ConstPtr<EventDataDescriptor>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesEtwWriteEx(reghandle.toString(), eventdescriptor.rawAddress.toString(), filter.toString(), flags.toInt(), activityid.rawAddress.toString(), relatedactivityid.rawAddress.toString(), userdatacount.toInt(), userdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun etwWriteString(reghandle: Reghandle, level: UByte, keyword: ULong, activityid: ConstPtr<Guid>, string: Pcwstr): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesEtwWriteString(reghandle.toString(), level.toInt(), keyword.toString(), activityid.rawAddress.toString(), string.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun etwWriteTransfer(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>, activityid: ConstPtr<Guid>, relatedactivityid: ConstPtr<Guid>, userdatacount: UInt, userdata: ConstPtr<EventDataDescriptor>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesEtwWriteTransfer(reghandle.toString(), eventdescriptor.rawAddress.toString(), activityid.rawAddress.toString(), relatedactivityid.rawAddress.toString(), userdatacount.toInt(), userdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAcquireFastMutex(fastmutex: MutPtr<FastMutex>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExAcquireFastMutex(fastmutex.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exAcquireFastMutexUnsafe(fastmutex: MutPtr<FastMutex>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExAcquireFastMutexUnsafe(fastmutex.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exAcquirePushLockExclusiveEx(pushlock: MutPtr<ULong>, flags: UInt) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExAcquirePushLockExclusiveEx(pushlock.rawAddress.toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exAcquirePushLockSharedEx(pushlock: MutPtr<ULong>, flags: UInt) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExAcquirePushLockSharedEx(pushlock.rawAddress.toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exAcquireResourceExclusiveLite(resource: MutPtr<Eresource>, wait: Boolean): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExAcquireResourceExclusiveLite(resource.rawAddress.toString(), wait) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAcquireResourceSharedLite(resource: MutPtr<Eresource>, wait: Boolean): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExAcquireResourceSharedLite(resource.rawAddress.toString(), wait) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAcquireRundownProtection(runref: MutPtr<ExRundownRef>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExAcquireRundownProtection(runref.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAcquireRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExAcquireRundownProtectionCacheAware(runrefcacheaware.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAcquireRundownProtectionCacheAwareEx(runrefcacheaware: PexRundownRefCacheAware, count: UInt): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExAcquireRundownProtectionCacheAwareEx(runrefcacheaware.toString(), count.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAcquireRundownProtectionEx(runref: MutPtr<ExRundownRef>, count: UInt): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExAcquireRundownProtectionEx(runref.rawAddress.toString(), count.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAcquireSharedStarveExclusive(resource: MutPtr<Eresource>, wait: Boolean): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExAcquireSharedStarveExclusive(resource.rawAddress.toString(), wait) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAcquireSharedWaitForExclusive(resource: MutPtr<Eresource>, wait: Boolean): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExAcquireSharedWaitForExclusive(resource.rawAddress.toString(), wait) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAcquireSpinLockExclusive(spinlock: MutPtr<Int>): UByte =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExAcquireSpinLockExclusive(spinlock.rawAddress.toString()) as Int).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAcquireSpinLockExclusiveAtDpcLevel(spinlock: MutPtr<Int>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExAcquireSpinLockExclusiveAtDpcLevel(spinlock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exAcquireSpinLockShared(spinlock: MutPtr<Int>): UByte =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExAcquireSpinLockShared(spinlock.rawAddress.toString()) as Int).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAcquireSpinLockSharedAtDpcLevel(spinlock: MutPtr<Int>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExAcquireSpinLockSharedAtDpcLevel(spinlock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exAllocateCacheAwareRundownProtection(pooltype: PoolType, pooltag: UInt): PexRundownRefCacheAware =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExAllocateCacheAwareRundownProtection(pooltype, pooltag.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAllocatePool(pooltype: PoolType, numberofbytes: ULong): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExAllocatePool(pooltype, numberofbytes.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAllocatePool2(flags: ULong, numberofbytes: ULong, tag: UInt): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExAllocatePool2(flags.toString(), numberofbytes.toString(), tag.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAllocatePool3(flags: ULong, numberofbytes: ULong, tag: UInt, extendedparameters: ConstPtr<PoolExtendedParameter>, extendedparameterscount: UInt): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExAllocatePool3(flags.toString(), numberofbytes.toString(), tag.toInt(), extendedparameters.rawAddress.toString(), extendedparameterscount.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAllocatePoolWithQuota(pooltype: PoolType, numberofbytes: ULong): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExAllocatePoolWithQuota(pooltype, numberofbytes.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAllocatePoolWithQuotaTag(pooltype: PoolType, numberofbytes: ULong, tag: UInt): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExAllocatePoolWithQuotaTag(pooltype, numberofbytes.toString(), tag.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAllocatePoolWithTag(pooltype: PoolType, numberofbytes: ULong, tag: UInt): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExAllocatePoolWithTag(pooltype, numberofbytes.toString(), tag.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAllocatePoolWithTagPriority(pooltype: PoolType, numberofbytes: ULong, tag: UInt, priority: ExPoolPriority): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExAllocatePoolWithTagPriority(pooltype, numberofbytes.toString(), tag.toInt(), priority) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAllocateTimer(callback: PextCallback, callbackcontext: ConstPtr<CVoid>, attributes: UInt): PexTimer =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExAllocateTimer(0L.toString(), callbackcontext.rawAddress.toString(), attributes.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exCancelTimer(timer: PexTimer, parameters: ConstPtr<CVoid>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExCancelTimer(timer.toString(), parameters.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exCleanupRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExCleanupRundownProtectionCacheAware(runrefcacheaware.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exConvertExclusiveToSharedLite(resource: MutPtr<Eresource>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExConvertExclusiveToSharedLite(resource.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exCreateCallback(callbackobject: MutPtr<PcallbackObject>, objectattributes: ConstPtr<ObjectAttributes>, create: Boolean, allowmultiplecallbacks: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExCreateCallback(callbackobject.rawAddress.toString(), objectattributes.rawAddress.toString(), create, allowmultiplecallbacks) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exCreatePool(flags: UInt, tag: ULong, params: ConstPtr<PoolCreateExtendedParams>, poolhandle: MutPtr<Handle>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExCreatePool(flags.toInt(), tag.toString(), params.rawAddress.toString(), poolhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exDeleteResourceLite(resource: MutPtr<Eresource>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExDeleteResourceLite(resource.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exDeleteTimer(timer: PexTimer, cancel: Boolean, wait: Boolean, parameters: ConstPtr<ExtDeleteParameters>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExDeleteTimer(timer.toString(), cancel, wait, parameters.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exDestroyPool(poolhandle: Handle) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExDestroyPool(poolhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exEnterCriticalRegionAndAcquireResourceExclusive(resource: MutPtr<Eresource>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExEnterCriticalRegionAndAcquireResourceExclusive(resource.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exEnterCriticalRegionAndAcquireResourceShared(resource: MutPtr<Eresource>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExEnterCriticalRegionAndAcquireResourceShared(resource.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exEnterCriticalRegionAndAcquireSharedWaitForExclusive(resource: MutPtr<Eresource>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExEnterCriticalRegionAndAcquireSharedWaitForExclusive(resource.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exEnumerateSystemFirmwareTables(firmwaretableprovidersignature: UInt, firmwaretablebuffer: MutPtr<CVoid>, bufferlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExEnumerateSystemFirmwareTables(firmwaretableprovidersignature.toInt(), firmwaretablebuffer.rawAddress.toString(), bufferlength.toInt(), returnlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exExtendZone(zone: MutPtr<ZoneHeader>, segment: MutPtr<CVoid>, segmentsize: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExExtendZone(zone.rawAddress.toString(), segment.rawAddress.toString(), segmentsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exFreeCacheAwareRundownProtection(runrefcacheaware: PexRundownRefCacheAware) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExFreeCacheAwareRundownProtection(runrefcacheaware.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exFreePool(p: MutPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExFreePool(p.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exFreePool2(p: MutPtr<CVoid>, tag: UInt, extendedparameters: ConstPtr<PoolExtendedParameter>, extendedparameterscount: UInt) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExFreePool2(p.rawAddress.toString(), tag.toInt(), extendedparameters.rawAddress.toString(), extendedparameterscount.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exFreePoolWithTag(p: MutPtr<CVoid>, tag: UInt) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExFreePoolWithTag(p.rawAddress.toString(), tag.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exGetExclusiveWaiterCount(resource: ConstPtr<Eresource>): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExGetExclusiveWaiterCount(resource.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exGetFirmwareEnvironmentVariable(variablename: ConstPtr<UnicodeString>, vendorguid: ConstPtr<Guid>, value: MutPtr<CVoid>, valuelength: MutPtr<UInt>, attributes: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExGetFirmwareEnvironmentVariable(variablename.rawAddress.toString(), vendorguid.rawAddress.toString(), value.rawAddress.toString(), valuelength.rawAddress.toString(), attributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exGetFirmwareType(): FirmwareType =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExGetFirmwareType() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exGetPreviousMode(): Byte =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExGetPreviousMode() as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exGetSharedWaiterCount(resource: ConstPtr<Eresource>): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExGetSharedWaiterCount(resource.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exGetSystemFirmwareTable(firmwaretableprovidersignature: UInt, firmwaretableid: UInt, firmwaretablebuffer: MutPtr<CVoid>, bufferlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExGetSystemFirmwareTable(firmwaretableprovidersignature.toInt(), firmwaretableid.toInt(), firmwaretablebuffer.rawAddress.toString(), bufferlength.toInt(), returnlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exInitializePushLock(pushlock: MutPtr<ULong>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExInitializePushLock(pushlock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exInitializeResourceLite(resource: MutPtr<Eresource>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExInitializeResourceLite(resource.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exInitializeRundownProtection(runref: MutPtr<ExRundownRef>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExInitializeRundownProtection(runref.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exInitializeRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware, runrefsize: ULong) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExInitializeRundownProtectionCacheAware(runrefcacheaware.toString(), runrefsize.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exInitializeRundownProtectionCacheAwareEx(runrefcacheaware: PexRundownRefCacheAware, flags: UInt) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExInitializeRundownProtectionCacheAwareEx(runrefcacheaware.toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exInitializeZone(zone: MutPtr<ZoneHeader>, blocksize: UInt, initialsegment: MutPtr<CVoid>, initialsegmentsize: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExInitializeZone(zone.rawAddress.toString(), blocksize.toInt(), initialsegment.rawAddress.toString(), initialsegmentsize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exInterlockedAddLargeInteger(addend: MutPtr<Long>, increment: Long, lock: MutPtr<ULong>): Long =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExInterlockedAddLargeInteger(addend.rawAddress.toString(), increment.toString(), lock.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exInterlockedExtendZone(zone: MutPtr<ZoneHeader>, segment: MutPtr<CVoid>, segmentsize: UInt, lock: MutPtr<ULong>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExInterlockedExtendZone(zone.rawAddress.toString(), segment.rawAddress.toString(), segmentsize.toInt(), lock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exIsManufacturingModeEnabled(): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExIsManufacturingModeEnabled() as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exIsProcessorFeaturePresent(processorfeature: UInt): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExIsProcessorFeaturePresent(processorfeature.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exIsResourceAcquiredExclusiveLite(resource: ConstPtr<Eresource>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExIsResourceAcquiredExclusiveLite(resource.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exIsResourceAcquiredSharedLite(resource: ConstPtr<Eresource>): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExIsResourceAcquiredSharedLite(resource.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exIsSoftBoot(): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExIsSoftBoot() as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exLocalTimeToSystemTime(localtime: ConstPtr<Long>, systemtime: MutPtr<Long>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExLocalTimeToSystemTime(localtime.rawAddress.toString(), systemtime.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exNotifyCallback(callbackobject: ConstPtr<CVoid>, argument1: ConstPtr<CVoid>, argument2: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExNotifyCallback(callbackobject.rawAddress.toString(), argument1.rawAddress.toString(), argument2.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exQueryTimerResolution(maximumtime: MutPtr<UInt>, minimumtime: MutPtr<UInt>, currenttime: MutPtr<UInt>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExQueryTimerResolution(maximumtime.rawAddress.toString(), minimumtime.rawAddress.toString(), currenttime.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exQueueWorkItem(workitem: MutPtr<WorkQueueItem>, queuetype: WorkQueueType) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExQueueWorkItem(workitem.rawAddress.toString(), queuetype)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exRaiseAccessViolation() {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExRaiseAccessViolation()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exRaiseDatatypeMisalignment() {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExRaiseDatatypeMisalignment()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exRaiseStatus(status: Ntstatus) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExRaiseStatus(status)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReInitializeRundownProtection(runref: MutPtr<ExRundownRef>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExReInitializeRundownProtection(runref.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReInitializeRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExReInitializeRundownProtectionCacheAware(runrefcacheaware.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exRegisterCallback(callbackobject: PcallbackObject, callbackfunction: PcallbackFunction, callbackcontext: ConstPtr<CVoid>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExRegisterCallback(callbackobject.toString(), 0L.toString(), callbackcontext.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exReinitializeResourceLite(resource: MutPtr<Eresource>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExReinitializeResourceLite(resource.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exReleaseFastMutex(fastmutex: MutPtr<FastMutex>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExReleaseFastMutex(fastmutex.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReleaseFastMutexUnsafe(fastmutex: MutPtr<FastMutex>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExReleaseFastMutexUnsafe(fastmutex.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReleasePushLockExclusiveEx(pushlock: MutPtr<ULong>, flags: UInt) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExReleasePushLockExclusiveEx(pushlock.rawAddress.toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReleasePushLockSharedEx(pushlock: MutPtr<ULong>, flags: UInt) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExReleasePushLockSharedEx(pushlock.rawAddress.toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReleaseResourceAndLeaveCriticalRegion(resource: MutPtr<Eresource>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExReleaseResourceAndLeaveCriticalRegion(resource.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReleaseResourceForThreadLite(resource: MutPtr<Eresource>, resourcethreadid: ULong) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExReleaseResourceForThreadLite(resource.rawAddress.toString(), resourcethreadid.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReleaseResourceLite(resource: MutPtr<Eresource>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExReleaseResourceLite(resource.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReleaseRundownProtection(runref: MutPtr<ExRundownRef>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExReleaseRundownProtection(runref.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReleaseRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExReleaseRundownProtectionCacheAware(runrefcacheaware.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReleaseRundownProtectionCacheAwareEx(runref: PexRundownRefCacheAware, count: UInt) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExReleaseRundownProtectionCacheAwareEx(runref.toString(), count.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReleaseRundownProtectionEx(runref: MutPtr<ExRundownRef>, count: UInt) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExReleaseRundownProtectionEx(runref.rawAddress.toString(), count.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReleaseSpinLockExclusive(spinlock: MutPtr<Int>, oldirql: UByte) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExReleaseSpinLockExclusive(spinlock.rawAddress.toString(), oldirql.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReleaseSpinLockExclusiveFromDpcLevel(spinlock: MutPtr<Int>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExReleaseSpinLockExclusiveFromDpcLevel(spinlock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReleaseSpinLockShared(spinlock: MutPtr<Int>, oldirql: UByte) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExReleaseSpinLockShared(spinlock.rawAddress.toString(), oldirql.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReleaseSpinLockSharedFromDpcLevel(spinlock: MutPtr<Int>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExReleaseSpinLockSharedFromDpcLevel(spinlock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exRundownCompleted(runref: MutPtr<ExRundownRef>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExRundownCompleted(runref.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exRundownCompletedCacheAware(runrefcacheaware: PexRundownRefCacheAware) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExRundownCompletedCacheAware(runrefcacheaware.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exSecurePoolUpdate(securepoolhandle: Handle, tag: UInt, allocation: ConstPtr<CVoid>, cookie: ULong, offset: ULong, size: ULong, buffer: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExSecurePoolUpdate(securepoolhandle.rawAddress.toString(), tag.toInt(), allocation.rawAddress.toString(), cookie.toString(), offset.toString(), size.toString(), buffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exSecurePoolValidate(securepoolhandle: Handle, tag: UInt, allocation: ConstPtr<CVoid>, cookie: ULong): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExSecurePoolValidate(securepoolhandle.rawAddress.toString(), tag.toInt(), allocation.rawAddress.toString(), cookie.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exSetFirmwareEnvironmentVariable(variablename: ConstPtr<UnicodeString>, vendorguid: ConstPtr<Guid>, value: ConstPtr<CVoid>, valuelength: UInt, attributes: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExSetFirmwareEnvironmentVariable(variablename.rawAddress.toString(), vendorguid.rawAddress.toString(), value.rawAddress.toString(), valuelength.toInt(), attributes.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exSetResourceOwnerPointer(resource: MutPtr<Eresource>, ownerpointer: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExSetResourceOwnerPointer(resource.rawAddress.toString(), ownerpointer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exSetResourceOwnerPointerEx(resource: MutPtr<Eresource>, ownerpointer: ConstPtr<CVoid>, flags: UInt) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExSetResourceOwnerPointerEx(resource.rawAddress.toString(), ownerpointer.rawAddress.toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exSetTimer(timer: PexTimer, duetime: Long, period: Long, parameters: ConstPtr<ExtSetParametersV0>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExSetTimer(timer.toString(), duetime.toString(), period.toString(), parameters.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exSetTimerResolution(desiredtime: UInt, setresolution: Boolean): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExSetTimerResolution(desiredtime.toInt(), setresolution) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exSizeOfRundownProtectionCacheAware(): ULong =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExSizeOfRundownProtectionCacheAware() as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exSystemTimeToLocalTime(systemtime: ConstPtr<Long>, localtime: MutPtr<Long>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExSystemTimeToLocalTime(systemtime.rawAddress.toString(), localtime.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exTryAcquireSpinLockExclusiveAtDpcLevel(spinlock: MutPtr<Int>): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExTryAcquireSpinLockExclusiveAtDpcLevel(spinlock.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exTryAcquireSpinLockSharedAtDpcLevel(spinlock: MutPtr<Int>): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExTryAcquireSpinLockSharedAtDpcLevel(spinlock.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exTryConvertSharedSpinLockExclusive(spinlock: MutPtr<Int>): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExTryConvertSharedSpinLockExclusive(spinlock.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exTryToAcquireFastMutex(fastmutex: MutPtr<FastMutex>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExTryToAcquireFastMutex(fastmutex.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exUnregisterCallback(callbackregistration: MutPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExUnregisterCallback(callbackregistration.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exUuidCreate(uuid: MutPtr<Guid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExUuidCreate(uuid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exVerifySuite(suitetype: SuiteType): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExVerifySuite(suitetype) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exWaitForRundownProtectionRelease(runref: MutPtr<ExRundownRef>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExWaitForRundownProtectionRelease(runref.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exWaitForRundownProtectionReleaseCacheAware(runref: PexRundownRefCacheAware) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesExWaitForRundownProtectionReleaseCacheAware(runref.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlIsTotalDeviceFailure(status: Ntstatus): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesFsRtlIsTotalDeviceFailure(status) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halAcquireDisplayOwnership(resetdisplayparameters: PhalResetDisplayParameters) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesHalAcquireDisplayOwnership(0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun halAllocateAdapterChannel(adapterobject: ConstPtr<AdapterObject>, wcb: ConstPtr<WaitContextBlock>, numberofmapregisters: UInt, executionroutine: DriverControl): Ntstatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halAllocateCommonBuffer(adapterobject: ConstPtr<AdapterObject>, length: UInt, logicaladdress: MutPtr<Long>, cacheenabled: Boolean): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesHalAllocateCommonBuffer(adapterobject.rawAddress.toString(), length.toInt(), logicaladdress.rawAddress.toString(), cacheenabled) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halAllocateCrashDumpRegisters(adapterobject: ConstPtr<AdapterObject>, numberofmapregisters: MutPtr<UInt>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesHalAllocateCrashDumpRegisters(adapterobject.rawAddress.toString(), numberofmapregisters.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halAllocateHardwareCounters(groupaffinty: ConstPtr<GroupAffinity>, groupcount: UInt, resourcelist: ConstPtr<PhysicalCounterResourceList>, countersethandle: MutPtr<Handle>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesHalAllocateHardwareCounters(groupaffinty.rawAddress.toString(), groupcount.toInt(), resourcelist.rawAddress.toString(), countersethandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halAssignSlotResources(registrypath: ConstPtr<UnicodeString>, driverclassname: ConstPtr<UnicodeString>, driverobject: ConstPtr<DriverObject>, deviceobject: ConstPtr<DeviceObject>, bustype: InterfaceType, busnumber: UInt, slotnumber: UInt, allocatedresources: MutPtr<MutPtr<CmResourceList>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesHalAssignSlotResources(registrypath.rawAddress.toString(), driverclassname.rawAddress.toString(), driverobject.rawAddress.toString(), deviceobject.rawAddress.toString(), bustype, busnumber.toInt(), slotnumber.toInt(), allocatedresources.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halBugCheckSystem(errorsource: ConstPtr<WheaErrorSourceDescriptor>, errorrecord: ConstPtr<WheaErrorRecord>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesHalBugCheckSystem(errorsource.rawAddress.toString(), errorrecord.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun halDmaAllocateCrashDumpRegistersEx(adapter: ConstPtr<AdapterObject>, numberofmapregisters: UInt, type: HalDmaCrashDumpRegisterType, mapregisterbase: MutPtr<MutPtr<CVoid>>, mapregistersavailable: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesHalDmaAllocateCrashDumpRegistersEx(adapter.rawAddress.toString(), numberofmapregisters.toInt(), type, mapregisterbase.rawAddress.toString(), mapregistersavailable.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halDmaFreeCrashDumpRegistersEx(adapter: ConstPtr<AdapterObject>, type: HalDmaCrashDumpRegisterType): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesHalDmaFreeCrashDumpRegistersEx(adapter.rawAddress.toString(), type) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halExamineMBR(deviceobject: ConstPtr<DeviceObject>, sectorsize: UInt, mbrtypeidentifier: UInt, buffer: MutPtr<MutPtr<CVoid>>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesHalExamineMBR(deviceobject.rawAddress.toString(), sectorsize.toInt(), mbrtypeidentifier.toInt(), buffer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun halFreeCommonBuffer(adapterobject: ConstPtr<AdapterObject>, length: UInt, logicaladdress: Long, virtualaddress: ConstPtr<CVoid>, cacheenabled: Boolean) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesHalFreeCommonBuffer(adapterobject.rawAddress.toString(), length.toInt(), logicaladdress.toString(), virtualaddress.rawAddress.toString(), cacheenabled)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun halFreeHardwareCounters(countersethandle: Handle): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesHalFreeHardwareCounters(countersethandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halGetAdapter(devicedescription: ConstPtr<DeviceDescription>, numberofmapregisters: MutPtr<UInt>): MutPtr<AdapterObject> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesHalGetAdapter(devicedescription.rawAddress.toString(), numberofmapregisters.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halGetBusData(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: MutPtr<CVoid>, length: UInt): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesHalGetBusData(busdatatype, busnumber.toInt(), slotnumber.toInt(), buffer.rawAddress.toString(), length.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halGetBusDataByOffset(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: MutPtr<CVoid>, offset: UInt, length: UInt): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesHalGetBusDataByOffset(busdatatype, busnumber.toInt(), slotnumber.toInt(), buffer.rawAddress.toString(), offset.toInt(), length.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halGetInterruptVector(interfacetype: InterfaceType, busnumber: UInt, businterruptlevel: UInt, businterruptvector: UInt, irql: MutPtr<UByte>, affinity: MutPtr<ULong>): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesHalGetInterruptVector(interfacetype, busnumber.toInt(), businterruptlevel.toInt(), businterruptvector.toInt(), irql.rawAddress.toString(), affinity.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halMakeBeep(frequency: UInt): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesHalMakeBeep(frequency.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halReadDmaCounter(adapterobject: ConstPtr<AdapterObject>): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesHalReadDmaCounter(adapterobject.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halSetBusData(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: ConstPtr<CVoid>, length: UInt): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesHalSetBusData(busdatatype, busnumber.toInt(), slotnumber.toInt(), buffer.rawAddress.toString(), length.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halSetBusDataByOffset(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: ConstPtr<CVoid>, offset: UInt, length: UInt): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesHalSetBusDataByOffset(busdatatype, busnumber.toInt(), slotnumber.toInt(), buffer.rawAddress.toString(), offset.toInt(), length.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halTranslateBusAddress(interfacetype: InterfaceType, busnumber: UInt, busaddress: Long, addressspace: MutPtr<UInt>, translatedaddress: MutPtr<Long>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesHalTranslateBusAddress(interfacetype, busnumber.toInt(), busaddress.toString(), addressspace.rawAddress.toString(), translatedaddress.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hvlRegisterWheaErrorNotification(callback: PhvlWheaErrorNotification): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesHvlRegisterWheaErrorNotification(0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hvlUnregisterWheaErrorNotification(callback: PhvlWheaErrorNotification): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesHvlUnregisterWheaErrorNotification(0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAcquireCancelSpinLock(irql: MutPtr<UByte>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoAcquireCancelSpinLock(irql.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioAcquireKsrPersistentMemory(driverobject: ConstPtr<DriverObject>, physicaldeviceobject: ConstPtr<DeviceObject>, buffer: MutPtr<CVoid>, size: MutPtr<ULong>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoAcquireKsrPersistentMemory(driverobject.rawAddress.toString(), physicaldeviceobject.rawAddress.toString(), buffer.rawAddress.toString(), size.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAcquireKsrPersistentMemoryEx(driverobject: ConstPtr<DriverObject>, physicaldeviceobject: ConstPtr<DeviceObject>, physicaldeviceid: ConstPtr<UnicodeString>, datatag: ConstPtr<UShort>, dataversion: MutPtr<UInt>, buffer: MutPtr<CVoid>, size: MutPtr<ULong>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoAcquireKsrPersistentMemoryEx(driverobject.rawAddress.toString(), physicaldeviceobject.rawAddress.toString(), physicaldeviceid.rawAddress.toString(), datatag.rawAddress.toString(), dataversion.rawAddress.toString(), buffer.rawAddress.toString(), size.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAcquireRemoveLockEx(removelock: MutPtr<IoRemoveLock>, tag: ConstPtr<CVoid>, file: Pcstr, line: UInt, remlocksize: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoAcquireRemoveLockEx(removelock.rawAddress.toString(), tag.rawAddress.toString(), file.rawAddress.toString(), line.toInt(), remlocksize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAllocateAdapterChannel(adapterobject: ConstPtr<AdapterObject>, deviceobject: ConstPtr<DeviceObject>, numberofmapregisters: UInt, executionroutine: DriverControl, context: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAllocateController(controllerobject: ConstPtr<ControllerObject>, deviceobject: ConstPtr<DeviceObject>, executionroutine: DriverControl, context: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAllocateDriverObjectExtension(driverobject: ConstPtr<DriverObject>, clientidentificationaddress: ConstPtr<CVoid>, driverobjectextensionsize: UInt, driverobjectextension: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoAllocateDriverObjectExtension(driverobject.rawAddress.toString(), clientidentificationaddress.rawAddress.toString(), driverobjectextensionsize.toInt(), driverobjectextension.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAllocateErrorLogEntry(ioobject: ConstPtr<CVoid>, entrysize: UByte): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoAllocateErrorLogEntry(ioobject.rawAddress.toString(), entrysize.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAllocateIrp(stacksize: Byte, chargequota: Boolean): MutPtr<Irp> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoAllocateIrp(stacksize.toInt(), chargequota) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAllocateIrpEx(deviceobject: ConstPtr<DeviceObject>, stacksize: Byte, chargequota: Boolean): MutPtr<Irp> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoAllocateIrpEx(deviceobject.rawAddress.toString(), stacksize.toInt(), chargequota) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAllocateMdl(virtualaddress: ConstPtr<CVoid>, length: UInt, secondarybuffer: Boolean, chargequota: Boolean, irp: MutPtr<Irp>): MutPtr<Mdl> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoAllocateMdl(virtualaddress.rawAddress.toString(), length.toInt(), secondarybuffer, chargequota, irp.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAllocateSfioStreamIdentifier(fileobject: ConstPtr<FileObject>, length: UInt, signature: ConstPtr<CVoid>, streamidentifier: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoAllocateSfioStreamIdentifier(fileobject.rawAddress.toString(), length.toInt(), signature.rawAddress.toString(), streamidentifier.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAllocateWorkItem(deviceobject: ConstPtr<DeviceObject>): PioWorkitem =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoAllocateWorkItem(deviceobject.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAssignResources(registrypath: ConstPtr<UnicodeString>, driverclassname: ConstPtr<UnicodeString>, driverobject: ConstPtr<DriverObject>, deviceobject: ConstPtr<DeviceObject>, requestedresources: ConstPtr<IoResourceRequirementsList>, allocatedresources: MutPtr<MutPtr<CmResourceList>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoAssignResources(registrypath.rawAddress.toString(), driverclassname.rawAddress.toString(), driverobject.rawAddress.toString(), deviceobject.rawAddress.toString(), requestedresources.rawAddress.toString(), allocatedresources.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAttachDevice(sourcedevice: ConstPtr<DeviceObject>, targetdevice: ConstPtr<UnicodeString>, attacheddevice: MutPtr<MutPtr<DeviceObject>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoAttachDevice(sourcedevice.rawAddress.toString(), targetdevice.rawAddress.toString(), attacheddevice.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAttachDeviceByPointer(sourcedevice: ConstPtr<DeviceObject>, targetdevice: ConstPtr<DeviceObject>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoAttachDeviceByPointer(sourcedevice.rawAddress.toString(), targetdevice.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAttachDeviceToDeviceStack(sourcedevice: ConstPtr<DeviceObject>, targetdevice: ConstPtr<DeviceObject>): MutPtr<DeviceObject> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoAttachDeviceToDeviceStack(sourcedevice.rawAddress.toString(), targetdevice.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAttachDeviceToDeviceStackSafe(sourcedevice: ConstPtr<DeviceObject>, targetdevice: ConstPtr<DeviceObject>, attachedtodeviceobject: MutPtr<MutPtr<DeviceObject>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoAttachDeviceToDeviceStackSafe(sourcedevice.rawAddress.toString(), targetdevice.rawAddress.toString(), attachedtodeviceobject.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioBuildAsynchronousFsdRequest(majorfunction: UInt, deviceobject: ConstPtr<DeviceObject>, buffer: MutPtr<CVoid>, length: UInt, startingoffset: ConstPtr<Long>, iostatusblock: ConstPtr<IoStatusBlock>): MutPtr<Irp> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoBuildAsynchronousFsdRequest(majorfunction.toInt(), deviceobject.rawAddress.toString(), buffer.rawAddress.toString(), length.toInt(), startingoffset.rawAddress.toString(), iostatusblock.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioBuildDeviceIoControlRequest(iocontrolcode: UInt, deviceobject: ConstPtr<DeviceObject>, inputbuffer: ConstPtr<CVoid>, inputbufferlength: UInt, outputbuffer: MutPtr<CVoid>, outputbufferlength: UInt, internaldeviceiocontrol: Boolean, event: ConstPtr<Kevent>, iostatusblock: MutPtr<IoStatusBlock>): MutPtr<Irp> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoBuildDeviceIoControlRequest(iocontrolcode.toInt(), deviceobject.rawAddress.toString(), inputbuffer.rawAddress.toString(), inputbufferlength.toInt(), outputbuffer.rawAddress.toString(), outputbufferlength.toInt(), internaldeviceiocontrol, event.rawAddress.toString(), iostatusblock.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioBuildPartialMdl(sourcemdl: ConstPtr<Mdl>, targetmdl: MutPtr<Mdl>, virtualaddress: MutPtr<CVoid>, length: UInt) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoBuildPartialMdl(sourcemdl.rawAddress.toString(), targetmdl.rawAddress.toString(), virtualaddress.rawAddress.toString(), length.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioBuildSynchronousFsdRequest(majorfunction: UInt, deviceobject: ConstPtr<DeviceObject>, buffer: MutPtr<CVoid>, length: UInt, startingoffset: ConstPtr<Long>, event: ConstPtr<Kevent>, iostatusblock: MutPtr<IoStatusBlock>): MutPtr<Irp> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoBuildSynchronousFsdRequest(majorfunction.toInt(), deviceobject.rawAddress.toString(), buffer.rawAddress.toString(), length.toInt(), startingoffset.rawAddress.toString(), event.rawAddress.toString(), iostatusblock.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCancelFileOpen(deviceobject: ConstPtr<DeviceObject>, fileobject: ConstPtr<FileObject>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoCancelFileOpen(deviceobject.rawAddress.toString(), fileobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioCancelIrp(irp: ConstPtr<Irp>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoCancelIrp(irp.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCheckLinkShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: MutPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, linkshareaccess: MutPtr<LinkShareAccess>, ioshareaccessflags: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoCheckLinkShareAccess(desiredaccess.toInt(), desiredshareaccess.toInt(), fileobject.rawAddress.toString(), shareaccess.rawAddress.toString(), linkshareaccess.rawAddress.toString(), ioshareaccessflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCheckShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: MutPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, update: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoCheckShareAccess(desiredaccess.toInt(), desiredshareaccess.toInt(), fileobject.rawAddress.toString(), shareaccess.rawAddress.toString(), update) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCheckShareAccessEx(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: MutPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, update: Boolean, writepermission: ConstPtr<Boolean>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoCheckShareAccessEx(desiredaccess.toInt(), desiredshareaccess.toInt(), fileobject.rawAddress.toString(), shareaccess.rawAddress.toString(), update, writepermission.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCleanupIrp(irp: MutPtr<Irp>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoCleanupIrp(irp.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioClearActivityIdThread(originalid: ConstPtr<Guid>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoClearActivityIdThread(originalid.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioClearIrpExtraCreateParameter(irp: MutPtr<Irp>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoClearIrpExtraCreateParameter(irp.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioConnectInterrupt(interruptobject: MutPtr<Pkinterrupt>, serviceroutine: PkserviceRoutine, servicecontext: ConstPtr<CVoid>, spinlock: ConstPtr<ULong>, vector: UInt, irql: UByte, synchronizeirql: UByte, interruptmode: KinterruptMode, sharevector: Boolean, processorenablemask: ULong, floatingsave: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoConnectInterrupt(interruptobject.rawAddress.toString(), 0L.toString(), servicecontext.rawAddress.toString(), spinlock.rawAddress.toString(), vector.toInt(), irql.toInt(), synchronizeirql.toInt(), interruptmode, sharevector, processorenablemask.toString(), floatingsave) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioConnectInterruptEx(parameters: MutPtr<IoConnectInterruptParameters>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoConnectInterruptEx(parameters.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateController(size: UInt): MutPtr<ControllerObject> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoCreateController(size.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateDevice(driverobject: ConstPtr<DriverObject>, deviceextensionsize: UInt, devicename: ConstPtr<UnicodeString>, devicetype: UInt, devicecharacteristics: UInt, exclusive: Boolean, deviceobject: MutPtr<MutPtr<DeviceObject>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoCreateDevice(driverobject.rawAddress.toString(), deviceextensionsize.toInt(), devicename.rawAddress.toString(), devicetype.toInt(), devicecharacteristics.toInt(), exclusive, deviceobject.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateDisk(deviceobject: ConstPtr<DeviceObject>, disk: ConstPtr<CreateDisk>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoCreateDisk(deviceobject.rawAddress.toString(), disk.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateFile(filehandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, allocationsize: ConstPtr<Long>, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: ConstPtr<CVoid>, ealength: UInt, createfiletype: CreateFileType, internalparameters: ConstPtr<CVoid>, options: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoCreateFile(filehandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), iostatusblock.rawAddress.toString(), allocationsize.rawAddress.toString(), fileattributes.toInt(), shareaccess.toInt(), disposition.toInt(), createoptions.toInt(), eabuffer.rawAddress.toString(), ealength.toInt(), createfiletype, internalparameters.rawAddress.toString(), options.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateFileEx(filehandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, allocationsize: ConstPtr<Long>, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: ConstPtr<CVoid>, ealength: UInt, createfiletype: CreateFileType, internalparameters: ConstPtr<CVoid>, options: UInt, drivercontext: ConstPtr<IoDriverCreateContext>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoCreateFileEx(filehandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), iostatusblock.rawAddress.toString(), allocationsize.rawAddress.toString(), fileattributes.toInt(), shareaccess.toInt(), disposition.toInt(), createoptions.toInt(), eabuffer.rawAddress.toString(), ealength.toInt(), createfiletype, internalparameters.rawAddress.toString(), options.toInt(), drivercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateFileSpecifyDeviceObjectHint(filehandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, allocationsize: ConstPtr<Long>, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: ConstPtr<CVoid>, ealength: UInt, createfiletype: CreateFileType, internalparameters: ConstPtr<CVoid>, options: UInt, deviceobject: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoCreateFileSpecifyDeviceObjectHint(filehandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), iostatusblock.rawAddress.toString(), allocationsize.rawAddress.toString(), fileattributes.toInt(), shareaccess.toInt(), disposition.toInt(), createoptions.toInt(), eabuffer.rawAddress.toString(), ealength.toInt(), createfiletype, internalparameters.rawAddress.toString(), options.toInt(), deviceobject.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateNotificationEvent(eventname: ConstPtr<UnicodeString>, eventhandle: MutPtr<Handle>): MutPtr<Kevent> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoCreateNotificationEvent(eventname.rawAddress.toString(), eventhandle.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateSymbolicLink(symboliclinkname: ConstPtr<UnicodeString>, devicename: ConstPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoCreateSymbolicLink(symboliclinkname.rawAddress.toString(), devicename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateSynchronizationEvent(eventname: ConstPtr<UnicodeString>, eventhandle: MutPtr<Handle>): MutPtr<Kevent> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoCreateSynchronizationEvent(eventname.rawAddress.toString(), eventhandle.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateSystemThread(ioobject: MutPtr<CVoid>, threadhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, processhandle: Handle, clientid: MutPtr<ClientId>, startroutine: PkstartRoutine, startcontext: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoCreateSystemThread(ioobject.rawAddress.toString(), threadhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), processhandle.rawAddress.toString(), clientid.rawAddress.toString(), 0L.toString(), startcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateUnprotectedSymbolicLink(symboliclinkname: ConstPtr<UnicodeString>, devicename: ConstPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoCreateUnprotectedSymbolicLink(symboliclinkname.rawAddress.toString(), devicename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCsqInitialize(csq: MutPtr<IoCsq>, csqinsertirp: PioCsqInsertIrp, csqremoveirp: PioCsqRemoveIrp, csqpeeknextirp: PioCsqPeekNextIrp, csqacquirelock: PioCsqAcquireLock, csqreleaselock: PioCsqReleaseLock, csqcompletecanceledirp: PioCsqCompleteCanceledIrp): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoCsqInitialize(csq.rawAddress.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCsqInitializeEx(csq: MutPtr<IoCsq>, csqinsertirp: PioCsqInsertIrpEx, csqremoveirp: PioCsqRemoveIrp, csqpeeknextirp: PioCsqPeekNextIrp, csqacquirelock: PioCsqAcquireLock, csqreleaselock: PioCsqReleaseLock, csqcompletecanceledirp: PioCsqCompleteCanceledIrp): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoCsqInitializeEx(csq.rawAddress.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCsqInsertIrp(csq: MutPtr<IoCsq>, irp: MutPtr<Irp>, context: MutPtr<IoCsqIrpContext>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoCsqInsertIrp(csq.rawAddress.toString(), irp.rawAddress.toString(), context.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioCsqInsertIrpEx(csq: MutPtr<IoCsq>, irp: MutPtr<Irp>, context: MutPtr<IoCsqIrpContext>, insertcontext: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoCsqInsertIrpEx(csq.rawAddress.toString(), irp.rawAddress.toString(), context.rawAddress.toString(), insertcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCsqRemoveIrp(csq: MutPtr<IoCsq>, context: MutPtr<IoCsqIrpContext>): MutPtr<Irp> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoCsqRemoveIrp(csq.rawAddress.toString(), context.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCsqRemoveNextIrp(csq: MutPtr<IoCsq>, peekcontext: ConstPtr<CVoid>): MutPtr<Irp> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoCsqRemoveNextIrp(csq.rawAddress.toString(), peekcontext.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioDecrementKeepAliveCount(fileobject: MutPtr<FileObject>, process: Peprocess): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoDecrementKeepAliveCount(fileobject.rawAddress.toString(), process.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioDeleteController(controllerobject: ConstPtr<ControllerObject>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoDeleteController(controllerobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioDeleteDevice(deviceobject: ConstPtr<DeviceObject>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoDeleteDevice(deviceobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioDeleteSymbolicLink(symboliclinkname: ConstPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoDeleteSymbolicLink(symboliclinkname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioDetachDevice(targetdevice: MutPtr<DeviceObject>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoDetachDevice(targetdevice.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioDisconnectInterrupt(interruptobject: Pkinterrupt) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoDisconnectInterrupt(interruptobject.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioDisconnectInterruptEx(parameters: ConstPtr<IoDisconnectInterruptParameters>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoDisconnectInterruptEx(parameters.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioEnumerateKsrPersistentMemoryEx(driverobject: ConstPtr<DriverObject>, physicaldeviceobject: ConstPtr<DeviceObject>, physicaldeviceid: ConstPtr<UnicodeString>, callback: PioPersistedMemoryEnumerationCallback, callbackcontext: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoEnumerateKsrPersistentMemoryEx(driverobject.rawAddress.toString(), physicaldeviceobject.rawAddress.toString(), physicaldeviceid.rawAddress.toString(), 0L.toString(), callbackcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioFlushAdapterBuffers(adapterobject: ConstPtr<AdapterObject>, mdl: ConstPtr<Mdl>, mapregisterbase: ConstPtr<CVoid>, currentva: ConstPtr<CVoid>, length: UInt, writetodevice: Boolean): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoFlushAdapterBuffers(adapterobject.rawAddress.toString(), mdl.rawAddress.toString(), mapregisterbase.rawAddress.toString(), currentva.rawAddress.toString(), length.toInt(), writetodevice) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioForwardIrpSynchronously(deviceobject: ConstPtr<DeviceObject>, irp: ConstPtr<Irp>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoForwardIrpSynchronously(deviceobject.rawAddress.toString(), irp.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioFreeAdapterChannel(adapterobject: ConstPtr<AdapterObject>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoFreeAdapterChannel(adapterobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioFreeController(controllerobject: ConstPtr<ControllerObject>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoFreeController(controllerobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioFreeErrorLogEntry(elentry: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoFreeErrorLogEntry(elentry.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioFreeIrp(irp: ConstPtr<Irp>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoFreeIrp(irp.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioFreeKsrPersistentMemory(datahandle: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoFreeKsrPersistentMemory(datahandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioFreeMapRegisters(adapterobject: ConstPtr<AdapterObject>, mapregisterbase: ConstPtr<CVoid>, numberofmapregisters: UInt) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoFreeMapRegisters(adapterobject.rawAddress.toString(), mapregisterbase.rawAddress.toString(), numberofmapregisters.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioFreeMdl(mdl: MutPtr<Mdl>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoFreeMdl(mdl.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioFreeSfioStreamIdentifier(fileobject: ConstPtr<FileObject>, signature: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoFreeSfioStreamIdentifier(fileobject.rawAddress.toString(), signature.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioFreeWorkItem(ioworkitem: PioWorkitem) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoFreeWorkItem(ioworkitem.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioGetActivityIdIrp(irp: ConstPtr<Irp>, guid: MutPtr<Guid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoGetActivityIdIrp(irp.rawAddress.toString(), guid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetActivityIdThread(): MutPtr<Guid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoGetActivityIdThread() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetAffinityInterrupt(interruptobject: Pkinterrupt, groupaffinity: MutPtr<GroupAffinity>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoGetAffinityInterrupt(interruptobject.toString(), groupaffinity.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetAttachedDeviceReference(deviceobject: ConstPtr<DeviceObject>): MutPtr<DeviceObject> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoGetAttachedDeviceReference(deviceobject.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetBootDiskInformation(bootdiskinformation: MutPtr<BootdiskInformation>, size: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoGetBootDiskInformation(bootdiskinformation.rawAddress.toString(), size.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetBootDiskInformationLite(bootdiskinformation: MutPtr<MutPtr<BootdiskInformationLite>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoGetBootDiskInformationLite(bootdiskinformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetConfigurationInformation(): MutPtr<ConfigurationInformation> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoGetConfigurationInformation() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetContainerInformation(informationclass: IoContainerInformationClass, containerobject: ConstPtr<CVoid>, buffer: MutPtr<CVoid>, bufferlength: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoGetContainerInformation(informationclass, containerobject.rawAddress.toString(), buffer.rawAddress.toString(), bufferlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetCurrentProcess(): Peprocess =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoGetCurrentProcess() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetDeviceDirectory(physicaldeviceobject: ConstPtr<DeviceObject>, directorytype: DeviceDirectoryType, flags: UInt, reserved: ConstPtr<CVoid>, devicedirectoryhandle: MutPtr<Handle>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoGetDeviceDirectory(physicaldeviceobject.rawAddress.toString(), directorytype, flags.toInt(), reserved.rawAddress.toString(), devicedirectoryhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetDeviceInterfaceAlias(symboliclinkname: ConstPtr<UnicodeString>, aliasinterfaceclassguid: ConstPtr<Guid>, aliassymboliclinkname: MutPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoGetDeviceInterfaceAlias(symboliclinkname.rawAddress.toString(), aliasinterfaceclassguid.rawAddress.toString(), aliassymboliclinkname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetDeviceInterfacePropertyData(symboliclinkname: ConstPtr<UnicodeString>, propertykey: ConstPtr<Devpropkey>, lcid: UInt, flags: UInt, size: UInt, data: MutPtr<CVoid>, requiredsize: MutPtr<UInt>, type: MutPtr<Devproptype>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoGetDeviceInterfacePropertyData(symboliclinkname.rawAddress.toString(), propertykey.rawAddress.toString(), lcid.toInt(), flags.toInt(), size.toInt(), data.rawAddress.toString(), requiredsize.rawAddress.toString(), type.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetDeviceInterfaces(interfaceclassguid: ConstPtr<Guid>, physicaldeviceobject: ConstPtr<DeviceObject>, flags: UInt, symboliclinklist: MutPtr<Pwstr>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoGetDeviceInterfaces(interfaceclassguid.rawAddress.toString(), physicaldeviceobject.rawAddress.toString(), flags.toInt(), symboliclinklist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetDeviceNumaNode(pdo: ConstPtr<DeviceObject>, nodenumber: MutPtr<UShort>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoGetDeviceNumaNode(pdo.rawAddress.toString(), nodenumber.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetDeviceObjectPointer(objectname: ConstPtr<UnicodeString>, desiredaccess: UInt, fileobject: MutPtr<MutPtr<FileObject>>, deviceobject: MutPtr<MutPtr<DeviceObject>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoGetDeviceObjectPointer(objectname.rawAddress.toString(), desiredaccess.toInt(), fileobject.rawAddress.toString(), deviceobject.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetDeviceProperty(deviceobject: ConstPtr<DeviceObject>, deviceproperty: DeviceRegistryProperty, bufferlength: UInt, propertybuffer: MutPtr<CVoid>, resultlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoGetDeviceProperty(deviceobject.rawAddress.toString(), deviceproperty, bufferlength.toInt(), propertybuffer.rawAddress.toString(), resultlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetDevicePropertyData(pdo: ConstPtr<DeviceObject>, propertykey: ConstPtr<Devpropkey>, lcid: UInt, flags: UInt, size: UInt, data: MutPtr<CVoid>, requiredsize: MutPtr<UInt>, type: MutPtr<Devproptype>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoGetDevicePropertyData(pdo.rawAddress.toString(), propertykey.rawAddress.toString(), lcid.toInt(), flags.toInt(), size.toInt(), data.rawAddress.toString(), requiredsize.rawAddress.toString(), type.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetDmaAdapter(physicaldeviceobject: ConstPtr<DeviceObject>, devicedescription: ConstPtr<DeviceDescription>, numberofmapregisters: MutPtr<UInt>): MutPtr<DmaAdapter> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoGetDmaAdapter(physicaldeviceobject.rawAddress.toString(), devicedescription.rawAddress.toString(), numberofmapregisters.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetDriverDirectory(driverobject: ConstPtr<DriverObject>, directorytype: DriverDirectoryType, flags: UInt, driverdirectoryhandle: MutPtr<Handle>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoGetDriverDirectory(driverobject.rawAddress.toString(), directorytype, flags.toInt(), driverdirectoryhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetDriverObjectExtension(driverobject: ConstPtr<DriverObject>, clientidentificationaddress: ConstPtr<CVoid>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoGetDriverObjectExtension(driverobject.rawAddress.toString(), clientidentificationaddress.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetFileObjectGenericMapping(): MutPtr<GenericMapping> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoGetFileObjectGenericMapping() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetFsZeroingOffset(irp: ConstPtr<Irp>, zeroingoffset: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoGetFsZeroingOffset(irp.rawAddress.toString(), zeroingoffset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetInitialStack(): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoGetInitialStack() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetInitiatorProcess(fileobject: ConstPtr<FileObject>): Peprocess =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoGetInitiatorProcess(fileobject.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetIoAttributionHandle(irp: ConstPtr<Irp>, ioattributionhandle: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoGetIoAttributionHandle(irp.rawAddress.toString(), ioattributionhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetIoPriorityHint(irp: ConstPtr<Irp>): IoPriorityHint =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoGetIoPriorityHint(irp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetIommuInterface(version: UInt, interfaceout: MutPtr<DmaIommuInterface>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoGetIommuInterface(version.toInt(), interfaceout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetIommuInterfaceEx(version: UInt, flags: ULong, interfaceout: MutPtr<DmaIommuInterfaceEx>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoGetIommuInterfaceEx(version.toInt(), flags.toString(), interfaceout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetIrpExtraCreateParameter(irp: ConstPtr<Irp>, extracreateparameter: MutPtr<MutPtr<Long>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoGetIrpExtraCreateParameter(irp.rawAddress.toString(), extracreateparameter.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetPagingIoPriority(irp: ConstPtr<Irp>): IoPagingPriority =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoGetPagingIoPriority(irp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetRelatedDeviceObject(fileobject: ConstPtr<FileObject>): MutPtr<DeviceObject> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoGetRelatedDeviceObject(fileobject.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetSfioStreamIdentifier(fileobject: ConstPtr<FileObject>, signature: ConstPtr<CVoid>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoGetSfioStreamIdentifier(fileobject.rawAddress.toString(), signature.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetSilo(fileobject: ConstPtr<FileObject>): Pesilo =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoGetSilo(fileobject.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetSiloParameters(fileobject: ConstPtr<FileObject>): MutPtr<IoFoextSiloParameters> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoGetSiloParameters(fileobject.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetStackLimits(lowlimit: MutPtr<ULong>, highlimit: MutPtr<ULong>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoGetStackLimits(lowlimit.rawAddress.toString(), highlimit.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioGetTopLevelIrp(): MutPtr<Irp> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoGetTopLevelIrp() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetTransactionParameterBlock(fileobject: ConstPtr<FileObject>): MutPtr<TxnParameterBlock> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoGetTransactionParameterBlock(fileobject.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioIncrementKeepAliveCount(fileobject: MutPtr<FileObject>, process: Peprocess): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoIncrementKeepAliveCount(fileobject.rawAddress.toString(), process.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioInitializeIrp(irp: MutPtr<Irp>, packetsize: UShort, stacksize: Byte) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoInitializeIrp(irp.rawAddress.toString(), packetsize.toInt(), stacksize.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioInitializeIrpEx(irp: MutPtr<Irp>, deviceobject: ConstPtr<DeviceObject>, packetsize: UShort, stacksize: Byte) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoInitializeIrpEx(irp.rawAddress.toString(), deviceobject.rawAddress.toString(), packetsize.toInt(), stacksize.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioInitializeRemoveLockEx(lock: MutPtr<IoRemoveLock>, allocatetag: UInt, maxlockedminutes: UInt, highwatermark: UInt, remlocksize: UInt) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoInitializeRemoveLockEx(lock.rawAddress.toString(), allocatetag.toInt(), maxlockedminutes.toInt(), highwatermark.toInt(), remlocksize.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioInitializeTimer(deviceobject: ConstPtr<DeviceObject>, timerroutine: PioTimerRoutine, context: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoInitializeTimer(deviceobject.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioInitializeWorkItem(ioobject: ConstPtr<CVoid>, ioworkitem: PioWorkitem) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoInitializeWorkItem(ioobject.rawAddress.toString(), ioworkitem.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioInvalidateDeviceRelations(deviceobject: ConstPtr<DeviceObject>, type: DeviceRelationType) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoInvalidateDeviceRelations(deviceobject.rawAddress.toString(), type)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioInvalidateDeviceState(physicaldeviceobject: ConstPtr<DeviceObject>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoInvalidateDeviceState(physicaldeviceobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioIs32bitProcess(irp: ConstPtr<Irp>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoIs32bitProcess(irp.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioIsFileObjectIgnoringSharing(fileobject: ConstPtr<FileObject>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoIsFileObjectIgnoringSharing(fileobject.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioIsFileOriginRemote(fileobject: ConstPtr<FileObject>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoIsFileOriginRemote(fileobject.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioIsInitiator32bitProcess(irp: ConstPtr<Irp>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoIsInitiator32bitProcess(irp.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioIsValidIrpStatus(status: Ntstatus): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoIsValidIrpStatus(status) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioIsWdmVersionAvailable(majorversion: UByte, minorversion: UByte): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoIsWdmVersionAvailable(majorversion.toInt(), minorversion.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioMakeAssociatedIrp(irp: ConstPtr<Irp>, stacksize: Byte): MutPtr<Irp> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoMakeAssociatedIrp(irp.rawAddress.toString(), stacksize.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioMakeAssociatedIrpEx(irp: ConstPtr<Irp>, deviceobject: ConstPtr<DeviceObject>, stacksize: Byte): MutPtr<Irp> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoMakeAssociatedIrpEx(irp.rawAddress.toString(), deviceobject.rawAddress.toString(), stacksize.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioMapTransfer(adapterobject: ConstPtr<AdapterObject>, mdl: ConstPtr<Mdl>, mapregisterbase: ConstPtr<CVoid>, currentva: ConstPtr<CVoid>, length: MutPtr<UInt>, writetodevice: Boolean): Long =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoMapTransfer(adapterobject.rawAddress.toString(), mdl.rawAddress.toString(), mapregisterbase.rawAddress.toString(), currentva.rawAddress.toString(), length.rawAddress.toString(), writetodevice) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioOpenDeviceInterfaceRegistryKey(symboliclinkname: ConstPtr<UnicodeString>, desiredaccess: UInt, deviceinterfaceregkey: MutPtr<Handle>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoOpenDeviceInterfaceRegistryKey(symboliclinkname.rawAddress.toString(), desiredaccess.toInt(), deviceinterfaceregkey.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioOpenDeviceRegistryKey(deviceobject: ConstPtr<DeviceObject>, devinstkeytype: UInt, desiredaccess: UInt, deviceregkey: MutPtr<Handle>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoOpenDeviceRegistryKey(deviceobject.rawAddress.toString(), devinstkeytype.toInt(), desiredaccess.toInt(), deviceregkey.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioOpenDriverRegistryKey(driverobject: ConstPtr<DriverObject>, regkeytype: DriverRegkeyType, desiredaccess: UInt, flags: UInt, driverregkey: MutPtr<Handle>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoOpenDriverRegistryKey(driverobject.rawAddress.toString(), regkeytype, desiredaccess.toInt(), flags.toInt(), driverregkey.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioPropagateActivityIdToThread(irp: ConstPtr<Irp>, propagatedid: MutPtr<Guid>, originalid: MutPtr<MutPtr<Guid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoPropagateActivityIdToThread(irp.rawAddress.toString(), propagatedid.rawAddress.toString(), originalid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioQueryDeviceDescription(bustype: ConstPtr<InterfaceType>, busnumber: ConstPtr<UInt>, controllertype: ConstPtr<ConfigurationType>, controllernumber: ConstPtr<UInt>, peripheraltype: ConstPtr<ConfigurationType>, peripheralnumber: ConstPtr<UInt>, calloutroutine: PioQueryDeviceRoutine, context: MutPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoQueryDeviceDescription(bustype.rawAddress.toString(), busnumber.rawAddress.toString(), controllertype.rawAddress.toString(), controllernumber.rawAddress.toString(), peripheraltype.rawAddress.toString(), peripheralnumber.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioQueryFullDriverPath(driverobject: ConstPtr<DriverObject>, fullpath: MutPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoQueryFullDriverPath(driverobject.rawAddress.toString(), fullpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioQueryInformationByName(objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass, options: UInt, drivercontext: ConstPtr<IoDriverCreateContext>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoQueryInformationByName(objectattributes.rawAddress.toString(), iostatusblock.rawAddress.toString(), fileinformation.rawAddress.toString(), length.toInt(), fileinformationclass, options.toInt(), drivercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioQueryKsrPersistentMemorySize(driverobject: ConstPtr<DriverObject>, physicaldeviceobject: ConstPtr<DeviceObject>, buffersize: MutPtr<ULong>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoQueryKsrPersistentMemorySize(driverobject.rawAddress.toString(), physicaldeviceobject.rawAddress.toString(), buffersize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioQueryKsrPersistentMemorySizeEx(driverobject: ConstPtr<DriverObject>, physicaldeviceobject: ConstPtr<DeviceObject>, physicaldeviceid: ConstPtr<UnicodeString>, datatag: ConstPtr<UShort>, dataversion: MutPtr<UInt>, buffersize: MutPtr<ULong>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoQueryKsrPersistentMemorySizeEx(driverobject.rawAddress.toString(), physicaldeviceobject.rawAddress.toString(), physicaldeviceid.rawAddress.toString(), datatag.rawAddress.toString(), dataversion.rawAddress.toString(), buffersize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioQueueWorkItem(ioworkitem: PioWorkitem, workerroutine: PioWorkitemRoutine, queuetype: WorkQueueType, context: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoQueueWorkItem(ioworkitem.toString(), 0L.toString(), queuetype, context.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioQueueWorkItemEx(ioworkitem: PioWorkitem, workerroutine: PioWorkitemRoutineEx, queuetype: WorkQueueType, context: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoQueueWorkItemEx(ioworkitem.toString(), 0L.toString(), queuetype, context.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioRaiseHardError(irp: ConstPtr<Irp>, vpb: ConstPtr<Vpb>, realdeviceobject: ConstPtr<DeviceObject>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoRaiseHardError(irp.rawAddress.toString(), vpb.rawAddress.toString(), realdeviceobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioRaiseInformationalHardError(errorstatus: Ntstatus, string: ConstPtr<UnicodeString>, thread: Pkthread): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoRaiseInformationalHardError(errorstatus, string.rawAddress.toString(), thread.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioReadDiskSignature(deviceobject: ConstPtr<DeviceObject>, bytespersector: UInt, signature: MutPtr<DiskSignature>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoReadDiskSignature(deviceobject.rawAddress.toString(), bytespersector.toInt(), signature.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioReadPartitionTable(deviceobject: ConstPtr<DeviceObject>, sectorsize: UInt, returnrecognizedpartitions: Boolean, partitionbuffer: MutPtr<MutPtr<DriveLayoutInformation>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoReadPartitionTable(deviceobject.rawAddress.toString(), sectorsize.toInt(), returnrecognizedpartitions, partitionbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioReadPartitionTableEx(deviceobject: ConstPtr<DeviceObject>, drivelayout: MutPtr<MutPtr<DriveLayoutInformationEx>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoReadPartitionTableEx(deviceobject.rawAddress.toString(), drivelayout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioRecordIoAttribution(opaquehandle: MutPtr<CVoid>, attributioninformation: ConstPtr<IoAttributionInformation>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoRecordIoAttribution(opaquehandle.rawAddress.toString(), attributioninformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioRegisterBootDriverCallback(callbackfunction: PbootDriverCallbackFunction, callbackcontext: ConstPtr<CVoid>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoRegisterBootDriverCallback(0L.toString(), callbackcontext.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioRegisterBootDriverReinitialization(driverobject: ConstPtr<DriverObject>, driverreinitializationroutine: DriverReinitialize, context: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioRegisterContainerNotification(notificationclass: IoContainerNotificationClass, callbackfunction: PioContainerNotificationFunction, notificationinformation: ConstPtr<CVoid>, notificationinformationlength: UInt, callbackregistration: MutPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoRegisterContainerNotification(notificationclass, 0L.toString(), notificationinformation.rawAddress.toString(), notificationinformationlength.toInt(), callbackregistration.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioRegisterDeviceInterface(physicaldeviceobject: ConstPtr<DeviceObject>, interfaceclassguid: ConstPtr<Guid>, referencestring: ConstPtr<UnicodeString>, symboliclinkname: MutPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoRegisterDeviceInterface(physicaldeviceobject.rawAddress.toString(), interfaceclassguid.rawAddress.toString(), referencestring.rawAddress.toString(), symboliclinkname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioRegisterDriverReinitialization(driverobject: ConstPtr<DriverObject>, driverreinitializationroutine: DriverReinitialize, context: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioRegisterLastChanceShutdownNotification(deviceobject: ConstPtr<DeviceObject>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoRegisterLastChanceShutdownNotification(deviceobject.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioRegisterPlugPlayNotification(eventcategory: IoNotificationEventCategory, eventcategoryflags: UInt, eventcategorydata: ConstPtr<CVoid>, driverobject: ConstPtr<DriverObject>, callbackroutine: DriverNotificationCallbackRoutine, context: MutPtr<CVoid>, notificationentry: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoRegisterPlugPlayNotification(eventcategory, eventcategoryflags.toInt(), eventcategorydata.rawAddress.toString(), driverobject.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), notificationentry.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioRegisterShutdownNotification(deviceobject: ConstPtr<DeviceObject>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoRegisterShutdownNotification(deviceobject.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioReleaseCancelSpinLock(irql: UByte) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoReleaseCancelSpinLock(irql.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioReleaseRemoveLockAndWaitEx(removelock: MutPtr<IoRemoveLock>, tag: ConstPtr<CVoid>, remlocksize: UInt) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoReleaseRemoveLockAndWaitEx(removelock.rawAddress.toString(), tag.rawAddress.toString(), remlocksize.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioReleaseRemoveLockEx(removelock: MutPtr<IoRemoveLock>, tag: ConstPtr<CVoid>, remlocksize: UInt) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoReleaseRemoveLockEx(removelock.rawAddress.toString(), tag.rawAddress.toString(), remlocksize.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioRemoveLinkShareAccess(fileobject: ConstPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, linkshareaccess: MutPtr<LinkShareAccess>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoRemoveLinkShareAccess(fileobject.rawAddress.toString(), shareaccess.rawAddress.toString(), linkshareaccess.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioRemoveLinkShareAccessEx(fileobject: ConstPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, linkshareaccess: MutPtr<LinkShareAccess>, ioshareaccessflags: UInt) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoRemoveLinkShareAccessEx(fileobject.rawAddress.toString(), shareaccess.rawAddress.toString(), linkshareaccess.rawAddress.toString(), ioshareaccessflags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioRemoveShareAccess(fileobject: ConstPtr<FileObject>, shareaccess: MutPtr<ShareAccess>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoRemoveShareAccess(fileobject.rawAddress.toString(), shareaccess.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioReplacePartitionUnit(targetpdo: ConstPtr<DeviceObject>, sparepdo: ConstPtr<DeviceObject>, flags: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoReplacePartitionUnit(targetpdo.rawAddress.toString(), sparepdo.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioReportDetectedDevice(driverobject: ConstPtr<DriverObject>, legacybustype: InterfaceType, busnumber: UInt, slotnumber: UInt, resourcelist: ConstPtr<CmResourceList>, resourcerequirements: ConstPtr<IoResourceRequirementsList>, resourceassigned: Boolean, deviceobject: MutPtr<MutPtr<DeviceObject>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoReportDetectedDevice(driverobject.rawAddress.toString(), legacybustype, busnumber.toInt(), slotnumber.toInt(), resourcelist.rawAddress.toString(), resourcerequirements.rawAddress.toString(), resourceassigned, deviceobject.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioReportInterruptActive(parameters: ConstPtr<IoReportInterruptActiveStateParameters>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoReportInterruptActive(parameters.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioReportInterruptInactive(parameters: ConstPtr<IoReportInterruptActiveStateParameters>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoReportInterruptInactive(parameters.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioReportResourceForDetection(driverobject: ConstPtr<DriverObject>, driverlist: ConstPtr<CmResourceList>, driverlistsize: UInt, deviceobject: ConstPtr<DeviceObject>, devicelist: ConstPtr<CmResourceList>, devicelistsize: UInt, conflictdetected: MutPtr<Boolean>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoReportResourceForDetection(driverobject.rawAddress.toString(), driverlist.rawAddress.toString(), driverlistsize.toInt(), deviceobject.rawAddress.toString(), devicelist.rawAddress.toString(), devicelistsize.toInt(), conflictdetected.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioReportResourceUsage(driverclassname: ConstPtr<UnicodeString>, driverobject: ConstPtr<DriverObject>, driverlist: ConstPtr<CmResourceList>, driverlistsize: UInt, deviceobject: ConstPtr<DeviceObject>, devicelist: ConstPtr<CmResourceList>, devicelistsize: UInt, overrideconflict: Boolean, conflictdetected: MutPtr<Boolean>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoReportResourceUsage(driverclassname.rawAddress.toString(), driverobject.rawAddress.toString(), driverlist.rawAddress.toString(), driverlistsize.toInt(), deviceobject.rawAddress.toString(), devicelist.rawAddress.toString(), devicelistsize.toInt(), overrideconflict, conflictdetected.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioReportRootDevice(driverobject: ConstPtr<DriverObject>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoReportRootDevice(driverobject.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioReportTargetDeviceChange(physicaldeviceobject: ConstPtr<DeviceObject>, notificationstructure: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoReportTargetDeviceChange(physicaldeviceobject.rawAddress.toString(), notificationstructure.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioReportTargetDeviceChangeAsynchronous(physicaldeviceobject: ConstPtr<DeviceObject>, notificationstructure: ConstPtr<CVoid>, callback: PdeviceChangeCompleteCallback, context: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoReportTargetDeviceChangeAsynchronous(physicaldeviceobject.rawAddress.toString(), notificationstructure.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioRequestDeviceEject(physicaldeviceobject: ConstPtr<DeviceObject>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoRequestDeviceEject(physicaldeviceobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioRequestDeviceEjectEx(physicaldeviceobject: ConstPtr<DeviceObject>, callback: PioDeviceEjectCallback, context: ConstPtr<CVoid>, driverobject: ConstPtr<DriverObject>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoRequestDeviceEjectEx(physicaldeviceobject.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), driverobject.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioReserveKsrPersistentMemory(driverobject: ConstPtr<DriverObject>, physicaldeviceobject: ConstPtr<DeviceObject>, size: ULong, flags: UInt, datahandle: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoReserveKsrPersistentMemory(driverobject.rawAddress.toString(), physicaldeviceobject.rawAddress.toString(), size.toString(), flags.toInt(), datahandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioReserveKsrPersistentMemoryEx(driverobject: ConstPtr<DriverObject>, physicaldeviceobject: ConstPtr<DeviceObject>, physicaldeviceid: ConstPtr<UnicodeString>, datatag: ConstPtr<UShort>, dataversion: UInt, size: ULong, flags: UInt, datahandle: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoReserveKsrPersistentMemoryEx(driverobject.rawAddress.toString(), physicaldeviceobject.rawAddress.toString(), physicaldeviceid.rawAddress.toString(), datatag.rawAddress.toString(), dataversion.toInt(), size.toString(), flags.toInt(), datahandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioReuseIrp(irp: MutPtr<Irp>, iostatus: Ntstatus) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoReuseIrp(irp.rawAddress.toString(), iostatus)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioSetActivityIdIrp(irp: MutPtr<Irp>, guid: ConstPtr<Guid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoSetActivityIdIrp(irp.rawAddress.toString(), guid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetActivityIdThread(activityid: ConstPtr<Guid>): MutPtr<Guid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoSetActivityIdThread(activityid.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetCompletionRoutineEx(deviceobject: ConstPtr<DeviceObject>, irp: ConstPtr<Irp>, completionroutine: PioCompletionRoutine, context: ConstPtr<CVoid>, invokeonsuccess: Boolean, invokeonerror: Boolean, invokeoncancel: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoSetCompletionRoutineEx(deviceobject.rawAddress.toString(), irp.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), invokeonsuccess, invokeonerror, invokeoncancel) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetDeviceInterfacePropertyData(symboliclinkname: ConstPtr<UnicodeString>, propertykey: ConstPtr<Devpropkey>, lcid: UInt, flags: UInt, type: UInt, size: UInt, data: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoSetDeviceInterfacePropertyData(symboliclinkname.rawAddress.toString(), propertykey.rawAddress.toString(), lcid.toInt(), flags.toInt(), type.toInt(), size.toInt(), data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetDeviceInterfaceState(symboliclinkname: ConstPtr<UnicodeString>, enable: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoSetDeviceInterfaceState(symboliclinkname.rawAddress.toString(), enable) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetDevicePropertyData(pdo: ConstPtr<DeviceObject>, propertykey: ConstPtr<Devpropkey>, lcid: UInt, flags: UInt, type: UInt, size: UInt, data: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoSetDevicePropertyData(pdo.rawAddress.toString(), propertykey.rawAddress.toString(), lcid.toInt(), flags.toInt(), type.toInt(), size.toInt(), data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetFileObjectIgnoreSharing(fileobject: ConstPtr<FileObject>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoSetFileObjectIgnoreSharing(fileobject.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetFileOrigin(fileobject: ConstPtr<FileObject>, remote: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoSetFileOrigin(fileobject.rawAddress.toString(), remote) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetFsZeroingOffset(irp: MutPtr<Irp>, zeroingoffset: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoSetFsZeroingOffset(irp.rawAddress.toString(), zeroingoffset.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetFsZeroingOffsetRequired(irp: MutPtr<Irp>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoSetFsZeroingOffsetRequired(irp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetHardErrorOrVerifyDevice(irp: ConstPtr<Irp>, deviceobject: ConstPtr<DeviceObject>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoSetHardErrorOrVerifyDevice(irp.rawAddress.toString(), deviceobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioSetIoAttributionIrp(irp: MutPtr<Irp>, attributionsource: ConstPtr<CVoid>, flags: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoSetIoAttributionIrp(irp.rawAddress.toString(), attributionsource.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetIoPriorityHint(irp: ConstPtr<Irp>, priorityhint: IoPriorityHint): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoSetIoPriorityHint(irp.rawAddress.toString(), priorityhint) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetIrpExtraCreateParameter(irp: MutPtr<Irp>, extracreateparameter: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoSetIrpExtraCreateParameter(irp.rawAddress.toString(), extracreateparameter.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetLinkShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: MutPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, linkshareaccess: MutPtr<LinkShareAccess>, ioshareaccessflags: UInt) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoSetLinkShareAccess(desiredaccess.toInt(), desiredshareaccess.toInt(), fileobject.rawAddress.toString(), shareaccess.rawAddress.toString(), linkshareaccess.rawAddress.toString(), ioshareaccessflags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioSetMasterIrpStatus(masterirp: MutPtr<Irp>, status: Ntstatus) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoSetMasterIrpStatus(masterirp.rawAddress.toString(), status)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioSetPartitionInformation(deviceobject: ConstPtr<DeviceObject>, sectorsize: UInt, partitionnumber: UInt, partitiontype: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoSetPartitionInformation(deviceobject.rawAddress.toString(), sectorsize.toInt(), partitionnumber.toInt(), partitiontype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetPartitionInformationEx(deviceobject: ConstPtr<DeviceObject>, partitionnumber: UInt, partitioninfo: ConstPtr<SetPartitionInformationEx>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoSetPartitionInformationEx(deviceobject.rawAddress.toString(), partitionnumber.toInt(), partitioninfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: MutPtr<FileObject>, shareaccess: MutPtr<ShareAccess>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoSetShareAccess(desiredaccess.toInt(), desiredshareaccess.toInt(), fileobject.rawAddress.toString(), shareaccess.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioSetShareAccessEx(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: MutPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, writepermission: ConstPtr<Boolean>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoSetShareAccessEx(desiredaccess.toInt(), desiredshareaccess.toInt(), fileobject.rawAddress.toString(), shareaccess.rawAddress.toString(), writepermission.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioSetStartIoAttributes(deviceobject: ConstPtr<DeviceObject>, deferredstartio: Boolean, noncancelable: Boolean) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoSetStartIoAttributes(deviceobject.rawAddress.toString(), deferredstartio, noncancelable)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioSetSystemPartition(volumenamestring: ConstPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoSetSystemPartition(volumenamestring.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetThreadHardErrorMode(enableharderrors: Boolean): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoSetThreadHardErrorMode(enableharderrors) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetTopLevelIrp(irp: ConstPtr<Irp>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoSetTopLevelIrp(irp.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioSizeOfIrpEx(deviceobject: ConstPtr<DeviceObject>, stacksize: Byte): UShort =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoSizeOfIrpEx(deviceobject.rawAddress.toString(), stacksize.toInt()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSizeofWorkItem(): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoSizeofWorkItem() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioStartNextPacket(deviceobject: ConstPtr<DeviceObject>, cancelable: Boolean) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoStartNextPacket(deviceobject.rawAddress.toString(), cancelable)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioStartNextPacketByKey(deviceobject: ConstPtr<DeviceObject>, cancelable: Boolean, key: UInt) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoStartNextPacketByKey(deviceobject.rawAddress.toString(), cancelable, key.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioStartPacket(deviceobject: ConstPtr<DeviceObject>, irp: ConstPtr<Irp>, key: ConstPtr<UInt>, cancelfunction: DriverCancel): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioStartTimer(deviceobject: ConstPtr<DeviceObject>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoStartTimer(deviceobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioStopTimer(deviceobject: ConstPtr<DeviceObject>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoStopTimer(deviceobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioSynchronousCallDriver(deviceobject: ConstPtr<DeviceObject>, irp: ConstPtr<Irp>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoSynchronousCallDriver(deviceobject.rawAddress.toString(), irp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioTransferActivityId(activityid: ConstPtr<Guid>, relatedactivityid: ConstPtr<Guid>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoTransferActivityId(activityid.rawAddress.toString(), relatedactivityid.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioTranslateBusAddress(interfacetype: InterfaceType, busnumber: UInt, busaddress: Long, addressspace: MutPtr<UInt>, translatedaddress: MutPtr<Long>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoTranslateBusAddress(interfacetype, busnumber.toInt(), busaddress.toString(), addressspace.rawAddress.toString(), translatedaddress.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioTryQueueWorkItem(ioworkitem: PioWorkitem, workerroutine: PioWorkitemRoutineEx, queuetype: WorkQueueType, context: ConstPtr<CVoid>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoTryQueueWorkItem(ioworkitem.toString(), 0L.toString(), queuetype, context.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioUninitializeWorkItem(ioworkitem: PioWorkitem) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoUninitializeWorkItem(ioworkitem.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioUnregisterBootDriverCallback(callbackhandle: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoUnregisterBootDriverCallback(callbackhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioUnregisterContainerNotification(callbackregistration: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoUnregisterContainerNotification(callbackregistration.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioUnregisterPlugPlayNotification(notificationentry: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoUnregisterPlugPlayNotification(notificationentry.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioUnregisterPlugPlayNotificationEx(notificationentry: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoUnregisterPlugPlayNotificationEx(notificationentry.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioUnregisterShutdownNotification(deviceobject: ConstPtr<DeviceObject>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoUnregisterShutdownNotification(deviceobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioUpdateLinkShareAccess(fileobject: ConstPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, linkshareaccess: MutPtr<LinkShareAccess>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoUpdateLinkShareAccess(fileobject.rawAddress.toString(), shareaccess.rawAddress.toString(), linkshareaccess.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioUpdateLinkShareAccessEx(fileobject: ConstPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, linkshareaccess: MutPtr<LinkShareAccess>, ioshareaccessflags: UInt) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoUpdateLinkShareAccessEx(fileobject.rawAddress.toString(), shareaccess.rawAddress.toString(), linkshareaccess.rawAddress.toString(), ioshareaccessflags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioUpdateShareAccess(fileobject: ConstPtr<FileObject>, shareaccess: MutPtr<ShareAccess>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoUpdateShareAccess(fileobject.rawAddress.toString(), shareaccess.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioValidateDeviceIoControlAccess(irp: ConstPtr<Irp>, requiredaccess: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoValidateDeviceIoControlAccess(irp.rawAddress.toString(), requiredaccess.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioVerifyPartitionTable(deviceobject: ConstPtr<DeviceObject>, fixerrors: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoVerifyPartitionTable(deviceobject.rawAddress.toString(), fixerrors) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioVolumeDeviceNameToGuid(volumedevicename: ConstPtr<UnicodeString>, guid: MutPtr<Guid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoVolumeDeviceNameToGuid(volumedevicename.rawAddress.toString(), guid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioVolumeDeviceNameToGuidPath(volumedevicename: ConstPtr<UnicodeString>, guidpath: MutPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoVolumeDeviceNameToGuidPath(volumedevicename.rawAddress.toString(), guidpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioVolumeDeviceToDosName(volumedeviceobject: ConstPtr<CVoid>, dosname: MutPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoVolumeDeviceToDosName(volumedeviceobject.rawAddress.toString(), dosname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioVolumeDeviceToGuid(volumedeviceobject: ConstPtr<CVoid>, guid: MutPtr<Guid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoVolumeDeviceToGuid(volumedeviceobject.rawAddress.toString(), guid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioVolumeDeviceToGuidPath(volumedeviceobject: ConstPtr<CVoid>, guidpath: MutPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoVolumeDeviceToGuidPath(volumedeviceobject.rawAddress.toString(), guidpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMIAllocateInstanceIds(guid: ConstPtr<Guid>, instancecount: UInt, firstinstanceid: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoWMIAllocateInstanceIds(guid.rawAddress.toString(), instancecount.toInt(), firstinstanceid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMIDeviceObjectToInstanceName(datablockobject: ConstPtr<CVoid>, deviceobject: ConstPtr<DeviceObject>, instancename: MutPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoWMIDeviceObjectToInstanceName(datablockobject.rawAddress.toString(), deviceobject.rawAddress.toString(), instancename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMIExecuteMethod(datablockobject: ConstPtr<CVoid>, instancename: ConstPtr<UnicodeString>, methodid: UInt, inbuffersize: UInt, outbuffersize: MutPtr<UInt>, inoutbuffer: MutPtr<UByte>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoWMIExecuteMethod(datablockobject.rawAddress.toString(), instancename.rawAddress.toString(), methodid.toInt(), inbuffersize.toInt(), outbuffersize.rawAddress.toString(), inoutbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMIHandleToInstanceName(datablockobject: ConstPtr<CVoid>, filehandle: Handle, instancename: MutPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoWMIHandleToInstanceName(datablockobject.rawAddress.toString(), filehandle.rawAddress.toString(), instancename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMIOpenBlock(guid: ConstPtr<Guid>, desiredaccess: UInt, datablockobject: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoWMIOpenBlock(guid.rawAddress.toString(), desiredaccess.toInt(), datablockobject.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMIQueryAllData(datablockobject: ConstPtr<CVoid>, inoutbuffersize: MutPtr<UInt>, outbuffer: MutPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoWMIQueryAllData(datablockobject.rawAddress.toString(), inoutbuffersize.rawAddress.toString(), outbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMIQueryAllDataMultiple(datablockobjectlist: ConstPtr<ConstPtr<CVoid>>, objectcount: UInt, inoutbuffersize: MutPtr<UInt>, outbuffer: MutPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoWMIQueryAllDataMultiple(datablockobjectlist.rawAddress.toString(), objectcount.toInt(), inoutbuffersize.rawAddress.toString(), outbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMIQuerySingleInstance(datablockobject: ConstPtr<CVoid>, instancename: ConstPtr<UnicodeString>, inoutbuffersize: MutPtr<UInt>, outbuffer: MutPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoWMIQuerySingleInstance(datablockobject.rawAddress.toString(), instancename.rawAddress.toString(), inoutbuffersize.rawAddress.toString(), outbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMIQuerySingleInstanceMultiple(datablockobjectlist: ConstPtr<ConstPtr<CVoid>>, instancenames: ConstPtr<UnicodeString>, objectcount: UInt, inoutbuffersize: MutPtr<UInt>, outbuffer: MutPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoWMIQuerySingleInstanceMultiple(datablockobjectlist.rawAddress.toString(), instancenames.rawAddress.toString(), objectcount.toInt(), inoutbuffersize.rawAddress.toString(), outbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMIRegistrationControl(deviceobject: ConstPtr<DeviceObject>, action: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoWMIRegistrationControl(deviceobject.rawAddress.toString(), action.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMISetNotificationCallback(obj: MutPtr<CVoid>, callback: WmiNotificationCallback, context: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoWMISetNotificationCallback(obj.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMISetSingleInstance(datablockobject: ConstPtr<CVoid>, instancename: ConstPtr<UnicodeString>, version: UInt, valuebuffersize: UInt, valuebuffer: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoWMISetSingleInstance(datablockobject.rawAddress.toString(), instancename.rawAddress.toString(), version.toInt(), valuebuffersize.toInt(), valuebuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMISetSingleItem(datablockobject: ConstPtr<CVoid>, instancename: ConstPtr<UnicodeString>, dataitemid: UInt, version: UInt, valuebuffersize: UInt, valuebuffer: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoWMISetSingleItem(datablockobject.rawAddress.toString(), instancename.rawAddress.toString(), dataitemid.toInt(), version.toInt(), valuebuffersize.toInt(), valuebuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMISuggestInstanceName(physicaldeviceobject: ConstPtr<DeviceObject>, symboliclinkname: ConstPtr<UnicodeString>, combinenames: Boolean, suggestedinstancename: MutPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoWMISuggestInstanceName(physicaldeviceobject.rawAddress.toString(), symboliclinkname.rawAddress.toString(), combinenames, suggestedinstancename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMIWriteEvent(wnodeeventitem: MutPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoWMIWriteEvent(wnodeeventitem.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWithinStackLimits(regionstart: ULong, regionsize: ULong): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoWithinStackLimits(regionstart.toString(), regionsize.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWriteErrorLogEntry(elentry: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoWriteErrorLogEntry(elentry.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioWriteKsrPersistentMemory(datahandle: ConstPtr<CVoid>, buffer: ConstPtr<CVoid>, size: ULong): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoWriteKsrPersistentMemory(datahandle.rawAddress.toString(), buffer.rawAddress.toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWritePartitionTable(deviceobject: ConstPtr<DeviceObject>, sectorsize: UInt, sectorspertrack: UInt, numberofheads: UInt, partitionbuffer: ConstPtr<DriveLayoutInformation>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoWritePartitionTable(deviceobject.rawAddress.toString(), sectorsize.toInt(), sectorspertrack.toInt(), numberofheads.toInt(), partitionbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWritePartitionTableEx(deviceobject: ConstPtr<DeviceObject>, drivelayout: ConstPtr<DriveLayoutInformationEx>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIoWritePartitionTableEx(deviceobject.rawAddress.toString(), drivelayout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iofCallDriver(deviceobject: ConstPtr<DeviceObject>, irp: MutPtr<Irp>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIofCallDriver(deviceobject.rawAddress.toString(), irp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iofCompleteRequest(irp: ConstPtr<Irp>, priorityboost: Byte) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesIofCompleteRequest(irp.rawAddress.toString(), priorityboost.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun kdChangeOption(option: KdOption, inbufferbytes: UInt, inbuffer: ConstPtr<CVoid>, outbufferbytes: UInt, outbuffer: MutPtr<CVoid>, outbufferneeded: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKdChangeOption(option, inbufferbytes.toInt(), inbuffer.rawAddress.toString(), outbufferbytes.toInt(), outbuffer.rawAddress.toString(), outbufferneeded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kdDisableDebugger(): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKdDisableDebugger() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kdEnableDebugger(): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKdEnableDebugger() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kdRefreshDebuggerNotPresent(): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKdRefreshDebuggerNotPresent() as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keAcquireGuardedMutex(mutex: MutPtr<FastMutex>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeAcquireGuardedMutex(mutex.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keAcquireGuardedMutexUnsafe(fastmutex: MutPtr<FastMutex>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeAcquireGuardedMutexUnsafe(fastmutex.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keAcquireInStackQueuedSpinLock(spinlock: MutPtr<ULong>, lockhandle: MutPtr<KlockQueueHandle>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeAcquireInStackQueuedSpinLock(spinlock.rawAddress.toString(), lockhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keAcquireInStackQueuedSpinLockAtDpcLevel(spinlock: MutPtr<ULong>, lockhandle: MutPtr<KlockQueueHandle>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeAcquireInStackQueuedSpinLockAtDpcLevel(spinlock.rawAddress.toString(), lockhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keAcquireInStackQueuedSpinLockForDpc(spinlock: MutPtr<ULong>, lockhandle: MutPtr<KlockQueueHandle>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeAcquireInStackQueuedSpinLockForDpc(spinlock.rawAddress.toString(), lockhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keAcquireInterruptSpinLock(interrupt: Pkinterrupt): UByte =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeAcquireInterruptSpinLock(interrupt.toString()) as Int).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keAcquireSpinLockForDpc(spinlock: MutPtr<ULong>): UByte =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeAcquireSpinLockForDpc(spinlock.rawAddress.toString()) as Int).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keAddTriageDumpDataBlock(ktriagedumpdataarray: MutPtr<KtriageDumpDataArray>, address: ConstPtr<CVoid>, size: ULong): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeAddTriageDumpDataBlock(ktriagedumpdataarray.rawAddress.toString(), address.rawAddress.toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keAreAllApcsDisabled(): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeAreAllApcsDisabled() as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keAreApcsDisabled(): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeAreApcsDisabled() as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keBugCheck(bugcheckcode: BugcheckError) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeBugCheck(bugcheckcode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keBugCheckEx(bugcheckcode: BugcheckError, bugcheckparameter1: ULong, bugcheckparameter2: ULong, bugcheckparameter3: ULong, bugcheckparameter4: ULong) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeBugCheckEx(bugcheckcode.toInt(), bugcheckparameter1.toString(), bugcheckparameter2.toString(), bugcheckparameter3.toString(), bugcheckparameter4.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keCancelTimer(param0: MutPtr<Ktimer>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeCancelTimer(param0.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keClearEvent(event: MutPtr<Kevent>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeClearEvent(event.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keConvertAuxiliaryCounterToPerformanceCounter(auxiliarycountervalue: ULong, performancecountervalue: MutPtr<ULong>, conversionerror: MutPtr<ULong>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeConvertAuxiliaryCounterToPerformanceCounter(auxiliarycountervalue.toString(), performancecountervalue.rawAddress.toString(), conversionerror.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keConvertPerformanceCounterToAuxiliaryCounter(performancecountervalue: ULong, auxiliarycountervalue: MutPtr<ULong>, conversionerror: MutPtr<ULong>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeConvertPerformanceCounterToAuxiliaryCounter(performancecountervalue.toString(), auxiliarycountervalue.rawAddress.toString(), conversionerror.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keDelayExecutionThread(waitmode: Byte, alertable: Boolean, interval: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeDelayExecutionThread(waitmode.toInt(), alertable, interval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keDeregisterBoundCallback(handle: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeDeregisterBoundCallback(handle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keDeregisterBugCheckCallback(callbackrecord: MutPtr<KbugcheckCallbackRecord>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeDeregisterBugCheckCallback(callbackrecord.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keDeregisterBugCheckReasonCallback(callbackrecord: MutPtr<KbugcheckReasonCallbackRecord>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeDeregisterBugCheckReasonCallback(callbackrecord.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keDeregisterNmiCallback(handle: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeDeregisterNmiCallback(handle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keDeregisterProcessorChangeCallback(callbackhandle: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeDeregisterProcessorChangeCallback(callbackhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keEnterCriticalRegion() {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeEnterCriticalRegion()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keEnterGuardedRegion() {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeEnterGuardedRegion()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keExpandKernelStackAndCallout(callout: PexpandStackCallout, parameter: ConstPtr<CVoid>, size: ULong): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeExpandKernelStackAndCallout(0L.toString(), parameter.rawAddress.toString(), size.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keExpandKernelStackAndCalloutEx(callout: PexpandStackCallout, parameter: ConstPtr<CVoid>, size: ULong, wait: Boolean, context: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeExpandKernelStackAndCalloutEx(0L.toString(), parameter.rawAddress.toString(), size.toString(), wait, context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keFlushIoBuffers(mdl: ConstPtr<Mdl>, readoperation: Boolean, dmaoperation: Boolean) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeFlushIoBuffers(mdl.rawAddress.toString(), readoperation, dmaoperation)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keFlushQueuedDpcs() {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeFlushQueuedDpcs()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keFlushWriteBuffer() {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeFlushWriteBuffer()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keGetCurrentIrql(): UByte =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeGetCurrentIrql() as Int).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keGetCurrentNodeNumber(): UShort =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeGetCurrentNodeNumber() as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keGetCurrentProcessorNumberEx(procnumber: MutPtr<ProcessorNumber>): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeGetCurrentProcessorNumberEx(procnumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keGetProcessorIndexFromNumber(procnumber: ConstPtr<ProcessorNumber>): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeGetProcessorIndexFromNumber(procnumber.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keGetProcessorNumberFromIndex(procindex: UInt, procnumber: MutPtr<ProcessorNumber>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeGetProcessorNumberFromIndex(procindex.toInt(), procnumber.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keGetRecommendedSharedDataAlignment(): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeGetRecommendedSharedDataAlignment() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keInitializeCrashDumpHeader(dumptype: UInt, flags: UInt, buffer: MutPtr<CVoid>, buffersize: UInt, bufferneeded: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeInitializeCrashDumpHeader(dumptype.toInt(), flags.toInt(), buffer.rawAddress.toString(), buffersize.toInt(), bufferneeded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keInitializeDeviceQueue(devicequeue: MutPtr<KdeviceQueue>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeInitializeDeviceQueue(devicequeue.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keInitializeDpc(dpc: MutPtr<Kdpc>, deferredroutine: PkdeferredRoutine, deferredcontext: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeInitializeDpc(dpc.rawAddress.toString(), 0L.toString(), deferredcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keInitializeEvent(event: MutPtr<Kevent>, type: EventType, state: Boolean) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeInitializeEvent(event.rawAddress.toString(), type, state)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keInitializeGuardedMutex(mutex: MutPtr<FastMutex>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeInitializeGuardedMutex(mutex.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keInitializeMutex(mutex: MutPtr<Kmutant>, level: UInt) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeInitializeMutex(mutex.rawAddress.toString(), level.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keInitializeSemaphore(semaphore: MutPtr<Ksemaphore>, count: Int, limit: Int) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeInitializeSemaphore(semaphore.rawAddress.toString(), count, limit)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keInitializeSpinLock(spinlock: MutPtr<ULong>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeInitializeSpinLock(spinlock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keInitializeThreadedDpc(dpc: MutPtr<Kdpc>, deferredroutine: PkdeferredRoutine, deferredcontext: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeInitializeThreadedDpc(dpc.rawAddress.toString(), 0L.toString(), deferredcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keInitializeTimer(timer: MutPtr<Ktimer>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeInitializeTimer(timer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keInitializeTimerEx(timer: MutPtr<Ktimer>, type: TimerType) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeInitializeTimerEx(timer.rawAddress.toString(), type)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keInitializeTriageDumpDataArray(ktriagedumpdataarray: MutPtr<KtriageDumpDataArray>, size: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeInitializeTriageDumpDataArray(ktriagedumpdataarray.rawAddress.toString(), size.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keInsertByKeyDeviceQueue(devicequeue: MutPtr<KdeviceQueue>, devicequeueentry: MutPtr<KdeviceQueueEntry>, sortkey: UInt): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeInsertByKeyDeviceQueue(devicequeue.rawAddress.toString(), devicequeueentry.rawAddress.toString(), sortkey.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keInsertDeviceQueue(devicequeue: MutPtr<KdeviceQueue>, devicequeueentry: MutPtr<KdeviceQueueEntry>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeInsertDeviceQueue(devicequeue.rawAddress.toString(), devicequeueentry.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keInsertQueueDpc(dpc: MutPtr<Kdpc>, systemargument1: ConstPtr<CVoid>, systemargument2: ConstPtr<CVoid>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeInsertQueueDpc(dpc.rawAddress.toString(), systemargument1.rawAddress.toString(), systemargument2.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keInvalidateAllCaches(): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeInvalidateAllCaches() as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keInvalidateRangeAllCaches(baseaddress: ConstPtr<CVoid>, length: UInt) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeInvalidateRangeAllCaches(baseaddress.rawAddress.toString(), length.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keIpiGenericCall(broadcastfunction: PkipiBroadcastWorker, context: ULong): ULong =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeIpiGenericCall(0L.toString(), context.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keIsExecutingDpc(): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeIsExecutingDpc() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keLeaveCriticalRegion() {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeLeaveCriticalRegion()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keLeaveGuardedRegion() {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeLeaveGuardedRegion()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun kePulseEvent(event: MutPtr<Kevent>, increment: Int, wait: Boolean): Int =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKePulseEvent(event.rawAddress.toString(), increment, wait) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryActiveGroupCount(): UShort =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeQueryActiveGroupCount() as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryActiveProcessorCount(activeprocessors: MutPtr<ULong>): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeQueryActiveProcessorCount(activeprocessors.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryActiveProcessorCountEx(groupnumber: UShort): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeQueryActiveProcessorCountEx(groupnumber.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryActiveProcessors(): ULong =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeQueryActiveProcessors() as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryAuxiliaryCounterFrequency(auxiliarycounterfrequency: MutPtr<ULong>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeQueryAuxiliaryCounterFrequency(auxiliarycounterfrequency.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryDpcWatchdogInformation(watchdoginformation: MutPtr<KdpcWatchdogInformation>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeQueryDpcWatchdogInformation(watchdoginformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryGroupAffinity(groupnumber: UShort): ULong =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeQueryGroupAffinity(groupnumber.toInt()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryHardwareCounterConfiguration(counterarray: MutPtr<HardwareCounter>, maximumcount: UInt, count: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeQueryHardwareCounterConfiguration(counterarray.rawAddress.toString(), maximumcount.toInt(), count.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryHighestNodeNumber(): UShort =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeQueryHighestNodeNumber() as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryInterruptTimePrecise(qpctimestamp: MutPtr<ULong>): ULong =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeQueryInterruptTimePrecise(qpctimestamp.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryLogicalProcessorRelationship(processornumber: ConstPtr<ProcessorNumber>, relationshiptype: LogicalProcessorRelationship, information: MutPtr<SystemLogicalProcessorInformationEx>, length: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeQueryLogicalProcessorRelationship(processornumber.rawAddress.toString(), relationshiptype, information.rawAddress.toString(), length.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryMaximumGroupCount(): UShort =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeQueryMaximumGroupCount() as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryMaximumProcessorCount(): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeQueryMaximumProcessorCount() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryMaximumProcessorCountEx(groupnumber: UShort): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeQueryMaximumProcessorCountEx(groupnumber.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryNodeActiveAffinity(nodenumber: UShort, affinity: MutPtr<GroupAffinity>, count: MutPtr<UShort>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeQueryNodeActiveAffinity(nodenumber.toInt(), affinity.rawAddress.toString(), count.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keQueryNodeActiveAffinity2(nodenumber: UShort, groupaffinities: MutPtr<GroupAffinity>, groupaffinitiescount: UShort, groupaffinitiesrequired: MutPtr<UShort>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeQueryNodeActiveAffinity2(nodenumber.toInt(), groupaffinities.rawAddress.toString(), groupaffinitiescount.toInt(), groupaffinitiesrequired.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryNodeActiveProcessorCount(nodenumber: UShort): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeQueryNodeActiveProcessorCount(nodenumber.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryNodeMaximumProcessorCount(nodenumber: UShort): UShort =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeQueryNodeMaximumProcessorCount(nodenumber.toInt()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryPerformanceCounter(performancefrequency: MutPtr<Long>): Long =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeQueryPerformanceCounter(performancefrequency.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryPriorityThread(thread: Pkthread): Int =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeQueryPriorityThread(thread.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryRuntimeThread(thread: Pkthread, usertime: MutPtr<UInt>): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeQueryRuntimeThread(thread.toString(), usertime.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQuerySystemTimePrecise(currenttime: MutPtr<Long>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeQuerySystemTimePrecise(currenttime.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keQueryTimeIncrement(): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeQueryTimeIncrement() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryTotalCycleTimeThread(thread: Pkthread, cycletimestamp: MutPtr<ULong>): ULong =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeQueryTotalCycleTimeThread(thread.toString(), cycletimestamp.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryUnbiasedInterruptTime(): ULong =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeQueryUnbiasedInterruptTime() as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryUnbiasedInterruptTimePrecise(qpctimestamp: MutPtr<ULong>): ULong =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeQueryUnbiasedInterruptTimePrecise(qpctimestamp.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keReadStateEvent(event: ConstPtr<Kevent>): Int =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeReadStateEvent(event.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keReadStateMutex(mutex: ConstPtr<Kmutant>): Int =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeReadStateMutex(mutex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keReadStateSemaphore(semaphore: ConstPtr<Ksemaphore>): Int =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeReadStateSemaphore(semaphore.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keReadStateTimer(timer: ConstPtr<Ktimer>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeReadStateTimer(timer.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keRegisterBoundCallback(callbackroutine: PboundCallback): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeRegisterBoundCallback(0L.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keRegisterBugCheckCallback(callbackrecord: MutPtr<KbugcheckCallbackRecord>, callbackroutine: PkbugcheckCallbackRoutine, buffer: ConstPtr<CVoid>, length: UInt, component: ConstPtr<UByte>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeRegisterBugCheckCallback(callbackrecord.rawAddress.toString(), 0L.toString(), buffer.rawAddress.toString(), length.toInt(), component.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keRegisterBugCheckReasonCallback(callbackrecord: MutPtr<KbugcheckReasonCallbackRecord>, callbackroutine: PkbugcheckReasonCallbackRoutine, reason: KbugcheckCallbackReason, component: ConstPtr<UByte>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeRegisterBugCheckReasonCallback(callbackrecord.rawAddress.toString(), 0L.toString(), reason, component.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keRegisterNmiCallback(callbackroutine: PnmiCallback, context: ConstPtr<CVoid>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeRegisterNmiCallback(0L.toString(), context.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keRegisterProcessorChangeCallback(callbackfunction: PprocessorCallbackFunction, callbackcontext: ConstPtr<CVoid>, flags: UInt): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeRegisterProcessorChangeCallback(0L.toString(), callbackcontext.rawAddress.toString(), flags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keReleaseGuardedMutex(mutex: MutPtr<FastMutex>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeReleaseGuardedMutex(mutex.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keReleaseGuardedMutexUnsafe(fastmutex: MutPtr<FastMutex>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeReleaseGuardedMutexUnsafe(fastmutex.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keReleaseInStackQueuedSpinLock(lockhandle: ConstPtr<KlockQueueHandle>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeReleaseInStackQueuedSpinLock(lockhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keReleaseInStackQueuedSpinLockForDpc(lockhandle: ConstPtr<KlockQueueHandle>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeReleaseInStackQueuedSpinLockForDpc(lockhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keReleaseInStackQueuedSpinLockFromDpcLevel(lockhandle: ConstPtr<KlockQueueHandle>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeReleaseInStackQueuedSpinLockFromDpcLevel(lockhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keReleaseInterruptSpinLock(interrupt: Pkinterrupt, oldirql: UByte) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeReleaseInterruptSpinLock(interrupt.toString(), oldirql.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keReleaseMutex(mutex: MutPtr<Kmutant>, wait: Boolean): Int =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeReleaseMutex(mutex.rawAddress.toString(), wait) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keReleaseSemaphore(semaphore: MutPtr<Ksemaphore>, increment: Int, adjustment: Int, wait: Boolean): Int =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeReleaseSemaphore(semaphore.rawAddress.toString(), increment, adjustment, wait) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keReleaseSpinLockForDpc(spinlock: MutPtr<ULong>, oldirql: UByte) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeReleaseSpinLockForDpc(spinlock.rawAddress.toString(), oldirql.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keRemoveByKeyDeviceQueue(devicequeue: MutPtr<KdeviceQueue>, sortkey: UInt): MutPtr<KdeviceQueueEntry> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeRemoveByKeyDeviceQueue(devicequeue.rawAddress.toString(), sortkey.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keRemoveByKeyDeviceQueueIfBusy(devicequeue: MutPtr<KdeviceQueue>, sortkey: UInt): MutPtr<KdeviceQueueEntry> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeRemoveByKeyDeviceQueueIfBusy(devicequeue.rawAddress.toString(), sortkey.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keRemoveDeviceQueue(devicequeue: MutPtr<KdeviceQueue>): MutPtr<KdeviceQueueEntry> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeRemoveDeviceQueue(devicequeue.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keRemoveEntryDeviceQueue(devicequeue: MutPtr<KdeviceQueue>, devicequeueentry: MutPtr<KdeviceQueueEntry>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeRemoveEntryDeviceQueue(devicequeue.rawAddress.toString(), devicequeueentry.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keRemoveQueueDpc(dpc: MutPtr<Kdpc>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeRemoveQueueDpc(dpc.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keRemoveQueueDpcEx(dpc: MutPtr<Kdpc>, waitifactive: Boolean): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeRemoveQueueDpcEx(dpc.rawAddress.toString(), waitifactive) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keResetEvent(event: MutPtr<Kevent>): Int =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeResetEvent(event.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keRestoreExtendedProcessorState(xstatesave: ConstPtr<XstateSave>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeRestoreExtendedProcessorState(xstatesave.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keRevertToUserAffinityThread() {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeRevertToUserAffinityThread()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keRevertToUserAffinityThreadEx(affinity: ULong) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeRevertToUserAffinityThreadEx(affinity.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keRevertToUserGroupAffinityThread(previousaffinity: ConstPtr<GroupAffinity>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeRevertToUserGroupAffinityThread(previousaffinity.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keSaveExtendedProcessorState(mask: ULong, xstatesave: MutPtr<XstateSave>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeSaveExtendedProcessorState(mask.toString(), xstatesave.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keSetBasePriorityThread(thread: Pkthread, increment: Int): Int =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeSetBasePriorityThread(thread.toString(), increment) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keSetCoalescableTimer(timer: MutPtr<Ktimer>, duetime: Long, period: UInt, tolerabledelay: UInt, dpc: ConstPtr<Kdpc>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeSetCoalescableTimer(timer.rawAddress.toString(), duetime.toString(), period.toInt(), tolerabledelay.toInt(), dpc.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keSetEvent(event: MutPtr<Kevent>, increment: Int, wait: Boolean): Int =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeSetEvent(event.rawAddress.toString(), increment, wait) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keSetHardwareCounterConfiguration(counterarray: ConstPtr<HardwareCounter>, count: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeSetHardwareCounterConfiguration(counterarray.rawAddress.toString(), count.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keSetImportanceDpc(dpc: MutPtr<Kdpc>, importance: KdpcImportance) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeSetImportanceDpc(dpc.rawAddress.toString(), importance)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keSetPriorityThread(thread: Pkthread, priority: Int): Int =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeSetPriorityThread(thread.toString(), priority) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keSetSystemAffinityThread(affinity: ULong) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeSetSystemAffinityThread(affinity.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keSetSystemAffinityThreadEx(affinity: ULong): ULong =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeSetSystemAffinityThreadEx(affinity.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keSetSystemGroupAffinityThread(affinity: ConstPtr<GroupAffinity>, previousaffinity: MutPtr<GroupAffinity>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeSetSystemGroupAffinityThread(affinity.rawAddress.toString(), previousaffinity.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keSetTargetProcessorDpc(dpc: MutPtr<Kdpc>, number: Byte) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeSetTargetProcessorDpc(dpc.rawAddress.toString(), number.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keSetTargetProcessorDpcEx(dpc: MutPtr<Kdpc>, procnumber: ConstPtr<ProcessorNumber>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeSetTargetProcessorDpcEx(dpc.rawAddress.toString(), procnumber.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keSetTimer(timer: MutPtr<Ktimer>, duetime: Long, dpc: ConstPtr<Kdpc>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeSetTimer(timer.rawAddress.toString(), duetime.toString(), dpc.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keSetTimerEx(timer: MutPtr<Ktimer>, duetime: Long, period: Int, dpc: ConstPtr<Kdpc>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeSetTimerEx(timer.rawAddress.toString(), duetime.toString(), period, dpc.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keShouldYieldProcessor(): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeShouldYieldProcessor() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keStallExecutionProcessor(microseconds: UInt) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeStallExecutionProcessor(microseconds.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keSynchronizeExecution(interrupt: Pkinterrupt, synchronizeroutine: PksynchronizeRoutine, synchronizecontext: ConstPtr<CVoid>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeSynchronizeExecution(interrupt.toString(), 0L.toString(), synchronizecontext.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keTestSpinLock(spinlock: ConstPtr<ULong>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeTestSpinLock(spinlock.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keTryToAcquireGuardedMutex(mutex: MutPtr<FastMutex>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeTryToAcquireGuardedMutex(mutex.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keTryToAcquireSpinLockAtDpcLevel(spinlock: MutPtr<ULong>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeTryToAcquireSpinLockAtDpcLevel(spinlock.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keWaitForMultipleObjects(count: UInt, obj: ConstPtr<ConstPtr<CVoid>>, waittype: WaitType, waitreason: KwaitReason, waitmode: Byte, alertable: Boolean, timeout: ConstPtr<Long>, waitblockarray: MutPtr<KwaitBlock>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeWaitForMultipleObjects(count.toInt(), obj.rawAddress.toString(), waittype, waitreason, waitmode.toInt(), alertable, timeout.rawAddress.toString(), waitblockarray.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keWaitForSingleObject(obj: ConstPtr<CVoid>, waitreason: KwaitReason, waitmode: Byte, alertable: Boolean, timeout: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKeWaitForSingleObject(obj.rawAddress.toString(), waitreason, waitmode.toInt(), alertable, timeout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kfRaiseIrql(newirql: UByte): UByte =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesKfRaiseIrql(newirql.toInt()) as Int).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAddPhysicalMemory(startaddress: ConstPtr<Long>, numberofbytes: MutPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmAddPhysicalMemory(startaddress.rawAddress.toString(), numberofbytes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAddVerifierSpecialThunks(entryroutine: ULong, thunkbuffer: ConstPtr<CVoid>, thunkbuffersize: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmAddVerifierSpecialThunks(entryroutine.toString(), thunkbuffer.rawAddress.toString(), thunkbuffersize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAddVerifierThunks(thunkbuffer: ConstPtr<CVoid>, thunkbuffersize: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmAddVerifierThunks(thunkbuffer.rawAddress.toString(), thunkbuffersize.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAdvanceMdl(mdl: MutPtr<Mdl>, numberofbytes: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmAdvanceMdl(mdl.rawAddress.toString(), numberofbytes.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAllocateContiguousMemory(numberofbytes: ULong, highestacceptableaddress: Long): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmAllocateContiguousMemory(numberofbytes.toString(), highestacceptableaddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAllocateContiguousMemoryEx(numberofbytes: ConstPtr<ULong>, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, preferrednode: UInt, protect: UInt, partitionobject: ConstPtr<CVoid>, tag: UInt, flags: UInt, baseaddress: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmAllocateContiguousMemoryEx(numberofbytes.rawAddress.toString(), lowestacceptableaddress.toString(), highestacceptableaddress.toString(), boundaryaddressmultiple.toString(), preferrednode.toInt(), protect.toInt(), partitionobject.rawAddress.toString(), tag.toInt(), flags.toInt(), baseaddress.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAllocateContiguousMemorySpecifyCache(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, cachetype: MemoryCachingType): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmAllocateContiguousMemorySpecifyCache(numberofbytes.toString(), lowestacceptableaddress.toString(), highestacceptableaddress.toString(), boundaryaddressmultiple.toString(), cachetype) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAllocateContiguousMemorySpecifyCacheNode(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, cachetype: MemoryCachingType, preferrednode: UInt): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmAllocateContiguousMemorySpecifyCacheNode(numberofbytes.toString(), lowestacceptableaddress.toString(), highestacceptableaddress.toString(), boundaryaddressmultiple.toString(), cachetype, preferrednode.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAllocateContiguousNodeMemory(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, protect: UInt, preferrednode: UInt): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmAllocateContiguousNodeMemory(numberofbytes.toString(), lowestacceptableaddress.toString(), highestacceptableaddress.toString(), boundaryaddressmultiple.toString(), protect.toInt(), preferrednode.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAllocateMappingAddress(numberofbytes: ULong, pooltag: UInt): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmAllocateMappingAddress(numberofbytes.toString(), pooltag.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAllocateMappingAddressEx(numberofbytes: ULong, pooltag: UInt, flags: UInt): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmAllocateMappingAddressEx(numberofbytes.toString(), pooltag.toInt(), flags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAllocateMdlForIoSpace(physicaladdresslist: ConstPtr<MmPhysicalAddressList>, numberofentries: ULong, newmdl: MutPtr<MutPtr<Mdl>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmAllocateMdlForIoSpace(physicaladdresslist.rawAddress.toString(), numberofentries.toString(), newmdl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAllocateNodePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MemoryCachingType, idealnode: UInt, flags: UInt): MutPtr<Mdl> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmAllocateNodePagesForMdlEx(lowaddress.toString(), highaddress.toString(), skipbytes.toString(), totalbytes.toString(), cachetype, idealnode.toInt(), flags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAllocateNonCachedMemory(numberofbytes: ULong): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmAllocateNonCachedMemory(numberofbytes.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAllocatePagesForMdl(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong): MutPtr<Mdl> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmAllocatePagesForMdl(lowaddress.toString(), highaddress.toString(), skipbytes.toString(), totalbytes.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAllocatePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MemoryCachingType, flags: UInt): MutPtr<Mdl> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmAllocatePagesForMdlEx(lowaddress.toString(), highaddress.toString(), skipbytes.toString(), totalbytes.toString(), cachetype, flags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAllocatePartitionNodePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MemoryCachingType, idealnode: UInt, flags: UInt, partitionobject: ConstPtr<CVoid>): MutPtr<Mdl> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmAllocatePartitionNodePagesForMdlEx(lowaddress.toString(), highaddress.toString(), skipbytes.toString(), totalbytes.toString(), cachetype, idealnode.toInt(), flags.toInt(), partitionobject.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAreMdlPagesCached(memorydescriptorlist: ConstPtr<Mdl>): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmAreMdlPagesCached(memorydescriptorlist.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmBuildMdlForNonPagedPool(memorydescriptorlist: MutPtr<Mdl>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmBuildMdlForNonPagedPool(memorydescriptorlist.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmCopyMemory(targetaddress: ConstPtr<CVoid>, sourceaddress: MmCopyAddress, numberofbytes: ULong, flags: UInt, numberofbytestransferred: MutPtr<ULong>): Ntstatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmCreateMdl(memorydescriptorlist: MutPtr<Mdl>, base: ConstPtr<CVoid>, length: ULong): MutPtr<Mdl> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmCreateMdl(memorydescriptorlist.rawAddress.toString(), base.rawAddress.toString(), length.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmCreateMirror(): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmCreateMirror() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmFreeContiguousMemory(baseaddress: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmFreeContiguousMemory(baseaddress.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmFreeContiguousMemorySpecifyCache(baseaddress: ConstPtr<CVoid>, numberofbytes: ULong, cachetype: MemoryCachingType) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmFreeContiguousMemorySpecifyCache(baseaddress.rawAddress.toString(), numberofbytes.toString(), cachetype)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmFreeMappingAddress(baseaddress: ConstPtr<CVoid>, pooltag: UInt) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmFreeMappingAddress(baseaddress.rawAddress.toString(), pooltag.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmFreeNonCachedMemory(baseaddress: ConstPtr<CVoid>, numberofbytes: ULong) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmFreeNonCachedMemory(baseaddress.rawAddress.toString(), numberofbytes.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmFreePagesFromMdl(memorydescriptorlist: MutPtr<Mdl>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmFreePagesFromMdl(memorydescriptorlist.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmFreePagesFromMdlEx(memorydescriptorlist: MutPtr<Mdl>, flags: UInt) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmFreePagesFromMdlEx(memorydescriptorlist.rawAddress.toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmGetCacheAttribute(physicaladdress: Long, cachetype: MutPtr<MemoryCachingType>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmGetCacheAttribute(physicaladdress.toString(), cachetype.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmGetCacheAttributeEx(physicaladdress: Long, flags: UInt, cachetype: MutPtr<MemoryCachingType>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmGetCacheAttributeEx(physicaladdress.toString(), flags.toInt(), cachetype.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmGetPhysicalAddress(baseaddress: ConstPtr<CVoid>): Long =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmGetPhysicalAddress(baseaddress.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmGetPhysicalMemoryRanges(): MutPtr<PhysicalMemoryRange> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmGetPhysicalMemoryRanges() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmGetPhysicalMemoryRangesEx(partitionobject: ConstPtr<CVoid>): MutPtr<PhysicalMemoryRange> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmGetPhysicalMemoryRangesEx(partitionobject.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmGetPhysicalMemoryRangesEx2(partitionobject: ConstPtr<CVoid>, flags: UInt): MutPtr<PhysicalMemoryRange> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmGetPhysicalMemoryRangesEx2(partitionobject.rawAddress.toString(), flags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmGetSystemRoutineAddress(systemroutinename: ConstPtr<UnicodeString>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmGetSystemRoutineAddress(systemroutinename.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmGetVirtualForPhysical(physicaladdress: Long): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmGetVirtualForPhysical(physicaladdress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmIsAddressValid(virtualaddress: ConstPtr<CVoid>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmIsAddressValid(virtualaddress.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmIsDriverSuspectForVerifier(driverobject: ConstPtr<DriverObject>): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmIsDriverSuspectForVerifier(driverobject.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmIsDriverVerifying(driverobject: ConstPtr<DriverObject>): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmIsDriverVerifying(driverobject.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmIsDriverVerifyingByAddress(addresswithinsection: ConstPtr<CVoid>): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmIsDriverVerifyingByAddress(addresswithinsection.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmIsIoSpaceActive(startaddress: Long, numberofbytes: ULong): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmIsIoSpaceActive(startaddress.toString(), numberofbytes.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmIsNonPagedSystemAddressValid(virtualaddress: ConstPtr<CVoid>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmIsNonPagedSystemAddressValid(virtualaddress.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmIsThisAnNtAsSystem(): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmIsThisAnNtAsSystem() as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmIsVerifierEnabled(verifierflags: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmIsVerifierEnabled(verifierflags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmLockPagableDataSection(addresswithinsection: ConstPtr<CVoid>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmLockPagableDataSection(addresswithinsection.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmLockPagableSectionByHandle(imagesectionhandle: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmLockPagableSectionByHandle(imagesectionhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmMapIoSpace(physicaladdress: Long, numberofbytes: ULong, cachetype: MemoryCachingType): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmMapIoSpace(physicaladdress.toString(), numberofbytes.toString(), cachetype) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmMapIoSpaceEx(physicaladdress: Long, numberofbytes: ULong, protect: UInt): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmMapIoSpaceEx(physicaladdress.toString(), numberofbytes.toString(), protect.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmMapLockedPages(memorydescriptorlist: MutPtr<Mdl>, accessmode: Byte): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmMapLockedPages(memorydescriptorlist.rawAddress.toString(), accessmode.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmMapLockedPagesSpecifyCache(memorydescriptorlist: MutPtr<Mdl>, accessmode: Byte, cachetype: MemoryCachingType, requestedaddress: ConstPtr<CVoid>, bugcheckonfailure: UInt, priority: UInt): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmMapLockedPagesSpecifyCache(memorydescriptorlist.rawAddress.toString(), accessmode.toInt(), cachetype, requestedaddress.rawAddress.toString(), bugcheckonfailure.toInt(), priority.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmMapLockedPagesWithReservedMapping(mappingaddress: ConstPtr<CVoid>, pooltag: UInt, memorydescriptorlist: MutPtr<Mdl>, cachetype: MemoryCachingType): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmMapLockedPagesWithReservedMapping(mappingaddress.rawAddress.toString(), pooltag.toInt(), memorydescriptorlist.rawAddress.toString(), cachetype) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmMapMdl(memorydescriptorlist: MutPtr<Mdl>, protection: UInt, driverroutine: PmmMdlRoutine, drivercontext: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmMapMdl(memorydescriptorlist.rawAddress.toString(), protection.toInt(), 0L.toString(), drivercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmMapMemoryDumpMdlEx(va: ConstPtr<CVoid>, pagetotal: UInt, memorydumpmdl: MutPtr<Mdl>, flags: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmMapMemoryDumpMdlEx(va.rawAddress.toString(), pagetotal.toInt(), memorydumpmdl.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmMapUserAddressesToPage(baseaddress: ConstPtr<CVoid>, numberofbytes: ULong, pageaddress: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmMapUserAddressesToPage(baseaddress.rawAddress.toString(), numberofbytes.toString(), pageaddress.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmMapVideoDisplay(physicaladdress: Long, numberofbytes: ULong, cachetype: MemoryCachingType): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmMapVideoDisplay(physicaladdress.toString(), numberofbytes.toString(), cachetype) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmMapViewInSessionSpace(section: ConstPtr<CVoid>, mappedbase: MutPtr<MutPtr<CVoid>>, viewsize: MutPtr<ULong>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmMapViewInSessionSpace(section.rawAddress.toString(), mappedbase.rawAddress.toString(), viewsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmMapViewInSessionSpaceEx(section: ConstPtr<CVoid>, mappedbase: MutPtr<MutPtr<CVoid>>, viewsize: MutPtr<ULong>, sectionoffset: MutPtr<Long>, flags: ULong): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmMapViewInSessionSpaceEx(section.rawAddress.toString(), mappedbase.rawAddress.toString(), viewsize.rawAddress.toString(), sectionoffset.rawAddress.toString(), flags.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmMapViewInSystemSpace(section: ConstPtr<CVoid>, mappedbase: MutPtr<MutPtr<CVoid>>, viewsize: MutPtr<ULong>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmMapViewInSystemSpace(section.rawAddress.toString(), mappedbase.rawAddress.toString(), viewsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmMapViewInSystemSpaceEx(section: ConstPtr<CVoid>, mappedbase: MutPtr<MutPtr<CVoid>>, viewsize: MutPtr<ULong>, sectionoffset: MutPtr<Long>, flags: ULong): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmMapViewInSystemSpaceEx(section.rawAddress.toString(), mappedbase.rawAddress.toString(), viewsize.rawAddress.toString(), sectionoffset.rawAddress.toString(), flags.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmMdlPageContentsState(memorydescriptorlist: MutPtr<Mdl>, state: MmMdlPageContentsState): MmMdlPageContentsState =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmMdlPageContentsState(memorydescriptorlist.rawAddress.toString(), state) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmPageEntireDriver(addresswithinsection: ConstPtr<CVoid>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmPageEntireDriver(addresswithinsection.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmProbeAndLockPages(memorydescriptorlist: MutPtr<Mdl>, accessmode: Byte, operation: LockOperation) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmProbeAndLockPages(memorydescriptorlist.rawAddress.toString(), accessmode.toInt(), operation)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmProbeAndLockProcessPages(memorydescriptorlist: MutPtr<Mdl>, process: Peprocess, accessmode: Byte, operation: LockOperation) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmProbeAndLockProcessPages(memorydescriptorlist.rawAddress.toString(), process.toString(), accessmode.toInt(), operation)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmProbeAndLockSelectedPages(memorydescriptorlist: MutPtr<Mdl>, segmentarray: ConstPtr<FileSegmentElement>, accessmode: Byte, operation: LockOperation) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmProbeAndLockSelectedPages(memorydescriptorlist.rawAddress.toString(), segmentarray.rawAddress.toString(), accessmode.toInt(), operation)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmProtectDriverSection(addresswithinsection: ConstPtr<CVoid>, size: ULong, flags: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmProtectDriverSection(addresswithinsection.rawAddress.toString(), size.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmProtectMdlSystemAddress(memorydescriptorlist: ConstPtr<Mdl>, newprotect: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmProtectMdlSystemAddress(memorydescriptorlist.rawAddress.toString(), newprotect.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmQuerySystemSize(): MmSystemsize =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmQuerySystemSize() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmRemovePhysicalMemory(startaddress: ConstPtr<Long>, numberofbytes: MutPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmRemovePhysicalMemory(startaddress.rawAddress.toString(), numberofbytes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmResetDriverPaging(addresswithinsection: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmResetDriverPaging(addresswithinsection.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmRotatePhysicalView(virtualaddress: ConstPtr<CVoid>, numberofbytes: MutPtr<ULong>, newmdl: ConstPtr<Mdl>, direction: MmRotateDirection, copyfunction: PmmRotateCopyCallbackFunction, context: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmRotatePhysicalView(virtualaddress.rawAddress.toString(), numberofbytes.rawAddress.toString(), newmdl.rawAddress.toString(), direction, 0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmSecureVirtualMemory(address: ConstPtr<CVoid>, size: ULong, probemode: UInt): Handle =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmSecureVirtualMemory(address.rawAddress.toString(), size.toString(), probemode.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmSecureVirtualMemoryEx(address: ConstPtr<CVoid>, size: ULong, probemode: UInt, flags: UInt): Handle =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmSecureVirtualMemoryEx(address.rawAddress.toString(), size.toString(), probemode.toInt(), flags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmSetPermanentCacheAttribute(startaddress: Long, numberofbytes: Long, cachetype: MemoryCachingType, flags: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmSetPermanentCacheAttribute(startaddress.toString(), numberofbytes.toString(), cachetype, flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmSizeOfMdl(base: ConstPtr<CVoid>, length: ULong): ULong =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmSizeOfMdl(base.rawAddress.toString(), length.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmUnlockPagableImageSection(imagesectionhandle: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmUnlockPagableImageSection(imagesectionhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmUnlockPages(memorydescriptorlist: MutPtr<Mdl>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmUnlockPages(memorydescriptorlist.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmUnmapIoSpace(baseaddress: ConstPtr<CVoid>, numberofbytes: ULong) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmUnmapIoSpace(baseaddress.rawAddress.toString(), numberofbytes.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmUnmapLockedPages(baseaddress: ConstPtr<CVoid>, memorydescriptorlist: MutPtr<Mdl>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmUnmapLockedPages(baseaddress.rawAddress.toString(), memorydescriptorlist.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmUnmapReservedMapping(baseaddress: ConstPtr<CVoid>, pooltag: UInt, memorydescriptorlist: MutPtr<Mdl>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmUnmapReservedMapping(baseaddress.rawAddress.toString(), pooltag.toInt(), memorydescriptorlist.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmUnmapVideoDisplay(baseaddress: ConstPtr<CVoid>, numberofbytes: ULong) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmUnmapVideoDisplay(baseaddress.rawAddress.toString(), numberofbytes.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmUnmapViewInSessionSpace(mappedbase: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmUnmapViewInSessionSpace(mappedbase.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmUnmapViewInSystemSpace(mappedbase: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmUnmapViewInSystemSpace(mappedbase.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmUnsecureVirtualMemory(securehandle: Handle) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesMmUnsecureVirtualMemory(securehandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ntAllocateLocallyUniqueId(luid: MutPtr<Luid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtAllocateLocallyUniqueId(luid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCommitComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtCommitComplete(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCommitEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtCommitEnlistment(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCommitTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtCommitTransaction(transactionhandle.rawAddress.toString(), wait) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCreateEnlistment(enlistmenthandle: MutPtr<Handle>, desiredaccess: UInt, resourcemanagerhandle: Handle, transactionhandle: Handle, objectattributes: ConstPtr<ObjectAttributes>, createoptions: UInt, notificationmask: UInt, enlistmentkey: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtCreateEnlistment(enlistmenthandle.rawAddress.toString(), desiredaccess.toInt(), resourcemanagerhandle.rawAddress.toString(), transactionhandle.rawAddress.toString(), objectattributes.rawAddress.toString(), createoptions.toInt(), notificationmask.toInt(), enlistmentkey.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCreateResourceManager(resourcemanagerhandle: MutPtr<Handle>, desiredaccess: UInt, tmhandle: Handle, rmguid: ConstPtr<Guid>, objectattributes: ConstPtr<ObjectAttributes>, createoptions: UInt, description: ConstPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtCreateResourceManager(resourcemanagerhandle.rawAddress.toString(), desiredaccess.toInt(), tmhandle.rawAddress.toString(), rmguid.rawAddress.toString(), objectattributes.rawAddress.toString(), createoptions.toInt(), description.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCreateTransaction(transactionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, uow: ConstPtr<Guid>, tmhandle: Handle, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: ConstPtr<Long>, description: ConstPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtCreateTransaction(transactionhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), uow.rawAddress.toString(), tmhandle.rawAddress.toString(), createoptions.toInt(), isolationlevel.toInt(), isolationflags.toInt(), timeout.rawAddress.toString(), description.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCreateTransactionManager(tmhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, logfilename: ConstPtr<UnicodeString>, createoptions: UInt, commitstrength: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtCreateTransactionManager(tmhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), logfilename.rawAddress.toString(), createoptions.toInt(), commitstrength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntDisplayString(string: ConstPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtDisplayString(string.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntEnumerateTransactionObject(rootobjecthandle: Handle, querytype: KtmobjectType, objectcursor: MutPtr<KtmobjectCursor>, objectcursorlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtEnumerateTransactionObject(rootobjecthandle.rawAddress.toString(), querytype, objectcursor.rawAddress.toString(), objectcursorlength.toInt(), returnlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntGetNotificationResourceManager(resourcemanagerhandle: Handle, transactionnotification: MutPtr<TransactionNotification>, notificationlength: UInt, timeout: ConstPtr<Long>, returnlength: MutPtr<UInt>, asynchronous: UInt, asynchronouscontext: ULong): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtGetNotificationResourceManager(resourcemanagerhandle.rawAddress.toString(), transactionnotification.rawAddress.toString(), notificationlength.toInt(), timeout.rawAddress.toString(), returnlength.rawAddress.toString(), asynchronous.toInt(), asynchronouscontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntLoadDriver(driverservicename: ConstPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtLoadDriver(driverservicename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntMakeTemporaryObject(handle: Handle): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtMakeTemporaryObject(handle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntManagePartition(targethandle: Handle, sourcehandle: Handle, partitioninformationclass: PartitionInformationClass, partitioninformation: MutPtr<CVoid>, partitioninformationlength: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtManagePartition(targethandle.rawAddress.toString(), sourcehandle.rawAddress.toString(), partitioninformationclass, partitioninformation.rawAddress.toString(), partitioninformationlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenEnlistment(enlistmenthandle: MutPtr<Handle>, desiredaccess: UInt, resourcemanagerhandle: Handle, enlistmentguid: ConstPtr<Guid>, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtOpenEnlistment(enlistmenthandle.rawAddress.toString(), desiredaccess.toInt(), resourcemanagerhandle.rawAddress.toString(), enlistmentguid.rawAddress.toString(), objectattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenResourceManager(resourcemanagerhandle: MutPtr<Handle>, desiredaccess: UInt, tmhandle: Handle, resourcemanagerguid: ConstPtr<Guid>, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtOpenResourceManager(resourcemanagerhandle.rawAddress.toString(), desiredaccess.toInt(), tmhandle.rawAddress.toString(), resourcemanagerguid.rawAddress.toString(), objectattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenTransaction(transactionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, uow: ConstPtr<Guid>, tmhandle: Handle): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtOpenTransaction(transactionhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), uow.rawAddress.toString(), tmhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenTransactionManager(tmhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, logfilename: ConstPtr<UnicodeString>, tmidentity: ConstPtr<Guid>, openoptions: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtOpenTransactionManager(tmhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), logfilename.rawAddress.toString(), tmidentity.rawAddress.toString(), openoptions.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntPowerInformation(informationlevel: PowerInformationLevel, inputbuffer: ConstPtr<CVoid>, inputbufferlength: UInt, outputbuffer: MutPtr<CVoid>, outputbufferlength: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtPowerInformation(informationlevel, inputbuffer.rawAddress.toString(), inputbufferlength.toInt(), outputbuffer.rawAddress.toString(), outputbufferlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntPrePrepareComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtPrePrepareComplete(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntPrePrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtPrePrepareEnlistment(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntPrepareComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtPrepareComplete(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntPrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtPrepareEnlistment(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntPropagationComplete(resourcemanagerhandle: Handle, requestcookie: UInt, bufferlength: UInt, buffer: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtPropagationComplete(resourcemanagerhandle.rawAddress.toString(), requestcookie.toInt(), bufferlength.toInt(), buffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntPropagationFailed(resourcemanagerhandle: Handle, requestcookie: UInt, propstatus: Ntstatus): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtPropagationFailed(resourcemanagerhandle.rawAddress.toString(), requestcookie.toInt(), propstatus) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: MutPtr<CVoid>, enlistmentinformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtQueryInformationEnlistment(enlistmenthandle.rawAddress.toString(), enlistmentinformationclass, enlistmentinformation.rawAddress.toString(), enlistmentinformationlength.toInt(), returnlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: MutPtr<CVoid>, resourcemanagerinformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtQueryInformationResourceManager(resourcemanagerhandle.rawAddress.toString(), resourcemanagerinformationclass, resourcemanagerinformation.rawAddress.toString(), resourcemanagerinformationlength.toInt(), returnlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: MutPtr<CVoid>, transactioninformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtQueryInformationTransaction(transactionhandle.rawAddress.toString(), transactioninformationclass, transactioninformation.rawAddress.toString(), transactioninformationlength.toInt(), returnlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryInformationTransactionManager(transactionmanagerhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: MutPtr<CVoid>, transactionmanagerinformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtQueryInformationTransactionManager(transactionmanagerhandle.rawAddress.toString(), transactionmanagerinformationclass, transactionmanagerinformation.rawAddress.toString(), transactionmanagerinformationlength.toInt(), returnlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntReadOnlyEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtReadOnlyEnlistment(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntRecoverEnlistment(enlistmenthandle: Handle, enlistmentkey: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtRecoverEnlistment(enlistmenthandle.rawAddress.toString(), enlistmentkey.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntRecoverResourceManager(resourcemanagerhandle: Handle): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtRecoverResourceManager(resourcemanagerhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntRecoverTransactionManager(transactionmanagerhandle: Handle): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtRecoverTransactionManager(transactionmanagerhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntRegisterProtocolAddressInformation(resourcemanager: Handle, protocolid: ConstPtr<Guid>, protocolinformationsize: UInt, protocolinformation: ConstPtr<CVoid>, createoptions: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtRegisterProtocolAddressInformation(resourcemanager.rawAddress.toString(), protocolid.rawAddress.toString(), protocolinformationsize.toInt(), protocolinformation.rawAddress.toString(), createoptions.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntRenameTransactionManager(logfilename: ConstPtr<UnicodeString>, existingtransactionmanagerguid: ConstPtr<Guid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtRenameTransactionManager(logfilename.rawAddress.toString(), existingtransactionmanagerguid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntRollbackComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtRollbackComplete(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntRollbackEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtRollbackEnlistment(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntRollbackTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtRollbackTransaction(transactionhandle.rawAddress.toString(), wait) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntRollforwardTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtRollforwardTransactionManager(transactionmanagerhandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: ConstPtr<CVoid>, enlistmentinformationlength: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtSetInformationEnlistment(enlistmenthandle.rawAddress.toString(), enlistmentinformationclass, enlistmentinformation.rawAddress.toString(), enlistmentinformationlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: ConstPtr<CVoid>, resourcemanagerinformationlength: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtSetInformationResourceManager(resourcemanagerhandle.rawAddress.toString(), resourcemanagerinformationclass, resourcemanagerinformation.rawAddress.toString(), resourcemanagerinformationlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: ConstPtr<CVoid>, transactioninformationlength: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtSetInformationTransaction(transactionhandle.rawAddress.toString(), transactioninformationclass, transactioninformation.rawAddress.toString(), transactioninformationlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetInformationTransactionManager(tmhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: ConstPtr<CVoid>, transactionmanagerinformationlength: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtSetInformationTransactionManager(tmhandle.rawAddress.toString(), transactionmanagerinformationclass, transactionmanagerinformation.rawAddress.toString(), transactionmanagerinformationlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSinglePhaseReject(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtSinglePhaseReject(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntUnloadDriver(driverservicename: ConstPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesNtUnloadDriver(driverservicename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obCloseHandle(handle: Handle, previousmode: Byte): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesObCloseHandle(handle.rawAddress.toString(), previousmode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obDereferenceObjectDeferDelete(obj: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesObDereferenceObjectDeferDelete(obj.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun obDereferenceObjectDeferDeleteWithTag(obj: ConstPtr<CVoid>, tag: UInt) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesObDereferenceObjectDeferDeleteWithTag(obj.rawAddress.toString(), tag.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun obGetFilterVersion(): UShort =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesObGetFilterVersion() as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obGetObjectSecurity(obj: ConstPtr<CVoid>, securitydescriptor: MutPtr<PsecurityDescriptor>, memoryallocated: MutPtr<Boolean>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesObGetObjectSecurity(obj.rawAddress.toString(), securitydescriptor.rawAddress.toString(), memoryallocated.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obReferenceObjectByHandle(handle: Handle, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, obj: MutPtr<MutPtr<CVoid>>, handleinformation: MutPtr<ObjectHandleInformation>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesObReferenceObjectByHandle(handle.rawAddress.toString(), desiredaccess.toInt(), objecttype.toString(), accessmode.toInt(), obj.rawAddress.toString(), handleinformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obReferenceObjectByHandleWithTag(handle: Handle, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, tag: UInt, obj: MutPtr<MutPtr<CVoid>>, handleinformation: MutPtr<ObjectHandleInformation>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesObReferenceObjectByHandleWithTag(handle.rawAddress.toString(), desiredaccess.toInt(), objecttype.toString(), accessmode.toInt(), tag.toInt(), obj.rawAddress.toString(), handleinformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obReferenceObjectByPointer(obj: ConstPtr<CVoid>, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesObReferenceObjectByPointer(obj.rawAddress.toString(), desiredaccess.toInt(), objecttype.toString(), accessmode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obReferenceObjectByPointerWithTag(obj: ConstPtr<CVoid>, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, tag: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesObReferenceObjectByPointerWithTag(obj.rawAddress.toString(), desiredaccess.toInt(), objecttype.toString(), accessmode.toInt(), tag.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obReferenceObjectSafe(obj: ConstPtr<CVoid>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesObReferenceObjectSafe(obj.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obReferenceObjectSafeWithTag(obj: ConstPtr<CVoid>, tag: UInt): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesObReferenceObjectSafeWithTag(obj.rawAddress.toString(), tag.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obRegisterCallbacks(callbackregistration: ConstPtr<ObCallbackRegistration>, registrationhandle: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesObRegisterCallbacks(callbackregistration.rawAddress.toString(), registrationhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obReleaseObjectSecurity(securitydescriptor: PsecurityDescriptor, memoryallocated: Boolean) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesObReleaseObjectSecurity(securitydescriptor.rawAddress.toString(), memoryallocated)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun obUnRegisterCallbacks(registrationhandle: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesObUnRegisterCallbacks(registrationhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun obfDereferenceObject(obj: ConstPtr<CVoid>): Long =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesObfDereferenceObject(obj.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obfDereferenceObjectWithTag(obj: ConstPtr<CVoid>, tag: UInt): Long =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesObfDereferenceObjectWithTag(obj.rawAddress.toString(), tag.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obfReferenceObject(obj: ConstPtr<CVoid>): Long =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesObfReferenceObject(obj.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obfReferenceObjectWithTag(obj: ConstPtr<CVoid>, tag: UInt): Long =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesObfReferenceObjectWithTag(obj.rawAddress.toString(), tag.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pcwAddInstance(buffer: PpcwBuffer, name: ConstPtr<UnicodeString>, id: UInt, count: UInt, data: ConstPtr<PcwData>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPcwAddInstance(buffer.toString(), name.rawAddress.toString(), id.toInt(), count.toInt(), data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pcwCloseInstance(instance: PpcwInstance) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPcwCloseInstance(instance.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pcwCreateInstance(instance: MutPtr<PpcwInstance>, registration: PpcwRegistration, name: ConstPtr<UnicodeString>, count: UInt, data: ConstPtr<PcwData>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPcwCreateInstance(instance.rawAddress.toString(), registration.toString(), name.rawAddress.toString(), count.toInt(), data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pcwRegister(registration: MutPtr<PpcwRegistration>, info: ConstPtr<PcwRegistrationInformation>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPcwRegister(registration.rawAddress.toString(), info.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pcwUnregister(registration: PpcwRegistration) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPcwUnregister(registration.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poCallDriver(deviceobject: ConstPtr<DeviceObject>, irp: MutPtr<Irp>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoCallDriver(deviceobject.rawAddress.toString(), irp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poClearPowerRequest(powerrequest: MutPtr<CVoid>, type: PowerRequestType): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoClearPowerRequest(powerrequest.rawAddress.toString(), type) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poCreatePowerRequest(powerrequest: MutPtr<MutPtr<CVoid>>, deviceobject: ConstPtr<DeviceObject>, context: ConstPtr<CountedReasonContext>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoCreatePowerRequest(powerrequest.rawAddress.toString(), deviceobject.rawAddress.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poCreateThermalRequest(thermalrequest: MutPtr<MutPtr<CVoid>>, targetdeviceobject: ConstPtr<DeviceObject>, policydeviceobject: ConstPtr<DeviceObject>, context: ConstPtr<CountedReasonContext>, flags: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoCreateThermalRequest(thermalrequest.rawAddress.toString(), targetdeviceobject.rawAddress.toString(), policydeviceobject.rawAddress.toString(), context.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poDeletePowerRequest(powerrequest: MutPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoDeletePowerRequest(powerrequest.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poDeleteThermalRequest(thermalrequest: MutPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoDeleteThermalRequest(thermalrequest.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poEndDeviceBusy(idlepointer: MutPtr<UInt>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoEndDeviceBusy(idlepointer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxActivateComponent(handle: Pohandle, component: UInt, flags: UInt) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoFxActivateComponent(handle.rawAddress.toString(), component.toInt(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxCompleteDevicePowerNotRequired(handle: Pohandle) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoFxCompleteDevicePowerNotRequired(handle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxCompleteDirectedPowerDown(handle: Pohandle) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoFxCompleteDirectedPowerDown(handle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxCompleteIdleCondition(handle: Pohandle, component: UInt) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoFxCompleteIdleCondition(handle.rawAddress.toString(), component.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxCompleteIdleState(handle: Pohandle, component: UInt) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoFxCompleteIdleState(handle.rawAddress.toString(), component.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxIdleComponent(handle: Pohandle, component: UInt, flags: UInt) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoFxIdleComponent(handle.rawAddress.toString(), component.toInt(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxIssueComponentPerfStateChange(handle: Pohandle, flags: UInt, component: UInt, perfchange: ConstPtr<PoFxPerfStateChange>, context: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoFxIssueComponentPerfStateChange(handle.rawAddress.toString(), flags.toInt(), component.toInt(), perfchange.rawAddress.toString(), context.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxIssueComponentPerfStateChangeMultiple(handle: Pohandle, flags: UInt, component: UInt, perfchangescount: UInt, perfchanges: ConstPtr<PoFxPerfStateChange>, context: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoFxIssueComponentPerfStateChangeMultiple(handle.rawAddress.toString(), flags.toInt(), component.toInt(), perfchangescount.toInt(), perfchanges.rawAddress.toString(), context.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxNotifySurprisePowerOn(pdo: ConstPtr<DeviceObject>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoFxNotifySurprisePowerOn(pdo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxPowerControl(handle: Pohandle, powercontrolcode: ConstPtr<Guid>, inbuffer: ConstPtr<CVoid>, inbuffersize: ULong, outbuffer: MutPtr<CVoid>, outbuffersize: ULong, bytesreturned: MutPtr<ULong>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoFxPowerControl(handle.rawAddress.toString(), powercontrolcode.rawAddress.toString(), inbuffer.rawAddress.toString(), inbuffersize.toString(), outbuffer.rawAddress.toString(), outbuffersize.toString(), bytesreturned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poFxPowerOnCrashdumpDevice(handle: Pohandle, context: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoFxPowerOnCrashdumpDevice(handle.rawAddress.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poFxQueryCurrentComponentPerfState(handle: Pohandle, flags: UInt, component: UInt, setindex: UInt, currentperf: MutPtr<ULong>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoFxQueryCurrentComponentPerfState(handle.rawAddress.toString(), flags.toInt(), component.toInt(), setindex.toInt(), currentperf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poFxRegisterComponentPerfStates(handle: Pohandle, component: UInt, flags: ULong, componentperfstatecallback: PpoFxComponentPerfStateCallback, inputstateinfo: ConstPtr<PoFxComponentPerfInfo>, outputstateinfo: MutPtr<MutPtr<PoFxComponentPerfInfo>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoFxRegisterComponentPerfStates(handle.rawAddress.toString(), component.toInt(), flags.toString(), 0L.toString(), inputstateinfo.rawAddress.toString(), outputstateinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poFxRegisterCrashdumpDevice(handle: Pohandle): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoFxRegisterCrashdumpDevice(handle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poFxRegisterDevice(pdo: ConstPtr<DeviceObject>, device: ConstPtr<PoFxDeviceV1>, handle: MutPtr<Pohandle>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoFxRegisterDevice(pdo.rawAddress.toString(), device.rawAddress.toString(), handle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poFxRegisterDripsWatchdogCallback(handle: Pohandle, callback: PpoFxDripsWatchdogCallback, includechilddevices: Boolean, matchingdriverobject: ConstPtr<DriverObject>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoFxRegisterDripsWatchdogCallback(handle.rawAddress.toString(), 0L.toString(), includechilddevices, matchingdriverobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxReportDevicePoweredOn(handle: Pohandle) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoFxReportDevicePoweredOn(handle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxSetComponentLatency(handle: Pohandle, component: UInt, latency: ULong) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoFxSetComponentLatency(handle.rawAddress.toString(), component.toInt(), latency.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxSetComponentResidency(handle: Pohandle, component: UInt, residency: ULong) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoFxSetComponentResidency(handle.rawAddress.toString(), component.toInt(), residency.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxSetComponentWake(handle: Pohandle, component: UInt, wakehint: Boolean) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoFxSetComponentWake(handle.rawAddress.toString(), component.toInt(), wakehint)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxSetDeviceIdleTimeout(handle: Pohandle, idletimeout: ULong) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoFxSetDeviceIdleTimeout(handle.rawAddress.toString(), idletimeout.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxSetTargetDripsDevicePowerState(handle: Pohandle, targetstate: DevicePowerState): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoFxSetTargetDripsDevicePowerState(handle.rawAddress.toString(), targetstate) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poFxStartDevicePowerManagement(handle: Pohandle) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoFxStartDevicePowerManagement(handle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxUnregisterDevice(handle: Pohandle) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoFxUnregisterDevice(handle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poGetSystemWake(irp: ConstPtr<Irp>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoGetSystemWake(irp.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poGetThermalRequestSupport(thermalrequest: ConstPtr<CVoid>, type: PoThermalRequestType): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoGetThermalRequestSupport(thermalrequest.rawAddress.toString(), type) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poQueryWatchdogTime(pdo: ConstPtr<DeviceObject>, secondsremaining: MutPtr<UInt>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoQueryWatchdogTime(pdo.rawAddress.toString(), secondsremaining.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poRegisterDeviceForIdleDetection(deviceobject: ConstPtr<DeviceObject>, conservationidletime: UInt, performanceidletime: UInt, state: DevicePowerState): MutPtr<UInt> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoRegisterDeviceForIdleDetection(deviceobject.rawAddress.toString(), conservationidletime.toInt(), performanceidletime.toInt(), state) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poRegisterPowerSettingCallback(deviceobject: ConstPtr<DeviceObject>, settingguid: ConstPtr<Guid>, callback: PpowerSettingCallback, context: ConstPtr<CVoid>, handle: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoRegisterPowerSettingCallback(deviceobject.rawAddress.toString(), settingguid.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), handle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poRegisterSystemState(statehandle: MutPtr<CVoid>, flags: UInt): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoRegisterSystemState(statehandle.rawAddress.toString(), flags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poRequestPowerIrp(deviceobject: ConstPtr<DeviceObject>, minorfunction: UByte, powerstate: PowerState, completionfunction: PrequestPowerComplete, context: ConstPtr<CVoid>, irp: MutPtr<MutPtr<Irp>>): Ntstatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poSetDeviceBusyEx(idlepointer: MutPtr<UInt>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoSetDeviceBusyEx(idlepointer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poSetHiberRange(memorymap: ConstPtr<CVoid>, flags: UInt, address: ConstPtr<CVoid>, length: ULong, tag: UInt) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoSetHiberRange(memorymap.rawAddress.toString(), flags.toInt(), address.rawAddress.toString(), length.toString(), tag.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poSetPowerRequest(powerrequest: MutPtr<CVoid>, type: PowerRequestType): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoSetPowerRequest(powerrequest.rawAddress.toString(), type) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poSetPowerState(deviceobject: ConstPtr<DeviceObject>, type: PowerStateType, state: PowerState): PowerState =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poSetSystemState(flags: UInt) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoSetSystemState(flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poSetSystemWake(irp: MutPtr<Irp>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoSetSystemWake(irp.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poSetSystemWakeDevice(deviceobject: ConstPtr<DeviceObject>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoSetSystemWakeDevice(deviceobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poSetThermalActiveCooling(thermalrequest: MutPtr<CVoid>, engaged: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoSetThermalActiveCooling(thermalrequest.rawAddress.toString(), engaged) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poSetThermalPassiveCooling(thermalrequest: MutPtr<CVoid>, throttle: UByte): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoSetThermalPassiveCooling(thermalrequest.rawAddress.toString(), throttle.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poStartDeviceBusy(idlepointer: MutPtr<UInt>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoStartDeviceBusy(idlepointer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poStartNextPowerIrp(irp: MutPtr<Irp>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoStartNextPowerIrp(irp.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poUnregisterPowerSettingCallback(handle: MutPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoUnregisterPowerSettingCallback(handle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poUnregisterSystemState(statehandle: MutPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPoUnregisterSystemState(statehandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun probeForRead(address: ConstPtr<CVoid>, length: ULong, alignment: UInt) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesProbeForRead(address.rawAddress.toString(), length.toString(), alignment.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun probeForWrite(address: MutPtr<CVoid>, length: ULong, alignment: UInt) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesProbeForWrite(address.rawAddress.toString(), length.toString(), alignment.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psAcquireSiloHardReference(silo: Pesilo): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsAcquireSiloHardReference(silo.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psAllocSiloContextSlot(reserved: ULong, returnedcontextslot: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsAllocSiloContextSlot(reserved.toString(), returnedcontextslot.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psAllocateAffinityToken(affinitytoken: MutPtr<PaffinityToken>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsAllocateAffinityToken(affinitytoken.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psAttachSiloToCurrentThread(silo: Pesilo): Pesilo =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsAttachSiloToCurrentThread(silo.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psCreateSiloContext(silo: Pesilo, size: UInt, pooltype: PoolType, contextcleanupcallback: SiloContextCleanupCallback, returnedsilocontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsCreateSiloContext(silo.toString(), size.toInt(), pooltype, 0L.toString(), returnedsilocontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psCreateSystemThread(threadhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, processhandle: Handle, clientid: MutPtr<ClientId>, startroutine: PkstartRoutine, startcontext: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsCreateSystemThread(threadhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), processhandle.rawAddress.toString(), clientid.rawAddress.toString(), 0L.toString(), startcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psDereferenceSiloContext(silocontext: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsDereferenceSiloContext(silocontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psDetachSiloFromCurrentThread(previoussilo: Pesilo) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsDetachSiloFromCurrentThread(previoussilo.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psFreeAffinityToken(affinitytoken: PaffinityToken) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsFreeAffinityToken(affinitytoken.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psFreeSiloContextSlot(contextslot: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsFreeSiloContextSlot(contextslot.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetCurrentProcessId(): Handle =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsGetCurrentProcessId() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetCurrentServerSilo(): Pesilo =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsGetCurrentServerSilo() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetCurrentServerSiloName(): MutPtr<UnicodeString> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsGetCurrentServerSiloName() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetCurrentSilo(): Pesilo =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsGetCurrentSilo() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetCurrentThreadId(): Handle =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsGetCurrentThreadId() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetCurrentThreadTeb(): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsGetCurrentThreadTeb() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetEffectiveServerSilo(silo: Pesilo): Pesilo =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsGetEffectiveServerSilo(silo.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetHostSilo(): Pesilo =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsGetHostSilo() as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetJobServerSilo(job: Pejob, serversilo: MutPtr<Pesilo>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsGetJobServerSilo(job.toString(), serversilo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetJobSilo(job: Pejob, silo: MutPtr<Pesilo>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsGetJobSilo(job.toString(), silo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetParentSilo(job: Pejob): Pesilo =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsGetParentSilo(job.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetPermanentSiloContext(silo: Pesilo, contextslot: UInt, returnedsilocontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsGetPermanentSiloContext(silo.toString(), contextslot.toInt(), returnedsilocontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetProcessCreateTimeQuadPart(process: Peprocess): Long =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsGetProcessCreateTimeQuadPart(process.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetProcessExitStatus(process: Peprocess): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsGetProcessExitStatus(process.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetProcessId(process: Peprocess): Handle =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsGetProcessId(process.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetProcessStartKey(process: Peprocess): ULong =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsGetProcessStartKey(process.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetServerSiloServiceSessionId(silo: Pesilo): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsGetServerSiloServiceSessionId(silo.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetSiloContainerId(silo: Pesilo): MutPtr<Guid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsGetSiloContainerId(silo.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetSiloContext(silo: Pesilo, contextslot: UInt, returnedsilocontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsGetSiloContext(silo.toString(), contextslot.toInt(), returnedsilocontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetSiloMonitorContextSlot(monitor: PsiloMonitor): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsGetSiloMonitorContextSlot(monitor.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetThreadCreateTime(thread: Pethread): Long =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsGetThreadCreateTime(thread.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetThreadExitStatus(thread: Pethread): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsGetThreadExitStatus(thread.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetThreadId(thread: Pethread): Handle =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsGetThreadId(thread.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetThreadProcessId(thread: Pethread): Handle =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsGetThreadProcessId(thread.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetThreadProperty(thread: Pethread, key: ULong, flags: UInt): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsGetThreadProperty(thread.toString(), key.toString(), flags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetThreadServerSilo(thread: Pethread): Pesilo =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsGetThreadServerSilo(thread.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetVersion(majorversion: MutPtr<UInt>, minorversion: MutPtr<UInt>, buildnumber: MutPtr<UInt>, csdversion: MutPtr<UnicodeString>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsGetVersion(majorversion.rawAddress.toString(), minorversion.rawAddress.toString(), buildnumber.rawAddress.toString(), csdversion.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psInsertPermanentSiloContext(silo: Pesilo, contextslot: UInt, silocontext: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsInsertPermanentSiloContext(silo.toString(), contextslot.toInt(), silocontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psInsertSiloContext(silo: Pesilo, contextslot: UInt, silocontext: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsInsertSiloContext(silo.toString(), contextslot.toInt(), silocontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psIsCurrentThreadInServerSilo(): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsIsCurrentThreadInServerSilo() as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psIsCurrentThreadPrefetching(): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsIsCurrentThreadPrefetching() as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psIsHostSilo(silo: Pesilo): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsIsHostSilo(silo.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psMakeSiloContextPermanent(silo: Pesilo, contextslot: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsMakeSiloContextPermanent(silo.toString(), contextslot.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psQueryTotalCycleTimeProcess(process: Peprocess, cycletimestamp: MutPtr<ULong>): ULong =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsQueryTotalCycleTimeProcess(process.toString(), cycletimestamp.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psReferenceSiloContext(silocontext: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsReferenceSiloContext(silocontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psRegisterSiloMonitor(registration: ConstPtr<SiloMonitorRegistration>, returnedmonitor: MutPtr<PsiloMonitor>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsRegisterSiloMonitor(registration.rawAddress.toString(), returnedmonitor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psReleaseSiloHardReference(silo: Pesilo) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsReleaseSiloHardReference(silo.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psRemoveCreateThreadNotifyRoutine(notifyroutine: PcreateThreadNotifyRoutine): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsRemoveCreateThreadNotifyRoutine(0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psRemoveLoadImageNotifyRoutine(notifyroutine: PloadImageNotifyRoutine): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsRemoveLoadImageNotifyRoutine(0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psRemoveSiloContext(silo: Pesilo, contextslot: UInt, removedsilocontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsRemoveSiloContext(silo.toString(), contextslot.toInt(), removedsilocontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psReplaceSiloContext(silo: Pesilo, contextslot: UInt, newsilocontext: ConstPtr<CVoid>, oldsilocontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsReplaceSiloContext(silo.toString(), contextslot.toInt(), newsilocontext.rawAddress.toString(), oldsilocontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psRevertToUserMultipleGroupAffinityThread(affinitytoken: PaffinityToken) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsRevertToUserMultipleGroupAffinityThread(affinitytoken.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psSetCreateProcessNotifyRoutine(notifyroutine: PcreateProcessNotifyRoutine, remove: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsSetCreateProcessNotifyRoutine(0L.toString(), remove) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psSetCreateProcessNotifyRoutineEx(notifyroutine: PcreateProcessNotifyRoutineEx, remove: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsSetCreateProcessNotifyRoutineEx(0L.toString(), remove) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psSetCreateProcessNotifyRoutineEx2(notifytype: Pscreateprocessnotifytype, notifyinformation: ConstPtr<CVoid>, remove: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsSetCreateProcessNotifyRoutineEx2(notifytype, notifyinformation.rawAddress.toString(), remove) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psSetCreateThreadNotifyRoutine(notifyroutine: PcreateThreadNotifyRoutine): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsSetCreateThreadNotifyRoutine(0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psSetCreateThreadNotifyRoutineEx(notifytype: Pscreatethreadnotifytype, notifyinformation: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsSetCreateThreadNotifyRoutineEx(notifytype, notifyinformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psSetCurrentThreadPrefetching(prefetching: Boolean): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsSetCurrentThreadPrefetching(prefetching) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psSetLoadImageNotifyRoutine(notifyroutine: PloadImageNotifyRoutine): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsSetLoadImageNotifyRoutine(0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psSetLoadImageNotifyRoutineEx(notifyroutine: PloadImageNotifyRoutine, flags: ULong): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsSetLoadImageNotifyRoutineEx(0L.toString(), flags.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psSetSystemMultipleGroupAffinityThread(groupaffinities: ConstPtr<GroupAffinity>, groupcount: UShort, affinitytoken: PaffinityToken): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsSetSystemMultipleGroupAffinityThread(groupaffinities.rawAddress.toString(), groupcount.toInt(), affinitytoken.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psStartSiloMonitor(monitor: PsiloMonitor): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsStartSiloMonitor(monitor.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psTerminateServerSilo(serversilo: Pesilo, exitstatus: Ntstatus) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsTerminateServerSilo(serversilo.toString(), exitstatus)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psTerminateSystemThread(exitstatus: Ntstatus): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsTerminateSystemThread(exitstatus) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psUnregisterSiloMonitor(monitor: PsiloMonitor) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsUnregisterSiloMonitor(monitor.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psWrapApcWow64Thread(apccontext: MutPtr<MutPtr<CVoid>>, apcroutine: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPsWrapApcWow64Thread(apccontext.rawAddress.toString(), apcroutine.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pshedAllocateMemory(size: UInt): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPshedAllocateMemory(size.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pshedFreeMemory(address: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPshedFreeMemory(address.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pshedIsSystemWheaEnabled(): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPshedIsSystemWheaEnabled() as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pshedRegisterPlugin(packet: MutPtr<WheaPshedPluginRegistrationPacketV2>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPshedRegisterPlugin(packet.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pshedSynchronizeExecution(errorsource: ConstPtr<WheaErrorSourceDescriptor>, synchronizeroutine: PksynchronizeRoutine, synchronizecontext: ConstPtr<CVoid>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPshedSynchronizeExecution(errorsource.rawAddress.toString(), 0L.toString(), synchronizecontext.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pshedUnregisterPlugin(pluginhandle: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesPshedUnregisterPlugin(pluginhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlAppendUnicodeStringToString(destination: MutPtr<UnicodeString>, source: ConstPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlAppendUnicodeStringToString(destination.rawAddress.toString(), source.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAppendUnicodeToString(destination: MutPtr<UnicodeString>, source: Pcwstr): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlAppendUnicodeToString(destination.rawAddress.toString(), source.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAreBitsClear(bitmapheader: ConstPtr<RtlBitmap>, startingindex: UInt, length: UInt): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlAreBitsClear(bitmapheader.rawAddress.toString(), startingindex.toInt(), length.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAreBitsSet(bitmapheader: ConstPtr<RtlBitmap>, startingindex: UInt, length: UInt): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlAreBitsSet(bitmapheader.rawAddress.toString(), startingindex.toInt(), length.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAssert(voidfailedassertion: ConstPtr<CVoid>, voidfilename: ConstPtr<CVoid>, linenumber: UInt, mutablemessage: Pcstr) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlAssert(voidfailedassertion.rawAddress.toString(), voidfilename.rawAddress.toString(), linenumber.toInt(), mutablemessage.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlCheckRegistryKey(relativeto: UInt, path: Pcwstr): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlCheckRegistryKey(relativeto.toInt(), path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlClearAllBits(bitmapheader: ConstPtr<RtlBitmap>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlClearAllBits(bitmapheader.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlClearBit(bitmapheader: ConstPtr<RtlBitmap>, bitnumber: UInt) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlClearBit(bitmapheader.rawAddress.toString(), bitnumber.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlClearBits(bitmapheader: ConstPtr<RtlBitmap>, startingindex: UInt, numbertoclear: UInt) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlClearBits(bitmapheader.rawAddress.toString(), startingindex.toInt(), numbertoclear.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlCmDecodeMemIoResource(descriptor: ConstPtr<CmPartialResourceDescriptor>, start: MutPtr<ULong>): ULong =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlCmDecodeMemIoResource(descriptor.rawAddress.toString(), start.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCmEncodeMemIoResource(descriptor: ConstPtr<CmPartialResourceDescriptor>, type: UByte, length: ULong, start: ULong): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlCmEncodeMemIoResource(descriptor.rawAddress.toString(), type.toInt(), length.toString(), start.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCompareString(string1: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, string2: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, caseinsensitive: Boolean): Int =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlCompareString(string1.rawAddress.toString(), string2.rawAddress.toString(), caseinsensitive) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCompareUnicodeString(string1: ConstPtr<UnicodeString>, string2: ConstPtr<UnicodeString>, caseinsensitive: Boolean): Int =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlCompareUnicodeString(string1.rawAddress.toString(), string2.rawAddress.toString(), caseinsensitive) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCompareUnicodeStrings(string1: ConstPtr<UShort>, string1length: ULong, string2: ConstPtr<UShort>, string2length: ULong, caseinsensitive: Boolean): Int =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlCompareUnicodeStrings(string1.rawAddress.toString(), string1length.toString(), string2.rawAddress.toString(), string2length.toString(), caseinsensitive) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlContractHashTable(hashtable: ConstPtr<RtlDynamicHashTable>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlContractHashTable(hashtable.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCopyBitMap(source: ConstPtr<RtlBitmap>, destination: ConstPtr<RtlBitmap>, targetbit: UInt) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlCopyBitMap(source.rawAddress.toString(), destination.rawAddress.toString(), targetbit.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlCopyString(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlCopyString(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlCopyUnicodeString(destinationstring: MutPtr<UnicodeString>, sourcestring: ConstPtr<UnicodeString>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlCopyUnicodeString(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlCreateHashTable(hashtable: MutPtr<MutPtr<RtlDynamicHashTable>>, shift: UInt, flags: UInt): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlCreateHashTable(hashtable.rawAddress.toString(), shift.toInt(), flags.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCreateHashTableEx(hashtable: MutPtr<MutPtr<RtlDynamicHashTable>>, initialsize: UInt, shift: UInt, flags: UInt): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlCreateHashTableEx(hashtable.rawAddress.toString(), initialsize.toInt(), shift.toInt(), flags.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCreateRegistryKey(relativeto: UInt, path: Pcwstr): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlCreateRegistryKey(relativeto.toInt(), path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCreateSecurityDescriptor(securitydescriptor: PsecurityDescriptor, revision: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlCreateSecurityDescriptor(securitydescriptor.rawAddress.toString(), revision.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDelete(links: ConstPtr<RtlSplayLinks>): MutPtr<RtlSplayLinks> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlDelete(links.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDeleteElementGenericTable(table: ConstPtr<RtlGenericTable>, buffer: ConstPtr<CVoid>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlDeleteElementGenericTable(table.rawAddress.toString(), buffer.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDeleteElementGenericTableAvl(table: ConstPtr<RtlAvlTable>, buffer: ConstPtr<CVoid>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlDeleteElementGenericTableAvl(table.rawAddress.toString(), buffer.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDeleteElementGenericTableAvlEx(table: ConstPtr<RtlAvlTable>, nodeorparent: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlDeleteElementGenericTableAvlEx(table.rawAddress.toString(), nodeorparent.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlDeleteHashTable(hashtable: ConstPtr<RtlDynamicHashTable>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlDeleteHashTable(hashtable.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlDeleteNoSplay(links: ConstPtr<RtlSplayLinks>, root: MutPtr<MutPtr<RtlSplayLinks>>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlDeleteNoSplay(links.rawAddress.toString(), root.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlDeleteRegistryValue(relativeto: UInt, path: Pcwstr, valuename: Pcwstr): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlDeleteRegistryValue(relativeto.toInt(), path.rawAddress.toString(), valuename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDowncaseUnicodeChar(sourcecharacter: UShort): UShort =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlDowncaseUnicodeChar(sourcecharacter.toInt()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEndEnumerationHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlEndEnumerationHashTable(hashtable.rawAddress.toString(), enumerator.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlEndStrongEnumerationHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlEndStrongEnumerationHashTable(hashtable.rawAddress.toString(), enumerator.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlEndWeakEnumerationHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlEndWeakEnumerationHashTable(hashtable.rawAddress.toString(), enumerator.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlEnumerateEntryHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>): MutPtr<RtlDynamicHashTableEntry> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlEnumerateEntryHashTable(hashtable.rawAddress.toString(), enumerator.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEnumerateGenericTable(table: ConstPtr<RtlGenericTable>, restart: Boolean): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTable(table.rawAddress.toString(), restart) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEnumerateGenericTableAvl(table: ConstPtr<RtlAvlTable>, restart: Boolean): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTableAvl(table.rawAddress.toString(), restart) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEnumerateGenericTableLikeADirectory(table: ConstPtr<RtlAvlTable>, matchfunction: PrtlAvlMatchFunction, matchdata: ConstPtr<CVoid>, nextflag: UInt, restartkey: MutPtr<MutPtr<CVoid>>, deletecount: MutPtr<UInt>, buffer: ConstPtr<CVoid>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTableLikeADirectory(table.rawAddress.toString(), 0L.toString(), matchdata.rawAddress.toString(), nextflag.toInt(), restartkey.rawAddress.toString(), deletecount.rawAddress.toString(), buffer.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEnumerateGenericTableWithoutSplaying(table: ConstPtr<RtlGenericTable>, restartkey: MutPtr<MutPtr<CVoid>>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTableWithoutSplaying(table.rawAddress.toString(), restartkey.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEnumerateGenericTableWithoutSplayingAvl(table: ConstPtr<RtlAvlTable>, restartkey: MutPtr<MutPtr<CVoid>>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTableWithoutSplayingAvl(table.rawAddress.toString(), restartkey.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEqualString(string1: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, string2: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, caseinsensitive: Boolean): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlEqualString(string1.rawAddress.toString(), string2.rawAddress.toString(), caseinsensitive) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEqualUnicodeString(string1: ConstPtr<UnicodeString>, string2: ConstPtr<UnicodeString>, caseinsensitive: Boolean): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlEqualUnicodeString(string1.rawAddress.toString(), string2.rawAddress.toString(), caseinsensitive) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlExpandHashTable(hashtable: ConstPtr<RtlDynamicHashTable>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlExpandHashTable(hashtable.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlExtractBitMap(source: ConstPtr<RtlBitmap>, destination: ConstPtr<RtlBitmap>, targetbit: UInt, numberofbits: UInt) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlExtractBitMap(source.rawAddress.toString(), destination.rawAddress.toString(), targetbit.toInt(), numberofbits.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlFindClearBits(bitmapheader: ConstPtr<RtlBitmap>, numbertofind: UInt, hintindex: UInt): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlFindClearBits(bitmapheader.rawAddress.toString(), numbertofind.toInt(), hintindex.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFindClearBitsAndSet(bitmapheader: ConstPtr<RtlBitmap>, numbertofind: UInt, hintindex: UInt): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlFindClearBitsAndSet(bitmapheader.rawAddress.toString(), numbertofind.toInt(), hintindex.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFindClearRuns(bitmapheader: ConstPtr<RtlBitmap>, runarray: MutPtr<RtlBitmapRun>, sizeofrunarray: UInt, locatelongestruns: Boolean): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlFindClearRuns(bitmapheader.rawAddress.toString(), runarray.rawAddress.toString(), sizeofrunarray.toInt(), locatelongestruns) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFindClosestEncodableLength(sourcelength: ULong, targetlength: MutPtr<ULong>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlFindClosestEncodableLength(sourcelength.toString(), targetlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFindFirstRunClear(bitmapheader: ConstPtr<RtlBitmap>, startingindex: MutPtr<UInt>): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlFindFirstRunClear(bitmapheader.rawAddress.toString(), startingindex.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFindLastBackwardRunClear(bitmapheader: ConstPtr<RtlBitmap>, fromindex: UInt, startingrunindex: MutPtr<UInt>): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlFindLastBackwardRunClear(bitmapheader.rawAddress.toString(), fromindex.toInt(), startingrunindex.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFindLeastSignificantBit(set: ULong): Byte =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlFindLeastSignificantBit(set.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFindLongestRunClear(bitmapheader: ConstPtr<RtlBitmap>, startingindex: MutPtr<UInt>): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlFindLongestRunClear(bitmapheader.rawAddress.toString(), startingindex.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFindMostSignificantBit(set: ULong): Byte =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlFindMostSignificantBit(set.toString()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFindNextForwardRunClear(bitmapheader: ConstPtr<RtlBitmap>, fromindex: UInt, startingrunindex: MutPtr<UInt>): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlFindNextForwardRunClear(bitmapheader.rawAddress.toString(), fromindex.toInt(), startingrunindex.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFindSetBits(bitmapheader: ConstPtr<RtlBitmap>, numbertofind: UInt, hintindex: UInt): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlFindSetBits(bitmapheader.rawAddress.toString(), numbertofind.toInt(), hintindex.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFindSetBitsAndClear(bitmapheader: ConstPtr<RtlBitmap>, numbertofind: UInt, hintindex: UInt): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlFindSetBitsAndClear(bitmapheader.rawAddress.toString(), numbertofind.toInt(), hintindex.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFreeUTF8String(utf8string: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlFreeUTF8String(utf8string.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlGUIDFromString(guidstring: ConstPtr<UnicodeString>, guid: MutPtr<Guid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlGUIDFromString(guidstring.rawAddress.toString(), guid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGenerateClass5Guid(namespaceguid: ConstPtr<Guid>, buffer: ConstPtr<CVoid>, buffersize: UInt, guid: MutPtr<Guid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlGenerateClass5Guid(namespaceguid.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.toInt(), guid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetActiveConsoleId(): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlGetActiveConsoleId() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetCallersAddress(callersaddress: MutPtr<MutPtr<CVoid>>, callerscaller: MutPtr<MutPtr<CVoid>>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlGetCallersAddress(callersaddress.rawAddress.toString(), callerscaller.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlGetConsoleSessionForegroundProcessId(): ULong =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlGetConsoleSessionForegroundProcessId() as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetElementGenericTable(table: ConstPtr<RtlGenericTable>, i: UInt): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlGetElementGenericTable(table.rawAddress.toString(), i.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetElementGenericTableAvl(table: ConstPtr<RtlAvlTable>, i: UInt): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlGetElementGenericTableAvl(table.rawAddress.toString(), i.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetEnabledExtendedFeatures(featuremask: ULong): ULong =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlGetEnabledExtendedFeatures(featuremask.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetNextEntryHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, context: ConstPtr<RtlDynamicHashTableContext>): MutPtr<RtlDynamicHashTableEntry> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlGetNextEntryHashTable(hashtable.rawAddress.toString(), context.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetNtProductType(ntproducttype: MutPtr<NtProductType>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlGetNtProductType(ntproducttype.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetNtSystemRoot(): Pcwstr =
    if (windowsWdkSystemSystemservicesNapiAddon != null) ConstPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlGetNtSystemRoot() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetPersistedStateLocation(sourceid: Pcwstr, customvalue: Pcwstr, defaultpath: Pcwstr, statelocationtype: StateLocationType, targetpath: Pwstr, bufferlengthin: UInt, bufferlengthout: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlGetPersistedStateLocation(sourceid.rawAddress.toString(), customvalue.rawAddress.toString(), defaultpath.rawAddress.toString(), statelocationtype, targetpath.rawAddress.toString(), bufferlengthin.toInt(), bufferlengthout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetSuiteMask(): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlGetSuiteMask() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetVersion(lpversioninformation: MutPtr<Osversioninfow>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlGetVersion(lpversioninformation.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlHashUnicodeString(string: ConstPtr<UnicodeString>, caseinsensitive: Boolean, hashalgorithm: UInt, hashvalue: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlHashUnicodeString(string.rawAddress.toString(), caseinsensitive, hashalgorithm.toInt(), hashvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInitEnumerationHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlInitEnumerationHashTable(hashtable.rawAddress.toString(), enumerator.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInitStrongEnumerationHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlInitStrongEnumerationHashTable(hashtable.rawAddress.toString(), enumerator.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInitUTF8String(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: ConstPtr<Byte>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlInitUTF8String(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlInitUTF8StringEx(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: ConstPtr<Byte>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlInitUTF8StringEx(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInitWeakEnumerationHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlInitWeakEnumerationHashTable(hashtable.rawAddress.toString(), enumerator.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInitializeBitMap(bitmapheader: MutPtr<RtlBitmap>, bitmapbuffer: ConstPtr<UInt>, sizeofbitmap: UInt) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlInitializeBitMap(bitmapheader.rawAddress.toString(), bitmapbuffer.rawAddress.toString(), sizeofbitmap.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlInitializeGenericTable(table: MutPtr<RtlGenericTable>, compareroutine: PrtlGenericCompareRoutine, allocateroutine: PrtlGenericAllocateRoutine, freeroutine: PrtlGenericFreeRoutine, tablecontext: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlInitializeGenericTable(table.rawAddress.toString(), 0L.toString(), 0L.toString(), 0L.toString(), tablecontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlInitializeGenericTableAvl(table: MutPtr<RtlAvlTable>, compareroutine: PrtlAvlCompareRoutine, allocateroutine: PrtlAvlAllocateRoutine, freeroutine: PrtlAvlFreeRoutine, tablecontext: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlInitializeGenericTableAvl(table.rawAddress.toString(), 0L.toString(), 0L.toString(), 0L.toString(), tablecontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlInsertElementGenericTable(table: ConstPtr<RtlGenericTable>, buffer: ConstPtr<CVoid>, buffersize: UInt, newelement: MutPtr<Boolean>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlInsertElementGenericTable(table.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.toInt(), newelement.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInsertElementGenericTableAvl(table: ConstPtr<RtlAvlTable>, buffer: ConstPtr<CVoid>, buffersize: UInt, newelement: MutPtr<Boolean>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlInsertElementGenericTableAvl(table.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.toInt(), newelement.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInsertElementGenericTableFull(table: ConstPtr<RtlGenericTable>, buffer: ConstPtr<CVoid>, buffersize: UInt, newelement: MutPtr<Boolean>, nodeorparent: ConstPtr<CVoid>, searchresult: TableSearchResult): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlInsertElementGenericTableFull(table.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.toInt(), newelement.rawAddress.toString(), nodeorparent.rawAddress.toString(), searchresult) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInsertElementGenericTableFullAvl(table: ConstPtr<RtlAvlTable>, buffer: ConstPtr<CVoid>, buffersize: UInt, newelement: MutPtr<Boolean>, nodeorparent: ConstPtr<CVoid>, searchresult: TableSearchResult): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlInsertElementGenericTableFullAvl(table.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.toInt(), newelement.rawAddress.toString(), nodeorparent.rawAddress.toString(), searchresult) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInsertEntryHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, entry: ConstPtr<RtlDynamicHashTableEntry>, signature: ULong, context: MutPtr<RtlDynamicHashTableContext>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlInsertEntryHashTable(hashtable.rawAddress.toString(), entry.rawAddress.toString(), signature.toString(), context.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInt64ToUnicodeString(value: ULong, base: UInt, string: MutPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlInt64ToUnicodeString(value.toString(), base.toInt(), string.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIntegerToUnicodeString(value: UInt, base: UInt, string: MutPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlIntegerToUnicodeString(value.toInt(), base.toInt(), string.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIoDecodeMemIoResource(descriptor: ConstPtr<IoResourceDescriptor>, alignment: MutPtr<ULong>, minimumaddress: MutPtr<ULong>, maximumaddress: MutPtr<ULong>): ULong =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlIoDecodeMemIoResource(descriptor.rawAddress.toString(), alignment.rawAddress.toString(), minimumaddress.rawAddress.toString(), maximumaddress.rawAddress.toString()) as String).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIoEncodeMemIoResource(descriptor: ConstPtr<IoResourceDescriptor>, type: UByte, length: ULong, alignment: ULong, minimumaddress: ULong, maximumaddress: ULong): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlIoEncodeMemIoResource(descriptor.rawAddress.toString(), type.toInt(), length.toString(), alignment.toString(), minimumaddress.toString(), maximumaddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsApiSetImplemented(apisetname: Pcstr): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlIsApiSetImplemented(apisetname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsGenericTableEmpty(table: ConstPtr<RtlGenericTable>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlIsGenericTableEmpty(table.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsGenericTableEmptyAvl(table: ConstPtr<RtlAvlTable>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlIsGenericTableEmptyAvl(table.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsMultiSessionSku(): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlIsMultiSessionSku() as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsMultiUsersInSessionSku(): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlIsMultiUsersInSessionSku() as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsNtDdiVersionAvailable(version: UInt): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlIsNtDdiVersionAvailable(version.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsServicePackVersionInstalled(version: UInt): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlIsServicePackVersionInstalled(version.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsStateSeparationEnabled(): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlIsStateSeparationEnabled() as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsUntrustedObject(handle: Handle, obj: ConstPtr<CVoid>, untrustedobject: MutPtr<Boolean>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlIsUntrustedObject(handle.rawAddress.toString(), obj.rawAddress.toString(), untrustedobject.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlLengthSecurityDescriptor(securitydescriptor: PsecurityDescriptor): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlLengthSecurityDescriptor(securitydescriptor.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlLookupElementGenericTable(table: ConstPtr<RtlGenericTable>, buffer: ConstPtr<CVoid>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlLookupElementGenericTable(table.rawAddress.toString(), buffer.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlLookupElementGenericTableAvl(table: ConstPtr<RtlAvlTable>, buffer: ConstPtr<CVoid>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlLookupElementGenericTableAvl(table.rawAddress.toString(), buffer.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlLookupElementGenericTableFull(table: ConstPtr<RtlGenericTable>, buffer: ConstPtr<CVoid>, nodeorparent: MutPtr<MutPtr<CVoid>>, searchresult: MutPtr<TableSearchResult>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlLookupElementGenericTableFull(table.rawAddress.toString(), buffer.rawAddress.toString(), nodeorparent.rawAddress.toString(), searchresult.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlLookupElementGenericTableFullAvl(table: ConstPtr<RtlAvlTable>, buffer: ConstPtr<CVoid>, nodeorparent: MutPtr<MutPtr<CVoid>>, searchresult: MutPtr<TableSearchResult>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlLookupElementGenericTableFullAvl(table.rawAddress.toString(), buffer.rawAddress.toString(), nodeorparent.rawAddress.toString(), searchresult.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlLookupEntryHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, signature: ULong, context: MutPtr<RtlDynamicHashTableContext>): MutPtr<RtlDynamicHashTableEntry> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlLookupEntryHashTable(hashtable.rawAddress.toString(), signature.toString(), context.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlLookupFirstMatchingElementGenericTableAvl(table: ConstPtr<RtlAvlTable>, buffer: ConstPtr<CVoid>, restartkey: MutPtr<MutPtr<CVoid>>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlLookupFirstMatchingElementGenericTableAvl(table.rawAddress.toString(), buffer.rawAddress.toString(), restartkey.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlMapGenericMask(accessmask: MutPtr<UInt>, genericmapping: ConstPtr<GenericMapping>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlMapGenericMask(accessmask.rawAddress.toString(), genericmapping.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlNormalizeSecurityDescriptor(securitydescriptor: MutPtr<PsecurityDescriptor>, securitydescriptorlength: UInt, newsecuritydescriptor: MutPtr<PsecurityDescriptor>, newsecuritydescriptorlength: MutPtr<UInt>, checkonly: Boolean): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlNormalizeSecurityDescriptor(securitydescriptor.rawAddress.toString(), securitydescriptorlength.toInt(), newsecuritydescriptor.rawAddress.toString(), newsecuritydescriptorlength.rawAddress.toString(), checkonly) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlNumberGenericTableElements(table: ConstPtr<RtlGenericTable>): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlNumberGenericTableElements(table.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlNumberGenericTableElementsAvl(table: ConstPtr<RtlAvlTable>): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlNumberGenericTableElementsAvl(table.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlNumberOfClearBits(bitmapheader: ConstPtr<RtlBitmap>): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlNumberOfClearBits(bitmapheader.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlNumberOfClearBitsInRange(bitmapheader: ConstPtr<RtlBitmap>, startingindex: UInt, length: UInt): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlNumberOfClearBitsInRange(bitmapheader.rawAddress.toString(), startingindex.toInt(), length.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlNumberOfSetBits(bitmapheader: ConstPtr<RtlBitmap>): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlNumberOfSetBits(bitmapheader.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlNumberOfSetBitsInRange(bitmapheader: ConstPtr<RtlBitmap>, startingindex: UInt, length: UInt): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlNumberOfSetBitsInRange(bitmapheader.rawAddress.toString(), startingindex.toInt(), length.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlNumberOfSetBitsUlongPtr(target: ULong): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlNumberOfSetBitsUlongPtr(target.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlPrefetchMemoryNonTemporal(source: ConstPtr<CVoid>, length: ULong) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlPrefetchMemoryNonTemporal(source.rawAddress.toString(), length.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlPrefixUnicodeString(string1: ConstPtr<UnicodeString>, string2: ConstPtr<UnicodeString>, caseinsensitive: Boolean): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlPrefixUnicodeString(string1.rawAddress.toString(), string2.rawAddress.toString(), caseinsensitive) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlQueryRegistryValueWithFallback(primaryhandle: Handle, fallbackhandle: Handle, valuename: ConstPtr<UnicodeString>, valuelength: UInt, valuetype: MutPtr<UInt>, valuedata: MutPtr<CVoid>, resultlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlQueryRegistryValueWithFallback(primaryhandle.rawAddress.toString(), fallbackhandle.rawAddress.toString(), valuename.rawAddress.toString(), valuelength.toInt(), valuetype.rawAddress.toString(), valuedata.rawAddress.toString(), resultlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlQueryRegistryValues(relativeto: UInt, path: Pcwstr, querytable: MutPtr<RtlQueryRegistryTable>, context: ConstPtr<CVoid>, environment: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlQueryRegistryValues(relativeto.toInt(), path.rawAddress.toString(), querytable.rawAddress.toString(), context.rawAddress.toString(), environment.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlQueryValidationRunlevel(componentname: ConstPtr<UnicodeString>): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlQueryValidationRunlevel(componentname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlRealPredecessor(links: ConstPtr<RtlSplayLinks>): MutPtr<RtlSplayLinks> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlRealPredecessor(links.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlRealSuccessor(links: ConstPtr<RtlSplayLinks>): MutPtr<RtlSplayLinks> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlRealSuccessor(links.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlRemoveEntryHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, entry: ConstPtr<RtlDynamicHashTableEntry>, context: MutPtr<RtlDynamicHashTableContext>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlRemoveEntryHashTable(hashtable.rawAddress.toString(), entry.rawAddress.toString(), context.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlRunOnceBeginInitialize(runonce: MutPtr<InitOnce>, flags: UInt, context: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlRunOnceBeginInitialize(runonce.rawAddress.toString(), flags.toInt(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlRunOnceComplete(runonce: MutPtr<InitOnce>, flags: UInt, context: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlRunOnceComplete(runonce.rawAddress.toString(), flags.toInt(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlRunOnceExecuteOnce(runonce: MutPtr<InitOnce>, initfn: PrtlRunOnceInitFn, parameter: MutPtr<CVoid>, context: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlRunOnceExecuteOnce(runonce.rawAddress.toString(), 0L.toString(), parameter.rawAddress.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlRunOnceInitialize(runonce: MutPtr<InitOnce>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlRunOnceInitialize(runonce.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlSetAllBits(bitmapheader: ConstPtr<RtlBitmap>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlSetAllBits(bitmapheader.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlSetBit(bitmapheader: ConstPtr<RtlBitmap>, bitnumber: UInt) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlSetBit(bitmapheader.rawAddress.toString(), bitnumber.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlSetBits(bitmapheader: ConstPtr<RtlBitmap>, startingindex: UInt, numbertoset: UInt) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlSetBits(bitmapheader.rawAddress.toString(), startingindex.toInt(), numbertoset.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlSetDaclSecurityDescriptor(securitydescriptor: PsecurityDescriptor, daclpresent: Boolean, dacl: ConstPtr<Acl>, dacldefaulted: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlSetDaclSecurityDescriptor(securitydescriptor.rawAddress.toString(), daclpresent, dacl.rawAddress.toString(), dacldefaulted) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlSetSystemGlobalData(dataid: RtlSystemGlobalDataId, buffer: ConstPtr<CVoid>, size: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlSetSystemGlobalData(dataid, buffer.rawAddress.toString(), size.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlSplay(links: MutPtr<RtlSplayLinks>): MutPtr<RtlSplayLinks> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlSplay(links.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlStringFromGUID(guid: ConstPtr<Guid>, guidstring: MutPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlStringFromGUID(guid.rawAddress.toString(), guidstring.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlStronglyEnumerateEntryHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>): MutPtr<RtlDynamicHashTableEntry> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlStronglyEnumerateEntryHashTable(hashtable.rawAddress.toString(), enumerator.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlSubtreePredecessor(links: ConstPtr<RtlSplayLinks>): MutPtr<RtlSplayLinks> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlSubtreePredecessor(links.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlSubtreeSuccessor(links: ConstPtr<RtlSplayLinks>): MutPtr<RtlSplayLinks> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlSubtreeSuccessor(links.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlSuffixUnicodeString(string1: ConstPtr<UnicodeString>, string2: ConstPtr<UnicodeString>, caseinsensitive: Boolean): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlSuffixUnicodeString(string1.rawAddress.toString(), string2.rawAddress.toString(), caseinsensitive) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlTestBit(bitmapheader: ConstPtr<RtlBitmap>, bitnumber: UInt): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlTestBit(bitmapheader.rawAddress.toString(), bitnumber.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlTimeFieldsToTime(timefields: ConstPtr<TimeFields>, time: MutPtr<Long>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlTimeFieldsToTime(timefields.rawAddress.toString(), time.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlTimeToTimeFields(time: ConstPtr<Long>, timefields: MutPtr<TimeFields>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlTimeToTimeFields(time.rawAddress.toString(), timefields.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlUTF8StringToUnicodeString(destinationstring: MutPtr<UnicodeString>, sourcestring: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, allocatedestinationstring: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlUTF8StringToUnicodeString(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString(), allocatedestinationstring) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUTF8ToUnicodeN(unicodestringdestination: Pwstr, unicodestringmaxbytecount: UInt, unicodestringactualbytecount: MutPtr<UInt>, utf8stringsource: Pcstr, utf8stringbytecount: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlUTF8ToUnicodeN(unicodestringdestination.rawAddress.toString(), unicodestringmaxbytecount.toInt(), unicodestringactualbytecount.rawAddress.toString(), utf8stringsource.rawAddress.toString(), utf8stringbytecount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUnicodeStringToInt64(string: ConstPtr<UnicodeString>, base: UInt, number: MutPtr<Long>, endpointer: MutPtr<Pwstr>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlUnicodeStringToInt64(string.rawAddress.toString(), base.toInt(), number.rawAddress.toString(), endpointer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUnicodeStringToInteger(string: ConstPtr<UnicodeString>, base: UInt, value: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlUnicodeStringToInteger(string.rawAddress.toString(), base.toInt(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUnicodeStringToUTF8String(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: ConstPtr<UnicodeString>, allocatedestinationstring: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlUnicodeStringToUTF8String(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString(), allocatedestinationstring) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUnicodeToUTF8N(utf8stringdestination: Pstr, utf8stringmaxbytecount: UInt, utf8stringactualbytecount: MutPtr<UInt>, unicodestringsource: ConstPtr<UShort>, unicodestringbytecount: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlUnicodeToUTF8N(utf8stringdestination.rawAddress.toString(), utf8stringmaxbytecount.toInt(), utf8stringactualbytecount.rawAddress.toString(), unicodestringsource.rawAddress.toString(), unicodestringbytecount.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUpcaseUnicodeChar(sourcecharacter: UShort): UShort =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlUpcaseUnicodeChar(sourcecharacter.toInt()) as Int).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUpcaseUnicodeString(destinationstring: MutPtr<UnicodeString>, sourcestring: ConstPtr<UnicodeString>, allocatedestinationstring: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlUpcaseUnicodeString(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString(), allocatedestinationstring) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUpperChar(character: Byte): Byte =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlUpperChar(character.toInt()) as Int).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUpperString(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlUpperString(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlValidRelativeSecurityDescriptor(securitydescriptorinput: PsecurityDescriptor, securitydescriptorlength: UInt, requiredinformation: UInt): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlValidRelativeSecurityDescriptor(securitydescriptorinput.rawAddress.toString(), securitydescriptorlength.toInt(), requiredinformation.toInt()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlValidSecurityDescriptor(securitydescriptor: PsecurityDescriptor): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlValidSecurityDescriptor(securitydescriptor.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlVerifyVersionInfo(versioninfo: ConstPtr<Osversioninfoexw>, typemask: UInt, conditionmask: ULong): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlVerifyVersionInfo(versioninfo.rawAddress.toString(), typemask.toInt(), conditionmask.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlVolumeDeviceToDosName(volumedeviceobject: ConstPtr<CVoid>, dosname: MutPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlVolumeDeviceToDosName(volumedeviceobject.rawAddress.toString(), dosname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlWalkFrameChain(callers: MutPtr<MutPtr<CVoid>>, count: UInt, flags: UInt): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlWalkFrameChain(callers.rawAddress.toString(), count.toInt(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlWeaklyEnumerateEntryHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>): MutPtr<RtlDynamicHashTableEntry> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlWeaklyEnumerateEntryHashTable(hashtable.rawAddress.toString(), enumerator.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlWriteRegistryValue(relativeto: UInt, path: Pcwstr, valuename: Pcwstr, valuetype: UInt, valuedata: ConstPtr<CVoid>, valuelength: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlWriteRegistryValue(relativeto.toInt(), path.rawAddress.toString(), valuename.rawAddress.toString(), valuetype.toInt(), valuedata.rawAddress.toString(), valuelength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlxAnsiStringToUnicodeSize(ansistring: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlxAnsiStringToUnicodeSize(ansistring.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlxUnicodeStringToAnsiSize(unicodestring: ConstPtr<UnicodeString>): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesRtlxUnicodeStringToAnsiSize(unicodestring.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAccessCheck(securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr<SecuritySubjectContext>, subjectcontextlocked: Boolean, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: MutPtr<MutPtr<PrivilegeSet>>, genericmapping: ConstPtr<GenericMapping>, accessmode: Byte, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Int>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesSeAccessCheck(securitydescriptor.rawAddress.toString(), subjectsecuritycontext.rawAddress.toString(), subjectcontextlocked, desiredaccess.toInt(), previouslygrantedaccess.toInt(), privileges.rawAddress.toString(), genericmapping.rawAddress.toString(), accessmode.toInt(), grantedaccess.rawAddress.toString(), accessstatus.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAssignSecurity(parentdescriptor: PsecurityDescriptor, explicitdescriptor: PsecurityDescriptor, newdescriptor: MutPtr<PsecurityDescriptor>, isdirectoryobject: Boolean, subjectcontext: ConstPtr<SecuritySubjectContext>, genericmapping: ConstPtr<GenericMapping>, pooltype: PoolType): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesSeAssignSecurity(parentdescriptor.rawAddress.toString(), explicitdescriptor.rawAddress.toString(), newdescriptor.rawAddress.toString(), isdirectoryobject, subjectcontext.rawAddress.toString(), genericmapping.rawAddress.toString(), pooltype) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAssignSecurityEx(parentdescriptor: PsecurityDescriptor, explicitdescriptor: PsecurityDescriptor, newdescriptor: MutPtr<PsecurityDescriptor>, objecttype: ConstPtr<Guid>, isdirectoryobject: Boolean, autoinheritflags: UInt, subjectcontext: ConstPtr<SecuritySubjectContext>, genericmapping: ConstPtr<GenericMapping>, pooltype: PoolType): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesSeAssignSecurityEx(parentdescriptor.rawAddress.toString(), explicitdescriptor.rawAddress.toString(), newdescriptor.rawAddress.toString(), objecttype.rawAddress.toString(), isdirectoryobject, autoinheritflags.toInt(), subjectcontext.rawAddress.toString(), genericmapping.rawAddress.toString(), pooltype) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seCaptureSubjectContext(subjectcontext: MutPtr<SecuritySubjectContext>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesSeCaptureSubjectContext(subjectcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seComputeAutoInheritByObjectType(objecttype: ConstPtr<CVoid>, securitydescriptor: PsecurityDescriptor, parentsecuritydescriptor: PsecurityDescriptor): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesSeComputeAutoInheritByObjectType(objecttype.rawAddress.toString(), securitydescriptor.rawAddress.toString(), parentsecuritydescriptor.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seDeassignSecurity(securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesSeDeassignSecurity(securitydescriptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seEtwWriteKMCveEvent(cveid: ConstPtr<UnicodeString>, additionaldetails: ConstPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesSeEtwWriteKMCveEvent(cveid.rawAddress.toString(), additionaldetails.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seLockSubjectContext(subjectcontext: ConstPtr<SecuritySubjectContext>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesSeLockSubjectContext(subjectcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seRegisterImageVerificationCallback(imagetype: SeImageType, callbacktype: SeImageVerificationCallbackType, callbackfunction: PseImageVerificationCallbackFunction, callbackcontext: ConstPtr<CVoid>, token: ConstPtr<CVoid>, callbackhandle: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesSeRegisterImageVerificationCallback(imagetype, callbacktype, 0L.toString(), callbackcontext.rawAddress.toString(), token.rawAddress.toString(), callbackhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seReleaseSubjectContext(subjectcontext: MutPtr<SecuritySubjectContext>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesSeReleaseSubjectContext(subjectcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seReportSecurityEvent(flags: UInt, sourcename: ConstPtr<UnicodeString>, usersid: Psid, auditparameters: ConstPtr<SeAdtParameterArray>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesSeReportSecurityEvent(flags.toInt(), sourcename.rawAddress.toString(), usersid.rawAddress.toString(), auditparameters.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seSetAuditParameter(auditparameters: MutPtr<SeAdtParameterArray>, type: SeAdtParameterType, index: UInt, data: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesSeSetAuditParameter(auditparameters.rawAddress.toString(), type, index.toInt(), data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seSinglePrivilegeCheck(privilegevalue: Luid, previousmode: Byte): Boolean =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seUnlockSubjectContext(subjectcontext: ConstPtr<SecuritySubjectContext>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesSeUnlockSubjectContext(subjectcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seUnregisterImageVerificationCallback(callbackhandle: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesSeUnregisterImageVerificationCallback(callbackhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seValidSecurityDescriptor(length: UInt, securitydescriptor: PsecurityDescriptor): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesSeValidSecurityDescriptor(length.toInt(), securitydescriptor.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmCommitComplete(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesTmCommitComplete(enlistment.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmCommitEnlistment(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesTmCommitEnlistment(enlistment.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmCommitTransaction(transaction: ConstPtr<Ktransaction>, wait: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesTmCommitTransaction(transaction.rawAddress.toString(), wait) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmCreateEnlistment(enlistmenthandle: MutPtr<Handle>, previousmode: Byte, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, resourcemanager: ConstPtr<Long>, transaction: ConstPtr<Ktransaction>, createoptions: UInt, notificationmask: UInt, enlistmentkey: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesTmCreateEnlistment(enlistmenthandle.rawAddress.toString(), previousmode.toInt(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), resourcemanager.rawAddress.toString(), transaction.rawAddress.toString(), createoptions.toInt(), notificationmask.toInt(), enlistmentkey.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmDereferenceEnlistmentKey(enlistment: ConstPtr<Kenlistment>, lastreference: MutPtr<Boolean>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesTmDereferenceEnlistmentKey(enlistment.rawAddress.toString(), lastreference.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmEnableCallbacks(resourcemanager: ConstPtr<Kresourcemanager>, callbackroutine: PtmRmNotification, rmkey: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesTmEnableCallbacks(resourcemanager.rawAddress.toString(), 0L.toString(), rmkey.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmGetTransactionId(transaction: ConstPtr<Ktransaction>, transactionid: MutPtr<Guid>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesTmGetTransactionId(transaction.rawAddress.toString(), transactionid.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun tmInitializeTransactionManager(transactionmanager: ConstPtr<Long>, logfilename: ConstPtr<UnicodeString>, tmid: ConstPtr<Guid>, createoptions: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesTmInitializeTransactionManager(transactionmanager.rawAddress.toString(), logfilename.rawAddress.toString(), tmid.rawAddress.toString(), createoptions.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmIsTransactionActive(transaction: ConstPtr<Ktransaction>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesTmIsTransactionActive(transaction.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmPrePrepareComplete(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesTmPrePrepareComplete(enlistment.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmPrePrepareEnlistment(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesTmPrePrepareEnlistment(enlistment.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmPrepareComplete(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesTmPrepareComplete(enlistment.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmPrepareEnlistment(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesTmPrepareEnlistment(enlistment.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmPropagationComplete(resourcemanager: ConstPtr<Kresourcemanager>, requestcookie: UInt, bufferlength: UInt, buffer: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesTmPropagationComplete(resourcemanager.rawAddress.toString(), requestcookie.toInt(), bufferlength.toInt(), buffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmPropagationFailed(resourcemanager: ConstPtr<Kresourcemanager>, requestcookie: UInt, status: Ntstatus): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesTmPropagationFailed(resourcemanager.rawAddress.toString(), requestcookie.toInt(), status) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmReadOnlyEnlistment(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesTmReadOnlyEnlistment(enlistment.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmRecoverEnlistment(enlistment: ConstPtr<Kenlistment>, enlistmentkey: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesTmRecoverEnlistment(enlistment.rawAddress.toString(), enlistmentkey.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmRecoverResourceManager(resourcemanager: ConstPtr<Kresourcemanager>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesTmRecoverResourceManager(resourcemanager.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmRecoverTransactionManager(tm: ConstPtr<Ktm>, targetvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesTmRecoverTransactionManager(tm.rawAddress.toString(), targetvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmReferenceEnlistmentKey(enlistment: ConstPtr<Kenlistment>, key: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesTmReferenceEnlistmentKey(enlistment.rawAddress.toString(), key.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmRenameTransactionManager(logfilename: ConstPtr<UnicodeString>, existingtransactionmanagerguid: ConstPtr<Guid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesTmRenameTransactionManager(logfilename.rawAddress.toString(), existingtransactionmanagerguid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmRequestOutcomeEnlistment(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesTmRequestOutcomeEnlistment(enlistment.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmRollbackComplete(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesTmRollbackComplete(enlistment.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmRollbackEnlistment(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesTmRollbackEnlistment(enlistment.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmRollbackTransaction(transaction: ConstPtr<Ktransaction>, wait: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesTmRollbackTransaction(transaction.rawAddress.toString(), wait) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmSinglePhaseReject(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesTmSinglePhaseReject(enlistment.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vslCreateSecureSection(handle: MutPtr<Handle>, targetprocess: Peprocess, mdl: ConstPtr<Mdl>, devicepageprotection: UInt, attributes: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesVslCreateSecureSection(handle.rawAddress.toString(), targetprocess.toString(), mdl.rawAddress.toString(), devicepageprotection.toInt(), attributes.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vslDeleteSecureSection(globalhandle: Handle): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesVslDeleteSecureSection(globalhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaAddErrorSource(errorsource: ConstPtr<WheaErrorSourceDescriptor>, context: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesWheaAddErrorSource(errorsource.rawAddress.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaAddErrorSourceDeviceDriver(context: MutPtr<CVoid>, configuration: ConstPtr<WheaErrorSourceConfigurationDeviceDriver>, numberpreallocatederrorreports: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesWheaAddErrorSourceDeviceDriver(context.rawAddress.toString(), configuration.rawAddress.toString(), numberpreallocatederrorreports.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaAddErrorSourceDeviceDriverV1(context: MutPtr<CVoid>, configuration: ConstPtr<WheaErrorSourceConfigurationDeviceDriver>, numbufferstopreallocate: UInt, maxdatalength: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesWheaAddErrorSourceDeviceDriverV1(context.rawAddress.toString(), configuration.rawAddress.toString(), numbufferstopreallocate.toInt(), maxdatalength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaAddHwErrorReportSectionDeviceDriver(errorhandle: ConstPtr<CVoid>, sectiondatalength: UInt, bufferset: MutPtr<WheaDriverBufferSet>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesWheaAddHwErrorReportSectionDeviceDriver(errorhandle.rawAddress.toString(), sectiondatalength.toInt(), bufferset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaConfigureErrorSource(sourcetype: WheaErrorSourceType, configuration: ConstPtr<WheaErrorSourceConfiguration>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesWheaConfigureErrorSource(sourcetype, configuration.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaCreateHwErrorReportDeviceDriver(errorsourceid: UInt, deviceobject: ConstPtr<DeviceObject>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAddon != null) MutPtr((windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesWheaCreateHwErrorReportDeviceDriver(errorsourceid.toInt(), deviceobject.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaErrorSourceGetState(errorsourceid: UInt): WheaErrorSourceState =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesWheaErrorSourceGetState(errorsourceid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaGetNotifyAllOfflinesPolicy(): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesWheaGetNotifyAllOfflinesPolicy() as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaHighIrqlLogSelEventHandlerRegister(handler: PfnWheaHighIrqlLogSelEventHandler, context: ConstPtr<CVoid>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesWheaHighIrqlLogSelEventHandlerRegister(0L.toString(), context.rawAddress.toString()) as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaHighIrqlLogSelEventHandlerUnregister() {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesWheaHighIrqlLogSelEventHandlerUnregister()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wheaHwErrorReportAbandonDeviceDriver(errorhandle: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesWheaHwErrorReportAbandonDeviceDriver(errorhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaHwErrorReportSetSectionNameDeviceDriver(bufferset: ConstPtr<WheaDriverBufferSet>, namelength: UInt, name: ConstPtr<UByte>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesWheaHwErrorReportSetSectionNameDeviceDriver(bufferset.rawAddress.toString(), namelength.toInt(), name.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaHwErrorReportSetSeverityDeviceDriver(errorhandle: ConstPtr<CVoid>, errorseverity: WheaErrorSeverity): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesWheaHwErrorReportSetSeverityDeviceDriver(errorhandle.rawAddress.toString(), errorseverity) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaHwErrorReportSubmitDeviceDriver(errorhandle: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesWheaHwErrorReportSubmitDeviceDriver(errorhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaInitializeRecordHeader(header: MutPtr<WheaErrorRecordHeader>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesWheaInitializeRecordHeader(header.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaIsCriticalState(): Boolean =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesWheaIsCriticalState() as Boolean) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaLogInternalEvent(entry: ConstPtr<WheaEventLogEntry>) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesWheaLogInternalEvent(entry.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wheaRegisterInUsePageOfflineNotification(callback: PfnInUsePageOfflineNotify, context: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesWheaRegisterInUsePageOfflineNotification(0L.toString(), context.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaRemoveErrorSource(errorsourceid: UInt) {
    if (windowsWdkSystemSystemservicesNapiAddon != null) {
        windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesWheaRemoveErrorSource(errorsourceid.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wheaRemoveErrorSourceDeviceDriver(errorsourceid: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesWheaRemoveErrorSourceDeviceDriver(errorsourceid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaReportHwError(errorpacket: MutPtr<WheaErrorPacketV2>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesWheaReportHwError(errorpacket.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaReportHwErrorDeviceDriver(errorsourceid: UInt, deviceobject: ConstPtr<DeviceObject>, errordata: ConstPtr<UByte>, errordatalength: UInt, sectiontypeguid: ConstPtr<Guid>, errorseverity: WheaErrorSeverity, devicefriendlyname: Pcstr): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesWheaReportHwErrorDeviceDriver(errorsourceid.toInt(), deviceobject.rawAddress.toString(), errordata.rawAddress.toString(), errordatalength.toInt(), sectiontypeguid.rawAddress.toString(), errorseverity, devicefriendlyname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaUnconfigureErrorSource(sourcetype: WheaErrorSourceType): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesWheaUnconfigureErrorSource(sourcetype) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaUnregisterInUsePageOfflineNotification(callback: PfnInUsePageOfflineNotify): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesWheaUnregisterInUsePageOfflineNotification(0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wmiQueryTraceInformation(traceinformationclass: TraceInformationClass, traceinformation: MutPtr<CVoid>, traceinformationlength: UInt, requiredlength: MutPtr<UInt>, buffer: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesWmiQueryTraceInformation(traceinformationclass, traceinformation.rawAddress.toString(), traceinformationlength.toInt(), requiredlength.rawAddress.toString(), buffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwAllocateLocallyUniqueId(luid: MutPtr<Luid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwAllocateLocallyUniqueId(luid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwClose(handle: Handle): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwClose(handle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCommitComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwCommitComplete(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCommitEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwCommitEnlistment(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCommitTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwCommitTransaction(transactionhandle.rawAddress.toString(), wait) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCreateEnlistment(enlistmenthandle: MutPtr<Handle>, desiredaccess: UInt, resourcemanagerhandle: Handle, transactionhandle: Handle, objectattributes: ConstPtr<ObjectAttributes>, createoptions: UInt, notificationmask: UInt, enlistmentkey: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwCreateEnlistment(enlistmenthandle.rawAddress.toString(), desiredaccess.toInt(), resourcemanagerhandle.rawAddress.toString(), transactionhandle.rawAddress.toString(), objectattributes.rawAddress.toString(), createoptions.toInt(), notificationmask.toInt(), enlistmentkey.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCreateFile(filehandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, allocationsize: ConstPtr<Long>, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: ConstPtr<CVoid>, ealength: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwCreateFile(filehandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), iostatusblock.rawAddress.toString(), allocationsize.rawAddress.toString(), fileattributes.toInt(), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), eabuffer.rawAddress.toString(), ealength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCreateResourceManager(resourcemanagerhandle: MutPtr<Handle>, desiredaccess: UInt, tmhandle: Handle, resourcemanagerguid: ConstPtr<Guid>, objectattributes: ConstPtr<ObjectAttributes>, createoptions: UInt, description: ConstPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwCreateResourceManager(resourcemanagerhandle.rawAddress.toString(), desiredaccess.toInt(), tmhandle.rawAddress.toString(), resourcemanagerguid.rawAddress.toString(), objectattributes.rawAddress.toString(), createoptions.toInt(), description.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCreateSection(sectionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, maximumsize: ConstPtr<Long>, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwCreateSection(sectionhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), maximumsize.rawAddress.toString(), sectionpageprotection.toInt(), allocationattributes.toInt(), filehandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCreateTransaction(transactionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, uow: ConstPtr<Guid>, tmhandle: Handle, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: ConstPtr<Long>, description: ConstPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwCreateTransaction(transactionhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), uow.rawAddress.toString(), tmhandle.rawAddress.toString(), createoptions.toInt(), isolationlevel.toInt(), isolationflags.toInt(), timeout.rawAddress.toString(), description.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCreateTransactionManager(tmhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, logfilename: ConstPtr<UnicodeString>, createoptions: UInt, commitstrength: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwCreateTransactionManager(tmhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), logfilename.rawAddress.toString(), createoptions.toInt(), commitstrength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwDeviceIoControlFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, iocontrolcode: UInt, inputbuffer: ConstPtr<CVoid>, inputbufferlength: UInt, outputbuffer: MutPtr<CVoid>, outputbufferlength: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwDeviceIoControlFile(filehandle.rawAddress.toString(), event.rawAddress.toString(), 0L.toString(), apccontext.rawAddress.toString(), iostatusblock.rawAddress.toString(), iocontrolcode.toInt(), inputbuffer.rawAddress.toString(), inputbufferlength.toInt(), outputbuffer.rawAddress.toString(), outputbufferlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwDisplayString(string: ConstPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwDisplayString(string.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwEnumerateTransactionObject(rootobjecthandle: Handle, querytype: KtmobjectType, objectcursor: MutPtr<KtmobjectCursor>, objectcursorlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwEnumerateTransactionObject(rootobjecthandle.rawAddress.toString(), querytype, objectcursor.rawAddress.toString(), objectcursorlength.toInt(), returnlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwGetNotificationResourceManager(resourcemanagerhandle: Handle, transactionnotification: MutPtr<TransactionNotification>, notificationlength: UInt, timeout: ConstPtr<Long>, returnlength: MutPtr<UInt>, asynchronous: UInt, asynchronouscontext: ULong): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwGetNotificationResourceManager(resourcemanagerhandle.rawAddress.toString(), transactionnotification.rawAddress.toString(), notificationlength.toInt(), timeout.rawAddress.toString(), returnlength.rawAddress.toString(), asynchronous.toInt(), asynchronouscontext.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwLoadDriver(driverservicename: ConstPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwLoadDriver(driverservicename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwMakeTemporaryObject(handle: Handle): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwMakeTemporaryObject(handle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwManagePartition(targethandle: Handle, sourcehandle: Handle, partitioninformationclass: PartitionInformationClass, partitioninformation: MutPtr<CVoid>, partitioninformationlength: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwManagePartition(targethandle.rawAddress.toString(), sourcehandle.rawAddress.toString(), partitioninformationclass, partitioninformation.rawAddress.toString(), partitioninformationlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenEnlistment(enlistmenthandle: MutPtr<Handle>, desiredaccess: UInt, rmhandle: Handle, enlistmentguid: ConstPtr<Guid>, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwOpenEnlistment(enlistmenthandle.rawAddress.toString(), desiredaccess.toInt(), rmhandle.rawAddress.toString(), enlistmentguid.rawAddress.toString(), objectattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenFile(filehandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, shareaccess: UInt, openoptions: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwOpenFile(filehandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), iostatusblock.rawAddress.toString(), shareaccess.toInt(), openoptions.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenResourceManager(resourcemanagerhandle: MutPtr<Handle>, desiredaccess: UInt, tmhandle: Handle, resourcemanagerguid: ConstPtr<Guid>, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwOpenResourceManager(resourcemanagerhandle.rawAddress.toString(), desiredaccess.toInt(), tmhandle.rawAddress.toString(), resourcemanagerguid.rawAddress.toString(), objectattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenSymbolicLinkObject(linkhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwOpenSymbolicLinkObject(linkhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenTransaction(transactionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, uow: ConstPtr<Guid>, tmhandle: Handle): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwOpenTransaction(transactionhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), uow.rawAddress.toString(), tmhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenTransactionManager(tmhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, logfilename: ConstPtr<UnicodeString>, tmidentity: ConstPtr<Guid>, openoptions: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwOpenTransactionManager(tmhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), logfilename.rawAddress.toString(), tmidentity.rawAddress.toString(), openoptions.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwPowerInformation(informationlevel: PowerInformationLevel, inputbuffer: ConstPtr<CVoid>, inputbufferlength: UInt, outputbuffer: MutPtr<CVoid>, outputbufferlength: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwPowerInformation(informationlevel, inputbuffer.rawAddress.toString(), inputbufferlength.toInt(), outputbuffer.rawAddress.toString(), outputbufferlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwPrePrepareComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwPrePrepareComplete(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwPrePrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwPrePrepareEnlistment(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwPrepareComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwPrepareComplete(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwPrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwPrepareEnlistment(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwPropagationComplete(resourcemanagerhandle: Handle, requestcookie: UInt, bufferlength: UInt, buffer: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwPropagationComplete(resourcemanagerhandle.rawAddress.toString(), requestcookie.toInt(), bufferlength.toInt(), buffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwPropagationFailed(resourcemanagerhandle: Handle, requestcookie: UInt, propstatus: Ntstatus): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwPropagationFailed(resourcemanagerhandle.rawAddress.toString(), requestcookie.toInt(), propstatus) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryInformationByName(objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwQueryInformationByName(objectattributes.rawAddress.toString(), iostatusblock.rawAddress.toString(), fileinformation.rawAddress.toString(), length.toInt(), fileinformationclass) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: MutPtr<CVoid>, enlistmentinformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwQueryInformationEnlistment(enlistmenthandle.rawAddress.toString(), enlistmentinformationclass, enlistmentinformation.rawAddress.toString(), enlistmentinformationlength.toInt(), returnlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryInformationFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwQueryInformationFile(filehandle.rawAddress.toString(), iostatusblock.rawAddress.toString(), fileinformation.rawAddress.toString(), length.toInt(), fileinformationclass) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: MutPtr<CVoid>, resourcemanagerinformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwQueryInformationResourceManager(resourcemanagerhandle.rawAddress.toString(), resourcemanagerinformationclass, resourcemanagerinformation.rawAddress.toString(), resourcemanagerinformationlength.toInt(), returnlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: MutPtr<CVoid>, transactioninformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwQueryInformationTransaction(transactionhandle.rawAddress.toString(), transactioninformationclass, transactioninformation.rawAddress.toString(), transactioninformationlength.toInt(), returnlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryInformationTransactionManager(transactionmanagerhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: MutPtr<CVoid>, transactionmanagerinformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwQueryInformationTransactionManager(transactionmanagerhandle.rawAddress.toString(), transactionmanagerinformationclass, transactionmanagerinformation.rawAddress.toString(), transactionmanagerinformationlength.toInt(), returnlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQuerySymbolicLinkObject(linkhandle: Handle, linktarget: MutPtr<UnicodeString>, returnedlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwQuerySymbolicLinkObject(linkhandle.rawAddress.toString(), linktarget.rawAddress.toString(), returnedlength.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwReadFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, buffer: MutPtr<CVoid>, length: UInt, byteoffset: ConstPtr<Long>, key: ConstPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwReadFile(filehandle.rawAddress.toString(), event.rawAddress.toString(), 0L.toString(), apccontext.rawAddress.toString(), iostatusblock.rawAddress.toString(), buffer.rawAddress.toString(), length.toInt(), byteoffset.rawAddress.toString(), key.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwReadOnlyEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwReadOnlyEnlistment(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwRecoverEnlistment(enlistmenthandle: Handle, enlistmentkey: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwRecoverEnlistment(enlistmenthandle.rawAddress.toString(), enlistmentkey.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwRecoverResourceManager(resourcemanagerhandle: Handle): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwRecoverResourceManager(resourcemanagerhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwRecoverTransactionManager(transactionmanagerhandle: Handle): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwRecoverTransactionManager(transactionmanagerhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwRegisterProtocolAddressInformation(resourcemanager: Handle, protocolid: ConstPtr<Guid>, protocolinformationsize: UInt, protocolinformation: ConstPtr<CVoid>, createoptions: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwRegisterProtocolAddressInformation(resourcemanager.rawAddress.toString(), protocolid.rawAddress.toString(), protocolinformationsize.toInt(), protocolinformation.rawAddress.toString(), createoptions.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwRenameTransactionManager(logfilename: ConstPtr<UnicodeString>, existingtransactionmanagerguid: ConstPtr<Guid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwRenameTransactionManager(logfilename.rawAddress.toString(), existingtransactionmanagerguid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwRollbackComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwRollbackComplete(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwRollbackEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwRollbackEnlistment(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwRollbackTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwRollbackTransaction(transactionhandle.rawAddress.toString(), wait) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwRollforwardTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwRollforwardTransactionManager(transactionmanagerhandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: ConstPtr<CVoid>, enlistmentinformationlength: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwSetInformationEnlistment(enlistmenthandle.rawAddress.toString(), enlistmentinformationclass, enlistmentinformation.rawAddress.toString(), enlistmentinformationlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetInformationFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: ConstPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwSetInformationFile(filehandle.rawAddress.toString(), iostatusblock.rawAddress.toString(), fileinformation.rawAddress.toString(), length.toInt(), fileinformationclass) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: ConstPtr<CVoid>, resourcemanagerinformationlength: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwSetInformationResourceManager(resourcemanagerhandle.rawAddress.toString(), resourcemanagerinformationclass, resourcemanagerinformation.rawAddress.toString(), resourcemanagerinformationlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: ConstPtr<CVoid>, transactioninformationlength: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwSetInformationTransaction(transactionhandle.rawAddress.toString(), transactioninformationclass, transactioninformation.rawAddress.toString(), transactioninformationlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetInformationTransactionManager(tmhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: ConstPtr<CVoid>, transactionmanagerinformationlength: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwSetInformationTransactionManager(tmhandle.rawAddress.toString(), transactionmanagerinformationclass, transactionmanagerinformation.rawAddress.toString(), transactionmanagerinformationlength.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSinglePhaseReject(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwSinglePhaseReject(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwUnloadDriver(driverservicename: ConstPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwUnloadDriver(driverservicename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwWriteFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, buffer: ConstPtr<CVoid>, length: UInt, byteoffset: ConstPtr<Long>, key: ConstPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesZwWriteFile(filehandle.rawAddress.toString(), event.rawAddress.toString(), 0L.toString(), apccontext.rawAddress.toString(), iostatusblock.rawAddress.toString(), buffer.rawAddress.toString(), length.toInt(), byteoffset.rawAddress.toString(), key.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vDbgPrintEx(componentid: UInt, level: UInt, format: Pcstr, arglist: ConstPtr<Byte>): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesVDbgPrintEx(componentid.toInt(), level.toInt(), format.rawAddress.toString(), arglist.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vDbgPrintExWithPrefix(prefix: Pcstr, componentid: UInt, level: UInt, format: Pcstr, arglist: ConstPtr<Byte>): UInt =
    if (windowsWdkSystemSystemservicesNapiAddon != null) (windowsWdkSystemSystemservicesNapiAddon.windowssysWindowsWdkSystemSystemservicesVDbgPrintExWithPrefix(prefix.rawAddress.toString(), componentid.toInt(), level.toInt(), format.rawAddress.toString(), arglist.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
