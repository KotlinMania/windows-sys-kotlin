@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.media.windowsmediaformat

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun wMCreateBackupRestorer(pcallback: MutPtr, ppbackup: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaWindowsmediaformatWMCreateBackupRestorer")

public actual fun wMCreateEditor(ppeditor: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaWindowsmediaformatWMCreateEditor")

public actual fun wMCreateIndexer(ppindexer: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaWindowsmediaformatWMCreateIndexer")

public actual fun wMCreateProfileManager(ppprofilemanager: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaWindowsmediaformatWMCreateProfileManager")

public actual fun wMCreateReader(punkcert: MutPtr, dwrights: UInt, ppreader: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaWindowsmediaformatWMCreateReader")

public actual fun wMCreateSyncReader(punkcert: MutPtr, dwrights: UInt, ppsyncreader: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaWindowsmediaformatWMCreateSyncReader")

public actual fun wMCreateWriter(punkcert: MutPtr, ppwriter: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaWindowsmediaformatWMCreateWriter")

public actual fun wMCreateWriterFileSink(ppsink: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaWindowsmediaformatWMCreateWriterFileSink")

public actual fun wMCreateWriterNetworkSink(ppsink: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaWindowsmediaformatWMCreateWriterNetworkSink")

public actual fun wMCreateWriterPushSink(ppsink: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaWindowsmediaformatWMCreateWriterPushSink")

public actual fun wMIsContentProtected(pwszfilename: Pcwstr, pfisprotected: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32MediaWindowsmediaformatWMIsContentProtected")
