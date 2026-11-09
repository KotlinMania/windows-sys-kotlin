@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.installablefilesystems

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private val _windowsWin32StorageInstallablefilesystemsNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun FilterAttach(lpfiltername: PCWSTR, lpvolumename: PCWSTR, lpinstancename: PCWSTR, dwcreatedinstancenamelength: UInt, lpcreatedinstancename: PWSTR): HRESULT =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_FilterAttach(lpfiltername.toString(), lpvolumename.toString(), lpinstancename.toString(), dwcreatedinstancenamelength.toInt(), lpcreatedinstancename.toString()) as Int) else 0

public actual fun FilterAttachAtAltitude(lpfiltername: PCWSTR, lpvolumename: PCWSTR, lpaltitude: PCWSTR, lpinstancename: PCWSTR, dwcreatedinstancenamelength: UInt, lpcreatedinstancename: PWSTR): HRESULT =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_FilterAttachAtAltitude(lpfiltername.toString(), lpvolumename.toString(), lpaltitude.toString(), lpinstancename.toString(), dwcreatedinstancenamelength.toInt(), lpcreatedinstancename.toString()) as Int) else 0

public actual fun FilterClose(hfilter: HFILTER): HRESULT =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_FilterClose(hfilter.toString()) as Int) else 0

public actual fun FilterConnectCommunicationPort(lpportname: PCWSTR, dwoptions: UInt, lpcontext: Long, wsizeofcontext: UShort, lpsecurityattributes: Long, hport: Long): HRESULT =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_FilterConnectCommunicationPort(lpportname.toString(), dwoptions.toInt(), lpcontext.toString(), wsizeofcontext.toInt(), lpsecurityattributes.toString(), hport.toString()) as Int) else 0

public actual fun FilterCreate(lpfiltername: PCWSTR, hfilter: Long): HRESULT =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_FilterCreate(lpfiltername.toString(), hfilter.toString()) as Int) else 0

public actual fun FilterDetach(lpfiltername: PCWSTR, lpvolumename: PCWSTR, lpinstancename: PCWSTR): HRESULT =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_FilterDetach(lpfiltername.toString(), lpvolumename.toString(), lpinstancename.toString()) as Int) else 0

public actual fun FilterFindClose(hfilterfind: HANDLE): HRESULT =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_FilterFindClose(hfilterfind.toString()) as Int) else 0

public actual fun FilterFindFirst(dwinformationclass: FILTER_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long, lpfilterfind: Long): HRESULT =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_FilterFindFirst(dwinformationclass, lpbuffer.toString(), dwbuffersize.toInt(), lpbytesreturned.toString(), lpfilterfind.toString()) as Int) else 0

public actual fun FilterFindNext(hfilterfind: HANDLE, dwinformationclass: FILTER_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long): HRESULT =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_FilterFindNext(hfilterfind.toString(), dwinformationclass, lpbuffer.toString(), dwbuffersize.toInt(), lpbytesreturned.toString()) as Int) else 0

public actual fun FilterGetDosName(lpvolumename: PCWSTR, lpdosname: PWSTR, dwdosnamebuffersize: UInt): HRESULT =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_FilterGetDosName(lpvolumename.toString(), lpdosname.toString(), dwdosnamebuffersize.toInt()) as Int) else 0

public actual fun FilterGetInformation(hfilter: HFILTER, dwinformationclass: FILTER_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long): HRESULT =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_FilterGetInformation(hfilter.toString(), dwinformationclass, lpbuffer.toString(), dwbuffersize.toInt(), lpbytesreturned.toString()) as Int) else 0

public actual fun FilterGetMessage(hport: HANDLE, lpmessagebuffer: Long, dwmessagebuffersize: UInt, lpoverlapped: Long): HRESULT =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_FilterGetMessage(hport.toString(), lpmessagebuffer.toString(), dwmessagebuffersize.toInt(), lpoverlapped.toString()) as Int) else 0

public actual fun FilterInstanceClose(hinstance: HFILTER_INSTANCE): HRESULT =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_FilterInstanceClose(hinstance.toString()) as Int) else 0

public actual fun FilterInstanceCreate(lpfiltername: PCWSTR, lpvolumename: PCWSTR, lpinstancename: PCWSTR, hinstance: Long): HRESULT =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_FilterInstanceCreate(lpfiltername.toString(), lpvolumename.toString(), lpinstancename.toString(), hinstance.toString()) as Int) else 0

public actual fun FilterInstanceFindClose(hfilterinstancefind: HANDLE): HRESULT =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_FilterInstanceFindClose(hfilterinstancefind.toString()) as Int) else 0

public actual fun FilterInstanceFindFirst(lpfiltername: PCWSTR, dwinformationclass: INSTANCE_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long, lpfilterinstancefind: Long): HRESULT =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_FilterInstanceFindFirst(lpfiltername.toString(), dwinformationclass, lpbuffer.toString(), dwbuffersize.toInt(), lpbytesreturned.toString(), lpfilterinstancefind.toString()) as Int) else 0

public actual fun FilterInstanceFindNext(hfilterinstancefind: HANDLE, dwinformationclass: INSTANCE_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long): HRESULT =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_FilterInstanceFindNext(hfilterinstancefind.toString(), dwinformationclass, lpbuffer.toString(), dwbuffersize.toInt(), lpbytesreturned.toString()) as Int) else 0

public actual fun FilterInstanceGetInformation(hinstance: HFILTER_INSTANCE, dwinformationclass: INSTANCE_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long): HRESULT =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_FilterInstanceGetInformation(hinstance.toString(), dwinformationclass, lpbuffer.toString(), dwbuffersize.toInt(), lpbytesreturned.toString()) as Int) else 0

public actual fun FilterLoad(lpfiltername: PCWSTR): HRESULT =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_FilterLoad(lpfiltername.toString()) as Int) else 0

public actual fun FilterReplyMessage(hport: HANDLE, lpreplybuffer: Long, dwreplybuffersize: UInt): HRESULT =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_FilterReplyMessage(hport.toString(), lpreplybuffer.toString(), dwreplybuffersize.toInt()) as Int) else 0

public actual fun FilterSendMessage(hport: HANDLE, lpinbuffer: Long, dwinbuffersize: UInt, lpoutbuffer: Long, dwoutbuffersize: UInt, lpbytesreturned: Long): HRESULT =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_FilterSendMessage(hport.toString(), lpinbuffer.toString(), dwinbuffersize.toInt(), lpoutbuffer.toString(), dwoutbuffersize.toInt(), lpbytesreturned.toString()) as Int) else 0

public actual fun FilterUnload(lpfiltername: PCWSTR): HRESULT =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_FilterUnload(lpfiltername.toString()) as Int) else 0

public actual fun FilterVolumeFindClose(hvolumefind: HANDLE): HRESULT =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_FilterVolumeFindClose(hvolumefind.toString()) as Int) else 0

public actual fun FilterVolumeFindFirst(dwinformationclass: FILTER_VOLUME_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long, lpvolumefind: Long): HRESULT =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_FilterVolumeFindFirst(dwinformationclass, lpbuffer.toString(), dwbuffersize.toInt(), lpbytesreturned.toString(), lpvolumefind.toString()) as Int) else 0

public actual fun FilterVolumeFindNext(hvolumefind: HANDLE, dwinformationclass: FILTER_VOLUME_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long): HRESULT =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_FilterVolumeFindNext(hvolumefind.toString(), dwinformationclass, lpbuffer.toString(), dwbuffersize.toInt(), lpbytesreturned.toString()) as Int) else 0

public actual fun FilterVolumeInstanceFindClose(hvolumeinstancefind: HANDLE): HRESULT =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_FilterVolumeInstanceFindClose(hvolumeinstancefind.toString()) as Int) else 0

public actual fun FilterVolumeInstanceFindFirst(lpvolumename: PCWSTR, dwinformationclass: INSTANCE_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long, lpvolumeinstancefind: Long): HRESULT =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_FilterVolumeInstanceFindFirst(lpvolumename.toString(), dwinformationclass, lpbuffer.toString(), dwbuffersize.toInt(), lpbytesreturned.toString(), lpvolumeinstancefind.toString()) as Int) else 0

public actual fun FilterVolumeInstanceFindNext(hvolumeinstancefind: HANDLE, dwinformationclass: INSTANCE_INFORMATION_CLASS, lpbuffer: Long, dwbuffersize: UInt, lpbytesreturned: Long): HRESULT =
    if (_windowsWin32StorageInstallablefilesystemsNapiAddon != null) (_windowsWin32StorageInstallablefilesystemsNapiAddon.windowssys_windows_win32_storage_installablefilesystems_FilterVolumeInstanceFindNext(hvolumeinstancefind.toString(), dwinformationclass, lpbuffer.toString(), dwbuffersize.toInt(), lpbytesreturned.toString()) as Int) else 0
