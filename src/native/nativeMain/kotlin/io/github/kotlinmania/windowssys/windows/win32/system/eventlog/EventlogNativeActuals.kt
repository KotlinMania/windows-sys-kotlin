@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.eventlog

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun backupEventLogA(heventlog: Handle, lpbackupfilename: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_backupEventLogA(heventlog?.value?.toCPointer<ByteVar>(), lpbackupfilename?.value?.toCPointer<ByteVar>())

public actual fun backupEventLogW(heventlog: Handle, lpbackupfilename: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_backupEventLogW(heventlog?.value?.toCPointer<ByteVar>(), lpbackupfilename?.value?.toCPointer<ByteVar>())

public actual fun clearEventLogA(heventlog: Handle, lpbackupfilename: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_clearEventLogA(heventlog?.value?.toCPointer<ByteVar>(), lpbackupfilename?.value?.toCPointer<ByteVar>())

public actual fun clearEventLogW(heventlog: Handle, lpbackupfilename: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_clearEventLogW(heventlog?.value?.toCPointer<ByteVar>(), lpbackupfilename?.value?.toCPointer<ByteVar>())

public actual fun closeEventLog(heventlog: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_closeEventLog(heventlog?.value?.toCPointer<ByteVar>())

public actual fun deregisterEventSource(heventlog: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_deregisterEventSource(heventlog?.value?.toCPointer<ByteVar>())

public actual fun evtArchiveExportedLog(session: EvtHandle, logfilepath: Pcwstr, locale: UInt, flags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_evtArchiveExportedLog(session, logfilepath?.value?.toCPointer<ByteVar>(), locale, flags)

public actual fun evtCancel(obj: EvtHandle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_evtCancel(obj)

public actual fun evtClearLog(session: EvtHandle, channelpath: Pcwstr, targetfilepath: Pcwstr, flags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_evtClearLog(session, channelpath?.value?.toCPointer<ByteVar>(), targetfilepath?.value?.toCPointer<ByteVar>(), flags)

public actual fun evtClose(obj: EvtHandle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_evtClose(obj)

public actual fun evtCreateBookmark(bookmarkxml: Pcwstr): EvtHandle =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_evtCreateBookmark(bookmarkxml?.value?.toCPointer<ByteVar>())

public actual fun evtCreateRenderContext(valuepathscount: UInt, valuepaths: COpaquePointer?, flags: UInt): EvtHandle =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_evtCreateRenderContext(valuepathscount, valuepaths?.value?.toCPointer<ByteVar>(), flags)

public actual fun evtExportLog(session: EvtHandle, path: Pcwstr, query: Pcwstr, targetfilepath: Pcwstr, flags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_evtExportLog(session, path?.value?.toCPointer<ByteVar>(), query?.value?.toCPointer<ByteVar>(), targetfilepath?.value?.toCPointer<ByteVar>(), flags)

public actual fun evtFormatMessage(publishermetadata: EvtHandle, event: EvtHandle, messageid: UInt, valuecount: UInt, values: COpaquePointer?, flags: UInt, buffersize: UInt, buffer: Pwstr, bufferused: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_evtFormatMessage(publishermetadata, event, messageid, valuecount, values?.value?.toCPointer<ByteVar>(), flags, buffersize, buffer?.value?.toCPointer<ByteVar>(), bufferused?.value?.toCPointer<ByteVar>())

public actual fun evtGetChannelConfigProperty(channelconfig: EvtHandle, propertyid: EvtChannelConfigPropertyId, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: COpaquePointer?, propertyvaluebufferused: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_evtGetChannelConfigProperty(channelconfig, propertyid, flags, propertyvaluebuffersize, propertyvaluebuffer?.value?.toCPointer<ByteVar>(), propertyvaluebufferused?.value?.toCPointer<ByteVar>())

public actual fun evtGetEventInfo(event: EvtHandle, propertyid: EvtEventPropertyId, propertyvaluebuffersize: UInt, propertyvaluebuffer: COpaquePointer?, propertyvaluebufferused: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_evtGetEventInfo(event, propertyid, propertyvaluebuffersize, propertyvaluebuffer?.value?.toCPointer<ByteVar>(), propertyvaluebufferused?.value?.toCPointer<ByteVar>())

public actual fun evtGetEventMetadataProperty(eventmetadata: EvtHandle, propertyid: EvtEventMetadataPropertyId, flags: UInt, eventmetadatapropertybuffersize: UInt, eventmetadatapropertybuffer: COpaquePointer?, eventmetadatapropertybufferused: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_evtGetEventMetadataProperty(eventmetadata, propertyid, flags, eventmetadatapropertybuffersize, eventmetadatapropertybuffer?.value?.toCPointer<ByteVar>(), eventmetadatapropertybufferused?.value?.toCPointer<ByteVar>())

public actual fun evtGetExtendedStatus(buffersize: UInt, buffer: Pwstr, bufferused: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_evtGetExtendedStatus(buffersize, buffer?.value?.toCPointer<ByteVar>(), bufferused?.value?.toCPointer<ByteVar>())

public actual fun evtGetLogInfo(log: EvtHandle, propertyid: EvtLogPropertyId, propertyvaluebuffersize: UInt, propertyvaluebuffer: COpaquePointer?, propertyvaluebufferused: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_evtGetLogInfo(log, propertyid, propertyvaluebuffersize, propertyvaluebuffer?.value?.toCPointer<ByteVar>(), propertyvaluebufferused?.value?.toCPointer<ByteVar>())

public actual fun evtGetObjectArrayProperty(objectarray: Long, propertyid: UInt, arrayindex: UInt, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: COpaquePointer?, propertyvaluebufferused: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_evtGetObjectArrayProperty(objectarray, propertyid, arrayindex, flags, propertyvaluebuffersize, propertyvaluebuffer?.value?.toCPointer<ByteVar>(), propertyvaluebufferused?.value?.toCPointer<ByteVar>())

public actual fun evtGetObjectArraySize(objectarray: Long, objectarraysize: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_evtGetObjectArraySize(objectarray, objectarraysize?.value?.toCPointer<ByteVar>())

public actual fun evtGetPublisherMetadataProperty(publishermetadata: EvtHandle, propertyid: EvtPublisherMetadataPropertyId, flags: UInt, publishermetadatapropertybuffersize: UInt, publishermetadatapropertybuffer: COpaquePointer?, publishermetadatapropertybufferused: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_evtGetPublisherMetadataProperty(publishermetadata, propertyid, flags, publishermetadatapropertybuffersize, publishermetadatapropertybuffer?.value?.toCPointer<ByteVar>(), publishermetadatapropertybufferused?.value?.toCPointer<ByteVar>())

public actual fun evtGetQueryInfo(queryorsubscription: EvtHandle, propertyid: EvtQueryPropertyId, propertyvaluebuffersize: UInt, propertyvaluebuffer: COpaquePointer?, propertyvaluebufferused: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_evtGetQueryInfo(queryorsubscription, propertyid, propertyvaluebuffersize, propertyvaluebuffer?.value?.toCPointer<ByteVar>(), propertyvaluebufferused?.value?.toCPointer<ByteVar>())

public actual fun evtNext(resultset: EvtHandle, eventssize: UInt, events: COpaquePointer?, timeout: UInt, flags: UInt, returned: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_evtNext(resultset, eventssize, events?.value?.toCPointer<ByteVar>(), timeout, flags, returned?.value?.toCPointer<ByteVar>())

public actual fun evtNextChannelPath(channelenum: EvtHandle, channelpathbuffersize: UInt, channelpathbuffer: Pwstr, channelpathbufferused: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_evtNextChannelPath(channelenum, channelpathbuffersize, channelpathbuffer?.value?.toCPointer<ByteVar>(), channelpathbufferused?.value?.toCPointer<ByteVar>())

public actual fun evtNextEventMetadata(eventmetadataenum: EvtHandle, flags: UInt): EvtHandle =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_evtNextEventMetadata(eventmetadataenum, flags)

public actual fun evtNextPublisherId(publisherenum: EvtHandle, publisheridbuffersize: UInt, publisheridbuffer: Pwstr, publisheridbufferused: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_evtNextPublisherId(publisherenum, publisheridbuffersize, publisheridbuffer?.value?.toCPointer<ByteVar>(), publisheridbufferused?.value?.toCPointer<ByteVar>())

public actual fun evtOpenChannelConfig(session: EvtHandle, channelpath: Pcwstr, flags: UInt): EvtHandle =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_evtOpenChannelConfig(session, channelpath?.value?.toCPointer<ByteVar>(), flags)

public actual fun evtOpenChannelEnum(session: EvtHandle, flags: UInt): EvtHandle =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_evtOpenChannelEnum(session, flags)

public actual fun evtOpenEventMetadataEnum(publishermetadata: EvtHandle, flags: UInt): EvtHandle =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_evtOpenEventMetadataEnum(publishermetadata, flags)

public actual fun evtOpenLog(session: EvtHandle, path: Pcwstr, flags: UInt): EvtHandle =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_evtOpenLog(session, path?.value?.toCPointer<ByteVar>(), flags)

public actual fun evtOpenPublisherEnum(session: EvtHandle, flags: UInt): EvtHandle =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_evtOpenPublisherEnum(session, flags)

public actual fun evtOpenPublisherMetadata(session: EvtHandle, publisherid: Pcwstr, logfilepath: Pcwstr, locale: UInt, flags: UInt): EvtHandle =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_evtOpenPublisherMetadata(session, publisherid?.value?.toCPointer<ByteVar>(), logfilepath?.value?.toCPointer<ByteVar>(), locale, flags)

public actual fun evtOpenSession(loginclass: EvtLoginClass, login: COpaquePointer?, timeout: UInt, flags: UInt): EvtHandle =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_evtOpenSession(loginclass, login?.value?.toCPointer<ByteVar>(), timeout, flags)

public actual fun evtQuery(session: EvtHandle, path: Pcwstr, query: Pcwstr, flags: UInt): EvtHandle =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_evtQuery(session, path?.value?.toCPointer<ByteVar>(), query?.value?.toCPointer<ByteVar>(), flags)

public actual fun evtRender(context: EvtHandle, fragment: EvtHandle, flags: UInt, buffersize: UInt, buffer: COpaquePointer?, bufferused: COpaquePointer?, propertycount: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_evtRender(context, fragment, flags, buffersize, buffer?.value?.toCPointer<ByteVar>(), bufferused?.value?.toCPointer<ByteVar>(), propertycount?.value?.toCPointer<ByteVar>())

public actual fun evtSaveChannelConfig(channelconfig: EvtHandle, flags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_evtSaveChannelConfig(channelconfig, flags)

public actual fun evtSeek(resultset: EvtHandle, position: Long, bookmark: EvtHandle, timeout: UInt, flags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_evtSeek(resultset, position, bookmark, timeout, flags)

public actual fun evtSetChannelConfigProperty(channelconfig: EvtHandle, propertyid: EvtChannelConfigPropertyId, flags: UInt, propertyvalue: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_evtSetChannelConfigProperty(channelconfig, propertyid, flags, propertyvalue?.value?.toCPointer<ByteVar>())

public actual fun evtSubscribe(session: EvtHandle, signalevent: Handle, channelpath: Pcwstr, query: Pcwstr, bookmark: EvtHandle, context: COpaquePointer?, callback: EvtSubscribeCallback, flags: UInt): EvtHandle =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_evtSubscribe(session, signalevent?.value?.toCPointer<ByteVar>(), channelpath?.value?.toCPointer<ByteVar>(), query?.value?.toCPointer<ByteVar>(), bookmark, context?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), flags)

public actual fun evtUpdateBookmark(bookmark: EvtHandle, event: EvtHandle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_evtUpdateBookmark(bookmark, event)

public actual fun getEventLogInformation(heventlog: Handle, dwinfolevel: UInt, lpbuffer: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_getEventLogInformation(heventlog?.value?.toCPointer<ByteVar>(), dwinfolevel, lpbuffer?.value?.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded?.value?.toCPointer<ByteVar>())

public actual fun getNumberOfEventLogRecords(heventlog: Handle, numberofrecords: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_getNumberOfEventLogRecords(heventlog?.value?.toCPointer<ByteVar>(), numberofrecords?.value?.toCPointer<ByteVar>())

public actual fun getOldestEventLogRecord(heventlog: Handle, oldestrecord: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_getOldestEventLogRecord(heventlog?.value?.toCPointer<ByteVar>(), oldestrecord?.value?.toCPointer<ByteVar>())

public actual fun notifyChangeEventLog(heventlog: Handle, hevent: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_notifyChangeEventLog(heventlog?.value?.toCPointer<ByteVar>(), hevent?.value?.toCPointer<ByteVar>())

public actual fun openBackupEventLogA(lpuncservername: Pcstr, lpfilename: Pcstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_openBackupEventLogA(lpuncservername?.value?.toCPointer<ByteVar>(), lpfilename?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun openBackupEventLogW(lpuncservername: Pcwstr, lpfilename: Pcwstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_openBackupEventLogW(lpuncservername?.value?.toCPointer<ByteVar>(), lpfilename?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun openEventLogA(lpuncservername: Pcstr, lpsourcename: Pcstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_openEventLogA(lpuncservername?.value?.toCPointer<ByteVar>(), lpsourcename?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun openEventLogW(lpuncservername: Pcwstr, lpsourcename: Pcwstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_openEventLogW(lpuncservername?.value?.toCPointer<ByteVar>(), lpsourcename?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun readEventLogA(heventlog: Handle, dwreadflags: ReadEventLogReadFlags, dwrecordoffset: UInt, lpbuffer: COpaquePointer?, nnumberofbytestoread: UInt, pnbytesread: COpaquePointer?, pnminnumberofbytesneeded: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_readEventLogA(heventlog?.value?.toCPointer<ByteVar>(), dwreadflags, dwrecordoffset, lpbuffer?.value?.toCPointer<ByteVar>(), nnumberofbytestoread, pnbytesread?.value?.toCPointer<ByteVar>(), pnminnumberofbytesneeded?.value?.toCPointer<ByteVar>())

public actual fun readEventLogW(heventlog: Handle, dwreadflags: ReadEventLogReadFlags, dwrecordoffset: UInt, lpbuffer: COpaquePointer?, nnumberofbytestoread: UInt, pnbytesread: COpaquePointer?, pnminnumberofbytesneeded: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_readEventLogW(heventlog?.value?.toCPointer<ByteVar>(), dwreadflags, dwrecordoffset, lpbuffer?.value?.toCPointer<ByteVar>(), nnumberofbytestoread, pnbytesread?.value?.toCPointer<ByteVar>(), pnminnumberofbytesneeded?.value?.toCPointer<ByteVar>())

public actual fun registerEventSourceA(lpuncservername: Pcstr, lpsourcename: Pcstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_registerEventSourceA(lpuncservername?.value?.toCPointer<ByteVar>(), lpsourcename?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun registerEventSourceW(lpuncservername: Pcwstr, lpsourcename: Pcwstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_registerEventSourceW(lpuncservername?.value?.toCPointer<ByteVar>(), lpsourcename?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun reportEventA(heventlog: Handle, wtype: ReportEventType, wcategory: UShort, dweventid: UInt, lpusersid: Psid, wnumstrings: UShort, dwdatasize: UInt, lpstrings: COpaquePointer?, lprawdata: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_reportEventA(heventlog?.value?.toCPointer<ByteVar>(), wtype, wcategory, dweventid, lpusersid?.value?.toCPointer<ByteVar>(), wnumstrings, dwdatasize, lpstrings?.value?.toCPointer<ByteVar>(), lprawdata?.value?.toCPointer<ByteVar>())

public actual fun reportEventW(heventlog: Handle, wtype: ReportEventType, wcategory: UShort, dweventid: UInt, lpusersid: Psid, wnumstrings: UShort, dwdatasize: UInt, lpstrings: COpaquePointer?, lprawdata: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssys_windows_win32_system_eventlog_reportEventW(heventlog?.value?.toCPointer<ByteVar>(), wtype, wcategory, dweventid, lpusersid?.value?.toCPointer<ByteVar>(), wnumstrings, dwdatasize, lpstrings?.value?.toCPointer<ByteVar>(), lprawdata?.value?.toCPointer<ByteVar>())
