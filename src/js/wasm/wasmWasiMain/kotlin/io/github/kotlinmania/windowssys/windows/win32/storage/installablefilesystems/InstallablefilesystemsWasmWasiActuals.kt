@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public actual fun filterAttach(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpinstancename: Pcwstr, dwcreatedinstancenamelength: UInt, lpcreatedinstancename: Pwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun filterAttachAtAltitude(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpaltitude: Pcwstr, lpinstancename: Pcwstr, dwcreatedinstancenamelength: UInt, lpcreatedinstancename: Pwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun filterClose(hfilter: Hfilter): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun filterConnectCommunicationPort(lpportname: Pcwstr, dwoptions: UInt, lpcontext: COpaquePointer?, wsizeofcontext: UShort, lpsecurityattributes: COpaquePointer?, hport: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun filterCreate(lpfiltername: Pcwstr, hfilter: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun filterDetach(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpinstancename: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun filterFindClose(hfilterfind: Handle): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun filterFindFirst(dwinformationclass: FilterInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpfilterfind: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun filterFindNext(hfilterfind: Handle, dwinformationclass: FilterInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun filterGetDosName(lpvolumename: Pcwstr, lpdosname: Pwstr, dwdosnamebuffersize: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun filterGetInformation(hfilter: Hfilter, dwinformationclass: FilterInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun filterGetMessage(hport: Handle, lpmessagebuffer: COpaquePointer?, dwmessagebuffersize: UInt, lpoverlapped: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun filterInstanceClose(hinstance: HfilterInstance): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun filterInstanceCreate(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpinstancename: Pcwstr, hinstance: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun filterInstanceFindClose(hfilterinstancefind: Handle): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun filterInstanceFindFirst(lpfiltername: Pcwstr, dwinformationclass: InstanceInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpfilterinstancefind: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun filterInstanceFindNext(hfilterinstancefind: Handle, dwinformationclass: InstanceInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun filterInstanceGetInformation(hinstance: HfilterInstance, dwinformationclass: InstanceInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun filterLoad(lpfiltername: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun filterReplyMessage(hport: Handle, lpreplybuffer: COpaquePointer?, dwreplybuffersize: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun filterSendMessage(hport: Handle, lpinbuffer: COpaquePointer?, dwinbuffersize: UInt, lpoutbuffer: COpaquePointer?, dwoutbuffersize: UInt, lpbytesreturned: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun filterUnload(lpfiltername: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun filterVolumeFindClose(hvolumefind: Handle): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun filterVolumeFindFirst(dwinformationclass: FilterVolumeInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpvolumefind: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun filterVolumeFindNext(hvolumefind: Handle, dwinformationclass: FilterVolumeInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun filterVolumeInstanceFindClose(hvolumeinstancefind: Handle): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun filterVolumeInstanceFindFirst(lpvolumename: Pcwstr, dwinformationclass: InstanceInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?, lpvolumeinstancefind: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun filterVolumeInstanceFindNext(hvolumeinstancefind: Handle, dwinformationclass: InstanceInformationClass, lpbuffer: COpaquePointer?, dwbuffersize: UInt, lpbytesreturned: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
