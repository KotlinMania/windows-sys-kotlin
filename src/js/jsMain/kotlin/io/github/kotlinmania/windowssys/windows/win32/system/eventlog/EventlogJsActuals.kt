@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val windowsWin32SystemEventlogNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun backupEventLogA(heventlog: Handle, lpbackupfilename: Pcstr): Bool =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogBackupEventLogA(heventlog.rawAddress.toString(), lpbackupfilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun backupEventLogW(heventlog: Handle, lpbackupfilename: Pcwstr): Bool =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogBackupEventLogW(heventlog.rawAddress.toString(), lpbackupfilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearEventLogA(heventlog: Handle, lpbackupfilename: Pcstr): Bool =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogClearEventLogA(heventlog.rawAddress.toString(), lpbackupfilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clearEventLogW(heventlog: Handle, lpbackupfilename: Pcwstr): Bool =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogClearEventLogW(heventlog.rawAddress.toString(), lpbackupfilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeEventLog(heventlog: Handle): Bool =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogCloseEventLog(heventlog.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deregisterEventSource(heventlog: Handle): Bool =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogDeregisterEventSource(heventlog.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtArchiveExportedLog(session: EvtHandle, logfilepath: Pcwstr, locale: UInt, flags: UInt): Bool =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogEvtArchiveExportedLog(session.toString(), logfilepath.rawAddress.toString(), locale.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtCancel(obj: EvtHandle): Bool =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogEvtCancel(obj.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtClearLog(session: EvtHandle, channelpath: Pcwstr, targetfilepath: Pcwstr, flags: UInt): Bool =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogEvtClearLog(session.toString(), channelpath.rawAddress.toString(), targetfilepath.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtClose(obj: EvtHandle): Bool =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogEvtClose(obj.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtCreateBookmark(bookmarkxml: Pcwstr): EvtHandle =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogEvtCreateBookmark(bookmarkxml.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtCreateRenderContext(valuepathscount: UInt, valuepaths: ConstPtr<Pcwstr>, flags: UInt): EvtHandle =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogEvtCreateRenderContext(valuepathscount.toInt(), valuepaths.rawAddress.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtExportLog(session: EvtHandle, path: Pcwstr, query: Pcwstr, targetfilepath: Pcwstr, flags: UInt): Bool =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogEvtExportLog(session.toString(), path.rawAddress.toString(), query.rawAddress.toString(), targetfilepath.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtFormatMessage(publishermetadata: EvtHandle, event: EvtHandle, messageid: UInt, valuecount: UInt, values: ConstPtr<EvtVariant>, flags: UInt, buffersize: UInt, buffer: Pwstr, bufferused: MutPtr<UInt>): Bool =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogEvtFormatMessage(publishermetadata.toString(), event.toString(), messageid.toInt(), valuecount.toInt(), values.rawAddress.toString(), flags.toInt(), buffersize.toInt(), buffer.rawAddress.toString(), bufferused.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtGetChannelConfigProperty(channelconfig: EvtHandle, propertyid: EvtChannelConfigPropertyId, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: MutPtr<EvtVariant>, propertyvaluebufferused: MutPtr<UInt>): Bool =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogEvtGetChannelConfigProperty(channelconfig.toString(), propertyid, flags.toInt(), propertyvaluebuffersize.toInt(), propertyvaluebuffer.rawAddress.toString(), propertyvaluebufferused.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtGetEventInfo(event: EvtHandle, propertyid: EvtEventPropertyId, propertyvaluebuffersize: UInt, propertyvaluebuffer: MutPtr<EvtVariant>, propertyvaluebufferused: MutPtr<UInt>): Bool =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogEvtGetEventInfo(event.toString(), propertyid, propertyvaluebuffersize.toInt(), propertyvaluebuffer.rawAddress.toString(), propertyvaluebufferused.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtGetEventMetadataProperty(eventmetadata: EvtHandle, propertyid: EvtEventMetadataPropertyId, flags: UInt, eventmetadatapropertybuffersize: UInt, eventmetadatapropertybuffer: MutPtr<EvtVariant>, eventmetadatapropertybufferused: MutPtr<UInt>): Bool =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogEvtGetEventMetadataProperty(eventmetadata.toString(), propertyid, flags.toInt(), eventmetadatapropertybuffersize.toInt(), eventmetadatapropertybuffer.rawAddress.toString(), eventmetadatapropertybufferused.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtGetExtendedStatus(buffersize: UInt, buffer: Pwstr, bufferused: MutPtr<UInt>): UInt =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogEvtGetExtendedStatus(buffersize.toInt(), buffer.rawAddress.toString(), bufferused.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtGetLogInfo(log: EvtHandle, propertyid: EvtLogPropertyId, propertyvaluebuffersize: UInt, propertyvaluebuffer: MutPtr<EvtVariant>, propertyvaluebufferused: MutPtr<UInt>): Bool =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogEvtGetLogInfo(log.toString(), propertyid, propertyvaluebuffersize.toInt(), propertyvaluebuffer.rawAddress.toString(), propertyvaluebufferused.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtGetObjectArrayProperty(objectarray: Long, propertyid: UInt, arrayindex: UInt, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: MutPtr<EvtVariant>, propertyvaluebufferused: MutPtr<UInt>): Bool =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogEvtGetObjectArrayProperty(objectarray.toString(), propertyid.toInt(), arrayindex.toInt(), flags.toInt(), propertyvaluebuffersize.toInt(), propertyvaluebuffer.rawAddress.toString(), propertyvaluebufferused.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtGetObjectArraySize(objectarray: Long, objectarraysize: MutPtr<UInt>): Bool =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogEvtGetObjectArraySize(objectarray.toString(), objectarraysize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtGetPublisherMetadataProperty(publishermetadata: EvtHandle, propertyid: EvtPublisherMetadataPropertyId, flags: UInt, publishermetadatapropertybuffersize: UInt, publishermetadatapropertybuffer: MutPtr<EvtVariant>, publishermetadatapropertybufferused: MutPtr<UInt>): Bool =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogEvtGetPublisherMetadataProperty(publishermetadata.toString(), propertyid, flags.toInt(), publishermetadatapropertybuffersize.toInt(), publishermetadatapropertybuffer.rawAddress.toString(), publishermetadatapropertybufferused.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtGetQueryInfo(queryorsubscription: EvtHandle, propertyid: EvtQueryPropertyId, propertyvaluebuffersize: UInt, propertyvaluebuffer: MutPtr<EvtVariant>, propertyvaluebufferused: MutPtr<UInt>): Bool =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogEvtGetQueryInfo(queryorsubscription.toString(), propertyid, propertyvaluebuffersize.toInt(), propertyvaluebuffer.rawAddress.toString(), propertyvaluebufferused.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtNext(resultset: EvtHandle, eventssize: UInt, events: MutPtr<Long>, timeout: UInt, flags: UInt, returned: MutPtr<UInt>): Bool =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogEvtNext(resultset.toString(), eventssize.toInt(), events.rawAddress.toString(), timeout.toInt(), flags.toInt(), returned.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtNextChannelPath(channelenum: EvtHandle, channelpathbuffersize: UInt, channelpathbuffer: Pwstr, channelpathbufferused: MutPtr<UInt>): Bool =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogEvtNextChannelPath(channelenum.toString(), channelpathbuffersize.toInt(), channelpathbuffer.rawAddress.toString(), channelpathbufferused.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtNextEventMetadata(eventmetadataenum: EvtHandle, flags: UInt): EvtHandle =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogEvtNextEventMetadata(eventmetadataenum.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtNextPublisherId(publisherenum: EvtHandle, publisheridbuffersize: UInt, publisheridbuffer: Pwstr, publisheridbufferused: MutPtr<UInt>): Bool =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogEvtNextPublisherId(publisherenum.toString(), publisheridbuffersize.toInt(), publisheridbuffer.rawAddress.toString(), publisheridbufferused.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtOpenChannelConfig(session: EvtHandle, channelpath: Pcwstr, flags: UInt): EvtHandle =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogEvtOpenChannelConfig(session.toString(), channelpath.rawAddress.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtOpenChannelEnum(session: EvtHandle, flags: UInt): EvtHandle =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogEvtOpenChannelEnum(session.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtOpenEventMetadataEnum(publishermetadata: EvtHandle, flags: UInt): EvtHandle =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogEvtOpenEventMetadataEnum(publishermetadata.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtOpenLog(session: EvtHandle, path: Pcwstr, flags: UInt): EvtHandle =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogEvtOpenLog(session.toString(), path.rawAddress.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtOpenPublisherEnum(session: EvtHandle, flags: UInt): EvtHandle =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogEvtOpenPublisherEnum(session.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtOpenPublisherMetadata(session: EvtHandle, publisherid: Pcwstr, logfilepath: Pcwstr, locale: UInt, flags: UInt): EvtHandle =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogEvtOpenPublisherMetadata(session.toString(), publisherid.rawAddress.toString(), logfilepath.rawAddress.toString(), locale.toInt(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtOpenSession(loginclass: EvtLoginClass, login: ConstPtr<CVoid>, timeout: UInt, flags: UInt): EvtHandle =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogEvtOpenSession(loginclass, login.rawAddress.toString(), timeout.toInt(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtQuery(session: EvtHandle, path: Pcwstr, query: Pcwstr, flags: UInt): EvtHandle =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogEvtQuery(session.toString(), path.rawAddress.toString(), query.rawAddress.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtRender(context: EvtHandle, fragment: EvtHandle, flags: UInt, buffersize: UInt, buffer: MutPtr<CVoid>, bufferused: MutPtr<UInt>, propertycount: MutPtr<UInt>): Bool =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogEvtRender(context.toString(), fragment.toString(), flags.toInt(), buffersize.toInt(), buffer.rawAddress.toString(), bufferused.rawAddress.toString(), propertycount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtSaveChannelConfig(channelconfig: EvtHandle, flags: UInt): Bool =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogEvtSaveChannelConfig(channelconfig.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtSeek(resultset: EvtHandle, position: Long, bookmark: EvtHandle, timeout: UInt, flags: UInt): Bool =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogEvtSeek(resultset.toString(), position.toString(), bookmark.toString(), timeout.toInt(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtSetChannelConfigProperty(channelconfig: EvtHandle, propertyid: EvtChannelConfigPropertyId, flags: UInt, propertyvalue: ConstPtr<EvtVariant>): Bool =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogEvtSetChannelConfigProperty(channelconfig.toString(), propertyid, flags.toInt(), propertyvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtSubscribe(session: EvtHandle, signalevent: Handle, channelpath: Pcwstr, query: Pcwstr, bookmark: EvtHandle, context: ConstPtr<CVoid>, callback: EvtSubscribeCallback, flags: UInt): EvtHandle =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogEvtSubscribe(session.toString(), signalevent.rawAddress.toString(), channelpath.rawAddress.toString(), query.rawAddress.toString(), bookmark.toString(), context.rawAddress.toString(), 0L.toString(), flags.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun evtUpdateBookmark(bookmark: EvtHandle, event: EvtHandle): Bool =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogEvtUpdateBookmark(bookmark.toString(), event.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEventLogInformation(heventlog: Handle, dwinfolevel: UInt, lpbuffer: MutPtr<CVoid>, cbbufsize: UInt, pcbbytesneeded: MutPtr<UInt>): Bool =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogGetEventLogInformation(heventlog.rawAddress.toString(), dwinfolevel.toInt(), lpbuffer.rawAddress.toString(), cbbufsize.toInt(), pcbbytesneeded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNumberOfEventLogRecords(heventlog: Handle, numberofrecords: MutPtr<UInt>): Bool =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogGetNumberOfEventLogRecords(heventlog.rawAddress.toString(), numberofrecords.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOldestEventLogRecord(heventlog: Handle, oldestrecord: MutPtr<UInt>): Bool =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogGetOldestEventLogRecord(heventlog.rawAddress.toString(), oldestrecord.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyChangeEventLog(heventlog: Handle, hevent: Handle): Bool =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogNotifyChangeEventLog(heventlog.rawAddress.toString(), hevent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openBackupEventLogA(lpuncservername: Pcstr, lpfilename: Pcstr): Handle =
    if (windowsWin32SystemEventlogNapiAddon != null) MutPtr((windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogOpenBackupEventLogA(lpuncservername.rawAddress.toString(), lpfilename.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openBackupEventLogW(lpuncservername: Pcwstr, lpfilename: Pcwstr): Handle =
    if (windowsWin32SystemEventlogNapiAddon != null) MutPtr((windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogOpenBackupEventLogW(lpuncservername.rawAddress.toString(), lpfilename.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openEventLogA(lpuncservername: Pcstr, lpsourcename: Pcstr): Handle =
    if (windowsWin32SystemEventlogNapiAddon != null) MutPtr((windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogOpenEventLogA(lpuncservername.rawAddress.toString(), lpsourcename.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openEventLogW(lpuncservername: Pcwstr, lpsourcename: Pcwstr): Handle =
    if (windowsWin32SystemEventlogNapiAddon != null) MutPtr((windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogOpenEventLogW(lpuncservername.rawAddress.toString(), lpsourcename.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readEventLogA(heventlog: Handle, dwreadflags: ReadEventLogReadFlags, dwrecordoffset: UInt, lpbuffer: MutPtr<CVoid>, nnumberofbytestoread: UInt, pnbytesread: MutPtr<UInt>, pnminnumberofbytesneeded: MutPtr<UInt>): Bool =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogReadEventLogA(heventlog.rawAddress.toString(), dwreadflags.toInt(), dwrecordoffset.toInt(), lpbuffer.rawAddress.toString(), nnumberofbytestoread.toInt(), pnbytesread.rawAddress.toString(), pnminnumberofbytesneeded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readEventLogW(heventlog: Handle, dwreadflags: ReadEventLogReadFlags, dwrecordoffset: UInt, lpbuffer: MutPtr<CVoid>, nnumberofbytestoread: UInt, pnbytesread: MutPtr<UInt>, pnminnumberofbytesneeded: MutPtr<UInt>): Bool =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogReadEventLogW(heventlog.rawAddress.toString(), dwreadflags.toInt(), dwrecordoffset.toInt(), lpbuffer.rawAddress.toString(), nnumberofbytestoread.toInt(), pnbytesread.rawAddress.toString(), pnminnumberofbytesneeded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerEventSourceA(lpuncservername: Pcstr, lpsourcename: Pcstr): Handle =
    if (windowsWin32SystemEventlogNapiAddon != null) MutPtr((windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogRegisterEventSourceA(lpuncservername.rawAddress.toString(), lpsourcename.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerEventSourceW(lpuncservername: Pcwstr, lpsourcename: Pcwstr): Handle =
    if (windowsWin32SystemEventlogNapiAddon != null) MutPtr((windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogRegisterEventSourceW(lpuncservername.rawAddress.toString(), lpsourcename.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportEventA(heventlog: Handle, wtype: ReportEventType, wcategory: UShort, dweventid: UInt, lpusersid: Psid, wnumstrings: UShort, dwdatasize: UInt, lpstrings: ConstPtr<Pcstr>, lprawdata: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogReportEventA(heventlog.rawAddress.toString(), wtype.toInt(), wcategory.toInt(), dweventid.toInt(), lpusersid.rawAddress.toString(), wnumstrings.toInt(), dwdatasize.toInt(), lpstrings.rawAddress.toString(), lprawdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun reportEventW(heventlog: Handle, wtype: ReportEventType, wcategory: UShort, dweventid: UInt, lpusersid: Psid, wnumstrings: UShort, dwdatasize: UInt, lpstrings: ConstPtr<Pcwstr>, lprawdata: ConstPtr<CVoid>): Bool =
    if (windowsWin32SystemEventlogNapiAddon != null) (windowsWin32SystemEventlogNapiAddon.windowssysWindowsWin32SystemEventlogReportEventW(heventlog.rawAddress.toString(), wtype.toInt(), wcategory.toInt(), dweventid.toInt(), lpusersid.rawAddress.toString(), wnumstrings.toInt(), dwdatasize.toInt(), lpstrings.rawAddress.toString(), lprawdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
