@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.eventlog

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.PSID

private object WindowsWin32SystemEventlogJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_BackupEventLogA(heventlog: Long, lpbackupfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_BackupEventLogW(heventlog: Long, lpbackupfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_ClearEventLogA(heventlog: Long, lpbackupfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_ClearEventLogW(heventlog: Long, lpbackupfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_CloseEventLog(heventlog: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_DeregisterEventSource(heventlog: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_EvtArchiveExportedLog(session: Long, logfilepath: Long, locale: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_EvtCancel(obj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_EvtClearLog(session: Long, channelpath: Long, targetfilepath: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_EvtClose(obj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_EvtCreateBookmark(bookmarkxml: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_EvtCreateRenderContext(valuepathscount: Int, valuepaths: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_EvtExportLog(session: Long, path: Long, query: Long, targetfilepath: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_EvtFormatMessage(publishermetadata: Long, event: Long, messageid: Int, valuecount: Int, values: Long, flags: Int, buffersize: Int, buffer: Long, bufferused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_EvtGetChannelConfigProperty(channelconfig: Long, propertyid: Int, flags: Int, propertyvaluebuffersize: Int, propertyvaluebuffer: Long, propertyvaluebufferused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_EvtGetEventInfo(event: Long, propertyid: Int, propertyvaluebuffersize: Int, propertyvaluebuffer: Long, propertyvaluebufferused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_EvtGetEventMetadataProperty(eventmetadata: Long, propertyid: Int, flags: Int, eventmetadatapropertybuffersize: Int, eventmetadatapropertybuffer: Long, eventmetadatapropertybufferused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_EvtGetExtendedStatus(buffersize: Int, buffer: Long, bufferused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_EvtGetLogInfo(log: Long, propertyid: Int, propertyvaluebuffersize: Int, propertyvaluebuffer: Long, propertyvaluebufferused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_EvtGetObjectArrayProperty(objectarray: Long, propertyid: Int, arrayindex: Int, flags: Int, propertyvaluebuffersize: Int, propertyvaluebuffer: Long, propertyvaluebufferused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_EvtGetObjectArraySize(objectarray: Long, objectarraysize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_EvtGetPublisherMetadataProperty(publishermetadata: Long, propertyid: Int, flags: Int, publishermetadatapropertybuffersize: Int, publishermetadatapropertybuffer: Long, publishermetadatapropertybufferused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_EvtGetQueryInfo(queryorsubscription: Long, propertyid: Int, propertyvaluebuffersize: Int, propertyvaluebuffer: Long, propertyvaluebufferused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_EvtNext(resultset: Long, eventssize: Int, events: Long, timeout: Int, flags: Int, returned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_EvtNextChannelPath(channelenum: Long, channelpathbuffersize: Int, channelpathbuffer: Long, channelpathbufferused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_EvtNextEventMetadata(eventmetadataenum: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_EvtNextPublisherId(publisherenum: Long, publisheridbuffersize: Int, publisheridbuffer: Long, publisheridbufferused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_EvtOpenChannelConfig(session: Long, channelpath: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_EvtOpenChannelEnum(session: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_EvtOpenEventMetadataEnum(publishermetadata: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_EvtOpenLog(session: Long, path: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_EvtOpenPublisherEnum(session: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_EvtOpenPublisherMetadata(session: Long, publisherid: Long, logfilepath: Long, locale: Int, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_EvtOpenSession(loginclass: Int, login: Long, timeout: Int, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_EvtQuery(session: Long, path: Long, query: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_EvtRender(context: Long, fragment: Long, flags: Int, buffersize: Int, buffer: Long, bufferused: Long, propertycount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_EvtSaveChannelConfig(channelconfig: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_EvtSeek(resultset: Long, position: Long, bookmark: Long, timeout: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_EvtSetChannelConfigProperty(channelconfig: Long, propertyid: Int, flags: Int, propertyvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_EvtSubscribe(session: Long, signalevent: Long, channelpath: Long, query: Long, bookmark: Long, context: Long, callback: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_EvtUpdateBookmark(bookmark: Long, event: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_GetEventLogInformation(heventlog: Long, dwinfolevel: Int, lpbuffer: Long, cbbufsize: Int, pcbbytesneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_GetNumberOfEventLogRecords(heventlog: Long, numberofrecords: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_GetOldestEventLogRecord(heventlog: Long, oldestrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_NotifyChangeEventLog(heventlog: Long, hevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_OpenBackupEventLogA(lpuncservername: Long, lpfilename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_OpenBackupEventLogW(lpuncservername: Long, lpfilename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_OpenEventLogA(lpuncservername: Long, lpsourcename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_OpenEventLogW(lpuncservername: Long, lpsourcename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_ReadEventLogA(heventlog: Long, dwreadflags: Int, dwrecordoffset: Int, lpbuffer: Long, nnumberofbytestoread: Int, pnbytesread: Long, pnminnumberofbytesneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_ReadEventLogW(heventlog: Long, dwreadflags: Int, dwrecordoffset: Int, lpbuffer: Long, nnumberofbytestoread: Int, pnbytesread: Long, pnminnumberofbytesneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_RegisterEventSourceA(lpuncservername: Long, lpsourcename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_RegisterEventSourceW(lpuncservername: Long, lpsourcename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_ReportEventA(heventlog: Long, wtype: Short, wcategory: Short, dweventid: Int, lpusersid: Long, wnumstrings: Short, dwdatasize: Int, lpstrings: Long, lprawdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_ReportEventW(heventlog: Long, wtype: Short, wcategory: Short, dweventid: Int, lpusersid: Long, wnumstrings: Short, dwdatasize: Int, lpstrings: Long, lprawdata: Long): Int
}

public actual fun BackupEventLogA(heventlog: HANDLE, lpbackupfilename: PCSTR): BOOL =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_BackupEventLogA(heventlog, lpbackupfilename)

public actual fun BackupEventLogW(heventlog: HANDLE, lpbackupfilename: PCWSTR): BOOL =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_BackupEventLogW(heventlog, lpbackupfilename)

public actual fun ClearEventLogA(heventlog: HANDLE, lpbackupfilename: PCSTR): BOOL =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_ClearEventLogA(heventlog, lpbackupfilename)

public actual fun ClearEventLogW(heventlog: HANDLE, lpbackupfilename: PCWSTR): BOOL =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_ClearEventLogW(heventlog, lpbackupfilename)

public actual fun CloseEventLog(heventlog: HANDLE): BOOL =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_CloseEventLog(heventlog)

public actual fun DeregisterEventSource(heventlog: HANDLE): BOOL =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_DeregisterEventSource(heventlog)

public actual fun EvtArchiveExportedLog(session: EVT_HANDLE, logfilepath: PCWSTR, locale: UInt, flags: UInt): BOOL =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_EvtArchiveExportedLog(session, logfilepath, locale.toInt(), flags.toInt())

public actual fun EvtCancel(obj: EVT_HANDLE): BOOL =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_EvtCancel(obj)

public actual fun EvtClearLog(session: EVT_HANDLE, channelpath: PCWSTR, targetfilepath: PCWSTR, flags: UInt): BOOL =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_EvtClearLog(session, channelpath, targetfilepath, flags.toInt())

public actual fun EvtClose(obj: EVT_HANDLE): BOOL =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_EvtClose(obj)

public actual fun EvtCreateBookmark(bookmarkxml: PCWSTR): EVT_HANDLE =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_EvtCreateBookmark(bookmarkxml)

public actual fun EvtCreateRenderContext(valuepathscount: UInt, valuepaths: Long, flags: UInt): EVT_HANDLE =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_EvtCreateRenderContext(valuepathscount.toInt(), valuepaths, flags.toInt())

public actual fun EvtExportLog(session: EVT_HANDLE, path: PCWSTR, query: PCWSTR, targetfilepath: PCWSTR, flags: UInt): BOOL =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_EvtExportLog(session, path, query, targetfilepath, flags.toInt())

public actual fun EvtFormatMessage(publishermetadata: EVT_HANDLE, event: EVT_HANDLE, messageid: UInt, valuecount: UInt, values: Long, flags: UInt, buffersize: UInt, buffer: PWSTR, bufferused: Long): BOOL =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_EvtFormatMessage(publishermetadata, event, messageid.toInt(), valuecount.toInt(), values, flags.toInt(), buffersize.toInt(), buffer, bufferused)

public actual fun EvtGetChannelConfigProperty(channelconfig: EVT_HANDLE, propertyid: EVT_CHANNEL_CONFIG_PROPERTY_ID, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: Long, propertyvaluebufferused: Long): BOOL =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_EvtGetChannelConfigProperty(channelconfig, propertyid, flags.toInt(), propertyvaluebuffersize.toInt(), propertyvaluebuffer, propertyvaluebufferused)

public actual fun EvtGetEventInfo(event: EVT_HANDLE, propertyid: EVT_EVENT_PROPERTY_ID, propertyvaluebuffersize: UInt, propertyvaluebuffer: Long, propertyvaluebufferused: Long): BOOL =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_EvtGetEventInfo(event, propertyid, propertyvaluebuffersize.toInt(), propertyvaluebuffer, propertyvaluebufferused)

public actual fun EvtGetEventMetadataProperty(eventmetadata: EVT_HANDLE, propertyid: EVT_EVENT_METADATA_PROPERTY_ID, flags: UInt, eventmetadatapropertybuffersize: UInt, eventmetadatapropertybuffer: Long, eventmetadatapropertybufferused: Long): BOOL =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_EvtGetEventMetadataProperty(eventmetadata, propertyid, flags.toInt(), eventmetadatapropertybuffersize.toInt(), eventmetadatapropertybuffer, eventmetadatapropertybufferused)

public actual fun EvtGetExtendedStatus(buffersize: UInt, buffer: PWSTR, bufferused: Long): UInt =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_EvtGetExtendedStatus(buffersize.toInt(), buffer, bufferused).toUInt()

public actual fun EvtGetLogInfo(log: EVT_HANDLE, propertyid: EVT_LOG_PROPERTY_ID, propertyvaluebuffersize: UInt, propertyvaluebuffer: Long, propertyvaluebufferused: Long): BOOL =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_EvtGetLogInfo(log, propertyid, propertyvaluebuffersize.toInt(), propertyvaluebuffer, propertyvaluebufferused)

public actual fun EvtGetObjectArrayProperty(objectarray: Long, propertyid: UInt, arrayindex: UInt, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: Long, propertyvaluebufferused: Long): BOOL =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_EvtGetObjectArrayProperty(objectarray, propertyid.toInt(), arrayindex.toInt(), flags.toInt(), propertyvaluebuffersize.toInt(), propertyvaluebuffer, propertyvaluebufferused)

public actual fun EvtGetObjectArraySize(objectarray: Long, objectarraysize: Long): BOOL =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_EvtGetObjectArraySize(objectarray, objectarraysize)

public actual fun EvtGetPublisherMetadataProperty(publishermetadata: EVT_HANDLE, propertyid: EVT_PUBLISHER_METADATA_PROPERTY_ID, flags: UInt, publishermetadatapropertybuffersize: UInt, publishermetadatapropertybuffer: Long, publishermetadatapropertybufferused: Long): BOOL =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_EvtGetPublisherMetadataProperty(publishermetadata, propertyid, flags.toInt(), publishermetadatapropertybuffersize.toInt(), publishermetadatapropertybuffer, publishermetadatapropertybufferused)

public actual fun EvtGetQueryInfo(queryorsubscription: EVT_HANDLE, propertyid: EVT_QUERY_PROPERTY_ID, propertyvaluebuffersize: UInt, propertyvaluebuffer: Long, propertyvaluebufferused: Long): BOOL =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_EvtGetQueryInfo(queryorsubscription, propertyid, propertyvaluebuffersize.toInt(), propertyvaluebuffer, propertyvaluebufferused)

public actual fun EvtNext(resultset: EVT_HANDLE, eventssize: UInt, events: Long, timeout: UInt, flags: UInt, returned: Long): BOOL =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_EvtNext(resultset, eventssize.toInt(), events, timeout.toInt(), flags.toInt(), returned)

public actual fun EvtNextChannelPath(channelenum: EVT_HANDLE, channelpathbuffersize: UInt, channelpathbuffer: PWSTR, channelpathbufferused: Long): BOOL =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_EvtNextChannelPath(channelenum, channelpathbuffersize.toInt(), channelpathbuffer, channelpathbufferused)

public actual fun EvtNextEventMetadata(eventmetadataenum: EVT_HANDLE, flags: UInt): EVT_HANDLE =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_EvtNextEventMetadata(eventmetadataenum, flags.toInt())

public actual fun EvtNextPublisherId(publisherenum: EVT_HANDLE, publisheridbuffersize: UInt, publisheridbuffer: PWSTR, publisheridbufferused: Long): BOOL =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_EvtNextPublisherId(publisherenum, publisheridbuffersize.toInt(), publisheridbuffer, publisheridbufferused)

public actual fun EvtOpenChannelConfig(session: EVT_HANDLE, channelpath: PCWSTR, flags: UInt): EVT_HANDLE =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_EvtOpenChannelConfig(session, channelpath, flags.toInt())

public actual fun EvtOpenChannelEnum(session: EVT_HANDLE, flags: UInt): EVT_HANDLE =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_EvtOpenChannelEnum(session, flags.toInt())

public actual fun EvtOpenEventMetadataEnum(publishermetadata: EVT_HANDLE, flags: UInt): EVT_HANDLE =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_EvtOpenEventMetadataEnum(publishermetadata, flags.toInt())

public actual fun EvtOpenLog(session: EVT_HANDLE, path: PCWSTR, flags: UInt): EVT_HANDLE =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_EvtOpenLog(session, path, flags.toInt())

public actual fun EvtOpenPublisherEnum(session: EVT_HANDLE, flags: UInt): EVT_HANDLE =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_EvtOpenPublisherEnum(session, flags.toInt())

public actual fun EvtOpenPublisherMetadata(session: EVT_HANDLE, publisherid: PCWSTR, logfilepath: PCWSTR, locale: UInt, flags: UInt): EVT_HANDLE =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_EvtOpenPublisherMetadata(session, publisherid, logfilepath, locale.toInt(), flags.toInt())

public actual fun EvtOpenSession(loginclass: EVT_LOGIN_CLASS, login: Long, timeout: UInt, flags: UInt): EVT_HANDLE =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_EvtOpenSession(loginclass, login, timeout.toInt(), flags.toInt())

public actual fun EvtQuery(session: EVT_HANDLE, path: PCWSTR, query: PCWSTR, flags: UInt): EVT_HANDLE =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_EvtQuery(session, path, query, flags.toInt())

public actual fun EvtRender(context: EVT_HANDLE, fragment: EVT_HANDLE, flags: UInt, buffersize: UInt, buffer: Long, bufferused: Long, propertycount: Long): BOOL =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_EvtRender(context, fragment, flags.toInt(), buffersize.toInt(), buffer, bufferused, propertycount)

public actual fun EvtSaveChannelConfig(channelconfig: EVT_HANDLE, flags: UInt): BOOL =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_EvtSaveChannelConfig(channelconfig, flags.toInt())

public actual fun EvtSeek(resultset: EVT_HANDLE, position: Long, bookmark: EVT_HANDLE, timeout: UInt, flags: UInt): BOOL =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_EvtSeek(resultset, position, bookmark, timeout.toInt(), flags.toInt())

public actual fun EvtSetChannelConfigProperty(channelconfig: EVT_HANDLE, propertyid: EVT_CHANNEL_CONFIG_PROPERTY_ID, flags: UInt, propertyvalue: Long): BOOL =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_EvtSetChannelConfigProperty(channelconfig, propertyid, flags.toInt(), propertyvalue)

public actual fun EvtSubscribe(session: EVT_HANDLE, signalevent: HANDLE, channelpath: PCWSTR, query: PCWSTR, bookmark: EVT_HANDLE, context: Long, callback: EVT_SUBSCRIBE_CALLBACK, flags: UInt): EVT_HANDLE =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_EvtSubscribe(session, signalevent, channelpath, query, bookmark, context, callback.toLong(), flags.toInt())

public actual fun EvtUpdateBookmark(bookmark: EVT_HANDLE, event: EVT_HANDLE): BOOL =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_EvtUpdateBookmark(bookmark, event)

public actual fun GetEventLogInformation(heventlog: HANDLE, dwinfolevel: UInt, lpbuffer: Long, cbbufsize: UInt, pcbbytesneeded: Long): BOOL =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_GetEventLogInformation(heventlog, dwinfolevel.toInt(), lpbuffer, cbbufsize.toInt(), pcbbytesneeded)

public actual fun GetNumberOfEventLogRecords(heventlog: HANDLE, numberofrecords: Long): BOOL =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_GetNumberOfEventLogRecords(heventlog, numberofrecords)

public actual fun GetOldestEventLogRecord(heventlog: HANDLE, oldestrecord: Long): BOOL =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_GetOldestEventLogRecord(heventlog, oldestrecord)

public actual fun NotifyChangeEventLog(heventlog: HANDLE, hevent: HANDLE): BOOL =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_NotifyChangeEventLog(heventlog, hevent)

public actual fun OpenBackupEventLogA(lpuncservername: PCSTR, lpfilename: PCSTR): HANDLE =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_OpenBackupEventLogA(lpuncservername, lpfilename)

public actual fun OpenBackupEventLogW(lpuncservername: PCWSTR, lpfilename: PCWSTR): HANDLE =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_OpenBackupEventLogW(lpuncservername, lpfilename)

public actual fun OpenEventLogA(lpuncservername: PCSTR, lpsourcename: PCSTR): HANDLE =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_OpenEventLogA(lpuncservername, lpsourcename)

public actual fun OpenEventLogW(lpuncservername: PCWSTR, lpsourcename: PCWSTR): HANDLE =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_OpenEventLogW(lpuncservername, lpsourcename)

public actual fun ReadEventLogA(heventlog: HANDLE, dwreadflags: READ_EVENT_LOG_READ_FLAGS, dwrecordoffset: UInt, lpbuffer: Long, nnumberofbytestoread: UInt, pnbytesread: Long, pnminnumberofbytesneeded: Long): BOOL =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_ReadEventLogA(heventlog, dwreadflags.toInt(), dwrecordoffset.toInt(), lpbuffer, nnumberofbytestoread.toInt(), pnbytesread, pnminnumberofbytesneeded)

public actual fun ReadEventLogW(heventlog: HANDLE, dwreadflags: READ_EVENT_LOG_READ_FLAGS, dwrecordoffset: UInt, lpbuffer: Long, nnumberofbytestoread: UInt, pnbytesread: Long, pnminnumberofbytesneeded: Long): BOOL =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_ReadEventLogW(heventlog, dwreadflags.toInt(), dwrecordoffset.toInt(), lpbuffer, nnumberofbytestoread.toInt(), pnbytesread, pnminnumberofbytesneeded)

public actual fun RegisterEventSourceA(lpuncservername: PCSTR, lpsourcename: PCSTR): HANDLE =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_RegisterEventSourceA(lpuncservername, lpsourcename)

public actual fun RegisterEventSourceW(lpuncservername: PCWSTR, lpsourcename: PCWSTR): HANDLE =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_RegisterEventSourceW(lpuncservername, lpsourcename)

public actual fun ReportEventA(heventlog: HANDLE, wtype: REPORT_EVENT_TYPE, wcategory: UShort, dweventid: UInt, lpusersid: PSID, wnumstrings: UShort, dwdatasize: UInt, lpstrings: Long, lprawdata: Long): BOOL =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_ReportEventA(heventlog, wtype.toShort(), wcategory.toShort(), dweventid.toInt(), lpusersid, wnumstrings.toShort(), dwdatasize.toInt(), lpstrings, lprawdata)

public actual fun ReportEventW(heventlog: HANDLE, wtype: REPORT_EVENT_TYPE, wcategory: UShort, dweventid: UInt, lpusersid: PSID, wnumstrings: UShort, dwdatasize: UInt, lpstrings: Long, lprawdata: Long): BOOL =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_ReportEventW(heventlog, wtype.toShort(), wcategory.toShort(), dweventid.toInt(), lpusersid, wnumstrings.toShort(), dwdatasize.toInt(), lpstrings, lprawdata)
