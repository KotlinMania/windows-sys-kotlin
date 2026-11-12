@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.eventlog

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.Psid

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun backupEventLogA(heventlog: Handle, lpbackupfilename: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogBackupEventLogA")

public actual fun backupEventLogW(heventlog: Handle, lpbackupfilename: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogBackupEventLogW")

public actual fun clearEventLogA(heventlog: Handle, lpbackupfilename: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogClearEventLogA")

public actual fun clearEventLogW(heventlog: Handle, lpbackupfilename: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogClearEventLogW")

public actual fun closeEventLog(heventlog: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogCloseEventLog")

public actual fun deregisterEventSource(heventlog: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogDeregisterEventSource")

public actual fun evtArchiveExportedLog(session: EvtHandle, logfilepath: Pcwstr, locale: UInt, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogEvtArchiveExportedLog")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemEventlogEvtCancel")
private external fun wasiWindowssysWindowsWin32SystemEventlogEvtCancel(obj: Long): Int

public actual fun evtCancel(obj: EvtHandle): Bool =
    wasiWindowssysWindowsWin32SystemEventlogEvtCancel(obj)

public actual fun evtClearLog(session: EvtHandle, channelpath: Pcwstr, targetfilepath: Pcwstr, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogEvtClearLog")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemEventlogEvtClose")
private external fun wasiWindowssysWindowsWin32SystemEventlogEvtClose(obj: Long): Int

public actual fun evtClose(obj: EvtHandle): Bool =
    wasiWindowssysWindowsWin32SystemEventlogEvtClose(obj)

public actual fun evtCreateBookmark(bookmarkxml: Pcwstr): EvtHandle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogEvtCreateBookmark")

public actual fun evtCreateRenderContext(valuepathscount: UInt, valuepaths: ConstPtr, flags: UInt): EvtHandle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogEvtCreateRenderContext")

public actual fun evtExportLog(session: EvtHandle, path: Pcwstr, query: Pcwstr, targetfilepath: Pcwstr, flags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogEvtExportLog")

public actual fun evtFormatMessage(publishermetadata: EvtHandle, event: EvtHandle, messageid: UInt, valuecount: UInt, values: ConstPtr, flags: UInt, buffersize: UInt, buffer: Pwstr, bufferused: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogEvtFormatMessage")

public actual fun evtGetChannelConfigProperty(channelconfig: EvtHandle, propertyid: EvtChannelConfigPropertyId, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: MutPtr, propertyvaluebufferused: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogEvtGetChannelConfigProperty")

public actual fun evtGetEventInfo(event: EvtHandle, propertyid: EvtEventPropertyId, propertyvaluebuffersize: UInt, propertyvaluebuffer: MutPtr, propertyvaluebufferused: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogEvtGetEventInfo")

public actual fun evtGetEventMetadataProperty(eventmetadata: EvtHandle, propertyid: EvtEventMetadataPropertyId, flags: UInt, eventmetadatapropertybuffersize: UInt, eventmetadatapropertybuffer: MutPtr, eventmetadatapropertybufferused: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogEvtGetEventMetadataProperty")

public actual fun evtGetExtendedStatus(buffersize: UInt, buffer: Pwstr, bufferused: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogEvtGetExtendedStatus")

public actual fun evtGetLogInfo(log: EvtHandle, propertyid: EvtLogPropertyId, propertyvaluebuffersize: UInt, propertyvaluebuffer: MutPtr, propertyvaluebufferused: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogEvtGetLogInfo")

public actual fun evtGetObjectArrayProperty(objectarray: Long, propertyid: UInt, arrayindex: UInt, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: MutPtr, propertyvaluebufferused: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogEvtGetObjectArrayProperty")

public actual fun evtGetObjectArraySize(objectarray: Long, objectarraysize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogEvtGetObjectArraySize")

public actual fun evtGetPublisherMetadataProperty(publishermetadata: EvtHandle, propertyid: EvtPublisherMetadataPropertyId, flags: UInt, publishermetadatapropertybuffersize: UInt, publishermetadatapropertybuffer: MutPtr, publishermetadatapropertybufferused: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogEvtGetPublisherMetadataProperty")

public actual fun evtGetQueryInfo(queryorsubscription: EvtHandle, propertyid: EvtQueryPropertyId, propertyvaluebuffersize: UInt, propertyvaluebuffer: MutPtr, propertyvaluebufferused: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogEvtGetQueryInfo")

public actual fun evtNext(resultset: EvtHandle, eventssize: UInt, events: MutPtr, timeout: UInt, flags: UInt, returned: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogEvtNext")

public actual fun evtNextChannelPath(channelenum: EvtHandle, channelpathbuffersize: UInt, channelpathbuffer: Pwstr, channelpathbufferused: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogEvtNextChannelPath")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemEventlogEvtNextEventMetadata")
private external fun wasiWindowssysWindowsWin32SystemEventlogEvtNextEventMetadata(eventmetadataenum: Long, flags: Int): Long

public actual fun evtNextEventMetadata(eventmetadataenum: EvtHandle, flags: UInt): EvtHandle =
    wasiWindowssysWindowsWin32SystemEventlogEvtNextEventMetadata(eventmetadataenum, flags.toInt())

public actual fun evtNextPublisherId(publisherenum: EvtHandle, publisheridbuffersize: UInt, publisheridbuffer: Pwstr, publisheridbufferused: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogEvtNextPublisherId")

public actual fun evtOpenChannelConfig(session: EvtHandle, channelpath: Pcwstr, flags: UInt): EvtHandle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogEvtOpenChannelConfig")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemEventlogEvtOpenChannelEnum")
private external fun wasiWindowssysWindowsWin32SystemEventlogEvtOpenChannelEnum(session: Long, flags: Int): Long

public actual fun evtOpenChannelEnum(session: EvtHandle, flags: UInt): EvtHandle =
    wasiWindowssysWindowsWin32SystemEventlogEvtOpenChannelEnum(session, flags.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemEventlogEvtOpenEventMetadataEnum")
private external fun wasiWindowssysWindowsWin32SystemEventlogEvtOpenEventMetadataEnum(publishermetadata: Long, flags: Int): Long

public actual fun evtOpenEventMetadataEnum(publishermetadata: EvtHandle, flags: UInt): EvtHandle =
    wasiWindowssysWindowsWin32SystemEventlogEvtOpenEventMetadataEnum(publishermetadata, flags.toInt())

public actual fun evtOpenLog(session: EvtHandle, path: Pcwstr, flags: UInt): EvtHandle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogEvtOpenLog")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemEventlogEvtOpenPublisherEnum")
private external fun wasiWindowssysWindowsWin32SystemEventlogEvtOpenPublisherEnum(session: Long, flags: Int): Long

public actual fun evtOpenPublisherEnum(session: EvtHandle, flags: UInt): EvtHandle =
    wasiWindowssysWindowsWin32SystemEventlogEvtOpenPublisherEnum(session, flags.toInt())

public actual fun evtOpenPublisherMetadata(session: EvtHandle, publisherid: Pcwstr, logfilepath: Pcwstr, locale: UInt, flags: UInt): EvtHandle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogEvtOpenPublisherMetadata")

public actual fun evtOpenSession(loginclass: EvtLoginClass, login: ConstPtr, timeout: UInt, flags: UInt): EvtHandle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogEvtOpenSession")

public actual fun evtQuery(session: EvtHandle, path: Pcwstr, query: Pcwstr, flags: UInt): EvtHandle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogEvtQuery")

public actual fun evtRender(context: EvtHandle, fragment: EvtHandle, flags: UInt, buffersize: UInt, buffer: MutPtr, bufferused: MutPtr, propertycount: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogEvtRender")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemEventlogEvtSaveChannelConfig")
private external fun wasiWindowssysWindowsWin32SystemEventlogEvtSaveChannelConfig(channelconfig: Long, flags: Int): Int

public actual fun evtSaveChannelConfig(channelconfig: EvtHandle, flags: UInt): Bool =
    wasiWindowssysWindowsWin32SystemEventlogEvtSaveChannelConfig(channelconfig, flags.toInt())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemEventlogEvtSeek")
private external fun wasiWindowssysWindowsWin32SystemEventlogEvtSeek(resultset: Long, position: Long, bookmark: Long, timeout: Int, flags: Int): Int

public actual fun evtSeek(resultset: EvtHandle, position: Long, bookmark: EvtHandle, timeout: UInt, flags: UInt): Bool =
    wasiWindowssysWindowsWin32SystemEventlogEvtSeek(resultset, position, bookmark, timeout.toInt(), flags.toInt())

public actual fun evtSetChannelConfigProperty(channelconfig: EvtHandle, propertyid: EvtChannelConfigPropertyId, flags: UInt, propertyvalue: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogEvtSetChannelConfigProperty")

public actual fun evtSubscribe(session: EvtHandle, signalevent: Handle, channelpath: Pcwstr, query: Pcwstr, bookmark: EvtHandle, context: ConstPtr, callback: EvtSubscribeCallback, flags: UInt): EvtHandle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogEvtSubscribe")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemEventlogEvtUpdateBookmark")
private external fun wasiWindowssysWindowsWin32SystemEventlogEvtUpdateBookmark(bookmark: Long, event: Long): Int

public actual fun evtUpdateBookmark(bookmark: EvtHandle, event: EvtHandle): Bool =
    wasiWindowssysWindowsWin32SystemEventlogEvtUpdateBookmark(bookmark, event)

public actual fun getEventLogInformation(heventlog: Handle, dwinfolevel: UInt, lpbuffer: MutPtr, cbbufsize: UInt, pcbbytesneeded: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogGetEventLogInformation")

public actual fun getNumberOfEventLogRecords(heventlog: Handle, numberofrecords: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogGetNumberOfEventLogRecords")

public actual fun getOldestEventLogRecord(heventlog: Handle, oldestrecord: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogGetOldestEventLogRecord")

public actual fun notifyChangeEventLog(heventlog: Handle, hevent: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogNotifyChangeEventLog")

public actual fun openBackupEventLogA(lpuncservername: Pcstr, lpfilename: Pcstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogOpenBackupEventLogA")

public actual fun openBackupEventLogW(lpuncservername: Pcwstr, lpfilename: Pcwstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogOpenBackupEventLogW")

public actual fun openEventLogA(lpuncservername: Pcstr, lpsourcename: Pcstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogOpenEventLogA")

public actual fun openEventLogW(lpuncservername: Pcwstr, lpsourcename: Pcwstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogOpenEventLogW")

public actual fun readEventLogA(heventlog: Handle, dwreadflags: ReadEventLogReadFlags, dwrecordoffset: UInt, lpbuffer: MutPtr, nnumberofbytestoread: UInt, pnbytesread: MutPtr, pnminnumberofbytesneeded: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogReadEventLogA")

public actual fun readEventLogW(heventlog: Handle, dwreadflags: ReadEventLogReadFlags, dwrecordoffset: UInt, lpbuffer: MutPtr, nnumberofbytestoread: UInt, pnbytesread: MutPtr, pnminnumberofbytesneeded: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogReadEventLogW")

public actual fun registerEventSourceA(lpuncservername: Pcstr, lpsourcename: Pcstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogRegisterEventSourceA")

public actual fun registerEventSourceW(lpuncservername: Pcwstr, lpsourcename: Pcwstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogRegisterEventSourceW")

public actual fun reportEventA(heventlog: Handle, wtype: ReportEventType, wcategory: UShort, dweventid: UInt, lpusersid: Psid, wnumstrings: UShort, dwdatasize: UInt, lpstrings: ConstPtr, lprawdata: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogReportEventA")

public actual fun reportEventW(heventlog: Handle, wtype: ReportEventType, wcategory: UShort, dweventid: UInt, lpusersid: Psid, wnumstrings: UShort, dwdatasize: UInt, lpstrings: ConstPtr, lprawdata: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemEventlogReportEventW")
