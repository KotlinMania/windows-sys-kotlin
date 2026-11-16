@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssysWindowsWin32MediaWindowsmediaformatWMCreateBackupRestorer
import io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssysWindowsWin32MediaWindowsmediaformatWMCreateEditor
import io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssysWindowsWin32MediaWindowsmediaformatWMCreateIndexer
import io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssysWindowsWin32MediaWindowsmediaformatWMCreateProfileManager
import io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssysWindowsWin32MediaWindowsmediaformatWMCreateReader
import io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssysWindowsWin32MediaWindowsmediaformatWMCreateSyncReader
import io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssysWindowsWin32MediaWindowsmediaformatWMCreateWriter
import io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssysWindowsWin32MediaWindowsmediaformatWMCreateWriterFileSink
import io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssysWindowsWin32MediaWindowsmediaformatWMCreateWriterNetworkSink
import io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssysWindowsWin32MediaWindowsmediaformatWMCreateWriterPushSink
import io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat.cinterop.windowssysWindowsWin32MediaWindowsmediaformatWMIsContentProtected
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun wMCreateBackupRestorer(pcallback: MutPtr, ppbackup: MutPtr): Hresult =
    windowssysWindowsWin32MediaWindowsmediaformatWMCreateBackupRestorer(pcallback.rawAddress.toCPointer<ByteVar>(), ppbackup.rawAddress.toCPointer<ByteVar>())

public actual fun wMCreateEditor(ppeditor: MutPtr): Hresult =
    windowssysWindowsWin32MediaWindowsmediaformatWMCreateEditor(ppeditor.rawAddress.toCPointer<ByteVar>())

public actual fun wMCreateIndexer(ppindexer: MutPtr): Hresult =
    windowssysWindowsWin32MediaWindowsmediaformatWMCreateIndexer(ppindexer.rawAddress.toCPointer<ByteVar>())

public actual fun wMCreateProfileManager(ppprofilemanager: MutPtr): Hresult =
    windowssysWindowsWin32MediaWindowsmediaformatWMCreateProfileManager(ppprofilemanager.rawAddress.toCPointer<ByteVar>())

public actual fun wMCreateReader(punkcert: MutPtr, dwrights: UInt, ppreader: MutPtr): Hresult =
    windowssysWindowsWin32MediaWindowsmediaformatWMCreateReader(punkcert.rawAddress.toCPointer<ByteVar>(), dwrights, ppreader.rawAddress.toCPointer<ByteVar>())

public actual fun wMCreateSyncReader(punkcert: MutPtr, dwrights: UInt, ppsyncreader: MutPtr): Hresult =
    windowssysWindowsWin32MediaWindowsmediaformatWMCreateSyncReader(punkcert.rawAddress.toCPointer<ByteVar>(), dwrights, ppsyncreader.rawAddress.toCPointer<ByteVar>())

public actual fun wMCreateWriter(punkcert: MutPtr, ppwriter: MutPtr): Hresult =
    windowssysWindowsWin32MediaWindowsmediaformatWMCreateWriter(punkcert.rawAddress.toCPointer<ByteVar>(), ppwriter.rawAddress.toCPointer<ByteVar>())

public actual fun wMCreateWriterFileSink(ppsink: MutPtr): Hresult =
    windowssysWindowsWin32MediaWindowsmediaformatWMCreateWriterFileSink(ppsink.rawAddress.toCPointer<ByteVar>())

public actual fun wMCreateWriterNetworkSink(ppsink: MutPtr): Hresult =
    windowssysWindowsWin32MediaWindowsmediaformatWMCreateWriterNetworkSink(ppsink.rawAddress.toCPointer<ByteVar>())

public actual fun wMCreateWriterPushSink(ppsink: MutPtr): Hresult =
    windowssysWindowsWin32MediaWindowsmediaformatWMCreateWriterPushSink(ppsink.rawAddress.toCPointer<ByteVar>())

public actual fun wMIsContentProtected(pwszfilename: Pcwstr, pfisprotected: MutPtr): Hresult =
    windowssysWindowsWin32MediaWindowsmediaformatWMIsContentProtected(pwszfilename.rawAddress.toCPointer<ByteVar>(), pfisprotected.rawAddress.toCPointer<ByteVar>())
