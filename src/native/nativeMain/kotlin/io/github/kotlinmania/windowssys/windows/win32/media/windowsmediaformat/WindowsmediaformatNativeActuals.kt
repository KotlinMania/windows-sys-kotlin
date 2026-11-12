@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
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

public actual fun wMCreateBackupRestorer(pcallback: MutPtr<CVoid>, ppbackup: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32MediaWindowsmediaformatWMCreateBackupRestorer(pcallback.rawAddress.toCPointer<ByteVar>(), ppbackup.rawAddress.toCPointer<ByteVar>())

public actual fun wMCreateEditor(ppeditor: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32MediaWindowsmediaformatWMCreateEditor(ppeditor.rawAddress.toCPointer<ByteVar>())

public actual fun wMCreateIndexer(ppindexer: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32MediaWindowsmediaformatWMCreateIndexer(ppindexer.rawAddress.toCPointer<ByteVar>())

public actual fun wMCreateProfileManager(ppprofilemanager: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32MediaWindowsmediaformatWMCreateProfileManager(ppprofilemanager.rawAddress.toCPointer<ByteVar>())

public actual fun wMCreateReader(punkcert: MutPtr<CVoid>, dwrights: UInt, ppreader: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32MediaWindowsmediaformatWMCreateReader(punkcert.rawAddress.toCPointer<ByteVar>(), dwrights, ppreader.rawAddress.toCPointer<ByteVar>())

public actual fun wMCreateSyncReader(punkcert: MutPtr<CVoid>, dwrights: UInt, ppsyncreader: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32MediaWindowsmediaformatWMCreateSyncReader(punkcert.rawAddress.toCPointer<ByteVar>(), dwrights, ppsyncreader.rawAddress.toCPointer<ByteVar>())

public actual fun wMCreateWriter(punkcert: MutPtr<CVoid>, ppwriter: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32MediaWindowsmediaformatWMCreateWriter(punkcert.rawAddress.toCPointer<ByteVar>(), ppwriter.rawAddress.toCPointer<ByteVar>())

public actual fun wMCreateWriterFileSink(ppsink: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32MediaWindowsmediaformatWMCreateWriterFileSink(ppsink.rawAddress.toCPointer<ByteVar>())

public actual fun wMCreateWriterNetworkSink(ppsink: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32MediaWindowsmediaformatWMCreateWriterNetworkSink(ppsink.rawAddress.toCPointer<ByteVar>())

public actual fun wMCreateWriterPushSink(ppsink: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32MediaWindowsmediaformatWMCreateWriterPushSink(ppsink.rawAddress.toCPointer<ByteVar>())

public actual fun wMIsContentProtected(pwszfilename: Pcwstr, pfisprotected: MutPtr<Bool>): Hresult =
    windowssysWindowsWin32MediaWindowsmediaformatWMIsContentProtected(pwszfilename.rawAddress.toCPointer<ByteVar>(), pfisprotected.rawAddress.toCPointer<ByteVar>())
