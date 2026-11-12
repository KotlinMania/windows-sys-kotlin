@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun filterAttach(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpinstancename: Pcwstr, dwcreatedinstancenamelength: UInt, lpcreatedinstancename: Pwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageInstallablefilesystemsFilterAttach")

public actual fun filterAttachAtAltitude(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpaltitude: Pcwstr, lpinstancename: Pcwstr, dwcreatedinstancenamelength: UInt, lpcreatedinstancename: Pwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageInstallablefilesystemsFilterAttachAtAltitude")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageInstallablefilesystemsFilterClose")
private external fun wasiWindowssysWindowsWin32StorageInstallablefilesystemsFilterClose(hfilter: Long): Int

public actual fun filterClose(hfilter: Hfilter): Hresult =
    wasiWindowssysWindowsWin32StorageInstallablefilesystemsFilterClose(hfilter)

public actual fun filterConnectCommunicationPort(lpportname: Pcwstr, dwoptions: UInt, lpcontext: ConstPtr, wsizeofcontext: UShort, lpsecurityattributes: ConstPtr, hport: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageInstallablefilesystemsFilterConnectCommunicationPort")

public actual fun filterCreate(lpfiltername: Pcwstr, hfilter: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageInstallablefilesystemsFilterCreate")

public actual fun filterDetach(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpinstancename: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageInstallablefilesystemsFilterDetach")

public actual fun filterFindClose(hfilterfind: Handle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageInstallablefilesystemsFilterFindClose")

public actual fun filterFindFirst(dwinformationclass: FilterInformationClass, lpbuffer: MutPtr, dwbuffersize: UInt, lpbytesreturned: MutPtr, lpfilterfind: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageInstallablefilesystemsFilterFindFirst")

public actual fun filterFindNext(hfilterfind: Handle, dwinformationclass: FilterInformationClass, lpbuffer: MutPtr, dwbuffersize: UInt, lpbytesreturned: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageInstallablefilesystemsFilterFindNext")

public actual fun filterGetDosName(lpvolumename: Pcwstr, lpdosname: Pwstr, dwdosnamebuffersize: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageInstallablefilesystemsFilterGetDosName")

public actual fun filterGetInformation(hfilter: Hfilter, dwinformationclass: FilterInformationClass, lpbuffer: MutPtr, dwbuffersize: UInt, lpbytesreturned: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageInstallablefilesystemsFilterGetInformation")

public actual fun filterGetMessage(hport: Handle, lpmessagebuffer: MutPtr, dwmessagebuffersize: UInt, lpoverlapped: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageInstallablefilesystemsFilterGetMessage")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceClose")
private external fun wasiWindowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceClose(hinstance: Long): Int

public actual fun filterInstanceClose(hinstance: HfilterInstance): Hresult =
    wasiWindowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceClose(hinstance)

public actual fun filterInstanceCreate(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpinstancename: Pcwstr, hinstance: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceCreate")

public actual fun filterInstanceFindClose(hfilterinstancefind: Handle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceFindClose")

public actual fun filterInstanceFindFirst(lpfiltername: Pcwstr, dwinformationclass: InstanceInformationClass, lpbuffer: MutPtr, dwbuffersize: UInt, lpbytesreturned: MutPtr, lpfilterinstancefind: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceFindFirst")

public actual fun filterInstanceFindNext(hfilterinstancefind: Handle, dwinformationclass: InstanceInformationClass, lpbuffer: MutPtr, dwbuffersize: UInt, lpbytesreturned: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceFindNext")

public actual fun filterInstanceGetInformation(hinstance: HfilterInstance, dwinformationclass: InstanceInformationClass, lpbuffer: MutPtr, dwbuffersize: UInt, lpbytesreturned: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceGetInformation")

public actual fun filterLoad(lpfiltername: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageInstallablefilesystemsFilterLoad")

public actual fun filterReplyMessage(hport: Handle, lpreplybuffer: ConstPtr, dwreplybuffersize: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageInstallablefilesystemsFilterReplyMessage")

public actual fun filterSendMessage(hport: Handle, lpinbuffer: ConstPtr, dwinbuffersize: UInt, lpoutbuffer: MutPtr, dwoutbuffersize: UInt, lpbytesreturned: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageInstallablefilesystemsFilterSendMessage")

public actual fun filterUnload(lpfiltername: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageInstallablefilesystemsFilterUnload")

public actual fun filterVolumeFindClose(hvolumefind: Handle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeFindClose")

public actual fun filterVolumeFindFirst(dwinformationclass: FilterVolumeInformationClass, lpbuffer: MutPtr, dwbuffersize: UInt, lpbytesreturned: MutPtr, lpvolumefind: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeFindFirst")

public actual fun filterVolumeFindNext(hvolumefind: Handle, dwinformationclass: FilterVolumeInformationClass, lpbuffer: MutPtr, dwbuffersize: UInt, lpbytesreturned: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeFindNext")

public actual fun filterVolumeInstanceFindClose(hvolumeinstancefind: Handle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeInstanceFindClose")

public actual fun filterVolumeInstanceFindFirst(lpvolumename: Pcwstr, dwinformationclass: InstanceInformationClass, lpbuffer: MutPtr, dwbuffersize: UInt, lpbytesreturned: MutPtr, lpvolumeinstancefind: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeInstanceFindFirst")

public actual fun filterVolumeInstanceFindNext(hvolumeinstancefind: Handle, dwinformationclass: InstanceInformationClass, lpbuffer: MutPtr, dwbuffersize: UInt, lpbytesreturned: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeInstanceFindNext")
