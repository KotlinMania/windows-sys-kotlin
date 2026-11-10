@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.eventlog

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.Psid

public actual fun backupEventLogA(heventlog: Handle, lpbackupfilename: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun backupEventLogW(heventlog: Handle, lpbackupfilename: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clearEventLogA(heventlog: Handle, lpbackupfilename: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clearEventLogW(heventlog: Handle, lpbackupfilename: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun closeEventLog(heventlog: Handle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun deregisterEventSource(heventlog: Handle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun evtArchiveExportedLog(session: EvtHandle, logfilepath: Pcwstr, locale: UInt, flags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun evtCancel(obj: EvtHandle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun evtClearLog(session: EvtHandle, channelpath: Pcwstr, targetfilepath: Pcwstr, flags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun evtClose(obj: EvtHandle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun evtCreateBookmark(bookmarkxml: Pcwstr): EvtHandle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun evtCreateRenderContext(valuepathscount: UInt, valuepaths: COpaquePointer?, flags: UInt): EvtHandle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun evtExportLog(session: EvtHandle, path: Pcwstr, query: Pcwstr, targetfilepath: Pcwstr, flags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun evtFormatMessage(publishermetadata: EvtHandle, event: EvtHandle, messageid: UInt, valuecount: UInt, values: COpaquePointer?, flags: UInt, buffersize: UInt, buffer: Pwstr, bufferused: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun evtGetChannelConfigProperty(channelconfig: EvtHandle, propertyid: EvtChannelConfigPropertyId, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: COpaquePointer?, propertyvaluebufferused: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun evtGetEventInfo(event: EvtHandle, propertyid: EvtEventPropertyId, propertyvaluebuffersize: UInt, propertyvaluebuffer: COpaquePointer?, propertyvaluebufferused: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun evtGetEventMetadataProperty(eventmetadata: EvtHandle, propertyid: EvtEventMetadataPropertyId, flags: UInt, eventmetadatapropertybuffersize: UInt, eventmetadatapropertybuffer: COpaquePointer?, eventmetadatapropertybufferused: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun evtGetExtendedStatus(buffersize: UInt, buffer: Pwstr, bufferused: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun evtGetLogInfo(log: EvtHandle, propertyid: EvtLogPropertyId, propertyvaluebuffersize: UInt, propertyvaluebuffer: COpaquePointer?, propertyvaluebufferused: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun evtGetObjectArrayProperty(objectarray: Long, propertyid: UInt, arrayindex: UInt, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: COpaquePointer?, propertyvaluebufferused: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun evtGetObjectArraySize(objectarray: Long, objectarraysize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun evtGetPublisherMetadataProperty(publishermetadata: EvtHandle, propertyid: EvtPublisherMetadataPropertyId, flags: UInt, publishermetadatapropertybuffersize: UInt, publishermetadatapropertybuffer: COpaquePointer?, publishermetadatapropertybufferused: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun evtGetQueryInfo(queryorsubscription: EvtHandle, propertyid: EvtQueryPropertyId, propertyvaluebuffersize: UInt, propertyvaluebuffer: COpaquePointer?, propertyvaluebufferused: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun evtNext(resultset: EvtHandle, eventssize: UInt, events: COpaquePointer?, timeout: UInt, flags: UInt, returned: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun evtNextChannelPath(channelenum: EvtHandle, channelpathbuffersize: UInt, channelpathbuffer: Pwstr, channelpathbufferused: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun evtNextEventMetadata(eventmetadataenum: EvtHandle, flags: UInt): EvtHandle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun evtNextPublisherId(publisherenum: EvtHandle, publisheridbuffersize: UInt, publisheridbuffer: Pwstr, publisheridbufferused: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun evtOpenChannelConfig(session: EvtHandle, channelpath: Pcwstr, flags: UInt): EvtHandle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun evtOpenChannelEnum(session: EvtHandle, flags: UInt): EvtHandle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun evtOpenEventMetadataEnum(publishermetadata: EvtHandle, flags: UInt): EvtHandle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun evtOpenLog(session: EvtHandle, path: Pcwstr, flags: UInt): EvtHandle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun evtOpenPublisherEnum(session: EvtHandle, flags: UInt): EvtHandle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun evtOpenPublisherMetadata(session: EvtHandle, publisherid: Pcwstr, logfilepath: Pcwstr, locale: UInt, flags: UInt): EvtHandle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun evtOpenSession(loginclass: EvtLoginClass, login: COpaquePointer?, timeout: UInt, flags: UInt): EvtHandle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun evtQuery(session: EvtHandle, path: Pcwstr, query: Pcwstr, flags: UInt): EvtHandle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun evtRender(context: EvtHandle, fragment: EvtHandle, flags: UInt, buffersize: UInt, buffer: COpaquePointer?, bufferused: COpaquePointer?, propertycount: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun evtSaveChannelConfig(channelconfig: EvtHandle, flags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun evtSeek(resultset: EvtHandle, position: Long, bookmark: EvtHandle, timeout: UInt, flags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun evtSetChannelConfigProperty(channelconfig: EvtHandle, propertyid: EvtChannelConfigPropertyId, flags: UInt, propertyvalue: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun evtSubscribe(session: EvtHandle, signalevent: Handle, channelpath: Pcwstr, query: Pcwstr, bookmark: EvtHandle, context: COpaquePointer?, callback: EvtSubscribeCallback, flags: UInt): EvtHandle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun evtUpdateBookmark(bookmark: EvtHandle, event: EvtHandle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getEventLogInformation(heventlog: Handle, dwinfolevel: UInt, lpbuffer: COpaquePointer?, cbbufsize: UInt, pcbbytesneeded: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getNumberOfEventLogRecords(heventlog: Handle, numberofrecords: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getOldestEventLogRecord(heventlog: Handle, oldestrecord: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun notifyChangeEventLog(heventlog: Handle, hevent: Handle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun openBackupEventLogA(lpuncservername: Pcstr, lpfilename: Pcstr): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun openBackupEventLogW(lpuncservername: Pcwstr, lpfilename: Pcwstr): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun openEventLogA(lpuncservername: Pcstr, lpsourcename: Pcstr): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun openEventLogW(lpuncservername: Pcwstr, lpsourcename: Pcwstr): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun readEventLogA(heventlog: Handle, dwreadflags: ReadEventLogReadFlags, dwrecordoffset: UInt, lpbuffer: COpaquePointer?, nnumberofbytestoread: UInt, pnbytesread: COpaquePointer?, pnminnumberofbytesneeded: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun readEventLogW(heventlog: Handle, dwreadflags: ReadEventLogReadFlags, dwrecordoffset: UInt, lpbuffer: COpaquePointer?, nnumberofbytestoread: UInt, pnbytesread: COpaquePointer?, pnminnumberofbytesneeded: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun registerEventSourceA(lpuncservername: Pcstr, lpsourcename: Pcstr): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun registerEventSourceW(lpuncservername: Pcwstr, lpsourcename: Pcwstr): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun reportEventA(heventlog: Handle, wtype: ReportEventType, wcategory: UShort, dweventid: UInt, lpusersid: Psid, wnumstrings: UShort, dwdatasize: UInt, lpstrings: COpaquePointer?, lprawdata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun reportEventW(heventlog: Handle, wtype: ReportEventType, wcategory: UShort, dweventid: UInt, lpusersid: Psid, wnumstrings: UShort, dwdatasize: UInt, lpstrings: COpaquePointer?, lprawdata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
