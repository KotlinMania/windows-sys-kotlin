@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogBackupEventLogA
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogBackupEventLogW
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogClearEventLogA
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogClearEventLogW
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogCloseEventLog
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogDeregisterEventSource
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogEvtArchiveExportedLog
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogEvtCancel
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogEvtClearLog
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogEvtClose
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogEvtCreateBookmark
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogEvtCreateRenderContext
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogEvtExportLog
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogEvtFormatMessage
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogEvtGetChannelConfigProperty
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogEvtGetEventInfo
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogEvtGetEventMetadataProperty
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogEvtGetExtendedStatus
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogEvtGetLogInfo
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogEvtGetObjectArrayProperty
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogEvtGetObjectArraySize
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogEvtGetPublisherMetadataProperty
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogEvtGetQueryInfo
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogEvtNext
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogEvtNextChannelPath
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogEvtNextEventMetadata
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogEvtNextPublisherId
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogEvtOpenChannelConfig
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogEvtOpenChannelEnum
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogEvtOpenEventMetadataEnum
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogEvtOpenLog
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogEvtOpenPublisherEnum
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogEvtOpenPublisherMetadata
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogEvtOpenSession
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogEvtQuery
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogEvtRender
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogEvtSaveChannelConfig
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogEvtSeek
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogEvtSetChannelConfigProperty
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogEvtSubscribe
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogEvtUpdateBookmark
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogGetEventLogInformation
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogGetNumberOfEventLogRecords
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogGetOldestEventLogRecord
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogNotifyChangeEventLog
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogOpenBackupEventLogA
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogOpenBackupEventLogW
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogOpenEventLogA
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogOpenEventLogW
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogReadEventLogA
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogReadEventLogW
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogRegisterEventSourceA
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogRegisterEventSourceW
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogReportEventA
import io.github.kotlinmania.windowssys.windows.win32.system.eventlog.cinterop.windowssysWindowsWin32SystemEventlogReportEventW
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun backupEventLogA(heventlog: Handle, lpbackupfilename: Pcstr): Bool =
    windowssysWindowsWin32SystemEventlogBackupEventLogA(heventlog.rawAddress.toCPointer<ByteVar>(), lpbackupfilename.rawAddress.toCPointer<ByteVar>())

public actual fun backupEventLogW(heventlog: Handle, lpbackupfilename: Pcwstr): Bool =
    windowssysWindowsWin32SystemEventlogBackupEventLogW(heventlog.rawAddress.toCPointer<ByteVar>(), lpbackupfilename.rawAddress.toCPointer<ByteVar>())

public actual fun clearEventLogA(heventlog: Handle, lpbackupfilename: Pcstr): Bool =
    windowssysWindowsWin32SystemEventlogClearEventLogA(heventlog.rawAddress.toCPointer<ByteVar>(), lpbackupfilename.rawAddress.toCPointer<ByteVar>())

public actual fun clearEventLogW(heventlog: Handle, lpbackupfilename: Pcwstr): Bool =
    windowssysWindowsWin32SystemEventlogClearEventLogW(heventlog.rawAddress.toCPointer<ByteVar>(), lpbackupfilename.rawAddress.toCPointer<ByteVar>())

public actual fun closeEventLog(heventlog: Handle): Bool =
    windowssysWindowsWin32SystemEventlogCloseEventLog(heventlog.rawAddress.toCPointer<ByteVar>())

public actual fun deregisterEventSource(heventlog: Handle): Bool =
    windowssysWindowsWin32SystemEventlogDeregisterEventSource(heventlog.rawAddress.toCPointer<ByteVar>())

public actual fun evtArchiveExportedLog(session: EvtHandle, logfilepath: Pcwstr, locale: UInt, flags: UInt): Bool =
    windowssysWindowsWin32SystemEventlogEvtArchiveExportedLog(session, logfilepath.rawAddress.toCPointer<ByteVar>(), locale, flags)

public actual fun evtCancel(obj: EvtHandle): Bool =
    windowssysWindowsWin32SystemEventlogEvtCancel(obj)

public actual fun evtClearLog(session: EvtHandle, channelpath: Pcwstr, targetfilepath: Pcwstr, flags: UInt): Bool =
    windowssysWindowsWin32SystemEventlogEvtClearLog(session, channelpath.rawAddress.toCPointer<ByteVar>(), targetfilepath.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun evtClose(obj: EvtHandle): Bool =
    windowssysWindowsWin32SystemEventlogEvtClose(obj)

public actual fun evtCreateBookmark(bookmarkxml: Pcwstr): EvtHandle =
    windowssysWindowsWin32SystemEventlogEvtCreateBookmark(bookmarkxml.rawAddress.toCPointer<ByteVar>())

public actual fun evtCreateRenderContext(valuepathscount: UInt, valuepaths: ConstPtr<Pcwstr>, flags: UInt): EvtHandle =
    windowssysWindowsWin32SystemEventlogEvtCreateRenderContext(valuepathscount, valuepaths.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun evtExportLog(session: EvtHandle, path: Pcwstr, query: Pcwstr, targetfilepath: Pcwstr, flags: UInt): Bool =
    windowssysWindowsWin32SystemEventlogEvtExportLog(session, path.rawAddress.toCPointer<ByteVar>(), query.rawAddress.toCPointer<ByteVar>(), targetfilepath.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun evtFormatMessage(publishermetadata: EvtHandle, event: EvtHandle, messageid: UInt, valuecount: UInt, values: ConstPtr<EvtVariant>, flags: UInt, buffersize: UInt, buffer: Pwstr, bufferused: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemEventlogEvtFormatMessage(publishermetadata, event, messageid, valuecount, values.rawAddress.toCPointer<ByteVar>(), flags, buffersize, buffer.rawAddress.toCPointer<ByteVar>(), bufferused.rawAddress.toCPointer<ByteVar>())

public actual fun evtGetChannelConfigProperty(channelconfig: EvtHandle, propertyid: EvtChannelConfigPropertyId, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: MutPtr<EvtVariant>, propertyvaluebufferused: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemEventlogEvtGetChannelConfigProperty(channelconfig, propertyid, flags, propertyvaluebuffersize, propertyvaluebuffer.rawAddress.toCPointer<ByteVar>(), propertyvaluebufferused.rawAddress.toCPointer<ByteVar>())

public actual fun evtGetEventInfo(event: EvtHandle, propertyid: EvtEventPropertyId, propertyvaluebuffersize: UInt, propertyvaluebuffer: MutPtr<EvtVariant>, propertyvaluebufferused: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemEventlogEvtGetEventInfo(event, propertyid, propertyvaluebuffersize, propertyvaluebuffer.rawAddress.toCPointer<ByteVar>(), propertyvaluebufferused.rawAddress.toCPointer<ByteVar>())

public actual fun evtGetEventMetadataProperty(eventmetadata: EvtHandle, propertyid: EvtEventMetadataPropertyId, flags: UInt, eventmetadatapropertybuffersize: UInt, eventmetadatapropertybuffer: MutPtr<EvtVariant>, eventmetadatapropertybufferused: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemEventlogEvtGetEventMetadataProperty(eventmetadata, propertyid, flags, eventmetadatapropertybuffersize, eventmetadatapropertybuffer.rawAddress.toCPointer<ByteVar>(), eventmetadatapropertybufferused.rawAddress.toCPointer<ByteVar>())

public actual fun evtGetExtendedStatus(buffersize: UInt, buffer: Pwstr, bufferused: MutPtr<UInt>): UInt =
    windowssysWindowsWin32SystemEventlogEvtGetExtendedStatus(buffersize, buffer.rawAddress.toCPointer<ByteVar>(), bufferused.rawAddress.toCPointer<ByteVar>())

public actual fun evtGetLogInfo(log: EvtHandle, propertyid: EvtLogPropertyId, propertyvaluebuffersize: UInt, propertyvaluebuffer: MutPtr<EvtVariant>, propertyvaluebufferused: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemEventlogEvtGetLogInfo(log, propertyid, propertyvaluebuffersize, propertyvaluebuffer.rawAddress.toCPointer<ByteVar>(), propertyvaluebufferused.rawAddress.toCPointer<ByteVar>())

public actual fun evtGetObjectArrayProperty(objectarray: Long, propertyid: UInt, arrayindex: UInt, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: MutPtr<EvtVariant>, propertyvaluebufferused: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemEventlogEvtGetObjectArrayProperty(objectarray, propertyid, arrayindex, flags, propertyvaluebuffersize, propertyvaluebuffer.rawAddress.toCPointer<ByteVar>(), propertyvaluebufferused.rawAddress.toCPointer<ByteVar>())

public actual fun evtGetObjectArraySize(objectarray: Long, objectarraysize: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemEventlogEvtGetObjectArraySize(objectarray, objectarraysize.rawAddress.toCPointer<ByteVar>())

public actual fun evtGetPublisherMetadataProperty(publishermetadata: EvtHandle, propertyid: EvtPublisherMetadataPropertyId, flags: UInt, publishermetadatapropertybuffersize: UInt, publishermetadatapropertybuffer: MutPtr<EvtVariant>, publishermetadatapropertybufferused: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemEventlogEvtGetPublisherMetadataProperty(publishermetadata, propertyid, flags, publishermetadatapropertybuffersize, publishermetadatapropertybuffer.rawAddress.toCPointer<ByteVar>(), publishermetadatapropertybufferused.rawAddress.toCPointer<ByteVar>())

public actual fun evtGetQueryInfo(queryorsubscription: EvtHandle, propertyid: EvtQueryPropertyId, propertyvaluebuffersize: UInt, propertyvaluebuffer: MutPtr<EvtVariant>, propertyvaluebufferused: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemEventlogEvtGetQueryInfo(queryorsubscription, propertyid, propertyvaluebuffersize, propertyvaluebuffer.rawAddress.toCPointer<ByteVar>(), propertyvaluebufferused.rawAddress.toCPointer<ByteVar>())

public actual fun evtNext(resultset: EvtHandle, eventssize: UInt, events: MutPtr<Long>, timeout: UInt, flags: UInt, returned: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemEventlogEvtNext(resultset, eventssize, events.rawAddress.toCPointer<ByteVar>(), timeout, flags, returned.rawAddress.toCPointer<ByteVar>())

public actual fun evtNextChannelPath(channelenum: EvtHandle, channelpathbuffersize: UInt, channelpathbuffer: Pwstr, channelpathbufferused: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemEventlogEvtNextChannelPath(channelenum, channelpathbuffersize, channelpathbuffer.rawAddress.toCPointer<ByteVar>(), channelpathbufferused.rawAddress.toCPointer<ByteVar>())

public actual fun evtNextEventMetadata(eventmetadataenum: EvtHandle, flags: UInt): EvtHandle =
    windowssysWindowsWin32SystemEventlogEvtNextEventMetadata(eventmetadataenum, flags)

public actual fun evtNextPublisherId(publisherenum: EvtHandle, publisheridbuffersize: UInt, publisheridbuffer: Pwstr, publisheridbufferused: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemEventlogEvtNextPublisherId(publisherenum, publisheridbuffersize, publisheridbuffer.rawAddress.toCPointer<ByteVar>(), publisheridbufferused.rawAddress.toCPointer<ByteVar>())

public actual fun evtOpenChannelConfig(session: EvtHandle, channelpath: Pcwstr, flags: UInt): EvtHandle =
    windowssysWindowsWin32SystemEventlogEvtOpenChannelConfig(session, channelpath.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun evtOpenChannelEnum(session: EvtHandle, flags: UInt): EvtHandle =
    windowssysWindowsWin32SystemEventlogEvtOpenChannelEnum(session, flags)

public actual fun evtOpenEventMetadataEnum(publishermetadata: EvtHandle, flags: UInt): EvtHandle =
    windowssysWindowsWin32SystemEventlogEvtOpenEventMetadataEnum(publishermetadata, flags)

public actual fun evtOpenLog(session: EvtHandle, path: Pcwstr, flags: UInt): EvtHandle =
    windowssysWindowsWin32SystemEventlogEvtOpenLog(session, path.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun evtOpenPublisherEnum(session: EvtHandle, flags: UInt): EvtHandle =
    windowssysWindowsWin32SystemEventlogEvtOpenPublisherEnum(session, flags)

public actual fun evtOpenPublisherMetadata(session: EvtHandle, publisherid: Pcwstr, logfilepath: Pcwstr, locale: UInt, flags: UInt): EvtHandle =
    windowssysWindowsWin32SystemEventlogEvtOpenPublisherMetadata(session, publisherid.rawAddress.toCPointer<ByteVar>(), logfilepath.rawAddress.toCPointer<ByteVar>(), locale, flags)

public actual fun evtOpenSession(loginclass: EvtLoginClass, login: ConstPtr<CVoid>, timeout: UInt, flags: UInt): EvtHandle =
    windowssysWindowsWin32SystemEventlogEvtOpenSession(loginclass, login.rawAddress.toCPointer<ByteVar>(), timeout, flags)

public actual fun evtQuery(session: EvtHandle, path: Pcwstr, query: Pcwstr, flags: UInt): EvtHandle =
    windowssysWindowsWin32SystemEventlogEvtQuery(session, path.rawAddress.toCPointer<ByteVar>(), query.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun evtRender(context: EvtHandle, fragment: EvtHandle, flags: UInt, buffersize: UInt, buffer: MutPtr<CVoid>, bufferused: MutPtr<UInt>, propertycount: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemEventlogEvtRender(context, fragment, flags, buffersize, buffer.rawAddress.toCPointer<ByteVar>(), bufferused.rawAddress.toCPointer<ByteVar>(), propertycount.rawAddress.toCPointer<ByteVar>())

public actual fun evtSaveChannelConfig(channelconfig: EvtHandle, flags: UInt): Bool =
    windowssysWindowsWin32SystemEventlogEvtSaveChannelConfig(channelconfig, flags)

public actual fun evtSeek(resultset: EvtHandle, position: Long, bookmark: EvtHandle, timeout: UInt, flags: UInt): Bool =
    windowssysWindowsWin32SystemEventlogEvtSeek(resultset, position, bookmark, timeout, flags)

public actual fun evtSetChannelConfigProperty(channelconfig: EvtHandle, propertyid: EvtChannelConfigPropertyId, flags: UInt, propertyvalue: ConstPtr<EvtVariant>): Bool =
    windowssysWindowsWin32SystemEventlogEvtSetChannelConfigProperty(channelconfig, propertyid, flags, propertyvalue.rawAddress.toCPointer<ByteVar>())

public actual fun evtSubscribe(session: EvtHandle, signalevent: Handle, channelpath: Pcwstr, query: Pcwstr, bookmark: EvtHandle, context: ConstPtr<CVoid>, callback: EvtSubscribeCallback, flags: UInt): EvtHandle =
    windowssysWindowsWin32SystemEventlogEvtSubscribe(session, signalevent.rawAddress.toCPointer<ByteVar>(), channelpath.rawAddress.toCPointer<ByteVar>(), query.rawAddress.toCPointer<ByteVar>(), bookmark, context.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), flags)

public actual fun evtUpdateBookmark(bookmark: EvtHandle, event: EvtHandle): Bool =
    windowssysWindowsWin32SystemEventlogEvtUpdateBookmark(bookmark, event)

public actual fun getEventLogInformation(heventlog: Handle, dwinfolevel: UInt, lpbuffer: MutPtr<CVoid>, cbbufsize: UInt, pcbbytesneeded: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemEventlogGetEventLogInformation(heventlog.rawAddress.toCPointer<ByteVar>(), dwinfolevel, lpbuffer.rawAddress.toCPointer<ByteVar>(), cbbufsize, pcbbytesneeded.rawAddress.toCPointer<ByteVar>())

public actual fun getNumberOfEventLogRecords(heventlog: Handle, numberofrecords: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemEventlogGetNumberOfEventLogRecords(heventlog.rawAddress.toCPointer<ByteVar>(), numberofrecords.rawAddress.toCPointer<ByteVar>())

public actual fun getOldestEventLogRecord(heventlog: Handle, oldestrecord: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemEventlogGetOldestEventLogRecord(heventlog.rawAddress.toCPointer<ByteVar>(), oldestrecord.rawAddress.toCPointer<ByteVar>())

public actual fun notifyChangeEventLog(heventlog: Handle, hevent: Handle): Bool =
    windowssysWindowsWin32SystemEventlogNotifyChangeEventLog(heventlog.rawAddress.toCPointer<ByteVar>(), hevent.rawAddress.toCPointer<ByteVar>())

public actual fun openBackupEventLogA(lpuncservername: Pcstr, lpfilename: Pcstr): Handle =
    MutPtr(windowssysWindowsWin32SystemEventlogOpenBackupEventLogA(lpuncservername.rawAddress.toCPointer<ByteVar>(), lpfilename.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun openBackupEventLogW(lpuncservername: Pcwstr, lpfilename: Pcwstr): Handle =
    MutPtr(windowssysWindowsWin32SystemEventlogOpenBackupEventLogW(lpuncservername.rawAddress.toCPointer<ByteVar>(), lpfilename.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun openEventLogA(lpuncservername: Pcstr, lpsourcename: Pcstr): Handle =
    MutPtr(windowssysWindowsWin32SystemEventlogOpenEventLogA(lpuncservername.rawAddress.toCPointer<ByteVar>(), lpsourcename.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun openEventLogW(lpuncservername: Pcwstr, lpsourcename: Pcwstr): Handle =
    MutPtr(windowssysWindowsWin32SystemEventlogOpenEventLogW(lpuncservername.rawAddress.toCPointer<ByteVar>(), lpsourcename.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun readEventLogA(heventlog: Handle, dwreadflags: ReadEventLogReadFlags, dwrecordoffset: UInt, lpbuffer: MutPtr<CVoid>, nnumberofbytestoread: UInt, pnbytesread: MutPtr<UInt>, pnminnumberofbytesneeded: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemEventlogReadEventLogA(heventlog.rawAddress.toCPointer<ByteVar>(), dwreadflags, dwrecordoffset, lpbuffer.rawAddress.toCPointer<ByteVar>(), nnumberofbytestoread, pnbytesread.rawAddress.toCPointer<ByteVar>(), pnminnumberofbytesneeded.rawAddress.toCPointer<ByteVar>())

public actual fun readEventLogW(heventlog: Handle, dwreadflags: ReadEventLogReadFlags, dwrecordoffset: UInt, lpbuffer: MutPtr<CVoid>, nnumberofbytestoread: UInt, pnbytesread: MutPtr<UInt>, pnminnumberofbytesneeded: MutPtr<UInt>): Bool =
    windowssysWindowsWin32SystemEventlogReadEventLogW(heventlog.rawAddress.toCPointer<ByteVar>(), dwreadflags, dwrecordoffset, lpbuffer.rawAddress.toCPointer<ByteVar>(), nnumberofbytestoread, pnbytesread.rawAddress.toCPointer<ByteVar>(), pnminnumberofbytesneeded.rawAddress.toCPointer<ByteVar>())

public actual fun registerEventSourceA(lpuncservername: Pcstr, lpsourcename: Pcstr): Handle =
    MutPtr(windowssysWindowsWin32SystemEventlogRegisterEventSourceA(lpuncservername.rawAddress.toCPointer<ByteVar>(), lpsourcename.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun registerEventSourceW(lpuncservername: Pcwstr, lpsourcename: Pcwstr): Handle =
    MutPtr(windowssysWindowsWin32SystemEventlogRegisterEventSourceW(lpuncservername.rawAddress.toCPointer<ByteVar>(), lpsourcename.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun reportEventA(heventlog: Handle, wtype: ReportEventType, wcategory: UShort, dweventid: UInt, lpusersid: Psid, wnumstrings: UShort, dwdatasize: UInt, lpstrings: ConstPtr<Pcstr>, lprawdata: ConstPtr<CVoid>): Bool =
    windowssysWindowsWin32SystemEventlogReportEventA(heventlog.rawAddress.toCPointer<ByteVar>(), wtype, wcategory, dweventid, lpusersid.rawAddress.toCPointer<ByteVar>(), wnumstrings, dwdatasize, lpstrings.rawAddress.toCPointer<ByteVar>(), lprawdata.rawAddress.toCPointer<ByteVar>())

public actual fun reportEventW(heventlog: Handle, wtype: ReportEventType, wcategory: UShort, dweventid: UInt, lpusersid: Psid, wnumstrings: UShort, dwdatasize: UInt, lpstrings: ConstPtr<Pcwstr>, lprawdata: ConstPtr<CVoid>): Bool =
    windowssysWindowsWin32SystemEventlogReportEventW(heventlog.rawAddress.toCPointer<ByteVar>(), wtype, wcategory, dweventid, lpusersid.rawAddress.toCPointer<ByteVar>(), wnumstrings, dwdatasize, lpstrings.rawAddress.toCPointer<ByteVar>(), lprawdata.rawAddress.toCPointer<ByteVar>())
