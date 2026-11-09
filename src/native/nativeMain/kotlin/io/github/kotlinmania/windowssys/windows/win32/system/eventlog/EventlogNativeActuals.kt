@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.eventlog

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.PSID
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun BackupEventLogA(heventlog: HANDLE, lpbackupfilename: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_BackupEventLogA(heventlog.toCPointer<ByteVar>(), lpbackupfilename.toCPointer<ByteVar>())

public actual fun BackupEventLogW(heventlog: HANDLE, lpbackupfilename: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_BackupEventLogW(heventlog.toCPointer<ByteVar>(), lpbackupfilename.toCPointer<ByteVar>())

public actual fun ClearEventLogA(heventlog: HANDLE, lpbackupfilename: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_ClearEventLogA(heventlog.toCPointer<ByteVar>(), lpbackupfilename.toCPointer<ByteVar>())

public actual fun ClearEventLogW(heventlog: HANDLE, lpbackupfilename: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_ClearEventLogW(heventlog.toCPointer<ByteVar>(), lpbackupfilename.toCPointer<ByteVar>())

public actual fun CloseEventLog(heventlog: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_CloseEventLog(heventlog.toCPointer<ByteVar>())

public actual fun DeregisterEventSource(heventlog: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_DeregisterEventSource(heventlog.toCPointer<ByteVar>())

public actual fun EvtArchiveExportedLog(session: EVT_HANDLE, logfilepath: PCWSTR, locale: UInt, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_EvtArchiveExportedLog(session, logfilepath.toCPointer<ByteVar>(), locale, flags)

public actual fun EvtCancel(obj: EVT_HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_EvtCancel(obj)

public actual fun EvtClearLog(session: EVT_HANDLE, channelpath: PCWSTR, targetfilepath: PCWSTR, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_EvtClearLog(session, channelpath.toCPointer<ByteVar>(), targetfilepath.toCPointer<ByteVar>(), flags)

public actual fun EvtClose(obj: EVT_HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_EvtClose(obj)

public actual fun EvtCreateBookmark(bookmarkxml: PCWSTR): EVT_HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_EvtCreateBookmark(bookmarkxml.toCPointer<ByteVar>())

public actual fun EvtCreateRenderContext(valuepathscount: UInt, valuepaths: Long, flags: UInt): EVT_HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_EvtCreateRenderContext(valuepathscount, valuepaths.toCPointer<ByteVar>(), flags)

public actual fun EvtExportLog(session: EVT_HANDLE, path: PCWSTR, query: PCWSTR, targetfilepath: PCWSTR, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_EvtExportLog(session, path.toCPointer<ByteVar>(), query.toCPointer<ByteVar>(), targetfilepath.toCPointer<ByteVar>(), flags)

public actual fun EvtFormatMessage(publishermetadata: EVT_HANDLE, event: EVT_HANDLE, messageid: UInt, valuecount: UInt, values: Long, flags: UInt, buffersize: UInt, buffer: PWSTR, bufferused: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_EvtFormatMessage(publishermetadata, event, messageid, valuecount, values.toCPointer<ByteVar>(), flags, buffersize, buffer.toCPointer<ByteVar>(), bufferused.toCPointer<ByteVar>())

public actual fun EvtGetChannelConfigProperty(channelconfig: EVT_HANDLE, propertyid: EVT_CHANNEL_CONFIG_PROPERTY_ID, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: Long, propertyvaluebufferused: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_EvtGetChannelConfigProperty(channelconfig, propertyid, flags, propertyvaluebuffersize, propertyvaluebuffer.toCPointer<ByteVar>(), propertyvaluebufferused.toCPointer<ByteVar>())

public actual fun EvtGetEventInfo(event: EVT_HANDLE, propertyid: EVT_EVENT_PROPERTY_ID, propertyvaluebuffersize: UInt, propertyvaluebuffer: Long, propertyvaluebufferused: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_EvtGetEventInfo(event, propertyid, propertyvaluebuffersize, propertyvaluebuffer.toCPointer<ByteVar>(), propertyvaluebufferused.toCPointer<ByteVar>())

public actual fun EvtGetEventMetadataProperty(eventmetadata: EVT_HANDLE, propertyid: EVT_EVENT_METADATA_PROPERTY_ID, flags: UInt, eventmetadatapropertybuffersize: UInt, eventmetadatapropertybuffer: Long, eventmetadatapropertybufferused: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_EvtGetEventMetadataProperty(eventmetadata, propertyid, flags, eventmetadatapropertybuffersize, eventmetadatapropertybuffer.toCPointer<ByteVar>(), eventmetadatapropertybufferused.toCPointer<ByteVar>())

public actual fun EvtGetExtendedStatus(buffersize: UInt, buffer: PWSTR, bufferused: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_EvtGetExtendedStatus(buffersize, buffer.toCPointer<ByteVar>(), bufferused.toCPointer<ByteVar>())

public actual fun EvtGetLogInfo(log: EVT_HANDLE, propertyid: EVT_LOG_PROPERTY_ID, propertyvaluebuffersize: UInt, propertyvaluebuffer: Long, propertyvaluebufferused: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_EvtGetLogInfo(log, propertyid, propertyvaluebuffersize, propertyvaluebuffer.toCPointer<ByteVar>(), propertyvaluebufferused.toCPointer<ByteVar>())

public actual fun EvtGetObjectArrayProperty(objectarray: Long, propertyid: UInt, arrayindex: UInt, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: Long, propertyvaluebufferused: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_EvtGetObjectArrayProperty(objectarray, propertyid, arrayindex, flags, propertyvaluebuffersize, propertyvaluebuffer.toCPointer<ByteVar>(), propertyvaluebufferused.toCPointer<ByteVar>())

public actual fun EvtGetObjectArraySize(objectarray: Long, objectarraysize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_EvtGetObjectArraySize(objectarray, objectarraysize.toCPointer<ByteVar>())

public actual fun EvtGetPublisherMetadataProperty(publishermetadata: EVT_HANDLE, propertyid: EVT_PUBLISHER_METADATA_PROPERTY_ID, flags: UInt, publishermetadatapropertybuffersize: UInt, publishermetadatapropertybuffer: Long, publishermetadatapropertybufferused: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_EvtGetPublisherMetadataProperty(publishermetadata, propertyid, flags, publishermetadatapropertybuffersize, publishermetadatapropertybuffer.toCPointer<ByteVar>(), publishermetadatapropertybufferused.toCPointer<ByteVar>())

public actual fun EvtGetQueryInfo(queryorsubscription: EVT_HANDLE, propertyid: EVT_QUERY_PROPERTY_ID, propertyvaluebuffersize: UInt, propertyvaluebuffer: Long, propertyvaluebufferused: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_EvtGetQueryInfo(queryorsubscription, propertyid, propertyvaluebuffersize, propertyvaluebuffer.toCPointer<ByteVar>(), propertyvaluebufferused.toCPointer<ByteVar>())

public actual fun EvtNext(resultset: EVT_HANDLE, eventssize: UInt, events: Long, timeout: UInt, flags: UInt, returned: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_EvtNext(resultset, eventssize, events.toCPointer<ByteVar>(), timeout, flags, returned.toCPointer<ByteVar>())

public actual fun EvtNextChannelPath(channelenum: EVT_HANDLE, channelpathbuffersize: UInt, channelpathbuffer: PWSTR, channelpathbufferused: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_EvtNextChannelPath(channelenum, channelpathbuffersize, channelpathbuffer.toCPointer<ByteVar>(), channelpathbufferused.toCPointer<ByteVar>())

public actual fun EvtNextEventMetadata(eventmetadataenum: EVT_HANDLE, flags: UInt): EVT_HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_EvtNextEventMetadata(eventmetadataenum, flags)

public actual fun EvtNextPublisherId(publisherenum: EVT_HANDLE, publisheridbuffersize: UInt, publisheridbuffer: PWSTR, publisheridbufferused: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_EvtNextPublisherId(publisherenum, publisheridbuffersize, publisheridbuffer.toCPointer<ByteVar>(), publisheridbufferused.toCPointer<ByteVar>())

public actual fun EvtOpenChannelConfig(session: EVT_HANDLE, channelpath: PCWSTR, flags: UInt): EVT_HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_EvtOpenChannelConfig(session, channelpath.toCPointer<ByteVar>(), flags)

public actual fun EvtOpenChannelEnum(session: EVT_HANDLE, flags: UInt): EVT_HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_EvtOpenChannelEnum(session, flags)

public actual fun EvtOpenEventMetadataEnum(publishermetadata: EVT_HANDLE, flags: UInt): EVT_HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_EvtOpenEventMetadataEnum(publishermetadata, flags)

public actual fun EvtOpenLog(session: EVT_HANDLE, path: PCWSTR, flags: UInt): EVT_HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_EvtOpenLog(session, path.toCPointer<ByteVar>(), flags)

public actual fun EvtOpenPublisherEnum(session: EVT_HANDLE, flags: UInt): EVT_HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_EvtOpenPublisherEnum(session, flags)

public actual fun EvtOpenPublisherMetadata(session: EVT_HANDLE, publisherid: PCWSTR, logfilepath: PCWSTR, locale: UInt, flags: UInt): EVT_HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_EvtOpenPublisherMetadata(session, publisherid.toCPointer<ByteVar>(), logfilepath.toCPointer<ByteVar>(), locale, flags)

public actual fun EvtOpenSession(loginclass: EVT_LOGIN_CLASS, login: Long, timeout: UInt, flags: UInt): EVT_HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_EvtOpenSession(loginclass, login.toCPointer<ByteVar>(), timeout, flags)

public actual fun EvtQuery(session: EVT_HANDLE, path: PCWSTR, query: PCWSTR, flags: UInt): EVT_HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_EvtQuery(session, path.toCPointer<ByteVar>(), query.toCPointer<ByteVar>(), flags)

public actual fun EvtRender(context: EVT_HANDLE, fragment: EVT_HANDLE, flags: UInt, buffersize: UInt, buffer: Long, bufferused: Long, propertycount: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_EvtRender(context, fragment, flags, buffersize, buffer.toCPointer<ByteVar>(), bufferused.toCPointer<ByteVar>(), propertycount.toCPointer<ByteVar>())

public actual fun EvtSaveChannelConfig(channelconfig: EVT_HANDLE, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_EvtSaveChannelConfig(channelconfig, flags)

public actual fun EvtSeek(resultset: EVT_HANDLE, position: Long, bookmark: EVT_HANDLE, timeout: UInt, flags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_EvtSeek(resultset, position, bookmark, timeout, flags)

public actual fun EvtSetChannelConfigProperty(channelconfig: EVT_HANDLE, propertyid: EVT_CHANNEL_CONFIG_PROPERTY_ID, flags: UInt, propertyvalue: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_EvtSetChannelConfigProperty(channelconfig, propertyid, flags, propertyvalue.toCPointer<ByteVar>())

public actual fun EvtSubscribe(session: EVT_HANDLE, signalevent: HANDLE, channelpath: PCWSTR, query: PCWSTR, bookmark: EVT_HANDLE, context: Long, callback: EVT_SUBSCRIBE_CALLBACK, flags: UInt): EVT_HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_EvtSubscribe(session, signalevent.toCPointer<ByteVar>(), channelpath.toCPointer<ByteVar>(), query.toCPointer<ByteVar>(), bookmark, context.toCPointer<ByteVar>(), callback.toLong().toCPointer<ByteVar>(), flags)

public actual fun EvtUpdateBookmark(bookmark: EVT_HANDLE, event: EVT_HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_EvtUpdateBookmark(bookmark, event)

public actual fun GetEventLogInformation(heventlog: HANDLE, dwinfolevel: UInt, lpbuffer: Long, cbbufsize: UInt, pcbbytesneeded: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_GetEventLogInformation(heventlog.toCPointer<ByteVar>(), dwinfolevel, lpbuffer.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded.toCPointer<ByteVar>())

public actual fun GetNumberOfEventLogRecords(heventlog: HANDLE, numberofrecords: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_GetNumberOfEventLogRecords(heventlog.toCPointer<ByteVar>(), numberofrecords.toCPointer<ByteVar>())

public actual fun GetOldestEventLogRecord(heventlog: HANDLE, oldestrecord: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_GetOldestEventLogRecord(heventlog.toCPointer<ByteVar>(), oldestrecord.toCPointer<ByteVar>())

public actual fun NotifyChangeEventLog(heventlog: HANDLE, hevent: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_NotifyChangeEventLog(heventlog.toCPointer<ByteVar>(), hevent.toCPointer<ByteVar>())

public actual fun OpenBackupEventLogA(lpuncservername: PCSTR, lpfilename: PCSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_OpenBackupEventLogA(lpuncservername.toCPointer<ByteVar>(), lpfilename.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun OpenBackupEventLogW(lpuncservername: PCWSTR, lpfilename: PCWSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_OpenBackupEventLogW(lpuncservername.toCPointer<ByteVar>(), lpfilename.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun OpenEventLogA(lpuncservername: PCSTR, lpsourcename: PCSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_OpenEventLogA(lpuncservername.toCPointer<ByteVar>(), lpsourcename.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun OpenEventLogW(lpuncservername: PCWSTR, lpsourcename: PCWSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_OpenEventLogW(lpuncservername.toCPointer<ByteVar>(), lpsourcename.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ReadEventLogA(heventlog: HANDLE, dwreadflags: READ_EVENT_LOG_READ_FLAGS, dwrecordoffset: UInt, lpbuffer: Long, nnumberofbytestoread: UInt, pnbytesread: Long, pnminnumberofbytesneeded: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_ReadEventLogA(heventlog.toCPointer<ByteVar>(), dwreadflags, dwrecordoffset, lpbuffer.toCPointer<ByteVar>(), nnumberofbytestoread, pnbytesread.toCPointer<ByteVar>(), pnminnumberofbytesneeded.toCPointer<ByteVar>())

public actual fun ReadEventLogW(heventlog: HANDLE, dwreadflags: READ_EVENT_LOG_READ_FLAGS, dwrecordoffset: UInt, lpbuffer: Long, nnumberofbytestoread: UInt, pnbytesread: Long, pnminnumberofbytesneeded: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_ReadEventLogW(heventlog.toCPointer<ByteVar>(), dwreadflags, dwrecordoffset, lpbuffer.toCPointer<ByteVar>(), nnumberofbytestoread, pnbytesread.toCPointer<ByteVar>(), pnminnumberofbytesneeded.toCPointer<ByteVar>())

public actual fun RegisterEventSourceA(lpuncservername: PCSTR, lpsourcename: PCSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_RegisterEventSourceA(lpuncservername.toCPointer<ByteVar>(), lpsourcename.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun RegisterEventSourceW(lpuncservername: PCWSTR, lpsourcename: PCWSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_RegisterEventSourceW(lpuncservername.toCPointer<ByteVar>(), lpsourcename.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ReportEventA(heventlog: HANDLE, wtype: REPORT_EVENT_TYPE, wcategory: UShort, dweventid: UInt, lpusersid: PSID, wnumstrings: UShort, dwdatasize: UInt, lpstrings: Long, lprawdata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_ReportEventA(heventlog.toCPointer<ByteVar>(), wtype, wcategory, dweventid, lpusersid.toCPointer<ByteVar>(), wnumstrings, dwdatasize, lpstrings.toCPointer<ByteVar>(), lprawdata.toCPointer<ByteVar>())

public actual fun ReportEventW(heventlog: HANDLE, wtype: REPORT_EVENT_TYPE, wcategory: UShort, dweventid: UInt, lpusersid: PSID, wnumstrings: UShort, dwdatasize: UInt, lpstrings: Long, lprawdata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_ReportEventW(heventlog.toCPointer<ByteVar>(), wtype, wcategory, dweventid, lpusersid.toCPointer<ByteVar>(), wnumstrings, dwdatasize, lpstrings.toCPointer<ByteVar>(), lprawdata.toCPointer<ByteVar>())
