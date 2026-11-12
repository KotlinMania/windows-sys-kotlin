@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

private object WindowsWin32MediaWindowsmediaformatJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32MediaWindowsmediaformatWMCreateBackupRestorer(pcallback: Long, ppbackup: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaWindowsmediaformatWMCreateEditor(ppeditor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaWindowsmediaformatWMCreateIndexer(ppindexer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaWindowsmediaformatWMCreateProfileManager(ppprofilemanager: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaWindowsmediaformatWMCreateReader(punkcert: Long, dwrights: Int, ppreader: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaWindowsmediaformatWMCreateSyncReader(punkcert: Long, dwrights: Int, ppsyncreader: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaWindowsmediaformatWMCreateWriter(punkcert: Long, ppwriter: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaWindowsmediaformatWMCreateWriterFileSink(ppsink: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaWindowsmediaformatWMCreateWriterNetworkSink(ppsink: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaWindowsmediaformatWMCreateWriterPushSink(ppsink: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32MediaWindowsmediaformatWMIsContentProtected(pwszfilename: Long, pfisprotected: Long): Int
}

public actual fun wMCreateBackupRestorer(pcallback: MutPtr, ppbackup: MutPtr): Hresult =
    WindowsWin32MediaWindowsmediaformatJniBridge.windowssysWindowsWin32MediaWindowsmediaformatWMCreateBackupRestorer(pcallback.rawAddress, ppbackup.rawAddress)

public actual fun wMCreateEditor(ppeditor: MutPtr): Hresult =
    WindowsWin32MediaWindowsmediaformatJniBridge.windowssysWindowsWin32MediaWindowsmediaformatWMCreateEditor(ppeditor.rawAddress)

public actual fun wMCreateIndexer(ppindexer: MutPtr): Hresult =
    WindowsWin32MediaWindowsmediaformatJniBridge.windowssysWindowsWin32MediaWindowsmediaformatWMCreateIndexer(ppindexer.rawAddress)

public actual fun wMCreateProfileManager(ppprofilemanager: MutPtr): Hresult =
    WindowsWin32MediaWindowsmediaformatJniBridge.windowssysWindowsWin32MediaWindowsmediaformatWMCreateProfileManager(ppprofilemanager.rawAddress)

public actual fun wMCreateReader(punkcert: MutPtr, dwrights: UInt, ppreader: MutPtr): Hresult =
    WindowsWin32MediaWindowsmediaformatJniBridge.windowssysWindowsWin32MediaWindowsmediaformatWMCreateReader(punkcert.rawAddress, dwrights.toInt(), ppreader.rawAddress)

public actual fun wMCreateSyncReader(punkcert: MutPtr, dwrights: UInt, ppsyncreader: MutPtr): Hresult =
    WindowsWin32MediaWindowsmediaformatJniBridge.windowssysWindowsWin32MediaWindowsmediaformatWMCreateSyncReader(punkcert.rawAddress, dwrights.toInt(), ppsyncreader.rawAddress)

public actual fun wMCreateWriter(punkcert: MutPtr, ppwriter: MutPtr): Hresult =
    WindowsWin32MediaWindowsmediaformatJniBridge.windowssysWindowsWin32MediaWindowsmediaformatWMCreateWriter(punkcert.rawAddress, ppwriter.rawAddress)

public actual fun wMCreateWriterFileSink(ppsink: MutPtr): Hresult =
    WindowsWin32MediaWindowsmediaformatJniBridge.windowssysWindowsWin32MediaWindowsmediaformatWMCreateWriterFileSink(ppsink.rawAddress)

public actual fun wMCreateWriterNetworkSink(ppsink: MutPtr): Hresult =
    WindowsWin32MediaWindowsmediaformatJniBridge.windowssysWindowsWin32MediaWindowsmediaformatWMCreateWriterNetworkSink(ppsink.rawAddress)

public actual fun wMCreateWriterPushSink(ppsink: MutPtr): Hresult =
    WindowsWin32MediaWindowsmediaformatJniBridge.windowssysWindowsWin32MediaWindowsmediaformatWMCreateWriterPushSink(ppsink.rawAddress)

public actual fun wMIsContentProtected(pwszfilename: Pcwstr, pfisprotected: MutPtr): Hresult =
    WindowsWin32MediaWindowsmediaformatJniBridge.windowssysWindowsWin32MediaWindowsmediaformatWMIsContentProtected(pwszfilename.rawAddress, pfisprotected.rawAddress)
