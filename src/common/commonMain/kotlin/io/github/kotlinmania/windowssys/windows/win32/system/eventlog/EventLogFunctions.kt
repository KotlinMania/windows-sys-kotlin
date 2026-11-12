package io.github.kotlinmania.windowssys.windows.win32.system.eventlog

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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

public expect fun evtCreateRenderContext(valuepathscount: UInt, valuepaths: ConstPtr, flags: UInt): EvtHandle

public expect fun evtExportLog(session: EvtHandle, path: Pcwstr, query: Pcwstr, targetfilepath: Pcwstr, flags: UInt): Bool

public expect fun evtFormatMessage(publishermetadata: EvtHandle, event: EvtHandle, messageid: UInt, valuecount: UInt, values: ConstPtr, flags: UInt, buffersize: UInt, buffer: Pwstr, bufferused: MutPtr): Bool

public expect fun evtGetChannelConfigProperty(channelconfig: EvtHandle, propertyid: EvtChannelConfigPropertyId, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: MutPtr, propertyvaluebufferused: MutPtr): Bool

public expect fun evtGetEventInfo(event: EvtHandle, propertyid: EvtEventPropertyId, propertyvaluebuffersize: UInt, propertyvaluebuffer: MutPtr, propertyvaluebufferused: MutPtr): Bool

public expect fun evtGetEventMetadataProperty(eventmetadata: EvtHandle, propertyid: EvtEventMetadataPropertyId, flags: UInt, eventmetadatapropertybuffersize: UInt, eventmetadatapropertybuffer: MutPtr, eventmetadatapropertybufferused: MutPtr): Bool

public expect fun evtGetExtendedStatus(buffersize: UInt, buffer: Pwstr, bufferused: MutPtr): UInt

public expect fun evtGetLogInfo(log: EvtHandle, propertyid: EvtLogPropertyId, propertyvaluebuffersize: UInt, propertyvaluebuffer: MutPtr, propertyvaluebufferused: MutPtr): Bool

public expect fun evtGetObjectArrayProperty(objectarray: Long, propertyid: UInt, arrayindex: UInt, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: MutPtr, propertyvaluebufferused: MutPtr): Bool

public expect fun evtGetObjectArraySize(objectarray: Long, objectarraysize: MutPtr): Bool

public expect fun evtGetPublisherMetadataProperty(publishermetadata: EvtHandle, propertyid: EvtPublisherMetadataPropertyId, flags: UInt, publishermetadatapropertybuffersize: UInt, publishermetadatapropertybuffer: MutPtr, publishermetadatapropertybufferused: MutPtr): Bool

public expect fun evtGetQueryInfo(queryorsubscription: EvtHandle, propertyid: EvtQueryPropertyId, propertyvaluebuffersize: UInt, propertyvaluebuffer: MutPtr, propertyvaluebufferused: MutPtr): Bool

public expect fun evtNext(resultset: EvtHandle, eventssize: UInt, events: MutPtr, timeout: UInt, flags: UInt, returned: MutPtr): Bool

public expect fun evtNextChannelPath(channelenum: EvtHandle, channelpathbuffersize: UInt, channelpathbuffer: Pwstr, channelpathbufferused: MutPtr): Bool

public expect fun evtNextEventMetadata(eventmetadataenum: EvtHandle, flags: UInt): EvtHandle

public expect fun evtNextPublisherId(publisherenum: EvtHandle, publisheridbuffersize: UInt, publisheridbuffer: Pwstr, publisheridbufferused: MutPtr): Bool

public expect fun evtOpenChannelConfig(session: EvtHandle, channelpath: Pcwstr, flags: UInt): EvtHandle

public expect fun evtOpenChannelEnum(session: EvtHandle, flags: UInt): EvtHandle

public expect fun evtOpenEventMetadataEnum(publishermetadata: EvtHandle, flags: UInt): EvtHandle

public expect fun evtOpenLog(session: EvtHandle, path: Pcwstr, flags: UInt): EvtHandle

public expect fun evtOpenPublisherEnum(session: EvtHandle, flags: UInt): EvtHandle

public expect fun evtOpenPublisherMetadata(session: EvtHandle, publisherid: Pcwstr, logfilepath: Pcwstr, locale: UInt, flags: UInt): EvtHandle

public expect fun evtOpenSession(loginclass: EvtLoginClass, login: ConstPtr, timeout: UInt, flags: UInt): EvtHandle

public expect fun evtQuery(session: EvtHandle, path: Pcwstr, query: Pcwstr, flags: UInt): EvtHandle

public expect fun evtRender(context: EvtHandle, fragment: EvtHandle, flags: UInt, buffersize: UInt, buffer: MutPtr, bufferused: MutPtr, propertycount: MutPtr): Bool

public expect fun evtSaveChannelConfig(channelconfig: EvtHandle, flags: UInt): Bool

public expect fun evtSeek(resultset: EvtHandle, position: Long, bookmark: EvtHandle, timeout: UInt, flags: UInt): Bool

public expect fun evtSetChannelConfigProperty(channelconfig: EvtHandle, propertyid: EvtChannelConfigPropertyId, flags: UInt, propertyvalue: ConstPtr): Bool

public expect fun evtSubscribe(session: EvtHandle, signalevent: Handle, channelpath: Pcwstr, query: Pcwstr, bookmark: EvtHandle, context: ConstPtr, callback: EvtSubscribeCallback, flags: UInt): EvtHandle

public expect fun evtUpdateBookmark(bookmark: EvtHandle, event: EvtHandle): Bool

public expect fun getEventLogInformation(heventlog: Handle, dwinfolevel: UInt, lpbuffer: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr): Bool

public expect fun getNumberOfEventLogRecords(heventlog: Handle, numberofrecords: MutPtr): Bool

public expect fun getOldestEventLogRecord(heventlog: Handle, oldestrecord: MutPtr): Bool

public expect fun notifyChangeEventLog(heventlog: Handle, hevent: Handle): Bool

public expect fun openBackupEventLogA(lpuncservername: Pcstr, lpfilename: Pcstr): Handle

public expect fun openBackupEventLogW(lpuncservername: Pcwstr, lpfilename: Pcwstr): Handle

public expect fun openEventLogA(lpuncservername: Pcstr, lpsourcename: Pcstr): Handle

public expect fun openEventLogW(lpuncservername: Pcwstr, lpsourcename: Pcwstr): Handle

public expect fun readEventLogA(heventlog: Handle, dwreadflags: ReadEventLogReadFlags, dwrecordoffset: UInt, lpbuffer: MutPtr, nnumberofbytestoread: UInt, pnbytesread: MutPtr, pnminnumberofbytesneeded: MutPtr): Bool

public expect fun readEventLogW(heventlog: Handle, dwreadflags: ReadEventLogReadFlags, dwrecordoffset: UInt, lpbuffer: MutPtr, nnumberofbytestoread: UInt, pnbytesread: MutPtr, pnminnumberofbytesneeded: MutPtr): Bool

public expect fun registerEventSourceA(lpuncservername: Pcstr, lpsourcename: Pcstr): Handle

public expect fun registerEventSourceW(lpuncservername: Pcwstr, lpsourcename: Pcwstr): Handle

public expect fun reportEventA(heventlog: Handle, wtype: ReportEventType, wcategory: UShort, dweventid: UInt, lpusersid: Psid, wnumstrings: UShort, dwdatasize: UInt, lpstrings: ConstPtr, lprawdata: ConstPtr): Bool

public expect fun reportEventW(heventlog: Handle, wtype: ReportEventType, wcategory: UShort, dweventid: UInt, lpusersid: Psid, wnumstrings: UShort, dwdatasize: UInt, lpstrings: ConstPtr, lprawdata: ConstPtr): Bool
