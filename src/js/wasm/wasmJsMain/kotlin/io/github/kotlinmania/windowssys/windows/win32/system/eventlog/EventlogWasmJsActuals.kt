@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.eventlog

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.PSID

public actual fun BackupEventLogA(heventlog: HANDLE, lpbackupfilename: PCSTR): BOOL =
    0

public actual fun BackupEventLogW(heventlog: HANDLE, lpbackupfilename: PCWSTR): BOOL =
    0

public actual fun ClearEventLogA(heventlog: HANDLE, lpbackupfilename: PCSTR): BOOL =
    0

public actual fun ClearEventLogW(heventlog: HANDLE, lpbackupfilename: PCWSTR): BOOL =
    0

public actual fun CloseEventLog(heventlog: HANDLE): BOOL =
    0

public actual fun DeregisterEventSource(heventlog: HANDLE): BOOL =
    0

public actual fun EvtArchiveExportedLog(session: EVT_HANDLE, logfilepath: PCWSTR, locale: UInt, flags: UInt): BOOL =
    0

public actual fun EvtCancel(obj: EVT_HANDLE): BOOL =
    0

public actual fun EvtClearLog(session: EVT_HANDLE, channelpath: PCWSTR, targetfilepath: PCWSTR, flags: UInt): BOOL =
    0

public actual fun EvtClose(obj: EVT_HANDLE): BOOL =
    0

public actual fun EvtCreateBookmark(bookmarkxml: PCWSTR): EVT_HANDLE =
    0L

public actual fun EvtCreateRenderContext(valuepathscount: UInt, valuepaths: Long, flags: UInt): EVT_HANDLE =
    0L

public actual fun EvtExportLog(session: EVT_HANDLE, path: PCWSTR, query: PCWSTR, targetfilepath: PCWSTR, flags: UInt): BOOL =
    0

public actual fun EvtFormatMessage(publishermetadata: EVT_HANDLE, event: EVT_HANDLE, messageid: UInt, valuecount: UInt, values: Long, flags: UInt, buffersize: UInt, buffer: PWSTR, bufferused: Long): BOOL =
    0

public actual fun EvtGetChannelConfigProperty(channelconfig: EVT_HANDLE, propertyid: EVT_CHANNEL_CONFIG_PROPERTY_ID, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: Long, propertyvaluebufferused: Long): BOOL =
    0

public actual fun EvtGetEventInfo(event: EVT_HANDLE, propertyid: EVT_EVENT_PROPERTY_ID, propertyvaluebuffersize: UInt, propertyvaluebuffer: Long, propertyvaluebufferused: Long): BOOL =
    0

public actual fun EvtGetEventMetadataProperty(eventmetadata: EVT_HANDLE, propertyid: EVT_EVENT_METADATA_PROPERTY_ID, flags: UInt, eventmetadatapropertybuffersize: UInt, eventmetadatapropertybuffer: Long, eventmetadatapropertybufferused: Long): BOOL =
    0

public actual fun EvtGetExtendedStatus(buffersize: UInt, buffer: PWSTR, bufferused: Long): UInt =
    0u

public actual fun EvtGetLogInfo(log: EVT_HANDLE, propertyid: EVT_LOG_PROPERTY_ID, propertyvaluebuffersize: UInt, propertyvaluebuffer: Long, propertyvaluebufferused: Long): BOOL =
    0

public actual fun EvtGetObjectArrayProperty(objectarray: Long, propertyid: UInt, arrayindex: UInt, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: Long, propertyvaluebufferused: Long): BOOL =
    0

public actual fun EvtGetObjectArraySize(objectarray: Long, objectarraysize: Long): BOOL =
    0

public actual fun EvtGetPublisherMetadataProperty(publishermetadata: EVT_HANDLE, propertyid: EVT_PUBLISHER_METADATA_PROPERTY_ID, flags: UInt, publishermetadatapropertybuffersize: UInt, publishermetadatapropertybuffer: Long, publishermetadatapropertybufferused: Long): BOOL =
    0

public actual fun EvtGetQueryInfo(queryorsubscription: EVT_HANDLE, propertyid: EVT_QUERY_PROPERTY_ID, propertyvaluebuffersize: UInt, propertyvaluebuffer: Long, propertyvaluebufferused: Long): BOOL =
    0

public actual fun EvtNext(resultset: EVT_HANDLE, eventssize: UInt, events: Long, timeout: UInt, flags: UInt, returned: Long): BOOL =
    0

public actual fun EvtNextChannelPath(channelenum: EVT_HANDLE, channelpathbuffersize: UInt, channelpathbuffer: PWSTR, channelpathbufferused: Long): BOOL =
    0

public actual fun EvtNextEventMetadata(eventmetadataenum: EVT_HANDLE, flags: UInt): EVT_HANDLE =
    0L

public actual fun EvtNextPublisherId(publisherenum: EVT_HANDLE, publisheridbuffersize: UInt, publisheridbuffer: PWSTR, publisheridbufferused: Long): BOOL =
    0

public actual fun EvtOpenChannelConfig(session: EVT_HANDLE, channelpath: PCWSTR, flags: UInt): EVT_HANDLE =
    0L

public actual fun EvtOpenChannelEnum(session: EVT_HANDLE, flags: UInt): EVT_HANDLE =
    0L

public actual fun EvtOpenEventMetadataEnum(publishermetadata: EVT_HANDLE, flags: UInt): EVT_HANDLE =
    0L

public actual fun EvtOpenLog(session: EVT_HANDLE, path: PCWSTR, flags: UInt): EVT_HANDLE =
    0L

public actual fun EvtOpenPublisherEnum(session: EVT_HANDLE, flags: UInt): EVT_HANDLE =
    0L

public actual fun EvtOpenPublisherMetadata(session: EVT_HANDLE, publisherid: PCWSTR, logfilepath: PCWSTR, locale: UInt, flags: UInt): EVT_HANDLE =
    0L

public actual fun EvtOpenSession(loginclass: EVT_LOGIN_CLASS, login: Long, timeout: UInt, flags: UInt): EVT_HANDLE =
    0L

public actual fun EvtQuery(session: EVT_HANDLE, path: PCWSTR, query: PCWSTR, flags: UInt): EVT_HANDLE =
    0L

public actual fun EvtRender(context: EVT_HANDLE, fragment: EVT_HANDLE, flags: UInt, buffersize: UInt, buffer: Long, bufferused: Long, propertycount: Long): BOOL =
    0

public actual fun EvtSaveChannelConfig(channelconfig: EVT_HANDLE, flags: UInt): BOOL =
    0

public actual fun EvtSeek(resultset: EVT_HANDLE, position: Long, bookmark: EVT_HANDLE, timeout: UInt, flags: UInt): BOOL =
    0

public actual fun EvtSetChannelConfigProperty(channelconfig: EVT_HANDLE, propertyid: EVT_CHANNEL_CONFIG_PROPERTY_ID, flags: UInt, propertyvalue: Long): BOOL =
    0

public actual fun EvtSubscribe(session: EVT_HANDLE, signalevent: HANDLE, channelpath: PCWSTR, query: PCWSTR, bookmark: EVT_HANDLE, context: Long, callback: EVT_SUBSCRIBE_CALLBACK, flags: UInt): EVT_HANDLE =
    0L

public actual fun EvtUpdateBookmark(bookmark: EVT_HANDLE, event: EVT_HANDLE): BOOL =
    0

public actual fun GetEventLogInformation(heventlog: HANDLE, dwinfolevel: UInt, lpbuffer: Long, cbbufsize: UInt, pcbbytesneeded: Long): BOOL =
    0

public actual fun GetNumberOfEventLogRecords(heventlog: HANDLE, numberofrecords: Long): BOOL =
    0

public actual fun GetOldestEventLogRecord(heventlog: HANDLE, oldestrecord: Long): BOOL =
    0

public actual fun NotifyChangeEventLog(heventlog: HANDLE, hevent: HANDLE): BOOL =
    0

public actual fun OpenBackupEventLogA(lpuncservername: PCSTR, lpfilename: PCSTR): HANDLE =
    0L

public actual fun OpenBackupEventLogW(lpuncservername: PCWSTR, lpfilename: PCWSTR): HANDLE =
    0L

public actual fun OpenEventLogA(lpuncservername: PCSTR, lpsourcename: PCSTR): HANDLE =
    0L

public actual fun OpenEventLogW(lpuncservername: PCWSTR, lpsourcename: PCWSTR): HANDLE =
    0L

public actual fun ReadEventLogA(heventlog: HANDLE, dwreadflags: READ_EVENT_LOG_READ_FLAGS, dwrecordoffset: UInt, lpbuffer: Long, nnumberofbytestoread: UInt, pnbytesread: Long, pnminnumberofbytesneeded: Long): BOOL =
    0

public actual fun ReadEventLogW(heventlog: HANDLE, dwreadflags: READ_EVENT_LOG_READ_FLAGS, dwrecordoffset: UInt, lpbuffer: Long, nnumberofbytestoread: UInt, pnbytesread: Long, pnminnumberofbytesneeded: Long): BOOL =
    0

public actual fun RegisterEventSourceA(lpuncservername: PCSTR, lpsourcename: PCSTR): HANDLE =
    0L

public actual fun RegisterEventSourceW(lpuncservername: PCWSTR, lpsourcename: PCWSTR): HANDLE =
    0L

public actual fun ReportEventA(heventlog: HANDLE, wtype: REPORT_EVENT_TYPE, wcategory: UShort, dweventid: UInt, lpusersid: PSID, wnumstrings: UShort, dwdatasize: UInt, lpstrings: Long, lprawdata: Long): BOOL =
    0

public actual fun ReportEventW(heventlog: HANDLE, wtype: REPORT_EVENT_TYPE, wcategory: UShort, dweventid: UInt, lpusersid: PSID, wnumstrings: UShort, dwdatasize: UInt, lpstrings: Long, lprawdata: Long): BOOL =
    0
