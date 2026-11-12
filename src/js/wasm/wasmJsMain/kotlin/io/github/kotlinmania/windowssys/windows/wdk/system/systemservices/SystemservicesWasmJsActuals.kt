@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

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

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWdkSystemSystemservicesNapiAddon(): Boolean

private val windowsWdkSystemSystemservicesNapiAvailable: Boolean = initWindowsWdkSystemSystemservicesNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsAddLogContainer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsAddLogContainer(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsAddLogContainerSet(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsAddLogContainerSet(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsAdvanceLogBase(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsAdvanceLogBase(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsAlignReservedLog(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsAlignReservedLog(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsAllocReservedLog(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsAllocReservedLog(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsCloseAndResetLogFile(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsCloseAndResetLogFile(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsCloseLogFileObject(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsCloseLogFileObject(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsCreateLogFile(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsCreateLogFile(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: Int, p7: Int, p8: Int, p9: String, p10: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsCreateScanContext(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsCreateScanContext(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsDeleteLogByPointer(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsDeleteLogByPointer(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsDeleteLogFile(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsDeleteLogFile(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsDeleteMarshallingArea(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsDeleteMarshallingArea(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsFinalize()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsFinalize()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsFlushBuffers(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsFlushBuffers(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsFlushToLsn(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsFlushToLsn(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsFreeReservedLog(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsFreeReservedLog(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsGetContainerName(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsGetContainerName(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsGetIoStatistics(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsGetIoStatistics(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsGetLogFileInformation(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsGetLogFileInformation(p0: String, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsInitialize()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsInitialize(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsLsnBlockOffset(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsLsnBlockOffset(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsLsnContainer(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsLsnContainer(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsLsnDifference(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsLsnDifference(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsLsnEqual(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsLsnEqual(p0: String, p1: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsLsnGreater(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsLsnGreater(p0: String, p1: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsLsnInvalid(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsLsnInvalid(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsLsnLess(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsLsnLess(p0: String, p1: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsLsnNull(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsLsnNull(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsLsnRecordSequence(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsLsnRecordSequence(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsMgmtDeregisterManagedClient(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsMgmtDeregisterManagedClient(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsMgmtHandleLogFileFull(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsMgmtHandleLogFileFull(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsMgmtInstallPolicy(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsMgmtInstallPolicy(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsMgmtQueryPolicy(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsMgmtQueryPolicy(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsMgmtRegisterManagedClient(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsMgmtRegisterManagedClient(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsMgmtRemovePolicy(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsMgmtRemovePolicy(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsMgmtSetLogFileSize(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsMgmtSetLogFileSize(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsMgmtSetLogFileSizeAsClient(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsMgmtSetLogFileSizeAsClient(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsMgmtTailAdvanceFailure(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsMgmtTailAdvanceFailure(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsQueryLogFileInformation(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsQueryLogFileInformation(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsReadLogRecord(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsReadLogRecord(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsReadNextLogRecord(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsReadNextLogRecord(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsReadPreviousRestartArea(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsReadPreviousRestartArea(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsReadRestartArea(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsReadRestartArea(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsRemoveLogContainer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsRemoveLogContainer(p0: String, p1: String, p2: Boolean): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsRemoveLogContainerSet(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsRemoveLogContainerSet(p0: String, p1: Int, p2: String, p3: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsReserveAndAppendLog(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsReserveAndAppendLog(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String, p7: Int, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsReserveAndAppendLogAligned(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsReserveAndAppendLogAligned(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: Int, p7: String, p8: Int, p9: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsScanLogContainers(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsScanLogContainers(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsSetArchiveTail(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsSetArchiveTail(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsSetEndOfLog(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsSetEndOfLog(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsSetLogFileInformation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsSetLogFileInformation(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsTerminateReadLog(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsTerminateReadLog(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesClfsWriteRestartArea(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesClfsWriteRestartArea(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesCmCallbackGetKeyObjectID(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesCmCallbackGetKeyObjectID(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesCmCallbackGetKeyObjectIDEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesCmCallbackGetKeyObjectIDEx(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesCmCallbackReleaseKeyObjectIDEx(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesCmCallbackReleaseKeyObjectIDEx(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesCmGetBoundTransaction(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesCmGetBoundTransaction(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesCmGetCallbackVersion(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesCmGetCallbackVersion(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesCmRegisterCallback(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesCmRegisterCallback(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesCmRegisterCallbackEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesCmRegisterCallbackEx(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesCmSetCallbackObjectContext(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesCmSetCallbackObjectContext(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesCmUnRegisterCallback(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesCmUnRegisterCallback(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesDbgBreakPointWithStatus(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesDbgBreakPointWithStatus(p0: Int)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesDbgPrint(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesDbgPrint(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesDbgPrintEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesDbgPrintEx(p0: Int, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesDbgPrintReturnControlC(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesDbgPrintReturnControlC(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesDbgPrompt(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesDbgPrompt(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesDbgQueryDebugFilterState(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesDbgQueryDebugFilterState(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesDbgSetDebugFilterState(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesDbgSetDebugFilterState(p0: Int, p1: Int, p2: Boolean): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesDbgSetDebugPrintCallback(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesDbgSetDebugPrintCallback(p0: String, p1: Boolean): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesEtwActivityIdControl(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesEtwActivityIdControl(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesEtwEventEnabled(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesEtwEventEnabled(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesEtwProviderEnabled(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesEtwProviderEnabled(p0: String, p1: Int, p2: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesEtwRegister(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesEtwRegister(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesEtwSetInformation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesEtwSetInformation(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesEtwUnregister(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesEtwUnregister(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesEtwWrite(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesEtwWrite(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesEtwWriteEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesEtwWriteEx(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesEtwWriteString(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesEtwWriteString(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesEtwWriteTransfer(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesEtwWriteTransfer(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExAcquireFastMutex(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExAcquireFastMutex(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExAcquireFastMutexUnsafe(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExAcquireFastMutexUnsafe(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExAcquirePushLockExclusiveEx(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExAcquirePushLockExclusiveEx(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExAcquirePushLockSharedEx(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExAcquirePushLockSharedEx(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExAcquireResourceExclusiveLite(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExAcquireResourceExclusiveLite(p0: String, p1: Boolean): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExAcquireResourceSharedLite(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExAcquireResourceSharedLite(p0: String, p1: Boolean): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExAcquireRundownProtection(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExAcquireRundownProtection(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExAcquireRundownProtectionCacheAware(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExAcquireRundownProtectionCacheAware(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExAcquireRundownProtectionCacheAwareEx(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExAcquireRundownProtectionCacheAwareEx(p0: String, p1: Int): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExAcquireRundownProtectionEx(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExAcquireRundownProtectionEx(p0: String, p1: Int): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExAcquireSharedStarveExclusive(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExAcquireSharedStarveExclusive(p0: String, p1: Boolean): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExAcquireSharedWaitForExclusive(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExAcquireSharedWaitForExclusive(p0: String, p1: Boolean): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExAcquireSpinLockExclusive(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExAcquireSpinLockExclusive(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExAcquireSpinLockExclusiveAtDpcLevel(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExAcquireSpinLockExclusiveAtDpcLevel(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExAcquireSpinLockShared(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExAcquireSpinLockShared(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExAcquireSpinLockSharedAtDpcLevel(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExAcquireSpinLockSharedAtDpcLevel(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExAllocateCacheAwareRundownProtection(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExAllocateCacheAwareRundownProtection(p0: Int, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExAllocatePool(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExAllocatePool(p0: Int, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExAllocatePool2(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExAllocatePool2(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExAllocatePool3(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExAllocatePool3(p0: String, p1: String, p2: Int, p3: String, p4: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExAllocatePoolWithQuota(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExAllocatePoolWithQuota(p0: Int, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExAllocatePoolWithQuotaTag(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExAllocatePoolWithQuotaTag(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExAllocatePoolWithTag(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExAllocatePoolWithTag(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExAllocatePoolWithTagPriority(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExAllocatePoolWithTagPriority(p0: Int, p1: String, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExAllocateTimer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExAllocateTimer(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExCancelTimer(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExCancelTimer(p0: String, p1: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExCleanupRundownProtectionCacheAware(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExCleanupRundownProtectionCacheAware(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExConvertExclusiveToSharedLite(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExConvertExclusiveToSharedLite(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExCreateCallback(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExCreateCallback(p0: String, p1: String, p2: Boolean, p3: Boolean): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExCreatePool(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExCreatePool(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExDeleteResourceLite(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExDeleteResourceLite(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExDeleteTimer(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExDeleteTimer(p0: String, p1: Boolean, p2: Boolean, p3: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExDestroyPool(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExDestroyPool(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExEnterCriticalRegionAndAcquireResourceExclusive(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExEnterCriticalRegionAndAcquireResourceExclusive(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExEnterCriticalRegionAndAcquireResourceShared(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExEnterCriticalRegionAndAcquireResourceShared(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExEnterCriticalRegionAndAcquireSharedWaitForExclusive(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExEnterCriticalRegionAndAcquireSharedWaitForExclusive(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExEnumerateSystemFirmwareTables(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExEnumerateSystemFirmwareTables(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExExtendZone(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExExtendZone(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExFreeCacheAwareRundownProtection(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExFreeCacheAwareRundownProtection(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExFreePool(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExFreePool(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExFreePool2(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExFreePool2(p0: String, p1: Int, p2: String, p3: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExFreePoolWithTag(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExFreePoolWithTag(p0: String, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExGetExclusiveWaiterCount(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExGetExclusiveWaiterCount(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExGetFirmwareEnvironmentVariable(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExGetFirmwareEnvironmentVariable(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExGetFirmwareType()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExGetFirmwareType(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExGetPreviousMode()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExGetPreviousMode(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExGetSharedWaiterCount(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExGetSharedWaiterCount(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExGetSystemFirmwareTable(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExGetSystemFirmwareTable(p0: Int, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExInitializePushLock(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExInitializePushLock(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExInitializeResourceLite(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExInitializeResourceLite(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExInitializeRundownProtection(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExInitializeRundownProtection(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExInitializeRundownProtectionCacheAware(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExInitializeRundownProtectionCacheAware(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExInitializeRundownProtectionCacheAwareEx(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExInitializeRundownProtectionCacheAwareEx(p0: String, p1: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExInitializeZone(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExInitializeZone(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExInterlockedAddLargeInteger(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExInterlockedAddLargeInteger(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExInterlockedExtendZone(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExInterlockedExtendZone(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExIsManufacturingModeEnabled()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExIsManufacturingModeEnabled(): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExIsProcessorFeaturePresent(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExIsProcessorFeaturePresent(p0: Int): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExIsResourceAcquiredExclusiveLite(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExIsResourceAcquiredExclusiveLite(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExIsResourceAcquiredSharedLite(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExIsResourceAcquiredSharedLite(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExIsSoftBoot()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExIsSoftBoot(): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExLocalTimeToSystemTime(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExLocalTimeToSystemTime(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExNotifyCallback(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExNotifyCallback(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExQueryTimerResolution(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExQueryTimerResolution(p0: String, p1: String, p2: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExQueueWorkItem(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExQueueWorkItem(p0: String, p1: Int)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExRaiseAccessViolation()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExRaiseAccessViolation()

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExRaiseDatatypeMisalignment()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExRaiseDatatypeMisalignment()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExRaiseStatus(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExRaiseStatus(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExReInitializeRundownProtection(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExReInitializeRundownProtection(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExReInitializeRundownProtectionCacheAware(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExReInitializeRundownProtectionCacheAware(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExRegisterCallback(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExRegisterCallback(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExReinitializeResourceLite(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExReinitializeResourceLite(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExReleaseFastMutex(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExReleaseFastMutex(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExReleaseFastMutexUnsafe(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExReleaseFastMutexUnsafe(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExReleasePushLockExclusiveEx(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExReleasePushLockExclusiveEx(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExReleasePushLockSharedEx(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExReleasePushLockSharedEx(p0: String, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExReleaseResourceAndLeaveCriticalRegion(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExReleaseResourceAndLeaveCriticalRegion(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExReleaseResourceForThreadLite(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExReleaseResourceForThreadLite(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExReleaseResourceLite(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExReleaseResourceLite(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExReleaseRundownProtection(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExReleaseRundownProtection(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExReleaseRundownProtectionCacheAware(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExReleaseRundownProtectionCacheAware(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExReleaseRundownProtectionCacheAwareEx(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExReleaseRundownProtectionCacheAwareEx(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExReleaseRundownProtectionEx(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExReleaseRundownProtectionEx(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExReleaseSpinLockExclusive(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExReleaseSpinLockExclusive(p0: String, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExReleaseSpinLockExclusiveFromDpcLevel(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExReleaseSpinLockExclusiveFromDpcLevel(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExReleaseSpinLockShared(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExReleaseSpinLockShared(p0: String, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExReleaseSpinLockSharedFromDpcLevel(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExReleaseSpinLockSharedFromDpcLevel(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExRundownCompleted(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExRundownCompleted(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExRundownCompletedCacheAware(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExRundownCompletedCacheAware(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExSecurePoolUpdate(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExSecurePoolUpdate(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExSecurePoolValidate(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExSecurePoolValidate(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExSetFirmwareEnvironmentVariable(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExSetFirmwareEnvironmentVariable(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExSetResourceOwnerPointer(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExSetResourceOwnerPointer(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExSetResourceOwnerPointerEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExSetResourceOwnerPointerEx(p0: String, p1: String, p2: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExSetTimer(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExSetTimer(p0: String, p1: String, p2: String, p3: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExSetTimerResolution(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExSetTimerResolution(p0: Int, p1: Boolean): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExSizeOfRundownProtectionCacheAware()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExSizeOfRundownProtectionCacheAware(): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExSystemTimeToLocalTime(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExSystemTimeToLocalTime(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExTryAcquireSpinLockExclusiveAtDpcLevel(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExTryAcquireSpinLockExclusiveAtDpcLevel(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExTryAcquireSpinLockSharedAtDpcLevel(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExTryAcquireSpinLockSharedAtDpcLevel(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExTryConvertSharedSpinLockExclusive(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExTryConvertSharedSpinLockExclusive(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExTryToAcquireFastMutex(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExTryToAcquireFastMutex(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExUnregisterCallback(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExUnregisterCallback(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExUuidCreate(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExUuidCreate(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExVerifySuite(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExVerifySuite(p0: Int): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExWaitForRundownProtectionRelease(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExWaitForRundownProtectionRelease(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesExWaitForRundownProtectionReleaseCacheAware(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesExWaitForRundownProtectionReleaseCacheAware(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesFsRtlIsTotalDeviceFailure(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesFsRtlIsTotalDeviceFailure(p0: Int): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesHalAcquireDisplayOwnership(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesHalAcquireDisplayOwnership(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesHalAllocateCommonBuffer(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesHalAllocateCommonBuffer(p0: String, p1: Int, p2: String, p3: Boolean): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesHalAllocateCrashDumpRegisters(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesHalAllocateCrashDumpRegisters(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesHalAllocateHardwareCounters(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesHalAllocateHardwareCounters(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesHalAssignSlotResources(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesHalAssignSlotResources(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: Int, p7: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesHalBugCheckSystem(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesHalBugCheckSystem(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesHalDmaAllocateCrashDumpRegistersEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesHalDmaAllocateCrashDumpRegistersEx(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesHalDmaFreeCrashDumpRegistersEx(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesHalDmaFreeCrashDumpRegistersEx(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesHalExamineMBR(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesHalExamineMBR(p0: String, p1: Int, p2: Int, p3: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesHalFreeCommonBuffer(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesHalFreeCommonBuffer(p0: String, p1: Int, p2: String, p3: String, p4: Boolean)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesHalFreeHardwareCounters(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesHalFreeHardwareCounters(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesHalGetAdapter(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesHalGetAdapter(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesHalGetBusData(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesHalGetBusData(p0: Int, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesHalGetBusDataByOffset(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesHalGetBusDataByOffset(p0: Int, p1: Int, p2: Int, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesHalGetInterruptVector(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesHalGetInterruptVector(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesHalMakeBeep(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesHalMakeBeep(p0: Int): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesHalReadDmaCounter(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesHalReadDmaCounter(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesHalSetBusData(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesHalSetBusData(p0: Int, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesHalSetBusDataByOffset(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesHalSetBusDataByOffset(p0: Int, p1: Int, p2: Int, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesHalTranslateBusAddress(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesHalTranslateBusAddress(p0: Int, p1: Int, p2: String, p3: String, p4: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesHvlRegisterWheaErrorNotification(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesHvlRegisterWheaErrorNotification(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesHvlUnregisterWheaErrorNotification(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesHvlUnregisterWheaErrorNotification(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoAcquireCancelSpinLock(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoAcquireCancelSpinLock(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoAcquireKsrPersistentMemory(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoAcquireKsrPersistentMemory(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoAcquireKsrPersistentMemoryEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoAcquireKsrPersistentMemoryEx(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoAcquireRemoveLockEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoAcquireRemoveLockEx(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoAllocateDriverObjectExtension(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoAllocateDriverObjectExtension(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoAllocateErrorLogEntry(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoAllocateErrorLogEntry(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoAllocateIrp(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoAllocateIrp(p0: Int, p1: Boolean): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoAllocateIrpEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoAllocateIrpEx(p0: String, p1: Int, p2: Boolean): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoAllocateMdl(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoAllocateMdl(p0: String, p1: Int, p2: Boolean, p3: Boolean, p4: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoAllocateSfioStreamIdentifier(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoAllocateSfioStreamIdentifier(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoAllocateWorkItem(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoAllocateWorkItem(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoAssignResources(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoAssignResources(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoAttachDevice(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoAttachDevice(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoAttachDeviceByPointer(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoAttachDeviceByPointer(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoAttachDeviceToDeviceStack(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoAttachDeviceToDeviceStack(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoAttachDeviceToDeviceStackSafe(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoAttachDeviceToDeviceStackSafe(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoBuildAsynchronousFsdRequest(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoBuildAsynchronousFsdRequest(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoBuildDeviceIoControlRequest(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoBuildDeviceIoControlRequest(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: Boolean, p7: String, p8: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoBuildPartialMdl(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoBuildPartialMdl(p0: String, p1: String, p2: String, p3: Int)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoBuildSynchronousFsdRequest(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoBuildSynchronousFsdRequest(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoCancelFileOpen(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoCancelFileOpen(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoCancelIrp(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoCancelIrp(p0: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoCheckLinkShareAccess(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoCheckLinkShareAccess(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoCheckShareAccess(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoCheckShareAccess(p0: Int, p1: Int, p2: String, p3: String, p4: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoCheckShareAccessEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoCheckShareAccessEx(p0: Int, p1: Int, p2: String, p3: String, p4: Boolean, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoCleanupIrp(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoCleanupIrp(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoClearActivityIdThread(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoClearActivityIdThread(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoClearIrpExtraCreateParameter(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoClearIrpExtraCreateParameter(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoConnectInterrupt(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoConnectInterrupt(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: Int, p7: Int, p8: Boolean, p9: String, p10: Boolean): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoConnectInterruptEx(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoConnectInterruptEx(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoCreateController(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoCreateController(p0: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoCreateDevice(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoCreateDevice(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: Boolean, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoCreateDisk(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoCreateDisk(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoCreateFile(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoCreateFile(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: Int, p7: Int, p8: Int, p9: String, p10: Int, p11: Int, p12: String, p13: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoCreateFileEx(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoCreateFileEx(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: Int, p7: Int, p8: Int, p9: String, p10: Int, p11: Int, p12: String, p13: Int, p14: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoCreateFileSpecifyDeviceObjectHint(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoCreateFileSpecifyDeviceObjectHint(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: Int, p7: Int, p8: Int, p9: String, p10: Int, p11: Int, p12: String, p13: Int, p14: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoCreateNotificationEvent(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoCreateNotificationEvent(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoCreateSymbolicLink(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoCreateSymbolicLink(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoCreateSynchronizationEvent(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoCreateSynchronizationEvent(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoCreateSystemThread(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoCreateSystemThread(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoCreateUnprotectedSymbolicLink(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoCreateUnprotectedSymbolicLink(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoCsqInitialize(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoCsqInitialize(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoCsqInitializeEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoCsqInitializeEx(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoCsqInsertIrp(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoCsqInsertIrp(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoCsqInsertIrpEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoCsqInsertIrpEx(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoCsqRemoveIrp(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoCsqRemoveIrp(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoCsqRemoveNextIrp(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoCsqRemoveNextIrp(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoDecrementKeepAliveCount(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoDecrementKeepAliveCount(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoDeleteController(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoDeleteController(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoDeleteDevice(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoDeleteDevice(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoDeleteSymbolicLink(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoDeleteSymbolicLink(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoDetachDevice(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoDetachDevice(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoDisconnectInterrupt(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoDisconnectInterrupt(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoDisconnectInterruptEx(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoDisconnectInterruptEx(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoEnumerateKsrPersistentMemoryEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoEnumerateKsrPersistentMemoryEx(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoFlushAdapterBuffers(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoFlushAdapterBuffers(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Boolean): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoForwardIrpSynchronously(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoForwardIrpSynchronously(p0: String, p1: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoFreeAdapterChannel(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoFreeAdapterChannel(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoFreeController(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoFreeController(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoFreeErrorLogEntry(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoFreeErrorLogEntry(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoFreeIrp(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoFreeIrp(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoFreeKsrPersistentMemory(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoFreeKsrPersistentMemory(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoFreeMapRegisters(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoFreeMapRegisters(p0: String, p1: String, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoFreeMdl(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoFreeMdl(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoFreeSfioStreamIdentifier(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoFreeSfioStreamIdentifier(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoFreeWorkItem(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoFreeWorkItem(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoGetActivityIdIrp(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoGetActivityIdIrp(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoGetActivityIdThread()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoGetActivityIdThread(): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoGetAffinityInterrupt(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoGetAffinityInterrupt(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoGetAttachedDeviceReference(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoGetAttachedDeviceReference(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoGetBootDiskInformation(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoGetBootDiskInformation(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoGetBootDiskInformationLite(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoGetBootDiskInformationLite(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoGetConfigurationInformation()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoGetConfigurationInformation(): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoGetContainerInformation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoGetContainerInformation(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoGetCurrentProcess()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoGetCurrentProcess(): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoGetDeviceDirectory(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoGetDeviceDirectory(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoGetDeviceInterfaceAlias(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoGetDeviceInterfaceAlias(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoGetDeviceInterfacePropertyData(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoGetDeviceInterfacePropertyData(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoGetDeviceInterfaces(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoGetDeviceInterfaces(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoGetDeviceNumaNode(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoGetDeviceNumaNode(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoGetDeviceObjectPointer(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoGetDeviceObjectPointer(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoGetDeviceProperty(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoGetDeviceProperty(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoGetDevicePropertyData(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoGetDevicePropertyData(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoGetDmaAdapter(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoGetDmaAdapter(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoGetDriverDirectory(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoGetDriverDirectory(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoGetDriverObjectExtension(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoGetDriverObjectExtension(p0: String, p1: String): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoGetFileObjectGenericMapping()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoGetFileObjectGenericMapping(): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoGetFsZeroingOffset(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoGetFsZeroingOffset(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoGetInitialStack()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoGetInitialStack(): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoGetInitiatorProcess(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoGetInitiatorProcess(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoGetIoAttributionHandle(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoGetIoAttributionHandle(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoGetIoPriorityHint(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoGetIoPriorityHint(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoGetIommuInterface(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoGetIommuInterface(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoGetIommuInterfaceEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoGetIommuInterfaceEx(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoGetIrpExtraCreateParameter(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoGetIrpExtraCreateParameter(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoGetPagingIoPriority(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoGetPagingIoPriority(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoGetRelatedDeviceObject(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoGetRelatedDeviceObject(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoGetSfioStreamIdentifier(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoGetSfioStreamIdentifier(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoGetSilo(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoGetSilo(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoGetSiloParameters(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoGetSiloParameters(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoGetStackLimits(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoGetStackLimits(p0: String, p1: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoGetTopLevelIrp()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoGetTopLevelIrp(): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoGetTransactionParameterBlock(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoGetTransactionParameterBlock(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoIncrementKeepAliveCount(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoIncrementKeepAliveCount(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoInitializeIrp(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoInitializeIrp(p0: String, p1: Int, p2: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoInitializeIrpEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoInitializeIrpEx(p0: String, p1: String, p2: Int, p3: Int)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoInitializeRemoveLockEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoInitializeRemoveLockEx(p0: String, p1: Int, p2: Int, p3: Int, p4: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoInitializeTimer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoInitializeTimer(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoInitializeWorkItem(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoInitializeWorkItem(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoInvalidateDeviceRelations(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoInvalidateDeviceRelations(p0: String, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoInvalidateDeviceState(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoInvalidateDeviceState(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoIs32bitProcess(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoIs32bitProcess(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoIsFileObjectIgnoringSharing(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoIsFileObjectIgnoringSharing(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoIsFileOriginRemote(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoIsFileOriginRemote(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoIsInitiator32bitProcess(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoIsInitiator32bitProcess(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoIsValidIrpStatus(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoIsValidIrpStatus(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoIsWdmVersionAvailable(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoIsWdmVersionAvailable(p0: Int, p1: Int): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoMakeAssociatedIrp(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoMakeAssociatedIrp(p0: String, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoMakeAssociatedIrpEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoMakeAssociatedIrpEx(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoMapTransfer(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoMapTransfer(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Boolean): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoOpenDeviceInterfaceRegistryKey(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoOpenDeviceInterfaceRegistryKey(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoOpenDeviceRegistryKey(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoOpenDeviceRegistryKey(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoOpenDriverRegistryKey(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoOpenDriverRegistryKey(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoPropagateActivityIdToThread(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoPropagateActivityIdToThread(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoQueryDeviceDescription(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoQueryDeviceDescription(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoQueryFullDriverPath(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoQueryFullDriverPath(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoQueryInformationByName(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoQueryInformationByName(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoQueryKsrPersistentMemorySize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoQueryKsrPersistentMemorySize(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoQueryKsrPersistentMemorySizeEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoQueryKsrPersistentMemorySizeEx(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoQueueWorkItem(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoQueueWorkItem(p0: String, p1: String, p2: Int, p3: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoQueueWorkItemEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoQueueWorkItemEx(p0: String, p1: String, p2: Int, p3: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoRaiseHardError(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoRaiseHardError(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoRaiseInformationalHardError(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoRaiseInformationalHardError(p0: Int, p1: String, p2: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoReadDiskSignature(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoReadDiskSignature(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoReadPartitionTable(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoReadPartitionTable(p0: String, p1: Int, p2: Boolean, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoReadPartitionTableEx(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoReadPartitionTableEx(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoRecordIoAttribution(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoRecordIoAttribution(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoRegisterBootDriverCallback(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoRegisterBootDriverCallback(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoRegisterContainerNotification(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoRegisterContainerNotification(p0: Int, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoRegisterDeviceInterface(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoRegisterDeviceInterface(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoRegisterLastChanceShutdownNotification(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoRegisterLastChanceShutdownNotification(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoRegisterPlugPlayNotification(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoRegisterPlugPlayNotification(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoRegisterShutdownNotification(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoRegisterShutdownNotification(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoReleaseCancelSpinLock(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoReleaseCancelSpinLock(p0: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoReleaseRemoveLockAndWaitEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoReleaseRemoveLockAndWaitEx(p0: String, p1: String, p2: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoReleaseRemoveLockEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoReleaseRemoveLockEx(p0: String, p1: String, p2: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoRemoveLinkShareAccess(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoRemoveLinkShareAccess(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoRemoveLinkShareAccessEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoRemoveLinkShareAccessEx(p0: String, p1: String, p2: String, p3: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoRemoveShareAccess(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoRemoveShareAccess(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoReplacePartitionUnit(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoReplacePartitionUnit(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoReportDetectedDevice(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoReportDetectedDevice(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: Boolean, p7: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoReportInterruptActive(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoReportInterruptActive(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoReportInterruptInactive(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoReportInterruptInactive(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoReportResourceForDetection(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoReportResourceForDetection(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoReportResourceUsage(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoReportResourceUsage(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: Int, p7: Boolean, p8: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoReportRootDevice(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoReportRootDevice(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoReportTargetDeviceChange(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoReportTargetDeviceChange(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoReportTargetDeviceChangeAsynchronous(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoReportTargetDeviceChangeAsynchronous(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoRequestDeviceEject(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoRequestDeviceEject(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoRequestDeviceEjectEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoRequestDeviceEjectEx(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoReserveKsrPersistentMemory(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoReserveKsrPersistentMemory(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoReserveKsrPersistentMemoryEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoReserveKsrPersistentMemoryEx(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoReuseIrp(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoReuseIrp(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoSetActivityIdIrp(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoSetActivityIdIrp(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoSetActivityIdThread(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoSetActivityIdThread(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoSetCompletionRoutineEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoSetCompletionRoutineEx(p0: String, p1: String, p2: String, p3: String, p4: Boolean, p5: Boolean, p6: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoSetDeviceInterfacePropertyData(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoSetDeviceInterfacePropertyData(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoSetDeviceInterfaceState(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoSetDeviceInterfaceState(p0: String, p1: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoSetDevicePropertyData(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoSetDevicePropertyData(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoSetFileObjectIgnoreSharing(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoSetFileObjectIgnoreSharing(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoSetFileOrigin(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoSetFileOrigin(p0: String, p1: Boolean): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoSetFsZeroingOffset(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoSetFsZeroingOffset(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoSetFsZeroingOffsetRequired(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoSetFsZeroingOffsetRequired(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoSetHardErrorOrVerifyDevice(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoSetHardErrorOrVerifyDevice(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoSetIoAttributionIrp(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoSetIoAttributionIrp(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoSetIoPriorityHint(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoSetIoPriorityHint(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoSetIrpExtraCreateParameter(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoSetIrpExtraCreateParameter(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoSetLinkShareAccess(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoSetLinkShareAccess(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoSetMasterIrpStatus(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoSetMasterIrpStatus(p0: String, p1: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoSetPartitionInformation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoSetPartitionInformation(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoSetPartitionInformationEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoSetPartitionInformationEx(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoSetShareAccess(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoSetShareAccess(p0: Int, p1: Int, p2: String, p3: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoSetShareAccessEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoSetShareAccessEx(p0: Int, p1: Int, p2: String, p3: String, p4: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoSetStartIoAttributes(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoSetStartIoAttributes(p0: String, p1: Boolean, p2: Boolean)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoSetSystemPartition(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoSetSystemPartition(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoSetThreadHardErrorMode(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoSetThreadHardErrorMode(p0: Boolean): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoSetTopLevelIrp(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoSetTopLevelIrp(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoSizeOfIrpEx(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoSizeOfIrpEx(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoSizeofWorkItem()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoSizeofWorkItem(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoStartNextPacket(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoStartNextPacket(p0: String, p1: Boolean)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoStartNextPacketByKey(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoStartNextPacketByKey(p0: String, p1: Boolean, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoStartTimer(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoStartTimer(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoStopTimer(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoStopTimer(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoSynchronousCallDriver(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoSynchronousCallDriver(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoTransferActivityId(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoTransferActivityId(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoTranslateBusAddress(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoTranslateBusAddress(p0: Int, p1: Int, p2: String, p3: String, p4: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoTryQueueWorkItem(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoTryQueueWorkItem(p0: String, p1: String, p2: Int, p3: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoUninitializeWorkItem(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoUninitializeWorkItem(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoUnregisterBootDriverCallback(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoUnregisterBootDriverCallback(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoUnregisterContainerNotification(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoUnregisterContainerNotification(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoUnregisterPlugPlayNotification(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoUnregisterPlugPlayNotification(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoUnregisterPlugPlayNotificationEx(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoUnregisterPlugPlayNotificationEx(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoUnregisterShutdownNotification(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoUnregisterShutdownNotification(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoUpdateLinkShareAccess(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoUpdateLinkShareAccess(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoUpdateLinkShareAccessEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoUpdateLinkShareAccessEx(p0: String, p1: String, p2: String, p3: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoUpdateShareAccess(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoUpdateShareAccess(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoValidateDeviceIoControlAccess(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoValidateDeviceIoControlAccess(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoVerifyPartitionTable(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoVerifyPartitionTable(p0: String, p1: Boolean): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoVolumeDeviceNameToGuid(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoVolumeDeviceNameToGuid(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoVolumeDeviceNameToGuidPath(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoVolumeDeviceNameToGuidPath(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoVolumeDeviceToDosName(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoVolumeDeviceToDosName(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoVolumeDeviceToGuid(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoVolumeDeviceToGuid(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoVolumeDeviceToGuidPath(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoVolumeDeviceToGuidPath(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoWMIAllocateInstanceIds(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoWMIAllocateInstanceIds(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoWMIDeviceObjectToInstanceName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoWMIDeviceObjectToInstanceName(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoWMIExecuteMethod(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoWMIExecuteMethod(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoWMIHandleToInstanceName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoWMIHandleToInstanceName(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoWMIOpenBlock(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoWMIOpenBlock(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoWMIQueryAllData(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoWMIQueryAllData(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoWMIQueryAllDataMultiple(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoWMIQueryAllDataMultiple(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoWMIQuerySingleInstance(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoWMIQuerySingleInstance(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoWMIQuerySingleInstanceMultiple(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoWMIQuerySingleInstanceMultiple(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoWMIRegistrationControl(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoWMIRegistrationControl(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoWMISetNotificationCallback(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoWMISetNotificationCallback(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoWMISetSingleInstance(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoWMISetSingleInstance(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoWMISetSingleItem(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoWMISetSingleItem(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoWMISuggestInstanceName(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoWMISuggestInstanceName(p0: String, p1: String, p2: Boolean, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoWMIWriteEvent(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoWMIWriteEvent(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoWithinStackLimits(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoWithinStackLimits(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoWriteErrorLogEntry(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoWriteErrorLogEntry(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoWriteKsrPersistentMemory(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoWriteKsrPersistentMemory(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoWritePartitionTable(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoWritePartitionTable(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIoWritePartitionTableEx(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIoWritePartitionTableEx(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIofCallDriver(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIofCallDriver(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesIofCompleteRequest(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesIofCompleteRequest(p0: String, p1: Int)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKdChangeOption(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKdChangeOption(p0: Int, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKdDisableDebugger()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKdDisableDebugger(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKdEnableDebugger()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKdEnableDebugger(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKdRefreshDebuggerNotPresent()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKdRefreshDebuggerNotPresent(): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeAcquireGuardedMutex(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeAcquireGuardedMutex(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeAcquireGuardedMutexUnsafe(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeAcquireGuardedMutexUnsafe(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeAcquireInStackQueuedSpinLock(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeAcquireInStackQueuedSpinLock(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeAcquireInStackQueuedSpinLockAtDpcLevel(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeAcquireInStackQueuedSpinLockAtDpcLevel(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeAcquireInStackQueuedSpinLockForDpc(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeAcquireInStackQueuedSpinLockForDpc(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeAcquireInterruptSpinLock(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeAcquireInterruptSpinLock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeAcquireSpinLockForDpc(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeAcquireSpinLockForDpc(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeAddTriageDumpDataBlock(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeAddTriageDumpDataBlock(p0: String, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeAreAllApcsDisabled()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeAreAllApcsDisabled(): Boolean

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeAreApcsDisabled()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeAreApcsDisabled(): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeBugCheck(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeBugCheck(p0: Int)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeBugCheckEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeBugCheckEx(p0: Int, p1: String, p2: String, p3: String, p4: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeCancelTimer(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeCancelTimer(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeClearEvent(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeClearEvent(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeConvertAuxiliaryCounterToPerformanceCounter(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeConvertAuxiliaryCounterToPerformanceCounter(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeConvertPerformanceCounterToAuxiliaryCounter(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeConvertPerformanceCounterToAuxiliaryCounter(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeDelayExecutionThread(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeDelayExecutionThread(p0: Int, p1: Boolean, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeDeregisterBoundCallback(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeDeregisterBoundCallback(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeDeregisterBugCheckCallback(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeDeregisterBugCheckCallback(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeDeregisterBugCheckReasonCallback(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeDeregisterBugCheckReasonCallback(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeDeregisterNmiCallback(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeDeregisterNmiCallback(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeDeregisterProcessorChangeCallback(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeDeregisterProcessorChangeCallback(p0: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeEnterCriticalRegion()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeEnterCriticalRegion()

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeEnterGuardedRegion()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeEnterGuardedRegion()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeExpandKernelStackAndCallout(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeExpandKernelStackAndCallout(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeExpandKernelStackAndCalloutEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeExpandKernelStackAndCalloutEx(p0: String, p1: String, p2: String, p3: Boolean, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeFlushIoBuffers(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeFlushIoBuffers(p0: String, p1: Boolean, p2: Boolean)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeFlushQueuedDpcs()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeFlushQueuedDpcs()

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeFlushWriteBuffer()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeFlushWriteBuffer()

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeGetCurrentIrql()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeGetCurrentIrql(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeGetCurrentNodeNumber()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeGetCurrentNodeNumber(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeGetCurrentProcessorNumberEx(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeGetCurrentProcessorNumberEx(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeGetProcessorIndexFromNumber(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeGetProcessorIndexFromNumber(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeGetProcessorNumberFromIndex(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeGetProcessorNumberFromIndex(p0: Int, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeGetRecommendedSharedDataAlignment()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeGetRecommendedSharedDataAlignment(): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeInitializeCrashDumpHeader(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeInitializeCrashDumpHeader(p0: Int, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeInitializeDeviceQueue(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeInitializeDeviceQueue(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeInitializeDpc(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeInitializeDpc(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeInitializeEvent(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeInitializeEvent(p0: String, p1: Int, p2: Boolean)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeInitializeGuardedMutex(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeInitializeGuardedMutex(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeInitializeMutex(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeInitializeMutex(p0: String, p1: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeInitializeSemaphore(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeInitializeSemaphore(p0: String, p1: Int, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeInitializeSpinLock(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeInitializeSpinLock(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeInitializeThreadedDpc(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeInitializeThreadedDpc(p0: String, p1: String, p2: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeInitializeTimer(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeInitializeTimer(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeInitializeTimerEx(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeInitializeTimerEx(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeInitializeTriageDumpDataArray(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeInitializeTriageDumpDataArray(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeInsertByKeyDeviceQueue(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeInsertByKeyDeviceQueue(p0: String, p1: String, p2: Int): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeInsertDeviceQueue(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeInsertDeviceQueue(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeInsertQueueDpc(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeInsertQueueDpc(p0: String, p1: String, p2: String): Boolean

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeInvalidateAllCaches()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeInvalidateAllCaches(): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeInvalidateRangeAllCaches(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeInvalidateRangeAllCaches(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeIpiGenericCall(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeIpiGenericCall(p0: String, p1: String): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeIsExecutingDpc()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeIsExecutingDpc(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeLeaveCriticalRegion()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeLeaveCriticalRegion()

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeLeaveGuardedRegion()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeLeaveGuardedRegion()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKePulseEvent(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKePulseEvent(p0: String, p1: Int, p2: Boolean): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeQueryActiveGroupCount()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeQueryActiveGroupCount(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeQueryActiveProcessorCount(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeQueryActiveProcessorCount(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeQueryActiveProcessorCountEx(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeQueryActiveProcessorCountEx(p0: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeQueryActiveProcessors()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeQueryActiveProcessors(): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeQueryAuxiliaryCounterFrequency(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeQueryAuxiliaryCounterFrequency(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeQueryDpcWatchdogInformation(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeQueryDpcWatchdogInformation(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeQueryGroupAffinity(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeQueryGroupAffinity(p0: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeQueryHardwareCounterConfiguration(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeQueryHardwareCounterConfiguration(p0: String, p1: Int, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeQueryHighestNodeNumber()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeQueryHighestNodeNumber(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeQueryInterruptTimePrecise(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeQueryInterruptTimePrecise(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeQueryLogicalProcessorRelationship(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeQueryLogicalProcessorRelationship(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeQueryMaximumGroupCount()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeQueryMaximumGroupCount(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeQueryMaximumProcessorCount()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeQueryMaximumProcessorCount(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeQueryMaximumProcessorCountEx(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeQueryMaximumProcessorCountEx(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeQueryNodeActiveAffinity(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeQueryNodeActiveAffinity(p0: Int, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeQueryNodeActiveAffinity2(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeQueryNodeActiveAffinity2(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeQueryNodeActiveProcessorCount(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeQueryNodeActiveProcessorCount(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeQueryNodeMaximumProcessorCount(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeQueryNodeMaximumProcessorCount(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeQueryPerformanceCounter(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeQueryPerformanceCounter(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeQueryPriorityThread(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeQueryPriorityThread(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeQueryRuntimeThread(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeQueryRuntimeThread(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeQuerySystemTimePrecise(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeQuerySystemTimePrecise(p0: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeQueryTimeIncrement()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeQueryTimeIncrement(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeQueryTotalCycleTimeThread(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeQueryTotalCycleTimeThread(p0: String, p1: String): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeQueryUnbiasedInterruptTime()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeQueryUnbiasedInterruptTime(): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeQueryUnbiasedInterruptTimePrecise(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeQueryUnbiasedInterruptTimePrecise(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeReadStateEvent(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeReadStateEvent(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeReadStateMutex(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeReadStateMutex(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeReadStateSemaphore(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeReadStateSemaphore(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeReadStateTimer(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeReadStateTimer(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeRegisterBoundCallback(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeRegisterBoundCallback(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeRegisterBugCheckCallback(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeRegisterBugCheckCallback(p0: String, p1: String, p2: String, p3: Int, p4: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeRegisterBugCheckReasonCallback(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeRegisterBugCheckReasonCallback(p0: String, p1: String, p2: Int, p3: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeRegisterNmiCallback(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeRegisterNmiCallback(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeRegisterProcessorChangeCallback(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeRegisterProcessorChangeCallback(p0: String, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeReleaseGuardedMutex(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeReleaseGuardedMutex(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeReleaseGuardedMutexUnsafe(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeReleaseGuardedMutexUnsafe(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeReleaseInStackQueuedSpinLock(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeReleaseInStackQueuedSpinLock(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeReleaseInStackQueuedSpinLockForDpc(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeReleaseInStackQueuedSpinLockForDpc(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeReleaseInStackQueuedSpinLockFromDpcLevel(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeReleaseInStackQueuedSpinLockFromDpcLevel(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeReleaseInterruptSpinLock(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeReleaseInterruptSpinLock(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeReleaseMutex(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeReleaseMutex(p0: String, p1: Boolean): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeReleaseSemaphore(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeReleaseSemaphore(p0: String, p1: Int, p2: Int, p3: Boolean): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeReleaseSpinLockForDpc(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeReleaseSpinLockForDpc(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeRemoveByKeyDeviceQueue(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeRemoveByKeyDeviceQueue(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeRemoveByKeyDeviceQueueIfBusy(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeRemoveByKeyDeviceQueueIfBusy(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeRemoveDeviceQueue(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeRemoveDeviceQueue(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeRemoveEntryDeviceQueue(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeRemoveEntryDeviceQueue(p0: String, p1: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeRemoveQueueDpc(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeRemoveQueueDpc(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeRemoveQueueDpcEx(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeRemoveQueueDpcEx(p0: String, p1: Boolean): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeResetEvent(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeResetEvent(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeRestoreExtendedProcessorState(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeRestoreExtendedProcessorState(p0: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeRevertToUserAffinityThread()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeRevertToUserAffinityThread()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeRevertToUserAffinityThreadEx(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeRevertToUserAffinityThreadEx(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeRevertToUserGroupAffinityThread(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeRevertToUserGroupAffinityThread(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeSaveExtendedProcessorState(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeSaveExtendedProcessorState(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeSetBasePriorityThread(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeSetBasePriorityThread(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeSetCoalescableTimer(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeSetCoalescableTimer(p0: String, p1: String, p2: Int, p3: Int, p4: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeSetEvent(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeSetEvent(p0: String, p1: Int, p2: Boolean): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeSetHardwareCounterConfiguration(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeSetHardwareCounterConfiguration(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeSetImportanceDpc(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeSetImportanceDpc(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeSetPriorityThread(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeSetPriorityThread(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeSetSystemAffinityThread(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeSetSystemAffinityThread(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeSetSystemAffinityThreadEx(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeSetSystemAffinityThreadEx(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeSetSystemGroupAffinityThread(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeSetSystemGroupAffinityThread(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeSetTargetProcessorDpc(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeSetTargetProcessorDpc(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeSetTargetProcessorDpcEx(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeSetTargetProcessorDpcEx(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeSetTimer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeSetTimer(p0: String, p1: String, p2: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeSetTimerEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeSetTimerEx(p0: String, p1: String, p2: Int, p3: String): Boolean

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeShouldYieldProcessor()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeShouldYieldProcessor(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeStallExecutionProcessor(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeStallExecutionProcessor(p0: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeSynchronizeExecution(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeSynchronizeExecution(p0: String, p1: String, p2: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeTestSpinLock(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeTestSpinLock(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeTryToAcquireGuardedMutex(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeTryToAcquireGuardedMutex(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeTryToAcquireSpinLockAtDpcLevel(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeTryToAcquireSpinLockAtDpcLevel(p0: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeWaitForMultipleObjects(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeWaitForMultipleObjects(p0: Int, p1: String, p2: Int, p3: Int, p4: Int, p5: Boolean, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKeWaitForSingleObject(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKeWaitForSingleObject(p0: String, p1: Int, p2: Int, p3: Boolean, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesKfRaiseIrql(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesKfRaiseIrql(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmAddPhysicalMemory(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmAddPhysicalMemory(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmAddVerifierSpecialThunks(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmAddVerifierSpecialThunks(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmAddVerifierThunks(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmAddVerifierThunks(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmAdvanceMdl(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmAdvanceMdl(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmAllocateContiguousMemory(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmAllocateContiguousMemory(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmAllocateContiguousMemoryEx(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmAllocateContiguousMemoryEx(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: String, p7: Int, p8: Int, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmAllocateContiguousMemorySpecifyCache(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmAllocateContiguousMemorySpecifyCache(p0: String, p1: String, p2: String, p3: String, p4: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmAllocateContiguousMemorySpecifyCacheNode(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmAllocateContiguousMemorySpecifyCacheNode(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmAllocateContiguousNodeMemory(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmAllocateContiguousNodeMemory(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmAllocateMappingAddress(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmAllocateMappingAddress(p0: String, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmAllocateMappingAddressEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmAllocateMappingAddressEx(p0: String, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmAllocateMdlForIoSpace(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmAllocateMdlForIoSpace(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmAllocateNodePagesForMdlEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmAllocateNodePagesForMdlEx(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmAllocateNonCachedMemory(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmAllocateNonCachedMemory(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmAllocatePagesForMdl(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmAllocatePagesForMdl(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmAllocatePagesForMdlEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmAllocatePagesForMdlEx(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmAllocatePartitionNodePagesForMdlEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmAllocatePartitionNodePagesForMdlEx(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: Int, p7: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmAreMdlPagesCached(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmAreMdlPagesCached(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmBuildMdlForNonPagedPool(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmBuildMdlForNonPagedPool(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmCreateMdl(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmCreateMdl(p0: String, p1: String, p2: String): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmCreateMirror()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmCreateMirror(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmFreeContiguousMemory(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmFreeContiguousMemory(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmFreeContiguousMemorySpecifyCache(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmFreeContiguousMemorySpecifyCache(p0: String, p1: String, p2: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmFreeMappingAddress(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmFreeMappingAddress(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmFreeNonCachedMemory(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmFreeNonCachedMemory(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmFreePagesFromMdl(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmFreePagesFromMdl(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmFreePagesFromMdlEx(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmFreePagesFromMdlEx(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmGetCacheAttribute(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmGetCacheAttribute(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmGetCacheAttributeEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmGetCacheAttributeEx(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmGetPhysicalAddress(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmGetPhysicalAddress(p0: String): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmGetPhysicalMemoryRanges()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmGetPhysicalMemoryRanges(): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmGetPhysicalMemoryRangesEx(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmGetPhysicalMemoryRangesEx(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmGetPhysicalMemoryRangesEx2(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmGetPhysicalMemoryRangesEx2(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmGetSystemRoutineAddress(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmGetSystemRoutineAddress(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmGetVirtualForPhysical(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmGetVirtualForPhysical(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmIsAddressValid(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmIsAddressValid(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmIsDriverSuspectForVerifier(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmIsDriverSuspectForVerifier(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmIsDriverVerifying(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmIsDriverVerifying(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmIsDriverVerifyingByAddress(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmIsDriverVerifyingByAddress(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmIsIoSpaceActive(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmIsIoSpaceActive(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmIsNonPagedSystemAddressValid(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmIsNonPagedSystemAddressValid(p0: String): Boolean

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmIsThisAnNtAsSystem()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmIsThisAnNtAsSystem(): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmIsVerifierEnabled(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmIsVerifierEnabled(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmLockPagableDataSection(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmLockPagableDataSection(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmLockPagableSectionByHandle(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmLockPagableSectionByHandle(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmMapIoSpace(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmMapIoSpace(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmMapIoSpaceEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmMapIoSpaceEx(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmMapLockedPages(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmMapLockedPages(p0: String, p1: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmMapLockedPagesSpecifyCache(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmMapLockedPagesSpecifyCache(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmMapLockedPagesWithReservedMapping(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmMapLockedPagesWithReservedMapping(p0: String, p1: Int, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmMapMdl(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmMapMdl(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmMapMemoryDumpMdlEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmMapMemoryDumpMdlEx(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmMapUserAddressesToPage(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmMapUserAddressesToPage(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmMapVideoDisplay(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmMapVideoDisplay(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmMapViewInSessionSpace(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmMapViewInSessionSpace(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmMapViewInSessionSpaceEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmMapViewInSessionSpaceEx(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmMapViewInSystemSpace(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmMapViewInSystemSpace(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmMapViewInSystemSpaceEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmMapViewInSystemSpaceEx(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmMdlPageContentsState(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmMdlPageContentsState(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmPageEntireDriver(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmPageEntireDriver(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmProbeAndLockPages(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmProbeAndLockPages(p0: String, p1: Int, p2: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmProbeAndLockProcessPages(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmProbeAndLockProcessPages(p0: String, p1: String, p2: Int, p3: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmProbeAndLockSelectedPages(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmProbeAndLockSelectedPages(p0: String, p1: String, p2: Int, p3: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmProtectDriverSection(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmProtectDriverSection(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmProtectMdlSystemAddress(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmProtectMdlSystemAddress(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmQuerySystemSize()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmQuerySystemSize(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmRemovePhysicalMemory(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmRemovePhysicalMemory(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmResetDriverPaging(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmResetDriverPaging(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmRotatePhysicalView(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmRotatePhysicalView(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmSecureVirtualMemory(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmSecureVirtualMemory(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmSecureVirtualMemoryEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmSecureVirtualMemoryEx(p0: String, p1: String, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmSetPermanentCacheAttribute(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmSetPermanentCacheAttribute(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmSizeOfMdl(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmSizeOfMdl(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmUnlockPagableImageSection(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmUnlockPagableImageSection(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmUnlockPages(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmUnlockPages(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmUnmapIoSpace(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmUnmapIoSpace(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmUnmapLockedPages(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmUnmapLockedPages(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmUnmapReservedMapping(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmUnmapReservedMapping(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmUnmapVideoDisplay(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmUnmapVideoDisplay(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmUnmapViewInSessionSpace(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmUnmapViewInSessionSpace(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmUnmapViewInSystemSpace(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmUnmapViewInSystemSpace(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesMmUnsecureVirtualMemory(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesMmUnsecureVirtualMemory(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtAllocateLocallyUniqueId(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtAllocateLocallyUniqueId(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtCommitComplete(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtCommitComplete(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtCommitEnlistment(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtCommitEnlistment(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtCommitTransaction(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtCommitTransaction(p0: String, p1: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtCreateEnlistment(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtCreateEnlistment(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtCreateResourceManager(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtCreateResourceManager(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtCreateTransaction(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtCreateTransaction(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: Int, p7: Int, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtCreateTransactionManager(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtCreateTransactionManager(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtDisplayString(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtDisplayString(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtEnumerateTransactionObject(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtEnumerateTransactionObject(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtGetNotificationResourceManager(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtGetNotificationResourceManager(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtLoadDriver(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtLoadDriver(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtMakeTemporaryObject(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtMakeTemporaryObject(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtManagePartition(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtManagePartition(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtOpenEnlistment(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtOpenEnlistment(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtOpenResourceManager(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtOpenResourceManager(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtOpenTransaction(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtOpenTransaction(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtOpenTransactionManager(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtOpenTransactionManager(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtPowerInformation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtPowerInformation(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtPrePrepareComplete(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtPrePrepareComplete(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtPrePrepareEnlistment(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtPrePrepareEnlistment(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtPrepareComplete(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtPrepareComplete(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtPrepareEnlistment(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtPrepareEnlistment(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtPropagationComplete(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtPropagationComplete(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtPropagationFailed(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtPropagationFailed(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtQueryInformationEnlistment(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtQueryInformationEnlistment(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtQueryInformationResourceManager(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtQueryInformationResourceManager(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtQueryInformationTransaction(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtQueryInformationTransaction(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtQueryInformationTransactionManager(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtQueryInformationTransactionManager(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtReadOnlyEnlistment(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtReadOnlyEnlistment(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtRecoverEnlistment(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtRecoverEnlistment(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtRecoverResourceManager(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtRecoverResourceManager(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtRecoverTransactionManager(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtRecoverTransactionManager(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtRegisterProtocolAddressInformation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtRegisterProtocolAddressInformation(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtRenameTransactionManager(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtRenameTransactionManager(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtRollbackComplete(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtRollbackComplete(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtRollbackEnlistment(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtRollbackEnlistment(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtRollbackTransaction(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtRollbackTransaction(p0: String, p1: Boolean): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtRollforwardTransactionManager(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtRollforwardTransactionManager(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtSetInformationEnlistment(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtSetInformationEnlistment(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtSetInformationResourceManager(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtSetInformationResourceManager(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtSetInformationTransaction(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtSetInformationTransaction(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtSetInformationTransactionManager(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtSetInformationTransactionManager(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtSinglePhaseReject(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtSinglePhaseReject(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesNtUnloadDriver(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesNtUnloadDriver(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesObCloseHandle(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesObCloseHandle(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesObDereferenceObjectDeferDelete(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesObDereferenceObjectDeferDelete(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesObDereferenceObjectDeferDeleteWithTag(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesObDereferenceObjectDeferDeleteWithTag(p0: String, p1: Int)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesObGetFilterVersion()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesObGetFilterVersion(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesObGetObjectSecurity(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesObGetObjectSecurity(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesObReferenceObjectByHandle(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesObReferenceObjectByHandle(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesObReferenceObjectByHandleWithTag(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesObReferenceObjectByHandleWithTag(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesObReferenceObjectByPointer(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesObReferenceObjectByPointer(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesObReferenceObjectByPointerWithTag(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesObReferenceObjectByPointerWithTag(p0: String, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesObReferenceObjectSafe(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesObReferenceObjectSafe(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesObReferenceObjectSafeWithTag(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesObReferenceObjectSafeWithTag(p0: String, p1: Int): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesObRegisterCallbacks(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesObRegisterCallbacks(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesObReleaseObjectSecurity(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesObReleaseObjectSecurity(p0: String, p1: Boolean)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesObUnRegisterCallbacks(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesObUnRegisterCallbacks(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesObfDereferenceObject(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesObfDereferenceObject(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesObfDereferenceObjectWithTag(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesObfDereferenceObjectWithTag(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesObfReferenceObject(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesObfReferenceObject(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesObfReferenceObjectWithTag(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesObfReferenceObjectWithTag(p0: String, p1: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPcwAddInstance(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPcwAddInstance(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPcwCloseInstance(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPcwCloseInstance(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPcwCreateInstance(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPcwCreateInstance(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPcwRegister(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPcwRegister(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPcwUnregister(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPcwUnregister(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoCallDriver(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoCallDriver(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoClearPowerRequest(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoClearPowerRequest(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoCreatePowerRequest(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoCreatePowerRequest(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoCreateThermalRequest(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoCreateThermalRequest(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoDeletePowerRequest(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoDeletePowerRequest(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoDeleteThermalRequest(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoDeleteThermalRequest(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoEndDeviceBusy(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoEndDeviceBusy(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoFxActivateComponent(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoFxActivateComponent(p0: String, p1: Int, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoFxCompleteDevicePowerNotRequired(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoFxCompleteDevicePowerNotRequired(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoFxCompleteDirectedPowerDown(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoFxCompleteDirectedPowerDown(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoFxCompleteIdleCondition(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoFxCompleteIdleCondition(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoFxCompleteIdleState(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoFxCompleteIdleState(p0: String, p1: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoFxIdleComponent(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoFxIdleComponent(p0: String, p1: Int, p2: Int)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoFxIssueComponentPerfStateChange(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoFxIssueComponentPerfStateChange(p0: String, p1: Int, p2: Int, p3: String, p4: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoFxIssueComponentPerfStateChangeMultiple(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoFxIssueComponentPerfStateChangeMultiple(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoFxNotifySurprisePowerOn(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoFxNotifySurprisePowerOn(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoFxPowerControl(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoFxPowerControl(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoFxPowerOnCrashdumpDevice(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoFxPowerOnCrashdumpDevice(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoFxQueryCurrentComponentPerfState(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoFxQueryCurrentComponentPerfState(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoFxRegisterComponentPerfStates(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoFxRegisterComponentPerfStates(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoFxRegisterCrashdumpDevice(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoFxRegisterCrashdumpDevice(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoFxRegisterDevice(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoFxRegisterDevice(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoFxRegisterDripsWatchdogCallback(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoFxRegisterDripsWatchdogCallback(p0: String, p1: String, p2: Boolean, p3: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoFxReportDevicePoweredOn(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoFxReportDevicePoweredOn(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoFxSetComponentLatency(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoFxSetComponentLatency(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoFxSetComponentResidency(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoFxSetComponentResidency(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoFxSetComponentWake(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoFxSetComponentWake(p0: String, p1: Int, p2: Boolean)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoFxSetDeviceIdleTimeout(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoFxSetDeviceIdleTimeout(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoFxSetTargetDripsDevicePowerState(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoFxSetTargetDripsDevicePowerState(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoFxStartDevicePowerManagement(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoFxStartDevicePowerManagement(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoFxUnregisterDevice(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoFxUnregisterDevice(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoGetSystemWake(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoGetSystemWake(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoGetThermalRequestSupport(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoGetThermalRequestSupport(p0: String, p1: Int): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoQueryWatchdogTime(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoQueryWatchdogTime(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoRegisterDeviceForIdleDetection(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoRegisterDeviceForIdleDetection(p0: String, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoRegisterPowerSettingCallback(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoRegisterPowerSettingCallback(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoRegisterSystemState(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoRegisterSystemState(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoSetDeviceBusyEx(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoSetDeviceBusyEx(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoSetHiberRange(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoSetHiberRange(p0: String, p1: Int, p2: String, p3: String, p4: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoSetPowerRequest(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoSetPowerRequest(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoSetSystemState(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoSetSystemState(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoSetSystemWake(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoSetSystemWake(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoSetSystemWakeDevice(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoSetSystemWakeDevice(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoSetThermalActiveCooling(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoSetThermalActiveCooling(p0: String, p1: Boolean): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoSetThermalPassiveCooling(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoSetThermalPassiveCooling(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoStartDeviceBusy(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoStartDeviceBusy(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoStartNextPowerIrp(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoStartNextPowerIrp(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoUnregisterPowerSettingCallback(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoUnregisterPowerSettingCallback(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPoUnregisterSystemState(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPoUnregisterSystemState(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesProbeForRead(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesProbeForRead(p0: String, p1: String, p2: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesProbeForWrite(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesProbeForWrite(p0: String, p1: String, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsAcquireSiloHardReference(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsAcquireSiloHardReference(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsAllocSiloContextSlot(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsAllocSiloContextSlot(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsAllocateAffinityToken(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsAllocateAffinityToken(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsAttachSiloToCurrentThread(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsAttachSiloToCurrentThread(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsCreateSiloContext(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsCreateSiloContext(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsCreateSystemThread(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsCreateSystemThread(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsDereferenceSiloContext(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsDereferenceSiloContext(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsDetachSiloFromCurrentThread(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsDetachSiloFromCurrentThread(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsFreeAffinityToken(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsFreeAffinityToken(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsFreeSiloContextSlot(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsFreeSiloContextSlot(p0: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsGetCurrentProcessId()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsGetCurrentProcessId(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsGetCurrentServerSilo()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsGetCurrentServerSilo(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsGetCurrentServerSiloName()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsGetCurrentServerSiloName(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsGetCurrentSilo()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsGetCurrentSilo(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsGetCurrentThreadId()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsGetCurrentThreadId(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsGetCurrentThreadTeb()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsGetCurrentThreadTeb(): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsGetEffectiveServerSilo(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsGetEffectiveServerSilo(p0: String): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsGetHostSilo()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsGetHostSilo(): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsGetJobServerSilo(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsGetJobServerSilo(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsGetJobSilo(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsGetJobSilo(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsGetParentSilo(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsGetParentSilo(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsGetPermanentSiloContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsGetPermanentSiloContext(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsGetProcessCreateTimeQuadPart(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsGetProcessCreateTimeQuadPart(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsGetProcessExitStatus(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsGetProcessExitStatus(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsGetProcessId(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsGetProcessId(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsGetProcessStartKey(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsGetProcessStartKey(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsGetServerSiloServiceSessionId(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsGetServerSiloServiceSessionId(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsGetSiloContainerId(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsGetSiloContainerId(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsGetSiloContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsGetSiloContext(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsGetSiloMonitorContextSlot(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsGetSiloMonitorContextSlot(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsGetThreadCreateTime(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsGetThreadCreateTime(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsGetThreadExitStatus(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsGetThreadExitStatus(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsGetThreadId(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsGetThreadId(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsGetThreadProcessId(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsGetThreadProcessId(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsGetThreadProperty(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsGetThreadProperty(p0: String, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsGetThreadServerSilo(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsGetThreadServerSilo(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsGetVersion(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsGetVersion(p0: String, p1: String, p2: String, p3: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsInsertPermanentSiloContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsInsertPermanentSiloContext(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsInsertSiloContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsInsertSiloContext(p0: String, p1: Int, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsIsCurrentThreadInServerSilo()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsIsCurrentThreadInServerSilo(): Boolean

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsIsCurrentThreadPrefetching()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsIsCurrentThreadPrefetching(): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsIsHostSilo(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsIsHostSilo(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsMakeSiloContextPermanent(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsMakeSiloContextPermanent(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsQueryTotalCycleTimeProcess(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsQueryTotalCycleTimeProcess(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsReferenceSiloContext(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsReferenceSiloContext(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsRegisterSiloMonitor(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsRegisterSiloMonitor(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsReleaseSiloHardReference(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsReleaseSiloHardReference(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsRemoveCreateThreadNotifyRoutine(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsRemoveCreateThreadNotifyRoutine(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsRemoveLoadImageNotifyRoutine(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsRemoveLoadImageNotifyRoutine(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsRemoveSiloContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsRemoveSiloContext(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsReplaceSiloContext(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsReplaceSiloContext(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsRevertToUserMultipleGroupAffinityThread(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsRevertToUserMultipleGroupAffinityThread(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsSetCreateProcessNotifyRoutine(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsSetCreateProcessNotifyRoutine(p0: String, p1: Boolean): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsSetCreateProcessNotifyRoutineEx(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsSetCreateProcessNotifyRoutineEx(p0: String, p1: Boolean): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsSetCreateProcessNotifyRoutineEx2(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsSetCreateProcessNotifyRoutineEx2(p0: Int, p1: String, p2: Boolean): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsSetCreateThreadNotifyRoutine(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsSetCreateThreadNotifyRoutine(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsSetCreateThreadNotifyRoutineEx(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsSetCreateThreadNotifyRoutineEx(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsSetCurrentThreadPrefetching(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsSetCurrentThreadPrefetching(p0: Boolean): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsSetLoadImageNotifyRoutine(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsSetLoadImageNotifyRoutine(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsSetLoadImageNotifyRoutineEx(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsSetLoadImageNotifyRoutineEx(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsSetSystemMultipleGroupAffinityThread(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsSetSystemMultipleGroupAffinityThread(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsStartSiloMonitor(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsStartSiloMonitor(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsTerminateServerSilo(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsTerminateServerSilo(p0: String, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsTerminateSystemThread(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsTerminateSystemThread(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsUnregisterSiloMonitor(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsUnregisterSiloMonitor(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPsWrapApcWow64Thread(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPsWrapApcWow64Thread(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPshedAllocateMemory(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPshedAllocateMemory(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPshedFreeMemory(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPshedFreeMemory(p0: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPshedIsSystemWheaEnabled()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPshedIsSystemWheaEnabled(): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPshedRegisterPlugin(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPshedRegisterPlugin(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPshedSynchronizeExecution(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPshedSynchronizeExecution(p0: String, p1: String, p2: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesPshedUnregisterPlugin(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesPshedUnregisterPlugin(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlAppendUnicodeStringToString(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlAppendUnicodeStringToString(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlAppendUnicodeToString(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlAppendUnicodeToString(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlAreBitsClear(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlAreBitsClear(p0: String, p1: Int, p2: Int): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlAreBitsSet(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlAreBitsSet(p0: String, p1: Int, p2: Int): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlAssert(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlAssert(p0: String, p1: String, p2: Int, p3: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlCheckRegistryKey(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlCheckRegistryKey(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlClearAllBits(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlClearAllBits(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlClearBit(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlClearBit(p0: String, p1: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlClearBits(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlClearBits(p0: String, p1: Int, p2: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlCmDecodeMemIoResource(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlCmDecodeMemIoResource(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlCmEncodeMemIoResource(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlCmEncodeMemIoResource(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlCompareString(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlCompareString(p0: String, p1: String, p2: Boolean): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlCompareUnicodeString(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlCompareUnicodeString(p0: String, p1: String, p2: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlCompareUnicodeStrings(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlCompareUnicodeStrings(p0: String, p1: String, p2: String, p3: String, p4: Boolean): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlContractHashTable(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlContractHashTable(p0: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlCopyBitMap(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlCopyBitMap(p0: String, p1: String, p2: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlCopyString(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlCopyString(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlCopyUnicodeString(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlCopyUnicodeString(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlCreateHashTable(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlCreateHashTable(p0: String, p1: Int, p2: Int): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlCreateHashTableEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlCreateHashTableEx(p0: String, p1: Int, p2: Int, p3: Int): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlCreateRegistryKey(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlCreateRegistryKey(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlCreateSecurityDescriptor(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlCreateSecurityDescriptor(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlDelete(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlDelete(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlDeleteElementGenericTable(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlDeleteElementGenericTable(p0: String, p1: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlDeleteElementGenericTableAvl(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlDeleteElementGenericTableAvl(p0: String, p1: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlDeleteElementGenericTableAvlEx(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlDeleteElementGenericTableAvlEx(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlDeleteHashTable(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlDeleteHashTable(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlDeleteNoSplay(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlDeleteNoSplay(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlDeleteRegistryValue(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlDeleteRegistryValue(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlDowncaseUnicodeChar(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlDowncaseUnicodeChar(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlEndEnumerationHashTable(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlEndEnumerationHashTable(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlEndStrongEnumerationHashTable(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlEndStrongEnumerationHashTable(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlEndWeakEnumerationHashTable(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlEndWeakEnumerationHashTable(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlEnumerateEntryHashTable(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlEnumerateEntryHashTable(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTable(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTable(p0: String, p1: Boolean): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTableAvl(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTableAvl(p0: String, p1: Boolean): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTableLikeADirectory(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTableLikeADirectory(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTableWithoutSplaying(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTableWithoutSplaying(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTableWithoutSplayingAvl(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTableWithoutSplayingAvl(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlEqualString(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlEqualString(p0: String, p1: String, p2: Boolean): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlEqualUnicodeString(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlEqualUnicodeString(p0: String, p1: String, p2: Boolean): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlExpandHashTable(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlExpandHashTable(p0: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlExtractBitMap(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlExtractBitMap(p0: String, p1: String, p2: Int, p3: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlFindClearBits(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlFindClearBits(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlFindClearBitsAndSet(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlFindClearBitsAndSet(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlFindClearRuns(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlFindClearRuns(p0: String, p1: String, p2: Int, p3: Boolean): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlFindClosestEncodableLength(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlFindClosestEncodableLength(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlFindFirstRunClear(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlFindFirstRunClear(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlFindLastBackwardRunClear(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlFindLastBackwardRunClear(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlFindLeastSignificantBit(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlFindLeastSignificantBit(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlFindLongestRunClear(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlFindLongestRunClear(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlFindMostSignificantBit(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlFindMostSignificantBit(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlFindNextForwardRunClear(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlFindNextForwardRunClear(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlFindSetBits(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlFindSetBits(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlFindSetBitsAndClear(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlFindSetBitsAndClear(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlFreeUTF8String(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlFreeUTF8String(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlGUIDFromString(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlGUIDFromString(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlGenerateClass5Guid(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlGenerateClass5Guid(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlGetActiveConsoleId()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlGetActiveConsoleId(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlGetCallersAddress(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlGetCallersAddress(p0: String, p1: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlGetConsoleSessionForegroundProcessId()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlGetConsoleSessionForegroundProcessId(): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlGetElementGenericTable(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlGetElementGenericTable(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlGetElementGenericTableAvl(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlGetElementGenericTableAvl(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlGetEnabledExtendedFeatures(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlGetEnabledExtendedFeatures(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlGetNextEntryHashTable(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlGetNextEntryHashTable(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlGetNtProductType(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlGetNtProductType(p0: String): Boolean

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlGetNtSystemRoot()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlGetNtSystemRoot(): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlGetPersistedStateLocation(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlGetPersistedStateLocation(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlGetSuiteMask()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlGetSuiteMask(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlGetVersion(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlGetVersion(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlHashUnicodeString(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlHashUnicodeString(p0: String, p1: Boolean, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlInitEnumerationHashTable(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlInitEnumerationHashTable(p0: String, p1: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlInitStrongEnumerationHashTable(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlInitStrongEnumerationHashTable(p0: String, p1: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlInitUTF8String(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlInitUTF8String(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlInitUTF8StringEx(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlInitUTF8StringEx(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlInitWeakEnumerationHashTable(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlInitWeakEnumerationHashTable(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlInitializeBitMap(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlInitializeBitMap(p0: String, p1: String, p2: Int)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlInitializeGenericTable(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlInitializeGenericTable(p0: String, p1: String, p2: String, p3: String, p4: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlInitializeGenericTableAvl(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlInitializeGenericTableAvl(p0: String, p1: String, p2: String, p3: String, p4: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlInsertElementGenericTable(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlInsertElementGenericTable(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlInsertElementGenericTableAvl(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlInsertElementGenericTableAvl(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlInsertElementGenericTableFull(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlInsertElementGenericTableFull(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlInsertElementGenericTableFullAvl(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlInsertElementGenericTableFullAvl(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlInsertEntryHashTable(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlInsertEntryHashTable(p0: String, p1: String, p2: String, p3: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlInt64ToUnicodeString(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlInt64ToUnicodeString(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlIntegerToUnicodeString(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlIntegerToUnicodeString(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlIoDecodeMemIoResource(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlIoDecodeMemIoResource(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlIoEncodeMemIoResource(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlIoEncodeMemIoResource(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlIsApiSetImplemented(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlIsApiSetImplemented(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlIsGenericTableEmpty(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlIsGenericTableEmpty(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlIsGenericTableEmptyAvl(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlIsGenericTableEmptyAvl(p0: String): Boolean

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlIsMultiSessionSku()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlIsMultiSessionSku(): Boolean

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlIsMultiUsersInSessionSku()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlIsMultiUsersInSessionSku(): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlIsNtDdiVersionAvailable(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlIsNtDdiVersionAvailable(p0: Int): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlIsServicePackVersionInstalled(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlIsServicePackVersionInstalled(p0: Int): Boolean

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlIsStateSeparationEnabled()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlIsStateSeparationEnabled(): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlIsUntrustedObject(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlIsUntrustedObject(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlLengthSecurityDescriptor(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlLengthSecurityDescriptor(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlLookupElementGenericTable(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlLookupElementGenericTable(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlLookupElementGenericTableAvl(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlLookupElementGenericTableAvl(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlLookupElementGenericTableFull(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlLookupElementGenericTableFull(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlLookupElementGenericTableFullAvl(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlLookupElementGenericTableFullAvl(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlLookupEntryHashTable(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlLookupEntryHashTable(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlLookupFirstMatchingElementGenericTableAvl(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlLookupFirstMatchingElementGenericTableAvl(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlMapGenericMask(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlMapGenericMask(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlNormalizeSecurityDescriptor(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlNormalizeSecurityDescriptor(p0: String, p1: Int, p2: String, p3: String, p4: Boolean): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlNumberGenericTableElements(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlNumberGenericTableElements(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlNumberGenericTableElementsAvl(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlNumberGenericTableElementsAvl(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlNumberOfClearBits(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlNumberOfClearBits(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlNumberOfClearBitsInRange(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlNumberOfClearBitsInRange(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlNumberOfSetBits(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlNumberOfSetBits(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlNumberOfSetBitsInRange(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlNumberOfSetBitsInRange(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlNumberOfSetBitsUlongPtr(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlNumberOfSetBitsUlongPtr(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlPrefetchMemoryNonTemporal(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlPrefetchMemoryNonTemporal(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlPrefixUnicodeString(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlPrefixUnicodeString(p0: String, p1: String, p2: Boolean): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlQueryRegistryValueWithFallback(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlQueryRegistryValueWithFallback(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlQueryRegistryValues(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlQueryRegistryValues(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlQueryValidationRunlevel(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlQueryValidationRunlevel(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlRealPredecessor(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlRealPredecessor(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlRealSuccessor(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlRealSuccessor(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlRemoveEntryHashTable(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlRemoveEntryHashTable(p0: String, p1: String, p2: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlRunOnceBeginInitialize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlRunOnceBeginInitialize(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlRunOnceComplete(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlRunOnceComplete(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlRunOnceExecuteOnce(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlRunOnceExecuteOnce(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlRunOnceInitialize(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlRunOnceInitialize(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlSetAllBits(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlSetAllBits(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlSetBit(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlSetBit(p0: String, p1: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlSetBits(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlSetBits(p0: String, p1: Int, p2: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlSetDaclSecurityDescriptor(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlSetDaclSecurityDescriptor(p0: String, p1: Boolean, p2: String, p3: Boolean): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlSetSystemGlobalData(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlSetSystemGlobalData(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlSplay(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlSplay(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlStringFromGUID(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlStringFromGUID(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlStronglyEnumerateEntryHashTable(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlStronglyEnumerateEntryHashTable(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlSubtreePredecessor(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlSubtreePredecessor(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlSubtreeSuccessor(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlSubtreeSuccessor(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlSuffixUnicodeString(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlSuffixUnicodeString(p0: String, p1: String, p2: Boolean): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlTestBit(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlTestBit(p0: String, p1: Int): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlTimeFieldsToTime(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlTimeFieldsToTime(p0: String, p1: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlTimeToTimeFields(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlTimeToTimeFields(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlUTF8StringToUnicodeString(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlUTF8StringToUnicodeString(p0: String, p1: String, p2: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlUTF8ToUnicodeN(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlUTF8ToUnicodeN(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlUnicodeStringToInt64(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlUnicodeStringToInt64(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlUnicodeStringToInteger(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlUnicodeStringToInteger(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlUnicodeStringToUTF8String(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlUnicodeStringToUTF8String(p0: String, p1: String, p2: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlUnicodeToUTF8N(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlUnicodeToUTF8N(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlUpcaseUnicodeChar(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlUpcaseUnicodeChar(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlUpcaseUnicodeString(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlUpcaseUnicodeString(p0: String, p1: String, p2: Boolean): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlUpperChar(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlUpperChar(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlUpperString(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlUpperString(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlValidRelativeSecurityDescriptor(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlValidRelativeSecurityDescriptor(p0: String, p1: Int, p2: Int): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlValidSecurityDescriptor(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlValidSecurityDescriptor(p0: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlVerifyVersionInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlVerifyVersionInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlVolumeDeviceToDosName(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlVolumeDeviceToDosName(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlWalkFrameChain(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlWalkFrameChain(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlWeaklyEnumerateEntryHashTable(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlWeaklyEnumerateEntryHashTable(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlWriteRegistryValue(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlWriteRegistryValue(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlxAnsiStringToUnicodeSize(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlxAnsiStringToUnicodeSize(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesRtlxUnicodeStringToAnsiSize(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesRtlxUnicodeStringToAnsiSize(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesSeAccessCheck(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesSeAccessCheck(p0: String, p1: String, p2: Boolean, p3: Int, p4: Int, p5: String, p6: String, p7: Int, p8: String, p9: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesSeAssignSecurity(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesSeAssignSecurity(p0: String, p1: String, p2: String, p3: Boolean, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesSeAssignSecurityEx(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesSeAssignSecurityEx(p0: String, p1: String, p2: String, p3: String, p4: Boolean, p5: Int, p6: String, p7: String, p8: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesSeCaptureSubjectContext(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesSeCaptureSubjectContext(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesSeComputeAutoInheritByObjectType(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesSeComputeAutoInheritByObjectType(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesSeDeassignSecurity(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesSeDeassignSecurity(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesSeEtwWriteKMCveEvent(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesSeEtwWriteKMCveEvent(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesSeLockSubjectContext(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesSeLockSubjectContext(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesSeRegisterImageVerificationCallback(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesSeRegisterImageVerificationCallback(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesSeReleaseSubjectContext(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesSeReleaseSubjectContext(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesSeReportSecurityEvent(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesSeReportSecurityEvent(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesSeSetAuditParameter(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesSeSetAuditParameter(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesSeUnlockSubjectContext(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesSeUnlockSubjectContext(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesSeUnregisterImageVerificationCallback(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesSeUnregisterImageVerificationCallback(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesSeValidSecurityDescriptor(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesSeValidSecurityDescriptor(p0: Int, p1: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesTmCommitComplete(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesTmCommitComplete(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesTmCommitEnlistment(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesTmCommitEnlistment(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesTmCommitTransaction(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesTmCommitTransaction(p0: String, p1: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesTmCreateEnlistment(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesTmCreateEnlistment(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: Int, p7: Int, p8: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesTmDereferenceEnlistmentKey(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesTmDereferenceEnlistmentKey(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesTmEnableCallbacks(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesTmEnableCallbacks(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesTmGetTransactionId(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesTmGetTransactionId(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesTmInitializeTransactionManager(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesTmInitializeTransactionManager(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesTmIsTransactionActive(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesTmIsTransactionActive(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesTmPrePrepareComplete(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesTmPrePrepareComplete(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesTmPrePrepareEnlistment(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesTmPrePrepareEnlistment(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesTmPrepareComplete(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesTmPrepareComplete(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesTmPrepareEnlistment(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesTmPrepareEnlistment(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesTmPropagationComplete(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesTmPropagationComplete(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesTmPropagationFailed(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesTmPropagationFailed(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesTmReadOnlyEnlistment(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesTmReadOnlyEnlistment(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesTmRecoverEnlistment(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesTmRecoverEnlistment(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesTmRecoverResourceManager(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesTmRecoverResourceManager(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesTmRecoverTransactionManager(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesTmRecoverTransactionManager(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesTmReferenceEnlistmentKey(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesTmReferenceEnlistmentKey(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesTmRenameTransactionManager(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesTmRenameTransactionManager(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesTmRequestOutcomeEnlistment(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesTmRequestOutcomeEnlistment(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesTmRollbackComplete(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesTmRollbackComplete(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesTmRollbackEnlistment(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesTmRollbackEnlistment(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesTmRollbackTransaction(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesTmRollbackTransaction(p0: String, p1: Boolean): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesTmSinglePhaseReject(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesTmSinglePhaseReject(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesVslCreateSecureSection(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesVslCreateSecureSection(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesVslDeleteSecureSection(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesVslDeleteSecureSection(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesWheaAddErrorSource(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesWheaAddErrorSource(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesWheaAddErrorSourceDeviceDriver(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesWheaAddErrorSourceDeviceDriver(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesWheaAddErrorSourceDeviceDriverV1(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesWheaAddErrorSourceDeviceDriverV1(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesWheaAddHwErrorReportSectionDeviceDriver(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesWheaAddHwErrorReportSectionDeviceDriver(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesWheaConfigureErrorSource(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesWheaConfigureErrorSource(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesWheaCreateHwErrorReportDeviceDriver(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesWheaCreateHwErrorReportDeviceDriver(p0: Int, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesWheaErrorSourceGetState(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesWheaErrorSourceGetState(p0: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesWheaGetNotifyAllOfflinesPolicy()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesWheaGetNotifyAllOfflinesPolicy(): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesWheaHighIrqlLogSelEventHandlerRegister(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesWheaHighIrqlLogSelEventHandlerRegister(p0: String, p1: String): Boolean

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesWheaHighIrqlLogSelEventHandlerUnregister()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesWheaHighIrqlLogSelEventHandlerUnregister()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesWheaHwErrorReportAbandonDeviceDriver(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesWheaHwErrorReportAbandonDeviceDriver(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesWheaHwErrorReportSetSectionNameDeviceDriver(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesWheaHwErrorReportSetSectionNameDeviceDriver(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesWheaHwErrorReportSetSeverityDeviceDriver(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesWheaHwErrorReportSetSeverityDeviceDriver(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesWheaHwErrorReportSubmitDeviceDriver(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesWheaHwErrorReportSubmitDeviceDriver(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesWheaInitializeRecordHeader(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesWheaInitializeRecordHeader(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesWheaIsCriticalState()")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesWheaIsCriticalState(): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesWheaLogInternalEvent(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesWheaLogInternalEvent(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesWheaRegisterInUsePageOfflineNotification(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesWheaRegisterInUsePageOfflineNotification(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesWheaRemoveErrorSource(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesWheaRemoveErrorSource(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesWheaRemoveErrorSourceDeviceDriver(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesWheaRemoveErrorSourceDeviceDriver(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesWheaReportHwError(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesWheaReportHwError(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesWheaReportHwErrorDeviceDriver(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesWheaReportHwErrorDeviceDriver(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesWheaUnconfigureErrorSource(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesWheaUnconfigureErrorSource(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesWheaUnregisterInUsePageOfflineNotification(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesWheaUnregisterInUsePageOfflineNotification(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesWmiQueryTraceInformation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesWmiQueryTraceInformation(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwAllocateLocallyUniqueId(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwAllocateLocallyUniqueId(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwClose(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwClose(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwCommitComplete(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwCommitComplete(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwCommitEnlistment(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwCommitEnlistment(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwCommitTransaction(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwCommitTransaction(p0: String, p1: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwCreateEnlistment(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwCreateEnlistment(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwCreateFile(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwCreateFile(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: Int, p7: Int, p8: Int, p9: String, p10: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwCreateResourceManager(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwCreateResourceManager(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwCreateSection(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwCreateSection(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwCreateTransaction(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwCreateTransaction(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: Int, p7: Int, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwCreateTransactionManager(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwCreateTransactionManager(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwDeviceIoControlFile(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwDeviceIoControlFile(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: Int, p8: String, p9: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwDisplayString(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwDisplayString(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwEnumerateTransactionObject(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwEnumerateTransactionObject(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwGetNotificationResourceManager(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwGetNotificationResourceManager(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwLoadDriver(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwLoadDriver(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwMakeTemporaryObject(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwMakeTemporaryObject(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwManagePartition(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwManagePartition(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwOpenEnlistment(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwOpenEnlistment(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwOpenFile(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwOpenFile(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwOpenResourceManager(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwOpenResourceManager(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwOpenSymbolicLinkObject(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwOpenSymbolicLinkObject(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwOpenTransaction(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwOpenTransaction(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwOpenTransactionManager(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwOpenTransactionManager(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwPowerInformation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwPowerInformation(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwPrePrepareComplete(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwPrePrepareComplete(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwPrePrepareEnlistment(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwPrePrepareEnlistment(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwPrepareComplete(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwPrepareComplete(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwPrepareEnlistment(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwPrepareEnlistment(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwPropagationComplete(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwPropagationComplete(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwPropagationFailed(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwPropagationFailed(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwQueryInformationByName(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwQueryInformationByName(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwQueryInformationEnlistment(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwQueryInformationEnlistment(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwQueryInformationFile(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwQueryInformationFile(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwQueryInformationResourceManager(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwQueryInformationResourceManager(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwQueryInformationTransaction(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwQueryInformationTransaction(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwQueryInformationTransactionManager(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwQueryInformationTransactionManager(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwQuerySymbolicLinkObject(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwQuerySymbolicLinkObject(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwReadFile(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwReadFile(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwReadOnlyEnlistment(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwReadOnlyEnlistment(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwRecoverEnlistment(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwRecoverEnlistment(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwRecoverResourceManager(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwRecoverResourceManager(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwRecoverTransactionManager(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwRecoverTransactionManager(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwRegisterProtocolAddressInformation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwRegisterProtocolAddressInformation(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwRenameTransactionManager(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwRenameTransactionManager(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwRollbackComplete(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwRollbackComplete(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwRollbackEnlistment(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwRollbackEnlistment(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwRollbackTransaction(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwRollbackTransaction(p0: String, p1: Boolean): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwRollforwardTransactionManager(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwRollforwardTransactionManager(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwSetInformationEnlistment(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwSetInformationEnlistment(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwSetInformationFile(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwSetInformationFile(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwSetInformationResourceManager(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwSetInformationResourceManager(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwSetInformationTransaction(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwSetInformationTransaction(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwSetInformationTransactionManager(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwSetInformationTransactionManager(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwSinglePhaseReject(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwSinglePhaseReject(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwUnloadDriver(p0)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwUnloadDriver(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesZwWriteFile(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesZwWriteFile(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesVDbgPrintEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesVDbgPrintEx(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSystemservicesVDbgPrintExWithPrefix(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkSystemSystemservicesVDbgPrintExWithPrefix(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

public actual fun clfsAddLogContainer(plfolog: ConstPtr<FileObject>, pcbcontainer: ConstPtr<ULong>, puszcontainerpath: ConstPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsAddLogContainer(plfolog.rawAddress.toString(), pcbcontainer.rawAddress.toString(), puszcontainerpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsAddLogContainerSet(plfolog: ConstPtr<FileObject>, ccontainers: UShort, pcbcontainer: ConstPtr<ULong>, rguszcontainerpath: ConstPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsAddLogContainerSet(plfolog.rawAddress.toString(), ccontainers.toInt(), pcbcontainer.rawAddress.toString(), rguszcontainerpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsAdvanceLogBase(pvmarshalcontext: MutPtr<CVoid>, plsnbase: ConstPtr<ClsLsn>, fflags: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsAdvanceLogBase(pvmarshalcontext.rawAddress.toString(), plsnbase.rawAddress.toString(), fflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsAlignReservedLog(pvmarshalcontext: ConstPtr<CVoid>, crecords: UInt, rgcbreservation: ConstPtr<Long>, pcbalignreservation: MutPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsAlignReservedLog(pvmarshalcontext.rawAddress.toString(), crecords.toInt(), rgcbreservation.rawAddress.toString(), pcbalignreservation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsAllocReservedLog(pvmarshalcontext: ConstPtr<CVoid>, crecords: UInt, pcbadjustment: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsAllocReservedLog(pvmarshalcontext.rawAddress.toString(), crecords.toInt(), pcbadjustment.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsCloseAndResetLogFile(plfolog: ConstPtr<FileObject>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsCloseAndResetLogFile(plfolog.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsCloseLogFileObject(plfolog: ConstPtr<FileObject>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsCloseLogFileObject(plfolog.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsCreateLogFile(pplfolog: MutPtr<MutPtr<FileObject>>, puszlogfilename: ConstPtr<UnicodeString>, fdesiredaccess: UInt, dwsharemode: UInt, psdlogfile: PsecurityDescriptor, fcreatedisposition: UInt, fcreateoptions: UInt, fflagsandattributes: UInt, flogoptionflag: UInt, pvcontext: ConstPtr<CVoid>, cbcontext: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsCreateLogFile(pplfolog.rawAddress.toString(), puszlogfilename.rawAddress.toString(), fdesiredaccess.toInt(), dwsharemode.toInt(), psdlogfile.rawAddress.toString(), fcreatedisposition.toInt(), fcreateoptions.toInt(), fflagsandattributes.toInt(), flogoptionflag.toInt(), pvcontext.rawAddress.toString(), cbcontext.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsCreateMarshallingArea(plfolog: ConstPtr<FileObject>, epooltype: PoolType, pfnallocbuffer: PallocateFunction, pfnfreebuffer: PfreeFunction, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, ppvmarshalcontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsCreateMarshallingAreaEx(plfolog: ConstPtr<FileObject>, epooltype: PoolType, pfnallocbuffer: PallocateFunction, pfnfreebuffer: PfreeFunction, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, calignmentsize: UInt, fflags: ULong, ppvmarshalcontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsCreateScanContext(plfolog: ConstPtr<FileObject>, cfromcontainer: UInt, ccontainers: UInt, escanmode: UByte, pcxscan: MutPtr<ClsScanContext>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsCreateScanContext(plfolog.rawAddress.toString(), cfromcontainer.toInt(), ccontainers.toInt(), escanmode.toInt(), pcxscan.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsDeleteLogByPointer(plfolog: ConstPtr<FileObject>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsDeleteLogByPointer(plfolog.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsDeleteLogFile(puszlogfilename: ConstPtr<UnicodeString>, pvreserved: ConstPtr<CVoid>, flogoptionflag: UInt, pvcontext: ConstPtr<CVoid>, cbcontext: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsDeleteLogFile(puszlogfilename.rawAddress.toString(), pvreserved.rawAddress.toString(), flogoptionflag.toInt(), pvcontext.rawAddress.toString(), cbcontext.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsDeleteMarshallingArea(pvmarshalcontext: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsDeleteMarshallingArea(pvmarshalcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsEarlierLsn(plsn: ConstPtr<ClsLsn>): ClsLsn =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsFinalize() {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesClfsFinalize()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun clfsFlushBuffers(pvmarshalcontext: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsFlushBuffers(pvmarshalcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsFlushToLsn(pvmarshalcontext: ConstPtr<CVoid>, plsnflush: ConstPtr<ClsLsn>, plsnlastflushed: MutPtr<ClsLsn>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsFlushToLsn(pvmarshalcontext.rawAddress.toString(), plsnflush.rawAddress.toString(), plsnlastflushed.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsFreeReservedLog(pvmarshalcontext: ConstPtr<CVoid>, crecords: UInt, pcbadjustment: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsFreeReservedLog(pvmarshalcontext.rawAddress.toString(), crecords.toInt(), pcbadjustment.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsGetContainerName(plfolog: ConstPtr<FileObject>, cidlogicalcontainer: UInt, puszcontainername: MutPtr<UnicodeString>, pcactuallencontainername: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsGetContainerName(plfolog.rawAddress.toString(), cidlogicalcontainer.toInt(), puszcontainername.rawAddress.toString(), pcactuallencontainername.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsGetIoStatistics(plfolog: ConstPtr<FileObject>, pvstatsbuffer: MutPtr<CVoid>, cbstatsbuffer: UInt, estatsclass: ClfsIostatsClass, pcbstatswritten: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsGetIoStatistics(plfolog.rawAddress.toString(), pvstatsbuffer.rawAddress.toString(), cbstatsbuffer.toInt(), estatsclass, pcbstatswritten.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsGetLogFileInformation(plfolog: ConstPtr<FileObject>, pinfobuffer: MutPtr<ClsInformation>, pcbinfobuffer: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsGetLogFileInformation(plfolog.rawAddress.toString(), pinfobuffer.rawAddress.toString(), pcbinfobuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsInitialize(): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsInitialize() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsLaterLsn(plsn: ConstPtr<ClsLsn>): ClsLsn =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsLsnBlockOffset(plsn: ConstPtr<ClsLsn>): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsLsnBlockOffset(plsn.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsLsnContainer(plsn: ConstPtr<ClsLsn>): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsLsnContainer(plsn.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsLsnCreate(cidcontainer: UInt, offblock: UInt, crecord: UInt): ClsLsn =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsLsnDifference(plsnstart: ConstPtr<ClsLsn>, plsnfinish: ConstPtr<ClsLsn>, cbcontainer: UInt, cbmaxblock: UInt, pcbdifference: MutPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsLsnDifference(plsnstart.rawAddress.toString(), plsnfinish.rawAddress.toString(), cbcontainer.toInt(), cbmaxblock.toInt(), pcbdifference.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsLsnEqual(plsn1: ConstPtr<ClsLsn>, plsn2: ConstPtr<ClsLsn>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsLsnEqual(plsn1.rawAddress.toString(), plsn2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsLsnGreater(plsn1: ConstPtr<ClsLsn>, plsn2: ConstPtr<ClsLsn>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsLsnGreater(plsn1.rawAddress.toString(), plsn2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsLsnInvalid(plsn: ConstPtr<ClsLsn>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsLsnInvalid(plsn.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsLsnLess(plsn1: ConstPtr<ClsLsn>, plsn2: ConstPtr<ClsLsn>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsLsnLess(plsn1.rawAddress.toString(), plsn2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsLsnNull(plsn: ConstPtr<ClsLsn>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsLsnNull(plsn.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsLsnRecordSequence(plsn: ConstPtr<ClsLsn>): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsLsnRecordSequence(plsn.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsMgmtDeregisterManagedClient(clientcookie: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsMgmtDeregisterManagedClient(clientcookie.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsMgmtHandleLogFileFull(client: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsMgmtHandleLogFileFull(client.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsMgmtInstallPolicy(logfile: ConstPtr<FileObject>, policy: ConstPtr<ClfsMgmtPolicy>, policylength: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsMgmtInstallPolicy(logfile.rawAddress.toString(), policy.rawAddress.toString(), policylength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsMgmtQueryPolicy(logfile: ConstPtr<FileObject>, policytype: ClfsMgmtPolicyType, policy: MutPtr<ClfsMgmtPolicy>, policylength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsMgmtQueryPolicy(logfile.rawAddress.toString(), policytype, policy.rawAddress.toString(), policylength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsMgmtRegisterManagedClient(logfile: ConstPtr<FileObject>, registrationdata: ConstPtr<ClfsMgmtClientRegistration>, clientcookie: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsMgmtRegisterManagedClient(logfile.rawAddress.toString(), registrationdata.rawAddress.toString(), clientcookie.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsMgmtRemovePolicy(logfile: ConstPtr<FileObject>, policytype: ClfsMgmtPolicyType): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsMgmtRemovePolicy(logfile.rawAddress.toString(), policytype) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsMgmtSetLogFileSize(logfile: ConstPtr<FileObject>, newsizeincontainers: ConstPtr<ULong>, resultingsizeincontainers: MutPtr<ULong>, completionroutine: PclfsSetLogSizeCompleteCallback, completionroutinedata: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsMgmtSetLogFileSize(logfile.rawAddress.toString(), newsizeincontainers.rawAddress.toString(), resultingsizeincontainers.rawAddress.toString(), 0L.toString(), completionroutinedata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsMgmtSetLogFileSizeAsClient(logfile: ConstPtr<FileObject>, clientcookie: ConstPtr<ConstPtr<CVoid>>, newsizeincontainers: ConstPtr<ULong>, resultingsizeincontainers: MutPtr<ULong>, completionroutine: PclfsSetLogSizeCompleteCallback, completionroutinedata: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsMgmtSetLogFileSizeAsClient(logfile.rawAddress.toString(), clientcookie.rawAddress.toString(), newsizeincontainers.rawAddress.toString(), resultingsizeincontainers.rawAddress.toString(), 0L.toString(), completionroutinedata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsMgmtTailAdvanceFailure(client: ConstPtr<CVoid>, reason: Ntstatus): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsMgmtTailAdvanceFailure(client.rawAddress.toString(), reason) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsQueryLogFileInformation(plfolog: ConstPtr<FileObject>, einformationclass: ClsLogInformationClass, pinfoinputbuffer: ConstPtr<CVoid>, cbinfoinputbuffer: UInt, pinfobuffer: MutPtr<CVoid>, pcbinfobuffer: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsQueryLogFileInformation(plfolog.rawAddress.toString(), einformationclass, pinfoinputbuffer.rawAddress.toString(), cbinfoinputbuffer.toInt(), pinfobuffer.rawAddress.toString(), pcbinfobuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsReadLogRecord(pvmarshalcontext: ConstPtr<CVoid>, plsnfirst: MutPtr<ClsLsn>, pecontextmode: ClfsContextMode, ppvreadbuffer: MutPtr<MutPtr<CVoid>>, pcbreadbuffer: MutPtr<UInt>, perecordtype: MutPtr<UByte>, plsnundonext: MutPtr<ClsLsn>, plsnprevious: MutPtr<ClsLsn>, ppvreadcontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsReadLogRecord(pvmarshalcontext.rawAddress.toString(), plsnfirst.rawAddress.toString(), pecontextmode, ppvreadbuffer.rawAddress.toString(), pcbreadbuffer.rawAddress.toString(), perecordtype.rawAddress.toString(), plsnundonext.rawAddress.toString(), plsnprevious.rawAddress.toString(), ppvreadcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsReadNextLogRecord(pvreadcontext: MutPtr<CVoid>, ppvbuffer: MutPtr<MutPtr<CVoid>>, pcbbuffer: MutPtr<UInt>, perecordtype: MutPtr<UByte>, plsnuser: ConstPtr<ClsLsn>, plsnundonext: MutPtr<ClsLsn>, plsnprevious: MutPtr<ClsLsn>, plsnrecord: MutPtr<ClsLsn>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsReadNextLogRecord(pvreadcontext.rawAddress.toString(), ppvbuffer.rawAddress.toString(), pcbbuffer.rawAddress.toString(), perecordtype.rawAddress.toString(), plsnuser.rawAddress.toString(), plsnundonext.rawAddress.toString(), plsnprevious.rawAddress.toString(), plsnrecord.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsReadPreviousRestartArea(pvreadcontext: ConstPtr<CVoid>, ppvrestartbuffer: MutPtr<MutPtr<CVoid>>, pcbrestartbuffer: MutPtr<UInt>, plsnrestart: MutPtr<ClsLsn>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsReadPreviousRestartArea(pvreadcontext.rawAddress.toString(), ppvrestartbuffer.rawAddress.toString(), pcbrestartbuffer.rawAddress.toString(), plsnrestart.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsReadRestartArea(pvmarshalcontext: MutPtr<CVoid>, ppvrestartbuffer: MutPtr<MutPtr<CVoid>>, pcbrestartbuffer: MutPtr<UInt>, plsn: MutPtr<ClsLsn>, ppvreadcontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsReadRestartArea(pvmarshalcontext.rawAddress.toString(), ppvrestartbuffer.rawAddress.toString(), pcbrestartbuffer.rawAddress.toString(), plsn.rawAddress.toString(), ppvreadcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsRemoveLogContainer(plfolog: ConstPtr<FileObject>, puszcontainerpath: ConstPtr<UnicodeString>, fforce: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsRemoveLogContainer(plfolog.rawAddress.toString(), puszcontainerpath.rawAddress.toString(), fforce) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsRemoveLogContainerSet(plfolog: ConstPtr<FileObject>, ccontainers: UShort, rgwszcontainerpath: ConstPtr<UnicodeString>, fforce: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsRemoveLogContainerSet(plfolog.rawAddress.toString(), ccontainers.toInt(), rgwszcontainerpath.rawAddress.toString(), fforce) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsReserveAndAppendLog(pvmarshalcontext: ConstPtr<CVoid>, rgwriteentries: ConstPtr<ClsWriteEntry>, cwriteentries: UInt, plsnundonext: ConstPtr<ClsLsn>, plsnprevious: ConstPtr<ClsLsn>, creserverecords: UInt, rgcbreservation: MutPtr<Long>, fflags: UInt, plsn: MutPtr<ClsLsn>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsReserveAndAppendLog(pvmarshalcontext.rawAddress.toString(), rgwriteentries.rawAddress.toString(), cwriteentries.toInt(), plsnundonext.rawAddress.toString(), plsnprevious.rawAddress.toString(), creserverecords.toInt(), rgcbreservation.rawAddress.toString(), fflags.toInt(), plsn.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsReserveAndAppendLogAligned(pvmarshalcontext: ConstPtr<CVoid>, rgwriteentries: ConstPtr<ClsWriteEntry>, cwriteentries: UInt, cbentryalignment: UInt, plsnundonext: ConstPtr<ClsLsn>, plsnprevious: ConstPtr<ClsLsn>, creserverecords: UInt, rgcbreservation: MutPtr<Long>, fflags: UInt, plsn: MutPtr<ClsLsn>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsReserveAndAppendLogAligned(pvmarshalcontext.rawAddress.toString(), rgwriteentries.rawAddress.toString(), cwriteentries.toInt(), cbentryalignment.toInt(), plsnundonext.rawAddress.toString(), plsnprevious.rawAddress.toString(), creserverecords.toInt(), rgcbreservation.rawAddress.toString(), fflags.toInt(), plsn.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsScanLogContainers(pcxscan: MutPtr<ClsScanContext>, escanmode: UByte): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsScanLogContainers(pcxscan.rawAddress.toString(), escanmode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsSetArchiveTail(plfolog: ConstPtr<FileObject>, plsnarchivetail: ConstPtr<ClsLsn>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsSetArchiveTail(plfolog.rawAddress.toString(), plsnarchivetail.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsSetEndOfLog(plfolog: ConstPtr<FileObject>, plsnend: ConstPtr<ClsLsn>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsSetEndOfLog(plfolog.rawAddress.toString(), plsnend.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsSetLogFileInformation(plfolog: ConstPtr<FileObject>, einformationclass: ClsLogInformationClass, pinfobuffer: ConstPtr<CVoid>, cbbuffer: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsSetLogFileInformation(plfolog.rawAddress.toString(), einformationclass, pinfobuffer.rawAddress.toString(), cbbuffer.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsTerminateReadLog(pvcursorcontext: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsTerminateReadLog(pvcursorcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsWriteRestartArea(pvmarshalcontext: MutPtr<CVoid>, pvrestartbuffer: ConstPtr<CVoid>, cbrestartbuffer: UInt, plsnbase: ConstPtr<ClsLsn>, fflags: UInt, pcbwritten: MutPtr<UInt>, plsnnext: MutPtr<ClsLsn>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesClfsWriteRestartArea(pvmarshalcontext.rawAddress.toString(), pvrestartbuffer.rawAddress.toString(), cbrestartbuffer.toInt(), plsnbase.rawAddress.toString(), fflags.toInt(), pcbwritten.rawAddress.toString(), plsnnext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmCallbackGetKeyObjectID(cookie: ConstPtr<Long>, obj: ConstPtr<CVoid>, objectid: MutPtr<ULong>, objectname: MutPtr<MutPtr<UnicodeString>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesCmCallbackGetKeyObjectID(cookie.rawAddress.toString(), obj.rawAddress.toString(), objectid.rawAddress.toString(), objectname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmCallbackGetKeyObjectIDEx(cookie: ConstPtr<Long>, obj: ConstPtr<CVoid>, objectid: MutPtr<ULong>, objectname: MutPtr<MutPtr<UnicodeString>>, flags: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesCmCallbackGetKeyObjectIDEx(cookie.rawAddress.toString(), obj.rawAddress.toString(), objectid.rawAddress.toString(), objectname.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmCallbackReleaseKeyObjectIDEx(objectname: ConstPtr<UnicodeString>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesCmCallbackReleaseKeyObjectIDEx(objectname.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun cmGetBoundTransaction(cookie: ConstPtr<Long>, obj: ConstPtr<CVoid>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesCmGetBoundTransaction(cookie.rawAddress.toString(), obj.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetCallbackVersion(major: MutPtr<UInt>, minor: MutPtr<UInt>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesCmGetCallbackVersion(major.rawAddress.toString(), minor.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun cmRegisterCallback(function: PexCallbackFunction, context: ConstPtr<CVoid>, cookie: MutPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesCmRegisterCallback(0L.toString(), context.rawAddress.toString(), cookie.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRegisterCallbackEx(function: PexCallbackFunction, altitude: ConstPtr<UnicodeString>, driver: ConstPtr<CVoid>, context: ConstPtr<CVoid>, cookie: MutPtr<Long>, reserved: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesCmRegisterCallbackEx(0L.toString(), altitude.rawAddress.toString(), driver.rawAddress.toString(), context.rawAddress.toString(), cookie.rawAddress.toString(), reserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetCallbackObjectContext(obj: MutPtr<CVoid>, cookie: ConstPtr<Long>, newcontext: ConstPtr<CVoid>, oldcontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesCmSetCallbackObjectContext(obj.rawAddress.toString(), cookie.rawAddress.toString(), newcontext.rawAddress.toString(), oldcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmUnRegisterCallback(cookie: Long): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesCmUnRegisterCallback(cookie.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dbgBreakPointWithStatus(status: UInt) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesDbgBreakPointWithStatus(status.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dbgPrint(format: Pcstr, vararg variadicArgs: Long): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesDbgPrint(format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dbgPrintEx(componentid: UInt, level: UInt, format: Pcstr, vararg variadicArgs: Long): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesDbgPrintEx(componentid.toInt(), level.toInt(), format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dbgPrintReturnControlC(format: Pcstr, vararg variadicArgs: Long): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesDbgPrintReturnControlC(format.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dbgPrompt(prompt: Pcstr, response: Pstr, length: UInt): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesDbgPrompt(prompt.rawAddress.toString(), response.rawAddress.toString(), length.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dbgQueryDebugFilterState(componentid: UInt, level: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesDbgQueryDebugFilterState(componentid.toInt(), level.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dbgSetDebugFilterState(componentid: UInt, level: UInt, state: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesDbgSetDebugFilterState(componentid.toInt(), level.toInt(), state) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dbgSetDebugPrintCallback(debugprintcallback: PdebugPrintCallback, enable: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesDbgSetDebugPrintCallback(0L.toString(), enable) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun etwActivityIdControl(controlcode: UInt, activityid: MutPtr<Guid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesEtwActivityIdControl(controlcode.toInt(), activityid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun etwEventEnabled(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesEtwEventEnabled(reghandle.toString(), eventdescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun etwProviderEnabled(reghandle: Reghandle, level: UByte, keyword: ULong): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesEtwProviderEnabled(reghandle.toString(), level.toInt(), keyword.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun etwRegister(providerid: ConstPtr<Guid>, enablecallback: Petwenablecallback, callbackcontext: ConstPtr<CVoid>, reghandle: MutPtr<Reghandle>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesEtwRegister(providerid.rawAddress.toString(), 0L.toString(), callbackcontext.rawAddress.toString(), reghandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun etwSetInformation(reghandle: Reghandle, informationclass: EventInfoClass, eventinformation: ConstPtr<CVoid>, informationlength: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesEtwSetInformation(reghandle.toString(), informationclass, eventinformation.rawAddress.toString(), informationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun etwUnregister(reghandle: Reghandle): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesEtwUnregister(reghandle.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun etwWrite(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>, activityid: ConstPtr<Guid>, userdatacount: UInt, userdata: ConstPtr<EventDataDescriptor>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesEtwWrite(reghandle.toString(), eventdescriptor.rawAddress.toString(), activityid.rawAddress.toString(), userdatacount.toInt(), userdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun etwWriteEx(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>, filter: ULong, flags: UInt, activityid: ConstPtr<Guid>, relatedactivityid: ConstPtr<Guid>, userdatacount: UInt, userdata: ConstPtr<EventDataDescriptor>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesEtwWriteEx(reghandle.toString(), eventdescriptor.rawAddress.toString(), filter.toString(), flags.toInt(), activityid.rawAddress.toString(), relatedactivityid.rawAddress.toString(), userdatacount.toInt(), userdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun etwWriteString(reghandle: Reghandle, level: UByte, keyword: ULong, activityid: ConstPtr<Guid>, string: Pcwstr): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesEtwWriteString(reghandle.toString(), level.toInt(), keyword.toString(), activityid.rawAddress.toString(), string.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun etwWriteTransfer(reghandle: Reghandle, eventdescriptor: ConstPtr<EventDescriptor>, activityid: ConstPtr<Guid>, relatedactivityid: ConstPtr<Guid>, userdatacount: UInt, userdata: ConstPtr<EventDataDescriptor>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesEtwWriteTransfer(reghandle.toString(), eventdescriptor.rawAddress.toString(), activityid.rawAddress.toString(), relatedactivityid.rawAddress.toString(), userdatacount.toInt(), userdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAcquireFastMutex(fastmutex: MutPtr<FastMutex>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExAcquireFastMutex(fastmutex.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exAcquireFastMutexUnsafe(fastmutex: MutPtr<FastMutex>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExAcquireFastMutexUnsafe(fastmutex.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exAcquirePushLockExclusiveEx(pushlock: MutPtr<ULong>, flags: UInt) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExAcquirePushLockExclusiveEx(pushlock.rawAddress.toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exAcquirePushLockSharedEx(pushlock: MutPtr<ULong>, flags: UInt) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExAcquirePushLockSharedEx(pushlock.rawAddress.toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exAcquireResourceExclusiveLite(resource: MutPtr<Eresource>, wait: Boolean): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExAcquireResourceExclusiveLite(resource.rawAddress.toString(), wait) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAcquireResourceSharedLite(resource: MutPtr<Eresource>, wait: Boolean): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExAcquireResourceSharedLite(resource.rawAddress.toString(), wait) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAcquireRundownProtection(runref: MutPtr<ExRundownRef>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExAcquireRundownProtection(runref.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAcquireRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExAcquireRundownProtectionCacheAware(runrefcacheaware.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAcquireRundownProtectionCacheAwareEx(runrefcacheaware: PexRundownRefCacheAware, count: UInt): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExAcquireRundownProtectionCacheAwareEx(runrefcacheaware.toString(), count.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAcquireRundownProtectionEx(runref: MutPtr<ExRundownRef>, count: UInt): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExAcquireRundownProtectionEx(runref.rawAddress.toString(), count.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAcquireSharedStarveExclusive(resource: MutPtr<Eresource>, wait: Boolean): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExAcquireSharedStarveExclusive(resource.rawAddress.toString(), wait) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAcquireSharedWaitForExclusive(resource: MutPtr<Eresource>, wait: Boolean): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExAcquireSharedWaitForExclusive(resource.rawAddress.toString(), wait) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAcquireSpinLockExclusive(spinlock: MutPtr<Int>): UByte =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExAcquireSpinLockExclusive(spinlock.rawAddress.toString()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAcquireSpinLockExclusiveAtDpcLevel(spinlock: MutPtr<Int>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExAcquireSpinLockExclusiveAtDpcLevel(spinlock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exAcquireSpinLockShared(spinlock: MutPtr<Int>): UByte =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExAcquireSpinLockShared(spinlock.rawAddress.toString()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAcquireSpinLockSharedAtDpcLevel(spinlock: MutPtr<Int>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExAcquireSpinLockSharedAtDpcLevel(spinlock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exAllocateCacheAwareRundownProtection(pooltype: PoolType, pooltag: UInt): PexRundownRefCacheAware =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExAllocateCacheAwareRundownProtection(pooltype, pooltag.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAllocatePool(pooltype: PoolType, numberofbytes: ULong): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesExAllocatePool(pooltype, numberofbytes.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAllocatePool2(flags: ULong, numberofbytes: ULong, tag: UInt): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesExAllocatePool2(flags.toString(), numberofbytes.toString(), tag.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAllocatePool3(flags: ULong, numberofbytes: ULong, tag: UInt, extendedparameters: ConstPtr<PoolExtendedParameter>, extendedparameterscount: UInt): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesExAllocatePool3(flags.toString(), numberofbytes.toString(), tag.toInt(), extendedparameters.rawAddress.toString(), extendedparameterscount.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAllocatePoolWithQuota(pooltype: PoolType, numberofbytes: ULong): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesExAllocatePoolWithQuota(pooltype, numberofbytes.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAllocatePoolWithQuotaTag(pooltype: PoolType, numberofbytes: ULong, tag: UInt): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesExAllocatePoolWithQuotaTag(pooltype, numberofbytes.toString(), tag.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAllocatePoolWithTag(pooltype: PoolType, numberofbytes: ULong, tag: UInt): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesExAllocatePoolWithTag(pooltype, numberofbytes.toString(), tag.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAllocatePoolWithTagPriority(pooltype: PoolType, numberofbytes: ULong, tag: UInt, priority: ExPoolPriority): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesExAllocatePoolWithTagPriority(pooltype, numberofbytes.toString(), tag.toInt(), priority).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAllocateTimer(callback: PextCallback, callbackcontext: ConstPtr<CVoid>, attributes: UInt): PexTimer =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExAllocateTimer(0L.toString(), callbackcontext.rawAddress.toString(), attributes.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exCancelTimer(timer: PexTimer, parameters: ConstPtr<CVoid>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExCancelTimer(timer.toString(), parameters.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exCleanupRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExCleanupRundownProtectionCacheAware(runrefcacheaware.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exConvertExclusiveToSharedLite(resource: MutPtr<Eresource>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExConvertExclusiveToSharedLite(resource.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exCreateCallback(callbackobject: MutPtr<PcallbackObject>, objectattributes: ConstPtr<ObjectAttributes>, create: Boolean, allowmultiplecallbacks: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExCreateCallback(callbackobject.rawAddress.toString(), objectattributes.rawAddress.toString(), create, allowmultiplecallbacks) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exCreatePool(flags: UInt, tag: ULong, params: ConstPtr<PoolCreateExtendedParams>, poolhandle: MutPtr<Handle>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExCreatePool(flags.toInt(), tag.toString(), params.rawAddress.toString(), poolhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exDeleteResourceLite(resource: MutPtr<Eresource>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExDeleteResourceLite(resource.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exDeleteTimer(timer: PexTimer, cancel: Boolean, wait: Boolean, parameters: ConstPtr<ExtDeleteParameters>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExDeleteTimer(timer.toString(), cancel, wait, parameters.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exDestroyPool(poolhandle: Handle) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExDestroyPool(poolhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exEnterCriticalRegionAndAcquireResourceExclusive(resource: MutPtr<Eresource>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesExEnterCriticalRegionAndAcquireResourceExclusive(resource.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exEnterCriticalRegionAndAcquireResourceShared(resource: MutPtr<Eresource>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesExEnterCriticalRegionAndAcquireResourceShared(resource.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exEnterCriticalRegionAndAcquireSharedWaitForExclusive(resource: MutPtr<Eresource>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesExEnterCriticalRegionAndAcquireSharedWaitForExclusive(resource.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exEnumerateSystemFirmwareTables(firmwaretableprovidersignature: UInt, firmwaretablebuffer: MutPtr<CVoid>, bufferlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExEnumerateSystemFirmwareTables(firmwaretableprovidersignature.toInt(), firmwaretablebuffer.rawAddress.toString(), bufferlength.toInt(), returnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exExtendZone(zone: MutPtr<ZoneHeader>, segment: MutPtr<CVoid>, segmentsize: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExExtendZone(zone.rawAddress.toString(), segment.rawAddress.toString(), segmentsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exFreeCacheAwareRundownProtection(runrefcacheaware: PexRundownRefCacheAware) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExFreeCacheAwareRundownProtection(runrefcacheaware.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exFreePool(p: MutPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExFreePool(p.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exFreePool2(p: MutPtr<CVoid>, tag: UInt, extendedparameters: ConstPtr<PoolExtendedParameter>, extendedparameterscount: UInt) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExFreePool2(p.rawAddress.toString(), tag.toInt(), extendedparameters.rawAddress.toString(), extendedparameterscount.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exFreePoolWithTag(p: MutPtr<CVoid>, tag: UInt) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExFreePoolWithTag(p.rawAddress.toString(), tag.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exGetExclusiveWaiterCount(resource: ConstPtr<Eresource>): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExGetExclusiveWaiterCount(resource.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exGetFirmwareEnvironmentVariable(variablename: ConstPtr<UnicodeString>, vendorguid: ConstPtr<Guid>, value: MutPtr<CVoid>, valuelength: MutPtr<UInt>, attributes: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExGetFirmwareEnvironmentVariable(variablename.rawAddress.toString(), vendorguid.rawAddress.toString(), value.rawAddress.toString(), valuelength.rawAddress.toString(), attributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exGetFirmwareType(): FirmwareType =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExGetFirmwareType() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exGetPreviousMode(): Byte =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExGetPreviousMode().toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exGetSharedWaiterCount(resource: ConstPtr<Eresource>): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExGetSharedWaiterCount(resource.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exGetSystemFirmwareTable(firmwaretableprovidersignature: UInt, firmwaretableid: UInt, firmwaretablebuffer: MutPtr<CVoid>, bufferlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExGetSystemFirmwareTable(firmwaretableprovidersignature.toInt(), firmwaretableid.toInt(), firmwaretablebuffer.rawAddress.toString(), bufferlength.toInt(), returnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exInitializePushLock(pushlock: MutPtr<ULong>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExInitializePushLock(pushlock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exInitializeResourceLite(resource: MutPtr<Eresource>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExInitializeResourceLite(resource.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exInitializeRundownProtection(runref: MutPtr<ExRundownRef>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExInitializeRundownProtection(runref.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exInitializeRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware, runrefsize: ULong) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExInitializeRundownProtectionCacheAware(runrefcacheaware.toString(), runrefsize.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exInitializeRundownProtectionCacheAwareEx(runrefcacheaware: PexRundownRefCacheAware, flags: UInt) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExInitializeRundownProtectionCacheAwareEx(runrefcacheaware.toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exInitializeZone(zone: MutPtr<ZoneHeader>, blocksize: UInt, initialsegment: MutPtr<CVoid>, initialsegmentsize: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExInitializeZone(zone.rawAddress.toString(), blocksize.toInt(), initialsegment.rawAddress.toString(), initialsegmentsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exInterlockedAddLargeInteger(addend: MutPtr<Long>, increment: Long, lock: MutPtr<ULong>): Long =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExInterlockedAddLargeInteger(addend.rawAddress.toString(), increment.toString(), lock.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exInterlockedExtendZone(zone: MutPtr<ZoneHeader>, segment: MutPtr<CVoid>, segmentsize: UInt, lock: MutPtr<ULong>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExInterlockedExtendZone(zone.rawAddress.toString(), segment.rawAddress.toString(), segmentsize.toInt(), lock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exIsManufacturingModeEnabled(): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExIsManufacturingModeEnabled() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exIsProcessorFeaturePresent(processorfeature: UInt): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExIsProcessorFeaturePresent(processorfeature.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exIsResourceAcquiredExclusiveLite(resource: ConstPtr<Eresource>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExIsResourceAcquiredExclusiveLite(resource.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exIsResourceAcquiredSharedLite(resource: ConstPtr<Eresource>): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExIsResourceAcquiredSharedLite(resource.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exIsSoftBoot(): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExIsSoftBoot() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exLocalTimeToSystemTime(localtime: ConstPtr<Long>, systemtime: MutPtr<Long>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExLocalTimeToSystemTime(localtime.rawAddress.toString(), systemtime.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exNotifyCallback(callbackobject: ConstPtr<CVoid>, argument1: ConstPtr<CVoid>, argument2: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExNotifyCallback(callbackobject.rawAddress.toString(), argument1.rawAddress.toString(), argument2.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exQueryTimerResolution(maximumtime: MutPtr<UInt>, minimumtime: MutPtr<UInt>, currenttime: MutPtr<UInt>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExQueryTimerResolution(maximumtime.rawAddress.toString(), minimumtime.rawAddress.toString(), currenttime.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exQueueWorkItem(workitem: MutPtr<WorkQueueItem>, queuetype: WorkQueueType) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExQueueWorkItem(workitem.rawAddress.toString(), queuetype)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exRaiseAccessViolation() {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExRaiseAccessViolation()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exRaiseDatatypeMisalignment() {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExRaiseDatatypeMisalignment()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exRaiseStatus(status: Ntstatus) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExRaiseStatus(status)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReInitializeRundownProtection(runref: MutPtr<ExRundownRef>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExReInitializeRundownProtection(runref.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReInitializeRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExReInitializeRundownProtectionCacheAware(runrefcacheaware.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exRegisterCallback(callbackobject: PcallbackObject, callbackfunction: PcallbackFunction, callbackcontext: ConstPtr<CVoid>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesExRegisterCallback(callbackobject.toString(), 0L.toString(), callbackcontext.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exReinitializeResourceLite(resource: MutPtr<Eresource>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExReinitializeResourceLite(resource.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exReleaseFastMutex(fastmutex: MutPtr<FastMutex>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExReleaseFastMutex(fastmutex.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReleaseFastMutexUnsafe(fastmutex: MutPtr<FastMutex>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExReleaseFastMutexUnsafe(fastmutex.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReleasePushLockExclusiveEx(pushlock: MutPtr<ULong>, flags: UInt) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExReleasePushLockExclusiveEx(pushlock.rawAddress.toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReleasePushLockSharedEx(pushlock: MutPtr<ULong>, flags: UInt) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExReleasePushLockSharedEx(pushlock.rawAddress.toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReleaseResourceAndLeaveCriticalRegion(resource: MutPtr<Eresource>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExReleaseResourceAndLeaveCriticalRegion(resource.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReleaseResourceForThreadLite(resource: MutPtr<Eresource>, resourcethreadid: ULong) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExReleaseResourceForThreadLite(resource.rawAddress.toString(), resourcethreadid.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReleaseResourceLite(resource: MutPtr<Eresource>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExReleaseResourceLite(resource.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReleaseRundownProtection(runref: MutPtr<ExRundownRef>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExReleaseRundownProtection(runref.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReleaseRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExReleaseRundownProtectionCacheAware(runrefcacheaware.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReleaseRundownProtectionCacheAwareEx(runref: PexRundownRefCacheAware, count: UInt) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExReleaseRundownProtectionCacheAwareEx(runref.toString(), count.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReleaseRundownProtectionEx(runref: MutPtr<ExRundownRef>, count: UInt) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExReleaseRundownProtectionEx(runref.rawAddress.toString(), count.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReleaseSpinLockExclusive(spinlock: MutPtr<Int>, oldirql: UByte) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExReleaseSpinLockExclusive(spinlock.rawAddress.toString(), oldirql.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReleaseSpinLockExclusiveFromDpcLevel(spinlock: MutPtr<Int>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExReleaseSpinLockExclusiveFromDpcLevel(spinlock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReleaseSpinLockShared(spinlock: MutPtr<Int>, oldirql: UByte) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExReleaseSpinLockShared(spinlock.rawAddress.toString(), oldirql.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReleaseSpinLockSharedFromDpcLevel(spinlock: MutPtr<Int>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExReleaseSpinLockSharedFromDpcLevel(spinlock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exRundownCompleted(runref: MutPtr<ExRundownRef>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExRundownCompleted(runref.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exRundownCompletedCacheAware(runrefcacheaware: PexRundownRefCacheAware) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExRundownCompletedCacheAware(runrefcacheaware.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exSecurePoolUpdate(securepoolhandle: Handle, tag: UInt, allocation: ConstPtr<CVoid>, cookie: ULong, offset: ULong, size: ULong, buffer: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExSecurePoolUpdate(securepoolhandle.rawAddress.toString(), tag.toInt(), allocation.rawAddress.toString(), cookie.toString(), offset.toString(), size.toString(), buffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exSecurePoolValidate(securepoolhandle: Handle, tag: UInt, allocation: ConstPtr<CVoid>, cookie: ULong): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExSecurePoolValidate(securepoolhandle.rawAddress.toString(), tag.toInt(), allocation.rawAddress.toString(), cookie.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exSetFirmwareEnvironmentVariable(variablename: ConstPtr<UnicodeString>, vendorguid: ConstPtr<Guid>, value: ConstPtr<CVoid>, valuelength: UInt, attributes: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExSetFirmwareEnvironmentVariable(variablename.rawAddress.toString(), vendorguid.rawAddress.toString(), value.rawAddress.toString(), valuelength.toInt(), attributes.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exSetResourceOwnerPointer(resource: MutPtr<Eresource>, ownerpointer: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExSetResourceOwnerPointer(resource.rawAddress.toString(), ownerpointer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exSetResourceOwnerPointerEx(resource: MutPtr<Eresource>, ownerpointer: ConstPtr<CVoid>, flags: UInt) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExSetResourceOwnerPointerEx(resource.rawAddress.toString(), ownerpointer.rawAddress.toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exSetTimer(timer: PexTimer, duetime: Long, period: Long, parameters: ConstPtr<ExtSetParametersV0>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExSetTimer(timer.toString(), duetime.toString(), period.toString(), parameters.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exSetTimerResolution(desiredtime: UInt, setresolution: Boolean): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExSetTimerResolution(desiredtime.toInt(), setresolution).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exSizeOfRundownProtectionCacheAware(): ULong =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExSizeOfRundownProtectionCacheAware().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exSystemTimeToLocalTime(systemtime: ConstPtr<Long>, localtime: MutPtr<Long>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExSystemTimeToLocalTime(systemtime.rawAddress.toString(), localtime.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exTryAcquireSpinLockExclusiveAtDpcLevel(spinlock: MutPtr<Int>): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExTryAcquireSpinLockExclusiveAtDpcLevel(spinlock.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exTryAcquireSpinLockSharedAtDpcLevel(spinlock: MutPtr<Int>): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExTryAcquireSpinLockSharedAtDpcLevel(spinlock.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exTryConvertSharedSpinLockExclusive(spinlock: MutPtr<Int>): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExTryConvertSharedSpinLockExclusive(spinlock.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exTryToAcquireFastMutex(fastmutex: MutPtr<FastMutex>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExTryToAcquireFastMutex(fastmutex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exUnregisterCallback(callbackregistration: MutPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExUnregisterCallback(callbackregistration.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exUuidCreate(uuid: MutPtr<Guid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExUuidCreate(uuid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exVerifySuite(suitetype: SuiteType): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesExVerifySuite(suitetype) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exWaitForRundownProtectionRelease(runref: MutPtr<ExRundownRef>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExWaitForRundownProtectionRelease(runref.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exWaitForRundownProtectionReleaseCacheAware(runref: PexRundownRefCacheAware) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesExWaitForRundownProtectionReleaseCacheAware(runref.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlIsTotalDeviceFailure(status: Ntstatus): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesFsRtlIsTotalDeviceFailure(status) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halAcquireDisplayOwnership(resetdisplayparameters: PhalResetDisplayParameters) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesHalAcquireDisplayOwnership(0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun halAllocateAdapterChannel(adapterobject: ConstPtr<AdapterObject>, wcb: ConstPtr<WaitContextBlock>, numberofmapregisters: UInt, executionroutine: DriverControl): Ntstatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halAllocateCommonBuffer(adapterobject: ConstPtr<AdapterObject>, length: UInt, logicaladdress: MutPtr<Long>, cacheenabled: Boolean): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesHalAllocateCommonBuffer(adapterobject.rawAddress.toString(), length.toInt(), logicaladdress.rawAddress.toString(), cacheenabled).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halAllocateCrashDumpRegisters(adapterobject: ConstPtr<AdapterObject>, numberofmapregisters: MutPtr<UInt>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesHalAllocateCrashDumpRegisters(adapterobject.rawAddress.toString(), numberofmapregisters.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halAllocateHardwareCounters(groupaffinty: ConstPtr<GroupAffinity>, groupcount: UInt, resourcelist: ConstPtr<PhysicalCounterResourceList>, countersethandle: MutPtr<Handle>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesHalAllocateHardwareCounters(groupaffinty.rawAddress.toString(), groupcount.toInt(), resourcelist.rawAddress.toString(), countersethandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halAssignSlotResources(registrypath: ConstPtr<UnicodeString>, driverclassname: ConstPtr<UnicodeString>, driverobject: ConstPtr<DriverObject>, deviceobject: ConstPtr<DeviceObject>, bustype: InterfaceType, busnumber: UInt, slotnumber: UInt, allocatedresources: MutPtr<MutPtr<CmResourceList>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesHalAssignSlotResources(registrypath.rawAddress.toString(), driverclassname.rawAddress.toString(), driverobject.rawAddress.toString(), deviceobject.rawAddress.toString(), bustype, busnumber.toInt(), slotnumber.toInt(), allocatedresources.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halBugCheckSystem(errorsource: ConstPtr<WheaErrorSourceDescriptor>, errorrecord: ConstPtr<WheaErrorRecord>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesHalBugCheckSystem(errorsource.rawAddress.toString(), errorrecord.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun halDmaAllocateCrashDumpRegistersEx(adapter: ConstPtr<AdapterObject>, numberofmapregisters: UInt, type: HalDmaCrashDumpRegisterType, mapregisterbase: MutPtr<MutPtr<CVoid>>, mapregistersavailable: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesHalDmaAllocateCrashDumpRegistersEx(adapter.rawAddress.toString(), numberofmapregisters.toInt(), type, mapregisterbase.rawAddress.toString(), mapregistersavailable.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halDmaFreeCrashDumpRegistersEx(adapter: ConstPtr<AdapterObject>, type: HalDmaCrashDumpRegisterType): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesHalDmaFreeCrashDumpRegistersEx(adapter.rawAddress.toString(), type) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halExamineMBR(deviceobject: ConstPtr<DeviceObject>, sectorsize: UInt, mbrtypeidentifier: UInt, buffer: MutPtr<MutPtr<CVoid>>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesHalExamineMBR(deviceobject.rawAddress.toString(), sectorsize.toInt(), mbrtypeidentifier.toInt(), buffer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun halFreeCommonBuffer(adapterobject: ConstPtr<AdapterObject>, length: UInt, logicaladdress: Long, virtualaddress: ConstPtr<CVoid>, cacheenabled: Boolean) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesHalFreeCommonBuffer(adapterobject.rawAddress.toString(), length.toInt(), logicaladdress.toString(), virtualaddress.rawAddress.toString(), cacheenabled)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun halFreeHardwareCounters(countersethandle: Handle): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesHalFreeHardwareCounters(countersethandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halGetAdapter(devicedescription: ConstPtr<DeviceDescription>, numberofmapregisters: MutPtr<UInt>): MutPtr<AdapterObject> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesHalGetAdapter(devicedescription.rawAddress.toString(), numberofmapregisters.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halGetBusData(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: MutPtr<CVoid>, length: UInt): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesHalGetBusData(busdatatype, busnumber.toInt(), slotnumber.toInt(), buffer.rawAddress.toString(), length.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halGetBusDataByOffset(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: MutPtr<CVoid>, offset: UInt, length: UInt): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesHalGetBusDataByOffset(busdatatype, busnumber.toInt(), slotnumber.toInt(), buffer.rawAddress.toString(), offset.toInt(), length.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halGetInterruptVector(interfacetype: InterfaceType, busnumber: UInt, businterruptlevel: UInt, businterruptvector: UInt, irql: MutPtr<UByte>, affinity: MutPtr<ULong>): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesHalGetInterruptVector(interfacetype, busnumber.toInt(), businterruptlevel.toInt(), businterruptvector.toInt(), irql.rawAddress.toString(), affinity.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halMakeBeep(frequency: UInt): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesHalMakeBeep(frequency.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halReadDmaCounter(adapterobject: ConstPtr<AdapterObject>): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesHalReadDmaCounter(adapterobject.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halSetBusData(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: ConstPtr<CVoid>, length: UInt): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesHalSetBusData(busdatatype, busnumber.toInt(), slotnumber.toInt(), buffer.rawAddress.toString(), length.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halSetBusDataByOffset(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: ConstPtr<CVoid>, offset: UInt, length: UInt): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesHalSetBusDataByOffset(busdatatype, busnumber.toInt(), slotnumber.toInt(), buffer.rawAddress.toString(), offset.toInt(), length.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halTranslateBusAddress(interfacetype: InterfaceType, busnumber: UInt, busaddress: Long, addressspace: MutPtr<UInt>, translatedaddress: MutPtr<Long>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesHalTranslateBusAddress(interfacetype, busnumber.toInt(), busaddress.toString(), addressspace.rawAddress.toString(), translatedaddress.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hvlRegisterWheaErrorNotification(callback: PhvlWheaErrorNotification): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesHvlRegisterWheaErrorNotification(0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hvlUnregisterWheaErrorNotification(callback: PhvlWheaErrorNotification): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesHvlUnregisterWheaErrorNotification(0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAcquireCancelSpinLock(irql: MutPtr<UByte>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoAcquireCancelSpinLock(irql.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioAcquireKsrPersistentMemory(driverobject: ConstPtr<DriverObject>, physicaldeviceobject: ConstPtr<DeviceObject>, buffer: MutPtr<CVoid>, size: MutPtr<ULong>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoAcquireKsrPersistentMemory(driverobject.rawAddress.toString(), physicaldeviceobject.rawAddress.toString(), buffer.rawAddress.toString(), size.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAcquireKsrPersistentMemoryEx(driverobject: ConstPtr<DriverObject>, physicaldeviceobject: ConstPtr<DeviceObject>, physicaldeviceid: ConstPtr<UnicodeString>, datatag: ConstPtr<UShort>, dataversion: MutPtr<UInt>, buffer: MutPtr<CVoid>, size: MutPtr<ULong>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoAcquireKsrPersistentMemoryEx(driverobject.rawAddress.toString(), physicaldeviceobject.rawAddress.toString(), physicaldeviceid.rawAddress.toString(), datatag.rawAddress.toString(), dataversion.rawAddress.toString(), buffer.rawAddress.toString(), size.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAcquireRemoveLockEx(removelock: MutPtr<IoRemoveLock>, tag: ConstPtr<CVoid>, file: Pcstr, line: UInt, remlocksize: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoAcquireRemoveLockEx(removelock.rawAddress.toString(), tag.rawAddress.toString(), file.rawAddress.toString(), line.toInt(), remlocksize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAllocateAdapterChannel(adapterobject: ConstPtr<AdapterObject>, deviceobject: ConstPtr<DeviceObject>, numberofmapregisters: UInt, executionroutine: DriverControl, context: ConstPtr<CVoid>): Ntstatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAllocateController(controllerobject: ConstPtr<ControllerObject>, deviceobject: ConstPtr<DeviceObject>, executionroutine: DriverControl, context: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAllocateDriverObjectExtension(driverobject: ConstPtr<DriverObject>, clientidentificationaddress: ConstPtr<CVoid>, driverobjectextensionsize: UInt, driverobjectextension: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoAllocateDriverObjectExtension(driverobject.rawAddress.toString(), clientidentificationaddress.rawAddress.toString(), driverobjectextensionsize.toInt(), driverobjectextension.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAllocateErrorLogEntry(ioobject: ConstPtr<CVoid>, entrysize: UByte): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesIoAllocateErrorLogEntry(ioobject.rawAddress.toString(), entrysize.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAllocateIrp(stacksize: Byte, chargequota: Boolean): MutPtr<Irp> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesIoAllocateIrp(stacksize.toInt(), chargequota).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAllocateIrpEx(deviceobject: ConstPtr<DeviceObject>, stacksize: Byte, chargequota: Boolean): MutPtr<Irp> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesIoAllocateIrpEx(deviceobject.rawAddress.toString(), stacksize.toInt(), chargequota).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAllocateMdl(virtualaddress: ConstPtr<CVoid>, length: UInt, secondarybuffer: Boolean, chargequota: Boolean, irp: MutPtr<Irp>): MutPtr<Mdl> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesIoAllocateMdl(virtualaddress.rawAddress.toString(), length.toInt(), secondarybuffer, chargequota, irp.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAllocateSfioStreamIdentifier(fileobject: ConstPtr<FileObject>, length: UInt, signature: ConstPtr<CVoid>, streamidentifier: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoAllocateSfioStreamIdentifier(fileobject.rawAddress.toString(), length.toInt(), signature.rawAddress.toString(), streamidentifier.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAllocateWorkItem(deviceobject: ConstPtr<DeviceObject>): PioWorkitem =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoAllocateWorkItem(deviceobject.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAssignResources(registrypath: ConstPtr<UnicodeString>, driverclassname: ConstPtr<UnicodeString>, driverobject: ConstPtr<DriverObject>, deviceobject: ConstPtr<DeviceObject>, requestedresources: ConstPtr<IoResourceRequirementsList>, allocatedresources: MutPtr<MutPtr<CmResourceList>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoAssignResources(registrypath.rawAddress.toString(), driverclassname.rawAddress.toString(), driverobject.rawAddress.toString(), deviceobject.rawAddress.toString(), requestedresources.rawAddress.toString(), allocatedresources.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAttachDevice(sourcedevice: ConstPtr<DeviceObject>, targetdevice: ConstPtr<UnicodeString>, attacheddevice: MutPtr<MutPtr<DeviceObject>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoAttachDevice(sourcedevice.rawAddress.toString(), targetdevice.rawAddress.toString(), attacheddevice.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAttachDeviceByPointer(sourcedevice: ConstPtr<DeviceObject>, targetdevice: ConstPtr<DeviceObject>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoAttachDeviceByPointer(sourcedevice.rawAddress.toString(), targetdevice.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAttachDeviceToDeviceStack(sourcedevice: ConstPtr<DeviceObject>, targetdevice: ConstPtr<DeviceObject>): MutPtr<DeviceObject> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesIoAttachDeviceToDeviceStack(sourcedevice.rawAddress.toString(), targetdevice.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAttachDeviceToDeviceStackSafe(sourcedevice: ConstPtr<DeviceObject>, targetdevice: ConstPtr<DeviceObject>, attachedtodeviceobject: MutPtr<MutPtr<DeviceObject>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoAttachDeviceToDeviceStackSafe(sourcedevice.rawAddress.toString(), targetdevice.rawAddress.toString(), attachedtodeviceobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioBuildAsynchronousFsdRequest(majorfunction: UInt, deviceobject: ConstPtr<DeviceObject>, buffer: MutPtr<CVoid>, length: UInt, startingoffset: ConstPtr<Long>, iostatusblock: ConstPtr<IoStatusBlock>): MutPtr<Irp> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesIoBuildAsynchronousFsdRequest(majorfunction.toInt(), deviceobject.rawAddress.toString(), buffer.rawAddress.toString(), length.toInt(), startingoffset.rawAddress.toString(), iostatusblock.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioBuildDeviceIoControlRequest(iocontrolcode: UInt, deviceobject: ConstPtr<DeviceObject>, inputbuffer: ConstPtr<CVoid>, inputbufferlength: UInt, outputbuffer: MutPtr<CVoid>, outputbufferlength: UInt, internaldeviceiocontrol: Boolean, event: ConstPtr<Kevent>, iostatusblock: MutPtr<IoStatusBlock>): MutPtr<Irp> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesIoBuildDeviceIoControlRequest(iocontrolcode.toInt(), deviceobject.rawAddress.toString(), inputbuffer.rawAddress.toString(), inputbufferlength.toInt(), outputbuffer.rawAddress.toString(), outputbufferlength.toInt(), internaldeviceiocontrol, event.rawAddress.toString(), iostatusblock.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioBuildPartialMdl(sourcemdl: ConstPtr<Mdl>, targetmdl: MutPtr<Mdl>, virtualaddress: MutPtr<CVoid>, length: UInt) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoBuildPartialMdl(sourcemdl.rawAddress.toString(), targetmdl.rawAddress.toString(), virtualaddress.rawAddress.toString(), length.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioBuildSynchronousFsdRequest(majorfunction: UInt, deviceobject: ConstPtr<DeviceObject>, buffer: MutPtr<CVoid>, length: UInt, startingoffset: ConstPtr<Long>, event: ConstPtr<Kevent>, iostatusblock: MutPtr<IoStatusBlock>): MutPtr<Irp> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesIoBuildSynchronousFsdRequest(majorfunction.toInt(), deviceobject.rawAddress.toString(), buffer.rawAddress.toString(), length.toInt(), startingoffset.rawAddress.toString(), event.rawAddress.toString(), iostatusblock.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCancelFileOpen(deviceobject: ConstPtr<DeviceObject>, fileobject: ConstPtr<FileObject>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoCancelFileOpen(deviceobject.rawAddress.toString(), fileobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioCancelIrp(irp: ConstPtr<Irp>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoCancelIrp(irp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCheckLinkShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: MutPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, linkshareaccess: MutPtr<LinkShareAccess>, ioshareaccessflags: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoCheckLinkShareAccess(desiredaccess.toInt(), desiredshareaccess.toInt(), fileobject.rawAddress.toString(), shareaccess.rawAddress.toString(), linkshareaccess.rawAddress.toString(), ioshareaccessflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCheckShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: MutPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, update: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoCheckShareAccess(desiredaccess.toInt(), desiredshareaccess.toInt(), fileobject.rawAddress.toString(), shareaccess.rawAddress.toString(), update) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCheckShareAccessEx(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: MutPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, update: Boolean, writepermission: ConstPtr<Boolean>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoCheckShareAccessEx(desiredaccess.toInt(), desiredshareaccess.toInt(), fileobject.rawAddress.toString(), shareaccess.rawAddress.toString(), update, writepermission.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCleanupIrp(irp: MutPtr<Irp>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoCleanupIrp(irp.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioClearActivityIdThread(originalid: ConstPtr<Guid>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoClearActivityIdThread(originalid.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioClearIrpExtraCreateParameter(irp: MutPtr<Irp>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoClearIrpExtraCreateParameter(irp.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioConnectInterrupt(interruptobject: MutPtr<Pkinterrupt>, serviceroutine: PkserviceRoutine, servicecontext: ConstPtr<CVoid>, spinlock: ConstPtr<ULong>, vector: UInt, irql: UByte, synchronizeirql: UByte, interruptmode: KinterruptMode, sharevector: Boolean, processorenablemask: ULong, floatingsave: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoConnectInterrupt(interruptobject.rawAddress.toString(), 0L.toString(), servicecontext.rawAddress.toString(), spinlock.rawAddress.toString(), vector.toInt(), irql.toInt(), synchronizeirql.toInt(), interruptmode, sharevector, processorenablemask.toString(), floatingsave) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioConnectInterruptEx(parameters: MutPtr<IoConnectInterruptParameters>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoConnectInterruptEx(parameters.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateController(size: UInt): MutPtr<ControllerObject> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesIoCreateController(size.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateDevice(driverobject: ConstPtr<DriverObject>, deviceextensionsize: UInt, devicename: ConstPtr<UnicodeString>, devicetype: UInt, devicecharacteristics: UInt, exclusive: Boolean, deviceobject: MutPtr<MutPtr<DeviceObject>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoCreateDevice(driverobject.rawAddress.toString(), deviceextensionsize.toInt(), devicename.rawAddress.toString(), devicetype.toInt(), devicecharacteristics.toInt(), exclusive, deviceobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateDisk(deviceobject: ConstPtr<DeviceObject>, disk: ConstPtr<CreateDisk>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoCreateDisk(deviceobject.rawAddress.toString(), disk.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateFile(filehandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, allocationsize: ConstPtr<Long>, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: ConstPtr<CVoid>, ealength: UInt, createfiletype: CreateFileType, internalparameters: ConstPtr<CVoid>, options: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoCreateFile(filehandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), iostatusblock.rawAddress.toString(), allocationsize.rawAddress.toString(), fileattributes.toInt(), shareaccess.toInt(), disposition.toInt(), createoptions.toInt(), eabuffer.rawAddress.toString(), ealength.toInt(), createfiletype, internalparameters.rawAddress.toString(), options.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateFileEx(filehandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, allocationsize: ConstPtr<Long>, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: ConstPtr<CVoid>, ealength: UInt, createfiletype: CreateFileType, internalparameters: ConstPtr<CVoid>, options: UInt, drivercontext: ConstPtr<IoDriverCreateContext>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoCreateFileEx(filehandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), iostatusblock.rawAddress.toString(), allocationsize.rawAddress.toString(), fileattributes.toInt(), shareaccess.toInt(), disposition.toInt(), createoptions.toInt(), eabuffer.rawAddress.toString(), ealength.toInt(), createfiletype, internalparameters.rawAddress.toString(), options.toInt(), drivercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateFileSpecifyDeviceObjectHint(filehandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, allocationsize: ConstPtr<Long>, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: ConstPtr<CVoid>, ealength: UInt, createfiletype: CreateFileType, internalparameters: ConstPtr<CVoid>, options: UInt, deviceobject: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoCreateFileSpecifyDeviceObjectHint(filehandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), iostatusblock.rawAddress.toString(), allocationsize.rawAddress.toString(), fileattributes.toInt(), shareaccess.toInt(), disposition.toInt(), createoptions.toInt(), eabuffer.rawAddress.toString(), ealength.toInt(), createfiletype, internalparameters.rawAddress.toString(), options.toInt(), deviceobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateNotificationEvent(eventname: ConstPtr<UnicodeString>, eventhandle: MutPtr<Handle>): MutPtr<Kevent> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesIoCreateNotificationEvent(eventname.rawAddress.toString(), eventhandle.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateSymbolicLink(symboliclinkname: ConstPtr<UnicodeString>, devicename: ConstPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoCreateSymbolicLink(symboliclinkname.rawAddress.toString(), devicename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateSynchronizationEvent(eventname: ConstPtr<UnicodeString>, eventhandle: MutPtr<Handle>): MutPtr<Kevent> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesIoCreateSynchronizationEvent(eventname.rawAddress.toString(), eventhandle.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateSystemThread(ioobject: MutPtr<CVoid>, threadhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, processhandle: Handle, clientid: MutPtr<ClientId>, startroutine: PkstartRoutine, startcontext: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoCreateSystemThread(ioobject.rawAddress.toString(), threadhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), processhandle.rawAddress.toString(), clientid.rawAddress.toString(), 0L.toString(), startcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateUnprotectedSymbolicLink(symboliclinkname: ConstPtr<UnicodeString>, devicename: ConstPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoCreateUnprotectedSymbolicLink(symboliclinkname.rawAddress.toString(), devicename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCsqInitialize(csq: MutPtr<IoCsq>, csqinsertirp: PioCsqInsertIrp, csqremoveirp: PioCsqRemoveIrp, csqpeeknextirp: PioCsqPeekNextIrp, csqacquirelock: PioCsqAcquireLock, csqreleaselock: PioCsqReleaseLock, csqcompletecanceledirp: PioCsqCompleteCanceledIrp): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoCsqInitialize(csq.rawAddress.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCsqInitializeEx(csq: MutPtr<IoCsq>, csqinsertirp: PioCsqInsertIrpEx, csqremoveirp: PioCsqRemoveIrp, csqpeeknextirp: PioCsqPeekNextIrp, csqacquirelock: PioCsqAcquireLock, csqreleaselock: PioCsqReleaseLock, csqcompletecanceledirp: PioCsqCompleteCanceledIrp): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoCsqInitializeEx(csq.rawAddress.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCsqInsertIrp(csq: MutPtr<IoCsq>, irp: MutPtr<Irp>, context: MutPtr<IoCsqIrpContext>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoCsqInsertIrp(csq.rawAddress.toString(), irp.rawAddress.toString(), context.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioCsqInsertIrpEx(csq: MutPtr<IoCsq>, irp: MutPtr<Irp>, context: MutPtr<IoCsqIrpContext>, insertcontext: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoCsqInsertIrpEx(csq.rawAddress.toString(), irp.rawAddress.toString(), context.rawAddress.toString(), insertcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCsqRemoveIrp(csq: MutPtr<IoCsq>, context: MutPtr<IoCsqIrpContext>): MutPtr<Irp> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesIoCsqRemoveIrp(csq.rawAddress.toString(), context.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCsqRemoveNextIrp(csq: MutPtr<IoCsq>, peekcontext: ConstPtr<CVoid>): MutPtr<Irp> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesIoCsqRemoveNextIrp(csq.rawAddress.toString(), peekcontext.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioDecrementKeepAliveCount(fileobject: MutPtr<FileObject>, process: Peprocess): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoDecrementKeepAliveCount(fileobject.rawAddress.toString(), process.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioDeleteController(controllerobject: ConstPtr<ControllerObject>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoDeleteController(controllerobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioDeleteDevice(deviceobject: ConstPtr<DeviceObject>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoDeleteDevice(deviceobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioDeleteSymbolicLink(symboliclinkname: ConstPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoDeleteSymbolicLink(symboliclinkname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioDetachDevice(targetdevice: MutPtr<DeviceObject>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoDetachDevice(targetdevice.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioDisconnectInterrupt(interruptobject: Pkinterrupt) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoDisconnectInterrupt(interruptobject.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioDisconnectInterruptEx(parameters: ConstPtr<IoDisconnectInterruptParameters>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoDisconnectInterruptEx(parameters.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioEnumerateKsrPersistentMemoryEx(driverobject: ConstPtr<DriverObject>, physicaldeviceobject: ConstPtr<DeviceObject>, physicaldeviceid: ConstPtr<UnicodeString>, callback: PioPersistedMemoryEnumerationCallback, callbackcontext: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoEnumerateKsrPersistentMemoryEx(driverobject.rawAddress.toString(), physicaldeviceobject.rawAddress.toString(), physicaldeviceid.rawAddress.toString(), 0L.toString(), callbackcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioFlushAdapterBuffers(adapterobject: ConstPtr<AdapterObject>, mdl: ConstPtr<Mdl>, mapregisterbase: ConstPtr<CVoid>, currentva: ConstPtr<CVoid>, length: UInt, writetodevice: Boolean): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoFlushAdapterBuffers(adapterobject.rawAddress.toString(), mdl.rawAddress.toString(), mapregisterbase.rawAddress.toString(), currentva.rawAddress.toString(), length.toInt(), writetodevice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioForwardIrpSynchronously(deviceobject: ConstPtr<DeviceObject>, irp: ConstPtr<Irp>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoForwardIrpSynchronously(deviceobject.rawAddress.toString(), irp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioFreeAdapterChannel(adapterobject: ConstPtr<AdapterObject>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoFreeAdapterChannel(adapterobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioFreeController(controllerobject: ConstPtr<ControllerObject>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoFreeController(controllerobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioFreeErrorLogEntry(elentry: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoFreeErrorLogEntry(elentry.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioFreeIrp(irp: ConstPtr<Irp>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoFreeIrp(irp.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioFreeKsrPersistentMemory(datahandle: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoFreeKsrPersistentMemory(datahandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioFreeMapRegisters(adapterobject: ConstPtr<AdapterObject>, mapregisterbase: ConstPtr<CVoid>, numberofmapregisters: UInt) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoFreeMapRegisters(adapterobject.rawAddress.toString(), mapregisterbase.rawAddress.toString(), numberofmapregisters.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioFreeMdl(mdl: MutPtr<Mdl>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoFreeMdl(mdl.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioFreeSfioStreamIdentifier(fileobject: ConstPtr<FileObject>, signature: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoFreeSfioStreamIdentifier(fileobject.rawAddress.toString(), signature.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioFreeWorkItem(ioworkitem: PioWorkitem) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoFreeWorkItem(ioworkitem.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioGetActivityIdIrp(irp: ConstPtr<Irp>, guid: MutPtr<Guid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoGetActivityIdIrp(irp.rawAddress.toString(), guid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetActivityIdThread(): MutPtr<Guid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesIoGetActivityIdThread().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetAffinityInterrupt(interruptobject: Pkinterrupt, groupaffinity: MutPtr<GroupAffinity>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoGetAffinityInterrupt(interruptobject.toString(), groupaffinity.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetAttachedDeviceReference(deviceobject: ConstPtr<DeviceObject>): MutPtr<DeviceObject> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesIoGetAttachedDeviceReference(deviceobject.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetBootDiskInformation(bootdiskinformation: MutPtr<BootdiskInformation>, size: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoGetBootDiskInformation(bootdiskinformation.rawAddress.toString(), size.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetBootDiskInformationLite(bootdiskinformation: MutPtr<MutPtr<BootdiskInformationLite>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoGetBootDiskInformationLite(bootdiskinformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetConfigurationInformation(): MutPtr<ConfigurationInformation> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesIoGetConfigurationInformation().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetContainerInformation(informationclass: IoContainerInformationClass, containerobject: ConstPtr<CVoid>, buffer: MutPtr<CVoid>, bufferlength: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoGetContainerInformation(informationclass, containerobject.rawAddress.toString(), buffer.rawAddress.toString(), bufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetCurrentProcess(): Peprocess =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoGetCurrentProcess().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetDeviceDirectory(physicaldeviceobject: ConstPtr<DeviceObject>, directorytype: DeviceDirectoryType, flags: UInt, reserved: ConstPtr<CVoid>, devicedirectoryhandle: MutPtr<Handle>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoGetDeviceDirectory(physicaldeviceobject.rawAddress.toString(), directorytype, flags.toInt(), reserved.rawAddress.toString(), devicedirectoryhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetDeviceInterfaceAlias(symboliclinkname: ConstPtr<UnicodeString>, aliasinterfaceclassguid: ConstPtr<Guid>, aliassymboliclinkname: MutPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoGetDeviceInterfaceAlias(symboliclinkname.rawAddress.toString(), aliasinterfaceclassguid.rawAddress.toString(), aliassymboliclinkname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetDeviceInterfacePropertyData(symboliclinkname: ConstPtr<UnicodeString>, propertykey: ConstPtr<Devpropkey>, lcid: UInt, flags: UInt, size: UInt, data: MutPtr<CVoid>, requiredsize: MutPtr<UInt>, type: MutPtr<Devproptype>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoGetDeviceInterfacePropertyData(symboliclinkname.rawAddress.toString(), propertykey.rawAddress.toString(), lcid.toInt(), flags.toInt(), size.toInt(), data.rawAddress.toString(), requiredsize.rawAddress.toString(), type.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetDeviceInterfaces(interfaceclassguid: ConstPtr<Guid>, physicaldeviceobject: ConstPtr<DeviceObject>, flags: UInt, symboliclinklist: MutPtr<Pwstr>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoGetDeviceInterfaces(interfaceclassguid.rawAddress.toString(), physicaldeviceobject.rawAddress.toString(), flags.toInt(), symboliclinklist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetDeviceNumaNode(pdo: ConstPtr<DeviceObject>, nodenumber: MutPtr<UShort>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoGetDeviceNumaNode(pdo.rawAddress.toString(), nodenumber.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetDeviceObjectPointer(objectname: ConstPtr<UnicodeString>, desiredaccess: UInt, fileobject: MutPtr<MutPtr<FileObject>>, deviceobject: MutPtr<MutPtr<DeviceObject>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoGetDeviceObjectPointer(objectname.rawAddress.toString(), desiredaccess.toInt(), fileobject.rawAddress.toString(), deviceobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetDeviceProperty(deviceobject: ConstPtr<DeviceObject>, deviceproperty: DeviceRegistryProperty, bufferlength: UInt, propertybuffer: MutPtr<CVoid>, resultlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoGetDeviceProperty(deviceobject.rawAddress.toString(), deviceproperty, bufferlength.toInt(), propertybuffer.rawAddress.toString(), resultlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetDevicePropertyData(pdo: ConstPtr<DeviceObject>, propertykey: ConstPtr<Devpropkey>, lcid: UInt, flags: UInt, size: UInt, data: MutPtr<CVoid>, requiredsize: MutPtr<UInt>, type: MutPtr<Devproptype>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoGetDevicePropertyData(pdo.rawAddress.toString(), propertykey.rawAddress.toString(), lcid.toInt(), flags.toInt(), size.toInt(), data.rawAddress.toString(), requiredsize.rawAddress.toString(), type.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetDmaAdapter(physicaldeviceobject: ConstPtr<DeviceObject>, devicedescription: ConstPtr<DeviceDescription>, numberofmapregisters: MutPtr<UInt>): MutPtr<DmaAdapter> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesIoGetDmaAdapter(physicaldeviceobject.rawAddress.toString(), devicedescription.rawAddress.toString(), numberofmapregisters.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetDriverDirectory(driverobject: ConstPtr<DriverObject>, directorytype: DriverDirectoryType, flags: UInt, driverdirectoryhandle: MutPtr<Handle>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoGetDriverDirectory(driverobject.rawAddress.toString(), directorytype, flags.toInt(), driverdirectoryhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetDriverObjectExtension(driverobject: ConstPtr<DriverObject>, clientidentificationaddress: ConstPtr<CVoid>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesIoGetDriverObjectExtension(driverobject.rawAddress.toString(), clientidentificationaddress.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetFileObjectGenericMapping(): MutPtr<GenericMapping> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesIoGetFileObjectGenericMapping().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetFsZeroingOffset(irp: ConstPtr<Irp>, zeroingoffset: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoGetFsZeroingOffset(irp.rawAddress.toString(), zeroingoffset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetInitialStack(): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesIoGetInitialStack().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetInitiatorProcess(fileobject: ConstPtr<FileObject>): Peprocess =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoGetInitiatorProcess(fileobject.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetIoAttributionHandle(irp: ConstPtr<Irp>, ioattributionhandle: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoGetIoAttributionHandle(irp.rawAddress.toString(), ioattributionhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetIoPriorityHint(irp: ConstPtr<Irp>): IoPriorityHint =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoGetIoPriorityHint(irp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetIommuInterface(version: UInt, interfaceout: MutPtr<DmaIommuInterface>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoGetIommuInterface(version.toInt(), interfaceout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetIommuInterfaceEx(version: UInt, flags: ULong, interfaceout: MutPtr<DmaIommuInterfaceEx>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoGetIommuInterfaceEx(version.toInt(), flags.toString(), interfaceout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetIrpExtraCreateParameter(irp: ConstPtr<Irp>, extracreateparameter: MutPtr<MutPtr<Long>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoGetIrpExtraCreateParameter(irp.rawAddress.toString(), extracreateparameter.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetPagingIoPriority(irp: ConstPtr<Irp>): IoPagingPriority =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoGetPagingIoPriority(irp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetRelatedDeviceObject(fileobject: ConstPtr<FileObject>): MutPtr<DeviceObject> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesIoGetRelatedDeviceObject(fileobject.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetSfioStreamIdentifier(fileobject: ConstPtr<FileObject>, signature: ConstPtr<CVoid>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesIoGetSfioStreamIdentifier(fileobject.rawAddress.toString(), signature.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetSilo(fileobject: ConstPtr<FileObject>): Pesilo =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoGetSilo(fileobject.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetSiloParameters(fileobject: ConstPtr<FileObject>): MutPtr<IoFoextSiloParameters> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesIoGetSiloParameters(fileobject.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetStackLimits(lowlimit: MutPtr<ULong>, highlimit: MutPtr<ULong>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoGetStackLimits(lowlimit.rawAddress.toString(), highlimit.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioGetTopLevelIrp(): MutPtr<Irp> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesIoGetTopLevelIrp().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetTransactionParameterBlock(fileobject: ConstPtr<FileObject>): MutPtr<TxnParameterBlock> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesIoGetTransactionParameterBlock(fileobject.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioIncrementKeepAliveCount(fileobject: MutPtr<FileObject>, process: Peprocess): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoIncrementKeepAliveCount(fileobject.rawAddress.toString(), process.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioInitializeIrp(irp: MutPtr<Irp>, packetsize: UShort, stacksize: Byte) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoInitializeIrp(irp.rawAddress.toString(), packetsize.toInt(), stacksize.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioInitializeIrpEx(irp: MutPtr<Irp>, deviceobject: ConstPtr<DeviceObject>, packetsize: UShort, stacksize: Byte) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoInitializeIrpEx(irp.rawAddress.toString(), deviceobject.rawAddress.toString(), packetsize.toInt(), stacksize.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioInitializeRemoveLockEx(lock: MutPtr<IoRemoveLock>, allocatetag: UInt, maxlockedminutes: UInt, highwatermark: UInt, remlocksize: UInt) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoInitializeRemoveLockEx(lock.rawAddress.toString(), allocatetag.toInt(), maxlockedminutes.toInt(), highwatermark.toInt(), remlocksize.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioInitializeTimer(deviceobject: ConstPtr<DeviceObject>, timerroutine: PioTimerRoutine, context: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoInitializeTimer(deviceobject.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioInitializeWorkItem(ioobject: ConstPtr<CVoid>, ioworkitem: PioWorkitem) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoInitializeWorkItem(ioobject.rawAddress.toString(), ioworkitem.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioInvalidateDeviceRelations(deviceobject: ConstPtr<DeviceObject>, type: DeviceRelationType) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoInvalidateDeviceRelations(deviceobject.rawAddress.toString(), type)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioInvalidateDeviceState(physicaldeviceobject: ConstPtr<DeviceObject>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoInvalidateDeviceState(physicaldeviceobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioIs32bitProcess(irp: ConstPtr<Irp>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoIs32bitProcess(irp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioIsFileObjectIgnoringSharing(fileobject: ConstPtr<FileObject>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoIsFileObjectIgnoringSharing(fileobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioIsFileOriginRemote(fileobject: ConstPtr<FileObject>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoIsFileOriginRemote(fileobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioIsInitiator32bitProcess(irp: ConstPtr<Irp>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoIsInitiator32bitProcess(irp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioIsValidIrpStatus(status: Ntstatus): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoIsValidIrpStatus(status).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioIsWdmVersionAvailable(majorversion: UByte, minorversion: UByte): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoIsWdmVersionAvailable(majorversion.toInt(), minorversion.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioMakeAssociatedIrp(irp: ConstPtr<Irp>, stacksize: Byte): MutPtr<Irp> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesIoMakeAssociatedIrp(irp.rawAddress.toString(), stacksize.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioMakeAssociatedIrpEx(irp: ConstPtr<Irp>, deviceobject: ConstPtr<DeviceObject>, stacksize: Byte): MutPtr<Irp> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesIoMakeAssociatedIrpEx(irp.rawAddress.toString(), deviceobject.rawAddress.toString(), stacksize.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioMapTransfer(adapterobject: ConstPtr<AdapterObject>, mdl: ConstPtr<Mdl>, mapregisterbase: ConstPtr<CVoid>, currentva: ConstPtr<CVoid>, length: MutPtr<UInt>, writetodevice: Boolean): Long =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoMapTransfer(adapterobject.rawAddress.toString(), mdl.rawAddress.toString(), mapregisterbase.rawAddress.toString(), currentva.rawAddress.toString(), length.rawAddress.toString(), writetodevice).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioOpenDeviceInterfaceRegistryKey(symboliclinkname: ConstPtr<UnicodeString>, desiredaccess: UInt, deviceinterfaceregkey: MutPtr<Handle>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoOpenDeviceInterfaceRegistryKey(symboliclinkname.rawAddress.toString(), desiredaccess.toInt(), deviceinterfaceregkey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioOpenDeviceRegistryKey(deviceobject: ConstPtr<DeviceObject>, devinstkeytype: UInt, desiredaccess: UInt, deviceregkey: MutPtr<Handle>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoOpenDeviceRegistryKey(deviceobject.rawAddress.toString(), devinstkeytype.toInt(), desiredaccess.toInt(), deviceregkey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioOpenDriverRegistryKey(driverobject: ConstPtr<DriverObject>, regkeytype: DriverRegkeyType, desiredaccess: UInt, flags: UInt, driverregkey: MutPtr<Handle>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoOpenDriverRegistryKey(driverobject.rawAddress.toString(), regkeytype, desiredaccess.toInt(), flags.toInt(), driverregkey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioPropagateActivityIdToThread(irp: ConstPtr<Irp>, propagatedid: MutPtr<Guid>, originalid: MutPtr<MutPtr<Guid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoPropagateActivityIdToThread(irp.rawAddress.toString(), propagatedid.rawAddress.toString(), originalid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioQueryDeviceDescription(bustype: ConstPtr<InterfaceType>, busnumber: ConstPtr<UInt>, controllertype: ConstPtr<ConfigurationType>, controllernumber: ConstPtr<UInt>, peripheraltype: ConstPtr<ConfigurationType>, peripheralnumber: ConstPtr<UInt>, calloutroutine: PioQueryDeviceRoutine, context: MutPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoQueryDeviceDescription(bustype.rawAddress.toString(), busnumber.rawAddress.toString(), controllertype.rawAddress.toString(), controllernumber.rawAddress.toString(), peripheraltype.rawAddress.toString(), peripheralnumber.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioQueryFullDriverPath(driverobject: ConstPtr<DriverObject>, fullpath: MutPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoQueryFullDriverPath(driverobject.rawAddress.toString(), fullpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioQueryInformationByName(objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass, options: UInt, drivercontext: ConstPtr<IoDriverCreateContext>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoQueryInformationByName(objectattributes.rawAddress.toString(), iostatusblock.rawAddress.toString(), fileinformation.rawAddress.toString(), length.toInt(), fileinformationclass, options.toInt(), drivercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioQueryKsrPersistentMemorySize(driverobject: ConstPtr<DriverObject>, physicaldeviceobject: ConstPtr<DeviceObject>, buffersize: MutPtr<ULong>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoQueryKsrPersistentMemorySize(driverobject.rawAddress.toString(), physicaldeviceobject.rawAddress.toString(), buffersize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioQueryKsrPersistentMemorySizeEx(driverobject: ConstPtr<DriverObject>, physicaldeviceobject: ConstPtr<DeviceObject>, physicaldeviceid: ConstPtr<UnicodeString>, datatag: ConstPtr<UShort>, dataversion: MutPtr<UInt>, buffersize: MutPtr<ULong>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoQueryKsrPersistentMemorySizeEx(driverobject.rawAddress.toString(), physicaldeviceobject.rawAddress.toString(), physicaldeviceid.rawAddress.toString(), datatag.rawAddress.toString(), dataversion.rawAddress.toString(), buffersize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioQueueWorkItem(ioworkitem: PioWorkitem, workerroutine: PioWorkitemRoutine, queuetype: WorkQueueType, context: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoQueueWorkItem(ioworkitem.toString(), 0L.toString(), queuetype, context.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioQueueWorkItemEx(ioworkitem: PioWorkitem, workerroutine: PioWorkitemRoutineEx, queuetype: WorkQueueType, context: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoQueueWorkItemEx(ioworkitem.toString(), 0L.toString(), queuetype, context.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioRaiseHardError(irp: ConstPtr<Irp>, vpb: ConstPtr<Vpb>, realdeviceobject: ConstPtr<DeviceObject>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoRaiseHardError(irp.rawAddress.toString(), vpb.rawAddress.toString(), realdeviceobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioRaiseInformationalHardError(errorstatus: Ntstatus, string: ConstPtr<UnicodeString>, thread: Pkthread): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoRaiseInformationalHardError(errorstatus, string.rawAddress.toString(), thread.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioReadDiskSignature(deviceobject: ConstPtr<DeviceObject>, bytespersector: UInt, signature: MutPtr<DiskSignature>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoReadDiskSignature(deviceobject.rawAddress.toString(), bytespersector.toInt(), signature.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioReadPartitionTable(deviceobject: ConstPtr<DeviceObject>, sectorsize: UInt, returnrecognizedpartitions: Boolean, partitionbuffer: MutPtr<MutPtr<DriveLayoutInformation>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoReadPartitionTable(deviceobject.rawAddress.toString(), sectorsize.toInt(), returnrecognizedpartitions, partitionbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioReadPartitionTableEx(deviceobject: ConstPtr<DeviceObject>, drivelayout: MutPtr<MutPtr<DriveLayoutInformationEx>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoReadPartitionTableEx(deviceobject.rawAddress.toString(), drivelayout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioRecordIoAttribution(opaquehandle: MutPtr<CVoid>, attributioninformation: ConstPtr<IoAttributionInformation>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoRecordIoAttribution(opaquehandle.rawAddress.toString(), attributioninformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioRegisterBootDriverCallback(callbackfunction: PbootDriverCallbackFunction, callbackcontext: ConstPtr<CVoid>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesIoRegisterBootDriverCallback(0L.toString(), callbackcontext.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioRegisterBootDriverReinitialization(driverobject: ConstPtr<DriverObject>, driverreinitializationroutine: DriverReinitialize, context: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioRegisterContainerNotification(notificationclass: IoContainerNotificationClass, callbackfunction: PioContainerNotificationFunction, notificationinformation: ConstPtr<CVoid>, notificationinformationlength: UInt, callbackregistration: MutPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoRegisterContainerNotification(notificationclass, 0L.toString(), notificationinformation.rawAddress.toString(), notificationinformationlength.toInt(), callbackregistration.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioRegisterDeviceInterface(physicaldeviceobject: ConstPtr<DeviceObject>, interfaceclassguid: ConstPtr<Guid>, referencestring: ConstPtr<UnicodeString>, symboliclinkname: MutPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoRegisterDeviceInterface(physicaldeviceobject.rawAddress.toString(), interfaceclassguid.rawAddress.toString(), referencestring.rawAddress.toString(), symboliclinkname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioRegisterDriverReinitialization(driverobject: ConstPtr<DriverObject>, driverreinitializationroutine: DriverReinitialize, context: ConstPtr<CVoid>): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioRegisterLastChanceShutdownNotification(deviceobject: ConstPtr<DeviceObject>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoRegisterLastChanceShutdownNotification(deviceobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioRegisterPlugPlayNotification(eventcategory: IoNotificationEventCategory, eventcategoryflags: UInt, eventcategorydata: ConstPtr<CVoid>, driverobject: ConstPtr<DriverObject>, callbackroutine: DriverNotificationCallbackRoutine, context: MutPtr<CVoid>, notificationentry: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoRegisterPlugPlayNotification(eventcategory, eventcategoryflags.toInt(), eventcategorydata.rawAddress.toString(), driverobject.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), notificationentry.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioRegisterShutdownNotification(deviceobject: ConstPtr<DeviceObject>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoRegisterShutdownNotification(deviceobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioReleaseCancelSpinLock(irql: UByte) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoReleaseCancelSpinLock(irql.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioReleaseRemoveLockAndWaitEx(removelock: MutPtr<IoRemoveLock>, tag: ConstPtr<CVoid>, remlocksize: UInt) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoReleaseRemoveLockAndWaitEx(removelock.rawAddress.toString(), tag.rawAddress.toString(), remlocksize.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioReleaseRemoveLockEx(removelock: MutPtr<IoRemoveLock>, tag: ConstPtr<CVoid>, remlocksize: UInt) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoReleaseRemoveLockEx(removelock.rawAddress.toString(), tag.rawAddress.toString(), remlocksize.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioRemoveLinkShareAccess(fileobject: ConstPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, linkshareaccess: MutPtr<LinkShareAccess>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoRemoveLinkShareAccess(fileobject.rawAddress.toString(), shareaccess.rawAddress.toString(), linkshareaccess.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioRemoveLinkShareAccessEx(fileobject: ConstPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, linkshareaccess: MutPtr<LinkShareAccess>, ioshareaccessflags: UInt) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoRemoveLinkShareAccessEx(fileobject.rawAddress.toString(), shareaccess.rawAddress.toString(), linkshareaccess.rawAddress.toString(), ioshareaccessflags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioRemoveShareAccess(fileobject: ConstPtr<FileObject>, shareaccess: MutPtr<ShareAccess>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoRemoveShareAccess(fileobject.rawAddress.toString(), shareaccess.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioReplacePartitionUnit(targetpdo: ConstPtr<DeviceObject>, sparepdo: ConstPtr<DeviceObject>, flags: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoReplacePartitionUnit(targetpdo.rawAddress.toString(), sparepdo.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioReportDetectedDevice(driverobject: ConstPtr<DriverObject>, legacybustype: InterfaceType, busnumber: UInt, slotnumber: UInt, resourcelist: ConstPtr<CmResourceList>, resourcerequirements: ConstPtr<IoResourceRequirementsList>, resourceassigned: Boolean, deviceobject: MutPtr<MutPtr<DeviceObject>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoReportDetectedDevice(driverobject.rawAddress.toString(), legacybustype, busnumber.toInt(), slotnumber.toInt(), resourcelist.rawAddress.toString(), resourcerequirements.rawAddress.toString(), resourceassigned, deviceobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioReportInterruptActive(parameters: ConstPtr<IoReportInterruptActiveStateParameters>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoReportInterruptActive(parameters.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioReportInterruptInactive(parameters: ConstPtr<IoReportInterruptActiveStateParameters>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoReportInterruptInactive(parameters.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioReportResourceForDetection(driverobject: ConstPtr<DriverObject>, driverlist: ConstPtr<CmResourceList>, driverlistsize: UInt, deviceobject: ConstPtr<DeviceObject>, devicelist: ConstPtr<CmResourceList>, devicelistsize: UInt, conflictdetected: MutPtr<Boolean>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoReportResourceForDetection(driverobject.rawAddress.toString(), driverlist.rawAddress.toString(), driverlistsize.toInt(), deviceobject.rawAddress.toString(), devicelist.rawAddress.toString(), devicelistsize.toInt(), conflictdetected.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioReportResourceUsage(driverclassname: ConstPtr<UnicodeString>, driverobject: ConstPtr<DriverObject>, driverlist: ConstPtr<CmResourceList>, driverlistsize: UInt, deviceobject: ConstPtr<DeviceObject>, devicelist: ConstPtr<CmResourceList>, devicelistsize: UInt, overrideconflict: Boolean, conflictdetected: MutPtr<Boolean>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoReportResourceUsage(driverclassname.rawAddress.toString(), driverobject.rawAddress.toString(), driverlist.rawAddress.toString(), driverlistsize.toInt(), deviceobject.rawAddress.toString(), devicelist.rawAddress.toString(), devicelistsize.toInt(), overrideconflict, conflictdetected.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioReportRootDevice(driverobject: ConstPtr<DriverObject>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoReportRootDevice(driverobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioReportTargetDeviceChange(physicaldeviceobject: ConstPtr<DeviceObject>, notificationstructure: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoReportTargetDeviceChange(physicaldeviceobject.rawAddress.toString(), notificationstructure.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioReportTargetDeviceChangeAsynchronous(physicaldeviceobject: ConstPtr<DeviceObject>, notificationstructure: ConstPtr<CVoid>, callback: PdeviceChangeCompleteCallback, context: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoReportTargetDeviceChangeAsynchronous(physicaldeviceobject.rawAddress.toString(), notificationstructure.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioRequestDeviceEject(physicaldeviceobject: ConstPtr<DeviceObject>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoRequestDeviceEject(physicaldeviceobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioRequestDeviceEjectEx(physicaldeviceobject: ConstPtr<DeviceObject>, callback: PioDeviceEjectCallback, context: ConstPtr<CVoid>, driverobject: ConstPtr<DriverObject>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoRequestDeviceEjectEx(physicaldeviceobject.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), driverobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioReserveKsrPersistentMemory(driverobject: ConstPtr<DriverObject>, physicaldeviceobject: ConstPtr<DeviceObject>, size: ULong, flags: UInt, datahandle: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoReserveKsrPersistentMemory(driverobject.rawAddress.toString(), physicaldeviceobject.rawAddress.toString(), size.toString(), flags.toInt(), datahandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioReserveKsrPersistentMemoryEx(driverobject: ConstPtr<DriverObject>, physicaldeviceobject: ConstPtr<DeviceObject>, physicaldeviceid: ConstPtr<UnicodeString>, datatag: ConstPtr<UShort>, dataversion: UInt, size: ULong, flags: UInt, datahandle: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoReserveKsrPersistentMemoryEx(driverobject.rawAddress.toString(), physicaldeviceobject.rawAddress.toString(), physicaldeviceid.rawAddress.toString(), datatag.rawAddress.toString(), dataversion.toInt(), size.toString(), flags.toInt(), datahandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioReuseIrp(irp: MutPtr<Irp>, iostatus: Ntstatus) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoReuseIrp(irp.rawAddress.toString(), iostatus)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioSetActivityIdIrp(irp: MutPtr<Irp>, guid: ConstPtr<Guid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoSetActivityIdIrp(irp.rawAddress.toString(), guid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetActivityIdThread(activityid: ConstPtr<Guid>): MutPtr<Guid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesIoSetActivityIdThread(activityid.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetCompletionRoutineEx(deviceobject: ConstPtr<DeviceObject>, irp: ConstPtr<Irp>, completionroutine: PioCompletionRoutine, context: ConstPtr<CVoid>, invokeonsuccess: Boolean, invokeonerror: Boolean, invokeoncancel: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoSetCompletionRoutineEx(deviceobject.rawAddress.toString(), irp.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), invokeonsuccess, invokeonerror, invokeoncancel) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetDeviceInterfacePropertyData(symboliclinkname: ConstPtr<UnicodeString>, propertykey: ConstPtr<Devpropkey>, lcid: UInt, flags: UInt, type: UInt, size: UInt, data: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoSetDeviceInterfacePropertyData(symboliclinkname.rawAddress.toString(), propertykey.rawAddress.toString(), lcid.toInt(), flags.toInt(), type.toInt(), size.toInt(), data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetDeviceInterfaceState(symboliclinkname: ConstPtr<UnicodeString>, enable: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoSetDeviceInterfaceState(symboliclinkname.rawAddress.toString(), enable) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetDevicePropertyData(pdo: ConstPtr<DeviceObject>, propertykey: ConstPtr<Devpropkey>, lcid: UInt, flags: UInt, type: UInt, size: UInt, data: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoSetDevicePropertyData(pdo.rawAddress.toString(), propertykey.rawAddress.toString(), lcid.toInt(), flags.toInt(), type.toInt(), size.toInt(), data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetFileObjectIgnoreSharing(fileobject: ConstPtr<FileObject>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoSetFileObjectIgnoreSharing(fileobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetFileOrigin(fileobject: ConstPtr<FileObject>, remote: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoSetFileOrigin(fileobject.rawAddress.toString(), remote) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetFsZeroingOffset(irp: MutPtr<Irp>, zeroingoffset: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoSetFsZeroingOffset(irp.rawAddress.toString(), zeroingoffset.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetFsZeroingOffsetRequired(irp: MutPtr<Irp>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoSetFsZeroingOffsetRequired(irp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetHardErrorOrVerifyDevice(irp: ConstPtr<Irp>, deviceobject: ConstPtr<DeviceObject>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoSetHardErrorOrVerifyDevice(irp.rawAddress.toString(), deviceobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioSetIoAttributionIrp(irp: MutPtr<Irp>, attributionsource: ConstPtr<CVoid>, flags: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoSetIoAttributionIrp(irp.rawAddress.toString(), attributionsource.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetIoPriorityHint(irp: ConstPtr<Irp>, priorityhint: IoPriorityHint): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoSetIoPriorityHint(irp.rawAddress.toString(), priorityhint) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetIrpExtraCreateParameter(irp: MutPtr<Irp>, extracreateparameter: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoSetIrpExtraCreateParameter(irp.rawAddress.toString(), extracreateparameter.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetLinkShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: MutPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, linkshareaccess: MutPtr<LinkShareAccess>, ioshareaccessflags: UInt) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoSetLinkShareAccess(desiredaccess.toInt(), desiredshareaccess.toInt(), fileobject.rawAddress.toString(), shareaccess.rawAddress.toString(), linkshareaccess.rawAddress.toString(), ioshareaccessflags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioSetMasterIrpStatus(masterirp: MutPtr<Irp>, status: Ntstatus) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoSetMasterIrpStatus(masterirp.rawAddress.toString(), status)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioSetPartitionInformation(deviceobject: ConstPtr<DeviceObject>, sectorsize: UInt, partitionnumber: UInt, partitiontype: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoSetPartitionInformation(deviceobject.rawAddress.toString(), sectorsize.toInt(), partitionnumber.toInt(), partitiontype.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetPartitionInformationEx(deviceobject: ConstPtr<DeviceObject>, partitionnumber: UInt, partitioninfo: ConstPtr<SetPartitionInformationEx>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoSetPartitionInformationEx(deviceobject.rawAddress.toString(), partitionnumber.toInt(), partitioninfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: MutPtr<FileObject>, shareaccess: MutPtr<ShareAccess>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoSetShareAccess(desiredaccess.toInt(), desiredshareaccess.toInt(), fileobject.rawAddress.toString(), shareaccess.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioSetShareAccessEx(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: MutPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, writepermission: ConstPtr<Boolean>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoSetShareAccessEx(desiredaccess.toInt(), desiredshareaccess.toInt(), fileobject.rawAddress.toString(), shareaccess.rawAddress.toString(), writepermission.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioSetStartIoAttributes(deviceobject: ConstPtr<DeviceObject>, deferredstartio: Boolean, noncancelable: Boolean) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoSetStartIoAttributes(deviceobject.rawAddress.toString(), deferredstartio, noncancelable)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioSetSystemPartition(volumenamestring: ConstPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoSetSystemPartition(volumenamestring.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetThreadHardErrorMode(enableharderrors: Boolean): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoSetThreadHardErrorMode(enableharderrors) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetTopLevelIrp(irp: ConstPtr<Irp>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoSetTopLevelIrp(irp.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioSizeOfIrpEx(deviceobject: ConstPtr<DeviceObject>, stacksize: Byte): UShort =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoSizeOfIrpEx(deviceobject.rawAddress.toString(), stacksize.toInt()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSizeofWorkItem(): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoSizeofWorkItem().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioStartNextPacket(deviceobject: ConstPtr<DeviceObject>, cancelable: Boolean) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoStartNextPacket(deviceobject.rawAddress.toString(), cancelable)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioStartNextPacketByKey(deviceobject: ConstPtr<DeviceObject>, cancelable: Boolean, key: UInt) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoStartNextPacketByKey(deviceobject.rawAddress.toString(), cancelable, key.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioStartPacket(deviceobject: ConstPtr<DeviceObject>, irp: ConstPtr<Irp>, key: ConstPtr<UInt>, cancelfunction: DriverCancel): Unit = throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioStartTimer(deviceobject: ConstPtr<DeviceObject>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoStartTimer(deviceobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioStopTimer(deviceobject: ConstPtr<DeviceObject>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoStopTimer(deviceobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioSynchronousCallDriver(deviceobject: ConstPtr<DeviceObject>, irp: ConstPtr<Irp>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoSynchronousCallDriver(deviceobject.rawAddress.toString(), irp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioTransferActivityId(activityid: ConstPtr<Guid>, relatedactivityid: ConstPtr<Guid>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoTransferActivityId(activityid.rawAddress.toString(), relatedactivityid.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioTranslateBusAddress(interfacetype: InterfaceType, busnumber: UInt, busaddress: Long, addressspace: MutPtr<UInt>, translatedaddress: MutPtr<Long>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoTranslateBusAddress(interfacetype, busnumber.toInt(), busaddress.toString(), addressspace.rawAddress.toString(), translatedaddress.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioTryQueueWorkItem(ioworkitem: PioWorkitem, workerroutine: PioWorkitemRoutineEx, queuetype: WorkQueueType, context: ConstPtr<CVoid>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoTryQueueWorkItem(ioworkitem.toString(), 0L.toString(), queuetype, context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioUninitializeWorkItem(ioworkitem: PioWorkitem) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoUninitializeWorkItem(ioworkitem.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioUnregisterBootDriverCallback(callbackhandle: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoUnregisterBootDriverCallback(callbackhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioUnregisterContainerNotification(callbackregistration: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoUnregisterContainerNotification(callbackregistration.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioUnregisterPlugPlayNotification(notificationentry: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoUnregisterPlugPlayNotification(notificationentry.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioUnregisterPlugPlayNotificationEx(notificationentry: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoUnregisterPlugPlayNotificationEx(notificationentry.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioUnregisterShutdownNotification(deviceobject: ConstPtr<DeviceObject>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoUnregisterShutdownNotification(deviceobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioUpdateLinkShareAccess(fileobject: ConstPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, linkshareaccess: MutPtr<LinkShareAccess>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoUpdateLinkShareAccess(fileobject.rawAddress.toString(), shareaccess.rawAddress.toString(), linkshareaccess.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioUpdateLinkShareAccessEx(fileobject: ConstPtr<FileObject>, shareaccess: MutPtr<ShareAccess>, linkshareaccess: MutPtr<LinkShareAccess>, ioshareaccessflags: UInt) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoUpdateLinkShareAccessEx(fileobject.rawAddress.toString(), shareaccess.rawAddress.toString(), linkshareaccess.rawAddress.toString(), ioshareaccessflags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioUpdateShareAccess(fileobject: ConstPtr<FileObject>, shareaccess: MutPtr<ShareAccess>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoUpdateShareAccess(fileobject.rawAddress.toString(), shareaccess.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioValidateDeviceIoControlAccess(irp: ConstPtr<Irp>, requiredaccess: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoValidateDeviceIoControlAccess(irp.rawAddress.toString(), requiredaccess.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioVerifyPartitionTable(deviceobject: ConstPtr<DeviceObject>, fixerrors: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoVerifyPartitionTable(deviceobject.rawAddress.toString(), fixerrors) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioVolumeDeviceNameToGuid(volumedevicename: ConstPtr<UnicodeString>, guid: MutPtr<Guid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoVolumeDeviceNameToGuid(volumedevicename.rawAddress.toString(), guid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioVolumeDeviceNameToGuidPath(volumedevicename: ConstPtr<UnicodeString>, guidpath: MutPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoVolumeDeviceNameToGuidPath(volumedevicename.rawAddress.toString(), guidpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioVolumeDeviceToDosName(volumedeviceobject: ConstPtr<CVoid>, dosname: MutPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoVolumeDeviceToDosName(volumedeviceobject.rawAddress.toString(), dosname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioVolumeDeviceToGuid(volumedeviceobject: ConstPtr<CVoid>, guid: MutPtr<Guid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoVolumeDeviceToGuid(volumedeviceobject.rawAddress.toString(), guid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioVolumeDeviceToGuidPath(volumedeviceobject: ConstPtr<CVoid>, guidpath: MutPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoVolumeDeviceToGuidPath(volumedeviceobject.rawAddress.toString(), guidpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMIAllocateInstanceIds(guid: ConstPtr<Guid>, instancecount: UInt, firstinstanceid: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoWMIAllocateInstanceIds(guid.rawAddress.toString(), instancecount.toInt(), firstinstanceid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMIDeviceObjectToInstanceName(datablockobject: ConstPtr<CVoid>, deviceobject: ConstPtr<DeviceObject>, instancename: MutPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoWMIDeviceObjectToInstanceName(datablockobject.rawAddress.toString(), deviceobject.rawAddress.toString(), instancename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMIExecuteMethod(datablockobject: ConstPtr<CVoid>, instancename: ConstPtr<UnicodeString>, methodid: UInt, inbuffersize: UInt, outbuffersize: MutPtr<UInt>, inoutbuffer: MutPtr<UByte>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoWMIExecuteMethod(datablockobject.rawAddress.toString(), instancename.rawAddress.toString(), methodid.toInt(), inbuffersize.toInt(), outbuffersize.rawAddress.toString(), inoutbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMIHandleToInstanceName(datablockobject: ConstPtr<CVoid>, filehandle: Handle, instancename: MutPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoWMIHandleToInstanceName(datablockobject.rawAddress.toString(), filehandle.rawAddress.toString(), instancename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMIOpenBlock(guid: ConstPtr<Guid>, desiredaccess: UInt, datablockobject: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoWMIOpenBlock(guid.rawAddress.toString(), desiredaccess.toInt(), datablockobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMIQueryAllData(datablockobject: ConstPtr<CVoid>, inoutbuffersize: MutPtr<UInt>, outbuffer: MutPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoWMIQueryAllData(datablockobject.rawAddress.toString(), inoutbuffersize.rawAddress.toString(), outbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMIQueryAllDataMultiple(datablockobjectlist: ConstPtr<ConstPtr<CVoid>>, objectcount: UInt, inoutbuffersize: MutPtr<UInt>, outbuffer: MutPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoWMIQueryAllDataMultiple(datablockobjectlist.rawAddress.toString(), objectcount.toInt(), inoutbuffersize.rawAddress.toString(), outbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMIQuerySingleInstance(datablockobject: ConstPtr<CVoid>, instancename: ConstPtr<UnicodeString>, inoutbuffersize: MutPtr<UInt>, outbuffer: MutPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoWMIQuerySingleInstance(datablockobject.rawAddress.toString(), instancename.rawAddress.toString(), inoutbuffersize.rawAddress.toString(), outbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMIQuerySingleInstanceMultiple(datablockobjectlist: ConstPtr<ConstPtr<CVoid>>, instancenames: ConstPtr<UnicodeString>, objectcount: UInt, inoutbuffersize: MutPtr<UInt>, outbuffer: MutPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoWMIQuerySingleInstanceMultiple(datablockobjectlist.rawAddress.toString(), instancenames.rawAddress.toString(), objectcount.toInt(), inoutbuffersize.rawAddress.toString(), outbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMIRegistrationControl(deviceobject: ConstPtr<DeviceObject>, action: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoWMIRegistrationControl(deviceobject.rawAddress.toString(), action.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMISetNotificationCallback(obj: MutPtr<CVoid>, callback: WmiNotificationCallback, context: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoWMISetNotificationCallback(obj.rawAddress.toString(), 0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMISetSingleInstance(datablockobject: ConstPtr<CVoid>, instancename: ConstPtr<UnicodeString>, version: UInt, valuebuffersize: UInt, valuebuffer: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoWMISetSingleInstance(datablockobject.rawAddress.toString(), instancename.rawAddress.toString(), version.toInt(), valuebuffersize.toInt(), valuebuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMISetSingleItem(datablockobject: ConstPtr<CVoid>, instancename: ConstPtr<UnicodeString>, dataitemid: UInt, version: UInt, valuebuffersize: UInt, valuebuffer: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoWMISetSingleItem(datablockobject.rawAddress.toString(), instancename.rawAddress.toString(), dataitemid.toInt(), version.toInt(), valuebuffersize.toInt(), valuebuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMISuggestInstanceName(physicaldeviceobject: ConstPtr<DeviceObject>, symboliclinkname: ConstPtr<UnicodeString>, combinenames: Boolean, suggestedinstancename: MutPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoWMISuggestInstanceName(physicaldeviceobject.rawAddress.toString(), symboliclinkname.rawAddress.toString(), combinenames, suggestedinstancename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMIWriteEvent(wnodeeventitem: MutPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoWMIWriteEvent(wnodeeventitem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWithinStackLimits(regionstart: ULong, regionsize: ULong): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoWithinStackLimits(regionstart.toString(), regionsize.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWriteErrorLogEntry(elentry: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIoWriteErrorLogEntry(elentry.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioWriteKsrPersistentMemory(datahandle: ConstPtr<CVoid>, buffer: ConstPtr<CVoid>, size: ULong): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoWriteKsrPersistentMemory(datahandle.rawAddress.toString(), buffer.rawAddress.toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWritePartitionTable(deviceobject: ConstPtr<DeviceObject>, sectorsize: UInt, sectorspertrack: UInt, numberofheads: UInt, partitionbuffer: ConstPtr<DriveLayoutInformation>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoWritePartitionTable(deviceobject.rawAddress.toString(), sectorsize.toInt(), sectorspertrack.toInt(), numberofheads.toInt(), partitionbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWritePartitionTableEx(deviceobject: ConstPtr<DeviceObject>, drivelayout: ConstPtr<DriveLayoutInformationEx>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIoWritePartitionTableEx(deviceobject.rawAddress.toString(), drivelayout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iofCallDriver(deviceobject: ConstPtr<DeviceObject>, irp: MutPtr<Irp>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesIofCallDriver(deviceobject.rawAddress.toString(), irp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iofCompleteRequest(irp: ConstPtr<Irp>, priorityboost: Byte) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesIofCompleteRequest(irp.rawAddress.toString(), priorityboost.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun kdChangeOption(option: KdOption, inbufferbytes: UInt, inbuffer: ConstPtr<CVoid>, outbufferbytes: UInt, outbuffer: MutPtr<CVoid>, outbufferneeded: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKdChangeOption(option, inbufferbytes.toInt(), inbuffer.rawAddress.toString(), outbufferbytes.toInt(), outbuffer.rawAddress.toString(), outbufferneeded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kdDisableDebugger(): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKdDisableDebugger() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kdEnableDebugger(): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKdEnableDebugger() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kdRefreshDebuggerNotPresent(): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKdRefreshDebuggerNotPresent() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keAcquireGuardedMutex(mutex: MutPtr<FastMutex>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeAcquireGuardedMutex(mutex.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keAcquireGuardedMutexUnsafe(fastmutex: MutPtr<FastMutex>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeAcquireGuardedMutexUnsafe(fastmutex.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keAcquireInStackQueuedSpinLock(spinlock: MutPtr<ULong>, lockhandle: MutPtr<KlockQueueHandle>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeAcquireInStackQueuedSpinLock(spinlock.rawAddress.toString(), lockhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keAcquireInStackQueuedSpinLockAtDpcLevel(spinlock: MutPtr<ULong>, lockhandle: MutPtr<KlockQueueHandle>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeAcquireInStackQueuedSpinLockAtDpcLevel(spinlock.rawAddress.toString(), lockhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keAcquireInStackQueuedSpinLockForDpc(spinlock: MutPtr<ULong>, lockhandle: MutPtr<KlockQueueHandle>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeAcquireInStackQueuedSpinLockForDpc(spinlock.rawAddress.toString(), lockhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keAcquireInterruptSpinLock(interrupt: Pkinterrupt): UByte =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeAcquireInterruptSpinLock(interrupt.toString()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keAcquireSpinLockForDpc(spinlock: MutPtr<ULong>): UByte =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeAcquireSpinLockForDpc(spinlock.rawAddress.toString()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keAddTriageDumpDataBlock(ktriagedumpdataarray: MutPtr<KtriageDumpDataArray>, address: ConstPtr<CVoid>, size: ULong): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeAddTriageDumpDataBlock(ktriagedumpdataarray.rawAddress.toString(), address.rawAddress.toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keAreAllApcsDisabled(): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeAreAllApcsDisabled() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keAreApcsDisabled(): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeAreApcsDisabled() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keBugCheck(bugcheckcode: BugcheckError) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeBugCheck(bugcheckcode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keBugCheckEx(bugcheckcode: BugcheckError, bugcheckparameter1: ULong, bugcheckparameter2: ULong, bugcheckparameter3: ULong, bugcheckparameter4: ULong) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeBugCheckEx(bugcheckcode.toInt(), bugcheckparameter1.toString(), bugcheckparameter2.toString(), bugcheckparameter3.toString(), bugcheckparameter4.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keCancelTimer(param0: MutPtr<Ktimer>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeCancelTimer(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keClearEvent(event: MutPtr<Kevent>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeClearEvent(event.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keConvertAuxiliaryCounterToPerformanceCounter(auxiliarycountervalue: ULong, performancecountervalue: MutPtr<ULong>, conversionerror: MutPtr<ULong>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeConvertAuxiliaryCounterToPerformanceCounter(auxiliarycountervalue.toString(), performancecountervalue.rawAddress.toString(), conversionerror.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keConvertPerformanceCounterToAuxiliaryCounter(performancecountervalue: ULong, auxiliarycountervalue: MutPtr<ULong>, conversionerror: MutPtr<ULong>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeConvertPerformanceCounterToAuxiliaryCounter(performancecountervalue.toString(), auxiliarycountervalue.rawAddress.toString(), conversionerror.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keDelayExecutionThread(waitmode: Byte, alertable: Boolean, interval: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeDelayExecutionThread(waitmode.toInt(), alertable, interval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keDeregisterBoundCallback(handle: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeDeregisterBoundCallback(handle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keDeregisterBugCheckCallback(callbackrecord: MutPtr<KbugcheckCallbackRecord>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeDeregisterBugCheckCallback(callbackrecord.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keDeregisterBugCheckReasonCallback(callbackrecord: MutPtr<KbugcheckReasonCallbackRecord>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeDeregisterBugCheckReasonCallback(callbackrecord.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keDeregisterNmiCallback(handle: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeDeregisterNmiCallback(handle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keDeregisterProcessorChangeCallback(callbackhandle: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeDeregisterProcessorChangeCallback(callbackhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keEnterCriticalRegion() {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeEnterCriticalRegion()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keEnterGuardedRegion() {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeEnterGuardedRegion()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keExpandKernelStackAndCallout(callout: PexpandStackCallout, parameter: ConstPtr<CVoid>, size: ULong): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeExpandKernelStackAndCallout(0L.toString(), parameter.rawAddress.toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keExpandKernelStackAndCalloutEx(callout: PexpandStackCallout, parameter: ConstPtr<CVoid>, size: ULong, wait: Boolean, context: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeExpandKernelStackAndCalloutEx(0L.toString(), parameter.rawAddress.toString(), size.toString(), wait, context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keFlushIoBuffers(mdl: ConstPtr<Mdl>, readoperation: Boolean, dmaoperation: Boolean) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeFlushIoBuffers(mdl.rawAddress.toString(), readoperation, dmaoperation)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keFlushQueuedDpcs() {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeFlushQueuedDpcs()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keFlushWriteBuffer() {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeFlushWriteBuffer()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keGetCurrentIrql(): UByte =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeGetCurrentIrql().toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keGetCurrentNodeNumber(): UShort =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeGetCurrentNodeNumber().toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keGetCurrentProcessorNumberEx(procnumber: MutPtr<ProcessorNumber>): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeGetCurrentProcessorNumberEx(procnumber.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keGetProcessorIndexFromNumber(procnumber: ConstPtr<ProcessorNumber>): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeGetProcessorIndexFromNumber(procnumber.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keGetProcessorNumberFromIndex(procindex: UInt, procnumber: MutPtr<ProcessorNumber>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeGetProcessorNumberFromIndex(procindex.toInt(), procnumber.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keGetRecommendedSharedDataAlignment(): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeGetRecommendedSharedDataAlignment().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keInitializeCrashDumpHeader(dumptype: UInt, flags: UInt, buffer: MutPtr<CVoid>, buffersize: UInt, bufferneeded: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeInitializeCrashDumpHeader(dumptype.toInt(), flags.toInt(), buffer.rawAddress.toString(), buffersize.toInt(), bufferneeded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keInitializeDeviceQueue(devicequeue: MutPtr<KdeviceQueue>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeInitializeDeviceQueue(devicequeue.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keInitializeDpc(dpc: MutPtr<Kdpc>, deferredroutine: PkdeferredRoutine, deferredcontext: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeInitializeDpc(dpc.rawAddress.toString(), 0L.toString(), deferredcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keInitializeEvent(event: MutPtr<Kevent>, type: EventType, state: Boolean) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeInitializeEvent(event.rawAddress.toString(), type, state)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keInitializeGuardedMutex(mutex: MutPtr<FastMutex>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeInitializeGuardedMutex(mutex.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keInitializeMutex(mutex: MutPtr<Kmutant>, level: UInt) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeInitializeMutex(mutex.rawAddress.toString(), level.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keInitializeSemaphore(semaphore: MutPtr<Ksemaphore>, count: Int, limit: Int) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeInitializeSemaphore(semaphore.rawAddress.toString(), count, limit)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keInitializeSpinLock(spinlock: MutPtr<ULong>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeInitializeSpinLock(spinlock.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keInitializeThreadedDpc(dpc: MutPtr<Kdpc>, deferredroutine: PkdeferredRoutine, deferredcontext: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeInitializeThreadedDpc(dpc.rawAddress.toString(), 0L.toString(), deferredcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keInitializeTimer(timer: MutPtr<Ktimer>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeInitializeTimer(timer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keInitializeTimerEx(timer: MutPtr<Ktimer>, type: TimerType) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeInitializeTimerEx(timer.rawAddress.toString(), type)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keInitializeTriageDumpDataArray(ktriagedumpdataarray: MutPtr<KtriageDumpDataArray>, size: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeInitializeTriageDumpDataArray(ktriagedumpdataarray.rawAddress.toString(), size.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keInsertByKeyDeviceQueue(devicequeue: MutPtr<KdeviceQueue>, devicequeueentry: MutPtr<KdeviceQueueEntry>, sortkey: UInt): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeInsertByKeyDeviceQueue(devicequeue.rawAddress.toString(), devicequeueentry.rawAddress.toString(), sortkey.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keInsertDeviceQueue(devicequeue: MutPtr<KdeviceQueue>, devicequeueentry: MutPtr<KdeviceQueueEntry>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeInsertDeviceQueue(devicequeue.rawAddress.toString(), devicequeueentry.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keInsertQueueDpc(dpc: MutPtr<Kdpc>, systemargument1: ConstPtr<CVoid>, systemargument2: ConstPtr<CVoid>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeInsertQueueDpc(dpc.rawAddress.toString(), systemargument1.rawAddress.toString(), systemargument2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keInvalidateAllCaches(): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeInvalidateAllCaches() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keInvalidateRangeAllCaches(baseaddress: ConstPtr<CVoid>, length: UInt) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeInvalidateRangeAllCaches(baseaddress.rawAddress.toString(), length.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keIpiGenericCall(broadcastfunction: PkipiBroadcastWorker, context: ULong): ULong =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeIpiGenericCall(0L.toString(), context.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keIsExecutingDpc(): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeIsExecutingDpc().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keLeaveCriticalRegion() {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeLeaveCriticalRegion()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keLeaveGuardedRegion() {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeLeaveGuardedRegion()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun kePulseEvent(event: MutPtr<Kevent>, increment: Int, wait: Boolean): Int =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKePulseEvent(event.rawAddress.toString(), increment, wait) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryActiveGroupCount(): UShort =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeQueryActiveGroupCount().toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryActiveProcessorCount(activeprocessors: MutPtr<ULong>): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeQueryActiveProcessorCount(activeprocessors.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryActiveProcessorCountEx(groupnumber: UShort): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeQueryActiveProcessorCountEx(groupnumber.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryActiveProcessors(): ULong =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeQueryActiveProcessors().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryAuxiliaryCounterFrequency(auxiliarycounterfrequency: MutPtr<ULong>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeQueryAuxiliaryCounterFrequency(auxiliarycounterfrequency.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryDpcWatchdogInformation(watchdoginformation: MutPtr<KdpcWatchdogInformation>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeQueryDpcWatchdogInformation(watchdoginformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryGroupAffinity(groupnumber: UShort): ULong =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeQueryGroupAffinity(groupnumber.toInt()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryHardwareCounterConfiguration(counterarray: MutPtr<HardwareCounter>, maximumcount: UInt, count: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeQueryHardwareCounterConfiguration(counterarray.rawAddress.toString(), maximumcount.toInt(), count.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryHighestNodeNumber(): UShort =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeQueryHighestNodeNumber().toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryInterruptTimePrecise(qpctimestamp: MutPtr<ULong>): ULong =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeQueryInterruptTimePrecise(qpctimestamp.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryLogicalProcessorRelationship(processornumber: ConstPtr<ProcessorNumber>, relationshiptype: LogicalProcessorRelationship, information: MutPtr<SystemLogicalProcessorInformationEx>, length: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeQueryLogicalProcessorRelationship(processornumber.rawAddress.toString(), relationshiptype, information.rawAddress.toString(), length.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryMaximumGroupCount(): UShort =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeQueryMaximumGroupCount().toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryMaximumProcessorCount(): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeQueryMaximumProcessorCount().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryMaximumProcessorCountEx(groupnumber: UShort): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeQueryMaximumProcessorCountEx(groupnumber.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryNodeActiveAffinity(nodenumber: UShort, affinity: MutPtr<GroupAffinity>, count: MutPtr<UShort>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeQueryNodeActiveAffinity(nodenumber.toInt(), affinity.rawAddress.toString(), count.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keQueryNodeActiveAffinity2(nodenumber: UShort, groupaffinities: MutPtr<GroupAffinity>, groupaffinitiescount: UShort, groupaffinitiesrequired: MutPtr<UShort>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeQueryNodeActiveAffinity2(nodenumber.toInt(), groupaffinities.rawAddress.toString(), groupaffinitiescount.toInt(), groupaffinitiesrequired.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryNodeActiveProcessorCount(nodenumber: UShort): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeQueryNodeActiveProcessorCount(nodenumber.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryNodeMaximumProcessorCount(nodenumber: UShort): UShort =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeQueryNodeMaximumProcessorCount(nodenumber.toInt()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryPerformanceCounter(performancefrequency: MutPtr<Long>): Long =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeQueryPerformanceCounter(performancefrequency.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryPriorityThread(thread: Pkthread): Int =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeQueryPriorityThread(thread.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryRuntimeThread(thread: Pkthread, usertime: MutPtr<UInt>): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeQueryRuntimeThread(thread.toString(), usertime.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQuerySystemTimePrecise(currenttime: MutPtr<Long>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeQuerySystemTimePrecise(currenttime.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keQueryTimeIncrement(): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeQueryTimeIncrement().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryTotalCycleTimeThread(thread: Pkthread, cycletimestamp: MutPtr<ULong>): ULong =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeQueryTotalCycleTimeThread(thread.toString(), cycletimestamp.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryUnbiasedInterruptTime(): ULong =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeQueryUnbiasedInterruptTime().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryUnbiasedInterruptTimePrecise(qpctimestamp: MutPtr<ULong>): ULong =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeQueryUnbiasedInterruptTimePrecise(qpctimestamp.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keReadStateEvent(event: ConstPtr<Kevent>): Int =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeReadStateEvent(event.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keReadStateMutex(mutex: ConstPtr<Kmutant>): Int =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeReadStateMutex(mutex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keReadStateSemaphore(semaphore: ConstPtr<Ksemaphore>): Int =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeReadStateSemaphore(semaphore.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keReadStateTimer(timer: ConstPtr<Ktimer>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeReadStateTimer(timer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keRegisterBoundCallback(callbackroutine: PboundCallback): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesKeRegisterBoundCallback(0L.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keRegisterBugCheckCallback(callbackrecord: MutPtr<KbugcheckCallbackRecord>, callbackroutine: PkbugcheckCallbackRoutine, buffer: ConstPtr<CVoid>, length: UInt, component: ConstPtr<UByte>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeRegisterBugCheckCallback(callbackrecord.rawAddress.toString(), 0L.toString(), buffer.rawAddress.toString(), length.toInt(), component.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keRegisterBugCheckReasonCallback(callbackrecord: MutPtr<KbugcheckReasonCallbackRecord>, callbackroutine: PkbugcheckReasonCallbackRoutine, reason: KbugcheckCallbackReason, component: ConstPtr<UByte>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeRegisterBugCheckReasonCallback(callbackrecord.rawAddress.toString(), 0L.toString(), reason, component.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keRegisterNmiCallback(callbackroutine: PnmiCallback, context: ConstPtr<CVoid>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesKeRegisterNmiCallback(0L.toString(), context.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keRegisterProcessorChangeCallback(callbackfunction: PprocessorCallbackFunction, callbackcontext: ConstPtr<CVoid>, flags: UInt): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesKeRegisterProcessorChangeCallback(0L.toString(), callbackcontext.rawAddress.toString(), flags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keReleaseGuardedMutex(mutex: MutPtr<FastMutex>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeReleaseGuardedMutex(mutex.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keReleaseGuardedMutexUnsafe(fastmutex: MutPtr<FastMutex>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeReleaseGuardedMutexUnsafe(fastmutex.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keReleaseInStackQueuedSpinLock(lockhandle: ConstPtr<KlockQueueHandle>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeReleaseInStackQueuedSpinLock(lockhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keReleaseInStackQueuedSpinLockForDpc(lockhandle: ConstPtr<KlockQueueHandle>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeReleaseInStackQueuedSpinLockForDpc(lockhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keReleaseInStackQueuedSpinLockFromDpcLevel(lockhandle: ConstPtr<KlockQueueHandle>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeReleaseInStackQueuedSpinLockFromDpcLevel(lockhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keReleaseInterruptSpinLock(interrupt: Pkinterrupt, oldirql: UByte) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeReleaseInterruptSpinLock(interrupt.toString(), oldirql.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keReleaseMutex(mutex: MutPtr<Kmutant>, wait: Boolean): Int =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeReleaseMutex(mutex.rawAddress.toString(), wait) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keReleaseSemaphore(semaphore: MutPtr<Ksemaphore>, increment: Int, adjustment: Int, wait: Boolean): Int =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeReleaseSemaphore(semaphore.rawAddress.toString(), increment, adjustment, wait) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keReleaseSpinLockForDpc(spinlock: MutPtr<ULong>, oldirql: UByte) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeReleaseSpinLockForDpc(spinlock.rawAddress.toString(), oldirql.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keRemoveByKeyDeviceQueue(devicequeue: MutPtr<KdeviceQueue>, sortkey: UInt): MutPtr<KdeviceQueueEntry> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesKeRemoveByKeyDeviceQueue(devicequeue.rawAddress.toString(), sortkey.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keRemoveByKeyDeviceQueueIfBusy(devicequeue: MutPtr<KdeviceQueue>, sortkey: UInt): MutPtr<KdeviceQueueEntry> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesKeRemoveByKeyDeviceQueueIfBusy(devicequeue.rawAddress.toString(), sortkey.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keRemoveDeviceQueue(devicequeue: MutPtr<KdeviceQueue>): MutPtr<KdeviceQueueEntry> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesKeRemoveDeviceQueue(devicequeue.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keRemoveEntryDeviceQueue(devicequeue: MutPtr<KdeviceQueue>, devicequeueentry: MutPtr<KdeviceQueueEntry>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeRemoveEntryDeviceQueue(devicequeue.rawAddress.toString(), devicequeueentry.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keRemoveQueueDpc(dpc: MutPtr<Kdpc>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeRemoveQueueDpc(dpc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keRemoveQueueDpcEx(dpc: MutPtr<Kdpc>, waitifactive: Boolean): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeRemoveQueueDpcEx(dpc.rawAddress.toString(), waitifactive) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keResetEvent(event: MutPtr<Kevent>): Int =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeResetEvent(event.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keRestoreExtendedProcessorState(xstatesave: ConstPtr<XstateSave>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeRestoreExtendedProcessorState(xstatesave.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keRevertToUserAffinityThread() {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeRevertToUserAffinityThread()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keRevertToUserAffinityThreadEx(affinity: ULong) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeRevertToUserAffinityThreadEx(affinity.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keRevertToUserGroupAffinityThread(previousaffinity: ConstPtr<GroupAffinity>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeRevertToUserGroupAffinityThread(previousaffinity.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keSaveExtendedProcessorState(mask: ULong, xstatesave: MutPtr<XstateSave>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeSaveExtendedProcessorState(mask.toString(), xstatesave.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keSetBasePriorityThread(thread: Pkthread, increment: Int): Int =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeSetBasePriorityThread(thread.toString(), increment) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keSetCoalescableTimer(timer: MutPtr<Ktimer>, duetime: Long, period: UInt, tolerabledelay: UInt, dpc: ConstPtr<Kdpc>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeSetCoalescableTimer(timer.rawAddress.toString(), duetime.toString(), period.toInt(), tolerabledelay.toInt(), dpc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keSetEvent(event: MutPtr<Kevent>, increment: Int, wait: Boolean): Int =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeSetEvent(event.rawAddress.toString(), increment, wait) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keSetHardwareCounterConfiguration(counterarray: ConstPtr<HardwareCounter>, count: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeSetHardwareCounterConfiguration(counterarray.rawAddress.toString(), count.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keSetImportanceDpc(dpc: MutPtr<Kdpc>, importance: KdpcImportance) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeSetImportanceDpc(dpc.rawAddress.toString(), importance)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keSetPriorityThread(thread: Pkthread, priority: Int): Int =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeSetPriorityThread(thread.toString(), priority) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keSetSystemAffinityThread(affinity: ULong) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeSetSystemAffinityThread(affinity.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keSetSystemAffinityThreadEx(affinity: ULong): ULong =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeSetSystemAffinityThreadEx(affinity.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keSetSystemGroupAffinityThread(affinity: ConstPtr<GroupAffinity>, previousaffinity: MutPtr<GroupAffinity>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeSetSystemGroupAffinityThread(affinity.rawAddress.toString(), previousaffinity.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keSetTargetProcessorDpc(dpc: MutPtr<Kdpc>, number: Byte) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeSetTargetProcessorDpc(dpc.rawAddress.toString(), number.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keSetTargetProcessorDpcEx(dpc: MutPtr<Kdpc>, procnumber: ConstPtr<ProcessorNumber>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeSetTargetProcessorDpcEx(dpc.rawAddress.toString(), procnumber.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keSetTimer(timer: MutPtr<Ktimer>, duetime: Long, dpc: ConstPtr<Kdpc>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeSetTimer(timer.rawAddress.toString(), duetime.toString(), dpc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keSetTimerEx(timer: MutPtr<Ktimer>, duetime: Long, period: Int, dpc: ConstPtr<Kdpc>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeSetTimerEx(timer.rawAddress.toString(), duetime.toString(), period, dpc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keShouldYieldProcessor(): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeShouldYieldProcessor().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keStallExecutionProcessor(microseconds: UInt) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesKeStallExecutionProcessor(microseconds.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keSynchronizeExecution(interrupt: Pkinterrupt, synchronizeroutine: PksynchronizeRoutine, synchronizecontext: ConstPtr<CVoid>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeSynchronizeExecution(interrupt.toString(), 0L.toString(), synchronizecontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keTestSpinLock(spinlock: ConstPtr<ULong>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeTestSpinLock(spinlock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keTryToAcquireGuardedMutex(mutex: MutPtr<FastMutex>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeTryToAcquireGuardedMutex(mutex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keTryToAcquireSpinLockAtDpcLevel(spinlock: MutPtr<ULong>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeTryToAcquireSpinLockAtDpcLevel(spinlock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keWaitForMultipleObjects(count: UInt, obj: ConstPtr<ConstPtr<CVoid>>, waittype: WaitType, waitreason: KwaitReason, waitmode: Byte, alertable: Boolean, timeout: ConstPtr<Long>, waitblockarray: MutPtr<KwaitBlock>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeWaitForMultipleObjects(count.toInt(), obj.rawAddress.toString(), waittype, waitreason, waitmode.toInt(), alertable, timeout.rawAddress.toString(), waitblockarray.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keWaitForSingleObject(obj: ConstPtr<CVoid>, waitreason: KwaitReason, waitmode: Byte, alertable: Boolean, timeout: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKeWaitForSingleObject(obj.rawAddress.toString(), waitreason, waitmode.toInt(), alertable, timeout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kfRaiseIrql(newirql: UByte): UByte =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesKfRaiseIrql(newirql.toInt()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAddPhysicalMemory(startaddress: ConstPtr<Long>, numberofbytes: MutPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesMmAddPhysicalMemory(startaddress.rawAddress.toString(), numberofbytes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAddVerifierSpecialThunks(entryroutine: ULong, thunkbuffer: ConstPtr<CVoid>, thunkbuffersize: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesMmAddVerifierSpecialThunks(entryroutine.toString(), thunkbuffer.rawAddress.toString(), thunkbuffersize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAddVerifierThunks(thunkbuffer: ConstPtr<CVoid>, thunkbuffersize: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesMmAddVerifierThunks(thunkbuffer.rawAddress.toString(), thunkbuffersize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAdvanceMdl(mdl: MutPtr<Mdl>, numberofbytes: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesMmAdvanceMdl(mdl.rawAddress.toString(), numberofbytes.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAllocateContiguousMemory(numberofbytes: ULong, highestacceptableaddress: Long): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesMmAllocateContiguousMemory(numberofbytes.toString(), highestacceptableaddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAllocateContiguousMemoryEx(numberofbytes: ConstPtr<ULong>, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, preferrednode: UInt, protect: UInt, partitionobject: ConstPtr<CVoid>, tag: UInt, flags: UInt, baseaddress: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesMmAllocateContiguousMemoryEx(numberofbytes.rawAddress.toString(), lowestacceptableaddress.toString(), highestacceptableaddress.toString(), boundaryaddressmultiple.toString(), preferrednode.toInt(), protect.toInt(), partitionobject.rawAddress.toString(), tag.toInt(), flags.toInt(), baseaddress.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAllocateContiguousMemorySpecifyCache(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, cachetype: MemoryCachingType): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesMmAllocateContiguousMemorySpecifyCache(numberofbytes.toString(), lowestacceptableaddress.toString(), highestacceptableaddress.toString(), boundaryaddressmultiple.toString(), cachetype).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAllocateContiguousMemorySpecifyCacheNode(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, cachetype: MemoryCachingType, preferrednode: UInt): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesMmAllocateContiguousMemorySpecifyCacheNode(numberofbytes.toString(), lowestacceptableaddress.toString(), highestacceptableaddress.toString(), boundaryaddressmultiple.toString(), cachetype, preferrednode.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAllocateContiguousNodeMemory(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, protect: UInt, preferrednode: UInt): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesMmAllocateContiguousNodeMemory(numberofbytes.toString(), lowestacceptableaddress.toString(), highestacceptableaddress.toString(), boundaryaddressmultiple.toString(), protect.toInt(), preferrednode.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAllocateMappingAddress(numberofbytes: ULong, pooltag: UInt): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesMmAllocateMappingAddress(numberofbytes.toString(), pooltag.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAllocateMappingAddressEx(numberofbytes: ULong, pooltag: UInt, flags: UInt): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesMmAllocateMappingAddressEx(numberofbytes.toString(), pooltag.toInt(), flags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAllocateMdlForIoSpace(physicaladdresslist: ConstPtr<MmPhysicalAddressList>, numberofentries: ULong, newmdl: MutPtr<MutPtr<Mdl>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesMmAllocateMdlForIoSpace(physicaladdresslist.rawAddress.toString(), numberofentries.toString(), newmdl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAllocateNodePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MemoryCachingType, idealnode: UInt, flags: UInt): MutPtr<Mdl> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesMmAllocateNodePagesForMdlEx(lowaddress.toString(), highaddress.toString(), skipbytes.toString(), totalbytes.toString(), cachetype, idealnode.toInt(), flags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAllocateNonCachedMemory(numberofbytes: ULong): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesMmAllocateNonCachedMemory(numberofbytes.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAllocatePagesForMdl(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong): MutPtr<Mdl> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesMmAllocatePagesForMdl(lowaddress.toString(), highaddress.toString(), skipbytes.toString(), totalbytes.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAllocatePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MemoryCachingType, flags: UInt): MutPtr<Mdl> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesMmAllocatePagesForMdlEx(lowaddress.toString(), highaddress.toString(), skipbytes.toString(), totalbytes.toString(), cachetype, flags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAllocatePartitionNodePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MemoryCachingType, idealnode: UInt, flags: UInt, partitionobject: ConstPtr<CVoid>): MutPtr<Mdl> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesMmAllocatePartitionNodePagesForMdlEx(lowaddress.toString(), highaddress.toString(), skipbytes.toString(), totalbytes.toString(), cachetype, idealnode.toInt(), flags.toInt(), partitionobject.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAreMdlPagesCached(memorydescriptorlist: ConstPtr<Mdl>): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesMmAreMdlPagesCached(memorydescriptorlist.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmBuildMdlForNonPagedPool(memorydescriptorlist: MutPtr<Mdl>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesMmBuildMdlForNonPagedPool(memorydescriptorlist.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmCopyMemory(targetaddress: ConstPtr<CVoid>, sourceaddress: MmCopyAddress, numberofbytes: ULong, flags: UInt, numberofbytestransferred: MutPtr<ULong>): Ntstatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmCreateMdl(memorydescriptorlist: MutPtr<Mdl>, base: ConstPtr<CVoid>, length: ULong): MutPtr<Mdl> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesMmCreateMdl(memorydescriptorlist.rawAddress.toString(), base.rawAddress.toString(), length.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmCreateMirror(): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesMmCreateMirror() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmFreeContiguousMemory(baseaddress: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesMmFreeContiguousMemory(baseaddress.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmFreeContiguousMemorySpecifyCache(baseaddress: ConstPtr<CVoid>, numberofbytes: ULong, cachetype: MemoryCachingType) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesMmFreeContiguousMemorySpecifyCache(baseaddress.rawAddress.toString(), numberofbytes.toString(), cachetype)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmFreeMappingAddress(baseaddress: ConstPtr<CVoid>, pooltag: UInt) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesMmFreeMappingAddress(baseaddress.rawAddress.toString(), pooltag.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmFreeNonCachedMemory(baseaddress: ConstPtr<CVoid>, numberofbytes: ULong) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesMmFreeNonCachedMemory(baseaddress.rawAddress.toString(), numberofbytes.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmFreePagesFromMdl(memorydescriptorlist: MutPtr<Mdl>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesMmFreePagesFromMdl(memorydescriptorlist.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmFreePagesFromMdlEx(memorydescriptorlist: MutPtr<Mdl>, flags: UInt) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesMmFreePagesFromMdlEx(memorydescriptorlist.rawAddress.toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmGetCacheAttribute(physicaladdress: Long, cachetype: MutPtr<MemoryCachingType>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesMmGetCacheAttribute(physicaladdress.toString(), cachetype.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmGetCacheAttributeEx(physicaladdress: Long, flags: UInt, cachetype: MutPtr<MemoryCachingType>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesMmGetCacheAttributeEx(physicaladdress.toString(), flags.toInt(), cachetype.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmGetPhysicalAddress(baseaddress: ConstPtr<CVoid>): Long =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesMmGetPhysicalAddress(baseaddress.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmGetPhysicalMemoryRanges(): MutPtr<PhysicalMemoryRange> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesMmGetPhysicalMemoryRanges().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmGetPhysicalMemoryRangesEx(partitionobject: ConstPtr<CVoid>): MutPtr<PhysicalMemoryRange> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesMmGetPhysicalMemoryRangesEx(partitionobject.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmGetPhysicalMemoryRangesEx2(partitionobject: ConstPtr<CVoid>, flags: UInt): MutPtr<PhysicalMemoryRange> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesMmGetPhysicalMemoryRangesEx2(partitionobject.rawAddress.toString(), flags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmGetSystemRoutineAddress(systemroutinename: ConstPtr<UnicodeString>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesMmGetSystemRoutineAddress(systemroutinename.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmGetVirtualForPhysical(physicaladdress: Long): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesMmGetVirtualForPhysical(physicaladdress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmIsAddressValid(virtualaddress: ConstPtr<CVoid>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesMmIsAddressValid(virtualaddress.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmIsDriverSuspectForVerifier(driverobject: ConstPtr<DriverObject>): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesMmIsDriverSuspectForVerifier(driverobject.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmIsDriverVerifying(driverobject: ConstPtr<DriverObject>): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesMmIsDriverVerifying(driverobject.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmIsDriverVerifyingByAddress(addresswithinsection: ConstPtr<CVoid>): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesMmIsDriverVerifyingByAddress(addresswithinsection.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmIsIoSpaceActive(startaddress: Long, numberofbytes: ULong): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesMmIsIoSpaceActive(startaddress.toString(), numberofbytes.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmIsNonPagedSystemAddressValid(virtualaddress: ConstPtr<CVoid>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesMmIsNonPagedSystemAddressValid(virtualaddress.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmIsThisAnNtAsSystem(): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesMmIsThisAnNtAsSystem() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmIsVerifierEnabled(verifierflags: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesMmIsVerifierEnabled(verifierflags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmLockPagableDataSection(addresswithinsection: ConstPtr<CVoid>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesMmLockPagableDataSection(addresswithinsection.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmLockPagableSectionByHandle(imagesectionhandle: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesMmLockPagableSectionByHandle(imagesectionhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmMapIoSpace(physicaladdress: Long, numberofbytes: ULong, cachetype: MemoryCachingType): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesMmMapIoSpace(physicaladdress.toString(), numberofbytes.toString(), cachetype).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmMapIoSpaceEx(physicaladdress: Long, numberofbytes: ULong, protect: UInt): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesMmMapIoSpaceEx(physicaladdress.toString(), numberofbytes.toString(), protect.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmMapLockedPages(memorydescriptorlist: MutPtr<Mdl>, accessmode: Byte): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesMmMapLockedPages(memorydescriptorlist.rawAddress.toString(), accessmode.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmMapLockedPagesSpecifyCache(memorydescriptorlist: MutPtr<Mdl>, accessmode: Byte, cachetype: MemoryCachingType, requestedaddress: ConstPtr<CVoid>, bugcheckonfailure: UInt, priority: UInt): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesMmMapLockedPagesSpecifyCache(memorydescriptorlist.rawAddress.toString(), accessmode.toInt(), cachetype, requestedaddress.rawAddress.toString(), bugcheckonfailure.toInt(), priority.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmMapLockedPagesWithReservedMapping(mappingaddress: ConstPtr<CVoid>, pooltag: UInt, memorydescriptorlist: MutPtr<Mdl>, cachetype: MemoryCachingType): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesMmMapLockedPagesWithReservedMapping(mappingaddress.rawAddress.toString(), pooltag.toInt(), memorydescriptorlist.rawAddress.toString(), cachetype).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmMapMdl(memorydescriptorlist: MutPtr<Mdl>, protection: UInt, driverroutine: PmmMdlRoutine, drivercontext: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesMmMapMdl(memorydescriptorlist.rawAddress.toString(), protection.toInt(), 0L.toString(), drivercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmMapMemoryDumpMdlEx(va: ConstPtr<CVoid>, pagetotal: UInt, memorydumpmdl: MutPtr<Mdl>, flags: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesMmMapMemoryDumpMdlEx(va.rawAddress.toString(), pagetotal.toInt(), memorydumpmdl.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmMapUserAddressesToPage(baseaddress: ConstPtr<CVoid>, numberofbytes: ULong, pageaddress: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesMmMapUserAddressesToPage(baseaddress.rawAddress.toString(), numberofbytes.toString(), pageaddress.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmMapVideoDisplay(physicaladdress: Long, numberofbytes: ULong, cachetype: MemoryCachingType): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesMmMapVideoDisplay(physicaladdress.toString(), numberofbytes.toString(), cachetype).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmMapViewInSessionSpace(section: ConstPtr<CVoid>, mappedbase: MutPtr<MutPtr<CVoid>>, viewsize: MutPtr<ULong>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesMmMapViewInSessionSpace(section.rawAddress.toString(), mappedbase.rawAddress.toString(), viewsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmMapViewInSessionSpaceEx(section: ConstPtr<CVoid>, mappedbase: MutPtr<MutPtr<CVoid>>, viewsize: MutPtr<ULong>, sectionoffset: MutPtr<Long>, flags: ULong): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesMmMapViewInSessionSpaceEx(section.rawAddress.toString(), mappedbase.rawAddress.toString(), viewsize.rawAddress.toString(), sectionoffset.rawAddress.toString(), flags.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmMapViewInSystemSpace(section: ConstPtr<CVoid>, mappedbase: MutPtr<MutPtr<CVoid>>, viewsize: MutPtr<ULong>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesMmMapViewInSystemSpace(section.rawAddress.toString(), mappedbase.rawAddress.toString(), viewsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmMapViewInSystemSpaceEx(section: ConstPtr<CVoid>, mappedbase: MutPtr<MutPtr<CVoid>>, viewsize: MutPtr<ULong>, sectionoffset: MutPtr<Long>, flags: ULong): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesMmMapViewInSystemSpaceEx(section.rawAddress.toString(), mappedbase.rawAddress.toString(), viewsize.rawAddress.toString(), sectionoffset.rawAddress.toString(), flags.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmMdlPageContentsState(memorydescriptorlist: MutPtr<Mdl>, state: MmMdlPageContentsState): MmMdlPageContentsState =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesMmMdlPageContentsState(memorydescriptorlist.rawAddress.toString(), state) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmPageEntireDriver(addresswithinsection: ConstPtr<CVoid>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesMmPageEntireDriver(addresswithinsection.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmProbeAndLockPages(memorydescriptorlist: MutPtr<Mdl>, accessmode: Byte, operation: LockOperation) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesMmProbeAndLockPages(memorydescriptorlist.rawAddress.toString(), accessmode.toInt(), operation)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmProbeAndLockProcessPages(memorydescriptorlist: MutPtr<Mdl>, process: Peprocess, accessmode: Byte, operation: LockOperation) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesMmProbeAndLockProcessPages(memorydescriptorlist.rawAddress.toString(), process.toString(), accessmode.toInt(), operation)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmProbeAndLockSelectedPages(memorydescriptorlist: MutPtr<Mdl>, segmentarray: ConstPtr<FileSegmentElement>, accessmode: Byte, operation: LockOperation) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesMmProbeAndLockSelectedPages(memorydescriptorlist.rawAddress.toString(), segmentarray.rawAddress.toString(), accessmode.toInt(), operation)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmProtectDriverSection(addresswithinsection: ConstPtr<CVoid>, size: ULong, flags: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesMmProtectDriverSection(addresswithinsection.rawAddress.toString(), size.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmProtectMdlSystemAddress(memorydescriptorlist: ConstPtr<Mdl>, newprotect: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesMmProtectMdlSystemAddress(memorydescriptorlist.rawAddress.toString(), newprotect.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmQuerySystemSize(): MmSystemsize =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesMmQuerySystemSize() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmRemovePhysicalMemory(startaddress: ConstPtr<Long>, numberofbytes: MutPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesMmRemovePhysicalMemory(startaddress.rawAddress.toString(), numberofbytes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmResetDriverPaging(addresswithinsection: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesMmResetDriverPaging(addresswithinsection.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmRotatePhysicalView(virtualaddress: ConstPtr<CVoid>, numberofbytes: MutPtr<ULong>, newmdl: ConstPtr<Mdl>, direction: MmRotateDirection, copyfunction: PmmRotateCopyCallbackFunction, context: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesMmRotatePhysicalView(virtualaddress.rawAddress.toString(), numberofbytes.rawAddress.toString(), newmdl.rawAddress.toString(), direction, 0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmSecureVirtualMemory(address: ConstPtr<CVoid>, size: ULong, probemode: UInt): Handle =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesMmSecureVirtualMemory(address.rawAddress.toString(), size.toString(), probemode.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmSecureVirtualMemoryEx(address: ConstPtr<CVoid>, size: ULong, probemode: UInt, flags: UInt): Handle =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesMmSecureVirtualMemoryEx(address.rawAddress.toString(), size.toString(), probemode.toInt(), flags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmSetPermanentCacheAttribute(startaddress: Long, numberofbytes: Long, cachetype: MemoryCachingType, flags: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesMmSetPermanentCacheAttribute(startaddress.toString(), numberofbytes.toString(), cachetype, flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmSizeOfMdl(base: ConstPtr<CVoid>, length: ULong): ULong =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesMmSizeOfMdl(base.rawAddress.toString(), length.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmUnlockPagableImageSection(imagesectionhandle: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesMmUnlockPagableImageSection(imagesectionhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmUnlockPages(memorydescriptorlist: MutPtr<Mdl>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesMmUnlockPages(memorydescriptorlist.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmUnmapIoSpace(baseaddress: ConstPtr<CVoid>, numberofbytes: ULong) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesMmUnmapIoSpace(baseaddress.rawAddress.toString(), numberofbytes.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmUnmapLockedPages(baseaddress: ConstPtr<CVoid>, memorydescriptorlist: MutPtr<Mdl>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesMmUnmapLockedPages(baseaddress.rawAddress.toString(), memorydescriptorlist.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmUnmapReservedMapping(baseaddress: ConstPtr<CVoid>, pooltag: UInt, memorydescriptorlist: MutPtr<Mdl>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesMmUnmapReservedMapping(baseaddress.rawAddress.toString(), pooltag.toInt(), memorydescriptorlist.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmUnmapVideoDisplay(baseaddress: ConstPtr<CVoid>, numberofbytes: ULong) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesMmUnmapVideoDisplay(baseaddress.rawAddress.toString(), numberofbytes.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmUnmapViewInSessionSpace(mappedbase: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesMmUnmapViewInSessionSpace(mappedbase.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmUnmapViewInSystemSpace(mappedbase: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesMmUnmapViewInSystemSpace(mappedbase.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmUnsecureVirtualMemory(securehandle: Handle) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesMmUnsecureVirtualMemory(securehandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ntAllocateLocallyUniqueId(luid: MutPtr<Luid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtAllocateLocallyUniqueId(luid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCommitComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtCommitComplete(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCommitEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtCommitEnlistment(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCommitTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtCommitTransaction(transactionhandle.rawAddress.toString(), wait) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCreateEnlistment(enlistmenthandle: MutPtr<Handle>, desiredaccess: UInt, resourcemanagerhandle: Handle, transactionhandle: Handle, objectattributes: ConstPtr<ObjectAttributes>, createoptions: UInt, notificationmask: UInt, enlistmentkey: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtCreateEnlistment(enlistmenthandle.rawAddress.toString(), desiredaccess.toInt(), resourcemanagerhandle.rawAddress.toString(), transactionhandle.rawAddress.toString(), objectattributes.rawAddress.toString(), createoptions.toInt(), notificationmask.toInt(), enlistmentkey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCreateResourceManager(resourcemanagerhandle: MutPtr<Handle>, desiredaccess: UInt, tmhandle: Handle, rmguid: ConstPtr<Guid>, objectattributes: ConstPtr<ObjectAttributes>, createoptions: UInt, description: ConstPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtCreateResourceManager(resourcemanagerhandle.rawAddress.toString(), desiredaccess.toInt(), tmhandle.rawAddress.toString(), rmguid.rawAddress.toString(), objectattributes.rawAddress.toString(), createoptions.toInt(), description.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCreateTransaction(transactionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, uow: ConstPtr<Guid>, tmhandle: Handle, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: ConstPtr<Long>, description: ConstPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtCreateTransaction(transactionhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), uow.rawAddress.toString(), tmhandle.rawAddress.toString(), createoptions.toInt(), isolationlevel.toInt(), isolationflags.toInt(), timeout.rawAddress.toString(), description.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCreateTransactionManager(tmhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, logfilename: ConstPtr<UnicodeString>, createoptions: UInt, commitstrength: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtCreateTransactionManager(tmhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), logfilename.rawAddress.toString(), createoptions.toInt(), commitstrength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntDisplayString(string: ConstPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtDisplayString(string.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntEnumerateTransactionObject(rootobjecthandle: Handle, querytype: KtmobjectType, objectcursor: MutPtr<KtmobjectCursor>, objectcursorlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtEnumerateTransactionObject(rootobjecthandle.rawAddress.toString(), querytype, objectcursor.rawAddress.toString(), objectcursorlength.toInt(), returnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntGetNotificationResourceManager(resourcemanagerhandle: Handle, transactionnotification: MutPtr<TransactionNotification>, notificationlength: UInt, timeout: ConstPtr<Long>, returnlength: MutPtr<UInt>, asynchronous: UInt, asynchronouscontext: ULong): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtGetNotificationResourceManager(resourcemanagerhandle.rawAddress.toString(), transactionnotification.rawAddress.toString(), notificationlength.toInt(), timeout.rawAddress.toString(), returnlength.rawAddress.toString(), asynchronous.toInt(), asynchronouscontext.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntLoadDriver(driverservicename: ConstPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtLoadDriver(driverservicename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntMakeTemporaryObject(handle: Handle): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtMakeTemporaryObject(handle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntManagePartition(targethandle: Handle, sourcehandle: Handle, partitioninformationclass: PartitionInformationClass, partitioninformation: MutPtr<CVoid>, partitioninformationlength: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtManagePartition(targethandle.rawAddress.toString(), sourcehandle.rawAddress.toString(), partitioninformationclass, partitioninformation.rawAddress.toString(), partitioninformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenEnlistment(enlistmenthandle: MutPtr<Handle>, desiredaccess: UInt, resourcemanagerhandle: Handle, enlistmentguid: ConstPtr<Guid>, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtOpenEnlistment(enlistmenthandle.rawAddress.toString(), desiredaccess.toInt(), resourcemanagerhandle.rawAddress.toString(), enlistmentguid.rawAddress.toString(), objectattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenResourceManager(resourcemanagerhandle: MutPtr<Handle>, desiredaccess: UInt, tmhandle: Handle, resourcemanagerguid: ConstPtr<Guid>, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtOpenResourceManager(resourcemanagerhandle.rawAddress.toString(), desiredaccess.toInt(), tmhandle.rawAddress.toString(), resourcemanagerguid.rawAddress.toString(), objectattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenTransaction(transactionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, uow: ConstPtr<Guid>, tmhandle: Handle): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtOpenTransaction(transactionhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), uow.rawAddress.toString(), tmhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenTransactionManager(tmhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, logfilename: ConstPtr<UnicodeString>, tmidentity: ConstPtr<Guid>, openoptions: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtOpenTransactionManager(tmhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), logfilename.rawAddress.toString(), tmidentity.rawAddress.toString(), openoptions.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntPowerInformation(informationlevel: PowerInformationLevel, inputbuffer: ConstPtr<CVoid>, inputbufferlength: UInt, outputbuffer: MutPtr<CVoid>, outputbufferlength: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtPowerInformation(informationlevel, inputbuffer.rawAddress.toString(), inputbufferlength.toInt(), outputbuffer.rawAddress.toString(), outputbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntPrePrepareComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtPrePrepareComplete(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntPrePrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtPrePrepareEnlistment(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntPrepareComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtPrepareComplete(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntPrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtPrepareEnlistment(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntPropagationComplete(resourcemanagerhandle: Handle, requestcookie: UInt, bufferlength: UInt, buffer: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtPropagationComplete(resourcemanagerhandle.rawAddress.toString(), requestcookie.toInt(), bufferlength.toInt(), buffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntPropagationFailed(resourcemanagerhandle: Handle, requestcookie: UInt, propstatus: Ntstatus): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtPropagationFailed(resourcemanagerhandle.rawAddress.toString(), requestcookie.toInt(), propstatus) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: MutPtr<CVoid>, enlistmentinformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtQueryInformationEnlistment(enlistmenthandle.rawAddress.toString(), enlistmentinformationclass, enlistmentinformation.rawAddress.toString(), enlistmentinformationlength.toInt(), returnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: MutPtr<CVoid>, resourcemanagerinformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtQueryInformationResourceManager(resourcemanagerhandle.rawAddress.toString(), resourcemanagerinformationclass, resourcemanagerinformation.rawAddress.toString(), resourcemanagerinformationlength.toInt(), returnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: MutPtr<CVoid>, transactioninformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtQueryInformationTransaction(transactionhandle.rawAddress.toString(), transactioninformationclass, transactioninformation.rawAddress.toString(), transactioninformationlength.toInt(), returnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryInformationTransactionManager(transactionmanagerhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: MutPtr<CVoid>, transactionmanagerinformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtQueryInformationTransactionManager(transactionmanagerhandle.rawAddress.toString(), transactionmanagerinformationclass, transactionmanagerinformation.rawAddress.toString(), transactionmanagerinformationlength.toInt(), returnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntReadOnlyEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtReadOnlyEnlistment(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntRecoverEnlistment(enlistmenthandle: Handle, enlistmentkey: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtRecoverEnlistment(enlistmenthandle.rawAddress.toString(), enlistmentkey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntRecoverResourceManager(resourcemanagerhandle: Handle): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtRecoverResourceManager(resourcemanagerhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntRecoverTransactionManager(transactionmanagerhandle: Handle): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtRecoverTransactionManager(transactionmanagerhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntRegisterProtocolAddressInformation(resourcemanager: Handle, protocolid: ConstPtr<Guid>, protocolinformationsize: UInt, protocolinformation: ConstPtr<CVoid>, createoptions: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtRegisterProtocolAddressInformation(resourcemanager.rawAddress.toString(), protocolid.rawAddress.toString(), protocolinformationsize.toInt(), protocolinformation.rawAddress.toString(), createoptions.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntRenameTransactionManager(logfilename: ConstPtr<UnicodeString>, existingtransactionmanagerguid: ConstPtr<Guid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtRenameTransactionManager(logfilename.rawAddress.toString(), existingtransactionmanagerguid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntRollbackComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtRollbackComplete(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntRollbackEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtRollbackEnlistment(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntRollbackTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtRollbackTransaction(transactionhandle.rawAddress.toString(), wait) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntRollforwardTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtRollforwardTransactionManager(transactionmanagerhandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: ConstPtr<CVoid>, enlistmentinformationlength: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtSetInformationEnlistment(enlistmenthandle.rawAddress.toString(), enlistmentinformationclass, enlistmentinformation.rawAddress.toString(), enlistmentinformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: ConstPtr<CVoid>, resourcemanagerinformationlength: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtSetInformationResourceManager(resourcemanagerhandle.rawAddress.toString(), resourcemanagerinformationclass, resourcemanagerinformation.rawAddress.toString(), resourcemanagerinformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: ConstPtr<CVoid>, transactioninformationlength: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtSetInformationTransaction(transactionhandle.rawAddress.toString(), transactioninformationclass, transactioninformation.rawAddress.toString(), transactioninformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetInformationTransactionManager(tmhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: ConstPtr<CVoid>, transactionmanagerinformationlength: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtSetInformationTransactionManager(tmhandle.rawAddress.toString(), transactionmanagerinformationclass, transactionmanagerinformation.rawAddress.toString(), transactionmanagerinformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSinglePhaseReject(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtSinglePhaseReject(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntUnloadDriver(driverservicename: ConstPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesNtUnloadDriver(driverservicename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obCloseHandle(handle: Handle, previousmode: Byte): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesObCloseHandle(handle.rawAddress.toString(), previousmode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obDereferenceObjectDeferDelete(obj: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesObDereferenceObjectDeferDelete(obj.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun obDereferenceObjectDeferDeleteWithTag(obj: ConstPtr<CVoid>, tag: UInt) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesObDereferenceObjectDeferDeleteWithTag(obj.rawAddress.toString(), tag.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun obGetFilterVersion(): UShort =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesObGetFilterVersion().toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obGetObjectSecurity(obj: ConstPtr<CVoid>, securitydescriptor: MutPtr<PsecurityDescriptor>, memoryallocated: MutPtr<Boolean>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesObGetObjectSecurity(obj.rawAddress.toString(), securitydescriptor.rawAddress.toString(), memoryallocated.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obReferenceObjectByHandle(handle: Handle, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, obj: MutPtr<MutPtr<CVoid>>, handleinformation: MutPtr<ObjectHandleInformation>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesObReferenceObjectByHandle(handle.rawAddress.toString(), desiredaccess.toInt(), objecttype.toString(), accessmode.toInt(), obj.rawAddress.toString(), handleinformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obReferenceObjectByHandleWithTag(handle: Handle, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, tag: UInt, obj: MutPtr<MutPtr<CVoid>>, handleinformation: MutPtr<ObjectHandleInformation>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesObReferenceObjectByHandleWithTag(handle.rawAddress.toString(), desiredaccess.toInt(), objecttype.toString(), accessmode.toInt(), tag.toInt(), obj.rawAddress.toString(), handleinformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obReferenceObjectByPointer(obj: ConstPtr<CVoid>, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesObReferenceObjectByPointer(obj.rawAddress.toString(), desiredaccess.toInt(), objecttype.toString(), accessmode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obReferenceObjectByPointerWithTag(obj: ConstPtr<CVoid>, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, tag: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesObReferenceObjectByPointerWithTag(obj.rawAddress.toString(), desiredaccess.toInt(), objecttype.toString(), accessmode.toInt(), tag.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obReferenceObjectSafe(obj: ConstPtr<CVoid>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesObReferenceObjectSafe(obj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obReferenceObjectSafeWithTag(obj: ConstPtr<CVoid>, tag: UInt): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesObReferenceObjectSafeWithTag(obj.rawAddress.toString(), tag.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obRegisterCallbacks(callbackregistration: ConstPtr<ObCallbackRegistration>, registrationhandle: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesObRegisterCallbacks(callbackregistration.rawAddress.toString(), registrationhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obReleaseObjectSecurity(securitydescriptor: PsecurityDescriptor, memoryallocated: Boolean) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesObReleaseObjectSecurity(securitydescriptor.rawAddress.toString(), memoryallocated)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun obUnRegisterCallbacks(registrationhandle: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesObUnRegisterCallbacks(registrationhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun obfDereferenceObject(obj: ConstPtr<CVoid>): Long =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesObfDereferenceObject(obj.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obfDereferenceObjectWithTag(obj: ConstPtr<CVoid>, tag: UInt): Long =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesObfDereferenceObjectWithTag(obj.rawAddress.toString(), tag.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obfReferenceObject(obj: ConstPtr<CVoid>): Long =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesObfReferenceObject(obj.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obfReferenceObjectWithTag(obj: ConstPtr<CVoid>, tag: UInt): Long =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesObfReferenceObjectWithTag(obj.rawAddress.toString(), tag.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pcwAddInstance(buffer: PpcwBuffer, name: ConstPtr<UnicodeString>, id: UInt, count: UInt, data: ConstPtr<PcwData>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPcwAddInstance(buffer.toString(), name.rawAddress.toString(), id.toInt(), count.toInt(), data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pcwCloseInstance(instance: PpcwInstance) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesPcwCloseInstance(instance.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pcwCreateInstance(instance: MutPtr<PpcwInstance>, registration: PpcwRegistration, name: ConstPtr<UnicodeString>, count: UInt, data: ConstPtr<PcwData>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPcwCreateInstance(instance.rawAddress.toString(), registration.toString(), name.rawAddress.toString(), count.toInt(), data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pcwRegister(registration: MutPtr<PpcwRegistration>, info: ConstPtr<PcwRegistrationInformation>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPcwRegister(registration.rawAddress.toString(), info.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pcwUnregister(registration: PpcwRegistration) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesPcwUnregister(registration.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poCallDriver(deviceobject: ConstPtr<DeviceObject>, irp: MutPtr<Irp>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPoCallDriver(deviceobject.rawAddress.toString(), irp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poClearPowerRequest(powerrequest: MutPtr<CVoid>, type: PowerRequestType): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPoClearPowerRequest(powerrequest.rawAddress.toString(), type) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poCreatePowerRequest(powerrequest: MutPtr<MutPtr<CVoid>>, deviceobject: ConstPtr<DeviceObject>, context: ConstPtr<CountedReasonContext>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPoCreatePowerRequest(powerrequest.rawAddress.toString(), deviceobject.rawAddress.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poCreateThermalRequest(thermalrequest: MutPtr<MutPtr<CVoid>>, targetdeviceobject: ConstPtr<DeviceObject>, policydeviceobject: ConstPtr<DeviceObject>, context: ConstPtr<CountedReasonContext>, flags: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPoCreateThermalRequest(thermalrequest.rawAddress.toString(), targetdeviceobject.rawAddress.toString(), policydeviceobject.rawAddress.toString(), context.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poDeletePowerRequest(powerrequest: MutPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesPoDeletePowerRequest(powerrequest.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poDeleteThermalRequest(thermalrequest: MutPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesPoDeleteThermalRequest(thermalrequest.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poEndDeviceBusy(idlepointer: MutPtr<UInt>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesPoEndDeviceBusy(idlepointer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxActivateComponent(handle: Pohandle, component: UInt, flags: UInt) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesPoFxActivateComponent(handle.rawAddress.toString(), component.toInt(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxCompleteDevicePowerNotRequired(handle: Pohandle) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesPoFxCompleteDevicePowerNotRequired(handle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxCompleteDirectedPowerDown(handle: Pohandle) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesPoFxCompleteDirectedPowerDown(handle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxCompleteIdleCondition(handle: Pohandle, component: UInt) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesPoFxCompleteIdleCondition(handle.rawAddress.toString(), component.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxCompleteIdleState(handle: Pohandle, component: UInt) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesPoFxCompleteIdleState(handle.rawAddress.toString(), component.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxIdleComponent(handle: Pohandle, component: UInt, flags: UInt) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesPoFxIdleComponent(handle.rawAddress.toString(), component.toInt(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxIssueComponentPerfStateChange(handle: Pohandle, flags: UInt, component: UInt, perfchange: ConstPtr<PoFxPerfStateChange>, context: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesPoFxIssueComponentPerfStateChange(handle.rawAddress.toString(), flags.toInt(), component.toInt(), perfchange.rawAddress.toString(), context.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxIssueComponentPerfStateChangeMultiple(handle: Pohandle, flags: UInt, component: UInt, perfchangescount: UInt, perfchanges: ConstPtr<PoFxPerfStateChange>, context: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesPoFxIssueComponentPerfStateChangeMultiple(handle.rawAddress.toString(), flags.toInt(), component.toInt(), perfchangescount.toInt(), perfchanges.rawAddress.toString(), context.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxNotifySurprisePowerOn(pdo: ConstPtr<DeviceObject>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesPoFxNotifySurprisePowerOn(pdo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxPowerControl(handle: Pohandle, powercontrolcode: ConstPtr<Guid>, inbuffer: ConstPtr<CVoid>, inbuffersize: ULong, outbuffer: MutPtr<CVoid>, outbuffersize: ULong, bytesreturned: MutPtr<ULong>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPoFxPowerControl(handle.rawAddress.toString(), powercontrolcode.rawAddress.toString(), inbuffer.rawAddress.toString(), inbuffersize.toString(), outbuffer.rawAddress.toString(), outbuffersize.toString(), bytesreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poFxPowerOnCrashdumpDevice(handle: Pohandle, context: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPoFxPowerOnCrashdumpDevice(handle.rawAddress.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poFxQueryCurrentComponentPerfState(handle: Pohandle, flags: UInt, component: UInt, setindex: UInt, currentperf: MutPtr<ULong>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPoFxQueryCurrentComponentPerfState(handle.rawAddress.toString(), flags.toInt(), component.toInt(), setindex.toInt(), currentperf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poFxRegisterComponentPerfStates(handle: Pohandle, component: UInt, flags: ULong, componentperfstatecallback: PpoFxComponentPerfStateCallback, inputstateinfo: ConstPtr<PoFxComponentPerfInfo>, outputstateinfo: MutPtr<MutPtr<PoFxComponentPerfInfo>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPoFxRegisterComponentPerfStates(handle.rawAddress.toString(), component.toInt(), flags.toString(), 0L.toString(), inputstateinfo.rawAddress.toString(), outputstateinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poFxRegisterCrashdumpDevice(handle: Pohandle): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPoFxRegisterCrashdumpDevice(handle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poFxRegisterDevice(pdo: ConstPtr<DeviceObject>, device: ConstPtr<PoFxDeviceV1>, handle: MutPtr<Pohandle>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPoFxRegisterDevice(pdo.rawAddress.toString(), device.rawAddress.toString(), handle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poFxRegisterDripsWatchdogCallback(handle: Pohandle, callback: PpoFxDripsWatchdogCallback, includechilddevices: Boolean, matchingdriverobject: ConstPtr<DriverObject>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesPoFxRegisterDripsWatchdogCallback(handle.rawAddress.toString(), 0L.toString(), includechilddevices, matchingdriverobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxReportDevicePoweredOn(handle: Pohandle) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesPoFxReportDevicePoweredOn(handle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxSetComponentLatency(handle: Pohandle, component: UInt, latency: ULong) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesPoFxSetComponentLatency(handle.rawAddress.toString(), component.toInt(), latency.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxSetComponentResidency(handle: Pohandle, component: UInt, residency: ULong) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesPoFxSetComponentResidency(handle.rawAddress.toString(), component.toInt(), residency.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxSetComponentWake(handle: Pohandle, component: UInt, wakehint: Boolean) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesPoFxSetComponentWake(handle.rawAddress.toString(), component.toInt(), wakehint)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxSetDeviceIdleTimeout(handle: Pohandle, idletimeout: ULong) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesPoFxSetDeviceIdleTimeout(handle.rawAddress.toString(), idletimeout.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxSetTargetDripsDevicePowerState(handle: Pohandle, targetstate: DevicePowerState): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPoFxSetTargetDripsDevicePowerState(handle.rawAddress.toString(), targetstate) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poFxStartDevicePowerManagement(handle: Pohandle) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesPoFxStartDevicePowerManagement(handle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxUnregisterDevice(handle: Pohandle) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesPoFxUnregisterDevice(handle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poGetSystemWake(irp: ConstPtr<Irp>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPoGetSystemWake(irp.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poGetThermalRequestSupport(thermalrequest: ConstPtr<CVoid>, type: PoThermalRequestType): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPoGetThermalRequestSupport(thermalrequest.rawAddress.toString(), type) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poQueryWatchdogTime(pdo: ConstPtr<DeviceObject>, secondsremaining: MutPtr<UInt>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPoQueryWatchdogTime(pdo.rawAddress.toString(), secondsremaining.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poRegisterDeviceForIdleDetection(deviceobject: ConstPtr<DeviceObject>, conservationidletime: UInt, performanceidletime: UInt, state: DevicePowerState): MutPtr<UInt> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesPoRegisterDeviceForIdleDetection(deviceobject.rawAddress.toString(), conservationidletime.toInt(), performanceidletime.toInt(), state).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poRegisterPowerSettingCallback(deviceobject: ConstPtr<DeviceObject>, settingguid: ConstPtr<Guid>, callback: PpowerSettingCallback, context: ConstPtr<CVoid>, handle: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPoRegisterPowerSettingCallback(deviceobject.rawAddress.toString(), settingguid.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), handle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poRegisterSystemState(statehandle: MutPtr<CVoid>, flags: UInt): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesPoRegisterSystemState(statehandle.rawAddress.toString(), flags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poRequestPowerIrp(deviceobject: ConstPtr<DeviceObject>, minorfunction: UByte, powerstate: PowerState, completionfunction: PrequestPowerComplete, context: ConstPtr<CVoid>, irp: MutPtr<MutPtr<Irp>>): Ntstatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poSetDeviceBusyEx(idlepointer: MutPtr<UInt>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesPoSetDeviceBusyEx(idlepointer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poSetHiberRange(memorymap: ConstPtr<CVoid>, flags: UInt, address: ConstPtr<CVoid>, length: ULong, tag: UInt) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesPoSetHiberRange(memorymap.rawAddress.toString(), flags.toInt(), address.rawAddress.toString(), length.toString(), tag.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poSetPowerRequest(powerrequest: MutPtr<CVoid>, type: PowerRequestType): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPoSetPowerRequest(powerrequest.rawAddress.toString(), type) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poSetPowerState(deviceobject: ConstPtr<DeviceObject>, type: PowerStateType, state: PowerState): PowerState =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poSetSystemState(flags: UInt) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesPoSetSystemState(flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poSetSystemWake(irp: MutPtr<Irp>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesPoSetSystemWake(irp.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poSetSystemWakeDevice(deviceobject: ConstPtr<DeviceObject>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesPoSetSystemWakeDevice(deviceobject.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poSetThermalActiveCooling(thermalrequest: MutPtr<CVoid>, engaged: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPoSetThermalActiveCooling(thermalrequest.rawAddress.toString(), engaged) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poSetThermalPassiveCooling(thermalrequest: MutPtr<CVoid>, throttle: UByte): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPoSetThermalPassiveCooling(thermalrequest.rawAddress.toString(), throttle.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poStartDeviceBusy(idlepointer: MutPtr<UInt>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesPoStartDeviceBusy(idlepointer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poStartNextPowerIrp(irp: MutPtr<Irp>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesPoStartNextPowerIrp(irp.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poUnregisterPowerSettingCallback(handle: MutPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPoUnregisterPowerSettingCallback(handle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poUnregisterSystemState(statehandle: MutPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesPoUnregisterSystemState(statehandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun probeForRead(address: ConstPtr<CVoid>, length: ULong, alignment: UInt) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesProbeForRead(address.rawAddress.toString(), length.toString(), alignment.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun probeForWrite(address: MutPtr<CVoid>, length: ULong, alignment: UInt) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesProbeForWrite(address.rawAddress.toString(), length.toString(), alignment.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psAcquireSiloHardReference(silo: Pesilo): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsAcquireSiloHardReference(silo.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psAllocSiloContextSlot(reserved: ULong, returnedcontextslot: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsAllocSiloContextSlot(reserved.toString(), returnedcontextslot.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psAllocateAffinityToken(affinitytoken: MutPtr<PaffinityToken>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsAllocateAffinityToken(affinitytoken.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psAttachSiloToCurrentThread(silo: Pesilo): Pesilo =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsAttachSiloToCurrentThread(silo.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psCreateSiloContext(silo: Pesilo, size: UInt, pooltype: PoolType, contextcleanupcallback: SiloContextCleanupCallback, returnedsilocontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsCreateSiloContext(silo.toString(), size.toInt(), pooltype, 0L.toString(), returnedsilocontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psCreateSystemThread(threadhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, processhandle: Handle, clientid: MutPtr<ClientId>, startroutine: PkstartRoutine, startcontext: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsCreateSystemThread(threadhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), processhandle.rawAddress.toString(), clientid.rawAddress.toString(), 0L.toString(), startcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psDereferenceSiloContext(silocontext: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesPsDereferenceSiloContext(silocontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psDetachSiloFromCurrentThread(previoussilo: Pesilo) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesPsDetachSiloFromCurrentThread(previoussilo.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psFreeAffinityToken(affinitytoken: PaffinityToken) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesPsFreeAffinityToken(affinitytoken.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psFreeSiloContextSlot(contextslot: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsFreeSiloContextSlot(contextslot.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetCurrentProcessId(): Handle =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesPsGetCurrentProcessId().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetCurrentServerSilo(): Pesilo =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsGetCurrentServerSilo().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetCurrentServerSiloName(): MutPtr<UnicodeString> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesPsGetCurrentServerSiloName().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetCurrentSilo(): Pesilo =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsGetCurrentSilo().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetCurrentThreadId(): Handle =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesPsGetCurrentThreadId().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetCurrentThreadTeb(): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesPsGetCurrentThreadTeb().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetEffectiveServerSilo(silo: Pesilo): Pesilo =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsGetEffectiveServerSilo(silo.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetHostSilo(): Pesilo =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsGetHostSilo().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetJobServerSilo(job: Pejob, serversilo: MutPtr<Pesilo>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsGetJobServerSilo(job.toString(), serversilo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetJobSilo(job: Pejob, silo: MutPtr<Pesilo>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsGetJobSilo(job.toString(), silo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetParentSilo(job: Pejob): Pesilo =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsGetParentSilo(job.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetPermanentSiloContext(silo: Pesilo, contextslot: UInt, returnedsilocontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsGetPermanentSiloContext(silo.toString(), contextslot.toInt(), returnedsilocontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetProcessCreateTimeQuadPart(process: Peprocess): Long =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsGetProcessCreateTimeQuadPart(process.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetProcessExitStatus(process: Peprocess): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsGetProcessExitStatus(process.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetProcessId(process: Peprocess): Handle =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesPsGetProcessId(process.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetProcessStartKey(process: Peprocess): ULong =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsGetProcessStartKey(process.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetServerSiloServiceSessionId(silo: Pesilo): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsGetServerSiloServiceSessionId(silo.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetSiloContainerId(silo: Pesilo): MutPtr<Guid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesPsGetSiloContainerId(silo.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetSiloContext(silo: Pesilo, contextslot: UInt, returnedsilocontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsGetSiloContext(silo.toString(), contextslot.toInt(), returnedsilocontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetSiloMonitorContextSlot(monitor: PsiloMonitor): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsGetSiloMonitorContextSlot(monitor.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetThreadCreateTime(thread: Pethread): Long =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsGetThreadCreateTime(thread.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetThreadExitStatus(thread: Pethread): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsGetThreadExitStatus(thread.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetThreadId(thread: Pethread): Handle =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesPsGetThreadId(thread.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetThreadProcessId(thread: Pethread): Handle =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesPsGetThreadProcessId(thread.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetThreadProperty(thread: Pethread, key: ULong, flags: UInt): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesPsGetThreadProperty(thread.toString(), key.toString(), flags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetThreadServerSilo(thread: Pethread): Pesilo =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsGetThreadServerSilo(thread.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetVersion(majorversion: MutPtr<UInt>, minorversion: MutPtr<UInt>, buildnumber: MutPtr<UInt>, csdversion: MutPtr<UnicodeString>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsGetVersion(majorversion.rawAddress.toString(), minorversion.rawAddress.toString(), buildnumber.rawAddress.toString(), csdversion.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psInsertPermanentSiloContext(silo: Pesilo, contextslot: UInt, silocontext: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsInsertPermanentSiloContext(silo.toString(), contextslot.toInt(), silocontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psInsertSiloContext(silo: Pesilo, contextslot: UInt, silocontext: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsInsertSiloContext(silo.toString(), contextslot.toInt(), silocontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psIsCurrentThreadInServerSilo(): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsIsCurrentThreadInServerSilo() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psIsCurrentThreadPrefetching(): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsIsCurrentThreadPrefetching() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psIsHostSilo(silo: Pesilo): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsIsHostSilo(silo.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psMakeSiloContextPermanent(silo: Pesilo, contextslot: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsMakeSiloContextPermanent(silo.toString(), contextslot.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psQueryTotalCycleTimeProcess(process: Peprocess, cycletimestamp: MutPtr<ULong>): ULong =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsQueryTotalCycleTimeProcess(process.toString(), cycletimestamp.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psReferenceSiloContext(silocontext: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesPsReferenceSiloContext(silocontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psRegisterSiloMonitor(registration: ConstPtr<SiloMonitorRegistration>, returnedmonitor: MutPtr<PsiloMonitor>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsRegisterSiloMonitor(registration.rawAddress.toString(), returnedmonitor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psReleaseSiloHardReference(silo: Pesilo) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesPsReleaseSiloHardReference(silo.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psRemoveCreateThreadNotifyRoutine(notifyroutine: PcreateThreadNotifyRoutine): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsRemoveCreateThreadNotifyRoutine(0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psRemoveLoadImageNotifyRoutine(notifyroutine: PloadImageNotifyRoutine): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsRemoveLoadImageNotifyRoutine(0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psRemoveSiloContext(silo: Pesilo, contextslot: UInt, removedsilocontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsRemoveSiloContext(silo.toString(), contextslot.toInt(), removedsilocontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psReplaceSiloContext(silo: Pesilo, contextslot: UInt, newsilocontext: ConstPtr<CVoid>, oldsilocontext: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsReplaceSiloContext(silo.toString(), contextslot.toInt(), newsilocontext.rawAddress.toString(), oldsilocontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psRevertToUserMultipleGroupAffinityThread(affinitytoken: PaffinityToken) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesPsRevertToUserMultipleGroupAffinityThread(affinitytoken.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psSetCreateProcessNotifyRoutine(notifyroutine: PcreateProcessNotifyRoutine, remove: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsSetCreateProcessNotifyRoutine(0L.toString(), remove) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psSetCreateProcessNotifyRoutineEx(notifyroutine: PcreateProcessNotifyRoutineEx, remove: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsSetCreateProcessNotifyRoutineEx(0L.toString(), remove) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psSetCreateProcessNotifyRoutineEx2(notifytype: Pscreateprocessnotifytype, notifyinformation: ConstPtr<CVoid>, remove: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsSetCreateProcessNotifyRoutineEx2(notifytype, notifyinformation.rawAddress.toString(), remove) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psSetCreateThreadNotifyRoutine(notifyroutine: PcreateThreadNotifyRoutine): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsSetCreateThreadNotifyRoutine(0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psSetCreateThreadNotifyRoutineEx(notifytype: Pscreatethreadnotifytype, notifyinformation: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsSetCreateThreadNotifyRoutineEx(notifytype, notifyinformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psSetCurrentThreadPrefetching(prefetching: Boolean): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsSetCurrentThreadPrefetching(prefetching) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psSetLoadImageNotifyRoutine(notifyroutine: PloadImageNotifyRoutine): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsSetLoadImageNotifyRoutine(0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psSetLoadImageNotifyRoutineEx(notifyroutine: PloadImageNotifyRoutine, flags: ULong): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsSetLoadImageNotifyRoutineEx(0L.toString(), flags.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psSetSystemMultipleGroupAffinityThread(groupaffinities: ConstPtr<GroupAffinity>, groupcount: UShort, affinitytoken: PaffinityToken): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsSetSystemMultipleGroupAffinityThread(groupaffinities.rawAddress.toString(), groupcount.toInt(), affinitytoken.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psStartSiloMonitor(monitor: PsiloMonitor): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsStartSiloMonitor(monitor.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psTerminateServerSilo(serversilo: Pesilo, exitstatus: Ntstatus) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesPsTerminateServerSilo(serversilo.toString(), exitstatus)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psTerminateSystemThread(exitstatus: Ntstatus): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsTerminateSystemThread(exitstatus) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psUnregisterSiloMonitor(monitor: PsiloMonitor) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesPsUnregisterSiloMonitor(monitor.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psWrapApcWow64Thread(apccontext: MutPtr<MutPtr<CVoid>>, apcroutine: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPsWrapApcWow64Thread(apccontext.rawAddress.toString(), apcroutine.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pshedAllocateMemory(size: UInt): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesPshedAllocateMemory(size.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pshedFreeMemory(address: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesPshedFreeMemory(address.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pshedIsSystemWheaEnabled(): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPshedIsSystemWheaEnabled() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pshedRegisterPlugin(packet: MutPtr<WheaPshedPluginRegistrationPacketV2>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPshedRegisterPlugin(packet.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pshedSynchronizeExecution(errorsource: ConstPtr<WheaErrorSourceDescriptor>, synchronizeroutine: PksynchronizeRoutine, synchronizecontext: ConstPtr<CVoid>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesPshedSynchronizeExecution(errorsource.rawAddress.toString(), 0L.toString(), synchronizecontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pshedUnregisterPlugin(pluginhandle: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesPshedUnregisterPlugin(pluginhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlAppendUnicodeStringToString(destination: MutPtr<UnicodeString>, source: ConstPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlAppendUnicodeStringToString(destination.rawAddress.toString(), source.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAppendUnicodeToString(destination: MutPtr<UnicodeString>, source: Pcwstr): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlAppendUnicodeToString(destination.rawAddress.toString(), source.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAreBitsClear(bitmapheader: ConstPtr<RtlBitmap>, startingindex: UInt, length: UInt): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlAreBitsClear(bitmapheader.rawAddress.toString(), startingindex.toInt(), length.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAreBitsSet(bitmapheader: ConstPtr<RtlBitmap>, startingindex: UInt, length: UInt): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlAreBitsSet(bitmapheader.rawAddress.toString(), startingindex.toInt(), length.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAssert(voidfailedassertion: ConstPtr<CVoid>, voidfilename: ConstPtr<CVoid>, linenumber: UInt, mutablemessage: Pcstr) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesRtlAssert(voidfailedassertion.rawAddress.toString(), voidfilename.rawAddress.toString(), linenumber.toInt(), mutablemessage.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlCheckRegistryKey(relativeto: UInt, path: Pcwstr): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlCheckRegistryKey(relativeto.toInt(), path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlClearAllBits(bitmapheader: ConstPtr<RtlBitmap>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesRtlClearAllBits(bitmapheader.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlClearBit(bitmapheader: ConstPtr<RtlBitmap>, bitnumber: UInt) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesRtlClearBit(bitmapheader.rawAddress.toString(), bitnumber.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlClearBits(bitmapheader: ConstPtr<RtlBitmap>, startingindex: UInt, numbertoclear: UInt) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesRtlClearBits(bitmapheader.rawAddress.toString(), startingindex.toInt(), numbertoclear.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlCmDecodeMemIoResource(descriptor: ConstPtr<CmPartialResourceDescriptor>, start: MutPtr<ULong>): ULong =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlCmDecodeMemIoResource(descriptor.rawAddress.toString(), start.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCmEncodeMemIoResource(descriptor: ConstPtr<CmPartialResourceDescriptor>, type: UByte, length: ULong, start: ULong): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlCmEncodeMemIoResource(descriptor.rawAddress.toString(), type.toInt(), length.toString(), start.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCompareString(string1: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, string2: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, caseinsensitive: Boolean): Int =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlCompareString(string1.rawAddress.toString(), string2.rawAddress.toString(), caseinsensitive) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCompareUnicodeString(string1: ConstPtr<UnicodeString>, string2: ConstPtr<UnicodeString>, caseinsensitive: Boolean): Int =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlCompareUnicodeString(string1.rawAddress.toString(), string2.rawAddress.toString(), caseinsensitive) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCompareUnicodeStrings(string1: ConstPtr<UShort>, string1length: ULong, string2: ConstPtr<UShort>, string2length: ULong, caseinsensitive: Boolean): Int =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlCompareUnicodeStrings(string1.rawAddress.toString(), string1length.toString(), string2.rawAddress.toString(), string2length.toString(), caseinsensitive) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlContractHashTable(hashtable: ConstPtr<RtlDynamicHashTable>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlContractHashTable(hashtable.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCopyBitMap(source: ConstPtr<RtlBitmap>, destination: ConstPtr<RtlBitmap>, targetbit: UInt) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesRtlCopyBitMap(source.rawAddress.toString(), destination.rawAddress.toString(), targetbit.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlCopyString(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesRtlCopyString(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlCopyUnicodeString(destinationstring: MutPtr<UnicodeString>, sourcestring: ConstPtr<UnicodeString>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesRtlCopyUnicodeString(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlCreateHashTable(hashtable: MutPtr<MutPtr<RtlDynamicHashTable>>, shift: UInt, flags: UInt): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlCreateHashTable(hashtable.rawAddress.toString(), shift.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCreateHashTableEx(hashtable: MutPtr<MutPtr<RtlDynamicHashTable>>, initialsize: UInt, shift: UInt, flags: UInt): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlCreateHashTableEx(hashtable.rawAddress.toString(), initialsize.toInt(), shift.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCreateRegistryKey(relativeto: UInt, path: Pcwstr): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlCreateRegistryKey(relativeto.toInt(), path.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCreateSecurityDescriptor(securitydescriptor: PsecurityDescriptor, revision: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlCreateSecurityDescriptor(securitydescriptor.rawAddress.toString(), revision.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDelete(links: ConstPtr<RtlSplayLinks>): MutPtr<RtlSplayLinks> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesRtlDelete(links.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDeleteElementGenericTable(table: ConstPtr<RtlGenericTable>, buffer: ConstPtr<CVoid>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlDeleteElementGenericTable(table.rawAddress.toString(), buffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDeleteElementGenericTableAvl(table: ConstPtr<RtlAvlTable>, buffer: ConstPtr<CVoid>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlDeleteElementGenericTableAvl(table.rawAddress.toString(), buffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDeleteElementGenericTableAvlEx(table: ConstPtr<RtlAvlTable>, nodeorparent: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesRtlDeleteElementGenericTableAvlEx(table.rawAddress.toString(), nodeorparent.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlDeleteHashTable(hashtable: ConstPtr<RtlDynamicHashTable>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesRtlDeleteHashTable(hashtable.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlDeleteNoSplay(links: ConstPtr<RtlSplayLinks>, root: MutPtr<MutPtr<RtlSplayLinks>>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesRtlDeleteNoSplay(links.rawAddress.toString(), root.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlDeleteRegistryValue(relativeto: UInt, path: Pcwstr, valuename: Pcwstr): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlDeleteRegistryValue(relativeto.toInt(), path.rawAddress.toString(), valuename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDowncaseUnicodeChar(sourcecharacter: UShort): UShort =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlDowncaseUnicodeChar(sourcecharacter.toInt()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEndEnumerationHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesRtlEndEnumerationHashTable(hashtable.rawAddress.toString(), enumerator.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlEndStrongEnumerationHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesRtlEndStrongEnumerationHashTable(hashtable.rawAddress.toString(), enumerator.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlEndWeakEnumerationHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesRtlEndWeakEnumerationHashTable(hashtable.rawAddress.toString(), enumerator.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlEnumerateEntryHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>): MutPtr<RtlDynamicHashTableEntry> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesRtlEnumerateEntryHashTable(hashtable.rawAddress.toString(), enumerator.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEnumerateGenericTable(table: ConstPtr<RtlGenericTable>, restart: Boolean): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTable(table.rawAddress.toString(), restart).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEnumerateGenericTableAvl(table: ConstPtr<RtlAvlTable>, restart: Boolean): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTableAvl(table.rawAddress.toString(), restart).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEnumerateGenericTableLikeADirectory(table: ConstPtr<RtlAvlTable>, matchfunction: PrtlAvlMatchFunction, matchdata: ConstPtr<CVoid>, nextflag: UInt, restartkey: MutPtr<MutPtr<CVoid>>, deletecount: MutPtr<UInt>, buffer: ConstPtr<CVoid>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTableLikeADirectory(table.rawAddress.toString(), 0L.toString(), matchdata.rawAddress.toString(), nextflag.toInt(), restartkey.rawAddress.toString(), deletecount.rawAddress.toString(), buffer.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEnumerateGenericTableWithoutSplaying(table: ConstPtr<RtlGenericTable>, restartkey: MutPtr<MutPtr<CVoid>>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTableWithoutSplaying(table.rawAddress.toString(), restartkey.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEnumerateGenericTableWithoutSplayingAvl(table: ConstPtr<RtlAvlTable>, restartkey: MutPtr<MutPtr<CVoid>>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesRtlEnumerateGenericTableWithoutSplayingAvl(table.rawAddress.toString(), restartkey.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEqualString(string1: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, string2: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, caseinsensitive: Boolean): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlEqualString(string1.rawAddress.toString(), string2.rawAddress.toString(), caseinsensitive) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEqualUnicodeString(string1: ConstPtr<UnicodeString>, string2: ConstPtr<UnicodeString>, caseinsensitive: Boolean): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlEqualUnicodeString(string1.rawAddress.toString(), string2.rawAddress.toString(), caseinsensitive) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlExpandHashTable(hashtable: ConstPtr<RtlDynamicHashTable>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlExpandHashTable(hashtable.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlExtractBitMap(source: ConstPtr<RtlBitmap>, destination: ConstPtr<RtlBitmap>, targetbit: UInt, numberofbits: UInt) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesRtlExtractBitMap(source.rawAddress.toString(), destination.rawAddress.toString(), targetbit.toInt(), numberofbits.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlFindClearBits(bitmapheader: ConstPtr<RtlBitmap>, numbertofind: UInt, hintindex: UInt): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlFindClearBits(bitmapheader.rawAddress.toString(), numbertofind.toInt(), hintindex.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFindClearBitsAndSet(bitmapheader: ConstPtr<RtlBitmap>, numbertofind: UInt, hintindex: UInt): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlFindClearBitsAndSet(bitmapheader.rawAddress.toString(), numbertofind.toInt(), hintindex.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFindClearRuns(bitmapheader: ConstPtr<RtlBitmap>, runarray: MutPtr<RtlBitmapRun>, sizeofrunarray: UInt, locatelongestruns: Boolean): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlFindClearRuns(bitmapheader.rawAddress.toString(), runarray.rawAddress.toString(), sizeofrunarray.toInt(), locatelongestruns).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFindClosestEncodableLength(sourcelength: ULong, targetlength: MutPtr<ULong>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlFindClosestEncodableLength(sourcelength.toString(), targetlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFindFirstRunClear(bitmapheader: ConstPtr<RtlBitmap>, startingindex: MutPtr<UInt>): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlFindFirstRunClear(bitmapheader.rawAddress.toString(), startingindex.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFindLastBackwardRunClear(bitmapheader: ConstPtr<RtlBitmap>, fromindex: UInt, startingrunindex: MutPtr<UInt>): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlFindLastBackwardRunClear(bitmapheader.rawAddress.toString(), fromindex.toInt(), startingrunindex.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFindLeastSignificantBit(set: ULong): Byte =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlFindLeastSignificantBit(set.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFindLongestRunClear(bitmapheader: ConstPtr<RtlBitmap>, startingindex: MutPtr<UInt>): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlFindLongestRunClear(bitmapheader.rawAddress.toString(), startingindex.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFindMostSignificantBit(set: ULong): Byte =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlFindMostSignificantBit(set.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFindNextForwardRunClear(bitmapheader: ConstPtr<RtlBitmap>, fromindex: UInt, startingrunindex: MutPtr<UInt>): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlFindNextForwardRunClear(bitmapheader.rawAddress.toString(), fromindex.toInt(), startingrunindex.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFindSetBits(bitmapheader: ConstPtr<RtlBitmap>, numbertofind: UInt, hintindex: UInt): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlFindSetBits(bitmapheader.rawAddress.toString(), numbertofind.toInt(), hintindex.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFindSetBitsAndClear(bitmapheader: ConstPtr<RtlBitmap>, numbertofind: UInt, hintindex: UInt): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlFindSetBitsAndClear(bitmapheader.rawAddress.toString(), numbertofind.toInt(), hintindex.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFreeUTF8String(utf8string: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesRtlFreeUTF8String(utf8string.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlGUIDFromString(guidstring: ConstPtr<UnicodeString>, guid: MutPtr<Guid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlGUIDFromString(guidstring.rawAddress.toString(), guid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGenerateClass5Guid(namespaceguid: ConstPtr<Guid>, buffer: ConstPtr<CVoid>, buffersize: UInt, guid: MutPtr<Guid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlGenerateClass5Guid(namespaceguid.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.toInt(), guid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetActiveConsoleId(): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlGetActiveConsoleId().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetCallersAddress(callersaddress: MutPtr<MutPtr<CVoid>>, callerscaller: MutPtr<MutPtr<CVoid>>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesRtlGetCallersAddress(callersaddress.rawAddress.toString(), callerscaller.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlGetConsoleSessionForegroundProcessId(): ULong =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlGetConsoleSessionForegroundProcessId().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetElementGenericTable(table: ConstPtr<RtlGenericTable>, i: UInt): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesRtlGetElementGenericTable(table.rawAddress.toString(), i.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetElementGenericTableAvl(table: ConstPtr<RtlAvlTable>, i: UInt): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesRtlGetElementGenericTableAvl(table.rawAddress.toString(), i.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetEnabledExtendedFeatures(featuremask: ULong): ULong =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlGetEnabledExtendedFeatures(featuremask.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetNextEntryHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, context: ConstPtr<RtlDynamicHashTableContext>): MutPtr<RtlDynamicHashTableEntry> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesRtlGetNextEntryHashTable(hashtable.rawAddress.toString(), context.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetNtProductType(ntproducttype: MutPtr<NtProductType>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlGetNtProductType(ntproducttype.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetNtSystemRoot(): Pcwstr =
    if (windowsWdkSystemSystemservicesNapiAvailable) ConstPtr(wasmWindowssysWindowsWdkSystemSystemservicesRtlGetNtSystemRoot().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetPersistedStateLocation(sourceid: Pcwstr, customvalue: Pcwstr, defaultpath: Pcwstr, statelocationtype: StateLocationType, targetpath: Pwstr, bufferlengthin: UInt, bufferlengthout: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlGetPersistedStateLocation(sourceid.rawAddress.toString(), customvalue.rawAddress.toString(), defaultpath.rawAddress.toString(), statelocationtype, targetpath.rawAddress.toString(), bufferlengthin.toInt(), bufferlengthout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetSuiteMask(): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlGetSuiteMask().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetVersion(lpversioninformation: MutPtr<Osversioninfow>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlGetVersion(lpversioninformation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlHashUnicodeString(string: ConstPtr<UnicodeString>, caseinsensitive: Boolean, hashalgorithm: UInt, hashvalue: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlHashUnicodeString(string.rawAddress.toString(), caseinsensitive, hashalgorithm.toInt(), hashvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInitEnumerationHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlInitEnumerationHashTable(hashtable.rawAddress.toString(), enumerator.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInitStrongEnumerationHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlInitStrongEnumerationHashTable(hashtable.rawAddress.toString(), enumerator.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInitUTF8String(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: ConstPtr<Byte>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesRtlInitUTF8String(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlInitUTF8StringEx(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: ConstPtr<Byte>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlInitUTF8StringEx(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInitWeakEnumerationHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlInitWeakEnumerationHashTable(hashtable.rawAddress.toString(), enumerator.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInitializeBitMap(bitmapheader: MutPtr<RtlBitmap>, bitmapbuffer: ConstPtr<UInt>, sizeofbitmap: UInt) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesRtlInitializeBitMap(bitmapheader.rawAddress.toString(), bitmapbuffer.rawAddress.toString(), sizeofbitmap.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlInitializeGenericTable(table: MutPtr<RtlGenericTable>, compareroutine: PrtlGenericCompareRoutine, allocateroutine: PrtlGenericAllocateRoutine, freeroutine: PrtlGenericFreeRoutine, tablecontext: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesRtlInitializeGenericTable(table.rawAddress.toString(), 0L.toString(), 0L.toString(), 0L.toString(), tablecontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlInitializeGenericTableAvl(table: MutPtr<RtlAvlTable>, compareroutine: PrtlAvlCompareRoutine, allocateroutine: PrtlAvlAllocateRoutine, freeroutine: PrtlAvlFreeRoutine, tablecontext: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesRtlInitializeGenericTableAvl(table.rawAddress.toString(), 0L.toString(), 0L.toString(), 0L.toString(), tablecontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlInsertElementGenericTable(table: ConstPtr<RtlGenericTable>, buffer: ConstPtr<CVoid>, buffersize: UInt, newelement: MutPtr<Boolean>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesRtlInsertElementGenericTable(table.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.toInt(), newelement.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInsertElementGenericTableAvl(table: ConstPtr<RtlAvlTable>, buffer: ConstPtr<CVoid>, buffersize: UInt, newelement: MutPtr<Boolean>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesRtlInsertElementGenericTableAvl(table.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.toInt(), newelement.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInsertElementGenericTableFull(table: ConstPtr<RtlGenericTable>, buffer: ConstPtr<CVoid>, buffersize: UInt, newelement: MutPtr<Boolean>, nodeorparent: ConstPtr<CVoid>, searchresult: TableSearchResult): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesRtlInsertElementGenericTableFull(table.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.toInt(), newelement.rawAddress.toString(), nodeorparent.rawAddress.toString(), searchresult).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInsertElementGenericTableFullAvl(table: ConstPtr<RtlAvlTable>, buffer: ConstPtr<CVoid>, buffersize: UInt, newelement: MutPtr<Boolean>, nodeorparent: ConstPtr<CVoid>, searchresult: TableSearchResult): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesRtlInsertElementGenericTableFullAvl(table.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.toInt(), newelement.rawAddress.toString(), nodeorparent.rawAddress.toString(), searchresult).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInsertEntryHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, entry: ConstPtr<RtlDynamicHashTableEntry>, signature: ULong, context: MutPtr<RtlDynamicHashTableContext>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlInsertEntryHashTable(hashtable.rawAddress.toString(), entry.rawAddress.toString(), signature.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInt64ToUnicodeString(value: ULong, base: UInt, string: MutPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlInt64ToUnicodeString(value.toString(), base.toInt(), string.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIntegerToUnicodeString(value: UInt, base: UInt, string: MutPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlIntegerToUnicodeString(value.toInt(), base.toInt(), string.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIoDecodeMemIoResource(descriptor: ConstPtr<IoResourceDescriptor>, alignment: MutPtr<ULong>, minimumaddress: MutPtr<ULong>, maximumaddress: MutPtr<ULong>): ULong =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlIoDecodeMemIoResource(descriptor.rawAddress.toString(), alignment.rawAddress.toString(), minimumaddress.rawAddress.toString(), maximumaddress.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIoEncodeMemIoResource(descriptor: ConstPtr<IoResourceDescriptor>, type: UByte, length: ULong, alignment: ULong, minimumaddress: ULong, maximumaddress: ULong): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlIoEncodeMemIoResource(descriptor.rawAddress.toString(), type.toInt(), length.toString(), alignment.toString(), minimumaddress.toString(), maximumaddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsApiSetImplemented(apisetname: Pcstr): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlIsApiSetImplemented(apisetname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsGenericTableEmpty(table: ConstPtr<RtlGenericTable>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlIsGenericTableEmpty(table.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsGenericTableEmptyAvl(table: ConstPtr<RtlAvlTable>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlIsGenericTableEmptyAvl(table.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsMultiSessionSku(): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlIsMultiSessionSku() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsMultiUsersInSessionSku(): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlIsMultiUsersInSessionSku() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsNtDdiVersionAvailable(version: UInt): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlIsNtDdiVersionAvailable(version.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsServicePackVersionInstalled(version: UInt): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlIsServicePackVersionInstalled(version.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsStateSeparationEnabled(): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlIsStateSeparationEnabled() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsUntrustedObject(handle: Handle, obj: ConstPtr<CVoid>, untrustedobject: MutPtr<Boolean>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlIsUntrustedObject(handle.rawAddress.toString(), obj.rawAddress.toString(), untrustedobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlLengthSecurityDescriptor(securitydescriptor: PsecurityDescriptor): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlLengthSecurityDescriptor(securitydescriptor.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlLookupElementGenericTable(table: ConstPtr<RtlGenericTable>, buffer: ConstPtr<CVoid>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesRtlLookupElementGenericTable(table.rawAddress.toString(), buffer.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlLookupElementGenericTableAvl(table: ConstPtr<RtlAvlTable>, buffer: ConstPtr<CVoid>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesRtlLookupElementGenericTableAvl(table.rawAddress.toString(), buffer.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlLookupElementGenericTableFull(table: ConstPtr<RtlGenericTable>, buffer: ConstPtr<CVoid>, nodeorparent: MutPtr<MutPtr<CVoid>>, searchresult: MutPtr<TableSearchResult>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesRtlLookupElementGenericTableFull(table.rawAddress.toString(), buffer.rawAddress.toString(), nodeorparent.rawAddress.toString(), searchresult.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlLookupElementGenericTableFullAvl(table: ConstPtr<RtlAvlTable>, buffer: ConstPtr<CVoid>, nodeorparent: MutPtr<MutPtr<CVoid>>, searchresult: MutPtr<TableSearchResult>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesRtlLookupElementGenericTableFullAvl(table.rawAddress.toString(), buffer.rawAddress.toString(), nodeorparent.rawAddress.toString(), searchresult.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlLookupEntryHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, signature: ULong, context: MutPtr<RtlDynamicHashTableContext>): MutPtr<RtlDynamicHashTableEntry> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesRtlLookupEntryHashTable(hashtable.rawAddress.toString(), signature.toString(), context.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlLookupFirstMatchingElementGenericTableAvl(table: ConstPtr<RtlAvlTable>, buffer: ConstPtr<CVoid>, restartkey: MutPtr<MutPtr<CVoid>>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesRtlLookupFirstMatchingElementGenericTableAvl(table.rawAddress.toString(), buffer.rawAddress.toString(), restartkey.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlMapGenericMask(accessmask: MutPtr<UInt>, genericmapping: ConstPtr<GenericMapping>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesRtlMapGenericMask(accessmask.rawAddress.toString(), genericmapping.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlNormalizeSecurityDescriptor(securitydescriptor: MutPtr<PsecurityDescriptor>, securitydescriptorlength: UInt, newsecuritydescriptor: MutPtr<PsecurityDescriptor>, newsecuritydescriptorlength: MutPtr<UInt>, checkonly: Boolean): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlNormalizeSecurityDescriptor(securitydescriptor.rawAddress.toString(), securitydescriptorlength.toInt(), newsecuritydescriptor.rawAddress.toString(), newsecuritydescriptorlength.rawAddress.toString(), checkonly) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlNumberGenericTableElements(table: ConstPtr<RtlGenericTable>): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlNumberGenericTableElements(table.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlNumberGenericTableElementsAvl(table: ConstPtr<RtlAvlTable>): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlNumberGenericTableElementsAvl(table.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlNumberOfClearBits(bitmapheader: ConstPtr<RtlBitmap>): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlNumberOfClearBits(bitmapheader.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlNumberOfClearBitsInRange(bitmapheader: ConstPtr<RtlBitmap>, startingindex: UInt, length: UInt): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlNumberOfClearBitsInRange(bitmapheader.rawAddress.toString(), startingindex.toInt(), length.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlNumberOfSetBits(bitmapheader: ConstPtr<RtlBitmap>): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlNumberOfSetBits(bitmapheader.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlNumberOfSetBitsInRange(bitmapheader: ConstPtr<RtlBitmap>, startingindex: UInt, length: UInt): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlNumberOfSetBitsInRange(bitmapheader.rawAddress.toString(), startingindex.toInt(), length.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlNumberOfSetBitsUlongPtr(target: ULong): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlNumberOfSetBitsUlongPtr(target.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlPrefetchMemoryNonTemporal(source: ConstPtr<CVoid>, length: ULong) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesRtlPrefetchMemoryNonTemporal(source.rawAddress.toString(), length.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlPrefixUnicodeString(string1: ConstPtr<UnicodeString>, string2: ConstPtr<UnicodeString>, caseinsensitive: Boolean): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlPrefixUnicodeString(string1.rawAddress.toString(), string2.rawAddress.toString(), caseinsensitive) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlQueryRegistryValueWithFallback(primaryhandle: Handle, fallbackhandle: Handle, valuename: ConstPtr<UnicodeString>, valuelength: UInt, valuetype: MutPtr<UInt>, valuedata: MutPtr<CVoid>, resultlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlQueryRegistryValueWithFallback(primaryhandle.rawAddress.toString(), fallbackhandle.rawAddress.toString(), valuename.rawAddress.toString(), valuelength.toInt(), valuetype.rawAddress.toString(), valuedata.rawAddress.toString(), resultlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlQueryRegistryValues(relativeto: UInt, path: Pcwstr, querytable: MutPtr<RtlQueryRegistryTable>, context: ConstPtr<CVoid>, environment: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlQueryRegistryValues(relativeto.toInt(), path.rawAddress.toString(), querytable.rawAddress.toString(), context.rawAddress.toString(), environment.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlQueryValidationRunlevel(componentname: ConstPtr<UnicodeString>): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlQueryValidationRunlevel(componentname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlRealPredecessor(links: ConstPtr<RtlSplayLinks>): MutPtr<RtlSplayLinks> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesRtlRealPredecessor(links.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlRealSuccessor(links: ConstPtr<RtlSplayLinks>): MutPtr<RtlSplayLinks> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesRtlRealSuccessor(links.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlRemoveEntryHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, entry: ConstPtr<RtlDynamicHashTableEntry>, context: MutPtr<RtlDynamicHashTableContext>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlRemoveEntryHashTable(hashtable.rawAddress.toString(), entry.rawAddress.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlRunOnceBeginInitialize(runonce: MutPtr<InitOnce>, flags: UInt, context: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlRunOnceBeginInitialize(runonce.rawAddress.toString(), flags.toInt(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlRunOnceComplete(runonce: MutPtr<InitOnce>, flags: UInt, context: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlRunOnceComplete(runonce.rawAddress.toString(), flags.toInt(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlRunOnceExecuteOnce(runonce: MutPtr<InitOnce>, initfn: PrtlRunOnceInitFn, parameter: MutPtr<CVoid>, context: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlRunOnceExecuteOnce(runonce.rawAddress.toString(), 0L.toString(), parameter.rawAddress.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlRunOnceInitialize(runonce: MutPtr<InitOnce>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesRtlRunOnceInitialize(runonce.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlSetAllBits(bitmapheader: ConstPtr<RtlBitmap>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesRtlSetAllBits(bitmapheader.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlSetBit(bitmapheader: ConstPtr<RtlBitmap>, bitnumber: UInt) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesRtlSetBit(bitmapheader.rawAddress.toString(), bitnumber.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlSetBits(bitmapheader: ConstPtr<RtlBitmap>, startingindex: UInt, numbertoset: UInt) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesRtlSetBits(bitmapheader.rawAddress.toString(), startingindex.toInt(), numbertoset.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlSetDaclSecurityDescriptor(securitydescriptor: PsecurityDescriptor, daclpresent: Boolean, dacl: ConstPtr<Acl>, dacldefaulted: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlSetDaclSecurityDescriptor(securitydescriptor.rawAddress.toString(), daclpresent, dacl.rawAddress.toString(), dacldefaulted) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlSetSystemGlobalData(dataid: RtlSystemGlobalDataId, buffer: ConstPtr<CVoid>, size: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlSetSystemGlobalData(dataid, buffer.rawAddress.toString(), size.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlSplay(links: MutPtr<RtlSplayLinks>): MutPtr<RtlSplayLinks> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesRtlSplay(links.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlStringFromGUID(guid: ConstPtr<Guid>, guidstring: MutPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlStringFromGUID(guid.rawAddress.toString(), guidstring.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlStronglyEnumerateEntryHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>): MutPtr<RtlDynamicHashTableEntry> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesRtlStronglyEnumerateEntryHashTable(hashtable.rawAddress.toString(), enumerator.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlSubtreePredecessor(links: ConstPtr<RtlSplayLinks>): MutPtr<RtlSplayLinks> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesRtlSubtreePredecessor(links.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlSubtreeSuccessor(links: ConstPtr<RtlSplayLinks>): MutPtr<RtlSplayLinks> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesRtlSubtreeSuccessor(links.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlSuffixUnicodeString(string1: ConstPtr<UnicodeString>, string2: ConstPtr<UnicodeString>, caseinsensitive: Boolean): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlSuffixUnicodeString(string1.rawAddress.toString(), string2.rawAddress.toString(), caseinsensitive) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlTestBit(bitmapheader: ConstPtr<RtlBitmap>, bitnumber: UInt): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlTestBit(bitmapheader.rawAddress.toString(), bitnumber.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlTimeFieldsToTime(timefields: ConstPtr<TimeFields>, time: MutPtr<Long>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlTimeFieldsToTime(timefields.rawAddress.toString(), time.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlTimeToTimeFields(time: ConstPtr<Long>, timefields: MutPtr<TimeFields>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesRtlTimeToTimeFields(time.rawAddress.toString(), timefields.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlUTF8StringToUnicodeString(destinationstring: MutPtr<UnicodeString>, sourcestring: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, allocatedestinationstring: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlUTF8StringToUnicodeString(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString(), allocatedestinationstring) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUTF8ToUnicodeN(unicodestringdestination: Pwstr, unicodestringmaxbytecount: UInt, unicodestringactualbytecount: MutPtr<UInt>, utf8stringsource: Pcstr, utf8stringbytecount: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlUTF8ToUnicodeN(unicodestringdestination.rawAddress.toString(), unicodestringmaxbytecount.toInt(), unicodestringactualbytecount.rawAddress.toString(), utf8stringsource.rawAddress.toString(), utf8stringbytecount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUnicodeStringToInt64(string: ConstPtr<UnicodeString>, base: UInt, number: MutPtr<Long>, endpointer: MutPtr<Pwstr>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlUnicodeStringToInt64(string.rawAddress.toString(), base.toInt(), number.rawAddress.toString(), endpointer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUnicodeStringToInteger(string: ConstPtr<UnicodeString>, base: UInt, value: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlUnicodeStringToInteger(string.rawAddress.toString(), base.toInt(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUnicodeStringToUTF8String(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: ConstPtr<UnicodeString>, allocatedestinationstring: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlUnicodeStringToUTF8String(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString(), allocatedestinationstring) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUnicodeToUTF8N(utf8stringdestination: Pstr, utf8stringmaxbytecount: UInt, utf8stringactualbytecount: MutPtr<UInt>, unicodestringsource: ConstPtr<UShort>, unicodestringbytecount: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlUnicodeToUTF8N(utf8stringdestination.rawAddress.toString(), utf8stringmaxbytecount.toInt(), utf8stringactualbytecount.rawAddress.toString(), unicodestringsource.rawAddress.toString(), unicodestringbytecount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUpcaseUnicodeChar(sourcecharacter: UShort): UShort =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlUpcaseUnicodeChar(sourcecharacter.toInt()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUpcaseUnicodeString(destinationstring: MutPtr<UnicodeString>, sourcestring: ConstPtr<UnicodeString>, allocatedestinationstring: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlUpcaseUnicodeString(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString(), allocatedestinationstring) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUpperChar(character: Byte): Byte =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlUpperChar(character.toInt()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUpperString(destinationstring: MutPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>, sourcestring: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesRtlUpperString(destinationstring.rawAddress.toString(), sourcestring.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlValidRelativeSecurityDescriptor(securitydescriptorinput: PsecurityDescriptor, securitydescriptorlength: UInt, requiredinformation: UInt): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlValidRelativeSecurityDescriptor(securitydescriptorinput.rawAddress.toString(), securitydescriptorlength.toInt(), requiredinformation.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlValidSecurityDescriptor(securitydescriptor: PsecurityDescriptor): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlValidSecurityDescriptor(securitydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlVerifyVersionInfo(versioninfo: ConstPtr<Osversioninfoexw>, typemask: UInt, conditionmask: ULong): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlVerifyVersionInfo(versioninfo.rawAddress.toString(), typemask.toInt(), conditionmask.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlVolumeDeviceToDosName(volumedeviceobject: ConstPtr<CVoid>, dosname: MutPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlVolumeDeviceToDosName(volumedeviceobject.rawAddress.toString(), dosname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlWalkFrameChain(callers: MutPtr<MutPtr<CVoid>>, count: UInt, flags: UInt): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlWalkFrameChain(callers.rawAddress.toString(), count.toInt(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlWeaklyEnumerateEntryHashTable(hashtable: ConstPtr<RtlDynamicHashTable>, enumerator: MutPtr<RtlDynamicHashTableEnumerator>): MutPtr<RtlDynamicHashTableEntry> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesRtlWeaklyEnumerateEntryHashTable(hashtable.rawAddress.toString(), enumerator.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlWriteRegistryValue(relativeto: UInt, path: Pcwstr, valuename: Pcwstr, valuetype: UInt, valuedata: ConstPtr<CVoid>, valuelength: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlWriteRegistryValue(relativeto.toInt(), path.rawAddress.toString(), valuename.rawAddress.toString(), valuetype.toInt(), valuedata.rawAddress.toString(), valuelength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlxAnsiStringToUnicodeSize(ansistring: ConstPtr<io.github.kotlinmania.windowssys.windows.win32.system.kernel.String>): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlxAnsiStringToUnicodeSize(ansistring.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlxUnicodeStringToAnsiSize(unicodestring: ConstPtr<UnicodeString>): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesRtlxUnicodeStringToAnsiSize(unicodestring.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAccessCheck(securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: ConstPtr<SecuritySubjectContext>, subjectcontextlocked: Boolean, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: MutPtr<MutPtr<PrivilegeSet>>, genericmapping: ConstPtr<GenericMapping>, accessmode: Byte, grantedaccess: MutPtr<UInt>, accessstatus: MutPtr<Int>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesSeAccessCheck(securitydescriptor.rawAddress.toString(), subjectsecuritycontext.rawAddress.toString(), subjectcontextlocked, desiredaccess.toInt(), previouslygrantedaccess.toInt(), privileges.rawAddress.toString(), genericmapping.rawAddress.toString(), accessmode.toInt(), grantedaccess.rawAddress.toString(), accessstatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAssignSecurity(parentdescriptor: PsecurityDescriptor, explicitdescriptor: PsecurityDescriptor, newdescriptor: MutPtr<PsecurityDescriptor>, isdirectoryobject: Boolean, subjectcontext: ConstPtr<SecuritySubjectContext>, genericmapping: ConstPtr<GenericMapping>, pooltype: PoolType): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesSeAssignSecurity(parentdescriptor.rawAddress.toString(), explicitdescriptor.rawAddress.toString(), newdescriptor.rawAddress.toString(), isdirectoryobject, subjectcontext.rawAddress.toString(), genericmapping.rawAddress.toString(), pooltype) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAssignSecurityEx(parentdescriptor: PsecurityDescriptor, explicitdescriptor: PsecurityDescriptor, newdescriptor: MutPtr<PsecurityDescriptor>, objecttype: ConstPtr<Guid>, isdirectoryobject: Boolean, autoinheritflags: UInt, subjectcontext: ConstPtr<SecuritySubjectContext>, genericmapping: ConstPtr<GenericMapping>, pooltype: PoolType): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesSeAssignSecurityEx(parentdescriptor.rawAddress.toString(), explicitdescriptor.rawAddress.toString(), newdescriptor.rawAddress.toString(), objecttype.rawAddress.toString(), isdirectoryobject, autoinheritflags.toInt(), subjectcontext.rawAddress.toString(), genericmapping.rawAddress.toString(), pooltype) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seCaptureSubjectContext(subjectcontext: MutPtr<SecuritySubjectContext>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesSeCaptureSubjectContext(subjectcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seComputeAutoInheritByObjectType(objecttype: ConstPtr<CVoid>, securitydescriptor: PsecurityDescriptor, parentsecuritydescriptor: PsecurityDescriptor): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesSeComputeAutoInheritByObjectType(objecttype.rawAddress.toString(), securitydescriptor.rawAddress.toString(), parentsecuritydescriptor.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seDeassignSecurity(securitydescriptor: MutPtr<PsecurityDescriptor>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesSeDeassignSecurity(securitydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seEtwWriteKMCveEvent(cveid: ConstPtr<UnicodeString>, additionaldetails: ConstPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesSeEtwWriteKMCveEvent(cveid.rawAddress.toString(), additionaldetails.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seLockSubjectContext(subjectcontext: ConstPtr<SecuritySubjectContext>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesSeLockSubjectContext(subjectcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seRegisterImageVerificationCallback(imagetype: SeImageType, callbacktype: SeImageVerificationCallbackType, callbackfunction: PseImageVerificationCallbackFunction, callbackcontext: ConstPtr<CVoid>, token: ConstPtr<CVoid>, callbackhandle: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesSeRegisterImageVerificationCallback(imagetype, callbacktype, 0L.toString(), callbackcontext.rawAddress.toString(), token.rawAddress.toString(), callbackhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seReleaseSubjectContext(subjectcontext: MutPtr<SecuritySubjectContext>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesSeReleaseSubjectContext(subjectcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seReportSecurityEvent(flags: UInt, sourcename: ConstPtr<UnicodeString>, usersid: Psid, auditparameters: ConstPtr<SeAdtParameterArray>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesSeReportSecurityEvent(flags.toInt(), sourcename.rawAddress.toString(), usersid.rawAddress.toString(), auditparameters.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seSetAuditParameter(auditparameters: MutPtr<SeAdtParameterArray>, type: SeAdtParameterType, index: UInt, data: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesSeSetAuditParameter(auditparameters.rawAddress.toString(), type, index.toInt(), data.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seSinglePrivilegeCheck(privilegevalue: Luid, previousmode: Byte): Boolean =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seUnlockSubjectContext(subjectcontext: ConstPtr<SecuritySubjectContext>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesSeUnlockSubjectContext(subjectcontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seUnregisterImageVerificationCallback(callbackhandle: ConstPtr<CVoid>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesSeUnregisterImageVerificationCallback(callbackhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seValidSecurityDescriptor(length: UInt, securitydescriptor: PsecurityDescriptor): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesSeValidSecurityDescriptor(length.toInt(), securitydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmCommitComplete(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesTmCommitComplete(enlistment.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmCommitEnlistment(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesTmCommitEnlistment(enlistment.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmCommitTransaction(transaction: ConstPtr<Ktransaction>, wait: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesTmCommitTransaction(transaction.rawAddress.toString(), wait) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmCreateEnlistment(enlistmenthandle: MutPtr<Handle>, previousmode: Byte, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, resourcemanager: ConstPtr<Long>, transaction: ConstPtr<Ktransaction>, createoptions: UInt, notificationmask: UInt, enlistmentkey: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesTmCreateEnlistment(enlistmenthandle.rawAddress.toString(), previousmode.toInt(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), resourcemanager.rawAddress.toString(), transaction.rawAddress.toString(), createoptions.toInt(), notificationmask.toInt(), enlistmentkey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmDereferenceEnlistmentKey(enlistment: ConstPtr<Kenlistment>, lastreference: MutPtr<Boolean>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesTmDereferenceEnlistmentKey(enlistment.rawAddress.toString(), lastreference.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmEnableCallbacks(resourcemanager: ConstPtr<Kresourcemanager>, callbackroutine: PtmRmNotification, rmkey: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesTmEnableCallbacks(resourcemanager.rawAddress.toString(), 0L.toString(), rmkey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmGetTransactionId(transaction: ConstPtr<Ktransaction>, transactionid: MutPtr<Guid>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesTmGetTransactionId(transaction.rawAddress.toString(), transactionid.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun tmInitializeTransactionManager(transactionmanager: ConstPtr<Long>, logfilename: ConstPtr<UnicodeString>, tmid: ConstPtr<Guid>, createoptions: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesTmInitializeTransactionManager(transactionmanager.rawAddress.toString(), logfilename.rawAddress.toString(), tmid.rawAddress.toString(), createoptions.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmIsTransactionActive(transaction: ConstPtr<Ktransaction>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesTmIsTransactionActive(transaction.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmPrePrepareComplete(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesTmPrePrepareComplete(enlistment.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmPrePrepareEnlistment(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesTmPrePrepareEnlistment(enlistment.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmPrepareComplete(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesTmPrepareComplete(enlistment.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmPrepareEnlistment(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesTmPrepareEnlistment(enlistment.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmPropagationComplete(resourcemanager: ConstPtr<Kresourcemanager>, requestcookie: UInt, bufferlength: UInt, buffer: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesTmPropagationComplete(resourcemanager.rawAddress.toString(), requestcookie.toInt(), bufferlength.toInt(), buffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmPropagationFailed(resourcemanager: ConstPtr<Kresourcemanager>, requestcookie: UInt, status: Ntstatus): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesTmPropagationFailed(resourcemanager.rawAddress.toString(), requestcookie.toInt(), status) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmReadOnlyEnlistment(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesTmReadOnlyEnlistment(enlistment.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmRecoverEnlistment(enlistment: ConstPtr<Kenlistment>, enlistmentkey: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesTmRecoverEnlistment(enlistment.rawAddress.toString(), enlistmentkey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmRecoverResourceManager(resourcemanager: ConstPtr<Kresourcemanager>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesTmRecoverResourceManager(resourcemanager.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmRecoverTransactionManager(tm: ConstPtr<Ktm>, targetvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesTmRecoverTransactionManager(tm.rawAddress.toString(), targetvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmReferenceEnlistmentKey(enlistment: ConstPtr<Kenlistment>, key: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesTmReferenceEnlistmentKey(enlistment.rawAddress.toString(), key.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmRenameTransactionManager(logfilename: ConstPtr<UnicodeString>, existingtransactionmanagerguid: ConstPtr<Guid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesTmRenameTransactionManager(logfilename.rawAddress.toString(), existingtransactionmanagerguid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmRequestOutcomeEnlistment(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesTmRequestOutcomeEnlistment(enlistment.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmRollbackComplete(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesTmRollbackComplete(enlistment.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmRollbackEnlistment(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesTmRollbackEnlistment(enlistment.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmRollbackTransaction(transaction: ConstPtr<Ktransaction>, wait: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesTmRollbackTransaction(transaction.rawAddress.toString(), wait) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmSinglePhaseReject(enlistment: ConstPtr<Kenlistment>, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesTmSinglePhaseReject(enlistment.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vslCreateSecureSection(handle: MutPtr<Handle>, targetprocess: Peprocess, mdl: ConstPtr<Mdl>, devicepageprotection: UInt, attributes: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesVslCreateSecureSection(handle.rawAddress.toString(), targetprocess.toString(), mdl.rawAddress.toString(), devicepageprotection.toInt(), attributes.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vslDeleteSecureSection(globalhandle: Handle): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesVslDeleteSecureSection(globalhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaAddErrorSource(errorsource: ConstPtr<WheaErrorSourceDescriptor>, context: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesWheaAddErrorSource(errorsource.rawAddress.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaAddErrorSourceDeviceDriver(context: MutPtr<CVoid>, configuration: ConstPtr<WheaErrorSourceConfigurationDeviceDriver>, numberpreallocatederrorreports: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesWheaAddErrorSourceDeviceDriver(context.rawAddress.toString(), configuration.rawAddress.toString(), numberpreallocatederrorreports.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaAddErrorSourceDeviceDriverV1(context: MutPtr<CVoid>, configuration: ConstPtr<WheaErrorSourceConfigurationDeviceDriver>, numbufferstopreallocate: UInt, maxdatalength: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesWheaAddErrorSourceDeviceDriverV1(context.rawAddress.toString(), configuration.rawAddress.toString(), numbufferstopreallocate.toInt(), maxdatalength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaAddHwErrorReportSectionDeviceDriver(errorhandle: ConstPtr<CVoid>, sectiondatalength: UInt, bufferset: MutPtr<WheaDriverBufferSet>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesWheaAddHwErrorReportSectionDeviceDriver(errorhandle.rawAddress.toString(), sectiondatalength.toInt(), bufferset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaConfigureErrorSource(sourcetype: WheaErrorSourceType, configuration: ConstPtr<WheaErrorSourceConfiguration>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesWheaConfigureErrorSource(sourcetype, configuration.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaCreateHwErrorReportDeviceDriver(errorsourceid: UInt, deviceobject: ConstPtr<DeviceObject>): MutPtr<CVoid> =
    if (windowsWdkSystemSystemservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWdkSystemSystemservicesWheaCreateHwErrorReportDeviceDriver(errorsourceid.toInt(), deviceobject.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaErrorSourceGetState(errorsourceid: UInt): WheaErrorSourceState =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesWheaErrorSourceGetState(errorsourceid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaGetNotifyAllOfflinesPolicy(): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesWheaGetNotifyAllOfflinesPolicy() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaHighIrqlLogSelEventHandlerRegister(handler: PfnWheaHighIrqlLogSelEventHandler, context: ConstPtr<CVoid>): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesWheaHighIrqlLogSelEventHandlerRegister(0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaHighIrqlLogSelEventHandlerUnregister() {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesWheaHighIrqlLogSelEventHandlerUnregister()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wheaHwErrorReportAbandonDeviceDriver(errorhandle: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesWheaHwErrorReportAbandonDeviceDriver(errorhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaHwErrorReportSetSectionNameDeviceDriver(bufferset: ConstPtr<WheaDriverBufferSet>, namelength: UInt, name: ConstPtr<UByte>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesWheaHwErrorReportSetSectionNameDeviceDriver(bufferset.rawAddress.toString(), namelength.toInt(), name.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaHwErrorReportSetSeverityDeviceDriver(errorhandle: ConstPtr<CVoid>, errorseverity: WheaErrorSeverity): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesWheaHwErrorReportSetSeverityDeviceDriver(errorhandle.rawAddress.toString(), errorseverity) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaHwErrorReportSubmitDeviceDriver(errorhandle: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesWheaHwErrorReportSubmitDeviceDriver(errorhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaInitializeRecordHeader(header: MutPtr<WheaErrorRecordHeader>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesWheaInitializeRecordHeader(header.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaIsCriticalState(): Boolean =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesWheaIsCriticalState() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaLogInternalEvent(entry: ConstPtr<WheaEventLogEntry>) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesWheaLogInternalEvent(entry.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wheaRegisterInUsePageOfflineNotification(callback: PfnInUsePageOfflineNotify, context: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesWheaRegisterInUsePageOfflineNotification(0L.toString(), context.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaRemoveErrorSource(errorsourceid: UInt) {
    if (windowsWdkSystemSystemservicesNapiAvailable) {
        wasmWindowssysWindowsWdkSystemSystemservicesWheaRemoveErrorSource(errorsourceid.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wheaRemoveErrorSourceDeviceDriver(errorsourceid: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesWheaRemoveErrorSourceDeviceDriver(errorsourceid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaReportHwError(errorpacket: MutPtr<WheaErrorPacketV2>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesWheaReportHwError(errorpacket.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaReportHwErrorDeviceDriver(errorsourceid: UInt, deviceobject: ConstPtr<DeviceObject>, errordata: ConstPtr<UByte>, errordatalength: UInt, sectiontypeguid: ConstPtr<Guid>, errorseverity: WheaErrorSeverity, devicefriendlyname: Pcstr): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesWheaReportHwErrorDeviceDriver(errorsourceid.toInt(), deviceobject.rawAddress.toString(), errordata.rawAddress.toString(), errordatalength.toInt(), sectiontypeguid.rawAddress.toString(), errorseverity, devicefriendlyname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaUnconfigureErrorSource(sourcetype: WheaErrorSourceType): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesWheaUnconfigureErrorSource(sourcetype) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaUnregisterInUsePageOfflineNotification(callback: PfnInUsePageOfflineNotify): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesWheaUnregisterInUsePageOfflineNotification(0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wmiQueryTraceInformation(traceinformationclass: TraceInformationClass, traceinformation: MutPtr<CVoid>, traceinformationlength: UInt, requiredlength: MutPtr<UInt>, buffer: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesWmiQueryTraceInformation(traceinformationclass, traceinformation.rawAddress.toString(), traceinformationlength.toInt(), requiredlength.rawAddress.toString(), buffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwAllocateLocallyUniqueId(luid: MutPtr<Luid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwAllocateLocallyUniqueId(luid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwClose(handle: Handle): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwClose(handle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCommitComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwCommitComplete(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCommitEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwCommitEnlistment(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCommitTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwCommitTransaction(transactionhandle.rawAddress.toString(), wait) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCreateEnlistment(enlistmenthandle: MutPtr<Handle>, desiredaccess: UInt, resourcemanagerhandle: Handle, transactionhandle: Handle, objectattributes: ConstPtr<ObjectAttributes>, createoptions: UInt, notificationmask: UInt, enlistmentkey: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwCreateEnlistment(enlistmenthandle.rawAddress.toString(), desiredaccess.toInt(), resourcemanagerhandle.rawAddress.toString(), transactionhandle.rawAddress.toString(), objectattributes.rawAddress.toString(), createoptions.toInt(), notificationmask.toInt(), enlistmentkey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCreateFile(filehandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, allocationsize: ConstPtr<Long>, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: ConstPtr<CVoid>, ealength: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwCreateFile(filehandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), iostatusblock.rawAddress.toString(), allocationsize.rawAddress.toString(), fileattributes.toInt(), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), eabuffer.rawAddress.toString(), ealength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCreateResourceManager(resourcemanagerhandle: MutPtr<Handle>, desiredaccess: UInt, tmhandle: Handle, resourcemanagerguid: ConstPtr<Guid>, objectattributes: ConstPtr<ObjectAttributes>, createoptions: UInt, description: ConstPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwCreateResourceManager(resourcemanagerhandle.rawAddress.toString(), desiredaccess.toInt(), tmhandle.rawAddress.toString(), resourcemanagerguid.rawAddress.toString(), objectattributes.rawAddress.toString(), createoptions.toInt(), description.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCreateSection(sectionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, maximumsize: ConstPtr<Long>, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwCreateSection(sectionhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), maximumsize.rawAddress.toString(), sectionpageprotection.toInt(), allocationattributes.toInt(), filehandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCreateTransaction(transactionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, uow: ConstPtr<Guid>, tmhandle: Handle, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: ConstPtr<Long>, description: ConstPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwCreateTransaction(transactionhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), uow.rawAddress.toString(), tmhandle.rawAddress.toString(), createoptions.toInt(), isolationlevel.toInt(), isolationflags.toInt(), timeout.rawAddress.toString(), description.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCreateTransactionManager(tmhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, logfilename: ConstPtr<UnicodeString>, createoptions: UInt, commitstrength: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwCreateTransactionManager(tmhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), logfilename.rawAddress.toString(), createoptions.toInt(), commitstrength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwDeviceIoControlFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, iocontrolcode: UInt, inputbuffer: ConstPtr<CVoid>, inputbufferlength: UInt, outputbuffer: MutPtr<CVoid>, outputbufferlength: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwDeviceIoControlFile(filehandle.rawAddress.toString(), event.rawAddress.toString(), 0L.toString(), apccontext.rawAddress.toString(), iostatusblock.rawAddress.toString(), iocontrolcode.toInt(), inputbuffer.rawAddress.toString(), inputbufferlength.toInt(), outputbuffer.rawAddress.toString(), outputbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwDisplayString(string: ConstPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwDisplayString(string.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwEnumerateTransactionObject(rootobjecthandle: Handle, querytype: KtmobjectType, objectcursor: MutPtr<KtmobjectCursor>, objectcursorlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwEnumerateTransactionObject(rootobjecthandle.rawAddress.toString(), querytype, objectcursor.rawAddress.toString(), objectcursorlength.toInt(), returnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwGetNotificationResourceManager(resourcemanagerhandle: Handle, transactionnotification: MutPtr<TransactionNotification>, notificationlength: UInt, timeout: ConstPtr<Long>, returnlength: MutPtr<UInt>, asynchronous: UInt, asynchronouscontext: ULong): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwGetNotificationResourceManager(resourcemanagerhandle.rawAddress.toString(), transactionnotification.rawAddress.toString(), notificationlength.toInt(), timeout.rawAddress.toString(), returnlength.rawAddress.toString(), asynchronous.toInt(), asynchronouscontext.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwLoadDriver(driverservicename: ConstPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwLoadDriver(driverservicename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwMakeTemporaryObject(handle: Handle): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwMakeTemporaryObject(handle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwManagePartition(targethandle: Handle, sourcehandle: Handle, partitioninformationclass: PartitionInformationClass, partitioninformation: MutPtr<CVoid>, partitioninformationlength: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwManagePartition(targethandle.rawAddress.toString(), sourcehandle.rawAddress.toString(), partitioninformationclass, partitioninformation.rawAddress.toString(), partitioninformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenEnlistment(enlistmenthandle: MutPtr<Handle>, desiredaccess: UInt, rmhandle: Handle, enlistmentguid: ConstPtr<Guid>, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwOpenEnlistment(enlistmenthandle.rawAddress.toString(), desiredaccess.toInt(), rmhandle.rawAddress.toString(), enlistmentguid.rawAddress.toString(), objectattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenFile(filehandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, shareaccess: UInt, openoptions: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwOpenFile(filehandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), iostatusblock.rawAddress.toString(), shareaccess.toInt(), openoptions.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenResourceManager(resourcemanagerhandle: MutPtr<Handle>, desiredaccess: UInt, tmhandle: Handle, resourcemanagerguid: ConstPtr<Guid>, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwOpenResourceManager(resourcemanagerhandle.rawAddress.toString(), desiredaccess.toInt(), tmhandle.rawAddress.toString(), resourcemanagerguid.rawAddress.toString(), objectattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenSymbolicLinkObject(linkhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwOpenSymbolicLinkObject(linkhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenTransaction(transactionhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, uow: ConstPtr<Guid>, tmhandle: Handle): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwOpenTransaction(transactionhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), uow.rawAddress.toString(), tmhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenTransactionManager(tmhandle: MutPtr<Handle>, desiredaccess: UInt, objectattributes: ConstPtr<ObjectAttributes>, logfilename: ConstPtr<UnicodeString>, tmidentity: ConstPtr<Guid>, openoptions: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwOpenTransactionManager(tmhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString(), logfilename.rawAddress.toString(), tmidentity.rawAddress.toString(), openoptions.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwPowerInformation(informationlevel: PowerInformationLevel, inputbuffer: ConstPtr<CVoid>, inputbufferlength: UInt, outputbuffer: MutPtr<CVoid>, outputbufferlength: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwPowerInformation(informationlevel, inputbuffer.rawAddress.toString(), inputbufferlength.toInt(), outputbuffer.rawAddress.toString(), outputbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwPrePrepareComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwPrePrepareComplete(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwPrePrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwPrePrepareEnlistment(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwPrepareComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwPrepareComplete(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwPrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwPrepareEnlistment(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwPropagationComplete(resourcemanagerhandle: Handle, requestcookie: UInt, bufferlength: UInt, buffer: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwPropagationComplete(resourcemanagerhandle.rawAddress.toString(), requestcookie.toInt(), bufferlength.toInt(), buffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwPropagationFailed(resourcemanagerhandle: Handle, requestcookie: UInt, propstatus: Ntstatus): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwPropagationFailed(resourcemanagerhandle.rawAddress.toString(), requestcookie.toInt(), propstatus) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryInformationByName(objectattributes: ConstPtr<ObjectAttributes>, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwQueryInformationByName(objectattributes.rawAddress.toString(), iostatusblock.rawAddress.toString(), fileinformation.rawAddress.toString(), length.toInt(), fileinformationclass) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: MutPtr<CVoid>, enlistmentinformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwQueryInformationEnlistment(enlistmenthandle.rawAddress.toString(), enlistmentinformationclass, enlistmentinformation.rawAddress.toString(), enlistmentinformationlength.toInt(), returnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryInformationFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: MutPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwQueryInformationFile(filehandle.rawAddress.toString(), iostatusblock.rawAddress.toString(), fileinformation.rawAddress.toString(), length.toInt(), fileinformationclass) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: MutPtr<CVoid>, resourcemanagerinformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwQueryInformationResourceManager(resourcemanagerhandle.rawAddress.toString(), resourcemanagerinformationclass, resourcemanagerinformation.rawAddress.toString(), resourcemanagerinformationlength.toInt(), returnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: MutPtr<CVoid>, transactioninformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwQueryInformationTransaction(transactionhandle.rawAddress.toString(), transactioninformationclass, transactioninformation.rawAddress.toString(), transactioninformationlength.toInt(), returnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryInformationTransactionManager(transactionmanagerhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: MutPtr<CVoid>, transactionmanagerinformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwQueryInformationTransactionManager(transactionmanagerhandle.rawAddress.toString(), transactionmanagerinformationclass, transactionmanagerinformation.rawAddress.toString(), transactionmanagerinformationlength.toInt(), returnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQuerySymbolicLinkObject(linkhandle: Handle, linktarget: MutPtr<UnicodeString>, returnedlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwQuerySymbolicLinkObject(linkhandle.rawAddress.toString(), linktarget.rawAddress.toString(), returnedlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwReadFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, buffer: MutPtr<CVoid>, length: UInt, byteoffset: ConstPtr<Long>, key: ConstPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwReadFile(filehandle.rawAddress.toString(), event.rawAddress.toString(), 0L.toString(), apccontext.rawAddress.toString(), iostatusblock.rawAddress.toString(), buffer.rawAddress.toString(), length.toInt(), byteoffset.rawAddress.toString(), key.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwReadOnlyEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwReadOnlyEnlistment(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwRecoverEnlistment(enlistmenthandle: Handle, enlistmentkey: ConstPtr<CVoid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwRecoverEnlistment(enlistmenthandle.rawAddress.toString(), enlistmentkey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwRecoverResourceManager(resourcemanagerhandle: Handle): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwRecoverResourceManager(resourcemanagerhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwRecoverTransactionManager(transactionmanagerhandle: Handle): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwRecoverTransactionManager(transactionmanagerhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwRegisterProtocolAddressInformation(resourcemanager: Handle, protocolid: ConstPtr<Guid>, protocolinformationsize: UInt, protocolinformation: ConstPtr<CVoid>, createoptions: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwRegisterProtocolAddressInformation(resourcemanager.rawAddress.toString(), protocolid.rawAddress.toString(), protocolinformationsize.toInt(), protocolinformation.rawAddress.toString(), createoptions.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwRenameTransactionManager(logfilename: ConstPtr<UnicodeString>, existingtransactionmanagerguid: ConstPtr<Guid>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwRenameTransactionManager(logfilename.rawAddress.toString(), existingtransactionmanagerguid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwRollbackComplete(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwRollbackComplete(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwRollbackEnlistment(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwRollbackEnlistment(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwRollbackTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwRollbackTransaction(transactionhandle.rawAddress.toString(), wait) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwRollforwardTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwRollforwardTransactionManager(transactionmanagerhandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: ConstPtr<CVoid>, enlistmentinformationlength: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwSetInformationEnlistment(enlistmenthandle.rawAddress.toString(), enlistmentinformationclass, enlistmentinformation.rawAddress.toString(), enlistmentinformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetInformationFile(filehandle: Handle, iostatusblock: MutPtr<IoStatusBlock>, fileinformation: ConstPtr<CVoid>, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwSetInformationFile(filehandle.rawAddress.toString(), iostatusblock.rawAddress.toString(), fileinformation.rawAddress.toString(), length.toInt(), fileinformationclass) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: ConstPtr<CVoid>, resourcemanagerinformationlength: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwSetInformationResourceManager(resourcemanagerhandle.rawAddress.toString(), resourcemanagerinformationclass, resourcemanagerinformation.rawAddress.toString(), resourcemanagerinformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: ConstPtr<CVoid>, transactioninformationlength: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwSetInformationTransaction(transactionhandle.rawAddress.toString(), transactioninformationclass, transactioninformation.rawAddress.toString(), transactioninformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetInformationTransactionManager(tmhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: ConstPtr<CVoid>, transactionmanagerinformationlength: UInt): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwSetInformationTransactionManager(tmhandle.rawAddress.toString(), transactionmanagerinformationclass, transactionmanagerinformation.rawAddress.toString(), transactionmanagerinformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSinglePhaseReject(enlistmenthandle: Handle, tmvirtualclock: ConstPtr<Long>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwSinglePhaseReject(enlistmenthandle.rawAddress.toString(), tmvirtualclock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwUnloadDriver(driverservicename: ConstPtr<UnicodeString>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwUnloadDriver(driverservicename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwWriteFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: ConstPtr<CVoid>, iostatusblock: MutPtr<IoStatusBlock>, buffer: ConstPtr<CVoid>, length: UInt, byteoffset: ConstPtr<Long>, key: ConstPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesZwWriteFile(filehandle.rawAddress.toString(), event.rawAddress.toString(), 0L.toString(), apccontext.rawAddress.toString(), iostatusblock.rawAddress.toString(), buffer.rawAddress.toString(), length.toInt(), byteoffset.rawAddress.toString(), key.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vDbgPrintEx(componentid: UInt, level: UInt, format: Pcstr, arglist: ConstPtr<Byte>): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesVDbgPrintEx(componentid.toInt(), level.toInt(), format.rawAddress.toString(), arglist.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vDbgPrintExWithPrefix(prefix: Pcstr, componentid: UInt, level: UInt, format: Pcstr, arglist: ConstPtr<Byte>): UInt =
    if (windowsWdkSystemSystemservicesNapiAvailable) wasmWindowssysWindowsWdkSystemSystemservicesVDbgPrintExWithPrefix(prefix.rawAddress.toString(), componentid.toInt(), level.toInt(), format.rawAddress.toString(), arglist.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
