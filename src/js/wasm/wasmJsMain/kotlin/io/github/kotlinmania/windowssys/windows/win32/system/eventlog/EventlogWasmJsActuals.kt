@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.eventlog

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.Psid

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemEventlogNapiAddon(): Boolean

private val windowsWin32SystemEventlogNapiAvailable: Boolean = initWindowsWin32SystemEventlogNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogBackupEventLogA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemEventlogBackupEventLogA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogBackupEventLogW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemEventlogBackupEventLogW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogClearEventLogA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemEventlogClearEventLogA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogClearEventLogW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemEventlogClearEventLogW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogCloseEventLog(p0)")
private external fun wasmWindowssysWindowsWin32SystemEventlogCloseEventLog(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogDeregisterEventSource(p0)")
private external fun wasmWindowssysWindowsWin32SystemEventlogDeregisterEventSource(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogEvtArchiveExportedLog(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemEventlogEvtArchiveExportedLog(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogEvtCancel(p0)")
private external fun wasmWindowssysWindowsWin32SystemEventlogEvtCancel(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogEvtClearLog(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemEventlogEvtClearLog(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogEvtClose(p0)")
private external fun wasmWindowssysWindowsWin32SystemEventlogEvtClose(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogEvtCreateBookmark(p0)")
private external fun wasmWindowssysWindowsWin32SystemEventlogEvtCreateBookmark(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogEvtCreateRenderContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemEventlogEvtCreateRenderContext(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogEvtExportLog(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemEventlogEvtExportLog(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogEvtFormatMessage(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SystemEventlogEvtFormatMessage(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogEvtGetChannelConfigProperty(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemEventlogEvtGetChannelConfigProperty(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogEvtGetEventInfo(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemEventlogEvtGetEventInfo(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogEvtGetEventMetadataProperty(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemEventlogEvtGetEventMetadataProperty(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogEvtGetExtendedStatus(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemEventlogEvtGetExtendedStatus(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogEvtGetLogInfo(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemEventlogEvtGetLogInfo(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogEvtGetObjectArrayProperty(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemEventlogEvtGetObjectArrayProperty(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogEvtGetObjectArraySize(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemEventlogEvtGetObjectArraySize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogEvtGetPublisherMetadataProperty(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemEventlogEvtGetPublisherMetadataProperty(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogEvtGetQueryInfo(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemEventlogEvtGetQueryInfo(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogEvtNext(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemEventlogEvtNext(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogEvtNextChannelPath(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemEventlogEvtNextChannelPath(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogEvtNextEventMetadata(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemEventlogEvtNextEventMetadata(p0: String, p1: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogEvtNextPublisherId(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemEventlogEvtNextPublisherId(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogEvtOpenChannelConfig(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemEventlogEvtOpenChannelConfig(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogEvtOpenChannelEnum(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemEventlogEvtOpenChannelEnum(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogEvtOpenEventMetadataEnum(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemEventlogEvtOpenEventMetadataEnum(p0: String, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogEvtOpenLog(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemEventlogEvtOpenLog(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogEvtOpenPublisherEnum(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemEventlogEvtOpenPublisherEnum(p0: String, p1: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogEvtOpenPublisherMetadata(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemEventlogEvtOpenPublisherMetadata(p0: String, p1: String, p2: String, p3: Int, p4: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogEvtOpenSession(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemEventlogEvtOpenSession(p0: Int, p1: String, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogEvtQuery(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemEventlogEvtQuery(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogEvtRender(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemEventlogEvtRender(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogEvtSaveChannelConfig(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemEventlogEvtSaveChannelConfig(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogEvtSeek(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemEventlogEvtSeek(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogEvtSetChannelConfigProperty(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemEventlogEvtSetChannelConfigProperty(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogEvtSubscribe(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemEventlogEvtSubscribe(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogEvtUpdateBookmark(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemEventlogEvtUpdateBookmark(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogGetEventLogInformation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemEventlogGetEventLogInformation(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogGetNumberOfEventLogRecords(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemEventlogGetNumberOfEventLogRecords(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogGetOldestEventLogRecord(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemEventlogGetOldestEventLogRecord(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogNotifyChangeEventLog(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemEventlogNotifyChangeEventLog(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogOpenBackupEventLogA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemEventlogOpenBackupEventLogA(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogOpenBackupEventLogW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemEventlogOpenBackupEventLogW(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogOpenEventLogA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemEventlogOpenEventLogA(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogOpenEventLogW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemEventlogOpenEventLogW(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogReadEventLogA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemEventlogReadEventLogA(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogReadEventLogW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemEventlogReadEventLogW(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogRegisterEventSourceA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemEventlogRegisterEventSourceA(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogRegisterEventSourceW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemEventlogRegisterEventSourceW(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogReportEventA(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SystemEventlogReportEventA(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemEventlogReportEventW(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SystemEventlogReportEventW(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: Int, p7: String, p8: String): Int

public actual fun backupEventLogA(heventlog: Handle, lpbackupfilename: Pcstr): Bool =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogBackupEventLogA(heventlog.rawAddress.toString(), lpbackupfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backupEventLogW(heventlog: Handle, lpbackupfilename: Pcwstr): Bool =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogBackupEventLogW(heventlog.rawAddress.toString(), lpbackupfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearEventLogA(heventlog: Handle, lpbackupfilename: Pcstr): Bool =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogClearEventLogA(heventlog.rawAddress.toString(), lpbackupfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearEventLogW(heventlog: Handle, lpbackupfilename: Pcwstr): Bool =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogClearEventLogW(heventlog.rawAddress.toString(), lpbackupfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeEventLog(heventlog: Handle): Bool =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogCloseEventLog(heventlog.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deregisterEventSource(heventlog: Handle): Bool =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogDeregisterEventSource(heventlog.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtArchiveExportedLog(session: EvtHandle, logfilepath: Pcwstr, locale: UInt, flags: UInt): Bool =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogEvtArchiveExportedLog(session.toString(), logfilepath.rawAddress.toString(), locale.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtCancel(obj: EvtHandle): Bool =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogEvtCancel(obj.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtClearLog(session: EvtHandle, channelpath: Pcwstr, targetfilepath: Pcwstr, flags: UInt): Bool =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogEvtClearLog(session.toString(), channelpath.rawAddress.toString(), targetfilepath.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtClose(obj: EvtHandle): Bool =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogEvtClose(obj.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtCreateBookmark(bookmarkxml: Pcwstr): EvtHandle =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogEvtCreateBookmark(bookmarkxml.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtCreateRenderContext(valuepathscount: UInt, valuepaths: ConstPtr<Pcwstr>, flags: UInt): EvtHandle =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogEvtCreateRenderContext(valuepathscount.toInt(), valuepaths.rawAddress.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtExportLog(session: EvtHandle, path: Pcwstr, query: Pcwstr, targetfilepath: Pcwstr, flags: UInt): Bool =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogEvtExportLog(session.toString(), path.rawAddress.toString(), query.rawAddress.toString(), targetfilepath.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtFormatMessage(publishermetadata: EvtHandle, event: EvtHandle, messageid: UInt, valuecount: UInt, values: ConstPtr<EvtVariant>, flags: UInt, buffersize: UInt, buffer: Pwstr, bufferused: MutPtr<UInt>): Bool =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogEvtFormatMessage(publishermetadata.toString(), event.toString(), messageid.toInt(), valuecount.toInt(), values.rawAddress.toString(), flags.toInt(), buffersize.toInt(), buffer.rawAddress.toString(), bufferused.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtGetChannelConfigProperty(channelconfig: EvtHandle, propertyid: EvtChannelConfigPropertyId, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: MutPtr<EvtVariant>, propertyvaluebufferused: MutPtr<UInt>): Bool =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogEvtGetChannelConfigProperty(channelconfig.toString(), propertyid, flags.toInt(), propertyvaluebuffersize.toInt(), propertyvaluebuffer.rawAddress.toString(), propertyvaluebufferused.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtGetEventInfo(event: EvtHandle, propertyid: EvtEventPropertyId, propertyvaluebuffersize: UInt, propertyvaluebuffer: MutPtr<EvtVariant>, propertyvaluebufferused: MutPtr<UInt>): Bool =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogEvtGetEventInfo(event.toString(), propertyid, propertyvaluebuffersize.toInt(), propertyvaluebuffer.rawAddress.toString(), propertyvaluebufferused.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtGetEventMetadataProperty(eventmetadata: EvtHandle, propertyid: EvtEventMetadataPropertyId, flags: UInt, eventmetadatapropertybuffersize: UInt, eventmetadatapropertybuffer: MutPtr<EvtVariant>, eventmetadatapropertybufferused: MutPtr<UInt>): Bool =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogEvtGetEventMetadataProperty(eventmetadata.toString(), propertyid, flags.toInt(), eventmetadatapropertybuffersize.toInt(), eventmetadatapropertybuffer.rawAddress.toString(), eventmetadatapropertybufferused.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtGetExtendedStatus(buffersize: UInt, buffer: Pwstr, bufferused: MutPtr<UInt>): UInt =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogEvtGetExtendedStatus(buffersize.toInt(), buffer.rawAddress.toString(), bufferused.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtGetLogInfo(log: EvtHandle, propertyid: EvtLogPropertyId, propertyvaluebuffersize: UInt, propertyvaluebuffer: MutPtr<EvtVariant>, propertyvaluebufferused: MutPtr<UInt>): Bool =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogEvtGetLogInfo(log.toString(), propertyid, propertyvaluebuffersize.toInt(), propertyvaluebuffer.rawAddress.toString(), propertyvaluebufferused.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtGetObjectArrayProperty(objectarray: Long, propertyid: UInt, arrayindex: UInt, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: MutPtr<EvtVariant>, propertyvaluebufferused: MutPtr<UInt>): Bool =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogEvtGetObjectArrayProperty(objectarray.toString(), propertyid.toInt(), arrayindex.toInt(), flags.toInt(), propertyvaluebuffersize.toInt(), propertyvaluebuffer.rawAddress.toString(), propertyvaluebufferused.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtGetObjectArraySize(objectarray: Long, objectarraysize: MutPtr<UInt>): Bool =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogEvtGetObjectArraySize(objectarray.toString(), objectarraysize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtGetPublisherMetadataProperty(publishermetadata: EvtHandle, propertyid: EvtPublisherMetadataPropertyId, flags: UInt, publishermetadatapropertybuffersize: UInt, publishermetadatapropertybuffer: MutPtr<EvtVariant>, publishermetadatapropertybufferused: MutPtr<UInt>): Bool =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogEvtGetPublisherMetadataProperty(publishermetadata.toString(), propertyid, flags.toInt(), publishermetadatapropertybuffersize.toInt(), publishermetadatapropertybuffer.rawAddress.toString(), publishermetadatapropertybufferused.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtGetQueryInfo(queryorsubscription: EvtHandle, propertyid: EvtQueryPropertyId, propertyvaluebuffersize: UInt, propertyvaluebuffer: MutPtr<EvtVariant>, propertyvaluebufferused: MutPtr<UInt>): Bool =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogEvtGetQueryInfo(queryorsubscription.toString(), propertyid, propertyvaluebuffersize.toInt(), propertyvaluebuffer.rawAddress.toString(), propertyvaluebufferused.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtNext(resultset: EvtHandle, eventssize: UInt, events: MutPtr<Long>, timeout: UInt, flags: UInt, returned: MutPtr<UInt>): Bool =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogEvtNext(resultset.toString(), eventssize.toInt(), events.rawAddress.toString(), timeout.toInt(), flags.toInt(), returned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtNextChannelPath(channelenum: EvtHandle, channelpathbuffersize: UInt, channelpathbuffer: Pwstr, channelpathbufferused: MutPtr<UInt>): Bool =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogEvtNextChannelPath(channelenum.toString(), channelpathbuffersize.toInt(), channelpathbuffer.rawAddress.toString(), channelpathbufferused.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtNextEventMetadata(eventmetadataenum: EvtHandle, flags: UInt): EvtHandle =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogEvtNextEventMetadata(eventmetadataenum.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtNextPublisherId(publisherenum: EvtHandle, publisheridbuffersize: UInt, publisheridbuffer: Pwstr, publisheridbufferused: MutPtr<UInt>): Bool =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogEvtNextPublisherId(publisherenum.toString(), publisheridbuffersize.toInt(), publisheridbuffer.rawAddress.toString(), publisheridbufferused.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtOpenChannelConfig(session: EvtHandle, channelpath: Pcwstr, flags: UInt): EvtHandle =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogEvtOpenChannelConfig(session.toString(), channelpath.rawAddress.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtOpenChannelEnum(session: EvtHandle, flags: UInt): EvtHandle =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogEvtOpenChannelEnum(session.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtOpenEventMetadataEnum(publishermetadata: EvtHandle, flags: UInt): EvtHandle =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogEvtOpenEventMetadataEnum(publishermetadata.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtOpenLog(session: EvtHandle, path: Pcwstr, flags: UInt): EvtHandle =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogEvtOpenLog(session.toString(), path.rawAddress.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtOpenPublisherEnum(session: EvtHandle, flags: UInt): EvtHandle =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogEvtOpenPublisherEnum(session.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtOpenPublisherMetadata(session: EvtHandle, publisherid: Pcwstr, logfilepath: Pcwstr, locale: UInt, flags: UInt): EvtHandle =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogEvtOpenPublisherMetadata(session.toString(), publisherid.rawAddress.toString(), logfilepath.rawAddress.toString(), locale.toInt(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtOpenSession(loginclass: EvtLoginClass, login: ConstPtr<CVoid>, timeout: UInt, flags: UInt): EvtHandle =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogEvtOpenSession(loginclass, login.rawAddress.toString(), timeout.toInt(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtQuery(session: EvtHandle, path: Pcwstr, query: Pcwstr, flags: UInt): EvtHandle =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogEvtQuery(session.toString(), path.rawAddress.toString(), query.rawAddress.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtRender(context: EvtHandle, fragment: EvtHandle, flags: UInt, buffersize: UInt, buffer: MutPtr<CVoid>, bufferused: MutPtr<UInt>, propertycount: MutPtr<UInt>): Bool =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogEvtRender(context.toString(), fragment.toString(), flags.toInt(), buffersize.toInt(), buffer.rawAddress.toString(), bufferused.rawAddress.toString(), propertycount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtSaveChannelConfig(channelconfig: EvtHandle, flags: UInt): Bool =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogEvtSaveChannelConfig(channelconfig.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtSeek(resultset: EvtHandle, position: Long, bookmark: EvtHandle, timeout: UInt, flags: UInt): Bool =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogEvtSeek(resultset.toString(), position.toString(), bookmark.toString(), timeout.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtSetChannelConfigProperty(channelconfig: EvtHandle, propertyid: EvtChannelConfigPropertyId, flags: UInt, propertyvalue: ConstPtr<EvtVariant>): Bool =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogEvtSetChannelConfigProperty(channelconfig.toString(), propertyid, flags.toInt(), propertyvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtSubscribe(session: EvtHandle, signalevent: Handle, channelpath: Pcwstr, query: Pcwstr, bookmark: EvtHandle, context: ConstPtr<CVoid>, callback: EvtSubscribeCallback, flags: UInt): EvtHandle =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogEvtSubscribe(session.toString(), signalevent.rawAddress.toString(), channelpath.rawAddress.toString(), query.rawAddress.toString(), bookmark.toString(), context.rawAddress.toString(), 0L.toString(), flags.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtUpdateBookmark(bookmark: EvtHandle, event: EvtHandle): Bool =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogEvtUpdateBookmark(bookmark.toString(), event.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEventLogInformation(heventlog: Handle, dwinfolevel: UInt, lpbuffer: MutPtr<CVoid>, cbbufsize: UInt, pcbbytesneeded: MutPtr<UInt>): Bool =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogGetEventLogInformation(heventlog.rawAddress.toString(), dwinfolevel.toInt(), lpbuffer.rawAddress.toString(), cbbufsize.toInt(), pcbbytesneeded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumberOfEventLogRecords(heventlog: Handle, numberofrecords: MutPtr<UInt>): Bool =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogGetNumberOfEventLogRecords(heventlog.rawAddress.toString(), numberofrecords.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOldestEventLogRecord(heventlog: Handle, oldestrecord: MutPtr<UInt>): Bool =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogGetOldestEventLogRecord(heventlog.rawAddress.toString(), oldestrecord.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyChangeEventLog(heventlog: Handle, hevent: Handle): Bool =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogNotifyChangeEventLog(heventlog.rawAddress.toString(), hevent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openBackupEventLogA(lpuncservername: Pcstr, lpfilename: Pcstr): Handle =
    if (windowsWin32SystemEventlogNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemEventlogOpenBackupEventLogA(lpuncservername.rawAddress.toString(), lpfilename.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openBackupEventLogW(lpuncservername: Pcwstr, lpfilename: Pcwstr): Handle =
    if (windowsWin32SystemEventlogNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemEventlogOpenBackupEventLogW(lpuncservername.rawAddress.toString(), lpfilename.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openEventLogA(lpuncservername: Pcstr, lpsourcename: Pcstr): Handle =
    if (windowsWin32SystemEventlogNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemEventlogOpenEventLogA(lpuncservername.rawAddress.toString(), lpsourcename.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openEventLogW(lpuncservername: Pcwstr, lpsourcename: Pcwstr): Handle =
    if (windowsWin32SystemEventlogNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemEventlogOpenEventLogW(lpuncservername.rawAddress.toString(), lpsourcename.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readEventLogA(heventlog: Handle, dwreadflags: ReadEventLogReadFlags, dwrecordoffset: UInt, lpbuffer: MutPtr<CVoid>, nnumberofbytestoread: UInt, pnbytesread: MutPtr<UInt>, pnminnumberofbytesneeded: MutPtr<UInt>): Bool =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogReadEventLogA(heventlog.rawAddress.toString(), dwreadflags.toInt(), dwrecordoffset.toInt(), lpbuffer.rawAddress.toString(), nnumberofbytestoread.toInt(), pnbytesread.rawAddress.toString(), pnminnumberofbytesneeded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readEventLogW(heventlog: Handle, dwreadflags: ReadEventLogReadFlags, dwrecordoffset: UInt, lpbuffer: MutPtr<CVoid>, nnumberofbytestoread: UInt, pnbytesread: MutPtr<UInt>, pnminnumberofbytesneeded: MutPtr<UInt>): Bool =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogReadEventLogW(heventlog.rawAddress.toString(), dwreadflags.toInt(), dwrecordoffset.toInt(), lpbuffer.rawAddress.toString(), nnumberofbytestoread.toInt(), pnbytesread.rawAddress.toString(), pnminnumberofbytesneeded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerEventSourceA(lpuncservername: Pcstr, lpsourcename: Pcstr): Handle =
    if (windowsWin32SystemEventlogNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemEventlogRegisterEventSourceA(lpuncservername.rawAddress.toString(), lpsourcename.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerEventSourceW(lpuncservername: Pcwstr, lpsourcename: Pcwstr): Handle =
    if (windowsWin32SystemEventlogNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemEventlogRegisterEventSourceW(lpuncservername.rawAddress.toString(), lpsourcename.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportEventA(heventlog: Handle, wtype: ReportEventType, wcategory: UShort, dweventid: UInt, lpusersid: Psid, wnumstrings: UShort, dwdatasize: UInt, lpstrings: ConstPtr<Pcstr>, lprawdata: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogReportEventA(heventlog.rawAddress.toString(), wtype.toInt(), wcategory.toInt(), dweventid.toInt(), lpusersid.rawAddress.toString(), wnumstrings.toInt(), dwdatasize.toInt(), lpstrings.rawAddress.toString(), lprawdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportEventW(heventlog: Handle, wtype: ReportEventType, wcategory: UShort, dweventid: UInt, lpusersid: Psid, wnumstrings: UShort, dwdatasize: UInt, lpstrings: ConstPtr<Pcwstr>, lprawdata: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemEventlogNapiAvailable) wasmWindowssysWindowsWin32SystemEventlogReportEventW(heventlog.rawAddress.toString(), wtype.toInt(), wcategory.toInt(), dweventid.toInt(), lpusersid.rawAddress.toString(), wnumstrings.toInt(), dwdatasize.toInt(), lpstrings.rawAddress.toString(), lprawdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
