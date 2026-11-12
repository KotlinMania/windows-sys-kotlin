@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWin32SystemEventlogJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "windowssys_jni.dll"
                "macos" -> "libwindowssys_jni.dylib"
                else -> "libwindowssys_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/windowssys/native/$hostPlatform-$hostArch/$libFileName"
        val stream = WindowsWin32SystemEventlogJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("windowssys_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogBackupEventLogA(heventlog: Long, lpbackupfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogBackupEventLogW(heventlog: Long, lpbackupfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogClearEventLogA(heventlog: Long, lpbackupfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogClearEventLogW(heventlog: Long, lpbackupfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogCloseEventLog(heventlog: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogDeregisterEventSource(heventlog: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogEvtArchiveExportedLog(session: Long, logfilepath: Long, locale: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogEvtCancel(obj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogEvtClearLog(session: Long, channelpath: Long, targetfilepath: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogEvtClose(obj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogEvtCreateBookmark(bookmarkxml: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogEvtCreateRenderContext(valuepathscount: Int, valuepaths: Long, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogEvtExportLog(session: Long, path: Long, query: Long, targetfilepath: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogEvtFormatMessage(publishermetadata: Long, event: Long, messageid: Int, valuecount: Int, values: Long, flags: Int, buffersize: Int, buffer: Long, bufferused: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogEvtGetChannelConfigProperty(channelconfig: Long, propertyid: Int, flags: Int, propertyvaluebuffersize: Int, propertyvaluebuffer: Long, propertyvaluebufferused: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogEvtGetEventInfo(event: Long, propertyid: Int, propertyvaluebuffersize: Int, propertyvaluebuffer: Long, propertyvaluebufferused: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogEvtGetEventMetadataProperty(eventmetadata: Long, propertyid: Int, flags: Int, eventmetadatapropertybuffersize: Int, eventmetadatapropertybuffer: Long, eventmetadatapropertybufferused: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogEvtGetExtendedStatus(buffersize: Int, buffer: Long, bufferused: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogEvtGetLogInfo(log: Long, propertyid: Int, propertyvaluebuffersize: Int, propertyvaluebuffer: Long, propertyvaluebufferused: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogEvtGetObjectArrayProperty(objectarray: Long, propertyid: Int, arrayindex: Int, flags: Int, propertyvaluebuffersize: Int, propertyvaluebuffer: Long, propertyvaluebufferused: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogEvtGetObjectArraySize(objectarray: Long, objectarraysize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogEvtGetPublisherMetadataProperty(publishermetadata: Long, propertyid: Int, flags: Int, publishermetadatapropertybuffersize: Int, publishermetadatapropertybuffer: Long, publishermetadatapropertybufferused: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogEvtGetQueryInfo(queryorsubscription: Long, propertyid: Int, propertyvaluebuffersize: Int, propertyvaluebuffer: Long, propertyvaluebufferused: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogEvtNext(resultset: Long, eventssize: Int, events: Long, timeout: Int, flags: Int, returned: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogEvtNextChannelPath(channelenum: Long, channelpathbuffersize: Int, channelpathbuffer: Long, channelpathbufferused: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogEvtNextEventMetadata(eventmetadataenum: Long, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogEvtNextPublisherId(publisherenum: Long, publisheridbuffersize: Int, publisheridbuffer: Long, publisheridbufferused: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogEvtOpenChannelConfig(session: Long, channelpath: Long, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogEvtOpenChannelEnum(session: Long, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogEvtOpenEventMetadataEnum(publishermetadata: Long, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogEvtOpenLog(session: Long, path: Long, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogEvtOpenPublisherEnum(session: Long, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogEvtOpenPublisherMetadata(session: Long, publisherid: Long, logfilepath: Long, locale: Int, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogEvtOpenSession(loginclass: Int, login: Long, timeout: Int, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogEvtQuery(session: Long, path: Long, query: Long, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogEvtRender(context: Long, fragment: Long, flags: Int, buffersize: Int, buffer: Long, bufferused: Long, propertycount: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogEvtSaveChannelConfig(channelconfig: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogEvtSeek(resultset: Long, position: Long, bookmark: Long, timeout: Int, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogEvtSetChannelConfigProperty(channelconfig: Long, propertyid: Int, flags: Int, propertyvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogEvtSubscribe(session: Long, signalevent: Long, channelpath: Long, query: Long, bookmark: Long, context: Long, callback: Long, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogEvtUpdateBookmark(bookmark: Long, event: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogGetEventLogInformation(heventlog: Long, dwinfolevel: Int, lpbuffer: Long, cbbufsize: Int, pcbbytesneeded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogGetNumberOfEventLogRecords(heventlog: Long, numberofrecords: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogGetOldestEventLogRecord(heventlog: Long, oldestrecord: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogNotifyChangeEventLog(heventlog: Long, hevent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogOpenBackupEventLogA(lpuncservername: Long, lpfilename: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogOpenBackupEventLogW(lpuncservername: Long, lpfilename: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogOpenEventLogA(lpuncservername: Long, lpsourcename: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogOpenEventLogW(lpuncservername: Long, lpsourcename: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogReadEventLogA(heventlog: Long, dwreadflags: Int, dwrecordoffset: Int, lpbuffer: Long, nnumberofbytestoread: Int, pnbytesread: Long, pnminnumberofbytesneeded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogReadEventLogW(heventlog: Long, dwreadflags: Int, dwrecordoffset: Int, lpbuffer: Long, nnumberofbytestoread: Int, pnbytesread: Long, pnminnumberofbytesneeded: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogRegisterEventSourceA(lpuncservername: Long, lpsourcename: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogRegisterEventSourceW(lpuncservername: Long, lpsourcename: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogReportEventA(heventlog: Long, wtype: Short, wcategory: Short, dweventid: Int, lpusersid: Long, wnumstrings: Short, dwdatasize: Int, lpstrings: Long, lprawdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemEventlogReportEventW(heventlog: Long, wtype: Short, wcategory: Short, dweventid: Int, lpusersid: Long, wnumstrings: Short, dwdatasize: Int, lpstrings: Long, lprawdata: Long): Int
}

public actual fun backupEventLogA(heventlog: Handle, lpbackupfilename: Pcstr): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogBackupEventLogA(heventlog.rawAddress, lpbackupfilename.rawAddress)

public actual fun backupEventLogW(heventlog: Handle, lpbackupfilename: Pcwstr): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogBackupEventLogW(heventlog.rawAddress, lpbackupfilename.rawAddress)

public actual fun clearEventLogA(heventlog: Handle, lpbackupfilename: Pcstr): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogClearEventLogA(heventlog.rawAddress, lpbackupfilename.rawAddress)

public actual fun clearEventLogW(heventlog: Handle, lpbackupfilename: Pcwstr): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogClearEventLogW(heventlog.rawAddress, lpbackupfilename.rawAddress)

public actual fun closeEventLog(heventlog: Handle): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogCloseEventLog(heventlog.rawAddress)

public actual fun deregisterEventSource(heventlog: Handle): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogDeregisterEventSource(heventlog.rawAddress)

public actual fun evtArchiveExportedLog(session: EvtHandle, logfilepath: Pcwstr, locale: UInt, flags: UInt): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogEvtArchiveExportedLog(session, logfilepath.rawAddress, locale.toInt(), flags.toInt())

public actual fun evtCancel(obj: EvtHandle): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogEvtCancel(obj)

public actual fun evtClearLog(session: EvtHandle, channelpath: Pcwstr, targetfilepath: Pcwstr, flags: UInt): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogEvtClearLog(session, channelpath.rawAddress, targetfilepath.rawAddress, flags.toInt())

public actual fun evtClose(obj: EvtHandle): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogEvtClose(obj)

public actual fun evtCreateBookmark(bookmarkxml: Pcwstr): EvtHandle =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogEvtCreateBookmark(bookmarkxml.rawAddress)

public actual fun evtCreateRenderContext(valuepathscount: UInt, valuepaths: ConstPtr<Pcwstr>, flags: UInt): EvtHandle =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogEvtCreateRenderContext(valuepathscount.toInt(), valuepaths.rawAddress, flags.toInt())

public actual fun evtExportLog(session: EvtHandle, path: Pcwstr, query: Pcwstr, targetfilepath: Pcwstr, flags: UInt): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogEvtExportLog(session, path.rawAddress, query.rawAddress, targetfilepath.rawAddress, flags.toInt())

public actual fun evtFormatMessage(publishermetadata: EvtHandle, event: EvtHandle, messageid: UInt, valuecount: UInt, values: ConstPtr<EvtVariant>, flags: UInt, buffersize: UInt, buffer: Pwstr, bufferused: MutPtr<UInt>): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogEvtFormatMessage(publishermetadata, event, messageid.toInt(), valuecount.toInt(), values.rawAddress, flags.toInt(), buffersize.toInt(), buffer.rawAddress, bufferused.rawAddress)

public actual fun evtGetChannelConfigProperty(channelconfig: EvtHandle, propertyid: EvtChannelConfigPropertyId, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: MutPtr<EvtVariant>, propertyvaluebufferused: MutPtr<UInt>): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogEvtGetChannelConfigProperty(channelconfig, propertyid, flags.toInt(), propertyvaluebuffersize.toInt(), propertyvaluebuffer.rawAddress, propertyvaluebufferused.rawAddress)

public actual fun evtGetEventInfo(event: EvtHandle, propertyid: EvtEventPropertyId, propertyvaluebuffersize: UInt, propertyvaluebuffer: MutPtr<EvtVariant>, propertyvaluebufferused: MutPtr<UInt>): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogEvtGetEventInfo(event, propertyid, propertyvaluebuffersize.toInt(), propertyvaluebuffer.rawAddress, propertyvaluebufferused.rawAddress)

public actual fun evtGetEventMetadataProperty(eventmetadata: EvtHandle, propertyid: EvtEventMetadataPropertyId, flags: UInt, eventmetadatapropertybuffersize: UInt, eventmetadatapropertybuffer: MutPtr<EvtVariant>, eventmetadatapropertybufferused: MutPtr<UInt>): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogEvtGetEventMetadataProperty(eventmetadata, propertyid, flags.toInt(), eventmetadatapropertybuffersize.toInt(), eventmetadatapropertybuffer.rawAddress, eventmetadatapropertybufferused.rawAddress)

public actual fun evtGetExtendedStatus(buffersize: UInt, buffer: Pwstr, bufferused: MutPtr<UInt>): UInt =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogEvtGetExtendedStatus(buffersize.toInt(), buffer.rawAddress, bufferused.rawAddress).toUInt()

public actual fun evtGetLogInfo(log: EvtHandle, propertyid: EvtLogPropertyId, propertyvaluebuffersize: UInt, propertyvaluebuffer: MutPtr<EvtVariant>, propertyvaluebufferused: MutPtr<UInt>): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogEvtGetLogInfo(log, propertyid, propertyvaluebuffersize.toInt(), propertyvaluebuffer.rawAddress, propertyvaluebufferused.rawAddress)

public actual fun evtGetObjectArrayProperty(objectarray: Long, propertyid: UInt, arrayindex: UInt, flags: UInt, propertyvaluebuffersize: UInt, propertyvaluebuffer: MutPtr<EvtVariant>, propertyvaluebufferused: MutPtr<UInt>): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogEvtGetObjectArrayProperty(objectarray, propertyid.toInt(), arrayindex.toInt(), flags.toInt(), propertyvaluebuffersize.toInt(), propertyvaluebuffer.rawAddress, propertyvaluebufferused.rawAddress)

public actual fun evtGetObjectArraySize(objectarray: Long, objectarraysize: MutPtr<UInt>): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogEvtGetObjectArraySize(objectarray, objectarraysize.rawAddress)

public actual fun evtGetPublisherMetadataProperty(publishermetadata: EvtHandle, propertyid: EvtPublisherMetadataPropertyId, flags: UInt, publishermetadatapropertybuffersize: UInt, publishermetadatapropertybuffer: MutPtr<EvtVariant>, publishermetadatapropertybufferused: MutPtr<UInt>): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogEvtGetPublisherMetadataProperty(publishermetadata, propertyid, flags.toInt(), publishermetadatapropertybuffersize.toInt(), publishermetadatapropertybuffer.rawAddress, publishermetadatapropertybufferused.rawAddress)

public actual fun evtGetQueryInfo(queryorsubscription: EvtHandle, propertyid: EvtQueryPropertyId, propertyvaluebuffersize: UInt, propertyvaluebuffer: MutPtr<EvtVariant>, propertyvaluebufferused: MutPtr<UInt>): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogEvtGetQueryInfo(queryorsubscription, propertyid, propertyvaluebuffersize.toInt(), propertyvaluebuffer.rawAddress, propertyvaluebufferused.rawAddress)

public actual fun evtNext(resultset: EvtHandle, eventssize: UInt, events: MutPtr<Long>, timeout: UInt, flags: UInt, returned: MutPtr<UInt>): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogEvtNext(resultset, eventssize.toInt(), events.rawAddress, timeout.toInt(), flags.toInt(), returned.rawAddress)

public actual fun evtNextChannelPath(channelenum: EvtHandle, channelpathbuffersize: UInt, channelpathbuffer: Pwstr, channelpathbufferused: MutPtr<UInt>): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogEvtNextChannelPath(channelenum, channelpathbuffersize.toInt(), channelpathbuffer.rawAddress, channelpathbufferused.rawAddress)

public actual fun evtNextEventMetadata(eventmetadataenum: EvtHandle, flags: UInt): EvtHandle =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogEvtNextEventMetadata(eventmetadataenum, flags.toInt())

public actual fun evtNextPublisherId(publisherenum: EvtHandle, publisheridbuffersize: UInt, publisheridbuffer: Pwstr, publisheridbufferused: MutPtr<UInt>): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogEvtNextPublisherId(publisherenum, publisheridbuffersize.toInt(), publisheridbuffer.rawAddress, publisheridbufferused.rawAddress)

public actual fun evtOpenChannelConfig(session: EvtHandle, channelpath: Pcwstr, flags: UInt): EvtHandle =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogEvtOpenChannelConfig(session, channelpath.rawAddress, flags.toInt())

public actual fun evtOpenChannelEnum(session: EvtHandle, flags: UInt): EvtHandle =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogEvtOpenChannelEnum(session, flags.toInt())

public actual fun evtOpenEventMetadataEnum(publishermetadata: EvtHandle, flags: UInt): EvtHandle =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogEvtOpenEventMetadataEnum(publishermetadata, flags.toInt())

public actual fun evtOpenLog(session: EvtHandle, path: Pcwstr, flags: UInt): EvtHandle =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogEvtOpenLog(session, path.rawAddress, flags.toInt())

public actual fun evtOpenPublisherEnum(session: EvtHandle, flags: UInt): EvtHandle =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogEvtOpenPublisherEnum(session, flags.toInt())

public actual fun evtOpenPublisherMetadata(session: EvtHandle, publisherid: Pcwstr, logfilepath: Pcwstr, locale: UInt, flags: UInt): EvtHandle =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogEvtOpenPublisherMetadata(session, publisherid.rawAddress, logfilepath.rawAddress, locale.toInt(), flags.toInt())

public actual fun evtOpenSession(loginclass: EvtLoginClass, login: ConstPtr<CVoid>, timeout: UInt, flags: UInt): EvtHandle =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogEvtOpenSession(loginclass, login.rawAddress, timeout.toInt(), flags.toInt())

public actual fun evtQuery(session: EvtHandle, path: Pcwstr, query: Pcwstr, flags: UInt): EvtHandle =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogEvtQuery(session, path.rawAddress, query.rawAddress, flags.toInt())

public actual fun evtRender(context: EvtHandle, fragment: EvtHandle, flags: UInt, buffersize: UInt, buffer: MutPtr<CVoid>, bufferused: MutPtr<UInt>, propertycount: MutPtr<UInt>): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogEvtRender(context, fragment, flags.toInt(), buffersize.toInt(), buffer.rawAddress, bufferused.rawAddress, propertycount.rawAddress)

public actual fun evtSaveChannelConfig(channelconfig: EvtHandle, flags: UInt): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogEvtSaveChannelConfig(channelconfig, flags.toInt())

public actual fun evtSeek(resultset: EvtHandle, position: Long, bookmark: EvtHandle, timeout: UInt, flags: UInt): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogEvtSeek(resultset, position, bookmark, timeout.toInt(), flags.toInt())

public actual fun evtSetChannelConfigProperty(channelconfig: EvtHandle, propertyid: EvtChannelConfigPropertyId, flags: UInt, propertyvalue: ConstPtr<EvtVariant>): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogEvtSetChannelConfigProperty(channelconfig, propertyid, flags.toInt(), propertyvalue.rawAddress)

public actual fun evtSubscribe(session: EvtHandle, signalevent: Handle, channelpath: Pcwstr, query: Pcwstr, bookmark: EvtHandle, context: ConstPtr<CVoid>, callback: EvtSubscribeCallback, flags: UInt): EvtHandle =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogEvtSubscribe(session, signalevent.rawAddress, channelpath.rawAddress, query.rawAddress, bookmark, context.rawAddress, 0L, flags.toInt())

public actual fun evtUpdateBookmark(bookmark: EvtHandle, event: EvtHandle): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogEvtUpdateBookmark(bookmark, event)

public actual fun getEventLogInformation(heventlog: Handle, dwinfolevel: UInt, lpbuffer: MutPtr<CVoid>, cbbufsize: UInt, pcbbytesneeded: MutPtr<UInt>): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogGetEventLogInformation(heventlog.rawAddress, dwinfolevel.toInt(), lpbuffer.rawAddress, cbbufsize.toInt(), pcbbytesneeded.rawAddress)

public actual fun getNumberOfEventLogRecords(heventlog: Handle, numberofrecords: MutPtr<UInt>): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogGetNumberOfEventLogRecords(heventlog.rawAddress, numberofrecords.rawAddress)

public actual fun getOldestEventLogRecord(heventlog: Handle, oldestrecord: MutPtr<UInt>): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogGetOldestEventLogRecord(heventlog.rawAddress, oldestrecord.rawAddress)

public actual fun notifyChangeEventLog(heventlog: Handle, hevent: Handle): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogNotifyChangeEventLog(heventlog.rawAddress, hevent.rawAddress)

public actual fun openBackupEventLogA(lpuncservername: Pcstr, lpfilename: Pcstr): Handle =
    MutPtr(WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogOpenBackupEventLogA(lpuncservername.rawAddress, lpfilename.rawAddress))

public actual fun openBackupEventLogW(lpuncservername: Pcwstr, lpfilename: Pcwstr): Handle =
    MutPtr(WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogOpenBackupEventLogW(lpuncservername.rawAddress, lpfilename.rawAddress))

public actual fun openEventLogA(lpuncservername: Pcstr, lpsourcename: Pcstr): Handle =
    MutPtr(WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogOpenEventLogA(lpuncservername.rawAddress, lpsourcename.rawAddress))

public actual fun openEventLogW(lpuncservername: Pcwstr, lpsourcename: Pcwstr): Handle =
    MutPtr(WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogOpenEventLogW(lpuncservername.rawAddress, lpsourcename.rawAddress))

public actual fun readEventLogA(heventlog: Handle, dwreadflags: ReadEventLogReadFlags, dwrecordoffset: UInt, lpbuffer: MutPtr<CVoid>, nnumberofbytestoread: UInt, pnbytesread: MutPtr<UInt>, pnminnumberofbytesneeded: MutPtr<UInt>): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogReadEventLogA(heventlog.rawAddress, dwreadflags.toInt(), dwrecordoffset.toInt(), lpbuffer.rawAddress, nnumberofbytestoread.toInt(), pnbytesread.rawAddress, pnminnumberofbytesneeded.rawAddress)

public actual fun readEventLogW(heventlog: Handle, dwreadflags: ReadEventLogReadFlags, dwrecordoffset: UInt, lpbuffer: MutPtr<CVoid>, nnumberofbytestoread: UInt, pnbytesread: MutPtr<UInt>, pnminnumberofbytesneeded: MutPtr<UInt>): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogReadEventLogW(heventlog.rawAddress, dwreadflags.toInt(), dwrecordoffset.toInt(), lpbuffer.rawAddress, nnumberofbytestoread.toInt(), pnbytesread.rawAddress, pnminnumberofbytesneeded.rawAddress)

public actual fun registerEventSourceA(lpuncservername: Pcstr, lpsourcename: Pcstr): Handle =
    MutPtr(WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogRegisterEventSourceA(lpuncservername.rawAddress, lpsourcename.rawAddress))

public actual fun registerEventSourceW(lpuncservername: Pcwstr, lpsourcename: Pcwstr): Handle =
    MutPtr(WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogRegisterEventSourceW(lpuncservername.rawAddress, lpsourcename.rawAddress))

public actual fun reportEventA(heventlog: Handle, wtype: ReportEventType, wcategory: UShort, dweventid: UInt, lpusersid: Psid, wnumstrings: UShort, dwdatasize: UInt, lpstrings: ConstPtr<Pcstr>, lprawdata: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogReportEventA(heventlog.rawAddress, wtype.toShort(), wcategory.toShort(), dweventid.toInt(), lpusersid.rawAddress, wnumstrings.toShort(), dwdatasize.toInt(), lpstrings.rawAddress, lprawdata.rawAddress)

public actual fun reportEventW(heventlog: Handle, wtype: ReportEventType, wcategory: UShort, dweventid: UInt, lpusersid: Psid, wnumstrings: UShort, dwdatasize: UInt, lpstrings: ConstPtr<Pcwstr>, lprawdata: ConstPtr<CVoid>): Bool =
    WindowsWin32SystemEventlogJniBridge.windowssysWindowsWin32SystemEventlogReportEventW(heventlog.rawAddress, wtype.toShort(), wcategory.toShort(), dweventid.toInt(), lpusersid.rawAddress, wnumstrings.toShort(), dwdatasize.toInt(), lpstrings.rawAddress, lprawdata.rawAddress)
