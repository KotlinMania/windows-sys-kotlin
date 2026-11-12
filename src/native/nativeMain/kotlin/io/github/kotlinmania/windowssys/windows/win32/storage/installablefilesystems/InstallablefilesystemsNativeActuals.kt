@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityAttributes
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssysWindowsWin32StorageInstallablefilesystemsFilterAttach
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssysWindowsWin32StorageInstallablefilesystemsFilterAttachAtAltitude
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssysWindowsWin32StorageInstallablefilesystemsFilterClose
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssysWindowsWin32StorageInstallablefilesystemsFilterConnectCommunicationPort
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssysWindowsWin32StorageInstallablefilesystemsFilterCreate
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssysWindowsWin32StorageInstallablefilesystemsFilterDetach
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssysWindowsWin32StorageInstallablefilesystemsFilterFindClose
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssysWindowsWin32StorageInstallablefilesystemsFilterFindFirst
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssysWindowsWin32StorageInstallablefilesystemsFilterFindNext
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssysWindowsWin32StorageInstallablefilesystemsFilterGetDosName
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssysWindowsWin32StorageInstallablefilesystemsFilterGetInformation
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssysWindowsWin32StorageInstallablefilesystemsFilterGetMessage
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceClose
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceCreate
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceFindClose
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceFindFirst
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceFindNext
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceGetInformation
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssysWindowsWin32StorageInstallablefilesystemsFilterLoad
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssysWindowsWin32StorageInstallablefilesystemsFilterReplyMessage
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssysWindowsWin32StorageInstallablefilesystemsFilterSendMessage
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssysWindowsWin32StorageInstallablefilesystemsFilterUnload
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeFindClose
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeFindFirst
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeFindNext
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeInstanceFindClose
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeInstanceFindFirst
import io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems.cinterop.windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeInstanceFindNext
import io.github.kotlinmania.windowssys.windows.win32.system.io.Overlapped
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun filterAttach(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpinstancename: Pcwstr, dwcreatedinstancenamelength: UInt, lpcreatedinstancename: Pwstr): Hresult =
    windowssysWindowsWin32StorageInstallablefilesystemsFilterAttach(lpfiltername.rawAddress.toCPointer<ByteVar>(), lpvolumename.rawAddress.toCPointer<ByteVar>(), lpinstancename.rawAddress.toCPointer<ByteVar>(), dwcreatedinstancenamelength, lpcreatedinstancename.rawAddress.toCPointer<ByteVar>())

public actual fun filterAttachAtAltitude(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpaltitude: Pcwstr, lpinstancename: Pcwstr, dwcreatedinstancenamelength: UInt, lpcreatedinstancename: Pwstr): Hresult =
    windowssysWindowsWin32StorageInstallablefilesystemsFilterAttachAtAltitude(lpfiltername.rawAddress.toCPointer<ByteVar>(), lpvolumename.rawAddress.toCPointer<ByteVar>(), lpaltitude.rawAddress.toCPointer<ByteVar>(), lpinstancename.rawAddress.toCPointer<ByteVar>(), dwcreatedinstancenamelength, lpcreatedinstancename.rawAddress.toCPointer<ByteVar>())

public actual fun filterClose(hfilter: Hfilter): Hresult =
    windowssysWindowsWin32StorageInstallablefilesystemsFilterClose(hfilter)

public actual fun filterConnectCommunicationPort(lpportname: Pcwstr, dwoptions: UInt, lpcontext: ConstPtr<CVoid>, wsizeofcontext: UShort, lpsecurityattributes: ConstPtr<SecurityAttributes>, hport: MutPtr<Handle>): Hresult =
    windowssysWindowsWin32StorageInstallablefilesystemsFilterConnectCommunicationPort(lpportname.rawAddress.toCPointer<ByteVar>(), dwoptions, lpcontext.rawAddress.toCPointer<ByteVar>(), wsizeofcontext, lpsecurityattributes.rawAddress.toCPointer<ByteVar>(), hport.rawAddress.toCPointer<ByteVar>())

public actual fun filterCreate(lpfiltername: Pcwstr, hfilter: MutPtr<Hfilter>): Hresult =
    windowssysWindowsWin32StorageInstallablefilesystemsFilterCreate(lpfiltername.rawAddress.toCPointer<ByteVar>(), hfilter.rawAddress.toCPointer<ByteVar>())

public actual fun filterDetach(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpinstancename: Pcwstr): Hresult =
    windowssysWindowsWin32StorageInstallablefilesystemsFilterDetach(lpfiltername.rawAddress.toCPointer<ByteVar>(), lpvolumename.rawAddress.toCPointer<ByteVar>(), lpinstancename.rawAddress.toCPointer<ByteVar>())

public actual fun filterFindClose(hfilterfind: Handle): Hresult =
    windowssysWindowsWin32StorageInstallablefilesystemsFilterFindClose(hfilterfind.rawAddress.toCPointer<ByteVar>())

public actual fun filterFindFirst(dwinformationclass: FilterInformationClass, lpbuffer: MutPtr<CVoid>, dwbuffersize: UInt, lpbytesreturned: MutPtr<UInt>, lpfilterfind: MutPtr<Handle>): Hresult =
    windowssysWindowsWin32StorageInstallablefilesystemsFilterFindFirst(dwinformationclass, lpbuffer.rawAddress.toCPointer<ByteVar>(), dwbuffersize, lpbytesreturned.rawAddress.toCPointer<ByteVar>(), lpfilterfind.rawAddress.toCPointer<ByteVar>())

public actual fun filterFindNext(hfilterfind: Handle, dwinformationclass: FilterInformationClass, lpbuffer: MutPtr<CVoid>, dwbuffersize: UInt, lpbytesreturned: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32StorageInstallablefilesystemsFilterFindNext(hfilterfind.rawAddress.toCPointer<ByteVar>(), dwinformationclass, lpbuffer.rawAddress.toCPointer<ByteVar>(), dwbuffersize, lpbytesreturned.rawAddress.toCPointer<ByteVar>())

public actual fun filterGetDosName(lpvolumename: Pcwstr, lpdosname: Pwstr, dwdosnamebuffersize: UInt): Hresult =
    windowssysWindowsWin32StorageInstallablefilesystemsFilterGetDosName(lpvolumename.rawAddress.toCPointer<ByteVar>(), lpdosname.rawAddress.toCPointer<ByteVar>(), dwdosnamebuffersize)

public actual fun filterGetInformation(hfilter: Hfilter, dwinformationclass: FilterInformationClass, lpbuffer: MutPtr<CVoid>, dwbuffersize: UInt, lpbytesreturned: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32StorageInstallablefilesystemsFilterGetInformation(hfilter, dwinformationclass, lpbuffer.rawAddress.toCPointer<ByteVar>(), dwbuffersize, lpbytesreturned.rawAddress.toCPointer<ByteVar>())

public actual fun filterGetMessage(hport: Handle, lpmessagebuffer: MutPtr<FilterMessageHeader>, dwmessagebuffersize: UInt, lpoverlapped: MutPtr<Overlapped>): Hresult =
    windowssysWindowsWin32StorageInstallablefilesystemsFilterGetMessage(hport.rawAddress.toCPointer<ByteVar>(), lpmessagebuffer.rawAddress.toCPointer<ByteVar>(), dwmessagebuffersize, lpoverlapped.rawAddress.toCPointer<ByteVar>())

public actual fun filterInstanceClose(hinstance: HfilterInstance): Hresult =
    windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceClose(hinstance)

public actual fun filterInstanceCreate(lpfiltername: Pcwstr, lpvolumename: Pcwstr, lpinstancename: Pcwstr, hinstance: MutPtr<HfilterInstance>): Hresult =
    windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceCreate(lpfiltername.rawAddress.toCPointer<ByteVar>(), lpvolumename.rawAddress.toCPointer<ByteVar>(), lpinstancename.rawAddress.toCPointer<ByteVar>(), hinstance.rawAddress.toCPointer<ByteVar>())

public actual fun filterInstanceFindClose(hfilterinstancefind: Handle): Hresult =
    windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceFindClose(hfilterinstancefind.rawAddress.toCPointer<ByteVar>())

public actual fun filterInstanceFindFirst(lpfiltername: Pcwstr, dwinformationclass: InstanceInformationClass, lpbuffer: MutPtr<CVoid>, dwbuffersize: UInt, lpbytesreturned: MutPtr<UInt>, lpfilterinstancefind: MutPtr<Handle>): Hresult =
    windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceFindFirst(lpfiltername.rawAddress.toCPointer<ByteVar>(), dwinformationclass, lpbuffer.rawAddress.toCPointer<ByteVar>(), dwbuffersize, lpbytesreturned.rawAddress.toCPointer<ByteVar>(), lpfilterinstancefind.rawAddress.toCPointer<ByteVar>())

public actual fun filterInstanceFindNext(hfilterinstancefind: Handle, dwinformationclass: InstanceInformationClass, lpbuffer: MutPtr<CVoid>, dwbuffersize: UInt, lpbytesreturned: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceFindNext(hfilterinstancefind.rawAddress.toCPointer<ByteVar>(), dwinformationclass, lpbuffer.rawAddress.toCPointer<ByteVar>(), dwbuffersize, lpbytesreturned.rawAddress.toCPointer<ByteVar>())

public actual fun filterInstanceGetInformation(hinstance: HfilterInstance, dwinformationclass: InstanceInformationClass, lpbuffer: MutPtr<CVoid>, dwbuffersize: UInt, lpbytesreturned: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32StorageInstallablefilesystemsFilterInstanceGetInformation(hinstance, dwinformationclass, lpbuffer.rawAddress.toCPointer<ByteVar>(), dwbuffersize, lpbytesreturned.rawAddress.toCPointer<ByteVar>())

public actual fun filterLoad(lpfiltername: Pcwstr): Hresult =
    windowssysWindowsWin32StorageInstallablefilesystemsFilterLoad(lpfiltername.rawAddress.toCPointer<ByteVar>())

public actual fun filterReplyMessage(hport: Handle, lpreplybuffer: ConstPtr<FilterReplyHeader>, dwreplybuffersize: UInt): Hresult =
    windowssysWindowsWin32StorageInstallablefilesystemsFilterReplyMessage(hport.rawAddress.toCPointer<ByteVar>(), lpreplybuffer.rawAddress.toCPointer<ByteVar>(), dwreplybuffersize)

public actual fun filterSendMessage(hport: Handle, lpinbuffer: ConstPtr<CVoid>, dwinbuffersize: UInt, lpoutbuffer: MutPtr<CVoid>, dwoutbuffersize: UInt, lpbytesreturned: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32StorageInstallablefilesystemsFilterSendMessage(hport.rawAddress.toCPointer<ByteVar>(), lpinbuffer.rawAddress.toCPointer<ByteVar>(), dwinbuffersize, lpoutbuffer.rawAddress.toCPointer<ByteVar>(), dwoutbuffersize, lpbytesreturned.rawAddress.toCPointer<ByteVar>())

public actual fun filterUnload(lpfiltername: Pcwstr): Hresult =
    windowssysWindowsWin32StorageInstallablefilesystemsFilterUnload(lpfiltername.rawAddress.toCPointer<ByteVar>())

public actual fun filterVolumeFindClose(hvolumefind: Handle): Hresult =
    windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeFindClose(hvolumefind.rawAddress.toCPointer<ByteVar>())

public actual fun filterVolumeFindFirst(dwinformationclass: FilterVolumeInformationClass, lpbuffer: MutPtr<CVoid>, dwbuffersize: UInt, lpbytesreturned: MutPtr<UInt>, lpvolumefind: MutPtr<Handle>): Hresult =
    windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeFindFirst(dwinformationclass, lpbuffer.rawAddress.toCPointer<ByteVar>(), dwbuffersize, lpbytesreturned.rawAddress.toCPointer<ByteVar>(), lpvolumefind.rawAddress.toCPointer<ByteVar>())

public actual fun filterVolumeFindNext(hvolumefind: Handle, dwinformationclass: FilterVolumeInformationClass, lpbuffer: MutPtr<CVoid>, dwbuffersize: UInt, lpbytesreturned: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeFindNext(hvolumefind.rawAddress.toCPointer<ByteVar>(), dwinformationclass, lpbuffer.rawAddress.toCPointer<ByteVar>(), dwbuffersize, lpbytesreturned.rawAddress.toCPointer<ByteVar>())

public actual fun filterVolumeInstanceFindClose(hvolumeinstancefind: Handle): Hresult =
    windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeInstanceFindClose(hvolumeinstancefind.rawAddress.toCPointer<ByteVar>())

public actual fun filterVolumeInstanceFindFirst(lpvolumename: Pcwstr, dwinformationclass: InstanceInformationClass, lpbuffer: MutPtr<CVoid>, dwbuffersize: UInt, lpbytesreturned: MutPtr<UInt>, lpvolumeinstancefind: MutPtr<Handle>): Hresult =
    windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeInstanceFindFirst(lpvolumename.rawAddress.toCPointer<ByteVar>(), dwinformationclass, lpbuffer.rawAddress.toCPointer<ByteVar>(), dwbuffersize, lpbytesreturned.rawAddress.toCPointer<ByteVar>(), lpvolumeinstancefind.rawAddress.toCPointer<ByteVar>())

public actual fun filterVolumeInstanceFindNext(hvolumeinstancefind: Handle, dwinformationclass: InstanceInformationClass, lpbuffer: MutPtr<CVoid>, dwbuffersize: UInt, lpbytesreturned: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32StorageInstallablefilesystemsFilterVolumeInstanceFindNext(hvolumeinstancefind.rawAddress.toCPointer<ByteVar>(), dwinformationclass, lpbuffer.rawAddress.toCPointer<ByteVar>(), dwbuffersize, lpbytesreturned.rawAddress.toCPointer<ByteVar>())
