@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.eventlog

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.PSID

private val _windowsWin32SystemEventlogNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun BackupEventLogA(heventlog: HANDLE, lpbackupfilename: PCSTR): BOOL =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_BackupEventLogA(heventlog.toString(), lpbackupfilename.toString()) as Int) else 0

public actual fun BackupEventLogW(heventlog: HANDLE, lpbackupfilename: PCWSTR): BOOL =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_BackupEventLogW(heventlog.toString(), lpbackupfilename.toString()) as Int) else 0

public actual fun ClearEventLogA(heventlog: HANDLE, lpbackupfilename: PCSTR): BOOL =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_ClearEventLogA(heventlog.toString(), lpbackupfilename.toString()) as Int) else 0

public actual fun ClearEventLogW(heventlog: HANDLE, lpbackupfilename: PCWSTR): BOOL =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_ClearEventLogW(heventlog.toString(), lpbackupfilename.toString()) as Int) else 0

public actual fun CloseEventLog(heventlog: HANDLE): BOOL =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_CloseEventLog(heventlog.toString()) as Int) else 0

public actual fun DeregisterEventSource(heventlog: HANDLE): BOOL =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_DeregisterEventSource(heventlog.toString()) as Int) else 0

public actual fun EvtArchiveExportedLog(session: EVT_HANDLE, logfilepath: PCWSTR, locale: UInt, flags: UInt): BOOL =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_EvtArchiveExportedLog(session.toString(), logfilepath.toString(), locale.toInt(), flags.toInt()) as Int) else 0

public actual fun EvtCancel(obj: EVT_HANDLE): BOOL =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_EvtCancel(obj.toString()) as Int) else 0

public actual fun EvtClearLog(session: EVT_HANDLE, channelpath: PCWSTR, targetfilepath: PCWSTR, flags: UInt): BOOL =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_EvtClearLog(session.toString(), channelpath.toString(), targetfilepath.toString(), flags.toInt()) as Int) else 0

public actual fun EvtClose(obj: EVT_HANDLE): BOOL =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_EvtClose(obj.toString()) as Int) else 0

public actual fun EvtCreateBookmark(bookmarkxml: PCWSTR): EVT_HANDLE =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_EvtCreateBookmark(bookmarkxml.toString()) as String).toLong() else 0L

public actual fun EvtCreateRenderContext(valuepathscount: UInt, valuepaths: Long, flags: UInt): EVT_HANDLE =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_EvtCreateRenderContext(valuepathscount.toInt(), valuepaths.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun EvtExportLog(session: EVT_HANDLE, path: PCWSTR, query: PCWSTR, targetfilepath: PCWSTR, flags: UInt): BOOL =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_EvtExportLog(session.toString(), path.toString(), query.toString(), targetfilepath.toString(), flags.toInt()) as Int) else 0

public actual fun EvtFormatMessage(publishermetadata: EVT_HANDLE, event: EVT_HANDLE, messageid: UInt, valuecount: UInt, values: Long, flags: UInt, buffersize: UInt, buffer: PWSTR, bufferused: Long): BOOL =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_EvtFormatMessage(publishermetadata.toString(), event.toString(), messageid.toInt(), valuecount.toInt(), values.toString(), flags.toInt(), buffersize.toInt(), buffer.toString(), bufferused.toString()) as Int) else 0

public actual fun EvtGetChannelConfigProperty(channelconfig: EVT_HANDLE, propertyid: EVT_CHANNEL_CONFIG_PROPERTY_ID, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: Long, propertyvaluebufferused: Long): BOOL =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_EvtGetChannelConfigProperty(channelconfig.toString(), propertyid, flags.toInt(), propertyvaluebuffersize.toInt(), propertyvaluebuffer.toString(), propertyvaluebufferused.toString()) as Int) else 0

public actual fun EvtGetEventInfo(event: EVT_HANDLE, propertyid: EVT_EVENT_PROPERTY_ID, propertyvaluebuffersize: UInt, propertyvaluebuffer: Long, propertyvaluebufferused: Long): BOOL =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_EvtGetEventInfo(event.toString(), propertyid, propertyvaluebuffersize.toInt(), propertyvaluebuffer.toString(), propertyvaluebufferused.toString()) as Int) else 0

public actual fun EvtGetEventMetadataProperty(eventmetadata: EVT_HANDLE, propertyid: EVT_EVENT_METADATA_PROPERTY_ID, flags: UInt, eventmetadatapropertybuffersize: UInt, eventmetadatapropertybuffer: Long, eventmetadatapropertybufferused: Long): BOOL =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_EvtGetEventMetadataProperty(eventmetadata.toString(), propertyid, flags.toInt(), eventmetadatapropertybuffersize.toInt(), eventmetadatapropertybuffer.toString(), eventmetadatapropertybufferused.toString()) as Int) else 0

public actual fun EvtGetExtendedStatus(buffersize: UInt, buffer: PWSTR, bufferused: Long): UInt =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_EvtGetExtendedStatus(buffersize.toInt(), buffer.toString(), bufferused.toString()) as Int).toUInt() else 0u

public actual fun EvtGetLogInfo(log: EVT_HANDLE, propertyid: EVT_LOG_PROPERTY_ID, propertyvaluebuffersize: UInt, propertyvaluebuffer: Long, propertyvaluebufferused: Long): BOOL =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_EvtGetLogInfo(log.toString(), propertyid, propertyvaluebuffersize.toInt(), propertyvaluebuffer.toString(), propertyvaluebufferused.toString()) as Int) else 0

public actual fun EvtGetObjectArrayProperty(objectarray: Long, propertyid: UInt, arrayindex: UInt, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: Long, propertyvaluebufferused: Long): BOOL =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_EvtGetObjectArrayProperty(objectarray.toString(), propertyid.toInt(), arrayindex.toInt(), flags.toInt(), propertyvaluebuffersize.toInt(), propertyvaluebuffer.toString(), propertyvaluebufferused.toString()) as Int) else 0

public actual fun EvtGetObjectArraySize(objectarray: Long, objectarraysize: Long): BOOL =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_EvtGetObjectArraySize(objectarray.toString(), objectarraysize.toString()) as Int) else 0

public actual fun EvtGetPublisherMetadataProperty(publishermetadata: EVT_HANDLE, propertyid: EVT_PUBLISHER_METADATA_PROPERTY_ID, flags: UInt, publishermetadatapropertybuffersize: UInt, publishermetadatapropertybuffer: Long, publishermetadatapropertybufferused: Long): BOOL =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_EvtGetPublisherMetadataProperty(publishermetadata.toString(), propertyid, flags.toInt(), publishermetadatapropertybuffersize.toInt(), publishermetadatapropertybuffer.toString(), publishermetadatapropertybufferused.toString()) as Int) else 0

public actual fun EvtGetQueryInfo(queryorsubscription: EVT_HANDLE, propertyid: EVT_QUERY_PROPERTY_ID, propertyvaluebuffersize: UInt, propertyvaluebuffer: Long, propertyvaluebufferused: Long): BOOL =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_EvtGetQueryInfo(queryorsubscription.toString(), propertyid, propertyvaluebuffersize.toInt(), propertyvaluebuffer.toString(), propertyvaluebufferused.toString()) as Int) else 0

public actual fun EvtNext(resultset: EVT_HANDLE, eventssize: UInt, events: Long, timeout: UInt, flags: UInt, returned: Long): BOOL =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_EvtNext(resultset.toString(), eventssize.toInt(), events.toString(), timeout.toInt(), flags.toInt(), returned.toString()) as Int) else 0

public actual fun EvtNextChannelPath(channelenum: EVT_HANDLE, channelpathbuffersize: UInt, channelpathbuffer: PWSTR, channelpathbufferused: Long): BOOL =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_EvtNextChannelPath(channelenum.toString(), channelpathbuffersize.toInt(), channelpathbuffer.toString(), channelpathbufferused.toString()) as Int) else 0

public actual fun EvtNextEventMetadata(eventmetadataenum: EVT_HANDLE, flags: UInt): EVT_HANDLE =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_EvtNextEventMetadata(eventmetadataenum.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun EvtNextPublisherId(publisherenum: EVT_HANDLE, publisheridbuffersize: UInt, publisheridbuffer: PWSTR, publisheridbufferused: Long): BOOL =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_EvtNextPublisherId(publisherenum.toString(), publisheridbuffersize.toInt(), publisheridbuffer.toString(), publisheridbufferused.toString()) as Int) else 0

public actual fun EvtOpenChannelConfig(session: EVT_HANDLE, channelpath: PCWSTR, flags: UInt): EVT_HANDLE =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_EvtOpenChannelConfig(session.toString(), channelpath.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun EvtOpenChannelEnum(session: EVT_HANDLE, flags: UInt): EVT_HANDLE =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_EvtOpenChannelEnum(session.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun EvtOpenEventMetadataEnum(publishermetadata: EVT_HANDLE, flags: UInt): EVT_HANDLE =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_EvtOpenEventMetadataEnum(publishermetadata.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun EvtOpenLog(session: EVT_HANDLE, path: PCWSTR, flags: UInt): EVT_HANDLE =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_EvtOpenLog(session.toString(), path.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun EvtOpenPublisherEnum(session: EVT_HANDLE, flags: UInt): EVT_HANDLE =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_EvtOpenPublisherEnum(session.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun EvtOpenPublisherMetadata(session: EVT_HANDLE, publisherid: PCWSTR, logfilepath: PCWSTR, locale: UInt, flags: UInt): EVT_HANDLE =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_EvtOpenPublisherMetadata(session.toString(), publisherid.toString(), logfilepath.toString(), locale.toInt(), flags.toInt()) as String).toLong() else 0L

public actual fun EvtOpenSession(loginclass: EVT_LOGIN_CLASS, login: Long, timeout: UInt, flags: UInt): EVT_HANDLE =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_EvtOpenSession(loginclass, login.toString(), timeout.toInt(), flags.toInt()) as String).toLong() else 0L

public actual fun EvtQuery(session: EVT_HANDLE, path: PCWSTR, query: PCWSTR, flags: UInt): EVT_HANDLE =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_EvtQuery(session.toString(), path.toString(), query.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun EvtRender(context: EVT_HANDLE, fragment: EVT_HANDLE, flags: UInt, buffersize: UInt, buffer: Long, bufferused: Long, propertycount: Long): BOOL =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_EvtRender(context.toString(), fragment.toString(), flags.toInt(), buffersize.toInt(), buffer.toString(), bufferused.toString(), propertycount.toString()) as Int) else 0

public actual fun EvtSaveChannelConfig(channelconfig: EVT_HANDLE, flags: UInt): BOOL =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_EvtSaveChannelConfig(channelconfig.toString(), flags.toInt()) as Int) else 0

public actual fun EvtSeek(resultset: EVT_HANDLE, position: Long, bookmark: EVT_HANDLE, timeout: UInt, flags: UInt): BOOL =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_EvtSeek(resultset.toString(), position.toString(), bookmark.toString(), timeout.toInt(), flags.toInt()) as Int) else 0

public actual fun EvtSetChannelConfigProperty(channelconfig: EVT_HANDLE, propertyid: EVT_CHANNEL_CONFIG_PROPERTY_ID, flags: UInt, propertyvalue: Long): BOOL =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_EvtSetChannelConfigProperty(channelconfig.toString(), propertyid, flags.toInt(), propertyvalue.toString()) as Int) else 0

public actual fun EvtSubscribe(session: EVT_HANDLE, signalevent: HANDLE, channelpath: PCWSTR, query: PCWSTR, bookmark: EVT_HANDLE, context: Long, callback: EVT_SUBSCRIBE_CALLBACK, flags: UInt): EVT_HANDLE =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_EvtSubscribe(session.toString(), signalevent.toString(), channelpath.toString(), query.toString(), bookmark.toString(), context.toString(), callback.toLong().toString(), flags.toInt()) as String).toLong() else 0L

public actual fun EvtUpdateBookmark(bookmark: EVT_HANDLE, event: EVT_HANDLE): BOOL =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_EvtUpdateBookmark(bookmark.toString(), event.toString()) as Int) else 0

public actual fun GetEventLogInformation(heventlog: HANDLE, dwinfolevel: UInt, lpbuffer: Long, cbbufsize: UInt, pcbbytesneeded: Long): BOOL =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_GetEventLogInformation(heventlog.toString(), dwinfolevel.toInt(), lpbuffer.toString(), cbbufsize.toInt(), pcbbytesneeded.toString()) as Int) else 0

public actual fun GetNumberOfEventLogRecords(heventlog: HANDLE, numberofrecords: Long): BOOL =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_GetNumberOfEventLogRecords(heventlog.toString(), numberofrecords.toString()) as Int) else 0

public actual fun GetOldestEventLogRecord(heventlog: HANDLE, oldestrecord: Long): BOOL =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_GetOldestEventLogRecord(heventlog.toString(), oldestrecord.toString()) as Int) else 0

public actual fun NotifyChangeEventLog(heventlog: HANDLE, hevent: HANDLE): BOOL =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_NotifyChangeEventLog(heventlog.toString(), hevent.toString()) as Int) else 0

public actual fun OpenBackupEventLogA(lpuncservername: PCSTR, lpfilename: PCSTR): HANDLE =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_OpenBackupEventLogA(lpuncservername.toString(), lpfilename.toString()) as String).toLong() else 0L

public actual fun OpenBackupEventLogW(lpuncservername: PCWSTR, lpfilename: PCWSTR): HANDLE =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_OpenBackupEventLogW(lpuncservername.toString(), lpfilename.toString()) as String).toLong() else 0L

public actual fun OpenEventLogA(lpuncservername: PCSTR, lpsourcename: PCSTR): HANDLE =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_OpenEventLogA(lpuncservername.toString(), lpsourcename.toString()) as String).toLong() else 0L

public actual fun OpenEventLogW(lpuncservername: PCWSTR, lpsourcename: PCWSTR): HANDLE =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_OpenEventLogW(lpuncservername.toString(), lpsourcename.toString()) as String).toLong() else 0L

public actual fun ReadEventLogA(heventlog: HANDLE, dwreadflags: READ_EVENT_LOG_READ_FLAGS, dwrecordoffset: UInt, lpbuffer: Long, nnumberofbytestoread: UInt, pnbytesread: Long, pnminnumberofbytesneeded: Long): BOOL =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_ReadEventLogA(heventlog.toString(), dwreadflags.toInt(), dwrecordoffset.toInt(), lpbuffer.toString(), nnumberofbytestoread.toInt(), pnbytesread.toString(), pnminnumberofbytesneeded.toString()) as Int) else 0

public actual fun ReadEventLogW(heventlog: HANDLE, dwreadflags: READ_EVENT_LOG_READ_FLAGS, dwrecordoffset: UInt, lpbuffer: Long, nnumberofbytestoread: UInt, pnbytesread: Long, pnminnumberofbytesneeded: Long): BOOL =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_ReadEventLogW(heventlog.toString(), dwreadflags.toInt(), dwrecordoffset.toInt(), lpbuffer.toString(), nnumberofbytestoread.toInt(), pnbytesread.toString(), pnminnumberofbytesneeded.toString()) as Int) else 0

public actual fun RegisterEventSourceA(lpuncservername: PCSTR, lpsourcename: PCSTR): HANDLE =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_RegisterEventSourceA(lpuncservername.toString(), lpsourcename.toString()) as String).toLong() else 0L

public actual fun RegisterEventSourceW(lpuncservername: PCWSTR, lpsourcename: PCWSTR): HANDLE =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_RegisterEventSourceW(lpuncservername.toString(), lpsourcename.toString()) as String).toLong() else 0L

public actual fun ReportEventA(heventlog: HANDLE, wtype: REPORT_EVENT_TYPE, wcategory: UShort, dweventid: UInt, lpusersid: PSID, wnumstrings: UShort, dwdatasize: UInt, lpstrings: Long, lprawdata: Long): BOOL =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_ReportEventA(heventlog.toString(), wtype.toInt(), wcategory.toInt(), dweventid.toInt(), lpusersid.toString(), wnumstrings.toInt(), dwdatasize.toInt(), lpstrings.toString(), lprawdata.toString()) as Int) else 0

public actual fun ReportEventW(heventlog: HANDLE, wtype: REPORT_EVENT_TYPE, wcategory: UShort, dweventid: UInt, lpusersid: PSID, wnumstrings: UShort, dwdatasize: UInt, lpstrings: Long, lprawdata: Long): BOOL =
    if (_windowsWin32SystemEventlogNapiAddon != null) (_windowsWin32SystemEventlogNapiAddon.windowssys_windows_win32_system_eventlog_ReportEventW(heventlog.toString(), wtype.toInt(), wcategory.toInt(), dweventid.toInt(), lpusersid.toString(), wnumstrings.toInt(), dwdatasize.toInt(), lpstrings.toString(), lprawdata.toString()) as Int) else 0
