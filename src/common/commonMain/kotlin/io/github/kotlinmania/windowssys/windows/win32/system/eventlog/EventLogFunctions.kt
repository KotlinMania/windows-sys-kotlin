package io.github.kotlinmania.windowssys.windows.win32.system.eventlog

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.Psid

public expect fun backupEventLogA(heventlog: Handle, lpbackupfilename: Pcstr): Bool

public expect fun backupEventLogW(heventlog: Handle, lpbackupfilename: Pcwstr): Bool

public expect fun clearEventLogA(heventlog: Handle, lpbackupfilename: Pcstr): Bool

public expect fun clearEventLogW(heventlog: Handle, lpbackupfilename: Pcwstr): Bool

public expect fun closeEventLog(heventlog: Handle): Bool

public expect fun deregisterEventSource(heventlog: Handle): Bool

public expect fun evtArchiveExportedLog(session: EvtHandle, logfilepath: Pcwstr, locale: UInt, flags: UInt): Bool

public expect fun evtCancel(obj: EvtHandle): Bool

public expect fun evtClearLog(session: EvtHandle, channelpath: Pcwstr, targetfilepath: Pcwstr, flags: UInt): Bool

public expect fun evtClose(obj: EvtHandle): Bool

public expect fun evtCreateBookmark(bookmarkxml: Pcwstr): EvtHandle

public expect fun evtCreateRenderContext(valuepathscount: UInt, valuepaths: COpaquePointer?, flags: UInt): EvtHandle

public expect fun evtExportLog(session: EvtHandle, path: Pcwstr, query: Pcwstr, targetfilepath: Pcwstr, flags: UInt): Bool

public expect fun evtFormatMessage(publishermetadata: EvtHandle, event: EvtHandle, messageid: UInt, valuecount: UInt, values: COpaquePointer?, flags: UInt, buffersize: UInt, buffer: Pwstr, bufferused: COpaquePointer?): Bool

public expect fun evtGetChannelConfigProperty(channelconfig: EvtHandle, propertyid: EvtChannelConfigPropertyId, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: COpaquePointer?, propertyvaluebufferused: COpaquePointer?): Bool

public expect fun evtGetEventInfo(event: EvtHandle, propertyid: EvtEventPropertyId, propertyvaluebuffersize: UInt, propertyvaluebuffer: COpaquePointer?, propertyvaluebufferused: COpaquePointer?): Bool

public expect fun evtGetEventMetadataProperty(eventmetadata: EvtHandle, propertyid: EvtEventMetadataPropertyId, flags: UInt, eventmetadatapropertybuffersize: UInt, eventmetadatapropertybuffer: COpaquePointer?, eventmetadatapropertybufferused: COpaquePointer?): Bool

public expect fun evtGetExtendedStatus(buffersize: UInt, buffer: Pwstr, bufferused: COpaquePointer?): UInt

public expect fun evtGetLogInfo(log: EvtHandle, propertyid: EvtLogPropertyId, propertyvaluebuffersize: UInt, propertyvaluebuffer: COpaquePointer?, propertyvaluebufferused: COpaquePointer?): Bool

public expect fun evtGetObjectArrayProperty(objectarray: Long, propertyid: UInt, arrayindex: UInt, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: COpaquePointer?, propertyvaluebufferused: COpaquePointer?): Bool

public expect fun evtGetObjectArraySize(objectarray: Long, objectarraysize: COpaquePointer?): Bool

public expect fun evtGetPublisherMetadataProperty(publishermetadata: EvtHandle, propertyid: EvtPublisherMetadataPropertyId, flags: UInt, publishermetadatapropertybuffersize: UInt, publishermetadatapropertybuffer: COpaquePointer?, publishermetadatapropertybufferused: COpaquePointer?): Bool

public expect fun evtGetQueryInfo(queryorsubscription: EvtHandle, propertyid: EvtQueryPropertyId, propertyvaluebuffersize: UInt, propertyvaluebuffer: COpaquePointer?, propertyvaluebufferused: COpaquePointer?): Bool

public expect fun evtNext(resultset: EvtHandle, eventssize: UInt, events: COpaquePointer?, timeout: UInt, flags: UInt, returned: COpaquePointer?): Bool

public expect fun evtNextChannelPath(channelenum: EvtHandle, channelpathbuffersize: UInt, channelpathbuffer: Pwstr, channelpathbufferused: COpaquePointer?): Bool

public expect fun evtNextEventMetadata(eventmetadataenum: EvtHandle, flags: UInt): EvtHandle

public expect fun evtNextPublisherId(publisherenum: EvtHandle, publisheridbuffersize: UInt, publisheridbuffer: Pwstr, publisheridbufferused: COpaquePointer?): Bool

public expect fun evtOpenChannelConfig(session: EvtHandle, channelpath: Pcwstr, flags: UInt): EvtHandle

public expect fun evtOpenChannelEnum(session: EvtHandle, flags: UInt): EvtHandle

public expect fun evtOpenEventMetadataEnum(publishermetadata: EvtHandle, flags: UInt): EvtHandle

public expect fun evtOpenLog(session: EvtHandle, path: Pcwstr, flags: UInt): EvtHandle

public expect fun evtOpenPublisherEnum(session: EvtHandle, flags: UInt): EvtHandle

public expect fun evtOpenPublisherMetadata(session: EvtHandle, publisherid: Pcwstr, logfilepath: Pcwstr, locale: UInt, flags: UInt): EvtHandle

public expect fun evtOpenSession(loginclass: EvtLoginClass, login: COpaquePointer?, timeout: UInt, flags: UInt): EvtHandle

public expect fun evtQuery(session: EvtHandle, path: Pcwstr, query: Pcwstr, flags: UInt): EvtHandle

public expect fun evtRender(context: EvtHandle, fragment: EvtHandle, flags: UInt, buffersize: UInt, buffer: COpaquePointer?, bufferused: COpaquePointer?, propertycount: COpaquePointer?): Bool

public expect fun evtSaveChannelConfig(channelconfig: EvtHandle, flags: UInt): Bool

public expect fun evtSeek(resultset: EvtHandle, position: Long, bookmark: EvtHandle, timeout: UInt, flags: UInt): Bool

public expect fun evtSetChannelConfigProperty(channelconfig: EvtHandle, propertyid: EvtChannelConfigPropertyId, flags: UInt, propertyvalue: COpaquePointer?): Bool

public expect fun evtSubscribe(session: EvtHandle, signalevent: Handle, channelpath: Pcwstr, query: Pcwstr, bookmark: EvtHandle, context: COpaquePointer?, callback: EvtSubscribeCallback, flags: UInt): EvtHandle

public expect fun evtUpdateBookmark(bookmark: EvtHandle, event: EvtHandle): Bool

public expect fun getEventLogInformation(heventlog: Handle, dwinfolevel: UInt, lpbuffer: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?): Bool

public expect fun getNumberOfEventLogRecords(heventlog: Handle, numberofrecords: COpaquePointer?): Bool

public expect fun getOldestEventLogRecord(heventlog: Handle, oldestrecord: COpaquePointer?): Bool

public expect fun notifyChangeEventLog(heventlog: Handle, hevent: Handle): Bool

public expect fun openBackupEventLogA(lpuncservername: Pcstr, lpfilename: Pcstr): Handle

public expect fun openBackupEventLogW(lpuncservername: Pcwstr, lpfilename: Pcwstr): Handle

public expect fun openEventLogA(lpuncservername: Pcstr, lpsourcename: Pcstr): Handle

public expect fun openEventLogW(lpuncservername: Pcwstr, lpsourcename: Pcwstr): Handle

public expect fun readEventLogA(heventlog: Handle, dwreadflags: ReadEventLogReadFlags, dwrecordoffset: UInt, lpbuffer: COpaquePointer?, nnumberofbytestoread: UInt, pnbytesread: COpaquePointer?, pnminnumberofbytesneeded: COpaquePointer?): Bool

public expect fun readEventLogW(heventlog: Handle, dwreadflags: ReadEventLogReadFlags, dwrecordoffset: UInt, lpbuffer: COpaquePointer?, nnumberofbytestoread: UInt, pnbytesread: COpaquePointer?, pnminnumberofbytesneeded: COpaquePointer?): Bool

public expect fun registerEventSourceA(lpuncservername: Pcstr, lpsourcename: Pcstr): Handle

public expect fun registerEventSourceW(lpuncservername: Pcwstr, lpsourcename: Pcwstr): Handle

public expect fun reportEventA(heventlog: Handle, wtype: ReportEventType, wcategory: UShort, dweventid: UInt, lpusersid: Psid, wnumstrings: UShort, dwdatasize: UInt, lpstrings: COpaquePointer?, lprawdata: COpaquePointer?): Bool

public expect fun reportEventW(heventlog: Handle, wtype: ReportEventType, wcategory: UShort, dweventid: UInt, lpusersid: Psid, wnumstrings: UShort, dwdatasize: UInt, lpstrings: COpaquePointer?, lprawdata: COpaquePointer?): Bool
