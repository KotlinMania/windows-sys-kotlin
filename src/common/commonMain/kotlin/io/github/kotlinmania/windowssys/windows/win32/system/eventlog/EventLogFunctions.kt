package io.github.kotlinmania.windowssys.windows.win32.system.eventlog

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun interface FnCallback {
    public operator fun invoke(action: EVT_SUBSCRIBE_NOTIFY_ACTION, usercontext: Long, event: EVT_HANDLE): UInt
}

public fun BackupEventLogA(heventlog: Foundation.HANDLE, lpbackupfilename: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "BackupEventLogA", longArrayOf(Win32DynamicFfi.objectSlot(heventlog), lpbackupfilename)).toInt()
}

public fun BackupEventLogW(heventlog: Foundation.HANDLE, lpbackupfilename: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "BackupEventLogW", longArrayOf(Win32DynamicFfi.objectSlot(heventlog), lpbackupfilename)).toInt()
}

public fun ClearEventLogA(heventlog: Foundation.HANDLE, lpbackupfilename: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "ClearEventLogA", longArrayOf(Win32DynamicFfi.objectSlot(heventlog), lpbackupfilename)).toInt()
}

public fun ClearEventLogW(heventlog: Foundation.HANDLE, lpbackupfilename: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "ClearEventLogW", longArrayOf(Win32DynamicFfi.objectSlot(heventlog), lpbackupfilename)).toInt()
}

public fun CloseEventLog(heventlog: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "CloseEventLog", longArrayOf(Win32DynamicFfi.objectSlot(heventlog))).toInt()
}

public fun DeregisterEventSource(heventlog: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "DeregisterEventSource", longArrayOf(Win32DynamicFfi.objectSlot(heventlog))).toInt()
}

public fun EvtArchiveExportedLog(session: EVT_HANDLE, logfilepath: PCWSTR, locale: UInt, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("wevtapi.dll", "EvtArchiveExportedLog", longArrayOf(session, logfilepath, locale.toLong(), flags.toLong())).toInt()
}

public fun EvtCancel(obj: EVT_HANDLE): BOOL {
    return Win32DynamicFfi.invoke("wevtapi.dll", "EvtCancel", longArrayOf(obj)).toInt()
}

public fun EvtClearLog(session: EVT_HANDLE, channelpath: PCWSTR, targetfilepath: PCWSTR, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("wevtapi.dll", "EvtClearLog", longArrayOf(session, channelpath, targetfilepath, flags.toLong())).toInt()
}

public fun EvtClose(obj: EVT_HANDLE): BOOL {
    return Win32DynamicFfi.invoke("wevtapi.dll", "EvtClose", longArrayOf(obj)).toInt()
}

public fun EvtCreateBookmark(bookmarkxml: PCWSTR): EVT_HANDLE {
    return Win32DynamicFfi.invoke("wevtapi.dll", "EvtCreateBookmark", longArrayOf(bookmarkxml))
}

public fun EvtCreateRenderContext(valuepathscount: UInt, valuepaths: Long, flags: UInt): EVT_HANDLE {
    return Win32DynamicFfi.invoke("wevtapi.dll", "EvtCreateRenderContext", longArrayOf(valuepathscount.toLong(), valuepaths, flags.toLong()))
}

public fun EvtExportLog(session: EVT_HANDLE, path: PCWSTR, query: PCWSTR, targetfilepath: PCWSTR, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("wevtapi.dll", "EvtExportLog", longArrayOf(session, path, query, targetfilepath, flags.toLong())).toInt()
}

public fun EvtFormatMessage(publishermetadata: EVT_HANDLE, event: EVT_HANDLE, messageid: UInt, valuecount: UInt, values: Long, flags: UInt, buffersize: UInt, buffer: PWSTR, bufferused: Long): BOOL {
    return Win32DynamicFfi.invoke("wevtapi.dll", "EvtFormatMessage", longArrayOf(publishermetadata, event, messageid.toLong(), valuecount.toLong(), values, flags.toLong(), buffersize.toLong(), buffer, bufferused)).toInt()
}

public fun EvtGetChannelConfigProperty(channelconfig: EVT_HANDLE, propertyid: EVT_CHANNEL_CONFIG_PROPERTY_ID, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: Long, propertyvaluebufferused: Long): BOOL {
    return Win32DynamicFfi.invoke("wevtapi.dll", "EvtGetChannelConfigProperty", longArrayOf(channelconfig, propertyid.toLong(), flags.toLong(), propertyvaluebuffersize.toLong(), propertyvaluebuffer, propertyvaluebufferused)).toInt()
}

public fun EvtGetEventInfo(event: EVT_HANDLE, propertyid: EVT_EVENT_PROPERTY_ID, propertyvaluebuffersize: UInt, propertyvaluebuffer: Long, propertyvaluebufferused: Long): BOOL {
    return Win32DynamicFfi.invoke("wevtapi.dll", "EvtGetEventInfo", longArrayOf(event, propertyid.toLong(), propertyvaluebuffersize.toLong(), propertyvaluebuffer, propertyvaluebufferused)).toInt()
}

public fun EvtGetEventMetadataProperty(eventmetadata: EVT_HANDLE, propertyid: EVT_EVENT_METADATA_PROPERTY_ID, flags: UInt, eventmetadatapropertybuffersize: UInt, eventmetadatapropertybuffer: Long, eventmetadatapropertybufferused: Long): BOOL {
    return Win32DynamicFfi.invoke("wevtapi.dll", "EvtGetEventMetadataProperty", longArrayOf(eventmetadata, propertyid.toLong(), flags.toLong(), eventmetadatapropertybuffersize.toLong(), eventmetadatapropertybuffer, eventmetadatapropertybufferused)).toInt()
}

public fun EvtGetExtendedStatus(buffersize: UInt, buffer: PWSTR, bufferused: Long): UInt {
    return Win32DynamicFfi.invoke("wevtapi.dll", "EvtGetExtendedStatus", longArrayOf(buffersize.toLong(), buffer, bufferused)).toUInt()
}

public fun EvtGetLogInfo(log: EVT_HANDLE, propertyid: EVT_LOG_PROPERTY_ID, propertyvaluebuffersize: UInt, propertyvaluebuffer: Long, propertyvaluebufferused: Long): BOOL {
    return Win32DynamicFfi.invoke("wevtapi.dll", "EvtGetLogInfo", longArrayOf(log, propertyid.toLong(), propertyvaluebuffersize.toLong(), propertyvaluebuffer, propertyvaluebufferused)).toInt()
}

public fun EvtGetObjectArrayProperty(objectarray: Long, propertyid: UInt, arrayindex: UInt, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: Long, propertyvaluebufferused: Long): BOOL {
    return Win32DynamicFfi.invoke("wevtapi.dll", "EvtGetObjectArrayProperty", longArrayOf(objectarray, propertyid.toLong(), arrayindex.toLong(), flags.toLong(), propertyvaluebuffersize.toLong(), propertyvaluebuffer, propertyvaluebufferused)).toInt()
}

public fun EvtGetObjectArraySize(objectarray: Long, objectarraysize: Long): BOOL {
    return Win32DynamicFfi.invoke("wevtapi.dll", "EvtGetObjectArraySize", longArrayOf(objectarray, objectarraysize)).toInt()
}

public fun EvtGetPublisherMetadataProperty(publishermetadata: EVT_HANDLE, propertyid: EVT_PUBLISHER_METADATA_PROPERTY_ID, flags: UInt, publishermetadatapropertybuffersize: UInt, publishermetadatapropertybuffer: Long, publishermetadatapropertybufferused: Long): BOOL {
    return Win32DynamicFfi.invoke("wevtapi.dll", "EvtGetPublisherMetadataProperty", longArrayOf(publishermetadata, propertyid.toLong(), flags.toLong(), publishermetadatapropertybuffersize.toLong(), publishermetadatapropertybuffer, publishermetadatapropertybufferused)).toInt()
}

public fun EvtGetQueryInfo(queryorsubscription: EVT_HANDLE, propertyid: EVT_QUERY_PROPERTY_ID, propertyvaluebuffersize: UInt, propertyvaluebuffer: Long, propertyvaluebufferused: Long): BOOL {
    return Win32DynamicFfi.invoke("wevtapi.dll", "EvtGetQueryInfo", longArrayOf(queryorsubscription, propertyid.toLong(), propertyvaluebuffersize.toLong(), propertyvaluebuffer, propertyvaluebufferused)).toInt()
}

public fun EvtNext(resultset: EVT_HANDLE, eventssize: UInt, events: Long, timeout: UInt, flags: UInt, returned: Long): BOOL {
    return Win32DynamicFfi.invoke("wevtapi.dll", "EvtNext", longArrayOf(resultset, eventssize.toLong(), events, timeout.toLong(), flags.toLong(), returned)).toInt()
}

public fun EvtNextChannelPath(channelenum: EVT_HANDLE, channelpathbuffersize: UInt, channelpathbuffer: PWSTR, channelpathbufferused: Long): BOOL {
    return Win32DynamicFfi.invoke("wevtapi.dll", "EvtNextChannelPath", longArrayOf(channelenum, channelpathbuffersize.toLong(), channelpathbuffer, channelpathbufferused)).toInt()
}

public fun EvtNextEventMetadata(eventmetadataenum: EVT_HANDLE, flags: UInt): EVT_HANDLE {
    return Win32DynamicFfi.invoke("wevtapi.dll", "EvtNextEventMetadata", longArrayOf(eventmetadataenum, flags.toLong()))
}

public fun EvtNextPublisherId(publisherenum: EVT_HANDLE, publisheridbuffersize: UInt, publisheridbuffer: PWSTR, publisheridbufferused: Long): BOOL {
    return Win32DynamicFfi.invoke("wevtapi.dll", "EvtNextPublisherId", longArrayOf(publisherenum, publisheridbuffersize.toLong(), publisheridbuffer, publisheridbufferused)).toInt()
}

public fun EvtOpenChannelConfig(session: EVT_HANDLE, channelpath: PCWSTR, flags: UInt): EVT_HANDLE {
    return Win32DynamicFfi.invoke("wevtapi.dll", "EvtOpenChannelConfig", longArrayOf(session, channelpath, flags.toLong()))
}

public fun EvtOpenChannelEnum(session: EVT_HANDLE, flags: UInt): EVT_HANDLE {
    return Win32DynamicFfi.invoke("wevtapi.dll", "EvtOpenChannelEnum", longArrayOf(session, flags.toLong()))
}

public fun EvtOpenEventMetadataEnum(publishermetadata: EVT_HANDLE, flags: UInt): EVT_HANDLE {
    return Win32DynamicFfi.invoke("wevtapi.dll", "EvtOpenEventMetadataEnum", longArrayOf(publishermetadata, flags.toLong()))
}

public fun EvtOpenLog(session: EVT_HANDLE, path: PCWSTR, flags: UInt): EVT_HANDLE {
    return Win32DynamicFfi.invoke("wevtapi.dll", "EvtOpenLog", longArrayOf(session, path, flags.toLong()))
}

public fun EvtOpenPublisherEnum(session: EVT_HANDLE, flags: UInt): EVT_HANDLE {
    return Win32DynamicFfi.invoke("wevtapi.dll", "EvtOpenPublisherEnum", longArrayOf(session, flags.toLong()))
}

public fun EvtOpenPublisherMetadata(session: EVT_HANDLE, publisherid: PCWSTR, logfilepath: PCWSTR, locale: UInt, flags: UInt): EVT_HANDLE {
    return Win32DynamicFfi.invoke("wevtapi.dll", "EvtOpenPublisherMetadata", longArrayOf(session, publisherid, logfilepath, locale.toLong(), flags.toLong()))
}

public fun EvtOpenSession(loginclass: EVT_LOGIN_CLASS, login: Long, timeout: UInt, flags: UInt): EVT_HANDLE {
    return Win32DynamicFfi.invoke("wevtapi.dll", "EvtOpenSession", longArrayOf(loginclass.toLong(), login, timeout.toLong(), flags.toLong()))
}

public fun EvtQuery(session: EVT_HANDLE, path: PCWSTR, query: PCWSTR, flags: UInt): EVT_HANDLE {
    return Win32DynamicFfi.invoke("wevtapi.dll", "EvtQuery", longArrayOf(session, path, query, flags.toLong()))
}

public fun EvtRender(context: EVT_HANDLE, fragment: EVT_HANDLE, flags: UInt, buffersize: UInt, buffer: Long, bufferused: Long, propertycount: Long): BOOL {
    return Win32DynamicFfi.invoke("wevtapi.dll", "EvtRender", longArrayOf(context, fragment, flags.toLong(), buffersize.toLong(), buffer, bufferused, propertycount)).toInt()
}

public fun EvtSaveChannelConfig(channelconfig: EVT_HANDLE, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("wevtapi.dll", "EvtSaveChannelConfig", longArrayOf(channelconfig, flags.toLong())).toInt()
}

public fun EvtSeek(resultset: EVT_HANDLE, position: Long, bookmark: EVT_HANDLE, timeout: UInt, flags: UInt): BOOL {
    return Win32DynamicFfi.invoke("wevtapi.dll", "EvtSeek", longArrayOf(resultset, position, bookmark, timeout.toLong(), flags.toLong())).toInt()
}

public fun EvtSetChannelConfigProperty(channelconfig: EVT_HANDLE, propertyid: EVT_CHANNEL_CONFIG_PROPERTY_ID, flags: UInt, propertyvalue: Long): BOOL {
    return Win32DynamicFfi.invoke("wevtapi.dll", "EvtSetChannelConfigProperty", longArrayOf(channelconfig, propertyid.toLong(), flags.toLong(), propertyvalue)).toInt()
}

public fun EvtSubscribe(session: EVT_HANDLE, signalevent: Foundation.HANDLE, channelpath: PCWSTR, query: PCWSTR, bookmark: EVT_HANDLE, context: Long, callback: EVT_SUBSCRIBE_CALLBACK, flags: UInt): EVT_HANDLE {
    return Win32DynamicFfi.invoke("wevtapi.dll", "EvtSubscribe", longArrayOf(session, Win32DynamicFfi.objectSlot(signalevent), channelpath, query, bookmark, context, Win32DynamicFfi.objectSlot(callback), flags.toLong()))
}

public fun EvtUpdateBookmark(bookmark: EVT_HANDLE, event: EVT_HANDLE): BOOL {
    return Win32DynamicFfi.invoke("wevtapi.dll", "EvtUpdateBookmark", longArrayOf(bookmark, event)).toInt()
}

public fun GetEventLogInformation(heventlog: Foundation.HANDLE, dwinfolevel: UInt, lpbuffer: Long, cbbufsize: UInt, pcbbytesneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetEventLogInformation", longArrayOf(Win32DynamicFfi.objectSlot(heventlog), dwinfolevel.toLong(), lpbuffer, cbbufsize.toLong(), pcbbytesneeded)).toInt()
}

public fun GetNumberOfEventLogRecords(heventlog: Foundation.HANDLE, numberofrecords: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetNumberOfEventLogRecords", longArrayOf(Win32DynamicFfi.objectSlot(heventlog), numberofrecords)).toInt()
}

public fun GetOldestEventLogRecord(heventlog: Foundation.HANDLE, oldestrecord: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "GetOldestEventLogRecord", longArrayOf(Win32DynamicFfi.objectSlot(heventlog), oldestrecord)).toInt()
}

public fun NotifyChangeEventLog(heventlog: Foundation.HANDLE, hevent: Foundation.HANDLE): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "NotifyChangeEventLog", longArrayOf(Win32DynamicFfi.objectSlot(heventlog), Win32DynamicFfi.objectSlot(hevent))).toInt()
}

public fun OpenBackupEventLogA(lpuncservername: PCSTR, lpfilename: PCSTR): Foundation.HANDLE {
    Win32DynamicFfi.invoke("advapi32.dll", "OpenBackupEventLogA", longArrayOf(lpuncservername, lpfilename))
    return Foundation.HANDLE()
}

public fun OpenBackupEventLogW(lpuncservername: PCWSTR, lpfilename: PCWSTR): Foundation.HANDLE {
    Win32DynamicFfi.invoke("advapi32.dll", "OpenBackupEventLogW", longArrayOf(lpuncservername, lpfilename))
    return Foundation.HANDLE()
}

public fun OpenEventLogA(lpuncservername: PCSTR, lpsourcename: PCSTR): Foundation.HANDLE {
    Win32DynamicFfi.invoke("advapi32.dll", "OpenEventLogA", longArrayOf(lpuncservername, lpsourcename))
    return Foundation.HANDLE()
}

public fun OpenEventLogW(lpuncservername: PCWSTR, lpsourcename: PCWSTR): Foundation.HANDLE {
    Win32DynamicFfi.invoke("advapi32.dll", "OpenEventLogW", longArrayOf(lpuncservername, lpsourcename))
    return Foundation.HANDLE()
}

public fun ReadEventLogA(heventlog: Foundation.HANDLE, dwreadflags: READ_EVENT_LOG_READ_FLAGS, dwrecordoffset: UInt, lpbuffer: Long, nnumberofbytestoread: UInt, pnbytesread: Long, pnminnumberofbytesneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "ReadEventLogA", longArrayOf(Win32DynamicFfi.objectSlot(heventlog), dwreadflags.toLong(), dwrecordoffset.toLong(), lpbuffer, nnumberofbytestoread.toLong(), pnbytesread, pnminnumberofbytesneeded)).toInt()
}

public fun ReadEventLogW(heventlog: Foundation.HANDLE, dwreadflags: READ_EVENT_LOG_READ_FLAGS, dwrecordoffset: UInt, lpbuffer: Long, nnumberofbytestoread: UInt, pnbytesread: Long, pnminnumberofbytesneeded: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "ReadEventLogW", longArrayOf(Win32DynamicFfi.objectSlot(heventlog), dwreadflags.toLong(), dwrecordoffset.toLong(), lpbuffer, nnumberofbytestoread.toLong(), pnbytesread, pnminnumberofbytesneeded)).toInt()
}

public fun RegisterEventSourceA(lpuncservername: PCSTR, lpsourcename: PCSTR): Foundation.HANDLE {
    Win32DynamicFfi.invoke("advapi32.dll", "RegisterEventSourceA", longArrayOf(lpuncservername, lpsourcename))
    return Foundation.HANDLE()
}

public fun RegisterEventSourceW(lpuncservername: PCWSTR, lpsourcename: PCWSTR): Foundation.HANDLE {
    Win32DynamicFfi.invoke("advapi32.dll", "RegisterEventSourceW", longArrayOf(lpuncservername, lpsourcename))
    return Foundation.HANDLE()
}

public fun ReportEventA(heventlog: Foundation.HANDLE, wtype: REPORT_EVENT_TYPE, wcategory: UShort, dweventid: UInt, lpusersid: Security.PSID, wnumstrings: UShort, dwdatasize: UInt, lpstrings: Long, lprawdata: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "ReportEventA", longArrayOf(Win32DynamicFfi.objectSlot(heventlog), wtype.toLong(), wcategory.toLong(), dweventid.toLong(), Win32DynamicFfi.objectSlot(lpusersid), wnumstrings.toLong(), dwdatasize.toLong(), lpstrings, lprawdata)).toInt()
}

public fun ReportEventW(heventlog: Foundation.HANDLE, wtype: REPORT_EVENT_TYPE, wcategory: UShort, dweventid: UInt, lpusersid: Security.PSID, wnumstrings: UShort, dwdatasize: UInt, lpstrings: Long, lprawdata: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "ReportEventW", longArrayOf(Win32DynamicFfi.objectSlot(heventlog), wtype.toLong(), wcategory.toLong(), dweventid.toLong(), Win32DynamicFfi.objectSlot(lpusersid), wnumstrings.toLong(), dwdatasize.toLong(), lpstrings, lprawdata)).toInt()
}
