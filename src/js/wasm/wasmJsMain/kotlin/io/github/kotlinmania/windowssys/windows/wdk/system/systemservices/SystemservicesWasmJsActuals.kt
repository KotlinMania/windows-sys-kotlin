@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

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

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWdkSystemSystemservicesNapiAddon(): Boolean

private val _windowsWdkSystemSystemservicesNapiAvailable: Boolean = _initWindowsWdkSystemSystemservicesNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsAddLogContainer(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsAddLogContainer(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsAddLogContainerSet(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsAddLogContainerSet(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsAdvanceLogBase(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsAdvanceLogBase(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsAlignReservedLog(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsAlignReservedLog(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsAllocReservedLog(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsAllocReservedLog(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsCloseAndResetLogFile(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsCloseAndResetLogFile(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsCloseLogFileObject(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsCloseLogFileObject(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsCreateLogFile(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsCreateLogFile(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: Int, p7: Int, p8: Int, p9: String, p10: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsCreateScanContext(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsCreateScanContext(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsDeleteLogByPointer(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsDeleteLogByPointer(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsDeleteLogFile(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsDeleteLogFile(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsDeleteMarshallingArea(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsDeleteMarshallingArea(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsFinalize()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsFinalize()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsFlushBuffers(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsFlushBuffers(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsFlushToLsn(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsFlushToLsn(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsFreeReservedLog(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsFreeReservedLog(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsGetContainerName(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsGetContainerName(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsGetIoStatistics(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsGetIoStatistics(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsGetLogFileInformation(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsGetLogFileInformation(p0: String, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsInitialize()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsInitialize(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsLsnBlockOffset(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsLsnBlockOffset(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsLsnContainer(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsLsnContainer(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsLsnDifference(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsLsnDifference(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsLsnEqual(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsLsnEqual(p0: String, p1: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsLsnGreater(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsLsnGreater(p0: String, p1: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsLsnInvalid(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsLsnInvalid(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsLsnLess(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsLsnLess(p0: String, p1: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsLsnNull(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsLsnNull(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsLsnRecordSequence(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsLsnRecordSequence(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsMgmtDeregisterManagedClient(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsMgmtDeregisterManagedClient(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsMgmtHandleLogFileFull(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsMgmtHandleLogFileFull(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsMgmtInstallPolicy(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsMgmtInstallPolicy(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsMgmtQueryPolicy(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsMgmtQueryPolicy(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsMgmtRegisterManagedClient(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsMgmtRegisterManagedClient(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsMgmtRemovePolicy(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsMgmtRemovePolicy(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsMgmtSetLogFileSize(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsMgmtSetLogFileSize(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsMgmtSetLogFileSizeAsClient(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsMgmtSetLogFileSizeAsClient(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsMgmtTailAdvanceFailure(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsMgmtTailAdvanceFailure(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsQueryLogFileInformation(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsQueryLogFileInformation(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsReadLogRecord(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsReadLogRecord(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsReadNextLogRecord(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsReadNextLogRecord(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsReadPreviousRestartArea(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsReadPreviousRestartArea(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsReadRestartArea(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsReadRestartArea(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsRemoveLogContainer(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsRemoveLogContainer(p0: String, p1: String, p2: Boolean): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsRemoveLogContainerSet(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsRemoveLogContainerSet(p0: String, p1: Int, p2: String, p3: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsReserveAndAppendLog(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsReserveAndAppendLog(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String, p7: Int, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsReserveAndAppendLogAligned(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsReserveAndAppendLogAligned(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: Int, p7: String, p8: Int, p9: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsScanLogContainers(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsScanLogContainers(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsSetArchiveTail(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsSetArchiveTail(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsSetEndOfLog(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsSetEndOfLog(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsSetLogFileInformation(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsSetLogFileInformation(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsTerminateReadLog(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsTerminateReadLog(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_clfsWriteRestartArea(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_clfsWriteRestartArea(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_cmCallbackGetKeyObjectID(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_cmCallbackGetKeyObjectID(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_cmCallbackGetKeyObjectIDEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_cmCallbackGetKeyObjectIDEx(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_cmCallbackReleaseKeyObjectIDEx(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_cmCallbackReleaseKeyObjectIDEx(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_cmGetBoundTransaction(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_cmGetBoundTransaction(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_cmGetCallbackVersion(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_cmGetCallbackVersion(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_cmRegisterCallback(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_cmRegisterCallback(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_cmRegisterCallbackEx(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_cmRegisterCallbackEx(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_cmSetCallbackObjectContext(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_cmSetCallbackObjectContext(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_cmUnRegisterCallback(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_cmUnRegisterCallback(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_dbgBreakPointWithStatus(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_dbgBreakPointWithStatus(p0: Int)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_dbgPrint(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_dbgPrint(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_dbgPrintEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_dbgPrintEx(p0: Int, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_dbgPrintReturnControlC(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_dbgPrintReturnControlC(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_dbgPrompt(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_dbgPrompt(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_dbgQueryDebugFilterState(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_dbgQueryDebugFilterState(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_dbgSetDebugFilterState(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_dbgSetDebugFilterState(p0: Int, p1: Int, p2: Boolean): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_dbgSetDebugPrintCallback(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_dbgSetDebugPrintCallback(p0: String, p1: Boolean): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_etwActivityIdControl(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_etwActivityIdControl(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_etwEventEnabled(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_etwEventEnabled(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_etwProviderEnabled(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_etwProviderEnabled(p0: String, p1: Int, p2: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_etwRegister(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_etwRegister(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_etwSetInformation(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_etwSetInformation(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_etwUnregister(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_etwUnregister(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_etwWrite(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_etwWrite(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_etwWriteEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_etwWriteEx(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_etwWriteString(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_etwWriteString(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_etwWriteTransfer(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_etwWriteTransfer(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exAcquireFastMutex(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exAcquireFastMutex(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exAcquireFastMutexUnsafe(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exAcquireFastMutexUnsafe(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exAcquirePushLockExclusiveEx(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exAcquirePushLockExclusiveEx(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exAcquirePushLockSharedEx(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exAcquirePushLockSharedEx(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exAcquireResourceExclusiveLite(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exAcquireResourceExclusiveLite(p0: String, p1: Boolean): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exAcquireResourceSharedLite(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exAcquireResourceSharedLite(p0: String, p1: Boolean): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exAcquireRundownProtection(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exAcquireRundownProtection(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exAcquireRundownProtectionCacheAware(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exAcquireRundownProtectionCacheAware(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exAcquireRundownProtectionCacheAwareEx(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exAcquireRundownProtectionCacheAwareEx(p0: String, p1: Int): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exAcquireRundownProtectionEx(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exAcquireRundownProtectionEx(p0: String, p1: Int): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exAcquireSharedStarveExclusive(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exAcquireSharedStarveExclusive(p0: String, p1: Boolean): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exAcquireSharedWaitForExclusive(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exAcquireSharedWaitForExclusive(p0: String, p1: Boolean): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exAcquireSpinLockExclusive(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exAcquireSpinLockExclusive(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exAcquireSpinLockExclusiveAtDpcLevel(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exAcquireSpinLockExclusiveAtDpcLevel(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exAcquireSpinLockShared(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exAcquireSpinLockShared(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exAcquireSpinLockSharedAtDpcLevel(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exAcquireSpinLockSharedAtDpcLevel(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exAllocateCacheAwareRundownProtection(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exAllocateCacheAwareRundownProtection(p0: Int, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exAllocatePool(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exAllocatePool(p0: Int, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exAllocatePool2(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exAllocatePool2(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exAllocatePool3(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exAllocatePool3(p0: String, p1: String, p2: Int, p3: String, p4: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exAllocatePoolWithQuota(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exAllocatePoolWithQuota(p0: Int, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exAllocatePoolWithQuotaTag(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exAllocatePoolWithQuotaTag(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exAllocatePoolWithTag(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exAllocatePoolWithTag(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exAllocatePoolWithTagPriority(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exAllocatePoolWithTagPriority(p0: Int, p1: String, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exAllocateTimer(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exAllocateTimer(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exCancelTimer(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exCancelTimer(p0: String, p1: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exCleanupRundownProtectionCacheAware(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exCleanupRundownProtectionCacheAware(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exConvertExclusiveToSharedLite(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exConvertExclusiveToSharedLite(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exCreateCallback(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exCreateCallback(p0: String, p1: String, p2: Boolean, p3: Boolean): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exCreatePool(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exCreatePool(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exDeleteResourceLite(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exDeleteResourceLite(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exDeleteTimer(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exDeleteTimer(p0: String, p1: Boolean, p2: Boolean, p3: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exDestroyPool(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exDestroyPool(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exEnterCriticalRegionAndAcquireResourceExclusive(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exEnterCriticalRegionAndAcquireResourceExclusive(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exEnterCriticalRegionAndAcquireResourceShared(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exEnterCriticalRegionAndAcquireResourceShared(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exEnterCriticalRegionAndAcquireSharedWaitForExclusive(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exEnterCriticalRegionAndAcquireSharedWaitForExclusive(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exEnumerateSystemFirmwareTables(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exEnumerateSystemFirmwareTables(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exExtendZone(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exExtendZone(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exFreeCacheAwareRundownProtection(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exFreeCacheAwareRundownProtection(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exFreePool(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exFreePool(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exFreePool2(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exFreePool2(p0: String, p1: Int, p2: String, p3: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exFreePoolWithTag(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exFreePoolWithTag(p0: String, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exGetExclusiveWaiterCount(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exGetExclusiveWaiterCount(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exGetFirmwareEnvironmentVariable(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exGetFirmwareEnvironmentVariable(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exGetFirmwareType()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exGetFirmwareType(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exGetPreviousMode()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exGetPreviousMode(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exGetSharedWaiterCount(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exGetSharedWaiterCount(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exGetSystemFirmwareTable(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exGetSystemFirmwareTable(p0: Int, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exInitializePushLock(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exInitializePushLock(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exInitializeResourceLite(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exInitializeResourceLite(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exInitializeRundownProtection(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exInitializeRundownProtection(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exInitializeRundownProtectionCacheAware(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exInitializeRundownProtectionCacheAware(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exInitializeRundownProtectionCacheAwareEx(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exInitializeRundownProtectionCacheAwareEx(p0: String, p1: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exInitializeZone(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exInitializeZone(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exInterlockedAddLargeInteger(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exInterlockedAddLargeInteger(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exInterlockedExtendZone(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exInterlockedExtendZone(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exIsManufacturingModeEnabled()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exIsManufacturingModeEnabled(): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exIsProcessorFeaturePresent(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exIsProcessorFeaturePresent(p0: Int): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exIsResourceAcquiredExclusiveLite(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exIsResourceAcquiredExclusiveLite(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exIsResourceAcquiredSharedLite(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exIsResourceAcquiredSharedLite(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exIsSoftBoot()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exIsSoftBoot(): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exLocalTimeToSystemTime(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exLocalTimeToSystemTime(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exNotifyCallback(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exNotifyCallback(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exQueryTimerResolution(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exQueryTimerResolution(p0: String, p1: String, p2: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exQueueWorkItem(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exQueueWorkItem(p0: String, p1: Int)

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exRaiseAccessViolation()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exRaiseAccessViolation()

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exRaiseDatatypeMisalignment()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exRaiseDatatypeMisalignment()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exRaiseStatus(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exRaiseStatus(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exReInitializeRundownProtection(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exReInitializeRundownProtection(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exReInitializeRundownProtectionCacheAware(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exReInitializeRundownProtectionCacheAware(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exRegisterCallback(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exRegisterCallback(p0: String, p1: String, p2: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exReinitializeResourceLite(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exReinitializeResourceLite(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exReleaseFastMutex(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exReleaseFastMutex(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exReleaseFastMutexUnsafe(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exReleaseFastMutexUnsafe(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exReleasePushLockExclusiveEx(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exReleasePushLockExclusiveEx(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exReleasePushLockSharedEx(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exReleasePushLockSharedEx(p0: String, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exReleaseResourceAndLeaveCriticalRegion(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exReleaseResourceAndLeaveCriticalRegion(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exReleaseResourceForThreadLite(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exReleaseResourceForThreadLite(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exReleaseResourceLite(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exReleaseResourceLite(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exReleaseRundownProtection(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exReleaseRundownProtection(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exReleaseRundownProtectionCacheAware(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exReleaseRundownProtectionCacheAware(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exReleaseRundownProtectionCacheAwareEx(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exReleaseRundownProtectionCacheAwareEx(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exReleaseRundownProtectionEx(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exReleaseRundownProtectionEx(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exReleaseSpinLockExclusive(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exReleaseSpinLockExclusive(p0: String, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exReleaseSpinLockExclusiveFromDpcLevel(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exReleaseSpinLockExclusiveFromDpcLevel(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exReleaseSpinLockShared(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exReleaseSpinLockShared(p0: String, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exReleaseSpinLockSharedFromDpcLevel(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exReleaseSpinLockSharedFromDpcLevel(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exRundownCompleted(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exRundownCompleted(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exRundownCompletedCacheAware(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exRundownCompletedCacheAware(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exSecurePoolUpdate(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exSecurePoolUpdate(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exSecurePoolValidate(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exSecurePoolValidate(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exSetFirmwareEnvironmentVariable(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exSetFirmwareEnvironmentVariable(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exSetResourceOwnerPointer(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exSetResourceOwnerPointer(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exSetResourceOwnerPointerEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exSetResourceOwnerPointerEx(p0: String, p1: String, p2: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exSetTimer(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exSetTimer(p0: String, p1: String, p2: String, p3: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exSetTimerResolution(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exSetTimerResolution(p0: Int, p1: Boolean): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exSizeOfRundownProtectionCacheAware()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exSizeOfRundownProtectionCacheAware(): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exSystemTimeToLocalTime(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exSystemTimeToLocalTime(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exTryAcquireSpinLockExclusiveAtDpcLevel(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exTryAcquireSpinLockExclusiveAtDpcLevel(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exTryAcquireSpinLockSharedAtDpcLevel(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exTryAcquireSpinLockSharedAtDpcLevel(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exTryConvertSharedSpinLockExclusive(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exTryConvertSharedSpinLockExclusive(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exTryToAcquireFastMutex(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exTryToAcquireFastMutex(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exUnregisterCallback(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exUnregisterCallback(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exUuidCreate(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exUuidCreate(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exVerifySuite(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exVerifySuite(p0: Int): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exWaitForRundownProtectionRelease(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exWaitForRundownProtectionRelease(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_exWaitForRundownProtectionReleaseCacheAware(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_exWaitForRundownProtectionReleaseCacheAware(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_fsRtlIsTotalDeviceFailure(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_fsRtlIsTotalDeviceFailure(p0: Int): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_halAcquireDisplayOwnership(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_halAcquireDisplayOwnership(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_halAllocateCommonBuffer(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_halAllocateCommonBuffer(p0: String, p1: Int, p2: String, p3: Boolean): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_halAllocateCrashDumpRegisters(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_halAllocateCrashDumpRegisters(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_halAllocateHardwareCounters(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_halAllocateHardwareCounters(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_halAssignSlotResources(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_halAssignSlotResources(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: Int, p7: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_halBugCheckSystem(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_halBugCheckSystem(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_halDmaAllocateCrashDumpRegistersEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_halDmaAllocateCrashDumpRegistersEx(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_halDmaFreeCrashDumpRegistersEx(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_halDmaFreeCrashDumpRegistersEx(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_halExamineMBR(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_halExamineMBR(p0: String, p1: Int, p2: Int, p3: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_halFreeCommonBuffer(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_halFreeCommonBuffer(p0: String, p1: Int, p2: String, p3: String, p4: Boolean)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_halFreeHardwareCounters(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_halFreeHardwareCounters(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_halGetAdapter(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_halGetAdapter(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_halGetBusData(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_halGetBusData(p0: Int, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_halGetBusDataByOffset(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_halGetBusDataByOffset(p0: Int, p1: Int, p2: Int, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_halGetInterruptVector(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_halGetInterruptVector(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_halMakeBeep(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_halMakeBeep(p0: Int): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_halReadDmaCounter(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_halReadDmaCounter(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_halSetBusData(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_halSetBusData(p0: Int, p1: Int, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_halSetBusDataByOffset(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_halSetBusDataByOffset(p0: Int, p1: Int, p2: Int, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_halTranslateBusAddress(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_halTranslateBusAddress(p0: Int, p1: Int, p2: String, p3: String, p4: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_hvlRegisterWheaErrorNotification(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_hvlRegisterWheaErrorNotification(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_hvlUnregisterWheaErrorNotification(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_hvlUnregisterWheaErrorNotification(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioAcquireCancelSpinLock(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioAcquireCancelSpinLock(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioAcquireKsrPersistentMemory(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioAcquireKsrPersistentMemory(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioAcquireKsrPersistentMemoryEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioAcquireKsrPersistentMemoryEx(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioAcquireRemoveLockEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioAcquireRemoveLockEx(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioAllocateDriverObjectExtension(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioAllocateDriverObjectExtension(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioAllocateErrorLogEntry(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioAllocateErrorLogEntry(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioAllocateIrp(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioAllocateIrp(p0: Int, p1: Boolean): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioAllocateIrpEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioAllocateIrpEx(p0: String, p1: Int, p2: Boolean): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioAllocateMdl(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioAllocateMdl(p0: String, p1: Int, p2: Boolean, p3: Boolean, p4: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioAllocateSfioStreamIdentifier(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioAllocateSfioStreamIdentifier(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioAllocateWorkItem(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioAllocateWorkItem(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioAssignResources(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioAssignResources(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioAttachDevice(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioAttachDevice(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioAttachDeviceByPointer(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioAttachDeviceByPointer(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioAttachDeviceToDeviceStack(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioAttachDeviceToDeviceStack(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioAttachDeviceToDeviceStackSafe(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioAttachDeviceToDeviceStackSafe(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioBuildAsynchronousFsdRequest(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioBuildAsynchronousFsdRequest(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioBuildDeviceIoControlRequest(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioBuildDeviceIoControlRequest(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: Boolean, p7: String, p8: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioBuildPartialMdl(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioBuildPartialMdl(p0: String, p1: String, p2: String, p3: Int)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioBuildSynchronousFsdRequest(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioBuildSynchronousFsdRequest(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioCancelFileOpen(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioCancelFileOpen(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioCancelIrp(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioCancelIrp(p0: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioCheckLinkShareAccess(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioCheckLinkShareAccess(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioCheckShareAccess(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioCheckShareAccess(p0: Int, p1: Int, p2: String, p3: String, p4: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioCheckShareAccessEx(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioCheckShareAccessEx(p0: Int, p1: Int, p2: String, p3: String, p4: Boolean, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioCleanupIrp(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioCleanupIrp(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioClearActivityIdThread(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioClearActivityIdThread(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioClearIrpExtraCreateParameter(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioClearIrpExtraCreateParameter(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioConnectInterrupt(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioConnectInterrupt(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: Int, p7: Int, p8: Boolean, p9: String, p10: Boolean): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioConnectInterruptEx(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioConnectInterruptEx(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioCreateController(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioCreateController(p0: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioCreateDevice(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioCreateDevice(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: Boolean, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioCreateDisk(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioCreateDisk(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioCreateFile(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioCreateFile(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: Int, p7: Int, p8: Int, p9: String, p10: Int, p11: Int, p12: String, p13: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioCreateFileEx(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioCreateFileEx(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: Int, p7: Int, p8: Int, p9: String, p10: Int, p11: Int, p12: String, p13: Int, p14: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioCreateFileSpecifyDeviceObjectHint(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioCreateFileSpecifyDeviceObjectHint(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: Int, p7: Int, p8: Int, p9: String, p10: Int, p11: Int, p12: String, p13: Int, p14: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioCreateNotificationEvent(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioCreateNotificationEvent(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioCreateSymbolicLink(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioCreateSymbolicLink(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioCreateSynchronizationEvent(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioCreateSynchronizationEvent(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioCreateSystemThread(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioCreateSystemThread(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioCreateUnprotectedSymbolicLink(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioCreateUnprotectedSymbolicLink(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioCsqInitialize(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioCsqInitialize(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioCsqInitializeEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioCsqInitializeEx(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioCsqInsertIrp(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioCsqInsertIrp(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioCsqInsertIrpEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioCsqInsertIrpEx(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioCsqRemoveIrp(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioCsqRemoveIrp(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioCsqRemoveNextIrp(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioCsqRemoveNextIrp(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioDecrementKeepAliveCount(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioDecrementKeepAliveCount(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioDeleteController(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioDeleteController(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioDeleteDevice(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioDeleteDevice(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioDeleteSymbolicLink(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioDeleteSymbolicLink(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioDetachDevice(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioDetachDevice(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioDisconnectInterrupt(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioDisconnectInterrupt(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioDisconnectInterruptEx(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioDisconnectInterruptEx(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioEnumerateKsrPersistentMemoryEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioEnumerateKsrPersistentMemoryEx(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioFlushAdapterBuffers(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioFlushAdapterBuffers(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Boolean): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioForwardIrpSynchronously(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioForwardIrpSynchronously(p0: String, p1: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioFreeAdapterChannel(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioFreeAdapterChannel(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioFreeController(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioFreeController(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioFreeErrorLogEntry(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioFreeErrorLogEntry(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioFreeIrp(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioFreeIrp(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioFreeKsrPersistentMemory(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioFreeKsrPersistentMemory(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioFreeMapRegisters(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioFreeMapRegisters(p0: String, p1: String, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioFreeMdl(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioFreeMdl(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioFreeSfioStreamIdentifier(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioFreeSfioStreamIdentifier(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioFreeWorkItem(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioFreeWorkItem(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioGetActivityIdIrp(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioGetActivityIdIrp(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioGetActivityIdThread()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioGetActivityIdThread(): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioGetAffinityInterrupt(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioGetAffinityInterrupt(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioGetAttachedDeviceReference(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioGetAttachedDeviceReference(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioGetBootDiskInformation(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioGetBootDiskInformation(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioGetBootDiskInformationLite(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioGetBootDiskInformationLite(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioGetConfigurationInformation()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioGetConfigurationInformation(): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioGetContainerInformation(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioGetContainerInformation(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioGetCurrentProcess()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioGetCurrentProcess(): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioGetDeviceDirectory(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioGetDeviceDirectory(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioGetDeviceInterfaceAlias(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioGetDeviceInterfaceAlias(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioGetDeviceInterfacePropertyData(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioGetDeviceInterfacePropertyData(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioGetDeviceInterfaces(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioGetDeviceInterfaces(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioGetDeviceNumaNode(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioGetDeviceNumaNode(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioGetDeviceObjectPointer(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioGetDeviceObjectPointer(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioGetDeviceProperty(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioGetDeviceProperty(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioGetDevicePropertyData(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioGetDevicePropertyData(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioGetDmaAdapter(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioGetDmaAdapter(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioGetDriverDirectory(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioGetDriverDirectory(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioGetDriverObjectExtension(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioGetDriverObjectExtension(p0: String, p1: String): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioGetFileObjectGenericMapping()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioGetFileObjectGenericMapping(): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioGetFsZeroingOffset(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioGetFsZeroingOffset(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioGetInitialStack()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioGetInitialStack(): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioGetInitiatorProcess(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioGetInitiatorProcess(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioGetIoAttributionHandle(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioGetIoAttributionHandle(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioGetIoPriorityHint(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioGetIoPriorityHint(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioGetIommuInterface(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioGetIommuInterface(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioGetIommuInterfaceEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioGetIommuInterfaceEx(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioGetIrpExtraCreateParameter(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioGetIrpExtraCreateParameter(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioGetPagingIoPriority(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioGetPagingIoPriority(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioGetRelatedDeviceObject(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioGetRelatedDeviceObject(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioGetSfioStreamIdentifier(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioGetSfioStreamIdentifier(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioGetSilo(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioGetSilo(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioGetSiloParameters(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioGetSiloParameters(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioGetStackLimits(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioGetStackLimits(p0: String, p1: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioGetTopLevelIrp()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioGetTopLevelIrp(): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioGetTransactionParameterBlock(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioGetTransactionParameterBlock(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioIncrementKeepAliveCount(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioIncrementKeepAliveCount(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioInitializeIrp(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioInitializeIrp(p0: String, p1: Int, p2: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioInitializeIrpEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioInitializeIrpEx(p0: String, p1: String, p2: Int, p3: Int)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioInitializeRemoveLockEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioInitializeRemoveLockEx(p0: String, p1: Int, p2: Int, p3: Int, p4: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioInitializeTimer(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioInitializeTimer(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioInitializeWorkItem(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioInitializeWorkItem(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioInvalidateDeviceRelations(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioInvalidateDeviceRelations(p0: String, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioInvalidateDeviceState(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioInvalidateDeviceState(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioIs32bitProcess(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioIs32bitProcess(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioIsFileObjectIgnoringSharing(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioIsFileObjectIgnoringSharing(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioIsFileOriginRemote(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioIsFileOriginRemote(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioIsInitiator32bitProcess(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioIsInitiator32bitProcess(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioIsValidIrpStatus(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioIsValidIrpStatus(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioIsWdmVersionAvailable(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioIsWdmVersionAvailable(p0: Int, p1: Int): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioMakeAssociatedIrp(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioMakeAssociatedIrp(p0: String, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioMakeAssociatedIrpEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioMakeAssociatedIrpEx(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioMapTransfer(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioMapTransfer(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Boolean): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioOpenDeviceInterfaceRegistryKey(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioOpenDeviceInterfaceRegistryKey(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioOpenDeviceRegistryKey(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioOpenDeviceRegistryKey(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioOpenDriverRegistryKey(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioOpenDriverRegistryKey(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioPropagateActivityIdToThread(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioPropagateActivityIdToThread(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioQueryDeviceDescription(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioQueryDeviceDescription(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioQueryFullDriverPath(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioQueryFullDriverPath(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioQueryInformationByName(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioQueryInformationByName(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioQueryKsrPersistentMemorySize(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioQueryKsrPersistentMemorySize(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioQueryKsrPersistentMemorySizeEx(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioQueryKsrPersistentMemorySizeEx(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioQueueWorkItem(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioQueueWorkItem(p0: String, p1: String, p2: Int, p3: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioQueueWorkItemEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioQueueWorkItemEx(p0: String, p1: String, p2: Int, p3: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioRaiseHardError(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioRaiseHardError(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioRaiseInformationalHardError(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioRaiseInformationalHardError(p0: Int, p1: String, p2: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioReadDiskSignature(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioReadDiskSignature(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioReadPartitionTable(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioReadPartitionTable(p0: String, p1: Int, p2: Boolean, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioReadPartitionTableEx(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioReadPartitionTableEx(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioRecordIoAttribution(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioRecordIoAttribution(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioRegisterBootDriverCallback(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioRegisterBootDriverCallback(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioRegisterContainerNotification(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioRegisterContainerNotification(p0: Int, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioRegisterDeviceInterface(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioRegisterDeviceInterface(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioRegisterLastChanceShutdownNotification(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioRegisterLastChanceShutdownNotification(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioRegisterPlugPlayNotification(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioRegisterPlugPlayNotification(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioRegisterShutdownNotification(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioRegisterShutdownNotification(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioReleaseCancelSpinLock(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioReleaseCancelSpinLock(p0: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioReleaseRemoveLockAndWaitEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioReleaseRemoveLockAndWaitEx(p0: String, p1: String, p2: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioReleaseRemoveLockEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioReleaseRemoveLockEx(p0: String, p1: String, p2: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioRemoveLinkShareAccess(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioRemoveLinkShareAccess(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioRemoveLinkShareAccessEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioRemoveLinkShareAccessEx(p0: String, p1: String, p2: String, p3: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioRemoveShareAccess(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioRemoveShareAccess(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioReplacePartitionUnit(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioReplacePartitionUnit(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioReportDetectedDevice(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioReportDetectedDevice(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: Boolean, p7: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioReportInterruptActive(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioReportInterruptActive(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioReportInterruptInactive(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioReportInterruptInactive(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioReportResourceForDetection(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioReportResourceForDetection(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioReportResourceUsage(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioReportResourceUsage(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: Int, p7: Boolean, p8: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioReportRootDevice(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioReportRootDevice(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioReportTargetDeviceChange(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioReportTargetDeviceChange(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioReportTargetDeviceChangeAsynchronous(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioReportTargetDeviceChangeAsynchronous(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioRequestDeviceEject(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioRequestDeviceEject(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioRequestDeviceEjectEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioRequestDeviceEjectEx(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioReserveKsrPersistentMemory(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioReserveKsrPersistentMemory(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioReserveKsrPersistentMemoryEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioReserveKsrPersistentMemoryEx(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioReuseIrp(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioReuseIrp(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioSetActivityIdIrp(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioSetActivityIdIrp(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioSetActivityIdThread(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioSetActivityIdThread(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioSetCompletionRoutineEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioSetCompletionRoutineEx(p0: String, p1: String, p2: String, p3: String, p4: Boolean, p5: Boolean, p6: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioSetDeviceInterfacePropertyData(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioSetDeviceInterfacePropertyData(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioSetDeviceInterfaceState(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioSetDeviceInterfaceState(p0: String, p1: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioSetDevicePropertyData(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioSetDevicePropertyData(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioSetFileObjectIgnoreSharing(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioSetFileObjectIgnoreSharing(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioSetFileOrigin(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioSetFileOrigin(p0: String, p1: Boolean): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioSetFsZeroingOffset(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioSetFsZeroingOffset(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioSetFsZeroingOffsetRequired(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioSetFsZeroingOffsetRequired(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioSetHardErrorOrVerifyDevice(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioSetHardErrorOrVerifyDevice(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioSetIoAttributionIrp(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioSetIoAttributionIrp(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioSetIoPriorityHint(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioSetIoPriorityHint(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioSetIrpExtraCreateParameter(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioSetIrpExtraCreateParameter(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioSetLinkShareAccess(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioSetLinkShareAccess(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioSetMasterIrpStatus(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioSetMasterIrpStatus(p0: String, p1: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioSetPartitionInformation(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioSetPartitionInformation(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioSetPartitionInformationEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioSetPartitionInformationEx(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioSetShareAccess(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioSetShareAccess(p0: Int, p1: Int, p2: String, p3: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioSetShareAccessEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioSetShareAccessEx(p0: Int, p1: Int, p2: String, p3: String, p4: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioSetStartIoAttributes(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioSetStartIoAttributes(p0: String, p1: Boolean, p2: Boolean)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioSetSystemPartition(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioSetSystemPartition(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioSetThreadHardErrorMode(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioSetThreadHardErrorMode(p0: Boolean): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioSetTopLevelIrp(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioSetTopLevelIrp(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioSizeOfIrpEx(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioSizeOfIrpEx(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioSizeofWorkItem()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioSizeofWorkItem(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioStartNextPacket(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioStartNextPacket(p0: String, p1: Boolean)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioStartNextPacketByKey(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioStartNextPacketByKey(p0: String, p1: Boolean, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioStartTimer(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioStartTimer(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioStopTimer(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioStopTimer(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioSynchronousCallDriver(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioSynchronousCallDriver(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioTransferActivityId(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioTransferActivityId(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioTranslateBusAddress(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioTranslateBusAddress(p0: Int, p1: Int, p2: String, p3: String, p4: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioTryQueueWorkItem(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioTryQueueWorkItem(p0: String, p1: String, p2: Int, p3: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioUninitializeWorkItem(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioUninitializeWorkItem(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioUnregisterBootDriverCallback(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioUnregisterBootDriverCallback(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioUnregisterContainerNotification(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioUnregisterContainerNotification(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioUnregisterPlugPlayNotification(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioUnregisterPlugPlayNotification(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioUnregisterPlugPlayNotificationEx(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioUnregisterPlugPlayNotificationEx(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioUnregisterShutdownNotification(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioUnregisterShutdownNotification(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioUpdateLinkShareAccess(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioUpdateLinkShareAccess(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioUpdateLinkShareAccessEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioUpdateLinkShareAccessEx(p0: String, p1: String, p2: String, p3: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioUpdateShareAccess(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioUpdateShareAccess(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioValidateDeviceIoControlAccess(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioValidateDeviceIoControlAccess(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioVerifyPartitionTable(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioVerifyPartitionTable(p0: String, p1: Boolean): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioVolumeDeviceNameToGuid(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioVolumeDeviceNameToGuid(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioVolumeDeviceNameToGuidPath(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioVolumeDeviceNameToGuidPath(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioVolumeDeviceToDosName(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioVolumeDeviceToDosName(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioVolumeDeviceToGuid(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioVolumeDeviceToGuid(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioVolumeDeviceToGuidPath(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioVolumeDeviceToGuidPath(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioWMIAllocateInstanceIds(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioWMIAllocateInstanceIds(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioWMIDeviceObjectToInstanceName(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioWMIDeviceObjectToInstanceName(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioWMIExecuteMethod(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioWMIExecuteMethod(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioWMIHandleToInstanceName(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioWMIHandleToInstanceName(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioWMIOpenBlock(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioWMIOpenBlock(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioWMIQueryAllData(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioWMIQueryAllData(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioWMIQueryAllDataMultiple(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioWMIQueryAllDataMultiple(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioWMIQuerySingleInstance(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioWMIQuerySingleInstance(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioWMIQuerySingleInstanceMultiple(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioWMIQuerySingleInstanceMultiple(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioWMIRegistrationControl(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioWMIRegistrationControl(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioWMISetNotificationCallback(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioWMISetNotificationCallback(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioWMISetSingleInstance(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioWMISetSingleInstance(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioWMISetSingleItem(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioWMISetSingleItem(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioWMISuggestInstanceName(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioWMISuggestInstanceName(p0: String, p1: String, p2: Boolean, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioWMIWriteEvent(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioWMIWriteEvent(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioWithinStackLimits(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioWithinStackLimits(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioWriteErrorLogEntry(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioWriteErrorLogEntry(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioWriteKsrPersistentMemory(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioWriteKsrPersistentMemory(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioWritePartitionTable(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioWritePartitionTable(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ioWritePartitionTableEx(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ioWritePartitionTableEx(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_iofCallDriver(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_iofCallDriver(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_iofCompleteRequest(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_iofCompleteRequest(p0: String, p1: Int)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_kdChangeOption(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_kdChangeOption(p0: Int, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_kdDisableDebugger()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_kdDisableDebugger(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_kdEnableDebugger()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_kdEnableDebugger(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_kdRefreshDebuggerNotPresent()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_kdRefreshDebuggerNotPresent(): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keAcquireGuardedMutex(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keAcquireGuardedMutex(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keAcquireGuardedMutexUnsafe(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keAcquireGuardedMutexUnsafe(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keAcquireInStackQueuedSpinLock(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keAcquireInStackQueuedSpinLock(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keAcquireInStackQueuedSpinLockAtDpcLevel(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keAcquireInStackQueuedSpinLockAtDpcLevel(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keAcquireInStackQueuedSpinLockForDpc(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keAcquireInStackQueuedSpinLockForDpc(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keAcquireInterruptSpinLock(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keAcquireInterruptSpinLock(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keAcquireSpinLockForDpc(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keAcquireSpinLockForDpc(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keAddTriageDumpDataBlock(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keAddTriageDumpDataBlock(p0: String, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keAreAllApcsDisabled()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keAreAllApcsDisabled(): Boolean

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keAreApcsDisabled()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keAreApcsDisabled(): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keBugCheck(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keBugCheck(p0: Int)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keBugCheckEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keBugCheckEx(p0: Int, p1: String, p2: String, p3: String, p4: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keCancelTimer(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keCancelTimer(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keClearEvent(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keClearEvent(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keConvertAuxiliaryCounterToPerformanceCounter(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keConvertAuxiliaryCounterToPerformanceCounter(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keConvertPerformanceCounterToAuxiliaryCounter(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keConvertPerformanceCounterToAuxiliaryCounter(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keDelayExecutionThread(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keDelayExecutionThread(p0: Int, p1: Boolean, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keDeregisterBoundCallback(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keDeregisterBoundCallback(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keDeregisterBugCheckCallback(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keDeregisterBugCheckCallback(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keDeregisterBugCheckReasonCallback(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keDeregisterBugCheckReasonCallback(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keDeregisterNmiCallback(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keDeregisterNmiCallback(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keDeregisterProcessorChangeCallback(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keDeregisterProcessorChangeCallback(p0: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keEnterCriticalRegion()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keEnterCriticalRegion()

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keEnterGuardedRegion()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keEnterGuardedRegion()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keExpandKernelStackAndCallout(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keExpandKernelStackAndCallout(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keExpandKernelStackAndCalloutEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keExpandKernelStackAndCalloutEx(p0: String, p1: String, p2: String, p3: Boolean, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keFlushIoBuffers(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keFlushIoBuffers(p0: String, p1: Boolean, p2: Boolean)

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keFlushQueuedDpcs()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keFlushQueuedDpcs()

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keFlushWriteBuffer()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keFlushWriteBuffer()

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keGetCurrentIrql()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keGetCurrentIrql(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keGetCurrentNodeNumber()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keGetCurrentNodeNumber(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keGetCurrentProcessorNumberEx(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keGetCurrentProcessorNumberEx(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keGetProcessorIndexFromNumber(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keGetProcessorIndexFromNumber(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keGetProcessorNumberFromIndex(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keGetProcessorNumberFromIndex(p0: Int, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keGetRecommendedSharedDataAlignment()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keGetRecommendedSharedDataAlignment(): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keInitializeCrashDumpHeader(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keInitializeCrashDumpHeader(p0: Int, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keInitializeDeviceQueue(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keInitializeDeviceQueue(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keInitializeDpc(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keInitializeDpc(p0: String, p1: String, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keInitializeEvent(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keInitializeEvent(p0: String, p1: Int, p2: Boolean)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keInitializeGuardedMutex(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keInitializeGuardedMutex(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keInitializeMutex(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keInitializeMutex(p0: String, p1: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keInitializeSemaphore(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keInitializeSemaphore(p0: String, p1: Int, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keInitializeSpinLock(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keInitializeSpinLock(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keInitializeThreadedDpc(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keInitializeThreadedDpc(p0: String, p1: String, p2: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keInitializeTimer(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keInitializeTimer(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keInitializeTimerEx(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keInitializeTimerEx(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keInitializeTriageDumpDataArray(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keInitializeTriageDumpDataArray(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keInsertByKeyDeviceQueue(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keInsertByKeyDeviceQueue(p0: String, p1: String, p2: Int): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keInsertDeviceQueue(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keInsertDeviceQueue(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keInsertQueueDpc(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keInsertQueueDpc(p0: String, p1: String, p2: String): Boolean

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keInvalidateAllCaches()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keInvalidateAllCaches(): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keInvalidateRangeAllCaches(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keInvalidateRangeAllCaches(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keIpiGenericCall(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keIpiGenericCall(p0: String, p1: String): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keIsExecutingDpc()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keIsExecutingDpc(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keLeaveCriticalRegion()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keLeaveCriticalRegion()

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keLeaveGuardedRegion()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keLeaveGuardedRegion()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_kePulseEvent(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_kePulseEvent(p0: String, p1: Int, p2: Boolean): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keQueryActiveGroupCount()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keQueryActiveGroupCount(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keQueryActiveProcessorCount(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keQueryActiveProcessorCount(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keQueryActiveProcessorCountEx(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keQueryActiveProcessorCountEx(p0: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keQueryActiveProcessors()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keQueryActiveProcessors(): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keQueryAuxiliaryCounterFrequency(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keQueryAuxiliaryCounterFrequency(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keQueryDpcWatchdogInformation(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keQueryDpcWatchdogInformation(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keQueryGroupAffinity(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keQueryGroupAffinity(p0: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keQueryHardwareCounterConfiguration(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keQueryHardwareCounterConfiguration(p0: String, p1: Int, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keQueryHighestNodeNumber()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keQueryHighestNodeNumber(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keQueryInterruptTimePrecise(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keQueryInterruptTimePrecise(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keQueryLogicalProcessorRelationship(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keQueryLogicalProcessorRelationship(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keQueryMaximumGroupCount()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keQueryMaximumGroupCount(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keQueryMaximumProcessorCount()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keQueryMaximumProcessorCount(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keQueryMaximumProcessorCountEx(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keQueryMaximumProcessorCountEx(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keQueryNodeActiveAffinity(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keQueryNodeActiveAffinity(p0: Int, p1: String, p2: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keQueryNodeActiveAffinity2(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keQueryNodeActiveAffinity2(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keQueryNodeActiveProcessorCount(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keQueryNodeActiveProcessorCount(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keQueryNodeMaximumProcessorCount(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keQueryNodeMaximumProcessorCount(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keQueryPerformanceCounter(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keQueryPerformanceCounter(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keQueryPriorityThread(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keQueryPriorityThread(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keQueryRuntimeThread(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keQueryRuntimeThread(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keQuerySystemTimePrecise(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keQuerySystemTimePrecise(p0: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keQueryTimeIncrement()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keQueryTimeIncrement(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keQueryTotalCycleTimeThread(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keQueryTotalCycleTimeThread(p0: String, p1: String): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keQueryUnbiasedInterruptTime()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keQueryUnbiasedInterruptTime(): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keQueryUnbiasedInterruptTimePrecise(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keQueryUnbiasedInterruptTimePrecise(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keReadStateEvent(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keReadStateEvent(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keReadStateMutex(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keReadStateMutex(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keReadStateSemaphore(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keReadStateSemaphore(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keReadStateTimer(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keReadStateTimer(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keRegisterBoundCallback(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keRegisterBoundCallback(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keRegisterBugCheckCallback(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keRegisterBugCheckCallback(p0: String, p1: String, p2: String, p3: Int, p4: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keRegisterBugCheckReasonCallback(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keRegisterBugCheckReasonCallback(p0: String, p1: String, p2: Int, p3: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keRegisterNmiCallback(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keRegisterNmiCallback(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keRegisterProcessorChangeCallback(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keRegisterProcessorChangeCallback(p0: String, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keReleaseGuardedMutex(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keReleaseGuardedMutex(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keReleaseGuardedMutexUnsafe(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keReleaseGuardedMutexUnsafe(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keReleaseInStackQueuedSpinLock(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keReleaseInStackQueuedSpinLock(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keReleaseInStackQueuedSpinLockForDpc(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keReleaseInStackQueuedSpinLockForDpc(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keReleaseInStackQueuedSpinLockFromDpcLevel(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keReleaseInStackQueuedSpinLockFromDpcLevel(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keReleaseInterruptSpinLock(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keReleaseInterruptSpinLock(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keReleaseMutex(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keReleaseMutex(p0: String, p1: Boolean): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keReleaseSemaphore(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keReleaseSemaphore(p0: String, p1: Int, p2: Int, p3: Boolean): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keReleaseSpinLockForDpc(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keReleaseSpinLockForDpc(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keRemoveByKeyDeviceQueue(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keRemoveByKeyDeviceQueue(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keRemoveByKeyDeviceQueueIfBusy(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keRemoveByKeyDeviceQueueIfBusy(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keRemoveDeviceQueue(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keRemoveDeviceQueue(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keRemoveEntryDeviceQueue(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keRemoveEntryDeviceQueue(p0: String, p1: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keRemoveQueueDpc(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keRemoveQueueDpc(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keRemoveQueueDpcEx(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keRemoveQueueDpcEx(p0: String, p1: Boolean): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keResetEvent(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keResetEvent(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keRestoreExtendedProcessorState(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keRestoreExtendedProcessorState(p0: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keRevertToUserAffinityThread()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keRevertToUserAffinityThread()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keRevertToUserAffinityThreadEx(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keRevertToUserAffinityThreadEx(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keRevertToUserGroupAffinityThread(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keRevertToUserGroupAffinityThread(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keSaveExtendedProcessorState(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keSaveExtendedProcessorState(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keSetBasePriorityThread(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keSetBasePriorityThread(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keSetCoalescableTimer(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keSetCoalescableTimer(p0: String, p1: String, p2: Int, p3: Int, p4: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keSetEvent(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keSetEvent(p0: String, p1: Int, p2: Boolean): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keSetHardwareCounterConfiguration(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keSetHardwareCounterConfiguration(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keSetImportanceDpc(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keSetImportanceDpc(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keSetPriorityThread(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keSetPriorityThread(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keSetSystemAffinityThread(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keSetSystemAffinityThread(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keSetSystemAffinityThreadEx(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keSetSystemAffinityThreadEx(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keSetSystemGroupAffinityThread(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keSetSystemGroupAffinityThread(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keSetTargetProcessorDpc(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keSetTargetProcessorDpc(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keSetTargetProcessorDpcEx(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keSetTargetProcessorDpcEx(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keSetTimer(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keSetTimer(p0: String, p1: String, p2: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keSetTimerEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keSetTimerEx(p0: String, p1: String, p2: Int, p3: String): Boolean

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keShouldYieldProcessor()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keShouldYieldProcessor(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keStallExecutionProcessor(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keStallExecutionProcessor(p0: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keSynchronizeExecution(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keSynchronizeExecution(p0: String, p1: String, p2: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keTestSpinLock(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keTestSpinLock(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keTryToAcquireGuardedMutex(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keTryToAcquireGuardedMutex(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keTryToAcquireSpinLockAtDpcLevel(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keTryToAcquireSpinLockAtDpcLevel(p0: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keWaitForMultipleObjects(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keWaitForMultipleObjects(p0: Int, p1: String, p2: Int, p3: Int, p4: Int, p5: Boolean, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_keWaitForSingleObject(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_keWaitForSingleObject(p0: String, p1: Int, p2: Int, p3: Boolean, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_kfRaiseIrql(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_kfRaiseIrql(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmAddPhysicalMemory(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmAddPhysicalMemory(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmAddVerifierSpecialThunks(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmAddVerifierSpecialThunks(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmAddVerifierThunks(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmAddVerifierThunks(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmAdvanceMdl(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmAdvanceMdl(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmAllocateContiguousMemory(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmAllocateContiguousMemory(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmAllocateContiguousMemoryEx(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmAllocateContiguousMemoryEx(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: String, p7: Int, p8: Int, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmAllocateContiguousMemorySpecifyCache(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmAllocateContiguousMemorySpecifyCache(p0: String, p1: String, p2: String, p3: String, p4: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmAllocateContiguousMemorySpecifyCacheNode(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmAllocateContiguousMemorySpecifyCacheNode(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmAllocateContiguousNodeMemory(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmAllocateContiguousNodeMemory(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmAllocateMappingAddress(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmAllocateMappingAddress(p0: String, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmAllocateMappingAddressEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmAllocateMappingAddressEx(p0: String, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmAllocateMdlForIoSpace(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmAllocateMdlForIoSpace(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmAllocateNodePagesForMdlEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmAllocateNodePagesForMdlEx(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmAllocateNonCachedMemory(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmAllocateNonCachedMemory(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmAllocatePagesForMdl(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmAllocatePagesForMdl(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmAllocatePagesForMdlEx(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmAllocatePagesForMdlEx(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmAllocatePartitionNodePagesForMdlEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmAllocatePartitionNodePagesForMdlEx(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: Int, p7: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmAreMdlPagesCached(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmAreMdlPagesCached(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmBuildMdlForNonPagedPool(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmBuildMdlForNonPagedPool(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmCreateMdl(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmCreateMdl(p0: String, p1: String, p2: String): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmCreateMirror()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmCreateMirror(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmFreeContiguousMemory(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmFreeContiguousMemory(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmFreeContiguousMemorySpecifyCache(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmFreeContiguousMemorySpecifyCache(p0: String, p1: String, p2: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmFreeMappingAddress(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmFreeMappingAddress(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmFreeNonCachedMemory(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmFreeNonCachedMemory(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmFreePagesFromMdl(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmFreePagesFromMdl(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmFreePagesFromMdlEx(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmFreePagesFromMdlEx(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmGetCacheAttribute(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmGetCacheAttribute(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmGetCacheAttributeEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmGetCacheAttributeEx(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmGetPhysicalAddress(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmGetPhysicalAddress(p0: String): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmGetPhysicalMemoryRanges()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmGetPhysicalMemoryRanges(): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmGetPhysicalMemoryRangesEx(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmGetPhysicalMemoryRangesEx(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmGetPhysicalMemoryRangesEx2(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmGetPhysicalMemoryRangesEx2(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmGetSystemRoutineAddress(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmGetSystemRoutineAddress(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmGetVirtualForPhysical(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmGetVirtualForPhysical(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmIsAddressValid(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmIsAddressValid(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmIsDriverSuspectForVerifier(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmIsDriverSuspectForVerifier(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmIsDriverVerifying(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmIsDriverVerifying(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmIsDriverVerifyingByAddress(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmIsDriverVerifyingByAddress(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmIsIoSpaceActive(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmIsIoSpaceActive(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmIsNonPagedSystemAddressValid(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmIsNonPagedSystemAddressValid(p0: String): Boolean

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmIsThisAnNtAsSystem()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmIsThisAnNtAsSystem(): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmIsVerifierEnabled(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmIsVerifierEnabled(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmLockPagableDataSection(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmLockPagableDataSection(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmLockPagableSectionByHandle(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmLockPagableSectionByHandle(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmMapIoSpace(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmMapIoSpace(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmMapIoSpaceEx(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmMapIoSpaceEx(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmMapLockedPages(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmMapLockedPages(p0: String, p1: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmMapLockedPagesSpecifyCache(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmMapLockedPagesSpecifyCache(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmMapLockedPagesWithReservedMapping(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmMapLockedPagesWithReservedMapping(p0: String, p1: Int, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmMapMdl(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmMapMdl(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmMapMemoryDumpMdlEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmMapMemoryDumpMdlEx(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmMapUserAddressesToPage(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmMapUserAddressesToPage(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmMapVideoDisplay(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmMapVideoDisplay(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmMapViewInSessionSpace(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmMapViewInSessionSpace(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmMapViewInSessionSpaceEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmMapViewInSessionSpaceEx(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmMapViewInSystemSpace(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmMapViewInSystemSpace(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmMapViewInSystemSpaceEx(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmMapViewInSystemSpaceEx(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmMdlPageContentsState(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmMdlPageContentsState(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmPageEntireDriver(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmPageEntireDriver(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmProbeAndLockPages(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmProbeAndLockPages(p0: String, p1: Int, p2: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmProbeAndLockProcessPages(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmProbeAndLockProcessPages(p0: String, p1: String, p2: Int, p3: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmProbeAndLockSelectedPages(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmProbeAndLockSelectedPages(p0: String, p1: String, p2: Int, p3: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmProtectDriverSection(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmProtectDriverSection(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmProtectMdlSystemAddress(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmProtectMdlSystemAddress(p0: String, p1: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmQuerySystemSize()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmQuerySystemSize(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmRemovePhysicalMemory(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmRemovePhysicalMemory(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmResetDriverPaging(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmResetDriverPaging(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmRotatePhysicalView(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmRotatePhysicalView(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmSecureVirtualMemory(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmSecureVirtualMemory(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmSecureVirtualMemoryEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmSecureVirtualMemoryEx(p0: String, p1: String, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmSetPermanentCacheAttribute(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmSetPermanentCacheAttribute(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmSizeOfMdl(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmSizeOfMdl(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmUnlockPagableImageSection(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmUnlockPagableImageSection(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmUnlockPages(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmUnlockPages(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmUnmapIoSpace(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmUnmapIoSpace(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmUnmapLockedPages(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmUnmapLockedPages(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmUnmapReservedMapping(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmUnmapReservedMapping(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmUnmapVideoDisplay(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmUnmapVideoDisplay(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmUnmapViewInSessionSpace(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmUnmapViewInSessionSpace(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmUnmapViewInSystemSpace(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmUnmapViewInSystemSpace(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_mmUnsecureVirtualMemory(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_mmUnsecureVirtualMemory(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntAllocateLocallyUniqueId(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntAllocateLocallyUniqueId(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntCommitComplete(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntCommitComplete(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntCommitEnlistment(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntCommitEnlistment(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntCommitTransaction(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntCommitTransaction(p0: String, p1: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntCreateEnlistment(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntCreateEnlistment(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntCreateResourceManager(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntCreateResourceManager(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntCreateTransaction(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntCreateTransaction(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: Int, p7: Int, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntCreateTransactionManager(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntCreateTransactionManager(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntDisplayString(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntDisplayString(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntEnumerateTransactionObject(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntEnumerateTransactionObject(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntGetNotificationResourceManager(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntGetNotificationResourceManager(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntLoadDriver(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntLoadDriver(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntMakeTemporaryObject(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntMakeTemporaryObject(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntManagePartition(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntManagePartition(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntOpenEnlistment(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntOpenEnlistment(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntOpenResourceManager(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntOpenResourceManager(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntOpenTransaction(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntOpenTransaction(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntOpenTransactionManager(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntOpenTransactionManager(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntPowerInformation(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntPowerInformation(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntPrePrepareComplete(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntPrePrepareComplete(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntPrePrepareEnlistment(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntPrePrepareEnlistment(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntPrepareComplete(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntPrepareComplete(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntPrepareEnlistment(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntPrepareEnlistment(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntPropagationComplete(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntPropagationComplete(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntPropagationFailed(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntPropagationFailed(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntQueryInformationEnlistment(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntQueryInformationEnlistment(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntQueryInformationResourceManager(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntQueryInformationResourceManager(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntQueryInformationTransaction(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntQueryInformationTransaction(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntQueryInformationTransactionManager(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntQueryInformationTransactionManager(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntReadOnlyEnlistment(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntReadOnlyEnlistment(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntRecoverEnlistment(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntRecoverEnlistment(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntRecoverResourceManager(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntRecoverResourceManager(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntRecoverTransactionManager(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntRecoverTransactionManager(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntRegisterProtocolAddressInformation(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntRegisterProtocolAddressInformation(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntRenameTransactionManager(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntRenameTransactionManager(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntRollbackComplete(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntRollbackComplete(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntRollbackEnlistment(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntRollbackEnlistment(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntRollbackTransaction(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntRollbackTransaction(p0: String, p1: Boolean): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntRollforwardTransactionManager(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntRollforwardTransactionManager(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntSetInformationEnlistment(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntSetInformationEnlistment(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntSetInformationResourceManager(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntSetInformationResourceManager(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntSetInformationTransaction(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntSetInformationTransaction(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntSetInformationTransactionManager(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntSetInformationTransactionManager(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntSinglePhaseReject(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntSinglePhaseReject(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_ntUnloadDriver(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_ntUnloadDriver(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_obCloseHandle(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_obCloseHandle(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_obDereferenceObjectDeferDelete(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_obDereferenceObjectDeferDelete(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_obDereferenceObjectDeferDeleteWithTag(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_obDereferenceObjectDeferDeleteWithTag(p0: String, p1: Int)

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_obGetFilterVersion()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_obGetFilterVersion(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_obGetObjectSecurity(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_obGetObjectSecurity(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_obReferenceObjectByHandle(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_obReferenceObjectByHandle(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_obReferenceObjectByHandleWithTag(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_obReferenceObjectByHandleWithTag(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_obReferenceObjectByPointer(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_obReferenceObjectByPointer(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_obReferenceObjectByPointerWithTag(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_obReferenceObjectByPointerWithTag(p0: String, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_obReferenceObjectSafe(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_obReferenceObjectSafe(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_obReferenceObjectSafeWithTag(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_obReferenceObjectSafeWithTag(p0: String, p1: Int): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_obRegisterCallbacks(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_obRegisterCallbacks(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_obReleaseObjectSecurity(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_obReleaseObjectSecurity(p0: String, p1: Boolean)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_obUnRegisterCallbacks(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_obUnRegisterCallbacks(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_obfDereferenceObject(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_obfDereferenceObject(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_obfDereferenceObjectWithTag(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_obfDereferenceObjectWithTag(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_obfReferenceObject(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_obfReferenceObject(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_obfReferenceObjectWithTag(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_obfReferenceObjectWithTag(p0: String, p1: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_pcwAddInstance(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_pcwAddInstance(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_pcwCloseInstance(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_pcwCloseInstance(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_pcwCreateInstance(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_pcwCreateInstance(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_pcwRegister(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_pcwRegister(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_pcwUnregister(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_pcwUnregister(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poCallDriver(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poCallDriver(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poClearPowerRequest(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poClearPowerRequest(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poCreatePowerRequest(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poCreatePowerRequest(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poCreateThermalRequest(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poCreateThermalRequest(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poDeletePowerRequest(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poDeletePowerRequest(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poDeleteThermalRequest(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poDeleteThermalRequest(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poEndDeviceBusy(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poEndDeviceBusy(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poFxActivateComponent(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poFxActivateComponent(p0: String, p1: Int, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poFxCompleteDevicePowerNotRequired(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poFxCompleteDevicePowerNotRequired(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poFxCompleteDirectedPowerDown(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poFxCompleteDirectedPowerDown(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poFxCompleteIdleCondition(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poFxCompleteIdleCondition(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poFxCompleteIdleState(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poFxCompleteIdleState(p0: String, p1: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poFxIdleComponent(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poFxIdleComponent(p0: String, p1: Int, p2: Int)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poFxIssueComponentPerfStateChange(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poFxIssueComponentPerfStateChange(p0: String, p1: Int, p2: Int, p3: String, p4: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poFxIssueComponentPerfStateChangeMultiple(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poFxIssueComponentPerfStateChangeMultiple(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poFxNotifySurprisePowerOn(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poFxNotifySurprisePowerOn(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poFxPowerControl(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poFxPowerControl(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poFxPowerOnCrashdumpDevice(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poFxPowerOnCrashdumpDevice(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poFxQueryCurrentComponentPerfState(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poFxQueryCurrentComponentPerfState(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poFxRegisterComponentPerfStates(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poFxRegisterComponentPerfStates(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poFxRegisterCrashdumpDevice(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poFxRegisterCrashdumpDevice(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poFxRegisterDevice(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poFxRegisterDevice(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poFxRegisterDripsWatchdogCallback(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poFxRegisterDripsWatchdogCallback(p0: String, p1: String, p2: Boolean, p3: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poFxReportDevicePoweredOn(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poFxReportDevicePoweredOn(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poFxSetComponentLatency(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poFxSetComponentLatency(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poFxSetComponentResidency(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poFxSetComponentResidency(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poFxSetComponentWake(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poFxSetComponentWake(p0: String, p1: Int, p2: Boolean)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poFxSetDeviceIdleTimeout(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poFxSetDeviceIdleTimeout(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poFxSetTargetDripsDevicePowerState(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poFxSetTargetDripsDevicePowerState(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poFxStartDevicePowerManagement(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poFxStartDevicePowerManagement(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poFxUnregisterDevice(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poFxUnregisterDevice(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poGetSystemWake(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poGetSystemWake(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poGetThermalRequestSupport(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poGetThermalRequestSupport(p0: String, p1: Int): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poQueryWatchdogTime(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poQueryWatchdogTime(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poRegisterDeviceForIdleDetection(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poRegisterDeviceForIdleDetection(p0: String, p1: Int, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poRegisterPowerSettingCallback(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poRegisterPowerSettingCallback(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poRegisterSystemState(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poRegisterSystemState(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poSetDeviceBusyEx(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poSetDeviceBusyEx(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poSetHiberRange(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poSetHiberRange(p0: String, p1: Int, p2: String, p3: String, p4: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poSetPowerRequest(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poSetPowerRequest(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poSetSystemState(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poSetSystemState(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poSetSystemWake(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poSetSystemWake(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poSetSystemWakeDevice(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poSetSystemWakeDevice(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poSetThermalActiveCooling(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poSetThermalActiveCooling(p0: String, p1: Boolean): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poSetThermalPassiveCooling(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poSetThermalPassiveCooling(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poStartDeviceBusy(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poStartDeviceBusy(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poStartNextPowerIrp(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poStartNextPowerIrp(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poUnregisterPowerSettingCallback(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poUnregisterPowerSettingCallback(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_poUnregisterSystemState(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_poUnregisterSystemState(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_probeForRead(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_probeForRead(p0: String, p1: String, p2: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_probeForWrite(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_probeForWrite(p0: String, p1: String, p2: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psAcquireSiloHardReference(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psAcquireSiloHardReference(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psAllocSiloContextSlot(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psAllocSiloContextSlot(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psAllocateAffinityToken(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psAllocateAffinityToken(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psAttachSiloToCurrentThread(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psAttachSiloToCurrentThread(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psCreateSiloContext(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psCreateSiloContext(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psCreateSystemThread(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psCreateSystemThread(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psDereferenceSiloContext(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psDereferenceSiloContext(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psDetachSiloFromCurrentThread(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psDetachSiloFromCurrentThread(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psFreeAffinityToken(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psFreeAffinityToken(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psFreeSiloContextSlot(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psFreeSiloContextSlot(p0: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psGetCurrentProcessId()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psGetCurrentProcessId(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psGetCurrentServerSilo()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psGetCurrentServerSilo(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psGetCurrentServerSiloName()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psGetCurrentServerSiloName(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psGetCurrentSilo()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psGetCurrentSilo(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psGetCurrentThreadId()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psGetCurrentThreadId(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psGetCurrentThreadTeb()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psGetCurrentThreadTeb(): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psGetEffectiveServerSilo(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psGetEffectiveServerSilo(p0: String): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psGetHostSilo()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psGetHostSilo(): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psGetJobServerSilo(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psGetJobServerSilo(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psGetJobSilo(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psGetJobSilo(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psGetParentSilo(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psGetParentSilo(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psGetPermanentSiloContext(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psGetPermanentSiloContext(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psGetProcessCreateTimeQuadPart(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psGetProcessCreateTimeQuadPart(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psGetProcessExitStatus(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psGetProcessExitStatus(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psGetProcessId(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psGetProcessId(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psGetProcessStartKey(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psGetProcessStartKey(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psGetServerSiloServiceSessionId(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psGetServerSiloServiceSessionId(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psGetSiloContainerId(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psGetSiloContainerId(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psGetSiloContext(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psGetSiloContext(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psGetSiloMonitorContextSlot(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psGetSiloMonitorContextSlot(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psGetThreadCreateTime(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psGetThreadCreateTime(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psGetThreadExitStatus(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psGetThreadExitStatus(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psGetThreadId(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psGetThreadId(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psGetThreadProcessId(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psGetThreadProcessId(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psGetThreadProperty(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psGetThreadProperty(p0: String, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psGetThreadServerSilo(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psGetThreadServerSilo(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psGetVersion(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psGetVersion(p0: String, p1: String, p2: String, p3: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psInsertPermanentSiloContext(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psInsertPermanentSiloContext(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psInsertSiloContext(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psInsertSiloContext(p0: String, p1: Int, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psIsCurrentThreadInServerSilo()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psIsCurrentThreadInServerSilo(): Boolean

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psIsCurrentThreadPrefetching()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psIsCurrentThreadPrefetching(): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psIsHostSilo(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psIsHostSilo(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psMakeSiloContextPermanent(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psMakeSiloContextPermanent(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psQueryTotalCycleTimeProcess(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psQueryTotalCycleTimeProcess(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psReferenceSiloContext(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psReferenceSiloContext(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psRegisterSiloMonitor(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psRegisterSiloMonitor(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psReleaseSiloHardReference(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psReleaseSiloHardReference(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psRemoveCreateThreadNotifyRoutine(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psRemoveCreateThreadNotifyRoutine(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psRemoveLoadImageNotifyRoutine(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psRemoveLoadImageNotifyRoutine(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psRemoveSiloContext(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psRemoveSiloContext(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psReplaceSiloContext(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psReplaceSiloContext(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psRevertToUserMultipleGroupAffinityThread(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psRevertToUserMultipleGroupAffinityThread(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psSetCreateProcessNotifyRoutine(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psSetCreateProcessNotifyRoutine(p0: String, p1: Boolean): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psSetCreateProcessNotifyRoutineEx(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psSetCreateProcessNotifyRoutineEx(p0: String, p1: Boolean): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psSetCreateProcessNotifyRoutineEx2(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psSetCreateProcessNotifyRoutineEx2(p0: Int, p1: String, p2: Boolean): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psSetCreateThreadNotifyRoutine(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psSetCreateThreadNotifyRoutine(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psSetCreateThreadNotifyRoutineEx(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psSetCreateThreadNotifyRoutineEx(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psSetCurrentThreadPrefetching(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psSetCurrentThreadPrefetching(p0: Boolean): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psSetLoadImageNotifyRoutine(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psSetLoadImageNotifyRoutine(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psSetLoadImageNotifyRoutineEx(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psSetLoadImageNotifyRoutineEx(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psSetSystemMultipleGroupAffinityThread(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psSetSystemMultipleGroupAffinityThread(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psStartSiloMonitor(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psStartSiloMonitor(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psTerminateServerSilo(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psTerminateServerSilo(p0: String, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psTerminateSystemThread(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psTerminateSystemThread(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psUnregisterSiloMonitor(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psUnregisterSiloMonitor(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_psWrapApcWow64Thread(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_psWrapApcWow64Thread(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_pshedAllocateMemory(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_pshedAllocateMemory(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_pshedFreeMemory(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_pshedFreeMemory(p0: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_pshedIsSystemWheaEnabled()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_pshedIsSystemWheaEnabled(): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_pshedRegisterPlugin(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_pshedRegisterPlugin(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_pshedSynchronizeExecution(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_pshedSynchronizeExecution(p0: String, p1: String, p2: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_pshedUnregisterPlugin(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_pshedUnregisterPlugin(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlAppendUnicodeStringToString(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlAppendUnicodeStringToString(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlAppendUnicodeToString(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlAppendUnicodeToString(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlAreBitsClear(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlAreBitsClear(p0: String, p1: Int, p2: Int): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlAreBitsSet(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlAreBitsSet(p0: String, p1: Int, p2: Int): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlAssert(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlAssert(p0: String, p1: String, p2: Int, p3: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlCheckRegistryKey(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlCheckRegistryKey(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlClearAllBits(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlClearAllBits(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlClearBit(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlClearBit(p0: String, p1: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlClearBits(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlClearBits(p0: String, p1: Int, p2: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlCmDecodeMemIoResource(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlCmDecodeMemIoResource(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlCmEncodeMemIoResource(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlCmEncodeMemIoResource(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlCompareString(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlCompareString(p0: String, p1: String, p2: Boolean): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlCompareUnicodeString(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlCompareUnicodeString(p0: String, p1: String, p2: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlCompareUnicodeStrings(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlCompareUnicodeStrings(p0: String, p1: String, p2: String, p3: String, p4: Boolean): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlContractHashTable(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlContractHashTable(p0: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlCopyBitMap(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlCopyBitMap(p0: String, p1: String, p2: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlCopyString(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlCopyString(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlCopyUnicodeString(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlCopyUnicodeString(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlCreateHashTable(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlCreateHashTable(p0: String, p1: Int, p2: Int): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlCreateHashTableEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlCreateHashTableEx(p0: String, p1: Int, p2: Int, p3: Int): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlCreateRegistryKey(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlCreateRegistryKey(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlCreateSecurityDescriptor(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlCreateSecurityDescriptor(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlDelete(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlDelete(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlDeleteElementGenericTable(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlDeleteElementGenericTable(p0: String, p1: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlDeleteElementGenericTableAvl(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlDeleteElementGenericTableAvl(p0: String, p1: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlDeleteElementGenericTableAvlEx(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlDeleteElementGenericTableAvlEx(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlDeleteHashTable(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlDeleteHashTable(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlDeleteNoSplay(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlDeleteNoSplay(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlDeleteRegistryValue(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlDeleteRegistryValue(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlDowncaseUnicodeChar(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlDowncaseUnicodeChar(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlEndEnumerationHashTable(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlEndEnumerationHashTable(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlEndStrongEnumerationHashTable(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlEndStrongEnumerationHashTable(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlEndWeakEnumerationHashTable(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlEndWeakEnumerationHashTable(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlEnumerateEntryHashTable(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlEnumerateEntryHashTable(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlEnumerateGenericTable(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlEnumerateGenericTable(p0: String, p1: Boolean): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlEnumerateGenericTableAvl(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlEnumerateGenericTableAvl(p0: String, p1: Boolean): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlEnumerateGenericTableLikeADirectory(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlEnumerateGenericTableLikeADirectory(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlEnumerateGenericTableWithoutSplaying(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlEnumerateGenericTableWithoutSplaying(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlEnumerateGenericTableWithoutSplayingAvl(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlEnumerateGenericTableWithoutSplayingAvl(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlEqualString(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlEqualString(p0: String, p1: String, p2: Boolean): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlEqualUnicodeString(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlEqualUnicodeString(p0: String, p1: String, p2: Boolean): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlExpandHashTable(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlExpandHashTable(p0: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlExtractBitMap(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlExtractBitMap(p0: String, p1: String, p2: Int, p3: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlFindClearBits(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlFindClearBits(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlFindClearBitsAndSet(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlFindClearBitsAndSet(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlFindClearRuns(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlFindClearRuns(p0: String, p1: String, p2: Int, p3: Boolean): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlFindClosestEncodableLength(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlFindClosestEncodableLength(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlFindFirstRunClear(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlFindFirstRunClear(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlFindLastBackwardRunClear(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlFindLastBackwardRunClear(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlFindLeastSignificantBit(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlFindLeastSignificantBit(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlFindLongestRunClear(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlFindLongestRunClear(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlFindMostSignificantBit(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlFindMostSignificantBit(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlFindNextForwardRunClear(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlFindNextForwardRunClear(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlFindSetBits(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlFindSetBits(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlFindSetBitsAndClear(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlFindSetBitsAndClear(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlFreeUTF8String(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlFreeUTF8String(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlGUIDFromString(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlGUIDFromString(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlGenerateClass5Guid(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlGenerateClass5Guid(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlGetActiveConsoleId()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlGetActiveConsoleId(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlGetCallersAddress(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlGetCallersAddress(p0: String, p1: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlGetConsoleSessionForegroundProcessId()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlGetConsoleSessionForegroundProcessId(): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlGetElementGenericTable(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlGetElementGenericTable(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlGetElementGenericTableAvl(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlGetElementGenericTableAvl(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlGetEnabledExtendedFeatures(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlGetEnabledExtendedFeatures(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlGetNextEntryHashTable(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlGetNextEntryHashTable(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlGetNtProductType(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlGetNtProductType(p0: String): Boolean

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlGetNtSystemRoot()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlGetNtSystemRoot(): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlGetPersistedStateLocation(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlGetPersistedStateLocation(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlGetSuiteMask()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlGetSuiteMask(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlGetVersion(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlGetVersion(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlHashUnicodeString(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlHashUnicodeString(p0: String, p1: Boolean, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlInitEnumerationHashTable(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlInitEnumerationHashTable(p0: String, p1: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlInitStrongEnumerationHashTable(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlInitStrongEnumerationHashTable(p0: String, p1: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlInitUTF8String(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlInitUTF8String(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlInitUTF8StringEx(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlInitUTF8StringEx(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlInitWeakEnumerationHashTable(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlInitWeakEnumerationHashTable(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlInitializeBitMap(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlInitializeBitMap(p0: String, p1: String, p2: Int)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlInitializeGenericTable(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlInitializeGenericTable(p0: String, p1: String, p2: String, p3: String, p4: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlInitializeGenericTableAvl(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlInitializeGenericTableAvl(p0: String, p1: String, p2: String, p3: String, p4: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlInsertElementGenericTable(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlInsertElementGenericTable(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlInsertElementGenericTableAvl(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlInsertElementGenericTableAvl(p0: String, p1: String, p2: Int, p3: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlInsertElementGenericTableFull(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlInsertElementGenericTableFull(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlInsertElementGenericTableFullAvl(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlInsertElementGenericTableFullAvl(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlInsertEntryHashTable(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlInsertEntryHashTable(p0: String, p1: String, p2: String, p3: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlInt64ToUnicodeString(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlInt64ToUnicodeString(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlIntegerToUnicodeString(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlIntegerToUnicodeString(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlIoDecodeMemIoResource(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlIoDecodeMemIoResource(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlIoEncodeMemIoResource(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlIoEncodeMemIoResource(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlIsApiSetImplemented(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlIsApiSetImplemented(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlIsGenericTableEmpty(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlIsGenericTableEmpty(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlIsGenericTableEmptyAvl(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlIsGenericTableEmptyAvl(p0: String): Boolean

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlIsMultiSessionSku()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlIsMultiSessionSku(): Boolean

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlIsMultiUsersInSessionSku()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlIsMultiUsersInSessionSku(): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlIsNtDdiVersionAvailable(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlIsNtDdiVersionAvailable(p0: Int): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlIsServicePackVersionInstalled(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlIsServicePackVersionInstalled(p0: Int): Boolean

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlIsStateSeparationEnabled()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlIsStateSeparationEnabled(): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlIsUntrustedObject(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlIsUntrustedObject(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlLengthSecurityDescriptor(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlLengthSecurityDescriptor(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlLookupElementGenericTable(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlLookupElementGenericTable(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlLookupElementGenericTableAvl(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlLookupElementGenericTableAvl(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlLookupElementGenericTableFull(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlLookupElementGenericTableFull(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlLookupElementGenericTableFullAvl(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlLookupElementGenericTableFullAvl(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlLookupEntryHashTable(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlLookupEntryHashTable(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlLookupFirstMatchingElementGenericTableAvl(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlLookupFirstMatchingElementGenericTableAvl(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlMapGenericMask(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlMapGenericMask(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlNormalizeSecurityDescriptor(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlNormalizeSecurityDescriptor(p0: String, p1: Int, p2: String, p3: String, p4: Boolean): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlNumberGenericTableElements(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlNumberGenericTableElements(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlNumberGenericTableElementsAvl(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlNumberGenericTableElementsAvl(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlNumberOfClearBits(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlNumberOfClearBits(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlNumberOfClearBitsInRange(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlNumberOfClearBitsInRange(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlNumberOfSetBits(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlNumberOfSetBits(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlNumberOfSetBitsInRange(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlNumberOfSetBitsInRange(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlNumberOfSetBitsUlongPtr(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlNumberOfSetBitsUlongPtr(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlPrefetchMemoryNonTemporal(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlPrefetchMemoryNonTemporal(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlPrefixUnicodeString(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlPrefixUnicodeString(p0: String, p1: String, p2: Boolean): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlQueryRegistryValueWithFallback(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlQueryRegistryValueWithFallback(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlQueryRegistryValues(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlQueryRegistryValues(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlQueryValidationRunlevel(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlQueryValidationRunlevel(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlRealPredecessor(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlRealPredecessor(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlRealSuccessor(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlRealSuccessor(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlRemoveEntryHashTable(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlRemoveEntryHashTable(p0: String, p1: String, p2: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlRunOnceBeginInitialize(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlRunOnceBeginInitialize(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlRunOnceComplete(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlRunOnceComplete(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlRunOnceExecuteOnce(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlRunOnceExecuteOnce(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlRunOnceInitialize(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlRunOnceInitialize(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlSetAllBits(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlSetAllBits(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlSetBit(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlSetBit(p0: String, p1: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlSetBits(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlSetBits(p0: String, p1: Int, p2: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlSetDaclSecurityDescriptor(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlSetDaclSecurityDescriptor(p0: String, p1: Boolean, p2: String, p3: Boolean): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlSetSystemGlobalData(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlSetSystemGlobalData(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlSplay(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlSplay(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlStringFromGUID(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlStringFromGUID(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlStronglyEnumerateEntryHashTable(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlStronglyEnumerateEntryHashTable(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlSubtreePredecessor(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlSubtreePredecessor(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlSubtreeSuccessor(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlSubtreeSuccessor(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlSuffixUnicodeString(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlSuffixUnicodeString(p0: String, p1: String, p2: Boolean): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlTestBit(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlTestBit(p0: String, p1: Int): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlTimeFieldsToTime(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlTimeFieldsToTime(p0: String, p1: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlTimeToTimeFields(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlTimeToTimeFields(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlUTF8StringToUnicodeString(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlUTF8StringToUnicodeString(p0: String, p1: String, p2: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlUTF8ToUnicodeN(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlUTF8ToUnicodeN(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlUnicodeStringToInt64(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlUnicodeStringToInt64(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlUnicodeStringToInteger(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlUnicodeStringToInteger(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlUnicodeStringToUTF8String(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlUnicodeStringToUTF8String(p0: String, p1: String, p2: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlUnicodeToUTF8N(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlUnicodeToUTF8N(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlUpcaseUnicodeChar(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlUpcaseUnicodeChar(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlUpcaseUnicodeString(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlUpcaseUnicodeString(p0: String, p1: String, p2: Boolean): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlUpperChar(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlUpperChar(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlUpperString(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlUpperString(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlValidRelativeSecurityDescriptor(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlValidRelativeSecurityDescriptor(p0: String, p1: Int, p2: Int): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlValidSecurityDescriptor(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlValidSecurityDescriptor(p0: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlVerifyVersionInfo(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlVerifyVersionInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlVolumeDeviceToDosName(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlVolumeDeviceToDosName(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlWalkFrameChain(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlWalkFrameChain(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlWeaklyEnumerateEntryHashTable(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlWeaklyEnumerateEntryHashTable(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlWriteRegistryValue(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlWriteRegistryValue(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlxAnsiStringToUnicodeSize(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlxAnsiStringToUnicodeSize(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_rtlxUnicodeStringToAnsiSize(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_rtlxUnicodeStringToAnsiSize(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_seAccessCheck(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_seAccessCheck(p0: String, p1: String, p2: Boolean, p3: Int, p4: Int, p5: String, p6: String, p7: Int, p8: String, p9: String): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_seAssignSecurity(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_seAssignSecurity(p0: String, p1: String, p2: String, p3: Boolean, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_seAssignSecurityEx(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_seAssignSecurityEx(p0: String, p1: String, p2: String, p3: String, p4: Boolean, p5: Int, p6: String, p7: String, p8: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_seCaptureSubjectContext(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_seCaptureSubjectContext(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_seComputeAutoInheritByObjectType(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_seComputeAutoInheritByObjectType(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_seDeassignSecurity(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_seDeassignSecurity(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_seEtwWriteKMCveEvent(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_seEtwWriteKMCveEvent(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_seLockSubjectContext(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_seLockSubjectContext(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_seRegisterImageVerificationCallback(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_seRegisterImageVerificationCallback(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_seReleaseSubjectContext(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_seReleaseSubjectContext(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_seReportSecurityEvent(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_seReportSecurityEvent(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_seSetAuditParameter(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_seSetAuditParameter(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_seUnlockSubjectContext(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_seUnlockSubjectContext(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_seUnregisterImageVerificationCallback(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_seUnregisterImageVerificationCallback(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_seValidSecurityDescriptor(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_seValidSecurityDescriptor(p0: Int, p1: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_tmCommitComplete(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_tmCommitComplete(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_tmCommitEnlistment(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_tmCommitEnlistment(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_tmCommitTransaction(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_tmCommitTransaction(p0: String, p1: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_tmCreateEnlistment(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_tmCreateEnlistment(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: Int, p7: Int, p8: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_tmDereferenceEnlistmentKey(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_tmDereferenceEnlistmentKey(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_tmEnableCallbacks(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_tmEnableCallbacks(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_tmGetTransactionId(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_tmGetTransactionId(p0: String, p1: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_tmInitializeTransactionManager(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_tmInitializeTransactionManager(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_tmIsTransactionActive(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_tmIsTransactionActive(p0: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_tmPrePrepareComplete(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_tmPrePrepareComplete(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_tmPrePrepareEnlistment(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_tmPrePrepareEnlistment(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_tmPrepareComplete(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_tmPrepareComplete(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_tmPrepareEnlistment(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_tmPrepareEnlistment(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_tmPropagationComplete(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_tmPropagationComplete(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_tmPropagationFailed(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_tmPropagationFailed(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_tmReadOnlyEnlistment(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_tmReadOnlyEnlistment(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_tmRecoverEnlistment(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_tmRecoverEnlistment(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_tmRecoverResourceManager(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_tmRecoverResourceManager(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_tmRecoverTransactionManager(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_tmRecoverTransactionManager(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_tmReferenceEnlistmentKey(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_tmReferenceEnlistmentKey(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_tmRenameTransactionManager(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_tmRenameTransactionManager(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_tmRequestOutcomeEnlistment(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_tmRequestOutcomeEnlistment(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_tmRollbackComplete(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_tmRollbackComplete(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_tmRollbackEnlistment(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_tmRollbackEnlistment(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_tmRollbackTransaction(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_tmRollbackTransaction(p0: String, p1: Boolean): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_tmSinglePhaseReject(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_tmSinglePhaseReject(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_vslCreateSecureSection(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_vslCreateSecureSection(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_vslDeleteSecureSection(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_vslDeleteSecureSection(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_wheaAddErrorSource(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_wheaAddErrorSource(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_wheaAddErrorSourceDeviceDriver(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_wheaAddErrorSourceDeviceDriver(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_wheaAddErrorSourceDeviceDriverV1(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_wheaAddErrorSourceDeviceDriverV1(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_wheaAddHwErrorReportSectionDeviceDriver(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_wheaAddHwErrorReportSectionDeviceDriver(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_wheaConfigureErrorSource(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_wheaConfigureErrorSource(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_wheaCreateHwErrorReportDeviceDriver(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_wheaCreateHwErrorReportDeviceDriver(p0: Int, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_wheaErrorSourceGetState(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_wheaErrorSourceGetState(p0: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_wheaGetNotifyAllOfflinesPolicy()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_wheaGetNotifyAllOfflinesPolicy(): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_wheaHighIrqlLogSelEventHandlerRegister(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_wheaHighIrqlLogSelEventHandlerRegister(p0: String, p1: String): Boolean

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_wheaHighIrqlLogSelEventHandlerUnregister()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_wheaHighIrqlLogSelEventHandlerUnregister()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_wheaHwErrorReportAbandonDeviceDriver(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_wheaHwErrorReportAbandonDeviceDriver(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_wheaHwErrorReportSetSectionNameDeviceDriver(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_wheaHwErrorReportSetSectionNameDeviceDriver(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_wheaHwErrorReportSetSeverityDeviceDriver(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_wheaHwErrorReportSetSeverityDeviceDriver(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_wheaHwErrorReportSubmitDeviceDriver(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_wheaHwErrorReportSubmitDeviceDriver(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_wheaInitializeRecordHeader(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_wheaInitializeRecordHeader(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_wheaIsCriticalState()")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_wheaIsCriticalState(): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_wheaLogInternalEvent(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_wheaLogInternalEvent(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_wheaRegisterInUsePageOfflineNotification(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_wheaRegisterInUsePageOfflineNotification(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_wheaRemoveErrorSource(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_wheaRemoveErrorSource(p0: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_wheaRemoveErrorSourceDeviceDriver(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_wheaRemoveErrorSourceDeviceDriver(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_wheaReportHwError(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_wheaReportHwError(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_wheaReportHwErrorDeviceDriver(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_wheaReportHwErrorDeviceDriver(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_wheaUnconfigureErrorSource(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_wheaUnconfigureErrorSource(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_wheaUnregisterInUsePageOfflineNotification(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_wheaUnregisterInUsePageOfflineNotification(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_wmiQueryTraceInformation(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_wmiQueryTraceInformation(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwAllocateLocallyUniqueId(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwAllocateLocallyUniqueId(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwClose(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwClose(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwCommitComplete(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwCommitComplete(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwCommitEnlistment(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwCommitEnlistment(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwCommitTransaction(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwCommitTransaction(p0: String, p1: Boolean): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwCreateEnlistment(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwCreateEnlistment(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwCreateFile(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwCreateFile(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: Int, p7: Int, p8: Int, p9: String, p10: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwCreateResourceManager(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwCreateResourceManager(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwCreateSection(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwCreateSection(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwCreateTransaction(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwCreateTransaction(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int, p6: Int, p7: Int, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwCreateTransactionManager(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwCreateTransactionManager(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwDeviceIoControlFile(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwDeviceIoControlFile(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: Int, p8: String, p9: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwDisplayString(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwDisplayString(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwEnumerateTransactionObject(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwEnumerateTransactionObject(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwGetNotificationResourceManager(p0, p1, p2, p3, p4, p5, p6)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwGetNotificationResourceManager(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwLoadDriver(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwLoadDriver(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwMakeTemporaryObject(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwMakeTemporaryObject(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwManagePartition(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwManagePartition(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwOpenEnlistment(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwOpenEnlistment(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwOpenFile(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwOpenFile(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwOpenResourceManager(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwOpenResourceManager(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwOpenSymbolicLinkObject(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwOpenSymbolicLinkObject(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwOpenTransaction(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwOpenTransaction(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwOpenTransactionManager(p0, p1, p2, p3, p4, p5)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwOpenTransactionManager(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwPowerInformation(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwPowerInformation(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwPrePrepareComplete(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwPrePrepareComplete(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwPrePrepareEnlistment(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwPrePrepareEnlistment(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwPrepareComplete(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwPrepareComplete(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwPrepareEnlistment(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwPrepareEnlistment(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwPropagationComplete(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwPropagationComplete(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwPropagationFailed(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwPropagationFailed(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwQueryInformationByName(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwQueryInformationByName(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwQueryInformationEnlistment(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwQueryInformationEnlistment(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwQueryInformationFile(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwQueryInformationFile(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwQueryInformationResourceManager(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwQueryInformationResourceManager(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwQueryInformationTransaction(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwQueryInformationTransaction(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwQueryInformationTransactionManager(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwQueryInformationTransactionManager(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwQuerySymbolicLinkObject(p0, p1, p2)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwQuerySymbolicLinkObject(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwReadFile(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwReadFile(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwReadOnlyEnlistment(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwReadOnlyEnlistment(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwRecoverEnlistment(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwRecoverEnlistment(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwRecoverResourceManager(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwRecoverResourceManager(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwRecoverTransactionManager(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwRecoverTransactionManager(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwRegisterProtocolAddressInformation(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwRegisterProtocolAddressInformation(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwRenameTransactionManager(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwRenameTransactionManager(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwRollbackComplete(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwRollbackComplete(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwRollbackEnlistment(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwRollbackEnlistment(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwRollbackTransaction(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwRollbackTransaction(p0: String, p1: Boolean): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwRollforwardTransactionManager(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwRollforwardTransactionManager(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwSetInformationEnlistment(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwSetInformationEnlistment(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwSetInformationFile(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwSetInformationFile(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwSetInformationResourceManager(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwSetInformationResourceManager(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwSetInformationTransaction(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwSetInformationTransaction(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwSetInformationTransactionManager(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwSetInformationTransactionManager(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwSinglePhaseReject(p0, p1)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwSinglePhaseReject(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwUnloadDriver(p0)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwUnloadDriver(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_zwWriteFile(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_zwWriteFile(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_vDbgPrintEx(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_vDbgPrintEx(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_wdk_system_systemservices_vDbgPrintExWithPrefix(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_wdk_system_systemservices_vDbgPrintExWithPrefix(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

public actual fun clfsAddLogContainer(plfolog: COpaquePointer?, pcbcontainer: COpaquePointer?, puszcontainerpath: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsAddLogContainer((plfolog?.value ?: 0L).toString(), (pcbcontainer?.value ?: 0L).toString(), (puszcontainerpath?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsAddLogContainerSet(plfolog: COpaquePointer?, ccontainers: UShort, pcbcontainer: COpaquePointer?, rguszcontainerpath: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsAddLogContainerSet((plfolog?.value ?: 0L).toString(), ccontainers.toInt(), (pcbcontainer?.value ?: 0L).toString(), (rguszcontainerpath?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsAdvanceLogBase(pvmarshalcontext: COpaquePointer?, plsnbase: COpaquePointer?, fflags: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsAdvanceLogBase((pvmarshalcontext?.value ?: 0L).toString(), (plsnbase?.value ?: 0L).toString(), fflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsAlignReservedLog(pvmarshalcontext: COpaquePointer?, crecords: UInt, rgcbreservation: COpaquePointer?, pcbalignreservation: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsAlignReservedLog((pvmarshalcontext?.value ?: 0L).toString(), crecords.toInt(), (rgcbreservation?.value ?: 0L).toString(), (pcbalignreservation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsAllocReservedLog(pvmarshalcontext: COpaquePointer?, crecords: UInt, pcbadjustment: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsAllocReservedLog((pvmarshalcontext?.value ?: 0L).toString(), crecords.toInt(), (pcbadjustment?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsCloseAndResetLogFile(plfolog: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsCloseAndResetLogFile((plfolog?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsCloseLogFileObject(plfolog: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsCloseLogFileObject((plfolog?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsCreateLogFile(pplfolog: COpaquePointer?, puszlogfilename: COpaquePointer?, fdesiredaccess: UInt, dwsharemode: UInt, psdlogfile: PsecurityDescriptor, fcreatedisposition: UInt, fcreateoptions: UInt, fflagsandattributes: UInt, flogoptionflag: UInt, pvcontext: COpaquePointer?, cbcontext: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsCreateLogFile((pplfolog?.value ?: 0L).toString(), (puszlogfilename?.value ?: 0L).toString(), fdesiredaccess.toInt(), dwsharemode.toInt(), (psdlogfile?.value ?: 0L).toString(), fcreatedisposition.toInt(), fcreateoptions.toInt(), fflagsandattributes.toInt(), flogoptionflag.toInt(), (pvcontext?.value ?: 0L).toString(), cbcontext.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsCreateMarshallingArea(plfolog: COpaquePointer?, epooltype: PoolType, pfnallocbuffer: PallocateFunction, pfnfreebuffer: PfreeFunction, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, ppvmarshalcontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsCreateMarshallingAreaEx(plfolog: COpaquePointer?, epooltype: PoolType, pfnallocbuffer: PallocateFunction, pfnfreebuffer: PfreeFunction, cbmarshallingbuffer: UInt, cmaxwritebuffers: UInt, cmaxreadbuffers: UInt, calignmentsize: UInt, fflags: ULong, ppvmarshalcontext: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsCreateScanContext(plfolog: COpaquePointer?, cfromcontainer: UInt, ccontainers: UInt, escanmode: UByte, pcxscan: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsCreateScanContext((plfolog?.value ?: 0L).toString(), cfromcontainer.toInt(), ccontainers.toInt(), escanmode.toInt(), (pcxscan?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsDeleteLogByPointer(plfolog: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsDeleteLogByPointer((plfolog?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsDeleteLogFile(puszlogfilename: COpaquePointer?, pvreserved: COpaquePointer?, flogoptionflag: UInt, pvcontext: COpaquePointer?, cbcontext: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsDeleteLogFile((puszlogfilename?.value ?: 0L).toString(), (pvreserved?.value ?: 0L).toString(), flogoptionflag.toInt(), (pvcontext?.value ?: 0L).toString(), cbcontext.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsDeleteMarshallingArea(pvmarshalcontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsDeleteMarshallingArea((pvmarshalcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsEarlierLsn(plsn: COpaquePointer?): ClsLsn =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsFinalize() {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_clfsFinalize()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun clfsFlushBuffers(pvmarshalcontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsFlushBuffers((pvmarshalcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsFlushToLsn(pvmarshalcontext: COpaquePointer?, plsnflush: COpaquePointer?, plsnlastflushed: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsFlushToLsn((pvmarshalcontext?.value ?: 0L).toString(), (plsnflush?.value ?: 0L).toString(), (plsnlastflushed?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsFreeReservedLog(pvmarshalcontext: COpaquePointer?, crecords: UInt, pcbadjustment: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsFreeReservedLog((pvmarshalcontext?.value ?: 0L).toString(), crecords.toInt(), (pcbadjustment?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsGetContainerName(plfolog: COpaquePointer?, cidlogicalcontainer: UInt, puszcontainername: COpaquePointer?, pcactuallencontainername: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsGetContainerName((plfolog?.value ?: 0L).toString(), cidlogicalcontainer.toInt(), (puszcontainername?.value ?: 0L).toString(), (pcactuallencontainername?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsGetIoStatistics(plfolog: COpaquePointer?, pvstatsbuffer: COpaquePointer?, cbstatsbuffer: UInt, estatsclass: ClfsIostatsClass, pcbstatswritten: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsGetIoStatistics((plfolog?.value ?: 0L).toString(), (pvstatsbuffer?.value ?: 0L).toString(), cbstatsbuffer.toInt(), estatsclass, (pcbstatswritten?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsGetLogFileInformation(plfolog: COpaquePointer?, pinfobuffer: COpaquePointer?, pcbinfobuffer: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsGetLogFileInformation((plfolog?.value ?: 0L).toString(), (pinfobuffer?.value ?: 0L).toString(), (pcbinfobuffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsInitialize(): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsInitialize() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsLaterLsn(plsn: COpaquePointer?): ClsLsn =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsLsnBlockOffset(plsn: COpaquePointer?): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsLsnBlockOffset((plsn?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsLsnContainer(plsn: COpaquePointer?): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsLsnContainer((plsn?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsLsnCreate(cidcontainer: UInt, offblock: UInt, crecord: UInt): ClsLsn =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsLsnDifference(plsnstart: COpaquePointer?, plsnfinish: COpaquePointer?, cbcontainer: UInt, cbmaxblock: UInt, pcbdifference: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsLsnDifference((plsnstart?.value ?: 0L).toString(), (plsnfinish?.value ?: 0L).toString(), cbcontainer.toInt(), cbmaxblock.toInt(), (pcbdifference?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsLsnEqual(plsn1: COpaquePointer?, plsn2: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsLsnEqual((plsn1?.value ?: 0L).toString(), (plsn2?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsLsnGreater(plsn1: COpaquePointer?, plsn2: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsLsnGreater((plsn1?.value ?: 0L).toString(), (plsn2?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsLsnInvalid(plsn: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsLsnInvalid((plsn?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsLsnLess(plsn1: COpaquePointer?, plsn2: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsLsnLess((plsn1?.value ?: 0L).toString(), (plsn2?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsLsnNull(plsn: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsLsnNull((plsn?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsLsnRecordSequence(plsn: COpaquePointer?): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsLsnRecordSequence((plsn?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsMgmtDeregisterManagedClient(clientcookie: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsMgmtDeregisterManagedClient((clientcookie?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsMgmtHandleLogFileFull(client: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsMgmtHandleLogFileFull((client?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsMgmtInstallPolicy(logfile: COpaquePointer?, policy: COpaquePointer?, policylength: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsMgmtInstallPolicy((logfile?.value ?: 0L).toString(), (policy?.value ?: 0L).toString(), policylength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsMgmtQueryPolicy(logfile: COpaquePointer?, policytype: ClfsMgmtPolicyType, policy: COpaquePointer?, policylength: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsMgmtQueryPolicy((logfile?.value ?: 0L).toString(), policytype, (policy?.value ?: 0L).toString(), (policylength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsMgmtRegisterManagedClient(logfile: COpaquePointer?, registrationdata: COpaquePointer?, clientcookie: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsMgmtRegisterManagedClient((logfile?.value ?: 0L).toString(), (registrationdata?.value ?: 0L).toString(), (clientcookie?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsMgmtRemovePolicy(logfile: COpaquePointer?, policytype: ClfsMgmtPolicyType): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsMgmtRemovePolicy((logfile?.value ?: 0L).toString(), policytype) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsMgmtSetLogFileSize(logfile: COpaquePointer?, newsizeincontainers: COpaquePointer?, resultingsizeincontainers: COpaquePointer?, completionroutine: PclfsSetLogSizeCompleteCallback, completionroutinedata: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsMgmtSetLogFileSize((logfile?.value ?: 0L).toString(), (newsizeincontainers?.value ?: 0L).toString(), (resultingsizeincontainers?.value ?: 0L).toString(), 0L.toString(), (completionroutinedata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsMgmtSetLogFileSizeAsClient(logfile: COpaquePointer?, clientcookie: COpaquePointer?, newsizeincontainers: COpaquePointer?, resultingsizeincontainers: COpaquePointer?, completionroutine: PclfsSetLogSizeCompleteCallback, completionroutinedata: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsMgmtSetLogFileSizeAsClient((logfile?.value ?: 0L).toString(), (clientcookie?.value ?: 0L).toString(), (newsizeincontainers?.value ?: 0L).toString(), (resultingsizeincontainers?.value ?: 0L).toString(), 0L.toString(), (completionroutinedata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsMgmtTailAdvanceFailure(client: COpaquePointer?, reason: Ntstatus): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsMgmtTailAdvanceFailure((client?.value ?: 0L).toString(), reason) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsQueryLogFileInformation(plfolog: COpaquePointer?, einformationclass: ClsLogInformationClass, pinfoinputbuffer: COpaquePointer?, cbinfoinputbuffer: UInt, pinfobuffer: COpaquePointer?, pcbinfobuffer: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsQueryLogFileInformation((plfolog?.value ?: 0L).toString(), einformationclass, (pinfoinputbuffer?.value ?: 0L).toString(), cbinfoinputbuffer.toInt(), (pinfobuffer?.value ?: 0L).toString(), (pcbinfobuffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsReadLogRecord(pvmarshalcontext: COpaquePointer?, plsnfirst: COpaquePointer?, pecontextmode: ClfsContextMode, ppvreadbuffer: COpaquePointer?, pcbreadbuffer: COpaquePointer?, perecordtype: COpaquePointer?, plsnundonext: COpaquePointer?, plsnprevious: COpaquePointer?, ppvreadcontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsReadLogRecord((pvmarshalcontext?.value ?: 0L).toString(), (plsnfirst?.value ?: 0L).toString(), pecontextmode, (ppvreadbuffer?.value ?: 0L).toString(), (pcbreadbuffer?.value ?: 0L).toString(), (perecordtype?.value ?: 0L).toString(), (plsnundonext?.value ?: 0L).toString(), (plsnprevious?.value ?: 0L).toString(), (ppvreadcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsReadNextLogRecord(pvreadcontext: COpaquePointer?, ppvbuffer: COpaquePointer?, pcbbuffer: COpaquePointer?, perecordtype: COpaquePointer?, plsnuser: COpaquePointer?, plsnundonext: COpaquePointer?, plsnprevious: COpaquePointer?, plsnrecord: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsReadNextLogRecord((pvreadcontext?.value ?: 0L).toString(), (ppvbuffer?.value ?: 0L).toString(), (pcbbuffer?.value ?: 0L).toString(), (perecordtype?.value ?: 0L).toString(), (plsnuser?.value ?: 0L).toString(), (plsnundonext?.value ?: 0L).toString(), (plsnprevious?.value ?: 0L).toString(), (plsnrecord?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsReadPreviousRestartArea(pvreadcontext: COpaquePointer?, ppvrestartbuffer: COpaquePointer?, pcbrestartbuffer: COpaquePointer?, plsnrestart: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsReadPreviousRestartArea((pvreadcontext?.value ?: 0L).toString(), (ppvrestartbuffer?.value ?: 0L).toString(), (pcbrestartbuffer?.value ?: 0L).toString(), (plsnrestart?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsReadRestartArea(pvmarshalcontext: COpaquePointer?, ppvrestartbuffer: COpaquePointer?, pcbrestartbuffer: COpaquePointer?, plsn: COpaquePointer?, ppvreadcontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsReadRestartArea((pvmarshalcontext?.value ?: 0L).toString(), (ppvrestartbuffer?.value ?: 0L).toString(), (pcbrestartbuffer?.value ?: 0L).toString(), (plsn?.value ?: 0L).toString(), (ppvreadcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsRemoveLogContainer(plfolog: COpaquePointer?, puszcontainerpath: COpaquePointer?, fforce: Boolean): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsRemoveLogContainer((plfolog?.value ?: 0L).toString(), (puszcontainerpath?.value ?: 0L).toString(), fforce) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsRemoveLogContainerSet(plfolog: COpaquePointer?, ccontainers: UShort, rgwszcontainerpath: COpaquePointer?, fforce: Boolean): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsRemoveLogContainerSet((plfolog?.value ?: 0L).toString(), ccontainers.toInt(), (rgwszcontainerpath?.value ?: 0L).toString(), fforce) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsReserveAndAppendLog(pvmarshalcontext: COpaquePointer?, rgwriteentries: COpaquePointer?, cwriteentries: UInt, plsnundonext: COpaquePointer?, plsnprevious: COpaquePointer?, creserverecords: UInt, rgcbreservation: COpaquePointer?, fflags: UInt, plsn: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsReserveAndAppendLog((pvmarshalcontext?.value ?: 0L).toString(), (rgwriteentries?.value ?: 0L).toString(), cwriteentries.toInt(), (plsnundonext?.value ?: 0L).toString(), (plsnprevious?.value ?: 0L).toString(), creserverecords.toInt(), (rgcbreservation?.value ?: 0L).toString(), fflags.toInt(), (plsn?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsReserveAndAppendLogAligned(pvmarshalcontext: COpaquePointer?, rgwriteentries: COpaquePointer?, cwriteentries: UInt, cbentryalignment: UInt, plsnundonext: COpaquePointer?, plsnprevious: COpaquePointer?, creserverecords: UInt, rgcbreservation: COpaquePointer?, fflags: UInt, plsn: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsReserveAndAppendLogAligned((pvmarshalcontext?.value ?: 0L).toString(), (rgwriteentries?.value ?: 0L).toString(), cwriteentries.toInt(), cbentryalignment.toInt(), (plsnundonext?.value ?: 0L).toString(), (plsnprevious?.value ?: 0L).toString(), creserverecords.toInt(), (rgcbreservation?.value ?: 0L).toString(), fflags.toInt(), (plsn?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsScanLogContainers(pcxscan: COpaquePointer?, escanmode: UByte): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsScanLogContainers((pcxscan?.value ?: 0L).toString(), escanmode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsSetArchiveTail(plfolog: COpaquePointer?, plsnarchivetail: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsSetArchiveTail((plfolog?.value ?: 0L).toString(), (plsnarchivetail?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsSetEndOfLog(plfolog: COpaquePointer?, plsnend: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsSetEndOfLog((plfolog?.value ?: 0L).toString(), (plsnend?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsSetLogFileInformation(plfolog: COpaquePointer?, einformationclass: ClsLogInformationClass, pinfobuffer: COpaquePointer?, cbbuffer: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsSetLogFileInformation((plfolog?.value ?: 0L).toString(), einformationclass, (pinfobuffer?.value ?: 0L).toString(), cbbuffer.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsTerminateReadLog(pvcursorcontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsTerminateReadLog((pvcursorcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clfsWriteRestartArea(pvmarshalcontext: COpaquePointer?, pvrestartbuffer: COpaquePointer?, cbrestartbuffer: UInt, plsnbase: COpaquePointer?, fflags: UInt, pcbwritten: COpaquePointer?, plsnnext: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_clfsWriteRestartArea((pvmarshalcontext?.value ?: 0L).toString(), (pvrestartbuffer?.value ?: 0L).toString(), cbrestartbuffer.toInt(), (plsnbase?.value ?: 0L).toString(), fflags.toInt(), (pcbwritten?.value ?: 0L).toString(), (plsnnext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmCallbackGetKeyObjectID(cookie: COpaquePointer?, obj: COpaquePointer?, objectid: COpaquePointer?, objectname: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_cmCallbackGetKeyObjectID((cookie?.value ?: 0L).toString(), (obj?.value ?: 0L).toString(), (objectid?.value ?: 0L).toString(), (objectname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmCallbackGetKeyObjectIDEx(cookie: COpaquePointer?, obj: COpaquePointer?, objectid: COpaquePointer?, objectname: COpaquePointer?, flags: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_cmCallbackGetKeyObjectIDEx((cookie?.value ?: 0L).toString(), (obj?.value ?: 0L).toString(), (objectid?.value ?: 0L).toString(), (objectname?.value ?: 0L).toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmCallbackReleaseKeyObjectIDEx(objectname: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_cmCallbackReleaseKeyObjectIDEx((objectname?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun cmGetBoundTransaction(cookie: COpaquePointer?, obj: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_cmGetBoundTransaction((cookie?.value ?: 0L).toString(), (obj?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmGetCallbackVersion(major: COpaquePointer?, minor: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_cmGetCallbackVersion((major?.value ?: 0L).toString(), (minor?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun cmRegisterCallback(function: PexCallbackFunction, context: COpaquePointer?, cookie: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_cmRegisterCallback(0L.toString(), (context?.value ?: 0L).toString(), (cookie?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmRegisterCallbackEx(function: PexCallbackFunction, altitude: COpaquePointer?, driver: COpaquePointer?, context: COpaquePointer?, cookie: COpaquePointer?, reserved: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_cmRegisterCallbackEx(0L.toString(), (altitude?.value ?: 0L).toString(), (driver?.value ?: 0L).toString(), (context?.value ?: 0L).toString(), (cookie?.value ?: 0L).toString(), (reserved?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmSetCallbackObjectContext(obj: COpaquePointer?, cookie: COpaquePointer?, newcontext: COpaquePointer?, oldcontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_cmSetCallbackObjectContext((obj?.value ?: 0L).toString(), (cookie?.value ?: 0L).toString(), (newcontext?.value ?: 0L).toString(), (oldcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cmUnRegisterCallback(cookie: Long): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_cmUnRegisterCallback(cookie.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dbgBreakPointWithStatus(status: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_dbgBreakPointWithStatus(status.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dbgPrint(format: Pcstr, vararg variadicArgs: Long): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_dbgPrint((format?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dbgPrintEx(componentid: UInt, level: UInt, format: Pcstr, vararg variadicArgs: Long): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_dbgPrintEx(componentid.toInt(), level.toInt(), (format?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dbgPrintReturnControlC(format: Pcstr, vararg variadicArgs: Long): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_dbgPrintReturnControlC((format?.value ?: 0L).toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dbgPrompt(prompt: Pcstr, response: Pstr, length: UInt): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_dbgPrompt((prompt?.value ?: 0L).toString(), (response?.value ?: 0L).toString(), length.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dbgQueryDebugFilterState(componentid: UInt, level: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_dbgQueryDebugFilterState(componentid.toInt(), level.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dbgSetDebugFilterState(componentid: UInt, level: UInt, state: Boolean): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_dbgSetDebugFilterState(componentid.toInt(), level.toInt(), state) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dbgSetDebugPrintCallback(debugprintcallback: PdebugPrintCallback, enable: Boolean): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_dbgSetDebugPrintCallback(0L.toString(), enable) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun etwActivityIdControl(controlcode: UInt, activityid: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_etwActivityIdControl(controlcode.toInt(), (activityid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun etwEventEnabled(reghandle: Reghandle, eventdescriptor: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_etwEventEnabled(reghandle.toString(), (eventdescriptor?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun etwProviderEnabled(reghandle: Reghandle, level: UByte, keyword: ULong): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_etwProviderEnabled(reghandle.toString(), level.toInt(), keyword.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun etwRegister(providerid: COpaquePointer?, enablecallback: Petwenablecallback, callbackcontext: COpaquePointer?, reghandle: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_etwRegister((providerid?.value ?: 0L).toString(), 0L.toString(), (callbackcontext?.value ?: 0L).toString(), (reghandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun etwSetInformation(reghandle: Reghandle, informationclass: EventInfoClass, eventinformation: COpaquePointer?, informationlength: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_etwSetInformation(reghandle.toString(), informationclass, (eventinformation?.value ?: 0L).toString(), informationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun etwUnregister(reghandle: Reghandle): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_etwUnregister(reghandle.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun etwWrite(reghandle: Reghandle, eventdescriptor: COpaquePointer?, activityid: COpaquePointer?, userdatacount: UInt, userdata: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_etwWrite(reghandle.toString(), (eventdescriptor?.value ?: 0L).toString(), (activityid?.value ?: 0L).toString(), userdatacount.toInt(), (userdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun etwWriteEx(reghandle: Reghandle, eventdescriptor: COpaquePointer?, filter: ULong, flags: UInt, activityid: COpaquePointer?, relatedactivityid: COpaquePointer?, userdatacount: UInt, userdata: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_etwWriteEx(reghandle.toString(), (eventdescriptor?.value ?: 0L).toString(), filter.toString(), flags.toInt(), (activityid?.value ?: 0L).toString(), (relatedactivityid?.value ?: 0L).toString(), userdatacount.toInt(), (userdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun etwWriteString(reghandle: Reghandle, level: UByte, keyword: ULong, activityid: COpaquePointer?, string: Pcwstr): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_etwWriteString(reghandle.toString(), level.toInt(), keyword.toString(), (activityid?.value ?: 0L).toString(), (string?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun etwWriteTransfer(reghandle: Reghandle, eventdescriptor: COpaquePointer?, activityid: COpaquePointer?, relatedactivityid: COpaquePointer?, userdatacount: UInt, userdata: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_etwWriteTransfer(reghandle.toString(), (eventdescriptor?.value ?: 0L).toString(), (activityid?.value ?: 0L).toString(), (relatedactivityid?.value ?: 0L).toString(), userdatacount.toInt(), (userdata?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAcquireFastMutex(fastmutex: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exAcquireFastMutex((fastmutex?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exAcquireFastMutexUnsafe(fastmutex: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exAcquireFastMutexUnsafe((fastmutex?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exAcquirePushLockExclusiveEx(pushlock: COpaquePointer?, flags: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exAcquirePushLockExclusiveEx((pushlock?.value ?: 0L).toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exAcquirePushLockSharedEx(pushlock: COpaquePointer?, flags: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exAcquirePushLockSharedEx((pushlock?.value ?: 0L).toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exAcquireResourceExclusiveLite(resource: COpaquePointer?, wait: Boolean): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exAcquireResourceExclusiveLite((resource?.value ?: 0L).toString(), wait) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAcquireResourceSharedLite(resource: COpaquePointer?, wait: Boolean): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exAcquireResourceSharedLite((resource?.value ?: 0L).toString(), wait) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAcquireRundownProtection(runref: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exAcquireRundownProtection((runref?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAcquireRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exAcquireRundownProtectionCacheAware(runrefcacheaware.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAcquireRundownProtectionCacheAwareEx(runrefcacheaware: PexRundownRefCacheAware, count: UInt): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exAcquireRundownProtectionCacheAwareEx(runrefcacheaware.toString(), count.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAcquireRundownProtectionEx(runref: COpaquePointer?, count: UInt): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exAcquireRundownProtectionEx((runref?.value ?: 0L).toString(), count.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAcquireSharedStarveExclusive(resource: COpaquePointer?, wait: Boolean): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exAcquireSharedStarveExclusive((resource?.value ?: 0L).toString(), wait) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAcquireSharedWaitForExclusive(resource: COpaquePointer?, wait: Boolean): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exAcquireSharedWaitForExclusive((resource?.value ?: 0L).toString(), wait) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAcquireSpinLockExclusive(spinlock: COpaquePointer?): UByte =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exAcquireSpinLockExclusive((spinlock?.value ?: 0L).toString()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAcquireSpinLockExclusiveAtDpcLevel(spinlock: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exAcquireSpinLockExclusiveAtDpcLevel((spinlock?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exAcquireSpinLockShared(spinlock: COpaquePointer?): UByte =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exAcquireSpinLockShared((spinlock?.value ?: 0L).toString()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAcquireSpinLockSharedAtDpcLevel(spinlock: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exAcquireSpinLockSharedAtDpcLevel((spinlock?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exAllocateCacheAwareRundownProtection(pooltype: PoolType, pooltag: UInt): PexRundownRefCacheAware =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exAllocateCacheAwareRundownProtection(pooltype, pooltag.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAllocatePool(pooltype: PoolType, numberofbytes: ULong): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exAllocatePool(pooltype, numberofbytes.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAllocatePool2(flags: ULong, numberofbytes: ULong, tag: UInt): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exAllocatePool2(flags.toString(), numberofbytes.toString(), tag.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAllocatePool3(flags: ULong, numberofbytes: ULong, tag: UInt, extendedparameters: COpaquePointer?, extendedparameterscount: UInt): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exAllocatePool3(flags.toString(), numberofbytes.toString(), tag.toInt(), (extendedparameters?.value ?: 0L).toString(), extendedparameterscount.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAllocatePoolWithQuota(pooltype: PoolType, numberofbytes: ULong): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exAllocatePoolWithQuota(pooltype, numberofbytes.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAllocatePoolWithQuotaTag(pooltype: PoolType, numberofbytes: ULong, tag: UInt): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exAllocatePoolWithQuotaTag(pooltype, numberofbytes.toString(), tag.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAllocatePoolWithTag(pooltype: PoolType, numberofbytes: ULong, tag: UInt): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exAllocatePoolWithTag(pooltype, numberofbytes.toString(), tag.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAllocatePoolWithTagPriority(pooltype: PoolType, numberofbytes: ULong, tag: UInt, priority: ExPoolPriority): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exAllocatePoolWithTagPriority(pooltype, numberofbytes.toString(), tag.toInt(), priority).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exAllocateTimer(callback: PextCallback, callbackcontext: COpaquePointer?, attributes: UInt): PexTimer =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exAllocateTimer(0L.toString(), (callbackcontext?.value ?: 0L).toString(), attributes.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exCancelTimer(timer: PexTimer, parameters: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exCancelTimer(timer.toString(), (parameters?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exCleanupRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exCleanupRundownProtectionCacheAware(runrefcacheaware.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exConvertExclusiveToSharedLite(resource: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exConvertExclusiveToSharedLite((resource?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exCreateCallback(callbackobject: COpaquePointer?, objectattributes: COpaquePointer?, create: Boolean, allowmultiplecallbacks: Boolean): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exCreateCallback((callbackobject?.value ?: 0L).toString(), (objectattributes?.value ?: 0L).toString(), create, allowmultiplecallbacks) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exCreatePool(flags: UInt, tag: ULong, params: COpaquePointer?, poolhandle: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exCreatePool(flags.toInt(), tag.toString(), (params?.value ?: 0L).toString(), (poolhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exDeleteResourceLite(resource: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exDeleteResourceLite((resource?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exDeleteTimer(timer: PexTimer, cancel: Boolean, wait: Boolean, parameters: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exDeleteTimer(timer.toString(), cancel, wait, (parameters?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exDestroyPool(poolhandle: Handle) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exDestroyPool((poolhandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exEnterCriticalRegionAndAcquireResourceExclusive(resource: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exEnterCriticalRegionAndAcquireResourceExclusive((resource?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exEnterCriticalRegionAndAcquireResourceShared(resource: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exEnterCriticalRegionAndAcquireResourceShared((resource?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exEnterCriticalRegionAndAcquireSharedWaitForExclusive(resource: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exEnterCriticalRegionAndAcquireSharedWaitForExclusive((resource?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exEnumerateSystemFirmwareTables(firmwaretableprovidersignature: UInt, firmwaretablebuffer: COpaquePointer?, bufferlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exEnumerateSystemFirmwareTables(firmwaretableprovidersignature.toInt(), (firmwaretablebuffer?.value ?: 0L).toString(), bufferlength.toInt(), (returnlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exExtendZone(zone: COpaquePointer?, segment: COpaquePointer?, segmentsize: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exExtendZone((zone?.value ?: 0L).toString(), (segment?.value ?: 0L).toString(), segmentsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exFreeCacheAwareRundownProtection(runrefcacheaware: PexRundownRefCacheAware) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exFreeCacheAwareRundownProtection(runrefcacheaware.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exFreePool(p: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exFreePool((p?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exFreePool2(p: COpaquePointer?, tag: UInt, extendedparameters: COpaquePointer?, extendedparameterscount: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exFreePool2((p?.value ?: 0L).toString(), tag.toInt(), (extendedparameters?.value ?: 0L).toString(), extendedparameterscount.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exFreePoolWithTag(p: COpaquePointer?, tag: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exFreePoolWithTag((p?.value ?: 0L).toString(), tag.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exGetExclusiveWaiterCount(resource: COpaquePointer?): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exGetExclusiveWaiterCount((resource?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exGetFirmwareEnvironmentVariable(variablename: COpaquePointer?, vendorguid: COpaquePointer?, value: COpaquePointer?, valuelength: COpaquePointer?, attributes: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exGetFirmwareEnvironmentVariable((variablename?.value ?: 0L).toString(), (vendorguid?.value ?: 0L).toString(), (value?.value ?: 0L).toString(), (valuelength?.value ?: 0L).toString(), (attributes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exGetFirmwareType(): FirmwareType =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exGetFirmwareType() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exGetPreviousMode(): Byte =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exGetPreviousMode().toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exGetSharedWaiterCount(resource: COpaquePointer?): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exGetSharedWaiterCount((resource?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exGetSystemFirmwareTable(firmwaretableprovidersignature: UInt, firmwaretableid: UInt, firmwaretablebuffer: COpaquePointer?, bufferlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exGetSystemFirmwareTable(firmwaretableprovidersignature.toInt(), firmwaretableid.toInt(), (firmwaretablebuffer?.value ?: 0L).toString(), bufferlength.toInt(), (returnlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exInitializePushLock(pushlock: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exInitializePushLock((pushlock?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exInitializeResourceLite(resource: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exInitializeResourceLite((resource?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exInitializeRundownProtection(runref: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exInitializeRundownProtection((runref?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exInitializeRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware, runrefsize: ULong) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exInitializeRundownProtectionCacheAware(runrefcacheaware.toString(), runrefsize.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exInitializeRundownProtectionCacheAwareEx(runrefcacheaware: PexRundownRefCacheAware, flags: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exInitializeRundownProtectionCacheAwareEx(runrefcacheaware.toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exInitializeZone(zone: COpaquePointer?, blocksize: UInt, initialsegment: COpaquePointer?, initialsegmentsize: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exInitializeZone((zone?.value ?: 0L).toString(), blocksize.toInt(), (initialsegment?.value ?: 0L).toString(), initialsegmentsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exInterlockedAddLargeInteger(addend: COpaquePointer?, increment: Long, lock: COpaquePointer?): Long =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exInterlockedAddLargeInteger((addend?.value ?: 0L).toString(), increment.toString(), (lock?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exInterlockedExtendZone(zone: COpaquePointer?, segment: COpaquePointer?, segmentsize: UInt, lock: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exInterlockedExtendZone((zone?.value ?: 0L).toString(), (segment?.value ?: 0L).toString(), segmentsize.toInt(), (lock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exIsManufacturingModeEnabled(): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exIsManufacturingModeEnabled() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exIsProcessorFeaturePresent(processorfeature: UInt): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exIsProcessorFeaturePresent(processorfeature.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exIsResourceAcquiredExclusiveLite(resource: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exIsResourceAcquiredExclusiveLite((resource?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exIsResourceAcquiredSharedLite(resource: COpaquePointer?): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exIsResourceAcquiredSharedLite((resource?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exIsSoftBoot(): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exIsSoftBoot() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exLocalTimeToSystemTime(localtime: COpaquePointer?, systemtime: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exLocalTimeToSystemTime((localtime?.value ?: 0L).toString(), (systemtime?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exNotifyCallback(callbackobject: COpaquePointer?, argument1: COpaquePointer?, argument2: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exNotifyCallback((callbackobject?.value ?: 0L).toString(), (argument1?.value ?: 0L).toString(), (argument2?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exQueryTimerResolution(maximumtime: COpaquePointer?, minimumtime: COpaquePointer?, currenttime: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exQueryTimerResolution((maximumtime?.value ?: 0L).toString(), (minimumtime?.value ?: 0L).toString(), (currenttime?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exQueueWorkItem(workitem: COpaquePointer?, queuetype: WorkQueueType) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exQueueWorkItem((workitem?.value ?: 0L).toString(), queuetype)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exRaiseAccessViolation() {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exRaiseAccessViolation()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exRaiseDatatypeMisalignment() {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exRaiseDatatypeMisalignment()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exRaiseStatus(status: Ntstatus) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exRaiseStatus(status)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReInitializeRundownProtection(runref: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exReInitializeRundownProtection((runref?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReInitializeRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exReInitializeRundownProtectionCacheAware(runrefcacheaware.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exRegisterCallback(callbackobject: PcallbackObject, callbackfunction: PcallbackFunction, callbackcontext: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exRegisterCallback(callbackobject.toString(), 0L.toString(), (callbackcontext?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exReinitializeResourceLite(resource: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exReinitializeResourceLite((resource?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exReleaseFastMutex(fastmutex: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exReleaseFastMutex((fastmutex?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReleaseFastMutexUnsafe(fastmutex: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exReleaseFastMutexUnsafe((fastmutex?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReleasePushLockExclusiveEx(pushlock: COpaquePointer?, flags: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exReleasePushLockExclusiveEx((pushlock?.value ?: 0L).toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReleasePushLockSharedEx(pushlock: COpaquePointer?, flags: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exReleasePushLockSharedEx((pushlock?.value ?: 0L).toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReleaseResourceAndLeaveCriticalRegion(resource: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exReleaseResourceAndLeaveCriticalRegion((resource?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReleaseResourceForThreadLite(resource: COpaquePointer?, resourcethreadid: ULong) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exReleaseResourceForThreadLite((resource?.value ?: 0L).toString(), resourcethreadid.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReleaseResourceLite(resource: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exReleaseResourceLite((resource?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReleaseRundownProtection(runref: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exReleaseRundownProtection((runref?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReleaseRundownProtectionCacheAware(runrefcacheaware: PexRundownRefCacheAware) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exReleaseRundownProtectionCacheAware(runrefcacheaware.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReleaseRundownProtectionCacheAwareEx(runref: PexRundownRefCacheAware, count: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exReleaseRundownProtectionCacheAwareEx(runref.toString(), count.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReleaseRundownProtectionEx(runref: COpaquePointer?, count: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exReleaseRundownProtectionEx((runref?.value ?: 0L).toString(), count.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReleaseSpinLockExclusive(spinlock: COpaquePointer?, oldirql: UByte) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exReleaseSpinLockExclusive((spinlock?.value ?: 0L).toString(), oldirql.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReleaseSpinLockExclusiveFromDpcLevel(spinlock: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exReleaseSpinLockExclusiveFromDpcLevel((spinlock?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReleaseSpinLockShared(spinlock: COpaquePointer?, oldirql: UByte) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exReleaseSpinLockShared((spinlock?.value ?: 0L).toString(), oldirql.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exReleaseSpinLockSharedFromDpcLevel(spinlock: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exReleaseSpinLockSharedFromDpcLevel((spinlock?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exRundownCompleted(runref: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exRundownCompleted((runref?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exRundownCompletedCacheAware(runrefcacheaware: PexRundownRefCacheAware) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exRundownCompletedCacheAware(runrefcacheaware.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exSecurePoolUpdate(securepoolhandle: Handle, tag: UInt, allocation: COpaquePointer?, cookie: ULong, offset: ULong, size: ULong, buffer: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exSecurePoolUpdate((securepoolhandle?.value ?: 0L).toString(), tag.toInt(), (allocation?.value ?: 0L).toString(), cookie.toString(), offset.toString(), size.toString(), (buffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exSecurePoolValidate(securepoolhandle: Handle, tag: UInt, allocation: COpaquePointer?, cookie: ULong): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exSecurePoolValidate((securepoolhandle?.value ?: 0L).toString(), tag.toInt(), (allocation?.value ?: 0L).toString(), cookie.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exSetFirmwareEnvironmentVariable(variablename: COpaquePointer?, vendorguid: COpaquePointer?, value: COpaquePointer?, valuelength: UInt, attributes: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exSetFirmwareEnvironmentVariable((variablename?.value ?: 0L).toString(), (vendorguid?.value ?: 0L).toString(), (value?.value ?: 0L).toString(), valuelength.toInt(), attributes.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exSetResourceOwnerPointer(resource: COpaquePointer?, ownerpointer: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exSetResourceOwnerPointer((resource?.value ?: 0L).toString(), (ownerpointer?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exSetResourceOwnerPointerEx(resource: COpaquePointer?, ownerpointer: COpaquePointer?, flags: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exSetResourceOwnerPointerEx((resource?.value ?: 0L).toString(), (ownerpointer?.value ?: 0L).toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exSetTimer(timer: PexTimer, duetime: Long, period: Long, parameters: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exSetTimer(timer.toString(), duetime.toString(), period.toString(), (parameters?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exSetTimerResolution(desiredtime: UInt, setresolution: Boolean): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exSetTimerResolution(desiredtime.toInt(), setresolution).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exSizeOfRundownProtectionCacheAware(): ULong =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exSizeOfRundownProtectionCacheAware().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exSystemTimeToLocalTime(systemtime: COpaquePointer?, localtime: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exSystemTimeToLocalTime((systemtime?.value ?: 0L).toString(), (localtime?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exTryAcquireSpinLockExclusiveAtDpcLevel(spinlock: COpaquePointer?): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exTryAcquireSpinLockExclusiveAtDpcLevel((spinlock?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exTryAcquireSpinLockSharedAtDpcLevel(spinlock: COpaquePointer?): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exTryAcquireSpinLockSharedAtDpcLevel((spinlock?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exTryConvertSharedSpinLockExclusive(spinlock: COpaquePointer?): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exTryConvertSharedSpinLockExclusive((spinlock?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exTryToAcquireFastMutex(fastmutex: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exTryToAcquireFastMutex((fastmutex?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exUnregisterCallback(callbackregistration: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exUnregisterCallback((callbackregistration?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exUuidCreate(uuid: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exUuidCreate((uuid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exVerifySuite(suitetype: SuiteType): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_exVerifySuite(suitetype) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exWaitForRundownProtectionRelease(runref: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exWaitForRundownProtectionRelease((runref?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun exWaitForRundownProtectionReleaseCacheAware(runref: PexRundownRefCacheAware) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_exWaitForRundownProtectionReleaseCacheAware(runref.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fsRtlIsTotalDeviceFailure(status: Ntstatus): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_fsRtlIsTotalDeviceFailure(status) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halAcquireDisplayOwnership(resetdisplayparameters: PhalResetDisplayParameters) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_halAcquireDisplayOwnership(0L.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun halAllocateAdapterChannel(adapterobject: COpaquePointer?, wcb: COpaquePointer?, numberofmapregisters: UInt, executionroutine: DriverControl): Ntstatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halAllocateCommonBuffer(adapterobject: COpaquePointer?, length: UInt, logicaladdress: COpaquePointer?, cacheenabled: Boolean): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_halAllocateCommonBuffer((adapterobject?.value ?: 0L).toString(), length.toInt(), (logicaladdress?.value ?: 0L).toString(), cacheenabled).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halAllocateCrashDumpRegisters(adapterobject: COpaquePointer?, numberofmapregisters: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_halAllocateCrashDumpRegisters((adapterobject?.value ?: 0L).toString(), (numberofmapregisters?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halAllocateHardwareCounters(groupaffinty: COpaquePointer?, groupcount: UInt, resourcelist: COpaquePointer?, countersethandle: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_halAllocateHardwareCounters((groupaffinty?.value ?: 0L).toString(), groupcount.toInt(), (resourcelist?.value ?: 0L).toString(), (countersethandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halAssignSlotResources(registrypath: COpaquePointer?, driverclassname: COpaquePointer?, driverobject: COpaquePointer?, deviceobject: COpaquePointer?, bustype: InterfaceType, busnumber: UInt, slotnumber: UInt, allocatedresources: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_halAssignSlotResources((registrypath?.value ?: 0L).toString(), (driverclassname?.value ?: 0L).toString(), (driverobject?.value ?: 0L).toString(), (deviceobject?.value ?: 0L).toString(), bustype, busnumber.toInt(), slotnumber.toInt(), (allocatedresources?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halBugCheckSystem(errorsource: COpaquePointer?, errorrecord: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_halBugCheckSystem((errorsource?.value ?: 0L).toString(), (errorrecord?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun halDmaAllocateCrashDumpRegistersEx(adapter: COpaquePointer?, numberofmapregisters: UInt, type: HalDmaCrashDumpRegisterType, mapregisterbase: COpaquePointer?, mapregistersavailable: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_halDmaAllocateCrashDumpRegistersEx((adapter?.value ?: 0L).toString(), numberofmapregisters.toInt(), type, (mapregisterbase?.value ?: 0L).toString(), (mapregistersavailable?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halDmaFreeCrashDumpRegistersEx(adapter: COpaquePointer?, type: HalDmaCrashDumpRegisterType): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_halDmaFreeCrashDumpRegistersEx((adapter?.value ?: 0L).toString(), type) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halExamineMBR(deviceobject: COpaquePointer?, sectorsize: UInt, mbrtypeidentifier: UInt, buffer: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_halExamineMBR((deviceobject?.value ?: 0L).toString(), sectorsize.toInt(), mbrtypeidentifier.toInt(), (buffer?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun halFreeCommonBuffer(adapterobject: COpaquePointer?, length: UInt, logicaladdress: Long, virtualaddress: COpaquePointer?, cacheenabled: Boolean) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_halFreeCommonBuffer((adapterobject?.value ?: 0L).toString(), length.toInt(), logicaladdress.toString(), (virtualaddress?.value ?: 0L).toString(), cacheenabled)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun halFreeHardwareCounters(countersethandle: Handle): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_halFreeHardwareCounters((countersethandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halGetAdapter(devicedescription: COpaquePointer?, numberofmapregisters: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_halGetAdapter((devicedescription?.value ?: 0L).toString(), (numberofmapregisters?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halGetBusData(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: COpaquePointer?, length: UInt): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_halGetBusData(busdatatype, busnumber.toInt(), slotnumber.toInt(), (buffer?.value ?: 0L).toString(), length.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halGetBusDataByOffset(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: COpaquePointer?, offset: UInt, length: UInt): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_halGetBusDataByOffset(busdatatype, busnumber.toInt(), slotnumber.toInt(), (buffer?.value ?: 0L).toString(), offset.toInt(), length.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halGetInterruptVector(interfacetype: InterfaceType, busnumber: UInt, businterruptlevel: UInt, businterruptvector: UInt, irql: COpaquePointer?, affinity: COpaquePointer?): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_halGetInterruptVector(interfacetype, busnumber.toInt(), businterruptlevel.toInt(), businterruptvector.toInt(), (irql?.value ?: 0L).toString(), (affinity?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halMakeBeep(frequency: UInt): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_halMakeBeep(frequency.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halReadDmaCounter(adapterobject: COpaquePointer?): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_halReadDmaCounter((adapterobject?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halSetBusData(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: COpaquePointer?, length: UInt): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_halSetBusData(busdatatype, busnumber.toInt(), slotnumber.toInt(), (buffer?.value ?: 0L).toString(), length.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halSetBusDataByOffset(busdatatype: BusDataType, busnumber: UInt, slotnumber: UInt, buffer: COpaquePointer?, offset: UInt, length: UInt): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_halSetBusDataByOffset(busdatatype, busnumber.toInt(), slotnumber.toInt(), (buffer?.value ?: 0L).toString(), offset.toInt(), length.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun halTranslateBusAddress(interfacetype: InterfaceType, busnumber: UInt, busaddress: Long, addressspace: COpaquePointer?, translatedaddress: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_halTranslateBusAddress(interfacetype, busnumber.toInt(), busaddress.toString(), (addressspace?.value ?: 0L).toString(), (translatedaddress?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hvlRegisterWheaErrorNotification(callback: PhvlWheaErrorNotification): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_hvlRegisterWheaErrorNotification(0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hvlUnregisterWheaErrorNotification(callback: PhvlWheaErrorNotification): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_hvlUnregisterWheaErrorNotification(0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAcquireCancelSpinLock(irql: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioAcquireCancelSpinLock((irql?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioAcquireKsrPersistentMemory(driverobject: COpaquePointer?, physicaldeviceobject: COpaquePointer?, buffer: COpaquePointer?, size: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioAcquireKsrPersistentMemory((driverobject?.value ?: 0L).toString(), (physicaldeviceobject?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (size?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAcquireKsrPersistentMemoryEx(driverobject: COpaquePointer?, physicaldeviceobject: COpaquePointer?, physicaldeviceid: COpaquePointer?, datatag: COpaquePointer?, dataversion: COpaquePointer?, buffer: COpaquePointer?, size: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioAcquireKsrPersistentMemoryEx((driverobject?.value ?: 0L).toString(), (physicaldeviceobject?.value ?: 0L).toString(), (physicaldeviceid?.value ?: 0L).toString(), (datatag?.value ?: 0L).toString(), (dataversion?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (size?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAcquireRemoveLockEx(removelock: COpaquePointer?, tag: COpaquePointer?, file: Pcstr, line: UInt, remlocksize: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioAcquireRemoveLockEx((removelock?.value ?: 0L).toString(), (tag?.value ?: 0L).toString(), (file?.value ?: 0L).toString(), line.toInt(), remlocksize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAllocateAdapterChannel(adapterobject: COpaquePointer?, deviceobject: COpaquePointer?, numberofmapregisters: UInt, executionroutine: DriverControl, context: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAllocateController(controllerobject: COpaquePointer?, deviceobject: COpaquePointer?, executionroutine: DriverControl, context: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun ioAllocateDriverObjectExtension(driverobject: COpaquePointer?, clientidentificationaddress: COpaquePointer?, driverobjectextensionsize: UInt, driverobjectextension: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioAllocateDriverObjectExtension((driverobject?.value ?: 0L).toString(), (clientidentificationaddress?.value ?: 0L).toString(), driverobjectextensionsize.toInt(), (driverobjectextension?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAllocateErrorLogEntry(ioobject: COpaquePointer?, entrysize: UByte): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioAllocateErrorLogEntry((ioobject?.value ?: 0L).toString(), entrysize.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAllocateIrp(stacksize: Byte, chargequota: Boolean): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioAllocateIrp(stacksize.toInt(), chargequota).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAllocateIrpEx(deviceobject: COpaquePointer?, stacksize: Byte, chargequota: Boolean): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioAllocateIrpEx((deviceobject?.value ?: 0L).toString(), stacksize.toInt(), chargequota).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAllocateMdl(virtualaddress: COpaquePointer?, length: UInt, secondarybuffer: Boolean, chargequota: Boolean, irp: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioAllocateMdl((virtualaddress?.value ?: 0L).toString(), length.toInt(), secondarybuffer, chargequota, (irp?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAllocateSfioStreamIdentifier(fileobject: COpaquePointer?, length: UInt, signature: COpaquePointer?, streamidentifier: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioAllocateSfioStreamIdentifier((fileobject?.value ?: 0L).toString(), length.toInt(), (signature?.value ?: 0L).toString(), (streamidentifier?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAllocateWorkItem(deviceobject: COpaquePointer?): PioWorkitem =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioAllocateWorkItem((deviceobject?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAssignResources(registrypath: COpaquePointer?, driverclassname: COpaquePointer?, driverobject: COpaquePointer?, deviceobject: COpaquePointer?, requestedresources: COpaquePointer?, allocatedresources: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioAssignResources((registrypath?.value ?: 0L).toString(), (driverclassname?.value ?: 0L).toString(), (driverobject?.value ?: 0L).toString(), (deviceobject?.value ?: 0L).toString(), (requestedresources?.value ?: 0L).toString(), (allocatedresources?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAttachDevice(sourcedevice: COpaquePointer?, targetdevice: COpaquePointer?, attacheddevice: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioAttachDevice((sourcedevice?.value ?: 0L).toString(), (targetdevice?.value ?: 0L).toString(), (attacheddevice?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAttachDeviceByPointer(sourcedevice: COpaquePointer?, targetdevice: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioAttachDeviceByPointer((sourcedevice?.value ?: 0L).toString(), (targetdevice?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAttachDeviceToDeviceStack(sourcedevice: COpaquePointer?, targetdevice: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioAttachDeviceToDeviceStack((sourcedevice?.value ?: 0L).toString(), (targetdevice?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioAttachDeviceToDeviceStackSafe(sourcedevice: COpaquePointer?, targetdevice: COpaquePointer?, attachedtodeviceobject: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioAttachDeviceToDeviceStackSafe((sourcedevice?.value ?: 0L).toString(), (targetdevice?.value ?: 0L).toString(), (attachedtodeviceobject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioBuildAsynchronousFsdRequest(majorfunction: UInt, deviceobject: COpaquePointer?, buffer: COpaquePointer?, length: UInt, startingoffset: COpaquePointer?, iostatusblock: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioBuildAsynchronousFsdRequest(majorfunction.toInt(), (deviceobject?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), length.toInt(), (startingoffset?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioBuildDeviceIoControlRequest(iocontrolcode: UInt, deviceobject: COpaquePointer?, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt, internaldeviceiocontrol: Boolean, event: COpaquePointer?, iostatusblock: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioBuildDeviceIoControlRequest(iocontrolcode.toInt(), (deviceobject?.value ?: 0L).toString(), (inputbuffer?.value ?: 0L).toString(), inputbufferlength.toInt(), (outputbuffer?.value ?: 0L).toString(), outputbufferlength.toInt(), internaldeviceiocontrol, (event?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioBuildPartialMdl(sourcemdl: COpaquePointer?, targetmdl: COpaquePointer?, virtualaddress: COpaquePointer?, length: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioBuildPartialMdl((sourcemdl?.value ?: 0L).toString(), (targetmdl?.value ?: 0L).toString(), (virtualaddress?.value ?: 0L).toString(), length.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioBuildSynchronousFsdRequest(majorfunction: UInt, deviceobject: COpaquePointer?, buffer: COpaquePointer?, length: UInt, startingoffset: COpaquePointer?, event: COpaquePointer?, iostatusblock: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioBuildSynchronousFsdRequest(majorfunction.toInt(), (deviceobject?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), length.toInt(), (startingoffset?.value ?: 0L).toString(), (event?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCancelFileOpen(deviceobject: COpaquePointer?, fileobject: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioCancelFileOpen((deviceobject?.value ?: 0L).toString(), (fileobject?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioCancelIrp(irp: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioCancelIrp((irp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCheckLinkShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: COpaquePointer?, shareaccess: COpaquePointer?, linkshareaccess: COpaquePointer?, ioshareaccessflags: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioCheckLinkShareAccess(desiredaccess.toInt(), desiredshareaccess.toInt(), (fileobject?.value ?: 0L).toString(), (shareaccess?.value ?: 0L).toString(), (linkshareaccess?.value ?: 0L).toString(), ioshareaccessflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCheckShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: COpaquePointer?, shareaccess: COpaquePointer?, update: Boolean): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioCheckShareAccess(desiredaccess.toInt(), desiredshareaccess.toInt(), (fileobject?.value ?: 0L).toString(), (shareaccess?.value ?: 0L).toString(), update) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCheckShareAccessEx(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: COpaquePointer?, shareaccess: COpaquePointer?, update: Boolean, writepermission: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioCheckShareAccessEx(desiredaccess.toInt(), desiredshareaccess.toInt(), (fileobject?.value ?: 0L).toString(), (shareaccess?.value ?: 0L).toString(), update, (writepermission?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCleanupIrp(irp: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioCleanupIrp((irp?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioClearActivityIdThread(originalid: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioClearActivityIdThread((originalid?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioClearIrpExtraCreateParameter(irp: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioClearIrpExtraCreateParameter((irp?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioConnectInterrupt(interruptobject: COpaquePointer?, serviceroutine: PkserviceRoutine, servicecontext: COpaquePointer?, spinlock: COpaquePointer?, vector: UInt, irql: UByte, synchronizeirql: UByte, interruptmode: KinterruptMode, sharevector: Boolean, processorenablemask: ULong, floatingsave: Boolean): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioConnectInterrupt((interruptobject?.value ?: 0L).toString(), 0L.toString(), (servicecontext?.value ?: 0L).toString(), (spinlock?.value ?: 0L).toString(), vector.toInt(), irql.toInt(), synchronizeirql.toInt(), interruptmode, sharevector, processorenablemask.toString(), floatingsave) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioConnectInterruptEx(parameters: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioConnectInterruptEx((parameters?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateController(size: UInt): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioCreateController(size.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateDevice(driverobject: COpaquePointer?, deviceextensionsize: UInt, devicename: COpaquePointer?, devicetype: UInt, devicecharacteristics: UInt, exclusive: Boolean, deviceobject: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioCreateDevice((driverobject?.value ?: 0L).toString(), deviceextensionsize.toInt(), (devicename?.value ?: 0L).toString(), devicetype.toInt(), devicecharacteristics.toInt(), exclusive, (deviceobject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateDisk(deviceobject: COpaquePointer?, disk: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioCreateDisk((deviceobject?.value ?: 0L).toString(), (disk?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateFile(filehandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, allocationsize: COpaquePointer?, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: COpaquePointer?, ealength: UInt, createfiletype: CreateFileType, internalparameters: COpaquePointer?, options: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioCreateFile((filehandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), (allocationsize?.value ?: 0L).toString(), fileattributes.toInt(), shareaccess.toInt(), disposition.toInt(), createoptions.toInt(), (eabuffer?.value ?: 0L).toString(), ealength.toInt(), createfiletype, (internalparameters?.value ?: 0L).toString(), options.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateFileEx(filehandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, allocationsize: COpaquePointer?, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: COpaquePointer?, ealength: UInt, createfiletype: CreateFileType, internalparameters: COpaquePointer?, options: UInt, drivercontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioCreateFileEx((filehandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), (allocationsize?.value ?: 0L).toString(), fileattributes.toInt(), shareaccess.toInt(), disposition.toInt(), createoptions.toInt(), (eabuffer?.value ?: 0L).toString(), ealength.toInt(), createfiletype, (internalparameters?.value ?: 0L).toString(), options.toInt(), (drivercontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateFileSpecifyDeviceObjectHint(filehandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, allocationsize: COpaquePointer?, fileattributes: UInt, shareaccess: UInt, disposition: UInt, createoptions: UInt, eabuffer: COpaquePointer?, ealength: UInt, createfiletype: CreateFileType, internalparameters: COpaquePointer?, options: UInt, deviceobject: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioCreateFileSpecifyDeviceObjectHint((filehandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), (allocationsize?.value ?: 0L).toString(), fileattributes.toInt(), shareaccess.toInt(), disposition.toInt(), createoptions.toInt(), (eabuffer?.value ?: 0L).toString(), ealength.toInt(), createfiletype, (internalparameters?.value ?: 0L).toString(), options.toInt(), (deviceobject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateNotificationEvent(eventname: COpaquePointer?, eventhandle: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioCreateNotificationEvent((eventname?.value ?: 0L).toString(), (eventhandle?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateSymbolicLink(symboliclinkname: COpaquePointer?, devicename: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioCreateSymbolicLink((symboliclinkname?.value ?: 0L).toString(), (devicename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateSynchronizationEvent(eventname: COpaquePointer?, eventhandle: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioCreateSynchronizationEvent((eventname?.value ?: 0L).toString(), (eventhandle?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateSystemThread(ioobject: COpaquePointer?, threadhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, processhandle: Handle, clientid: COpaquePointer?, startroutine: PkstartRoutine, startcontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioCreateSystemThread((ioobject?.value ?: 0L).toString(), (threadhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), (processhandle?.value ?: 0L).toString(), (clientid?.value ?: 0L).toString(), 0L.toString(), (startcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCreateUnprotectedSymbolicLink(symboliclinkname: COpaquePointer?, devicename: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioCreateUnprotectedSymbolicLink((symboliclinkname?.value ?: 0L).toString(), (devicename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCsqInitialize(csq: COpaquePointer?, csqinsertirp: PioCsqInsertIrp, csqremoveirp: PioCsqRemoveIrp, csqpeeknextirp: PioCsqPeekNextIrp, csqacquirelock: PioCsqAcquireLock, csqreleaselock: PioCsqReleaseLock, csqcompletecanceledirp: PioCsqCompleteCanceledIrp): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioCsqInitialize((csq?.value ?: 0L).toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCsqInitializeEx(csq: COpaquePointer?, csqinsertirp: PioCsqInsertIrpEx, csqremoveirp: PioCsqRemoveIrp, csqpeeknextirp: PioCsqPeekNextIrp, csqacquirelock: PioCsqAcquireLock, csqreleaselock: PioCsqReleaseLock, csqcompletecanceledirp: PioCsqCompleteCanceledIrp): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioCsqInitializeEx((csq?.value ?: 0L).toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCsqInsertIrp(csq: COpaquePointer?, irp: COpaquePointer?, context: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioCsqInsertIrp((csq?.value ?: 0L).toString(), (irp?.value ?: 0L).toString(), (context?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioCsqInsertIrpEx(csq: COpaquePointer?, irp: COpaquePointer?, context: COpaquePointer?, insertcontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioCsqInsertIrpEx((csq?.value ?: 0L).toString(), (irp?.value ?: 0L).toString(), (context?.value ?: 0L).toString(), (insertcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCsqRemoveIrp(csq: COpaquePointer?, context: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioCsqRemoveIrp((csq?.value ?: 0L).toString(), (context?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioCsqRemoveNextIrp(csq: COpaquePointer?, peekcontext: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioCsqRemoveNextIrp((csq?.value ?: 0L).toString(), (peekcontext?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioDecrementKeepAliveCount(fileobject: COpaquePointer?, process: Peprocess): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioDecrementKeepAliveCount((fileobject?.value ?: 0L).toString(), process.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioDeleteController(controllerobject: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioDeleteController((controllerobject?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioDeleteDevice(deviceobject: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioDeleteDevice((deviceobject?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioDeleteSymbolicLink(symboliclinkname: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioDeleteSymbolicLink((symboliclinkname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioDetachDevice(targetdevice: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioDetachDevice((targetdevice?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioDisconnectInterrupt(interruptobject: Pkinterrupt) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioDisconnectInterrupt(interruptobject.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioDisconnectInterruptEx(parameters: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioDisconnectInterruptEx((parameters?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioEnumerateKsrPersistentMemoryEx(driverobject: COpaquePointer?, physicaldeviceobject: COpaquePointer?, physicaldeviceid: COpaquePointer?, callback: PioPersistedMemoryEnumerationCallback, callbackcontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioEnumerateKsrPersistentMemoryEx((driverobject?.value ?: 0L).toString(), (physicaldeviceobject?.value ?: 0L).toString(), (physicaldeviceid?.value ?: 0L).toString(), 0L.toString(), (callbackcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioFlushAdapterBuffers(adapterobject: COpaquePointer?, mdl: COpaquePointer?, mapregisterbase: COpaquePointer?, currentva: COpaquePointer?, length: UInt, writetodevice: Boolean): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioFlushAdapterBuffers((adapterobject?.value ?: 0L).toString(), (mdl?.value ?: 0L).toString(), (mapregisterbase?.value ?: 0L).toString(), (currentva?.value ?: 0L).toString(), length.toInt(), writetodevice) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioForwardIrpSynchronously(deviceobject: COpaquePointer?, irp: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioForwardIrpSynchronously((deviceobject?.value ?: 0L).toString(), (irp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioFreeAdapterChannel(adapterobject: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioFreeAdapterChannel((adapterobject?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioFreeController(controllerobject: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioFreeController((controllerobject?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioFreeErrorLogEntry(elentry: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioFreeErrorLogEntry((elentry?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioFreeIrp(irp: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioFreeIrp((irp?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioFreeKsrPersistentMemory(datahandle: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioFreeKsrPersistentMemory((datahandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioFreeMapRegisters(adapterobject: COpaquePointer?, mapregisterbase: COpaquePointer?, numberofmapregisters: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioFreeMapRegisters((adapterobject?.value ?: 0L).toString(), (mapregisterbase?.value ?: 0L).toString(), numberofmapregisters.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioFreeMdl(mdl: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioFreeMdl((mdl?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioFreeSfioStreamIdentifier(fileobject: COpaquePointer?, signature: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioFreeSfioStreamIdentifier((fileobject?.value ?: 0L).toString(), (signature?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioFreeWorkItem(ioworkitem: PioWorkitem) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioFreeWorkItem(ioworkitem.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioGetActivityIdIrp(irp: COpaquePointer?, guid: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioGetActivityIdIrp((irp?.value ?: 0L).toString(), (guid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetActivityIdThread(): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioGetActivityIdThread().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetAffinityInterrupt(interruptobject: Pkinterrupt, groupaffinity: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioGetAffinityInterrupt(interruptobject.toString(), (groupaffinity?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetAttachedDeviceReference(deviceobject: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioGetAttachedDeviceReference((deviceobject?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetBootDiskInformation(bootdiskinformation: COpaquePointer?, size: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioGetBootDiskInformation((bootdiskinformation?.value ?: 0L).toString(), size.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetBootDiskInformationLite(bootdiskinformation: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioGetBootDiskInformationLite((bootdiskinformation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetConfigurationInformation(): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioGetConfigurationInformation().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetContainerInformation(informationclass: IoContainerInformationClass, containerobject: COpaquePointer?, buffer: COpaquePointer?, bufferlength: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioGetContainerInformation(informationclass, (containerobject?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), bufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetCurrentProcess(): Peprocess =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioGetCurrentProcess().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetDeviceDirectory(physicaldeviceobject: COpaquePointer?, directorytype: DeviceDirectoryType, flags: UInt, reserved: COpaquePointer?, devicedirectoryhandle: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioGetDeviceDirectory((physicaldeviceobject?.value ?: 0L).toString(), directorytype, flags.toInt(), (reserved?.value ?: 0L).toString(), (devicedirectoryhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetDeviceInterfaceAlias(symboliclinkname: COpaquePointer?, aliasinterfaceclassguid: COpaquePointer?, aliassymboliclinkname: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioGetDeviceInterfaceAlias((symboliclinkname?.value ?: 0L).toString(), (aliasinterfaceclassguid?.value ?: 0L).toString(), (aliassymboliclinkname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetDeviceInterfacePropertyData(symboliclinkname: COpaquePointer?, propertykey: COpaquePointer?, lcid: UInt, flags: UInt, size: UInt, data: COpaquePointer?, requiredsize: COpaquePointer?, type: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioGetDeviceInterfacePropertyData((symboliclinkname?.value ?: 0L).toString(), (propertykey?.value ?: 0L).toString(), lcid.toInt(), flags.toInt(), size.toInt(), (data?.value ?: 0L).toString(), (requiredsize?.value ?: 0L).toString(), (type?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetDeviceInterfaces(interfaceclassguid: COpaquePointer?, physicaldeviceobject: COpaquePointer?, flags: UInt, symboliclinklist: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioGetDeviceInterfaces((interfaceclassguid?.value ?: 0L).toString(), (physicaldeviceobject?.value ?: 0L).toString(), flags.toInt(), (symboliclinklist?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetDeviceNumaNode(pdo: COpaquePointer?, nodenumber: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioGetDeviceNumaNode((pdo?.value ?: 0L).toString(), (nodenumber?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetDeviceObjectPointer(objectname: COpaquePointer?, desiredaccess: UInt, fileobject: COpaquePointer?, deviceobject: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioGetDeviceObjectPointer((objectname?.value ?: 0L).toString(), desiredaccess.toInt(), (fileobject?.value ?: 0L).toString(), (deviceobject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetDeviceProperty(deviceobject: COpaquePointer?, deviceproperty: DeviceRegistryProperty, bufferlength: UInt, propertybuffer: COpaquePointer?, resultlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioGetDeviceProperty((deviceobject?.value ?: 0L).toString(), deviceproperty, bufferlength.toInt(), (propertybuffer?.value ?: 0L).toString(), (resultlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetDevicePropertyData(pdo: COpaquePointer?, propertykey: COpaquePointer?, lcid: UInt, flags: UInt, size: UInt, data: COpaquePointer?, requiredsize: COpaquePointer?, type: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioGetDevicePropertyData((pdo?.value ?: 0L).toString(), (propertykey?.value ?: 0L).toString(), lcid.toInt(), flags.toInt(), size.toInt(), (data?.value ?: 0L).toString(), (requiredsize?.value ?: 0L).toString(), (type?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetDmaAdapter(physicaldeviceobject: COpaquePointer?, devicedescription: COpaquePointer?, numberofmapregisters: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioGetDmaAdapter((physicaldeviceobject?.value ?: 0L).toString(), (devicedescription?.value ?: 0L).toString(), (numberofmapregisters?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetDriverDirectory(driverobject: COpaquePointer?, directorytype: DriverDirectoryType, flags: UInt, driverdirectoryhandle: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioGetDriverDirectory((driverobject?.value ?: 0L).toString(), directorytype, flags.toInt(), (driverdirectoryhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetDriverObjectExtension(driverobject: COpaquePointer?, clientidentificationaddress: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioGetDriverObjectExtension((driverobject?.value ?: 0L).toString(), (clientidentificationaddress?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetFileObjectGenericMapping(): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioGetFileObjectGenericMapping().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetFsZeroingOffset(irp: COpaquePointer?, zeroingoffset: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioGetFsZeroingOffset((irp?.value ?: 0L).toString(), (zeroingoffset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetInitialStack(): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioGetInitialStack().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetInitiatorProcess(fileobject: COpaquePointer?): Peprocess =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioGetInitiatorProcess((fileobject?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetIoAttributionHandle(irp: COpaquePointer?, ioattributionhandle: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioGetIoAttributionHandle((irp?.value ?: 0L).toString(), (ioattributionhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetIoPriorityHint(irp: COpaquePointer?): IoPriorityHint =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioGetIoPriorityHint((irp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetIommuInterface(version: UInt, interfaceout: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioGetIommuInterface(version.toInt(), (interfaceout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetIommuInterfaceEx(version: UInt, flags: ULong, interfaceout: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioGetIommuInterfaceEx(version.toInt(), flags.toString(), (interfaceout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetIrpExtraCreateParameter(irp: COpaquePointer?, extracreateparameter: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioGetIrpExtraCreateParameter((irp?.value ?: 0L).toString(), (extracreateparameter?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetPagingIoPriority(irp: COpaquePointer?): IoPagingPriority =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioGetPagingIoPriority((irp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetRelatedDeviceObject(fileobject: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioGetRelatedDeviceObject((fileobject?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetSfioStreamIdentifier(fileobject: COpaquePointer?, signature: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioGetSfioStreamIdentifier((fileobject?.value ?: 0L).toString(), (signature?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetSilo(fileobject: COpaquePointer?): Pesilo =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioGetSilo((fileobject?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetSiloParameters(fileobject: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioGetSiloParameters((fileobject?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetStackLimits(lowlimit: COpaquePointer?, highlimit: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioGetStackLimits((lowlimit?.value ?: 0L).toString(), (highlimit?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioGetTopLevelIrp(): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioGetTopLevelIrp().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioGetTransactionParameterBlock(fileobject: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioGetTransactionParameterBlock((fileobject?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioIncrementKeepAliveCount(fileobject: COpaquePointer?, process: Peprocess): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioIncrementKeepAliveCount((fileobject?.value ?: 0L).toString(), process.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioInitializeIrp(irp: COpaquePointer?, packetsize: UShort, stacksize: Byte) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioInitializeIrp((irp?.value ?: 0L).toString(), packetsize.toInt(), stacksize.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioInitializeIrpEx(irp: COpaquePointer?, deviceobject: COpaquePointer?, packetsize: UShort, stacksize: Byte) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioInitializeIrpEx((irp?.value ?: 0L).toString(), (deviceobject?.value ?: 0L).toString(), packetsize.toInt(), stacksize.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioInitializeRemoveLockEx(lock: COpaquePointer?, allocatetag: UInt, maxlockedminutes: UInt, highwatermark: UInt, remlocksize: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioInitializeRemoveLockEx((lock?.value ?: 0L).toString(), allocatetag.toInt(), maxlockedminutes.toInt(), highwatermark.toInt(), remlocksize.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioInitializeTimer(deviceobject: COpaquePointer?, timerroutine: PioTimerRoutine, context: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioInitializeTimer((deviceobject?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioInitializeWorkItem(ioobject: COpaquePointer?, ioworkitem: PioWorkitem) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioInitializeWorkItem((ioobject?.value ?: 0L).toString(), ioworkitem.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioInvalidateDeviceRelations(deviceobject: COpaquePointer?, type: DeviceRelationType) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioInvalidateDeviceRelations((deviceobject?.value ?: 0L).toString(), type)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioInvalidateDeviceState(physicaldeviceobject: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioInvalidateDeviceState((physicaldeviceobject?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioIs32bitProcess(irp: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioIs32bitProcess((irp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioIsFileObjectIgnoringSharing(fileobject: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioIsFileObjectIgnoringSharing((fileobject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioIsFileOriginRemote(fileobject: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioIsFileOriginRemote((fileobject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioIsInitiator32bitProcess(irp: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioIsInitiator32bitProcess((irp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioIsValidIrpStatus(status: Ntstatus): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioIsValidIrpStatus(status).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioIsWdmVersionAvailable(majorversion: UByte, minorversion: UByte): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioIsWdmVersionAvailable(majorversion.toInt(), minorversion.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioMakeAssociatedIrp(irp: COpaquePointer?, stacksize: Byte): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioMakeAssociatedIrp((irp?.value ?: 0L).toString(), stacksize.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioMakeAssociatedIrpEx(irp: COpaquePointer?, deviceobject: COpaquePointer?, stacksize: Byte): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioMakeAssociatedIrpEx((irp?.value ?: 0L).toString(), (deviceobject?.value ?: 0L).toString(), stacksize.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioMapTransfer(adapterobject: COpaquePointer?, mdl: COpaquePointer?, mapregisterbase: COpaquePointer?, currentva: COpaquePointer?, length: COpaquePointer?, writetodevice: Boolean): Long =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioMapTransfer((adapterobject?.value ?: 0L).toString(), (mdl?.value ?: 0L).toString(), (mapregisterbase?.value ?: 0L).toString(), (currentva?.value ?: 0L).toString(), (length?.value ?: 0L).toString(), writetodevice).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioOpenDeviceInterfaceRegistryKey(symboliclinkname: COpaquePointer?, desiredaccess: UInt, deviceinterfaceregkey: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioOpenDeviceInterfaceRegistryKey((symboliclinkname?.value ?: 0L).toString(), desiredaccess.toInt(), (deviceinterfaceregkey?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioOpenDeviceRegistryKey(deviceobject: COpaquePointer?, devinstkeytype: UInt, desiredaccess: UInt, deviceregkey: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioOpenDeviceRegistryKey((deviceobject?.value ?: 0L).toString(), devinstkeytype.toInt(), desiredaccess.toInt(), (deviceregkey?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioOpenDriverRegistryKey(driverobject: COpaquePointer?, regkeytype: DriverRegkeyType, desiredaccess: UInt, flags: UInt, driverregkey: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioOpenDriverRegistryKey((driverobject?.value ?: 0L).toString(), regkeytype, desiredaccess.toInt(), flags.toInt(), (driverregkey?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioPropagateActivityIdToThread(irp: COpaquePointer?, propagatedid: COpaquePointer?, originalid: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioPropagateActivityIdToThread((irp?.value ?: 0L).toString(), (propagatedid?.value ?: 0L).toString(), (originalid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioQueryDeviceDescription(bustype: COpaquePointer?, busnumber: COpaquePointer?, controllertype: COpaquePointer?, controllernumber: COpaquePointer?, peripheraltype: COpaquePointer?, peripheralnumber: COpaquePointer?, calloutroutine: PioQueryDeviceRoutine, context: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioQueryDeviceDescription((bustype?.value ?: 0L).toString(), (busnumber?.value ?: 0L).toString(), (controllertype?.value ?: 0L).toString(), (controllernumber?.value ?: 0L).toString(), (peripheraltype?.value ?: 0L).toString(), (peripheralnumber?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioQueryFullDriverPath(driverobject: COpaquePointer?, fullpath: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioQueryFullDriverPath((driverobject?.value ?: 0L).toString(), (fullpath?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioQueryInformationByName(objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass, options: UInt, drivercontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioQueryInformationByName((objectattributes?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), (fileinformation?.value ?: 0L).toString(), length.toInt(), fileinformationclass, options.toInt(), (drivercontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioQueryKsrPersistentMemorySize(driverobject: COpaquePointer?, physicaldeviceobject: COpaquePointer?, buffersize: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioQueryKsrPersistentMemorySize((driverobject?.value ?: 0L).toString(), (physicaldeviceobject?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioQueryKsrPersistentMemorySizeEx(driverobject: COpaquePointer?, physicaldeviceobject: COpaquePointer?, physicaldeviceid: COpaquePointer?, datatag: COpaquePointer?, dataversion: COpaquePointer?, buffersize: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioQueryKsrPersistentMemorySizeEx((driverobject?.value ?: 0L).toString(), (physicaldeviceobject?.value ?: 0L).toString(), (physicaldeviceid?.value ?: 0L).toString(), (datatag?.value ?: 0L).toString(), (dataversion?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioQueueWorkItem(ioworkitem: PioWorkitem, workerroutine: PioWorkitemRoutine, queuetype: WorkQueueType, context: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioQueueWorkItem(ioworkitem.toString(), 0L.toString(), queuetype, (context?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioQueueWorkItemEx(ioworkitem: PioWorkitem, workerroutine: PioWorkitemRoutineEx, queuetype: WorkQueueType, context: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioQueueWorkItemEx(ioworkitem.toString(), 0L.toString(), queuetype, (context?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioRaiseHardError(irp: COpaquePointer?, vpb: COpaquePointer?, realdeviceobject: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioRaiseHardError((irp?.value ?: 0L).toString(), (vpb?.value ?: 0L).toString(), (realdeviceobject?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioRaiseInformationalHardError(errorstatus: Ntstatus, string: COpaquePointer?, thread: Pkthread): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioRaiseInformationalHardError(errorstatus, (string?.value ?: 0L).toString(), thread.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioReadDiskSignature(deviceobject: COpaquePointer?, bytespersector: UInt, signature: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioReadDiskSignature((deviceobject?.value ?: 0L).toString(), bytespersector.toInt(), (signature?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioReadPartitionTable(deviceobject: COpaquePointer?, sectorsize: UInt, returnrecognizedpartitions: Boolean, partitionbuffer: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioReadPartitionTable((deviceobject?.value ?: 0L).toString(), sectorsize.toInt(), returnrecognizedpartitions, (partitionbuffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioReadPartitionTableEx(deviceobject: COpaquePointer?, drivelayout: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioReadPartitionTableEx((deviceobject?.value ?: 0L).toString(), (drivelayout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioRecordIoAttribution(opaquehandle: COpaquePointer?, attributioninformation: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioRecordIoAttribution((opaquehandle?.value ?: 0L).toString(), (attributioninformation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioRegisterBootDriverCallback(callbackfunction: PbootDriverCallbackFunction, callbackcontext: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioRegisterBootDriverCallback(0L.toString(), (callbackcontext?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioRegisterBootDriverReinitialization(driverobject: COpaquePointer?, driverreinitializationroutine: DriverReinitialize, context: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun ioRegisterContainerNotification(notificationclass: IoContainerNotificationClass, callbackfunction: PioContainerNotificationFunction, notificationinformation: COpaquePointer?, notificationinformationlength: UInt, callbackregistration: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioRegisterContainerNotification(notificationclass, 0L.toString(), (notificationinformation?.value ?: 0L).toString(), notificationinformationlength.toInt(), (callbackregistration?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioRegisterDeviceInterface(physicaldeviceobject: COpaquePointer?, interfaceclassguid: COpaquePointer?, referencestring: COpaquePointer?, symboliclinkname: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioRegisterDeviceInterface((physicaldeviceobject?.value ?: 0L).toString(), (interfaceclassguid?.value ?: 0L).toString(), (referencestring?.value ?: 0L).toString(), (symboliclinkname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioRegisterDriverReinitialization(driverobject: COpaquePointer?, driverreinitializationroutine: DriverReinitialize, context: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun ioRegisterLastChanceShutdownNotification(deviceobject: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioRegisterLastChanceShutdownNotification((deviceobject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioRegisterPlugPlayNotification(eventcategory: IoNotificationEventCategory, eventcategoryflags: UInt, eventcategorydata: COpaquePointer?, driverobject: COpaquePointer?, callbackroutine: DriverNotificationCallbackRoutine, context: COpaquePointer?, notificationentry: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioRegisterPlugPlayNotification(eventcategory, eventcategoryflags.toInt(), (eventcategorydata?.value ?: 0L).toString(), (driverobject?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString(), (notificationentry?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioRegisterShutdownNotification(deviceobject: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioRegisterShutdownNotification((deviceobject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioReleaseCancelSpinLock(irql: UByte) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioReleaseCancelSpinLock(irql.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioReleaseRemoveLockAndWaitEx(removelock: COpaquePointer?, tag: COpaquePointer?, remlocksize: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioReleaseRemoveLockAndWaitEx((removelock?.value ?: 0L).toString(), (tag?.value ?: 0L).toString(), remlocksize.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioReleaseRemoveLockEx(removelock: COpaquePointer?, tag: COpaquePointer?, remlocksize: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioReleaseRemoveLockEx((removelock?.value ?: 0L).toString(), (tag?.value ?: 0L).toString(), remlocksize.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioRemoveLinkShareAccess(fileobject: COpaquePointer?, shareaccess: COpaquePointer?, linkshareaccess: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioRemoveLinkShareAccess((fileobject?.value ?: 0L).toString(), (shareaccess?.value ?: 0L).toString(), (linkshareaccess?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioRemoveLinkShareAccessEx(fileobject: COpaquePointer?, shareaccess: COpaquePointer?, linkshareaccess: COpaquePointer?, ioshareaccessflags: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioRemoveLinkShareAccessEx((fileobject?.value ?: 0L).toString(), (shareaccess?.value ?: 0L).toString(), (linkshareaccess?.value ?: 0L).toString(), ioshareaccessflags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioRemoveShareAccess(fileobject: COpaquePointer?, shareaccess: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioRemoveShareAccess((fileobject?.value ?: 0L).toString(), (shareaccess?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioReplacePartitionUnit(targetpdo: COpaquePointer?, sparepdo: COpaquePointer?, flags: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioReplacePartitionUnit((targetpdo?.value ?: 0L).toString(), (sparepdo?.value ?: 0L).toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioReportDetectedDevice(driverobject: COpaquePointer?, legacybustype: InterfaceType, busnumber: UInt, slotnumber: UInt, resourcelist: COpaquePointer?, resourcerequirements: COpaquePointer?, resourceassigned: Boolean, deviceobject: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioReportDetectedDevice((driverobject?.value ?: 0L).toString(), legacybustype, busnumber.toInt(), slotnumber.toInt(), (resourcelist?.value ?: 0L).toString(), (resourcerequirements?.value ?: 0L).toString(), resourceassigned, (deviceobject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioReportInterruptActive(parameters: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioReportInterruptActive((parameters?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioReportInterruptInactive(parameters: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioReportInterruptInactive((parameters?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioReportResourceForDetection(driverobject: COpaquePointer?, driverlist: COpaquePointer?, driverlistsize: UInt, deviceobject: COpaquePointer?, devicelist: COpaquePointer?, devicelistsize: UInt, conflictdetected: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioReportResourceForDetection((driverobject?.value ?: 0L).toString(), (driverlist?.value ?: 0L).toString(), driverlistsize.toInt(), (deviceobject?.value ?: 0L).toString(), (devicelist?.value ?: 0L).toString(), devicelistsize.toInt(), (conflictdetected?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioReportResourceUsage(driverclassname: COpaquePointer?, driverobject: COpaquePointer?, driverlist: COpaquePointer?, driverlistsize: UInt, deviceobject: COpaquePointer?, devicelist: COpaquePointer?, devicelistsize: UInt, overrideconflict: Boolean, conflictdetected: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioReportResourceUsage((driverclassname?.value ?: 0L).toString(), (driverobject?.value ?: 0L).toString(), (driverlist?.value ?: 0L).toString(), driverlistsize.toInt(), (deviceobject?.value ?: 0L).toString(), (devicelist?.value ?: 0L).toString(), devicelistsize.toInt(), overrideconflict, (conflictdetected?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioReportRootDevice(driverobject: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioReportRootDevice((driverobject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioReportTargetDeviceChange(physicaldeviceobject: COpaquePointer?, notificationstructure: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioReportTargetDeviceChange((physicaldeviceobject?.value ?: 0L).toString(), (notificationstructure?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioReportTargetDeviceChangeAsynchronous(physicaldeviceobject: COpaquePointer?, notificationstructure: COpaquePointer?, callback: PdeviceChangeCompleteCallback, context: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioReportTargetDeviceChangeAsynchronous((physicaldeviceobject?.value ?: 0L).toString(), (notificationstructure?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioRequestDeviceEject(physicaldeviceobject: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioRequestDeviceEject((physicaldeviceobject?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioRequestDeviceEjectEx(physicaldeviceobject: COpaquePointer?, callback: PioDeviceEjectCallback, context: COpaquePointer?, driverobject: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioRequestDeviceEjectEx((physicaldeviceobject?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString(), (driverobject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioReserveKsrPersistentMemory(driverobject: COpaquePointer?, physicaldeviceobject: COpaquePointer?, size: ULong, flags: UInt, datahandle: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioReserveKsrPersistentMemory((driverobject?.value ?: 0L).toString(), (physicaldeviceobject?.value ?: 0L).toString(), size.toString(), flags.toInt(), (datahandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioReserveKsrPersistentMemoryEx(driverobject: COpaquePointer?, physicaldeviceobject: COpaquePointer?, physicaldeviceid: COpaquePointer?, datatag: COpaquePointer?, dataversion: UInt, size: ULong, flags: UInt, datahandle: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioReserveKsrPersistentMemoryEx((driverobject?.value ?: 0L).toString(), (physicaldeviceobject?.value ?: 0L).toString(), (physicaldeviceid?.value ?: 0L).toString(), (datatag?.value ?: 0L).toString(), dataversion.toInt(), size.toString(), flags.toInt(), (datahandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioReuseIrp(irp: COpaquePointer?, iostatus: Ntstatus) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioReuseIrp((irp?.value ?: 0L).toString(), iostatus)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioSetActivityIdIrp(irp: COpaquePointer?, guid: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioSetActivityIdIrp((irp?.value ?: 0L).toString(), (guid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetActivityIdThread(activityid: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioSetActivityIdThread((activityid?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetCompletionRoutineEx(deviceobject: COpaquePointer?, irp: COpaquePointer?, completionroutine: PioCompletionRoutine, context: COpaquePointer?, invokeonsuccess: Boolean, invokeonerror: Boolean, invokeoncancel: Boolean): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioSetCompletionRoutineEx((deviceobject?.value ?: 0L).toString(), (irp?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString(), invokeonsuccess, invokeonerror, invokeoncancel) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetDeviceInterfacePropertyData(symboliclinkname: COpaquePointer?, propertykey: COpaquePointer?, lcid: UInt, flags: UInt, type: UInt, size: UInt, data: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioSetDeviceInterfacePropertyData((symboliclinkname?.value ?: 0L).toString(), (propertykey?.value ?: 0L).toString(), lcid.toInt(), flags.toInt(), type.toInt(), size.toInt(), (data?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetDeviceInterfaceState(symboliclinkname: COpaquePointer?, enable: Boolean): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioSetDeviceInterfaceState((symboliclinkname?.value ?: 0L).toString(), enable) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetDevicePropertyData(pdo: COpaquePointer?, propertykey: COpaquePointer?, lcid: UInt, flags: UInt, type: UInt, size: UInt, data: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioSetDevicePropertyData((pdo?.value ?: 0L).toString(), (propertykey?.value ?: 0L).toString(), lcid.toInt(), flags.toInt(), type.toInt(), size.toInt(), (data?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetFileObjectIgnoreSharing(fileobject: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioSetFileObjectIgnoreSharing((fileobject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetFileOrigin(fileobject: COpaquePointer?, remote: Boolean): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioSetFileOrigin((fileobject?.value ?: 0L).toString(), remote) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetFsZeroingOffset(irp: COpaquePointer?, zeroingoffset: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioSetFsZeroingOffset((irp?.value ?: 0L).toString(), zeroingoffset.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetFsZeroingOffsetRequired(irp: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioSetFsZeroingOffsetRequired((irp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetHardErrorOrVerifyDevice(irp: COpaquePointer?, deviceobject: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioSetHardErrorOrVerifyDevice((irp?.value ?: 0L).toString(), (deviceobject?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioSetIoAttributionIrp(irp: COpaquePointer?, attributionsource: COpaquePointer?, flags: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioSetIoAttributionIrp((irp?.value ?: 0L).toString(), (attributionsource?.value ?: 0L).toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetIoPriorityHint(irp: COpaquePointer?, priorityhint: IoPriorityHint): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioSetIoPriorityHint((irp?.value ?: 0L).toString(), priorityhint) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetIrpExtraCreateParameter(irp: COpaquePointer?, extracreateparameter: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioSetIrpExtraCreateParameter((irp?.value ?: 0L).toString(), (extracreateparameter?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetLinkShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: COpaquePointer?, shareaccess: COpaquePointer?, linkshareaccess: COpaquePointer?, ioshareaccessflags: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioSetLinkShareAccess(desiredaccess.toInt(), desiredshareaccess.toInt(), (fileobject?.value ?: 0L).toString(), (shareaccess?.value ?: 0L).toString(), (linkshareaccess?.value ?: 0L).toString(), ioshareaccessflags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioSetMasterIrpStatus(masterirp: COpaquePointer?, status: Ntstatus) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioSetMasterIrpStatus((masterirp?.value ?: 0L).toString(), status)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioSetPartitionInformation(deviceobject: COpaquePointer?, sectorsize: UInt, partitionnumber: UInt, partitiontype: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioSetPartitionInformation((deviceobject?.value ?: 0L).toString(), sectorsize.toInt(), partitionnumber.toInt(), partitiontype.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetPartitionInformationEx(deviceobject: COpaquePointer?, partitionnumber: UInt, partitioninfo: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioSetPartitionInformationEx((deviceobject?.value ?: 0L).toString(), partitionnumber.toInt(), (partitioninfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetShareAccess(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: COpaquePointer?, shareaccess: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioSetShareAccess(desiredaccess.toInt(), desiredshareaccess.toInt(), (fileobject?.value ?: 0L).toString(), (shareaccess?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioSetShareAccessEx(desiredaccess: UInt, desiredshareaccess: UInt, fileobject: COpaquePointer?, shareaccess: COpaquePointer?, writepermission: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioSetShareAccessEx(desiredaccess.toInt(), desiredshareaccess.toInt(), (fileobject?.value ?: 0L).toString(), (shareaccess?.value ?: 0L).toString(), (writepermission?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioSetStartIoAttributes(deviceobject: COpaquePointer?, deferredstartio: Boolean, noncancelable: Boolean) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioSetStartIoAttributes((deviceobject?.value ?: 0L).toString(), deferredstartio, noncancelable)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioSetSystemPartition(volumenamestring: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioSetSystemPartition((volumenamestring?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetThreadHardErrorMode(enableharderrors: Boolean): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioSetThreadHardErrorMode(enableharderrors) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSetTopLevelIrp(irp: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioSetTopLevelIrp((irp?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioSizeOfIrpEx(deviceobject: COpaquePointer?, stacksize: Byte): UShort =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioSizeOfIrpEx((deviceobject?.value ?: 0L).toString(), stacksize.toInt()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioSizeofWorkItem(): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioSizeofWorkItem().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioStartNextPacket(deviceobject: COpaquePointer?, cancelable: Boolean) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioStartNextPacket((deviceobject?.value ?: 0L).toString(), cancelable)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioStartNextPacketByKey(deviceobject: COpaquePointer?, cancelable: Boolean, key: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioStartNextPacketByKey((deviceobject?.value ?: 0L).toString(), cancelable, key.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioStartPacket(deviceobject: COpaquePointer?, irp: COpaquePointer?, key: COpaquePointer?, cancelfunction: DriverCancel) {
    throw UnsupportedOperationException("Native FFI addon is not available")
}

public actual fun ioStartTimer(deviceobject: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioStartTimer((deviceobject?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioStopTimer(deviceobject: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioStopTimer((deviceobject?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioSynchronousCallDriver(deviceobject: COpaquePointer?, irp: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioSynchronousCallDriver((deviceobject?.value ?: 0L).toString(), (irp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioTransferActivityId(activityid: COpaquePointer?, relatedactivityid: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioTransferActivityId((activityid?.value ?: 0L).toString(), (relatedactivityid?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioTranslateBusAddress(interfacetype: InterfaceType, busnumber: UInt, busaddress: Long, addressspace: COpaquePointer?, translatedaddress: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioTranslateBusAddress(interfacetype, busnumber.toInt(), busaddress.toString(), (addressspace?.value ?: 0L).toString(), (translatedaddress?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioTryQueueWorkItem(ioworkitem: PioWorkitem, workerroutine: PioWorkitemRoutineEx, queuetype: WorkQueueType, context: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioTryQueueWorkItem(ioworkitem.toString(), 0L.toString(), queuetype, (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioUninitializeWorkItem(ioworkitem: PioWorkitem) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioUninitializeWorkItem(ioworkitem.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioUnregisterBootDriverCallback(callbackhandle: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioUnregisterBootDriverCallback((callbackhandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioUnregisterContainerNotification(callbackregistration: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioUnregisterContainerNotification((callbackregistration?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioUnregisterPlugPlayNotification(notificationentry: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioUnregisterPlugPlayNotification((notificationentry?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioUnregisterPlugPlayNotificationEx(notificationentry: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioUnregisterPlugPlayNotificationEx((notificationentry?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioUnregisterShutdownNotification(deviceobject: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioUnregisterShutdownNotification((deviceobject?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioUpdateLinkShareAccess(fileobject: COpaquePointer?, shareaccess: COpaquePointer?, linkshareaccess: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioUpdateLinkShareAccess((fileobject?.value ?: 0L).toString(), (shareaccess?.value ?: 0L).toString(), (linkshareaccess?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioUpdateLinkShareAccessEx(fileobject: COpaquePointer?, shareaccess: COpaquePointer?, linkshareaccess: COpaquePointer?, ioshareaccessflags: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioUpdateLinkShareAccessEx((fileobject?.value ?: 0L).toString(), (shareaccess?.value ?: 0L).toString(), (linkshareaccess?.value ?: 0L).toString(), ioshareaccessflags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioUpdateShareAccess(fileobject: COpaquePointer?, shareaccess: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioUpdateShareAccess((fileobject?.value ?: 0L).toString(), (shareaccess?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioValidateDeviceIoControlAccess(irp: COpaquePointer?, requiredaccess: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioValidateDeviceIoControlAccess((irp?.value ?: 0L).toString(), requiredaccess.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioVerifyPartitionTable(deviceobject: COpaquePointer?, fixerrors: Boolean): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioVerifyPartitionTable((deviceobject?.value ?: 0L).toString(), fixerrors) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioVolumeDeviceNameToGuid(volumedevicename: COpaquePointer?, guid: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioVolumeDeviceNameToGuid((volumedevicename?.value ?: 0L).toString(), (guid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioVolumeDeviceNameToGuidPath(volumedevicename: COpaquePointer?, guidpath: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioVolumeDeviceNameToGuidPath((volumedevicename?.value ?: 0L).toString(), (guidpath?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioVolumeDeviceToDosName(volumedeviceobject: COpaquePointer?, dosname: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioVolumeDeviceToDosName((volumedeviceobject?.value ?: 0L).toString(), (dosname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioVolumeDeviceToGuid(volumedeviceobject: COpaquePointer?, guid: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioVolumeDeviceToGuid((volumedeviceobject?.value ?: 0L).toString(), (guid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioVolumeDeviceToGuidPath(volumedeviceobject: COpaquePointer?, guidpath: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioVolumeDeviceToGuidPath((volumedeviceobject?.value ?: 0L).toString(), (guidpath?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMIAllocateInstanceIds(guid: COpaquePointer?, instancecount: UInt, firstinstanceid: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioWMIAllocateInstanceIds((guid?.value ?: 0L).toString(), instancecount.toInt(), (firstinstanceid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMIDeviceObjectToInstanceName(datablockobject: COpaquePointer?, deviceobject: COpaquePointer?, instancename: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioWMIDeviceObjectToInstanceName((datablockobject?.value ?: 0L).toString(), (deviceobject?.value ?: 0L).toString(), (instancename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMIExecuteMethod(datablockobject: COpaquePointer?, instancename: COpaquePointer?, methodid: UInt, inbuffersize: UInt, outbuffersize: COpaquePointer?, inoutbuffer: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioWMIExecuteMethod((datablockobject?.value ?: 0L).toString(), (instancename?.value ?: 0L).toString(), methodid.toInt(), inbuffersize.toInt(), (outbuffersize?.value ?: 0L).toString(), (inoutbuffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMIHandleToInstanceName(datablockobject: COpaquePointer?, filehandle: Handle, instancename: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioWMIHandleToInstanceName((datablockobject?.value ?: 0L).toString(), (filehandle?.value ?: 0L).toString(), (instancename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMIOpenBlock(guid: COpaquePointer?, desiredaccess: UInt, datablockobject: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioWMIOpenBlock((guid?.value ?: 0L).toString(), desiredaccess.toInt(), (datablockobject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMIQueryAllData(datablockobject: COpaquePointer?, inoutbuffersize: COpaquePointer?, outbuffer: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioWMIQueryAllData((datablockobject?.value ?: 0L).toString(), (inoutbuffersize?.value ?: 0L).toString(), (outbuffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMIQueryAllDataMultiple(datablockobjectlist: COpaquePointer?, objectcount: UInt, inoutbuffersize: COpaquePointer?, outbuffer: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioWMIQueryAllDataMultiple((datablockobjectlist?.value ?: 0L).toString(), objectcount.toInt(), (inoutbuffersize?.value ?: 0L).toString(), (outbuffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMIQuerySingleInstance(datablockobject: COpaquePointer?, instancename: COpaquePointer?, inoutbuffersize: COpaquePointer?, outbuffer: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioWMIQuerySingleInstance((datablockobject?.value ?: 0L).toString(), (instancename?.value ?: 0L).toString(), (inoutbuffersize?.value ?: 0L).toString(), (outbuffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMIQuerySingleInstanceMultiple(datablockobjectlist: COpaquePointer?, instancenames: COpaquePointer?, objectcount: UInt, inoutbuffersize: COpaquePointer?, outbuffer: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioWMIQuerySingleInstanceMultiple((datablockobjectlist?.value ?: 0L).toString(), (instancenames?.value ?: 0L).toString(), objectcount.toInt(), (inoutbuffersize?.value ?: 0L).toString(), (outbuffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMIRegistrationControl(deviceobject: COpaquePointer?, action: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioWMIRegistrationControl((deviceobject?.value ?: 0L).toString(), action.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMISetNotificationCallback(obj: COpaquePointer?, callback: WmiNotificationCallback, context: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioWMISetNotificationCallback((obj?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMISetSingleInstance(datablockobject: COpaquePointer?, instancename: COpaquePointer?, version: UInt, valuebuffersize: UInt, valuebuffer: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioWMISetSingleInstance((datablockobject?.value ?: 0L).toString(), (instancename?.value ?: 0L).toString(), version.toInt(), valuebuffersize.toInt(), (valuebuffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMISetSingleItem(datablockobject: COpaquePointer?, instancename: COpaquePointer?, dataitemid: UInt, version: UInt, valuebuffersize: UInt, valuebuffer: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioWMISetSingleItem((datablockobject?.value ?: 0L).toString(), (instancename?.value ?: 0L).toString(), dataitemid.toInt(), version.toInt(), valuebuffersize.toInt(), (valuebuffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMISuggestInstanceName(physicaldeviceobject: COpaquePointer?, symboliclinkname: COpaquePointer?, combinenames: Boolean, suggestedinstancename: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioWMISuggestInstanceName((physicaldeviceobject?.value ?: 0L).toString(), (symboliclinkname?.value ?: 0L).toString(), combinenames, (suggestedinstancename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWMIWriteEvent(wnodeeventitem: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioWMIWriteEvent((wnodeeventitem?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWithinStackLimits(regionstart: ULong, regionsize: ULong): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioWithinStackLimits(regionstart.toString(), regionsize.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWriteErrorLogEntry(elentry: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_ioWriteErrorLogEntry((elentry?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ioWriteKsrPersistentMemory(datahandle: COpaquePointer?, buffer: COpaquePointer?, size: ULong): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioWriteKsrPersistentMemory((datahandle?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWritePartitionTable(deviceobject: COpaquePointer?, sectorsize: UInt, sectorspertrack: UInt, numberofheads: UInt, partitionbuffer: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioWritePartitionTable((deviceobject?.value ?: 0L).toString(), sectorsize.toInt(), sectorspertrack.toInt(), numberofheads.toInt(), (partitionbuffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ioWritePartitionTableEx(deviceobject: COpaquePointer?, drivelayout: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ioWritePartitionTableEx((deviceobject?.value ?: 0L).toString(), (drivelayout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iofCallDriver(deviceobject: COpaquePointer?, irp: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_iofCallDriver((deviceobject?.value ?: 0L).toString(), (irp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iofCompleteRequest(irp: COpaquePointer?, priorityboost: Byte) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_iofCompleteRequest((irp?.value ?: 0L).toString(), priorityboost.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun kdChangeOption(option: KdOption, inbufferbytes: UInt, inbuffer: COpaquePointer?, outbufferbytes: UInt, outbuffer: COpaquePointer?, outbufferneeded: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_kdChangeOption(option, inbufferbytes.toInt(), (inbuffer?.value ?: 0L).toString(), outbufferbytes.toInt(), (outbuffer?.value ?: 0L).toString(), (outbufferneeded?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kdDisableDebugger(): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_kdDisableDebugger() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kdEnableDebugger(): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_kdEnableDebugger() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kdRefreshDebuggerNotPresent(): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_kdRefreshDebuggerNotPresent() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keAcquireGuardedMutex(mutex: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keAcquireGuardedMutex((mutex?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keAcquireGuardedMutexUnsafe(fastmutex: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keAcquireGuardedMutexUnsafe((fastmutex?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keAcquireInStackQueuedSpinLock(spinlock: COpaquePointer?, lockhandle: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keAcquireInStackQueuedSpinLock((spinlock?.value ?: 0L).toString(), (lockhandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keAcquireInStackQueuedSpinLockAtDpcLevel(spinlock: COpaquePointer?, lockhandle: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keAcquireInStackQueuedSpinLockAtDpcLevel((spinlock?.value ?: 0L).toString(), (lockhandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keAcquireInStackQueuedSpinLockForDpc(spinlock: COpaquePointer?, lockhandle: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keAcquireInStackQueuedSpinLockForDpc((spinlock?.value ?: 0L).toString(), (lockhandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keAcquireInterruptSpinLock(interrupt: Pkinterrupt): UByte =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keAcquireInterruptSpinLock(interrupt.toString()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keAcquireSpinLockForDpc(spinlock: COpaquePointer?): UByte =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keAcquireSpinLockForDpc((spinlock?.value ?: 0L).toString()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keAddTriageDumpDataBlock(ktriagedumpdataarray: COpaquePointer?, address: COpaquePointer?, size: ULong): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keAddTriageDumpDataBlock((ktriagedumpdataarray?.value ?: 0L).toString(), (address?.value ?: 0L).toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keAreAllApcsDisabled(): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keAreAllApcsDisabled() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keAreApcsDisabled(): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keAreApcsDisabled() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keBugCheck(bugcheckcode: BugcheckError) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keBugCheck(bugcheckcode.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keBugCheckEx(bugcheckcode: BugcheckError, bugcheckparameter1: ULong, bugcheckparameter2: ULong, bugcheckparameter3: ULong, bugcheckparameter4: ULong) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keBugCheckEx(bugcheckcode.toInt(), bugcheckparameter1.toString(), bugcheckparameter2.toString(), bugcheckparameter3.toString(), bugcheckparameter4.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keCancelTimer(param0: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keCancelTimer((param0?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keClearEvent(event: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keClearEvent((event?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keConvertAuxiliaryCounterToPerformanceCounter(auxiliarycountervalue: ULong, performancecountervalue: COpaquePointer?, conversionerror: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keConvertAuxiliaryCounterToPerformanceCounter(auxiliarycountervalue.toString(), (performancecountervalue?.value ?: 0L).toString(), (conversionerror?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keConvertPerformanceCounterToAuxiliaryCounter(performancecountervalue: ULong, auxiliarycountervalue: COpaquePointer?, conversionerror: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keConvertPerformanceCounterToAuxiliaryCounter(performancecountervalue.toString(), (auxiliarycountervalue?.value ?: 0L).toString(), (conversionerror?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keDelayExecutionThread(waitmode: Byte, alertable: Boolean, interval: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keDelayExecutionThread(waitmode.toInt(), alertable, (interval?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keDeregisterBoundCallback(handle: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keDeregisterBoundCallback((handle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keDeregisterBugCheckCallback(callbackrecord: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keDeregisterBugCheckCallback((callbackrecord?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keDeregisterBugCheckReasonCallback(callbackrecord: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keDeregisterBugCheckReasonCallback((callbackrecord?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keDeregisterNmiCallback(handle: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keDeregisterNmiCallback((handle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keDeregisterProcessorChangeCallback(callbackhandle: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keDeregisterProcessorChangeCallback((callbackhandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keEnterCriticalRegion() {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keEnterCriticalRegion()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keEnterGuardedRegion() {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keEnterGuardedRegion()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keExpandKernelStackAndCallout(callout: PexpandStackCallout, parameter: COpaquePointer?, size: ULong): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keExpandKernelStackAndCallout(0L.toString(), (parameter?.value ?: 0L).toString(), size.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keExpandKernelStackAndCalloutEx(callout: PexpandStackCallout, parameter: COpaquePointer?, size: ULong, wait: Boolean, context: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keExpandKernelStackAndCalloutEx(0L.toString(), (parameter?.value ?: 0L).toString(), size.toString(), wait, (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keFlushIoBuffers(mdl: COpaquePointer?, readoperation: Boolean, dmaoperation: Boolean) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keFlushIoBuffers((mdl?.value ?: 0L).toString(), readoperation, dmaoperation)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keFlushQueuedDpcs() {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keFlushQueuedDpcs()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keFlushWriteBuffer() {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keFlushWriteBuffer()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keGetCurrentIrql(): UByte =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keGetCurrentIrql().toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keGetCurrentNodeNumber(): UShort =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keGetCurrentNodeNumber().toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keGetCurrentProcessorNumberEx(procnumber: COpaquePointer?): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keGetCurrentProcessorNumberEx((procnumber?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keGetProcessorIndexFromNumber(procnumber: COpaquePointer?): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keGetProcessorIndexFromNumber((procnumber?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keGetProcessorNumberFromIndex(procindex: UInt, procnumber: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keGetProcessorNumberFromIndex(procindex.toInt(), (procnumber?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keGetRecommendedSharedDataAlignment(): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keGetRecommendedSharedDataAlignment().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keInitializeCrashDumpHeader(dumptype: UInt, flags: UInt, buffer: COpaquePointer?, buffersize: UInt, bufferneeded: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keInitializeCrashDumpHeader(dumptype.toInt(), flags.toInt(), (buffer?.value ?: 0L).toString(), buffersize.toInt(), (bufferneeded?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keInitializeDeviceQueue(devicequeue: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keInitializeDeviceQueue((devicequeue?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keInitializeDpc(dpc: COpaquePointer?, deferredroutine: PkdeferredRoutine, deferredcontext: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keInitializeDpc((dpc?.value ?: 0L).toString(), 0L.toString(), (deferredcontext?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keInitializeEvent(event: COpaquePointer?, type: EventType, state: Boolean) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keInitializeEvent((event?.value ?: 0L).toString(), type, state)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keInitializeGuardedMutex(mutex: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keInitializeGuardedMutex((mutex?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keInitializeMutex(mutex: COpaquePointer?, level: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keInitializeMutex((mutex?.value ?: 0L).toString(), level.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keInitializeSemaphore(semaphore: COpaquePointer?, count: Int, limit: Int) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keInitializeSemaphore((semaphore?.value ?: 0L).toString(), count, limit)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keInitializeSpinLock(spinlock: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keInitializeSpinLock((spinlock?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keInitializeThreadedDpc(dpc: COpaquePointer?, deferredroutine: PkdeferredRoutine, deferredcontext: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keInitializeThreadedDpc((dpc?.value ?: 0L).toString(), 0L.toString(), (deferredcontext?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keInitializeTimer(timer: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keInitializeTimer((timer?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keInitializeTimerEx(timer: COpaquePointer?, type: TimerType) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keInitializeTimerEx((timer?.value ?: 0L).toString(), type)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keInitializeTriageDumpDataArray(ktriagedumpdataarray: COpaquePointer?, size: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keInitializeTriageDumpDataArray((ktriagedumpdataarray?.value ?: 0L).toString(), size.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keInsertByKeyDeviceQueue(devicequeue: COpaquePointer?, devicequeueentry: COpaquePointer?, sortkey: UInt): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keInsertByKeyDeviceQueue((devicequeue?.value ?: 0L).toString(), (devicequeueentry?.value ?: 0L).toString(), sortkey.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keInsertDeviceQueue(devicequeue: COpaquePointer?, devicequeueentry: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keInsertDeviceQueue((devicequeue?.value ?: 0L).toString(), (devicequeueentry?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keInsertQueueDpc(dpc: COpaquePointer?, systemargument1: COpaquePointer?, systemargument2: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keInsertQueueDpc((dpc?.value ?: 0L).toString(), (systemargument1?.value ?: 0L).toString(), (systemargument2?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keInvalidateAllCaches(): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keInvalidateAllCaches() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keInvalidateRangeAllCaches(baseaddress: COpaquePointer?, length: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keInvalidateRangeAllCaches((baseaddress?.value ?: 0L).toString(), length.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keIpiGenericCall(broadcastfunction: PkipiBroadcastWorker, context: ULong): ULong =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keIpiGenericCall(0L.toString(), context.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keIsExecutingDpc(): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keIsExecutingDpc().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keLeaveCriticalRegion() {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keLeaveCriticalRegion()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keLeaveGuardedRegion() {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keLeaveGuardedRegion()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun kePulseEvent(event: COpaquePointer?, increment: Int, wait: Boolean): Int =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_kePulseEvent((event?.value ?: 0L).toString(), increment, wait) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryActiveGroupCount(): UShort =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keQueryActiveGroupCount().toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryActiveProcessorCount(activeprocessors: COpaquePointer?): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keQueryActiveProcessorCount((activeprocessors?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryActiveProcessorCountEx(groupnumber: UShort): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keQueryActiveProcessorCountEx(groupnumber.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryActiveProcessors(): ULong =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keQueryActiveProcessors().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryAuxiliaryCounterFrequency(auxiliarycounterfrequency: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keQueryAuxiliaryCounterFrequency((auxiliarycounterfrequency?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryDpcWatchdogInformation(watchdoginformation: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keQueryDpcWatchdogInformation((watchdoginformation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryGroupAffinity(groupnumber: UShort): ULong =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keQueryGroupAffinity(groupnumber.toInt()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryHardwareCounterConfiguration(counterarray: COpaquePointer?, maximumcount: UInt, count: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keQueryHardwareCounterConfiguration((counterarray?.value ?: 0L).toString(), maximumcount.toInt(), (count?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryHighestNodeNumber(): UShort =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keQueryHighestNodeNumber().toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryInterruptTimePrecise(qpctimestamp: COpaquePointer?): ULong =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keQueryInterruptTimePrecise((qpctimestamp?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryLogicalProcessorRelationship(processornumber: COpaquePointer?, relationshiptype: LogicalProcessorRelationship, information: COpaquePointer?, length: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keQueryLogicalProcessorRelationship((processornumber?.value ?: 0L).toString(), relationshiptype, (information?.value ?: 0L).toString(), (length?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryMaximumGroupCount(): UShort =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keQueryMaximumGroupCount().toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryMaximumProcessorCount(): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keQueryMaximumProcessorCount().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryMaximumProcessorCountEx(groupnumber: UShort): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keQueryMaximumProcessorCountEx(groupnumber.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryNodeActiveAffinity(nodenumber: UShort, affinity: COpaquePointer?, count: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keQueryNodeActiveAffinity(nodenumber.toInt(), (affinity?.value ?: 0L).toString(), (count?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keQueryNodeActiveAffinity2(nodenumber: UShort, groupaffinities: COpaquePointer?, groupaffinitiescount: UShort, groupaffinitiesrequired: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keQueryNodeActiveAffinity2(nodenumber.toInt(), (groupaffinities?.value ?: 0L).toString(), groupaffinitiescount.toInt(), (groupaffinitiesrequired?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryNodeActiveProcessorCount(nodenumber: UShort): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keQueryNodeActiveProcessorCount(nodenumber.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryNodeMaximumProcessorCount(nodenumber: UShort): UShort =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keQueryNodeMaximumProcessorCount(nodenumber.toInt()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryPerformanceCounter(performancefrequency: COpaquePointer?): Long =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keQueryPerformanceCounter((performancefrequency?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryPriorityThread(thread: Pkthread): Int =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keQueryPriorityThread(thread.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryRuntimeThread(thread: Pkthread, usertime: COpaquePointer?): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keQueryRuntimeThread(thread.toString(), (usertime?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQuerySystemTimePrecise(currenttime: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keQuerySystemTimePrecise((currenttime?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keQueryTimeIncrement(): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keQueryTimeIncrement().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryTotalCycleTimeThread(thread: Pkthread, cycletimestamp: COpaquePointer?): ULong =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keQueryTotalCycleTimeThread(thread.toString(), (cycletimestamp?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryUnbiasedInterruptTime(): ULong =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keQueryUnbiasedInterruptTime().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keQueryUnbiasedInterruptTimePrecise(qpctimestamp: COpaquePointer?): ULong =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keQueryUnbiasedInterruptTimePrecise((qpctimestamp?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keReadStateEvent(event: COpaquePointer?): Int =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keReadStateEvent((event?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keReadStateMutex(mutex: COpaquePointer?): Int =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keReadStateMutex((mutex?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keReadStateSemaphore(semaphore: COpaquePointer?): Int =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keReadStateSemaphore((semaphore?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keReadStateTimer(timer: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keReadStateTimer((timer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keRegisterBoundCallback(callbackroutine: PboundCallback): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keRegisterBoundCallback(0L.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keRegisterBugCheckCallback(callbackrecord: COpaquePointer?, callbackroutine: PkbugcheckCallbackRoutine, buffer: COpaquePointer?, length: UInt, component: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keRegisterBugCheckCallback((callbackrecord?.value ?: 0L).toString(), 0L.toString(), (buffer?.value ?: 0L).toString(), length.toInt(), (component?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keRegisterBugCheckReasonCallback(callbackrecord: COpaquePointer?, callbackroutine: PkbugcheckReasonCallbackRoutine, reason: KbugcheckCallbackReason, component: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keRegisterBugCheckReasonCallback((callbackrecord?.value ?: 0L).toString(), 0L.toString(), reason, (component?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keRegisterNmiCallback(callbackroutine: PnmiCallback, context: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keRegisterNmiCallback(0L.toString(), (context?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keRegisterProcessorChangeCallback(callbackfunction: PprocessorCallbackFunction, callbackcontext: COpaquePointer?, flags: UInt): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keRegisterProcessorChangeCallback(0L.toString(), (callbackcontext?.value ?: 0L).toString(), flags.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keReleaseGuardedMutex(mutex: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keReleaseGuardedMutex((mutex?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keReleaseGuardedMutexUnsafe(fastmutex: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keReleaseGuardedMutexUnsafe((fastmutex?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keReleaseInStackQueuedSpinLock(lockhandle: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keReleaseInStackQueuedSpinLock((lockhandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keReleaseInStackQueuedSpinLockForDpc(lockhandle: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keReleaseInStackQueuedSpinLockForDpc((lockhandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keReleaseInStackQueuedSpinLockFromDpcLevel(lockhandle: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keReleaseInStackQueuedSpinLockFromDpcLevel((lockhandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keReleaseInterruptSpinLock(interrupt: Pkinterrupt, oldirql: UByte) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keReleaseInterruptSpinLock(interrupt.toString(), oldirql.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keReleaseMutex(mutex: COpaquePointer?, wait: Boolean): Int =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keReleaseMutex((mutex?.value ?: 0L).toString(), wait) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keReleaseSemaphore(semaphore: COpaquePointer?, increment: Int, adjustment: Int, wait: Boolean): Int =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keReleaseSemaphore((semaphore?.value ?: 0L).toString(), increment, adjustment, wait) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keReleaseSpinLockForDpc(spinlock: COpaquePointer?, oldirql: UByte) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keReleaseSpinLockForDpc((spinlock?.value ?: 0L).toString(), oldirql.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keRemoveByKeyDeviceQueue(devicequeue: COpaquePointer?, sortkey: UInt): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keRemoveByKeyDeviceQueue((devicequeue?.value ?: 0L).toString(), sortkey.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keRemoveByKeyDeviceQueueIfBusy(devicequeue: COpaquePointer?, sortkey: UInt): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keRemoveByKeyDeviceQueueIfBusy((devicequeue?.value ?: 0L).toString(), sortkey.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keRemoveDeviceQueue(devicequeue: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keRemoveDeviceQueue((devicequeue?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keRemoveEntryDeviceQueue(devicequeue: COpaquePointer?, devicequeueentry: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keRemoveEntryDeviceQueue((devicequeue?.value ?: 0L).toString(), (devicequeueentry?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keRemoveQueueDpc(dpc: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keRemoveQueueDpc((dpc?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keRemoveQueueDpcEx(dpc: COpaquePointer?, waitifactive: Boolean): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keRemoveQueueDpcEx((dpc?.value ?: 0L).toString(), waitifactive) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keResetEvent(event: COpaquePointer?): Int =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keResetEvent((event?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keRestoreExtendedProcessorState(xstatesave: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keRestoreExtendedProcessorState((xstatesave?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keRevertToUserAffinityThread() {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keRevertToUserAffinityThread()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keRevertToUserAffinityThreadEx(affinity: ULong) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keRevertToUserAffinityThreadEx(affinity.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keRevertToUserGroupAffinityThread(previousaffinity: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keRevertToUserGroupAffinityThread((previousaffinity?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keSaveExtendedProcessorState(mask: ULong, xstatesave: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keSaveExtendedProcessorState(mask.toString(), (xstatesave?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keSetBasePriorityThread(thread: Pkthread, increment: Int): Int =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keSetBasePriorityThread(thread.toString(), increment) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keSetCoalescableTimer(timer: COpaquePointer?, duetime: Long, period: UInt, tolerabledelay: UInt, dpc: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keSetCoalescableTimer((timer?.value ?: 0L).toString(), duetime.toString(), period.toInt(), tolerabledelay.toInt(), (dpc?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keSetEvent(event: COpaquePointer?, increment: Int, wait: Boolean): Int =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keSetEvent((event?.value ?: 0L).toString(), increment, wait) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keSetHardwareCounterConfiguration(counterarray: COpaquePointer?, count: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keSetHardwareCounterConfiguration((counterarray?.value ?: 0L).toString(), count.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keSetImportanceDpc(dpc: COpaquePointer?, importance: KdpcImportance) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keSetImportanceDpc((dpc?.value ?: 0L).toString(), importance)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keSetPriorityThread(thread: Pkthread, priority: Int): Int =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keSetPriorityThread(thread.toString(), priority) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keSetSystemAffinityThread(affinity: ULong) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keSetSystemAffinityThread(affinity.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keSetSystemAffinityThreadEx(affinity: ULong): ULong =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keSetSystemAffinityThreadEx(affinity.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keSetSystemGroupAffinityThread(affinity: COpaquePointer?, previousaffinity: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keSetSystemGroupAffinityThread((affinity?.value ?: 0L).toString(), (previousaffinity?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keSetTargetProcessorDpc(dpc: COpaquePointer?, number: Byte) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keSetTargetProcessorDpc((dpc?.value ?: 0L).toString(), number.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keSetTargetProcessorDpcEx(dpc: COpaquePointer?, procnumber: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keSetTargetProcessorDpcEx((dpc?.value ?: 0L).toString(), (procnumber?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keSetTimer(timer: COpaquePointer?, duetime: Long, dpc: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keSetTimer((timer?.value ?: 0L).toString(), duetime.toString(), (dpc?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keSetTimerEx(timer: COpaquePointer?, duetime: Long, period: Int, dpc: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keSetTimerEx((timer?.value ?: 0L).toString(), duetime.toString(), period, (dpc?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keShouldYieldProcessor(): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keShouldYieldProcessor().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keStallExecutionProcessor(microseconds: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_keStallExecutionProcessor(microseconds.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun keSynchronizeExecution(interrupt: Pkinterrupt, synchronizeroutine: PksynchronizeRoutine, synchronizecontext: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keSynchronizeExecution(interrupt.toString(), 0L.toString(), (synchronizecontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keTestSpinLock(spinlock: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keTestSpinLock((spinlock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keTryToAcquireGuardedMutex(mutex: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keTryToAcquireGuardedMutex((mutex?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keTryToAcquireSpinLockAtDpcLevel(spinlock: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keTryToAcquireSpinLockAtDpcLevel((spinlock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keWaitForMultipleObjects(count: UInt, obj: COpaquePointer?, waittype: WaitType, waitreason: KwaitReason, waitmode: Byte, alertable: Boolean, timeout: COpaquePointer?, waitblockarray: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keWaitForMultipleObjects(count.toInt(), (obj?.value ?: 0L).toString(), waittype, waitreason, waitmode.toInt(), alertable, (timeout?.value ?: 0L).toString(), (waitblockarray?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun keWaitForSingleObject(obj: COpaquePointer?, waitreason: KwaitReason, waitmode: Byte, alertable: Boolean, timeout: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_keWaitForSingleObject((obj?.value ?: 0L).toString(), waitreason, waitmode.toInt(), alertable, (timeout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun kfRaiseIrql(newirql: UByte): UByte =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_kfRaiseIrql(newirql.toInt()).toUByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAddPhysicalMemory(startaddress: COpaquePointer?, numberofbytes: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmAddPhysicalMemory((startaddress?.value ?: 0L).toString(), (numberofbytes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAddVerifierSpecialThunks(entryroutine: ULong, thunkbuffer: COpaquePointer?, thunkbuffersize: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmAddVerifierSpecialThunks(entryroutine.toString(), (thunkbuffer?.value ?: 0L).toString(), thunkbuffersize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAddVerifierThunks(thunkbuffer: COpaquePointer?, thunkbuffersize: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmAddVerifierThunks((thunkbuffer?.value ?: 0L).toString(), thunkbuffersize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAdvanceMdl(mdl: COpaquePointer?, numberofbytes: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmAdvanceMdl((mdl?.value ?: 0L).toString(), numberofbytes.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAllocateContiguousMemory(numberofbytes: ULong, highestacceptableaddress: Long): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmAllocateContiguousMemory(numberofbytes.toString(), highestacceptableaddress.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAllocateContiguousMemoryEx(numberofbytes: COpaquePointer?, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, preferrednode: UInt, protect: UInt, partitionobject: COpaquePointer?, tag: UInt, flags: UInt, baseaddress: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmAllocateContiguousMemoryEx((numberofbytes?.value ?: 0L).toString(), lowestacceptableaddress.toString(), highestacceptableaddress.toString(), boundaryaddressmultiple.toString(), preferrednode.toInt(), protect.toInt(), (partitionobject?.value ?: 0L).toString(), tag.toInt(), flags.toInt(), (baseaddress?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAllocateContiguousMemorySpecifyCache(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, cachetype: MemoryCachingType): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmAllocateContiguousMemorySpecifyCache(numberofbytes.toString(), lowestacceptableaddress.toString(), highestacceptableaddress.toString(), boundaryaddressmultiple.toString(), cachetype).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAllocateContiguousMemorySpecifyCacheNode(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, cachetype: MemoryCachingType, preferrednode: UInt): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmAllocateContiguousMemorySpecifyCacheNode(numberofbytes.toString(), lowestacceptableaddress.toString(), highestacceptableaddress.toString(), boundaryaddressmultiple.toString(), cachetype, preferrednode.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAllocateContiguousNodeMemory(numberofbytes: ULong, lowestacceptableaddress: Long, highestacceptableaddress: Long, boundaryaddressmultiple: Long, protect: UInt, preferrednode: UInt): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmAllocateContiguousNodeMemory(numberofbytes.toString(), lowestacceptableaddress.toString(), highestacceptableaddress.toString(), boundaryaddressmultiple.toString(), protect.toInt(), preferrednode.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAllocateMappingAddress(numberofbytes: ULong, pooltag: UInt): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmAllocateMappingAddress(numberofbytes.toString(), pooltag.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAllocateMappingAddressEx(numberofbytes: ULong, pooltag: UInt, flags: UInt): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmAllocateMappingAddressEx(numberofbytes.toString(), pooltag.toInt(), flags.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAllocateMdlForIoSpace(physicaladdresslist: COpaquePointer?, numberofentries: ULong, newmdl: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmAllocateMdlForIoSpace((physicaladdresslist?.value ?: 0L).toString(), numberofentries.toString(), (newmdl?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAllocateNodePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MemoryCachingType, idealnode: UInt, flags: UInt): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmAllocateNodePagesForMdlEx(lowaddress.toString(), highaddress.toString(), skipbytes.toString(), totalbytes.toString(), cachetype, idealnode.toInt(), flags.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAllocateNonCachedMemory(numberofbytes: ULong): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmAllocateNonCachedMemory(numberofbytes.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAllocatePagesForMdl(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmAllocatePagesForMdl(lowaddress.toString(), highaddress.toString(), skipbytes.toString(), totalbytes.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAllocatePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MemoryCachingType, flags: UInt): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmAllocatePagesForMdlEx(lowaddress.toString(), highaddress.toString(), skipbytes.toString(), totalbytes.toString(), cachetype, flags.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAllocatePartitionNodePagesForMdlEx(lowaddress: Long, highaddress: Long, skipbytes: Long, totalbytes: ULong, cachetype: MemoryCachingType, idealnode: UInt, flags: UInt, partitionobject: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmAllocatePartitionNodePagesForMdlEx(lowaddress.toString(), highaddress.toString(), skipbytes.toString(), totalbytes.toString(), cachetype, idealnode.toInt(), flags.toInt(), (partitionobject?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmAreMdlPagesCached(memorydescriptorlist: COpaquePointer?): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmAreMdlPagesCached((memorydescriptorlist?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmBuildMdlForNonPagedPool(memorydescriptorlist: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_mmBuildMdlForNonPagedPool((memorydescriptorlist?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmCopyMemory(targetaddress: COpaquePointer?, sourceaddress: MmCopyAddress, numberofbytes: ULong, flags: UInt, numberofbytestransferred: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmCreateMdl(memorydescriptorlist: COpaquePointer?, base: COpaquePointer?, length: ULong): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmCreateMdl((memorydescriptorlist?.value ?: 0L).toString(), (base?.value ?: 0L).toString(), length.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmCreateMirror(): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmCreateMirror() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmFreeContiguousMemory(baseaddress: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_mmFreeContiguousMemory((baseaddress?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmFreeContiguousMemorySpecifyCache(baseaddress: COpaquePointer?, numberofbytes: ULong, cachetype: MemoryCachingType) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_mmFreeContiguousMemorySpecifyCache((baseaddress?.value ?: 0L).toString(), numberofbytes.toString(), cachetype)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmFreeMappingAddress(baseaddress: COpaquePointer?, pooltag: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_mmFreeMappingAddress((baseaddress?.value ?: 0L).toString(), pooltag.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmFreeNonCachedMemory(baseaddress: COpaquePointer?, numberofbytes: ULong) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_mmFreeNonCachedMemory((baseaddress?.value ?: 0L).toString(), numberofbytes.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmFreePagesFromMdl(memorydescriptorlist: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_mmFreePagesFromMdl((memorydescriptorlist?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmFreePagesFromMdlEx(memorydescriptorlist: COpaquePointer?, flags: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_mmFreePagesFromMdlEx((memorydescriptorlist?.value ?: 0L).toString(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmGetCacheAttribute(physicaladdress: Long, cachetype: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmGetCacheAttribute(physicaladdress.toString(), (cachetype?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmGetCacheAttributeEx(physicaladdress: Long, flags: UInt, cachetype: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmGetCacheAttributeEx(physicaladdress.toString(), flags.toInt(), (cachetype?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmGetPhysicalAddress(baseaddress: COpaquePointer?): Long =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmGetPhysicalAddress((baseaddress?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmGetPhysicalMemoryRanges(): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmGetPhysicalMemoryRanges().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmGetPhysicalMemoryRangesEx(partitionobject: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmGetPhysicalMemoryRangesEx((partitionobject?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmGetPhysicalMemoryRangesEx2(partitionobject: COpaquePointer?, flags: UInt): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmGetPhysicalMemoryRangesEx2((partitionobject?.value ?: 0L).toString(), flags.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmGetSystemRoutineAddress(systemroutinename: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmGetSystemRoutineAddress((systemroutinename?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmGetVirtualForPhysical(physicaladdress: Long): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmGetVirtualForPhysical(physicaladdress.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmIsAddressValid(virtualaddress: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmIsAddressValid((virtualaddress?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmIsDriverSuspectForVerifier(driverobject: COpaquePointer?): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmIsDriverSuspectForVerifier((driverobject?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmIsDriverVerifying(driverobject: COpaquePointer?): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmIsDriverVerifying((driverobject?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmIsDriverVerifyingByAddress(addresswithinsection: COpaquePointer?): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmIsDriverVerifyingByAddress((addresswithinsection?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmIsIoSpaceActive(startaddress: Long, numberofbytes: ULong): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmIsIoSpaceActive(startaddress.toString(), numberofbytes.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmIsNonPagedSystemAddressValid(virtualaddress: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmIsNonPagedSystemAddressValid((virtualaddress?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmIsThisAnNtAsSystem(): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmIsThisAnNtAsSystem() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmIsVerifierEnabled(verifierflags: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmIsVerifierEnabled((verifierflags?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmLockPagableDataSection(addresswithinsection: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmLockPagableDataSection((addresswithinsection?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmLockPagableSectionByHandle(imagesectionhandle: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_mmLockPagableSectionByHandle((imagesectionhandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmMapIoSpace(physicaladdress: Long, numberofbytes: ULong, cachetype: MemoryCachingType): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmMapIoSpace(physicaladdress.toString(), numberofbytes.toString(), cachetype).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmMapIoSpaceEx(physicaladdress: Long, numberofbytes: ULong, protect: UInt): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmMapIoSpaceEx(physicaladdress.toString(), numberofbytes.toString(), protect.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmMapLockedPages(memorydescriptorlist: COpaquePointer?, accessmode: Byte): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmMapLockedPages((memorydescriptorlist?.value ?: 0L).toString(), accessmode.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmMapLockedPagesSpecifyCache(memorydescriptorlist: COpaquePointer?, accessmode: Byte, cachetype: MemoryCachingType, requestedaddress: COpaquePointer?, bugcheckonfailure: UInt, priority: UInt): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmMapLockedPagesSpecifyCache((memorydescriptorlist?.value ?: 0L).toString(), accessmode.toInt(), cachetype, (requestedaddress?.value ?: 0L).toString(), bugcheckonfailure.toInt(), priority.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmMapLockedPagesWithReservedMapping(mappingaddress: COpaquePointer?, pooltag: UInt, memorydescriptorlist: COpaquePointer?, cachetype: MemoryCachingType): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmMapLockedPagesWithReservedMapping((mappingaddress?.value ?: 0L).toString(), pooltag.toInt(), (memorydescriptorlist?.value ?: 0L).toString(), cachetype).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmMapMdl(memorydescriptorlist: COpaquePointer?, protection: UInt, driverroutine: PmmMdlRoutine, drivercontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmMapMdl((memorydescriptorlist?.value ?: 0L).toString(), protection.toInt(), 0L.toString(), (drivercontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmMapMemoryDumpMdlEx(va: COpaquePointer?, pagetotal: UInt, memorydumpmdl: COpaquePointer?, flags: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmMapMemoryDumpMdlEx((va?.value ?: 0L).toString(), pagetotal.toInt(), (memorydumpmdl?.value ?: 0L).toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmMapUserAddressesToPage(baseaddress: COpaquePointer?, numberofbytes: ULong, pageaddress: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmMapUserAddressesToPage((baseaddress?.value ?: 0L).toString(), numberofbytes.toString(), (pageaddress?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmMapVideoDisplay(physicaladdress: Long, numberofbytes: ULong, cachetype: MemoryCachingType): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmMapVideoDisplay(physicaladdress.toString(), numberofbytes.toString(), cachetype).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmMapViewInSessionSpace(section: COpaquePointer?, mappedbase: COpaquePointer?, viewsize: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmMapViewInSessionSpace((section?.value ?: 0L).toString(), (mappedbase?.value ?: 0L).toString(), (viewsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmMapViewInSessionSpaceEx(section: COpaquePointer?, mappedbase: COpaquePointer?, viewsize: COpaquePointer?, sectionoffset: COpaquePointer?, flags: ULong): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmMapViewInSessionSpaceEx((section?.value ?: 0L).toString(), (mappedbase?.value ?: 0L).toString(), (viewsize?.value ?: 0L).toString(), (sectionoffset?.value ?: 0L).toString(), flags.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmMapViewInSystemSpace(section: COpaquePointer?, mappedbase: COpaquePointer?, viewsize: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmMapViewInSystemSpace((section?.value ?: 0L).toString(), (mappedbase?.value ?: 0L).toString(), (viewsize?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmMapViewInSystemSpaceEx(section: COpaquePointer?, mappedbase: COpaquePointer?, viewsize: COpaquePointer?, sectionoffset: COpaquePointer?, flags: ULong): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmMapViewInSystemSpaceEx((section?.value ?: 0L).toString(), (mappedbase?.value ?: 0L).toString(), (viewsize?.value ?: 0L).toString(), (sectionoffset?.value ?: 0L).toString(), flags.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmMdlPageContentsState(memorydescriptorlist: COpaquePointer?, state: MmMdlPageContentsState): MmMdlPageContentsState =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmMdlPageContentsState((memorydescriptorlist?.value ?: 0L).toString(), state) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmPageEntireDriver(addresswithinsection: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmPageEntireDriver((addresswithinsection?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmProbeAndLockPages(memorydescriptorlist: COpaquePointer?, accessmode: Byte, operation: LockOperation) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_mmProbeAndLockPages((memorydescriptorlist?.value ?: 0L).toString(), accessmode.toInt(), operation)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmProbeAndLockProcessPages(memorydescriptorlist: COpaquePointer?, process: Peprocess, accessmode: Byte, operation: LockOperation) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_mmProbeAndLockProcessPages((memorydescriptorlist?.value ?: 0L).toString(), process.toString(), accessmode.toInt(), operation)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmProbeAndLockSelectedPages(memorydescriptorlist: COpaquePointer?, segmentarray: COpaquePointer?, accessmode: Byte, operation: LockOperation) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_mmProbeAndLockSelectedPages((memorydescriptorlist?.value ?: 0L).toString(), (segmentarray?.value ?: 0L).toString(), accessmode.toInt(), operation)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmProtectDriverSection(addresswithinsection: COpaquePointer?, size: ULong, flags: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmProtectDriverSection((addresswithinsection?.value ?: 0L).toString(), size.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmProtectMdlSystemAddress(memorydescriptorlist: COpaquePointer?, newprotect: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmProtectMdlSystemAddress((memorydescriptorlist?.value ?: 0L).toString(), newprotect.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmQuerySystemSize(): MmSystemsize =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmQuerySystemSize() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmRemovePhysicalMemory(startaddress: COpaquePointer?, numberofbytes: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmRemovePhysicalMemory((startaddress?.value ?: 0L).toString(), (numberofbytes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmResetDriverPaging(addresswithinsection: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_mmResetDriverPaging((addresswithinsection?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmRotatePhysicalView(virtualaddress: COpaquePointer?, numberofbytes: COpaquePointer?, newmdl: COpaquePointer?, direction: MmRotateDirection, copyfunction: PmmRotateCopyCallbackFunction, context: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmRotatePhysicalView((virtualaddress?.value ?: 0L).toString(), (numberofbytes?.value ?: 0L).toString(), (newmdl?.value ?: 0L).toString(), direction, 0L.toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmSecureVirtualMemory(address: COpaquePointer?, size: ULong, probemode: UInt): Handle =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmSecureVirtualMemory((address?.value ?: 0L).toString(), size.toString(), probemode.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmSecureVirtualMemoryEx(address: COpaquePointer?, size: ULong, probemode: UInt, flags: UInt): Handle =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmSecureVirtualMemoryEx((address?.value ?: 0L).toString(), size.toString(), probemode.toInt(), flags.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmSetPermanentCacheAttribute(startaddress: Long, numberofbytes: Long, cachetype: MemoryCachingType, flags: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmSetPermanentCacheAttribute(startaddress.toString(), numberofbytes.toString(), cachetype, flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmSizeOfMdl(base: COpaquePointer?, length: ULong): ULong =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmSizeOfMdl((base?.value ?: 0L).toString(), length.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmUnlockPagableImageSection(imagesectionhandle: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_mmUnlockPagableImageSection((imagesectionhandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmUnlockPages(memorydescriptorlist: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_mmUnlockPages((memorydescriptorlist?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmUnmapIoSpace(baseaddress: COpaquePointer?, numberofbytes: ULong) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_mmUnmapIoSpace((baseaddress?.value ?: 0L).toString(), numberofbytes.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmUnmapLockedPages(baseaddress: COpaquePointer?, memorydescriptorlist: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_mmUnmapLockedPages((baseaddress?.value ?: 0L).toString(), (memorydescriptorlist?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmUnmapReservedMapping(baseaddress: COpaquePointer?, pooltag: UInt, memorydescriptorlist: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_mmUnmapReservedMapping((baseaddress?.value ?: 0L).toString(), pooltag.toInt(), (memorydescriptorlist?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmUnmapVideoDisplay(baseaddress: COpaquePointer?, numberofbytes: ULong) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_mmUnmapVideoDisplay((baseaddress?.value ?: 0L).toString(), numberofbytes.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mmUnmapViewInSessionSpace(mappedbase: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmUnmapViewInSessionSpace((mappedbase?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmUnmapViewInSystemSpace(mappedbase: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_mmUnmapViewInSystemSpace((mappedbase?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mmUnsecureVirtualMemory(securehandle: Handle) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_mmUnsecureVirtualMemory((securehandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ntAllocateLocallyUniqueId(luid: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntAllocateLocallyUniqueId((luid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCommitComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntCommitComplete((enlistmenthandle?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCommitEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntCommitEnlistment((enlistmenthandle?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCommitTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntCommitTransaction((transactionhandle?.value ?: 0L).toString(), wait) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCreateEnlistment(enlistmenthandle: COpaquePointer?, desiredaccess: UInt, resourcemanagerhandle: Handle, transactionhandle: Handle, objectattributes: COpaquePointer?, createoptions: UInt, notificationmask: UInt, enlistmentkey: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntCreateEnlistment((enlistmenthandle?.value ?: 0L).toString(), desiredaccess.toInt(), (resourcemanagerhandle?.value ?: 0L).toString(), (transactionhandle?.value ?: 0L).toString(), (objectattributes?.value ?: 0L).toString(), createoptions.toInt(), notificationmask.toInt(), (enlistmentkey?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCreateResourceManager(resourcemanagerhandle: COpaquePointer?, desiredaccess: UInt, tmhandle: Handle, rmguid: COpaquePointer?, objectattributes: COpaquePointer?, createoptions: UInt, description: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntCreateResourceManager((resourcemanagerhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (tmhandle?.value ?: 0L).toString(), (rmguid?.value ?: 0L).toString(), (objectattributes?.value ?: 0L).toString(), createoptions.toInt(), (description?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCreateTransaction(transactionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, uow: COpaquePointer?, tmhandle: Handle, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: COpaquePointer?, description: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntCreateTransaction((transactionhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), (uow?.value ?: 0L).toString(), (tmhandle?.value ?: 0L).toString(), createoptions.toInt(), isolationlevel.toInt(), isolationflags.toInt(), (timeout?.value ?: 0L).toString(), (description?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntCreateTransactionManager(tmhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, logfilename: COpaquePointer?, createoptions: UInt, commitstrength: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntCreateTransactionManager((tmhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), (logfilename?.value ?: 0L).toString(), createoptions.toInt(), commitstrength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntDisplayString(string: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntDisplayString((string?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntEnumerateTransactionObject(rootobjecthandle: Handle, querytype: KtmobjectType, objectcursor: COpaquePointer?, objectcursorlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntEnumerateTransactionObject((rootobjecthandle?.value ?: 0L).toString(), querytype, (objectcursor?.value ?: 0L).toString(), objectcursorlength.toInt(), (returnlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntGetNotificationResourceManager(resourcemanagerhandle: Handle, transactionnotification: COpaquePointer?, notificationlength: UInt, timeout: COpaquePointer?, returnlength: COpaquePointer?, asynchronous: UInt, asynchronouscontext: ULong): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntGetNotificationResourceManager((resourcemanagerhandle?.value ?: 0L).toString(), (transactionnotification?.value ?: 0L).toString(), notificationlength.toInt(), (timeout?.value ?: 0L).toString(), (returnlength?.value ?: 0L).toString(), asynchronous.toInt(), asynchronouscontext.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntLoadDriver(driverservicename: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntLoadDriver((driverservicename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntMakeTemporaryObject(handle: Handle): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntMakeTemporaryObject((handle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntManagePartition(targethandle: Handle, sourcehandle: Handle, partitioninformationclass: PartitionInformationClass, partitioninformation: COpaquePointer?, partitioninformationlength: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntManagePartition((targethandle?.value ?: 0L).toString(), (sourcehandle?.value ?: 0L).toString(), partitioninformationclass, (partitioninformation?.value ?: 0L).toString(), partitioninformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenEnlistment(enlistmenthandle: COpaquePointer?, desiredaccess: UInt, resourcemanagerhandle: Handle, enlistmentguid: COpaquePointer?, objectattributes: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntOpenEnlistment((enlistmenthandle?.value ?: 0L).toString(), desiredaccess.toInt(), (resourcemanagerhandle?.value ?: 0L).toString(), (enlistmentguid?.value ?: 0L).toString(), (objectattributes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenResourceManager(resourcemanagerhandle: COpaquePointer?, desiredaccess: UInt, tmhandle: Handle, resourcemanagerguid: COpaquePointer?, objectattributes: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntOpenResourceManager((resourcemanagerhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (tmhandle?.value ?: 0L).toString(), (resourcemanagerguid?.value ?: 0L).toString(), (objectattributes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenTransaction(transactionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, uow: COpaquePointer?, tmhandle: Handle): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntOpenTransaction((transactionhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), (uow?.value ?: 0L).toString(), (tmhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenTransactionManager(tmhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, logfilename: COpaquePointer?, tmidentity: COpaquePointer?, openoptions: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntOpenTransactionManager((tmhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), (logfilename?.value ?: 0L).toString(), (tmidentity?.value ?: 0L).toString(), openoptions.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntPowerInformation(informationlevel: PowerInformationLevel, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntPowerInformation(informationlevel, (inputbuffer?.value ?: 0L).toString(), inputbufferlength.toInt(), (outputbuffer?.value ?: 0L).toString(), outputbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntPrePrepareComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntPrePrepareComplete((enlistmenthandle?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntPrePrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntPrePrepareEnlistment((enlistmenthandle?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntPrepareComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntPrepareComplete((enlistmenthandle?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntPrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntPrepareEnlistment((enlistmenthandle?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntPropagationComplete(resourcemanagerhandle: Handle, requestcookie: UInt, bufferlength: UInt, buffer: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntPropagationComplete((resourcemanagerhandle?.value ?: 0L).toString(), requestcookie.toInt(), bufferlength.toInt(), (buffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntPropagationFailed(resourcemanagerhandle: Handle, requestcookie: UInt, propstatus: Ntstatus): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntPropagationFailed((resourcemanagerhandle?.value ?: 0L).toString(), requestcookie.toInt(), propstatus) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: COpaquePointer?, enlistmentinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntQueryInformationEnlistment((enlistmenthandle?.value ?: 0L).toString(), enlistmentinformationclass, (enlistmentinformation?.value ?: 0L).toString(), enlistmentinformationlength.toInt(), (returnlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: COpaquePointer?, resourcemanagerinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntQueryInformationResourceManager((resourcemanagerhandle?.value ?: 0L).toString(), resourcemanagerinformationclass, (resourcemanagerinformation?.value ?: 0L).toString(), resourcemanagerinformationlength.toInt(), (returnlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: COpaquePointer?, transactioninformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntQueryInformationTransaction((transactionhandle?.value ?: 0L).toString(), transactioninformationclass, (transactioninformation?.value ?: 0L).toString(), transactioninformationlength.toInt(), (returnlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryInformationTransactionManager(transactionmanagerhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: COpaquePointer?, transactionmanagerinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntQueryInformationTransactionManager((transactionmanagerhandle?.value ?: 0L).toString(), transactionmanagerinformationclass, (transactionmanagerinformation?.value ?: 0L).toString(), transactionmanagerinformationlength.toInt(), (returnlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntReadOnlyEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntReadOnlyEnlistment((enlistmenthandle?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntRecoverEnlistment(enlistmenthandle: Handle, enlistmentkey: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntRecoverEnlistment((enlistmenthandle?.value ?: 0L).toString(), (enlistmentkey?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntRecoverResourceManager(resourcemanagerhandle: Handle): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntRecoverResourceManager((resourcemanagerhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntRecoverTransactionManager(transactionmanagerhandle: Handle): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntRecoverTransactionManager((transactionmanagerhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntRegisterProtocolAddressInformation(resourcemanager: Handle, protocolid: COpaquePointer?, protocolinformationsize: UInt, protocolinformation: COpaquePointer?, createoptions: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntRegisterProtocolAddressInformation((resourcemanager?.value ?: 0L).toString(), (protocolid?.value ?: 0L).toString(), protocolinformationsize.toInt(), (protocolinformation?.value ?: 0L).toString(), createoptions.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntRenameTransactionManager(logfilename: COpaquePointer?, existingtransactionmanagerguid: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntRenameTransactionManager((logfilename?.value ?: 0L).toString(), (existingtransactionmanagerguid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntRollbackComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntRollbackComplete((enlistmenthandle?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntRollbackEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntRollbackEnlistment((enlistmenthandle?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntRollbackTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntRollbackTransaction((transactionhandle?.value ?: 0L).toString(), wait) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntRollforwardTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntRollforwardTransactionManager((transactionmanagerhandle?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: COpaquePointer?, enlistmentinformationlength: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntSetInformationEnlistment((enlistmenthandle?.value ?: 0L).toString(), enlistmentinformationclass, (enlistmentinformation?.value ?: 0L).toString(), enlistmentinformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: COpaquePointer?, resourcemanagerinformationlength: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntSetInformationResourceManager((resourcemanagerhandle?.value ?: 0L).toString(), resourcemanagerinformationclass, (resourcemanagerinformation?.value ?: 0L).toString(), resourcemanagerinformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: COpaquePointer?, transactioninformationlength: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntSetInformationTransaction((transactionhandle?.value ?: 0L).toString(), transactioninformationclass, (transactioninformation?.value ?: 0L).toString(), transactioninformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSetInformationTransactionManager(tmhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: COpaquePointer?, transactionmanagerinformationlength: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntSetInformationTransactionManager((tmhandle?.value ?: 0L).toString(), transactionmanagerinformationclass, (transactionmanagerinformation?.value ?: 0L).toString(), transactionmanagerinformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntSinglePhaseReject(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntSinglePhaseReject((enlistmenthandle?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntUnloadDriver(driverservicename: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_ntUnloadDriver((driverservicename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obCloseHandle(handle: Handle, previousmode: Byte): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_obCloseHandle((handle?.value ?: 0L).toString(), previousmode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obDereferenceObjectDeferDelete(obj: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_obDereferenceObjectDeferDelete((obj?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun obDereferenceObjectDeferDeleteWithTag(obj: COpaquePointer?, tag: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_obDereferenceObjectDeferDeleteWithTag((obj?.value ?: 0L).toString(), tag.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun obGetFilterVersion(): UShort =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_obGetFilterVersion().toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obGetObjectSecurity(obj: COpaquePointer?, securitydescriptor: COpaquePointer?, memoryallocated: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_obGetObjectSecurity((obj?.value ?: 0L).toString(), (securitydescriptor?.value ?: 0L).toString(), (memoryallocated?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obReferenceObjectByHandle(handle: Handle, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, obj: COpaquePointer?, handleinformation: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_obReferenceObjectByHandle((handle?.value ?: 0L).toString(), desiredaccess.toInt(), objecttype.toString(), accessmode.toInt(), (obj?.value ?: 0L).toString(), (handleinformation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obReferenceObjectByHandleWithTag(handle: Handle, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, tag: UInt, obj: COpaquePointer?, handleinformation: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_obReferenceObjectByHandleWithTag((handle?.value ?: 0L).toString(), desiredaccess.toInt(), objecttype.toString(), accessmode.toInt(), tag.toInt(), (obj?.value ?: 0L).toString(), (handleinformation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obReferenceObjectByPointer(obj: COpaquePointer?, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_obReferenceObjectByPointer((obj?.value ?: 0L).toString(), desiredaccess.toInt(), objecttype.toString(), accessmode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obReferenceObjectByPointerWithTag(obj: COpaquePointer?, desiredaccess: UInt, objecttype: PobjectType, accessmode: Byte, tag: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_obReferenceObjectByPointerWithTag((obj?.value ?: 0L).toString(), desiredaccess.toInt(), objecttype.toString(), accessmode.toInt(), tag.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obReferenceObjectSafe(obj: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_obReferenceObjectSafe((obj?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obReferenceObjectSafeWithTag(obj: COpaquePointer?, tag: UInt): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_obReferenceObjectSafeWithTag((obj?.value ?: 0L).toString(), tag.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obRegisterCallbacks(callbackregistration: COpaquePointer?, registrationhandle: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_obRegisterCallbacks((callbackregistration?.value ?: 0L).toString(), (registrationhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obReleaseObjectSecurity(securitydescriptor: PsecurityDescriptor, memoryallocated: Boolean) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_obReleaseObjectSecurity((securitydescriptor?.value ?: 0L).toString(), memoryallocated)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun obUnRegisterCallbacks(registrationhandle: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_obUnRegisterCallbacks((registrationhandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun obfDereferenceObject(obj: COpaquePointer?): Long =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_obfDereferenceObject((obj?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obfDereferenceObjectWithTag(obj: COpaquePointer?, tag: UInt): Long =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_obfDereferenceObjectWithTag((obj?.value ?: 0L).toString(), tag.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obfReferenceObject(obj: COpaquePointer?): Long =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_obfReferenceObject((obj?.value ?: 0L).toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun obfReferenceObjectWithTag(obj: COpaquePointer?, tag: UInt): Long =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_obfReferenceObjectWithTag((obj?.value ?: 0L).toString(), tag.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pcwAddInstance(buffer: PpcwBuffer, name: COpaquePointer?, id: UInt, count: UInt, data: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_pcwAddInstance(buffer.toString(), (name?.value ?: 0L).toString(), id.toInt(), count.toInt(), (data?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pcwCloseInstance(instance: PpcwInstance) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_pcwCloseInstance(instance.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pcwCreateInstance(instance: COpaquePointer?, registration: PpcwRegistration, name: COpaquePointer?, count: UInt, data: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_pcwCreateInstance((instance?.value ?: 0L).toString(), registration.toString(), (name?.value ?: 0L).toString(), count.toInt(), (data?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pcwRegister(registration: COpaquePointer?, info: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_pcwRegister((registration?.value ?: 0L).toString(), (info?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pcwUnregister(registration: PpcwRegistration) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_pcwUnregister(registration.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poCallDriver(deviceobject: COpaquePointer?, irp: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_poCallDriver((deviceobject?.value ?: 0L).toString(), (irp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poClearPowerRequest(powerrequest: COpaquePointer?, type: PowerRequestType): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_poClearPowerRequest((powerrequest?.value ?: 0L).toString(), type) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poCreatePowerRequest(powerrequest: COpaquePointer?, deviceobject: COpaquePointer?, context: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_poCreatePowerRequest((powerrequest?.value ?: 0L).toString(), (deviceobject?.value ?: 0L).toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poCreateThermalRequest(thermalrequest: COpaquePointer?, targetdeviceobject: COpaquePointer?, policydeviceobject: COpaquePointer?, context: COpaquePointer?, flags: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_poCreateThermalRequest((thermalrequest?.value ?: 0L).toString(), (targetdeviceobject?.value ?: 0L).toString(), (policydeviceobject?.value ?: 0L).toString(), (context?.value ?: 0L).toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poDeletePowerRequest(powerrequest: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_poDeletePowerRequest((powerrequest?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poDeleteThermalRequest(thermalrequest: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_poDeleteThermalRequest((thermalrequest?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poEndDeviceBusy(idlepointer: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_poEndDeviceBusy((idlepointer?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxActivateComponent(handle: Pohandle, component: UInt, flags: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_poFxActivateComponent((handle?.value ?: 0L).toString(), component.toInt(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxCompleteDevicePowerNotRequired(handle: Pohandle) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_poFxCompleteDevicePowerNotRequired((handle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxCompleteDirectedPowerDown(handle: Pohandle) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_poFxCompleteDirectedPowerDown((handle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxCompleteIdleCondition(handle: Pohandle, component: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_poFxCompleteIdleCondition((handle?.value ?: 0L).toString(), component.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxCompleteIdleState(handle: Pohandle, component: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_poFxCompleteIdleState((handle?.value ?: 0L).toString(), component.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxIdleComponent(handle: Pohandle, component: UInt, flags: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_poFxIdleComponent((handle?.value ?: 0L).toString(), component.toInt(), flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxIssueComponentPerfStateChange(handle: Pohandle, flags: UInt, component: UInt, perfchange: COpaquePointer?, context: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_poFxIssueComponentPerfStateChange((handle?.value ?: 0L).toString(), flags.toInt(), component.toInt(), (perfchange?.value ?: 0L).toString(), (context?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxIssueComponentPerfStateChangeMultiple(handle: Pohandle, flags: UInt, component: UInt, perfchangescount: UInt, perfchanges: COpaquePointer?, context: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_poFxIssueComponentPerfStateChangeMultiple((handle?.value ?: 0L).toString(), flags.toInt(), component.toInt(), perfchangescount.toInt(), (perfchanges?.value ?: 0L).toString(), (context?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxNotifySurprisePowerOn(pdo: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_poFxNotifySurprisePowerOn((pdo?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxPowerControl(handle: Pohandle, powercontrolcode: COpaquePointer?, inbuffer: COpaquePointer?, inbuffersize: ULong, outbuffer: COpaquePointer?, outbuffersize: ULong, bytesreturned: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_poFxPowerControl((handle?.value ?: 0L).toString(), (powercontrolcode?.value ?: 0L).toString(), (inbuffer?.value ?: 0L).toString(), inbuffersize.toString(), (outbuffer?.value ?: 0L).toString(), outbuffersize.toString(), (bytesreturned?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poFxPowerOnCrashdumpDevice(handle: Pohandle, context: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_poFxPowerOnCrashdumpDevice((handle?.value ?: 0L).toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poFxQueryCurrentComponentPerfState(handle: Pohandle, flags: UInt, component: UInt, setindex: UInt, currentperf: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_poFxQueryCurrentComponentPerfState((handle?.value ?: 0L).toString(), flags.toInt(), component.toInt(), setindex.toInt(), (currentperf?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poFxRegisterComponentPerfStates(handle: Pohandle, component: UInt, flags: ULong, componentperfstatecallback: PpoFxComponentPerfStateCallback, inputstateinfo: COpaquePointer?, outputstateinfo: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_poFxRegisterComponentPerfStates((handle?.value ?: 0L).toString(), component.toInt(), flags.toString(), 0L.toString(), (inputstateinfo?.value ?: 0L).toString(), (outputstateinfo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poFxRegisterCrashdumpDevice(handle: Pohandle): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_poFxRegisterCrashdumpDevice((handle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poFxRegisterDevice(pdo: COpaquePointer?, device: COpaquePointer?, handle: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_poFxRegisterDevice((pdo?.value ?: 0L).toString(), (device?.value ?: 0L).toString(), (handle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poFxRegisterDripsWatchdogCallback(handle: Pohandle, callback: PpoFxDripsWatchdogCallback, includechilddevices: Boolean, matchingdriverobject: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_poFxRegisterDripsWatchdogCallback((handle?.value ?: 0L).toString(), 0L.toString(), includechilddevices, (matchingdriverobject?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxReportDevicePoweredOn(handle: Pohandle) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_poFxReportDevicePoweredOn((handle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxSetComponentLatency(handle: Pohandle, component: UInt, latency: ULong) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_poFxSetComponentLatency((handle?.value ?: 0L).toString(), component.toInt(), latency.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxSetComponentResidency(handle: Pohandle, component: UInt, residency: ULong) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_poFxSetComponentResidency((handle?.value ?: 0L).toString(), component.toInt(), residency.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxSetComponentWake(handle: Pohandle, component: UInt, wakehint: Boolean) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_poFxSetComponentWake((handle?.value ?: 0L).toString(), component.toInt(), wakehint)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxSetDeviceIdleTimeout(handle: Pohandle, idletimeout: ULong) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_poFxSetDeviceIdleTimeout((handle?.value ?: 0L).toString(), idletimeout.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxSetTargetDripsDevicePowerState(handle: Pohandle, targetstate: DevicePowerState): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_poFxSetTargetDripsDevicePowerState((handle?.value ?: 0L).toString(), targetstate) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poFxStartDevicePowerManagement(handle: Pohandle) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_poFxStartDevicePowerManagement((handle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poFxUnregisterDevice(handle: Pohandle) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_poFxUnregisterDevice((handle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poGetSystemWake(irp: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_poGetSystemWake((irp?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poGetThermalRequestSupport(thermalrequest: COpaquePointer?, type: PoThermalRequestType): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_poGetThermalRequestSupport((thermalrequest?.value ?: 0L).toString(), type) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poQueryWatchdogTime(pdo: COpaquePointer?, secondsremaining: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_poQueryWatchdogTime((pdo?.value ?: 0L).toString(), (secondsremaining?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poRegisterDeviceForIdleDetection(deviceobject: COpaquePointer?, conservationidletime: UInt, performanceidletime: UInt, state: DevicePowerState): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_poRegisterDeviceForIdleDetection((deviceobject?.value ?: 0L).toString(), conservationidletime.toInt(), performanceidletime.toInt(), state).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poRegisterPowerSettingCallback(deviceobject: COpaquePointer?, settingguid: COpaquePointer?, callback: PpowerSettingCallback, context: COpaquePointer?, handle: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_poRegisterPowerSettingCallback((deviceobject?.value ?: 0L).toString(), (settingguid?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString(), (handle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poRegisterSystemState(statehandle: COpaquePointer?, flags: UInt): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_poRegisterSystemState((statehandle?.value ?: 0L).toString(), flags.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poRequestPowerIrp(deviceobject: COpaquePointer?, minorfunction: UByte, powerstate: PowerState, completionfunction: PrequestPowerComplete, context: COpaquePointer?, irp: COpaquePointer?): Ntstatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poSetDeviceBusyEx(idlepointer: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_poSetDeviceBusyEx((idlepointer?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poSetHiberRange(memorymap: COpaquePointer?, flags: UInt, address: COpaquePointer?, length: ULong, tag: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_poSetHiberRange((memorymap?.value ?: 0L).toString(), flags.toInt(), (address?.value ?: 0L).toString(), length.toString(), tag.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poSetPowerRequest(powerrequest: COpaquePointer?, type: PowerRequestType): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_poSetPowerRequest((powerrequest?.value ?: 0L).toString(), type) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poSetPowerState(deviceobject: COpaquePointer?, type: PowerStateType, state: PowerState): PowerState =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poSetSystemState(flags: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_poSetSystemState(flags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poSetSystemWake(irp: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_poSetSystemWake((irp?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poSetSystemWakeDevice(deviceobject: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_poSetSystemWakeDevice((deviceobject?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poSetThermalActiveCooling(thermalrequest: COpaquePointer?, engaged: Boolean): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_poSetThermalActiveCooling((thermalrequest?.value ?: 0L).toString(), engaged) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poSetThermalPassiveCooling(thermalrequest: COpaquePointer?, throttle: UByte): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_poSetThermalPassiveCooling((thermalrequest?.value ?: 0L).toString(), throttle.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poStartDeviceBusy(idlepointer: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_poStartDeviceBusy((idlepointer?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poStartNextPowerIrp(irp: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_poStartNextPowerIrp((irp?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun poUnregisterPowerSettingCallback(handle: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_poUnregisterPowerSettingCallback((handle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun poUnregisterSystemState(statehandle: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_poUnregisterSystemState((statehandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun probeForRead(address: COpaquePointer?, length: ULong, alignment: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_probeForRead((address?.value ?: 0L).toString(), length.toString(), alignment.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun probeForWrite(address: COpaquePointer?, length: ULong, alignment: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_probeForWrite((address?.value ?: 0L).toString(), length.toString(), alignment.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psAcquireSiloHardReference(silo: Pesilo): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psAcquireSiloHardReference(silo.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psAllocSiloContextSlot(reserved: ULong, returnedcontextslot: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psAllocSiloContextSlot(reserved.toString(), (returnedcontextslot?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psAllocateAffinityToken(affinitytoken: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psAllocateAffinityToken((affinitytoken?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psAttachSiloToCurrentThread(silo: Pesilo): Pesilo =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psAttachSiloToCurrentThread(silo.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psCreateSiloContext(silo: Pesilo, size: UInt, pooltype: PoolType, contextcleanupcallback: SiloContextCleanupCallback, returnedsilocontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psCreateSiloContext(silo.toString(), size.toInt(), pooltype, 0L.toString(), (returnedsilocontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psCreateSystemThread(threadhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, processhandle: Handle, clientid: COpaquePointer?, startroutine: PkstartRoutine, startcontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psCreateSystemThread((threadhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), (processhandle?.value ?: 0L).toString(), (clientid?.value ?: 0L).toString(), 0L.toString(), (startcontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psDereferenceSiloContext(silocontext: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_psDereferenceSiloContext((silocontext?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psDetachSiloFromCurrentThread(previoussilo: Pesilo) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_psDetachSiloFromCurrentThread(previoussilo.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psFreeAffinityToken(affinitytoken: PaffinityToken) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_psFreeAffinityToken(affinitytoken.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psFreeSiloContextSlot(contextslot: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psFreeSiloContextSlot(contextslot.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetCurrentProcessId(): Handle =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psGetCurrentProcessId().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetCurrentServerSilo(): Pesilo =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psGetCurrentServerSilo().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetCurrentServerSiloName(): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psGetCurrentServerSiloName().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetCurrentSilo(): Pesilo =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psGetCurrentSilo().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetCurrentThreadId(): Handle =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psGetCurrentThreadId().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetCurrentThreadTeb(): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psGetCurrentThreadTeb().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetEffectiveServerSilo(silo: Pesilo): Pesilo =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psGetEffectiveServerSilo(silo.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetHostSilo(): Pesilo =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psGetHostSilo().toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetJobServerSilo(job: Pejob, serversilo: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psGetJobServerSilo(job.toString(), (serversilo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetJobSilo(job: Pejob, silo: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psGetJobSilo(job.toString(), (silo?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetParentSilo(job: Pejob): Pesilo =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psGetParentSilo(job.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetPermanentSiloContext(silo: Pesilo, contextslot: UInt, returnedsilocontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psGetPermanentSiloContext(silo.toString(), contextslot.toInt(), (returnedsilocontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetProcessCreateTimeQuadPart(process: Peprocess): Long =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psGetProcessCreateTimeQuadPart(process.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetProcessExitStatus(process: Peprocess): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psGetProcessExitStatus(process.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetProcessId(process: Peprocess): Handle =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psGetProcessId(process.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetProcessStartKey(process: Peprocess): ULong =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psGetProcessStartKey(process.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetServerSiloServiceSessionId(silo: Pesilo): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psGetServerSiloServiceSessionId(silo.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetSiloContainerId(silo: Pesilo): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psGetSiloContainerId(silo.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetSiloContext(silo: Pesilo, contextslot: UInt, returnedsilocontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psGetSiloContext(silo.toString(), contextslot.toInt(), (returnedsilocontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetSiloMonitorContextSlot(monitor: PsiloMonitor): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psGetSiloMonitorContextSlot(monitor.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetThreadCreateTime(thread: Pethread): Long =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psGetThreadCreateTime(thread.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetThreadExitStatus(thread: Pethread): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psGetThreadExitStatus(thread.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetThreadId(thread: Pethread): Handle =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psGetThreadId(thread.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetThreadProcessId(thread: Pethread): Handle =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psGetThreadProcessId(thread.toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetThreadProperty(thread: Pethread, key: ULong, flags: UInt): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psGetThreadProperty(thread.toString(), key.toString(), flags.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetThreadServerSilo(thread: Pethread): Pesilo =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psGetThreadServerSilo(thread.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psGetVersion(majorversion: COpaquePointer?, minorversion: COpaquePointer?, buildnumber: COpaquePointer?, csdversion: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psGetVersion((majorversion?.value ?: 0L).toString(), (minorversion?.value ?: 0L).toString(), (buildnumber?.value ?: 0L).toString(), (csdversion?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psInsertPermanentSiloContext(silo: Pesilo, contextslot: UInt, silocontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psInsertPermanentSiloContext(silo.toString(), contextslot.toInt(), (silocontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psInsertSiloContext(silo: Pesilo, contextslot: UInt, silocontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psInsertSiloContext(silo.toString(), contextslot.toInt(), (silocontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psIsCurrentThreadInServerSilo(): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psIsCurrentThreadInServerSilo() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psIsCurrentThreadPrefetching(): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psIsCurrentThreadPrefetching() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psIsHostSilo(silo: Pesilo): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psIsHostSilo(silo.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psMakeSiloContextPermanent(silo: Pesilo, contextslot: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psMakeSiloContextPermanent(silo.toString(), contextslot.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psQueryTotalCycleTimeProcess(process: Peprocess, cycletimestamp: COpaquePointer?): ULong =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psQueryTotalCycleTimeProcess(process.toString(), (cycletimestamp?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psReferenceSiloContext(silocontext: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_psReferenceSiloContext((silocontext?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psRegisterSiloMonitor(registration: COpaquePointer?, returnedmonitor: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psRegisterSiloMonitor((registration?.value ?: 0L).toString(), (returnedmonitor?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psReleaseSiloHardReference(silo: Pesilo) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_psReleaseSiloHardReference(silo.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psRemoveCreateThreadNotifyRoutine(notifyroutine: PcreateThreadNotifyRoutine): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psRemoveCreateThreadNotifyRoutine(0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psRemoveLoadImageNotifyRoutine(notifyroutine: PloadImageNotifyRoutine): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psRemoveLoadImageNotifyRoutine(0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psRemoveSiloContext(silo: Pesilo, contextslot: UInt, removedsilocontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psRemoveSiloContext(silo.toString(), contextslot.toInt(), (removedsilocontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psReplaceSiloContext(silo: Pesilo, contextslot: UInt, newsilocontext: COpaquePointer?, oldsilocontext: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psReplaceSiloContext(silo.toString(), contextslot.toInt(), (newsilocontext?.value ?: 0L).toString(), (oldsilocontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psRevertToUserMultipleGroupAffinityThread(affinitytoken: PaffinityToken) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_psRevertToUserMultipleGroupAffinityThread(affinitytoken.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psSetCreateProcessNotifyRoutine(notifyroutine: PcreateProcessNotifyRoutine, remove: Boolean): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psSetCreateProcessNotifyRoutine(0L.toString(), remove) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psSetCreateProcessNotifyRoutineEx(notifyroutine: PcreateProcessNotifyRoutineEx, remove: Boolean): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psSetCreateProcessNotifyRoutineEx(0L.toString(), remove) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psSetCreateProcessNotifyRoutineEx2(notifytype: Pscreateprocessnotifytype, notifyinformation: COpaquePointer?, remove: Boolean): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psSetCreateProcessNotifyRoutineEx2(notifytype, (notifyinformation?.value ?: 0L).toString(), remove) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psSetCreateThreadNotifyRoutine(notifyroutine: PcreateThreadNotifyRoutine): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psSetCreateThreadNotifyRoutine(0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psSetCreateThreadNotifyRoutineEx(notifytype: Pscreatethreadnotifytype, notifyinformation: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psSetCreateThreadNotifyRoutineEx(notifytype, (notifyinformation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psSetCurrentThreadPrefetching(prefetching: Boolean): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psSetCurrentThreadPrefetching(prefetching) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psSetLoadImageNotifyRoutine(notifyroutine: PloadImageNotifyRoutine): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psSetLoadImageNotifyRoutine(0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psSetLoadImageNotifyRoutineEx(notifyroutine: PloadImageNotifyRoutine, flags: ULong): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psSetLoadImageNotifyRoutineEx(0L.toString(), flags.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psSetSystemMultipleGroupAffinityThread(groupaffinities: COpaquePointer?, groupcount: UShort, affinitytoken: PaffinityToken): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psSetSystemMultipleGroupAffinityThread((groupaffinities?.value ?: 0L).toString(), groupcount.toInt(), affinitytoken.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psStartSiloMonitor(monitor: PsiloMonitor): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psStartSiloMonitor(monitor.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psTerminateServerSilo(serversilo: Pesilo, exitstatus: Ntstatus) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_psTerminateServerSilo(serversilo.toString(), exitstatus)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psTerminateSystemThread(exitstatus: Ntstatus): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psTerminateSystemThread(exitstatus) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun psUnregisterSiloMonitor(monitor: PsiloMonitor) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_psUnregisterSiloMonitor(monitor.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun psWrapApcWow64Thread(apccontext: COpaquePointer?, apcroutine: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_psWrapApcWow64Thread((apccontext?.value ?: 0L).toString(), (apcroutine?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pshedAllocateMemory(size: UInt): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_pshedAllocateMemory(size.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pshedFreeMemory(address: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_pshedFreeMemory((address?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pshedIsSystemWheaEnabled(): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_pshedIsSystemWheaEnabled() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pshedRegisterPlugin(packet: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_pshedRegisterPlugin((packet?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pshedSynchronizeExecution(errorsource: COpaquePointer?, synchronizeroutine: PksynchronizeRoutine, synchronizecontext: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_pshedSynchronizeExecution((errorsource?.value ?: 0L).toString(), 0L.toString(), (synchronizecontext?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pshedUnregisterPlugin(pluginhandle: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_pshedUnregisterPlugin((pluginhandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlAppendUnicodeStringToString(destination: COpaquePointer?, source: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlAppendUnicodeStringToString((destination?.value ?: 0L).toString(), (source?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAppendUnicodeToString(destination: COpaquePointer?, source: Pcwstr): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlAppendUnicodeToString((destination?.value ?: 0L).toString(), (source?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAreBitsClear(bitmapheader: COpaquePointer?, startingindex: UInt, length: UInt): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlAreBitsClear((bitmapheader?.value ?: 0L).toString(), startingindex.toInt(), length.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAreBitsSet(bitmapheader: COpaquePointer?, startingindex: UInt, length: UInt): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlAreBitsSet((bitmapheader?.value ?: 0L).toString(), startingindex.toInt(), length.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlAssert(voidfailedassertion: COpaquePointer?, voidfilename: COpaquePointer?, linenumber: UInt, mutablemessage: Pcstr) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_rtlAssert((voidfailedassertion?.value ?: 0L).toString(), (voidfilename?.value ?: 0L).toString(), linenumber.toInt(), (mutablemessage?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlCheckRegistryKey(relativeto: UInt, path: Pcwstr): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlCheckRegistryKey(relativeto.toInt(), (path?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlClearAllBits(bitmapheader: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_rtlClearAllBits((bitmapheader?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlClearBit(bitmapheader: COpaquePointer?, bitnumber: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_rtlClearBit((bitmapheader?.value ?: 0L).toString(), bitnumber.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlClearBits(bitmapheader: COpaquePointer?, startingindex: UInt, numbertoclear: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_rtlClearBits((bitmapheader?.value ?: 0L).toString(), startingindex.toInt(), numbertoclear.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlCmDecodeMemIoResource(descriptor: COpaquePointer?, start: COpaquePointer?): ULong =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlCmDecodeMemIoResource((descriptor?.value ?: 0L).toString(), (start?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCmEncodeMemIoResource(descriptor: COpaquePointer?, type: UByte, length: ULong, start: ULong): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlCmEncodeMemIoResource((descriptor?.value ?: 0L).toString(), type.toInt(), length.toString(), start.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCompareString(string1: COpaquePointer?, string2: COpaquePointer?, caseinsensitive: Boolean): Int =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlCompareString((string1?.value ?: 0L).toString(), (string2?.value ?: 0L).toString(), caseinsensitive) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCompareUnicodeString(string1: COpaquePointer?, string2: COpaquePointer?, caseinsensitive: Boolean): Int =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlCompareUnicodeString((string1?.value ?: 0L).toString(), (string2?.value ?: 0L).toString(), caseinsensitive) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCompareUnicodeStrings(string1: COpaquePointer?, string1length: ULong, string2: COpaquePointer?, string2length: ULong, caseinsensitive: Boolean): Int =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlCompareUnicodeStrings((string1?.value ?: 0L).toString(), string1length.toString(), (string2?.value ?: 0L).toString(), string2length.toString(), caseinsensitive) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlContractHashTable(hashtable: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlContractHashTable((hashtable?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCopyBitMap(source: COpaquePointer?, destination: COpaquePointer?, targetbit: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_rtlCopyBitMap((source?.value ?: 0L).toString(), (destination?.value ?: 0L).toString(), targetbit.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlCopyString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_rtlCopyString((destinationstring?.value ?: 0L).toString(), (sourcestring?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlCopyUnicodeString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_rtlCopyUnicodeString((destinationstring?.value ?: 0L).toString(), (sourcestring?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlCreateHashTable(hashtable: COpaquePointer?, shift: UInt, flags: UInt): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlCreateHashTable((hashtable?.value ?: 0L).toString(), shift.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCreateHashTableEx(hashtable: COpaquePointer?, initialsize: UInt, shift: UInt, flags: UInt): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlCreateHashTableEx((hashtable?.value ?: 0L).toString(), initialsize.toInt(), shift.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCreateRegistryKey(relativeto: UInt, path: Pcwstr): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlCreateRegistryKey(relativeto.toInt(), (path?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlCreateSecurityDescriptor(securitydescriptor: PsecurityDescriptor, revision: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlCreateSecurityDescriptor((securitydescriptor?.value ?: 0L).toString(), revision.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDelete(links: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlDelete((links?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDeleteElementGenericTable(table: COpaquePointer?, buffer: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlDeleteElementGenericTable((table?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDeleteElementGenericTableAvl(table: COpaquePointer?, buffer: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlDeleteElementGenericTableAvl((table?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDeleteElementGenericTableAvlEx(table: COpaquePointer?, nodeorparent: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_rtlDeleteElementGenericTableAvlEx((table?.value ?: 0L).toString(), (nodeorparent?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlDeleteHashTable(hashtable: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_rtlDeleteHashTable((hashtable?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlDeleteNoSplay(links: COpaquePointer?, root: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_rtlDeleteNoSplay((links?.value ?: 0L).toString(), (root?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlDeleteRegistryValue(relativeto: UInt, path: Pcwstr, valuename: Pcwstr): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlDeleteRegistryValue(relativeto.toInt(), (path?.value ?: 0L).toString(), (valuename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDowncaseUnicodeChar(sourcecharacter: UShort): UShort =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlDowncaseUnicodeChar(sourcecharacter.toInt()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEndEnumerationHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_rtlEndEnumerationHashTable((hashtable?.value ?: 0L).toString(), (enumerator?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlEndStrongEnumerationHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_rtlEndStrongEnumerationHashTable((hashtable?.value ?: 0L).toString(), (enumerator?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlEndWeakEnumerationHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_rtlEndWeakEnumerationHashTable((hashtable?.value ?: 0L).toString(), (enumerator?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlEnumerateEntryHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlEnumerateEntryHashTable((hashtable?.value ?: 0L).toString(), (enumerator?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEnumerateGenericTable(table: COpaquePointer?, restart: Boolean): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlEnumerateGenericTable((table?.value ?: 0L).toString(), restart).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEnumerateGenericTableAvl(table: COpaquePointer?, restart: Boolean): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlEnumerateGenericTableAvl((table?.value ?: 0L).toString(), restart).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEnumerateGenericTableLikeADirectory(table: COpaquePointer?, matchfunction: PrtlAvlMatchFunction, matchdata: COpaquePointer?, nextflag: UInt, restartkey: COpaquePointer?, deletecount: COpaquePointer?, buffer: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlEnumerateGenericTableLikeADirectory((table?.value ?: 0L).toString(), 0L.toString(), (matchdata?.value ?: 0L).toString(), nextflag.toInt(), (restartkey?.value ?: 0L).toString(), (deletecount?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEnumerateGenericTableWithoutSplaying(table: COpaquePointer?, restartkey: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlEnumerateGenericTableWithoutSplaying((table?.value ?: 0L).toString(), (restartkey?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEnumerateGenericTableWithoutSplayingAvl(table: COpaquePointer?, restartkey: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlEnumerateGenericTableWithoutSplayingAvl((table?.value ?: 0L).toString(), (restartkey?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEqualString(string1: COpaquePointer?, string2: COpaquePointer?, caseinsensitive: Boolean): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlEqualString((string1?.value ?: 0L).toString(), (string2?.value ?: 0L).toString(), caseinsensitive) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEqualUnicodeString(string1: COpaquePointer?, string2: COpaquePointer?, caseinsensitive: Boolean): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlEqualUnicodeString((string1?.value ?: 0L).toString(), (string2?.value ?: 0L).toString(), caseinsensitive) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlExpandHashTable(hashtable: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlExpandHashTable((hashtable?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlExtractBitMap(source: COpaquePointer?, destination: COpaquePointer?, targetbit: UInt, numberofbits: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_rtlExtractBitMap((source?.value ?: 0L).toString(), (destination?.value ?: 0L).toString(), targetbit.toInt(), numberofbits.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlFindClearBits(bitmapheader: COpaquePointer?, numbertofind: UInt, hintindex: UInt): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlFindClearBits((bitmapheader?.value ?: 0L).toString(), numbertofind.toInt(), hintindex.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFindClearBitsAndSet(bitmapheader: COpaquePointer?, numbertofind: UInt, hintindex: UInt): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlFindClearBitsAndSet((bitmapheader?.value ?: 0L).toString(), numbertofind.toInt(), hintindex.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFindClearRuns(bitmapheader: COpaquePointer?, runarray: COpaquePointer?, sizeofrunarray: UInt, locatelongestruns: Boolean): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlFindClearRuns((bitmapheader?.value ?: 0L).toString(), (runarray?.value ?: 0L).toString(), sizeofrunarray.toInt(), locatelongestruns).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFindClosestEncodableLength(sourcelength: ULong, targetlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlFindClosestEncodableLength(sourcelength.toString(), (targetlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFindFirstRunClear(bitmapheader: COpaquePointer?, startingindex: COpaquePointer?): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlFindFirstRunClear((bitmapheader?.value ?: 0L).toString(), (startingindex?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFindLastBackwardRunClear(bitmapheader: COpaquePointer?, fromindex: UInt, startingrunindex: COpaquePointer?): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlFindLastBackwardRunClear((bitmapheader?.value ?: 0L).toString(), fromindex.toInt(), (startingrunindex?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFindLeastSignificantBit(set: ULong): Byte =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlFindLeastSignificantBit(set.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFindLongestRunClear(bitmapheader: COpaquePointer?, startingindex: COpaquePointer?): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlFindLongestRunClear((bitmapheader?.value ?: 0L).toString(), (startingindex?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFindMostSignificantBit(set: ULong): Byte =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlFindMostSignificantBit(set.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFindNextForwardRunClear(bitmapheader: COpaquePointer?, fromindex: UInt, startingrunindex: COpaquePointer?): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlFindNextForwardRunClear((bitmapheader?.value ?: 0L).toString(), fromindex.toInt(), (startingrunindex?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFindSetBits(bitmapheader: COpaquePointer?, numbertofind: UInt, hintindex: UInt): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlFindSetBits((bitmapheader?.value ?: 0L).toString(), numbertofind.toInt(), hintindex.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFindSetBitsAndClear(bitmapheader: COpaquePointer?, numbertofind: UInt, hintindex: UInt): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlFindSetBitsAndClear((bitmapheader?.value ?: 0L).toString(), numbertofind.toInt(), hintindex.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFreeUTF8String(utf8string: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_rtlFreeUTF8String((utf8string?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlGUIDFromString(guidstring: COpaquePointer?, guid: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlGUIDFromString((guidstring?.value ?: 0L).toString(), (guid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGenerateClass5Guid(namespaceguid: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt, guid: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlGenerateClass5Guid((namespaceguid?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), buffersize.toInt(), (guid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetActiveConsoleId(): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlGetActiveConsoleId().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetCallersAddress(callersaddress: COpaquePointer?, callerscaller: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_rtlGetCallersAddress((callersaddress?.value ?: 0L).toString(), (callerscaller?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlGetConsoleSessionForegroundProcessId(): ULong =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlGetConsoleSessionForegroundProcessId().toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetElementGenericTable(table: COpaquePointer?, i: UInt): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlGetElementGenericTable((table?.value ?: 0L).toString(), i.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetElementGenericTableAvl(table: COpaquePointer?, i: UInt): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlGetElementGenericTableAvl((table?.value ?: 0L).toString(), i.toInt()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetEnabledExtendedFeatures(featuremask: ULong): ULong =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlGetEnabledExtendedFeatures(featuremask.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetNextEntryHashTable(hashtable: COpaquePointer?, context: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlGetNextEntryHashTable((hashtable?.value ?: 0L).toString(), (context?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetNtProductType(ntproducttype: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlGetNtProductType((ntproducttype?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetNtSystemRoot(): Pcwstr =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlGetNtSystemRoot().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetPersistedStateLocation(sourceid: Pcwstr, customvalue: Pcwstr, defaultpath: Pcwstr, statelocationtype: StateLocationType, targetpath: Pwstr, bufferlengthin: UInt, bufferlengthout: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlGetPersistedStateLocation((sourceid?.value ?: 0L).toString(), (customvalue?.value ?: 0L).toString(), (defaultpath?.value ?: 0L).toString(), statelocationtype, (targetpath?.value ?: 0L).toString(), bufferlengthin.toInt(), (bufferlengthout?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetSuiteMask(): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlGetSuiteMask().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetVersion(lpversioninformation: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlGetVersion((lpversioninformation?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlHashUnicodeString(string: COpaquePointer?, caseinsensitive: Boolean, hashalgorithm: UInt, hashvalue: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlHashUnicodeString((string?.value ?: 0L).toString(), caseinsensitive, hashalgorithm.toInt(), (hashvalue?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInitEnumerationHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlInitEnumerationHashTable((hashtable?.value ?: 0L).toString(), (enumerator?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInitStrongEnumerationHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlInitStrongEnumerationHashTable((hashtable?.value ?: 0L).toString(), (enumerator?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInitUTF8String(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_rtlInitUTF8String((destinationstring?.value ?: 0L).toString(), (sourcestring?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlInitUTF8StringEx(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlInitUTF8StringEx((destinationstring?.value ?: 0L).toString(), (sourcestring?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInitWeakEnumerationHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlInitWeakEnumerationHashTable((hashtable?.value ?: 0L).toString(), (enumerator?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInitializeBitMap(bitmapheader: COpaquePointer?, bitmapbuffer: COpaquePointer?, sizeofbitmap: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_rtlInitializeBitMap((bitmapheader?.value ?: 0L).toString(), (bitmapbuffer?.value ?: 0L).toString(), sizeofbitmap.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlInitializeGenericTable(table: COpaquePointer?, compareroutine: PrtlGenericCompareRoutine, allocateroutine: PrtlGenericAllocateRoutine, freeroutine: PrtlGenericFreeRoutine, tablecontext: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_rtlInitializeGenericTable((table?.value ?: 0L).toString(), 0L.toString(), 0L.toString(), 0L.toString(), (tablecontext?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlInitializeGenericTableAvl(table: COpaquePointer?, compareroutine: PrtlAvlCompareRoutine, allocateroutine: PrtlAvlAllocateRoutine, freeroutine: PrtlAvlFreeRoutine, tablecontext: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_rtlInitializeGenericTableAvl((table?.value ?: 0L).toString(), 0L.toString(), 0L.toString(), 0L.toString(), (tablecontext?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlInsertElementGenericTable(table: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt, newelement: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlInsertElementGenericTable((table?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), buffersize.toInt(), (newelement?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInsertElementGenericTableAvl(table: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt, newelement: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlInsertElementGenericTableAvl((table?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), buffersize.toInt(), (newelement?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInsertElementGenericTableFull(table: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt, newelement: COpaquePointer?, nodeorparent: COpaquePointer?, searchresult: TableSearchResult): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlInsertElementGenericTableFull((table?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), buffersize.toInt(), (newelement?.value ?: 0L).toString(), (nodeorparent?.value ?: 0L).toString(), searchresult).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInsertElementGenericTableFullAvl(table: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt, newelement: COpaquePointer?, nodeorparent: COpaquePointer?, searchresult: TableSearchResult): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlInsertElementGenericTableFullAvl((table?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), buffersize.toInt(), (newelement?.value ?: 0L).toString(), (nodeorparent?.value ?: 0L).toString(), searchresult).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInsertEntryHashTable(hashtable: COpaquePointer?, entry: COpaquePointer?, signature: ULong, context: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlInsertEntryHashTable((hashtable?.value ?: 0L).toString(), (entry?.value ?: 0L).toString(), signature.toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlInt64ToUnicodeString(value: ULong, base: UInt, string: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlInt64ToUnicodeString(value.toString(), base.toInt(), (string?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIntegerToUnicodeString(value: UInt, base: UInt, string: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlIntegerToUnicodeString(value.toInt(), base.toInt(), (string?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIoDecodeMemIoResource(descriptor: COpaquePointer?, alignment: COpaquePointer?, minimumaddress: COpaquePointer?, maximumaddress: COpaquePointer?): ULong =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlIoDecodeMemIoResource((descriptor?.value ?: 0L).toString(), (alignment?.value ?: 0L).toString(), (minimumaddress?.value ?: 0L).toString(), (maximumaddress?.value ?: 0L).toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIoEncodeMemIoResource(descriptor: COpaquePointer?, type: UByte, length: ULong, alignment: ULong, minimumaddress: ULong, maximumaddress: ULong): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlIoEncodeMemIoResource((descriptor?.value ?: 0L).toString(), type.toInt(), length.toString(), alignment.toString(), minimumaddress.toString(), maximumaddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsApiSetImplemented(apisetname: Pcstr): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlIsApiSetImplemented((apisetname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsGenericTableEmpty(table: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlIsGenericTableEmpty((table?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsGenericTableEmptyAvl(table: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlIsGenericTableEmptyAvl((table?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsMultiSessionSku(): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlIsMultiSessionSku() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsMultiUsersInSessionSku(): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlIsMultiUsersInSessionSku() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsNtDdiVersionAvailable(version: UInt): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlIsNtDdiVersionAvailable(version.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsServicePackVersionInstalled(version: UInt): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlIsServicePackVersionInstalled(version.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsStateSeparationEnabled(): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlIsStateSeparationEnabled() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlIsUntrustedObject(handle: Handle, obj: COpaquePointer?, untrustedobject: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlIsUntrustedObject((handle?.value ?: 0L).toString(), (obj?.value ?: 0L).toString(), (untrustedobject?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlLengthSecurityDescriptor(securitydescriptor: PsecurityDescriptor): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlLengthSecurityDescriptor((securitydescriptor?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlLookupElementGenericTable(table: COpaquePointer?, buffer: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlLookupElementGenericTable((table?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlLookupElementGenericTableAvl(table: COpaquePointer?, buffer: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlLookupElementGenericTableAvl((table?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlLookupElementGenericTableFull(table: COpaquePointer?, buffer: COpaquePointer?, nodeorparent: COpaquePointer?, searchresult: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlLookupElementGenericTableFull((table?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (nodeorparent?.value ?: 0L).toString(), (searchresult?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlLookupElementGenericTableFullAvl(table: COpaquePointer?, buffer: COpaquePointer?, nodeorparent: COpaquePointer?, searchresult: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlLookupElementGenericTableFullAvl((table?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (nodeorparent?.value ?: 0L).toString(), (searchresult?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlLookupEntryHashTable(hashtable: COpaquePointer?, signature: ULong, context: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlLookupEntryHashTable((hashtable?.value ?: 0L).toString(), signature.toString(), (context?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlLookupFirstMatchingElementGenericTableAvl(table: COpaquePointer?, buffer: COpaquePointer?, restartkey: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlLookupFirstMatchingElementGenericTableAvl((table?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), (restartkey?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlMapGenericMask(accessmask: COpaquePointer?, genericmapping: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_rtlMapGenericMask((accessmask?.value ?: 0L).toString(), (genericmapping?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlNormalizeSecurityDescriptor(securitydescriptor: COpaquePointer?, securitydescriptorlength: UInt, newsecuritydescriptor: COpaquePointer?, newsecuritydescriptorlength: COpaquePointer?, checkonly: Boolean): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlNormalizeSecurityDescriptor((securitydescriptor?.value ?: 0L).toString(), securitydescriptorlength.toInt(), (newsecuritydescriptor?.value ?: 0L).toString(), (newsecuritydescriptorlength?.value ?: 0L).toString(), checkonly) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlNumberGenericTableElements(table: COpaquePointer?): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlNumberGenericTableElements((table?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlNumberGenericTableElementsAvl(table: COpaquePointer?): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlNumberGenericTableElementsAvl((table?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlNumberOfClearBits(bitmapheader: COpaquePointer?): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlNumberOfClearBits((bitmapheader?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlNumberOfClearBitsInRange(bitmapheader: COpaquePointer?, startingindex: UInt, length: UInt): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlNumberOfClearBitsInRange((bitmapheader?.value ?: 0L).toString(), startingindex.toInt(), length.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlNumberOfSetBits(bitmapheader: COpaquePointer?): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlNumberOfSetBits((bitmapheader?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlNumberOfSetBitsInRange(bitmapheader: COpaquePointer?, startingindex: UInt, length: UInt): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlNumberOfSetBitsInRange((bitmapheader?.value ?: 0L).toString(), startingindex.toInt(), length.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlNumberOfSetBitsUlongPtr(target: ULong): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlNumberOfSetBitsUlongPtr(target.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlPrefetchMemoryNonTemporal(source: COpaquePointer?, length: ULong) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_rtlPrefetchMemoryNonTemporal((source?.value ?: 0L).toString(), length.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlPrefixUnicodeString(string1: COpaquePointer?, string2: COpaquePointer?, caseinsensitive: Boolean): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlPrefixUnicodeString((string1?.value ?: 0L).toString(), (string2?.value ?: 0L).toString(), caseinsensitive) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlQueryRegistryValueWithFallback(primaryhandle: Handle, fallbackhandle: Handle, valuename: COpaquePointer?, valuelength: UInt, valuetype: COpaquePointer?, valuedata: COpaquePointer?, resultlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlQueryRegistryValueWithFallback((primaryhandle?.value ?: 0L).toString(), (fallbackhandle?.value ?: 0L).toString(), (valuename?.value ?: 0L).toString(), valuelength.toInt(), (valuetype?.value ?: 0L).toString(), (valuedata?.value ?: 0L).toString(), (resultlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlQueryRegistryValues(relativeto: UInt, path: Pcwstr, querytable: COpaquePointer?, context: COpaquePointer?, environment: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlQueryRegistryValues(relativeto.toInt(), (path?.value ?: 0L).toString(), (querytable?.value ?: 0L).toString(), (context?.value ?: 0L).toString(), (environment?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlQueryValidationRunlevel(componentname: COpaquePointer?): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlQueryValidationRunlevel((componentname?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlRealPredecessor(links: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlRealPredecessor((links?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlRealSuccessor(links: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlRealSuccessor((links?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlRemoveEntryHashTable(hashtable: COpaquePointer?, entry: COpaquePointer?, context: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlRemoveEntryHashTable((hashtable?.value ?: 0L).toString(), (entry?.value ?: 0L).toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlRunOnceBeginInitialize(runonce: COpaquePointer?, flags: UInt, context: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlRunOnceBeginInitialize((runonce?.value ?: 0L).toString(), flags.toInt(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlRunOnceComplete(runonce: COpaquePointer?, flags: UInt, context: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlRunOnceComplete((runonce?.value ?: 0L).toString(), flags.toInt(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlRunOnceExecuteOnce(runonce: COpaquePointer?, initfn: PrtlRunOnceInitFn, parameter: COpaquePointer?, context: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlRunOnceExecuteOnce((runonce?.value ?: 0L).toString(), 0L.toString(), (parameter?.value ?: 0L).toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlRunOnceInitialize(runonce: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_rtlRunOnceInitialize((runonce?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlSetAllBits(bitmapheader: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_rtlSetAllBits((bitmapheader?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlSetBit(bitmapheader: COpaquePointer?, bitnumber: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_rtlSetBit((bitmapheader?.value ?: 0L).toString(), bitnumber.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlSetBits(bitmapheader: COpaquePointer?, startingindex: UInt, numbertoset: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_rtlSetBits((bitmapheader?.value ?: 0L).toString(), startingindex.toInt(), numbertoset.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlSetDaclSecurityDescriptor(securitydescriptor: PsecurityDescriptor, daclpresent: Boolean, dacl: COpaquePointer?, dacldefaulted: Boolean): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlSetDaclSecurityDescriptor((securitydescriptor?.value ?: 0L).toString(), daclpresent, (dacl?.value ?: 0L).toString(), dacldefaulted) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlSetSystemGlobalData(dataid: RtlSystemGlobalDataId, buffer: COpaquePointer?, size: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlSetSystemGlobalData(dataid, (buffer?.value ?: 0L).toString(), size.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlSplay(links: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlSplay((links?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlStringFromGUID(guid: COpaquePointer?, guidstring: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlStringFromGUID((guid?.value ?: 0L).toString(), (guidstring?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlStronglyEnumerateEntryHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlStronglyEnumerateEntryHashTable((hashtable?.value ?: 0L).toString(), (enumerator?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlSubtreePredecessor(links: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlSubtreePredecessor((links?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlSubtreeSuccessor(links: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlSubtreeSuccessor((links?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlSuffixUnicodeString(string1: COpaquePointer?, string2: COpaquePointer?, caseinsensitive: Boolean): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlSuffixUnicodeString((string1?.value ?: 0L).toString(), (string2?.value ?: 0L).toString(), caseinsensitive) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlTestBit(bitmapheader: COpaquePointer?, bitnumber: UInt): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlTestBit((bitmapheader?.value ?: 0L).toString(), bitnumber.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlTimeFieldsToTime(timefields: COpaquePointer?, time: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlTimeFieldsToTime((timefields?.value ?: 0L).toString(), (time?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlTimeToTimeFields(time: COpaquePointer?, timefields: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_rtlTimeToTimeFields((time?.value ?: 0L).toString(), (timefields?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlUTF8StringToUnicodeString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlUTF8StringToUnicodeString((destinationstring?.value ?: 0L).toString(), (sourcestring?.value ?: 0L).toString(), allocatedestinationstring) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUTF8ToUnicodeN(unicodestringdestination: Pwstr, unicodestringmaxbytecount: UInt, unicodestringactualbytecount: COpaquePointer?, utf8stringsource: Pcstr, utf8stringbytecount: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlUTF8ToUnicodeN((unicodestringdestination?.value ?: 0L).toString(), unicodestringmaxbytecount.toInt(), (unicodestringactualbytecount?.value ?: 0L).toString(), (utf8stringsource?.value ?: 0L).toString(), utf8stringbytecount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUnicodeStringToInt64(string: COpaquePointer?, base: UInt, number: COpaquePointer?, endpointer: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlUnicodeStringToInt64((string?.value ?: 0L).toString(), base.toInt(), (number?.value ?: 0L).toString(), (endpointer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUnicodeStringToInteger(string: COpaquePointer?, base: UInt, value: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlUnicodeStringToInteger((string?.value ?: 0L).toString(), base.toInt(), (value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUnicodeStringToUTF8String(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlUnicodeStringToUTF8String((destinationstring?.value ?: 0L).toString(), (sourcestring?.value ?: 0L).toString(), allocatedestinationstring) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUnicodeToUTF8N(utf8stringdestination: Pstr, utf8stringmaxbytecount: UInt, utf8stringactualbytecount: COpaquePointer?, unicodestringsource: COpaquePointer?, unicodestringbytecount: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlUnicodeToUTF8N((utf8stringdestination?.value ?: 0L).toString(), utf8stringmaxbytecount.toInt(), (utf8stringactualbytecount?.value ?: 0L).toString(), (unicodestringsource?.value ?: 0L).toString(), unicodestringbytecount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUpcaseUnicodeChar(sourcecharacter: UShort): UShort =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlUpcaseUnicodeChar(sourcecharacter.toInt()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUpcaseUnicodeString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?, allocatedestinationstring: Boolean): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlUpcaseUnicodeString((destinationstring?.value ?: 0L).toString(), (sourcestring?.value ?: 0L).toString(), allocatedestinationstring) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUpperChar(character: Byte): Byte =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlUpperChar(character.toInt()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlUpperString(destinationstring: COpaquePointer?, sourcestring: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_rtlUpperString((destinationstring?.value ?: 0L).toString(), (sourcestring?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun rtlValidRelativeSecurityDescriptor(securitydescriptorinput: PsecurityDescriptor, securitydescriptorlength: UInt, requiredinformation: UInt): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlValidRelativeSecurityDescriptor((securitydescriptorinput?.value ?: 0L).toString(), securitydescriptorlength.toInt(), requiredinformation.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlValidSecurityDescriptor(securitydescriptor: PsecurityDescriptor): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlValidSecurityDescriptor((securitydescriptor?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlVerifyVersionInfo(versioninfo: COpaquePointer?, typemask: UInt, conditionmask: ULong): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlVerifyVersionInfo((versioninfo?.value ?: 0L).toString(), typemask.toInt(), conditionmask.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlVolumeDeviceToDosName(volumedeviceobject: COpaquePointer?, dosname: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlVolumeDeviceToDosName((volumedeviceobject?.value ?: 0L).toString(), (dosname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlWalkFrameChain(callers: COpaquePointer?, count: UInt, flags: UInt): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlWalkFrameChain((callers?.value ?: 0L).toString(), count.toInt(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlWeaklyEnumerateEntryHashTable(hashtable: COpaquePointer?, enumerator: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlWeaklyEnumerateEntryHashTable((hashtable?.value ?: 0L).toString(), (enumerator?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlWriteRegistryValue(relativeto: UInt, path: Pcwstr, valuename: Pcwstr, valuetype: UInt, valuedata: COpaquePointer?, valuelength: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlWriteRegistryValue(relativeto.toInt(), (path?.value ?: 0L).toString(), (valuename?.value ?: 0L).toString(), valuetype.toInt(), (valuedata?.value ?: 0L).toString(), valuelength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlxAnsiStringToUnicodeSize(ansistring: COpaquePointer?): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlxAnsiStringToUnicodeSize((ansistring?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlxUnicodeStringToAnsiSize(unicodestring: COpaquePointer?): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_rtlxUnicodeStringToAnsiSize((unicodestring?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAccessCheck(securitydescriptor: PsecurityDescriptor, subjectsecuritycontext: COpaquePointer?, subjectcontextlocked: Boolean, desiredaccess: UInt, previouslygrantedaccess: UInt, privileges: COpaquePointer?, genericmapping: COpaquePointer?, accessmode: Byte, grantedaccess: COpaquePointer?, accessstatus: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_seAccessCheck((securitydescriptor?.value ?: 0L).toString(), (subjectsecuritycontext?.value ?: 0L).toString(), subjectcontextlocked, desiredaccess.toInt(), previouslygrantedaccess.toInt(), (privileges?.value ?: 0L).toString(), (genericmapping?.value ?: 0L).toString(), accessmode.toInt(), (grantedaccess?.value ?: 0L).toString(), (accessstatus?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAssignSecurity(parentdescriptor: PsecurityDescriptor, explicitdescriptor: PsecurityDescriptor, newdescriptor: COpaquePointer?, isdirectoryobject: Boolean, subjectcontext: COpaquePointer?, genericmapping: COpaquePointer?, pooltype: PoolType): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_seAssignSecurity((parentdescriptor?.value ?: 0L).toString(), (explicitdescriptor?.value ?: 0L).toString(), (newdescriptor?.value ?: 0L).toString(), isdirectoryobject, (subjectcontext?.value ?: 0L).toString(), (genericmapping?.value ?: 0L).toString(), pooltype) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seAssignSecurityEx(parentdescriptor: PsecurityDescriptor, explicitdescriptor: PsecurityDescriptor, newdescriptor: COpaquePointer?, objecttype: COpaquePointer?, isdirectoryobject: Boolean, autoinheritflags: UInt, subjectcontext: COpaquePointer?, genericmapping: COpaquePointer?, pooltype: PoolType): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_seAssignSecurityEx((parentdescriptor?.value ?: 0L).toString(), (explicitdescriptor?.value ?: 0L).toString(), (newdescriptor?.value ?: 0L).toString(), (objecttype?.value ?: 0L).toString(), isdirectoryobject, autoinheritflags.toInt(), (subjectcontext?.value ?: 0L).toString(), (genericmapping?.value ?: 0L).toString(), pooltype) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seCaptureSubjectContext(subjectcontext: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_seCaptureSubjectContext((subjectcontext?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seComputeAutoInheritByObjectType(objecttype: COpaquePointer?, securitydescriptor: PsecurityDescriptor, parentsecuritydescriptor: PsecurityDescriptor): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_seComputeAutoInheritByObjectType((objecttype?.value ?: 0L).toString(), (securitydescriptor?.value ?: 0L).toString(), (parentsecuritydescriptor?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seDeassignSecurity(securitydescriptor: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_seDeassignSecurity((securitydescriptor?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seEtwWriteKMCveEvent(cveid: COpaquePointer?, additionaldetails: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_seEtwWriteKMCveEvent((cveid?.value ?: 0L).toString(), (additionaldetails?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seLockSubjectContext(subjectcontext: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_seLockSubjectContext((subjectcontext?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seRegisterImageVerificationCallback(imagetype: SeImageType, callbacktype: SeImageVerificationCallbackType, callbackfunction: PseImageVerificationCallbackFunction, callbackcontext: COpaquePointer?, token: COpaquePointer?, callbackhandle: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_seRegisterImageVerificationCallback(imagetype, callbacktype, 0L.toString(), (callbackcontext?.value ?: 0L).toString(), (token?.value ?: 0L).toString(), (callbackhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seReleaseSubjectContext(subjectcontext: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_seReleaseSubjectContext((subjectcontext?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seReportSecurityEvent(flags: UInt, sourcename: COpaquePointer?, usersid: Psid, auditparameters: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_seReportSecurityEvent(flags.toInt(), (sourcename?.value ?: 0L).toString(), (usersid?.value ?: 0L).toString(), (auditparameters?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seSetAuditParameter(auditparameters: COpaquePointer?, type: SeAdtParameterType, index: UInt, data: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_seSetAuditParameter((auditparameters?.value ?: 0L).toString(), type, index.toInt(), (data?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seSinglePrivilegeCheck(privilegevalue: Luid, previousmode: Byte): Boolean =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun seUnlockSubjectContext(subjectcontext: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_seUnlockSubjectContext((subjectcontext?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seUnregisterImageVerificationCallback(callbackhandle: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_seUnregisterImageVerificationCallback((callbackhandle?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun seValidSecurityDescriptor(length: UInt, securitydescriptor: PsecurityDescriptor): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_seValidSecurityDescriptor(length.toInt(), (securitydescriptor?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmCommitComplete(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_tmCommitComplete((enlistment?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmCommitEnlistment(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_tmCommitEnlistment((enlistment?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmCommitTransaction(transaction: COpaquePointer?, wait: Boolean): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_tmCommitTransaction((transaction?.value ?: 0L).toString(), wait) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmCreateEnlistment(enlistmenthandle: COpaquePointer?, previousmode: Byte, desiredaccess: UInt, objectattributes: COpaquePointer?, resourcemanager: COpaquePointer?, transaction: COpaquePointer?, createoptions: UInt, notificationmask: UInt, enlistmentkey: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_tmCreateEnlistment((enlistmenthandle?.value ?: 0L).toString(), previousmode.toInt(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), (resourcemanager?.value ?: 0L).toString(), (transaction?.value ?: 0L).toString(), createoptions.toInt(), notificationmask.toInt(), (enlistmentkey?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmDereferenceEnlistmentKey(enlistment: COpaquePointer?, lastreference: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_tmDereferenceEnlistmentKey((enlistment?.value ?: 0L).toString(), (lastreference?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmEnableCallbacks(resourcemanager: COpaquePointer?, callbackroutine: PtmRmNotification, rmkey: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_tmEnableCallbacks((resourcemanager?.value ?: 0L).toString(), 0L.toString(), (rmkey?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmGetTransactionId(transaction: COpaquePointer?, transactionid: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_tmGetTransactionId((transaction?.value ?: 0L).toString(), (transactionid?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun tmInitializeTransactionManager(transactionmanager: COpaquePointer?, logfilename: COpaquePointer?, tmid: COpaquePointer?, createoptions: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_tmInitializeTransactionManager((transactionmanager?.value ?: 0L).toString(), (logfilename?.value ?: 0L).toString(), (tmid?.value ?: 0L).toString(), createoptions.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmIsTransactionActive(transaction: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_tmIsTransactionActive((transaction?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmPrePrepareComplete(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_tmPrePrepareComplete((enlistment?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmPrePrepareEnlistment(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_tmPrePrepareEnlistment((enlistment?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmPrepareComplete(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_tmPrepareComplete((enlistment?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmPrepareEnlistment(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_tmPrepareEnlistment((enlistment?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmPropagationComplete(resourcemanager: COpaquePointer?, requestcookie: UInt, bufferlength: UInt, buffer: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_tmPropagationComplete((resourcemanager?.value ?: 0L).toString(), requestcookie.toInt(), bufferlength.toInt(), (buffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmPropagationFailed(resourcemanager: COpaquePointer?, requestcookie: UInt, status: Ntstatus): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_tmPropagationFailed((resourcemanager?.value ?: 0L).toString(), requestcookie.toInt(), status) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmReadOnlyEnlistment(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_tmReadOnlyEnlistment((enlistment?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmRecoverEnlistment(enlistment: COpaquePointer?, enlistmentkey: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_tmRecoverEnlistment((enlistment?.value ?: 0L).toString(), (enlistmentkey?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmRecoverResourceManager(resourcemanager: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_tmRecoverResourceManager((resourcemanager?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmRecoverTransactionManager(tm: COpaquePointer?, targetvirtualclock: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_tmRecoverTransactionManager((tm?.value ?: 0L).toString(), (targetvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmReferenceEnlistmentKey(enlistment: COpaquePointer?, key: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_tmReferenceEnlistmentKey((enlistment?.value ?: 0L).toString(), (key?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmRenameTransactionManager(logfilename: COpaquePointer?, existingtransactionmanagerguid: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_tmRenameTransactionManager((logfilename?.value ?: 0L).toString(), (existingtransactionmanagerguid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmRequestOutcomeEnlistment(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_tmRequestOutcomeEnlistment((enlistment?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmRollbackComplete(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_tmRollbackComplete((enlistment?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmRollbackEnlistment(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_tmRollbackEnlistment((enlistment?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmRollbackTransaction(transaction: COpaquePointer?, wait: Boolean): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_tmRollbackTransaction((transaction?.value ?: 0L).toString(), wait) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tmSinglePhaseReject(enlistment: COpaquePointer?, tmvirtualclock: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_tmSinglePhaseReject((enlistment?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vslCreateSecureSection(handle: COpaquePointer?, targetprocess: Peprocess, mdl: COpaquePointer?, devicepageprotection: UInt, attributes: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_vslCreateSecureSection((handle?.value ?: 0L).toString(), targetprocess.toString(), (mdl?.value ?: 0L).toString(), devicepageprotection.toInt(), attributes.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vslDeleteSecureSection(globalhandle: Handle): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_vslDeleteSecureSection((globalhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaAddErrorSource(errorsource: COpaquePointer?, context: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_wheaAddErrorSource((errorsource?.value ?: 0L).toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaAddErrorSourceDeviceDriver(context: COpaquePointer?, configuration: COpaquePointer?, numberpreallocatederrorreports: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_wheaAddErrorSourceDeviceDriver((context?.value ?: 0L).toString(), (configuration?.value ?: 0L).toString(), numberpreallocatederrorreports.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaAddErrorSourceDeviceDriverV1(context: COpaquePointer?, configuration: COpaquePointer?, numbufferstopreallocate: UInt, maxdatalength: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_wheaAddErrorSourceDeviceDriverV1((context?.value ?: 0L).toString(), (configuration?.value ?: 0L).toString(), numbufferstopreallocate.toInt(), maxdatalength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaAddHwErrorReportSectionDeviceDriver(errorhandle: COpaquePointer?, sectiondatalength: UInt, bufferset: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_wheaAddHwErrorReportSectionDeviceDriver((errorhandle?.value ?: 0L).toString(), sectiondatalength.toInt(), (bufferset?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaConfigureErrorSource(sourcetype: WheaErrorSourceType, configuration: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_wheaConfigureErrorSource(sourcetype, (configuration?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaCreateHwErrorReportDeviceDriver(errorsourceid: UInt, deviceobject: COpaquePointer?): COpaquePointer? =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_wheaCreateHwErrorReportDeviceDriver(errorsourceid.toInt(), (deviceobject?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaErrorSourceGetState(errorsourceid: UInt): WheaErrorSourceState =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_wheaErrorSourceGetState(errorsourceid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaGetNotifyAllOfflinesPolicy(): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_wheaGetNotifyAllOfflinesPolicy() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaHighIrqlLogSelEventHandlerRegister(handler: PfnWheaHighIrqlLogSelEventHandler, context: COpaquePointer?): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_wheaHighIrqlLogSelEventHandlerRegister(0L.toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaHighIrqlLogSelEventHandlerUnregister() {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_wheaHighIrqlLogSelEventHandlerUnregister()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wheaHwErrorReportAbandonDeviceDriver(errorhandle: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_wheaHwErrorReportAbandonDeviceDriver((errorhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaHwErrorReportSetSectionNameDeviceDriver(bufferset: COpaquePointer?, namelength: UInt, name: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_wheaHwErrorReportSetSectionNameDeviceDriver((bufferset?.value ?: 0L).toString(), namelength.toInt(), (name?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaHwErrorReportSetSeverityDeviceDriver(errorhandle: COpaquePointer?, errorseverity: WheaErrorSeverity): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_wheaHwErrorReportSetSeverityDeviceDriver((errorhandle?.value ?: 0L).toString(), errorseverity) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaHwErrorReportSubmitDeviceDriver(errorhandle: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_wheaHwErrorReportSubmitDeviceDriver((errorhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaInitializeRecordHeader(header: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_wheaInitializeRecordHeader((header?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaIsCriticalState(): Boolean =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_wheaIsCriticalState() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaLogInternalEvent(entry: COpaquePointer?) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_wheaLogInternalEvent((entry?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wheaRegisterInUsePageOfflineNotification(callback: PfnInUsePageOfflineNotify, context: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_wheaRegisterInUsePageOfflineNotification(0L.toString(), (context?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaRemoveErrorSource(errorsourceid: UInt) {
    if (_windowsWdkSystemSystemservicesNapiAvailable) {
        _wasm_windowssys_windows_wdk_system_systemservices_wheaRemoveErrorSource(errorsourceid.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wheaRemoveErrorSourceDeviceDriver(errorsourceid: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_wheaRemoveErrorSourceDeviceDriver(errorsourceid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaReportHwError(errorpacket: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_wheaReportHwError((errorpacket?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaReportHwErrorDeviceDriver(errorsourceid: UInt, deviceobject: COpaquePointer?, errordata: COpaquePointer?, errordatalength: UInt, sectiontypeguid: COpaquePointer?, errorseverity: WheaErrorSeverity, devicefriendlyname: Pcstr): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_wheaReportHwErrorDeviceDriver(errorsourceid.toInt(), (deviceobject?.value ?: 0L).toString(), (errordata?.value ?: 0L).toString(), errordatalength.toInt(), (sectiontypeguid?.value ?: 0L).toString(), errorseverity, (devicefriendlyname?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaUnconfigureErrorSource(sourcetype: WheaErrorSourceType): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_wheaUnconfigureErrorSource(sourcetype) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wheaUnregisterInUsePageOfflineNotification(callback: PfnInUsePageOfflineNotify): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_wheaUnregisterInUsePageOfflineNotification(0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wmiQueryTraceInformation(traceinformationclass: TraceInformationClass, traceinformation: COpaquePointer?, traceinformationlength: UInt, requiredlength: COpaquePointer?, buffer: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_wmiQueryTraceInformation(traceinformationclass, (traceinformation?.value ?: 0L).toString(), traceinformationlength.toInt(), (requiredlength?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwAllocateLocallyUniqueId(luid: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwAllocateLocallyUniqueId((luid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwClose(handle: Handle): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwClose((handle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCommitComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwCommitComplete((enlistmenthandle?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCommitEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwCommitEnlistment((enlistmenthandle?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCommitTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwCommitTransaction((transactionhandle?.value ?: 0L).toString(), wait) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCreateEnlistment(enlistmenthandle: COpaquePointer?, desiredaccess: UInt, resourcemanagerhandle: Handle, transactionhandle: Handle, objectattributes: COpaquePointer?, createoptions: UInt, notificationmask: UInt, enlistmentkey: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwCreateEnlistment((enlistmenthandle?.value ?: 0L).toString(), desiredaccess.toInt(), (resourcemanagerhandle?.value ?: 0L).toString(), (transactionhandle?.value ?: 0L).toString(), (objectattributes?.value ?: 0L).toString(), createoptions.toInt(), notificationmask.toInt(), (enlistmentkey?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCreateFile(filehandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, allocationsize: COpaquePointer?, fileattributes: UInt, shareaccess: UInt, createdisposition: UInt, createoptions: UInt, eabuffer: COpaquePointer?, ealength: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwCreateFile((filehandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), (allocationsize?.value ?: 0L).toString(), fileattributes.toInt(), shareaccess.toInt(), createdisposition.toInt(), createoptions.toInt(), (eabuffer?.value ?: 0L).toString(), ealength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCreateResourceManager(resourcemanagerhandle: COpaquePointer?, desiredaccess: UInt, tmhandle: Handle, resourcemanagerguid: COpaquePointer?, objectattributes: COpaquePointer?, createoptions: UInt, description: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwCreateResourceManager((resourcemanagerhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (tmhandle?.value ?: 0L).toString(), (resourcemanagerguid?.value ?: 0L).toString(), (objectattributes?.value ?: 0L).toString(), createoptions.toInt(), (description?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCreateSection(sectionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, maximumsize: COpaquePointer?, sectionpageprotection: UInt, allocationattributes: UInt, filehandle: Handle): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwCreateSection((sectionhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), (maximumsize?.value ?: 0L).toString(), sectionpageprotection.toInt(), allocationattributes.toInt(), (filehandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCreateTransaction(transactionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, uow: COpaquePointer?, tmhandle: Handle, createoptions: UInt, isolationlevel: UInt, isolationflags: UInt, timeout: COpaquePointer?, description: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwCreateTransaction((transactionhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), (uow?.value ?: 0L).toString(), (tmhandle?.value ?: 0L).toString(), createoptions.toInt(), isolationlevel.toInt(), isolationflags.toInt(), (timeout?.value ?: 0L).toString(), (description?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwCreateTransactionManager(tmhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, logfilename: COpaquePointer?, createoptions: UInt, commitstrength: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwCreateTransactionManager((tmhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), (logfilename?.value ?: 0L).toString(), createoptions.toInt(), commitstrength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwDeviceIoControlFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, iocontrolcode: UInt, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwDeviceIoControlFile((filehandle?.value ?: 0L).toString(), (event?.value ?: 0L).toString(), 0L.toString(), (apccontext?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), iocontrolcode.toInt(), (inputbuffer?.value ?: 0L).toString(), inputbufferlength.toInt(), (outputbuffer?.value ?: 0L).toString(), outputbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwDisplayString(string: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwDisplayString((string?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwEnumerateTransactionObject(rootobjecthandle: Handle, querytype: KtmobjectType, objectcursor: COpaquePointer?, objectcursorlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwEnumerateTransactionObject((rootobjecthandle?.value ?: 0L).toString(), querytype, (objectcursor?.value ?: 0L).toString(), objectcursorlength.toInt(), (returnlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwGetNotificationResourceManager(resourcemanagerhandle: Handle, transactionnotification: COpaquePointer?, notificationlength: UInt, timeout: COpaquePointer?, returnlength: COpaquePointer?, asynchronous: UInt, asynchronouscontext: ULong): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwGetNotificationResourceManager((resourcemanagerhandle?.value ?: 0L).toString(), (transactionnotification?.value ?: 0L).toString(), notificationlength.toInt(), (timeout?.value ?: 0L).toString(), (returnlength?.value ?: 0L).toString(), asynchronous.toInt(), asynchronouscontext.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwLoadDriver(driverservicename: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwLoadDriver((driverservicename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwMakeTemporaryObject(handle: Handle): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwMakeTemporaryObject((handle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwManagePartition(targethandle: Handle, sourcehandle: Handle, partitioninformationclass: PartitionInformationClass, partitioninformation: COpaquePointer?, partitioninformationlength: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwManagePartition((targethandle?.value ?: 0L).toString(), (sourcehandle?.value ?: 0L).toString(), partitioninformationclass, (partitioninformation?.value ?: 0L).toString(), partitioninformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenEnlistment(enlistmenthandle: COpaquePointer?, desiredaccess: UInt, rmhandle: Handle, enlistmentguid: COpaquePointer?, objectattributes: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwOpenEnlistment((enlistmenthandle?.value ?: 0L).toString(), desiredaccess.toInt(), (rmhandle?.value ?: 0L).toString(), (enlistmentguid?.value ?: 0L).toString(), (objectattributes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenFile(filehandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, shareaccess: UInt, openoptions: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwOpenFile((filehandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), shareaccess.toInt(), openoptions.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenResourceManager(resourcemanagerhandle: COpaquePointer?, desiredaccess: UInt, tmhandle: Handle, resourcemanagerguid: COpaquePointer?, objectattributes: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwOpenResourceManager((resourcemanagerhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (tmhandle?.value ?: 0L).toString(), (resourcemanagerguid?.value ?: 0L).toString(), (objectattributes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenSymbolicLinkObject(linkhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwOpenSymbolicLinkObject((linkhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenTransaction(transactionhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, uow: COpaquePointer?, tmhandle: Handle): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwOpenTransaction((transactionhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), (uow?.value ?: 0L).toString(), (tmhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenTransactionManager(tmhandle: COpaquePointer?, desiredaccess: UInt, objectattributes: COpaquePointer?, logfilename: COpaquePointer?, tmidentity: COpaquePointer?, openoptions: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwOpenTransactionManager((tmhandle?.value ?: 0L).toString(), desiredaccess.toInt(), (objectattributes?.value ?: 0L).toString(), (logfilename?.value ?: 0L).toString(), (tmidentity?.value ?: 0L).toString(), openoptions.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwPowerInformation(informationlevel: PowerInformationLevel, inputbuffer: COpaquePointer?, inputbufferlength: UInt, outputbuffer: COpaquePointer?, outputbufferlength: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwPowerInformation(informationlevel, (inputbuffer?.value ?: 0L).toString(), inputbufferlength.toInt(), (outputbuffer?.value ?: 0L).toString(), outputbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwPrePrepareComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwPrePrepareComplete((enlistmenthandle?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwPrePrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwPrePrepareEnlistment((enlistmenthandle?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwPrepareComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwPrepareComplete((enlistmenthandle?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwPrepareEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwPrepareEnlistment((enlistmenthandle?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwPropagationComplete(resourcemanagerhandle: Handle, requestcookie: UInt, bufferlength: UInt, buffer: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwPropagationComplete((resourcemanagerhandle?.value ?: 0L).toString(), requestcookie.toInt(), bufferlength.toInt(), (buffer?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwPropagationFailed(resourcemanagerhandle: Handle, requestcookie: UInt, propstatus: Ntstatus): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwPropagationFailed((resourcemanagerhandle?.value ?: 0L).toString(), requestcookie.toInt(), propstatus) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryInformationByName(objectattributes: COpaquePointer?, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwQueryInformationByName((objectattributes?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), (fileinformation?.value ?: 0L).toString(), length.toInt(), fileinformationclass) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: COpaquePointer?, enlistmentinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwQueryInformationEnlistment((enlistmenthandle?.value ?: 0L).toString(), enlistmentinformationclass, (enlistmentinformation?.value ?: 0L).toString(), enlistmentinformationlength.toInt(), (returnlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwQueryInformationFile((filehandle?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), (fileinformation?.value ?: 0L).toString(), length.toInt(), fileinformationclass) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: COpaquePointer?, resourcemanagerinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwQueryInformationResourceManager((resourcemanagerhandle?.value ?: 0L).toString(), resourcemanagerinformationclass, (resourcemanagerinformation?.value ?: 0L).toString(), resourcemanagerinformationlength.toInt(), (returnlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: COpaquePointer?, transactioninformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwQueryInformationTransaction((transactionhandle?.value ?: 0L).toString(), transactioninformationclass, (transactioninformation?.value ?: 0L).toString(), transactioninformationlength.toInt(), (returnlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryInformationTransactionManager(transactionmanagerhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: COpaquePointer?, transactionmanagerinformationlength: UInt, returnlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwQueryInformationTransactionManager((transactionmanagerhandle?.value ?: 0L).toString(), transactionmanagerinformationclass, (transactionmanagerinformation?.value ?: 0L).toString(), transactionmanagerinformationlength.toInt(), (returnlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQuerySymbolicLinkObject(linkhandle: Handle, linktarget: COpaquePointer?, returnedlength: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwQuerySymbolicLinkObject((linkhandle?.value ?: 0L).toString(), (linktarget?.value ?: 0L).toString(), (returnedlength?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwReadFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt, byteoffset: COpaquePointer?, key: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwReadFile((filehandle?.value ?: 0L).toString(), (event?.value ?: 0L).toString(), 0L.toString(), (apccontext?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), length.toInt(), (byteoffset?.value ?: 0L).toString(), (key?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwReadOnlyEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwReadOnlyEnlistment((enlistmenthandle?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwRecoverEnlistment(enlistmenthandle: Handle, enlistmentkey: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwRecoverEnlistment((enlistmenthandle?.value ?: 0L).toString(), (enlistmentkey?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwRecoverResourceManager(resourcemanagerhandle: Handle): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwRecoverResourceManager((resourcemanagerhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwRecoverTransactionManager(transactionmanagerhandle: Handle): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwRecoverTransactionManager((transactionmanagerhandle?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwRegisterProtocolAddressInformation(resourcemanager: Handle, protocolid: COpaquePointer?, protocolinformationsize: UInt, protocolinformation: COpaquePointer?, createoptions: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwRegisterProtocolAddressInformation((resourcemanager?.value ?: 0L).toString(), (protocolid?.value ?: 0L).toString(), protocolinformationsize.toInt(), (protocolinformation?.value ?: 0L).toString(), createoptions.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwRenameTransactionManager(logfilename: COpaquePointer?, existingtransactionmanagerguid: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwRenameTransactionManager((logfilename?.value ?: 0L).toString(), (existingtransactionmanagerguid?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwRollbackComplete(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwRollbackComplete((enlistmenthandle?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwRollbackEnlistment(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwRollbackEnlistment((enlistmenthandle?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwRollbackTransaction(transactionhandle: Handle, wait: Boolean): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwRollbackTransaction((transactionhandle?.value ?: 0L).toString(), wait) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwRollforwardTransactionManager(transactionmanagerhandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwRollforwardTransactionManager((transactionmanagerhandle?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetInformationEnlistment(enlistmenthandle: Handle, enlistmentinformationclass: EnlistmentInformationClass, enlistmentinformation: COpaquePointer?, enlistmentinformationlength: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwSetInformationEnlistment((enlistmenthandle?.value ?: 0L).toString(), enlistmentinformationclass, (enlistmentinformation?.value ?: 0L).toString(), enlistmentinformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetInformationFile(filehandle: Handle, iostatusblock: COpaquePointer?, fileinformation: COpaquePointer?, length: UInt, fileinformationclass: FileInformationClass): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwSetInformationFile((filehandle?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), (fileinformation?.value ?: 0L).toString(), length.toInt(), fileinformationclass) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetInformationResourceManager(resourcemanagerhandle: Handle, resourcemanagerinformationclass: ResourcemanagerInformationClass, resourcemanagerinformation: COpaquePointer?, resourcemanagerinformationlength: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwSetInformationResourceManager((resourcemanagerhandle?.value ?: 0L).toString(), resourcemanagerinformationclass, (resourcemanagerinformation?.value ?: 0L).toString(), resourcemanagerinformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetInformationTransaction(transactionhandle: Handle, transactioninformationclass: TransactionInformationClass, transactioninformation: COpaquePointer?, transactioninformationlength: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwSetInformationTransaction((transactionhandle?.value ?: 0L).toString(), transactioninformationclass, (transactioninformation?.value ?: 0L).toString(), transactioninformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSetInformationTransactionManager(tmhandle: Handle, transactionmanagerinformationclass: TransactionmanagerInformationClass, transactionmanagerinformation: COpaquePointer?, transactionmanagerinformationlength: UInt): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwSetInformationTransactionManager((tmhandle?.value ?: 0L).toString(), transactionmanagerinformationclass, (transactionmanagerinformation?.value ?: 0L).toString(), transactionmanagerinformationlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwSinglePhaseReject(enlistmenthandle: Handle, tmvirtualclock: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwSinglePhaseReject((enlistmenthandle?.value ?: 0L).toString(), (tmvirtualclock?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwUnloadDriver(driverservicename: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwUnloadDriver((driverservicename?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwWriteFile(filehandle: Handle, event: Handle, apcroutine: PioApcRoutine, apccontext: COpaquePointer?, iostatusblock: COpaquePointer?, buffer: COpaquePointer?, length: UInt, byteoffset: COpaquePointer?, key: COpaquePointer?): Ntstatus =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_zwWriteFile((filehandle?.value ?: 0L).toString(), (event?.value ?: 0L).toString(), 0L.toString(), (apccontext?.value ?: 0L).toString(), (iostatusblock?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), length.toInt(), (byteoffset?.value ?: 0L).toString(), (key?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vDbgPrintEx(componentid: UInt, level: UInt, format: Pcstr, arglist: COpaquePointer?): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_vDbgPrintEx(componentid.toInt(), level.toInt(), (format?.value ?: 0L).toString(), (arglist?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vDbgPrintExWithPrefix(prefix: Pcstr, componentid: UInt, level: UInt, format: Pcstr, arglist: COpaquePointer?): UInt =
    if (_windowsWdkSystemSystemservicesNapiAvailable) _wasm_windowssys_windows_wdk_system_systemservices_vDbgPrintExWithPrefix((prefix?.value ?: 0L).toString(), componentid.toInt(), level.toInt(), (format?.value ?: 0L).toString(), (arglist?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
