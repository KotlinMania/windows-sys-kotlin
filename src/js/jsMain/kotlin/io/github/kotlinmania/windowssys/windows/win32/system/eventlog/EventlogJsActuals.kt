@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.eventlog

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.Psid

private val _windowsWin32SystemEventlogNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun backupEventLogA(heventlog: Handle, lpbackupfilename: Pcstr): Bool =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_backupEventLogA((heventlog?.value ?: 0L).toString(), (lpbackupfilename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backupEventLogW(heventlog: Handle, lpbackupfilename: Pcwstr): Bool =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_backupEventLogW((heventlog?.value ?: 0L).toString(), (lpbackupfilename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearEventLogA(heventlog: Handle, lpbackupfilename: Pcstr): Bool =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_clearEventLogA((heventlog?.value ?: 0L).toString(), (lpbackupfilename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearEventLogW(heventlog: Handle, lpbackupfilename: Pcwstr): Bool =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_clearEventLogW((heventlog?.value ?: 0L).toString(), (lpbackupfilename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeEventLog(heventlog: Handle): Bool =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_closeEventLog((heventlog?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deregisterEventSource(heventlog: Handle): Bool =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_deregisterEventSource((heventlog?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtArchiveExportedLog(session: EvtHandle, logfilepath: Pcwstr, locale: UInt, flags: UInt): Bool =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_evtArchiveExportedLog(session.toString(), (logfilepath?.value ?: 0L).toString(), locale.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtCancel(obj: EvtHandle): Bool =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_evtCancel(obj.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtClearLog(session: EvtHandle, channelpath: Pcwstr, targetfilepath: Pcwstr, flags: UInt): Bool =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_evtClearLog(session.toString(), (channelpath?.value ?: 0L).toString(), (targetfilepath?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtClose(obj: EvtHandle): Bool =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_evtClose(obj.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtCreateBookmark(bookmarkxml: Pcwstr): EvtHandle =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_evtCreateBookmark((bookmarkxml?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtCreateRenderContext(valuepathscount: UInt, valuepaths: COpaquePointer?, flags: UInt): EvtHandle =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_evtCreateRenderContext(valuepathscount.toInt(), (valuepaths?.value ?: 0L).toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtExportLog(session: EvtHandle, path: Pcwstr, query: Pcwstr, targetfilepath: Pcwstr, flags: UInt): Bool =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_evtExportLog(session.toString(), (path?.value ?: 0L).toString(), (query?.value ?: 0L).toString(), (targetfilepath?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtFormatMessage(publishermetadata: EvtHandle, event: EvtHandle, messageid: UInt, valuecount: UInt, values: COpaquePointer?, flags: UInt, buffersize: UInt, buffer: Pwstr, bufferused: COpaquePointer?): Bool =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_evtFormatMessage(publishermetadata.toString(), event.toString(), messageid.toInt(), valuecount.toInt(), (values?.value ?: 0L).toString(), flags.toInt(), buffersize.toInt(), (buffer?.value ?: 0L).toString(), (bufferused?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtGetChannelConfigProperty(channelconfig: EvtHandle, propertyid: EvtChannelConfigPropertyId, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: COpaquePointer?, propertyvaluebufferused: COpaquePointer?): Bool =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_evtGetChannelConfigProperty(channelconfig.toString(), propertyid, flags.toInt(), propertyvaluebuffersize.toInt(), (propertyvaluebuffer?.value ?: 0L).toString(), (propertyvaluebufferused?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtGetEventInfo(event: EvtHandle, propertyid: EvtEventPropertyId, propertyvaluebuffersize: UInt, propertyvaluebuffer: COpaquePointer?, propertyvaluebufferused: COpaquePointer?): Bool =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_evtGetEventInfo(event.toString(), propertyid, propertyvaluebuffersize.toInt(), (propertyvaluebuffer?.value ?: 0L).toString(), (propertyvaluebufferused?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtGetEventMetadataProperty(eventmetadata: EvtHandle, propertyid: EvtEventMetadataPropertyId, flags: UInt, eventmetadatapropertybuffersize: UInt, eventmetadatapropertybuffer: COpaquePointer?, eventmetadatapropertybufferused: COpaquePointer?): Bool =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_evtGetEventMetadataProperty(eventmetadata.toString(), propertyid, flags.toInt(), eventmetadatapropertybuffersize.toInt(), (eventmetadatapropertybuffer?.value ?: 0L).toString(), (eventmetadatapropertybufferused?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtGetExtendedStatus(buffersize: UInt, buffer: Pwstr, bufferused: COpaquePointer?): UInt =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_evtGetExtendedStatus(buffersize.toInt(), (buffer?.value ?: 0L).toString(), (bufferused?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtGetLogInfo(log: EvtHandle, propertyid: EvtLogPropertyId, propertyvaluebuffersize: UInt, propertyvaluebuffer: COpaquePointer?, propertyvaluebufferused: COpaquePointer?): Bool =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_evtGetLogInfo(log.toString(), propertyid, propertyvaluebuffersize.toInt(), (propertyvaluebuffer?.value ?: 0L).toString(), (propertyvaluebufferused?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtGetObjectArrayProperty(objectarray: Long, propertyid: UInt, arrayindex: UInt, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: COpaquePointer?, propertyvaluebufferused: COpaquePointer?): Bool =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_evtGetObjectArrayProperty(objectarray.toString(), propertyid.toInt(), arrayindex.toInt(), flags.toInt(), propertyvaluebuffersize.toInt(), (propertyvaluebuffer?.value ?: 0L).toString(), (propertyvaluebufferused?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtGetObjectArraySize(objectarray: Long, objectarraysize: COpaquePointer?): Bool =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_evtGetObjectArraySize(objectarray.toString(), (objectarraysize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtGetPublisherMetadataProperty(publishermetadata: EvtHandle, propertyid: EvtPublisherMetadataPropertyId, flags: UInt, publishermetadatapropertybuffersize: UInt, publishermetadatapropertybuffer: COpaquePointer?, publishermetadatapropertybufferused: COpaquePointer?): Bool =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_evtGetPublisherMetadataProperty(publishermetadata.toString(), propertyid, flags.toInt(), publishermetadatapropertybuffersize.toInt(), (publishermetadatapropertybuffer?.value ?: 0L).toString(), (publishermetadatapropertybufferused?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtGetQueryInfo(queryorsubscription: EvtHandle, propertyid: EvtQueryPropertyId, propertyvaluebuffersize: UInt, propertyvaluebuffer: COpaquePointer?, propertyvaluebufferused: COpaquePointer?): Bool =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_evtGetQueryInfo(queryorsubscription.toString(), propertyid, propertyvaluebuffersize.toInt(), (propertyvaluebuffer?.value ?: 0L).toString(), (propertyvaluebufferused?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtNext(resultset: EvtHandle, eventssize: UInt, events: COpaquePointer?, timeout: UInt, flags: UInt, returned: COpaquePointer?): Bool =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_evtNext(resultset.toString(), eventssize.toInt(), (events?.value ?: 0L).toString(), timeout.toInt(), flags.toInt(), (returned?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtNextChannelPath(channelenum: EvtHandle, channelpathbuffersize: UInt, channelpathbuffer: Pwstr, channelpathbufferused: COpaquePointer?): Bool =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_evtNextChannelPath(channelenum.toString(), channelpathbuffersize.toInt(), (channelpathbuffer?.value ?: 0L).toString(), (channelpathbufferused?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtNextEventMetadata(eventmetadataenum: EvtHandle, flags: UInt): EvtHandle =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_evtNextEventMetadata(eventmetadataenum.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtNextPublisherId(publisherenum: EvtHandle, publisheridbuffersize: UInt, publisheridbuffer: Pwstr, publisheridbufferused: COpaquePointer?): Bool =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_evtNextPublisherId(publisherenum.toString(), publisheridbuffersize.toInt(), (publisheridbuffer?.value ?: 0L).toString(), (publisheridbufferused?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtOpenChannelConfig(session: EvtHandle, channelpath: Pcwstr, flags: UInt): EvtHandle =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_evtOpenChannelConfig(session.toString(), (channelpath?.value ?: 0L).toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtOpenChannelEnum(session: EvtHandle, flags: UInt): EvtHandle =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_evtOpenChannelEnum(session.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtOpenEventMetadataEnum(publishermetadata: EvtHandle, flags: UInt): EvtHandle =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_evtOpenEventMetadataEnum(publishermetadata.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtOpenLog(session: EvtHandle, path: Pcwstr, flags: UInt): EvtHandle =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_evtOpenLog(session.toString(), (path?.value ?: 0L).toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtOpenPublisherEnum(session: EvtHandle, flags: UInt): EvtHandle =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_evtOpenPublisherEnum(session.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtOpenPublisherMetadata(session: EvtHandle, publisherid: Pcwstr, logfilepath: Pcwstr, locale: UInt, flags: UInt): EvtHandle =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_evtOpenPublisherMetadata(session.toString(), (publisherid?.value ?: 0L).toString(), (logfilepath?.value ?: 0L).toString(), locale.toInt(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtOpenSession(loginclass: EvtLoginClass, login: COpaquePointer?, timeout: UInt, flags: UInt): EvtHandle =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_evtOpenSession(loginclass, (login?.value ?: 0L).toString(), timeout.toInt(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtQuery(session: EvtHandle, path: Pcwstr, query: Pcwstr, flags: UInt): EvtHandle =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_evtQuery(session.toString(), (path?.value ?: 0L).toString(), (query?.value ?: 0L).toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtRender(context: EvtHandle, fragment: EvtHandle, flags: UInt, buffersize: UInt, buffer: COpaquePointer?, bufferused: COpaquePointer?, propertycount: COpaquePointer?): Bool =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_evtRender(context.toString(), fragment.toString(), flags.toInt(), buffersize.toInt(), (buffer?.value ?: 0L).toString(), (bufferused?.value ?: 0L).toString(), (propertycount?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtSaveChannelConfig(channelconfig: EvtHandle, flags: UInt): Bool =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_evtSaveChannelConfig(channelconfig.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtSeek(resultset: EvtHandle, position: Long, bookmark: EvtHandle, timeout: UInt, flags: UInt): Bool =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_evtSeek(resultset.toString(), position.toString(), bookmark.toString(), timeout.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtSetChannelConfigProperty(channelconfig: EvtHandle, propertyid: EvtChannelConfigPropertyId, flags: UInt, propertyvalue: COpaquePointer?): Bool =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_evtSetChannelConfigProperty(channelconfig.toString(), propertyid, flags.toInt(), (propertyvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtSubscribe(session: EvtHandle, signalevent: Handle, channelpath: Pcwstr, query: Pcwstr, bookmark: EvtHandle, context: COpaquePointer?, callback: EvtSubscribeCallback, flags: UInt): EvtHandle =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_evtSubscribe(session.toString(), (signalevent?.value ?: 0L).toString(), (channelpath?.value ?: 0L).toString(), (query?.value ?: 0L).toString(), bookmark.toString(), (context?.value ?: 0L).toString(), 0L.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtUpdateBookmark(bookmark: EvtHandle, event: EvtHandle): Bool =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_evtUpdateBookmark(bookmark.toString(), event.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEventLogInformation(heventlog: Handle, dwinfolevel: UInt, lpbuffer: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?): Bool =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_getEventLogInformation((heventlog?.value ?: 0L).toString(), dwinfolevel.toInt(), (lpbuffer?.value ?: 0L).toString(), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumberOfEventLogRecords(heventlog: Handle, numberofrecords: COpaquePointer?): Bool =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_getNumberOfEventLogRecords((heventlog?.value ?: 0L).toString(), (numberofrecords?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOldestEventLogRecord(heventlog: Handle, oldestrecord: COpaquePointer?): Bool =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_getOldestEventLogRecord((heventlog?.value ?: 0L).toString(), (oldestrecord?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyChangeEventLog(heventlog: Handle, hevent: Handle): Bool =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_notifyChangeEventLog((heventlog?.value ?: 0L).toString(), (hevent?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openBackupEventLogA(lpuncservername: Pcstr, lpfilename: Pcstr): Handle =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_openBackupEventLogA((lpuncservername?.value ?: 0L).toString(), (lpfilename?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openBackupEventLogW(lpuncservername: Pcwstr, lpfilename: Pcwstr): Handle =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_openBackupEventLogW((lpuncservername?.value ?: 0L).toString(), (lpfilename?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openEventLogA(lpuncservername: Pcstr, lpsourcename: Pcstr): Handle =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_openEventLogA((lpuncservername?.value ?: 0L).toString(), (lpsourcename?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openEventLogW(lpuncservername: Pcwstr, lpsourcename: Pcwstr): Handle =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_openEventLogW((lpuncservername?.value ?: 0L).toString(), (lpsourcename?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readEventLogA(heventlog: Handle, dwreadflags: ReadEventLogReadFlags, dwrecordoffset: UInt, lpbuffer: COpaquePointer?, nnumberofbytestoread: UInt, pnbytesread: COpaquePointer?, pnminnumberofbytesneeded: COpaquePointer?): Bool =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_readEventLogA((heventlog?.value ?: 0L).toString(), dwreadflags.toInt(), dwrecordoffset.toInt(), (lpbuffer?.value ?: 0L).toString(), nnumberofbytestoread.toInt(), (pnbytesread?.value ?: 0L).toString(), (pnminnumberofbytesneeded?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readEventLogW(heventlog: Handle, dwreadflags: ReadEventLogReadFlags, dwrecordoffset: UInt, lpbuffer: COpaquePointer?, nnumberofbytestoread: UInt, pnbytesread: COpaquePointer?, pnminnumberofbytesneeded: COpaquePointer?): Bool =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_readEventLogW((heventlog?.value ?: 0L).toString(), dwreadflags.toInt(), dwrecordoffset.toInt(), (lpbuffer?.value ?: 0L).toString(), nnumberofbytestoread.toInt(), (pnbytesread?.value ?: 0L).toString(), (pnminnumberofbytesneeded?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerEventSourceA(lpuncservername: Pcstr, lpsourcename: Pcstr): Handle =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_registerEventSourceA((lpuncservername?.value ?: 0L).toString(), (lpsourcename?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerEventSourceW(lpuncservername: Pcwstr, lpsourcename: Pcwstr): Handle =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_registerEventSourceW((lpuncservername?.value ?: 0L).toString(), (lpsourcename?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportEventA(heventlog: Handle, wtype: ReportEventType, wcategory: UShort, dweventid: UInt, lpusersid: Psid, wnumstrings: UShort, dwdatasize: UInt, lpstrings: COpaquePointer?, lprawdata: COpaquePointer?): Bool =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_reportEventA((heventlog?.value ?: 0L).toString(), wtype.toInt(), wcategory.toInt(), dweventid.toInt(), (lpusersid?.value ?: 0L).toString(), wnumstrings.toInt(), dwdatasize.toInt(), (lpstrings?.value ?: 0L).toString(), (lprawdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportEventW(heventlog: Handle, wtype: ReportEventType, wcategory: UShort, dweventid: UInt, lpusersid: Psid, wnumstrings: UShort, dwdatasize: UInt, lpstrings: COpaquePointer?, lprawdata: COpaquePointer?): Bool =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_reportEventW((heventlog?.value ?: 0L).toString(), wtype.toInt(), wcategory.toInt(), dweventid.toInt(), (lpusersid?.value ?: 0L).toString(), wnumstrings.toInt(), dwdatasize.toInt(), (lpstrings?.value ?: 0L).toString(), (lprawdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
