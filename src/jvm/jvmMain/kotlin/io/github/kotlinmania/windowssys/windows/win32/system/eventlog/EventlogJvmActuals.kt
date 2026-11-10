@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.eventlog

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.Psid

private object WindowsWin32SystemEventlogJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_backupEventLogA(heventlog: Long, lpbackupfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_backupEventLogW(heventlog: Long, lpbackupfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_clearEventLogA(heventlog: Long, lpbackupfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_clearEventLogW(heventlog: Long, lpbackupfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_closeEventLog(heventlog: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_deregisterEventSource(heventlog: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_evtArchiveExportedLog(session: Long, logfilepath: Long, locale: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_evtCancel(obj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_evtClearLog(session: Long, channelpath: Long, targetfilepath: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_evtClose(obj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_evtCreateBookmark(bookmarkxml: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_evtCreateRenderContext(valuepathscount: Int, valuepaths: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_evtExportLog(session: Long, path: Long, query: Long, targetfilepath: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_evtFormatMessage(publishermetadata: Long, event: Long, messageid: Int, valuecount: Int, values: Long, flags: Int, buffersize: Int, buffer: Long, bufferused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_evtGetChannelConfigProperty(channelconfig: Long, propertyid: Int, flags: Int, propertyvaluebuffersize: Int, propertyvaluebuffer: Long, propertyvaluebufferused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_evtGetEventInfo(event: Long, propertyid: Int, propertyvaluebuffersize: Int, propertyvaluebuffer: Long, propertyvaluebufferused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_evtGetEventMetadataProperty(eventmetadata: Long, propertyid: Int, flags: Int, eventmetadatapropertybuffersize: Int, eventmetadatapropertybuffer: Long, eventmetadatapropertybufferused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_evtGetExtendedStatus(buffersize: Int, buffer: Long, bufferused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_evtGetLogInfo(log: Long, propertyid: Int, propertyvaluebuffersize: Int, propertyvaluebuffer: Long, propertyvaluebufferused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_evtGetObjectArrayProperty(objectarray: Long, propertyid: Int, arrayindex: Int, flags: Int, propertyvaluebuffersize: Int, propertyvaluebuffer: Long, propertyvaluebufferused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_evtGetObjectArraySize(objectarray: Long, objectarraysize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_evtGetPublisherMetadataProperty(publishermetadata: Long, propertyid: Int, flags: Int, publishermetadatapropertybuffersize: Int, publishermetadatapropertybuffer: Long, publishermetadatapropertybufferused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_evtGetQueryInfo(queryorsubscription: Long, propertyid: Int, propertyvaluebuffersize: Int, propertyvaluebuffer: Long, propertyvaluebufferused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_evtNext(resultset: Long, eventssize: Int, events: Long, timeout: Int, flags: Int, returned: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_evtNextChannelPath(channelenum: Long, channelpathbuffersize: Int, channelpathbuffer: Long, channelpathbufferused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_evtNextEventMetadata(eventmetadataenum: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_evtNextPublisherId(publisherenum: Long, publisheridbuffersize: Int, publisheridbuffer: Long, publisheridbufferused: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_evtOpenChannelConfig(session: Long, channelpath: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_evtOpenChannelEnum(session: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_evtOpenEventMetadataEnum(publishermetadata: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_evtOpenLog(session: Long, path: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_evtOpenPublisherEnum(session: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_evtOpenPublisherMetadata(session: Long, publisherid: Long, logfilepath: Long, locale: Int, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_evtOpenSession(loginclass: Int, login: Long, timeout: Int, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_evtQuery(session: Long, path: Long, query: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_evtRender(context: Long, fragment: Long, flags: Int, buffersize: Int, buffer: Long, bufferused: Long, propertycount: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_evtSaveChannelConfig(channelconfig: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_evtSeek(resultset: Long, position: Long, bookmark: Long, timeout: Int, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_evtSetChannelConfigProperty(channelconfig: Long, propertyid: Int, flags: Int, propertyvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_evtSubscribe(session: Long, signalevent: Long, channelpath: Long, query: Long, bookmark: Long, context: Long, callback: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_evtUpdateBookmark(bookmark: Long, event: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_getEventLogInformation(heventlog: Long, dwinfolevel: Int, lpbuffer: Long, cbbufsize: Int, pcbbytesneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_getNumberOfEventLogRecords(heventlog: Long, numberofrecords: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_getOldestEventLogRecord(heventlog: Long, oldestrecord: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_notifyChangeEventLog(heventlog: Long, hevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_openBackupEventLogA(lpuncservername: Long, lpfilename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_openBackupEventLogW(lpuncservername: Long, lpfilename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_openEventLogA(lpuncservername: Long, lpsourcename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_openEventLogW(lpuncservername: Long, lpsourcename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_readEventLogA(heventlog: Long, dwreadflags: Int, dwrecordoffset: Int, lpbuffer: Long, nnumberofbytestoread: Int, pnbytesread: Long, pnminnumberofbytesneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_readEventLogW(heventlog: Long, dwreadflags: Int, dwrecordoffset: Int, lpbuffer: Long, nnumberofbytestoread: Int, pnbytesread: Long, pnminnumberofbytesneeded: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_registerEventSourceA(lpuncservername: Long, lpsourcename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_registerEventSourceW(lpuncservername: Long, lpsourcename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_reportEventA(heventlog: Long, wtype: Short, wcategory: Short, dweventid: Int, lpusersid: Long, wnumstrings: Short, dwdatasize: Int, lpstrings: Long, lprawdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_eventlog_reportEventW(heventlog: Long, wtype: Short, wcategory: Short, dweventid: Int, lpusersid: Long, wnumstrings: Short, dwdatasize: Int, lpstrings: Long, lprawdata: Long): Int
}

public actual fun backupEventLogA(heventlog: Handle, lpbackupfilename: Pcstr): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_backupEventLogA((heventlog?.value ?: 0L), (lpbackupfilename?.value ?: 0L))

public actual fun backupEventLogW(heventlog: Handle, lpbackupfilename: Pcwstr): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_backupEventLogW((heventlog?.value ?: 0L), (lpbackupfilename?.value ?: 0L))

public actual fun clearEventLogA(heventlog: Handle, lpbackupfilename: Pcstr): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_clearEventLogA((heventlog?.value ?: 0L), (lpbackupfilename?.value ?: 0L))

public actual fun clearEventLogW(heventlog: Handle, lpbackupfilename: Pcwstr): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_clearEventLogW((heventlog?.value ?: 0L), (lpbackupfilename?.value ?: 0L))

public actual fun closeEventLog(heventlog: Handle): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_closeEventLog((heventlog?.value ?: 0L))

public actual fun deregisterEventSource(heventlog: Handle): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_deregisterEventSource((heventlog?.value ?: 0L))

public actual fun evtArchiveExportedLog(session: EvtHandle, logfilepath: Pcwstr, locale: UInt, flags: UInt): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_evtArchiveExportedLog(session, (logfilepath?.value ?: 0L), locale.toInt(), flags.toInt())

public actual fun evtCancel(obj: EvtHandle): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_evtCancel(obj)

public actual fun evtClearLog(session: EvtHandle, channelpath: Pcwstr, targetfilepath: Pcwstr, flags: UInt): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_evtClearLog(session, (channelpath?.value ?: 0L), (targetfilepath?.value ?: 0L), flags.toInt())

public actual fun evtClose(obj: EvtHandle): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_evtClose(obj)

public actual fun evtCreateBookmark(bookmarkxml: Pcwstr): EvtHandle =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_evtCreateBookmark((bookmarkxml?.value ?: 0L))

public actual fun evtCreateRenderContext(valuepathscount: UInt, valuepaths: COpaquePointer?, flags: UInt): EvtHandle =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_evtCreateRenderContext(valuepathscount.toInt(), (valuepaths?.value ?: 0L), flags.toInt())

public actual fun evtExportLog(session: EvtHandle, path: Pcwstr, query: Pcwstr, targetfilepath: Pcwstr, flags: UInt): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_evtExportLog(session, (path?.value ?: 0L), (query?.value ?: 0L), (targetfilepath?.value ?: 0L), flags.toInt())

public actual fun evtFormatMessage(publishermetadata: EvtHandle, event: EvtHandle, messageid: UInt, valuecount: UInt, values: COpaquePointer?, flags: UInt, buffersize: UInt, buffer: Pwstr, bufferused: COpaquePointer?): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_evtFormatMessage(publishermetadata, event, messageid.toInt(), valuecount.toInt(), (values?.value ?: 0L), flags.toInt(), buffersize.toInt(), (buffer?.value ?: 0L), (bufferused?.value ?: 0L))

public actual fun evtGetChannelConfigProperty(channelconfig: EvtHandle, propertyid: EvtChannelConfigPropertyId, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: COpaquePointer?, propertyvaluebufferused: COpaquePointer?): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_evtGetChannelConfigProperty(channelconfig, propertyid, flags.toInt(), propertyvaluebuffersize.toInt(), (propertyvaluebuffer?.value ?: 0L), (propertyvaluebufferused?.value ?: 0L))

public actual fun evtGetEventInfo(event: EvtHandle, propertyid: EvtEventPropertyId, propertyvaluebuffersize: UInt, propertyvaluebuffer: COpaquePointer?, propertyvaluebufferused: COpaquePointer?): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_evtGetEventInfo(event, propertyid, propertyvaluebuffersize.toInt(), (propertyvaluebuffer?.value ?: 0L), (propertyvaluebufferused?.value ?: 0L))

public actual fun evtGetEventMetadataProperty(eventmetadata: EvtHandle, propertyid: EvtEventMetadataPropertyId, flags: UInt, eventmetadatapropertybuffersize: UInt, eventmetadatapropertybuffer: COpaquePointer?, eventmetadatapropertybufferused: COpaquePointer?): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_evtGetEventMetadataProperty(eventmetadata, propertyid, flags.toInt(), eventmetadatapropertybuffersize.toInt(), (eventmetadatapropertybuffer?.value ?: 0L), (eventmetadatapropertybufferused?.value ?: 0L))

public actual fun evtGetExtendedStatus(buffersize: UInt, buffer: Pwstr, bufferused: COpaquePointer?): UInt =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_evtGetExtendedStatus(buffersize.toInt(), (buffer?.value ?: 0L), (bufferused?.value ?: 0L)).toUInt()

public actual fun evtGetLogInfo(log: EvtHandle, propertyid: EvtLogPropertyId, propertyvaluebuffersize: UInt, propertyvaluebuffer: COpaquePointer?, propertyvaluebufferused: COpaquePointer?): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_evtGetLogInfo(log, propertyid, propertyvaluebuffersize.toInt(), (propertyvaluebuffer?.value ?: 0L), (propertyvaluebufferused?.value ?: 0L))

public actual fun evtGetObjectArrayProperty(objectarray: Long, propertyid: UInt, arrayindex: UInt, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: COpaquePointer?, propertyvaluebufferused: COpaquePointer?): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_evtGetObjectArrayProperty(objectarray, propertyid.toInt(), arrayindex.toInt(), flags.toInt(), propertyvaluebuffersize.toInt(), (propertyvaluebuffer?.value ?: 0L), (propertyvaluebufferused?.value ?: 0L))

public actual fun evtGetObjectArraySize(objectarray: Long, objectarraysize: COpaquePointer?): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_evtGetObjectArraySize(objectarray, (objectarraysize?.value ?: 0L))

public actual fun evtGetPublisherMetadataProperty(publishermetadata: EvtHandle, propertyid: EvtPublisherMetadataPropertyId, flags: UInt, publishermetadatapropertybuffersize: UInt, publishermetadatapropertybuffer: COpaquePointer?, publishermetadatapropertybufferused: COpaquePointer?): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_evtGetPublisherMetadataProperty(publishermetadata, propertyid, flags.toInt(), publishermetadatapropertybuffersize.toInt(), (publishermetadatapropertybuffer?.value ?: 0L), (publishermetadatapropertybufferused?.value ?: 0L))

public actual fun evtGetQueryInfo(queryorsubscription: EvtHandle, propertyid: EvtQueryPropertyId, propertyvaluebuffersize: UInt, propertyvaluebuffer: COpaquePointer?, propertyvaluebufferused: COpaquePointer?): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_evtGetQueryInfo(queryorsubscription, propertyid, propertyvaluebuffersize.toInt(), (propertyvaluebuffer?.value ?: 0L), (propertyvaluebufferused?.value ?: 0L))

public actual fun evtNext(resultset: EvtHandle, eventssize: UInt, events: COpaquePointer?, timeout: UInt, flags: UInt, returned: COpaquePointer?): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_evtNext(resultset, eventssize.toInt(), (events?.value ?: 0L), timeout.toInt(), flags.toInt(), (returned?.value ?: 0L))

public actual fun evtNextChannelPath(channelenum: EvtHandle, channelpathbuffersize: UInt, channelpathbuffer: Pwstr, channelpathbufferused: COpaquePointer?): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_evtNextChannelPath(channelenum, channelpathbuffersize.toInt(), (channelpathbuffer?.value ?: 0L), (channelpathbufferused?.value ?: 0L))

public actual fun evtNextEventMetadata(eventmetadataenum: EvtHandle, flags: UInt): EvtHandle =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_evtNextEventMetadata(eventmetadataenum, flags.toInt())

public actual fun evtNextPublisherId(publisherenum: EvtHandle, publisheridbuffersize: UInt, publisheridbuffer: Pwstr, publisheridbufferused: COpaquePointer?): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_evtNextPublisherId(publisherenum, publisheridbuffersize.toInt(), (publisheridbuffer?.value ?: 0L), (publisheridbufferused?.value ?: 0L))

public actual fun evtOpenChannelConfig(session: EvtHandle, channelpath: Pcwstr, flags: UInt): EvtHandle =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_evtOpenChannelConfig(session, (channelpath?.value ?: 0L), flags.toInt())

public actual fun evtOpenChannelEnum(session: EvtHandle, flags: UInt): EvtHandle =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_evtOpenChannelEnum(session, flags.toInt())

public actual fun evtOpenEventMetadataEnum(publishermetadata: EvtHandle, flags: UInt): EvtHandle =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_evtOpenEventMetadataEnum(publishermetadata, flags.toInt())

public actual fun evtOpenLog(session: EvtHandle, path: Pcwstr, flags: UInt): EvtHandle =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_evtOpenLog(session, (path?.value ?: 0L), flags.toInt())

public actual fun evtOpenPublisherEnum(session: EvtHandle, flags: UInt): EvtHandle =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_evtOpenPublisherEnum(session, flags.toInt())

public actual fun evtOpenPublisherMetadata(session: EvtHandle, publisherid: Pcwstr, logfilepath: Pcwstr, locale: UInt, flags: UInt): EvtHandle =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_evtOpenPublisherMetadata(session, (publisherid?.value ?: 0L), (logfilepath?.value ?: 0L), locale.toInt(), flags.toInt())

public actual fun evtOpenSession(loginclass: EvtLoginClass, login: COpaquePointer?, timeout: UInt, flags: UInt): EvtHandle =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_evtOpenSession(loginclass, (login?.value ?: 0L), timeout.toInt(), flags.toInt())

public actual fun evtQuery(session: EvtHandle, path: Pcwstr, query: Pcwstr, flags: UInt): EvtHandle =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_evtQuery(session, (path?.value ?: 0L), (query?.value ?: 0L), flags.toInt())

public actual fun evtRender(context: EvtHandle, fragment: EvtHandle, flags: UInt, buffersize: UInt, buffer: COpaquePointer?, bufferused: COpaquePointer?, propertycount: COpaquePointer?): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_evtRender(context, fragment, flags.toInt(), buffersize.toInt(), (buffer?.value ?: 0L), (bufferused?.value ?: 0L), (propertycount?.value ?: 0L))

public actual fun evtSaveChannelConfig(channelconfig: EvtHandle, flags: UInt): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_evtSaveChannelConfig(channelconfig, flags.toInt())

public actual fun evtSeek(resultset: EvtHandle, position: Long, bookmark: EvtHandle, timeout: UInt, flags: UInt): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_evtSeek(resultset, position, bookmark, timeout.toInt(), flags.toInt())

public actual fun evtSetChannelConfigProperty(channelconfig: EvtHandle, propertyid: EvtChannelConfigPropertyId, flags: UInt, propertyvalue: COpaquePointer?): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_evtSetChannelConfigProperty(channelconfig, propertyid, flags.toInt(), (propertyvalue?.value ?: 0L))

public actual fun evtSubscribe(session: EvtHandle, signalevent: Handle, channelpath: Pcwstr, query: Pcwstr, bookmark: EvtHandle, context: COpaquePointer?, callback: EvtSubscribeCallback, flags: UInt): EvtHandle =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_evtSubscribe(session, (signalevent?.value ?: 0L), (channelpath?.value ?: 0L), (query?.value ?: 0L), bookmark, (context?.value ?: 0L), 0L, flags.toInt())

public actual fun evtUpdateBookmark(bookmark: EvtHandle, event: EvtHandle): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_evtUpdateBookmark(bookmark, event)

public actual fun getEventLogInformation(heventlog: Handle, dwinfolevel: UInt, lpbuffer: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_getEventLogInformation((heventlog?.value ?: 0L), dwinfolevel.toInt(), (lpbuffer?.value ?: 0L), cbbufsize.toInt(), (pcbbytesneeded?.value ?: 0L))

public actual fun getNumberOfEventLogRecords(heventlog: Handle, numberofrecords: COpaquePointer?): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_getNumberOfEventLogRecords((heventlog?.value ?: 0L), (numberofrecords?.value ?: 0L))

public actual fun getOldestEventLogRecord(heventlog: Handle, oldestrecord: COpaquePointer?): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_getOldestEventLogRecord((heventlog?.value ?: 0L), (oldestrecord?.value ?: 0L))

public actual fun notifyChangeEventLog(heventlog: Handle, hevent: Handle): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_notifyChangeEventLog((heventlog?.value ?: 0L), (hevent?.value ?: 0L))

public actual fun openBackupEventLogA(lpuncservername: Pcstr, lpfilename: Pcstr): Handle =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_openBackupEventLogA((lpuncservername?.value ?: 0L), (lpfilename?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun openBackupEventLogW(lpuncservername: Pcwstr, lpfilename: Pcwstr): Handle =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_openBackupEventLogW((lpuncservername?.value ?: 0L), (lpfilename?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun openEventLogA(lpuncservername: Pcstr, lpsourcename: Pcstr): Handle =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_openEventLogA((lpuncservername?.value ?: 0L), (lpsourcename?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun openEventLogW(lpuncservername: Pcwstr, lpsourcename: Pcwstr): Handle =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_openEventLogW((lpuncservername?.value ?: 0L), (lpsourcename?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun readEventLogA(heventlog: Handle, dwreadflags: ReadEventLogReadFlags, dwrecordoffset: UInt, lpbuffer: COpaquePointer?, nnumberofbytestoread: UInt, pnbytesread: COpaquePointer?, pnminnumberofbytesneeded: COpaquePointer?): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_readEventLogA((heventlog?.value ?: 0L), dwreadflags.toInt(), dwrecordoffset.toInt(), (lpbuffer?.value ?: 0L), nnumberofbytestoread.toInt(), (pnbytesread?.value ?: 0L), (pnminnumberofbytesneeded?.value ?: 0L))

public actual fun readEventLogW(heventlog: Handle, dwreadflags: ReadEventLogReadFlags, dwrecordoffset: UInt, lpbuffer: COpaquePointer?, nnumberofbytestoread: UInt, pnbytesread: COpaquePointer?, pnminnumberofbytesneeded: COpaquePointer?): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_readEventLogW((heventlog?.value ?: 0L), dwreadflags.toInt(), dwrecordoffset.toInt(), (lpbuffer?.value ?: 0L), nnumberofbytestoread.toInt(), (pnbytesread?.value ?: 0L), (pnminnumberofbytesneeded?.value ?: 0L))

public actual fun registerEventSourceA(lpuncservername: Pcstr, lpsourcename: Pcstr): Handle =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_registerEventSourceA((lpuncservername?.value ?: 0L), (lpsourcename?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun registerEventSourceW(lpuncservername: Pcwstr, lpsourcename: Pcwstr): Handle =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_registerEventSourceW((lpuncservername?.value ?: 0L), (lpsourcename?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun reportEventA(heventlog: Handle, wtype: ReportEventType, wcategory: UShort, dweventid: UInt, lpusersid: Psid, wnumstrings: UShort, dwdatasize: UInt, lpstrings: COpaquePointer?, lprawdata: COpaquePointer?): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_reportEventA((heventlog?.value ?: 0L), wtype.toShort(), wcategory.toShort(), dweventid.toInt(), (lpusersid?.value ?: 0L), wnumstrings.toShort(), dwdatasize.toInt(), (lpstrings?.value ?: 0L), (lprawdata?.value ?: 0L))

public actual fun reportEventW(heventlog: Handle, wtype: ReportEventType, wcategory: UShort, dweventid: UInt, lpusersid: Psid, wnumstrings: UShort, dwdatasize: UInt, lpstrings: COpaquePointer?, lprawdata: COpaquePointer?): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssys_windows_win32_system_eventlog_reportEventW((heventlog?.value ?: 0L), wtype.toShort(), wcategory.toShort(), dweventid.toInt(), (lpusersid?.value ?: 0L), wnumstrings.toShort(), dwdatasize.toInt(), (lpstrings?.value ?: 0L), (lprawdata?.value ?: 0L))
